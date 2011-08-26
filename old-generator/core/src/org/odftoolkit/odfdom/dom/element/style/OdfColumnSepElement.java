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
import org.odftoolkit.odfdom.dom.element.OdfElement;
import org.odftoolkit.odfdom.dom.type.OdfPercent;
import org.odftoolkit.odfdom.dom.type.style.OdfStyleType;
import org.odftoolkit.odfdom.dom.type.style.OdfVerticalAlignType;


/**
 * ODF DOM Element implementation for element "<style:column-sep>".
 */
public abstract class OdfColumnSepElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.STYLE, "column-sep" );

    public OdfColumnSepElement( OdfFileDom _aOwnerDoc )
    {
        super( _aOwnerDoc, ELEMENT_NAME );
    }

    public OdfName getOdfName()
    {
        return ELEMENT_NAME;
    }

    /**
     * Initialize mandatory attributes.
     */
    public void init(String _aWidth)
    {
        setWidth( _aWidth );
    }

    /**
     * Get value of attribute "style:style".
     */
    public OdfStyleType getStyle()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.STYLE, "style" ) );
        if( aStringVal.length()==0 )
        {
            aStringVal = "solid";
        }

        return OdfStyleType.enumValueOf( aStringVal);
    }

    /**
     * Set value of attribute "style:style".
     */
    public void setStyle( OdfStyleType _aStyle )
    {                    
        String aStringVal = OdfStyleType.toString( _aStyle );
        setOdfAttribute( OdfName.get( OdfNamespace.STYLE, "style" ), aStringVal );
    }

    /**
     * Get value of attribute "style:width".
     */
    public String getWidth()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.STYLE, "width" ) );
    }

    /**
     * Set value of attribute "style:width".
     */
    public void setWidth( String _aWidth )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.STYLE, "width" ), _aWidth );
    }

    /**
     * Get value of attribute "style:height".
     */
    public Double getHeight()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.STYLE, "height" ) );
        if( aStringVal.length()==0 )
        {
            aStringVal = "100%";
        }

        return OdfPercent.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "style:height".
     */
    public void setHeight( Double _aHeight )
    {                    
        String aStringVal = OdfPercent.toString( _aHeight );
        setOdfAttribute( OdfName.get( OdfNamespace.STYLE, "height" ), aStringVal );
    }

    /**
     * Get value of attribute "style:vertical-align".
     */
    public OdfVerticalAlignType getVerticalAlign()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.STYLE, "vertical-align" ) );
        if( aStringVal.length()==0 )
        {
            aStringVal = "top";
        }

        return OdfVerticalAlignType.enumValueOf( aStringVal);
    }

    /**
     * Set value of attribute "style:vertical-align".
     */
    public void setVerticalAlign( OdfVerticalAlignType _aVerticalAlign )
    {                    
        String aStringVal = OdfVerticalAlignType.toString( _aVerticalAlign );
        setOdfAttribute( OdfName.get( OdfNamespace.STYLE, "vertical-align" ), aStringVal );
    }

    /**
     * Get value of attribute "style:color".
     */
    public String getColor()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.STYLE, "color" ) );
        if( aStringVal.length()==0 )
        {
            aStringVal = "#000000";
        }

        return String.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "style:color".
     */
    public void setColor( String _aColor )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.STYLE, "color" ), _aColor );
    }

}
