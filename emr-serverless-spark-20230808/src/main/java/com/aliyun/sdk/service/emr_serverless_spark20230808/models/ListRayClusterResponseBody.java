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
 * {@link ListRayClusterResponseBody} extends {@link TeaModel}
 *
 * <p>ListRayClusterResponseBody</p>
 */
public class ListRayClusterResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("rayClusters")
    private java.util.List<RayClusters> rayClusters;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ListRayClusterResponseBody(Builder builder) {
        this.rayClusters = builder.rayClusters;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRayClusterResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return rayClusters
     */
    public java.util.List<RayClusters> getRayClusters() {
        return this.rayClusters;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<RayClusters> rayClusters; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListRayClusterResponseBody model) {
            this.rayClusters = model.rayClusters;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The list of Ray clusters.</p>
         */
        public Builder rayClusters(java.util.List<RayClusters> rayClusters) {
            this.rayClusters = rayClusters;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListRayClusterResponseBody build() {
            return new ListRayClusterResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListRayClusterResponseBody} extends {@link TeaModel}
     *
     * <p>ListRayClusterResponseBody</p>
     */
    public static class HeadSpec extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cpu")
        private String cpu;

        @com.aliyun.core.annotation.NameInMap("enableAutoScaling")
        private Boolean enableAutoScaling;

        @com.aliyun.core.annotation.NameInMap("gpuSpec")
        private String gpuSpec;

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
            this.gpuSpec = builder.gpuSpec;
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
         * @return gpuSpec
         */
        public String getGpuSpec() {
            return this.gpuSpec;
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
            private String gpuSpec; 
            private Integer idleTimeoutSeconds; 
            private String memory; 
            private String queueName; 
            private Integer replica; 

            private Builder() {
            } 

            private Builder(HeadSpec model) {
                this.cpu = model.cpu;
                this.enableAutoScaling = model.enableAutoScaling;
                this.gpuSpec = model.gpuSpec;
                this.idleTimeoutSeconds = model.idleTimeoutSeconds;
                this.memory = model.memory;
                this.queueName = model.queueName;
                this.replica = model.replica;
            } 

            /**
             * <p>The number of CPU cores.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder cpu(String cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * <p>Indicates whether automatic scaling is enabled for worker nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enableAutoScaling(Boolean enableAutoScaling) {
                this.enableAutoScaling = enableAutoScaling;
                return this;
            }

            /**
             * gpuSpec.
             */
            public Builder gpuSpec(String gpuSpec) {
                this.gpuSpec = gpuSpec;
                return this;
            }

            /**
             * <p>The idle timeout period for worker nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder idleTimeoutSeconds(Integer idleTimeoutSeconds) {
                this.idleTimeoutSeconds = idleTimeoutSeconds;
                return this;
            }

            /**
             * <p>The memory size. Unit: Gi.</p>
             * 
             * <strong>example:</strong>
             * <p>8Gi</p>
             */
            public Builder memory(String memory) {
                this.memory = memory;
                return this;
            }

            /**
             * <p>The queue name.</p>
             * 
             * <strong>example:</strong>
             * <p>root_queue</p>
             */
            public Builder queueName(String queueName) {
                this.queueName = queueName;
                return this;
            }

            /**
             * <p>The number of nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
     * {@link ListRayClusterResponseBody} extends {@link TeaModel}
     *
     * <p>ListRayClusterResponseBody</p>
     */
    public static class WorkerSpec extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cpu")
        private String cpu;

        @com.aliyun.core.annotation.NameInMap("gpuSpec")
        private String gpuSpec;

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
            this.gpuSpec = builder.gpuSpec;
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
         * @return gpuSpec
         */
        public String getGpuSpec() {
            return this.gpuSpec;
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
            private String gpuSpec; 
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
                this.gpuSpec = model.gpuSpec;
                this.groupName = model.groupName;
                this.maxReplica = model.maxReplica;
                this.memory = model.memory;
                this.minReplica = model.minReplica;
                this.queueName = model.queueName;
                this.replica = model.replica;
                this.workerType = model.workerType;
            } 

            /**
             * <p>The number of CPU cores.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder cpu(String cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * gpuSpec.
             */
            public Builder gpuSpec(String gpuSpec) {
                this.gpuSpec = gpuSpec;
                return this;
            }

            /**
             * <p>The name of the worker group.</p>
             * 
             * <strong>example:</strong>
             * <p>Group1</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * <p>The maximum number of worker nodes after automatic scaling is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder maxReplica(Integer maxReplica) {
                this.maxReplica = maxReplica;
                return this;
            }

            /**
             * <p>The memory size. Unit: Gi.</p>
             * 
             * <strong>example:</strong>
             * <p>8Gi</p>
             */
            public Builder memory(String memory) {
                this.memory = memory;
                return this;
            }

            /**
             * <p>The minimum number of worker nodes after automatic scaling is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder minReplica(Integer minReplica) {
                this.minReplica = minReplica;
                return this;
            }

            /**
             * <p>The queue name.</p>
             * 
             * <strong>example:</strong>
             * <p>root_queue</p>
             */
            public Builder queueName(String queueName) {
                this.queueName = queueName;
                return this;
            }

            /**
             * <p>The number of nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder replica(Integer replica) {
                this.replica = replica;
                return this;
            }

            /**
             * <p>The worker type.</p>
             * 
             * <strong>example:</strong>
             * <p>CPU</p>
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
    /**
     * 
     * {@link ListRayClusterResponseBody} extends {@link TeaModel}
     *
     * <p>ListRayClusterResponseBody</p>
     */
    public static class RayClusters extends TeaModel {
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

        @com.aliyun.core.annotation.NameInMap("grpcEndpoint")
        private String grpcEndpoint;

        @com.aliyun.core.annotation.NameInMap("headSpec")
        private HeadSpec headSpec;

        @com.aliyun.core.annotation.NameInMap("instanceId")
        private String instanceId;

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

        @com.aliyun.core.annotation.NameInMap("startTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("state")
        private String state;

        @com.aliyun.core.annotation.NameInMap("userId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("workerSpec")
        private java.util.List<WorkerSpec> workerSpec;

        private RayClusters(Builder builder) {
            this.clusterId = builder.clusterId;
            this.createTime = builder.createTime;
            this.creator = builder.creator;
            this.creatorName = builder.creatorName;
            this.dashboardUrl = builder.dashboardUrl;
            this.description = builder.description;
            this.displayReleaseVersion = builder.displayReleaseVersion;
            this.grpcEndpoint = builder.grpcEndpoint;
            this.headSpec = builder.headSpec;
            this.instanceId = builder.instanceId;
            this.message = builder.message;
            this.modified = builder.modified;
            this.modifiedTime = builder.modifiedTime;
            this.modifier = builder.modifier;
            this.modifierName = builder.modifierName;
            this.name = builder.name;
            this.networkServiceName = builder.networkServiceName;
            this.startTime = builder.startTime;
            this.state = builder.state;
            this.userId = builder.userId;
            this.workerSpec = builder.workerSpec;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RayClusters create() {
            return builder().build();
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
            private String grpcEndpoint; 
            private HeadSpec headSpec; 
            private String instanceId; 
            private String message; 
            private Boolean modified; 
            private Long modifiedTime; 
            private String modifier; 
            private String modifierName; 
            private String name; 
            private String networkServiceName; 
            private Long startTime; 
            private String state; 
            private String userId; 
            private java.util.List<WorkerSpec> workerSpec; 

            private Builder() {
            } 

            private Builder(RayClusters model) {
                this.clusterId = model.clusterId;
                this.createTime = model.createTime;
                this.creator = model.creator;
                this.creatorName = model.creatorName;
                this.dashboardUrl = model.dashboardUrl;
                this.description = model.description;
                this.displayReleaseVersion = model.displayReleaseVersion;
                this.grpcEndpoint = model.grpcEndpoint;
                this.headSpec = model.headSpec;
                this.instanceId = model.instanceId;
                this.message = model.message;
                this.modified = model.modified;
                this.modifiedTime = model.modifiedTime;
                this.modifier = model.modifier;
                this.modifierName = model.modifierName;
                this.name = model.name;
                this.networkServiceName = model.networkServiceName;
                this.startTime = model.startTime;
                this.state = model.state;
                this.userId = model.userId;
                this.workerSpec = model.workerSpec;
            } 

            /**
             * <p>The cluster ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ray-uiulpgow9xljimm1</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>The time when the cluster was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1723722279800</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The UID of the user who created the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>202077646755123991</p>
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * <p>The nickname of the creator.</p>
             * 
             * <strong>example:</strong>
             * <p>Alice</p>
             */
            public Builder creatorName(String creatorName) {
                this.creatorName = creatorName;
                return this;
            }

            /**
             * <p>The URL of the Ray cluster dashboard.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://emr-spark-ray-gateway-cn-hangzhou.aliyuncs.com?token=xxxxxxxxx">https://emr-spark-ray-gateway-cn-hangzhou.aliyuncs.com?token=xxxxxxxxx</a></p>
             */
            public Builder dashboardUrl(String dashboardUrl) {
                this.dashboardUrl = dashboardUrl;
                return this;
            }

            /**
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>Ray Cluster for dev.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The Ray engine version.</p>
             * 
             * <strong>example:</strong>
             * <p>ray-1.0.0 (Ray 2.47.1, Python 3.12)</p>
             */
            public Builder displayReleaseVersion(String displayReleaseVersion) {
                this.displayReleaseVersion = displayReleaseVersion;
                return this;
            }

            /**
             * <p>The gRPC endpoint for the internal network. The domain name can also be used to submit Ray jobs.</p>
             * 
             * <strong>example:</strong>
             * <p>ray://emr-spark-ray-gateway-cn-hanghzou-internal.emr.aliyuncs.com:80</p>
             */
            public Builder grpcEndpoint(String grpcEndpoint) {
                this.grpcEndpoint = grpcEndpoint;
                return this;
            }

            /**
             * <p>The information about the head node of the Ray cluster.</p>
             */
            public Builder headSpec(HeadSpec headSpec) {
                this.headSpec = headSpec;
                return this;
            }

            /**
             * <p>The ID of the Ray cluster instance.</p>
             * 
             * <strong>example:</strong>
             * <p>ray-uiulpgow9xljimm1-xxxxxxx</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The error message.</p>
             * 
             * <strong>example:</strong>
             * <p>ok</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>Indicates whether the configuration has been modified.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder modified(Boolean modified) {
                this.modified = modified;
                return this;
            }

            /**
             * <p>The time when the cluster was last modified.</p>
             * 
             * <strong>example:</strong>
             * <p>1723722279800</p>
             */
            public Builder modifiedTime(Long modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * <p>The UID of the user who last updated the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>202077646755123991</p>
             */
            public Builder modifier(String modifier) {
                this.modifier = modifier;
                return this;
            }

            /**
             * <p>The nickname of the modifier.</p>
             * 
             * <strong>example:</strong>
             * <p>Alice</p>
             */
            public Builder modifierName(String modifierName) {
                this.modifierName = modifierName;
                return this;
            }

            /**
             * <p>The name of the Ray cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>testRayCluster</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The name of the network connectivity service.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc</p>
             */
            public Builder networkServiceName(String networkServiceName) {
                this.networkServiceName = networkServiceName;
                return this;
            }

            /**
             * <p>The startup time.</p>
             * 
             * <strong>example:</strong>
             * <p>1723722279800</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The cluster state.</p>
             * <ul>
             * <li><p>Starting: The cluster is starting.</p>
             * </li>
             * <li><p>Running: The cluster is running.</p>
             * </li>
             * <li><p>Stopping: The cluster is stopping.</p>
             * </li>
             * <li><p>Stopped: The cluster is stopped.</p>
             * </li>
             * <li><p>Error: The cluster has failed.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account.</p>
             * 
             * <strong>example:</strong>
             * <p>1234567890</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * <p>The information about the worker nodes of the Ray cluster.</p>
             */
            public Builder workerSpec(java.util.List<WorkerSpec> workerSpec) {
                this.workerSpec = workerSpec;
                return this;
            }

            public RayClusters build() {
                return new RayClusters(this);
            } 

        } 

    }
}
