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
 * {@link CreateKnowledgeBaseJobRequest} extends {@link RequestModel}
 *
 * <p>CreateKnowledgeBaseJobRequest</p>
 */
public class CreateKnowledgeBaseJobRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("KnowledgeBaseId")
    private String knowledgeBaseId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Accessibility")
    private String accessibility;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EcsSpecs")
    private java.util.List<EcsSpecs> ecsSpecs;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EmbeddingConfig")
    private EmbeddingConfig embeddingConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("JobAction")
    private String jobAction;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxRunningTimeInSeconds")
    private Integer maxRunningTimeInSeconds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceId")
    private String resourceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserVpc")
    private UserVpc userVpc;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private CreateKnowledgeBaseJobRequest(Builder builder) {
        super(builder);
        this.knowledgeBaseId = builder.knowledgeBaseId;
        this.accessibility = builder.accessibility;
        this.description = builder.description;
        this.ecsSpecs = builder.ecsSpecs;
        this.embeddingConfig = builder.embeddingConfig;
        this.jobAction = builder.jobAction;
        this.maxRunningTimeInSeconds = builder.maxRunningTimeInSeconds;
        this.resourceId = builder.resourceId;
        this.userVpc = builder.userVpc;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateKnowledgeBaseJobRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return knowledgeBaseId
     */
    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    /**
     * @return accessibility
     */
    public String getAccessibility() {
        return this.accessibility;
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
     * @return jobAction
     */
    public String getJobAction() {
        return this.jobAction;
    }

    /**
     * @return maxRunningTimeInSeconds
     */
    public Integer getMaxRunningTimeInSeconds() {
        return this.maxRunningTimeInSeconds;
    }

    /**
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
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

    public static final class Builder extends Request.Builder<CreateKnowledgeBaseJobRequest, Builder> {
        private String knowledgeBaseId; 
        private String accessibility; 
        private String description; 
        private java.util.List<EcsSpecs> ecsSpecs; 
        private EmbeddingConfig embeddingConfig; 
        private String jobAction; 
        private Integer maxRunningTimeInSeconds; 
        private String resourceId; 
        private UserVpc userVpc; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateKnowledgeBaseJobRequest request) {
            super(request);
            this.knowledgeBaseId = request.knowledgeBaseId;
            this.accessibility = request.accessibility;
            this.description = request.description;
            this.ecsSpecs = request.ecsSpecs;
            this.embeddingConfig = request.embeddingConfig;
            this.jobAction = request.jobAction;
            this.maxRunningTimeInSeconds = request.maxRunningTimeInSeconds;
            this.resourceId = request.resourceId;
            this.userVpc = request.userVpc;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * <p>The ID of the Knowledge Base.</p>
         * 
         * <strong>example:</strong>
         * <p>d-ksicx823d</p>
         */
        public Builder knowledgeBaseId(String knowledgeBaseId) {
            this.putPathParameter("KnowledgeBaseId", knowledgeBaseId);
            this.knowledgeBaseId = knowledgeBaseId;
            return this;
        }

        /**
         * <p>Workspace visibility. Possible values are:</p>
         * <ul>
         * <li>PRIVATE: In this workspace, it is visible only to you and the administrator.</li>
         * <li>PUBLIC: This workspace is visible to all users.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PUBLIC</p>
         */
        public Builder accessibility(String accessibility) {
            this.putBodyParameter("Accessibility", accessibility);
            this.accessibility = accessibility;
            return this;
        }

        /**
         * <p>Knowledge base task description.</p>
         * 
         * <strong>example:</strong>
         * <p>This is a description of the knowledge base job.</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>Task Run Resource Configuration List Documentation and structured Knowledge Base contain only one Element and the Type is Worker. Images and Videos Knowledge Base contain two Elements and the Types are Head and Worker.</p>
         */
        public Builder ecsSpecs(java.util.List<EcsSpecs> ecsSpecs) {
            this.putBodyParameter("EcsSpecs", ecsSpecs);
            this.ecsSpecs = ecsSpecs;
            return this;
        }

        /**
         * <p>Index Configuration.</p>
         */
        public Builder embeddingConfig(EmbeddingConfig embeddingConfig) {
            this.putBodyParameter("EmbeddingConfig", embeddingConfig);
            this.embeddingConfig = embeddingConfig;
            return this;
        }

        /**
         * <p>The type of the task operation.</p>
         * <ul>
         * <li>SyncIndex: updates the knowledge base index</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SyncIndex</p>
         */
        public Builder jobAction(String jobAction) {
            this.putBodyParameter("JobAction", jobAction);
            this.jobAction = jobAction;
            return this;
        }

        /**
         * <p>The maximum running time for the task, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>86400</p>
         */
        public Builder maxRunningTimeInSeconds(Integer maxRunningTimeInSeconds) {
            this.putBodyParameter("MaxRunningTimeInSeconds", maxRunningTimeInSeconds);
            this.maxRunningTimeInSeconds = maxRunningTimeInSeconds;
            return this;
        }

        /**
         * <p>The resource group ID. This field being empty or public-cluster indicates a public resource.</p>
         * 
         * <strong>example:</strong>
         * <p>public-cluster</p>
         */
        public Builder resourceId(String resourceId) {
            this.putBodyParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * <p>Task Run VPC Info.</p>
         */
        public Builder userVpc(UserVpc userVpc) {
            this.putBodyParameter("UserVpc", userVpc);
            this.userVpc = userVpc;
            return this;
        }

        /**
         * <p>The ID of the workspace. For information on how to obtain the workspace ID, see ListWorkspaces.<a href="~~449124~~"></a></p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>478**</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public CreateKnowledgeBaseJobRequest build() {
            return new CreateKnowledgeBaseJobRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateKnowledgeBaseJobRequest} extends {@link TeaModel}
     *
     * <p>CreateKnowledgeBaseJobRequest</p>
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
             * <p>The number of CPU cores. You must specify the resource quota to use.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder CPU(Integer CPU) {
                this.CPU = CPU;
                return this;
            }

            /**
             * <p>The version of the GPU driver.</p>
             * 
             * <strong>example:</strong>
             * <p>535.161.08</p>
             */
            public Builder driver(String driver) {
                this.driver = driver;
                return this;
            }

            /**
             * <p>The number of GPU cards. You must specify the resource quota to use.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder GPU(Integer GPU) {
                this.GPU = GPU;
                return this;
            }

            /**
             * <p>GPU Class</p>
             * 
             * <strong>example:</strong>
             * <p>16</p>
             */
            public Builder GPUType(String GPUType) {
                this.GPUType = GPUType;
                return this;
            }

            /**
             * <p>The name of the instance type. Use of public resources must be filled in.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs.c6.large</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The memory size, in GB. You must specify the resource quota to use.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder memory(Integer memory) {
                this.memory = memory;
                return this;
            }

            /**
             * <p>The number of replicas.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder podCount(Integer podCount) {
                this.podCount = podCount;
                return this;
            }

            /**
             * <p>The Shared Memory Capacity. Unit: GB. You must specify the resource quota to use.</p>
             * 
             * <strong>example:</strong>
             * <p>16</p>
             */
            public Builder sharedMemory(Integer sharedMemory) {
                this.sharedMemory = sharedMemory;
                return this;
            }

            /**
             * <p>The type of the node. Possible values are Head and Worker.</p>
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
     * {@link CreateKnowledgeBaseJobRequest} extends {@link TeaModel}
     *
     * <p>CreateKnowledgeBaseJobRequest</p>
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
             * <p>Index batch size. The knowledge base for documentation and structured data types is effective.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder batchSize(Integer batchSize) {
                this.batchSize = batchSize;
                return this;
            }

            /**
             * <p>Index concurrency. Image and video type knowledge base is valid.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
     * {@link CreateKnowledgeBaseJobRequest} extends {@link TeaModel}
     *
     * <p>CreateKnowledgeBaseJobRequest</p>
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
             * <p>The ID of a security group.</p>
             * 
             * <strong>example:</strong>
             * <p>sg-wz9i****1129</p>
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * <p>The vSwitch IDs.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-wz9r****ng10</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>VPC ID</p>
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
