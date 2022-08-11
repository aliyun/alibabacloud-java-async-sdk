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
         * 集群ID。
         */
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        /**
         * 托管版集群类型，面向托管集群。  ack.pro.small：专业托管集群。 ack.standard ：标准托管集群。
         */
        public Builder clusterSpec(String clusterSpec) {
            this.clusterSpec = clusterSpec;
            return this;
        }

        /**
         * 集群类型。
         */
        public Builder clusterType(String clusterType) {
            this.clusterType = clusterType;
            return this;
        }

        /**
         * 集群创建时间。
         */
        public Builder created(String created) {
            this.created = created;
            return this;
        }

        /**
         * 集群当前版本。
         */
        public Builder currentVersion(String currentVersion) {
            this.currentVersion = currentVersion;
            return this;
        }

        /**
         * 集群是否开启删除保护。
         */
        public Builder deletionProtection(Boolean deletionProtection) {
            this.deletionProtection = deletionProtection;
            return this;
        }

        /**
         * 集群内Docker版本。
         */
        public Builder dockerVersion(String dockerVersion) {
            this.dockerVersion = dockerVersion;
            return this;
        }

        /**
         * 集群Ingress LB实例ID。
         */
        public Builder externalLoadbalancerId(String externalLoadbalancerId) {
            this.externalLoadbalancerId = externalLoadbalancerId;
            return this;
        }

        /**
         * 集群初始化版本。
         */
        public Builder initVersion(String initVersion) {
            this.initVersion = initVersion;
            return this;
        }

        /**
         * maintenance_window.
         */
        public Builder maintenanceWindow(MaintenanceWindow maintenanceWindow) {
            this.maintenanceWindow = maintenanceWindow;
            return this;
        }

        /**
         * 集群访问地址。
         */
        public Builder masterUrl(String masterUrl) {
            this.masterUrl = masterUrl;
            return this;
        }

        /**
         * 集群元数据。
         */
        public Builder metaData(String metaData) {
            this.metaData = metaData;
            return this;
        }

        /**
         * 集群名称。
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * 集群采用的网络类型，例如：VPC网络。
         */
        public Builder networkMode(String networkMode) {
            this.networkMode = networkMode;
            return this;
        }

        /**
         * 集群可升级版本。
         */
        public Builder nextVersion(String nextVersion) {
            this.nextVersion = nextVersion;
            return this;
        }

        /**
         * 集群是否启用用PrivateZone。  true：启用 false：不启用 默认值：false。
         */
        public Builder privateZone(Boolean privateZone) {
            this.privateZone = privateZone;
            return this;
        }

        /**
         * 面向场景时的集群类型。  Default：非边缘场景集群。 Edge：边缘场景集群。
         */
        public Builder profile(String profile) {
            this.profile = profile;
            return this;
        }

        /**
         * 集群所在地域ID。
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * 集群资源组ID。
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * 集群安全组ID。
         */
        public Builder securityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * 集群节点数量。
         */
        public Builder size(Long size) {
            this.size = size;
            return this;
        }

        /**
         * 集群运行状态。
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        /**
         * Pod网络地址段，必须是有效的私有网段，即以下网段及其子网：10.0.0.0/8，172.16-31.0.0/12-16，192.168.0.0/16。不能与 VPC 及VPC 内已有 Kubernetes 集群使用的网段重复，创建成功后不能修改。  有关集群网络规划，请参见：[VPC下 Kubernetes 的网络地址段规划](https://help.aliyun.com/document_detail/～～86500～～)。
         */
        public Builder subnetCidr(String subnetCidr) {
            this.subnetCidr = subnetCidr;
            return this;
        }

        /**
         * 集群标签。
         */
        public Builder tags(java.util.List < Tag > tags) {
            this.tags = tags;
            return this;
        }

        /**
         * 集群更新时间。
         */
        public Builder updated(String updated) {
            this.updated = updated;
            return this;
        }

        /**
         * 集群使用的VPC ID。
         */
        public Builder vpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }

        /**
         * 集群节点使用的虚拟交换机列表。
         */
        public Builder vswitchId(String vswitchId) {
            this.vswitchId = vswitchId;
            return this;
        }

        /**
         * Worker节点RAM角色名称。
         */
        public Builder workerRamRoleName(String workerRamRoleName) {
            this.workerRamRoleName = workerRamRoleName;
            return this;
        }

        /**
         * 集群所在地域内的可用区ID。
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
