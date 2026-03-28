// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pailangstudio20240710.models;

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
 * {@link GetKnowledgeBaseJobResponseBody} extends {@link TeaModel}
 *
 * <p>GetKnowledgeBaseJobResponseBody</p>
 */
public class GetKnowledgeBaseJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Accessibility")
    private String accessibility;

    @com.aliyun.core.annotation.NameInMap("Creator")
    private String creator;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("EcsSpecs")
    private java.util.List<EcsSpecs> ecsSpecs;

    @com.aliyun.core.annotation.NameInMap("EmbeddingConfig")
    private EmbeddingConfig embeddingConfig;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
    private String gmtCreateTime;

    @com.aliyun.core.annotation.NameInMap("GmtFinishTime")
    private String gmtFinishTime;

    @com.aliyun.core.annotation.NameInMap("GmtModifiedTime")
    private String gmtModifiedTime;

    @com.aliyun.core.annotation.NameInMap("JobAction")
    private String jobAction;

    @com.aliyun.core.annotation.NameInMap("KnowledgeBaseId")
    private String knowledgeBaseId;

    @com.aliyun.core.annotation.NameInMap("KnowledgeBaseJobId")
    private String knowledgeBaseJobId;

    @com.aliyun.core.annotation.NameInMap("KnowledgeBaseJobResult")
    private KnowledgeBaseJobResult knowledgeBaseJobResult;

    @com.aliyun.core.annotation.NameInMap("MaxRunningTimeInSeconds")
    private Integer maxRunningTimeInSeconds;

    @com.aliyun.core.annotation.NameInMap("PipelineRunInfo")
    private PipelineRunInfo pipelineRunInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceId")
    private String resourceId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("UserVpc")
    private UserVpc userVpc;

    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private GetKnowledgeBaseJobResponseBody(Builder builder) {
        this.accessibility = builder.accessibility;
        this.creator = builder.creator;
        this.description = builder.description;
        this.ecsSpecs = builder.ecsSpecs;
        this.embeddingConfig = builder.embeddingConfig;
        this.errorMessage = builder.errorMessage;
        this.gmtCreateTime = builder.gmtCreateTime;
        this.gmtFinishTime = builder.gmtFinishTime;
        this.gmtModifiedTime = builder.gmtModifiedTime;
        this.jobAction = builder.jobAction;
        this.knowledgeBaseId = builder.knowledgeBaseId;
        this.knowledgeBaseJobId = builder.knowledgeBaseJobId;
        this.knowledgeBaseJobResult = builder.knowledgeBaseJobResult;
        this.maxRunningTimeInSeconds = builder.maxRunningTimeInSeconds;
        this.pipelineRunInfo = builder.pipelineRunInfo;
        this.requestId = builder.requestId;
        this.resourceId = builder.resourceId;
        this.status = builder.status;
        this.userVpc = builder.userVpc;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetKnowledgeBaseJobResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessibility
     */
    public String getAccessibility() {
        return this.accessibility;
    }

    /**
     * @return creator
     */
    public String getCreator() {
        return this.creator;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return ecsSpecs
     */
    public java.util.List<EcsSpecs> getEcsSpecs() {
        return this.ecsSpecs;
    }

    /**
     * @return embeddingConfig
     */
    public EmbeddingConfig getEmbeddingConfig() {
        return this.embeddingConfig;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return gmtCreateTime
     */
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    /**
     * @return gmtFinishTime
     */
    public String getGmtFinishTime() {
        return this.gmtFinishTime;
    }

    /**
     * @return gmtModifiedTime
     */
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    /**
     * @return jobAction
     */
    public String getJobAction() {
        return this.jobAction;
    }

    /**
     * @return knowledgeBaseId
     */
    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    /**
     * @return knowledgeBaseJobId
     */
    public String getKnowledgeBaseJobId() {
        return this.knowledgeBaseJobId;
    }

    /**
     * @return knowledgeBaseJobResult
     */
    public KnowledgeBaseJobResult getKnowledgeBaseJobResult() {
        return this.knowledgeBaseJobResult;
    }

    /**
     * @return maxRunningTimeInSeconds
     */
    public Integer getMaxRunningTimeInSeconds() {
        return this.maxRunningTimeInSeconds;
    }

    /**
     * @return pipelineRunInfo
     */
    public PipelineRunInfo getPipelineRunInfo() {
        return this.pipelineRunInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return userVpc
     */
    public UserVpc getUserVpc() {
        return this.userVpc;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder {
        private String accessibility; 
        private String creator; 
        private String description; 
        private java.util.List<EcsSpecs> ecsSpecs; 
        private EmbeddingConfig embeddingConfig; 
        private String errorMessage; 
        private String gmtCreateTime; 
        private String gmtFinishTime; 
        private String gmtModifiedTime; 
        private String jobAction; 
        private String knowledgeBaseId; 
        private String knowledgeBaseJobId; 
        private KnowledgeBaseJobResult knowledgeBaseJobResult; 
        private Integer maxRunningTimeInSeconds; 
        private PipelineRunInfo pipelineRunInfo; 
        private String requestId; 
        private String resourceId; 
        private String status; 
        private UserVpc userVpc; 
        private String workspaceId; 

        private Builder() {
        } 

        private Builder(GetKnowledgeBaseJobResponseBody model) {
            this.accessibility = model.accessibility;
            this.creator = model.creator;
            this.description = model.description;
            this.ecsSpecs = model.ecsSpecs;
            this.embeddingConfig = model.embeddingConfig;
            this.errorMessage = model.errorMessage;
            this.gmtCreateTime = model.gmtCreateTime;
            this.gmtFinishTime = model.gmtFinishTime;
            this.gmtModifiedTime = model.gmtModifiedTime;
            this.jobAction = model.jobAction;
            this.knowledgeBaseId = model.knowledgeBaseId;
            this.knowledgeBaseJobId = model.knowledgeBaseJobId;
            this.knowledgeBaseJobResult = model.knowledgeBaseJobResult;
            this.maxRunningTimeInSeconds = model.maxRunningTimeInSeconds;
            this.pipelineRunInfo = model.pipelineRunInfo;
            this.requestId = model.requestId;
            this.resourceId = model.resourceId;
            this.status = model.status;
            this.userVpc = model.userVpc;
            this.workspaceId = model.workspaceId;
        } 

        /**
         * <p>Workspace visibility, possible values are:</p>
         * <ul>
         * <li>PRIVATE: In this workspace, it is only visible to you and the administrators.</li>
         * <li>PUBLIC: In this workspace, visible to everyone.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PUBLIC</p>
         */
        public Builder accessibility(String accessibility) {
            this.accessibility = accessibility;
            return this;
        }

        /**
         * <p>Creator User ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2003******4844</p>
         */
        public Builder creator(String creator) {
            this.creator = creator;
            return this;
        }

        /**
         * <p>Knowledge Base Task Description.</p>
         * 
         * <strong>example:</strong>
         * <p>project name pass the check</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>Run Resource Configuration List</p>
         */
        public Builder ecsSpecs(java.util.List<EcsSpecs> ecsSpecs) {
            this.ecsSpecs = ecsSpecs;
            return this;
        }

        /**
         * <p>Index Configuration.</p>
         */
        public Builder embeddingConfig(EmbeddingConfig embeddingConfig) {
            this.embeddingConfig = embeddingConfig;
            return this;
        }

        /**
         * <p>Task error info.</p>
         * 
         * <strong>example:</strong>
         * <p>Failed to update knwoledge base index, pipelineRunId: flow-9p8f****4t9z</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>Task creation time (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2025-09-24T07:33:53Z</p>
         */
        public Builder gmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }

        /**
         * <p>Task end time (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2025-02-08T15:45:12Z</p>
         */
        public Builder gmtFinishTime(String gmtFinishTime) {
            this.gmtFinishTime = gmtFinishTime;
            return this;
        }

        /**
         * <p>Task Update Time (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2025-06-11T08:58:35.438Z</p>
         */
        public Builder gmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }

        /**
         * <p>Task Operation Type.</p>
         * <ul>
         * <li>SyncIndex: Update Knowledge Base Index</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>UpdateScheduleConfig</p>
         */
        public Builder jobAction(String jobAction) {
            this.jobAction = jobAction;
            return this;
        }

        /**
         * <p>Knowledge Base ID.</p>
         * 
         * <strong>example:</strong>
         * <p>d-nacr******sxd2</p>
         */
        public Builder knowledgeBaseId(String knowledgeBaseId) {
            this.knowledgeBaseId = knowledgeBaseId;
            return this;
        }

        /**
         * <p>Knowledge Base Task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>kbjob-9m******54</p>
         */
        public Builder knowledgeBaseJobId(String knowledgeBaseJobId) {
            this.knowledgeBaseJobId = knowledgeBaseJobId;
            return this;
        }

        /**
         * <p>Task Result.</p>
         */
        public Builder knowledgeBaseJobResult(KnowledgeBaseJobResult knowledgeBaseJobResult) {
            this.knowledgeBaseJobResult = knowledgeBaseJobResult;
            return this;
        }

        /**
         * <p>Maximum task running time, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>86400</p>
         */
        public Builder maxRunningTimeInSeconds(Integer maxRunningTimeInSeconds) {
            this.maxRunningTimeInSeconds = maxRunningTimeInSeconds;
            return this;
        }

        /**
         * <p>Workflow Run Info.</p>
         */
        public Builder pipelineRunInfo(PipelineRunInfo pipelineRunInfo) {
            this.pipelineRunInfo = pipelineRunInfo;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C25324E3-18E6-50D8-9026-16D74AAEEB26</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The resource group ID. Empty or public-cluster indicates public resource.</p>
         * 
         * <strong>example:</strong>
         * <p>quota89**76</p>
         */
        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        /**
         * <p>Knowledge Base Task Status</p>
         * <ul>
         * <li>Running: The instance is in operation.</li>
         * <li>Success: Run successfully.</li>
         * <li>Failed: Run failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>discovering</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>Task Run VPC Info.</p>
         */
        public Builder userVpc(UserVpc userVpc) {
            this.userVpc = userVpc;
            return this;
        }

        /**
         * <p>Knowledge Base workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>478***</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        public GetKnowledgeBaseJobResponseBody build() {
            return new GetKnowledgeBaseJobResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetKnowledgeBaseJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetKnowledgeBaseJobResponseBody</p>
     */
    public static class EcsSpecs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CPU")
        private Integer CPU;

        @com.aliyun.core.annotation.NameInMap("Driver")
        private String driver;

        @com.aliyun.core.annotation.NameInMap("GPU")
        private Integer GPU;

        @com.aliyun.core.annotation.NameInMap("GPUType")
        private String GPUType;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("Memory")
        private Integer memory;

        @com.aliyun.core.annotation.NameInMap("PodCount")
        private Integer podCount;

        @com.aliyun.core.annotation.NameInMap("SharedMemory")
        private Integer sharedMemory;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private EcsSpecs(Builder builder) {
            this.CPU = builder.CPU;
            this.driver = builder.driver;
            this.GPU = builder.GPU;
            this.GPUType = builder.GPUType;
            this.instanceType = builder.instanceType;
            this.memory = builder.memory;
            this.podCount = builder.podCount;
            this.sharedMemory = builder.sharedMemory;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EcsSpecs create() {
            return builder().build();
        }

        /**
         * @return CPU
         */
        public Integer getCPU() {
            return this.CPU;
        }

        /**
         * @return driver
         */
        public String getDriver() {
            return this.driver;
        }

        /**
         * @return GPU
         */
        public Integer getGPU() {
            return this.GPU;
        }

        /**
         * @return GPUType
         */
        public String getGPUType() {
            return this.GPUType;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return memory
         */
        public Integer getMemory() {
            return this.memory;
        }

        /**
         * @return podCount
         */
        public Integer getPodCount() {
            return this.podCount;
        }

        /**
         * @return sharedMemory
         */
        public Integer getSharedMemory() {
            return this.sharedMemory;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Integer CPU; 
            private String driver; 
            private Integer GPU; 
            private String GPUType; 
            private String instanceType; 
            private Integer memory; 
            private Integer podCount; 
            private Integer sharedMemory; 
            private String type; 

            private Builder() {
            } 

            private Builder(EcsSpecs model) {
                this.CPU = model.CPU;
                this.driver = model.driver;
                this.GPU = model.GPU;
                this.GPUType = model.GPUType;
                this.instanceType = model.instanceType;
                this.memory = model.memory;
                this.podCount = model.podCount;
                this.sharedMemory = model.sharedMemory;
                this.type = model.type;
            } 

            /**
             * <p>The number of CPU cores.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder CPU(Integer CPU) {
                this.CPU = CPU;
                return this;
            }

            /**
             * <p>Driver Version.</p>
             * 
             * <strong>example:</strong>
             * <p>535.161.08</p>
             */
            public Builder driver(String driver) {
                this.driver = driver;
                return this;
            }

            /**
             * <p>The number of GPU cards.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder GPU(Integer GPU) {
                this.GPU = GPU;
                return this;
            }

            /**
             * <p>GPU Class.</p>
             * 
             * <strong>example:</strong>
             * <p>V100</p>
             */
            public Builder GPUType(String GPUType) {
                this.GPUType = GPUType;
                return this;
            }

            /**
             * <p>Model name.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs.c6.large</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>Memory size, in GB.</p>
             * 
             * <strong>example:</strong>
             * <p>16</p>
             */
            public Builder memory(Integer memory) {
                this.memory = memory;
                return this;
            }

            /**
             * <p>Number of copies.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder podCount(Integer podCount) {
                this.podCount = podCount;
                return this;
            }

            /**
             * <p>Shared memory capacity, in units of GB.</p>
             * 
             * <strong>example:</strong>
             * <p>16</p>
             */
            public Builder sharedMemory(Integer sharedMemory) {
                this.sharedMemory = sharedMemory;
                return this;
            }

            /**
             * <p>Node type. Possible values are Head and Worker.</p>
             * 
             * <strong>example:</strong>
             * <p>Worker</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public EcsSpecs build() {
                return new EcsSpecs(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetKnowledgeBaseJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetKnowledgeBaseJobResponseBody</p>
     */
    public static class EmbeddingConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BatchSize")
        private Integer batchSize;

        @com.aliyun.core.annotation.NameInMap("Concurrency")
        @com.aliyun.core.annotation.Validation(maximum = 200, minimum = 1)
        private Integer concurrency;

        private EmbeddingConfig(Builder builder) {
            this.batchSize = builder.batchSize;
            this.concurrency = builder.concurrency;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EmbeddingConfig create() {
            return builder().build();
        }

        /**
         * @return batchSize
         */
        public Integer getBatchSize() {
            return this.batchSize;
        }

        /**
         * @return concurrency
         */
        public Integer getConcurrency() {
            return this.concurrency;
        }

        public static final class Builder {
            private Integer batchSize; 
            private Integer concurrency; 

            private Builder() {
            } 

            private Builder(EmbeddingConfig model) {
                this.batchSize = model.batchSize;
                this.concurrency = model.concurrency;
            } 

            /**
             * <p>Index batch size. Documentation and structured data types knowledge base is effective.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder batchSize(Integer batchSize) {
                this.batchSize = batchSize;
                return this;
            }

            /**
             * <p>Index concurrency. Image and Video Type Knowledge Base is valid.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder concurrency(Integer concurrency) {
                this.concurrency = concurrency;
                return this;
            }

            public EmbeddingConfig build() {
                return new EmbeddingConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetKnowledgeBaseJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetKnowledgeBaseJobResponseBody</p>
     */
    public static class KnowledgeBaseJobResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AddChunkCount")
        private Integer addChunkCount;

        @com.aliyun.core.annotation.NameInMap("DeleteChunkCount")
        private Integer deleteChunkCount;

        @com.aliyun.core.annotation.NameInMap("TotalFileCount")
        private Integer totalFileCount;

        private KnowledgeBaseJobResult(Builder builder) {
            this.addChunkCount = builder.addChunkCount;
            this.deleteChunkCount = builder.deleteChunkCount;
            this.totalFileCount = builder.totalFileCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static KnowledgeBaseJobResult create() {
            return builder().build();
        }

        /**
         * @return addChunkCount
         */
        public Integer getAddChunkCount() {
            return this.addChunkCount;
        }

        /**
         * @return deleteChunkCount
         */
        public Integer getDeleteChunkCount() {
            return this.deleteChunkCount;
        }

        /**
         * @return totalFileCount
         */
        public Integer getTotalFileCount() {
            return this.totalFileCount;
        }

        public static final class Builder {
            private Integer addChunkCount; 
            private Integer deleteChunkCount; 
            private Integer totalFileCount; 

            private Builder() {
            } 

            private Builder(KnowledgeBaseJobResult model) {
                this.addChunkCount = model.addChunkCount;
                this.deleteChunkCount = model.deleteChunkCount;
                this.totalFileCount = model.totalFileCount;
            } 

            /**
             * <p>Increase the number of Chunks</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder addChunkCount(Integer addChunkCount) {
                this.addChunkCount = addChunkCount;
                return this;
            }

            /**
             * <p>Delete Chunk Quantity</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder deleteChunkCount(Integer deleteChunkCount) {
                this.deleteChunkCount = deleteChunkCount;
                return this;
            }

            /**
             * <p>Total Number of Processed Files</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder totalFileCount(Integer totalFileCount) {
                this.totalFileCount = totalFileCount;
                return this;
            }

            public KnowledgeBaseJobResult build() {
                return new KnowledgeBaseJobResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetKnowledgeBaseJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetKnowledgeBaseJobResponseBody</p>
     */
    public static class PipelineRunInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PipelineRunId")
        private String pipelineRunId;

        private PipelineRunInfo(Builder builder) {
            this.pipelineRunId = builder.pipelineRunId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PipelineRunInfo create() {
            return builder().build();
        }

        /**
         * @return pipelineRunId
         */
        public String getPipelineRunId() {
            return this.pipelineRunId;
        }

        public static final class Builder {
            private String pipelineRunId; 

            private Builder() {
            } 

            private Builder(PipelineRunInfo model) {
                this.pipelineRunId = model.pipelineRunId;
            } 

            /**
             * <p>PaiFlow Workflow Run ID</p>
             * 
             * <strong>example:</strong>
             * <p>flow-fi8z******g4gy</p>
             */
            public Builder pipelineRunId(String pipelineRunId) {
                this.pipelineRunId = pipelineRunId;
                return this;
            }

            public PipelineRunInfo build() {
                return new PipelineRunInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetKnowledgeBaseJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetKnowledgeBaseJobResponseBody</p>
     */
    public static class UserVpc extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
        private String securityGroupId;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private UserVpc(Builder builder) {
            this.securityGroupId = builder.securityGroupId;
            this.vSwitchId = builder.vSwitchId;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserVpc create() {
            return builder().build();
        }

        /**
         * @return securityGroupId
         */
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String securityGroupId; 
            private String vSwitchId; 
            private String vpcId; 

            private Builder() {
            } 

            private Builder(UserVpc model) {
                this.securityGroupId = model.securityGroupId;
                this.vSwitchId = model.vSwitchId;
                this.vpcId = model.vpcId;
            } 

            /**
             * <p>Security Group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>sg-wz91****e10e</p>
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * <p>Switch ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-wz9r****ng10</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>VPC ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-wz90****5v23</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public UserVpc build() {
                return new UserVpc(this);
            } 

        } 

    }
}
