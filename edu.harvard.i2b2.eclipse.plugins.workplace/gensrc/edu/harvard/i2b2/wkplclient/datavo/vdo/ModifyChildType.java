//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.2-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.21 at 10:39:00 AM EDT 
//


package edu.harvard.i2b2.wkplclient.datavo.vdo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for modifyChildType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="modifyChildType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="self" type="{http://www.i2b2.org/xsd/cell/ont/1.1/}conceptType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="inclSynonyms" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "modifyChildType", propOrder = {
    "self"
})
public class ModifyChildType {

    @XmlElement(required = true)
    protected ConceptType self;
    @XmlAttribute
    protected Boolean inclSynonyms;

    /**
     * Gets the value of the self property.
     * 
     * @return
     *     possible object is
     *     {@link ConceptType }
     *     
     */
    public ConceptType getSelf() {
        return self;
    }

    /**
     * Sets the value of the self property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConceptType }
     *     
     */
    public void setSelf(ConceptType value) {
        this.self = value;
    }

    /**
     * Gets the value of the inclSynonyms property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isInclSynonyms() {
        if (inclSynonyms == null) {
            return true;
        } else {
            return inclSynonyms;
        }
    }

    /**
     * Sets the value of the inclSynonyms property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInclSynonyms(Boolean value) {
        this.inclSynonyms = value;
    }

}
