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
 * {@link MemoryCollection} extends {@link TeaModel}
 *
 * <p>MemoryCollection</p>
 */
public class MemoryCollection extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("createdAt")
    private String createdAt;

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

    @com.aliyun.core.annotation.NameInMap("lastUpdatedAt")
    private String lastUpdatedAt;

    @com.aliyun.core.annotation.NameInMap("llmConfig")
    private LLMConfig llmConfig;

    @com.aliyun.core.annotation.NameInMap("memoryCollectionId")
    private String memoryCollectionId;

    @com.aliyun.core.annotation.NameInMap("memoryCollectionName")
    private String memoryCollectionName;

    @com.aliyun.core.annotation.NameInMap("networkConfiguration")
    private NetworkConfiguration networkConfiguration;

    @com.aliyun.core.annotation.NameInMap("vectorStoreConfig")
    private VectorStoreConfig vectorStoreConfig;

    private MemoryCollection(Builder builder) {
        this.createdAt = builder.createdAt;
        this.description = builder.description;
        this.embedderConfig = builder.embedderConfig;
        this.enableConversationHistory = builder.enableConversationHistory;
        this.enableConversationState = builder.enableConversationState;
        this.executionRoleArn = builder.executionRoleArn;
        this.lastUpdatedAt = builder.lastUpdatedAt;
        this.llmConfig = builder.llmConfig;
        this.memoryCollectionId = builder.memoryCollectionId;
        this.memoryCollectionName = builder.memoryCollectionName;
        this.networkConfiguration = builder.networkConfiguration;
        this.vectorStoreConfig = builder.vectorStoreConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MemoryCollection create() {
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
     * @return lastUpdatedAt
     */
    public String getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    /**
     * @return llmConfig
     */
    public LLMConfig getLlmConfig() {
        return this.llmConfig;
    }

    /**
     * @return memoryCollectionId
     */
    public String getMemoryCollectionId() {
        return this.memoryCollectionId;
    }

    /**
     * @return memoryCollectionName
     */
    public String getMemoryCollectionName() {
        return this.memoryCollectionName;
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
        private String createdAt; 
        private String description; 
        private EmbedderConfig embedderConfig; 
        private Boolean enableConversationHistory; 
        private Boolean enableConversationState; 
        private String executionRoleArn; 
        private String lastUpdatedAt; 
        private LLMConfig llmConfig; 
        private String memoryCollectionId; 
        private String memoryCollectionName; 
        private NetworkConfiguration networkConfiguration; 
        private VectorStoreConfig vectorStoreConfig; 

        private Builder() {
        } 

        private Builder(MemoryCollection model) {
            this.createdAt = model.createdAt;
            this.description = model.description;
            this.embedderConfig = model.embedderConfig;
            this.enableConversationHistory = model.enableConversationHistory;
            this.enableConversationState = model.enableConversationState;
            this.executionRoleArn = model.executionRoleArn;
            this.lastUpdatedAt = model.lastUpdatedAt;
            this.llmConfig = model.llmConfig;
            this.memoryCollectionId = model.memoryCollectionId;
            this.memoryCollectionName = model.memoryCollectionName;
            this.networkConfiguration = model.networkConfiguration;
            this.vectorStoreConfig = model.vectorStoreConfig;
        } 

        /**
         * createdAt.
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
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
         * lastUpdatedAt.
         */
        public Builder lastUpdatedAt(String lastUpdatedAt) {
            this.lastUpdatedAt = lastUpdatedAt;
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
         * memoryCollectionId.
         */
        public Builder memoryCollectionId(String memoryCollectionId) {
            this.memoryCollectionId = memoryCollectionId;
            return this;
        }

        /**
         * memoryCollectionName.
         */
        public Builder memoryCollectionName(String memoryCollectionName) {
            this.memoryCollectionName = memoryCollectionName;
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

        public MemoryCollection build() {
            return new MemoryCollection(this);
        } 

    } 

}
