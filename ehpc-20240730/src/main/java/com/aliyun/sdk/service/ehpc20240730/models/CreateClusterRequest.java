// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20240730.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateClusterRequest} extends {@link RequestModel}
 *
 * <p>CreateClusterRequest</p>
 */
public class CreateClusterRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AdditionalPackages")
    private java.util.List < AdditionalPackages> additionalPackages;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Addons")
    private java.util.List < Addons> addons;

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
    private java.util.List < QueueTemplate > queues;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
    private String securityGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SharedStorages")
    private java.util.List < SharedStorageTemplate > sharedStorages;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List < Tags> tags;

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
    public java.util.List < AdditionalPackages> getAdditionalPackages() {
        return this.additionalPackages;
    }

    /**
     * @return addons
     */
    public java.util.List < Addons> getAddons() {
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
    public java.util.List < QueueTemplate > getQueues() {
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
    public java.util.List < SharedStorageTemplate > getSharedStorages() {
        return this.sharedStorages;
    }

    /**
     * @return tags
     */
    public java.util.List < Tags> getTags() {
        return this.tags;
    }

    public static final class Builder extends Request.Builder<CreateClusterRequest, Builder> {
        private java.util.List < AdditionalPackages> additionalPackages; 
        private java.util.List < Addons> addons; 
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
        private java.util.List < QueueTemplate > queues; 
        private String resourceGroupId; 
        private String securityGroupId; 
        private java.util.List < SharedStorageTemplate > sharedStorages; 
        private java.util.List < Tags> tags; 

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
         * AdditionalPackages.
         */
        public Builder additionalPackages(java.util.List < AdditionalPackages> additionalPackages) {
            String additionalPackagesShrink = shrink(additionalPackages, "AdditionalPackages", "json");
            this.putQueryParameter("AdditionalPackages", additionalPackagesShrink);
            this.additionalPackages = additionalPackages;
            return this;
        }

        /**
         * Addons.
         */
        public Builder addons(java.util.List < Addons> addons) {
            String addonsShrink = shrink(addons, "Addons", "json");
            this.putQueryParameter("Addons", addonsShrink);
            this.addons = addons;
            return this;
        }

        /**
         * ClientVersion.
         */
        public Builder clientVersion(String clientVersion) {
            this.putQueryParameter("ClientVersion", clientVersion);
            this.clientVersion = clientVersion;
            return this;
        }

        /**
         * ClusterCategory.
         */
        public Builder clusterCategory(String clusterCategory) {
            this.putQueryParameter("ClusterCategory", clusterCategory);
            this.clusterCategory = clusterCategory;
            return this;
        }

        /**
         * ClusterCredentials.
         */
        public Builder clusterCredentials(ClusterCredentials clusterCredentials) {
            String clusterCredentialsShrink = shrink(clusterCredentials, "ClusterCredentials", "json");
            this.putQueryParameter("ClusterCredentials", clusterCredentialsShrink);
            this.clusterCredentials = clusterCredentials;
            return this;
        }

        /**
         * ClusterCustomConfiguration.
         */
        public Builder clusterCustomConfiguration(ClusterCustomConfiguration clusterCustomConfiguration) {
            String clusterCustomConfigurationShrink = shrink(clusterCustomConfiguration, "ClusterCustomConfiguration", "json");
            this.putQueryParameter("ClusterCustomConfiguration", clusterCustomConfigurationShrink);
            this.clusterCustomConfiguration = clusterCustomConfiguration;
            return this;
        }

        /**
         * ClusterDescription.
         */
        public Builder clusterDescription(String clusterDescription) {
            this.putQueryParameter("ClusterDescription", clusterDescription);
            this.clusterDescription = clusterDescription;
            return this;
        }

        /**
         * ClusterMode.
         */
        public Builder clusterMode(String clusterMode) {
            this.putQueryParameter("ClusterMode", clusterMode);
            this.clusterMode = clusterMode;
            return this;
        }

        /**
         * ClusterName.
         */
        public Builder clusterName(String clusterName) {
            this.putQueryParameter("ClusterName", clusterName);
            this.clusterName = clusterName;
            return this;
        }

        /**
         * ClusterVSwitchId.
         */
        public Builder clusterVSwitchId(String clusterVSwitchId) {
            this.putQueryParameter("ClusterVSwitchId", clusterVSwitchId);
            this.clusterVSwitchId = clusterVSwitchId;
            return this;
        }

        /**
         * ClusterVpcId.
         */
        public Builder clusterVpcId(String clusterVpcId) {
            this.putQueryParameter("ClusterVpcId", clusterVpcId);
            this.clusterVpcId = clusterVpcId;
            return this;
        }

        /**
         * DeletionProtection.
         */
        public Builder deletionProtection(Boolean deletionProtection) {
            this.putQueryParameter("DeletionProtection", deletionProtection);
            this.deletionProtection = deletionProtection;
            return this;
        }

        /**
         * IsEnterpriseSecurityGroup.
         */
        public Builder isEnterpriseSecurityGroup(Boolean isEnterpriseSecurityGroup) {
            this.putQueryParameter("IsEnterpriseSecurityGroup", isEnterpriseSecurityGroup);
            this.isEnterpriseSecurityGroup = isEnterpriseSecurityGroup;
            return this;
        }

        /**
         * Manager.
         */
        public Builder manager(Manager manager) {
            String managerShrink = shrink(manager, "Manager", "json");
            this.putQueryParameter("Manager", managerShrink);
            this.manager = manager;
            return this;
        }

        /**
         * MaxCoreCount.
         */
        public Builder maxCoreCount(Integer maxCoreCount) {
            this.putQueryParameter("MaxCoreCount", maxCoreCount);
            this.maxCoreCount = maxCoreCount;
            return this;
        }

        /**
         * MaxCount.
         */
        public Builder maxCount(Integer maxCount) {
            this.putQueryParameter("MaxCount", maxCount);
            this.maxCount = maxCount;
            return this;
        }

        /**
         * Queues.
         */
        public Builder queues(java.util.List < QueueTemplate > queues) {
            String queuesShrink = shrink(queues, "Queues", "json");
            this.putQueryParameter("Queues", queuesShrink);
            this.queues = queues;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * SecurityGroupId.
         */
        public Builder securityGroupId(String securityGroupId) {
            this.putQueryParameter("SecurityGroupId", securityGroupId);
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * SharedStorages.
         */
        public Builder sharedStorages(java.util.List < SharedStorageTemplate > sharedStorages) {
            String sharedStoragesShrink = shrink(sharedStorages, "SharedStorages", "json");
            this.putQueryParameter("SharedStorages", sharedStoragesShrink);
            this.sharedStorages = sharedStorages;
            return this;
        }

        /**
         * Tags.
         */
        public Builder tags(java.util.List < Tags> tags) {
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
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Version.
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
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * ResourcesSpec.
             */
            public Builder resourcesSpec(String resourcesSpec) {
                this.resourcesSpec = resourcesSpec;
                return this;
            }

            /**
             * ServicesSpec.
             */
            public Builder servicesSpec(String servicesSpec) {
                this.servicesSpec = servicesSpec;
                return this;
            }

            /**
             * Version.
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
             * KeyPairName.
             */
            public Builder keyPairName(String keyPairName) {
                this.keyPairName = keyPairName;
                return this;
            }

            /**
             * Password.
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
             * Args.
             */
            public Builder args(String args) {
                this.args = args;
                return this;
            }

            /**
             * Script.
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
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Version.
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
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Version.
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
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Version.
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
             * DNS.
             */
            public Builder DNS(DNS DNS) {
                this.DNS = DNS;
                return this;
            }

            /**
             * DirectoryService.
             */
            public Builder directoryService(DirectoryService directoryService) {
                this.directoryService = directoryService;
                return this;
            }

            /**
             * ManagerNode.
             */
            public Builder managerNode(NodeTemplate managerNode) {
                this.managerNode = managerNode;
                return this;
            }

            /**
             * Scheduler.
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
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
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
