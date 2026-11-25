// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link ListNodeInstanceTypeResponseBody} extends {@link TeaModel}
 *
 * <p>ListNodeInstanceTypeResponseBody</p>
 */
public class ListNodeInstanceTypeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NodeInstanceTypeModels")
    private java.util.List<NodeInstanceTypeModels> nodeInstanceTypeModels;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListNodeInstanceTypeResponseBody(Builder builder) {
        this.nodeInstanceTypeModels = builder.nodeInstanceTypeModels;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListNodeInstanceTypeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return nodeInstanceTypeModels
     */
    public java.util.List<NodeInstanceTypeModels> getNodeInstanceTypeModels() {
        return this.nodeInstanceTypeModels;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<NodeInstanceTypeModels> nodeInstanceTypeModels; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListNodeInstanceTypeResponseBody model) {
            this.nodeInstanceTypeModels = model.nodeInstanceTypeModels;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of resource specifications.</p>
         */
        public Builder nodeInstanceTypeModels(java.util.List<NodeInstanceTypeModels> nodeInstanceTypeModels) {
            this.nodeInstanceTypeModels = nodeInstanceTypeModels;
            return this;
        }

        /**
         * <p>The page number of the query results currently displayed.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of query results per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of query results.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListNodeInstanceTypeResponseBody build() {
            return new ListNodeInstanceTypeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListNodeInstanceTypeResponseBody} extends {@link TeaModel}
     *
     * <p>ListNodeInstanceTypeResponseBody</p>
     */
    public static class WuyingServerModelMetaInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DefaultInferenceEngine")
        private String defaultInferenceEngine;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("FirstTokenLatencySeconds")
        private Double firstTokenLatencySeconds;

        @com.aliyun.core.annotation.NameInMap("ImageId")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("InputModalities")
        private java.util.List<String> inputModalities;

        @com.aliyun.core.annotation.NameInMap("MachineInputTokensPerSecond")
        private Long machineInputTokensPerSecond;

        @com.aliyun.core.annotation.NameInMap("MachineOutputTokensPerSecond")
        private Long machineOutputTokensPerSecond;

        @com.aliyun.core.annotation.NameInMap("MaxModelLen")
        private Long maxModelLen;

        @com.aliyun.core.annotation.NameInMap("MaxModelLenMax")
        private Long maxModelLenMax;

        @com.aliyun.core.annotation.NameInMap("MaxModelLenMin")
        private Long maxModelLenMin;

        @com.aliyun.core.annotation.NameInMap("MaxNumSeqsMax")
        private Integer maxNumSeqsMax;

        @com.aliyun.core.annotation.NameInMap("MaxNumSeqsMin")
        private Integer maxNumSeqsMin;

        @com.aliyun.core.annotation.NameInMap("ModelId")
        private String modelId;

        @com.aliyun.core.annotation.NameInMap("ModelName")
        private String modelName;

        @com.aliyun.core.annotation.NameInMap("OutputModalities")
        private java.util.List<String> outputModalities;

        @com.aliyun.core.annotation.NameInMap("Recommended")
        private Boolean recommended;

        @com.aliyun.core.annotation.NameInMap("RecommendedMaxNumSeqs")
        private Integer recommendedMaxNumSeqs;

        private WuyingServerModelMetaInfo(Builder builder) {
            this.defaultInferenceEngine = builder.defaultInferenceEngine;
            this.description = builder.description;
            this.firstTokenLatencySeconds = builder.firstTokenLatencySeconds;
            this.imageId = builder.imageId;
            this.inputModalities = builder.inputModalities;
            this.machineInputTokensPerSecond = builder.machineInputTokensPerSecond;
            this.machineOutputTokensPerSecond = builder.machineOutputTokensPerSecond;
            this.maxModelLen = builder.maxModelLen;
            this.maxModelLenMax = builder.maxModelLenMax;
            this.maxModelLenMin = builder.maxModelLenMin;
            this.maxNumSeqsMax = builder.maxNumSeqsMax;
            this.maxNumSeqsMin = builder.maxNumSeqsMin;
            this.modelId = builder.modelId;
            this.modelName = builder.modelName;
            this.outputModalities = builder.outputModalities;
            this.recommended = builder.recommended;
            this.recommendedMaxNumSeqs = builder.recommendedMaxNumSeqs;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WuyingServerModelMetaInfo create() {
            return builder().build();
        }

        /**
         * @return defaultInferenceEngine
         */
        public String getDefaultInferenceEngine() {
            return this.defaultInferenceEngine;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return firstTokenLatencySeconds
         */
        public Double getFirstTokenLatencySeconds() {
            return this.firstTokenLatencySeconds;
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        /**
         * @return inputModalities
         */
        public java.util.List<String> getInputModalities() {
            return this.inputModalities;
        }

        /**
         * @return machineInputTokensPerSecond
         */
        public Long getMachineInputTokensPerSecond() {
            return this.machineInputTokensPerSecond;
        }

        /**
         * @return machineOutputTokensPerSecond
         */
        public Long getMachineOutputTokensPerSecond() {
            return this.machineOutputTokensPerSecond;
        }

        /**
         * @return maxModelLen
         */
        public Long getMaxModelLen() {
            return this.maxModelLen;
        }

        /**
         * @return maxModelLenMax
         */
        public Long getMaxModelLenMax() {
            return this.maxModelLenMax;
        }

        /**
         * @return maxModelLenMin
         */
        public Long getMaxModelLenMin() {
            return this.maxModelLenMin;
        }

        /**
         * @return maxNumSeqsMax
         */
        public Integer getMaxNumSeqsMax() {
            return this.maxNumSeqsMax;
        }

        /**
         * @return maxNumSeqsMin
         */
        public Integer getMaxNumSeqsMin() {
            return this.maxNumSeqsMin;
        }

        /**
         * @return modelId
         */
        public String getModelId() {
            return this.modelId;
        }

        /**
         * @return modelName
         */
        public String getModelName() {
            return this.modelName;
        }

        /**
         * @return outputModalities
         */
        public java.util.List<String> getOutputModalities() {
            return this.outputModalities;
        }

        /**
         * @return recommended
         */
        public Boolean getRecommended() {
            return this.recommended;
        }

        /**
         * @return recommendedMaxNumSeqs
         */
        public Integer getRecommendedMaxNumSeqs() {
            return this.recommendedMaxNumSeqs;
        }

        public static final class Builder {
            private String defaultInferenceEngine; 
            private String description; 
            private Double firstTokenLatencySeconds; 
            private String imageId; 
            private java.util.List<String> inputModalities; 
            private Long machineInputTokensPerSecond; 
            private Long machineOutputTokensPerSecond; 
            private Long maxModelLen; 
            private Long maxModelLenMax; 
            private Long maxModelLenMin; 
            private Integer maxNumSeqsMax; 
            private Integer maxNumSeqsMin; 
            private String modelId; 
            private String modelName; 
            private java.util.List<String> outputModalities; 
            private Boolean recommended; 
            private Integer recommendedMaxNumSeqs; 

            private Builder() {
            } 

            private Builder(WuyingServerModelMetaInfo model) {
                this.defaultInferenceEngine = model.defaultInferenceEngine;
                this.description = model.description;
                this.firstTokenLatencySeconds = model.firstTokenLatencySeconds;
                this.imageId = model.imageId;
                this.inputModalities = model.inputModalities;
                this.machineInputTokensPerSecond = model.machineInputTokensPerSecond;
                this.machineOutputTokensPerSecond = model.machineOutputTokensPerSecond;
                this.maxModelLen = model.maxModelLen;
                this.maxModelLenMax = model.maxModelLenMax;
                this.maxModelLenMin = model.maxModelLenMin;
                this.maxNumSeqsMax = model.maxNumSeqsMax;
                this.maxNumSeqsMin = model.maxNumSeqsMin;
                this.modelId = model.modelId;
                this.modelName = model.modelName;
                this.outputModalities = model.outputModalities;
                this.recommended = model.recommended;
                this.recommendedMaxNumSeqs = model.recommendedMaxNumSeqs;
            } 

            /**
             * DefaultInferenceEngine.
             */
            public Builder defaultInferenceEngine(String defaultInferenceEngine) {
                this.defaultInferenceEngine = defaultInferenceEngine;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * FirstTokenLatencySeconds.
             */
            public Builder firstTokenLatencySeconds(Double firstTokenLatencySeconds) {
                this.firstTokenLatencySeconds = firstTokenLatencySeconds;
                return this;
            }

            /**
             * ImageId.
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * InputModalities.
             */
            public Builder inputModalities(java.util.List<String> inputModalities) {
                this.inputModalities = inputModalities;
                return this;
            }

            /**
             * MachineInputTokensPerSecond.
             */
            public Builder machineInputTokensPerSecond(Long machineInputTokensPerSecond) {
                this.machineInputTokensPerSecond = machineInputTokensPerSecond;
                return this;
            }

            /**
             * MachineOutputTokensPerSecond.
             */
            public Builder machineOutputTokensPerSecond(Long machineOutputTokensPerSecond) {
                this.machineOutputTokensPerSecond = machineOutputTokensPerSecond;
                return this;
            }

            /**
             * MaxModelLen.
             */
            public Builder maxModelLen(Long maxModelLen) {
                this.maxModelLen = maxModelLen;
                return this;
            }

            /**
             * MaxModelLenMax.
             */
            public Builder maxModelLenMax(Long maxModelLenMax) {
                this.maxModelLenMax = maxModelLenMax;
                return this;
            }

            /**
             * MaxModelLenMin.
             */
            public Builder maxModelLenMin(Long maxModelLenMin) {
                this.maxModelLenMin = maxModelLenMin;
                return this;
            }

            /**
             * MaxNumSeqsMax.
             */
            public Builder maxNumSeqsMax(Integer maxNumSeqsMax) {
                this.maxNumSeqsMax = maxNumSeqsMax;
                return this;
            }

            /**
             * MaxNumSeqsMin.
             */
            public Builder maxNumSeqsMin(Integer maxNumSeqsMin) {
                this.maxNumSeqsMin = maxNumSeqsMin;
                return this;
            }

            /**
             * ModelId.
             */
            public Builder modelId(String modelId) {
                this.modelId = modelId;
                return this;
            }

            /**
             * ModelName.
             */
            public Builder modelName(String modelName) {
                this.modelName = modelName;
                return this;
            }

            /**
             * OutputModalities.
             */
            public Builder outputModalities(java.util.List<String> outputModalities) {
                this.outputModalities = outputModalities;
                return this;
            }

            /**
             * Recommended.
             */
            public Builder recommended(Boolean recommended) {
                this.recommended = recommended;
                return this;
            }

            /**
             * RecommendedMaxNumSeqs.
             */
            public Builder recommendedMaxNumSeqs(Integer recommendedMaxNumSeqs) {
                this.recommendedMaxNumSeqs = recommendedMaxNumSeqs;
                return this;
            }

            public WuyingServerModelMetaInfo build() {
                return new WuyingServerModelMetaInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListNodeInstanceTypeResponseBody} extends {@link TeaModel}
     *
     * <p>ListNodeInstanceTypeResponseBody</p>
     */
    public static class NodeInstanceTypeModels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cpu")
        private String cpu;

        @com.aliyun.core.annotation.NameInMap("EcsGpuMemory")
        private Integer ecsGpuMemory;

        @com.aliyun.core.annotation.NameInMap("Gpu")
        private String gpu;

        @com.aliyun.core.annotation.NameInMap("GpuMemory")
        private Long gpuMemory;

        @com.aliyun.core.annotation.NameInMap("GpuSpec")
        private String gpuSpec;

        @com.aliyun.core.annotation.NameInMap("MaxCapacity")
        private Integer maxCapacity;

        @com.aliyun.core.annotation.NameInMap("Memory")
        private Long memory;

        @com.aliyun.core.annotation.NameInMap("NodeInstanceType")
        private String nodeInstanceType;

        @com.aliyun.core.annotation.NameInMap("NodeInstanceTypeFamily")
        private String nodeInstanceTypeFamily;

        @com.aliyun.core.annotation.NameInMap("NodeTypeName")
        private String nodeTypeName;

        @com.aliyun.core.annotation.NameInMap("RequestId")
        private String requestId;

        @com.aliyun.core.annotation.NameInMap("WuyingServerModelMetaInfo")
        private WuyingServerModelMetaInfo wuyingServerModelMetaInfo;

        private NodeInstanceTypeModels(Builder builder) {
            this.cpu = builder.cpu;
            this.ecsGpuMemory = builder.ecsGpuMemory;
            this.gpu = builder.gpu;
            this.gpuMemory = builder.gpuMemory;
            this.gpuSpec = builder.gpuSpec;
            this.maxCapacity = builder.maxCapacity;
            this.memory = builder.memory;
            this.nodeInstanceType = builder.nodeInstanceType;
            this.nodeInstanceTypeFamily = builder.nodeInstanceTypeFamily;
            this.nodeTypeName = builder.nodeTypeName;
            this.requestId = builder.requestId;
            this.wuyingServerModelMetaInfo = builder.wuyingServerModelMetaInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodeInstanceTypeModels create() {
            return builder().build();
        }

        /**
         * @return cpu
         */
        public String getCpu() {
            return this.cpu;
        }

        /**
         * @return ecsGpuMemory
         */
        public Integer getEcsGpuMemory() {
            return this.ecsGpuMemory;
        }

        /**
         * @return gpu
         */
        public String getGpu() {
            return this.gpu;
        }

        /**
         * @return gpuMemory
         */
        public Long getGpuMemory() {
            return this.gpuMemory;
        }

        /**
         * @return gpuSpec
         */
        public String getGpuSpec() {
            return this.gpuSpec;
        }

        /**
         * @return maxCapacity
         */
        public Integer getMaxCapacity() {
            return this.maxCapacity;
        }

        /**
         * @return memory
         */
        public Long getMemory() {
            return this.memory;
        }

        /**
         * @return nodeInstanceType
         */
        public String getNodeInstanceType() {
            return this.nodeInstanceType;
        }

        /**
         * @return nodeInstanceTypeFamily
         */
        public String getNodeInstanceTypeFamily() {
            return this.nodeInstanceTypeFamily;
        }

        /**
         * @return nodeTypeName
         */
        public String getNodeTypeName() {
            return this.nodeTypeName;
        }

        /**
         * @return requestId
         */
        public String getRequestId() {
            return this.requestId;
        }

        /**
         * @return wuyingServerModelMetaInfo
         */
        public WuyingServerModelMetaInfo getWuyingServerModelMetaInfo() {
            return this.wuyingServerModelMetaInfo;
        }

        public static final class Builder {
            private String cpu; 
            private Integer ecsGpuMemory; 
            private String gpu; 
            private Long gpuMemory; 
            private String gpuSpec; 
            private Integer maxCapacity; 
            private Long memory; 
            private String nodeInstanceType; 
            private String nodeInstanceTypeFamily; 
            private String nodeTypeName; 
            private String requestId; 
            private WuyingServerModelMetaInfo wuyingServerModelMetaInfo; 

            private Builder() {
            } 

            private Builder(NodeInstanceTypeModels model) {
                this.cpu = model.cpu;
                this.ecsGpuMemory = model.ecsGpuMemory;
                this.gpu = model.gpu;
                this.gpuMemory = model.gpuMemory;
                this.gpuSpec = model.gpuSpec;
                this.maxCapacity = model.maxCapacity;
                this.memory = model.memory;
                this.nodeInstanceType = model.nodeInstanceType;
                this.nodeInstanceTypeFamily = model.nodeInstanceTypeFamily;
                this.nodeTypeName = model.nodeTypeName;
                this.requestId = model.requestId;
                this.wuyingServerModelMetaInfo = model.wuyingServerModelMetaInfo;
            } 

            /**
             * <p>The number of vCPUs.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder cpu(String cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * EcsGpuMemory.
             */
            public Builder ecsGpuMemory(Integer ecsGpuMemory) {
                this.ecsGpuMemory = ecsGpuMemory;
                return this;
            }

            /**
             * <p>The number of GPUs.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder gpu(String gpu) {
                this.gpu = gpu;
                return this;
            }

            /**
             * <p>The GPU memory size. Unit: MB.</p>
             * 
             * <strong>example:</strong>
             * <p>8192</p>
             */
            public Builder gpuMemory(Long gpuMemory) {
                this.gpuMemory = gpuMemory;
                return this;
            }

            /**
             * GpuSpec.
             */
            public Builder gpuSpec(String gpuSpec) {
                this.gpuSpec = gpuSpec;
                return this;
            }

            /**
             * <p>The maximum number of concurrent sessions, which is the number of sessions that can be simultaneously connected to a single resource. If too many sessions are connected at the same time, the application experience may degrade. The valid values vary depending on the resource specification. The valid values for each resource specification are as follows:</p>
             * <ul>
             * <li>appstreaming.general.2c4g: 1</li>
             * <li>appstreaming.general.4c8g: 1 to 2</li>
             * <li>appstreaming.general.8c16g: 1 to 4</li>
             * <li>appstreaming.vgpu.8c16g.4g: 1 to 4</li>
             * <li>appstreaming.vgpu.8c31g.16g: 1 to 4</li>
             * <li>appstreaming.vgpu.14c93g.12g: 1 to 7</li>
             * <li>appstreaming.vgpu.4c10g.2gt4: 1 to 2</li>
             * <li>appstreaming.vgpu.4c16g.2ga10: 1 to 2</li>
             * <li>appstreaming.vgpu.8c16g.4g: 1 to 4</li>
             * <li>appstreaming.vgpu.8c31g.16g: 1 to 4</li>
             * <li>appstreaming.vgpu.8c16g.4gt4: 1 to 4</li>
             * <li>appstreaming.vgpu.8c32g.4ga10: 1 to 4</li>
             * <li>appstreaming.vgpu.12c46g.11g28: 1 to 6</li>
             * <li>appstreaming.vgpu.14c93g.12g: 1 to 7</li>
             * <li>appstreaming.vgpu.16c32g.8g: 1 to 8</li>
             * <li>appstreaming.vgpu.16c62g.8ga10: 1 to 8</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder maxCapacity(Integer maxCapacity) {
                this.maxCapacity = maxCapacity;
                return this;
            }

            /**
             * <p>The memory size. Unit: MB.</p>
             * 
             * <strong>example:</strong>
             * <p>8192</p>
             */
            public Builder memory(Long memory) {
                this.memory = memory;
                return this;
            }

            /**
             * <p>The resource specification type ID.</p>
             * 
             * <strong>example:</strong>
             * <p>appstreaming.vgpu.4c8g.2g</p>
             */
            public Builder nodeInstanceType(String nodeInstanceType) {
                this.nodeInstanceType = nodeInstanceType;
                return this;
            }

            /**
             * <p>The resource specification family.</p>
             * 
             * <strong>example:</strong>
             * <p>appstreaming.vgpu</p>
             */
            public Builder nodeInstanceTypeFamily(String nodeInstanceTypeFamily) {
                this.nodeInstanceTypeFamily = nodeInstanceTypeFamily;
                return this;
            }

            /**
             * <p>The resource specification name.</p>
             * 
             * <strong>example:</strong>
             * <p>WUYING-General-purpose_4vCPU8GB</p>
             */
            public Builder nodeTypeName(String nodeTypeName) {
                this.nodeTypeName = nodeTypeName;
                return this;
            }

            /**
             * <p>The request ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
             */
            public Builder requestId(String requestId) {
                this.requestId = requestId;
                return this;
            }

            /**
             * WuyingServerModelMetaInfo.
             */
            public Builder wuyingServerModelMetaInfo(WuyingServerModelMetaInfo wuyingServerModelMetaInfo) {
                this.wuyingServerModelMetaInfo = wuyingServerModelMetaInfo;
                return this;
            }

            public NodeInstanceTypeModels build() {
                return new NodeInstanceTypeModels(this);
            } 

        } 

    }
}
