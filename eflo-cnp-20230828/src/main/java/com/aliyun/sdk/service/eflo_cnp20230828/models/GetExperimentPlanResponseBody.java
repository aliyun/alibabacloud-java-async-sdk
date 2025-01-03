// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo_cnp20230828.models;

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
 * {@link GetExperimentPlanResponseBody} extends {@link TeaModel}
 *
 * <p>GetExperimentPlanResponseBody</p>
 */
public class GetExperimentPlanResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private GetExperimentPlanResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetExperimentPlanResponseBody create() {
        return builder().build();
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private Data data; 
        private String requestId; 
        private Long totalCount; 

        /**
         * <p>Access denied information</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>Data</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Request ID</p>
         * 
         * <strong>example:</strong>
         * <p>6DBAC169-93D1-5DCD-8109-30FB623B3197</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Total count of the query</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public GetExperimentPlanResponseBody build() {
            return new GetExperimentPlanResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetExperimentPlanResponseBody} extends {@link TeaModel}
     *
     * <p>GetExperimentPlanResponseBody</p>
     */
    public static class ResourceNodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NodeName")
        private String nodeName;

        @com.aliyun.core.annotation.NameInMap("RequestCPU")
        private Integer requestCPU;

        @com.aliyun.core.annotation.NameInMap("RequestGPU")
        private Integer requestGPU;

        @com.aliyun.core.annotation.NameInMap("RequestMemory")
        private Integer requestMemory;

        @com.aliyun.core.annotation.NameInMap("TotalCPU")
        private Integer totalCPU;

        @com.aliyun.core.annotation.NameInMap("TotalGPU")
        private Integer totalGPU;

        @com.aliyun.core.annotation.NameInMap("TotalMemory")
        private Long totalMemory;

        private ResourceNodes(Builder builder) {
            this.nodeName = builder.nodeName;
            this.requestCPU = builder.requestCPU;
            this.requestGPU = builder.requestGPU;
            this.requestMemory = builder.requestMemory;
            this.totalCPU = builder.totalCPU;
            this.totalGPU = builder.totalGPU;
            this.totalMemory = builder.totalMemory;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceNodes create() {
            return builder().build();
        }

        /**
         * @return nodeName
         */
        public String getNodeName() {
            return this.nodeName;
        }

        /**
         * @return requestCPU
         */
        public Integer getRequestCPU() {
            return this.requestCPU;
        }

        /**
         * @return requestGPU
         */
        public Integer getRequestGPU() {
            return this.requestGPU;
        }

        /**
         * @return requestMemory
         */
        public Integer getRequestMemory() {
            return this.requestMemory;
        }

        /**
         * @return totalCPU
         */
        public Integer getTotalCPU() {
            return this.totalCPU;
        }

        /**
         * @return totalGPU
         */
        public Integer getTotalGPU() {
            return this.totalGPU;
        }

        /**
         * @return totalMemory
         */
        public Long getTotalMemory() {
            return this.totalMemory;
        }

        public static final class Builder {
            private String nodeName; 
            private Integer requestCPU; 
            private Integer requestGPU; 
            private Integer requestMemory; 
            private Integer totalCPU; 
            private Integer totalGPU; 
            private Long totalMemory; 

            /**
             * <p>Node name</p>
             * 
             * <strong>example:</strong>
             * <p>ods_galaxy_gateway_tickets</p>
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            /**
             * <p>Requested CPU</p>
             * 
             * <strong>example:</strong>
             * <p>90</p>
             */
            public Builder requestCPU(Integer requestCPU) {
                this.requestCPU = requestCPU;
                return this;
            }

            /**
             * <p>Requested GPU</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder requestGPU(Integer requestGPU) {
                this.requestGPU = requestGPU;
                return this;
            }

            /**
             * <p>Memory of the current request</p>
             * 
             * <strong>example:</strong>
             * <p>500</p>
             */
            public Builder requestMemory(Integer requestMemory) {
                this.requestMemory = requestMemory;
                return this;
            }

            /**
             * <p>Total CPU</p>
             * 
             * <strong>example:</strong>
             * <p>90</p>
             */
            public Builder totalCPU(Integer totalCPU) {
                this.totalCPU = totalCPU;
                return this;
            }

            /**
             * <p>Total GPU</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder totalGPU(Integer totalGPU) {
                this.totalGPU = totalGPU;
                return this;
            }

            /**
             * <p>Total memory</p>
             * 
             * <strong>example:</strong>
             * <p>500</p>
             */
            public Builder totalMemory(Long totalMemory) {
                this.totalMemory = totalMemory;
                return this;
            }

            public ResourceNodes build() {
                return new ResourceNodes(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetExperimentPlanResponseBody} extends {@link TeaModel}
     *
     * <p>GetExperimentPlanResponseBody</p>
     */
    public static class EnvParams extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CpuPerWorker")
        private Integer cpuPerWorker;

        @com.aliyun.core.annotation.NameInMap("CudaVersion")
        private String cudaVersion;

        @com.aliyun.core.annotation.NameInMap("ExtendParam")
        private java.util.Map<String, String> extendParam;

        @com.aliyun.core.annotation.NameInMap("GpuDriverVersion")
        private String gpuDriverVersion;

        @com.aliyun.core.annotation.NameInMap("GpuPerWorker")
        private Integer gpuPerWorker;

        @com.aliyun.core.annotation.NameInMap("MemoryPerWorker")
        private Integer memoryPerWorker;

        @com.aliyun.core.annotation.NameInMap("NCCLVersion")
        private String NCCLVersion;

        @com.aliyun.core.annotation.NameInMap("PyTorchVersion")
        private String pyTorchVersion;

        @com.aliyun.core.annotation.NameInMap("ResourceNodes")
        private java.util.List<ResourceNodes> resourceNodes;

        @com.aliyun.core.annotation.NameInMap("ShareMemory")
        private Integer shareMemory;

        @com.aliyun.core.annotation.NameInMap("WorkerNum")
        private Integer workerNum;

        private EnvParams(Builder builder) {
            this.cpuPerWorker = builder.cpuPerWorker;
            this.cudaVersion = builder.cudaVersion;
            this.extendParam = builder.extendParam;
            this.gpuDriverVersion = builder.gpuDriverVersion;
            this.gpuPerWorker = builder.gpuPerWorker;
            this.memoryPerWorker = builder.memoryPerWorker;
            this.NCCLVersion = builder.NCCLVersion;
            this.pyTorchVersion = builder.pyTorchVersion;
            this.resourceNodes = builder.resourceNodes;
            this.shareMemory = builder.shareMemory;
            this.workerNum = builder.workerNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EnvParams create() {
            return builder().build();
        }

        /**
         * @return cpuPerWorker
         */
        public Integer getCpuPerWorker() {
            return this.cpuPerWorker;
        }

        /**
         * @return cudaVersion
         */
        public String getCudaVersion() {
            return this.cudaVersion;
        }

        /**
         * @return extendParam
         */
        public java.util.Map<String, String> getExtendParam() {
            return this.extendParam;
        }

        /**
         * @return gpuDriverVersion
         */
        public String getGpuDriverVersion() {
            return this.gpuDriverVersion;
        }

        /**
         * @return gpuPerWorker
         */
        public Integer getGpuPerWorker() {
            return this.gpuPerWorker;
        }

        /**
         * @return memoryPerWorker
         */
        public Integer getMemoryPerWorker() {
            return this.memoryPerWorker;
        }

        /**
         * @return NCCLVersion
         */
        public String getNCCLVersion() {
            return this.NCCLVersion;
        }

        /**
         * @return pyTorchVersion
         */
        public String getPyTorchVersion() {
            return this.pyTorchVersion;
        }

        /**
         * @return resourceNodes
         */
        public java.util.List<ResourceNodes> getResourceNodes() {
            return this.resourceNodes;
        }

        /**
         * @return shareMemory
         */
        public Integer getShareMemory() {
            return this.shareMemory;
        }

        /**
         * @return workerNum
         */
        public Integer getWorkerNum() {
            return this.workerNum;
        }

        public static final class Builder {
            private Integer cpuPerWorker; 
            private String cudaVersion; 
            private java.util.Map<String, String> extendParam; 
            private String gpuDriverVersion; 
            private Integer gpuPerWorker; 
            private Integer memoryPerWorker; 
            private String NCCLVersion; 
            private String pyTorchVersion; 
            private java.util.List<ResourceNodes> resourceNodes; 
            private Integer shareMemory; 
            private Integer workerNum; 

            /**
             * <p>CPU allocation</p>
             * 
             * <strong>example:</strong>
             * <p>90</p>
             */
            public Builder cpuPerWorker(Integer cpuPerWorker) {
                this.cpuPerWorker = cpuPerWorker;
                return this;
            }

            /**
             * <p>CUDA version</p>
             * 
             * <strong>example:</strong>
             * <p>1.0.0</p>
             */
            public Builder cudaVersion(String cudaVersion) {
                this.cudaVersion = cudaVersion;
                return this;
            }

            /**
             * <p>Additional parameters</p>
             */
            public Builder extendParam(java.util.Map<String, String> extendParam) {
                this.extendParam = extendParam;
                return this;
            }

            /**
             * <p>GPU driver version</p>
             * 
             * <strong>example:</strong>
             * <p>1.0.0</p>
             */
            public Builder gpuDriverVersion(String gpuDriverVersion) {
                this.gpuDriverVersion = gpuDriverVersion;
                return this;
            }

            /**
             * <p>Number of GPUs allocated</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder gpuPerWorker(Integer gpuPerWorker) {
                this.gpuPerWorker = gpuPerWorker;
                return this;
            }

            /**
             * <p>Memory GB allocation</p>
             * 
             * <strong>example:</strong>
             * <p>500</p>
             */
            public Builder memoryPerWorker(Integer memoryPerWorker) {
                this.memoryPerWorker = memoryPerWorker;
                return this;
            }

            /**
             * <p>NCCL version</p>
             * 
             * <strong>example:</strong>
             * <p>1.0.0</p>
             */
            public Builder NCCLVersion(String NCCLVersion) {
                this.NCCLVersion = NCCLVersion;
                return this;
            }

            /**
             * <p>PyTorch version</p>
             * 
             * <strong>example:</strong>
             * <p>1.0.0</p>
             */
            public Builder pyTorchVersion(String pyTorchVersion) {
                this.pyTorchVersion = pyTorchVersion;
                return this;
            }

            /**
             * <p>Specified nodes</p>
             */
            public Builder resourceNodes(java.util.List<ResourceNodes> resourceNodes) {
                this.resourceNodes = resourceNodes;
                return this;
            }

            /**
             * <p>Shared memory GB allocation</p>
             * 
             * <strong>example:</strong>
             * <p>500</p>
             */
            public Builder shareMemory(Integer shareMemory) {
                this.shareMemory = shareMemory;
                return this;
            }

            /**
             * <p>Number of nodes</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder workerNum(Integer workerNum) {
                this.workerNum = workerNum;
                return this;
            }

            public EnvParams build() {
                return new EnvParams(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetExperimentPlanResponseBody} extends {@link TeaModel}
     *
     * <p>GetExperimentPlanResponseBody</p>
     */
    public static class PlanPipeline extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnvParams")
        private EnvParams envParams;

        @com.aliyun.core.annotation.NameInMap("PipelineOrder")
        private Integer pipelineOrder;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private Long resourceId;

        @com.aliyun.core.annotation.NameInMap("ResourceName")
        private String resourceName;

        @com.aliyun.core.annotation.NameInMap("Scene")
        private String scene;

        @com.aliyun.core.annotation.NameInMap("SettingParams")
        private java.util.Map<String, String> settingParams;

        @com.aliyun.core.annotation.NameInMap("WorkloadId")
        private Long workloadId;

        @com.aliyun.core.annotation.NameInMap("WorkloadName")
        private String workloadName;

        private PlanPipeline(Builder builder) {
            this.envParams = builder.envParams;
            this.pipelineOrder = builder.pipelineOrder;
            this.resourceId = builder.resourceId;
            this.resourceName = builder.resourceName;
            this.scene = builder.scene;
            this.settingParams = builder.settingParams;
            this.workloadId = builder.workloadId;
            this.workloadName = builder.workloadName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PlanPipeline create() {
            return builder().build();
        }

        /**
         * @return envParams
         */
        public EnvParams getEnvParams() {
            return this.envParams;
        }

        /**
         * @return pipelineOrder
         */
        public Integer getPipelineOrder() {
            return this.pipelineOrder;
        }

        /**
         * @return resourceId
         */
        public Long getResourceId() {
            return this.resourceId;
        }

        /**
         * @return resourceName
         */
        public String getResourceName() {
            return this.resourceName;
        }

        /**
         * @return scene
         */
        public String getScene() {
            return this.scene;
        }

        /**
         * @return settingParams
         */
        public java.util.Map<String, String> getSettingParams() {
            return this.settingParams;
        }

        /**
         * @return workloadId
         */
        public Long getWorkloadId() {
            return this.workloadId;
        }

        /**
         * @return workloadName
         */
        public String getWorkloadName() {
            return this.workloadName;
        }

        public static final class Builder {
            private EnvParams envParams; 
            private Integer pipelineOrder; 
            private Long resourceId; 
            private String resourceName; 
            private String scene; 
            private java.util.Map<String, String> settingParams; 
            private Long workloadId; 
            private String workloadName; 

            /**
             * <p>Configured environment parameters</p>
             */
            public Builder envParams(EnvParams envParams) {
                this.envParams = envParams;
                return this;
            }

            /**
             * <p>Node order number</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pipelineOrder(Integer pipelineOrder) {
                this.pipelineOrder = pipelineOrder;
                return this;
            }

            /**
             * <p>Resource ID</p>
             * 
             * <strong>example:</strong>
             * <p>36</p>
             */
            public Builder resourceId(Long resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>Resource name</p>
             * 
             * <strong>example:</strong>
             * <p>PPU</p>
             */
            public Builder resourceName(String resourceName) {
                this.resourceName = resourceName;
                return this;
            }

            /**
             * <p>Usage scenario, e.g., &quot;baseline&quot;</p>
             * 
             * <strong>example:</strong>
             * <p>baseline</p>
             */
            public Builder scene(String scene) {
                this.scene = scene;
                return this;
            }

            /**
             * <p>Configured workload parameters</p>
             */
            public Builder settingParams(java.util.Map<String, String> settingParams) {
                this.settingParams = settingParams;
                return this;
            }

            /**
             * <p>Workload ID</p>
             * 
             * <strong>example:</strong>
             * <p>14</p>
             */
            public Builder workloadId(Long workloadId) {
                this.workloadId = workloadId;
                return this;
            }

            /**
             * <p>Workload name</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder workloadName(String workloadName) {
                this.workloadName = workloadName;
                return this;
            }

            public PlanPipeline build() {
                return new PlanPipeline(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetExperimentPlanResponseBody} extends {@link TeaModel}
     *
     * <p>GetExperimentPlanResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("PlanId")
        private Long planId;

        @com.aliyun.core.annotation.NameInMap("PlanPipeline")
        private java.util.List<PlanPipeline> planPipeline;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private Long resourceId;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private Long templateId;

        @com.aliyun.core.annotation.NameInMap("TemplateName")
        private String templateName;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        private Data(Builder builder) {
            this.createTime = builder.createTime;
            this.planId = builder.planId;
            this.planPipeline = builder.planPipeline;
            this.resourceGroupId = builder.resourceGroupId;
            this.resourceId = builder.resourceId;
            this.templateId = builder.templateId;
            this.templateName = builder.templateName;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return planId
         */
        public Long getPlanId() {
            return this.planId;
        }

        /**
         * @return planPipeline
         */
        public java.util.List<PlanPipeline> getPlanPipeline() {
            return this.planPipeline;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return resourceId
         */
        public Long getResourceId() {
            return this.resourceId;
        }

        /**
         * @return templateId
         */
        public Long getTemplateId() {
            return this.templateId;
        }

        /**
         * @return templateName
         */
        public String getTemplateName() {
            return this.templateName;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String createTime; 
            private Long planId; 
            private java.util.List<PlanPipeline> planPipeline; 
            private String resourceGroupId; 
            private Long resourceId; 
            private Long templateId; 
            private String templateName; 
            private String updateTime; 

            /**
             * <p>Creation time</p>
             * 
             * <strong>example:</strong>
             * <p>2024-07-07 02:08:54</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Plan ID</p>
             * 
             * <strong>example:</strong>
             * <p>189</p>
             */
            public Builder planId(Long planId) {
                this.planId = planId;
                return this;
            }

            /**
             * <p>Test plan pipeline</p>
             */
            public Builder planPipeline(java.util.List<PlanPipeline> planPipeline) {
                this.planPipeline = planPipeline;
                return this;
            }

            /**
             * <p>Resource group ID</p>
             * 
             * <strong>example:</strong>
             * <p>rg-acfmvmpzi7lmxhq</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>Associated resource ID</p>
             * 
             * <strong>example:</strong>
             * <p>260860230684</p>
             */
            public Builder resourceId(Long resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>Associated test plan template ID</p>
             * 
             * <strong>example:</strong>
             * <p>2162</p>
             */
            public Builder templateId(Long templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * <p>Associated test plan template name</p>
             * 
             * <strong>example:</strong>
             * <p>MM</p>
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            /**
             * <p>Update time</p>
             * 
             * <strong>example:</strong>
             * <p>2024-07-07 02:08:54</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
