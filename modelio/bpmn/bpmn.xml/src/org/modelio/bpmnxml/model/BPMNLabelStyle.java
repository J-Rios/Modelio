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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

/**
 * <p>Java class for BPMNLabelStyle complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BPMNLabelStyle">
 * &lt;complexContent>
 * &lt;extension base="{http://www.omg.org/spec/DD/20100524/DI}Style">
 * &lt;sequence>
 * &lt;element ref="{http://www.omg.org/spec/DD/20100524/DC}Font"/>
 * &lt;/sequence>
 * &lt;/extension>
 * &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@objid ("b164f2ef-5cd3-43eb-bf2f-17c69741aac1")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BPMNLabelStyle", namespace = "http://www.omg.org/spec/BPMN/20100524/DI", propOrder = {
    "font"
})
public class BPMNLabelStyle extends Style {
    @objid ("05d9c78b-4fe1-4f26-a598-f75284fbeb96")
    @XmlElement(name = "Font", namespace = "http://www.omg.org/spec/DD/20100524/DC", required = true)
    protected Font font;

    /**
     * Gets the value of the font property.
     * @return
     * possible object is
     * {@link Font }
     */
    @objid ("c4537e99-02c4-400a-826c-8321c07ba8a6")
    public Font getFont() {
        return this.font;
    }

    /**
     * Sets the value of the font property.
     * @param value allowed object is
     * {@link Font }
     */
    @objid ("2c460f10-78e2-4437-9da9-d4de3184fbbe")
    public void setFont(Font value) {
        this.font = value;
    }

}