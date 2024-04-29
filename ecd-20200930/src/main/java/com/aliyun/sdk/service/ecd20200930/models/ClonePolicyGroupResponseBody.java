// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ClonePolicyGroupResponseBody} extends {@link TeaModel}
 *
 * <p>ClonePolicyGroupResponseBody</p>
 */
public class ClonePolicyGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PolicyGroupId")
    private String policyGroupId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ClonePolicyGroupResponseBody(Builder builder) {
        this.policyGroupId = builder.policyGroupId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ClonePolicyGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return policyGroupId
     */
    public String getPolicyGroupId() {
        return this.policyGroupId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String policyGroupId; 
        private String requestId; 

        /**
         * The ID of the new policy.
         */
        public Builder policyGroupId(String policyGroupId) {
            this.policyGroupId = policyGroupId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ClonePolicyGroupResponseBody build() {
            return new ClonePolicyGroupResponseBody(this);
        } 

    } 

}
