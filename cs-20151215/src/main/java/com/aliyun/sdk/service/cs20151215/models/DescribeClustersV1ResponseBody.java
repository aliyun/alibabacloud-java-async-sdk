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
 * {@link DescribeClustersV1ResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeClustersV1ResponseBody</p>
 */
public class DescribeClustersV1ResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("clusters")
    private java.util.List<Clusters> clusters;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusters
     */
    public java.util.List<Clusters> getClusters() {
        return this.clusters;
    }

    /**
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    public static final class Builder {
        private java.util.List<Clusters> clusters; 
        private PageInfo pageInfo; 

        private Builder() {
        } 

        private Builder(DescribeClustersV1ResponseBody model) {
            this.clusters = model.clusters;
            this.pageInfo = model.pageInfo;
        } 

        /**
         * <p>The queried cluster details.</p>
         */
        public Builder clusters(java.util.List<Clusters> clusters) {
            this.clusters = clusters;
            return this;
        }

        /**
         * <p>The pagination information.</p>
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        public DescribeClustersV1ResponseBody build() {
            return new DescribeClustersV1ResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeClustersV1ResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeClustersV1ResponseBody</p>
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
             * <p>The frequency of auto cluster updates. For more information, see <a href="https://help.aliyun.com/document_detail/2712866.html">Update frequency</a>.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>patch: the latest patch version.</li>
             * <li>stables: the second-latest minor version.</li>
             * <li>rapid: the latest minor version.</li>
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
             * <p>Specifies whether to enable auto cluster update.</p>
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
     * {@link DescribeClustersV1ResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeClustersV1ResponseBody</p>
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
             * <p>The configurations of auto cluster update.</p>
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
     * {@link DescribeClustersV1ResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeClustersV1ResponseBody</p>
     */
    public static class Clusters extends TeaModel {
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

        @com.aliyun.core.annotation.NameInMap("operation_policy")
        private OperationPolicy operationPolicy;

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
        private String zoneId;

        private Clusters(Builder builder) {
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
            this.operationPolicy = builder.operationPolicy;
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
         * @return operationPolicy
         */
        public OperationPolicy getOperationPolicy() {
            return this.operationPolicy;
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
            private OperationPolicy operationPolicy; 
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

            private Builder(Clusters model) {
                this.clusterDomain = model.clusterDomain;
                this.clusterId = model.clusterId;
                this.clusterSpec = model.clusterSpec;
                this.clusterType = model.clusterType;
                this.containerCidr = model.containerCidr;
                this.created = model.created;
                this.currentVersion = model.currentVersion;
                this.deletionProtection = model.deletionProtection;
                this.dockerVersion = model.dockerVersion;
                this.externalLoadbalancerId = model.externalLoadbalancerId;
                this.initVersion = model.initVersion;
                this.ipStack = model.ipStack;
                this.maintenanceWindow = model.maintenanceWindow;
                this.masterUrl = model.masterUrl;
                this.metaData = model.metaData;
                this.name = model.name;
                this.networkMode = model.networkMode;
                this.nextVersion = model.nextVersion;
                this.operationPolicy = model.operationPolicy;
                this.privateZone = model.privateZone;
                this.profile = model.profile;
                this.proxyMode = model.proxyMode;
                this.regionId = model.regionId;
                this.resourceGroupId = model.resourceGroupId;
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
             * <p>The domain name of the cluster.</p>
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
             * <p>c3fb96524f9274b4495df0f12a6b5****</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>After you set <code>cluster_type</code> to <code>ManagedKubernetes</code> and configure the <code>profile</code> parameter, you can further specify the edition of the cluster. Valid values:</p>
             * <ul>
             * <li><code>ack.pro.small</code>: ACK Pro cluster.</li>
             * <li><code>ack.standard</code>: ACK Basic cluster. If you leave the parameter empty, ACK Basic cluster is selected.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ack.standard</p>
             */
            public Builder clusterSpec(String clusterSpec) {
                this.clusterSpec = clusterSpec;
                return this;
            }

            /**
             * <ul>
             * <li><code>Kubernetes</code>: ACK dedicated cluster.</li>
             * <li><code>ManagedKubernetes</code>: ACK managed cluster. ACK managed clusters include ACK Basic clusters, ACK Pro clusters, ACK Serverless Basic clusters, ACK Serverless Pro clusters, ACK Edge Basic clusters, ACK Edge Pro clusters, and ACK Lingjun Pro clusters.</li>
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
             * <p>The pod CIDR block and the configuration of the Flannel network plug-in.</p>
             * 
             * <strong>example:</strong>
             * <p>172.20.0.0/16</p>
             */
            public Builder containerCidr(String containerCidr) {
                this.containerCidr = containerCidr;
                return this;
            }

            /**
             * <p>The time when the cluster was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-08-20T10:51:29+08:00</p>
             */
            public Builder created(String created) {
                this.created = created;
                return this;
            }

            /**
             * <p>The Kubernetes version of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>1.16.9-aliyun.1</p>
             */
            public Builder currentVersion(String currentVersion) {
                this.currentVersion = currentVersion;
                return this;
            }

            /**
             * <p>Specifies whether to enable cluster deletion protection. If this option is enabled, the cluster cannot be deleted in the ACK console or by calling API operations. Valid values:</p>
             * <ul>
             * <li><code>true</code>: enables deletion protection for the cluster. This way, the cluster cannot be deleted in the ACK console or by calling API operations.</li>
             * <li><code>false</code>: disables deletion protection for the cluster. This way, the cluster can be deleted in the ACK console or by calling API operations.</li>
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
             * <p>The ID of the Server Load Balancer (SLB) instance that is used by the Ingresses of the cluster.</p>
             * <p>The default SLB specification is slb.s1.small, which belongs to the high-performance instance type.</p>
             * 
             * <strong>example:</strong>
             * <p>lb-2vcrbmlevo6kjpgch****</p>
             */
            public Builder externalLoadbalancerId(String externalLoadbalancerId) {
                this.externalLoadbalancerId = externalLoadbalancerId;
                return this;
            }

            /**
             * <p>The Kubernetes version of the cluster. The Kubernetes versions supported by ACK are the same as the Kubernetes versions supported by open source Kubernetes. We recommend that you specify the latest Kubernetes version. If you do not configure this parameter, the latest Kubernetes version is used.</p>
             * <p>You can create clusters that run the latest two Kubernetes versions in the ACK console. You can call the API operation to create clusters of other Kubernetes versions. For more information about the Kubernetes versions supported by ACK, see <a href="https://help.aliyun.com/document_detail/185269.html">Release notes for Kubernetes versions</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>1.16.9-aliyun.1</p>
             */
            public Builder initVersion(String initVersion) {
                this.initVersion = initVersion;
                return this;
            }

            /**
             * <p>The IP stack of the cluster. Valid values:</p>
             * <ul>
             * <li>ipv4: The cluster is an IPv4 cluster.</li>
             * <li>dual: The cluster is a dual-stack cluster.</li>
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
             * <p>The maintenance window of the cluster. This feature is available only for ACK managed clusters and ACK Serverless clusters.</p>
             */
            public Builder maintenanceWindow(MaintenanceWindow maintenanceWindow) {
                this.maintenanceWindow = maintenanceWindow;
                return this;
            }

            /**
             * <p>The address of the cluster API server. It includes an internal endpoint and a public endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;api_server_endpoint&quot;:&quot;&quot;,&quot;intranet_api_server_endpoint&quot;:&quot;<a href="https://192.168.0.251:6443%5C%22%7D">https://192.168.0.251:6443\&quot;}</a></p>
             */
            public Builder masterUrl(String masterUrl) {
                this.masterUrl = masterUrl;
                return this;
            }

            /**
             * <p>The metadata of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;Addons&quot;:[{&quot;config&quot;:***}</p>
             */
            public Builder metaData(String metaData) {
                this.metaData = metaData;
                return this;
            }

            /**
             * <p>The cluster name.</p>
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
             * <p>The network mode of the cluster. Valid values:</p>
             * <ul>
             * <li><code>classic</code>: classic network.</li>
             * <li><code>vpc</code>: virtual private cloud (VPC).</li>
             * <li><code>overlay</code>: overlay network.</li>
             * <li><code>calico</code>: network powered by Calico.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>vpc</p>
             */
            public Builder networkMode(String networkMode) {
                this.networkMode = networkMode;
                return this;
            }

            /**
             * <p>The Kubernetes version to which the cluster can be updated.</p>
             * 
             * <strong>example:</strong>
             * <p>1.18.8-aliyun.1</p>
             */
            public Builder nextVersion(String nextVersion) {
                this.nextVersion = nextVersion;
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
             * <p>Indicates whether Alibaba Cloud DNS PrivateZone is enabled. Valid values:</p>
             * <ul>
             * <li><code>true</code>: Alibaba Cloud DNS PrivateZone is enabled.</li>
             * <li><code>false</code>: Alibaba Cloud DNS PrivateZone is disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder privateZone(Boolean privateZone) {
                this.privateZone = privateZone;
                return this;
            }

            /**
             * <p>The cluster identifier. Valid values:</p>
             * <ul>
             * <li><code>Default</code>: ACK managed cluster. ACK managed clusters include ACK Basic clusters and ACK Pro clusters.</li>
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
             * <p>The Kube-proxy mode. Valid values:</p>
             * <ul>
             * <li><code>iptables</code>: a mature and stable kube-proxy mode that uses iptables rules to conduct Service discovery and load balancing. The performance of this mode is limited by the size of the cluster. This mode is suitable for clusters that run a small number of Services.</li>
             * <li><code>ipvs</code>: provides high performance and uses IP Virtual Server (IPVS). This allows you to configure service discovery and load balancing. This mode is suitable for clusters that are required to run a large number of services. We recommend that you use this mode in scenarios that require high load balancing performance.</li>
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
             * <p>The ID of the security group of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>sg-2vcgwsrwgt5mp0yi****</p>
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * <p>The Service CIDR block.</p>
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
             * <p>The number of nodes in the cluster, including control planes and worker nodes.</p>
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
             * <li><code>upgrading</code>: The cluster is undergoing an upgrade.</li>
             * <li><code>updating</code>: Cluster specification changes are being applied.</li>
             * <li><code>removing</code>: Nodes are being removed from the node pool.</li>
             * <li><code>draining</code>: Node draining is in progress.</li>
             * <li><code>scaling</code>: Auto-scaling operation is in progress for the cluster.</li>
             * <li><code>stopped</code>: The cluster has stopped running.</li>
             * <li><code>deleting</code>: The cluster is being deleted.</li>
             * <li><code>deleted</code>: The cluster has been deleted.</li>
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
             * <p>Tis parameter is deprecated. Use the container_cidr parameter to obtain the pod CIDR block. The pod CIDR block. It must be a valid and private CIDR block, and must be one of the following CIDR blocks or their subnets:</p>
             * <ul>
             * <li>10.0.0.0/8</li>
             * <li>172.16-31.0.0/12-16</li>
             * <li>192.168.0.0/16</li>
             * </ul>
             * <p>The pod CIDR block cannot overlap with the CIDR block of the VPC in which the cluster is deployed and the CIDR blocks of existing clusters in the VPC. You cannot modify the pod CIDR block after you create the cluster.</p>
             * <p>For more information about the network planning of Container Service for Kubernetes (ACK) clusters, see <a href="https://help.aliyun.com/document_detail/86500.html">Plan CIDR blocks for an ACK cluster</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>172.21.0.0/16</p>
             */
            public Builder subnetCidr(String subnetCidr) {
                this.subnetCidr = subnetCidr;
                return this;
            }

            /**
             * <p>The resource tags of the cluster.</p>
             */
            public Builder tags(java.util.List<Tag> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The time zone</p>
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
             * <p>2020-09-16T11:09:55+08:00</p>
             */
            public Builder updated(String updated) {
                this.updated = updated;
                return this;
            }

            /**
             * <p>The ID of the VPC where the cluster is deployed. This parameter is required when you create a cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-2vcg932hsxsxuqbgl****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>The IDs of the vSwitches. You can select one to three vSwitches when you create a cluster. To ensure the high availability of the cluster, we recommend that you select vSwitches in different zones.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-2vc41xuumx5z2rdma****,vsw-2vc41xuumx5z2rdma****</p>
             */
            public Builder vswitchId(String vswitchId) {
                this.vswitchId = vswitchId;
                return this;
            }

            /**
             * <p>The vSwitches of the control planes.</p>
             */
            public Builder vswitchIds(java.util.List<String> vswitchIds) {
                this.vswitchIds = vswitchIds;
                return this;
            }

            /**
             * <p>The name of the worker Resource Access Management (RAM) role. The RAM role is assigned to the worker nodes of the cluster to allow the worker nodes to manage ECS instances.</p>
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
             * <p>cn-beijing-b</p>
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
    /**
     * 
     * {@link DescribeClustersV1ResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeClustersV1ResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(PageInfo model) {
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The page number.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>The number of entries per page.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
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
