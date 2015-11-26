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
package org.eclipse.om2m.commons.exceptions;


/**
 * Used to handle a not permitted attribute that has been provided to
 * the CSE.
 *
 */
public class NotPermittedAttrException extends BadRequestException {
	
	private static final long serialVersionUID = 7326350383451396608L;

	public NotPermittedAttrException() {
		super();
	}
	
	public NotPermittedAttrException(String message){
		super(message);
	}
	
	public NotPermittedAttrException(String message, Throwable cause){
		super(message, cause);
	}

}
