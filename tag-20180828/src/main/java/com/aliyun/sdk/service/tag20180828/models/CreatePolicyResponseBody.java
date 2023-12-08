// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tag20180828.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePolicyResponseBody} extends {@link TeaModel}
 *
 * <p>CreatePolicyResponseBody</p>
 */
public class CreatePolicyResponseBody extends TeaModel {
    @NameInMap("PolicyId")
    private String policyId;

    @NameInMap("PolicyName")
    private String policyName;

    @NameInMap("RequestId")
    private String requestId;

    private CreatePolicyResponseBody(Builder builder) {
        this.policyId = builder.policyId;
        this.policyName = builder.policyName;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePolicyResponseBody create() {
        return builder().build();
    }

    /**
     * @return policyId
     */
    public String getPolicyId() {
        return this.policyId;
    }

    /**
     * @return policyName
     */
    public String getPolicyName() {
        return this.policyName;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String policyId; 
        private String policyName; 
        private String requestId; 

        /**
         * The ID of the tag policy.
         */
        public Builder policyId(String policyId) {
            this.policyId = policyId;
            return this;
        }

        /**
         * PolicyName.
         */
        public Builder policyName(String policyName) {
            this.policyName = policyName;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreatePolicyResponseBody build() {
            return new CreatePolicyResponseBody(this);
        } 

    } 

}
