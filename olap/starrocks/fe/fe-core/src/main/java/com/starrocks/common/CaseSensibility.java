// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.

package com.starrocks.common;

public enum CaseSensibility {
    CLUSTER(true),
    DATABASE(true),
    TABLE(true),
    ROLUP(true),
    PARTITION(true),
    COLUMN(false),
    USER(true),
    ROLE(false),
    HOST(false),
    LABEL(false),
    VARIABLES(true),
    RESOURCE(true),
    WAREHOUSE(true),
    CONFIG(true);

    private boolean caseSensitive;

    private CaseSensibility(boolean caseSensitive) {
        this.caseSensitive = caseSensitive;
    }

    public boolean getCaseSensibility() {
        return caseSensitive;
    }

}
