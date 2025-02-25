// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribeDBClusterMonitorResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBClusterMonitorResponseBody</p>
 */
public class DescribeDBClusterMonitorResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Period")
    private String period;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDBClusterMonitorResponseBody(Builder builder) {
        this.period = builder.period;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBClusterMonitorResponseBody create() {
        return builder().build();
    }

    /**
     * @return period
     */
    public String getPeriod() {
        return this.period;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String period; 
        private String requestId; 

        /**
         * <p>The interval at which monitoring data is collected. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        public Builder period(String period) {
            this.period = period;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>593AE1C5-B70C-463F-9207-074639******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDBClusterMonitorResponseBody build() {
            return new DescribeDBClusterMonitorResponseBody(this);
        } 

    } 

}
