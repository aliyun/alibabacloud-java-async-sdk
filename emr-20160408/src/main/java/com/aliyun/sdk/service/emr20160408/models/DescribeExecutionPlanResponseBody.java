// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeExecutionPlanResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeExecutionPlanResponseBody</p>
 */
public class DescribeExecutionPlanResponseBody extends TeaModel {
    @NameInMap("ClusterId")
    private String clusterId;

    @NameInMap("ClusterInfo")
    private ClusterInfo clusterInfo;

    @NameInMap("ClusterName")
    private String clusterName;

    @NameInMap("CreateClusterOnDemand")
    private Boolean createClusterOnDemand;

    @NameInMap("DayOfMonth")
    private String dayOfMonth;

    @NameInMap("DayOfWeek")
    private String dayOfWeek;

    @NameInMap("ExecutionPlanVersion")
    private Long executionPlanVersion;

    @NameInMap("Id")
    private String id;

    @NameInMap("JobInfoList")
    private JobInfoList jobInfoList;

    @NameInMap("Name")
    private String name;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StartTime")
    private Long startTime;

    @NameInMap("Status")
    private String status;

    @NameInMap("Strategy")
    private String strategy;

    @NameInMap("TimeInterval")
    private Integer timeInterval;

    @NameInMap("TimeUnit")
    private String timeUnit;

    @NameInMap("WorkflowApp")
    private String workflowApp;

    private DescribeExecutionPlanResponseBody(Builder builder) {
        this.clusterId = builder.clusterId;
        this.clusterInfo = builder.clusterInfo;
        this.clusterName = builder.clusterName;
        this.createClusterOnDemand = builder.createClusterOnDemand;
        this.dayOfMonth = builder.dayOfMonth;
        this.dayOfWeek = builder.dayOfWeek;
        this.executionPlanVersion = builder.executionPlanVersion;
        this.id = builder.id;
        this.jobInfoList = builder.jobInfoList;
        this.name = builder.name;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
        this.status = builder.status;
        this.strategy = builder.strategy;
        this.timeInterval = builder.timeInterval;
        this.timeUnit = builder.timeUnit;
        this.workflowApp = builder.workflowApp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeExecutionPlanResponseBody create() {
        return builder().build();
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return clusterInfo
     */
    public ClusterInfo getClusterInfo() {
        return this.clusterInfo;
    }

    /**
     * @return clusterName
     */
    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * @return createClusterOnDemand
     */
    public Boolean getCreateClusterOnDemand() {
        return this.createClusterOnDemand;
    }

    /**
     * @return dayOfMonth
     */
    public String getDayOfMonth() {
        return this.dayOfMonth;
    }

    /**
     * @return dayOfWeek
     */
    public String getDayOfWeek() {
        return this.dayOfWeek;
    }

    /**
     * @return executionPlanVersion
     */
    public Long getExecutionPlanVersion() {
        return this.executionPlanVersion;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return jobInfoList
     */
    public JobInfoList getJobInfoList() {
        return this.jobInfoList;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return strategy
     */
    public String getStrategy() {
        return this.strategy;
    }

    /**
     * @return timeInterval
     */
    public Integer getTimeInterval() {
        return this.timeInterval;
    }

    /**
     * @return timeUnit
     */
    public String getTimeUnit() {
        return this.timeUnit;
    }

    /**
     * @return workflowApp
     */
    public String getWorkflowApp() {
        return this.workflowApp;
    }

    public static final class Builder {
        private String clusterId; 
        private ClusterInfo clusterInfo; 
        private String clusterName; 
        private Boolean createClusterOnDemand; 
        private String dayOfMonth; 
        private String dayOfWeek; 
        private Long executionPlanVersion; 
        private String id; 
        private JobInfoList jobInfoList; 
        private String name; 
        private String requestId; 
        private Long startTime; 
        private String status; 
        private String strategy; 
        private Integer timeInterval; 
        private String timeUnit; 
        private String workflowApp; 

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        /**
         * ClusterInfo.
         */
        public Builder clusterInfo(ClusterInfo clusterInfo) {
            this.clusterInfo = clusterInfo;
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
         * CreateClusterOnDemand.
         */
        public Builder createClusterOnDemand(Boolean createClusterOnDemand) {
            this.createClusterOnDemand = createClusterOnDemand;
            return this;
        }

        /**
         * DayOfMonth.
         */
        public Builder dayOfMonth(String dayOfMonth) {
            this.dayOfMonth = dayOfMonth;
            return this;
        }

        /**
         * DayOfWeek.
         */
        public Builder dayOfWeek(String dayOfWeek) {
            this.dayOfWeek = dayOfWeek;
            return this;
        }

        /**
         * ExecutionPlanVersion.
         */
        public Builder executionPlanVersion(Long executionPlanVersion) {
            this.executionPlanVersion = executionPlanVersion;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * JobInfoList.
         */
        public Builder jobInfoList(JobInfoList jobInfoList) {
            this.jobInfoList = jobInfoList;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(Long startTime) {
            this.startTime = startTime;
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
         * Strategy.
         */
        public Builder strategy(String strategy) {
            this.strategy = strategy;
            return this;
        }

        /**
         * TimeInterval.
         */
        public Builder timeInterval(Integer timeInterval) {
            this.timeInterval = timeInterval;
            return this;
        }

        /**
         * TimeUnit.
         */
        public Builder timeUnit(String timeUnit) {
            this.timeUnit = timeUnit;
            return this;
        }

        /**
         * WorkflowApp.
         */
        public Builder workflowApp(String workflowApp) {
            this.workflowApp = workflowApp;
            return this;
        }

        public DescribeExecutionPlanResponseBody build() {
            return new DescribeExecutionPlanResponseBody(this);
        } 

    } 

    public static class BootstrapAction extends TeaModel {
        @NameInMap("Arg")
        private String arg;

        @NameInMap("Name")
        private String name;

        @NameInMap("Path")
        private String path;

        private BootstrapAction(Builder builder) {
            this.arg = builder.arg;
            this.name = builder.name;
            this.path = builder.path;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BootstrapAction create() {
            return builder().build();
        }

        /**
         * @return arg
         */
        public String getArg() {
            return this.arg;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        public static final class Builder {
            private String arg; 
            private String name; 
            private String path; 

            /**
             * Arg.
             */
            public Builder arg(String arg) {
                this.arg = arg;
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
             * Path.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            public BootstrapAction build() {
                return new BootstrapAction(this);
            } 

        } 

    }
    public static class BootstrapActionList extends TeaModel {
        @NameInMap("BootstrapAction")
        private java.util.List < BootstrapAction> bootstrapAction;

        private BootstrapActionList(Builder builder) {
            this.bootstrapAction = builder.bootstrapAction;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BootstrapActionList create() {
            return builder().build();
        }

        /**
         * @return bootstrapAction
         */
        public java.util.List < BootstrapAction> getBootstrapAction() {
            return this.bootstrapAction;
        }

        public static final class Builder {
            private java.util.List < BootstrapAction> bootstrapAction; 

            /**
             * BootstrapAction.
             */
            public Builder bootstrapAction(java.util.List < BootstrapAction> bootstrapAction) {
                this.bootstrapAction = bootstrapAction;
                return this;
            }

            public BootstrapActionList build() {
                return new BootstrapActionList(this);
            } 

        } 

    }
    public static class Config extends TeaModel {
        @NameInMap("ConfigKey")
        private String configKey;

        @NameInMap("ConfigValue")
        private String configValue;

        @NameInMap("Encrypt")
        private String encrypt;

        @NameInMap("FileName")
        private String fileName;

        @NameInMap("ServiceName")
        private String serviceName;

        private Config(Builder builder) {
            this.configKey = builder.configKey;
            this.configValue = builder.configValue;
            this.encrypt = builder.encrypt;
            this.fileName = builder.fileName;
            this.serviceName = builder.serviceName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Config create() {
            return builder().build();
        }

        /**
         * @return configKey
         */
        public String getConfigKey() {
            return this.configKey;
        }

        /**
         * @return configValue
         */
        public String getConfigValue() {
            return this.configValue;
        }

        /**
         * @return encrypt
         */
        public String getEncrypt() {
            return this.encrypt;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return serviceName
         */
        public String getServiceName() {
            return this.serviceName;
        }

        public static final class Builder {
            private String configKey; 
            private String configValue; 
            private String encrypt; 
            private String fileName; 
            private String serviceName; 

            /**
             * ConfigKey.
             */
            public Builder configKey(String configKey) {
                this.configKey = configKey;
                return this;
            }

            /**
             * ConfigValue.
             */
            public Builder configValue(String configValue) {
                this.configValue = configValue;
                return this;
            }

            /**
             * Encrypt.
             */
            public Builder encrypt(String encrypt) {
                this.encrypt = encrypt;
                return this;
            }

            /**
             * FileName.
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * ServiceName.
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            public Config build() {
                return new Config(this);
            } 

        } 

    }
    public static class ConfigList extends TeaModel {
        @NameInMap("Config")
        private java.util.List < Config> config;

        private ConfigList(Builder builder) {
            this.config = builder.config;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigList create() {
            return builder().build();
        }

        /**
         * @return config
         */
        public java.util.List < Config> getConfig() {
            return this.config;
        }

        public static final class Builder {
            private java.util.List < Config> config; 

            /**
             * Config.
             */
            public Builder config(java.util.List < Config> config) {
                this.config = config;
                return this;
            }

            public ConfigList build() {
                return new ConfigList(this);
            } 

        } 

    }
    public static class EcsOrderInfo extends TeaModel {
        @NameInMap("DiskCapacity")
        private Integer diskCapacity;

        @NameInMap("DiskCount")
        private Integer diskCount;

        @NameInMap("DiskType")
        private String diskType;

        @NameInMap("Index")
        private Integer index;

        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("NodeCount")
        private Integer nodeCount;

        @NameInMap("NodeType")
        private String nodeType;

        private EcsOrderInfo(Builder builder) {
            this.diskCapacity = builder.diskCapacity;
            this.diskCount = builder.diskCount;
            this.diskType = builder.diskType;
            this.index = builder.index;
            this.instanceType = builder.instanceType;
            this.nodeCount = builder.nodeCount;
            this.nodeType = builder.nodeType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EcsOrderInfo create() {
            return builder().build();
        }

        /**
         * @return diskCapacity
         */
        public Integer getDiskCapacity() {
            return this.diskCapacity;
        }

        /**
         * @return diskCount
         */
        public Integer getDiskCount() {
            return this.diskCount;
        }

        /**
         * @return diskType
         */
        public String getDiskType() {
            return this.diskType;
        }

        /**
         * @return index
         */
        public Integer getIndex() {
            return this.index;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return nodeCount
         */
        public Integer getNodeCount() {
            return this.nodeCount;
        }

        /**
         * @return nodeType
         */
        public String getNodeType() {
            return this.nodeType;
        }

        public static final class Builder {
            private Integer diskCapacity; 
            private Integer diskCount; 
            private String diskType; 
            private Integer index; 
            private String instanceType; 
            private Integer nodeCount; 
            private String nodeType; 

            /**
             * DiskCapacity.
             */
            public Builder diskCapacity(Integer diskCapacity) {
                this.diskCapacity = diskCapacity;
                return this;
            }

            /**
             * DiskCount.
             */
            public Builder diskCount(Integer diskCount) {
                this.diskCount = diskCount;
                return this;
            }

            /**
             * DiskType.
             */
            public Builder diskType(String diskType) {
                this.diskType = diskType;
                return this;
            }

            /**
             * Index.
             */
            public Builder index(Integer index) {
                this.index = index;
                return this;
            }

            /**
             * InstanceType.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * NodeCount.
             */
            public Builder nodeCount(Integer nodeCount) {
                this.nodeCount = nodeCount;
                return this;
            }

            /**
             * NodeType.
             */
            public Builder nodeType(String nodeType) {
                this.nodeType = nodeType;
                return this;
            }

            public EcsOrderInfo build() {
                return new EcsOrderInfo(this);
            } 

        } 

    }
    public static class EcsOrders extends TeaModel {
        @NameInMap("EcsOrderInfo")
        private java.util.List < EcsOrderInfo> ecsOrderInfo;

        private EcsOrders(Builder builder) {
            this.ecsOrderInfo = builder.ecsOrderInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EcsOrders create() {
            return builder().build();
        }

        /**
         * @return ecsOrderInfo
         */
        public java.util.List < EcsOrderInfo> getEcsOrderInfo() {
            return this.ecsOrderInfo;
        }

        public static final class Builder {
            private java.util.List < EcsOrderInfo> ecsOrderInfo; 

            /**
             * EcsOrderInfo.
             */
            public Builder ecsOrderInfo(java.util.List < EcsOrderInfo> ecsOrderInfo) {
                this.ecsOrderInfo = ecsOrderInfo;
                return this;
            }

            public EcsOrders build() {
                return new EcsOrders(this);
            } 

        } 

    }
    public static class Software extends TeaModel {
        @NameInMap("DisplayName")
        private String displayName;

        @NameInMap("Name")
        private String name;

        @NameInMap("OnlyDisplay")
        private Boolean onlyDisplay;

        @NameInMap("Optional")
        private Boolean optional;

        @NameInMap("StartTpe")
        private Integer startTpe;

        @NameInMap("Version")
        private String version;

        private Software(Builder builder) {
            this.displayName = builder.displayName;
            this.name = builder.name;
            this.onlyDisplay = builder.onlyDisplay;
            this.optional = builder.optional;
            this.startTpe = builder.startTpe;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Software create() {
            return builder().build();
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return onlyDisplay
         */
        public Boolean getOnlyDisplay() {
            return this.onlyDisplay;
        }

        /**
         * @return optional
         */
        public Boolean getOptional() {
            return this.optional;
        }

        /**
         * @return startTpe
         */
        public Integer getStartTpe() {
            return this.startTpe;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String displayName; 
            private String name; 
            private Boolean onlyDisplay; 
            private Boolean optional; 
            private Integer startTpe; 
            private String version; 

            /**
             * DisplayName.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
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
             * OnlyDisplay.
             */
            public Builder onlyDisplay(Boolean onlyDisplay) {
                this.onlyDisplay = onlyDisplay;
                return this;
            }

            /**
             * Optional.
             */
            public Builder optional(Boolean optional) {
                this.optional = optional;
                return this;
            }

            /**
             * StartTpe.
             */
            public Builder startTpe(Integer startTpe) {
                this.startTpe = startTpe;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public Software build() {
                return new Software(this);
            } 

        } 

    }
    public static class Softwares extends TeaModel {
        @NameInMap("Software")
        private java.util.List < Software> software;

        private Softwares(Builder builder) {
            this.software = builder.software;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Softwares create() {
            return builder().build();
        }

        /**
         * @return software
         */
        public java.util.List < Software> getSoftware() {
            return this.software;
        }

        public static final class Builder {
            private java.util.List < Software> software; 

            /**
             * Software.
             */
            public Builder software(java.util.List < Software> software) {
                this.software = software;
                return this;
            }

            public Softwares build() {
                return new Softwares(this);
            } 

        } 

    }
    public static class SoftwareInfo extends TeaModel {
        @NameInMap("ClusterType")
        private String clusterType;

        @NameInMap("EmrVer")
        private String emrVer;

        @NameInMap("Softwares")
        private Softwares softwares;

        private SoftwareInfo(Builder builder) {
            this.clusterType = builder.clusterType;
            this.emrVer = builder.emrVer;
            this.softwares = builder.softwares;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SoftwareInfo create() {
            return builder().build();
        }

        /**
         * @return clusterType
         */
        public String getClusterType() {
            return this.clusterType;
        }

        /**
         * @return emrVer
         */
        public String getEmrVer() {
            return this.emrVer;
        }

        /**
         * @return softwares
         */
        public Softwares getSoftwares() {
            return this.softwares;
        }

        public static final class Builder {
            private String clusterType; 
            private String emrVer; 
            private Softwares softwares; 

            /**
             * ClusterType.
             */
            public Builder clusterType(String clusterType) {
                this.clusterType = clusterType;
                return this;
            }

            /**
             * EmrVer.
             */
            public Builder emrVer(String emrVer) {
                this.emrVer = emrVer;
                return this;
            }

            /**
             * Softwares.
             */
            public Builder softwares(Softwares softwares) {
                this.softwares = softwares;
                return this;
            }

            public SoftwareInfo build() {
                return new SoftwareInfo(this);
            } 

        } 

    }
    public static class ClusterInfo extends TeaModel {
        @NameInMap("BootstrapActionList")
        private BootstrapActionList bootstrapActionList;

        @NameInMap("ClusterType")
        private String clusterType;

        @NameInMap("ConfigList")
        private ConfigList configList;

        @NameInMap("Configurations")
        private String configurations;

        @NameInMap("EasEnable")
        private Boolean easEnable;

        @NameInMap("EcsOrders")
        private EcsOrders ecsOrders;

        @NameInMap("EmrVer")
        private String emrVer;

        @NameInMap("HighAvailabilityEnable")
        private Boolean highAvailabilityEnable;

        @NameInMap("InitCustomHiveMetaDB")
        private Boolean initCustomHiveMetaDB;

        @NameInMap("InstanceGeneration")
        private String instanceGeneration;

        @NameInMap("IoOptimized")
        private Boolean ioOptimized;

        @NameInMap("LogEnable")
        private Boolean logEnable;

        @NameInMap("LogPath")
        private String logPath;

        @NameInMap("Name")
        private String name;

        @NameInMap("NetType")
        private String netType;

        @NameInMap("SecurityGroupId")
        private String securityGroupId;

        @NameInMap("SoftwareInfo")
        private SoftwareInfo softwareInfo;

        @NameInMap("UseCustomHiveMetaDB")
        private Boolean useCustomHiveMetaDB;

        @NameInMap("UseLocalMetaDb")
        private Boolean useLocalMetaDb;

        @NameInMap("UserDefinedEmrEcsRole")
        private String userDefinedEmrEcsRole;

        @NameInMap("VSwitchId")
        private String vSwitchId;

        @NameInMap("VpcId")
        private String vpcId;

        @NameInMap("ZoneId")
        private String zoneId;

        private ClusterInfo(Builder builder) {
            this.bootstrapActionList = builder.bootstrapActionList;
            this.clusterType = builder.clusterType;
            this.configList = builder.configList;
            this.configurations = builder.configurations;
            this.easEnable = builder.easEnable;
            this.ecsOrders = builder.ecsOrders;
            this.emrVer = builder.emrVer;
            this.highAvailabilityEnable = builder.highAvailabilityEnable;
            this.initCustomHiveMetaDB = builder.initCustomHiveMetaDB;
            this.instanceGeneration = builder.instanceGeneration;
            this.ioOptimized = builder.ioOptimized;
            this.logEnable = builder.logEnable;
            this.logPath = builder.logPath;
            this.name = builder.name;
            this.netType = builder.netType;
            this.securityGroupId = builder.securityGroupId;
            this.softwareInfo = builder.softwareInfo;
            this.useCustomHiveMetaDB = builder.useCustomHiveMetaDB;
            this.useLocalMetaDb = builder.useLocalMetaDb;
            this.userDefinedEmrEcsRole = builder.userDefinedEmrEcsRole;
            this.vSwitchId = builder.vSwitchId;
            this.vpcId = builder.vpcId;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClusterInfo create() {
            return builder().build();
        }

        /**
         * @return bootstrapActionList
         */
        public BootstrapActionList getBootstrapActionList() {
            return this.bootstrapActionList;
        }

        /**
         * @return clusterType
         */
        public String getClusterType() {
            return this.clusterType;
        }

        /**
         * @return configList
         */
        public ConfigList getConfigList() {
            return this.configList;
        }

        /**
         * @return configurations
         */
        public String getConfigurations() {
            return this.configurations;
        }

        /**
         * @return easEnable
         */
        public Boolean getEasEnable() {
            return this.easEnable;
        }

        /**
         * @return ecsOrders
         */
        public EcsOrders getEcsOrders() {
            return this.ecsOrders;
        }

        /**
         * @return emrVer
         */
        public String getEmrVer() {
            return this.emrVer;
        }

        /**
         * @return highAvailabilityEnable
         */
        public Boolean getHighAvailabilityEnable() {
            return this.highAvailabilityEnable;
        }

        /**
         * @return initCustomHiveMetaDB
         */
        public Boolean getInitCustomHiveMetaDB() {
            return this.initCustomHiveMetaDB;
        }

        /**
         * @return instanceGeneration
         */
        public String getInstanceGeneration() {
            return this.instanceGeneration;
        }

        /**
         * @return ioOptimized
         */
        public Boolean getIoOptimized() {
            return this.ioOptimized;
        }

        /**
         * @return logEnable
         */
        public Boolean getLogEnable() {
            return this.logEnable;
        }

        /**
         * @return logPath
         */
        public String getLogPath() {
            return this.logPath;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return netType
         */
        public String getNetType() {
            return this.netType;
        }

        /**
         * @return securityGroupId
         */
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        /**
         * @return softwareInfo
         */
        public SoftwareInfo getSoftwareInfo() {
            return this.softwareInfo;
        }

        /**
         * @return useCustomHiveMetaDB
         */
        public Boolean getUseCustomHiveMetaDB() {
            return this.useCustomHiveMetaDB;
        }

        /**
         * @return useLocalMetaDb
         */
        public Boolean getUseLocalMetaDb() {
            return this.useLocalMetaDb;
        }

        /**
         * @return userDefinedEmrEcsRole
         */
        public String getUserDefinedEmrEcsRole() {
            return this.userDefinedEmrEcsRole;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private BootstrapActionList bootstrapActionList; 
            private String clusterType; 
            private ConfigList configList; 
            private String configurations; 
            private Boolean easEnable; 
            private EcsOrders ecsOrders; 
            private String emrVer; 
            private Boolean highAvailabilityEnable; 
            private Boolean initCustomHiveMetaDB; 
            private String instanceGeneration; 
            private Boolean ioOptimized; 
            private Boolean logEnable; 
            private String logPath; 
            private String name; 
            private String netType; 
            private String securityGroupId; 
            private SoftwareInfo softwareInfo; 
            private Boolean useCustomHiveMetaDB; 
            private Boolean useLocalMetaDb; 
            private String userDefinedEmrEcsRole; 
            private String vSwitchId; 
            private String vpcId; 
            private String zoneId; 

            /**
             * BootstrapActionList.
             */
            public Builder bootstrapActionList(BootstrapActionList bootstrapActionList) {
                this.bootstrapActionList = bootstrapActionList;
                return this;
            }

            /**
             * ClusterType.
             */
            public Builder clusterType(String clusterType) {
                this.clusterType = clusterType;
                return this;
            }

            /**
             * ConfigList.
             */
            public Builder configList(ConfigList configList) {
                this.configList = configList;
                return this;
            }

            /**
             * Configurations.
             */
            public Builder configurations(String configurations) {
                this.configurations = configurations;
                return this;
            }

            /**
             * EasEnable.
             */
            public Builder easEnable(Boolean easEnable) {
                this.easEnable = easEnable;
                return this;
            }

            /**
             * EcsOrders.
             */
            public Builder ecsOrders(EcsOrders ecsOrders) {
                this.ecsOrders = ecsOrders;
                return this;
            }

            /**
             * EmrVer.
             */
            public Builder emrVer(String emrVer) {
                this.emrVer = emrVer;
                return this;
            }

            /**
             * HighAvailabilityEnable.
             */
            public Builder highAvailabilityEnable(Boolean highAvailabilityEnable) {
                this.highAvailabilityEnable = highAvailabilityEnable;
                return this;
            }

            /**
             * InitCustomHiveMetaDB.
             */
            public Builder initCustomHiveMetaDB(Boolean initCustomHiveMetaDB) {
                this.initCustomHiveMetaDB = initCustomHiveMetaDB;
                return this;
            }

            /**
             * InstanceGeneration.
             */
            public Builder instanceGeneration(String instanceGeneration) {
                this.instanceGeneration = instanceGeneration;
                return this;
            }

            /**
             * IoOptimized.
             */
            public Builder ioOptimized(Boolean ioOptimized) {
                this.ioOptimized = ioOptimized;
                return this;
            }

            /**
             * LogEnable.
             */
            public Builder logEnable(Boolean logEnable) {
                this.logEnable = logEnable;
                return this;
            }

            /**
             * LogPath.
             */
            public Builder logPath(String logPath) {
                this.logPath = logPath;
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
             * NetType.
             */
            public Builder netType(String netType) {
                this.netType = netType;
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
             * SoftwareInfo.
             */
            public Builder softwareInfo(SoftwareInfo softwareInfo) {
                this.softwareInfo = softwareInfo;
                return this;
            }

            /**
             * UseCustomHiveMetaDB.
             */
            public Builder useCustomHiveMetaDB(Boolean useCustomHiveMetaDB) {
                this.useCustomHiveMetaDB = useCustomHiveMetaDB;
                return this;
            }

            /**
             * UseLocalMetaDb.
             */
            public Builder useLocalMetaDb(Boolean useLocalMetaDb) {
                this.useLocalMetaDb = useLocalMetaDb;
                return this;
            }

            /**
             * UserDefinedEmrEcsRole.
             */
            public Builder userDefinedEmrEcsRole(String userDefinedEmrEcsRole) {
                this.userDefinedEmrEcsRole = userDefinedEmrEcsRole;
                return this;
            }

            /**
             * VSwitchId.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * VpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * ZoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public ClusterInfo build() {
                return new ClusterInfo(this);
            } 

        } 

    }
    public static class JobInfo extends TeaModel {
        @NameInMap("FailAct")
        private String failAct;

        @NameInMap("Id")
        private String id;

        @NameInMap("Name")
        private String name;

        @NameInMap("RunParameter")
        private String runParameter;

        @NameInMap("Type")
        private String type;

        private JobInfo(Builder builder) {
            this.failAct = builder.failAct;
            this.id = builder.id;
            this.name = builder.name;
            this.runParameter = builder.runParameter;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static JobInfo create() {
            return builder().build();
        }

        /**
         * @return failAct
         */
        public String getFailAct() {
            return this.failAct;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return runParameter
         */
        public String getRunParameter() {
            return this.runParameter;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String failAct; 
            private String id; 
            private String name; 
            private String runParameter; 
            private String type; 

            /**
             * FailAct.
             */
            public Builder failAct(String failAct) {
                this.failAct = failAct;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
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
             * RunParameter.
             */
            public Builder runParameter(String runParameter) {
                this.runParameter = runParameter;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public JobInfo build() {
                return new JobInfo(this);
            } 

        } 

    }
    public static class JobInfoList extends TeaModel {
        @NameInMap("JobInfo")
        private java.util.List < JobInfo> jobInfo;

        private JobInfoList(Builder builder) {
            this.jobInfo = builder.jobInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static JobInfoList create() {
            return builder().build();
        }

        /**
         * @return jobInfo
         */
        public java.util.List < JobInfo> getJobInfo() {
            return this.jobInfo;
        }

        public static final class Builder {
            private java.util.List < JobInfo> jobInfo; 

            /**
             * JobInfo.
             */
            public Builder jobInfo(java.util.List < JobInfo> jobInfo) {
                this.jobInfo = jobInfo;
                return this;
            }

            public JobInfoList build() {
                return new JobInfoList(this);
            } 

        } 

    }
}
