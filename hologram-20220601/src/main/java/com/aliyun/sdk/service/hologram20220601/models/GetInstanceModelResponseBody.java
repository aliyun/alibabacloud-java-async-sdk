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
 * {@link GetInstanceModelResponseBody} extends {@link TeaModel}
 *
 * <p>GetInstanceModelResponseBody</p>
 */
public class GetInstanceModelResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("aiInstanceId")
    private String aiInstanceId;

    @com.aliyun.core.annotation.NameInMap("autoRenewal")
    private Boolean autoRenewal;

    @com.aliyun.core.annotation.NameInMap("chargeType")
    private String chargeType;

    @com.aliyun.core.annotation.NameInMap("commodityCode")
    private String commodityCode;

    @com.aliyun.core.annotation.NameInMap("cpu")
    private Long cpu;

    @com.aliyun.core.annotation.NameInMap("cpuUsed")
    private Long cpuUsed;

    @com.aliyun.core.annotation.NameInMap("expirationTime")
    private String expirationTime;

    @com.aliyun.core.annotation.NameInMap("gpu")
    private Long gpu;

    @com.aliyun.core.annotation.NameInMap("gpuMemory")
    private Long gpuMemory;

    @com.aliyun.core.annotation.NameInMap("gpuMemoryUsed")
    private Long gpuMemoryUsed;

    @com.aliyun.core.annotation.NameInMap("gpuUsed")
    private Long gpuUsed;

    @com.aliyun.core.annotation.NameInMap("memory")
    private Long memory;

    @com.aliyun.core.annotation.NameInMap("memoryUsed")
    private Long memoryUsed;

    @com.aliyun.core.annotation.NameInMap("modelServiceList")
    private java.util.List<ModelServiceList> modelServiceList;

    @com.aliyun.core.annotation.NameInMap("nodeCount")
    private Long nodeCount;

    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("resourceType")
    private String resourceType;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    private GetInstanceModelResponseBody(Builder builder) {
        this.aiInstanceId = builder.aiInstanceId;
        this.autoRenewal = builder.autoRenewal;
        this.chargeType = builder.chargeType;
        this.commodityCode = builder.commodityCode;
        this.cpu = builder.cpu;
        this.cpuUsed = builder.cpuUsed;
        this.expirationTime = builder.expirationTime;
        this.gpu = builder.gpu;
        this.gpuMemory = builder.gpuMemory;
        this.gpuMemoryUsed = builder.gpuMemoryUsed;
        this.gpuUsed = builder.gpuUsed;
        this.memory = builder.memory;
        this.memoryUsed = builder.memoryUsed;
        this.modelServiceList = builder.modelServiceList;
        this.nodeCount = builder.nodeCount;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.resourceType = builder.resourceType;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceModelResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aiInstanceId
     */
    public String getAiInstanceId() {
        return this.aiInstanceId;
    }

    /**
     * @return autoRenewal
     */
    public Boolean getAutoRenewal() {
        return this.autoRenewal;
    }

    /**
     * @return chargeType
     */
    public String getChargeType() {
        return this.chargeType;
    }

    /**
     * @return commodityCode
     */
    public String getCommodityCode() {
        return this.commodityCode;
    }

    /**
     * @return cpu
     */
    public Long getCpu() {
        return this.cpu;
    }

    /**
     * @return cpuUsed
     */
    public Long getCpuUsed() {
        return this.cpuUsed;
    }

    /**
     * @return expirationTime
     */
    public String getExpirationTime() {
        return this.expirationTime;
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
     * @return gpuMemoryUsed
     */
    public Long getGpuMemoryUsed() {
        return this.gpuMemoryUsed;
    }

    /**
     * @return gpuUsed
     */
    public Long getGpuUsed() {
        return this.gpuUsed;
    }

    /**
     * @return memory
     */
    public Long getMemory() {
        return this.memory;
    }

    /**
     * @return memoryUsed
     */
    public Long getMemoryUsed() {
        return this.memoryUsed;
    }

    /**
     * @return modelServiceList
     */
    public java.util.List<ModelServiceList> getModelServiceList() {
        return this.modelServiceList;
    }

    /**
     * @return nodeCount
     */
    public Long getNodeCount() {
        return this.nodeCount;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String aiInstanceId; 
        private Boolean autoRenewal; 
        private String chargeType; 
        private String commodityCode; 
        private Long cpu; 
        private Long cpuUsed; 
        private String expirationTime; 
        private Long gpu; 
        private Long gpuMemory; 
        private Long gpuMemoryUsed; 
        private Long gpuUsed; 
        private Long memory; 
        private Long memoryUsed; 
        private java.util.List<ModelServiceList> modelServiceList; 
        private Long nodeCount; 
        private String regionId; 
        private String requestId; 
        private String resourceType; 
        private String status; 

        private Builder() {
        } 

        private Builder(GetInstanceModelResponseBody model) {
            this.aiInstanceId = model.aiInstanceId;
            this.autoRenewal = model.autoRenewal;
            this.chargeType = model.chargeType;
            this.commodityCode = model.commodityCode;
            this.cpu = model.cpu;
            this.cpuUsed = model.cpuUsed;
            this.expirationTime = model.expirationTime;
            this.gpu = model.gpu;
            this.gpuMemory = model.gpuMemory;
            this.gpuMemoryUsed = model.gpuMemoryUsed;
            this.gpuUsed = model.gpuUsed;
            this.memory = model.memory;
            this.memoryUsed = model.memoryUsed;
            this.modelServiceList = model.modelServiceList;
            this.nodeCount = model.nodeCount;
            this.regionId = model.regionId;
            this.requestId = model.requestId;
            this.resourceType = model.resourceType;
            this.status = model.status;
        } 

        /**
         * <p>The ID of the AI node instance.</p>
         * 
         * <strong>example:</strong>
         * <p>hologram_aicombo_public_cn-77xxx</p>
         */
        public Builder aiInstanceId(String aiInstanceId) {
            this.aiInstanceId = aiInstanceId;
            return this;
        }

        /**
         * <p>Specifies whether auto-renewal is enabled for the resource. Valid values:</p>
         * <ul>
         * <li>true: Auto-renewal is enabled. The resource is automatically renewed upon expiration.</li>
         * <li>false: Auto-renewal is disabled. The resource is stopped upon expiration.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoRenewal(Boolean autoRenewal) {
            this.autoRenewal = autoRenewal;
            return this;
        }

        /**
         * <p>The billing method. Valid values:</p>
         * <ul>
         * <li>PrePaid: subscription.</li>
         * <li>PostPaid: pay-as-you-go.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PrePaid</p>
         */
        public Builder chargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }

        /**
         * <p>The commodity code.</p>
         * 
         * <strong>example:</strong>
         * <p>hologram_aipostpay_public_cn</p>
         */
        public Builder commodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }

        /**
         * <p>The total CPU of the node. This parameter is applicable only to Hologres AI nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>32</p>
         */
        public Builder cpu(Long cpu) {
            this.cpu = cpu;
            return this;
        }

        /**
         * <p>The total CPU used by the node. This parameter is applicable only to Hologres AI nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>32</p>
         */
        public Builder cpuUsed(Long cpuUsed) {
            this.cpuUsed = cpuUsed;
            return this;
        }

        /**
         * <p>The expiration time in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-28T07:44:27.535Z</p>
         */
        public Builder expirationTime(String expirationTime) {
            this.expirationTime = expirationTime;
            return this;
        }

        /**
         * <p>The total GPU of the node. This parameter is applicable only to Hologres AI nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder gpu(Long gpu) {
            this.gpu = gpu;
            return this;
        }

        /**
         * <p>The total GPU memory of the node. This parameter is applicable only to Hologres AI nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>128</p>
         */
        public Builder gpuMemory(Long gpuMemory) {
            this.gpuMemory = gpuMemory;
            return this;
        }

        /**
         * <p>The total GPU memory used by the node. This parameter is applicable only to Hologres AI nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>64</p>
         */
        public Builder gpuMemoryUsed(Long gpuMemoryUsed) {
            this.gpuMemoryUsed = gpuMemoryUsed;
            return this;
        }

        /**
         * <p>The total GPU used by the node. This parameter is applicable only to Hologres AI nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder gpuUsed(Long gpuUsed) {
            this.gpuUsed = gpuUsed;
            return this;
        }

        /**
         * <p>The total memory of the node. This parameter is applicable only to Hologres AI nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>128</p>
         */
        public Builder memory(Long memory) {
            this.memory = memory;
            return this;
        }

        /**
         * <p>The total memory used by the node. This parameter is applicable only to Hologres AI nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>64</p>
         */
        public Builder memoryUsed(Long memoryUsed) {
            this.memoryUsed = memoryUsed;
            return this;
        }

        /**
         * <p>The list of model services.</p>
         */
        public Builder modelServiceList(java.util.List<ModelServiceList> modelServiceList) {
            this.modelServiceList = modelServiceList;
            return this;
        }

        /**
         * <p>The number of nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder nodeCount(Long nodeCount) {
            this.nodeCount = nodeCount;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>819A7F0F-2951-540F-BD94-6A41ECF0281F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The resource type.</p>
         * 
         * <strong>example:</strong>
         * <p>middle</p>
         */
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        /**
         * <p>The node status.</p>
         * 
         * <strong>example:</strong>
         * <p>ResourceReady</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public GetInstanceModelResponseBody build() {
            return new GetInstanceModelResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetInstanceModelResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceModelResponseBody</p>
     */
    public static class ModelServiceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("apiKey")
        private String apiKey;

        @com.aliyun.core.annotation.NameInMap("cpu")
        private Long cpu;

        @com.aliyun.core.annotation.NameInMap("gpu")
        private Long gpu;

        @com.aliyun.core.annotation.NameInMap("gpuMemory")
        private Long gpuMemory;

        @com.aliyun.core.annotation.NameInMap("instanceRegion")
        private String instanceRegion;

        @com.aliyun.core.annotation.NameInMap("memory")
        private Long memory;

        @com.aliyun.core.annotation.NameInMap("message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("modelName")
        private String modelName;

        @com.aliyun.core.annotation.NameInMap("modelParams")
        private String modelParams;

        @com.aliyun.core.annotation.NameInMap("modelType")
        private String modelType;

        @com.aliyun.core.annotation.NameInMap("provider")
        private String provider;

        @com.aliyun.core.annotation.NameInMap("serviceCount")
        private Long serviceCount;

        @com.aliyun.core.annotation.NameInMap("serviceDeployRegion")
        private String serviceDeployRegion;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("supportApiKeyAccess")
        private Boolean supportApiKeyAccess;

        @com.aliyun.core.annotation.NameInMap("taskType")
        private String taskType;

        @com.aliyun.core.annotation.NameInMap("version")
        private String version;

        private ModelServiceList(Builder builder) {
            this.apiKey = builder.apiKey;
            this.cpu = builder.cpu;
            this.gpu = builder.gpu;
            this.gpuMemory = builder.gpuMemory;
            this.instanceRegion = builder.instanceRegion;
            this.memory = builder.memory;
            this.message = builder.message;
            this.modelName = builder.modelName;
            this.modelParams = builder.modelParams;
            this.modelType = builder.modelType;
            this.provider = builder.provider;
            this.serviceCount = builder.serviceCount;
            this.serviceDeployRegion = builder.serviceDeployRegion;
            this.status = builder.status;
            this.supportApiKeyAccess = builder.supportApiKeyAccess;
            this.taskType = builder.taskType;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ModelServiceList create() {
            return builder().build();
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
         * @return instanceRegion
         */
        public String getInstanceRegion() {
            return this.instanceRegion;
        }

        /**
         * @return memory
         */
        public Long getMemory() {
            return this.memory;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return modelName
         */
        public String getModelName() {
            return this.modelName;
        }

        /**
         * @return modelParams
         */
        public String getModelParams() {
            return this.modelParams;
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
         * @return serviceDeployRegion
         */
        public String getServiceDeployRegion() {
            return this.serviceDeployRegion;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return supportApiKeyAccess
         */
        public Boolean getSupportApiKeyAccess() {
            return this.supportApiKeyAccess;
        }

        /**
         * @return taskType
         */
        public String getTaskType() {
            return this.taskType;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String apiKey; 
            private Long cpu; 
            private Long gpu; 
            private Long gpuMemory; 
            private String instanceRegion; 
            private Long memory; 
            private String message; 
            private String modelName; 
            private String modelParams; 
            private String modelType; 
            private String provider; 
            private Long serviceCount; 
            private String serviceDeployRegion; 
            private String status; 
            private Boolean supportApiKeyAccess; 
            private String taskType; 
            private String version; 

            private Builder() {
            } 

            private Builder(ModelServiceList model) {
                this.apiKey = model.apiKey;
                this.cpu = model.cpu;
                this.gpu = model.gpu;
                this.gpuMemory = model.gpuMemory;
                this.instanceRegion = model.instanceRegion;
                this.memory = model.memory;
                this.message = model.message;
                this.modelName = model.modelName;
                this.modelParams = model.modelParams;
                this.modelType = model.modelType;
                this.provider = model.provider;
                this.serviceCount = model.serviceCount;
                this.serviceDeployRegion = model.serviceDeployRegion;
                this.status = model.status;
                this.supportApiKeyAccess = model.supportApiKeyAccess;
                this.taskType = model.taskType;
                this.version = model.version;
            } 

            /**
             * <p>The Model Studio API key. This key is for display purposes only and cannot be used directly.</p>
             * 
             * <strong>example:</strong>
             * <p>sk-42f6c8xxxxxb</p>
             */
            public Builder apiKey(String apiKey) {
                this.apiKey = apiKey;
                return this;
            }

            /**
             * <p>The CPU occupied by this model service. This parameter is applicable only to Hologres AI nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>32</p>
             */
            public Builder cpu(Long cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * <p>The GPU occupied by this model service. This parameter is applicable only to Hologres AI nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder gpu(Long gpu) {
                this.gpu = gpu;
                return this;
            }

            /**
             * <p>The GPU memory occupied by this model service. This parameter is applicable only to Hologres AI nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>32</p>
             */
            public Builder gpuMemory(Long gpuMemory) {
                this.gpuMemory = gpuMemory;
                return this;
            }

            /**
             * <p>The deployment region of the AI node.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder instanceRegion(String instanceRegion) {
                this.instanceRegion = instanceRegion;
                return this;
            }

            /**
             * <p>The memory occupied by this model service. This parameter is applicable only to Hologres AI nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>32</p>
             */
            public Builder memory(Long memory) {
                this.memory = memory;
                return this;
            }

            /**
             * <p>The error message.</p>
             * 
             * <strong>example:</strong>
             * <p>Failed</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The custom name of the model service.</p>
             * 
             * <strong>example:</strong>
             * <p>my_model</p>
             */
            public Builder modelName(String modelName) {
                this.modelName = modelName;
                return this;
            }

            /**
             * <p>The model parameters. This parameter is applicable only to Model Studio models.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;timeout&quot;:600,&quot;max_retries&quot;:10,&quot;max_retry_delay&quot;:8,&quot;initial_retry_delay&quot;:0.5}</p>
             */
            public Builder modelParams(String modelParams) {
                this.modelParams = modelParams;
                return this;
            }

            /**
             * <p>The model name.</p>
             * 
             * <strong>example:</strong>
             * <p>qwen3.5-plus</p>
             */
            public Builder modelType(String modelType) {
                this.modelType = modelType;
                return this;
            }

            /**
             * <p>The underlying model provider.</p>
             * 
             * <strong>example:</strong>
             * <p>bailian</p>
             */
            public Builder provider(String provider) {
                this.provider = provider;
                return this;
            }

            /**
             * <p>The number of service replicas. This parameter is applicable only to Hologres AI nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder serviceCount(Long serviceCount) {
                this.serviceCount = serviceCount;
                return this;
            }

            /**
             * <p>The deployment region.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder serviceDeployRegion(String serviceDeployRegion) {
                this.serviceDeployRegion = serviceDeployRegion;
                return this;
            }

            /**
             * <p>The status.</p>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Specifies whether the model service supports access through an API key.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder supportApiKeyAccess(Boolean supportApiKeyAccess) {
                this.supportApiKeyAccess = supportApiKeyAccess;
                return this;
            }

            /**
             * <p>The model purpose.</p>
             * 
             * <strong>example:</strong>
             * <p>embedding</p>
             */
            public Builder taskType(String taskType) {
                this.taskType = taskType;
                return this;
            }

            /**
             * <p>The version.</p>
             * 
             * <strong>example:</strong>
             * <p>v1.1</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public ModelServiceList build() {
                return new ModelServiceList(this);
            } 

        } 

    }
}
