//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.2-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.21 at 10:39:22 AM EDT 
//


package edu.harvard.i2b2.crcxmljaxb.datavo.psm.query;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for patient_set_responseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="patient_set_responseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.i2b2.org/xsd/cell/crc/psm/1.1/}responseType">
 *       &lt;sequence>
 *         &lt;element name="patient_set" type="{http://www.i2b2.org/xsd/cell/crc/psm/1.1/}patient_setType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "patient_set_responseType", propOrder = {
    "patientSet"
})
public class PatientSetResponseType
    extends ResponseType
{

    @XmlElement(name = "patient_set", required = true)
    protected PatientSetType patientSet;

    /**
     * Gets the value of the patientSet property.
     * 
     * @return
     *     possible object is
     *     {@link PatientSetType }
     *     
     */
    public PatientSetType getPatientSet() {
        return patientSet;
    }

    /**
     * Sets the value of the patientSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link PatientSetType }
     *     
     */
    public void setPatientSet(PatientSetType value) {
        this.patientSet = value;
    }

}
