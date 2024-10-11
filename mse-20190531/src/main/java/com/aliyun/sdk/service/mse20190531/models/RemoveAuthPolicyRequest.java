// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RemoveAuthPolicyRequest} extends {@link RequestModel}
 *
 * <p>RemoveAuthPolicyRequest</p>
 */
public class RemoveAuthPolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String policyId;

    private RemoveAuthPolicyRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.policyId = builder.policyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveAuthPolicyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * @return policyId
     */
    public String getPolicyId() {
        return this.policyId;
    }

    public static final class Builder extends Request.Builder<RemoveAuthPolicyRequest, Builder> {
        private String acceptLanguage; 
        private String policyId; 

        private Builder() {
            super();
        } 

        private Builder(RemoveAuthPolicyRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.policyId = request.policyId;
        } 

        /**
         * AcceptLanguage.
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>259</p>
         */
        public Builder policyId(String policyId) {
            this.putQueryParameter("PolicyId", policyId);
            this.policyId = policyId;
            return this;
        }

        @Override
        public RemoveAuthPolicyRequest build() {
            return new RemoveAuthPolicyRequest(this);
        } 

    } 

}
