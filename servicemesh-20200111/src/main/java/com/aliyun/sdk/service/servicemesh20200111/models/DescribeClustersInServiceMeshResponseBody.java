// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClustersInServiceMeshResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeClustersInServiceMeshResponseBody</p>
 */
public class DescribeClustersInServiceMeshResponseBody extends TeaModel {
    @NameInMap("Clusters")
    private java.util.List < Clusters> clusters;

    @NameInMap("RequestId")
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

    /**
     * @return clusters
     */
    public java.util.List < Clusters> getClusters() {
        return this.clusters;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Clusters> clusters; 
        private String requestId; 

        /**
         * The clusters in the ASM instance.
         */
        public Builder clusters(java.util.List < Clusters> clusters) {
            this.clusters = clusters;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeClustersInServiceMeshResponseBody build() {
            return new DescribeClustersInServiceMeshResponseBody(this);
        } 

    } 

    public static class AccessLogDashboards extends TeaModel {
        @NameInMap("Title")
        private String title;

        @NameInMap("Url")
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

            /**
             * The name of the dashboard for access logs.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * The URL of the dashboard for access logs.
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
    public static class Clusters extends TeaModel {
        @NameInMap("AccessLogDashboards")
        private java.util.List < AccessLogDashboards> accessLogDashboards;

        @NameInMap("ClusterDomain")
        private String clusterDomain;

        @NameInMap("ClusterId")
        private String clusterId;

        @NameInMap("ClusterType")
        private String clusterType;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("LogtailInstalledState")
        private String logtailInstalledState;

        @NameInMap("Name")
        private String name;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("SgId")
        private String sgId;

        @NameInMap("State")
        private String state;

        @NameInMap("UpdateTime")
        private String updateTime;

        @NameInMap("Version")
        private String version;

        @NameInMap("VpcId")
        private String vpcId;

        private Clusters(Builder builder) {
            this.accessLogDashboards = builder.accessLogDashboards;
            this.clusterDomain = builder.clusterDomain;
            this.clusterId = builder.clusterId;
            this.clusterType = builder.clusterType;
            this.creationTime = builder.creationTime;
            this.errorMessage = builder.errorMessage;
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
        public java.util.List < AccessLogDashboards> getAccessLogDashboards() {
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
            private java.util.List < AccessLogDashboards> accessLogDashboards; 
            private String clusterDomain; 
            private String clusterId; 
            private String clusterType; 
            private String creationTime; 
            private String errorMessage; 
            private String logtailInstalledState; 
            private String name; 
            private String regionId; 
            private String sgId; 
            private String state; 
            private String updateTime; 
            private String version; 
            private String vpcId; 

            /**
             * The configurations of access log collection.
             */
            public Builder accessLogDashboards(java.util.List < AccessLogDashboards> accessLogDashboards) {
                this.accessLogDashboards = accessLogDashboards;
                return this;
            }

            /**
             * The domain of the cluster.
             */
            public Builder clusterDomain(String clusterDomain) {
                this.clusterDomain = clusterDomain;
                return this;
            }

            /**
             * The ID of the cluster.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * The type of the cluster.
             */
            public Builder clusterType(String clusterType) {
                this.clusterType = clusterType;
                return this;
            }

            /**
             * The point in time when the cluster was created.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The error message that is returned when the call failed.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * Indicates whether the Logtail component is installed in the cluster. Valid values:
             * <p>
             * 
             * *   `logtail_installed`: The Logtail component is installed.
             * 
             * \-`logtail_uninstalled`: The Logtail component is not installed.
             * 
             * *   `logtail_state_get_error`: The Logtail component fails to be installed.
             */
            public Builder logtailInstalledState(String logtailInstalledState) {
                this.logtailInstalledState = logtailInstalledState;
                return this;
            }

            /**
             * The name of the cluster.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The ID of the region in which the cluster resides.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The ID of the security group.
             */
            public Builder sgId(String sgId) {
                this.sgId = sgId;
                return this;
            }

            /**
             * The status of the cluster.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * The point in time when the cluster was last modified.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * The version number of the cluster.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            /**
             * The ID of the virtual private cloud (VPC).
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
