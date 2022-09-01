/************************************************************************
 *
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 * 
 * Use is subject to license terms.
 * 
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 ************************************************************************/

/*
 * This file is automatically generated.
 * Don't edit manually.
 */
package org.odftoolkit.odfdom.pkg.manifest;

import org.odftoolkit.odfdom.pkg.OdfPackageNamespace;
import org.odftoolkit.odfdom.pkg.OdfElement;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;
/**
 * Manifest implementation of OpenDocument element  {@odf.element manifest:manifest}.
 *
 */
public class ManifestElement extends OdfElement {

	public static final OdfName ELEMENT_NAME = OdfName.newName(OdfPackageNamespace.MANIFEST, "manifest");

	/**
	 * Create the instance of <code>ManifestElement</code>
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public ManifestElement(OdfFileDom ownerDoc) {
		super(ownerDoc, ELEMENT_NAME);
	}

	/**
	 * Get the element name
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element manifest:manifest}.
	 */
	public OdfName getOdfName() {
		return ELEMENT_NAME;
	}

	/**
	 * Create child element {@odf.element manifest:file-entry}.
	 *
	 * @param fullPathValue  the <code>String</code> value of <code>FullPathAttribute</code>, see {@odf.attribute  manifest:full-path} at specification
	 * @param mediaTypeValue  the <code>String</code> value of <code>MediaTypeAttribute</code>, see {@odf.attribute  manifest:media-type} at specification
	 * Child element is mandatory.
	 *
	 * @return the element {@odf.element manifest:file-entry}
	 */
	 public FileEntryElement newFileEntryElement(String fullPathValue, String mediaTypeValue) {
		FileEntryElement fileEntry = ((OdfFileDom) this.ownerDocument).newOdfElement(FileEntryElement.class);
		fileEntry.setFullPathAttribute(fullPathValue);
		fileEntry.setMediaTypeAttribute(mediaTypeValue);
		this.appendChild(fileEntry);
		return fileEntry;
	}

}
