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

    @NameInMap("RequestId")
    private String requestId;

    private DescribeServiceMeshClustersResponseBody(Builder builder) {
        this.clusters = builder.clusters;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Clusters> clusters; 
        private String requestId; 

        /**
         * Clusters.
         */
        public Builder clusters(java.util.List < Clusters> clusters) {
            this.clusters = clusters;
            return this;
        }

        /**
         * RequestId.
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
            private String name; 
            private String regionId; 
            private String serviceMeshId; 
            private String sgId; 
            private String state; 
            private String updateTime; 
            private String version; 
            private String vpcId; 

            /**
             * ClusterDomain.
             */
            public Builder clusterDomain(String clusterDomain) {
                this.clusterDomain = clusterDomain;
                return this;
            }

            /**
             * ClusterId.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * ClusterType.
             */
            public Builder clusterType(String clusterType) {
                this.clusterType = clusterType;
                return this;
            }

            /**
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * ErrorMessage.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * ForbiddenFlag.
             */
            public Builder forbiddenFlag(Long forbiddenFlag) {
                this.forbiddenFlag = forbiddenFlag;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * ServiceMeshId.
             */
            public Builder serviceMeshId(String serviceMeshId) {
                this.serviceMeshId = serviceMeshId;
                return this;
            }

            /**
             * SgId.
             */
            public Builder sgId(String sgId) {
                this.sgId = sgId;
                return this;
            }

            /**
             * State.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            /**
             * VpcId.
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
