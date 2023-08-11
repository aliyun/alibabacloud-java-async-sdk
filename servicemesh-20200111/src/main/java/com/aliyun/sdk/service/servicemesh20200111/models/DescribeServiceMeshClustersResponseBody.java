// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeServiceMeshClustersResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeServiceMeshClustersResponseBody</p>
 */
public class DescribeServiceMeshClustersResponseBody extends TeaModel {
    @NameInMap("Clusters")
    private java.util.List < Clusters> clusters;

    @NameInMap("NumberOfClusters")
    private Long numberOfClusters;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeServiceMeshClustersResponseBody(Builder builder) {
        this.clusters = builder.clusters;
        this.numberOfClusters = builder.numberOfClusters;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeServiceMeshClustersResponseBody create() {
        return builder().build();
    }

    /**
     * @return clusters
     */
    public java.util.List < Clusters> getClusters() {
        return this.clusters;
    }

    /**
     * @return numberOfClusters
     */
    public Long getNumberOfClusters() {
        return this.numberOfClusters;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Clusters> clusters; 
        private Long numberOfClusters; 
        private String requestId; 

        /**
         * The queried clusters.
         */
        public Builder clusters(java.util.List < Clusters> clusters) {
            this.clusters = clusters;
            return this;
        }

        /**
         * NumberOfClusters.
         */
        public Builder numberOfClusters(Long numberOfClusters) {
            this.numberOfClusters = numberOfClusters;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeServiceMeshClustersResponseBody build() {
            return new DescribeServiceMeshClustersResponseBody(this);
        } 

    } 

    public static class Clusters extends TeaModel {
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

        @NameInMap("ForbiddenFlag")
        private Long forbiddenFlag;

        @NameInMap("ForbiddenInfo")
        private String forbiddenInfo;

        @NameInMap("Name")
        private String name;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("ServiceMeshId")
        private String serviceMeshId;

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
            this.clusterDomain = builder.clusterDomain;
            this.clusterId = builder.clusterId;
            this.clusterType = builder.clusterType;
            this.creationTime = builder.creationTime;
            this.errorMessage = builder.errorMessage;
            this.forbiddenFlag = builder.forbiddenFlag;
            this.forbiddenInfo = builder.forbiddenInfo;
            this.name = builder.name;
            this.regionId = builder.regionId;
            this.serviceMeshId = builder.serviceMeshId;
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
         * @return forbiddenFlag
         */
        public Long getForbiddenFlag() {
            return this.forbiddenFlag;
        }

        /**
         * @return forbiddenInfo
         */
        public String getForbiddenInfo() {
            return this.forbiddenInfo;
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
         * @return serviceMeshId
         */
        public String getServiceMeshId() {
            return this.serviceMeshId;
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
            private String clusterDomain; 
            private String clusterId; 
            private String clusterType; 
            private String creationTime; 
            private String errorMessage; 
            private Long forbiddenFlag; 
            private String forbiddenInfo; 
            private String name; 
            private String regionId; 
            private String serviceMeshId; 
            private String sgId; 
            private String state; 
            private String updateTime; 
            private String version; 
            private String vpcId; 

            /**
             * The domain name of the cluster.
             */
            public Builder clusterDomain(String clusterDomain) {
                this.clusterDomain = clusterDomain;
                return this;
            }

            /**
             * The cluster ID.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * The cluster type.
             */
            public Builder clusterType(String clusterType) {
                this.clusterType = clusterType;
                return this;
            }

            /**
             * The time when the cluster was created.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The error message about the cluster.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * Indicates that the cluster is available or the reason why the cluster cannot be added to the ASM instance. Valid values:
             * <p>
             * 
             * *   `0`: The cluster can be added to the ASM instance.
             * *   `1`: The cluster cannot be added to the ASM instance because you do not have administrator permissions on the cluster.
             * *   `2`: The cluster cannot be added to the ASM instance because the cluster and the ASM instance reside in different VPCs between which no private connections are built.
             * *   `3`: The CIDR block of the cluster conflicts with that of the ASM instance.
             * *   `4`: The cluster has a namespace that is named istio system.
             */
            public Builder forbiddenFlag(Long forbiddenFlag) {
                this.forbiddenFlag = forbiddenFlag;
                return this;
            }

            /**
             * ForbiddenInfo.
             */
            public Builder forbiddenInfo(String forbiddenInfo) {
                this.forbiddenInfo = forbiddenInfo;
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
             * The ID of the ASM instance.
             */
            public Builder serviceMeshId(String serviceMeshId) {
                this.serviceMeshId = serviceMeshId;
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
             * The state of the cluster. Valid values:
             * <p>
             * 
             * *   `running`: The cluster is running.
             * *   `starting`: The cluster is starting.
             * *   `stopping`: The cluster is being stopped.
             * *   `stopped`: The cluster is stopped.
             * *   `failed`: The cluster fails to be run.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * The time when the cluster was last modified.
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
