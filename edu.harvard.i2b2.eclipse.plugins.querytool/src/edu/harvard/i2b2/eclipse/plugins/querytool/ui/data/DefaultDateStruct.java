/*
 * Copyright (c) 2006-2015 Partners Healthcare 
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the i2b2 Software License v2.1 
 * which accompanies this distribution. 
 * 
 * This source code was developed as part of i2b2 for the 
 * Medical Imaging Informatics Bench to Beside project (mi2b2).
 * 
 * Contributors: Taowei David Wang 
 */

package edu.harvard.i2b2.eclipse.plugins.querytool.ui.data;

import java.util.GregorianCalendar;

public class DefaultDateStruct implements IDateStruct
{
	
	private GregorianCalendar 	myStartDate	= null;
	private GregorianCalendar 	myEndDate	= null;

	public DefaultDateStruct() 
	{}
	
	/* Date Restrictions, IDateStuct methods */
	public GregorianCalendar getStartDate()			{ return this.myStartDate; }
	public void setStartDate(GregorianCalendar c)	{ this.myStartDate = c; }	
	public GregorianCalendar getEndDate()			{ return this.myEndDate; }
	public void setEndDate(GregorianCalendar c)		{ this.myEndDate = c; }

}
