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
 * {@link UpdateKnowledgeBaseInput} extends {@link TeaModel}
 *
 * <p>UpdateKnowledgeBaseInput</p>
 */
public class UpdateKnowledgeBaseInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("credentialName")
    private String credentialName;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("providerSettings")
    private java.util.Map<String, ?> providerSettings;

    @com.aliyun.core.annotation.NameInMap("retrieveSettings")
    private java.util.Map<String, ?> retrieveSettings;

    private UpdateKnowledgeBaseInput(Builder builder) {
        this.credentialName = builder.credentialName;
        this.description = builder.description;
        this.providerSettings = builder.providerSettings;
        this.retrieveSettings = builder.retrieveSettings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateKnowledgeBaseInput create() {
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
        private java.util.Map<String, ?> providerSettings; 
        private java.util.Map<String, ?> retrieveSettings; 

        private Builder() {
        } 

        private Builder(UpdateKnowledgeBaseInput model) {
            this.credentialName = model.credentialName;
            this.description = model.description;
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

        public UpdateKnowledgeBaseInput build() {
            return new UpdateKnowledgeBaseInput(this);
        } 

    } 

}
