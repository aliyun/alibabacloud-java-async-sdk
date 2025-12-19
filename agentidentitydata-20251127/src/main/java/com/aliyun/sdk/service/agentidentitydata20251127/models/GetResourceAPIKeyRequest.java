// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentidentitydata20251127.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetResourceAPIKeyRequest} extends {@link RequestModel}
 *
 * <p>GetResourceAPIKeyRequest</p>
 */
public class GetResourceAPIKeyRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceCredentialProviderName")
    private String resourceCredentialProviderName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkloadAccessToken")
    private String workloadAccessToken;

    private GetResourceAPIKeyRequest(Builder builder) {
        super(builder);
        this.resourceCredentialProviderName = builder.resourceCredentialProviderName;
        this.workloadAccessToken = builder.workloadAccessToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetResourceAPIKeyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return resourceCredentialProviderName
     */
    public String getResourceCredentialProviderName() {
        return this.resourceCredentialProviderName;
    }

    /**
     * @return workloadAccessToken
     */
    public String getWorkloadAccessToken() {
        return this.workloadAccessToken;
    }

    public static final class Builder extends Request.Builder<GetResourceAPIKeyRequest, Builder> {
        private String resourceCredentialProviderName; 
        private String workloadAccessToken; 

        private Builder() {
            super();
        } 

        private Builder(GetResourceAPIKeyRequest request) {
            super(request);
            this.resourceCredentialProviderName = request.resourceCredentialProviderName;
            this.workloadAccessToken = request.workloadAccessToken;
        } 

        /**
         * ResourceCredentialProviderName.
         */
        public Builder resourceCredentialProviderName(String resourceCredentialProviderName) {
            this.putBodyParameter("ResourceCredentialProviderName", resourceCredentialProviderName);
            this.resourceCredentialProviderName = resourceCredentialProviderName;
            return this;
        }

        /**
         * WorkloadAccessToken.
         */
        public Builder workloadAccessToken(String workloadAccessToken) {
            this.putBodyParameter("WorkloadAccessToken", workloadAccessToken);
            this.workloadAccessToken = workloadAccessToken;
            return this;
        }

        @Override
        public GetResourceAPIKeyRequest build() {
            return new GetResourceAPIKeyRequest(this);
        } 

    } 

}
