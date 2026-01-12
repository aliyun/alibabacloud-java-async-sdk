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
 * {@link CreateMemoryCollectionInput} extends {@link TeaModel}
 *
 * <p>CreateMemoryCollectionInput</p>
 */
public class CreateMemoryCollectionInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("embedderConfig")
    private EmbedderConfig embedderConfig;

    @com.aliyun.core.annotation.NameInMap("executionRoleArn")
    private String executionRoleArn;

    @com.aliyun.core.annotation.NameInMap("llmConfig")
    private LLMConfig llmConfig;

    @com.aliyun.core.annotation.NameInMap("memoryCollectionName")
    private String memoryCollectionName;

    @com.aliyun.core.annotation.NameInMap("networkConfiguration")
    private NetworkConfiguration networkConfiguration;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    @com.aliyun.core.annotation.NameInMap("vectorStoreConfig")
    private VectorStoreConfig vectorStoreConfig;

    private CreateMemoryCollectionInput(Builder builder) {
        this.description = builder.description;
        this.embedderConfig = builder.embedderConfig;
        this.executionRoleArn = builder.executionRoleArn;
        this.llmConfig = builder.llmConfig;
        this.memoryCollectionName = builder.memoryCollectionName;
        this.networkConfiguration = builder.networkConfiguration;
        this.type = builder.type;
        this.vectorStoreConfig = builder.vectorStoreConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMemoryCollectionInput create() {
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
     * @return type
     */
    public String getType() {
        return this.type;
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
        private String executionRoleArn; 
        private LLMConfig llmConfig; 
        private String memoryCollectionName; 
        private NetworkConfiguration networkConfiguration; 
        private String type; 
        private VectorStoreConfig vectorStoreConfig; 

        private Builder() {
        } 

        private Builder(CreateMemoryCollectionInput model) {
            this.description = model.description;
            this.embedderConfig = model.embedderConfig;
            this.executionRoleArn = model.executionRoleArn;
            this.llmConfig = model.llmConfig;
            this.memoryCollectionName = model.memoryCollectionName;
            this.networkConfiguration = model.networkConfiguration;
            this.type = model.type;
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
         * type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * vectorStoreConfig.
         */
        public Builder vectorStoreConfig(VectorStoreConfig vectorStoreConfig) {
            this.vectorStoreConfig = vectorStoreConfig;
            return this;
        }

        public CreateMemoryCollectionInput build() {
            return new CreateMemoryCollectionInput(this);
        } 

    } 

}
