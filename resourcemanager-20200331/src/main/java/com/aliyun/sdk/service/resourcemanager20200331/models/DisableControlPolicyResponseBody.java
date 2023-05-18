// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableControlPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>DisableControlPolicyResponseBody</p>
 */
public class DisableControlPolicyResponseBody extends TeaModel {
    @NameInMap("EnablementStatus")
    private String enablementStatus;

    @NameInMap("RequestId")
    private String requestId;

    private DisableControlPolicyResponseBody(Builder builder) {
        this.enablementStatus = builder.enablementStatus;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DisableControlPolicyResponseBody create() {
        return builder().build();
    }

    /**
     * @return enablementStatus
     */
    public String getEnablementStatus() {
        return this.enablementStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String enablementStatus; 
        private String requestId; 

        /**
         * The status of the Control Policy feature. Valid values:
         * <p>
         * 
         * *   Enabled: The Control Policy feature is enabled.
         * *   PendingEnable: The Control Policy feature is being enabled.
         * *   Disabled: The Control Policy feature is disabled.
         * *   PendingDisable: The Control Policy feature is being disabled.
         */
        public Builder enablementStatus(String enablementStatus) {
            this.enablementStatus = enablementStatus;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DisableControlPolicyResponseBody build() {
            return new DisableControlPolicyResponseBody(this);
        } 

    } 

}
