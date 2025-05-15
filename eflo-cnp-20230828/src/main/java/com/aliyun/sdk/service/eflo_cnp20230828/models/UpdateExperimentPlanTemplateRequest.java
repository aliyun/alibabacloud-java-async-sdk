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
 * {@link UpdateExperimentPlanTemplateRequest} extends {@link RequestModel}
 *
 * <p>UpdateExperimentPlanTemplateRequest</p>
 */
public class UpdateExperimentPlanTemplateRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long templateId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TemplatePipeline")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<TemplatePipeline> templatePipeline;

    private UpdateExperimentPlanTemplateRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.templateId = builder.templateId;
        this.templatePipeline = builder.templatePipeline;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateExperimentPlanTemplateRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return templateId
     */
    public Long getTemplateId() {
        return this.templateId;
    }

    /**
     * @return templatePipeline
     */
    public java.util.List<TemplatePipeline> getTemplatePipeline() {
        return this.templatePipeline;
    }

    public static final class Builder extends Request.Builder<UpdateExperimentPlanTemplateRequest, Builder> {
        private String regionId; 
        private Long templateId; 
        private java.util.List<TemplatePipeline> templatePipeline; 

        private Builder() {
            super();
        } 

        private Builder(UpdateExperimentPlanTemplateRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.templateId = request.templateId;
            this.templatePipeline = request.templatePipeline;
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
         * <p>Template code</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>349623</p>
         */
        public Builder templateId(Long templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * <p>Template pipeline</p>
         * <p>This parameter is required.</p>
         */
        public Builder templatePipeline(java.util.List<TemplatePipeline> templatePipeline) {
            String templatePipelineShrink = shrink(templatePipeline, "TemplatePipeline", "json");
            this.putBodyParameter("TemplatePipeline", templatePipelineShrink);
            this.templatePipeline = templatePipeline;
            return this;
        }

        @Override
        public UpdateExperimentPlanTemplateRequest build() {
            return new UpdateExperimentPlanTemplateRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateExperimentPlanTemplateRequest} extends {@link TeaModel}
     *
     * <p>UpdateExperimentPlanTemplateRequest</p>
     */
    public static class EnvParams extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CpuPerWorker")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer cpuPerWorker;

        @com.aliyun.core.annotation.NameInMap("CudaVersion")
        private String cudaVersion;

        @com.aliyun.core.annotation.NameInMap("GpuDriverVersion")
        private String gpuDriverVersion;

        @com.aliyun.core.annotation.NameInMap("GpuPerWorker")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer gpuPerWorker;

        @com.aliyun.core.annotation.NameInMap("MemoryPerWorker")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer memoryPerWorker;

        @com.aliyun.core.annotation.NameInMap("NCCLVersion")
        private String NCCLVersion;

        @com.aliyun.core.annotation.NameInMap("PyTorchVersion")
        private String pyTorchVersion;

        @com.aliyun.core.annotation.NameInMap("ShareMemory")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer shareMemory;

        @com.aliyun.core.annotation.NameInMap("WorkerNum")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer workerNum;

        private EnvParams(Builder builder) {
            this.cpuPerWorker = builder.cpuPerWorker;
            this.cudaVersion = builder.cudaVersion;
            this.gpuDriverVersion = builder.gpuDriverVersion;
            this.gpuPerWorker = builder.gpuPerWorker;
            this.memoryPerWorker = builder.memoryPerWorker;
            this.NCCLVersion = builder.NCCLVersion;
            this.pyTorchVersion = builder.pyTorchVersion;
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
            private String gpuDriverVersion; 
            private Integer gpuPerWorker; 
            private Integer memoryPerWorker; 
            private String NCCLVersion; 
            private String pyTorchVersion; 
            private Integer shareMemory; 
            private Integer workerNum; 

            private Builder() {
            } 

            private Builder(EnvParams model) {
                this.cpuPerWorker = model.cpuPerWorker;
                this.cudaVersion = model.cudaVersion;
                this.gpuDriverVersion = model.gpuDriverVersion;
                this.gpuPerWorker = model.gpuPerWorker;
                this.memoryPerWorker = model.memoryPerWorker;
                this.NCCLVersion = model.NCCLVersion;
                this.pyTorchVersion = model.pyTorchVersion;
                this.shareMemory = model.shareMemory;
                this.workerNum = model.workerNum;
            } 

            /**
             * <p>CPU allocation count</p>
             * <p>This parameter is required.</p>
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
             * <p>GPU allocation count</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder gpuPerWorker(Integer gpuPerWorker) {
                this.gpuPerWorker = gpuPerWorker;
                return this;
            }

            /**
             * <p>Memory GB allocation count</p>
             * <p>This parameter is required.</p>
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
             * <p>Shared memory GB allocation count</p>
             * <p>This parameter is required.</p>
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
             * <p>This parameter is required.</p>
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
     * {@link UpdateExperimentPlanTemplateRequest} extends {@link TeaModel}
     *
     * <p>UpdateExperimentPlanTemplateRequest</p>
     */
    public static class TemplatePipeline extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnvParams")
        @com.aliyun.core.annotation.Validation(required = true)
        private EnvParams envParams;

        @com.aliyun.core.annotation.NameInMap("PipelineOrder")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer pipelineOrder;

        @com.aliyun.core.annotation.NameInMap("Scene")
        @com.aliyun.core.annotation.Validation(required = true)
        private String scene;

        @com.aliyun.core.annotation.NameInMap("SettingParams")
        private java.util.Map<String, String> settingParams;

        @com.aliyun.core.annotation.NameInMap("WorkloadId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long workloadId;

        @com.aliyun.core.annotation.NameInMap("WorkloadName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String workloadName;

        private TemplatePipeline(Builder builder) {
            this.envParams = builder.envParams;
            this.pipelineOrder = builder.pipelineOrder;
            this.scene = builder.scene;
            this.settingParams = builder.settingParams;
            this.workloadId = builder.workloadId;
            this.workloadName = builder.workloadName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TemplatePipeline create() {
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
            private String scene; 
            private java.util.Map<String, String> settingParams; 
            private Long workloadId; 
            private String workloadName; 

            private Builder() {
            } 

            private Builder(TemplatePipeline model) {
                this.envParams = model.envParams;
                this.pipelineOrder = model.pipelineOrder;
                this.scene = model.scene;
                this.settingParams = model.settingParams;
                this.workloadId = model.workloadId;
                this.workloadName = model.workloadName;
            } 

            /**
             * <p>Configured environment parameters</p>
             * <p>This parameter is required.</p>
             */
            public Builder envParams(EnvParams envParams) {
                this.envParams = envParams;
                return this;
            }

            /**
             * <p>Node order number</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pipelineOrder(Integer pipelineOrder) {
                this.pipelineOrder = pipelineOrder;
                return this;
            }

            /**
             * <p>Usage scenario, e.g., &quot;baseline&quot;</p>
             * <p>This parameter is required.</p>
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
             * <p>This parameter is required.</p>
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
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder workloadName(String workloadName) {
                this.workloadName = workloadName;
                return this;
            }

            public TemplatePipeline build() {
                return new TemplatePipeline(this);
            } 

        } 

    }
}
