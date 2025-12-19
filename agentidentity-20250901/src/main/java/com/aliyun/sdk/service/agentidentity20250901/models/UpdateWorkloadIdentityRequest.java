// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentidentity20250901.models;

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
 * {@link UpdateWorkloadIdentityRequest} extends {@link RequestModel}
 *
 * <p>UpdateWorkloadIdentityRequest</p>
 */
public class UpdateWorkloadIdentityRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AllowedResourceOAuth2ReturnURLs")
    private java.util.List<String> allowedResourceOAuth2ReturnURLs;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IdentityProviderName")
    private String identityProviderName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleArn")
    private String roleArn;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkloadIdentityName")
    private String workloadIdentityName;

    private UpdateWorkloadIdentityRequest(Builder builder) {
        super(builder);
        this.allowedResourceOAuth2ReturnURLs = builder.allowedResourceOAuth2ReturnURLs;
        this.description = builder.description;
        this.identityProviderName = builder.identityProviderName;
        this.roleArn = builder.roleArn;
        this.workloadIdentityName = builder.workloadIdentityName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateWorkloadIdentityRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return allowedResourceOAuth2ReturnURLs
     */
    public java.util.List<String> getAllowedResourceOAuth2ReturnURLs() {
        return this.allowedResourceOAuth2ReturnURLs;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return identityProviderName
     */
    public String getIdentityProviderName() {
        return this.identityProviderName;
    }

    /**
     * @return roleArn
     */
    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * @return workloadIdentityName
     */
    public String getWorkloadIdentityName() {
        return this.workloadIdentityName;
    }

    public static final class Builder extends Request.Builder<UpdateWorkloadIdentityRequest, Builder> {
        private java.util.List<String> allowedResourceOAuth2ReturnURLs; 
        private String description; 
        private String identityProviderName; 
        private String roleArn; 
        private String workloadIdentityName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateWorkloadIdentityRequest request) {
            super(request);
            this.allowedResourceOAuth2ReturnURLs = request.allowedResourceOAuth2ReturnURLs;
            this.description = request.description;
            this.identityProviderName = request.identityProviderName;
            this.roleArn = request.roleArn;
            this.workloadIdentityName = request.workloadIdentityName;
        } 

        /**
         * AllowedResourceOAuth2ReturnURLs.
         */
        public Builder allowedResourceOAuth2ReturnURLs(java.util.List<String> allowedResourceOAuth2ReturnURLs) {
            String allowedResourceOAuth2ReturnURLsShrink = shrink(allowedResourceOAuth2ReturnURLs, "AllowedResourceOAuth2ReturnURLs", "json");
            this.putBodyParameter("AllowedResourceOAuth2ReturnURLs", allowedResourceOAuth2ReturnURLsShrink);
            this.allowedResourceOAuth2ReturnURLs = allowedResourceOAuth2ReturnURLs;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * IdentityProviderName.
         */
        public Builder identityProviderName(String identityProviderName) {
            this.putBodyParameter("IdentityProviderName", identityProviderName);
            this.identityProviderName = identityProviderName;
            return this;
        }

        /**
         * RoleArn.
         */
        public Builder roleArn(String roleArn) {
            this.putBodyParameter("RoleArn", roleArn);
            this.roleArn = roleArn;
            return this;
        }

        /**
         * WorkloadIdentityName.
         */
        public Builder workloadIdentityName(String workloadIdentityName) {
            this.putBodyParameter("WorkloadIdentityName", workloadIdentityName);
            this.workloadIdentityName = workloadIdentityName;
            return this;
        }

        @Override
        public UpdateWorkloadIdentityRequest build() {
            return new UpdateWorkloadIdentityRequest(this);
        } 

    } 

}
