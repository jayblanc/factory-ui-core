package org.qualipso.factory.core.ui.gwt.impl;

import org.qualipso.factory.core.ui.gwt.service.HomeService;
import org.qualipso.factory.membership.MembershipService;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

/**
 * @author Jerome Blanchard (jayblanc@gmail.com)
 * @date 19 october 2009
 */
@SuppressWarnings("serial")
public class HomeServiceImpl extends RemoteServiceServlet implements HomeService {

	private MembershipService membership;
	
	@Override
	public String sayHello() {
		String message = "";
		try {
			message = "Hello dear " + membership.readProfile(membership.getProfilePathForConnectedIdentifier()).getFullname(); 
		} catch ( Exception e ) {
			e.printStackTrace();
		}
		return message; 
	}

}
