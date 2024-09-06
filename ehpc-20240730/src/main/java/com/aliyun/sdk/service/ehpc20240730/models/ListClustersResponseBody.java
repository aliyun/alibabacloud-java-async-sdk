// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20240730.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListClustersResponseBody} extends {@link TeaModel}
 *
 * <p>ListClustersResponseBody</p>
 */
public class ListClustersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Clusters")
    private java.util.List < Clusters> clusters;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private String pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListClustersResponseBody(Builder builder) {
        this.clusters = builder.clusters;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListClustersResponseBody create() {
        return builder().build();
    }

    /**
     * @return clusters
     */
    public java.util.List < Clusters> getClusters() {
        return this.clusters;
    }

    /**
     * @return pageNumber
     */
    public String getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < Clusters> clusters; 
        private String pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * Clusters.
         */
        public Builder clusters(java.util.List < Clusters> clusters) {
            this.clusters = clusters;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(String pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListClustersResponseBody build() {
            return new ListClustersResponseBody(this);
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
    public static class ResourcesSpec extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EcsInstanceId")
        private String ecsInstanceId;

        @com.aliyun.core.annotation.NameInMap("EipInstanceId")
        private String eipInstanceId;

        private ResourcesSpec(Builder builder) {
            this.ecsInstanceId = builder.ecsInstanceId;
            this.eipInstanceId = builder.eipInstanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourcesSpec create() {
            return builder().build();
        }

        /**
         * @return ecsInstanceId
         */
        public String getEcsInstanceId() {
            return this.ecsInstanceId;
        }

        /**
         * @return eipInstanceId
         */
        public String getEipInstanceId() {
            return this.eipInstanceId;
        }

        public static final class Builder {
            private String ecsInstanceId; 
            private String eipInstanceId; 

            /**
             * EcsInstanceId.
             */
            public Builder ecsInstanceId(String ecsInstanceId) {
                this.ecsInstanceId = ecsInstanceId;
                return this;
            }

            /**
             * EipInstanceId.
             */
            public Builder eipInstanceId(String eipInstanceId) {
                this.eipInstanceId = eipInstanceId;
                return this;
            }

            public ResourcesSpec build() {
                return new ResourcesSpec(this);
            } 

        } 

    }
    public static class ServicesSpec extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ServiceAccessType")
        private String serviceAccessType;

        @com.aliyun.core.annotation.NameInMap("ServiceAccessUrl")
        private String serviceAccessUrl;

        @com.aliyun.core.annotation.NameInMap("ServiceName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String serviceName;

        private ServicesSpec(Builder builder) {
            this.serviceAccessType = builder.serviceAccessType;
            this.serviceAccessUrl = builder.serviceAccessUrl;
            this.serviceName = builder.serviceName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServicesSpec create() {
            return builder().build();
        }

        /**
         * @return serviceAccessType
         */
        public String getServiceAccessType() {
            return this.serviceAccessType;
        }

        /**
         * @return serviceAccessUrl
         */
        public String getServiceAccessUrl() {
            return this.serviceAccessUrl;
        }

        /**
         * @return serviceName
         */
        public String getServiceName() {
            return this.serviceName;
        }

        public static final class Builder {
            private String serviceAccessType; 
            private String serviceAccessUrl; 
            private String serviceName; 

            /**
             * ServiceAccessType.
             */
            public Builder serviceAccessType(String serviceAccessType) {
                this.serviceAccessType = serviceAccessType;
                return this;
            }

            /**
             * ServiceAccessUrl.
             */
            public Builder serviceAccessUrl(String serviceAccessUrl) {
                this.serviceAccessUrl = serviceAccessUrl;
                return this;
            }

            /**
             * ServiceName.
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            public ServicesSpec build() {
                return new ServicesSpec(this);
            } 

        } 

    }
    public static class Addons extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AddonId")
        private String addonId;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("Name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        @com.aliyun.core.annotation.NameInMap("ResourcesSpec")
        private ResourcesSpec resourcesSpec;

        @com.aliyun.core.annotation.NameInMap("ServicesSpec")
        private java.util.List < ServicesSpec> servicesSpec;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Version")
        @com.aliyun.core.annotation.Validation(required = true)
        private String version;

        private Addons(Builder builder) {
            this.addonId = builder.addonId;
            this.description = builder.description;
            this.label = builder.label;
            this.name = builder.name;
            this.resourcesSpec = builder.resourcesSpec;
            this.servicesSpec = builder.servicesSpec;
            this.status = builder.status;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Addons create() {
            return builder().build();
        }

        /**
         * @return addonId
         */
        public String getAddonId() {
            return this.addonId;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
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
        public ResourcesSpec getResourcesSpec() {
            return this.resourcesSpec;
        }

        /**
         * @return servicesSpec
         */
        public java.util.List < ServicesSpec> getServicesSpec() {
            return this.servicesSpec;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String addonId; 
            private String description; 
            private String label; 
            private String name; 
            private ResourcesSpec resourcesSpec; 
            private java.util.List < ServicesSpec> servicesSpec; 
            private String status; 
            private String version; 

            /**
             * AddonId.
             */
            public Builder addonId(String addonId) {
                this.addonId = addonId;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Label.
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

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
            public Builder resourcesSpec(ResourcesSpec resourcesSpec) {
                this.resourcesSpec = resourcesSpec;
                return this;
            }

            /**
             * ServicesSpec.
             */
            public Builder servicesSpec(java.util.List < ServicesSpec> servicesSpec) {
                this.servicesSpec = servicesSpec;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
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

        @com.aliyun.core.annotation.NameInMap("Scheduler")
        private Scheduler scheduler;

        private Manager(Builder builder) {
            this.DNS = builder.DNS;
            this.directoryService = builder.directoryService;
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
         * @return scheduler
         */
        public Scheduler getScheduler() {
            return this.scheduler;
        }

        public static final class Builder {
            private DNS DNS; 
            private DirectoryService directoryService; 
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
    public static class Nodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AbnormalCounts")
        private Integer abnormalCounts;

        @com.aliyun.core.annotation.NameInMap("CreatingCounts")
        private Integer creatingCounts;

        @com.aliyun.core.annotation.NameInMap("RunningCounts")
        private Integer runningCounts;

        private Nodes(Builder builder) {
            this.abnormalCounts = builder.abnormalCounts;
            this.creatingCounts = builder.creatingCounts;
            this.runningCounts = builder.runningCounts;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Nodes create() {
            return builder().build();
        }

        /**
         * @return abnormalCounts
         */
        public Integer getAbnormalCounts() {
            return this.abnormalCounts;
        }

        /**
         * @return creatingCounts
         */
        public Integer getCreatingCounts() {
            return this.creatingCounts;
        }

        /**
         * @return runningCounts
         */
        public Integer getRunningCounts() {
            return this.runningCounts;
        }

        public static final class Builder {
            private Integer abnormalCounts; 
            private Integer creatingCounts; 
            private Integer runningCounts; 

            /**
             * AbnormalCounts.
             */
            public Builder abnormalCounts(Integer abnormalCounts) {
                this.abnormalCounts = abnormalCounts;
                return this;
            }

            /**
             * CreatingCounts.
             */
            public Builder creatingCounts(Integer creatingCounts) {
                this.creatingCounts = creatingCounts;
                return this;
            }

            /**
             * RunningCounts.
             */
            public Builder runningCounts(Integer runningCounts) {
                this.runningCounts = runningCounts;
                return this;
            }

            public Nodes build() {
                return new Nodes(this);
            } 

        } 

    }
    public static class Users extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NormalCounts")
        private Integer normalCounts;

        @com.aliyun.core.annotation.NameInMap("SudoCounts")
        private Integer sudoCounts;

        private Users(Builder builder) {
            this.normalCounts = builder.normalCounts;
            this.sudoCounts = builder.sudoCounts;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Users create() {
            return builder().build();
        }

        /**
         * @return normalCounts
         */
        public Integer getNormalCounts() {
            return this.normalCounts;
        }

        /**
         * @return sudoCounts
         */
        public Integer getSudoCounts() {
            return this.sudoCounts;
        }

        public static final class Builder {
            private Integer normalCounts; 
            private Integer sudoCounts; 

            /**
             * NormalCounts.
             */
            public Builder normalCounts(Integer normalCounts) {
                this.normalCounts = normalCounts;
                return this;
            }

            /**
             * SudoCounts.
             */
            public Builder sudoCounts(Integer sudoCounts) {
                this.sudoCounts = sudoCounts;
                return this;
            }

            public Users build() {
                return new Users(this);
            } 

        } 

    }
    public static class Clusters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdditionalPackages")
        private java.util.List < AdditionalPackages> additionalPackages;

        @com.aliyun.core.annotation.NameInMap("Addons")
        private java.util.List < Addons> addons;

        @com.aliyun.core.annotation.NameInMap("ClusterCategory")
        private String clusterCategory;

        @com.aliyun.core.annotation.NameInMap("ClusterCreateTime")
        private String clusterCreateTime;

        @com.aliyun.core.annotation.NameInMap("ClusterCredentials")
        private java.util.List < String > clusterCredentials;

        @com.aliyun.core.annotation.NameInMap("ClusterCustomConfiguration")
        private ClusterCustomConfiguration clusterCustomConfiguration;

        @com.aliyun.core.annotation.NameInMap("ClusterDescription")
        private String clusterDescription;

        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("ClusterMode")
        private String clusterMode;

        @com.aliyun.core.annotation.NameInMap("ClusterModifyTime")
        private String clusterModifyTime;

        @com.aliyun.core.annotation.NameInMap("ClusterName")
        private String clusterName;

        @com.aliyun.core.annotation.NameInMap("ClusterStatus")
        private String clusterStatus;

        @com.aliyun.core.annotation.NameInMap("ClusterUsedCoreTime")
        private Float clusterUsedCoreTime;

        @com.aliyun.core.annotation.NameInMap("ClusterVSwitchId")
        private String clusterVSwitchId;

        @com.aliyun.core.annotation.NameInMap("ClusterVpcId")
        private String clusterVpcId;

        @com.aliyun.core.annotation.NameInMap("DeletionProtection")
        private Boolean deletionProtection;

        @com.aliyun.core.annotation.NameInMap("EhpcVersion")
        private String ehpcVersion;

        @com.aliyun.core.annotation.NameInMap("Manager")
        private Manager manager;

        @com.aliyun.core.annotation.NameInMap("MaxCoreCount")
        private Long maxCoreCount;

        @com.aliyun.core.annotation.NameInMap("MaxCount")
        private Long maxCount;

        @com.aliyun.core.annotation.NameInMap("Nodes")
        private Nodes nodes;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
        private String securityGroupId;

        @com.aliyun.core.annotation.NameInMap("Users")
        private Users users;

        private Clusters(Builder builder) {
            this.additionalPackages = builder.additionalPackages;
            this.addons = builder.addons;
            this.clusterCategory = builder.clusterCategory;
            this.clusterCreateTime = builder.clusterCreateTime;
            this.clusterCredentials = builder.clusterCredentials;
            this.clusterCustomConfiguration = builder.clusterCustomConfiguration;
            this.clusterDescription = builder.clusterDescription;
            this.clusterId = builder.clusterId;
            this.clusterMode = builder.clusterMode;
            this.clusterModifyTime = builder.clusterModifyTime;
            this.clusterName = builder.clusterName;
            this.clusterStatus = builder.clusterStatus;
            this.clusterUsedCoreTime = builder.clusterUsedCoreTime;
            this.clusterVSwitchId = builder.clusterVSwitchId;
            this.clusterVpcId = builder.clusterVpcId;
            this.deletionProtection = builder.deletionProtection;
            this.ehpcVersion = builder.ehpcVersion;
            this.manager = builder.manager;
            this.maxCoreCount = builder.maxCoreCount;
            this.maxCount = builder.maxCount;
            this.nodes = builder.nodes;
            this.resourceGroupId = builder.resourceGroupId;
            this.securityGroupId = builder.securityGroupId;
            this.users = builder.users;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Clusters create() {
            return builder().build();
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
         * @return clusterCategory
         */
        public String getClusterCategory() {
            return this.clusterCategory;
        }

        /**
         * @return clusterCreateTime
         */
        public String getClusterCreateTime() {
            return this.clusterCreateTime;
        }

        /**
         * @return clusterCredentials
         */
        public java.util.List < String > getClusterCredentials() {
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
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return clusterMode
         */
        public String getClusterMode() {
            return this.clusterMode;
        }

        /**
         * @return clusterModifyTime
         */
        public String getClusterModifyTime() {
            return this.clusterModifyTime;
        }

        /**
         * @return clusterName
         */
        public String getClusterName() {
            return this.clusterName;
        }

        /**
         * @return clusterStatus
         */
        public String getClusterStatus() {
            return this.clusterStatus;
        }

        /**
         * @return clusterUsedCoreTime
         */
        public Float getClusterUsedCoreTime() {
            return this.clusterUsedCoreTime;
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
         * @return ehpcVersion
         */
        public String getEhpcVersion() {
            return this.ehpcVersion;
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
        public Long getMaxCoreCount() {
            return this.maxCoreCount;
        }

        /**
         * @return maxCount
         */
        public Long getMaxCount() {
            return this.maxCount;
        }

        /**
         * @return nodes
         */
        public Nodes getNodes() {
            return this.nodes;
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
         * @return users
         */
        public Users getUsers() {
            return this.users;
        }

        public static final class Builder {
            private java.util.List < AdditionalPackages> additionalPackages; 
            private java.util.List < Addons> addons; 
            private String clusterCategory; 
            private String clusterCreateTime; 
            private java.util.List < String > clusterCredentials; 
            private ClusterCustomConfiguration clusterCustomConfiguration; 
            private String clusterDescription; 
            private String clusterId; 
            private String clusterMode; 
            private String clusterModifyTime; 
            private String clusterName; 
            private String clusterStatus; 
            private Float clusterUsedCoreTime; 
            private String clusterVSwitchId; 
            private String clusterVpcId; 
            private Boolean deletionProtection; 
            private String ehpcVersion; 
            private Manager manager; 
            private Long maxCoreCount; 
            private Long maxCount; 
            private Nodes nodes; 
            private String resourceGroupId; 
            private String securityGroupId; 
            private Users users; 

            /**
             * AdditionalPackages.
             */
            public Builder additionalPackages(java.util.List < AdditionalPackages> additionalPackages) {
                this.additionalPackages = additionalPackages;
                return this;
            }

            /**
             * Addons.
             */
            public Builder addons(java.util.List < Addons> addons) {
                this.addons = addons;
                return this;
            }

            /**
             * ClusterCategory.
             */
            public Builder clusterCategory(String clusterCategory) {
                this.clusterCategory = clusterCategory;
                return this;
            }

            /**
             * ClusterCreateTime.
             */
            public Builder clusterCreateTime(String clusterCreateTime) {
                this.clusterCreateTime = clusterCreateTime;
                return this;
            }

            /**
             * ClusterCredentials.
             */
            public Builder clusterCredentials(java.util.List < String > clusterCredentials) {
                this.clusterCredentials = clusterCredentials;
                return this;
            }

            /**
             * ClusterCustomConfiguration.
             */
            public Builder clusterCustomConfiguration(ClusterCustomConfiguration clusterCustomConfiguration) {
                this.clusterCustomConfiguration = clusterCustomConfiguration;
                return this;
            }

            /**
             * ClusterDescription.
             */
            public Builder clusterDescription(String clusterDescription) {
                this.clusterDescription = clusterDescription;
                return this;
            }

            /**
             * ClusterId.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * ClusterMode.
             */
            public Builder clusterMode(String clusterMode) {
                this.clusterMode = clusterMode;
                return this;
            }

            /**
             * ClusterModifyTime.
             */
            public Builder clusterModifyTime(String clusterModifyTime) {
                this.clusterModifyTime = clusterModifyTime;
                return this;
            }

            /**
             * ClusterName.
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * ClusterStatus.
             */
            public Builder clusterStatus(String clusterStatus) {
                this.clusterStatus = clusterStatus;
                return this;
            }

            /**
             * ClusterUsedCoreTime.
             */
            public Builder clusterUsedCoreTime(Float clusterUsedCoreTime) {
                this.clusterUsedCoreTime = clusterUsedCoreTime;
                return this;
            }

            /**
             * ClusterVSwitchId.
             */
            public Builder clusterVSwitchId(String clusterVSwitchId) {
                this.clusterVSwitchId = clusterVSwitchId;
                return this;
            }

            /**
             * ClusterVpcId.
             */
            public Builder clusterVpcId(String clusterVpcId) {
                this.clusterVpcId = clusterVpcId;
                return this;
            }

            /**
             * DeletionProtection.
             */
            public Builder deletionProtection(Boolean deletionProtection) {
                this.deletionProtection = deletionProtection;
                return this;
            }

            /**
             * EhpcVersion.
             */
            public Builder ehpcVersion(String ehpcVersion) {
                this.ehpcVersion = ehpcVersion;
                return this;
            }

            /**
             * Manager.
             */
            public Builder manager(Manager manager) {
                this.manager = manager;
                return this;
            }

            /**
             * MaxCoreCount.
             */
            public Builder maxCoreCount(Long maxCoreCount) {
                this.maxCoreCount = maxCoreCount;
                return this;
            }

            /**
             * MaxCount.
             */
            public Builder maxCount(Long maxCount) {
                this.maxCount = maxCount;
                return this;
            }

            /**
             * Nodes.
             */
            public Builder nodes(Nodes nodes) {
                this.nodes = nodes;
                return this;
            }

            /**
             * ResourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * SecurityGroupId.
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * Users.
             */
            public Builder users(Users users) {
                this.users = users;
                return this;
            }

            public Clusters build() {
                return new Clusters(this);
            } 

        } 

    }
}
