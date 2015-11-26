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

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

import org.eclipse.om2m.commons.constants.ShortName;

/**
 * <p>
 * Java class for eventNotificationCriteria complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="eventNotificationCriteria">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="createdBefore" type="{http://www.onem2m.org/xml/protocols}timestamp" minOccurs="0"/>
 *         &lt;element name="createdAfter" type="{http://www.onem2m.org/xml/protocols}timestamp" minOccurs="0"/>
 *         &lt;element name="modifiedSince" type="{http://www.onem2m.org/xml/protocols}timestamp" minOccurs="0"/>
 *         &lt;element name="unmodifiedSince" type="{http://www.onem2m.org/xml/protocols}timestamp" minOccurs="0"/>
 *         &lt;element name="stateTagSmaller" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="stateTagBigger" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="expireBefore" type="{http://www.onem2m.org/xml/protocols}timestamp" minOccurs="0"/>
 *         &lt;element name="expireAfter" type="{http://www.onem2m.org/xml/protocols}timestamp" minOccurs="0"/>
 *         &lt;element name="sizeAbove" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="sizeBelow" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="resourceStatus" type="{http://www.onem2m.org/xml/protocols}resourceStatus" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="operationMonitor" type="{http://www.onem2m.org/xml/protocols}operation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="attribute" type="{http://www.onem2m.org/xml/protocols}attribute" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eventNotificationCriteria", propOrder = { "createdBefore",
		"createdAfter", "modifiedSince", "unmodifiedSince", "stateTagSmaller",
		"stateTagBigger", "expireBefore", "expireAfter", "sizeAbove",
		"sizeBelow", "resourceStatus", "operationMonitor", "attribute" })
public class EventNotificationCriteria {

	@XmlElement(name = ShortName.CREATED_BEFORE)
	protected String createdBefore;
	@XmlElement(name = ShortName.CREATED_AFTER)
	protected String createdAfter;
	@XmlElement(name = ShortName.MODIFIED_SINCE)
	protected String modifiedSince;
	@XmlElement(name = ShortName.UNMODIFIED_SINCE)
	protected String unmodifiedSince;
	@XmlElement(name = ShortName.STATETAG_SMALLER)
	@XmlSchemaType(name = "positiveInteger")
	protected BigInteger stateTagSmaller;
	@XmlElement(name = ShortName.STATETAG_BIGGER)
	@XmlSchemaType(name = "nonNegativeInteger")
	protected BigInteger stateTagBigger;
	@XmlElement(name = ShortName.EXPIRE_BEFORE)
	protected String expireBefore;
	@XmlElement(name = ShortName.EXPIRE_AFTER)
	protected String expireAfter;
	@XmlElement(name = ShortName.SIZE_ABOVE)
	@XmlSchemaType(name = "nonNegativeInteger")
	protected BigInteger sizeAbove;
	@XmlElement(name = ShortName.SIZE_BELOW)
	@XmlSchemaType(name = "positiveInteger")
	protected BigInteger sizeBelow;
	@XmlElement(name = ShortName.RESOURCE_STATUS)
	protected List<BigInteger> resourceStatus;
	@XmlElement(name = ShortName.OPERATION_MONITOR)
	protected List<BigInteger> operationMonitor;
	@XmlElement(name = ShortName.ATTRIBUTE)
	protected List<Attribute> attribute;

	/**
	 * Gets the value of the createdBefore property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCreatedBefore() {
		return createdBefore;
	}

	/**
	 * Sets the value of the createdBefore property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCreatedBefore(String value) {
		this.createdBefore = value;
	}

	/**
	 * Gets the value of the createdAfter property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCreatedAfter() {
		return createdAfter;
	}

	/**
	 * Sets the value of the createdAfter property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCreatedAfter(String value) {
		this.createdAfter = value;
	}

	/**
	 * Gets the value of the modifiedSince property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getModifiedSince() {
		return modifiedSince;
	}

	/**
	 * Sets the value of the modifiedSince property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setModifiedSince(String value) {
		this.modifiedSince = value;
	}

	/**
	 * Gets the value of the unmodifiedSince property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getUnmodifiedSince() {
		return unmodifiedSince;
	}

	/**
	 * Sets the value of the unmodifiedSince property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setUnmodifiedSince(String value) {
		this.unmodifiedSince = value;
	}

	/**
	 * Gets the value of the stateTagSmaller property.
	 * 
	 * @return possible object is {@link BigInteger }
	 * 
	 */
	public BigInteger getStateTagSmaller() {
		return stateTagSmaller;
	}

	/**
	 * Sets the value of the stateTagSmaller property.
	 * 
	 * @param value
	 *            allowed object is {@link BigInteger }
	 * 
	 */
	public void setStateTagSmaller(BigInteger value) {
		this.stateTagSmaller = value;
	}

	/**
	 * Gets the value of the stateTagBigger property.
	 * 
	 * @return possible object is {@link BigInteger }
	 * 
	 */
	public BigInteger getStateTagBigger() {
		return stateTagBigger;
	}

	/**
	 * Sets the value of the stateTagBigger property.
	 * 
	 * @param value
	 *            allowed object is {@link BigInteger }
	 * 
	 */
	public void setStateTagBigger(BigInteger value) {
		this.stateTagBigger = value;
	}

	/**
	 * Gets the value of the expireBefore property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getExpireBefore() {
		return expireBefore;
	}

	/**
	 * Sets the value of the expireBefore property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setExpireBefore(String value) {
		this.expireBefore = value;
	}

	/**
	 * Gets the value of the expireAfter property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getExpireAfter() {
		return expireAfter;
	}

	/**
	 * Sets the value of the expireAfter property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setExpireAfter(String value) {
		this.expireAfter = value;
	}

	/**
	 * Gets the value of the sizeAbove property.
	 * 
	 * @return possible object is {@link BigInteger }
	 * 
	 */
	public BigInteger getSizeAbove() {
		return sizeAbove;
	}

	/**
	 * Sets the value of the sizeAbove property.
	 * 
	 * @param value
	 *            allowed object is {@link BigInteger }
	 * 
	 */
	public void setSizeAbove(BigInteger value) {
		this.sizeAbove = value;
	}

	/**
	 * Gets the value of the sizeBelow property.
	 * 
	 * @return possible object is {@link BigInteger }
	 * 
	 */
	public BigInteger getSizeBelow() {
		return sizeBelow;
	}

	/**
	 * Sets the value of the sizeBelow property.
	 * 
	 * @param value
	 *            allowed object is {@link BigInteger }
	 * 
	 */
	public void setSizeBelow(BigInteger value) {
		this.sizeBelow = value;
	}

	/**
	 * Gets the value of the resourceStatus property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the resourceStatus property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getResourceStatus().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link BigInteger }
	 * 
	 * 
	 */
	public List<BigInteger> getResourceStatus() {
		if (resourceStatus == null) {
			resourceStatus = new ArrayList<BigInteger>();
		}
		return this.resourceStatus;
	}

	/**
	 * Gets the value of the operationMonitor property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the operationMonitor property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getOperationMonitor().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link BigInteger }
	 * 
	 * 
	 */
	public List<BigInteger> getOperationMonitor() {
		if (operationMonitor == null) {
			operationMonitor = new ArrayList<BigInteger>();
		}
		return this.operationMonitor;
	}

	/**
	 * Gets the value of the attribute property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the attribute property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getAttribute().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link Attribute }
	 * 
	 * 
	 */
	public List<Attribute> getAttribute() {
		if (attribute == null) {
			attribute = new ArrayList<Attribute>();
		}
		return this.attribute;
	}

}
