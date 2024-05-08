// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetSecretPolicyRequest} extends {@link RequestModel}
 *
 * <p>SetSecretPolicyRequest</p>
 */
public class SetSecretPolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Policy")
    @com.aliyun.core.annotation.Validation(required = true)
    private String policy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyName")
    private String policyName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecretName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String secretName;

    private SetSecretPolicyRequest(Builder builder) {
        super(builder);
        this.policy = builder.policy;
        this.policyName = builder.policyName;
        this.secretName = builder.secretName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetSecretPolicyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return policy
     */
    public String getPolicy() {
        return this.policy;
    }

    /**
     * @return policyName
     */
    public String getPolicyName() {
        return this.policyName;
    }

    /**
     * @return secretName
     */
    public String getSecretName() {
        return this.secretName;
    }

    public static final class Builder extends Request.Builder<SetSecretPolicyRequest, Builder> {
        private String policy; 
        private String policyName; 
        private String secretName; 

        private Builder() {
            super();
        } 

        private Builder(SetSecretPolicyRequest request) {
            super(request);
            this.policy = request.policy;
            this.policyName = request.policyName;
            this.secretName = request.secretName;
        } 

        /**
         * Policy.
         */
        public Builder policy(String policy) {
            this.putQueryParameter("Policy", policy);
            this.policy = policy;
            return this;
        }

        /**
         * PolicyName.
         */
        public Builder policyName(String policyName) {
            this.putQueryParameter("PolicyName", policyName);
            this.policyName = policyName;
            return this;
        }

        /**
         * SecretName.
         */
        public Builder secretName(String secretName) {
            this.putQueryParameter("SecretName", secretName);
            this.secretName = secretName;
            return this;
        }

        @Override
        public SetSecretPolicyRequest build() {
            return new SetSecretPolicyRequest(this);
        } 

    } 

}
