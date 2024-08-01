// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBInstanceMonitorResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBInstanceMonitorResponseBody</p>
 */
public class DescribeDBInstanceMonitorResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Granularity")
    private String granularity;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDBInstanceMonitorResponseBody(Builder builder) {
        this.granularity = builder.granularity;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBInstanceMonitorResponseBody create() {
        return builder().build();
    }

    /**
     * @return granularity
     */
    public String getGranularity() {
        return this.granularity;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String granularity; 
        private String requestId; 

        /**
         * The collection frequency of monitoring data for the instance. Valid value: **5**. Unit: seconds.
         */
        public Builder granularity(String granularity) {
            this.granularity = granularity;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDBInstanceMonitorResponseBody build() {
            return new DescribeDBInstanceMonitorResponseBody(this);
        } 

    } 

}
