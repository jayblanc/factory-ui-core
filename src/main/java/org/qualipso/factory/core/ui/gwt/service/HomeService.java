package org.qualipso.factory.core.ui.gwt.service;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 * @author Jerome Blanchard (jayblanc@gmail.com)
 * @date 19 october 2009
 */
@RemoteServiceRelativePath("Home")
public interface HomeService extends RemoteService {
	
	public String sayHello();

}
