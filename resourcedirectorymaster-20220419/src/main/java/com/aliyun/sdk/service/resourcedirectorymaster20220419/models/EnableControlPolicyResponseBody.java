// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcedirectorymaster20220419.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableControlPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>EnableControlPolicyResponseBody</p>
 */
public class EnableControlPolicyResponseBody extends TeaModel {
    @NameInMap("EnablementStatus")
    private String enablementStatus;

    @NameInMap("RequestId")
    private String requestId;

    private EnableControlPolicyResponseBody(Builder builder) {
        this.enablementStatus = builder.enablementStatus;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableControlPolicyResponseBody create() {
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
         * EnablementStatus.
         */
        public Builder enablementStatus(String enablementStatus) {
            this.enablementStatus = enablementStatus;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public EnableControlPolicyResponseBody build() {
            return new EnableControlPolicyResponseBody(this);
        } 

    } 

}
