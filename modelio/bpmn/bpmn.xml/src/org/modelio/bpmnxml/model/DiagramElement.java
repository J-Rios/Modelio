/* 
 * Copyright 2013-2018 Modeliosoft
 * 
 * This file is part of Modelio.
 * 
 * Modelio is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * Modelio is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with Modelio.  If not, see <http://www.gnu.org/licenses/>.
 * 
 */

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2015.12.02 at 02:29:48 PM CET
//
package org.modelio.bpmnxml.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

/**
 * <p>Java class for DiagramElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DiagramElement">
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;sequence>
 * &lt;element name="extension" minOccurs="0">
 * &lt;complexType>
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;sequence>
 * &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 * &lt;/sequence>
 * &lt;/restriction>
 * &lt;/complexContent>
 * &lt;/complexType>
 * &lt;/element>
 * &lt;/sequence>
 * &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 * &lt;anyAttribute processContents='lax' namespace='##other'/>
 * &lt;/restriction>
 * &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@objid ("bb6eae68-6098-428b-8cea-92d2d345bae7")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiagramElement", namespace = "http://www.omg.org/spec/DD/20100524/DI", propOrder = {
    "extension"
})
@XmlSeeAlso({
    Node.class,
    Edge.class
})
public abstract class DiagramElement {
    @objid ("eb9ce808-bf50-458e-b2fb-5a1d8599954d")
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    @objid ("41a575b1-14bc-4f22-b34a-a45a7727f87f")
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    @objid ("494ae762-1d8c-4a50-ade1-67acd296c824")
    protected org.modelio.bpmnxml.model.DiagramElement.Extension extension;

    /**
     * Gets the value of the extension property.
     * @return
     * possible object is
     * {@link DiagramElement.Extension }
     */
    @objid ("e6f944d5-c862-466c-9602-9294ac34f68d")
    public org.modelio.bpmnxml.model.DiagramElement.Extension getExtension() {
        return this.extension;
    }

    /**
     * Sets the value of the extension property.
     * @param value allowed object is
     * {@link DiagramElement.Extension }
     */
    @objid ("621b6058-8890-4986-b62e-1096bc745d41")
    public void setExtension(org.modelio.bpmnxml.model.DiagramElement.Extension value) {
        this.extension = value;
    }

    /**
     * Gets the value of the id property.
     * @return
     * possible object is
     * {@link String }
     */
    @objid ("08b7279b-6469-4c78-bb8e-1fa877ade9a3")
    public String getId() {
        return this.id;
    }

    /**
     * Sets the value of the id property.
     * @param value allowed object is
     * {@link String }
     */
    @objid ("7632527c-8772-4f3c-92c5-dffa1cf1067e")
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * @return
     * always non-null
     */
    @objid ("c34fa94b-eb36-4b45-99ce-9b7264195469")
    public Map<QName, String> getOtherAttributes() {
        return this.otherAttributes;
    }

    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     * &lt;complexContent>
     * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     * &lt;sequence>
     * &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
     * &lt;/sequence>
     * &lt;/restriction>
     * &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @objid ("815d9a31-4a71-4d7b-a4b0-31ce8f9e89cb")
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "any"
    })
    public static class Extension {
        @objid ("e7f99b3f-2dfe-4fb2-9533-057e4ac5e988")
        @XmlAnyElement(lax = true)
        protected List<Object> any;

        /**
         * Gets the value of the any property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the any property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         * getAny().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         */
        @objid ("716c27e9-8220-4f55-a94d-21e0b2421966")
        public List<Object> getAny() {
            if (this.any == null) {
                this.any = new ArrayList<>();
            }
            return this.any;
        }

    }

}