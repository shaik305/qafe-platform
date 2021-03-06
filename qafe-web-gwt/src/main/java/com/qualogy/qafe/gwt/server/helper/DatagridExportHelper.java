/**
 * Copyright 2008-2017 Qualogy Solutions B.V.
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
package com.qualogy.qafe.gwt.server.helper;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.qualogy.qafe.gwt.client.component.DataMap;
import com.qualogy.qafe.gwt.client.vo.functions.DataContainerGVO;

public class DatagridExportHelper {

	public static List<Map<String,Object>> convert(List<DataContainerGVO> list){
		List<Map<String,Object>> out = new ArrayList<Map<String,Object>>();
		
		for (DataContainerGVO gvo : list) {
			if(gvo != null && gvo.isMap()) {
				DataMap map = gvo.getDataMap();
				Map<String,Object> newData = new LinkedHashMap<String,Object>();
				
				for (String key : map.keySet()) {
					newData.put(key, map.get(key)!=null ?  map.get(key).createType(): null);
				}
				if (!newData.isEmpty()){
					out.add(newData);
				}
			}
			
		}
		return out;
	}
}
