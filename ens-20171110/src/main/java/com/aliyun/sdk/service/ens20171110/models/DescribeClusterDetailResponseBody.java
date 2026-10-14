// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
    @com.aliyun.core.annotation.NameInMap("AliUid")
    private String aliUid;

    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.NameInMap("Config")
    private Object config;

    @com.aliyun.core.annotation.NameInMap("ContainerCidr")
    private String containerCidr;

    @com.aliyun.core.annotation.NameInMap("ControlPlaneConfig")
    private ControlPlaneConfig controlPlaneConfig;

    @com.aliyun.core.annotation.NameInMap("ControlPlaneMeta")
    private ControlPlaneMeta controlPlaneMeta;

    @com.aliyun.core.annotation.NameInMap("Created")
    private String created;

    @com.aliyun.core.annotation.NameInMap("EnsRegionId")
    private String ensRegionId;

    @com.aliyun.core.annotation.NameInMap("Isp")
    private String isp;

    @com.aliyun.core.annotation.NameInMap("JoinToken")
    private String joinToken;

    @com.aliyun.core.annotation.NameInMap("KubernetesVersion")
    private String kubernetesVersion;

    @com.aliyun.core.annotation.NameInMap("LoadBalancerId")
    private String loadBalancerId;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("NatGatewayId")
    private String natGatewayId;

    @com.aliyun.core.annotation.NameInMap("NodeCount")
    private NodeCount nodeCount;

    @com.aliyun.core.annotation.NameInMap("PodStatus")
    private PodStatus podStatus;

    @com.aliyun.core.annotation.NameInMap("PodVswitchIds")
    private java.util.List<String> podVswitchIds;

    @com.aliyun.core.annotation.NameInMap("PublicAccess")
    private Boolean publicAccess;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ServiceCidr")
    private String serviceCidr;

    @com.aliyun.core.annotation.NameInMap("State")
    private String state;

    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    @com.aliyun.core.annotation.NameInMap("VswitchIds")
    private java.util.List<String> vswitchIds;

    private DescribeClusterDetailResponseBody(Builder builder) {
        this.aliUid = builder.aliUid;
        this.clusterId = builder.clusterId;
        this.config = builder.config;
        this.containerCidr = builder.containerCidr;
        this.controlPlaneConfig = builder.controlPlaneConfig;
        this.controlPlaneMeta = builder.controlPlaneMeta;
        this.created = builder.created;
        this.ensRegionId = builder.ensRegionId;
        this.isp = builder.isp;
        this.joinToken = builder.joinToken;
        this.kubernetesVersion = builder.kubernetesVersion;
        this.loadBalancerId = builder.loadBalancerId;
        this.name = builder.name;
        this.natGatewayId = builder.natGatewayId;
        this.nodeCount = builder.nodeCount;
        this.podStatus = builder.podStatus;
        this.podVswitchIds = builder.podVswitchIds;
        this.publicAccess = builder.publicAccess;
        this.requestId = builder.requestId;
        this.serviceCidr = builder.serviceCidr;
        this.state = builder.state;
        this.vpcId = builder.vpcId;
        this.vswitchIds = builder.vswitchIds;
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
     * @return aliUid
     */
    public String getAliUid() {
        return this.aliUid;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return config
     */
    public Object getConfig() {
        return this.config;
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
     * @return controlPlaneMeta
     */
    public ControlPlaneMeta getControlPlaneMeta() {
        return this.controlPlaneMeta;
    }

    /**
     * @return created
     */
    public String getCreated() {
        return this.created;
    }

    /**
     * @return ensRegionId
     */
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    /**
     * @return isp
     */
    public String getIsp() {
        return this.isp;
    }

    /**
     * @return joinToken
     */
    public String getJoinToken() {
        return this.joinToken;
    }

    /**
     * @return kubernetesVersion
     */
    public String getKubernetesVersion() {
        return this.kubernetesVersion;
    }

    /**
     * @return loadBalancerId
     */
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return natGatewayId
     */
    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    /**
     * @return nodeCount
     */
    public NodeCount getNodeCount() {
        return this.nodeCount;
    }

    /**
     * @return podStatus
     */
    public PodStatus getPodStatus() {
        return this.podStatus;
    }

    /**
     * @return podVswitchIds
     */
    public java.util.List<String> getPodVswitchIds() {
        return this.podVswitchIds;
    }

    /**
     * @return publicAccess
     */
    public Boolean getPublicAccess() {
        return this.publicAccess;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return serviceCidr
     */
    public String getServiceCidr() {
        return this.serviceCidr;
    }

    /**
     * @return state
     */
    public String getState() {
        return this.state;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * @return vswitchIds
     */
    public java.util.List<String> getVswitchIds() {
        return this.vswitchIds;
    }

    public static final class Builder {
        private String aliUid; 
        private String clusterId; 
        private Object config; 
        private String containerCidr; 
        private ControlPlaneConfig controlPlaneConfig; 
        private ControlPlaneMeta controlPlaneMeta; 
        private String created; 
        private String ensRegionId; 
        private String isp; 
        private String joinToken; 
        private String kubernetesVersion; 
        private String loadBalancerId; 
        private String name; 
        private String natGatewayId; 
        private NodeCount nodeCount; 
        private PodStatus podStatus; 
        private java.util.List<String> podVswitchIds; 
        private Boolean publicAccess; 
        private String requestId; 
        private String serviceCidr; 
        private String state; 
        private String vpcId; 
        private java.util.List<String> vswitchIds; 

        private Builder() {
        } 

        private Builder(DescribeClusterDetailResponseBody model) {
            this.aliUid = model.aliUid;
            this.clusterId = model.clusterId;
            this.config = model.config;
            this.containerCidr = model.containerCidr;
            this.controlPlaneConfig = model.controlPlaneConfig;
            this.controlPlaneMeta = model.controlPlaneMeta;
            this.created = model.created;
            this.ensRegionId = model.ensRegionId;
            this.isp = model.isp;
            this.joinToken = model.joinToken;
            this.kubernetesVersion = model.kubernetesVersion;
            this.loadBalancerId = model.loadBalancerId;
            this.name = model.name;
            this.natGatewayId = model.natGatewayId;
            this.nodeCount = model.nodeCount;
            this.podStatus = model.podStatus;
            this.podVswitchIds = model.podVswitchIds;
            this.publicAccess = model.publicAccess;
            this.requestId = model.requestId;
            this.serviceCidr = model.serviceCidr;
            this.state = model.state;
            this.vpcId = model.vpcId;
            this.vswitchIds = model.vswitchIds;
        } 

        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1574790082031102</p>
         */
        public Builder aliUid(String aliUid) {
            this.aliUid = aliUid;
            return this;
        }

        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>eck-11111111</p>
         */
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The cluster kubeconfig.</p>
         * 
         * <strong>example:</strong>
         * <p>apiVersion: v1
         * clusters:</p>
         * <ul>
         * <li>cluster:
         *   certificate-authority-data: x
         *   server: <a href="https://111.111.111.111:6443">https://111.111.111.111:6443</a>
         * name: kubernetes
         * contexts:</li>
         * <li>context:
         *   cluster: kubernetes
         *   user: user
         * name: eck-xxxxx
         * current-context: eck-xxxx
         * kind: Config
         * preferences: {}
         * users:</li>
         * <li>name: user
         * user:
         *   client-certificate-data: x
         *   client-key-data: x</li>
         * </ul>
         */
        public Builder config(Object config) {
            this.config = config;
            return this;
        }

        /**
         * <p>The CIDR block for pods.</p>
         * 
         * <strong>example:</strong>
         * <p>172.20.0.0/16</p>
         */
        public Builder containerCidr(String containerCidr) {
            this.containerCidr = containerCidr;
            return this;
        }

        /**
         * <p>The control plane configuration.</p>
         */
        public Builder controlPlaneConfig(ControlPlaneConfig controlPlaneConfig) {
            this.controlPlaneConfig = controlPlaneConfig;
            return this;
        }

        /**
         * ControlPlaneMeta.
         */
        public Builder controlPlaneMeta(ControlPlaneMeta controlPlaneMeta) {
            this.controlPlaneMeta = controlPlaneMeta;
            return this;
        }

        /**
         * Created.
         */
        public Builder created(String created) {
            this.created = created;
            return this;
        }

        /**
         * <p>The ENS edge zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-fuzhou-23</p>
         */
        public Builder ensRegionId(String ensRegionId) {
            this.ensRegionId = ensRegionId;
            return this;
        }

        /**
         * Isp.
         */
        public Builder isp(String isp) {
            this.isp = isp;
            return this;
        }

        /**
         * <p>The authentication token for cluster access.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxx.yyy</p>
         */
        public Builder joinToken(String joinToken) {
            this.joinToken = joinToken;
            return this;
        }

        /**
         * <p>The cluster version, which is consistent with the Kubernetes community baseline version. We recommend that you select the latest version. If you do not specify this parameter, the latest version is used by default.</p>
         * 
         * <strong>example:</strong>
         * <p>1.32.1.aliyunedge.1</p>
         */
        public Builder kubernetesVersion(String kubernetesVersion) {
            this.kubernetesVersion = kubernetesVersion;
            return this;
        }

        /**
         * <p>The CLB instance ID of the API server.</p>
         * 
         * <strong>example:</strong>
         * <p>lb-5snthcyu1x10g7tywj7iu****</p>
         */
        public Builder loadBalancerId(String loadBalancerId) {
            this.loadBalancerId = loadBalancerId;
            return this;
        }

        /**
         * <p>The cluster name.</p>
         * 
         * <strong>example:</strong>
         * <p>your-cluster-name</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * NatGatewayId.
         */
        public Builder natGatewayId(String natGatewayId) {
            this.natGatewayId = natGatewayId;
            return this;
        }

        /**
         * NodeCount.
         */
        public Builder nodeCount(NodeCount nodeCount) {
            this.nodeCount = nodeCount;
            return this;
        }

        /**
         * PodStatus.
         */
        public Builder podStatus(PodStatus podStatus) {
            this.podStatus = podStatus;
            return this;
        }

        /**
         * <p>The vSwitch IDs for pods.</p>
         */
        public Builder podVswitchIds(java.util.List<String> podVswitchIds) {
            this.podVswitchIds = podVswitchIds;
            return this;
        }

        /**
         * <p>Indicates whether public network access is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder publicAccess(Boolean publicAccess) {
            this.publicAccess = publicAccess;
            return this;
        }

        /**
         * <p>Id of the request。</p>
         * 
         * <strong>example:</strong>
         * <p>CEF72CEB-54B6-4AE8-B225-F876FF7BA984</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The CIDR block for services.</p>
         * 
         * <strong>example:</strong>
         * <p>172.19.0.0/20</p>
         */
        public Builder serviceCidr(String serviceCidr) {
            this.serviceCidr = serviceCidr;
            return this;
        }

        /**
         * <p>The cluster status. Valid values:</p>
         * <ul>
         * <li><strong>initial</strong>: Being created.</li>
         * <li><strong>failed</strong>: Creation failed.</li>
         * <li><strong>running</strong>: Running.</li>
         * <li><strong>deleting</strong>: Being released.</li>
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
         * <p>The VPC used by the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>n-xxxxxxxxx</p>
         */
        public Builder vpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }

        /**
         * <p>The vSwitch IDs of the cluster nodes.</p>
         */
        public Builder vswitchIds(java.util.List<String> vswitchIds) {
            this.vswitchIds = vswitchIds;
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
    public static class ControlPlaneConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContainerRuntime")
        private String containerRuntime;

        @com.aliyun.core.annotation.NameInMap("ImageId")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("InstanceSpec")
        private String instanceSpec;

        @com.aliyun.core.annotation.NameInMap("NodePortRange")
        private String nodePortRange;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Long size;

        @com.aliyun.core.annotation.NameInMap("SystemDiskCategory")
        private String systemDiskCategory;

        @com.aliyun.core.annotation.NameInMap("SystemDiskSize")
        private Long systemDiskSize;

        private ControlPlaneConfig(Builder builder) {
            this.containerRuntime = builder.containerRuntime;
            this.imageId = builder.imageId;
            this.instanceSpec = builder.instanceSpec;
            this.nodePortRange = builder.nodePortRange;
            this.size = builder.size;
            this.systemDiskCategory = builder.systemDiskCategory;
            this.systemDiskSize = builder.systemDiskSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ControlPlaneConfig create() {
            return builder().build();
        }

        /**
         * @return containerRuntime
         */
        public String getContainerRuntime() {
            return this.containerRuntime;
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        /**
         * @return instanceSpec
         */
        public String getInstanceSpec() {
            return this.instanceSpec;
        }

        /**
         * @return nodePortRange
         */
        public String getNodePortRange() {
            return this.nodePortRange;
        }

        /**
         * @return size
         */
        public Long getSize() {
            return this.size;
        }

        /**
         * @return systemDiskCategory
         */
        public String getSystemDiskCategory() {
            return this.systemDiskCategory;
        }

        /**
         * @return systemDiskSize
         */
        public Long getSystemDiskSize() {
            return this.systemDiskSize;
        }

        public static final class Builder {
            private String containerRuntime; 
            private String imageId; 
            private String instanceSpec; 
            private String nodePortRange; 
            private Long size; 
            private String systemDiskCategory; 
            private Long systemDiskSize; 

            private Builder() {
            } 

            private Builder(ControlPlaneConfig model) {
                this.containerRuntime = model.containerRuntime;
                this.imageId = model.imageId;
                this.instanceSpec = model.instanceSpec;
                this.nodePortRange = model.nodePortRange;
                this.size = model.size;
                this.systemDiskCategory = model.systemDiskCategory;
                this.systemDiskSize = model.systemDiskSize;
            } 

            /**
             * <p>The container runtime type.</p>
             * 
             * <strong>example:</strong>
             * <p>containerd</p>
             */
            public Builder containerRuntime(String containerRuntime) {
                this.containerRuntime = containerRuntime;
                return this;
            }

            /**
             * <p>The image ID of the control plane virtual machine.</p>
             * 
             * <strong>example:</strong>
             * <p>m-5ul335umat4e2y9ynwi84p3f9</p>
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * <p>The node instance type.</p>
             * 
             * <strong>example:</strong>
             * <p>ens.esk.sn1.medium</p>
             */
            public Builder instanceSpec(String instanceSpec) {
                this.instanceSpec = instanceSpec;
                return this;
            }

            /**
             * <p>The node service port range.</p>
             * 
             * <strong>example:</strong>
             * <p>30000-32767</p>
             */
            public Builder nodePortRange(String nodePortRange) {
                this.nodePortRange = nodePortRange;
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
             * <p>The system cloud disk type of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>cloud_efficiency</p>
             */
            public Builder systemDiskCategory(String systemDiskCategory) {
                this.systemDiskCategory = systemDiskCategory;
                return this;
            }

            /**
             * <p>The system cloud disk size of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>120</p>
             */
            public Builder systemDiskSize(Long systemDiskSize) {
                this.systemDiskSize = systemDiskSize;
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
    public static class MasterInstances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private MasterInstances(Builder builder) {
            this.instanceId = builder.instanceId;
            this.ip = builder.ip;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MasterInstances create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String instanceId; 
            private String ip; 
            private String name; 

            private Builder() {
            } 

            private Builder(MasterInstances model) {
                this.instanceId = model.instanceId;
                this.ip = model.ip;
                this.name = model.name;
            } 

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * Ip.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>The cluster name.</p>
             * 
             * <strong>example:</strong>
             * <p>your-cluster-name</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public MasterInstances build() {
                return new MasterInstances(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeClusterDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeClusterDetailResponseBody</p>
     */
    public static class MasterUrl extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PrivateUrl")
        private String privateUrl;

        @com.aliyun.core.annotation.NameInMap("PublicUrl")
        private String publicUrl;

        private MasterUrl(Builder builder) {
            this.privateUrl = builder.privateUrl;
            this.publicUrl = builder.publicUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MasterUrl create() {
            return builder().build();
        }

        /**
         * @return privateUrl
         */
        public String getPrivateUrl() {
            return this.privateUrl;
        }

        /**
         * @return publicUrl
         */
        public String getPublicUrl() {
            return this.publicUrl;
        }

        public static final class Builder {
            private String privateUrl; 
            private String publicUrl; 

            private Builder() {
            } 

            private Builder(MasterUrl model) {
                this.privateUrl = model.privateUrl;
                this.publicUrl = model.publicUrl;
            } 

            /**
             * PrivateUrl.
             */
            public Builder privateUrl(String privateUrl) {
                this.privateUrl = privateUrl;
                return this;
            }

            /**
             * PublicUrl.
             */
            public Builder publicUrl(String publicUrl) {
                this.publicUrl = publicUrl;
                return this;
            }

            public MasterUrl build() {
                return new MasterUrl(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeClusterDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeClusterDetailResponseBody</p>
     */
    public static class ControlPlaneMeta extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MasterInstances")
        private java.util.List<MasterInstances> masterInstances;

        @com.aliyun.core.annotation.NameInMap("MasterUrl")
        private MasterUrl masterUrl;

        private ControlPlaneMeta(Builder builder) {
            this.masterInstances = builder.masterInstances;
            this.masterUrl = builder.masterUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ControlPlaneMeta create() {
            return builder().build();
        }

        /**
         * @return masterInstances
         */
        public java.util.List<MasterInstances> getMasterInstances() {
            return this.masterInstances;
        }

        /**
         * @return masterUrl
         */
        public MasterUrl getMasterUrl() {
            return this.masterUrl;
        }

        public static final class Builder {
            private java.util.List<MasterInstances> masterInstances; 
            private MasterUrl masterUrl; 

            private Builder() {
            } 

            private Builder(ControlPlaneMeta model) {
                this.masterInstances = model.masterInstances;
                this.masterUrl = model.masterUrl;
            } 

            /**
             * MasterInstances.
             */
            public Builder masterInstances(java.util.List<MasterInstances> masterInstances) {
                this.masterInstances = masterInstances;
                return this;
            }

            /**
             * MasterUrl.
             */
            public Builder masterUrl(MasterUrl masterUrl) {
                this.masterUrl = masterUrl;
                return this;
            }

            public ControlPlaneMeta build() {
                return new ControlPlaneMeta(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeClusterDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeClusterDetailResponseBody</p>
     */
    public static class NodeCount extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ready")
        private Integer ready;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Integer total;

        private NodeCount(Builder builder) {
            this.ready = builder.ready;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodeCount create() {
            return builder().build();
        }

        /**
         * @return ready
         */
        public Integer getReady() {
            return this.ready;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private Integer ready; 
            private Integer total; 

            private Builder() {
            } 

            private Builder(NodeCount model) {
                this.ready = model.ready;
                this.total = model.total;
            } 

            /**
             * Ready.
             */
            public Builder ready(Integer ready) {
                this.ready = ready;
                return this;
            }

            /**
             * Total.
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public NodeCount build() {
                return new NodeCount(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeClusterDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeClusterDetailResponseBody</p>
     */
    public static class PodStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Running")
        private Integer running;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Integer total;

        private PodStatus(Builder builder) {
            this.running = builder.running;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PodStatus create() {
            return builder().build();
        }

        /**
         * @return running
         */
        public Integer getRunning() {
            return this.running;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private Integer running; 
            private Integer total; 

            private Builder() {
            } 

            private Builder(PodStatus model) {
                this.running = model.running;
                this.total = model.total;
            } 

            /**
             * Running.
             */
            public Builder running(Integer running) {
                this.running = running;
                return this;
            }

            /**
             * Total.
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public PodStatus build() {
                return new PodStatus(this);
            } 

        } 

    }
}
