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
/**
 * 
 */
package com.qualogy.qafe.gwt.client.vo.ui;



/**
 * @author rjankie 
 */

public  class TableRowGVO extends EditableComponentGVO{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6207925561525926487L;


	protected TableCellGVO[] cells= null;


	public TableCellGVO[] getCells() {
		return cells;
	}


	public void setCells(TableCellGVO[] cells) {
		this.cells = cells;
	}


	public String getClassName() {
		return "com.qualogy.qafe.gwt.client.vo.ui.TableRowGVO";
	}



	
	
}
