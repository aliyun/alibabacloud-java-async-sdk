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
 * {@link KnowledgeBase} extends {@link TeaModel}
 *
 * <p>KnowledgeBase</p>
 */
public class KnowledgeBase extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("createdAt")
    private String createdAt;

    @com.aliyun.core.annotation.NameInMap("credentialName")
    private String credentialName;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("knowledgeBaseId")
    private String knowledgeBaseId;

    @com.aliyun.core.annotation.NameInMap("knowledgeBaseName")
    private String knowledgeBaseName;

    @com.aliyun.core.annotation.NameInMap("lastUpdatedAt")
    private String lastUpdatedAt;

    @com.aliyun.core.annotation.NameInMap("provider")
    private String provider;

    @com.aliyun.core.annotation.NameInMap("providerSettings")
    private java.util.Map<String, ?> providerSettings;

    @com.aliyun.core.annotation.NameInMap("retrieveSettings")
    private java.util.Map<String, ?> retrieveSettings;

    private KnowledgeBase(Builder builder) {
        this.createdAt = builder.createdAt;
        this.credentialName = builder.credentialName;
        this.description = builder.description;
        this.knowledgeBaseId = builder.knowledgeBaseId;
        this.knowledgeBaseName = builder.knowledgeBaseName;
        this.lastUpdatedAt = builder.lastUpdatedAt;
        this.provider = builder.provider;
        this.providerSettings = builder.providerSettings;
        this.retrieveSettings = builder.retrieveSettings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static KnowledgeBase create() {
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
     * @return credentialName
     */
    public String getCredentialName() {
        return this.credentialName;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return knowledgeBaseId
     */
    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    /**
     * @return knowledgeBaseName
     */
    public String getKnowledgeBaseName() {
        return this.knowledgeBaseName;
    }

    /**
     * @return lastUpdatedAt
     */
    public String getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    /**
     * @return provider
     */
    public String getProvider() {
        return this.provider;
    }

    /**
     * @return providerSettings
     */
    public java.util.Map<String, ?> getProviderSettings() {
        return this.providerSettings;
    }

    /**
     * @return retrieveSettings
     */
    public java.util.Map<String, ?> getRetrieveSettings() {
        return this.retrieveSettings;
    }

    public static final class Builder {
        private String createdAt; 
        private String credentialName; 
        private String description; 
        private String knowledgeBaseId; 
        private String knowledgeBaseName; 
        private String lastUpdatedAt; 
        private String provider; 
        private java.util.Map<String, ?> providerSettings; 
        private java.util.Map<String, ?> retrieveSettings; 

        private Builder() {
        } 

        private Builder(KnowledgeBase model) {
            this.createdAt = model.createdAt;
            this.credentialName = model.credentialName;
            this.description = model.description;
            this.knowledgeBaseId = model.knowledgeBaseId;
            this.knowledgeBaseName = model.knowledgeBaseName;
            this.lastUpdatedAt = model.lastUpdatedAt;
            this.provider = model.provider;
            this.providerSettings = model.providerSettings;
            this.retrieveSettings = model.retrieveSettings;
        } 

        /**
         * createdAt.
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
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
         * description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * knowledgeBaseId.
         */
        public Builder knowledgeBaseId(String knowledgeBaseId) {
            this.knowledgeBaseId = knowledgeBaseId;
            return this;
        }

        /**
         * knowledgeBaseName.
         */
        public Builder knowledgeBaseName(String knowledgeBaseName) {
            this.knowledgeBaseName = knowledgeBaseName;
            return this;
        }

        /**
         * lastUpdatedAt.
         */
        public Builder lastUpdatedAt(String lastUpdatedAt) {
            this.lastUpdatedAt = lastUpdatedAt;
            return this;
        }

        /**
         * provider.
         */
        public Builder provider(String provider) {
            this.provider = provider;
            return this;
        }

        /**
         * providerSettings.
         */
        public Builder providerSettings(java.util.Map<String, ?> providerSettings) {
            this.providerSettings = providerSettings;
            return this;
        }

        /**
         * retrieveSettings.
         */
        public Builder retrieveSettings(java.util.Map<String, ?> retrieveSettings) {
            this.retrieveSettings = retrieveSettings;
            return this;
        }

        public KnowledgeBase build() {
            return new KnowledgeBase(this);
        } 

    } 

}
