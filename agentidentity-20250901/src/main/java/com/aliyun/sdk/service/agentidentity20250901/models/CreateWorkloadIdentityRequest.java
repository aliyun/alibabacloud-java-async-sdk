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
 * {@link CreateWorkloadIdentityRequest} extends {@link RequestModel}
 *
 * <p>CreateWorkloadIdentityRequest</p>
 */
public class CreateWorkloadIdentityRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AllowedConsentCallbackURLs")
    private java.util.List<String> allowedConsentCallbackURLs;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AllowedResourceOAuth2ReturnURLs")
    private java.util.List<String> allowedResourceOAuth2ReturnURLs;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CreateRAMRole")
    private Boolean createRAMRole;

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
    @com.aliyun.core.annotation.NameInMap("SessionBindingEnabled")
    private Boolean sessionBindingEnabled;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SourceAgentArn")
    private String sourceAgentArn;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SourcePlatform")
    private String sourcePlatform;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkloadIdentityName")
    private String workloadIdentityName;

    private CreateWorkloadIdentityRequest(Builder builder) {
        super(builder);
        this.allowedConsentCallbackURLs = builder.allowedConsentCallbackURLs;
        this.allowedResourceOAuth2ReturnURLs = builder.allowedResourceOAuth2ReturnURLs;
        this.createRAMRole = builder.createRAMRole;
        this.description = builder.description;
        this.identityProviderName = builder.identityProviderName;
        this.roleArn = builder.roleArn;
        this.sessionBindingEnabled = builder.sessionBindingEnabled;
        this.sourceAgentArn = builder.sourceAgentArn;
        this.sourcePlatform = builder.sourcePlatform;
        this.workloadIdentityName = builder.workloadIdentityName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateWorkloadIdentityRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return allowedConsentCallbackURLs
     */
    public java.util.List<String> getAllowedConsentCallbackURLs() {
        return this.allowedConsentCallbackURLs;
    }

    /**
     * @return allowedResourceOAuth2ReturnURLs
     */
    public java.util.List<String> getAllowedResourceOAuth2ReturnURLs() {
        return this.allowedResourceOAuth2ReturnURLs;
    }

    /**
     * @return createRAMRole
     */
    public Boolean getCreateRAMRole() {
        return this.createRAMRole;
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
     * @return sessionBindingEnabled
     */
    public Boolean getSessionBindingEnabled() {
        return this.sessionBindingEnabled;
    }

    /**
     * @return sourceAgentArn
     */
    public String getSourceAgentArn() {
        return this.sourceAgentArn;
    }

    /**
     * @return sourcePlatform
     */
    public String getSourcePlatform() {
        return this.sourcePlatform;
    }

    /**
     * @return workloadIdentityName
     */
    public String getWorkloadIdentityName() {
        return this.workloadIdentityName;
    }

    public static final class Builder extends Request.Builder<CreateWorkloadIdentityRequest, Builder> {
        private java.util.List<String> allowedConsentCallbackURLs; 
        private java.util.List<String> allowedResourceOAuth2ReturnURLs; 
        private Boolean createRAMRole; 
        private String description; 
        private String identityProviderName; 
        private String roleArn; 
        private Boolean sessionBindingEnabled; 
        private String sourceAgentArn; 
        private String sourcePlatform; 
        private String workloadIdentityName; 

        private Builder() {
            super();
        } 

        private Builder(CreateWorkloadIdentityRequest request) {
            super(request);
            this.allowedConsentCallbackURLs = request.allowedConsentCallbackURLs;
            this.allowedResourceOAuth2ReturnURLs = request.allowedResourceOAuth2ReturnURLs;
            this.createRAMRole = request.createRAMRole;
            this.description = request.description;
            this.identityProviderName = request.identityProviderName;
            this.roleArn = request.roleArn;
            this.sessionBindingEnabled = request.sessionBindingEnabled;
            this.sourceAgentArn = request.sourceAgentArn;
            this.sourcePlatform = request.sourcePlatform;
            this.workloadIdentityName = request.workloadIdentityName;
        } 

        /**
         * <p>The allowlist of Consent authorization callback URLs for the workload identity, which constrains the allowed redirect addresses during the offline delegation (OfflineAccess) authorization flow.</p>
         */
        public Builder allowedConsentCallbackURLs(java.util.List<String> allowedConsentCallbackURLs) {
            String allowedConsentCallbackURLsShrink = shrink(allowedConsentCallbackURLs, "AllowedConsentCallbackURLs", "json");
            this.putBodyParameter("AllowedConsentCallbackURLs", allowedConsentCallbackURLsShrink);
            this.allowedConsentCallbackURLs = allowedConsentCallbackURLs;
            return this;
        }

        /**
         * <p>The list of allowed OAuth2 return URLs.</p>
         */
        public Builder allowedResourceOAuth2ReturnURLs(java.util.List<String> allowedResourceOAuth2ReturnURLs) {
            String allowedResourceOAuth2ReturnURLsShrink = shrink(allowedResourceOAuth2ReturnURLs, "AllowedResourceOAuth2ReturnURLs", "json");
            this.putBodyParameter("AllowedResourceOAuth2ReturnURLs", allowedResourceOAuth2ReturnURLsShrink);
            this.allowedResourceOAuth2ReturnURLs = allowedResourceOAuth2ReturnURLs;
            return this;
        }

        /**
         * <p>Specifies whether to automatically create an associated RAM role. When set to true, the system automatically creates a RAM role with the same name as the workload identity.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder createRAMRole(Boolean createRAMRole) {
            this.putBodyParameter("CreateRAMRole", createRAMRole);
            this.createRAMRole = createRAMRole;
            return this;
        }

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>example agent</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The configured identity provider.</p>
         * 
         * <strong>example:</strong>
         * <p>identity-provider-okta</p>
         */
        public Builder identityProviderName(String identityProviderName) {
            this.putBodyParameter("IdentityProviderName", identityProviderName);
            this.identityProviderName = identityProviderName;
            return this;
        }

        /**
         * <p>The ARN of the RAM role.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::123456:role/agent-101-role</p>
         */
        public Builder roleArn(String roleArn) {
            this.putBodyParameter("RoleArn", roleArn);
            this.roleArn = roleArn;
            return this;
        }

        /**
         * <p>Specifies whether to enable session binding. When enabled, each session is bound to a specific workload identity instance.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder sessionBindingEnabled(Boolean sessionBindingEnabled) {
            this.putBodyParameter("SessionBindingEnabled", sessionBindingEnabled);
            this.sessionBindingEnabled = sessionBindingEnabled;
            return this;
        }

        /**
         * <p>The ARN of the source agent.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:agentidentity:cn-beijing:123456:workloadidentity/my-identity</p>
         */
        public Builder sourceAgentArn(String sourceAgentArn) {
            this.putBodyParameter("SourceAgentArn", sourceAgentArn);
            this.sourceAgentArn = sourceAgentArn;
            return this;
        }

        /**
         * <p>The source platform.</p>
         * 
         * <strong>example:</strong>
         * <p>China</p>
         */
        public Builder sourcePlatform(String sourcePlatform) {
            this.putBodyParameter("SourcePlatform", sourcePlatform);
            this.sourcePlatform = sourcePlatform;
            return this;
        }

        /**
         * <p>The unique name of the workload identity.</p>
         * 
         * <strong>example:</strong>
         * <p>agent-101</p>
         */
        public Builder workloadIdentityName(String workloadIdentityName) {
            this.putBodyParameter("WorkloadIdentityName", workloadIdentityName);
            this.workloadIdentityName = workloadIdentityName;
            return this;
        }

        @Override
        public CreateWorkloadIdentityRequest build() {
            return new CreateWorkloadIdentityRequest(this);
        } 

    } 

}
