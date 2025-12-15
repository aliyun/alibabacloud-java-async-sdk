// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

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
 * {@link DescribeDBInstanceMonitorResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBInstanceMonitorResponseBody</p>
 */
public class DescribeDBInstanceMonitorResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Interval")
    private String interval;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDBInstanceMonitorResponseBody(Builder builder) {
        this.interval = builder.interval;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBInstanceMonitorResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return interval
     */
    public String getInterval() {
        return this.interval;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String interval; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeDBInstanceMonitorResponseBody model) {
            this.interval = model.interval;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The collection frequency of the monitoring data. Unit: second.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder interval(String interval) {
            this.interval = interval;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>276F582D-C6B2-519C-A5ED-2A92BB15EC07</p>
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
