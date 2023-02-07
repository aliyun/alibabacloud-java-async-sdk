// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adcp20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeManagedClustersResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeManagedClustersResponseBody</p>
 */
public class DescribeManagedClustersResponseBody extends TeaModel {
    @NameInMap("Clusters")
    private java.util.List < Clusters> clusters;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeManagedClustersResponseBody(Builder builder) {
        this.clusters = builder.clusters;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeManagedClustersResponseBody create() {
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
         * Information about the master instance.
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

        public DescribeManagedClustersResponseBody build() {
            return new DescribeManagedClustersResponseBody(this);
        } 

    } 

    public static class Cluster extends TeaModel {
        @NameInMap("ClusterID")
        private String clusterID;

        @NameInMap("ClusterSpec")
        private String clusterSpec;

        @NameInMap("ClusterType")
        private String clusterType;

        @NameInMap("Created")
        private String created;

        @NameInMap("CurrentVersion")
        private String currentVersion;

        @NameInMap("InitVersion")
        private String initVersion;

        @NameInMap("Name")
        private String name;

        @NameInMap("Profile")
        private String profile;

        @NameInMap("Region")
        private String region;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("State")
        private String state;

        @NameInMap("Updated")
        private String updated;

        @NameInMap("VSwitchID")
        private String vSwitchID;

        @NameInMap("VpcID")
        private String vpcID;

        private Cluster(Builder builder) {
            this.clusterID = builder.clusterID;
            this.clusterSpec = builder.clusterSpec;
            this.clusterType = builder.clusterType;
            this.created = builder.created;
            this.currentVersion = builder.currentVersion;
            this.initVersion = builder.initVersion;
            this.name = builder.name;
            this.profile = builder.profile;
            this.region = builder.region;
            this.resourceGroupId = builder.resourceGroupId;
            this.state = builder.state;
            this.updated = builder.updated;
            this.vSwitchID = builder.vSwitchID;
            this.vpcID = builder.vpcID;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Cluster create() {
            return builder().build();
        }

        /**
         * @return clusterID
         */
        public String getClusterID() {
            return this.clusterID;
        }

        /**
         * @return clusterSpec
         */
        public String getClusterSpec() {
            return this.clusterSpec;
        }

        /**
         * @return clusterType
         */
        public String getClusterType() {
            return this.clusterType;
        }

        /**
         * @return created
         */
        public String getCreated() {
            return this.created;
        }

        /**
         * @return currentVersion
         */
        public String getCurrentVersion() {
            return this.currentVersion;
        }

        /**
         * @return initVersion
         */
        public String getInitVersion() {
            return this.initVersion;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return profile
         */
        public String getProfile() {
            return this.profile;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return updated
         */
        public String getUpdated() {
            return this.updated;
        }

        /**
         * @return vSwitchID
         */
        public String getVSwitchID() {
            return this.vSwitchID;
        }

        /**
         * @return vpcID
         */
        public String getVpcID() {
            return this.vpcID;
        }

        public static final class Builder {
            private String clusterID; 
            private String clusterSpec; 
            private String clusterType; 
            private String created; 
            private String currentVersion; 
            private String initVersion; 
            private String name; 
            private String profile; 
            private String region; 
            private String resourceGroupId; 
            private String state; 
            private String updated; 
            private String vSwitchID; 
            private String vpcID; 

            /**
             * The ID of the master instance.
             */
            public Builder clusterID(String clusterID) {
                this.clusterID = clusterID;
                return this;
            }

            /**
             * The specification of the master instance. Valid values: - ack.pro.small: ACK Pro.
             */
            public Builder clusterSpec(String clusterSpec) {
                this.clusterSpec = clusterSpec;
                return this;
            }

            /**
             * The type of the master instance.
             */
            public Builder clusterType(String clusterType) {
                this.clusterType = clusterType;
                return this;
            }

            /**
             * The time when the master instance was created.
             */
            public Builder created(String created) {
                this.created = created;
                return this;
            }

            /**
             * The current Kubernetes version of the master instance.
             */
            public Builder currentVersion(String currentVersion) {
                this.currentVersion = currentVersion;
                return this;
            }

            /**
             * The original Kubernetes version of the master instance.
             */
            public Builder initVersion(String initVersion) {
                this.initVersion = initVersion;
                return this;
            }

            /**
             * The name of the master instance.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The name of the master instance.
             */
            public Builder profile(String profile) {
                this.profile = profile;
                return this;
            }

            /**
             * The region in which the master instance resides.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * The ID of the resource group.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The status of the associated clusters. Valid values: - initial: The associated clusters are being initialized. - failed: The associated clustersfailed to be created. - running: The associated clusters are running. - inactive: The associated clusters are inactive. - deleting: The associated clusters are being deleted. - deleted: The associated clusters are deleted.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * The time when the master instance was updated.
             */
            public Builder updated(String updated) {
                this.updated = updated;
                return this;
            }

            /**
             * The ID of the vSwitch.
             */
            public Builder vSwitchID(String vSwitchID) {
                this.vSwitchID = vSwitchID;
                return this;
            }

            /**
             * VPC ID.
             */
            public Builder vpcID(String vpcID) {
                this.vpcID = vpcID;
                return this;
            }

            public Cluster build() {
                return new Cluster(this);
            } 

        } 

    }
    public static class MeshStatus extends TeaModel {
        @NameInMap("InMesh")
        private Boolean inMesh;

        private MeshStatus(Builder builder) {
            this.inMesh = builder.inMesh;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MeshStatus create() {
            return builder().build();
        }

        /**
         * @return inMesh
         */
        public Boolean getInMesh() {
            return this.inMesh;
        }

        public static final class Builder {
            private Boolean inMesh; 

            /**
             * Indicates whether the clusters are associated with ASM instances. Valid values: - true: The clusters are associated with ASM instances. - false: The clusters are not associated with ASM instances.
             */
            public Builder inMesh(Boolean inMesh) {
                this.inMesh = inMesh;
                return this;
            }

            public MeshStatus build() {
                return new MeshStatus(this);
            } 

        } 

    }
    public static class Status extends TeaModel {
        @NameInMap("Message")
        private String message;

        @NameInMap("State")
        private String state;

        private Status(Builder builder) {
            this.message = builder.message;
            this.state = builder.state;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Status create() {
            return builder().build();
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        public static final class Builder {
            private String message; 
            private String state; 

            /**
             * The status information.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * The status of the association between the clusters and the master instance. Valid values: - Installing: The clusters are being associated with the master instance. - Successed: The clusters are associated with the master instance. - Failed: The clusters failed to be associated with the master instance. - Deleting: The clusters are being disassociated from the master instance. - Deleted: The clusters are disassociated from the master instance.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            public Status build() {
                return new Status(this);
            } 

        } 

    }
    public static class Clusters extends TeaModel {
        @NameInMap("Cluster")
        private Cluster cluster;

        @NameInMap("MeshStatus")
        private MeshStatus meshStatus;

        @NameInMap("Status")
        private Status status;

        private Clusters(Builder builder) {
            this.cluster = builder.cluster;
            this.meshStatus = builder.meshStatus;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Clusters create() {
            return builder().build();
        }

        /**
         * @return cluster
         */
        public Cluster getCluster() {
            return this.cluster;
        }

        /**
         * @return meshStatus
         */
        public MeshStatus getMeshStatus() {
            return this.meshStatus;
        }

        /**
         * @return status
         */
        public Status getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Cluster cluster; 
            private MeshStatus meshStatus; 
            private Status status; 

            /**
             * The name of the master instance.
             */
            public Builder cluster(Cluster cluster) {
                this.cluster = cluster;
                return this;
            }

            /**
             * The status of the association between the clusters and Service Mesh (ASM).
             */
            public Builder meshStatus(MeshStatus meshStatus) {
                this.meshStatus = meshStatus;
                return this;
            }

            /**
             * The status of the association between the clusters and the master instance.
             */
            public Builder status(Status status) {
                this.status = status;
                return this;
            }

            public Clusters build() {
                return new Clusters(this);
            } 

        } 

    }
}
