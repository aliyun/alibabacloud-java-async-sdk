// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808.models;

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
 * {@link UpdateRayClusterRequest} extends {@link RequestModel}
 *
 * <p>UpdateRayClusterRequest</p>
 */
public class UpdateRayClusterRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    private String workspaceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("clusterId")
    private String clusterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("displayReleaseVersion")
    private String displayReleaseVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("extraParam")
    private String extraParam;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("headSpec")
    private HeadSpec headSpec;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("networkServiceName")
    private String networkServiceName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("workerSpec")
    private java.util.List<WorkerSpec> workerSpec;

    private UpdateRayClusterRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.clusterId = builder.clusterId;
        this.description = builder.description;
        this.displayReleaseVersion = builder.displayReleaseVersion;
        this.extraParam = builder.extraParam;
        this.headSpec = builder.headSpec;
        this.name = builder.name;
        this.networkServiceName = builder.networkServiceName;
        this.workerSpec = builder.workerSpec;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateRayClusterRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return displayReleaseVersion
     */
    public String getDisplayReleaseVersion() {
        return this.displayReleaseVersion;
    }

    /**
     * @return extraParam
     */
    public String getExtraParam() {
        return this.extraParam;
    }

    /**
     * @return headSpec
     */
    public HeadSpec getHeadSpec() {
        return this.headSpec;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return networkServiceName
     */
    public String getNetworkServiceName() {
        return this.networkServiceName;
    }

    /**
     * @return workerSpec
     */
    public java.util.List<WorkerSpec> getWorkerSpec() {
        return this.workerSpec;
    }

    public static final class Builder extends Request.Builder<UpdateRayClusterRequest, Builder> {
        private String workspaceId; 
        private String clusterId; 
        private String description; 
        private String displayReleaseVersion; 
        private String extraParam; 
        private HeadSpec headSpec; 
        private String name; 
        private String networkServiceName; 
        private java.util.List<WorkerSpec> workerSpec; 

        private Builder() {
            super();
        } 

        private Builder(UpdateRayClusterRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.clusterId = request.clusterId;
            this.description = request.description;
            this.displayReleaseVersion = request.displayReleaseVersion;
            this.extraParam = request.extraParam;
            this.headSpec = request.headSpec;
            this.name = request.name;
            this.networkServiceName = request.networkServiceName;
            this.workerSpec = request.workerSpec;
        } 

        /**
         * workspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * clusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("clusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * displayReleaseVersion.
         */
        public Builder displayReleaseVersion(String displayReleaseVersion) {
            this.putBodyParameter("displayReleaseVersion", displayReleaseVersion);
            this.displayReleaseVersion = displayReleaseVersion;
            return this;
        }

        /**
         * extraParam.
         */
        public Builder extraParam(String extraParam) {
            this.putBodyParameter("extraParam", extraParam);
            this.extraParam = extraParam;
            return this;
        }

        /**
         * headSpec.
         */
        public Builder headSpec(HeadSpec headSpec) {
            this.putBodyParameter("headSpec", headSpec);
            this.headSpec = headSpec;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * networkServiceName.
         */
        public Builder networkServiceName(String networkServiceName) {
            this.putBodyParameter("networkServiceName", networkServiceName);
            this.networkServiceName = networkServiceName;
            return this;
        }

        /**
         * workerSpec.
         */
        public Builder workerSpec(java.util.List<WorkerSpec> workerSpec) {
            this.putBodyParameter("workerSpec", workerSpec);
            this.workerSpec = workerSpec;
            return this;
        }

        @Override
        public UpdateRayClusterRequest build() {
            return new UpdateRayClusterRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateRayClusterRequest} extends {@link TeaModel}
     *
     * <p>UpdateRayClusterRequest</p>
     */
    public static class HeadSpec extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cpu")
        private String cpu;

        @com.aliyun.core.annotation.NameInMap("enableAutoScaling")
        private Boolean enableAutoScaling;

        @com.aliyun.core.annotation.NameInMap("idleTimeoutSeconds")
        private Integer idleTimeoutSeconds;

        @com.aliyun.core.annotation.NameInMap("memory")
        private String memory;

        @com.aliyun.core.annotation.NameInMap("queueName")
        private String queueName;

        private HeadSpec(Builder builder) {
            this.cpu = builder.cpu;
            this.enableAutoScaling = builder.enableAutoScaling;
            this.idleTimeoutSeconds = builder.idleTimeoutSeconds;
            this.memory = builder.memory;
            this.queueName = builder.queueName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HeadSpec create() {
            return builder().build();
        }

        /**
         * @return cpu
         */
        public String getCpu() {
            return this.cpu;
        }

        /**
         * @return enableAutoScaling
         */
        public Boolean getEnableAutoScaling() {
            return this.enableAutoScaling;
        }

        /**
         * @return idleTimeoutSeconds
         */
        public Integer getIdleTimeoutSeconds() {
            return this.idleTimeoutSeconds;
        }

        /**
         * @return memory
         */
        public String getMemory() {
            return this.memory;
        }

        /**
         * @return queueName
         */
        public String getQueueName() {
            return this.queueName;
        }

        public static final class Builder {
            private String cpu; 
            private Boolean enableAutoScaling; 
            private Integer idleTimeoutSeconds; 
            private String memory; 
            private String queueName; 

            private Builder() {
            } 

            private Builder(HeadSpec model) {
                this.cpu = model.cpu;
                this.enableAutoScaling = model.enableAutoScaling;
                this.idleTimeoutSeconds = model.idleTimeoutSeconds;
                this.memory = model.memory;
                this.queueName = model.queueName;
            } 

            /**
             * cpu.
             */
            public Builder cpu(String cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * enableAutoScaling.
             */
            public Builder enableAutoScaling(Boolean enableAutoScaling) {
                this.enableAutoScaling = enableAutoScaling;
                return this;
            }

            /**
             * idleTimeoutSeconds.
             */
            public Builder idleTimeoutSeconds(Integer idleTimeoutSeconds) {
                this.idleTimeoutSeconds = idleTimeoutSeconds;
                return this;
            }

            /**
             * memory.
             */
            public Builder memory(String memory) {
                this.memory = memory;
                return this;
            }

            /**
             * queueName.
             */
            public Builder queueName(String queueName) {
                this.queueName = queueName;
                return this;
            }

            public HeadSpec build() {
                return new HeadSpec(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateRayClusterRequest} extends {@link TeaModel}
     *
     * <p>UpdateRayClusterRequest</p>
     */
    public static class WorkerSpec extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cpu")
        private String cpu;

        @com.aliyun.core.annotation.NameInMap("groupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("maxReplica")
        private Integer maxReplica;

        @com.aliyun.core.annotation.NameInMap("memory")
        private String memory;

        @com.aliyun.core.annotation.NameInMap("minReplica")
        private Integer minReplica;

        @com.aliyun.core.annotation.NameInMap("queueName")
        private String queueName;

        @com.aliyun.core.annotation.NameInMap("replica")
        private Integer replica;

        @com.aliyun.core.annotation.NameInMap("workerType")
        private String workerType;

        private WorkerSpec(Builder builder) {
            this.cpu = builder.cpu;
            this.groupName = builder.groupName;
            this.maxReplica = builder.maxReplica;
            this.memory = builder.memory;
            this.minReplica = builder.minReplica;
            this.queueName = builder.queueName;
            this.replica = builder.replica;
            this.workerType = builder.workerType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WorkerSpec create() {
            return builder().build();
        }

        /**
         * @return cpu
         */
        public String getCpu() {
            return this.cpu;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return maxReplica
         */
        public Integer getMaxReplica() {
            return this.maxReplica;
        }

        /**
         * @return memory
         */
        public String getMemory() {
            return this.memory;
        }

        /**
         * @return minReplica
         */
        public Integer getMinReplica() {
            return this.minReplica;
        }

        /**
         * @return queueName
         */
        public String getQueueName() {
            return this.queueName;
        }

        /**
         * @return replica
         */
        public Integer getReplica() {
            return this.replica;
        }

        /**
         * @return workerType
         */
        public String getWorkerType() {
            return this.workerType;
        }

        public static final class Builder {
            private String cpu; 
            private String groupName; 
            private Integer maxReplica; 
            private String memory; 
            private Integer minReplica; 
            private String queueName; 
            private Integer replica; 
            private String workerType; 

            private Builder() {
            } 

            private Builder(WorkerSpec model) {
                this.cpu = model.cpu;
                this.groupName = model.groupName;
                this.maxReplica = model.maxReplica;
                this.memory = model.memory;
                this.minReplica = model.minReplica;
                this.queueName = model.queueName;
                this.replica = model.replica;
                this.workerType = model.workerType;
            } 

            /**
             * cpu.
             */
            public Builder cpu(String cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * groupName.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * maxReplica.
             */
            public Builder maxReplica(Integer maxReplica) {
                this.maxReplica = maxReplica;
                return this;
            }

            /**
             * memory.
             */
            public Builder memory(String memory) {
                this.memory = memory;
                return this;
            }

            /**
             * minReplica.
             */
            public Builder minReplica(Integer minReplica) {
                this.minReplica = minReplica;
                return this;
            }

            /**
             * queueName.
             */
            public Builder queueName(String queueName) {
                this.queueName = queueName;
                return this;
            }

            /**
             * replica.
             */
            public Builder replica(Integer replica) {
                this.replica = replica;
                return this;
            }

            /**
             * workerType.
             */
            public Builder workerType(String workerType) {
                this.workerType = workerType;
                return this;
            }

            public WorkerSpec build() {
                return new WorkerSpec(this);
            } 

        } 

    }
}
