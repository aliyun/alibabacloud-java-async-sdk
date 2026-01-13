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
 * {@link DescribeClustersV1ResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeClustersV1ResponseBody</p>
 */
public class DescribeClustersV1ResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Clusters")
    private java.util.List<Clusters> clusters;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeClustersV1ResponseBody(Builder builder) {
        this.clusters = builder.clusters;
        this.requestId = builder.requestId;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Clusters> clusters; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeClustersV1ResponseBody model) {
            this.clusters = model.clusters;
            this.requestId = model.requestId;
        } 

        /**
         * <p>An array that consists of the information about clusters.</p>
         */
        public Builder clusters(java.util.List<Clusters> clusters) {
            this.clusters = clusters;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>C0003E8B-B930-4F59-ADC0-0E209A9012A8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
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
             * <p>The runtime type used by the nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>containerd</p>
             */
            public Builder containerRuntime(String containerRuntime) {
                this.containerRuntime = containerRuntime;
                return this;
            }

            /**
             * <p>The ID of the custom image.</p>
             * 
             * <strong>example:</strong>
             * <p>m-68be8cb9f71fhyvjekxa23qsf</p>
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * <p>The instance type.</p>
             * 
             * <strong>example:</strong>
             * <p>ens.sn1.medium</p>
             */
            public Builder instanceSpec(String instanceSpec) {
                this.instanceSpec = instanceSpec;
                return this;
            }

            /**
             * <p>The node port range.</p>
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
             * <p>5</p>
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * <p>The system disk type of the node. Valid value: local_ssd, cloud_ssd, cloud_efficiency, and local_hdd.</p>
             * 
             * <strong>example:</strong>
             * <p>cloud_ssd</p>
             */
            public Builder systemDiskCategory(String systemDiskCategory) {
                this.systemDiskCategory = systemDiskCategory;
                return this;
            }

            /**
             * <p>The size of the system disk. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
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
     * {@link DescribeClustersV1ResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeClustersV1ResponseBody</p>
     */
    public static class Clusters extends TeaModel {
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

        @com.aliyun.core.annotation.NameInMap("EnsRegionId")
        private String ensRegionId;

        @com.aliyun.core.annotation.NameInMap("JoinToken")
        private String joinToken;

        @com.aliyun.core.annotation.NameInMap("KubernetesVersion")
        private String kubernetesVersion;

        @com.aliyun.core.annotation.NameInMap("LoadBalancerId")
        private String loadBalancerId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("PodVswitchIds")
        private java.util.List<String> podVswitchIds;

        @com.aliyun.core.annotation.NameInMap("PublicAccess")
        private Boolean publicAccess;

        @com.aliyun.core.annotation.NameInMap("ServiceCidr")
        private String serviceCidr;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("VswitchIds")
        private java.util.List<String> vswitchIds;

        private Clusters(Builder builder) {
            this.aliUid = builder.aliUid;
            this.clusterId = builder.clusterId;
            this.config = builder.config;
            this.containerCidr = builder.containerCidr;
            this.controlPlaneConfig = builder.controlPlaneConfig;
            this.ensRegionId = builder.ensRegionId;
            this.joinToken = builder.joinToken;
            this.kubernetesVersion = builder.kubernetesVersion;
            this.loadBalancerId = builder.loadBalancerId;
            this.name = builder.name;
            this.podVswitchIds = builder.podVswitchIds;
            this.publicAccess = builder.publicAccess;
            this.serviceCidr = builder.serviceCidr;
            this.state = builder.state;
            this.vpcId = builder.vpcId;
            this.vswitchIds = builder.vswitchIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Clusters create() {
            return builder().build();
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
         * @return ensRegionId
         */
        public String getEnsRegionId() {
            return this.ensRegionId;
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
            private String ensRegionId; 
            private String joinToken; 
            private String kubernetesVersion; 
            private String loadBalancerId; 
            private String name; 
            private java.util.List<String> podVswitchIds; 
            private Boolean publicAccess; 
            private String serviceCidr; 
            private String state; 
            private String vpcId; 
            private java.util.List<String> vswitchIds; 

            private Builder() {
            } 

            private Builder(Clusters model) {
                this.aliUid = model.aliUid;
                this.clusterId = model.clusterId;
                this.config = model.config;
                this.containerCidr = model.containerCidr;
                this.controlPlaneConfig = model.controlPlaneConfig;
                this.ensRegionId = model.ensRegionId;
                this.joinToken = model.joinToken;
                this.kubernetesVersion = model.kubernetesVersion;
                this.loadBalancerId = model.loadBalancerId;
                this.name = model.name;
                this.podVswitchIds = model.podVswitchIds;
                this.publicAccess = model.publicAccess;
                this.serviceCidr = model.serviceCidr;
                this.state = model.state;
                this.vpcId = model.vpcId;
                this.vswitchIds = model.vswitchIds;
            } 

            /**
             * <p>The user IDs.</p>
             * 
             * <strong>example:</strong>
             * <p>1375383353108460</p>
             */
            public Builder aliUid(String aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * <p>The cluster instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>eck-xxxxxxx</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>The kubeconfig file of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *         &quot;kind&quot;: &quot;Config&quot;,
             *         &quot;apiVersion&quot;: &quot;v1&quot;,
             *         &quot;preferences&quot;: {},
             *         &quot;clusters&quot;: [
             *           {
             *             &quot;name&quot;: &quot;kubernetes&quot;,
             *             &quot;cluster&quot;: {
             *               &quot;server&quot;: &quot;<a href="https://000.000.000.000:6443">https://000.000.000.000:6443</a>&quot;,
             *               &quot;certificate-authority-data&quot;: &quot;&quot;
             *             }
             *           }
             *         ],
             *         &quot;users&quot;: [
             *           {
             *             &quot;name&quot;: &quot;kubernetes-admin&quot;,
             *             &quot;user&quot;: {
             *               &quot;client-certificate-data&quot;: &quot;&quot;,
             *               &quot;client-key-data&quot;: &quot;&quot;
             *             }
             *           }
             *         ],
             *         &quot;contexts&quot;: [
             *           {
             *             &quot;name&quot;: &quot;kubernetes-admin@kubernetes&quot;,
             *             &quot;context&quot;: {
             *               &quot;cluster&quot;: &quot;kubernetes&quot;,
             *               &quot;user&quot;: &quot;kubernetes-admin&quot;
             *             }
             *           }
             *         ],
             *         &quot;current-context&quot;: &quot;kubernetes-admin@kubernetes&quot;
             *       }</p>
             */
            public Builder config(Object config) {
                this.config = config;
                return this;
            }

            /**
             * <p>The pod CIDR block. You can specify 10.0.0.0/8, 172.16-31.0.0/12-16, 192.168.0.0/16, or their subnets as the pod CIDR block. The pod CIDR block cannot overlap with the CIDR block of the VPC in which the cluster is deployed and the CIDR blocks of existing clusters in the VPC. You cannot modify the pod CIDR block after you create the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>10.0.0.0/8</p>
             */
            public Builder containerCidr(String containerCidr) {
                this.containerCidr = containerCidr;
                return this;
            }

            /**
             * <p>Control plane configuration.</p>
             */
            public Builder controlPlaneConfig(ControlPlaneConfig controlPlaneConfig) {
                this.controlPlaneConfig = controlPlaneConfig;
                return this;
            }

            /**
             * <p>The ID of the ENS node.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-55</p>
             */
            public Builder ensRegionId(String ensRegionId) {
                this.ensRegionId = ensRegionId;
                return this;
            }

            /**
             * <p>The cluster access authentication token.</p>
             * 
             * <strong>example:</strong>
             * <p>xxxxxxxxxx.yyyyyyy</p>
             */
            public Builder joinToken(String joinToken) {
                this.joinToken = joinToken;
                return this;
            }

            /**
             * <p>The Kubernetes version of the cluster. The Kubernetes versions supported are the same as the Kubernetes versions supported by open source Kubernetes. We recommend that you specify the latest Kubernetes version. If you do not specify this parameter, the latest Kubernetes version is used.</p>
             * 
             * <strong>example:</strong>
             * <p>1.31.9-aliyunedge.1</p>
             */
            public Builder kubernetesVersion(String kubernetesVersion) {
                this.kubernetesVersion = kubernetesVersion;
                return this;
            }

            /**
             * <p>The ID of the ALB instance.</p>
             * 
             * <strong>example:</strong>
             * <p>lb-58dngw0fyimzzvwljfec7hy0z</p>
             */
            public Builder loadBalancerId(String loadBalancerId) {
                this.loadBalancerId = loadBalancerId;
                return this;
            }

            /**
             * <p>The name of the monitoring object.</p>
             * 
             * <strong>example:</strong>
             * <p>test-eck-name</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>For each vSwitch that allocates IP addresses to worker nodes, you must select a vSwitch in the same zone to allocate IP addresses to pods. If you do not specify this parameter, vswitch_ids is used by default.</p>
             */
            public Builder podVswitchIds(java.util.List<String> podVswitchIds) {
                this.podVswitchIds = podVswitchIds;
                return this;
            }

            /**
             * <p>Specifies whether to enable Internet access for the application. You can use an elastic IP address (EIP) to expose the API server. This way, you can access the cluster over the Internet. Valid values: true: enables Internet access for the application. false: disables Internet access to the API server of the cluster. If you set the value to false, the API server cannot be accessed over the Internet.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder publicAccess(Boolean publicAccess) {
                this.publicAccess = publicAccess;
                return this;
            }

            /**
             * <p>Valid values: 10.0.0.0/16-24, 172.16-31.0.0/16-24, and 192.168.0.0/16-24. The Service CIDR block cannot overlap with the VPC CIDR block 10.1.0.0/21 or the CIDR blocks of existing ACK clusters in the VPC. You cannot change the Service CIDR block after you create the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.0.0/16</p>
             */
            public Builder serviceCidr(String serviceCidr) {
                this.serviceCidr = serviceCidr;
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
             * <p>The VPC of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>n-5wsgr3xeolb2ist303wp3cscp</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>the id of the vswitch to which the cluster node belongs. The ENS region of the vswitch_ids service must be the same as that of the ens_region_id.</p>
             */
            public Builder vswitchIds(java.util.List<String> vswitchIds) {
                this.vswitchIds = vswitchIds;
                return this;
            }

            public Clusters build() {
                return new Clusters(this);
            } 

        } 

    }
}
