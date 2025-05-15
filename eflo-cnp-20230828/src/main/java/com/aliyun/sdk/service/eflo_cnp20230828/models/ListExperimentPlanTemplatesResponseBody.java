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
 * {@link ListExperimentPlanTemplatesResponseBody} extends {@link TeaModel}
 *
 * <p>ListExperimentPlanTemplatesResponseBody</p>
 */
public class ListExperimentPlanTemplatesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListExperimentPlanTemplatesResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListExperimentPlanTemplatesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
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
        private java.util.List<Data> data; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListExperimentPlanTemplatesResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>Data</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Request ID</p>
         * 
         * <strong>example:</strong>
         * <p>AAE4AFED-7AE6-52FA-80B6-448E63760552</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Total</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListExperimentPlanTemplatesResponseBody build() {
            return new ListExperimentPlanTemplatesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListExperimentPlanTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>ListExperimentPlanTemplatesResponseBody</p>
     */
    public static class EnvParams extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CpuPerWorker")
        private Integer cpuPerWorker;

        @com.aliyun.core.annotation.NameInMap("CudaVersion")
        private String cudaVersion;

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

        @com.aliyun.core.annotation.NameInMap("ShareMemory")
        private Integer shareMemory;

        @com.aliyun.core.annotation.NameInMap("WorkerNum")
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
             * <p>Cuda Version</p>
             * 
             * <strong>example:</strong>
             * <p>1.0.0</p>
             */
            public Builder cudaVersion(String cudaVersion) {
                this.cudaVersion = cudaVersion;
                return this;
            }

            /**
             * <p>The version of the GPU driver.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0.0</p>
             */
            public Builder gpuDriverVersion(String gpuDriverVersion) {
                this.gpuDriverVersion = gpuDriverVersion;
                return this;
            }

            /**
             * <p>GPU allocation</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder gpuPerWorker(Integer gpuPerWorker) {
                this.gpuPerWorker = gpuPerWorker;
                return this;
            }

            /**
             * <p>Allocated memory in GB</p>
             * 
             * <strong>example:</strong>
             * <p>500</p>
             */
            public Builder memoryPerWorker(Integer memoryPerWorker) {
                this.memoryPerWorker = memoryPerWorker;
                return this;
            }

            /**
             * <p>NCCL Version</p>
             * 
             * <strong>example:</strong>
             * <p>1.0.0</p>
             */
            public Builder NCCLVersion(String NCCLVersion) {
                this.NCCLVersion = NCCLVersion;
                return this;
            }

            /**
             * <p>PyTorch Version</p>
             * 
             * <strong>example:</strong>
             * <p>1.0.0</p>
             */
            public Builder pyTorchVersion(String pyTorchVersion) {
                this.pyTorchVersion = pyTorchVersion;
                return this;
            }

            /**
             * <p>Allocated shared memory in GB</p>
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
     * {@link ListExperimentPlanTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>ListExperimentPlanTemplatesResponseBody</p>
     */
    public static class TemplatePipelineParam extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnvParams")
        private EnvParams envParams;

        @com.aliyun.core.annotation.NameInMap("PipelineOrder")
        private Integer pipelineOrder;

        @com.aliyun.core.annotation.NameInMap("Scene")
        private String scene;

        @com.aliyun.core.annotation.NameInMap("SettingParams")
        private java.util.Map<String, String> settingParams;

        @com.aliyun.core.annotation.NameInMap("WorkloadId")
        private Long workloadId;

        @com.aliyun.core.annotation.NameInMap("WorkloadName")
        private String workloadName;

        private TemplatePipelineParam(Builder builder) {
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

        public static TemplatePipelineParam create() {
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

            private Builder(TemplatePipelineParam model) {
                this.envParams = model.envParams;
                this.pipelineOrder = model.pipelineOrder;
                this.scene = model.scene;
                this.settingParams = model.settingParams;
                this.workloadId = model.workloadId;
                this.workloadName = model.workloadName;
            } 

            /**
             * <p>Configured environment parameters</p>
             */
            public Builder envParams(EnvParams envParams) {
                this.envParams = envParams;
                return this;
            }

            /**
             * <p>Node sequence number</p>
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
             * <p>13</p>
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

            public TemplatePipelineParam build() {
                return new TemplatePipelineParam(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListExperimentPlanTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>ListExperimentPlanTemplatesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("CreatorUid")
        private Long creatorUid;

        @com.aliyun.core.annotation.NameInMap("IsDelete")
        private Integer isDelete;

        @com.aliyun.core.annotation.NameInMap("PrivacyLevel")
        private String privacyLevel;

        @com.aliyun.core.annotation.NameInMap("TemplateCode")
        private Long templateCode;

        @com.aliyun.core.annotation.NameInMap("TemplateDescription")
        private String templateDescription;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private Long templateId;

        @com.aliyun.core.annotation.NameInMap("TemplateName")
        private String templateName;

        @com.aliyun.core.annotation.NameInMap("TemplatePipelineParam")
        private java.util.List<TemplatePipelineParam> templatePipelineParam;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        @com.aliyun.core.annotation.NameInMap("VersionId")
        private Long versionId;

        private Data(Builder builder) {
            this.createTime = builder.createTime;
            this.creatorUid = builder.creatorUid;
            this.isDelete = builder.isDelete;
            this.privacyLevel = builder.privacyLevel;
            this.templateCode = builder.templateCode;
            this.templateDescription = builder.templateDescription;
            this.templateId = builder.templateId;
            this.templateName = builder.templateName;
            this.templatePipelineParam = builder.templatePipelineParam;
            this.updateTime = builder.updateTime;
            this.versionId = builder.versionId;
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
         * @return creatorUid
         */
        public Long getCreatorUid() {
            return this.creatorUid;
        }

        /**
         * @return isDelete
         */
        public Integer getIsDelete() {
            return this.isDelete;
        }

        /**
         * @return privacyLevel
         */
        public String getPrivacyLevel() {
            return this.privacyLevel;
        }

        /**
         * @return templateCode
         */
        public Long getTemplateCode() {
            return this.templateCode;
        }

        /**
         * @return templateDescription
         */
        public String getTemplateDescription() {
            return this.templateDescription;
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
         * @return templatePipelineParam
         */
        public java.util.List<TemplatePipelineParam> getTemplatePipelineParam() {
            return this.templatePipelineParam;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return versionId
         */
        public Long getVersionId() {
            return this.versionId;
        }

        public static final class Builder {
            private String createTime; 
            private Long creatorUid; 
            private Integer isDelete; 
            private String privacyLevel; 
            private Long templateCode; 
            private String templateDescription; 
            private Long templateId; 
            private String templateName; 
            private java.util.List<TemplatePipelineParam> templatePipelineParam; 
            private String updateTime; 
            private Long versionId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.createTime = model.createTime;
                this.creatorUid = model.creatorUid;
                this.isDelete = model.isDelete;
                this.privacyLevel = model.privacyLevel;
                this.templateCode = model.templateCode;
                this.templateDescription = model.templateDescription;
                this.templateId = model.templateId;
                this.templateName = model.templateName;
                this.templatePipelineParam = model.templatePipelineParam;
                this.updateTime = model.updateTime;
                this.versionId = model.versionId;
            } 

            /**
             * <p>Creation time</p>
             * 
             * <strong>example:</strong>
             * <p>2024-11-29 02:16:35</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Primary account UID</p>
             * 
             * <strong>example:</strong>
             * <p>178154411231232</p>
             */
            public Builder creatorUid(Long creatorUid) {
                this.creatorUid = creatorUid;
                return this;
            }

            /**
             * <p>Whether it is deleted</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder isDelete(Integer isDelete) {
                this.isDelete = isDelete;
                return this;
            }

            /**
             * <p>Privacy level</p>
             * 
             * <strong>example:</strong>
             * <p>private</p>
             */
            public Builder privacyLevel(String privacyLevel) {
                this.privacyLevel = privacyLevel;
                return this;
            }

            /**
             * <p>The template code.</p>
             * 
             * <strong>example:</strong>
             * <p>475315534</p>
             */
            public Builder templateCode(Long templateCode) {
                this.templateCode = templateCode;
                return this;
            }

            /**
             * <p>Template description</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder templateDescription(String templateDescription) {
                this.templateDescription = templateDescription;
                return this;
            }

            /**
             * <p>Template ID</p>
             * 
             * <strong>example:</strong>
             * <p>17815441</p>
             */
            public Builder templateId(Long templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * <p>Template name</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            /**
             * <p>Template pipeline</p>
             */
            public Builder templatePipelineParam(java.util.List<TemplatePipelineParam> templatePipelineParam) {
                this.templatePipelineParam = templatePipelineParam;
                return this;
            }

            /**
             * <p>Update time</p>
             * 
             * <strong>example:</strong>
             * <p>2024-11-29 02:16:35</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>Version ID</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder versionId(Long versionId) {
                this.versionId = versionId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
