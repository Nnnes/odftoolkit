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
 * ODF DOM Element implementation for element "<style:table-properties>".
 */
public abstract class OdfTablePropertiesElement extends OdfStylePropertiesBase
{        
    public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.STYLE, "table-properties" );

    public OdfTablePropertiesElement( OdfFileDom _aOwnerDoc )
    {
        super( _aOwnerDoc, ELEMENT_NAME );
    }

    public OdfName getOdfName()
    {
        return ELEMENT_NAME;
    }

    public final static OdfStyleProperty Width = 
        OdfStyleProperty.get(OdfStylePropertiesSet.TableProperties, OdfName.get(OdfNamespace.STYLE, "width"));
    public final static OdfStyleProperty RelWidth = 
        OdfStyleProperty.get(OdfStylePropertiesSet.TableProperties, OdfName.get(OdfNamespace.STYLE, "rel-width"));
    public final static OdfStyleProperty Align = 
        OdfStyleProperty.get(OdfStylePropertiesSet.TableProperties, OdfName.get(OdfNamespace.TABLE, "align"));
    public final static OdfStyleProperty MarginLeft = 
        OdfStyleProperty.get(OdfStylePropertiesSet.TableProperties, OdfName.get(OdfNamespace.FO, "margin-left"));
    public final static OdfStyleProperty MarginRight = 
        OdfStyleProperty.get(OdfStylePropertiesSet.TableProperties, OdfName.get(OdfNamespace.FO, "margin-right"));
    public final static OdfStyleProperty MarginTop = 
        OdfStyleProperty.get(OdfStylePropertiesSet.TableProperties, OdfName.get(OdfNamespace.FO, "margin-top"));
    public final static OdfStyleProperty MarginBottom = 
        OdfStyleProperty.get(OdfStylePropertiesSet.TableProperties, OdfName.get(OdfNamespace.FO, "margin-bottom"));
    public final static OdfStyleProperty Margin = 
        OdfStyleProperty.get(OdfStylePropertiesSet.TableProperties, OdfName.get(OdfNamespace.FO, "margin"));
    public final static OdfStyleProperty PageNumber = 
        OdfStyleProperty.get(OdfStylePropertiesSet.TableProperties, OdfName.get(OdfNamespace.STYLE, "page-number"));
    public final static OdfStyleProperty BreakBefore = 
        OdfStyleProperty.get(OdfStylePropertiesSet.TableProperties, OdfName.get(OdfNamespace.FO, "break-before"));
    public final static OdfStyleProperty BreakAfter = 
        OdfStyleProperty.get(OdfStylePropertiesSet.TableProperties, OdfName.get(OdfNamespace.FO, "break-after"));
    public final static OdfStyleProperty BackgroundColor = 
        OdfStyleProperty.get(OdfStylePropertiesSet.TableProperties, OdfName.get(OdfNamespace.FO, "background-color"));
    public final static OdfStyleProperty Shadow = 
        OdfStyleProperty.get(OdfStylePropertiesSet.TableProperties, OdfName.get(OdfNamespace.STYLE, "shadow"));
    public final static OdfStyleProperty KeepWithNext = 
        OdfStyleProperty.get(OdfStylePropertiesSet.TableProperties, OdfName.get(OdfNamespace.FO, "keep-with-next"));
    public final static OdfStyleProperty MayBreakBetweenRows = 
        OdfStyleProperty.get(OdfStylePropertiesSet.TableProperties, OdfName.get(OdfNamespace.STYLE, "may-break-between-rows"));
    public final static OdfStyleProperty BorderModel = 
        OdfStyleProperty.get(OdfStylePropertiesSet.TableProperties, OdfName.get(OdfNamespace.TABLE, "border-model"));
    public final static OdfStyleProperty WritingMode = 
        OdfStyleProperty.get(OdfStylePropertiesSet.TableProperties, OdfName.get(OdfNamespace.STYLE, "writing-mode"));
    public final static OdfStyleProperty Display = 
        OdfStyleProperty.get(OdfStylePropertiesSet.TableProperties, OdfName.get(OdfNamespace.TABLE, "display"));

}
