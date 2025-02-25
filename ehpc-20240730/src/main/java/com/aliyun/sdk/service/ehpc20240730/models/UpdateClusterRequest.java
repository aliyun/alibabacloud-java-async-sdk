// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20240730.models;

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
 * {@link UpdateClusterRequest} extends {@link RequestModel}
 *
 * <p>UpdateClusterRequest</p>
 */
public class UpdateClusterRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientVersion")
    private String clientVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterCustomConfiguration")
    private ClusterCustomConfiguration clusterCustomConfiguration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterDescription")
    private String clusterDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterName")
    private String clusterName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeletionProtection")
    private Boolean deletionProtection;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableScaleIn")
    private Boolean enableScaleIn;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableScaleOut")
    private Boolean enableScaleOut;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GrowInterval")
    private Integer growInterval;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IdleInterval")
    private Integer idleInterval;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxCoreCount")
    private Integer maxCoreCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxCount")
    private Integer maxCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MonitorSpec")
    private MonitorSpec monitorSpec;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SchedulerSpec")
    private SchedulerSpec schedulerSpec;

    private UpdateClusterRequest(Builder builder) {
        super(builder);
        this.clientVersion = builder.clientVersion;
        this.clusterCustomConfiguration = builder.clusterCustomConfiguration;
        this.clusterDescription = builder.clusterDescription;
        this.clusterId = builder.clusterId;
        this.clusterName = builder.clusterName;
        this.deletionProtection = builder.deletionProtection;
        this.enableScaleIn = builder.enableScaleIn;
        this.enableScaleOut = builder.enableScaleOut;
        this.growInterval = builder.growInterval;
        this.idleInterval = builder.idleInterval;
        this.maxCoreCount = builder.maxCoreCount;
        this.maxCount = builder.maxCount;
        this.monitorSpec = builder.monitorSpec;
        this.schedulerSpec = builder.schedulerSpec;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateClusterRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientVersion
     */
    public String getClientVersion() {
        return this.clientVersion;
    }

    /**
     * @return clusterCustomConfiguration
     */
    public ClusterCustomConfiguration getClusterCustomConfiguration() {
        return this.clusterCustomConfiguration;
    }

    /**
     * @return clusterDescription
     */
    public String getClusterDescription() {
        return this.clusterDescription;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return clusterName
     */
    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * @return deletionProtection
     */
    public Boolean getDeletionProtection() {
        return this.deletionProtection;
    }

    /**
     * @return enableScaleIn
     */
    public Boolean getEnableScaleIn() {
        return this.enableScaleIn;
    }

    /**
     * @return enableScaleOut
     */
    public Boolean getEnableScaleOut() {
        return this.enableScaleOut;
    }

    /**
     * @return growInterval
     */
    public Integer getGrowInterval() {
        return this.growInterval;
    }

    /**
     * @return idleInterval
     */
    public Integer getIdleInterval() {
        return this.idleInterval;
    }

    /**
     * @return maxCoreCount
     */
    public Integer getMaxCoreCount() {
        return this.maxCoreCount;
    }

    /**
     * @return maxCount
     */
    public Integer getMaxCount() {
        return this.maxCount;
    }

    /**
     * @return monitorSpec
     */
    public MonitorSpec getMonitorSpec() {
        return this.monitorSpec;
    }

    /**
     * @return schedulerSpec
     */
    public SchedulerSpec getSchedulerSpec() {
        return this.schedulerSpec;
    }

    public static final class Builder extends Request.Builder<UpdateClusterRequest, Builder> {
        private String clientVersion; 
        private ClusterCustomConfiguration clusterCustomConfiguration; 
        private String clusterDescription; 
        private String clusterId; 
        private String clusterName; 
        private Boolean deletionProtection; 
        private Boolean enableScaleIn; 
        private Boolean enableScaleOut; 
        private Integer growInterval; 
        private Integer idleInterval; 
        private Integer maxCoreCount; 
        private Integer maxCount; 
        private MonitorSpec monitorSpec; 
        private SchedulerSpec schedulerSpec; 

        private Builder() {
            super();
        } 

        private Builder(UpdateClusterRequest request) {
            super(request);
            this.clientVersion = request.clientVersion;
            this.clusterCustomConfiguration = request.clusterCustomConfiguration;
            this.clusterDescription = request.clusterDescription;
            this.clusterId = request.clusterId;
            this.clusterName = request.clusterName;
            this.deletionProtection = request.deletionProtection;
            this.enableScaleIn = request.enableScaleIn;
            this.enableScaleOut = request.enableScaleOut;
            this.growInterval = request.growInterval;
            this.idleInterval = request.idleInterval;
            this.maxCoreCount = request.maxCoreCount;
            this.maxCount = request.maxCount;
            this.monitorSpec = request.monitorSpec;
            this.schedulerSpec = request.schedulerSpec;
        } 

        /**
         * <p>The client version. By default, the latest version is used.</p>
         * 
         * <strong>example:</strong>
         * <p>2.1.0</p>
         */
        public Builder clientVersion(String clientVersion) {
            this.putQueryParameter("ClientVersion", clientVersion);
            this.clientVersion = clientVersion;
            return this;
        }

        /**
         * <p>The post-processing script of the cluster.</p>
         */
        public Builder clusterCustomConfiguration(ClusterCustomConfiguration clusterCustomConfiguration) {
            String clusterCustomConfigurationShrink = shrink(clusterCustomConfiguration, "ClusterCustomConfiguration", "json");
            this.putQueryParameter("ClusterCustomConfiguration", clusterCustomConfigurationShrink);
            this.clusterCustomConfiguration = clusterCustomConfiguration;
            return this;
        }

        /**
         * <p>The cluster description. The description must be 1 to 128 characters in length and can contain letters, digits, hyphens (-), and underscores (_).</p>
         * 
         * <strong>example:</strong>
         * <p>slurm22.05.8-serverless-cluster-20240805</p>
         */
        public Builder clusterDescription(String clusterDescription) {
            this.putQueryParameter("ClusterDescription", clusterDescription);
            this.clusterDescription = clusterDescription;
            return this;
        }

        /**
         * <p>The cluster ID.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/87116.html">ListClusters</a> operation to query the cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ehpc-hz-FYUr32****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The cluster name. The name must be 1 to 128 characters in length and can contain letters, digits, hyphens (-), and underscores (_).</p>
         * 
         * <strong>example:</strong>
         * <p>slurm22.05.8-serverless-cluster-20240805</p>
         */
        public Builder clusterName(String clusterName) {
            this.putQueryParameter("ClusterName", clusterName);
            this.clusterName = clusterName;
            return this;
        }

        /**
         * <p>Specifies whether to enable deletion protection for the cluster. Deletion protection decides whether the cluster can be deleted in the console or by calling the DeleteCluster operation. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder deletionProtection(Boolean deletionProtection) {
            this.putQueryParameter("DeletionProtection", deletionProtection);
            this.deletionProtection = deletionProtection;
            return this;
        }

        /**
         * <p>Specifies whether to enable auto scale-in for the cluster. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableScaleIn(Boolean enableScaleIn) {
            this.putQueryParameter("EnableScaleIn", enableScaleIn);
            this.enableScaleIn = enableScaleIn;
            return this;
        }

        /**
         * <p>Specifies whether to enable auto scale-out for the cluster. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableScaleOut(Boolean enableScaleOut) {
            this.putQueryParameter("EnableScaleOut", enableScaleOut);
            this.enableScaleOut = enableScaleOut;
            return this;
        }

        /**
         * <p>The interval at which the cluster is automatically scaled out.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder growInterval(Integer growInterval) {
            this.putQueryParameter("GrowInterval", growInterval);
            this.growInterval = growInterval;
            return this;
        }

        /**
         * <p>The idle duration of the compute nodes allowed by the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder idleInterval(Integer idleInterval) {
            this.putQueryParameter("IdleInterval", idleInterval);
            this.idleInterval = idleInterval;
            return this;
        }

        /**
         * <p>The total maximum number of vCPUs for use by compute nodes in the cluster. Valid values: 0 to 100,000.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder maxCoreCount(Integer maxCoreCount) {
            this.putQueryParameter("MaxCoreCount", maxCoreCount);
            this.maxCoreCount = maxCoreCount;
            return this;
        }

        /**
         * <p>The maximum number of compute nodes that the cluster can manage. Valid values: 0 to 5,000.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        public Builder maxCount(Integer maxCount) {
            this.putQueryParameter("MaxCount", maxCount);
            this.maxCount = maxCount;
            return this;
        }

        /**
         * MonitorSpec.
         */
        public Builder monitorSpec(MonitorSpec monitorSpec) {
            String monitorSpecShrink = shrink(monitorSpec, "MonitorSpec", "json");
            this.putQueryParameter("MonitorSpec", monitorSpecShrink);
            this.monitorSpec = monitorSpec;
            return this;
        }

        /**
         * SchedulerSpec.
         */
        public Builder schedulerSpec(SchedulerSpec schedulerSpec) {
            String schedulerSpecShrink = shrink(schedulerSpec, "SchedulerSpec", "json");
            this.putQueryParameter("SchedulerSpec", schedulerSpecShrink);
            this.schedulerSpec = schedulerSpec;
            return this;
        }

        @Override
        public UpdateClusterRequest build() {
            return new UpdateClusterRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateClusterRequest} extends {@link TeaModel}
     *
     * <p>UpdateClusterRequest</p>
     */
    public static class ClusterCustomConfiguration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Args")
        private String args;

        @com.aliyun.core.annotation.NameInMap("Script")
        private String script;

        private ClusterCustomConfiguration(Builder builder) {
            this.args = builder.args;
            this.script = builder.script;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClusterCustomConfiguration create() {
            return builder().build();
        }

        /**
         * @return args
         */
        public String getArgs() {
            return this.args;
        }

        /**
         * @return script
         */
        public String getScript() {
            return this.script;
        }

        public static final class Builder {
            private String args; 
            private String script; 

            /**
             * <p>The arguments that are used to run the post-processing script.</p>
             * 
             * <strong>example:</strong>
             * <p>E-HPC cn-hangzhou</p>
             */
            public Builder args(String args) {
                this.args = args;
                return this;
            }

            /**
             * <p>The URL that is used to download the post-processing script.</p>
             * 
             * <strong>example:</strong>
             * <p>http://*****</p>
             */
            public Builder script(String script) {
                this.script = script;
                return this;
            }

            public ClusterCustomConfiguration build() {
                return new ClusterCustomConfiguration(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateClusterRequest} extends {@link TeaModel}
     *
     * <p>UpdateClusterRequest</p>
     */
    public static class MonitorSpec extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnableComputeLoadMonitor")
        private Boolean enableComputeLoadMonitor;

        private MonitorSpec(Builder builder) {
            this.enableComputeLoadMonitor = builder.enableComputeLoadMonitor;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MonitorSpec create() {
            return builder().build();
        }

        /**
         * @return enableComputeLoadMonitor
         */
        public Boolean getEnableComputeLoadMonitor() {
            return this.enableComputeLoadMonitor;
        }

        public static final class Builder {
            private Boolean enableComputeLoadMonitor; 

            /**
             * EnableComputeLoadMonitor.
             */
            public Builder enableComputeLoadMonitor(Boolean enableComputeLoadMonitor) {
                this.enableComputeLoadMonitor = enableComputeLoadMonitor;
                return this;
            }

            public MonitorSpec build() {
                return new MonitorSpec(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateClusterRequest} extends {@link TeaModel}
     *
     * <p>UpdateClusterRequest</p>
     */
    public static class SchedulerSpec extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnableTopologyAwareness")
        private Boolean enableTopologyAwareness;

        private SchedulerSpec(Builder builder) {
            this.enableTopologyAwareness = builder.enableTopologyAwareness;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SchedulerSpec create() {
            return builder().build();
        }

        /**
         * @return enableTopologyAwareness
         */
        public Boolean getEnableTopologyAwareness() {
            return this.enableTopologyAwareness;
        }

        public static final class Builder {
            private Boolean enableTopologyAwareness; 

            /**
             * EnableTopologyAwareness.
             */
            public Builder enableTopologyAwareness(Boolean enableTopologyAwareness) {
                this.enableTopologyAwareness = enableTopologyAwareness;
                return this;
            }

            public SchedulerSpec build() {
                return new SchedulerSpec(this);
            } 

        } 

    }
}
