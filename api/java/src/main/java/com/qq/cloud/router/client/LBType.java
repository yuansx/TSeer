/**
 * Tencent is pleased to support the open source community by making Tseer available.
 *
 * Copyright (C) 2018 THL A29 Limited, a Tencent company. All rights reserved.
 * 
 * Licensed under the BSD 3-Clause License (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * 
 * https://opensource.org/licenses/BSD-3-Clause
 *
 * Unless required by applicable law or agreed to in writing, software distributed 
 * under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package com.qq.cloud.router.client;

public enum LBType {
    LB_TYPE_LOOP(0),
    LB_TYPE_RANDOM(1),
    LB_TYPE_STATIC_WEIGHT(2),
    LB_TYPE_CST_HASH(3),
    LB_TYPE_ALL(4);
    
    private final int lbType;
    
    private LBType(int lbGetType) {
    	this.lbType = lbGetType;
    }
    
    public int getLBType() {
    	return lbType;
    }
    
	public static LBType convert(int value) {
		for(LBType v : values()) {
			if(v.getLBType() == value) {
				return v;
			}
		}
		return null;
	}
}
