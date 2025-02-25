// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20240730.models;

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
    @com.aliyun.core.annotation.NameInMap("AdditionalPackages")
    private java.util.List<AdditionalPackages> additionalPackages;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Addons")
    private java.util.List<Addons> addons;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientVersion")
    private String clientVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterCategory")
    private String clusterCategory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterCredentials")
    private ClusterCredentials clusterCredentials;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterCustomConfiguration")
    private ClusterCustomConfiguration clusterCustomConfiguration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterDescription")
    private String clusterDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterMode")
    private String clusterMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterName")
    private String clusterName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterVSwitchId")
    private String clusterVSwitchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterVpcId")
    private String clusterVpcId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeletionProtection")
    private Boolean deletionProtection;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsEnterpriseSecurityGroup")
    private Boolean isEnterpriseSecurityGroup;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Manager")
    private Manager manager;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxCoreCount")
    private Integer maxCoreCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxCount")
    private Integer maxCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Queues")
    private java.util.List<QueueTemplate> queues;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
    private String securityGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SharedStorages")
    private java.util.List<SharedStorageTemplate> sharedStorages;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List<Tags> tags;

    private CreateClusterRequest(Builder builder) {
        super(builder);
        this.additionalPackages = builder.additionalPackages;
        this.addons = builder.addons;
        this.clientVersion = builder.clientVersion;
        this.clusterCategory = builder.clusterCategory;
        this.clusterCredentials = builder.clusterCredentials;
        this.clusterCustomConfiguration = builder.clusterCustomConfiguration;
        this.clusterDescription = builder.clusterDescription;
        this.clusterMode = builder.clusterMode;
        this.clusterName = builder.clusterName;
        this.clusterVSwitchId = builder.clusterVSwitchId;
        this.clusterVpcId = builder.clusterVpcId;
        this.deletionProtection = builder.deletionProtection;
        this.isEnterpriseSecurityGroup = builder.isEnterpriseSecurityGroup;
        this.manager = builder.manager;
        this.maxCoreCount = builder.maxCoreCount;
        this.maxCount = builder.maxCount;
        this.queues = builder.queues;
        this.resourceGroupId = builder.resourceGroupId;
        this.securityGroupId = builder.securityGroupId;
        this.sharedStorages = builder.sharedStorages;
        this.tags = builder.tags;
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
     * @return additionalPackages
     */
    public java.util.List<AdditionalPackages> getAdditionalPackages() {
        return this.additionalPackages;
    }

    /**
     * @return addons
     */
    public java.util.List<Addons> getAddons() {
        return this.addons;
    }

    /**
     * @return clientVersion
     */
    public String getClientVersion() {
        return this.clientVersion;
    }

    /**
     * @return clusterCategory
     */
    public String getClusterCategory() {
        return this.clusterCategory;
    }

    /**
     * @return clusterCredentials
     */
    public ClusterCredentials getClusterCredentials() {
        return this.clusterCredentials;
    }

    /**
     * @return clusterCustomConfiguration
     */
    public ClusterCustomConfiguration getClusterCustomConfiguration() {
        return this.clusterCustomConfiguration;
    }

    /**
     * @return clusterDescription
     */
    public String getClusterDescription() {
        return this.clusterDescription;
    }

    /**
     * @return clusterMode
     */
    public String getClusterMode() {
        return this.clusterMode;
    }

    /**
     * @return clusterName
     */
    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * @return clusterVSwitchId
     */
    public String getClusterVSwitchId() {
        return this.clusterVSwitchId;
    }

    /**
     * @return clusterVpcId
     */
    public String getClusterVpcId() {
        return this.clusterVpcId;
    }

    /**
     * @return deletionProtection
     */
    public Boolean getDeletionProtection() {
        return this.deletionProtection;
    }

    /**
     * @return isEnterpriseSecurityGroup
     */
    public Boolean getIsEnterpriseSecurityGroup() {
        return this.isEnterpriseSecurityGroup;
    }

    /**
     * @return manager
     */
    public Manager getManager() {
        return this.manager;
    }

    /**
     * @return maxCoreCount
     */
    public Integer getMaxCoreCount() {
        return this.maxCoreCount;
    }

    /**
     * @return maxCount
     */
    public Integer getMaxCount() {
        return this.maxCount;
    }

    /**
     * @return queues
     */
    public java.util.List<QueueTemplate> getQueues() {
        return this.queues;
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
     * @return sharedStorages
     */
    public java.util.List<SharedStorageTemplate> getSharedStorages() {
        return this.sharedStorages;
    }

    /**
     * @return tags
     */
    public java.util.List<Tags> getTags() {
        return this.tags;
    }

    public static final class Builder extends Request.Builder<CreateClusterRequest, Builder> {
        private java.util.List<AdditionalPackages> additionalPackages; 
        private java.util.List<Addons> addons; 
        private String clientVersion; 
        private String clusterCategory; 
        private ClusterCredentials clusterCredentials; 
        private ClusterCustomConfiguration clusterCustomConfiguration; 
        private String clusterDescription; 
        private String clusterMode; 
        private String clusterName; 
        private String clusterVSwitchId; 
        private String clusterVpcId; 
        private Boolean deletionProtection; 
        private Boolean isEnterpriseSecurityGroup; 
        private Manager manager; 
        private Integer maxCoreCount; 
        private Integer maxCount; 
        private java.util.List<QueueTemplate> queues; 
        private String resourceGroupId; 
        private String securityGroupId; 
        private java.util.List<SharedStorageTemplate> sharedStorages; 
        private java.util.List<Tags> tags; 

        private Builder() {
            super();
        } 

        private Builder(CreateClusterRequest request) {
            super(request);
            this.additionalPackages = request.additionalPackages;
            this.addons = request.addons;
            this.clientVersion = request.clientVersion;
            this.clusterCategory = request.clusterCategory;
            this.clusterCredentials = request.clusterCredentials;
            this.clusterCustomConfiguration = request.clusterCustomConfiguration;
            this.clusterDescription = request.clusterDescription;
            this.clusterMode = request.clusterMode;
            this.clusterName = request.clusterName;
            this.clusterVSwitchId = request.clusterVSwitchId;
            this.clusterVpcId = request.clusterVpcId;
            this.deletionProtection = request.deletionProtection;
            this.isEnterpriseSecurityGroup = request.isEnterpriseSecurityGroup;
            this.manager = request.manager;
            this.maxCoreCount = request.maxCoreCount;
            this.maxCount = request.maxCount;
            this.queues = request.queues;
            this.resourceGroupId = request.resourceGroupId;
            this.securityGroupId = request.securityGroupId;
            this.sharedStorages = request.sharedStorages;
            this.tags = request.tags;
        } 

        /**
         * <p>The list of software that you want to install in the cluster. Valid values of N: 0 to 10.</p>
         */
        public Builder additionalPackages(java.util.List<AdditionalPackages> additionalPackages) {
            String additionalPackagesShrink = shrink(additionalPackages, "AdditionalPackages", "json");
            this.putQueryParameter("AdditionalPackages", additionalPackagesShrink);
            this.additionalPackages = additionalPackages;
            return this;
        }

        /**
         * <p>The configurations of the custom addons in the cluster. Only one addon is supported.</p>
         */
        public Builder addons(java.util.List<Addons> addons) {
            String addonsShrink = shrink(addons, "Addons", "json");
            this.putQueryParameter("Addons", addonsShrink);
            this.addons = addons;
            return this;
        }

        /**
         * <p>The client version. By default, the latest version is used.</p>
         * 
         * <strong>example:</strong>
         * <p>2.1.0</p>
         */
        public Builder clientVersion(String clientVersion) {
            this.putQueryParameter("ClientVersion", clientVersion);
            this.clientVersion = clientVersion;
            return this;
        }

        /**
         * <p>The cluster type. Valid values:</p>
         * <ul>
         * <li>Standard</li>
         * <li>Serverless</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Standard</p>
         */
        public Builder clusterCategory(String clusterCategory) {
            this.putQueryParameter("ClusterCategory", clusterCategory);
            this.clusterCategory = clusterCategory;
            return this;
        }

        /**
         * <p>The access credentials of the cluster.</p>
         */
        public Builder clusterCredentials(ClusterCredentials clusterCredentials) {
            String clusterCredentialsShrink = shrink(clusterCredentials, "ClusterCredentials", "json");
            this.putQueryParameter("ClusterCredentials", clusterCredentialsShrink);
            this.clusterCredentials = clusterCredentials;
            return this;
        }

        /**
         * <p>The post-processing script of the cluster.</p>
         */
        public Builder clusterCustomConfiguration(ClusterCustomConfiguration clusterCustomConfiguration) {
            String clusterCustomConfigurationShrink = shrink(clusterCustomConfiguration, "ClusterCustomConfiguration", "json");
            this.putQueryParameter("ClusterCustomConfiguration", clusterCustomConfigurationShrink);
            this.clusterCustomConfiguration = clusterCustomConfiguration;
            return this;
        }

        /**
         * <p>The cluster description. The description must be 1 to 128 characters in length and can contain letters, digits, hyphens (-), and underscores (_).</p>
         * 
         * <strong>example:</strong>
         * <p>slurm22.05.8-cluster-20240718</p>
         */
        public Builder clusterDescription(String clusterDescription) {
            this.putQueryParameter("ClusterDescription", clusterDescription);
            this.clusterDescription = clusterDescription;
            return this;
        }

        /**
         * <p>The deployment mode of the cluster. Valid values:</p>
         * <ul>
         * <li>Integrated</li>
         * <li>Hybrid</li>
         * <li>Custom</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Integrated</p>
         */
        public Builder clusterMode(String clusterMode) {
            this.putQueryParameter("ClusterMode", clusterMode);
            this.clusterMode = clusterMode;
            return this;
        }

        /**
         * <p>The cluster name. The name must be 1 to 128 characters in length and can contain letters, digits, hyphens (-), and underscores (_).</p>
         * 
         * <strong>example:</strong>
         * <p>slurm22.05.8-cluster-20240718</p>
         */
        public Builder clusterName(String clusterName) {
            this.putQueryParameter("ClusterName", clusterName);
            this.clusterName = clusterName;
            return this;
        }

        /**
         * <p>The ID of the vSwitch that you want the cluster to use. The vSwitch must reside in the VPC that is specified by the <code>ClusterVpcId</code> parameter.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/448581.html">DescribeVpcs</a> operation to query information about the created VPCs and vSwitches.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-f8za5p0mwzgdu3wgx****</p>
         */
        public Builder clusterVSwitchId(String clusterVSwitchId) {
            this.putQueryParameter("ClusterVSwitchId", clusterVSwitchId);
            this.clusterVSwitchId = clusterVSwitchId;
            return this;
        }

        /**
         * <p>The ID of the virtual private cloud (VPC) in which the cluster resides.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-m5efjevmclc0xdmys****</p>
         */
        public Builder clusterVpcId(String clusterVpcId) {
            this.putQueryParameter("ClusterVpcId", clusterVpcId);
            this.clusterVpcId = clusterVpcId;
            return this;
        }

        /**
         * <p>Specifies whether to enable deletion protection for the cluster. Deletion protection decides whether the cluster can be deleted in the console or by calling the <a href="https://help.aliyun.com/document_detail/424406.html">DeleteCluster</a> operation. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder deletionProtection(Boolean deletionProtection) {
            this.putQueryParameter("DeletionProtection", deletionProtection);
            this.deletionProtection = deletionProtection;
            return this;
        }

        /**
         * <p>Specifies whether to use an advanced security group. Valid values:</p>
         * <ul>
         * <li>true: automatically creates and uses an advanced security group.</li>
         * <li>false: automatically creates and uses a basic security group.</li>
         * </ul>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/605897.html">Basic security groups and advanced security groups</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder isEnterpriseSecurityGroup(Boolean isEnterpriseSecurityGroup) {
            this.putQueryParameter("IsEnterpriseSecurityGroup", isEnterpriseSecurityGroup);
            this.isEnterpriseSecurityGroup = isEnterpriseSecurityGroup;
            return this;
        }

        /**
         * <p>The configurations of the cluster management node.</p>
         */
        public Builder manager(Manager manager) {
            String managerShrink = shrink(manager, "Manager", "json");
            this.putQueryParameter("Manager", managerShrink);
            this.manager = manager;
            return this;
        }

        /**
         * <p>The maximum number of vCPUs that can be used by compute nodes in the cluster. Valid values: 0 to 100,000.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder maxCoreCount(Integer maxCoreCount) {
            this.putQueryParameter("MaxCoreCount", maxCoreCount);
            this.maxCoreCount = maxCoreCount;
            return this;
        }

        /**
         * <p>The maximum number of compute nodes that the cluster can manage. Valid values: 0 to 5,000.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        public Builder maxCount(Integer maxCount) {
            this.putQueryParameter("MaxCount", maxCount);
            this.maxCount = maxCount;
            return this;
        }

        /**
         * <p>The configurations of the queues in the cluster. The number of queues can be 0 to 8.</p>
         */
        public Builder queues(java.util.List<QueueTemplate> queues) {
            String queuesShrink = shrink(queues, "Queues", "json");
            this.putQueryParameter("Queues", queuesShrink);
            this.queues = queues;
            return this;
        }

        /**
         * <p>The ID of the resource group to which the cluster belongs.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/158855.html">ListResourceGroups</a> operation to obtain the IDs of the resource groups.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmxazb4******</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The ID of the security group to which the cluster belongs.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/25556.html">DescribeSecurityGroups</a> operation to query available security groups in the current region.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-bp13n61xsydodfyg****</p>
         */
        public Builder securityGroupId(String securityGroupId) {
            this.putQueryParameter("SecurityGroupId", securityGroupId);
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * <p>The configurations of shared storage in the cluster.</p>
         */
        public Builder sharedStorages(java.util.List<SharedStorageTemplate> sharedStorages) {
            String sharedStoragesShrink = shrink(sharedStorages, "SharedStorages", "json");
            this.putQueryParameter("SharedStorages", sharedStoragesShrink);
            this.sharedStorages = sharedStorages;
            return this;
        }

        /**
         * <p>The tags of the cluster.</p>
         */
        public Builder tags(java.util.List<Tags> tags) {
            String tagsShrink = shrink(tags, "Tags", "json");
            this.putQueryParameter("Tags", tagsShrink);
            this.tags = tags;
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
    public static class AdditionalPackages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private AdditionalPackages(Builder builder) {
            this.name = builder.name;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AdditionalPackages create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String name; 
            private String version; 

            /**
             * <p>The name of the software that you want to install in the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>mpich</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The version of the software that you want to install in the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>4.0.3</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public AdditionalPackages build() {
                return new AdditionalPackages(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateClusterRequest} extends {@link TeaModel}
     *
     * <p>CreateClusterRequest</p>
     */
    public static class Addons extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        @com.aliyun.core.annotation.NameInMap("ResourcesSpec")
        private String resourcesSpec;

        @com.aliyun.core.annotation.NameInMap("ServicesSpec")
        private String servicesSpec;

        @com.aliyun.core.annotation.NameInMap("Version")
        @com.aliyun.core.annotation.Validation(required = true)
        private String version;

        private Addons(Builder builder) {
            this.name = builder.name;
            this.resourcesSpec = builder.resourcesSpec;
            this.servicesSpec = builder.servicesSpec;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Addons create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return resourcesSpec
         */
        public String getResourcesSpec() {
            return this.resourcesSpec;
        }

        /**
         * @return servicesSpec
         */
        public String getServicesSpec() {
            return this.servicesSpec;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String name; 
            private String resourcesSpec; 
            private String servicesSpec; 
            private String version; 

            /**
             * <p>The addon name.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>Login</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The resource configurations of the addon.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;{\&quot;EipResource\&quot;: {\&quot;AutoCreate\&quot;: true}, \&quot;EcsResources\&quot;: [{\&quot;InstanceType\&quot;: \&quot;ecs.c7.xlarge\&quot;, \&quot;ImageId\&quot;: \&quot;centos_7_6_x64_20G_alibase_20211130.vhd\&quot;, \&quot;SystemDisk\&quot;: {\&quot;Category\&quot;: \&quot;cloud_essd\&quot;, \&quot;Size\&quot;: 40, \&quot;Level\&quot;: \&quot;PL0\&quot;}, \&quot;EnableHT\&quot;: true, \&quot;InstanceChargeType\&quot;: \&quot;PostPaid\&quot;, \&quot;SpotStrategy\&quot;: \&quot;NoSpot\&quot;}]}&quot;</p>
             */
            public Builder resourcesSpec(String resourcesSpec) {
                this.resourcesSpec = resourcesSpec;
                return this;
            }

            /**
             * <p>The service configurations of the addon.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;[{\&quot;ServiceName\&quot;: \&quot;SSH\&quot;, \&quot;ServiceAccessType\&quot;: null, \&quot;ServiceAccessUrl\&quot;: null, \&quot;NetworkACL\&quot;: [{\&quot;IpProtocol\&quot;: \&quot;TCP\&quot;, \&quot;Port\&quot;: 22, \&quot;SourceCidrIp\&quot;: \&quot;0.0.0.0/0\&quot;}]}, {\&quot;ServiceName\&quot;: \&quot;VNC\&quot;, \&quot;ServiceAccessType\&quot;: null, \&quot;ServiceAccessUrl\&quot;: null, \&quot;NetworkACL\&quot;: [{\&quot;IpProtocol\&quot;: \&quot;TCP\&quot;, \&quot;Port\&quot;: 12016, \&quot;SourceCidrIp\&quot;: \&quot;0.0.0.0/0\&quot;}]}, {\&quot;ServiceName\&quot;: \&quot;CLIENT\&quot;, \&quot;ServiceAccessType\&quot;: \&quot;URL\&quot;, \&quot;ServiceAccessUrl\&quot;: \&quot;\&quot;, \&quot;NetworkACL\&quot;: [{\&quot;IpProtocol\&quot;: \&quot;TCP\&quot;, \&quot;Port\&quot;: 12011, \&quot;SourceCidrIp\&quot;: \&quot;0.0.0.0/0\&quot;}]}]&quot;</p>
             */
            public Builder servicesSpec(String servicesSpec) {
                this.servicesSpec = servicesSpec;
                return this;
            }

            /**
             * <p>The addon version.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public Addons build() {
                return new Addons(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateClusterRequest} extends {@link TeaModel}
     *
     * <p>CreateClusterRequest</p>
     */
    public static class ClusterCredentials extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("KeyPairName")
        private String keyPairName;

        @com.aliyun.core.annotation.NameInMap("Password")
        private String password;

        private ClusterCredentials(Builder builder) {
            this.keyPairName = builder.keyPairName;
            this.password = builder.password;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClusterCredentials create() {
            return builder().build();
        }

        /**
         * @return keyPairName
         */
        public String getKeyPairName() {
            return this.keyPairName;
        }

        /**
         * @return password
         */
        public String getPassword() {
            return this.password;
        }

        public static final class Builder {
            private String keyPairName; 
            private String password; 

            /**
             * <p>The name of the key pair. The name must be 2 to 128 characters in length. The name must start with a letter but cannot start with <code>http://</code> or <code>https://</code>. The name can contain digits, letters, colons (:), underscores (_), and hyphens (-).</p>
             * <blockquote>
             * <p> For more information, see <a href="https://help.aliyun.com/document_detail/51793.html">Create a key pair</a>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>ali0824</p>
             */
            public Builder keyPairName(String keyPairName) {
                this.keyPairName = keyPairName;
                return this;
            }

            /**
             * <p>The password for the root user to log on to the node. The password must be 8 to 20 characters in length, and must contain at least 3 of the following character types: uppercase letters, lowercase letters, digits, and special characters. The following special characters are supported: <code>() ~ ! @ # $ % ^ &amp; * - = + { } [ ] : ; \&quot; &lt; &gt; , . ? /</code></p>
             * <blockquote>
             * <p> We recommend that you use HTTPS to call the API operation to prevent password leakage.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <hr>
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            public ClusterCredentials build() {
                return new ClusterCredentials(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateClusterRequest} extends {@link TeaModel}
     *
     * <p>CreateClusterRequest</p>
     */
    public static class ClusterCustomConfiguration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Args")
        private String args;

        @com.aliyun.core.annotation.NameInMap("Script")
        private String script;

        private ClusterCustomConfiguration(Builder builder) {
            this.args = builder.args;
            this.script = builder.script;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClusterCustomConfiguration create() {
            return builder().build();
        }

        /**
         * @return args
         */
        public String getArgs() {
            return this.args;
        }

        /**
         * @return script
         */
        public String getScript() {
            return this.script;
        }

        public static final class Builder {
            private String args; 
            private String script; 

            /**
             * <p>The runtime parameters of the script after the cluster is created.</p>
             * 
             * <strong>example:</strong>
             * <p>E-HPC cn-hangzhou</p>
             */
            public Builder args(String args) {
                this.args = args;
                return this;
            }

            /**
             * <p>The URL that is used to download the post-processing script.</p>
             * 
             * <strong>example:</strong>
             * <p>http://*****</p>
             */
            public Builder script(String script) {
                this.script = script;
                return this;
            }

            public ClusterCustomConfiguration build() {
                return new ClusterCustomConfiguration(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateClusterRequest} extends {@link TeaModel}
     *
     * <p>CreateClusterRequest</p>
     */
    public static class DNS extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private DNS(Builder builder) {
            this.type = builder.type;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DNS create() {
            return builder().build();
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String type; 
            private String version; 

            /**
             * <p>The domain name resolution type.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>NIS: NIS.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NIS</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The version of the domain name resolution service.</p>
             * 
             * <strong>example:</strong>
             * <p>2.31</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public DNS build() {
                return new DNS(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateClusterRequest} extends {@link TeaModel}
     *
     * <p>CreateClusterRequest</p>
     */
    public static class DirectoryService extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private DirectoryService(Builder builder) {
            this.type = builder.type;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DirectoryService create() {
            return builder().build();
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String type; 
            private String version; 

            /**
             * <p>The type of the domain account.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>NIS: NIS.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NIS</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The version of the domain account service.</p>
             * 
             * <strong>example:</strong>
             * <p>2.31</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public DirectoryService build() {
                return new DirectoryService(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateClusterRequest} extends {@link TeaModel}
     *
     * <p>CreateClusterRequest</p>
     */
    public static class Scheduler extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private Scheduler(Builder builder) {
            this.type = builder.type;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Scheduler create() {
            return builder().build();
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String type; 
            private String version; 

            /**
             * <p>The scheduler type. Valid values:</p>
             * <ul>
             * <li>SLURM</li>
             * <li>PBS</li>
             * <li>OPENGRIDSCHEDULER</li>
             * <li>LSF_PLUGIN</li>
             * <li>PBS_PLUGIN</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SLURM</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The scheduler version.</p>
             * 
             * <strong>example:</strong>
             * <p>22.05.8</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public Scheduler build() {
                return new Scheduler(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateClusterRequest} extends {@link TeaModel}
     *
     * <p>CreateClusterRequest</p>
     */
    public static class Manager extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DNS")
        private DNS DNS;

        @com.aliyun.core.annotation.NameInMap("DirectoryService")
        private DirectoryService directoryService;

        @com.aliyun.core.annotation.NameInMap("ManagerNode")
        private NodeTemplate managerNode;

        @com.aliyun.core.annotation.NameInMap("Scheduler")
        private Scheduler scheduler;

        private Manager(Builder builder) {
            this.DNS = builder.DNS;
            this.directoryService = builder.directoryService;
            this.managerNode = builder.managerNode;
            this.scheduler = builder.scheduler;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Manager create() {
            return builder().build();
        }

        /**
         * @return DNS
         */
        public DNS getDNS() {
            return this.DNS;
        }

        /**
         * @return directoryService
         */
        public DirectoryService getDirectoryService() {
            return this.directoryService;
        }

        /**
         * @return managerNode
         */
        public NodeTemplate getManagerNode() {
            return this.managerNode;
        }

        /**
         * @return scheduler
         */
        public Scheduler getScheduler() {
            return this.scheduler;
        }

        public static final class Builder {
            private DNS DNS; 
            private DirectoryService directoryService; 
            private NodeTemplate managerNode; 
            private Scheduler scheduler; 

            /**
             * <p>The configurations of the domain name resolution service.</p>
             */
            public Builder DNS(DNS DNS) {
                this.DNS = DNS;
                return this;
            }

            /**
             * <p>The configurations of the directory service.</p>
             */
            public Builder directoryService(DirectoryService directoryService) {
                this.directoryService = directoryService;
                return this;
            }

            /**
             * <p>The hardware configurations of the management node.</p>
             */
            public Builder managerNode(NodeTemplate managerNode) {
                this.managerNode = managerNode;
                return this;
            }

            /**
             * <p>The configurations of the scheduler service.</p>
             */
            public Builder scheduler(Scheduler scheduler) {
                this.scheduler = scheduler;
                return this;
            }

            public Manager build() {
                return new Manager(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateClusterRequest} extends {@link TeaModel}
     *
     * <p>CreateClusterRequest</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * <p>The tag key. Valid values of N: 1 to 20. The tag key cannot be an empty string. The tag key can be up to 128 characters in length and cannot start with <code>acs:</code> or <code>aliyun</code>. The tag key cannot contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>ClusterId</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value. Valid values of N: 1 to 20. The tag value can be an empty string. The tag value can be up to 128 characters in length and cannot contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>ehpc-hz-******</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}
