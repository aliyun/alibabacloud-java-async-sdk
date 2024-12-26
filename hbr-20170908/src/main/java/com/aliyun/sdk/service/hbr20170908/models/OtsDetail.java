// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link OtsDetail} extends {@link TeaModel}
 *
 * <p>OtsDetail</p>
 */
public class OtsDetail extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("TableNames")
    private java.util.List<String> tableNames;

    private OtsDetail(Builder builder) {
        this.tableNames = builder.tableNames;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OtsDetail create() {
        return builder().build();
    }

    /**
     * @return tableNames
     */
    public java.util.List<String> getTableNames() {
        return this.tableNames;
    }

    public static final class Builder {
        private java.util.List<String> tableNames; 

        /**
         * TableNames.
         */
        public Builder tableNames(java.util.List<String> tableNames) {
            this.tableNames = tableNames;
            return this;
        }

        public OtsDetail build() {
            return new OtsDetail(this);
        } 

    } 

}
