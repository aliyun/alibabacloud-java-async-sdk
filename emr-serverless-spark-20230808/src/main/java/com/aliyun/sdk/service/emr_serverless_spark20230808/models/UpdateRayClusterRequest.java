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
    @com.aliyun.core.annotation.NameInMap("volumeIds")
    private java.util.List<String> volumeIds;

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
        this.volumeIds = builder.volumeIds;
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
     * @return volumeIds
     */
    public java.util.List<String> getVolumeIds() {
        return this.volumeIds;
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
        private java.util.List<String> volumeIds; 
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
            this.volumeIds = request.volumeIds;
            this.workerSpec = request.workerSpec;
        } 

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>w-d2d82aa09155</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ray-uiulpgow9xljimm1</p>
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("clusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>Ray Cluster for dev.</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The Ray DPI engine version.</p>
         * 
         * <strong>example:</strong>
         * <p>ray-1.0.0 (Ray 2.47.1, Python 3.12)</p>
         */
        public Builder displayReleaseVersion(String displayReleaseVersion) {
            this.putBodyParameter("displayReleaseVersion", displayReleaseVersion);
            this.displayReleaseVersion = displayReleaseVersion;
            return this;
        }

        /**
         * <p>The extra parameters. The value must be in JSON format.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder extraParam(String extraParam) {
            this.putBodyParameter("extraParam", extraParam);
            this.extraParam = extraParam;
            return this;
        }

        /**
         * <p>The Ray cluster head node information.</p>
         */
        public Builder headSpec(HeadSpec headSpec) {
            this.putBodyParameter("headSpec", headSpec);
            this.headSpec = headSpec;
            return this;
        }

        /**
         * <p>The Ray cluster name. The name must be 1 to 64 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>myRayCluster</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The network connectivity name.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc</p>
         */
        public Builder networkServiceName(String networkServiceName) {
            this.putBodyParameter("networkServiceName", networkServiceName);
            this.networkServiceName = networkServiceName;
            return this;
        }

        /**
         * <p>The list of managed folder IDs to mount.</p>
         */
        public Builder volumeIds(java.util.List<String> volumeIds) {
            this.putBodyParameter("volumeIds", volumeIds);
            this.volumeIds = volumeIds;
            return this;
        }

        /**
         * <p>The Ray cluster worker node information. A maximum of 50 groups are supported.</p>
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
    public static class GftConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("redisPassword")
        private String redisPassword;

        @com.aliyun.core.annotation.NameInMap("redisUrl")
        private String redisUrl;

        @com.aliyun.core.annotation.NameInMap("redisUsername")
        private String redisUsername;

        private GftConfig(Builder builder) {
            this.redisPassword = builder.redisPassword;
            this.redisUrl = builder.redisUrl;
            this.redisUsername = builder.redisUsername;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GftConfig create() {
            return builder().build();
        }

        /**
         * @return redisPassword
         */
        public String getRedisPassword() {
            return this.redisPassword;
        }

        /**
         * @return redisUrl
         */
        public String getRedisUrl() {
            return this.redisUrl;
        }

        /**
         * @return redisUsername
         */
        public String getRedisUsername() {
            return this.redisUsername;
        }

        public static final class Builder {
            private String redisPassword; 
            private String redisUrl; 
            private String redisUsername; 

            private Builder() {
            } 

            private Builder(GftConfig model) {
                this.redisPassword = model.redisPassword;
                this.redisUrl = model.redisUrl;
                this.redisUsername = model.redisUsername;
            } 

            /**
             * <p>The Redis password.</p>
             * 
             * <strong>example:</strong>
             * <p>123456</p>
             */
            public Builder redisPassword(String redisPassword) {
                this.redisPassword = redisPassword;
                return this;
            }

            /**
             * <p>The Redis address.</p>
             * 
             * <strong>example:</strong>
             * <p>10.4.5.6:6379</p>
             */
            public Builder redisUrl(String redisUrl) {
                this.redisUrl = redisUrl;
                return this;
            }

            /**
             * <p>The Redis username.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder redisUsername(String redisUsername) {
                this.redisUsername = redisUsername;
                return this;
            }

            public GftConfig build() {
                return new GftConfig(this);
            } 

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

        @com.aliyun.core.annotation.NameInMap("displayReleaseVersion")
        private String displayReleaseVersion;

        @com.aliyun.core.annotation.NameInMap("enableAutoScaling")
        private Boolean enableAutoScaling;

        @com.aliyun.core.annotation.NameInMap("env")
        private String env;

        @com.aliyun.core.annotation.NameInMap("gftConfig")
        private GftConfig gftConfig;

        @com.aliyun.core.annotation.NameInMap("gftEnabled")
        private Boolean gftEnabled;

        @com.aliyun.core.annotation.NameInMap("gpuSpec")
        private String gpuSpec;

        @com.aliyun.core.annotation.NameInMap("idleTimeoutSeconds")
        private Integer idleTimeoutSeconds;

        @com.aliyun.core.annotation.NameInMap("memory")
        private String memory;

        @com.aliyun.core.annotation.NameInMap("queueName")
        private String queueName;

        @com.aliyun.core.annotation.NameInMap("rayStartParams")
        private String rayStartParams;

        private HeadSpec(Builder builder) {
            this.cpu = builder.cpu;
            this.displayReleaseVersion = builder.displayReleaseVersion;
            this.enableAutoScaling = builder.enableAutoScaling;
            this.env = builder.env;
            this.gftConfig = builder.gftConfig;
            this.gftEnabled = builder.gftEnabled;
            this.gpuSpec = builder.gpuSpec;
            this.idleTimeoutSeconds = builder.idleTimeoutSeconds;
            this.memory = builder.memory;
            this.queueName = builder.queueName;
            this.rayStartParams = builder.rayStartParams;
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
         * @return displayReleaseVersion
         */
        public String getDisplayReleaseVersion() {
            return this.displayReleaseVersion;
        }

        /**
         * @return enableAutoScaling
         */
        public Boolean getEnableAutoScaling() {
            return this.enableAutoScaling;
        }

        /**
         * @return env
         */
        public String getEnv() {
            return this.env;
        }

        /**
         * @return gftConfig
         */
        public GftConfig getGftConfig() {
            return this.gftConfig;
        }

        /**
         * @return gftEnabled
         */
        public Boolean getGftEnabled() {
            return this.gftEnabled;
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
         * @return rayStartParams
         */
        public String getRayStartParams() {
            return this.rayStartParams;
        }

        public static final class Builder {
            private String cpu; 
            private String displayReleaseVersion; 
            private Boolean enableAutoScaling; 
            private String env; 
            private GftConfig gftConfig; 
            private Boolean gftEnabled; 
            private String gpuSpec; 
            private Integer idleTimeoutSeconds; 
            private String memory; 
            private String queueName; 
            private String rayStartParams; 

            private Builder() {
            } 

            private Builder(HeadSpec model) {
                this.cpu = model.cpu;
                this.displayReleaseVersion = model.displayReleaseVersion;
                this.enableAutoScaling = model.enableAutoScaling;
                this.env = model.env;
                this.gftConfig = model.gftConfig;
                this.gftEnabled = model.gftEnabled;
                this.gpuSpec = model.gpuSpec;
                this.idleTimeoutSeconds = model.idleTimeoutSeconds;
                this.memory = model.memory;
                this.queueName = model.queueName;
                this.rayStartParams = model.rayStartParams;
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
             * <p>The Ray DPI engine version.</p>
             * 
             * <strong>example:</strong>
             * <p>ray-1.2.0 (Ray 2.55.1, Python 3.12)</p>
             */
            public Builder displayReleaseVersion(String displayReleaseVersion) {
                this.displayReleaseVersion = displayReleaseVersion;
                return this;
            }

            /**
             * <p>Specifies whether to enable automatic scaling.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enableAutoScaling(Boolean enableAutoScaling) {
                this.enableAutoScaling = enableAutoScaling;
                return this;
            }

            /**
             * <p>The environment variables.</p>
             * 
             * <strong>example:</strong>
             * <p>MY_ENV=123456</p>
             */
            public Builder env(String env) {
                this.env = env;
                return this;
            }

            /**
             * <p>The GCS Fault Tolerance configuration.</p>
             */
            public Builder gftConfig(GftConfig gftConfig) {
                this.gftConfig = gftConfig;
                return this;
            }

            /**
             * <p>Specifies whether to enable GCS Fault Tolerance.</p>
             */
            public Builder gftEnabled(Boolean gftEnabled) {
                this.gftEnabled = gftEnabled;
                return this;
            }

            /**
             * <p>The GPU instance type.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs.gn6i-c4g1.xlarge</p>
             */
            public Builder gpuSpec(String gpuSpec) {
                this.gpuSpec = gpuSpec;
                return this;
            }

            /**
             * <p>The idle timeout period of workers after automatic scaling is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder idleTimeoutSeconds(Integer idleTimeoutSeconds) {
                this.idleTimeoutSeconds = idleTimeoutSeconds;
                return this;
            }

            /**
             * <p>The memory size. Unit: GiB.</p>
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
             * <p>The Ray startup parameters.</p>
             * 
             * <strong>example:</strong>
             * <p>--num-cpus=0</p>
             */
            public Builder rayStartParams(String rayStartParams) {
                this.rayStartParams = rayStartParams;
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

        @com.aliyun.core.annotation.NameInMap("displayReleaseVersion")
        private String displayReleaseVersion;

        @com.aliyun.core.annotation.NameInMap("env")
        private String env;

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

        @com.aliyun.core.annotation.NameInMap("rayStartParams")
        private String rayStartParams;

        @com.aliyun.core.annotation.NameInMap("replica")
        private Integer replica;

        @com.aliyun.core.annotation.NameInMap("workerType")
        private String workerType;

        private WorkerSpec(Builder builder) {
            this.cpu = builder.cpu;
            this.displayReleaseVersion = builder.displayReleaseVersion;
            this.env = builder.env;
            this.gpuSpec = builder.gpuSpec;
            this.groupName = builder.groupName;
            this.maxReplica = builder.maxReplica;
            this.memory = builder.memory;
            this.minReplica = builder.minReplica;
            this.queueName = builder.queueName;
            this.rayStartParams = builder.rayStartParams;
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
         * @return displayReleaseVersion
         */
        public String getDisplayReleaseVersion() {
            return this.displayReleaseVersion;
        }

        /**
         * @return env
         */
        public String getEnv() {
            return this.env;
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
         * @return rayStartParams
         */
        public String getRayStartParams() {
            return this.rayStartParams;
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
            private String displayReleaseVersion; 
            private String env; 
            private String gpuSpec; 
            private String groupName; 
            private Integer maxReplica; 
            private String memory; 
            private Integer minReplica; 
            private String queueName; 
            private String rayStartParams; 
            private Integer replica; 
            private String workerType; 

            private Builder() {
            } 

            private Builder(WorkerSpec model) {
                this.cpu = model.cpu;
                this.displayReleaseVersion = model.displayReleaseVersion;
                this.env = model.env;
                this.gpuSpec = model.gpuSpec;
                this.groupName = model.groupName;
                this.maxReplica = model.maxReplica;
                this.memory = model.memory;
                this.minReplica = model.minReplica;
                this.queueName = model.queueName;
                this.rayStartParams = model.rayStartParams;
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
             * <p>The DPI engine version.</p>
             * 
             * <strong>example:</strong>
             * <p>ray-1.2.0 (Ray 2.55.1, Python 3.12)</p>
             */
            public Builder displayReleaseVersion(String displayReleaseVersion) {
                this.displayReleaseVersion = displayReleaseVersion;
                return this;
            }

            /**
             * <p>The Ray environment variables.</p>
             * 
             * <strong>example:</strong>
             * <p>MY_ENV=123456</p>
             */
            public Builder env(String env) {
                this.env = env;
                return this;
            }

            /**
             * <p>The GPU instance type.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs.gn6i-c4g1.xlarge</p>
             */
            public Builder gpuSpec(String gpuSpec) {
                this.gpuSpec = gpuSpec;
                return this;
            }

            /**
             * <p>The worker group name.</p>
             * 
             * <strong>example:</strong>
             * <p>WorkerGroup1</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * <p>The maximum number of workers. Minimum value: 1.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder maxReplica(Integer maxReplica) {
                this.maxReplica = maxReplica;
                return this;
            }

            /**
             * <p>The memory size. Unit: GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>8Gi</p>
             */
            public Builder memory(String memory) {
                this.memory = memory;
                return this;
            }

            /**
             * <p>The minimum number of workers. Minimum value: 1. The value must be less than or equal to maxReplica.</p>
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
             * <p>The Ray startup parameters.</p>
             * 
             * <strong>example:</strong>
             * <p>--num-cpus=0</p>
             */
            public Builder rayStartParams(String rayStartParams) {
                this.rayStartParams = rayStartParams;
                return this;
            }

            /**
             * <p>The number of workers. Minimum value: 1.</p>
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
}
