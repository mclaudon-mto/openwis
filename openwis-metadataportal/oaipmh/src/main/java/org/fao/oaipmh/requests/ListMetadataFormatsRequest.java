//=============================================================================
//===	Copyright (C) 2001-2007 Food and Agriculture Organization of the
//===	United Nations (FAO-UN), United Nations World Food Programme (WFP)
//===	and United Nations Environment Programme (UNEP)
//===
//===	This program is free software; you can redistribute it and/or modify
//===	it under the terms of the GNU General Public License as published by
//===	the Free Software Foundation; either version 2 of the License, or (at
//===	your option) any later version.
//===
//===	This program is distributed in the hope that it will be useful, but
//===	WITHOUT ANY WARRANTY; without even the implied warranty of
//===	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
//===	General Public License for more details.
//===
//===	You should have received a copy of the GNU General Public License
//===	along with this program; if not, write to the Free Software
//===	Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301, USA
//===
//===	Contact: Jeroen Ticheler - FAO - Viale delle Terme di Caracalla 2,
//===	Rome - Italy. email: geonetwork@osgeo.org
//==============================================================================

package org.fao.oaipmh.requests;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.fao.oaipmh.exceptions.OaiPmhException;
import org.fao.oaipmh.responses.ListMetadataFormatsResponse;
import org.jdom.JDOMException;
import org.xml.sax.SAXException;

//=============================================================================

public class ListMetadataFormatsRequest extends AbstractRequest
{
	public static final String VERB = "ListMetadataFormats";

	//---------------------------------------------------------------------------
	//---
	//--- API methods
	//---
	//---------------------------------------------------------------------------

	public String getIdentifier() { return identifier; }

	//---------------------------------------------------------------------------

	public void setIdentifier(String identifier)
	{
		this.identifier = identifier;
	}

	//---------------------------------------------------------------------------

	public ListMetadataFormatsResponse execute() throws IOException, OaiPmhException,
																		 JDOMException, SAXException, Exception
	{
		Map<String, String> params = new HashMap<String, String>();

		if (identifier != null)
			params.put("identifier", identifier);

		return new ListMetadataFormatsResponse(sendRequest(params));
	}

	//---------------------------------------------------------------------------

	public String getVerb() { return VERB; }

	//---------------------------------------------------------------------------
	//---
	//--- Variables
	//---
	//---------------------------------------------------------------------------

	private String identifier;
}

//=============================================================================

