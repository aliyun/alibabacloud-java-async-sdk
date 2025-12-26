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
         * KnowledgeBaseId.
         */
        public Builder knowledgeBaseId(String knowledgeBaseId) {
            this.putPathParameter("KnowledgeBaseId", knowledgeBaseId);
            this.knowledgeBaseId = knowledgeBaseId;
            return this;
        }

        /**
         * Accessibility.
         */
        public Builder accessibility(String accessibility) {
            this.putBodyParameter("Accessibility", accessibility);
            this.accessibility = accessibility;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * EcsSpecs.
         */
        public Builder ecsSpecs(java.util.List<EcsSpecs> ecsSpecs) {
            this.putBodyParameter("EcsSpecs", ecsSpecs);
            this.ecsSpecs = ecsSpecs;
            return this;
        }

        /**
         * EmbeddingConfig.
         */
        public Builder embeddingConfig(EmbeddingConfig embeddingConfig) {
            this.putBodyParameter("EmbeddingConfig", embeddingConfig);
            this.embeddingConfig = embeddingConfig;
            return this;
        }

        /**
         * JobAction.
         */
        public Builder jobAction(String jobAction) {
            this.putBodyParameter("JobAction", jobAction);
            this.jobAction = jobAction;
            return this;
        }

        /**
         * MaxRunningTimeInSeconds.
         */
        public Builder maxRunningTimeInSeconds(Integer maxRunningTimeInSeconds) {
            this.putBodyParameter("MaxRunningTimeInSeconds", maxRunningTimeInSeconds);
            this.maxRunningTimeInSeconds = maxRunningTimeInSeconds;
            return this;
        }

        /**
         * ResourceId.
         */
        public Builder resourceId(String resourceId) {
            this.putBodyParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * UserVpc.
         */
        public Builder userVpc(UserVpc userVpc) {
            this.putBodyParameter("UserVpc", userVpc);
            this.userVpc = userVpc;
            return this;
        }

        /**
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
             * <p>CPU核数</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder CPU(Integer CPU) {
                this.CPU = CPU;
                return this;
            }

            /**
             * <p>驱动版本</p>
             * 
             * <strong>example:</strong>
             * <p>535.161.08</p>
             */
            public Builder driver(String driver) {
                this.driver = driver;
                return this;
            }

            /**
             * <p>GPU卡数</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder GPU(Integer GPU) {
                this.GPU = GPU;
                return this;
            }

            /**
             * <p>GPU类型</p>
             */
            public Builder GPUType(String GPUType) {
                this.GPUType = GPUType;
                return this;
            }

            /**
             * <p>机型名称</p>
             * 
             * <strong>example:</strong>
             * <p>ecs.c6.large</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>内存大小</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder memory(Integer memory) {
                this.memory = memory;
                return this;
            }

            /**
             * <p>副本数量</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder podCount(Integer podCount) {
                this.podCount = podCount;
                return this;
            }

            /**
             * <p>共享内存容量</p>
             */
            public Builder sharedMemory(Integer sharedMemory) {
                this.sharedMemory = sharedMemory;
                return this;
            }

            /**
             * <p>节点类型</p>
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
             * <p>Embedding分批大小</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder batchSize(Integer batchSize) {
                this.batchSize = batchSize;
                return this;
            }

            /**
             * <p>Embedding并发数</p>
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
             * <p>安全组ID</p>
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * <p>交换机ID</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>VPC ID。</p>
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
