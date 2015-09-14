/*
 * Copyright (c) 2006-2012 Massachusetts General Hospital 
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the i2b2 Software License v2.1 
 * which accompanies this distribution. 
 * 
 * Contributors:
 * 	    Raj Kuttan
 * 		Lori Phillips
 */

package edu.harvard.i2b2.eclipse.plugins.query.workplaceMessaging;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import edu.harvard.i2b2.common.util.jaxb.JAXBUtilException;
import edu.harvard.i2b2.crcxmljaxb.datavo.i2b2message.BodyType;
import edu.harvard.i2b2.crcxmljaxb.datavo.i2b2message.MessageHeaderType;
import edu.harvard.i2b2.crcxmljaxb.datavo.i2b2message.RequestHeaderType;
import edu.harvard.i2b2.crcxmljaxb.datavo.i2b2message.RequestMessageType;
import edu.harvard.i2b2.crcxmljaxb.datavo.wdo.FolderType;


/**
 * @author Lori Phillips
 *
 */
public class AddChildRequestMessage extends WorkplaceRequestData {
	
	public static final String THIS_CLASS_NAME = AddChildRequestMessage.class.getName();
    private Log log = LogFactory.getLog(THIS_CLASS_NAME);	

    private FolderType childType;

	public AddChildRequestMessage() {}
	
	/**
	 * Function to build addChild type for a given request
	 * 
	 * @return FolderType object
	 */
	public FolderType getChildType() { 
		FolderType childType = new FolderType();		
		return childType;
	}
	
	
	/**
	 * Function to build workData body type
	 * 
	 * @param 
	 * @return BodyType object
	 */
	
	public BodyType getBodyType() {
		FolderType childType = getChildType();
		edu.harvard.i2b2.crcxmljaxb.datavo.wdo.ObjectFactory of = new edu.harvard.i2b2.crcxmljaxb.datavo.wdo.ObjectFactory();
		
		BodyType bodyType = new BodyType();
		bodyType.getAny().add(of.createAddChild(childType));
		return bodyType;
	}
	
	/**
	 * Function to build workData body type
	 * 
	 * @param 
	 * @return BodyType object
	 */
	
	public BodyType getBodyType(FolderType childType) {
		edu.harvard.i2b2.crcxmljaxb.datavo.wdo.ObjectFactory of = new edu.harvard.i2b2.crcxmljaxb.datavo.wdo.ObjectFactory();
		
		BodyType bodyType = new BodyType();
		bodyType.getAny().add(of.createAddChild(childType));
		return bodyType;
	}

	/**
	 * Function to build Work Request message type and return it as an XML string
	 * 
	 * @param FolderType childData (add this child node)
	 * @return A String data type containing the Work RequestMessage in XML format
	 */
	public String doBuildXML(FolderType childData){ 
		String requestString = null;
			try {
				MessageHeaderType messageHeader = getMessageHeader(); 
				RequestHeaderType reqHeader  = getRequestHeader();
				BodyType bodyType = getBodyType(childData) ;
				RequestMessageType reqMessageType = getRequestMessageType(messageHeader,
						reqHeader, bodyType);
				requestString = getXMLString(reqMessageType);
			} catch (JAXBUtilException e) {
				log.error(e.getMessage());
			} 
		return requestString;
	}
}


	
	