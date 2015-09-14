//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.2-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.21 at 10:39:22 AM EDT 
//


package edu.harvard.i2b2.crcxmljaxb.datavo.pdo.query;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for output_option_listType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="output_option_listType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="observation_set" type="{http://www.i2b2.org/xsd/cell/crc/pdo/1.1/}fact_output_optionType" minOccurs="0"/>
 *         &lt;element name="patient_set" type="{http://www.i2b2.org/xsd/cell/crc/pdo/1.1/}output_optionType" minOccurs="0"/>
 *         &lt;element name="event_set" type="{http://www.i2b2.org/xsd/cell/crc/pdo/1.1/}output_optionType" minOccurs="0"/>
 *         &lt;element name="observer_set_using_filter_list" type="{http://www.i2b2.org/xsd/cell/crc/pdo/1.1/}output_optionType" minOccurs="0"/>
 *         &lt;element name="concept_set_using_filter_list" type="{http://www.i2b2.org/xsd/cell/crc/pdo/1.1/}output_optionType" minOccurs="0"/>
 *         &lt;element name="modifier_set_using_filter_list" type="{http://www.i2b2.org/xsd/cell/crc/pdo/1.1/}output_optionType" minOccurs="0"/>
 *         &lt;element name="pid_set" type="{http://www.i2b2.org/xsd/cell/crc/pdo/1.1/}output_optionType" minOccurs="0"/>
 *         &lt;element name="eid_set" type="{http://www.i2b2.org/xsd/cell/crc/pdo/1.1/}output_optionType" minOccurs="0"/>
 *         &lt;element name="dimension_set" type="{http://www.i2b2.org/xsd/cell/crc/pdo/1.1/}dimension_output_optionType" minOccurs="0"/>
 *       &lt;/all>
 *       &lt;attribute name="phi" type="{http://www.i2b2.org/xsd/cell/crc/pdo/1.1/}outputOptionPhiType" />
 *       &lt;attribute name="names" type="{http://www.i2b2.org/xsd/cell/crc/pdo/1.1/}outputOptionNameType" />
 *       &lt;attribute name="time" type="{http://www.i2b2.org/xsd/cell/crc/pdo/1.1/}outputOptionTimeType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "output_option_listType", propOrder = {

})
public class OutputOptionListType {

    @XmlElement(name = "observation_set")
    protected FactOutputOptionType observationSet;
    @XmlElement(name = "patient_set")
    protected OutputOptionType patientSet;
    @XmlElement(name = "event_set")
    protected OutputOptionType eventSet;
    @XmlElement(name = "observer_set_using_filter_list")
    protected OutputOptionType observerSetUsingFilterList;
    @XmlElement(name = "concept_set_using_filter_list")
    protected OutputOptionType conceptSetUsingFilterList;
    @XmlElement(name = "modifier_set_using_filter_list")
    protected OutputOptionType modifierSetUsingFilterList;
    @XmlElement(name = "pid_set")
    protected OutputOptionType pidSet;
    @XmlElement(name = "eid_set")
    protected OutputOptionType eidSet;
    @XmlElement(name = "dimension_set")
    protected DimensionOutputOptionType dimensionSet;
    @XmlAttribute
    protected OutputOptionPhiType phi;
    @XmlAttribute
    protected OutputOptionNameType names;
    @XmlAttribute
    protected OutputOptionTimeType time;

    /**
     * Gets the value of the observationSet property.
     * 
     * @return
     *     possible object is
     *     {@link FactOutputOptionType }
     *     
     */
    public FactOutputOptionType getObservationSet() {
        return observationSet;
    }

    /**
     * Sets the value of the observationSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link FactOutputOptionType }
     *     
     */
    public void setObservationSet(FactOutputOptionType value) {
        this.observationSet = value;
    }

    /**
     * Gets the value of the patientSet property.
     * 
     * @return
     *     possible object is
     *     {@link OutputOptionType }
     *     
     */
    public OutputOptionType getPatientSet() {
        return patientSet;
    }

    /**
     * Sets the value of the patientSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputOptionType }
     *     
     */
    public void setPatientSet(OutputOptionType value) {
        this.patientSet = value;
    }

    /**
     * Gets the value of the eventSet property.
     * 
     * @return
     *     possible object is
     *     {@link OutputOptionType }
     *     
     */
    public OutputOptionType getEventSet() {
        return eventSet;
    }

    /**
     * Sets the value of the eventSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputOptionType }
     *     
     */
    public void setEventSet(OutputOptionType value) {
        this.eventSet = value;
    }

    /**
     * Gets the value of the observerSetUsingFilterList property.
     * 
     * @return
     *     possible object is
     *     {@link OutputOptionType }
     *     
     */
    public OutputOptionType getObserverSetUsingFilterList() {
        return observerSetUsingFilterList;
    }

    /**
     * Sets the value of the observerSetUsingFilterList property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputOptionType }
     *     
     */
    public void setObserverSetUsingFilterList(OutputOptionType value) {
        this.observerSetUsingFilterList = value;
    }

    /**
     * Gets the value of the conceptSetUsingFilterList property.
     * 
     * @return
     *     possible object is
     *     {@link OutputOptionType }
     *     
     */
    public OutputOptionType getConceptSetUsingFilterList() {
        return conceptSetUsingFilterList;
    }

    /**
     * Sets the value of the conceptSetUsingFilterList property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputOptionType }
     *     
     */
    public void setConceptSetUsingFilterList(OutputOptionType value) {
        this.conceptSetUsingFilterList = value;
    }

    /**
     * Gets the value of the modifierSetUsingFilterList property.
     * 
     * @return
     *     possible object is
     *     {@link OutputOptionType }
     *     
     */
    public OutputOptionType getModifierSetUsingFilterList() {
        return modifierSetUsingFilterList;
    }

    /**
     * Sets the value of the modifierSetUsingFilterList property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputOptionType }
     *     
     */
    public void setModifierSetUsingFilterList(OutputOptionType value) {
        this.modifierSetUsingFilterList = value;
    }

    /**
     * Gets the value of the pidSet property.
     * 
     * @return
     *     possible object is
     *     {@link OutputOptionType }
     *     
     */
    public OutputOptionType getPidSet() {
        return pidSet;
    }

    /**
     * Sets the value of the pidSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputOptionType }
     *     
     */
    public void setPidSet(OutputOptionType value) {
        this.pidSet = value;
    }

    /**
     * Gets the value of the eidSet property.
     * 
     * @return
     *     possible object is
     *     {@link OutputOptionType }
     *     
     */
    public OutputOptionType getEidSet() {
        return eidSet;
    }

    /**
     * Sets the value of the eidSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputOptionType }
     *     
     */
    public void setEidSet(OutputOptionType value) {
        this.eidSet = value;
    }

    /**
     * Gets the value of the dimensionSet property.
     * 
     * @return
     *     possible object is
     *     {@link DimensionOutputOptionType }
     *     
     */
    public DimensionOutputOptionType getDimensionSet() {
        return dimensionSet;
    }

    /**
     * Sets the value of the dimensionSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link DimensionOutputOptionType }
     *     
     */
    public void setDimensionSet(DimensionOutputOptionType value) {
        this.dimensionSet = value;
    }

    /**
     * Gets the value of the phi property.
     * 
     * @return
     *     possible object is
     *     {@link OutputOptionPhiType }
     *     
     */
    public OutputOptionPhiType getPhi() {
        return phi;
    }

    /**
     * Sets the value of the phi property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputOptionPhiType }
     *     
     */
    public void setPhi(OutputOptionPhiType value) {
        this.phi = value;
    }

    /**
     * Gets the value of the names property.
     * 
     * @return
     *     possible object is
     *     {@link OutputOptionNameType }
     *     
     */
    public OutputOptionNameType getNames() {
        return names;
    }

    /**
     * Sets the value of the names property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputOptionNameType }
     *     
     */
    public void setNames(OutputOptionNameType value) {
        this.names = value;
    }

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link OutputOptionTimeType }
     *     
     */
    public OutputOptionTimeType getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputOptionTimeType }
     *     
     */
    public void setTime(OutputOptionTimeType value) {
        this.time = value;
    }

}
