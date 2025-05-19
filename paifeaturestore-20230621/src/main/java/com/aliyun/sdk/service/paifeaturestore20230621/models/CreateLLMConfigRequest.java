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
 * {@link CreateLLMConfigRequest} extends {@link RequestModel}
 *
 * <p>CreateLLMConfigRequest</p>
 */
public class CreateLLMConfigRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ApiKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String apiKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BaseUrl")
    private String baseUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BatchSize")
    private Integer batchSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxTokens")
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
    private Integer rps;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private CreateLLMConfigRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.apiKey = builder.apiKey;
        this.baseUrl = builder.baseUrl;
        this.batchSize = builder.batchSize;
        this.maxTokens = builder.maxTokens;
        this.model = builder.model;
        this.name = builder.name;
        this.rps = builder.rps;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateLLMConfigRequest create() {
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

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<CreateLLMConfigRequest, Builder> {
        private String instanceId; 
        private String regionId; 
        private String apiKey; 
        private String baseUrl; 
        private Integer batchSize; 
        private Integer maxTokens; 
        private String model; 
        private String name; 
        private Integer rps; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateLLMConfigRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
            this.apiKey = request.apiKey;
            this.baseUrl = request.baseUrl;
            this.batchSize = request.batchSize;
            this.maxTokens = request.maxTokens;
            this.model = request.model;
            this.name = request.name;
            this.rps = request.rps;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>featureStore-cn-test1</p>
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
         * <p>api-xyz</p>
         */
        public Builder apiKey(String apiKey) {
            this.putBodyParameter("ApiKey", apiKey);
            this.apiKey = apiKey;
            return this;
        }

        /**
         * BaseUrl.
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
         * MaxTokens.
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
         * <p>llm_config1</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * Rps.
         */
        public Builder rps(Integer rps) {
            this.putBodyParameter("Rps", rps);
            this.rps = rps;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>234</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public CreateLLMConfigRequest build() {
            return new CreateLLMConfigRequest(this);
        } 

    } 

}
