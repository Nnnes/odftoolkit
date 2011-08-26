/************************************************************************
 *
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 * 
 * Copyright 2008 Sun Microsystems, Inc. All rights reserved.
 * 
 * Use is subject to license terms.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy
 * of the License at http://www.apache.org/licenses/LICENSE-2.0. You can also
 * obtain a copy of the License at http://odftoolkit.org/docs/license.txt
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 ************************************************************************/
package org.odftoolkit.odfdom.dom.test;

import org.junit.Assert;
import org.junit.Test;
import org.odftoolkit.odfdom.doc.OdfDocument;
import org.odftoolkit.odfdom.doc.OdfTextDocument;
import org.odftoolkit.odfdom.doc.element.office.OdfStyles;
import org.odftoolkit.odfdom.doc.element.style.OdfStyle;
import org.odftoolkit.odfdom.doc.element.text.OdfListStyle;
import org.odftoolkit.odfdom.dom.element.style.OdfTextPropertiesElement;
import org.odftoolkit.odfdom.dom.style.OdfStyleFamily;

public class ElementTest {

    public ElementTest() {
    }
    
    @Test
    public void testCloneNode() {
        try {
            OdfDocument doc = OdfTextDocument.createTextDocument();
            OdfStyles styles = doc.getOrCreateDocumentStyles();
            
            OdfStyle p1 = styles.createStyle("P1", OdfStyleFamily.Paragraph );
            p1.setProperty( OdfTextPropertiesElement.FontSize, "42pt" );
            
            OdfStyle clone = (OdfStyle) p1.cloneNode(true);
            clone.setName("p1-clone");
            styles.appendChild(clone);
            
            OdfStyle p1clone = styles.getStyle("p1-clone", OdfStyleFamily.Paragraph );
            Assert.assertNotNull(p1clone);
            Assert.assertEquals(p1clone.getProperty(OdfTextPropertiesElement.FontSize), p1.getProperty(OdfTextPropertiesElement.FontSize));            
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("Failed with " + e.getClass().getName() + ": '" + e.getMessage() + "'");
        }
    }
    
    @Test
    public void testEquals() {
        try {
            OdfDocument doc = OdfTextDocument.createTextDocument();
            OdfStyles styles = doc.getOrCreateDocumentStyles();
            
            OdfStyle p1 = styles.createStyle("P1", OdfStyleFamily.Paragraph );
            p1.setProperty( OdfTextPropertiesElement.FontSize, "42pt" );
            OdfStyle p2 = styles.createStyle("P2", OdfStyleFamily.Paragraph );
            p2.setProperty( OdfTextPropertiesElement.FontSize, "42pt" );
            OdfStyle p3 = styles.createStyle("P3", OdfStyleFamily.Paragraph );
            p3.setProperty( OdfTextPropertiesElement.FontSize, "13pt" );

            OdfListStyle l1 = styles.createListStyle("L1" );
            Assert.assertTrue( p1.equals(p1) );
            Assert.assertTrue( p1.equals(p2) );
            Assert.assertTrue( p2.equals(p1) );
            Assert.assertFalse( p1.equals(p3) );
            Assert.assertFalse( p3.equals(p1) );
            Assert.assertFalse( p3.equals(p1) );
            Assert.assertFalse( p1.equals(l1) );
            Assert.assertFalse( p1.equals(null) );
            
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("Failed with " + e.getClass().getName() + ": '" + e.getMessage() + "'");
        }
    }
}