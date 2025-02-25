// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSecretPolicyRequest} extends {@link RequestModel}
 *
 * <p>GetSecretPolicyRequest</p>
 */
public class GetSecretPolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyName")
    private String policyName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecretName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String secretName;

    private GetSecretPolicyRequest(Builder builder) {
        super(builder);
        this.policyName = builder.policyName;
        this.secretName = builder.secretName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSecretPolicyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<GetSecretPolicyRequest, Builder> {
        private String policyName; 
        private String secretName; 

        private Builder() {
            super();
        } 

        private Builder(GetSecretPolicyRequest request) {
            super(request);
            this.policyName = request.policyName;
            this.secretName = request.secretName;
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
        public GetSecretPolicyRequest build() {
            return new GetSecretPolicyRequest(this);
        } 

    } 

}
