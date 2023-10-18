// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClusterDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeClusterDetailResponseBody</p>
 */
public class DescribeClusterDetailResponseBody extends TeaModel {
    @NameInMap("cluster_id")
    private String clusterId;

    @NameInMap("cluster_spec")
    private String clusterSpec;

    @NameInMap("cluster_type")
    private String clusterType;

    @NameInMap("created")
    private String created;

    @NameInMap("current_version")
    private String currentVersion;

    @NameInMap("deletion_protection")
    private Boolean deletionProtection;

    @NameInMap("docker_version")
    private String dockerVersion;

    @NameInMap("external_loadbalancer_id")
    private String externalLoadbalancerId;

    @NameInMap("init_version")
    private String initVersion;

    @NameInMap("maintenance_window")
    private MaintenanceWindow maintenanceWindow;

    @NameInMap("master_url")
    private String masterUrl;

    @NameInMap("meta_data")
    private String metaData;

    @NameInMap("name")
    private String name;

    @NameInMap("network_mode")
    private String networkMode;

    @NameInMap("next_version")
    private String nextVersion;

    @NameInMap("parameters")
    private java.util.Map < String, String > parameters;

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

    private DescribeClusterDetailResponseBody(Builder builder) {
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
        this.parameters = builder.parameters;
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

    public static DescribeClusterDetailResponseBody create() {
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
     * @return parameters
     */
    public java.util.Map < String, String > getParameters() {
        return this.parameters;
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
        private java.util.Map < String, String > parameters; 
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
         * The edition of the cluster if the cluster is an ACK managed cluster. Valid values:
         * <p>
         * 
         * *   `ack.pro.small`: ACK Pro
         * *   `ack.standard`: ACK Basic
         */
        public Builder clusterSpec(String clusterSpec) {
            this.clusterSpec = clusterSpec;
            return this;
        }

        /**
         * The type of cluster. Valid values:
         * <p>
         * 
         * *   `Kubernetes`: ACK dedicated cluster
         * *   `ManagedKubernetes`: ACK managed cluster
         * *   `Ask`: ACK Serverless cluster
         * *   `ExternalKubernetes`: registered cluster
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
         * The current Kubernetes version of the cluster. For more information about the Kubernetes versions supported by ACK, see [Release notes for Kubernetes versions](~~185269~~).
         */
        public Builder currentVersion(String currentVersion) {
            this.currentVersion = currentVersion;
            return this;
        }

        /**
         * Indicates whether deletion protection is enabled for the cluster. If deletion protection is enabled, the cluster cannot be deleted in the Container Service console or by calling API operations. Valid values:
         * <p>
         * 
         * *   `true`: deletion protection is enabled for the cluster. This way, the cluster cannot be deleted in the Container Service console or by calling API operations.
         * *   `false`: deletion protection is disabled for the cluster. This way, the cluster can be deleted in the Container Service console or by calling API operations.
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
         * external_loadbalancer_id.
         */
        public Builder externalLoadbalancerId(String externalLoadbalancerId) {
            this.externalLoadbalancerId = externalLoadbalancerId;
            return this;
        }

        /**
         * The initial Kubernetes version of the cluster.
         */
        public Builder initVersion(String initVersion) {
            this.initVersion = initVersion;
            return this;
        }

        /**
         * The maintenance window of the cluster. This feature is available only in ACK Pro clusters.
         */
        public Builder maintenanceWindow(MaintenanceWindow maintenanceWindow) {
            this.maintenanceWindow = maintenanceWindow;
            return this;
        }

        /**
         * The endpoints of the cluster, including an internal endpoint and a public endpoint.
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
         * The name must be 1 to 63 characters in length, and can contain digits, letters, and hyphens (-). The name cannot start with a hyphen (-).
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * network_mode.
         */
        public Builder networkMode(String networkMode) {
            this.networkMode = networkMode;
            return this;
        }

        /**
         * next_version.
         */
        public Builder nextVersion(String nextVersion) {
            this.nextVersion = nextVersion;
            return this;
        }

        /**
         * The ROS parameters of the cluster.
         */
        public Builder parameters(java.util.Map < String, String > parameters) {
            this.parameters = parameters;
            return this;
        }

        /**
         * private_zone.
         */
        public Builder privateZone(Boolean privateZone) {
            this.privateZone = privateZone;
            return this;
        }

        /**
         * Indicates the scenario in which the cluster is used. Valid values:
         * <p>
         * 
         * *   `Default`: non-edge computing scenarios
         * *   `Edge`: edge computing scenarios
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
         * The ID of the security group to which the cluster belongs.
         */
        public Builder securityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * The number of nodes in the cluster. Master nodes and worker nodes are included.
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
         * *   `waiting`: The cluster is waiting for connection requests.
         * *   `disconnected`: The cluster is disconnected.
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
         * The pod CIDR block cannot overlap with the CIDR block of the VPC or the CIDR blocks of the clusters in the VPC.
         * 
         * For more information, see [Plan CIDR blocks for an ACK cluster](~~186964~~).
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
         * The name of the worker Resource Access Management (RAM) role. The RAM role is assigned to the worker nodes of the cluster to allow the worker nodes to manage Elastic Compute Service (ECS) instances.
         */
        public Builder workerRamRoleName(String workerRamRoleName) {
            this.workerRamRoleName = workerRamRoleName;
            return this;
        }

        /**
         * zone_id.
         */
        public Builder zoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }

        public DescribeClusterDetailResponseBody build() {
            return new DescribeClusterDetailResponseBody(this);
        } 

    } 

}
