// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
 * {@link DescribeInstanceLogsOutput} extends {@link TeaModel}
 *
 * <p>DescribeInstanceLogsOutput</p>
 */
public class DescribeInstanceLogsOutput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("WebLogEntrys")
    private java.util.List<WebLogEntry> webLogEntrys;

    private DescribeInstanceLogsOutput(Builder builder) {
        this.webLogEntrys = builder.webLogEntrys;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceLogsOutput create() {
        return builder().build();
    }

    /**
     * @return webLogEntrys
     */
    public java.util.List<WebLogEntry> getWebLogEntrys() {
        return this.webLogEntrys;
    }

    public static final class Builder {
        private java.util.List<WebLogEntry> webLogEntrys; 

        /**
         * WebLogEntrys.
         */
        public Builder webLogEntrys(java.util.List<WebLogEntry> webLogEntrys) {
            this.webLogEntrys = webLogEntrys;
            return this;
        }

        public DescribeInstanceLogsOutput build() {
            return new DescribeInstanceLogsOutput(this);
        } 

    } 

}
