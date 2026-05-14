// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hologram20220601.models;

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
 * {@link CreateModelServiceRequest} extends {@link RequestModel}
 *
 * <p>CreateModelServiceRequest</p>
 */
public class CreateModelServiceRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("apiKey")
    private String apiKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("cpu")
    private Long cpu;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("gpu")
    private Long gpu;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("gpuMemory")
    private Long gpuMemory;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("memory")
    private Long memory;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("modelParams")
    private String modelParams;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("modelServiceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String modelServiceName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("modelType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String modelType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("provider")
    private String provider;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("serviceCount")
    private Long serviceCount;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("taskType")
    private String taskType;

    private CreateModelServiceRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.apiKey = builder.apiKey;
        this.cpu = builder.cpu;
        this.gpu = builder.gpu;
        this.gpuMemory = builder.gpuMemory;
        this.memory = builder.memory;
        this.modelParams = builder.modelParams;
        this.modelServiceName = builder.modelServiceName;
        this.modelType = builder.modelType;
        this.provider = builder.provider;
        this.serviceCount = builder.serviceCount;
        this.taskType = builder.taskType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateModelServiceRequest create() {
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
     * @return apiKey
     */
    public String getApiKey() {
        return this.apiKey;
    }

    /**
     * @return cpu
     */
    public Long getCpu() {
        return this.cpu;
    }

    /**
     * @return gpu
     */
    public Long getGpu() {
        return this.gpu;
    }

    /**
     * @return gpuMemory
     */
    public Long getGpuMemory() {
        return this.gpuMemory;
    }

    /**
     * @return memory
     */
    public Long getMemory() {
        return this.memory;
    }

    /**
     * @return modelParams
     */
    public String getModelParams() {
        return this.modelParams;
    }

    /**
     * @return modelServiceName
     */
    public String getModelServiceName() {
        return this.modelServiceName;
    }

    /**
     * @return modelType
     */
    public String getModelType() {
        return this.modelType;
    }

    /**
     * @return provider
     */
    public String getProvider() {
        return this.provider;
    }

    /**
     * @return serviceCount
     */
    public Long getServiceCount() {
        return this.serviceCount;
    }

    /**
     * @return taskType
     */
    public String getTaskType() {
        return this.taskType;
    }

    public static final class Builder extends Request.Builder<CreateModelServiceRequest, Builder> {
        private String instanceId; 
        private String apiKey; 
        private Long cpu; 
        private Long gpu; 
        private Long gpuMemory; 
        private Long memory; 
        private String modelParams; 
        private String modelServiceName; 
        private String modelType; 
        private String provider; 
        private Long serviceCount; 
        private String taskType; 

        private Builder() {
            super();
        } 

        private Builder(CreateModelServiceRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.apiKey = request.apiKey;
            this.cpu = request.cpu;
            this.gpu = request.gpu;
            this.gpuMemory = request.gpuMemory;
            this.memory = request.memory;
            this.modelParams = request.modelParams;
            this.modelServiceName = request.modelServiceName;
            this.modelType = request.modelType;
            this.provider = request.provider;
            this.serviceCount = request.serviceCount;
            this.taskType = request.taskType;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>hgpostcn-cn-lbj335xxxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * apiKey.
         */
        public Builder apiKey(String apiKey) {
            this.putBodyParameter("apiKey", apiKey);
            this.apiKey = apiKey;
            return this;
        }

        /**
         * cpu.
         */
        public Builder cpu(Long cpu) {
            this.putBodyParameter("cpu", cpu);
            this.cpu = cpu;
            return this;
        }

        /**
         * gpu.
         */
        public Builder gpu(Long gpu) {
            this.putBodyParameter("gpu", gpu);
            this.gpu = gpu;
            return this;
        }

        /**
         * gpuMemory.
         */
        public Builder gpuMemory(Long gpuMemory) {
            this.putBodyParameter("gpuMemory", gpuMemory);
            this.gpuMemory = gpuMemory;
            return this;
        }

        /**
         * memory.
         */
        public Builder memory(Long memory) {
            this.putBodyParameter("memory", memory);
            this.memory = memory;
            return this;
        }

        /**
         * modelParams.
         */
        public Builder modelParams(String modelParams) {
            this.putBodyParameter("modelParams", modelParams);
            this.modelParams = modelParams;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my_model</p>
         */
        public Builder modelServiceName(String modelServiceName) {
            this.putBodyParameter("modelServiceName", modelServiceName);
            this.modelServiceName = modelServiceName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen3.5-plus</p>
         */
        public Builder modelType(String modelType) {
            this.putBodyParameter("modelType", modelType);
            this.modelType = modelType;
            return this;
        }

        /**
         * provider.
         */
        public Builder provider(String provider) {
            this.putBodyParameter("provider", provider);
            this.provider = provider;
            return this;
        }

        /**
         * serviceCount.
         */
        public Builder serviceCount(Long serviceCount) {
            this.putBodyParameter("serviceCount", serviceCount);
            this.serviceCount = serviceCount;
            return this;
        }

        /**
         * taskType.
         */
        public Builder taskType(String taskType) {
            this.putBodyParameter("taskType", taskType);
            this.taskType = taskType;
            return this;
        }

        @Override
        public CreateModelServiceRequest build() {
            return new CreateModelServiceRequest(this);
        } 

    } 

}
