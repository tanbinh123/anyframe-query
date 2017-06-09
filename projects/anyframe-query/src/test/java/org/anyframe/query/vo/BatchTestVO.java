/*
 * Copyright 2002-2008 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.anyframe.query.vo;

import java.io.Serializable;

/**
 * To change the template for this generated type
 * comment go to Window&gt;Preferences&gt;Java&gt;Code
 * Generation&gt;Code and Comments
 * @author SOOYEON PARK
 */
public class BatchTestVO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String col1;

    private String col2;

    private long col3;

    public String getCol1() {
        return col1;
    }

    public String getCol2() {
        return col2;
    }

    public long getCol3() {
        return col3;
    }

    public void setCol1(String string) {
        col1 = string;
    }

    public void setCol2(String string) {
        col2 = string;
    }

    public void setCol3(long l) {
        col3 = l;
    }

}
