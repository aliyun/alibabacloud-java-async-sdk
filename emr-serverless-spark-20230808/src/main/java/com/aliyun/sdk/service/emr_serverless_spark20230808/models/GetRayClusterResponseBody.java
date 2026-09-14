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

    @com.aliyun.core.annotation.NameInMap("jobUrlInner")
    private String jobUrlInner;

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

    @com.aliyun.core.annotation.NameInMap("volumeIds")
    private java.util.List<String> volumeIds;

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
        this.jobUrlInner = builder.jobUrlInner;
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
        this.volumeIds = builder.volumeIds;
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
     * @return jobUrlInner
     */
    public String getJobUrlInner() {
        return this.jobUrlInner;
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
        private String jobUrlInner; 
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
        private java.util.List<String> volumeIds; 
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
            this.jobUrlInner = model.jobUrlInner;
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
            this.volumeIds = model.volumeIds;
            this.workerSpec = model.workerSpec;
        } 

        /**
         * <p>The Ray cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ray-k7nm8ahl5te4tg91</p>
         */
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The creation time. This value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1750327083303</p>
         */
        public Builder createTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The UID of the user who created the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>202077646755523991</p>
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
         * <p><a href="https://emr-ray-gateway-cn-hangzhou.aliyuncs.com/workspace/w-xxxxxxxx/raycluster/ray-xxxxxx/dashboard?token=xxxxxx">https://emr-ray-gateway-cn-hangzhou.aliyuncs.com/workspace/w-xxxxxxxx/raycluster/ray-xxxxxx/dashboard?token=xxxxxx</a></p>
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
         * <p>The Ray DPI engine version.</p>
         * 
         * <strong>example:</strong>
         * <p>ray-1.0.0 (Ray 2.47.1, Python 3.12)</p>
         */
        public Builder displayReleaseVersion(String displayReleaseVersion) {
            this.displayReleaseVersion = displayReleaseVersion;
            return this;
        }

        /**
         * <p>The extra parameters in JSON format.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder extraParam(String extraParam) {
            this.extraParam = extraParam;
            return this;
        }

        /**
         * <p>The gRPC endpoint (internal network). The domain name in this endpoint can also be used to submit Ray jobs.</p>
         * 
         * <strong>example:</strong>
         * <p>ray://emr-spark-ray-gateway-cn-hangzhou-internal.emr.aliyuncs.com:80</p>
         */
        public Builder grpcEndpoint(String grpcEndpoint) {
            this.grpcEndpoint = grpcEndpoint;
            return this;
        }

        /**
         * <p>The parameters of the Ray cluster head node.</p>
         */
        public Builder headSpec(HeadSpec headSpec) {
            this.headSpec = headSpec;
            return this;
        }

        /**
         * <p>The Ray cluster node IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>ray-k7nm8ahl5te4tg93-xxxxxxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The Ray cluster node IDs.</p>
         */
        public Builder instances(java.util.List<Instances> instances) {
            this.instances = instances;
            return this;
        }

        /**
         * <p>The public URL for submitting Ray Jobs.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://emr-spark-ray-gateway-cn-hangzhou.aliyuncs.com">https://emr-spark-ray-gateway-cn-hangzhou.aliyuncs.com</a></p>
         */
        public Builder jobUrl(String jobUrl) {
            this.jobUrl = jobUrl;
            return this;
        }

        /**
         * <p>The internal network URL for submitting Ray jobs.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://emr-spark-ray-gateway-cn-hangzhou-internal.emr.aliyuncs.com">http://emr-spark-ray-gateway-cn-hangzhou-internal.emr.aliyuncs.com</a></p>
         */
        public Builder jobUrlInner(String jobUrlInner) {
            this.jobUrlInner = jobUrlInner;
            return this;
        }

        /**
         * <p>The error message returned when the status is Error.</p>
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
         * <p>The update time. This value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1754274541693</p>
         */
        public Builder modifiedTime(Long modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }

        /**
         * <p>The UID of the user who last modified the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>202077646755523991</p>
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
         * <p>The Ray cluster name.</p>
         * 
         * <strong>example:</strong>
         * <p>myRayCluster</p>
         */
        public Builder name(String name) {
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
            this.networkServiceName = networkServiceName;
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

        /**
         * <p>The start time. This value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1750327083303</p>
         */
        public Builder startTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The session status. Valid values:</p>
         * <ul>
         * <li>Starting: Starting.</li>
         * <li>Running: Running.</li>
         * <li>Stopping: Stopping.</li>
         * <li>Stopped: Stopped.</li>
         * <li>Error: Failed.</li>
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
         * <p>The authentication token for submitting Ray Jobs. Include this token in the request header as &quot;ray-token&quot;: &quot;token&quot;.</p>
         * 
         * <strong>example:</strong>
         * <p>1d06484d3b424f7fa4ab7082a4076da2</p>
         */
        public Builder submitToken(String submitToken) {
            this.submitToken = submitToken;
            return this;
        }

        /**
         * <p>The Alibaba Cloud account ID of the creator.</p>
         * 
         * <strong>example:</strong>
         * <p>123456789012</p>
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        /**
         * <p>The list of managed file IDs.</p>
         */
        public Builder volumeIds(java.util.List<String> volumeIds) {
            this.volumeIds = volumeIds;
            return this;
        }

        /**
         * <p>The Ray cluster worker node information.</p>
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
             * <p>The Redis URL.</p>
             * 
             * <strong>example:</strong>
             * <p>10.4.5.6:6789</p>
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
     * {@link GetRayClusterResponseBody} extends {@link TeaModel}
     *
     * <p>GetRayClusterResponseBody</p>
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

        @com.aliyun.core.annotation.NameInMap("replica")
        private Integer replica;

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

        /**
         * @return replica
         */
        public Integer getReplica() {
            return this.replica;
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
            private Integer replica; 

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
             * <p>The Ray DPI engine version.</p>
             * 
             * <strong>example:</strong>
             * <p>err-1.3.0 (Ray 2.55.1, Python 3.12)</p>
             */
            public Builder displayReleaseVersion(String displayReleaseVersion) {
                this.displayReleaseVersion = displayReleaseVersion;
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
             * <p>Indicates whether GCS Fault Tolerance is enabled.</p>
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
             * <p>The idle timeout period of worker nodes after automatic scaling is enabled.</p>
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
             * <p>The exit code of the primary container.</p>
             * 
             * <strong>example:</strong>
             * <p>137</p>
             */
            public Builder containerExitCode(Integer containerExitCode) {
                this.containerExitCode = containerExitCode;
                return this;
            }

            /**
             * <p>The status of the primary container.</p>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder containerState(String containerState) {
                this.containerState = containerState;
                return this;
            }

            /**
             * <p>The primary container status message.</p>
             * 
             * <strong>example:</strong>
             * <p>ContainerExit</p>
             */
            public Builder containerStateMessage(String containerStateMessage) {
                this.containerStateMessage = containerStateMessage;
                return this;
            }

            /**
             * <p>The primary container information.</p>
             * 
             * <strong>example:</strong>
             * <p>ok</p>
             */
            public Builder containerStateReason(String containerStateReason) {
                this.containerStateReason = containerStateReason;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>1735870116167</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The node ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ray-uiulpgow9xljim10-head-7cgta</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The node pod status message.</p>
             * 
             * <strong>example:</strong>
             * <p>ok</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The node pod status.</p>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder phase(String phase) {
                this.phase = phase;
                return this;
            }

            /**
             * <p>The node information.</p>
             * 
             * <strong>example:</strong>
             * <p>OOMKilled</p>
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * <p>The start time.</p>
             * 
             * <strong>example:</strong>
             * <p>1762946698000</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The node type.</p>
             * 
             * <strong>example:</strong>
             * <p>Head</p>
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
             * <p>The database engine version.</p>
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
             * <p>MY_ENV=12456</p>
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
             * <p>The name of the worker node group.</p>
             * 
             * <strong>example:</strong>
             * <p>WorkerGroup1</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * <p>The maximum number of workers.</p>
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
             * <p>The minimum number of workers.</p>
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
             * <p>The number of worker nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder replica(Integer replica) {
                this.replica = replica;
                return this;
            }

            /**
             * <p>The type of the worker node group.</p>
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
