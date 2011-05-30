/*
 * JBoss, Home of Professional Open Source
 * Copyright 2011, Red Hat, Inc. and/or its affiliates, and individual
 * contributors as indicated by the @authors tag. All rights reserved.
 * See the copyright.txt in the distribution for a full listing
 * of individual contributors.
 * 
 * This copyrighted material is made available to anyone wishing to use,
 * modify, copy, or redistribute it subject to the terms and conditions
 * of the GNU General Public License, v. 2.0.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of 
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU 
 * General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License,
 * v. 2.0 along with this distribution; if not, write to the Free 
 * Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 */

package org.mobicents.protocols.ss7.mtp;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author amit bhayani
 * 
 */
public class MtpResumePrimitiveTest {

	/**
	 * 
	 */
	public MtpResumePrimitiveTest() {
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public static void setUpClass() throws Exception {
	}

	@AfterClass
	public static void tearDownClass() throws Exception {
	}

	@Before
	public void setUp() {
	}

	@After
	public void tearDown() {
	}

	/**
	 * Test of schedule method, of class MTPScheduler.
	 */
	@Test
	public void testEncodeDecode() throws InterruptedException {
		Mtp3ResumePrimitive resumePrimi = new Mtp3ResumePrimitive(123);
		byte[] data = resumePrimi.getValue();

		Mtp3ResumePrimitive resumePrimi1 = new Mtp3ResumePrimitive(data);
		assertEquals(Mtp3Primitive.RESUME, resumePrimi1.getType());
		assertEquals(123, resumePrimi1.getAffectedDpc());

	}

}