// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetKeyPolicyRequest} extends {@link RequestModel}
 *
 * <p>SetKeyPolicyRequest</p>
 */
public class SetKeyPolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String keyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Policy")
    @com.aliyun.core.annotation.Validation(required = true)
    private String policy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyName")
    private String policyName;

    private SetKeyPolicyRequest(Builder builder) {
        super(builder);
        this.keyId = builder.keyId;
        this.policy = builder.policy;
        this.policyName = builder.policyName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetKeyPolicyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return keyId
     */
    public String getKeyId() {
        return this.keyId;
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

    public static final class Builder extends Request.Builder<SetKeyPolicyRequest, Builder> {
        private String keyId; 
        private String policy; 
        private String policyName; 

        private Builder() {
            super();
        } 

        private Builder(SetKeyPolicyRequest request) {
            super(request);
            this.keyId = request.keyId;
            this.policy = request.policy;
            this.policyName = request.policyName;
        } 

        /**
         * KeyId.
         */
        public Builder keyId(String keyId) {
            this.putQueryParameter("KeyId", keyId);
            this.keyId = keyId;
            return this;
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

        @Override
        public SetKeyPolicyRequest build() {
            return new SetKeyPolicyRequest(this);
        } 

    } 

}
