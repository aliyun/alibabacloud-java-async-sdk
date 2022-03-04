// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClustersV1ResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeClustersV1ResponseBody</p>
 */
public class DescribeClustersV1ResponseBody extends TeaModel {
    @NameInMap("clusters")
    private java.util.List < Clusters> clusters;

    @NameInMap("page_info")
    private PageInfo pageInfo;

    private DescribeClustersV1ResponseBody(Builder builder) {
        this.clusters = builder.clusters;
        this.pageInfo = builder.pageInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClustersV1ResponseBody create() {
        return builder().build();
    }

    /**
     * @return clusters
     */
    public java.util.List < Clusters> getClusters() {
        return this.clusters;
    }

    /**
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    public static final class Builder {
        private java.util.List < Clusters> clusters; 
        private PageInfo pageInfo; 

        /**
         * The list of cluster information.
         */
        public Builder clusters(java.util.List < Clusters> clusters) {
            this.clusters = clusters;
            return this;
        }

        /**
         * The page information.
         * <p>
         * 
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        public DescribeClustersV1ResponseBody build() {
            return new DescribeClustersV1ResponseBody(this);
        } 

    } 

    public static class Clusters extends TeaModel {
        @NameInMap("cluster_id")
        private String clusterId;

        @NameInMap("cluster_type")
        private String clusterType;

        @NameInMap("created")
        private String created;

        @NameInMap("init_version")
        private String initVersion;

        @NameInMap("current_version")
        private String currentVersion;

        @NameInMap("next_version")
        private String nextVersion;

        @NameInMap("deletion_protection")
        private Boolean deletionProtection;

        @NameInMap("docker_version")
        private String dockerVersion;

        @NameInMap("external_loadbalancer_id")
        private String externalLoadbalancerId;

        @NameInMap("master_url")
        private String masterUrl;

        @NameInMap("meta_data")
        private String metaData;

        @NameInMap("name")
        private String name;

        @NameInMap("network_mode")
        private String networkMode;

        @NameInMap("private_zone")
        private Boolean privateZone;

        @NameInMap("profile")
        private String profile;

        @NameInMap("region_id")
        private String regionId;

        @NameInMap("resource_group_id")
        private String resourceGroupId;

        @NameInMap("security_group_id")
        private String securityGroupId;

        @NameInMap("size")
        private Long size;

        @NameInMap("state")
        private String state;

        @NameInMap("subnet_cidr")
        private String subnetCidr;

        @NameInMap("tags")
        private java.util.List < Tag > tags;

        @NameInMap("updated")
        private String updated;

        @NameInMap("vpc_id")
        private String vpcId;

        @NameInMap("vswitch_id")
        private String vswitchId;

        @NameInMap("worker_ram_role_name")
        private String workerRamRoleName;

        @NameInMap("zone_id")
        private String zoneId;

        @NameInMap("cluster_spec")
        private String clusterSpec;

        @NameInMap("maintenance_window")
        private MaintenanceWindow maintenanceWindow;

        private Clusters(Builder builder) {
            this.clusterId = builder.clusterId;
            this.clusterType = builder.clusterType;
            this.created = builder.created;
            this.initVersion = builder.initVersion;
            this.currentVersion = builder.currentVersion;
            this.nextVersion = builder.nextVersion;
            this.deletionProtection = builder.deletionProtection;
            this.dockerVersion = builder.dockerVersion;
            this.externalLoadbalancerId = builder.externalLoadbalancerId;
            this.masterUrl = builder.masterUrl;
            this.metaData = builder.metaData;
            this.name = builder.name;
            this.networkMode = builder.networkMode;
            this.privateZone = builder.privateZone;
            this.profile = builder.profile;
            this.regionId = builder.regionId;
            this.resourceGroupId = builder.resourceGroupId;
            this.securityGroupId = builder.securityGroupId;
            this.size = builder.size;
            this.state = builder.state;
            this.subnetCidr = builder.subnetCidr;
            this.tags = builder.tags;
            this.updated = builder.updated;
            this.vpcId = builder.vpcId;
            this.vswitchId = builder.vswitchId;
            this.workerRamRoleName = builder.workerRamRoleName;
            this.zoneId = builder.zoneId;
            this.clusterSpec = builder.clusterSpec;
            this.maintenanceWindow = builder.maintenanceWindow;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Clusters create() {
            return builder().build();
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
         * @return created
         */
        public String getCreated() {
            return this.created;
        }

        /**
         * @return initVersion
         */
        public String getInitVersion() {
            return this.initVersion;
        }

        /**
         * @return currentVersion
         */
        public String getCurrentVersion() {
            return this.currentVersion;
        }

        /**
         * @return nextVersion
         */
        public String getNextVersion() {
            return this.nextVersion;
        }

        /**
         * @return deletionProtection
         */
        public Boolean getDeletionProtection() {
            return this.deletionProtection;
        }

        /**
         * @return dockerVersion
         */
        public String getDockerVersion() {
            return this.dockerVersion;
        }

        /**
         * @return externalLoadbalancerId
         */
        public String getExternalLoadbalancerId() {
            return this.externalLoadbalancerId;
        }

        /**
         * @return masterUrl
         */
        public String getMasterUrl() {
            return this.masterUrl;
        }

        /**
         * @return metaData
         */
        public String getMetaData() {
            return this.metaData;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return networkMode
         */
        public String getNetworkMode() {
            return this.networkMode;
        }

        /**
         * @return privateZone
         */
        public Boolean getPrivateZone() {
            return this.privateZone;
        }

        /**
         * @return profile
         */
        public String getProfile() {
            return this.profile;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return securityGroupId
         */
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        /**
         * @return size
         */
        public Long getSize() {
            return this.size;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return subnetCidr
         */
        public String getSubnetCidr() {
            return this.subnetCidr;
        }

        /**
         * @return tags
         */
        public java.util.List < Tag > getTags() {
            return this.tags;
        }

        /**
         * @return updated
         */
        public String getUpdated() {
            return this.updated;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return vswitchId
         */
        public String getVswitchId() {
            return this.vswitchId;
        }

        /**
         * @return workerRamRoleName
         */
        public String getWorkerRamRoleName() {
            return this.workerRamRoleName;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        /**
         * @return clusterSpec
         */
        public String getClusterSpec() {
            return this.clusterSpec;
        }

        /**
         * @return maintenanceWindow
         */
        public MaintenanceWindow getMaintenanceWindow() {
            return this.maintenanceWindow;
        }

        public static final class Builder {
            private String clusterId; 
            private String clusterType; 
            private String created; 
            private String initVersion; 
            private String currentVersion; 
            private String nextVersion; 
            private Boolean deletionProtection; 
            private String dockerVersion; 
            private String externalLoadbalancerId; 
            private String masterUrl; 
            private String metaData; 
            private String name; 
            private String networkMode; 
            private Boolean privateZone; 
            private String profile; 
            private String regionId; 
            private String resourceGroupId; 
            private String securityGroupId; 
            private Long size; 
            private String state; 
            private String subnetCidr; 
            private java.util.List < Tag > tags; 
            private String updated; 
            private String vpcId; 
            private String vswitchId; 
            private String workerRamRoleName; 
            private String zoneId; 
            private String clusterSpec; 
            private MaintenanceWindow maintenanceWindow; 

            /**
             * The ID of the cluster.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * The type of the cluster. Valid values:
             * <p>
             * 
             * -"Kubernetes": dedicated cluster.
             * -"ManagedKubernetes": managed cluster.
             * -"Ask":Serverless cluster.
             * -"ExternalKubernetes": registers a cluster.
             * 
             */
            public Builder clusterType(String clusterType) {
                this.clusterType = clusterType;
                return this;
            }

            /**
             * The time when the cluster was created.
             */
            public Builder created(String created) {
                this.created = created;
                return this;
            }

            /**
             * The cluster version, which is consistent with the baseline version of the Kubernetes community. We recommend that you select the latest version. If not specified, the latest version is used by default.
             * <p>
             * 
             * Currently, the ACK console provides two latest Kubernetes clusters. You can use the API to create other Kubernetes clusters. For more information about the Kubernetes versions supported by ACK, see [Kubernetes Release Overview](~~ 185269 ~~).
             */
            public Builder initVersion(String initVersion) {
                this.initVersion = initVersion;
                return this;
            }

            /**
             * The current version of the cluster.
             */
            public Builder currentVersion(String currentVersion) {
                this.currentVersion = currentVersion;
                return this;
            }

            /**
             * You can upgrade the cluster version.
             */
            public Builder nextVersion(String nextVersion) {
                this.nextVersion = nextVersion;
                return this;
            }

            /**
             * Cluster deletion protection to prevent accidental deletion of clusters through the console or API. Valid values:
             * <p>
             * 
             * -"true": If you enable cluster deletion protection, the cluster cannot be deleted through the console or API.
             * -"false": If you do not enable cluster deletion protection, you can delete the cluster through the console or API.
             * 
             */
            public Builder deletionProtection(Boolean deletionProtection) {
                this.deletionProtection = deletionProtection;
                return this;
            }

            /**
             * The Docker version of the cluster.
             */
            public Builder dockerVersion(String dockerVersion) {
                this.dockerVersion = dockerVersion;
                return this;
            }

            /**
             * Ingress SLB instances in the cluster.
             * <p>
             * 
             * Default instance type: guaranteed-performance (slb.s1.small).
             */
            public Builder externalLoadbalancerId(String externalLoadbalancerId) {
                this.externalLoadbalancerId = externalLoadbalancerId;
                return this;
            }

            /**
             * The API Server endpoint of the cluster, including the intranet endpoint and the internet endpoint.
             */
            public Builder masterUrl(String masterUrl) {
                this.masterUrl = masterUrl;
                return this;
            }

            /**
             * The metadata of the cluster.
             */
            public Builder metaData(String metaData) {
                this.metaData = metaData;
                return this;
            }

            /**
             * The name of the cluster.
             * <p>
             * 
             * Naming rule: the name must be 1 to 63 characters in length and cannot start with a hyphen (-). It must be 1 to 63 characters in length.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The network mode of the cluster. Valid values:
             * <p>
             * 
             * -"classic": classic network.
             * -"vpc": VPC.
             * -"overlay": superimposed network.
             * -"calico":Calico network.
             * 
             */
            public Builder networkMode(String networkMode) {
                this.networkMode = networkMode;
                return this;
            }

            /**
             * Configure the cluster Private Zone. Valid values:
             * <p>
             * 
             * -"true": enables Private Zone.
             * -"false": disable Private Zone.
             * 
             */
            public Builder privateZone(Boolean privateZone) {
                this.privateZone = privateZone;
                return this;
            }

            /**
             * The ID of the cluster. Valid values:
             * <p>
             * 
             * -"Edge": Edge managed cluster.
             * -"Default": non-edge managed cluster.
             * 
             * 
             */
            public Builder profile(String profile) {
                this.profile = profile;
                return this;
            }

            /**
             * The region ID of the cluster.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The ID of the cluster resource group.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The ID of the cluster security group.
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * The current number of nodes in the cluster, including Master nodes and Worker nodes.
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * The running status of the cluster. Valid values:
             * <p>
             * 
             * -"initial": the cluster is being created.
             * -"failed": cluster creation failed.
             * -"running": the cluster is running.
             * -"updating": the cluster is being upgraded.
             * -"Updating_failed ": Cluster Upgrade failed.
             * -"scaling": the cluster is scaling.
             * -"stopped": the cluster has stopped running.
             * -"deleting": the cluster is being deleted.
             * -"deleted": the cluster has been deleted.
             * -"Delete_failed ": the cluster failed to be deleted.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * The Pod CIDR block, which must be a valid private CIDR block, namely the following CIDR blocks and their subnets:
             * <p>
             * -10.0.0.0/8
             * -172.16-31.0.0/12-16
             * -192.168.0.0/16
             * 
             * It cannot be the same as the CIDR block used by the VPC or the existing Kubernetes cluster in the VPC. After the cluster is created, it cannot be modified.
             * 
             * For more information about cluster network planning, see [Kubernetes CIDR block planning in VPC](~~ 86500 ~~).
             */
            public Builder subnetCidr(String subnetCidr) {
                this.subnetCidr = subnetCidr;
                return this;
            }

            /**
             * The tag of the cluster resource.
             */
            public Builder tags(java.util.List < Tag > tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The time when the cluster was updated.
             */
            public Builder updated(String updated) {
                this.updated = updated;
                return this;
            }

            /**
             * The ID of the VPC. This parameter is required when you create a cluster.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * The ID of the vSwitch. You can select one to three vswitches when creating a cluster. To ensure high availability of the cluster, we recommend that you select vswitches in different zones.
             */
            public Builder vswitchId(String vswitchId) {
                this.vswitchId = vswitchId;
                return this;
            }

            /**
             * Worker RAM role name to authorize the ECS instance to be a cluster Woker node.
             */
            public Builder workerRamRoleName(String workerRamRoleName) {
                this.workerRamRoleName = workerRamRoleName;
                return this;
            }

            /**
             * The ID of the zone to which the cluster belongs.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            /**
             * The type of the managed cluster. Valid values:
             * <p>
             * -"ack.pro.small": a professional managed cluster.
             * -"ack.standard": Standard managed cluster.
             * 
             * 
             */
            public Builder clusterSpec(String clusterSpec) {
                this.clusterSpec = clusterSpec;
                return this;
            }

            /**
             * Cluster maintenance window. This feature takes effect only in the professional managed edition.
             */
            public Builder maintenanceWindow(MaintenanceWindow maintenanceWindow) {
                this.maintenanceWindow = maintenanceWindow;
                return this;
            }

            public Clusters build() {
                return new Clusters(this);
            } 

        } 

    }
    public static class PageInfo extends TeaModel {
        @NameInMap("page_number")
        private Integer pageNumber;

        @NameInMap("page_size")
        private Integer pageSize;

        @NameInMap("total_count")
        private Integer totalCount;

        private PageInfo(Builder builder) {
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageInfo create() {
            return builder().build();
        }

        /**
         * @return pageNumber
         */
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * The number of pages to return.
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * The size of each page.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The total number of results.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PageInfo build() {
                return new PageInfo(this);
            } 

        } 

    }
}
