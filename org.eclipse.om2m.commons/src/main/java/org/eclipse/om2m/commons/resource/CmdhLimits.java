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
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

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
 *     &lt;extension base="{http://www.onem2m.org/xml/protocols}mgmtResource">
 *       &lt;sequence>
 *         &lt;element name="order" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *         &lt;element name="requestOrigin" type="{http://www.onem2m.org/xml/protocols}listOfM2MID"/>
 *         &lt;element name="requestContext" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="requestContextNotification" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="requestCharacteristics" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="limitsEventCategory" type="{http://www.onem2m.org/xml/protocols}listOfEventCat"/>
 *         &lt;element name="limitsRequestExpTime" type="{http://www.onem2m.org/xml/protocols}listOfMinMax"/>
 *         &lt;element name="limitsResultExpTime" type="{http://www.onem2m.org/xml/protocols}listOfMinMax"/>
 *         &lt;element name="limitsOpExecTime" type="{http://www.onem2m.org/xml/protocols}listOfMinMax"/>
 *         &lt;element name="limitsRespPersistence" type="{http://www.onem2m.org/xml/protocols}listOfMinMax"/>
 *         &lt;element name="limitsDelAggregation">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *               &lt;enumeration value="0"/>
 *               &lt;enumeration value="1"/>
 *               &lt;enumeration value="0 1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "order", "requestOrigin", "requestContext",
		"requestContextNotification", "requestCharacteristics",
		"limitsEventCategory", "limitsRequestExpTime", "limitsResultExpTime",
		"limitsOpExecTime", "limitsRespPersistence", "limitsDelAggregation" })
@XmlRootElement(name = "cmdhLimits")
public class CmdhLimits extends MgmtResource {

	@XmlElement(required = true)
	@XmlSchemaType(name = "positiveInteger")
	protected BigInteger order;
	@XmlList
	@XmlElement(required = true)
	protected List<String> requestOrigin;
	@XmlElement(required = true)
	protected Object requestContext;
	protected Boolean requestContextNotification;
	@XmlElement(required = true)
	protected Object requestCharacteristics;
	@XmlList
	@XmlElement(required = true)
	protected List<String> limitsEventCategory;
	@XmlList
	@XmlElement(type = Long.class)
	protected List<Long> limitsRequestExpTime;
	@XmlList
	@XmlElement(type = Long.class)
	protected List<Long> limitsResultExpTime;
	@XmlList
	@XmlElement(type = Long.class)
	protected List<Long> limitsOpExecTime;
	@XmlList
	@XmlElement(type = Long.class)
	protected List<Long> limitsRespPersistence;
	@XmlElement(required = true)
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	protected String limitsDelAggregation;

	/**
	 * Gets the value of the order property.
	 * 
	 * @return possible object is {@link BigInteger }
	 * 
	 */
	public BigInteger getOrder() {
		return order;
	}

	/**
	 * Sets the value of the order property.
	 * 
	 * @param value
	 *            allowed object is {@link BigInteger }
	 * 
	 */
	public void setOrder(BigInteger value) {
		this.order = value;
	}

	/**
	 * Gets the value of the requestOrigin property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the requestOrigin property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getRequestOrigin().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link String }
	 * 
	 * 
	 */
	public List<String> getRequestOrigin() {
		if (requestOrigin == null) {
			requestOrigin = new ArrayList<String>();
		}
		return this.requestOrigin;
	}

	/**
	 * Gets the value of the requestContext property.
	 * 
	 * @return possible object is {@link Object }
	 * 
	 */
	public Object getRequestContext() {
		return requestContext;
	}

	/**
	 * Sets the value of the requestContext property.
	 * 
	 * @param value
	 *            allowed object is {@link Object }
	 * 
	 */
	public void setRequestContext(Object value) {
		this.requestContext = value;
	}

	/**
	 * Gets the value of the requestContextNotification property.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isRequestContextNotification() {
		return requestContextNotification;
	}

	/**
	 * Sets the value of the requestContextNotification property.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setRequestContextNotification(Boolean value) {
		this.requestContextNotification = value;
	}

	/**
	 * Gets the value of the requestCharacteristics property.
	 * 
	 * @return possible object is {@link Object }
	 * 
	 */
	public Object getRequestCharacteristics() {
		return requestCharacteristics;
	}

	/**
	 * Sets the value of the requestCharacteristics property.
	 * 
	 * @param value
	 *            allowed object is {@link Object }
	 * 
	 */
	public void setRequestCharacteristics(Object value) {
		this.requestCharacteristics = value;
	}

	/**
	 * Gets the value of the limitsEventCategory property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the limitsEventCategory property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getLimitsEventCategory().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link String }
	 * 
	 * 
	 */
	public List<String> getLimitsEventCategory() {
		if (limitsEventCategory == null) {
			limitsEventCategory = new ArrayList<String>();
		}
		return this.limitsEventCategory;
	}

	/**
	 * Gets the value of the limitsRequestExpTime property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the limitsRequestExpTime property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getLimitsRequestExpTime().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link Long }
	 * 
	 * 
	 */
	public List<Long> getLimitsRequestExpTime() {
		if (limitsRequestExpTime == null) {
			limitsRequestExpTime = new ArrayList<Long>();
		}
		return this.limitsRequestExpTime;
	}

	/**
	 * Gets the value of the limitsResultExpTime property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the limitsResultExpTime property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getLimitsResultExpTime().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link Long }
	 * 
	 * 
	 */
	public List<Long> getLimitsResultExpTime() {
		if (limitsResultExpTime == null) {
			limitsResultExpTime = new ArrayList<Long>();
		}
		return this.limitsResultExpTime;
	}

	/**
	 * Gets the value of the limitsOpExecTime property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the limitsOpExecTime property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getLimitsOpExecTime().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link Long }
	 * 
	 * 
	 */
	public List<Long> getLimitsOpExecTime() {
		if (limitsOpExecTime == null) {
			limitsOpExecTime = new ArrayList<Long>();
		}
		return this.limitsOpExecTime;
	}

	/**
	 * Gets the value of the limitsRespPersistence property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the limitsRespPersistence property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getLimitsRespPersistence().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link Long }
	 * 
	 * 
	 */
	public List<Long> getLimitsRespPersistence() {
		if (limitsRespPersistence == null) {
			limitsRespPersistence = new ArrayList<Long>();
		}
		return this.limitsRespPersistence;
	}

	/**
	 * Gets the value of the limitsDelAggregation property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLimitsDelAggregation() {
		return limitsDelAggregation;
	}

	/**
	 * Sets the value of the limitsDelAggregation property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setLimitsDelAggregation(String value) {
		this.limitsDelAggregation = value;
	}

}
