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
 * {@link UpdateMemoryCollectionInput} extends {@link TeaModel}
 *
 * <p>UpdateMemoryCollectionInput</p>
 */
public class UpdateMemoryCollectionInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("embedderConfig")
    private EmbedderConfig embedderConfig;

    @com.aliyun.core.annotation.NameInMap("enableConversationHistory")
    private Boolean enableConversationHistory;

    @com.aliyun.core.annotation.NameInMap("enableConversationState")
    private Boolean enableConversationState;

    @com.aliyun.core.annotation.NameInMap("executionRoleArn")
    private String executionRoleArn;

    @com.aliyun.core.annotation.NameInMap("llmConfig")
    private LLMConfig llmConfig;

    @com.aliyun.core.annotation.NameInMap("networkConfiguration")
    private NetworkConfiguration networkConfiguration;

    @com.aliyun.core.annotation.NameInMap("vectorStoreConfig")
    private VectorStoreConfig vectorStoreConfig;

    private UpdateMemoryCollectionInput(Builder builder) {
        this.description = builder.description;
        this.embedderConfig = builder.embedderConfig;
        this.enableConversationHistory = builder.enableConversationHistory;
        this.enableConversationState = builder.enableConversationState;
        this.executionRoleArn = builder.executionRoleArn;
        this.llmConfig = builder.llmConfig;
        this.networkConfiguration = builder.networkConfiguration;
        this.vectorStoreConfig = builder.vectorStoreConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateMemoryCollectionInput create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return embedderConfig
     */
    public EmbedderConfig getEmbedderConfig() {
        return this.embedderConfig;
    }

    /**
     * @return enableConversationHistory
     */
    public Boolean getEnableConversationHistory() {
        return this.enableConversationHistory;
    }

    /**
     * @return enableConversationState
     */
    public Boolean getEnableConversationState() {
        return this.enableConversationState;
    }

    /**
     * @return executionRoleArn
     */
    public String getExecutionRoleArn() {
        return this.executionRoleArn;
    }

    /**
     * @return llmConfig
     */
    public LLMConfig getLlmConfig() {
        return this.llmConfig;
    }

    /**
     * @return networkConfiguration
     */
    public NetworkConfiguration getNetworkConfiguration() {
        return this.networkConfiguration;
    }

    /**
     * @return vectorStoreConfig
     */
    public VectorStoreConfig getVectorStoreConfig() {
        return this.vectorStoreConfig;
    }

    public static final class Builder {
        private String description; 
        private EmbedderConfig embedderConfig; 
        private Boolean enableConversationHistory; 
        private Boolean enableConversationState; 
        private String executionRoleArn; 
        private LLMConfig llmConfig; 
        private NetworkConfiguration networkConfiguration; 
        private VectorStoreConfig vectorStoreConfig; 

        private Builder() {
        } 

        private Builder(UpdateMemoryCollectionInput model) {
            this.description = model.description;
            this.embedderConfig = model.embedderConfig;
            this.enableConversationHistory = model.enableConversationHistory;
            this.enableConversationState = model.enableConversationState;
            this.executionRoleArn = model.executionRoleArn;
            this.llmConfig = model.llmConfig;
            this.networkConfiguration = model.networkConfiguration;
            this.vectorStoreConfig = model.vectorStoreConfig;
        } 

        /**
         * description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * embedderConfig.
         */
        public Builder embedderConfig(EmbedderConfig embedderConfig) {
            this.embedderConfig = embedderConfig;
            return this;
        }

        /**
         * enableConversationHistory.
         */
        public Builder enableConversationHistory(Boolean enableConversationHistory) {
            this.enableConversationHistory = enableConversationHistory;
            return this;
        }

        /**
         * enableConversationState.
         */
        public Builder enableConversationState(Boolean enableConversationState) {
            this.enableConversationState = enableConversationState;
            return this;
        }

        /**
         * executionRoleArn.
         */
        public Builder executionRoleArn(String executionRoleArn) {
            this.executionRoleArn = executionRoleArn;
            return this;
        }

        /**
         * llmConfig.
         */
        public Builder llmConfig(LLMConfig llmConfig) {
            this.llmConfig = llmConfig;
            return this;
        }

        /**
         * networkConfiguration.
         */
        public Builder networkConfiguration(NetworkConfiguration networkConfiguration) {
            this.networkConfiguration = networkConfiguration;
            return this;
        }

        /**
         * vectorStoreConfig.
         */
        public Builder vectorStoreConfig(VectorStoreConfig vectorStoreConfig) {
            this.vectorStoreConfig = vectorStoreConfig;
            return this;
        }

        public UpdateMemoryCollectionInput build() {
            return new UpdateMemoryCollectionInput(this);
        } 

    } 

}
