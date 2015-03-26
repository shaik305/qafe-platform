/**
 * Copyright 2008-2015 Qualogy Solutions B.V.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * 	http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.qualogy.qafe.gwt.client.service;

import java.util.List;
import java.util.Map;

import com.google.gwt.user.client.rpc.RemoteService;
import com.qualogy.qafe.gwt.client.exception.GWTApplicationStoreException;
import com.qualogy.qafe.gwt.client.exception.GWTServiceException;
import com.qualogy.qafe.gwt.client.util.SerializableWhitelist;
import com.qualogy.qafe.gwt.client.vo.data.EventDataGVO;
import com.qualogy.qafe.gwt.client.vo.data.EventItemDataGVO;
import com.qualogy.qafe.gwt.client.vo.data.GDataObject;
import com.qualogy.qafe.gwt.client.vo.data.GEventItemDataObject;
import com.qualogy.qafe.gwt.client.vo.data.InitState;
import com.qualogy.qafe.gwt.client.vo.functions.DataContainerGVO;
import com.qualogy.qafe.gwt.client.vo.ui.UIGVO;
import com.qualogy.qafe.gwt.client.vo.ui.UIVOCluster;

public interface RPCService extends RemoteService {
	UIVOCluster getUISFromApplicationContext(Map<String,String> parameters) throws GWTServiceException;

	UIGVO getUIFromApplicationContext() throws GWTServiceException;

	UIVOCluster reload(Map<String,String> parameters) throws GWTServiceException;
	
	UIVOCluster activate(Map<String,String> parameters) throws GWTServiceException;

	void removeUI(String uuid) throws GWTServiceException;

	/**
	 * @param xmlLayout
	 * @return
	 * @throws GWTServiceException
	 */
	String getUI(String xmlLayout) throws GWTServiceException;

	UIGVO getUIVO(String xmlUI) throws GWTServiceException;

	UIGVO getUIByUUID(String uuid) throws GWTServiceException;

	String getXMLUIByUUID(String uuid) throws GWTServiceException;
	
	GDataObject executeEvent(EventDataGVO eventData) throws GWTServiceException, GWTApplicationStoreException;

	InitState getMDIState(Map<String, String> parameters) throws GWTServiceException;

	void removeFileFromLocalStore(String appUUID, String windowId, String uploadUUID) throws GWTServiceException;

	List<DataContainerGVO> getDataForDatagridFromUpload(String uuid) throws GWTServiceException;
	
	String prepareForExport(List<DataContainerGVO> list, String exportCode,String header,boolean autoGeneratedHeader) throws GWTServiceException;
	
	void notify(String message,String body) throws GWTServiceException;
	
	void removeWindowsEventData(String eventId, String windowId) throws GWTServiceException;
	
	String generateTypedCSS(String rendererType, String applicationId) throws GWTServiceException;
	
	void removeGloballyStoredData(String eventId, String applicationId) throws GWTServiceException;
	
	GEventItemDataObject executeEventItem(EventItemDataGVO eventItem) throws GWTServiceException, GWTApplicationStoreException;
	
	SerializableWhitelist whitelist(SerializableWhitelist value);
}