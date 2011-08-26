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

/*
 * This file is automatically generated.
 * Don't edit manually.
 */    

package org.odftoolkit.odfdom.dom.element.style;

import org.odftoolkit.odfdom.doc.OdfFileDom;
import org.odftoolkit.odfdom.dom.OdfName;
import org.odftoolkit.odfdom.dom.OdfNamespace;
import org.odftoolkit.odfdom.dom.element.OdfStylePropertiesBase;
import org.odftoolkit.odfdom.dom.style.props.OdfStylePropertiesSet;
import org.odftoolkit.odfdom.dom.style.props.OdfStyleProperty;


/**
 * ODF DOM Element implementation for element "<style:ruby-properties>".
 */
public abstract class OdfRubyPropertiesElement extends OdfStylePropertiesBase
{        
    public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.STYLE, "ruby-properties" );

    public OdfRubyPropertiesElement( OdfFileDom _aOwnerDoc )
    {
        super( _aOwnerDoc, ELEMENT_NAME );
    }

    public OdfName getOdfName()
    {
        return ELEMENT_NAME;
    }

    public final static OdfStyleProperty RubyPosition = 
        OdfStyleProperty.get(OdfStylePropertiesSet.RubyProperties, OdfName.get(OdfNamespace.STYLE, "ruby-position"));
    public final static OdfStyleProperty RubyAlign = 
        OdfStyleProperty.get(OdfStylePropertiesSet.RubyProperties, OdfName.get(OdfNamespace.STYLE, "ruby-align"));

}
