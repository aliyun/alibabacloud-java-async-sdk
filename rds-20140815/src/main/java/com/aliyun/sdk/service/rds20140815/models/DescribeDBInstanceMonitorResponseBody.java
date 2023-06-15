// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
    @NameInMap("Period")
    private String period;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeDBInstanceMonitorResponseBody(Builder builder) {
        this.period = builder.period;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBInstanceMonitorResponseBody create() {
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
         * The monitoring frequency. Unit: seconds.
         */
        public Builder period(String period) {
            this.period = period;
            return this;
        }

        /**
         * The ID of the request.
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
