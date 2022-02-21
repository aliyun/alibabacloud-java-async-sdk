// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBInstanceMonitorResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBInstanceMonitorResponseBody</p>
 */
public class DescribeDBInstanceMonitorResponseBody extends TeaModel {
    @NameInMap("Granularity")
    private String granularity;

    @NameInMap("RequestId")
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
         * Granularity.
         */
        public Builder granularity(String granularity) {
            this.granularity = granularity;
            return this;
        }

        /**
         * RequestId.
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
