// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClustersV1ResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeClustersV1ResponseBody</p>
 */
public class DescribeClustersV1ResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("clusters")
    private java.util.List < Clusters> clusters;

    @com.aliyun.core.annotation.NameInMap("page_info")
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
         * The details of the clusters.
         */
        public Builder clusters(java.util.List < Clusters> clusters) {
            this.clusters = clusters;
            return this;
        }

        /**
         * The pagination information.
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
        @com.aliyun.core.annotation.NameInMap("cluster_id")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("cluster_spec")
        private String clusterSpec;

        @com.aliyun.core.annotation.NameInMap("cluster_type")
        private String clusterType;

        @com.aliyun.core.annotation.NameInMap("created")
        private String created;

        @com.aliyun.core.annotation.NameInMap("current_version")
        private String currentVersion;

        @com.aliyun.core.annotation.NameInMap("deletion_protection")
        private Boolean deletionProtection;

        @com.aliyun.core.annotation.NameInMap("docker_version")
        private String dockerVersion;

        @com.aliyun.core.annotation.NameInMap("external_loadbalancer_id")
        private String externalLoadbalancerId;

        @com.aliyun.core.annotation.NameInMap("init_version")
        private String initVersion;

        @com.aliyun.core.annotation.NameInMap("maintenance_window")
        private MaintenanceWindow maintenanceWindow;

        @com.aliyun.core.annotation.NameInMap("master_url")
        private String masterUrl;

        @com.aliyun.core.annotation.NameInMap("meta_data")
        private String metaData;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("network_mode")
        private String networkMode;

        @com.aliyun.core.annotation.NameInMap("next_version")
        private String nextVersion;

        @com.aliyun.core.annotation.NameInMap("private_zone")
        private Boolean privateZone;

        @com.aliyun.core.annotation.NameInMap("profile")
        private String profile;

        @com.aliyun.core.annotation.NameInMap("region_id")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("resource_group_id")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("security_group_id")
        private String securityGroupId;

        @com.aliyun.core.annotation.NameInMap("size")
        private Long size;

        @com.aliyun.core.annotation.NameInMap("state")
        private String state;

        @com.aliyun.core.annotation.NameInMap("subnet_cidr")
        private String subnetCidr;

        @com.aliyun.core.annotation.NameInMap("tags")
        private java.util.List < Tag > tags;

        @com.aliyun.core.annotation.NameInMap("updated")
        private String updated;

        @com.aliyun.core.annotation.NameInMap("vpc_id")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("vswitch_id")
        private String vswitchId;

        @com.aliyun.core.annotation.NameInMap("worker_ram_role_name")
        private String workerRamRoleName;

        @com.aliyun.core.annotation.NameInMap("zone_id")
        private String zoneId;

        private Clusters(Builder builder) {
            this.clusterId = builder.clusterId;
            this.clusterSpec = builder.clusterSpec;
            this.clusterType = builder.clusterType;
            this.created = builder.created;
            this.currentVersion = builder.currentVersion;
            this.deletionProtection = builder.deletionProtection;
            this.dockerVersion = builder.dockerVersion;
            this.externalLoadbalancerId = builder.externalLoadbalancerId;
            this.initVersion = builder.initVersion;
            this.maintenanceWindow = builder.maintenanceWindow;
            this.masterUrl = builder.masterUrl;
            this.metaData = builder.metaData;
            this.name = builder.name;
            this.networkMode = builder.networkMode;
            this.nextVersion = builder.nextVersion;
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
         * @return initVersion
         */
        public String getInitVersion() {
            return this.initVersion;
        }

        /**
         * @return maintenanceWindow
         */
        public MaintenanceWindow getMaintenanceWindow() {
            return this.maintenanceWindow;
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
         * @return nextVersion
         */
        public String getNextVersion() {
            return this.nextVersion;
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

        public static final class Builder {
            private String clusterId; 
            private String clusterSpec; 
            private String clusterType; 
            private String created; 
            private String currentVersion; 
            private Boolean deletionProtection; 
            private String dockerVersion; 
            private String externalLoadbalancerId; 
            private String initVersion; 
            private MaintenanceWindow maintenanceWindow; 
            private String masterUrl; 
            private String metaData; 
            private String name; 
            private String networkMode; 
            private String nextVersion; 
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

            /**
             * The cluster ID.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * After you set `cluster_type` to `ManagedKubernetes` and configure the `profile` parameter, you can further specify the edition of the cluster. Valid values:
             * <p>
             * 
             * *   `ack.pro.small`: ACK Pro cluster.
             * *   `ack.standard`: ACK Basic cluster. If you leave the parameter empty, ACK Basic cluster is selected.
             */
            public Builder clusterSpec(String clusterSpec) {
                this.clusterSpec = clusterSpec;
                return this;
            }

            /**
             * *   `Kubernetes`: ACK dedicated cluster.
             * <p>
             * *   `ManagedKubernetes`: ACK managed cluster. ACK managed clusters include ACK Basic clusters, ACK Pro clusters, ACK Serverless Basic clusters, ACK Serverless Pro clusters, ACK Edge Basic clusters, ACK Edge Pro clusters, and ACK Lingjun Pro clusters.
             * *   `ExternalKubernetes`: registered cluster.
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
             * The Kubernetes version of the cluster.
             */
            public Builder currentVersion(String currentVersion) {
                this.currentVersion = currentVersion;
                return this;
            }

            /**
             * Specifies whether to enable cluster deletion protection. If this option is enabled, the cluster cannot be deleted in the ACK console or by calling API operations. Valid values:
             * <p>
             * 
             * *   `true`: enables deletion protection for the cluster. This way, the cluster cannot be deleted in the ACK console or by calling API operations.
             * *   `false`: disables deletion protection for the cluster. This way, the cluster can be deleted in the ACK console or by calling API operations.
             */
            public Builder deletionProtection(Boolean deletionProtection) {
                this.deletionProtection = deletionProtection;
                return this;
            }

            /**
             * The Docker version that is used by the cluster.
             */
            public Builder dockerVersion(String dockerVersion) {
                this.dockerVersion = dockerVersion;
                return this;
            }

            /**
             * The ID of the Server Load Balancer (SLB) instance that is used by the Ingresses of the cluster.
             * <p>
             * 
             * The default SLB specification is slb.s1.small, which belongs to the high-performance instance type.
             */
            public Builder externalLoadbalancerId(String externalLoadbalancerId) {
                this.externalLoadbalancerId = externalLoadbalancerId;
                return this;
            }

            /**
             * The Kubernetes version of the cluster. The Kubernetes versions supported by ACK are the same as the Kubernetes versions supported by open source Kubernetes. We recommend that you specify the latest Kubernetes version. If you do not configure this parameter, the latest Kubernetes version is used.
             * <p>
             * 
             * You can create clusters that run the latest two Kubernetes versions in the ACK console. You can call the API operation to create clusters of other Kubernetes versions. For more information about the Kubernetes versions supported by ACK, see [Release notes for Kubernetes versions](~~185269~~).
             */
            public Builder initVersion(String initVersion) {
                this.initVersion = initVersion;
                return this;
            }

            /**
             * The maintenance window of the cluster. This feature is available only for ACK managed clusters and ACK Serverless clusters.
             */
            public Builder maintenanceWindow(MaintenanceWindow maintenanceWindow) {
                this.maintenanceWindow = maintenanceWindow;
                return this;
            }

            /**
             * The address of the cluster API server. It includes an internal endpoint and a public endpoint.
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
             * The cluster name.
             * <p>
             * 
             * The name must be 1 to 63 characters in length, and can contain digits, letters, and hyphens (-). The name cannot start with a hyphen (-).
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The network mode of the cluster. Valid values:
             * <p>
             * 
             * *   `classic`: classic network.
             * *   `vpc`: virtual private cloud (VPC).
             * *   `overlay`: overlay network.
             * *   `calico`: network powered by Calico.
             */
            public Builder networkMode(String networkMode) {
                this.networkMode = networkMode;
                return this;
            }

            /**
             * The Kubernetes version to which the cluster can be updated.
             */
            public Builder nextVersion(String nextVersion) {
                this.nextVersion = nextVersion;
                return this;
            }

            /**
             * Indicates whether Alibaba Cloud DNS PrivateZone is enabled. Valid values:
             * <p>
             * 
             * *   `true`: Alibaba Cloud DNS PrivateZone is enabled.
             * *   `false`: Alibaba Cloud DNS PrivateZone is disabled.
             */
            public Builder privateZone(Boolean privateZone) {
                this.privateZone = privateZone;
                return this;
            }

            /**
             * The cluster identifier. Valid values:
             * <p>
             * 
             * *   `Default`: ACK managed cluster. ACK managed clusters include ACK Basic clusters and ACK Pro clusters.
             * *   `Edge`: ACK Edge cluster. ACK Edge clusters include ACK Edge Basic clusters and ACK Edge Pro clusters.
             * *   `Serverless`: ACK Serverless cluster. ACK Serverless clusters include ACK Serverless Basic clusters and ACK Serverless Pro clusters.
             * *   `Lingjun`: ACK Lingjun Pro cluster.
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
             * The ID of the resource group to which the cluster belongs.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The ID of the security group of the cluster.
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * The number of nodes in the cluster, including master nodes and worker nodes.
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * The status of the cluster. Valid values:
             * <p>
             * 
             * *   `initial`: The cluster is being created.
             * *   `failed`: The cluster failed to be created.
             * *   `running`: The cluster is running.
             * *   `updating`: The cluster is being updated.
             * *   `updating_failed`: The cluster failed to be updated.
             * *   `scaling`: The cluster is being scaled.
             * *   `stopped`: The cluster is stopped.
             * *   `deleting`: The cluster is being deleted.
             * *   `deleted`: The cluster is deleted.
             * *   `delete_failed`: The cluster failed to be deleted.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * The pod CIDR block. It must be a valid and private CIDR block, and must be one of the following CIDR blocks or their subnets:
             * <p>
             * 
             * *   10.0.0.0/8
             * *   172.16-31.0.0/12-16
             * *   192.168.0.0/16
             * 
             * The pod CIDR block cannot overlap with the CIDR block of the VPC in which the cluster is deployed and the CIDR blocks of existing clusters in the VPC. You cannot modify the pod CIDR block after you create the cluster.
             * 
             * For more information about the network planning of ACK clusters, see [Plan CIDR blocks for an ACK cluster](~~86500~~).
             */
            public Builder subnetCidr(String subnetCidr) {
                this.subnetCidr = subnetCidr;
                return this;
            }

            /**
             * The resource labels of the cluster.
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
             * The ID of the VPC where the cluster is deployed. This parameter is required when you create a cluster.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * The IDs of the vSwitches. You can select one to three vSwitches when you create a cluster. We recommend that you select vSwitches in different zones to ensure high availability.
             */
            public Builder vswitchId(String vswitchId) {
                this.vswitchId = vswitchId;
                return this;
            }

            /**
             * The name of the worker Resource Access Management (RAM) role. The RAM role is assigned to the worker nodes of the cluster to allow the worker nodes to manage ECS instances.
             */
            public Builder workerRamRoleName(String workerRamRoleName) {
                this.workerRamRoleName = workerRamRoleName;
                return this;
            }

            /**
             * The ID of the zone where the cluster is deployed.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public Clusters build() {
                return new Clusters(this);
            } 

        } 

    }
    public static class PageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("page_number")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("page_size")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("total_count")
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
             * The page number.
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * The number of entries per page.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The total number of entries returned.
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
