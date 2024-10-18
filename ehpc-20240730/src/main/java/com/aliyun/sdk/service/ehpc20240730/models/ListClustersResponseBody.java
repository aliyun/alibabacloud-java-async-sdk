// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20240730.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The list of clusters.</p>
         */
        public Builder clusters(java.util.List < Clusters> clusters) {
            this.clusters = clusters;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(String pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListClustersResponseBody build() {
            return new ListClustersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListClustersResponseBody} extends {@link TeaModel}
     *
     * <p>ListClustersResponseBody</p>
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
             * <p>The software name.</p>
             * 
             * <strong>example:</strong>
             * <p>gromacs</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The software version.</p>
             * 
             * <strong>example:</strong>
             * <p>2024.1</p>
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
     * {@link ListClustersResponseBody} extends {@link TeaModel}
     *
     * <p>ListClustersResponseBody</p>
     */
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
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>i-bp1bg85d2q6laic8****</p>
             */
            public Builder ecsInstanceId(String ecsInstanceId) {
                this.ecsInstanceId = ecsInstanceId;
                return this;
            }

            /**
             * <p>The Elastic IP Address (EIP) ID.</p>
             * 
             * <strong>example:</strong>
             * <p>eip-bp1vi9124tbx1g3kr****</p>
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
    /**
     * 
     * {@link ListClustersResponseBody} extends {@link TeaModel}
     *
     * <p>ListClustersResponseBody</p>
     */
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
             * <p>The service access type.</p>
             * 
             * <strong>example:</strong>
             * <p>URL</p>
             */
            public Builder serviceAccessType(String serviceAccessType) {
                this.serviceAccessType = serviceAccessType;
                return this;
            }

            /**
             * <p>The service access URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://47.96.xx.xx:12008">https://47.96.xx.xx:12008</a></p>
             */
            public Builder serviceAccessUrl(String serviceAccessUrl) {
                this.serviceAccessUrl = serviceAccessUrl;
                return this;
            }

            /**
             * <p>The service name.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>Web Portal</p>
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
    /**
     * 
     * {@link ListClustersResponseBody} extends {@link TeaModel}
     *
     * <p>ListClustersResponseBody</p>
     */
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
             * <p>The addon ID.</p>
             * 
             * <strong>example:</strong>
             * <p>Login-1.0-W2g****</p>
             */
            public Builder addonId(String addonId) {
                this.addonId = addonId;
                return this;
            }

            /**
             * <p>The addon description.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The addon label.</p>
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

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
             */
            public Builder resourcesSpec(ResourcesSpec resourcesSpec) {
                this.resourcesSpec = resourcesSpec;
                return this;
            }

            /**
             * <p>The information about the addon services.</p>
             */
            public Builder servicesSpec(java.util.List < ServicesSpec> servicesSpec) {
                this.servicesSpec = servicesSpec;
                return this;
            }

            /**
             * <p>The addon state.</p>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder status(String status) {
                this.status = status;
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
     * {@link ListClustersResponseBody} extends {@link TeaModel}
     *
     * <p>ListClustersResponseBody</p>
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
             * <p>The parameters of the post-processing script.</p>
             * 
             * <strong>example:</strong>
             * <p>demo</p>
             */
            public Builder args(String args) {
                this.args = args;
                return this;
            }

            /**
             * <p>The link to the post-processing script.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://xxxxx">https://xxxxx</a></p>
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
     * {@link ListClustersResponseBody} extends {@link TeaModel}
     *
     * <p>ListClustersResponseBody</p>
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
             * <p>The resolution type.</p>
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
     * {@link ListClustersResponseBody} extends {@link TeaModel}
     *
     * <p>ListClustersResponseBody</p>
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
     * {@link ListClustersResponseBody} extends {@link TeaModel}
     *
     * <p>ListClustersResponseBody</p>
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
             * <p>The scheduler type.</p>
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
     * {@link ListClustersResponseBody} extends {@link TeaModel}
     *
     * <p>ListClustersResponseBody</p>
     */
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
     * {@link ListClustersResponseBody} extends {@link TeaModel}
     *
     * <p>ListClustersResponseBody</p>
     */
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
             * <p>The number of malfunctioning compute nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder abnormalCounts(Integer abnormalCounts) {
                this.abnormalCounts = abnormalCounts;
                return this;
            }

            /**
             * <p>The number of compute nodes that are being created.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder creatingCounts(Integer creatingCounts) {
                this.creatingCounts = creatingCounts;
                return this;
            }

            /**
             * <p>The number of running compute nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
    /**
     * 
     * {@link ListClustersResponseBody} extends {@link TeaModel}
     *
     * <p>ListClustersResponseBody</p>
     */
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
             * <p>The number of ordinary users.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder normalCounts(Integer normalCounts) {
                this.normalCounts = normalCounts;
                return this;
            }

            /**
             * <p>The number of administrators.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
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
    /**
     * 
     * {@link ListClustersResponseBody} extends {@link TeaModel}
     *
     * <p>ListClustersResponseBody</p>
     */
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
             * <p>The information about installed software in the cluster.</p>
             */
            public Builder additionalPackages(java.util.List < AdditionalPackages> additionalPackages) {
                this.additionalPackages = additionalPackages;
                return this;
            }

            /**
             * <p>The information about the addons in the cluster.</p>
             */
            public Builder addons(java.util.List < Addons> addons) {
                this.addons = addons;
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
                this.clusterCategory = clusterCategory;
                return this;
            }

            /**
             * <p>The time when the cluster was created. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mmZ format. The time is displayed in UTC. For more information, see <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-08-06T12:43:01.000Z</p>
             */
            public Builder clusterCreateTime(String clusterCreateTime) {
                this.clusterCreateTime = clusterCreateTime;
                return this;
            }

            /**
             * <p>The logon credential type of the cluster. Valid values:</p>
             * <ul>
             * <li>password: requires passwords for logons.</li>
             * <li>keypair: requires key pairs for logons.</li>
             * </ul>
             */
            public Builder clusterCredentials(java.util.List < String > clusterCredentials) {
                this.clusterCredentials = clusterCredentials;
                return this;
            }

            /**
             * <p>The post-processing script used by the cluster.</p>
             */
            public Builder clusterCustomConfiguration(ClusterCustomConfiguration clusterCustomConfiguration) {
                this.clusterCustomConfiguration = clusterCustomConfiguration;
                return this;
            }

            /**
             * <p>The cluster description.</p>
             * 
             * <strong>example:</strong>
             * <p>Demo</p>
             */
            public Builder clusterDescription(String clusterDescription) {
                this.clusterDescription = clusterDescription;
                return this;
            }

            /**
             * <p>The cluster ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ehpc-hz-VMKe******</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>The deployment type of the cluster. Valid values:</p>
             * <ul>
             * <li>Integrated: public cloud</li>
             * <li>Hybrid: hybrid cloud</li>
             * <li>Custom: a custom cluster</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Integrated</p>
             */
            public Builder clusterMode(String clusterMode) {
                this.clusterMode = clusterMode;
                return this;
            }

            /**
             * <p>The time when the cluster was modified. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mmZ format. The time is displayed in UTC. For more information, see <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-08-06T12:43:01.000Z</p>
             */
            public Builder clusterModifyTime(String clusterModifyTime) {
                this.clusterModifyTime = clusterModifyTime;
                return this;
            }

            /**
             * <p>The cluster name.</p>
             * 
             * <strong>example:</strong>
             * <p>slurm22.05.8-cluster-20240227</p>
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * <p>The cluster state. Valid values:</p>
             * <ul>
             * <li>uninit: The cluster is being installed.</li>
             * <li>creating: The cluster is being created.</li>
             * <li>initing: The cluster is being initialized.</li>
             * <li>running: The cluster is running.</li>
             * <li>Releasing: The cluster is being released.</li>
             * <li>stopping: The cluster is being stopped.</li>
             * <li>stopped: The cluster is stopped.</li>
             * <li>exception: The cluster has run into an exception.</li>
             * <li>pending: The cluster is waiting to be configured.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>running</p>
             */
            public Builder clusterStatus(String clusterStatus) {
                this.clusterStatus = clusterStatus;
                return this;
            }

            /**
             * <p>The vCPU-hour usage of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder clusterUsedCoreTime(Float clusterUsedCoreTime) {
                this.clusterUsedCoreTime = clusterUsedCoreTime;
                return this;
            }

            /**
             * <p>The ID of the vSwitch used by the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-f8za5p0mwzgdu3wgx****</p>
             */
            public Builder clusterVSwitchId(String clusterVSwitchId) {
                this.clusterVSwitchId = clusterVSwitchId;
                return this;
            }

            /**
             * <p>The ID of the virtual private cloud (VPC) used by the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-m5efjevmclc0xdmys****</p>
             */
            public Builder clusterVpcId(String clusterVpcId) {
                this.clusterVpcId = clusterVpcId;
                return this;
            }

            /**
             * <p>Indicates whether deletion protection is enabled for the cluster. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
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
             * <p>The Elastic High Performance Computing (E-HPC) version.</p>
             * 
             * <strong>example:</strong>
             * <p>2.0.0</p>
             */
            public Builder ehpcVersion(String ehpcVersion) {
                this.ehpcVersion = ehpcVersion;
                return this;
            }

            /**
             * <p>The configurations of the cluster management node.</p>
             */
            public Builder manager(Manager manager) {
                this.manager = manager;
                return this;
            }

            /**
             * <p>The maximum total number of vCPUs used by the compute nodes that can be managed by the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>10000</p>
             */
            public Builder maxCoreCount(Long maxCoreCount) {
                this.maxCoreCount = maxCoreCount;
                return this;
            }

            /**
             * <p>The maximum number of compute nodes that can be managed by the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>500</p>
             */
            public Builder maxCount(Long maxCount) {
                this.maxCount = maxCount;
                return this;
            }

            /**
             * <p>The node statistics of the cluster.</p>
             */
            public Builder nodes(Nodes nodes) {
                this.nodes = nodes;
                return this;
            }

            /**
             * <p>The resource group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-acfmxazb4ph****</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The ID of the security group used by the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>sg-bp13n61xsydodfyg****</p>
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * <p>The user attribute information of the cluster.</p>
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
