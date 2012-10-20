/*
 * TeleStax, Open Source Cloud Communications  Copyright 2012.
 * and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

package org.mobicents.protocols.ss7.map.api.service.mobility.subscriberInformation;

import java.util.ArrayList;
import org.mobicents.protocols.ss7.map.api.primitives.MAPExtensionContainer;
import org.mobicents.protocols.ss7.map.api.service.mobility.subscriberManagement.DCSI;
import org.mobicents.protocols.ss7.map.api.service.mobility.subscriberManagement.GPRSCSI;
import org.mobicents.protocols.ss7.map.api.service.mobility.subscriberManagement.MCSI;
import org.mobicents.protocols.ss7.map.api.service.mobility.subscriberManagement.MGCSI;
import org.mobicents.protocols.ss7.map.api.service.mobility.subscriberManagement.MTsmsCAMELTDPCriteria;
import org.mobicents.protocols.ss7.map.api.service.mobility.subscriberManagement.OBcsmCamelTdpCriteria;
import org.mobicents.protocols.ss7.map.api.service.mobility.subscriberManagement.OCSI;
import org.mobicents.protocols.ss7.map.api.service.mobility.subscriberManagement.SMSCSI;
import org.mobicents.protocols.ss7.map.api.service.mobility.subscriberManagement.SSCSI;
import org.mobicents.protocols.ss7.map.api.service.mobility.subscriberManagement.SpecificCSIWithdraw;
import org.mobicents.protocols.ss7.map.api.service.mobility.subscriberManagement.TBcsmCamelTdpCriteria;
import org.mobicents.protocols.ss7.map.api.service.mobility.subscriberManagement.TCSI;

/**	
 * 

CAMEL-SubscriptionInfo ::= SEQUENCE {
	o-CSI		[0]	O-CSI	OPTIONAL,
	o-BcsmCamelTDP-CriteriaList	[1]	O-BcsmCamelTDPCriteriaList	OPTIONAL, 
	d-CSI		[2]	D-CSI	OPTIONAL,
	t-CSI		[3]	T-CSI	OPTIONAL,
	t-BCSM-CAMEL-TDP-CriteriaList	[4]	T-BCSM-CAMEL-TDP-CriteriaList	OPTIONAL,
	vt-CSI		[5]	T-CSI	OPTIONAL,
	vt-BCSM-CAMEL-TDP-CriteriaList	[6]	T-BCSM-CAMEL-TDP-CriteriaList	OPTIONAL,
	tif-CSI		[7]	NULL		OPTIONAL,
	tif-CSI-NotificationToCSE	[8]	NULL		OPTIONAL,
	gprs-CSI		[9]	GPRS-CSI	OPTIONAL,
	mo-sms-CSI	[10]	SMS-CSI	OPTIONAL,
	ss-CSI		[11]	SS-CSI	OPTIONAL,
	m-CSI		[12]	M-CSI	OPTIONAL,
	extensionContainer	[13]	ExtensionContainer	OPTIONAL,
	...,
	specificCSIDeletedList	[14]	SpecificCSI-Withdraw	OPTIONAL,
	mt-sms-CSI	[15]	SMS-CSI	OPTIONAL,
	mt-smsCAMELTDP-CriteriaList	[16]	MT-smsCAMELTDP-CriteriaList	OPTIONAL,
	mg-csi		[17]	MG-CSI	OPTIONAL,
	o-IM-CSI		[18] O-CSI	OPTIONAL,
	o-IM-BcsmCamelTDP-CriteriaList	[19] O-BcsmCamelTDPCriteriaList	OPTIONAL,
	d-IM-CSI		[20] D-CSI	OPTIONAL,
	vt-IM-CSI		[21] T-CSI	OPTIONAL,
	vt-IM-BCSM-CAMEL-TDP-CriteriaList	[22]	T-BCSM-CAMEL-TDP-CriteriaList	OPTIONAL
	}

O-BcsmCamelTDPCriteriaList ::= SEQUENCE SIZE (1..10) OF O-BcsmCamelTDP-Criteria 

T-BCSM-CAMEL-TDP-CriteriaList ::= SEQUENCE SIZE (1..10) OF T-BCSM-CAMEL-TDP-Criteria 

MT-smsCAMELTDP-CriteriaList ::= SEQUENCE SIZE (1.. 10) OF MT-smsCAMELTDP-Criteria

 * 
 * @author sergey vetyutnev
 *
 */
public interface CAMELSubscriptionInfo {

	public OCSI getOCsi();

	public ArrayList<OBcsmCamelTdpCriteria> getOBcsmCamelTDPCriteriaList();

	public DCSI getDCsi();

	public TCSI getTCsi();

	public ArrayList<TBcsmCamelTdpCriteria> getTBcsmCamelTdpCriteriaList();

	public TCSI getVtCsi();

	public ArrayList<TBcsmCamelTdpCriteria> getVtBcsmCamelTdpCriteriaList();

	public boolean getTifCsi();

	public boolean getTifCsiNotificationToCSE();

	public GPRSCSI getGprsCsi();

	public SMSCSI getMoSmsCsi();

	public SSCSI getSsCsi();

	public MCSI getMCsi();

	public MAPExtensionContainer getExtensionContainer();

	public SpecificCSIWithdraw getSpecificCSIDeletedList();

	public SMSCSI getMtSmsCsi();

	public ArrayList<MTsmsCAMELTDPCriteria> getMtSmsCamelTdpCriteriaList();

	public MGCSI getMgCsi();

	public OCSI geToImCsi();

	public ArrayList<OBcsmCamelTdpCriteria> getOImBcsmCamelTdpCriteriaList();

	public DCSI getDImCsi();

	public TCSI getVtImCsi();

	public ArrayList<TBcsmCamelTdpCriteria> getVtImBcsmCamelTdpCriteriaList();

}
