// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeClusterDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeClusterDetailResponseBody</p>
 */
public class DescribeClusterDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("cluster_domain")
    private String clusterDomain;

    @com.aliyun.core.annotation.NameInMap("cluster_id")
    private String clusterId;

    @com.aliyun.core.annotation.NameInMap("cluster_spec")
    private String clusterSpec;

    @com.aliyun.core.annotation.NameInMap("cluster_type")
    private String clusterType;

    @com.aliyun.core.annotation.NameInMap("container_cidr")
    private String containerCidr;

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

    @com.aliyun.core.annotation.NameInMap("ip_stack")
    private String ipStack;

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

    @com.aliyun.core.annotation.NameInMap("node_cidr_mask")
    private String nodeCidrMask;

    @com.aliyun.core.annotation.NameInMap("operation_policy")
    private OperationPolicy operationPolicy;

    @com.aliyun.core.annotation.NameInMap("parameters")
    private java.util.Map < String, String > parameters;

    @com.aliyun.core.annotation.NameInMap("private_zone")
    private Boolean privateZone;

    @com.aliyun.core.annotation.NameInMap("profile")
    private String profile;

    @com.aliyun.core.annotation.NameInMap("proxy_mode")
    private String proxyMode;

    @com.aliyun.core.annotation.NameInMap("region_id")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("resource_group_id")
    private String resourceGroupId;

    @com.aliyun.core.annotation.NameInMap("security_group_id")
    private String securityGroupId;

    @com.aliyun.core.annotation.NameInMap("service_cidr")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceCidr;

    @com.aliyun.core.annotation.NameInMap("size")
    private Long size;

    @com.aliyun.core.annotation.NameInMap("state")
    private String state;

    @com.aliyun.core.annotation.NameInMap("subnet_cidr")
    @Deprecated
    private String subnetCidr;

    @com.aliyun.core.annotation.NameInMap("tags")
    private java.util.List < Tag > tags;

    @com.aliyun.core.annotation.NameInMap("timezone")
    private String timezone;

    @com.aliyun.core.annotation.NameInMap("updated")
    private String updated;

    @com.aliyun.core.annotation.NameInMap("vpc_id")
    private String vpcId;

    @com.aliyun.core.annotation.NameInMap("vswitch_id")
    @Deprecated
    private String vswitchId;

    @com.aliyun.core.annotation.NameInMap("vswitch_ids")
    private java.util.List < String > vswitchIds;

    @com.aliyun.core.annotation.NameInMap("worker_ram_role_name")
    private String workerRamRoleName;

    @com.aliyun.core.annotation.NameInMap("zone_id")
    private String zoneId;

    private DescribeClusterDetailResponseBody(Builder builder) {
        this.clusterDomain = builder.clusterDomain;
        this.clusterId = builder.clusterId;
        this.clusterSpec = builder.clusterSpec;
        this.clusterType = builder.clusterType;
        this.containerCidr = builder.containerCidr;
        this.created = builder.created;
        this.currentVersion = builder.currentVersion;
        this.deletionProtection = builder.deletionProtection;
        this.dockerVersion = builder.dockerVersion;
        this.externalLoadbalancerId = builder.externalLoadbalancerId;
        this.initVersion = builder.initVersion;
        this.ipStack = builder.ipStack;
        this.maintenanceWindow = builder.maintenanceWindow;
        this.masterUrl = builder.masterUrl;
        this.metaData = builder.metaData;
        this.name = builder.name;
        this.networkMode = builder.networkMode;
        this.nextVersion = builder.nextVersion;
        this.nodeCidrMask = builder.nodeCidrMask;
        this.operationPolicy = builder.operationPolicy;
        this.parameters = builder.parameters;
        this.privateZone = builder.privateZone;
        this.profile = builder.profile;
        this.proxyMode = builder.proxyMode;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.securityGroupId = builder.securityGroupId;
        this.serviceCidr = builder.serviceCidr;
        this.size = builder.size;
        this.state = builder.state;
        this.subnetCidr = builder.subnetCidr;
        this.tags = builder.tags;
        this.timezone = builder.timezone;
        this.updated = builder.updated;
        this.vpcId = builder.vpcId;
        this.vswitchId = builder.vswitchId;
        this.vswitchIds = builder.vswitchIds;
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
     * @return containerCidr
     */
    public String getContainerCidr() {
        return this.containerCidr;
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
     * @return ipStack
     */
    public String getIpStack() {
        return this.ipStack;
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
     * @return nodeCidrMask
     */
    public String getNodeCidrMask() {
        return this.nodeCidrMask;
    }

    /**
     * @return operationPolicy
     */
    public OperationPolicy getOperationPolicy() {
        return this.operationPolicy;
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
     * @return proxyMode
     */
    public String getProxyMode() {
        return this.proxyMode;
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
     * @return serviceCidr
     */
    public String getServiceCidr() {
        return this.serviceCidr;
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
     * @return timezone
     */
    public String getTimezone() {
        return this.timezone;
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
     * @return vswitchIds
     */
    public java.util.List < String > getVswitchIds() {
        return this.vswitchIds;
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
        private String clusterDomain; 
        private String clusterId; 
        private String clusterSpec; 
        private String clusterType; 
        private String containerCidr; 
        private String created; 
        private String currentVersion; 
        private Boolean deletionProtection; 
        private String dockerVersion; 
        private String externalLoadbalancerId; 
        private String initVersion; 
        private String ipStack; 
        private MaintenanceWindow maintenanceWindow; 
        private String masterUrl; 
        private String metaData; 
        private String name; 
        private String networkMode; 
        private String nextVersion; 
        private String nodeCidrMask; 
        private OperationPolicy operationPolicy; 
        private java.util.Map < String, String > parameters; 
        private Boolean privateZone; 
        private String profile; 
        private String proxyMode; 
        private String regionId; 
        private String resourceGroupId; 
        private String securityGroupId; 
        private String serviceCidr; 
        private Long size; 
        private String state; 
        private String subnetCidr; 
        private java.util.List < Tag > tags; 
        private String timezone; 
        private String updated; 
        private String vpcId; 
        private String vswitchId; 
        private java.util.List < String > vswitchIds; 
        private String workerRamRoleName; 
        private String zoneId; 

        /**
         * cluster_domain.
         */
        public Builder clusterDomain(String clusterDomain) {
            this.clusterDomain = clusterDomain;
            return this;
        }

        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>c82e6987e2961451182edacd74faf****</p>
         */
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>After you set <code>cluster_type</code> to <code>ManagedKubernetes</code> and configure the <code>profile</code> parameter, you can further specify the edition of the cluster.</p>
         * <ul>
         * <li><code>ack.pro.small</code>: Pro.</li>
         * <li><code>ack.standard</code>: Basic. If you leave the parameter empty, the Basic edition is selected.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ack.pro.small</p>
         */
        public Builder clusterSpec(String clusterSpec) {
            this.clusterSpec = clusterSpec;
            return this;
        }

        /**
         * <ul>
         * <li><code>Kubernetes</code>: ACK dedicated cluster.</li>
         * <li><code>ManagedKubernetes</code>: ACK managed cluster. ACK managed clusters include ACK Basic clusters, ACK Pro clusters, ACK Serverless clusters (Basic and Pro), ACK Edge clusters (Basic and Pro), and ACK Lingjun clusters (Pro).</li>
         * <li><code>ExternalKubernetes</code>: registered cluster.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Kubernetes</p>
         */
        public Builder clusterType(String clusterType) {
            this.clusterType = clusterType;
            return this;
        }

        /**
         * container_cidr.
         */
        public Builder containerCidr(String containerCidr) {
            this.containerCidr = containerCidr;
            return this;
        }

        /**
         * <p>The time when the cluster was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-11-25T15:50:20+08:00</p>
         */
        public Builder created(String created) {
            this.created = created;
            return this;
        }

        /**
         * <p>The current Kubernetes version of the cluster. For more information about the Kubernetes versions supported by ACK, see <a href="https://help.aliyun.com/document_detail/185269.html">Release notes for Kubernetes versions</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>1.16.6-aliyun.1</p>
         */
        public Builder currentVersion(String currentVersion) {
            this.currentVersion = currentVersion;
            return this;
        }

        /**
         * <p>Indicates whether deletion protection is enabled for the cluster. If deletion protection is enabled, the cluster cannot be deleted in the Container Service console or by calling API operations. Valid values:</p>
         * <ul>
         * <li><code>true</code>: deletion protection is enabled for the cluster. This way, the cluster cannot be deleted in the Container Service console or by calling API operations.</li>
         * <li><code>false</code>: deletion protection is disabled for the cluster. This way, the cluster can be deleted in the Container Service console or by calling API operations.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder deletionProtection(Boolean deletionProtection) {
            this.deletionProtection = deletionProtection;
            return this;
        }

        /**
         * <p>The Docker version that is used by the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>19.03.5</p>
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
         * <p>The initial Kubernetes version of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>1.16.6-aliyun.1</p>
         */
        public Builder initVersion(String initVersion) {
            this.initVersion = initVersion;
            return this;
        }

        /**
         * ip_stack.
         */
        public Builder ipStack(String ipStack) {
            this.ipStack = ipStack;
            return this;
        }

        /**
         * <p>The maintenance window of the cluster. This feature is available only in ACK Pro clusters.</p>
         */
        public Builder maintenanceWindow(MaintenanceWindow maintenanceWindow) {
            this.maintenanceWindow = maintenanceWindow;
            return this;
        }

        /**
         * <p>The endpoints of the cluster, including an internal endpoint and a public endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;intranet_api_server_endpoint&quot;:&quot;<a href="https://192.168.0.251:6443%5C%22***%7D">https://192.168.0.251:6443\&quot;***}</a></p>
         */
        public Builder masterUrl(String masterUrl) {
            this.masterUrl = masterUrl;
            return this;
        }

        /**
         * <p>The metadata of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;Addons&quot;:***</p>
         */
        public Builder metaData(String metaData) {
            this.metaData = metaData;
            return this;
        }

        /**
         * <p>The name of the cluster.</p>
         * <p>The name must be 1 to 63 characters in length, and can contain digits, letters, and hyphens (-). The name cannot start with a hyphen (-).</p>
         * 
         * <strong>example:</strong>
         * <p>cluster-demo</p>
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
         * node_cidr_mask.
         */
        public Builder nodeCidrMask(String nodeCidrMask) {
            this.nodeCidrMask = nodeCidrMask;
            return this;
        }

        /**
         * operation_policy.
         */
        public Builder operationPolicy(OperationPolicy operationPolicy) {
            this.operationPolicy = operationPolicy;
            return this;
        }

        /**
         * <p>The ROS parameters of the cluster.</p>
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
         * <p>If you set <code>cluster_type</code> to <code>ManagedKubernetes</code>, an ACK managed cluster is created. In this case, you can further specify the cluster edition.</p>
         * <ul>
         * <li><code>Default</code>. ACK managed cluster. ACK managed clusters include ACK Basic clusters and ACK Pro clusters.</li>
         * <li><code>Edge</code>: ACK Edge cluster. ACK Edge clusters include ACK Edge Basic clusters and ACK Edge Pro clusters.</li>
         * <li><code>Serverless</code>: ACK Serverless cluster. ACK Serverless clusters include ACK Serverless Basic clusters and ACK Serverless Pro clusters.</li>
         * <li><code>Lingjun</code>: ACK Lingjun Pro cluster.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Default</p>
         */
        public Builder profile(String profile) {
            this.profile = profile;
            return this;
        }

        /**
         * proxy_mode.
         */
        public Builder proxyMode(String proxyMode) {
            this.proxyMode = proxyMode;
            return this;
        }

        /**
         * <p>The region ID of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the resource group to which the cluster belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmyvw3wjm****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The ID of the security group to which the cluster belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-25yq****</p>
         */
        public Builder securityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>172.21.0.0/20</p>
         */
        public Builder serviceCidr(String serviceCidr) {
            this.serviceCidr = serviceCidr;
            return this;
        }

        /**
         * <p>The number of nodes in the cluster. Master nodes and worker nodes are included.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder size(Long size) {
            this.size = size;
            return this;
        }

        /**
         * <p>The status of the cluster. Valid values:</p>
         * <ul>
         * <li><code>initial</code>: The cluster is being created.</li>
         * <li><code>failed</code>: The cluster failed to be created.</li>
         * <li><code>running</code>: The cluster is running.</li>
         * <li><code>updating</code>: The cluster is being updated.</li>
         * <li><code>updating_failed</code>: The cluster failed to be updated.</li>
         * <li><code>scaling</code>: The cluster is being scaled.</li>
         * <li><code>waiting</code>: The cluster is waiting for connection requests.</li>
         * <li><code>disconnected</code>: The cluster is disconnected.</li>
         * <li><code>stopped</code>: The cluster is stopped.</li>
         * <li><code>deleting</code>: The cluster is being deleted.</li>
         * <li><code>deleted</code>: The cluster is deleted.</li>
         * <li><code>delete_failed</code>: The cluster failed to be deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>running</p>
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        /**
         * <p>The pod CIDR block. It must be a valid and private CIDR block, and must be one of the following CIDR blocks or their subnets:</p>
         * <ul>
         * <li>10.0.0.0/8</li>
         * <li>172.16-31.0.0/12-16</li>
         * <li>192.168.0.0/16</li>
         * </ul>
         * <p>The pod CIDR block cannot overlap with the CIDR block of the VPC or the CIDR blocks of the clusters in the VPC.</p>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/186964.html">Plan CIDR blocks for an ACK cluster</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>172.20.0.0/16</p>
         */
        public Builder subnetCidr(String subnetCidr) {
            this.subnetCidr = subnetCidr;
            return this;
        }

        /**
         * <p>The resource tags of the cluster.</p>
         */
        public Builder tags(java.util.List < Tag > tags) {
            this.tags = tags;
            return this;
        }

        /**
         * timezone.
         */
        public Builder timezone(String timezone) {
            this.timezone = timezone;
            return this;
        }

        /**
         * <p>The time when the cluster was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-01-13T23:01:03+08:00</p>
         */
        public Builder updated(String updated) {
            this.updated = updated;
            return this;
        }

        /**
         * <p>The ID of the VPC where the cluster is deployed. This parameter is required when you create a cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-2zecuu62b9zw7a7qn****</p>
         */
        public Builder vpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }

        /**
         * <p>The IDs of the vSwitches. You can select one to three vSwitches when you create a cluster. We recommend that you select vSwitches in different zones to ensure high availability.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-2zete8s4qocqg0mf6****,vsw-2zete8s4qocqg0mf6****</p>
         */
        public Builder vswitchId(String vswitchId) {
            this.vswitchId = vswitchId;
            return this;
        }

        /**
         * vswitch_ids.
         */
        public Builder vswitchIds(java.util.List < String > vswitchIds) {
            this.vswitchIds = vswitchIds;
            return this;
        }

        /**
         * <p>The name of the worker Resource Access Management (RAM) role. The RAM role is assigned to the worker nodes of the cluster to allow the worker nodes to manage Elastic Compute Service (ECS) instances.</p>
         * 
         * <strong>example:</strong>
         * <p>KubernetesWorkerRole-ec87d15b-edca-4302-933f-c8a16bf0****</p>
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

    /**
     * 
     * {@link DescribeClusterDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeClusterDetailResponseBody</p>
     */
    public static class ClusterAutoUpgrade extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("channel")
        private String channel;

        @com.aliyun.core.annotation.NameInMap("enabled")
        private Boolean enabled;

        private ClusterAutoUpgrade(Builder builder) {
            this.channel = builder.channel;
            this.enabled = builder.enabled;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClusterAutoUpgrade create() {
            return builder().build();
        }

        /**
         * @return channel
         */
        public String getChannel() {
            return this.channel;
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        public static final class Builder {
            private String channel; 
            private Boolean enabled; 

            /**
             * channel.
             */
            public Builder channel(String channel) {
                this.channel = channel;
                return this;
            }

            /**
             * enabled.
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            public ClusterAutoUpgrade build() {
                return new ClusterAutoUpgrade(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeClusterDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeClusterDetailResponseBody</p>
     */
    public static class OperationPolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cluster_auto_upgrade")
        private ClusterAutoUpgrade clusterAutoUpgrade;

        private OperationPolicy(Builder builder) {
            this.clusterAutoUpgrade = builder.clusterAutoUpgrade;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OperationPolicy create() {
            return builder().build();
        }

        /**
         * @return clusterAutoUpgrade
         */
        public ClusterAutoUpgrade getClusterAutoUpgrade() {
            return this.clusterAutoUpgrade;
        }

        public static final class Builder {
            private ClusterAutoUpgrade clusterAutoUpgrade; 

            /**
             * cluster_auto_upgrade.
             */
            public Builder clusterAutoUpgrade(ClusterAutoUpgrade clusterAutoUpgrade) {
                this.clusterAutoUpgrade = clusterAutoUpgrade;
                return this;
            }

            public OperationPolicy build() {
                return new OperationPolicy(this);
            } 

        } 

    }
}
