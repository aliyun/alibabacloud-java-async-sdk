// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeActionEventPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeActionEventPolicyResponseBody</p>
 */
public class DescribeActionEventPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EnableEventLog")
    private String enableEventLog;

    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeActionEventPolicyResponseBody(Builder builder) {
        this.enableEventLog = builder.enableEventLog;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeActionEventPolicyResponseBody create() {
        return builder().build();
    }

    /**
     * @return enableEventLog
     */
    public String getEnableEventLog() {
        return this.enableEventLog;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String enableEventLog; 
        private String regionId; 
        private String requestId; 

        /**
         * Indicates whether the event history feature is enabled.
         */
        public Builder enableEventLog(String enableEventLog) {
            this.enableEventLog = enableEventLog;
            return this;
        }

        /**
         * The region ID.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeActionEventPolicyResponseBody build() {
            return new DescribeActionEventPolicyResponseBody(this);
        } 

    } 

}
