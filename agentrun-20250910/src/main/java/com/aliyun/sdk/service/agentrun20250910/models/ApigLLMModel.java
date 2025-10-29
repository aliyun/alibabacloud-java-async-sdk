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
 * {@link ApigLLMModel} extends {@link TeaModel}
 *
 * <p>ApigLLMModel</p>
 */
public class ApigLLMModel extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("address")
    private String address;

    @com.aliyun.core.annotation.NameInMap("apiKey")
    private String apiKey;

    @com.aliyun.core.annotation.NameInMap("createdTime")
    private String createdTime;

    @com.aliyun.core.annotation.NameInMap("desc")
    private String desc;

    @com.aliyun.core.annotation.NameInMap("gatewayId")
    private String gatewayId;

    @com.aliyun.core.annotation.NameInMap("modelId")
    private String modelId;

    @com.aliyun.core.annotation.NameInMap("models")
    private String models;

    @com.aliyun.core.annotation.NameInMap("modelsWeight")
    private String modelsWeight;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("provider")
    private String provider;

    @com.aliyun.core.annotation.NameInMap("targetId")
    private String targetId;

    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    @com.aliyun.core.annotation.NameInMap("updateTime")
    private String updateTime;

    private ApigLLMModel(Builder builder) {
        this.address = builder.address;
        this.apiKey = builder.apiKey;
        this.createdTime = builder.createdTime;
        this.desc = builder.desc;
        this.gatewayId = builder.gatewayId;
        this.modelId = builder.modelId;
        this.models = builder.models;
        this.modelsWeight = builder.modelsWeight;
        this.name = builder.name;
        this.provider = builder.provider;
        this.targetId = builder.targetId;
        this.tenantId = builder.tenantId;
        this.type = builder.type;
        this.updateTime = builder.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApigLLMModel create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return address
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * @return apiKey
     */
    public String getApiKey() {
        return this.apiKey;
    }

    /**
     * @return createdTime
     */
    public String getCreatedTime() {
        return this.createdTime;
    }

    /**
     * @return desc
     */
    public String getDesc() {
        return this.desc;
    }

    /**
     * @return gatewayId
     */
    public String getGatewayId() {
        return this.gatewayId;
    }

    /**
     * @return modelId
     */
    public String getModelId() {
        return this.modelId;
    }

    /**
     * @return models
     */
    public String getModels() {
        return this.models;
    }

    /**
     * @return modelsWeight
     */
    public String getModelsWeight() {
        return this.modelsWeight;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return provider
     */
    public String getProvider() {
        return this.provider;
    }

    /**
     * @return targetId
     */
    public String getTargetId() {
        return this.targetId;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return updateTime
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static final class Builder {
        private String address; 
        private String apiKey; 
        private String createdTime; 
        private String desc; 
        private String gatewayId; 
        private String modelId; 
        private String models; 
        private String modelsWeight; 
        private String name; 
        private String provider; 
        private String targetId; 
        private String tenantId; 
        private String type; 
        private String updateTime; 

        private Builder() {
        } 

        private Builder(ApigLLMModel model) {
            this.address = model.address;
            this.apiKey = model.apiKey;
            this.createdTime = model.createdTime;
            this.desc = model.desc;
            this.gatewayId = model.gatewayId;
            this.modelId = model.modelId;
            this.models = model.models;
            this.modelsWeight = model.modelsWeight;
            this.name = model.name;
            this.provider = model.provider;
            this.targetId = model.targetId;
            this.tenantId = model.tenantId;
            this.type = model.type;
            this.updateTime = model.updateTime;
        } 

        /**
         * address.
         */
        public Builder address(String address) {
            this.address = address;
            return this;
        }

        /**
         * apiKey.
         */
        public Builder apiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }

        /**
         * createdTime.
         */
        public Builder createdTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        /**
         * desc.
         */
        public Builder desc(String desc) {
            this.desc = desc;
            return this;
        }

        /**
         * gatewayId.
         */
        public Builder gatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * modelId.
         */
        public Builder modelId(String modelId) {
            this.modelId = modelId;
            return this;
        }

        /**
         * models.
         */
        public Builder models(String models) {
            this.models = models;
            return this;
        }

        /**
         * modelsWeight.
         */
        public Builder modelsWeight(String modelsWeight) {
            this.modelsWeight = modelsWeight;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
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
         * targetId.
         */
        public Builder targetId(String targetId) {
            this.targetId = targetId;
            return this;
        }

        /**
         * tenantId.
         */
        public Builder tenantId(String tenantId) {
            this.tenantId = tenantId;
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
         * updateTime.
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public ApigLLMModel build() {
            return new ApigLLMModel(this);
        } 

    } 

}
