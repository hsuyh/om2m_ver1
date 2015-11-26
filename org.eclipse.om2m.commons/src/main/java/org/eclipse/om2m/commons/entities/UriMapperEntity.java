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
package org.eclipse.om2m.commons.entities;

import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.eclipse.om2m.commons.constants.DBEntities;
import org.eclipse.om2m.commons.constants.ShortName;

/**
 * Uri mapper JPA entity
 *
 */
@Entity(name=DBEntities.URI_MAPPER_ENTITY)
public class UriMapperEntity {
	
	@Id
	@Column(name = DBEntities.HIERARCHICAL_URI)
	private String hierarchicalUri ;
	
	@Column(name = DBEntities.NONHIERARCHICAL_URI)
	private String nonHierarchicalUri;

	@Column(name = ShortName.RESOURCE_TYPE)
	private int resourceType;
	
	/**
	 * @return the hierarchicalUri
	 */
	public String getHierarchicalUri() {
		return hierarchicalUri;
	}

	/**
	 * @param hierarchicalUri the hierarchicalUri to set
	 */
	public void setHierarchicalUri(String hierarchicalUri) {
		this.hierarchicalUri = hierarchicalUri;
	}

	/**
	 * @return the nonHierarchicalUri
	 */
	public String getNonHierarchicalUri() {
		return nonHierarchicalUri;
	}

	/**
	 * @param nonHierarchicalUri the nonHierarchicalUri to set
	 */
	public void setNonHierarchicalUri(String nonHierarchicalUri) {
		this.nonHierarchicalUri = nonHierarchicalUri;
	}

	/**
	 * @return the resourceType
	 */
	public int getResourceType() {
		return resourceType;
	}

	/**
	 * @param resourceType the resourceType to set
	 */
	public void setResourceType(int resourceType) {
		this.resourceType = resourceType;
	}
	
	public void setResourceType(BigInteger resourceType){
		this.resourceType = resourceType.intValue();
	}
	
}
