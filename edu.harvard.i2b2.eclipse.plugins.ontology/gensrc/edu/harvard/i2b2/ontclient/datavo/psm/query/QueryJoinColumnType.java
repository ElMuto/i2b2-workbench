//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.2-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.21 at 10:38:57 AM EDT 
//


package edu.harvard.i2b2.ontclient.datavo.psm.query;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for queryJoinColumnType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="queryJoinColumnType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PATIENT"/>
 *     &lt;enumeration value="ENCOUNTER"/>
 *     &lt;enumeration value="INSTANCE"/>
 *     &lt;enumeration value="STARTDATE"/>
 *     &lt;enumeration value="ENDDATE"/>
 *     &lt;enumeration value="ENCOUNTER_STARTDATE"/>
 *     &lt;enumeration value="ENCOUNTER_ENDDATE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "queryJoinColumnType", namespace = "http://www.i2b2.org/xsd/cell/crc/psm/querydefinition/1.1/")
@XmlEnum
public enum QueryJoinColumnType {

    PATIENT,
    ENCOUNTER,
    INSTANCE,
    STARTDATE,
    ENDDATE,
    ENCOUNTER_STARTDATE,
    ENCOUNTER_ENDDATE;

    public String value() {
        return name();
    }

    public static QueryJoinColumnType fromValue(String v) {
        return valueOf(v);
    }

}
