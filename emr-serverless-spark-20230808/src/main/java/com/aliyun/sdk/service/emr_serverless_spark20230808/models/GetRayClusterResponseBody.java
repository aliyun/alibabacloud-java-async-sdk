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
 * {@link GetRayClusterResponseBody} extends {@link TeaModel}
 *
 * <p>GetRayClusterResponseBody</p>
 */
public class GetRayClusterResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("clusterId")
    private String clusterId;

    @com.aliyun.core.annotation.NameInMap("createTime")
    private Long createTime;

    @com.aliyun.core.annotation.NameInMap("creator")
    private String creator;

    @com.aliyun.core.annotation.NameInMap("creatorName")
    private String creatorName;

    @com.aliyun.core.annotation.NameInMap("dashboardUrl")
    private String dashboardUrl;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("displayReleaseVersion")
    private String displayReleaseVersion;

    @com.aliyun.core.annotation.NameInMap("extraParam")
    private String extraParam;

    @com.aliyun.core.annotation.NameInMap("grpcEndpoint")
    private String grpcEndpoint;

    @com.aliyun.core.annotation.NameInMap("headSpec")
    private HeadSpec headSpec;

    @com.aliyun.core.annotation.NameInMap("instanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("instances")
    private java.util.List<Instances> instances;

    @com.aliyun.core.annotation.NameInMap("jobUrl")
    private String jobUrl;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("modified")
    private Boolean modified;

    @com.aliyun.core.annotation.NameInMap("modifiedTime")
    private Long modifiedTime;

    @com.aliyun.core.annotation.NameInMap("modifier")
    private String modifier;

    @com.aliyun.core.annotation.NameInMap("modifierName")
    private String modifierName;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("networkServiceName")
    private String networkServiceName;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("startTime")
    private Long startTime;

    @com.aliyun.core.annotation.NameInMap("state")
    private String state;

    @com.aliyun.core.annotation.NameInMap("submitToken")
    private String submitToken;

    @com.aliyun.core.annotation.NameInMap("userId")
    private String userId;

    @com.aliyun.core.annotation.NameInMap("workerSpec")
    private java.util.List<WorkerSpec> workerSpec;

    private GetRayClusterResponseBody(Builder builder) {
        this.clusterId = builder.clusterId;
        this.createTime = builder.createTime;
        this.creator = builder.creator;
        this.creatorName = builder.creatorName;
        this.dashboardUrl = builder.dashboardUrl;
        this.description = builder.description;
        this.displayReleaseVersion = builder.displayReleaseVersion;
        this.extraParam = builder.extraParam;
        this.grpcEndpoint = builder.grpcEndpoint;
        this.headSpec = builder.headSpec;
        this.instanceId = builder.instanceId;
        this.instances = builder.instances;
        this.jobUrl = builder.jobUrl;
        this.message = builder.message;
        this.modified = builder.modified;
        this.modifiedTime = builder.modifiedTime;
        this.modifier = builder.modifier;
        this.modifierName = builder.modifierName;
        this.name = builder.name;
        this.networkServiceName = builder.networkServiceName;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
        this.state = builder.state;
        this.submitToken = builder.submitToken;
        this.userId = builder.userId;
        this.workerSpec = builder.workerSpec;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRayClusterResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return createTime
     */
    public Long getCreateTime() {
        return this.createTime;
    }

    /**
     * @return creator
     */
    public String getCreator() {
        return this.creator;
    }

    /**
     * @return creatorName
     */
    public String getCreatorName() {
        return this.creatorName;
    }

    /**
     * @return dashboardUrl
     */
    public String getDashboardUrl() {
        return this.dashboardUrl;
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
     * @return grpcEndpoint
     */
    public String getGrpcEndpoint() {
        return this.grpcEndpoint;
    }

    /**
     * @return headSpec
     */
    public HeadSpec getHeadSpec() {
        return this.headSpec;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instances
     */
    public java.util.List<Instances> getInstances() {
        return this.instances;
    }

    /**
     * @return jobUrl
     */
    public String getJobUrl() {
        return this.jobUrl;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return modified
     */
    public Boolean getModified() {
        return this.modified;
    }

    /**
     * @return modifiedTime
     */
    public Long getModifiedTime() {
        return this.modifiedTime;
    }

    /**
     * @return modifier
     */
    public String getModifier() {
        return this.modifier;
    }

    /**
     * @return modifierName
     */
    public String getModifierName() {
        return this.modifierName;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return state
     */
    public String getState() {
        return this.state;
    }

    /**
     * @return submitToken
     */
    public String getSubmitToken() {
        return this.submitToken;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return workerSpec
     */
    public java.util.List<WorkerSpec> getWorkerSpec() {
        return this.workerSpec;
    }

    public static final class Builder {
        private String clusterId; 
        private Long createTime; 
        private String creator; 
        private String creatorName; 
        private String dashboardUrl; 
        private String description; 
        private String displayReleaseVersion; 
        private String extraParam; 
        private String grpcEndpoint; 
        private HeadSpec headSpec; 
        private String instanceId; 
        private java.util.List<Instances> instances; 
        private String jobUrl; 
        private String message; 
        private Boolean modified; 
        private Long modifiedTime; 
        private String modifier; 
        private String modifierName; 
        private String name; 
        private String networkServiceName; 
        private String requestId; 
        private Long startTime; 
        private String state; 
        private String submitToken; 
        private String userId; 
        private java.util.List<WorkerSpec> workerSpec; 

        private Builder() {
        } 

        private Builder(GetRayClusterResponseBody model) {
            this.clusterId = model.clusterId;
            this.createTime = model.createTime;
            this.creator = model.creator;
            this.creatorName = model.creatorName;
            this.dashboardUrl = model.dashboardUrl;
            this.description = model.description;
            this.displayReleaseVersion = model.displayReleaseVersion;
            this.extraParam = model.extraParam;
            this.grpcEndpoint = model.grpcEndpoint;
            this.headSpec = model.headSpec;
            this.instanceId = model.instanceId;
            this.instances = model.instances;
            this.jobUrl = model.jobUrl;
            this.message = model.message;
            this.modified = model.modified;
            this.modifiedTime = model.modifiedTime;
            this.modifier = model.modifier;
            this.modifierName = model.modifierName;
            this.name = model.name;
            this.networkServiceName = model.networkServiceName;
            this.requestId = model.requestId;
            this.startTime = model.startTime;
            this.state = model.state;
            this.submitToken = model.submitToken;
            this.userId = model.userId;
            this.workerSpec = model.workerSpec;
        } 

        /**
         * clusterId.
         */
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        /**
         * createTime.
         */
        public Builder createTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * creator.
         */
        public Builder creator(String creator) {
            this.creator = creator;
            return this;
        }

        /**
         * creatorName.
         */
        public Builder creatorName(String creatorName) {
            this.creatorName = creatorName;
            return this;
        }

        /**
         * dashboardUrl.
         */
        public Builder dashboardUrl(String dashboardUrl) {
            this.dashboardUrl = dashboardUrl;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * displayReleaseVersion.
         */
        public Builder displayReleaseVersion(String displayReleaseVersion) {
            this.displayReleaseVersion = displayReleaseVersion;
            return this;
        }

        /**
         * extraParam.
         */
        public Builder extraParam(String extraParam) {
            this.extraParam = extraParam;
            return this;
        }

        /**
         * grpcEndpoint.
         */
        public Builder grpcEndpoint(String grpcEndpoint) {
            this.grpcEndpoint = grpcEndpoint;
            return this;
        }

        /**
         * headSpec.
         */
        public Builder headSpec(HeadSpec headSpec) {
            this.headSpec = headSpec;
            return this;
        }

        /**
         * instanceId.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * instances.
         */
        public Builder instances(java.util.List<Instances> instances) {
            this.instances = instances;
            return this;
        }

        /**
         * jobUrl.
         */
        public Builder jobUrl(String jobUrl) {
            this.jobUrl = jobUrl;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * modified.
         */
        public Builder modified(Boolean modified) {
            this.modified = modified;
            return this;
        }

        /**
         * modifiedTime.
         */
        public Builder modifiedTime(Long modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }

        /**
         * modifier.
         */
        public Builder modifier(String modifier) {
            this.modifier = modifier;
            return this;
        }

        /**
         * modifierName.
         */
        public Builder modifierName(String modifierName) {
            this.modifierName = modifierName;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * networkServiceName.
         */
        public Builder networkServiceName(String networkServiceName) {
            this.networkServiceName = networkServiceName;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * startTime.
         */
        public Builder startTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * state.
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        /**
         * submitToken.
         */
        public Builder submitToken(String submitToken) {
            this.submitToken = submitToken;
            return this;
        }

        /**
         * userId.
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        /**
         * workerSpec.
         */
        public Builder workerSpec(java.util.List<WorkerSpec> workerSpec) {
            this.workerSpec = workerSpec;
            return this;
        }

        public GetRayClusterResponseBody build() {
            return new GetRayClusterResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetRayClusterResponseBody} extends {@link TeaModel}
     *
     * <p>GetRayClusterResponseBody</p>
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

        @com.aliyun.core.annotation.NameInMap("replica")
        private Integer replica;

        private HeadSpec(Builder builder) {
            this.cpu = builder.cpu;
            this.enableAutoScaling = builder.enableAutoScaling;
            this.idleTimeoutSeconds = builder.idleTimeoutSeconds;
            this.memory = builder.memory;
            this.queueName = builder.queueName;
            this.replica = builder.replica;
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

        /**
         * @return replica
         */
        public Integer getReplica() {
            return this.replica;
        }

        public static final class Builder {
            private String cpu; 
            private Boolean enableAutoScaling; 
            private Integer idleTimeoutSeconds; 
            private String memory; 
            private String queueName; 
            private Integer replica; 

            private Builder() {
            } 

            private Builder(HeadSpec model) {
                this.cpu = model.cpu;
                this.enableAutoScaling = model.enableAutoScaling;
                this.idleTimeoutSeconds = model.idleTimeoutSeconds;
                this.memory = model.memory;
                this.queueName = model.queueName;
                this.replica = model.replica;
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

            /**
             * replica.
             */
            public Builder replica(Integer replica) {
                this.replica = replica;
                return this;
            }

            public HeadSpec build() {
                return new HeadSpec(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetRayClusterResponseBody} extends {@link TeaModel}
     *
     * <p>GetRayClusterResponseBody</p>
     */
    public static class Instances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("containerExitCode")
        private Integer containerExitCode;

        @com.aliyun.core.annotation.NameInMap("containerState")
        private String containerState;

        @com.aliyun.core.annotation.NameInMap("containerStateMessage")
        private String containerStateMessage;

        @com.aliyun.core.annotation.NameInMap("containerStateReason")
        private String containerStateReason;

        @com.aliyun.core.annotation.NameInMap("createTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("instanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("phase")
        private String phase;

        @com.aliyun.core.annotation.NameInMap("reason")
        private String reason;

        @com.aliyun.core.annotation.NameInMap("startTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Instances(Builder builder) {
            this.containerExitCode = builder.containerExitCode;
            this.containerState = builder.containerState;
            this.containerStateMessage = builder.containerStateMessage;
            this.containerStateReason = builder.containerStateReason;
            this.createTime = builder.createTime;
            this.instanceId = builder.instanceId;
            this.message = builder.message;
            this.phase = builder.phase;
            this.reason = builder.reason;
            this.startTime = builder.startTime;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instances create() {
            return builder().build();
        }

        /**
         * @return containerExitCode
         */
        public Integer getContainerExitCode() {
            return this.containerExitCode;
        }

        /**
         * @return containerState
         */
        public String getContainerState() {
            return this.containerState;
        }

        /**
         * @return containerStateMessage
         */
        public String getContainerStateMessage() {
            return this.containerStateMessage;
        }

        /**
         * @return containerStateReason
         */
        public String getContainerStateReason() {
            return this.containerStateReason;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return phase
         */
        public String getPhase() {
            return this.phase;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Integer containerExitCode; 
            private String containerState; 
            private String containerStateMessage; 
            private String containerStateReason; 
            private Long createTime; 
            private String instanceId; 
            private String message; 
            private String phase; 
            private String reason; 
            private Long startTime; 
            private String type; 

            private Builder() {
            } 

            private Builder(Instances model) {
                this.containerExitCode = model.containerExitCode;
                this.containerState = model.containerState;
                this.containerStateMessage = model.containerStateMessage;
                this.containerStateReason = model.containerStateReason;
                this.createTime = model.createTime;
                this.instanceId = model.instanceId;
                this.message = model.message;
                this.phase = model.phase;
                this.reason = model.reason;
                this.startTime = model.startTime;
                this.type = model.type;
            } 

            /**
             * containerExitCode.
             */
            public Builder containerExitCode(Integer containerExitCode) {
                this.containerExitCode = containerExitCode;
                return this;
            }

            /**
             * containerState.
             */
            public Builder containerState(String containerState) {
                this.containerState = containerState;
                return this;
            }

            /**
             * containerStateMessage.
             */
            public Builder containerStateMessage(String containerStateMessage) {
                this.containerStateMessage = containerStateMessage;
                return this;
            }

            /**
             * containerStateReason.
             */
            public Builder containerStateReason(String containerStateReason) {
                this.containerStateReason = containerStateReason;
                return this;
            }

            /**
             * createTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * instanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * phase.
             */
            public Builder phase(String phase) {
                this.phase = phase;
                return this;
            }

            /**
             * reason.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * startTime.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Instances build() {
                return new Instances(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetRayClusterResponseBody} extends {@link TeaModel}
     *
     * <p>GetRayClusterResponseBody</p>
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
