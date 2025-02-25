// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetKeyPolicyRequest} extends {@link RequestModel}
 *
 * <p>GetKeyPolicyRequest</p>
 */
public class GetKeyPolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String keyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyName")
    private String policyName;

    private GetKeyPolicyRequest(Builder builder) {
        super(builder);
        this.keyId = builder.keyId;
        this.policyName = builder.policyName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetKeyPolicyRequest create() {
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
     * @return policyName
     */
    public String getPolicyName() {
        return this.policyName;
    }

    public static final class Builder extends Request.Builder<GetKeyPolicyRequest, Builder> {
        private String keyId; 
        private String policyName; 

        private Builder() {
            super();
        } 

        private Builder(GetKeyPolicyRequest request) {
            super(request);
            this.keyId = request.keyId;
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
         * PolicyName.
         */
        public Builder policyName(String policyName) {
            this.putQueryParameter("PolicyName", policyName);
            this.policyName = policyName;
            return this;
        }

        @Override
        public GetKeyPolicyRequest build() {
            return new GetKeyPolicyRequest(this);
        } 

    } 

}
