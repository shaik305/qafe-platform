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
package com.qualogy.qafe.mgwt.client.vo.functions.dialog;

public class GenericDialogGVO extends MessageDialogBuiltInGVO {

	private String message;

	public final static String TYPE_INFO = "info";
	public final static String TYPE_ERROR = "error";
	public final static String TYPE_ALERT = "alert";
	
	private String type=TYPE_INFO;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getClassName() {
		return "com.qualogy.qafe.gwt.client.vo.functions.dialog.GenericDialogGVO";
	}

}
