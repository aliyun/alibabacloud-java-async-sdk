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
 * {@link CreateClusterRequest} extends {@link RequestModel}
 *
 * <p>CreateClusterRequest</p>
 */
public class CreateClusterRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContainerCidr")
    private String containerCidr;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ControlPlaneConfig")
    private ControlPlaneConfig controlPlaneConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnsRegionId")
    private String ensRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Isp")
    private String isp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KubernetesVersion")
    private String kubernetesVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LoadBalancerId")
    private String loadBalancerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NatGatewayId")
    private String natGatewayId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PodVswitchIds")
    private java.util.List<String> podVswitchIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Profile")
    @com.aliyun.core.annotation.Validation(required = true)
    private String profile;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PublicAccess")
    private Boolean publicAccess;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceCidr")
    private String serviceCidr;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VswitchIds")
    private java.util.List<String> vswitchIds;

    private CreateClusterRequest(Builder builder) {
        super(builder);
        this.clusterType = builder.clusterType;
        this.containerCidr = builder.containerCidr;
        this.controlPlaneConfig = builder.controlPlaneConfig;
        this.ensRegionId = builder.ensRegionId;
        this.isp = builder.isp;
        this.kubernetesVersion = builder.kubernetesVersion;
        this.loadBalancerId = builder.loadBalancerId;
        this.name = builder.name;
        this.natGatewayId = builder.natGatewayId;
        this.podVswitchIds = builder.podVswitchIds;
        this.profile = builder.profile;
        this.publicAccess = builder.publicAccess;
        this.serviceCidr = builder.serviceCidr;
        this.vpcId = builder.vpcId;
        this.vswitchIds = builder.vswitchIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateClusterRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return podVswitchIds
     */
    public java.util.List<String> getPodVswitchIds() {
        return this.podVswitchIds;
    }

    /**
     * @return profile
     */
    public String getProfile() {
        return this.profile;
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

    public static final class Builder extends Request.Builder<CreateClusterRequest, Builder> {
        private String clusterType; 
        private String containerCidr; 
        private ControlPlaneConfig controlPlaneConfig; 
        private String ensRegionId; 
        private String isp; 
        private String kubernetesVersion; 
        private String loadBalancerId; 
        private String name; 
        private String natGatewayId; 
        private java.util.List<String> podVswitchIds; 
        private String profile; 
        private Boolean publicAccess; 
        private String serviceCidr; 
        private String vpcId; 
        private java.util.List<String> vswitchIds; 

        private Builder() {
            super();
        } 

        private Builder(CreateClusterRequest request) {
            super(request);
            this.clusterType = request.clusterType;
            this.containerCidr = request.containerCidr;
            this.controlPlaneConfig = request.controlPlaneConfig;
            this.ensRegionId = request.ensRegionId;
            this.isp = request.isp;
            this.kubernetesVersion = request.kubernetesVersion;
            this.loadBalancerId = request.loadBalancerId;
            this.name = request.name;
            this.natGatewayId = request.natGatewayId;
            this.podVswitchIds = request.podVswitchIds;
            this.profile = request.profile;
            this.publicAccess = request.publicAccess;
            this.serviceCidr = request.serviceCidr;
            this.vpcId = request.vpcId;
            this.vswitchIds = request.vswitchIds;
        } 

        /**
         * <p>Kubernetes or ManagedKubernetes. The former indicates an ECK cluster, and the latter indicates a serverless VC.
         * Must be used together with the profile parameter.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Kubernetes</p>
         */
        public Builder clusterType(String clusterType) {
            this.putQueryParameter("ClusterType", clusterType);
            this.clusterType = clusterType;
            return this;
        }

        /**
         * <p>The pod network CIDR block. The CIDR block must be a valid private CIDR block, which includes the following CIDR blocks and their subnets: 10.0.0.0/8, 172.16-31.0.0/12-16, and 192.168.0.0/16. The CIDR block cannot overlap with the CIDR blocks used by the VPC or existing Kubernetes clusters in the VPC. You cannot modify the CIDR block after the cluster is created.</p>
         * 
         * <strong>example:</strong>
         * <p>172.20.0.0/16</p>
         */
        public Builder containerCidr(String containerCidr) {
            this.putQueryParameter("ContainerCidr", containerCidr);
            this.containerCidr = containerCidr;
            return this;
        }

        /**
         * <p>The control plane configuration.</p>
         */
        public Builder controlPlaneConfig(ControlPlaneConfig controlPlaneConfig) {
            String controlPlaneConfigShrink = shrink(controlPlaneConfig, "ControlPlaneConfig", "json");
            this.putQueryParameter("ControlPlaneConfig", controlPlaneConfigShrink);
            this.controlPlaneConfig = controlPlaneConfig;
            return this;
        }

        /**
         * <p>The ENS Region ID of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder ensRegionId(String ensRegionId) {
            this.putQueryParameter("EnsRegionId", ensRegionId);
            this.ensRegionId = ensRegionId;
            return this;
        }

        /**
         * Isp.
         */
        public Builder isp(String isp) {
            this.putQueryParameter("Isp", isp);
            this.isp = isp;
            return this;
        }

        /**
         * <p>The cluster version, which is consistent with the Kubernetes community baseline version. Select the latest version. If you do not specify this parameter, the latest version is used by default.</p>
         * 
         * <strong>example:</strong>
         * <p>1.32.1</p>
         */
        public Builder kubernetesVersion(String kubernetesVersion) {
            this.putQueryParameter("KubernetesVersion", kubernetesVersion);
            this.kubernetesVersion = kubernetesVersion;
            return this;
        }

        /**
         * <p>The ID of the CLB instance used for API Server access. If you specify this parameter, automatic creation of a CLB instance for the API Server is skipped.</p>
         * 
         * <strong>example:</strong>
         * <p>lb-wz9t256gqa3vbouk****</p>
         */
        public Builder loadBalancerId(String loadBalancerId) {
            this.putQueryParameter("LoadBalancerId", loadBalancerId);
            this.loadBalancerId = loadBalancerId;
            return this;
        }

        /**
         * <p>The cluster name.</p>
         * 
         * <strong>example:</strong>
         * <p>mycluster-1</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * NatGatewayId.
         */
        public Builder natGatewayId(String natGatewayId) {
            this.putQueryParameter("NatGatewayId", natGatewayId);
            this.natGatewayId = natGatewayId;
            return this;
        }

        /**
         * <p>Each pod vSwitch corresponds to a worker node vSwitch. The zone of the pod vSwitch must be the same as that of the worker node vSwitch. If you do not specify this parameter, vswitch_ids is used by default.</p>
         */
        public Builder podVswitchIds(java.util.List<String> podVswitchIds) {
            String podVswitchIdsShrink = shrink(podVswitchIds, "PodVswitchIds", "json");
            this.putQueryParameter("PodVswitchIds", podVswitchIdsShrink);
            this.podVswitchIds = podVswitchIds;
            return this;
        }

        /**
         * <p>Default or Serverless. The former indicates an ECK cluster, and the latter indicates a serverless VC.
         * Must be used together with the cluster_type parameter.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Default</p>
         */
        public Builder profile(String profile) {
            this.putQueryParameter("Profile", profile);
            this.profile = profile;
            return this;
        }

        /**
         * <p>Specifies whether to enable public network access. The API Server is exposed through an EIP to enable public access to the cluster.
         * ● true: Enable public network access.
         * ● false: Disable public network access. If you select this option, you cannot access the cluster API Server from the Internet.
         * Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder publicAccess(Boolean publicAccess) {
            this.putQueryParameter("PublicAccess", publicAccess);
            this.publicAccess = publicAccess;
            return this;
        }

        /**
         * <p>The service network CIDR block. Valid ranges: 10.0.0.0/16-24, 172.16-31.0.0/16-24, and 192.168.0.0/16-24. The CIDR block cannot overlap with the VPC CIDR block 10.1.0.0/21 or the CIDR blocks used by existing Kubernetes clusters in the VPC. You cannot modify the CIDR block after the cluster is created.</p>
         * 
         * <strong>example:</strong>
         * <p>172.19.0.0/20</p>
         */
        public Builder serviceCidr(String serviceCidr) {
            this.putQueryParameter("ServiceCidr", serviceCidr);
            this.serviceCidr = serviceCidr;
            return this;
        }

        /**
         * <p>The VPC used by the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-xxxx</p>
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * <p>The IDs of the vSwitches for cluster nodes. The ENS Region of the vswitch_ids must be the same as the ens_region_id value.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;vsw-xxx&quot;, &quot;vsw-yyy&quot;]</p>
         */
        public Builder vswitchIds(java.util.List<String> vswitchIds) {
            String vswitchIdsShrink = shrink(vswitchIds, "VswitchIds", "json");
            this.putQueryParameter("VswitchIds", vswitchIdsShrink);
            this.vswitchIds = vswitchIds;
            return this;
        }

        @Override
        public CreateClusterRequest build() {
            return new CreateClusterRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateClusterRequest} extends {@link TeaModel}
     *
     * <p>CreateClusterRequest</p>
     */
    public static class ControlPlaneConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ImageId")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("InstanceSpec")
        private String instanceSpec;

        @com.aliyun.core.annotation.NameInMap("LoginPassword")
        private String loginPassword;

        @com.aliyun.core.annotation.NameInMap("NodePortRange")
        private String nodePortRange;

        @com.aliyun.core.annotation.NameInMap("Runtime")
        private String runtime;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Integer size;

        @com.aliyun.core.annotation.NameInMap("SystemDiskCategory")
        private String systemDiskCategory;

        @com.aliyun.core.annotation.NameInMap("SystemDiskSize")
        private Long systemDiskSize;

        private ControlPlaneConfig(Builder builder) {
            this.imageId = builder.imageId;
            this.instanceSpec = builder.instanceSpec;
            this.loginPassword = builder.loginPassword;
            this.nodePortRange = builder.nodePortRange;
            this.runtime = builder.runtime;
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
         * @return loginPassword
         */
        public String getLoginPassword() {
            return this.loginPassword;
        }

        /**
         * @return nodePortRange
         */
        public String getNodePortRange() {
            return this.nodePortRange;
        }

        /**
         * @return runtime
         */
        public String getRuntime() {
            return this.runtime;
        }

        /**
         * @return size
         */
        public Integer getSize() {
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
            private String imageId; 
            private String instanceSpec; 
            private String loginPassword; 
            private String nodePortRange; 
            private String runtime; 
            private Integer size; 
            private String systemDiskCategory; 
            private Long systemDiskSize; 

            private Builder() {
            } 

            private Builder(ControlPlaneConfig model) {
                this.imageId = model.imageId;
                this.instanceSpec = model.instanceSpec;
                this.loginPassword = model.loginPassword;
                this.nodePortRange = model.nodePortRange;
                this.runtime = model.runtime;
                this.size = model.size;
                this.systemDiskCategory = model.systemDiskCategory;
                this.systemDiskSize = model.systemDiskSize;
            } 

            /**
             * <p>The control plane virtual machine image ID.</p>
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
             * <p>The logon password for the cluster control plane machines.</p>
             * 
             * <strong>example:</strong>
             * <p>ThisIsAPassword</p>
             */
            public Builder loginPassword(String loginPassword) {
                this.loginPassword = loginPassword;
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
             * <p>The control plane node runtime name.</p>
             * 
             * <strong>example:</strong>
             * <p>containerd</p>
             */
            public Builder runtime(String runtime) {
                this.runtime = runtime;
                return this;
            }

            /**
             * <p>The number of control plane nodes. Valid values: 3 and 5.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            /**
             * <p>The node system cloud disk type. Valid values: &quot;local_ssd&quot;, &quot;cloud_ssd&quot;, &quot;cloud_efficiency&quot;, &quot;local_hdd&quot;.</p>
             * 
             * <strong>example:</strong>
             * <p>cloud_efficiency</p>
             */
            public Builder systemDiskCategory(String systemDiskCategory) {
                this.systemDiskCategory = systemDiskCategory;
                return this;
            }

            /**
             * <p>The node system cloud disk size.</p>
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
}
