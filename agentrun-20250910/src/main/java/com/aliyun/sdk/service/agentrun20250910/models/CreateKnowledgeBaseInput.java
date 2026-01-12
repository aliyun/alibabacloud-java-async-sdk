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
 * {@link CreateKnowledgeBaseInput} extends {@link TeaModel}
 *
 * <p>CreateKnowledgeBaseInput</p>
 */
public class CreateKnowledgeBaseInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("credentialName")
    private String credentialName;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("knowledgeBaseName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String knowledgeBaseName;

    @com.aliyun.core.annotation.NameInMap("provider")
    @com.aliyun.core.annotation.Validation(required = true)
    private String provider;

    @com.aliyun.core.annotation.NameInMap("providerSettings")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.Map<String, ?> providerSettings;

    @com.aliyun.core.annotation.NameInMap("retrieveSettings")
    private java.util.Map<String, ?> retrieveSettings;

    private CreateKnowledgeBaseInput(Builder builder) {
        this.credentialName = builder.credentialName;
        this.description = builder.description;
        this.knowledgeBaseName = builder.knowledgeBaseName;
        this.provider = builder.provider;
        this.providerSettings = builder.providerSettings;
        this.retrieveSettings = builder.retrieveSettings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateKnowledgeBaseInput create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return knowledgeBaseName
     */
    public String getKnowledgeBaseName() {
        return this.knowledgeBaseName;
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
        private String credentialName; 
        private String description; 
        private String knowledgeBaseName; 
        private String provider; 
        private java.util.Map<String, ?> providerSettings; 
        private java.util.Map<String, ?> retrieveSettings; 

        private Builder() {
        } 

        private Builder(CreateKnowledgeBaseInput model) {
            this.credentialName = model.credentialName;
            this.description = model.description;
            this.knowledgeBaseName = model.knowledgeBaseName;
            this.provider = model.provider;
            this.providerSettings = model.providerSettings;
            this.retrieveSettings = model.retrieveSettings;
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
         * <p>This parameter is required.</p>
         */
        public Builder knowledgeBaseName(String knowledgeBaseName) {
            this.knowledgeBaseName = knowledgeBaseName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder provider(String provider) {
            this.provider = provider;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
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

        public CreateKnowledgeBaseInput build() {
            return new CreateKnowledgeBaseInput(this);
        } 

    } 

}
