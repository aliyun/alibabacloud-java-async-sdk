// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

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
 * {@link DescribeClusterDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeClusterDetailResponseBody</p>
 */
public class DescribeClusterDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("auto_mode")
    private AutoMode autoMode;

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

    @com.aliyun.core.annotation.NameInMap("control_plane_config")
    private ControlPlaneConfig controlPlaneConfig;

    @com.aliyun.core.annotation.NameInMap("control_plane_endpoints_config")
    private ControlPlaneEndpointsConfig controlPlaneEndpointsConfig;

    @com.aliyun.core.annotation.NameInMap("created")
    private String created;

    @com.aliyun.core.annotation.NameInMap("current_version")
    private String currentVersion;

    @com.aliyun.core.annotation.NameInMap("deletion_protection")
    private Boolean deletionProtection;

    @com.aliyun.core.annotation.NameInMap("docker_version")
    @Deprecated
    private String dockerVersion;

    @com.aliyun.core.annotation.NameInMap("external_loadbalancer_id")
    @Deprecated
    private String externalLoadbalancerId;

    @com.aliyun.core.annotation.NameInMap("extra_sans")
    private java.util.List<String> extraSans;

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
    @Deprecated
    private String networkMode;

    @com.aliyun.core.annotation.NameInMap("next_version")
    private String nextVersion;

    @com.aliyun.core.annotation.NameInMap("node_cidr_mask")
    private String nodeCidrMask;

    @com.aliyun.core.annotation.NameInMap("operation_policy")
    private OperationPolicy operationPolicy;

    @com.aliyun.core.annotation.NameInMap("parameters")
    @Deprecated
    private java.util.Map<String, String> parameters;

    @com.aliyun.core.annotation.NameInMap("private_zone")
    @Deprecated
    private Boolean privateZone;

    @com.aliyun.core.annotation.NameInMap("profile")
    private String profile;

    @com.aliyun.core.annotation.NameInMap("proxy_mode")
    private String proxyMode;

    @com.aliyun.core.annotation.NameInMap("region_id")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("resource_group_id")
    private String resourceGroupId;

    @com.aliyun.core.annotation.NameInMap("rrsa_config")
    private RrsaConfig rrsaConfig;

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
    private java.util.List<Tag> tags;

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
    private java.util.List<String> vswitchIds;

    @com.aliyun.core.annotation.NameInMap("worker_ram_role_name")
    private String workerRamRoleName;

    @com.aliyun.core.annotation.NameInMap("zone_id")
    @Deprecated
    private String zoneId;

    private DescribeClusterDetailResponseBody(Builder builder) {
        this.autoMode = builder.autoMode;
        this.clusterDomain = builder.clusterDomain;
        this.clusterId = builder.clusterId;
        this.clusterSpec = builder.clusterSpec;
        this.clusterType = builder.clusterType;
        this.containerCidr = builder.containerCidr;
        this.controlPlaneConfig = builder.controlPlaneConfig;
        this.controlPlaneEndpointsConfig = builder.controlPlaneEndpointsConfig;
        this.created = builder.created;
        this.currentVersion = builder.currentVersion;
        this.deletionProtection = builder.deletionProtection;
        this.dockerVersion = builder.dockerVersion;
        this.externalLoadbalancerId = builder.externalLoadbalancerId;
        this.extraSans = builder.extraSans;
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
        this.rrsaConfig = builder.rrsaConfig;
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoMode
     */
    public AutoMode getAutoMode() {
        return this.autoMode;
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
     * @return controlPlaneConfig
     */
    public ControlPlaneConfig getControlPlaneConfig() {
        return this.controlPlaneConfig;
    }

    /**
     * @return controlPlaneEndpointsConfig
     */
    public ControlPlaneEndpointsConfig getControlPlaneEndpointsConfig() {
        return this.controlPlaneEndpointsConfig;
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
     * @return extraSans
     */
    public java.util.List<String> getExtraSans() {
        return this.extraSans;
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
    public java.util.Map<String, String> getParameters() {
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
     * @return rrsaConfig
     */
    public RrsaConfig getRrsaConfig() {
        return this.rrsaConfig;
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
    public java.util.List<Tag> getTags() {
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
    public java.util.List<String> getVswitchIds() {
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
        private AutoMode autoMode; 
        private String clusterDomain; 
        private String clusterId; 
        private String clusterSpec; 
        private String clusterType; 
        private String containerCidr; 
        private ControlPlaneConfig controlPlaneConfig; 
        private ControlPlaneEndpointsConfig controlPlaneEndpointsConfig; 
        private String created; 
        private String currentVersion; 
        private Boolean deletionProtection; 
        private String dockerVersion; 
        private String externalLoadbalancerId; 
        private java.util.List<String> extraSans; 
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
        private java.util.Map<String, String> parameters; 
        private Boolean privateZone; 
        private String profile; 
        private String proxyMode; 
        private String regionId; 
        private String resourceGroupId; 
        private RrsaConfig rrsaConfig; 
        private String securityGroupId; 
        private String serviceCidr; 
        private Long size; 
        private String state; 
        private String subnetCidr; 
        private java.util.List<Tag> tags; 
        private String timezone; 
        private String updated; 
        private String vpcId; 
        private String vswitchId; 
        private java.util.List<String> vswitchIds; 
        private String workerRamRoleName; 
        private String zoneId; 

        private Builder() {
        } 

        private Builder(DescribeClusterDetailResponseBody model) {
            this.autoMode = model.autoMode;
            this.clusterDomain = model.clusterDomain;
            this.clusterId = model.clusterId;
            this.clusterSpec = model.clusterSpec;
            this.clusterType = model.clusterType;
            this.containerCidr = model.containerCidr;
            this.controlPlaneConfig = model.controlPlaneConfig;
            this.controlPlaneEndpointsConfig = model.controlPlaneEndpointsConfig;
            this.created = model.created;
            this.currentVersion = model.currentVersion;
            this.deletionProtection = model.deletionProtection;
            this.dockerVersion = model.dockerVersion;
            this.externalLoadbalancerId = model.externalLoadbalancerId;
            this.extraSans = model.extraSans;
            this.initVersion = model.initVersion;
            this.ipStack = model.ipStack;
            this.maintenanceWindow = model.maintenanceWindow;
            this.masterUrl = model.masterUrl;
            this.metaData = model.metaData;
            this.name = model.name;
            this.networkMode = model.networkMode;
            this.nextVersion = model.nextVersion;
            this.nodeCidrMask = model.nodeCidrMask;
            this.operationPolicy = model.operationPolicy;
            this.parameters = model.parameters;
            this.privateZone = model.privateZone;
            this.profile = model.profile;
            this.proxyMode = model.proxyMode;
            this.regionId = model.regionId;
            this.resourceGroupId = model.resourceGroupId;
            this.rrsaConfig = model.rrsaConfig;
            this.securityGroupId = model.securityGroupId;
            this.serviceCidr = model.serviceCidr;
            this.size = model.size;
            this.state = model.state;
            this.subnetCidr = model.subnetCidr;
            this.tags = model.tags;
            this.timezone = model.timezone;
            this.updated = model.updated;
            this.vpcId = model.vpcId;
            this.vswitchId = model.vswitchId;
            this.vswitchIds = model.vswitchIds;
            this.workerRamRoleName = model.workerRamRoleName;
            this.zoneId = model.zoneId;
        } 

        /**
         * <p>The intelligent management mode configuration.</p>
         */
        public Builder autoMode(AutoMode autoMode) {
            this.autoMode = autoMode;
            return this;
        }

        /**
         * <p>The local domain name of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>cluster.local</p>
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
         * <p>The specification of the cluster when <code>cluster_type</code> is set to <code>ManagedKubernetes</code> and <code>profile</code> is configured. Valid values:</p>
         * <ul>
         * <li><code>ack.standard</code>: Basic Edition (selected by default if the value is empty).</li>
         * <li><code>ack.pro.small</code>: Pro Edition.</li>
         * <li><code>ack.pro.xlarge</code>: Pro XL.</li>
         * <li><code>ack.pro.2xlarge</code>: Pro 2XL.</li>
         * <li><code>ack.pro.4xlarge</code>: Pro 4XL (requires contacting customer service to apply for whitelist access).</li>
         * </ul>
         * <p>Pro XL, Pro 2XL, and Pro 4XL are the three tiers provided by the &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/ack/ack-managed-and-ack-dedicated/user-guide/ack-pro-provisioned-control-plane">ACK Pro provisioned control plane</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/ack/ack-managed-and-ack-dedicated/user-guide/ack-pro-provisioned-control-plane">ACK Pro provisioned control plane</a>. By pre-allocating and fixing control plane resources, these tiers ensure that API concurrency and pod scheduling capabilities are always maintained at a consistently high level. They are suitable for AI training and inference, ultra-large-scale clusters, and mission-critical workloads.</p>
         * <p>For the cluster management fees of the Pro Edition and provisioned control plane editions, see &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/ack/ack-managed-and-ack-dedicated/product-overview/cluster-management-fee">Cluster management fees</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/ack/ack-managed-and-ack-dedicated/product-overview/cluster-management-fee">Cluster management fees</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>ack.pro.small</p>
         */
        public Builder clusterSpec(String clusterSpec) {
            this.clusterSpec = clusterSpec;
            return this;
        }

        /**
         * <p>The cluster type. Valid values:</p>
         * <ul>
         * <li><p><code>Kubernetes</code>: ACK dedicated cluster.</p>
         * </li>
         * <li><p><code>ManagedKubernetes</code>: ACK ACK clusters, including ACK ACK clusters (ACK Pro Edition and ACK Basic Edition), ACK Serverless clusters (Pro Edition and Basic Edition), ACK Edge clusters (Pro Edition and Basic Edition), and ACK Lingjun clusters (Pro Edition).</p>
         * </li>
         * <li><p><code>ExternalKubernetes</code>: Registered cluster.</p>
         * </li>
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
         * <p>The Pod CIDR block for the Flannel network configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>172.20.xx.xx/16</p>
         */
        public Builder containerCidr(String containerCidr) {
            this.containerCidr = containerCidr;
            return this;
        }

        /**
         * <p>The control plane configuration for dedicated clusters.</p>
         */
        public Builder controlPlaneConfig(ControlPlaneConfig controlPlaneConfig) {
            this.controlPlaneConfig = controlPlaneConfig;
            return this;
        }

        /**
         * <p>The connection configuration of the cluster.</p>
         */
        public Builder controlPlaneEndpointsConfig(ControlPlaneEndpointsConfig controlPlaneEndpointsConfig) {
            this.controlPlaneEndpointsConfig = controlPlaneEndpointsConfig;
            return this;
        }

        /**
         * <p>The time when the cluster was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-04-07T09:57:26+08:00</p>
         */
        public Builder created(String created) {
            this.created = created;
            return this;
        }

        /**
         * <p>The current version of the cluster. For more information about the Kubernetes versions supported by ACK, see <a href="https://help.aliyun.com/document_detail/185269.html">Overview of Kubernetes versions</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>1.32.1-aliyun.1</p>
         */
        public Builder currentVersion(String currentVersion) {
            this.currentVersion = currentVersion;
            return this;
        }

        /**
         * <p>Specifies whether deletion protection is enabled for the cluster. This prevents the cluster from being accidentally deleted through the console or API calls. Valid values:</p>
         * <ul>
         * <li><code>true</code>: Deletion protection is enabled. The cluster cannot be deleted through the console or API calls.</li>
         * <li><code>false</code>: Deletion protection is disabled. The cluster can be deleted through the console or API calls.</li>
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
         * <p>The Docker version in the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>19.03.5</p>
         */
        public Builder dockerVersion(String dockerVersion) {
            this.dockerVersion = dockerVersion;
            return this;
        }

        /**
         * <p>The instance ID of the Ingress load balancer for the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>lb-2zehc05z3b8dwiifh****</p>
         */
        public Builder externalLoadbalancerId(String externalLoadbalancerId) {
            this.externalLoadbalancerId = externalLoadbalancerId;
            return this;
        }

        /**
         * <p>The custom Subject Alternative Names (SANs) for the API server certificate.</p>
         */
        public Builder extraSans(java.util.List<String> extraSans) {
            this.extraSans = extraSans;
            return this;
        }

        /**
         * <p>The initial version of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>1.32.1-aliyun.1</p>
         */
        public Builder initVersion(String initVersion) {
            this.initVersion = initVersion;
            return this;
        }

        /**
         * <p>The IP stack of the cluster. Valid values:</p>
         * <ul>
         * <li>ipv4: The cluster supports only the IPv4 stack.</li>
         * <li>dual: The cluster supports both IPv4 and IPv6 stacks.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ipv4</p>
         */
        public Builder ipStack(String ipStack) {
            this.ipStack = ipStack;
            return this;
        }

        /**
         * <p>The maintenance window configuration of the cluster. This configuration takes effect only for managed clusters, namely ACK Pro clusters.</p>
         */
        public Builder maintenanceWindow(MaintenanceWindow maintenanceWindow) {
            this.maintenanceWindow = maintenanceWindow;
            return this;
        }

        /**
         * <p>The access endpoints of the cluster, including the internal network and public network access endpoints.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;intranet_api_server_endpoint\&quot;:\&quot;<a href="https://192.168.xx.xx:6443%5C%5C%22***%7D">https://192.168.xx.xx:6443\\&quot;***}</a></p>
         */
        public Builder masterUrl(String masterUrl) {
            this.masterUrl = masterUrl;
            return this;
        }

        /**
         * <p>The metadata of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>\&quot;Addons\&quot;:***</p>
         */
        public Builder metaData(String metaData) {
            this.metaData = metaData;
            return this;
        }

        /**
         * <p>The name of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>cluster-demo</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The network type of the cluster, such as VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc</p>
         */
        public Builder networkMode(String networkMode) {
            this.networkMode = networkMode;
            return this;
        }

        /**
         * <p>The version to which the cluster can be upgraded.</p>
         * 
         * <strong>example:</strong>
         * <p>1.xx.x-aliyun.1</p>
         */
        public Builder nextVersion(String nextVersion) {
            this.nextVersion = nextVersion;
            return this;
        }

        /**
         * <p>Applicable only to the Flannel network plugin. </p>
         * <p>The size of the subnet mask allocated to nodes, which controls the number of IP addresses that can be allocated to each node.</p>
         * 
         * <strong>example:</strong>
         * <p>26</p>
         */
        public Builder nodeCidrMask(String nodeCidrMask) {
            this.nodeCidrMask = nodeCidrMask;
            return this;
        }

        /**
         * <p>The automatic O&amp;M policy of the cluster.</p>
         */
        public Builder operationPolicy(OperationPolicy operationPolicy) {
            this.operationPolicy = operationPolicy;
            return this;
        }

        /**
         * <p>The collection of Resource Orchestration Service (ROS) parameters for the cluster.</p>
         */
        public Builder parameters(java.util.Map<String, String> parameters) {
            this.parameters = parameters;
            return this;
        }

        /**
         * <p>Specifies whether PrivateZone is enabled for the cluster. Valid values:  </p>
         * <ul>
         * <li><code>true</code>: Enabled.</li>
         * <li><code>false</code>: Disabled.</li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder privateZone(Boolean privateZone) {
            this.privateZone = privateZone;
            return this;
        }

        /**
         * <p>The cluster subtype.</p>
         * <ul>
         * <li><p><code>Default</code>: ACK managed clusters, including ACK Cluster Pro Edition and ACK Cluster Basic Edition.</p>
         * </li>
         * <li><p><code>Edge</code>: ACK Edge clusters, including ACK Edge Cluster Pro Edition and ACK Edge Cluster Basic Edition.</p>
         * </li>
         * <li><p><code>Serverless</code>: ACK Serverless clusters, including ACK Serverless Cluster Pro Edition and ACK Serverless Cluster Basic Edition.</p>
         * </li>
         * <li><p><code>Lingjun</code>: ACK Lingjun clusters, available only in the Pro Edition.</p>
         * </li>
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
         * <p>The kube-proxy mode. Valid values:</p>
         * <ul>
         * <li><code>iptables</code>: The mature and stable kube-proxy mode. Service discovery and load balancing for Kubernetes Services are configured by using iptables rules. However, the performance is average and heavily affected by the scale. This mode is suitable for clusters with a small number of Services.</li>
         * <li><code>ipvs</code>: The high-performance kube-proxy mode. Service discovery and load balancing for Kubernetes Services are configured by using the Linux IPVS module. This mode is suitable for clusters with a large number of Services and scenarios that require high-performance load balancing.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ipvs</p>
         */
        public Builder proxyMode(String proxyMode) {
            this.proxyMode = proxyMode;
            return this;
        }

        /**
         * <p>The ID of the region where the cluster is deployed.</p>
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
         * <p>The RAM Roles for Service Accounts (RRSA) configuration.</p>
         */
        public Builder rrsaConfig(RrsaConfig rrsaConfig) {
            this.rrsaConfig = rrsaConfig;
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
         * <p>The CIDR block of the Service network.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>172.21.xx.xx/20</p>
         */
        public Builder serviceCidr(String serviceCidr) {
            this.serviceCidr = serviceCidr;
            return this;
        }

        /**
         * <p>The number of nodes in the cluster, including master nodes and worker nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder size(Long size) {
            this.size = size;
            return this;
        }

        /**
         * <p>The cluster status. Valid values:</p>
         * <ul>
         * <li><code>initial</code>: The cluster is being created.</li>
         * <li><code>failed</code>: Cluster creation failed.</li>
         * <li><code>running</code>: The cluster is running.</li>
         * <li><code>updating</code>: The cluster is being updated.</li>
         * <li><code>upgrading</code>: The cluster is being upgraded.</li>
         * <li><code>removing</code>: Nodes are being removed.</li>
         * <li><code>draining</code>: Nodes are being drained.</li>
         * <li><code>scaling</code>: The cluster is being scaled.</li>
         * <li><code>inactive</code>: The cluster is inactive.</li>
         * <li><code>unavailable</code>: The cluster is unavailable.</li>
         * <li><code>deleting</code>: The cluster is being deleted.</li>
         * <li><code>deleted</code>: The cluster has been deleted.</li>
         * <li><code>delete_failed</code>: Cluster deletion failed.</li>
         * <li><code>waiting</code>: The cluster is waiting for access.</li>
         * <li><code>disconnected</code>: The cluster is disconnected.</li>
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
         * <p>The Pod CIDR block.</p>
         * 
         * <strong>example:</strong>
         * <p>172.20.xx.xx/16</p>
         */
        public Builder subnetCidr(String subnetCidr) {
            this.subnetCidr = subnetCidr;
            return this;
        }

        /**
         * <p>The cluster resource tags.</p>
         */
        public Builder tags(java.util.List<Tag> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * <p>The time zone.</p>
         * 
         * <strong>example:</strong>
         * <p>Asia/Shanghai</p>
         */
        public Builder timezone(String timezone) {
            this.timezone = timezone;
            return this;
        }

        /**
         * <p>The time when the cluster was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-04-10T13:28:09+08:00</p>
         */
        public Builder updated(String updated) {
            this.updated = updated;
            return this;
        }

        /**
         * <p>The ID of the virtual private cloud (VPC) where the cluster is deployed. This parameter is required when you create a cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-2zecuu62b9zw7a7qn****</p>
         */
        public Builder vpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }

        /**
         * <p>The vSwitch ID. <strong>[Deprecated]</strong> To query the vSwitches for the control plane, use vswitch_ids. To query the vSwitches for the data plane, query the vswitch_ids of the node pool.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-2zete8s4qocqg0mf6****,vsw-2zete8s4qocqg0mf6****</p>
         */
        public Builder vswitchId(String vswitchId) {
            this.vswitchId = vswitchId;
            return this;
        }

        /**
         * <p>The vSwitches for the cluster control plane.</p>
         */
        public Builder vswitchIds(java.util.List<String> vswitchIds) {
            this.vswitchIds = vswitchIds;
            return this;
        }

        /**
         * <p>The name of the RAM role for worker nodes. This role authorizes ECS instances to act as worker nodes in the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>KubernetesWorkerRole-ec87d15b-edca-4302-933f-c8a16bf0****</p>
         */
        public Builder workerRamRoleName(String workerRamRoleName) {
            this.workerRamRoleName = workerRamRoleName;
            return this;
        }

        /**
         * <p>The ID of the zone where the cluster is deployed.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing-a</p>
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
    public static class AutoMode extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("enable")
        private Boolean enable;

        private AutoMode(Builder builder) {
            this.enable = builder.enable;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AutoMode create() {
            return builder().build();
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        public static final class Builder {
            private Boolean enable; 

            private Builder() {
            } 

            private Builder(AutoMode model) {
                this.enable = model.enable;
            } 

            /**
             * <p>Indicates whether the intelligent management mode is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            public AutoMode build() {
                return new AutoMode(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeClusterDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeClusterDetailResponseBody</p>
     */
    public static class ControlPlaneConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("auto_renew")
        private Boolean autoRenew;

        @com.aliyun.core.annotation.NameInMap("auto_renew_period")
        private Long autoRenewPeriod;

        @com.aliyun.core.annotation.NameInMap("charge_type")
        private String chargeType;

        @com.aliyun.core.annotation.NameInMap("cloud_monitor_flags")
        private Boolean cloudMonitorFlags;

        @com.aliyun.core.annotation.NameInMap("cpu_policy")
        private String cpuPolicy;

        @com.aliyun.core.annotation.NameInMap("deploymentset_id")
        private String deploymentsetId;

        @com.aliyun.core.annotation.NameInMap("image_id")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("image_type")
        private String imageType;

        @com.aliyun.core.annotation.NameInMap("instance_metadata_options")
        private InstanceMetadataOptions instanceMetadataOptions;

        @com.aliyun.core.annotation.NameInMap("instance_types")
        private java.util.List<String> instanceTypes;

        @com.aliyun.core.annotation.NameInMap("key_pair")
        private String keyPair;

        @com.aliyun.core.annotation.NameInMap("node_port_range")
        private String nodePortRange;

        @com.aliyun.core.annotation.NameInMap("period")
        private Long period;

        @com.aliyun.core.annotation.NameInMap("period_unit")
        private String periodUnit;

        @com.aliyun.core.annotation.NameInMap("runtime")
        private String runtime;

        @com.aliyun.core.annotation.NameInMap("security_hardening_os")
        private Boolean securityHardeningOs;

        @com.aliyun.core.annotation.NameInMap("size")
        private Long size;

        @com.aliyun.core.annotation.NameInMap("soc_enabled")
        private Boolean socEnabled;

        @com.aliyun.core.annotation.NameInMap("system_disk_bursting_enabled")
        private Boolean systemDiskBurstingEnabled;

        @com.aliyun.core.annotation.NameInMap("system_disk_category")
        private String systemDiskCategory;

        @com.aliyun.core.annotation.NameInMap("system_disk_performance_level")
        private String systemDiskPerformanceLevel;

        @com.aliyun.core.annotation.NameInMap("system_disk_provisioned_iops")
        private Long systemDiskProvisionedIops;

        @com.aliyun.core.annotation.NameInMap("system_disk_size")
        private Long systemDiskSize;

        @com.aliyun.core.annotation.NameInMap("system_disk_snapshot_policy_id")
        private String systemDiskSnapshotPolicyId;

        private ControlPlaneConfig(Builder builder) {
            this.autoRenew = builder.autoRenew;
            this.autoRenewPeriod = builder.autoRenewPeriod;
            this.chargeType = builder.chargeType;
            this.cloudMonitorFlags = builder.cloudMonitorFlags;
            this.cpuPolicy = builder.cpuPolicy;
            this.deploymentsetId = builder.deploymentsetId;
            this.imageId = builder.imageId;
            this.imageType = builder.imageType;
            this.instanceMetadataOptions = builder.instanceMetadataOptions;
            this.instanceTypes = builder.instanceTypes;
            this.keyPair = builder.keyPair;
            this.nodePortRange = builder.nodePortRange;
            this.period = builder.period;
            this.periodUnit = builder.periodUnit;
            this.runtime = builder.runtime;
            this.securityHardeningOs = builder.securityHardeningOs;
            this.size = builder.size;
            this.socEnabled = builder.socEnabled;
            this.systemDiskBurstingEnabled = builder.systemDiskBurstingEnabled;
            this.systemDiskCategory = builder.systemDiskCategory;
            this.systemDiskPerformanceLevel = builder.systemDiskPerformanceLevel;
            this.systemDiskProvisionedIops = builder.systemDiskProvisionedIops;
            this.systemDiskSize = builder.systemDiskSize;
            this.systemDiskSnapshotPolicyId = builder.systemDiskSnapshotPolicyId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ControlPlaneConfig create() {
            return builder().build();
        }

        /**
         * @return autoRenew
         */
        public Boolean getAutoRenew() {
            return this.autoRenew;
        }

        /**
         * @return autoRenewPeriod
         */
        public Long getAutoRenewPeriod() {
            return this.autoRenewPeriod;
        }

        /**
         * @return chargeType
         */
        public String getChargeType() {
            return this.chargeType;
        }

        /**
         * @return cloudMonitorFlags
         */
        public Boolean getCloudMonitorFlags() {
            return this.cloudMonitorFlags;
        }

        /**
         * @return cpuPolicy
         */
        public String getCpuPolicy() {
            return this.cpuPolicy;
        }

        /**
         * @return deploymentsetId
         */
        public String getDeploymentsetId() {
            return this.deploymentsetId;
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        /**
         * @return imageType
         */
        public String getImageType() {
            return this.imageType;
        }

        /**
         * @return instanceMetadataOptions
         */
        public InstanceMetadataOptions getInstanceMetadataOptions() {
            return this.instanceMetadataOptions;
        }

        /**
         * @return instanceTypes
         */
        public java.util.List<String> getInstanceTypes() {
            return this.instanceTypes;
        }

        /**
         * @return keyPair
         */
        public String getKeyPair() {
            return this.keyPair;
        }

        /**
         * @return nodePortRange
         */
        public String getNodePortRange() {
            return this.nodePortRange;
        }

        /**
         * @return period
         */
        public Long getPeriod() {
            return this.period;
        }

        /**
         * @return periodUnit
         */
        public String getPeriodUnit() {
            return this.periodUnit;
        }

        /**
         * @return runtime
         */
        public String getRuntime() {
            return this.runtime;
        }

        /**
         * @return securityHardeningOs
         */
        public Boolean getSecurityHardeningOs() {
            return this.securityHardeningOs;
        }

        /**
         * @return size
         */
        public Long getSize() {
            return this.size;
        }

        /**
         * @return socEnabled
         */
        public Boolean getSocEnabled() {
            return this.socEnabled;
        }

        /**
         * @return systemDiskBurstingEnabled
         */
        public Boolean getSystemDiskBurstingEnabled() {
            return this.systemDiskBurstingEnabled;
        }

        /**
         * @return systemDiskCategory
         */
        public String getSystemDiskCategory() {
            return this.systemDiskCategory;
        }

        /**
         * @return systemDiskPerformanceLevel
         */
        public String getSystemDiskPerformanceLevel() {
            return this.systemDiskPerformanceLevel;
        }

        /**
         * @return systemDiskProvisionedIops
         */
        public Long getSystemDiskProvisionedIops() {
            return this.systemDiskProvisionedIops;
        }

        /**
         * @return systemDiskSize
         */
        public Long getSystemDiskSize() {
            return this.systemDiskSize;
        }

        /**
         * @return systemDiskSnapshotPolicyId
         */
        public String getSystemDiskSnapshotPolicyId() {
            return this.systemDiskSnapshotPolicyId;
        }

        public static final class Builder {
            private Boolean autoRenew; 
            private Long autoRenewPeriod; 
            private String chargeType; 
            private Boolean cloudMonitorFlags; 
            private String cpuPolicy; 
            private String deploymentsetId; 
            private String imageId; 
            private String imageType; 
            private InstanceMetadataOptions instanceMetadataOptions; 
            private java.util.List<String> instanceTypes; 
            private String keyPair; 
            private String nodePortRange; 
            private Long period; 
            private String periodUnit; 
            private String runtime; 
            private Boolean securityHardeningOs; 
            private Long size; 
            private Boolean socEnabled; 
            private Boolean systemDiskBurstingEnabled; 
            private String systemDiskCategory; 
            private String systemDiskPerformanceLevel; 
            private Long systemDiskProvisionedIops; 
            private Long systemDiskSize; 
            private String systemDiskSnapshotPolicyId; 

            private Builder() {
            } 

            private Builder(ControlPlaneConfig model) {
                this.autoRenew = model.autoRenew;
                this.autoRenewPeriod = model.autoRenewPeriod;
                this.chargeType = model.chargeType;
                this.cloudMonitorFlags = model.cloudMonitorFlags;
                this.cpuPolicy = model.cpuPolicy;
                this.deploymentsetId = model.deploymentsetId;
                this.imageId = model.imageId;
                this.imageType = model.imageType;
                this.instanceMetadataOptions = model.instanceMetadataOptions;
                this.instanceTypes = model.instanceTypes;
                this.keyPair = model.keyPair;
                this.nodePortRange = model.nodePortRange;
                this.period = model.period;
                this.periodUnit = model.periodUnit;
                this.runtime = model.runtime;
                this.securityHardeningOs = model.securityHardeningOs;
                this.size = model.size;
                this.socEnabled = model.socEnabled;
                this.systemDiskBurstingEnabled = model.systemDiskBurstingEnabled;
                this.systemDiskCategory = model.systemDiskCategory;
                this.systemDiskPerformanceLevel = model.systemDiskPerformanceLevel;
                this.systemDiskProvisionedIops = model.systemDiskProvisionedIops;
                this.systemDiskSize = model.systemDiskSize;
                this.systemDiskSnapshotPolicyId = model.systemDiskSnapshotPolicyId;
            } 

            /**
             * <p>Indicates whether auto-renewal is enabled for the nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder autoRenew(Boolean autoRenew) {
                this.autoRenew = autoRenew;
                return this;
            }

            /**
             * <p>The auto-renewal period for the nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder autoRenewPeriod(Long autoRenewPeriod) {
                this.autoRenewPeriod = autoRenewPeriod;
                return this;
            }

            /**
             * <p>The billing method for the control plane nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>PrePaid</p>
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * <p>Indicates whether CloudMonitor is installed on the nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder cloudMonitorFlags(Boolean cloudMonitorFlags) {
                this.cloudMonitorFlags = cloudMonitorFlags;
                return this;
            }

            /**
             * <p>The CPU management policy for the nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>none</p>
             */
            public Builder cpuPolicy(String cpuPolicy) {
                this.cpuPolicy = cpuPolicy;
                return this;
            }

            /**
             * <p>The ID of the deployment set.</p>
             * 
             * <strong>example:</strong>
             * <p>ds-bp10b35imuam5amw****</p>
             */
            public Builder deploymentsetId(String deploymentsetId) {
                this.deploymentsetId = deploymentsetId;
                return this;
            }

            /**
             * <p>The ID of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>aliyun_3_x64_20G_alibase_20240819</p>
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * <p>The type of the operating system image.</p>
             * 
             * <strong>example:</strong>
             * <p>AliyunLinux3</p>
             */
            public Builder imageType(String imageType) {
                this.imageType = imageType;
                return this;
            }

            /**
             * <p>The metadata access configuration for the ECS instances.</p>
             */
            public Builder instanceMetadataOptions(InstanceMetadataOptions instanceMetadataOptions) {
                this.instanceMetadataOptions = instanceMetadataOptions;
                return this;
            }

            /**
             * <p>The instance type of the nodes.</p>
             */
            public Builder instanceTypes(java.util.List<String> instanceTypes) {
                this.instanceTypes = instanceTypes;
                return this;
            }

            /**
             * <p>The name of the key pair. You must specify either this parameter or <code>login_password</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>ack</p>
             */
            public Builder keyPair(String keyPair) {
                this.keyPair = keyPair;
                return this;
            }

            /**
             * <p>The service port range for nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>30000-32767</p>
             */
            public Builder nodePortRange(String nodePortRange) {
                this.nodePortRange = nodePortRange;
                return this;
            }

            /**
             * <p>The subscription period for the nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder period(Long period) {
                this.period = period;
                return this;
            }

            /**
             * <p>The unit of the subscription period for the nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>Month</p>
             */
            public Builder periodUnit(String periodUnit) {
                this.periodUnit = periodUnit;
                return this;
            }

            /**
             * <p>The name of the container runtime.</p>
             * 
             * <strong>example:</strong>
             * <p>containerd</p>
             */
            public Builder runtime(String runtime) {
                this.runtime = runtime;
                return this;
            }

            /**
             * <p>Indicates whether Alibaba Cloud OS security hardening is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder securityHardeningOs(Boolean securityHardeningOs) {
                this.securityHardeningOs = securityHardeningOs;
                return this;
            }

            /**
             * <p>The number of control plane nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * <p>Indicates whether classified protection security hardening is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder socEnabled(Boolean socEnabled) {
                this.socEnabled = socEnabled;
                return this;
            }

            /**
             * <p>Indicates whether bursting is enabled for the system cloud disks of the nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder systemDiskBurstingEnabled(Boolean systemDiskBurstingEnabled) {
                this.systemDiskBurstingEnabled = systemDiskBurstingEnabled;
                return this;
            }

            /**
             * <p>The type of the system cloud disks for the nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>cloud_essd</p>
             */
            public Builder systemDiskCategory(String systemDiskCategory) {
                this.systemDiskCategory = systemDiskCategory;
                return this;
            }

            /**
             * <p>The performance level of the system cloud disks for the nodes. This parameter takes effect only for ESSDs.</p>
             * 
             * <strong>example:</strong>
             * <p>PL1</p>
             */
            public Builder systemDiskPerformanceLevel(String systemDiskPerformanceLevel) {
                this.systemDiskPerformanceLevel = systemDiskPerformanceLevel;
                return this;
            }

            /**
             * <p>The provisioned read and write IOPS for the system cloud disks of the nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder systemDiskProvisionedIops(Long systemDiskProvisionedIops) {
                this.systemDiskProvisionedIops = systemDiskProvisionedIops;
                return this;
            }

            /**
             * <p>The size of the system cloud disks for the nodes. The minimum value is 40.</p>
             * 
             * <strong>example:</strong>
             * <p>120</p>
             */
            public Builder systemDiskSize(Long systemDiskSize) {
                this.systemDiskSize = systemDiskSize;
                return this;
            }

            /**
             * <p>The ID of the automatic snapshot policy for the nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>sp-2zej1nogjvovnz4z****</p>
             */
            public Builder systemDiskSnapshotPolicyId(String systemDiskSnapshotPolicyId) {
                this.systemDiskSnapshotPolicyId = systemDiskSnapshotPolicyId;
                return this;
            }

            public ControlPlaneConfig build() {
                return new ControlPlaneConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeClusterDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeClusterDetailResponseBody</p>
     */
    public static class InternalDnsConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("bind_vpcs")
        private java.util.List<String> bindVpcs;

        @com.aliyun.core.annotation.NameInMap("enabled")
        private Boolean enabled;

        private InternalDnsConfig(Builder builder) {
            this.bindVpcs = builder.bindVpcs;
            this.enabled = builder.enabled;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InternalDnsConfig create() {
            return builder().build();
        }

        /**
         * @return bindVpcs
         */
        public java.util.List<String> getBindVpcs() {
            return this.bindVpcs;
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        public static final class Builder {
            private java.util.List<String> bindVpcs; 
            private Boolean enabled; 

            private Builder() {
            } 

            private Builder(InternalDnsConfig model) {
                this.bindVpcs = model.bindVpcs;
                this.enabled = model.enabled;
            } 

            /**
             * <p>The VPC scope where the internal DNS records of the cluster take effect. By default, this includes the VPC where the cluster is deployed.</p>
             */
            public Builder bindVpcs(java.util.List<String> bindVpcs) {
                this.bindVpcs = bindVpcs;
                return this;
            }

            /**
             * <p>Indicates whether internal DNS access is enabled for the cluster. Valid values: </p>
             * <ul>
             * <li>true: Internal DNS access is enabled. Node-side components such as kubelet and kube-proxy access the API server by using the internal domain name.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            public InternalDnsConfig build() {
                return new InternalDnsConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeClusterDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeClusterDetailResponseBody</p>
     */
    public static class LoadBalancersConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("endpoint")
        private String endpoint;

        @com.aliyun.core.annotation.NameInMap("endpoint_type")
        private String endpointType;

        @com.aliyun.core.annotation.NameInMap("load_balancer_id")
        private String loadBalancerId;

        private LoadBalancersConfig(Builder builder) {
            this.endpoint = builder.endpoint;
            this.endpointType = builder.endpointType;
            this.loadBalancerId = builder.loadBalancerId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LoadBalancersConfig create() {
            return builder().build();
        }

        /**
         * @return endpoint
         */
        public String getEndpoint() {
            return this.endpoint;
        }

        /**
         * @return endpointType
         */
        public String getEndpointType() {
            return this.endpointType;
        }

        /**
         * @return loadBalancerId
         */
        public String getLoadBalancerId() {
            return this.loadBalancerId;
        }

        public static final class Builder {
            private String endpoint; 
            private String endpointType; 
            private String loadBalancerId; 

            private Builder() {
            } 

            private Builder(LoadBalancersConfig model) {
                this.endpoint = model.endpoint;
                this.endpointType = model.endpointType;
                this.loadBalancerId = model.loadBalancerId;
            } 

            /**
             * <p>The endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>nlb-0ogk9aaxxxxxxx.cn-hangzhou.nlb.aliyuncsslb.com</p>
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * <p>The endpoint type.</p>
             * 
             * <strong>example:</strong>
             * <p>private</p>
             */
            public Builder endpointType(String endpointType) {
                this.endpointType = endpointType;
                return this;
            }

            /**
             * <p>The SLB instance associated with the endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>nlb-0ogk9aaxxxxxxx</p>
             */
            public Builder loadBalancerId(String loadBalancerId) {
                this.loadBalancerId = loadBalancerId;
                return this;
            }

            public LoadBalancersConfig build() {
                return new LoadBalancersConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeClusterDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeClusterDetailResponseBody</p>
     */
    public static class ControlPlaneEndpointsConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("internal_dns_config")
        private InternalDnsConfig internalDnsConfig;

        @com.aliyun.core.annotation.NameInMap("load_balancers_config")
        private java.util.List<LoadBalancersConfig> loadBalancersConfig;

        private ControlPlaneEndpointsConfig(Builder builder) {
            this.internalDnsConfig = builder.internalDnsConfig;
            this.loadBalancersConfig = builder.loadBalancersConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ControlPlaneEndpointsConfig create() {
            return builder().build();
        }

        /**
         * @return internalDnsConfig
         */
        public InternalDnsConfig getInternalDnsConfig() {
            return this.internalDnsConfig;
        }

        /**
         * @return loadBalancersConfig
         */
        public java.util.List<LoadBalancersConfig> getLoadBalancersConfig() {
            return this.loadBalancersConfig;
        }

        public static final class Builder {
            private InternalDnsConfig internalDnsConfig; 
            private java.util.List<LoadBalancersConfig> loadBalancersConfig; 

            private Builder() {
            } 

            private Builder(ControlPlaneEndpointsConfig model) {
                this.internalDnsConfig = model.internalDnsConfig;
                this.loadBalancersConfig = model.loadBalancersConfig;
            } 

            /**
             * <p>The internal DNS configuration of the cluster, applicable to ACK managed clusters. The internal domain name is used by node-side system components such as kubelet and kube-proxy to access the API server. If internal domain name access is not enabled, node-side system components access the API server by using the IP address of the Classic Load Balancer (CLB) instance.</p>
             */
            public Builder internalDnsConfig(InternalDnsConfig internalDnsConfig) {
                this.internalDnsConfig = internalDnsConfig;
                return this;
            }

            /**
             * <p>The load balancing configuration for cluster access.</p>
             */
            public Builder loadBalancersConfig(java.util.List<LoadBalancersConfig> loadBalancersConfig) {
                this.loadBalancersConfig = loadBalancersConfig;
                return this;
            }

            public ControlPlaneEndpointsConfig build() {
                return new ControlPlaneEndpointsConfig(this);
            } 

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

            private Builder() {
            } 

            private Builder(ClusterAutoUpgrade model) {
                this.channel = model.channel;
                this.enabled = model.enabled;
            } 

            /**
             * <p>The automatic upgrade channel of the cluster. For more information, see <a href="https://help.aliyun.com/document_detail/2712866.html">Upgrade channels</a>. Valid values:</p>
             * <ul>
             * <li>patch: The latest patch version.</li>
             * <li>stable: The second latest minor version.</li>
             * <li>rapid: The latest minor version.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>patch</p>
             */
            public Builder channel(String channel) {
                this.channel = channel;
                return this;
            }

            /**
             * <p>Specifies whether automatic cluster upgrade is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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

            private Builder() {
            } 

            private Builder(OperationPolicy model) {
                this.clusterAutoUpgrade = model.clusterAutoUpgrade;
            } 

            /**
             * <p>The automatic upgrade configuration of the cluster.</p>
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
    /**
     * 
     * {@link DescribeClusterDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeClusterDetailResponseBody</p>
     */
    public static class RrsaConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("audience")
        private String audience;

        @com.aliyun.core.annotation.NameInMap("enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("issuer")
        private String issuer;

        @com.aliyun.core.annotation.NameInMap("jwks_url")
        private String jwksUrl;

        @com.aliyun.core.annotation.NameInMap("max_oidc_token_expiration")
        private String maxOidcTokenExpiration;

        @com.aliyun.core.annotation.NameInMap("oidc_arn")
        private String oidcArn;

        @com.aliyun.core.annotation.NameInMap("oidc_name")
        private String oidcName;

        @com.aliyun.core.annotation.NameInMap("open_api_configuration_url")
        private String openApiConfigurationUrl;

        private RrsaConfig(Builder builder) {
            this.audience = builder.audience;
            this.enabled = builder.enabled;
            this.issuer = builder.issuer;
            this.jwksUrl = builder.jwksUrl;
            this.maxOidcTokenExpiration = builder.maxOidcTokenExpiration;
            this.oidcArn = builder.oidcArn;
            this.oidcName = builder.oidcName;
            this.openApiConfigurationUrl = builder.openApiConfigurationUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RrsaConfig create() {
            return builder().build();
        }

        /**
         * @return audience
         */
        public String getAudience() {
            return this.audience;
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return issuer
         */
        public String getIssuer() {
            return this.issuer;
        }

        /**
         * @return jwksUrl
         */
        public String getJwksUrl() {
            return this.jwksUrl;
        }

        /**
         * @return maxOidcTokenExpiration
         */
        public String getMaxOidcTokenExpiration() {
            return this.maxOidcTokenExpiration;
        }

        /**
         * @return oidcArn
         */
        public String getOidcArn() {
            return this.oidcArn;
        }

        /**
         * @return oidcName
         */
        public String getOidcName() {
            return this.oidcName;
        }

        /**
         * @return openApiConfigurationUrl
         */
        public String getOpenApiConfigurationUrl() {
            return this.openApiConfigurationUrl;
        }

        public static final class Builder {
            private String audience; 
            private Boolean enabled; 
            private String issuer; 
            private String jwksUrl; 
            private String maxOidcTokenExpiration; 
            private String oidcArn; 
            private String oidcName; 
            private String openApiConfigurationUrl; 

            private Builder() {
            } 

            private Builder(RrsaConfig model) {
                this.audience = model.audience;
                this.enabled = model.enabled;
                this.issuer = model.issuer;
                this.jwksUrl = model.jwksUrl;
                this.maxOidcTokenExpiration = model.maxOidcTokenExpiration;
                this.oidcArn = model.oidcArn;
                this.oidcName = model.oidcName;
                this.openApiConfigurationUrl = model.openApiConfigurationUrl;
            } 

            /**
             * <p>The default audience of the OIDC token. If multiple values are included, they are separated by commas (,). These values form an array for the <code>aud</code> field in the OIDC token.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://kubernetes.default.svc,https://example.***.com">https://kubernetes.default.svc,https://example.***.com</a></p>
             */
            public Builder audience(String audience) {
                this.audience = audience;
                return this;
            }

            /**
             * <p>Specifies whether RRSA is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>The issuer of the OIDC token. If multiple values are included, they are separated by commas (,). The first value is used as the <code>iss</code> field in the OIDC token and the issuer URL of the OIDC identity provider (IdP).</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://oidc-ack-***,https://kubernetes.default.svc">https://oidc-ack-***,https://kubernetes.default.svc</a></p>
             */
            public Builder issuer(String issuer) {
                this.issuer = issuer;
                return this;
            }

            /**
             * <p>The URL of the OIDC public key.</p>
             */
            public Builder jwksUrl(String jwksUrl) {
                this.jwksUrl = jwksUrl;
                return this;
            }

            /**
             * <p>The maximum configurable validity period of the OIDC token.</p>
             * 
             * <strong>example:</strong>
             * <p>12h</p>
             */
            public Builder maxOidcTokenExpiration(String maxOidcTokenExpiration) {
                this.maxOidcTokenExpiration = maxOidcTokenExpiration;
                return this;
            }

            /**
             * <p>The ARN of the OIDC IdP.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:ram::1138***:oidc-provider/ack-rrsa-***</p>
             */
            public Builder oidcArn(String oidcArn) {
                this.oidcArn = oidcArn;
                return this;
            }

            /**
             * <p>The name of the OIDC IdP.</p>
             * 
             * <strong>example:</strong>
             * <p>ack-rrsa-***</p>
             */
            public Builder oidcName(String oidcName) {
                this.oidcName = oidcName;
                return this;
            }

            /**
             * <p>The URL of the OIDC configuration document.</p>
             */
            public Builder openApiConfigurationUrl(String openApiConfigurationUrl) {
                this.openApiConfigurationUrl = openApiConfigurationUrl;
                return this;
            }

            public RrsaConfig build() {
                return new RrsaConfig(this);
            } 

        } 

    }
}
