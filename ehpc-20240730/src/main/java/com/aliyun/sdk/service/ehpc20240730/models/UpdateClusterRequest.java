// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20240730.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
        } 

        /**
         * ClientVersion.
         */
        public Builder clientVersion(String clientVersion) {
            this.putQueryParameter("ClientVersion", clientVersion);
            this.clientVersion = clientVersion;
            return this;
        }

        /**
         * ClusterCustomConfiguration.
         */
        public Builder clusterCustomConfiguration(ClusterCustomConfiguration clusterCustomConfiguration) {
            String clusterCustomConfigurationShrink = shrink(clusterCustomConfiguration, "ClusterCustomConfiguration", "json");
            this.putQueryParameter("ClusterCustomConfiguration", clusterCustomConfigurationShrink);
            this.clusterCustomConfiguration = clusterCustomConfiguration;
            return this;
        }

        /**
         * ClusterDescription.
         */
        public Builder clusterDescription(String clusterDescription) {
            this.putQueryParameter("ClusterDescription", clusterDescription);
            this.clusterDescription = clusterDescription;
            return this;
        }

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * ClusterName.
         */
        public Builder clusterName(String clusterName) {
            this.putQueryParameter("ClusterName", clusterName);
            this.clusterName = clusterName;
            return this;
        }

        /**
         * DeletionProtection.
         */
        public Builder deletionProtection(Boolean deletionProtection) {
            this.putQueryParameter("DeletionProtection", deletionProtection);
            this.deletionProtection = deletionProtection;
            return this;
        }

        /**
         * EnableScaleIn.
         */
        public Builder enableScaleIn(Boolean enableScaleIn) {
            this.putQueryParameter("EnableScaleIn", enableScaleIn);
            this.enableScaleIn = enableScaleIn;
            return this;
        }

        /**
         * EnableScaleOut.
         */
        public Builder enableScaleOut(Boolean enableScaleOut) {
            this.putQueryParameter("EnableScaleOut", enableScaleOut);
            this.enableScaleOut = enableScaleOut;
            return this;
        }

        /**
         * GrowInterval.
         */
        public Builder growInterval(Integer growInterval) {
            this.putQueryParameter("GrowInterval", growInterval);
            this.growInterval = growInterval;
            return this;
        }

        /**
         * IdleInterval.
         */
        public Builder idleInterval(Integer idleInterval) {
            this.putQueryParameter("IdleInterval", idleInterval);
            this.idleInterval = idleInterval;
            return this;
        }

        /**
         * MaxCoreCount.
         */
        public Builder maxCoreCount(Integer maxCoreCount) {
            this.putQueryParameter("MaxCoreCount", maxCoreCount);
            this.maxCoreCount = maxCoreCount;
            return this;
        }

        /**
         * MaxCount.
         */
        public Builder maxCount(Integer maxCount) {
            this.putQueryParameter("MaxCount", maxCount);
            this.maxCount = maxCount;
            return this;
        }

        @Override
        public UpdateClusterRequest build() {
            return new UpdateClusterRequest(this);
        } 

    } 

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
             * Args.
             */
            public Builder args(String args) {
                this.args = args;
                return this;
            }

            /**
             * Script.
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
}
