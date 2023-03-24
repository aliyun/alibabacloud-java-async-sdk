// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePrivateAccessPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>CreatePrivateAccessPolicyResponseBody</p>
 */
public class CreatePrivateAccessPolicyResponseBody extends TeaModel {
    @NameInMap("PolicyId")
    private String policyId;

    @NameInMap("RequestId")
    private String requestId;

    private CreatePrivateAccessPolicyResponseBody(Builder builder) {
        this.policyId = builder.policyId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePrivateAccessPolicyResponseBody create() {
        return builder().build();
    }

    /**
     * @return policyId
     */
    public String getPolicyId() {
        return this.policyId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String policyId; 
        private String requestId; 

        /**
         * PolicyId.
         */
        public Builder policyId(String policyId) {
            this.policyId = policyId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreatePrivateAccessPolicyResponseBody build() {
            return new CreatePrivateAccessPolicyResponseBody(this);
        } 

    } 

}
