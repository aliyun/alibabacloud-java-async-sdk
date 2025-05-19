// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paifeaturestore20230621.models;

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
 * {@link UpdateLLMConfigRequest} extends {@link RequestModel}
 *
 * <p>UpdateLLMConfigRequest</p>
 */
public class UpdateLLMConfigRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("LLMConfigId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String LLMConfigId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ApiKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String apiKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BaseUrl")
    @com.aliyun.core.annotation.Validation(required = true)
    private String baseUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BatchSize")
    private Integer batchSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxTokens")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer maxTokens;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Model")
    @com.aliyun.core.annotation.Validation(required = true)
    private String model;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Rps")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer rps;

    private UpdateLLMConfigRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.LLMConfigId = builder.LLMConfigId;
        this.apiKey = builder.apiKey;
        this.baseUrl = builder.baseUrl;
        this.batchSize = builder.batchSize;
        this.maxTokens = builder.maxTokens;
        this.model = builder.model;
        this.name = builder.name;
        this.rps = builder.rps;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateLLMConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return LLMConfigId
     */
    public String getLLMConfigId() {
        return this.LLMConfigId;
    }

    /**
     * @return apiKey
     */
    public String getApiKey() {
        return this.apiKey;
    }

    /**
     * @return baseUrl
     */
    public String getBaseUrl() {
        return this.baseUrl;
    }

    /**
     * @return batchSize
     */
    public Integer getBatchSize() {
        return this.batchSize;
    }

    /**
     * @return maxTokens
     */
    public Integer getMaxTokens() {
        return this.maxTokens;
    }

    /**
     * @return model
     */
    public String getModel() {
        return this.model;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return rps
     */
    public Integer getRps() {
        return this.rps;
    }

    public static final class Builder extends Request.Builder<UpdateLLMConfigRequest, Builder> {
        private String instanceId; 
        private String regionId; 
        private String LLMConfigId; 
        private String apiKey; 
        private String baseUrl; 
        private Integer batchSize; 
        private Integer maxTokens; 
        private String model; 
        private String name; 
        private Integer rps; 

        private Builder() {
            super();
        } 

        private Builder(UpdateLLMConfigRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
            this.LLMConfigId = request.LLMConfigId;
            this.apiKey = request.apiKey;
            this.baseUrl = request.baseUrl;
            this.batchSize = request.batchSize;
            this.maxTokens = request.maxTokens;
            this.model = request.model;
            this.name = request.name;
            this.rps = request.rps;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>fs-cn-***</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm_config_test1</p>
         */
        public Builder LLMConfigId(String LLMConfigId) {
            this.putPathParameter("LLMConfigId", LLMConfigId);
            this.LLMConfigId = LLMConfigId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>apikey-***</p>
         */
        public Builder apiKey(String apiKey) {
            this.putBodyParameter("ApiKey", apiKey);
            this.apiKey = apiKey;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://dashscope.aliyuncs.com/compatible-mode/v1">https://dashscope.aliyuncs.com/compatible-mode/v1</a></p>
         */
        public Builder baseUrl(String baseUrl) {
            this.putBodyParameter("BaseUrl", baseUrl);
            this.baseUrl = baseUrl;
            return this;
        }

        /**
         * BatchSize.
         */
        public Builder batchSize(Integer batchSize) {
            this.putBodyParameter("BatchSize", batchSize);
            this.batchSize = batchSize;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2048</p>
         */
        public Builder maxTokens(Integer maxTokens) {
            this.putBodyParameter("MaxTokens", maxTokens);
            this.maxTokens = maxTokens;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>text-embedding-v1</p>
         */
        public Builder model(String model) {
            this.putBodyParameter("Model", model);
            this.model = model;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-config1</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder rps(Integer rps) {
            this.putBodyParameter("Rps", rps);
            this.rps = rps;
            return this;
        }

        @Override
        public UpdateLLMConfigRequest build() {
            return new UpdateLLMConfigRequest(this);
        } 

    } 

}
