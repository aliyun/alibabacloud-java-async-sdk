// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentrun20250910.models;

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
 * {@link GetCredentialOutput} extends {@link TeaModel}
 *
 * <p>GetCredentialOutput</p>
 */
public class GetCredentialOutput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("createdAt")
    private String createdAt;

    @com.aliyun.core.annotation.NameInMap("credentialAuthType")
    private String credentialAuthType;

    @com.aliyun.core.annotation.NameInMap("credentialId")
    private String credentialId;

    @com.aliyun.core.annotation.NameInMap("credentialName")
    private String credentialName;

    @com.aliyun.core.annotation.NameInMap("credentialPublicConfig")
    private java.util.Map<String, String> credentialPublicConfig;

    @com.aliyun.core.annotation.NameInMap("credentialSecret")
    private String credentialSecret;

    @com.aliyun.core.annotation.NameInMap("credentialSourceType")
    private String credentialSourceType;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("enabled")
    private Boolean enabled;

    @com.aliyun.core.annotation.NameInMap("relatedResources")
    private java.util.List<RelatedResource> relatedResources;

    @com.aliyun.core.annotation.NameInMap("updatedAt")
    private String updatedAt;

    private GetCredentialOutput(Builder builder) {
        this.createdAt = builder.createdAt;
        this.credentialAuthType = builder.credentialAuthType;
        this.credentialId = builder.credentialId;
        this.credentialName = builder.credentialName;
        this.credentialPublicConfig = builder.credentialPublicConfig;
        this.credentialSecret = builder.credentialSecret;
        this.credentialSourceType = builder.credentialSourceType;
        this.description = builder.description;
        this.enabled = builder.enabled;
        this.relatedResources = builder.relatedResources;
        this.updatedAt = builder.updatedAt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCredentialOutput create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createdAt
     */
    public String getCreatedAt() {
        return this.createdAt;
    }

    /**
     * @return credentialAuthType
     */
    public String getCredentialAuthType() {
        return this.credentialAuthType;
    }

    /**
     * @return credentialId
     */
    public String getCredentialId() {
        return this.credentialId;
    }

    /**
     * @return credentialName
     */
    public String getCredentialName() {
        return this.credentialName;
    }

    /**
     * @return credentialPublicConfig
     */
    public java.util.Map<String, String> getCredentialPublicConfig() {
        return this.credentialPublicConfig;
    }

    /**
     * @return credentialSecret
     */
    public String getCredentialSecret() {
        return this.credentialSecret;
    }

    /**
     * @return credentialSourceType
     */
    public String getCredentialSourceType() {
        return this.credentialSourceType;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return enabled
     */
    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * @return relatedResources
     */
    public java.util.List<RelatedResource> getRelatedResources() {
        return this.relatedResources;
    }

    /**
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public static final class Builder {
        private String createdAt; 
        private String credentialAuthType; 
        private String credentialId; 
        private String credentialName; 
        private java.util.Map<String, String> credentialPublicConfig; 
        private String credentialSecret; 
        private String credentialSourceType; 
        private String description; 
        private Boolean enabled; 
        private java.util.List<RelatedResource> relatedResources; 
        private String updatedAt; 

        private Builder() {
        } 

        private Builder(GetCredentialOutput model) {
            this.createdAt = model.createdAt;
            this.credentialAuthType = model.credentialAuthType;
            this.credentialId = model.credentialId;
            this.credentialName = model.credentialName;
            this.credentialPublicConfig = model.credentialPublicConfig;
            this.credentialSecret = model.credentialSecret;
            this.credentialSourceType = model.credentialSourceType;
            this.description = model.description;
            this.enabled = model.enabled;
            this.relatedResources = model.relatedResources;
            this.updatedAt = model.updatedAt;
        } 

        /**
         * createdAt.
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * credentialAuthType.
         */
        public Builder credentialAuthType(String credentialAuthType) {
            this.credentialAuthType = credentialAuthType;
            return this;
        }

        /**
         * credentialId.
         */
        public Builder credentialId(String credentialId) {
            this.credentialId = credentialId;
            return this;
        }

        /**
         * credentialName.
         */
        public Builder credentialName(String credentialName) {
            this.credentialName = credentialName;
            return this;
        }

        /**
         * credentialPublicConfig.
         */
        public Builder credentialPublicConfig(java.util.Map<String, String> credentialPublicConfig) {
            this.credentialPublicConfig = credentialPublicConfig;
            return this;
        }

        /**
         * credentialSecret.
         */
        public Builder credentialSecret(String credentialSecret) {
            this.credentialSecret = credentialSecret;
            return this;
        }

        /**
         * credentialSourceType.
         */
        public Builder credentialSourceType(String credentialSourceType) {
            this.credentialSourceType = credentialSourceType;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * enabled.
         */
        public Builder enabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * relatedResources.
         */
        public Builder relatedResources(java.util.List<RelatedResource> relatedResources) {
            this.relatedResources = relatedResources;
            return this;
        }

        /**
         * updatedAt.
         */
        public Builder updatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public GetCredentialOutput build() {
            return new GetCredentialOutput(this);
        } 

    } 

}
