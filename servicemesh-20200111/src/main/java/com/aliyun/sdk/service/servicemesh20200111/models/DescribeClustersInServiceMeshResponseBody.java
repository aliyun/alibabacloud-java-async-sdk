// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

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
 * {@link DescribeClustersInServiceMeshResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeClustersInServiceMeshResponseBody</p>
 */
public class DescribeClustersInServiceMeshResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Clusters")
    private java.util.List<Clusters> clusters;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeClustersInServiceMeshResponseBody(Builder builder) {
        this.clusters = builder.clusters;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClustersInServiceMeshResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusters
     */
    public java.util.List<Clusters> getClusters() {
        return this.clusters;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Clusters> clusters; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeClustersInServiceMeshResponseBody model) {
            this.clusters = model.clusters;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The list of the clusters in the ASM instance.</p>
         */
        public Builder clusters(java.util.List<Clusters> clusters) {
            this.clusters = clusters;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>31d3a0f0-07ed-4f6e-9004-1804498c****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeClustersInServiceMeshResponseBody build() {
            return new DescribeClustersInServiceMeshResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeClustersInServiceMeshResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeClustersInServiceMeshResponseBody</p>
     */
    public static class AccessLogDashboards extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private AccessLogDashboards(Builder builder) {
            this.title = builder.title;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccessLogDashboards create() {
            return builder().build();
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String title; 
            private String url; 

            private Builder() {
            } 

            private Builder(AccessLogDashboards model) {
                this.title = model.title;
                this.url = model.url;
            } 

            /**
             * <p>The name of the dashboard for access logs.</p>
             * 
             * <strong>example:</strong>
             * <p>mesh-access-log_details_cn</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * <p>The URL of the dashboard for access logs.</p>
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public AccessLogDashboards build() {
                return new AccessLogDashboards(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeClustersInServiceMeshResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeClustersInServiceMeshResponseBody</p>
     */
    public static class SMC extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        private SMC(Builder builder) {
            this.enabled = builder.enabled;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SMC create() {
            return builder().build();
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        public static final class Builder {
            private Boolean enabled; 

            private Builder() {
            } 

            private Builder(SMC model) {
                this.enabled = model.enabled;
            } 

            /**
             * Enabled.
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            public SMC build() {
                return new SMC(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeClustersInServiceMeshResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeClustersInServiceMeshResponseBody</p>
     */
    public static class GuestClusterConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SMC")
        private SMC SMC;

        private GuestClusterConfig(Builder builder) {
            this.SMC = builder.SMC;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GuestClusterConfig create() {
            return builder().build();
        }

        /**
         * @return SMC
         */
        public SMC getSMC() {
            return this.SMC;
        }

        public static final class Builder {
            private SMC SMC; 

            private Builder() {
            } 

            private Builder(GuestClusterConfig model) {
                this.SMC = model.SMC;
            } 

            /**
             * SMC.
             */
            public Builder SMC(SMC SMC) {
                this.SMC = SMC;
                return this;
            }

            public GuestClusterConfig build() {
                return new GuestClusterConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeClustersInServiceMeshResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeClustersInServiceMeshResponseBody</p>
     */
    public static class Clusters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessLogDashboards")
        private java.util.List<AccessLogDashboards> accessLogDashboards;

        @com.aliyun.core.annotation.NameInMap("ClusterDomain")
        private String clusterDomain;

        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("ClusterType")
        private String clusterType;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("GuestClusterConfig")
        private GuestClusterConfig guestClusterConfig;

        @com.aliyun.core.annotation.NameInMap("LogtailInstalledState")
        private String logtailInstalledState;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("SgId")
        private String sgId;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private Clusters(Builder builder) {
            this.accessLogDashboards = builder.accessLogDashboards;
            this.clusterDomain = builder.clusterDomain;
            this.clusterId = builder.clusterId;
            this.clusterType = builder.clusterType;
            this.creationTime = builder.creationTime;
            this.errorMessage = builder.errorMessage;
            this.guestClusterConfig = builder.guestClusterConfig;
            this.logtailInstalledState = builder.logtailInstalledState;
            this.name = builder.name;
            this.regionId = builder.regionId;
            this.sgId = builder.sgId;
            this.state = builder.state;
            this.updateTime = builder.updateTime;
            this.version = builder.version;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Clusters create() {
            return builder().build();
        }

        /**
         * @return accessLogDashboards
         */
        public java.util.List<AccessLogDashboards> getAccessLogDashboards() {
            return this.accessLogDashboards;
        }

        /**
         * @return clusterDomain
         */
        public String getClusterDomain() {
            return this.clusterDomain;
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return clusterType
         */
        public String getClusterType() {
            return this.clusterType;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return guestClusterConfig
         */
        public GuestClusterConfig getGuestClusterConfig() {
            return this.guestClusterConfig;
        }

        /**
         * @return logtailInstalledState
         */
        public String getLogtailInstalledState() {
            return this.logtailInstalledState;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return sgId
         */
        public String getSgId() {
            return this.sgId;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private java.util.List<AccessLogDashboards> accessLogDashboards; 
            private String clusterDomain; 
            private String clusterId; 
            private String clusterType; 
            private String creationTime; 
            private String errorMessage; 
            private GuestClusterConfig guestClusterConfig; 
            private String logtailInstalledState; 
            private String name; 
            private String regionId; 
            private String sgId; 
            private String state; 
            private String updateTime; 
            private String version; 
            private String vpcId; 

            private Builder() {
            } 

            private Builder(Clusters model) {
                this.accessLogDashboards = model.accessLogDashboards;
                this.clusterDomain = model.clusterDomain;
                this.clusterId = model.clusterId;
                this.clusterType = model.clusterType;
                this.creationTime = model.creationTime;
                this.errorMessage = model.errorMessage;
                this.guestClusterConfig = model.guestClusterConfig;
                this.logtailInstalledState = model.logtailInstalledState;
                this.name = model.name;
                this.regionId = model.regionId;
                this.sgId = model.sgId;
                this.state = model.state;
                this.updateTime = model.updateTime;
                this.version = model.version;
                this.vpcId = model.vpcId;
            } 

            /**
             * <p>The configurations of access log collection.</p>
             */
            public Builder accessLogDashboards(java.util.List<AccessLogDashboards> accessLogDashboards) {
                this.accessLogDashboards = accessLogDashboards;
                return this;
            }

            /**
             * <p>The domain name of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
             */
            public Builder clusterDomain(String clusterDomain) {
                this.clusterDomain = clusterDomain;
                return this;
            }

            /**
             * <p>The ID of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>c80f45444b3da447da60a911390c2****</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>The type of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>Ask</p>
             */
            public Builder clusterType(String clusterType) {
                this.clusterType = clusterType;
                return this;
            }

            /**
             * <p>The time when the cluster was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-05-12T15:38:16+08:00</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The error message.</p>
             * 
             * <strong>example:</strong>
             * <p>,</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * GuestClusterConfig.
             */
            public Builder guestClusterConfig(GuestClusterConfig guestClusterConfig) {
                this.guestClusterConfig = guestClusterConfig;
                return this;
            }

            /**
             * <p>Indicates whether the Logtail component is installed in the cluster. Valid values:</p>
             * <ul>
             * <li><code>logtail_installed</code>: The Logtail component is installed.</li>
             * </ul>
             * <p>-<code>logtail_uninstalled</code>: The Logtail component is not installed.</p>
             * <ul>
             * <li><code>logtail_state_get_error</code>: The Logtail component failed to be installed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>logtail_installed</p>
             */
            public Builder logtailInstalledState(String logtailInstalledState) {
                this.logtailInstalledState = logtailInstalledState;
                return this;
            }

            /**
             * <p>The name of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>ask1</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The ID of the region in which the cluster resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The ID of the security group.</p>
             * 
             * <strong>example:</strong>
             * <p>sg-bp197668l6iupljy****</p>
             */
            public Builder sgId(String sgId) {
                this.sgId = sgId;
                return this;
            }

            /**
             * <p>The status of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>running</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * <p>The time when the cluster was last modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-05-12T15:38:16+08:00</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>The version number of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>v1.16.6-aliyun.1</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            /**
             * <p>The ID of the virtual private cloud (VPC).</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-2zew0rajjkmxy2369****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public Clusters build() {
                return new Clusters(this);
            } 

        } 

    }
}
