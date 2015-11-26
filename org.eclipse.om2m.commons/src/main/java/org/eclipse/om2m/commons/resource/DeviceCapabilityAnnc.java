/*******************************************************************************
 * Copyright (c) 2013-2015 LAAS-CNRS (www.laas.fr)
 * 7 Colonel Roche 31077 Toulouse - France
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Thierry Monteil (Project co-founder) - Management and initial specification,
 *         conception and documentation.
 *     Mahdi Ben Alaya (Project co-founder) - Management and initial specification,
 *         conception, implementation, test and documentation.
 *     Khalil Drira - Management and initial specification.
 *     Guillaume Garzone - Initial specification, conception, implementation, test
 *         and documentation.
 *     François Aïssaoui - Initial specification, conception, implementation, test
 *         and documentation.
 *******************************************************************************/
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.15 at 03:56:27 PM CEST 
//

package org.eclipse.om2m.commons.resource;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.onem2m.org/xml/protocols}announcedMgmtResource">
 *       &lt;sequence>
 *         &lt;element name="capabilityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="attached" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="capabilityActionStatus" type="{http://www.onem2m.org/xml/protocols}actionStatus" minOccurs="0"/>
 *         &lt;element name="currentState" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="enable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="disable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="childResource" type="{http://www.onem2m.org/xml/protocols}childResourceRef" maxOccurs="unbounded"/>
 *           &lt;element ref="{http://www.onem2m.org/xml/protocols}subscription" maxOccurs="unbounded"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "capabilityName", "attached",
		"capabilityActionStatus", "currentState", "enable", "disable",
		"childResource", "subscription" })
@XmlRootElement(name = "deviceCapabilityAnnc")
public class DeviceCapabilityAnnc extends AnnouncedMgmtResource {

	protected String capabilityName;
	protected Boolean attached;
	protected ActionStatus capabilityActionStatus;
	protected Boolean currentState;
	protected Boolean enable;
	protected Boolean disable;
	protected List<ChildResourceRef> childResource;
	@XmlElement(namespace = "http://www.onem2m.org/xml/protocols")
	protected List<Subscription> subscription;

	/**
	 * Gets the value of the capabilityName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCapabilityName() {
		return capabilityName;
	}

	/**
	 * Sets the value of the capabilityName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCapabilityName(String value) {
		this.capabilityName = value;
	}

	/**
	 * Gets the value of the attached property.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isAttached() {
		return attached;
	}

	/**
	 * Sets the value of the attached property.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setAttached(Boolean value) {
		this.attached = value;
	}

	/**
	 * Gets the value of the capabilityActionStatus property.
	 * 
	 * @return possible object is {@link ActionStatus }
	 * 
	 */
	public ActionStatus getCapabilityActionStatus() {
		return capabilityActionStatus;
	}

	/**
	 * Sets the value of the capabilityActionStatus property.
	 * 
	 * @param value
	 *            allowed object is {@link ActionStatus }
	 * 
	 */
	public void setCapabilityActionStatus(ActionStatus value) {
		this.capabilityActionStatus = value;
	}

	/**
	 * Gets the value of the currentState property.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isCurrentState() {
		return currentState;
	}

	/**
	 * Sets the value of the currentState property.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setCurrentState(Boolean value) {
		this.currentState = value;
	}

	/**
	 * Gets the value of the enable property.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isEnable() {
		return enable;
	}

	/**
	 * Sets the value of the enable property.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setEnable(Boolean value) {
		this.enable = value;
	}

	/**
	 * Gets the value of the disable property.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isDisable() {
		return disable;
	}

	/**
	 * Sets the value of the disable property.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setDisable(Boolean value) {
		this.disable = value;
	}

	/**
	 * Gets the value of the childResource property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the childResource property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getChildResource().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link ChildResourceRef }
	 * 
	 * 
	 */
	public List<ChildResourceRef> getChildResource() {
		if (childResource == null) {
			childResource = new ArrayList<ChildResourceRef>();
		}
		return this.childResource;
	}

	/**
	 * Gets the value of the subscription property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the subscription property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getSubscription().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link Subscription }
	 * 
	 * 
	 */
	public List<Subscription> getSubscription() {
		if (subscription == null) {
			subscription = new ArrayList<Subscription>();
		}
		return this.subscription;
	}

}
