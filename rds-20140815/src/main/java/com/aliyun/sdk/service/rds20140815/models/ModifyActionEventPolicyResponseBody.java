// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyActionEventPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyActionEventPolicyResponseBody</p>
 */
public class ModifyActionEventPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EnableEventLog")
    private String enableEventLog;

    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ModifyActionEventPolicyResponseBody(Builder builder) {
        this.enableEventLog = builder.enableEventLog;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyActionEventPolicyResponseBody create() {
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
         * <p>Indicates whether the event history feature is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder enableEventLog(String enableEventLog) {
            this.enableEventLog = enableEventLog;
            return this;
        }

        /**
         * <p>The ID of the region for which the event history feature is enabled or disabled.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>BAC0952C-0EB3-4DE7-A567-B83269BFE43F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyActionEventPolicyResponseBody build() {
            return new ModifyActionEventPolicyResponseBody(this);
        } 

    } 

}
