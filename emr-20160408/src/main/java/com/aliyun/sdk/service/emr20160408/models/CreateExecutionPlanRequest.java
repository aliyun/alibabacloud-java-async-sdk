// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateExecutionPlanRequest} extends {@link RequestModel}
 *
 * <p>CreateExecutionPlanRequest</p>
 */
public class CreateExecutionPlanRequest extends Request {
    @Query
    @NameInMap("BootstrapAction")
    private java.util.List < BootstrapAction> bootstrapAction;

    @Query
    @NameInMap("ClusterId")
    private String clusterId;

    @Query
    @NameInMap("ClusterName")
    private String clusterName;

    @Query
    @NameInMap("ClusterType")
    private String clusterType;

    @Query
    @NameInMap("Config")
    private java.util.List < Config> config;

    @Query
    @NameInMap("Configurations")
    private String configurations;

    @Query
    @NameInMap("CreateClusterOnDemand")
    private Boolean createClusterOnDemand;

    @Query
    @NameInMap("DayOfMonth")
    private String dayOfMonth;

    @Query
    @NameInMap("DayOfWeek")
    private String dayOfWeek;

    @Query
    @NameInMap("EasEnable")
    private Boolean easEnable;

    @Query
    @NameInMap("EcsOrder")
    private java.util.List < EcsOrder> ecsOrder;

    @Query
    @NameInMap("EmrVer")
    private String emrVer;

    @Query
    @NameInMap("HighAvailabilityEnable")
    private Boolean highAvailabilityEnable;

    @Query
    @NameInMap("InitCustomHiveMetaDB")
    private Boolean initCustomHiveMetaDB;

    @Query
    @NameInMap("InstanceGeneration")
    private String instanceGeneration;

    @Query
    @NameInMap("IoOptimized")
    private Boolean ioOptimized;

    @Query
    @NameInMap("IsOpenPublicIp")
    private Boolean isOpenPublicIp;

    @Query
    @NameInMap("JobIdList")
    @Validation(required = true)
    private java.util.List < String > jobIdList;

    @Query
    @NameInMap("LogEnable")
    private Boolean logEnable;

    @Query
    @NameInMap("LogPath")
    private String logPath;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("NetType")
    private String netType;

    @Query
    @NameInMap("OptionSoftWareList")
    private java.util.List < String > optionSoftWareList;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("SecurityGroupId")
    private String securityGroupId;

    @Query
    @NameInMap("StartTime")
    private Long startTime;

    @Query
    @NameInMap("Strategy")
    @Validation(required = true)
    private String strategy;

    @Query
    @NameInMap("TimeInterval")
    private Integer timeInterval;

    @Query
    @NameInMap("TimeUnit")
    private String timeUnit;

    @Query
    @NameInMap("UseCustomHiveMetaDB")
    private Boolean useCustomHiveMetaDB;

    @Query
    @NameInMap("UseLocalMetaDb")
    private Boolean useLocalMetaDb;

    @Query
    @NameInMap("UserDefinedEmrEcsRole")
    private String userDefinedEmrEcsRole;

    @Query
    @NameInMap("VSwitchId")
    private String vSwitchId;

    @Query
    @NameInMap("VpcId")
    private String vpcId;

    @Query
    @NameInMap("WorkflowDefinition")
    private String workflowDefinition;

    @Query
    @NameInMap("ZoneId")
    private String zoneId;

    private CreateExecutionPlanRequest(Builder builder) {
        super(builder);
        this.bootstrapAction = builder.bootstrapAction;
        this.clusterId = builder.clusterId;
        this.clusterName = builder.clusterName;
        this.clusterType = builder.clusterType;
        this.config = builder.config;
        this.configurations = builder.configurations;
        this.createClusterOnDemand = builder.createClusterOnDemand;
        this.dayOfMonth = builder.dayOfMonth;
        this.dayOfWeek = builder.dayOfWeek;
        this.easEnable = builder.easEnable;
        this.ecsOrder = builder.ecsOrder;
        this.emrVer = builder.emrVer;
        this.highAvailabilityEnable = builder.highAvailabilityEnable;
        this.initCustomHiveMetaDB = builder.initCustomHiveMetaDB;
        this.instanceGeneration = builder.instanceGeneration;
        this.ioOptimized = builder.ioOptimized;
        this.isOpenPublicIp = builder.isOpenPublicIp;
        this.jobIdList = builder.jobIdList;
        this.logEnable = builder.logEnable;
        this.logPath = builder.logPath;
        this.name = builder.name;
        this.netType = builder.netType;
        this.optionSoftWareList = builder.optionSoftWareList;
        this.regionId = builder.regionId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.securityGroupId = builder.securityGroupId;
        this.startTime = builder.startTime;
        this.strategy = builder.strategy;
        this.timeInterval = builder.timeInterval;
        this.timeUnit = builder.timeUnit;
        this.useCustomHiveMetaDB = builder.useCustomHiveMetaDB;
        this.useLocalMetaDb = builder.useLocalMetaDb;
        this.userDefinedEmrEcsRole = builder.userDefinedEmrEcsRole;
        this.vSwitchId = builder.vSwitchId;
        this.vpcId = builder.vpcId;
        this.workflowDefinition = builder.workflowDefinition;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateExecutionPlanRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bootstrapAction
     */
    public java.util.List < BootstrapAction> getBootstrapAction() {
        return this.bootstrapAction;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return clusterName
     */
    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * @return clusterType
     */
    public String getClusterType() {
        return this.clusterType;
    }

    /**
     * @return config
     */
    public java.util.List < Config> getConfig() {
        return this.config;
    }

    /**
     * @return configurations
     */
    public String getConfigurations() {
        return this.configurations;
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
     * @return easEnable
     */
    public Boolean getEasEnable() {
        return this.easEnable;
    }

    /**
     * @return ecsOrder
     */
    public java.util.List < EcsOrder> getEcsOrder() {
        return this.ecsOrder;
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
     * @return isOpenPublicIp
     */
    public Boolean getIsOpenPublicIp() {
        return this.isOpenPublicIp;
    }

    /**
     * @return jobIdList
     */
    public java.util.List < String > getJobIdList() {
        return this.jobIdList;
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
     * @return optionSoftWareList
     */
    public java.util.List < String > getOptionSoftWareList() {
        return this.optionSoftWareList;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
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
     * @return workflowDefinition
     */
    public String getWorkflowDefinition() {
        return this.workflowDefinition;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<CreateExecutionPlanRequest, Builder> {
        private java.util.List < BootstrapAction> bootstrapAction; 
        private String clusterId; 
        private String clusterName; 
        private String clusterType; 
        private java.util.List < Config> config; 
        private String configurations; 
        private Boolean createClusterOnDemand; 
        private String dayOfMonth; 
        private String dayOfWeek; 
        private Boolean easEnable; 
        private java.util.List < EcsOrder> ecsOrder; 
        private String emrVer; 
        private Boolean highAvailabilityEnable; 
        private Boolean initCustomHiveMetaDB; 
        private String instanceGeneration; 
        private Boolean ioOptimized; 
        private Boolean isOpenPublicIp; 
        private java.util.List < String > jobIdList; 
        private Boolean logEnable; 
        private String logPath; 
        private String name; 
        private String netType; 
        private java.util.List < String > optionSoftWareList; 
        private String regionId; 
        private Long resourceOwnerId; 
        private String securityGroupId; 
        private Long startTime; 
        private String strategy; 
        private Integer timeInterval; 
        private String timeUnit; 
        private Boolean useCustomHiveMetaDB; 
        private Boolean useLocalMetaDb; 
        private String userDefinedEmrEcsRole; 
        private String vSwitchId; 
        private String vpcId; 
        private String workflowDefinition; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(CreateExecutionPlanRequest response) {
            super(response);
            this.bootstrapAction = response.bootstrapAction;
            this.clusterId = response.clusterId;
            this.clusterName = response.clusterName;
            this.clusterType = response.clusterType;
            this.config = response.config;
            this.configurations = response.configurations;
            this.createClusterOnDemand = response.createClusterOnDemand;
            this.dayOfMonth = response.dayOfMonth;
            this.dayOfWeek = response.dayOfWeek;
            this.easEnable = response.easEnable;
            this.ecsOrder = response.ecsOrder;
            this.emrVer = response.emrVer;
            this.highAvailabilityEnable = response.highAvailabilityEnable;
            this.initCustomHiveMetaDB = response.initCustomHiveMetaDB;
            this.instanceGeneration = response.instanceGeneration;
            this.ioOptimized = response.ioOptimized;
            this.isOpenPublicIp = response.isOpenPublicIp;
            this.jobIdList = response.jobIdList;
            this.logEnable = response.logEnable;
            this.logPath = response.logPath;
            this.name = response.name;
            this.netType = response.netType;
            this.optionSoftWareList = response.optionSoftWareList;
            this.regionId = response.regionId;
            this.resourceOwnerId = response.resourceOwnerId;
            this.securityGroupId = response.securityGroupId;
            this.startTime = response.startTime;
            this.strategy = response.strategy;
            this.timeInterval = response.timeInterval;
            this.timeUnit = response.timeUnit;
            this.useCustomHiveMetaDB = response.useCustomHiveMetaDB;
            this.useLocalMetaDb = response.useLocalMetaDb;
            this.userDefinedEmrEcsRole = response.userDefinedEmrEcsRole;
            this.vSwitchId = response.vSwitchId;
            this.vpcId = response.vpcId;
            this.workflowDefinition = response.workflowDefinition;
            this.zoneId = response.zoneId;
        } 

        /**
         * BootstrapAction.
         */
        public Builder bootstrapAction(java.util.List < BootstrapAction> bootstrapAction) {
            this.putQueryParameter("BootstrapAction", bootstrapAction);
            this.bootstrapAction = bootstrapAction;
            return this;
        }

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
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
         * ClusterType.
         */
        public Builder clusterType(String clusterType) {
            this.putQueryParameter("ClusterType", clusterType);
            this.clusterType = clusterType;
            return this;
        }

        /**
         * Config.
         */
        public Builder config(java.util.List < Config> config) {
            this.putQueryParameter("Config", config);
            this.config = config;
            return this;
        }

        /**
         * Configurations.
         */
        public Builder configurations(String configurations) {
            this.putQueryParameter("Configurations", configurations);
            this.configurations = configurations;
            return this;
        }

        /**
         * CreateClusterOnDemand.
         */
        public Builder createClusterOnDemand(Boolean createClusterOnDemand) {
            this.putQueryParameter("CreateClusterOnDemand", createClusterOnDemand);
            this.createClusterOnDemand = createClusterOnDemand;
            return this;
        }

        /**
         * DayOfMonth.
         */
        public Builder dayOfMonth(String dayOfMonth) {
            this.putQueryParameter("DayOfMonth", dayOfMonth);
            this.dayOfMonth = dayOfMonth;
            return this;
        }

        /**
         * DayOfWeek.
         */
        public Builder dayOfWeek(String dayOfWeek) {
            this.putQueryParameter("DayOfWeek", dayOfWeek);
            this.dayOfWeek = dayOfWeek;
            return this;
        }

        /**
         * EasEnable.
         */
        public Builder easEnable(Boolean easEnable) {
            this.putQueryParameter("EasEnable", easEnable);
            this.easEnable = easEnable;
            return this;
        }

        /**
         * EcsOrder.
         */
        public Builder ecsOrder(java.util.List < EcsOrder> ecsOrder) {
            this.putQueryParameter("EcsOrder", ecsOrder);
            this.ecsOrder = ecsOrder;
            return this;
        }

        /**
         * EmrVer.
         */
        public Builder emrVer(String emrVer) {
            this.putQueryParameter("EmrVer", emrVer);
            this.emrVer = emrVer;
            return this;
        }

        /**
         * HighAvailabilityEnable.
         */
        public Builder highAvailabilityEnable(Boolean highAvailabilityEnable) {
            this.putQueryParameter("HighAvailabilityEnable", highAvailabilityEnable);
            this.highAvailabilityEnable = highAvailabilityEnable;
            return this;
        }

        /**
         * InitCustomHiveMetaDB.
         */
        public Builder initCustomHiveMetaDB(Boolean initCustomHiveMetaDB) {
            this.putQueryParameter("InitCustomHiveMetaDB", initCustomHiveMetaDB);
            this.initCustomHiveMetaDB = initCustomHiveMetaDB;
            return this;
        }

        /**
         * InstanceGeneration.
         */
        public Builder instanceGeneration(String instanceGeneration) {
            this.putQueryParameter("InstanceGeneration", instanceGeneration);
            this.instanceGeneration = instanceGeneration;
            return this;
        }

        /**
         * IoOptimized.
         */
        public Builder ioOptimized(Boolean ioOptimized) {
            this.putQueryParameter("IoOptimized", ioOptimized);
            this.ioOptimized = ioOptimized;
            return this;
        }

        /**
         * IsOpenPublicIp.
         */
        public Builder isOpenPublicIp(Boolean isOpenPublicIp) {
            this.putQueryParameter("IsOpenPublicIp", isOpenPublicIp);
            this.isOpenPublicIp = isOpenPublicIp;
            return this;
        }

        /**
         * JobIdList.
         */
        public Builder jobIdList(java.util.List < String > jobIdList) {
            this.putQueryParameter("JobIdList", jobIdList);
            this.jobIdList = jobIdList;
            return this;
        }

        /**
         * LogEnable.
         */
        public Builder logEnable(Boolean logEnable) {
            this.putQueryParameter("LogEnable", logEnable);
            this.logEnable = logEnable;
            return this;
        }

        /**
         * LogPath.
         */
        public Builder logPath(String logPath) {
            this.putQueryParameter("LogPath", logPath);
            this.logPath = logPath;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * NetType.
         */
        public Builder netType(String netType) {
            this.putQueryParameter("NetType", netType);
            this.netType = netType;
            return this;
        }

        /**
         * OptionSoftWareList.
         */
        public Builder optionSoftWareList(java.util.List < String > optionSoftWareList) {
            this.putQueryParameter("OptionSoftWareList", optionSoftWareList);
            this.optionSoftWareList = optionSoftWareList;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
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
         * StartTime.
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * Strategy.
         */
        public Builder strategy(String strategy) {
            this.putQueryParameter("Strategy", strategy);
            this.strategy = strategy;
            return this;
        }

        /**
         * TimeInterval.
         */
        public Builder timeInterval(Integer timeInterval) {
            this.putQueryParameter("TimeInterval", timeInterval);
            this.timeInterval = timeInterval;
            return this;
        }

        /**
         * TimeUnit.
         */
        public Builder timeUnit(String timeUnit) {
            this.putQueryParameter("TimeUnit", timeUnit);
            this.timeUnit = timeUnit;
            return this;
        }

        /**
         * UseCustomHiveMetaDB.
         */
        public Builder useCustomHiveMetaDB(Boolean useCustomHiveMetaDB) {
            this.putQueryParameter("UseCustomHiveMetaDB", useCustomHiveMetaDB);
            this.useCustomHiveMetaDB = useCustomHiveMetaDB;
            return this;
        }

        /**
         * UseLocalMetaDb.
         */
        public Builder useLocalMetaDb(Boolean useLocalMetaDb) {
            this.putQueryParameter("UseLocalMetaDb", useLocalMetaDb);
            this.useLocalMetaDb = useLocalMetaDb;
            return this;
        }

        /**
         * UserDefinedEmrEcsRole.
         */
        public Builder userDefinedEmrEcsRole(String userDefinedEmrEcsRole) {
            this.putQueryParameter("UserDefinedEmrEcsRole", userDefinedEmrEcsRole);
            this.userDefinedEmrEcsRole = userDefinedEmrEcsRole;
            return this;
        }

        /**
         * VSwitchId.
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * VpcId.
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * WorkflowDefinition.
         */
        public Builder workflowDefinition(String workflowDefinition) {
            this.putQueryParameter("WorkflowDefinition", workflowDefinition);
            this.workflowDefinition = workflowDefinition;
            return this;
        }

        /**
         * ZoneId.
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public CreateExecutionPlanRequest build() {
            return new CreateExecutionPlanRequest(this);
        } 

    } 

    public static class BootstrapAction extends TeaModel {
        @NameInMap("Arg")
        private String arg;

        @NameInMap("ExecutionFailStrategy")
        private String executionFailStrategy;

        @NameInMap("ExecutionMoment")
        private String executionMoment;

        @NameInMap("ExecutionTarget")
        private String executionTarget;

        @NameInMap("Name")
        @Validation(required = true)
        private String name;

        @NameInMap("Path")
        @Validation(required = true)
        private String path;

        private BootstrapAction(Builder builder) {
            this.arg = builder.arg;
            this.executionFailStrategy = builder.executionFailStrategy;
            this.executionMoment = builder.executionMoment;
            this.executionTarget = builder.executionTarget;
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
         * @return executionFailStrategy
         */
        public String getExecutionFailStrategy() {
            return this.executionFailStrategy;
        }

        /**
         * @return executionMoment
         */
        public String getExecutionMoment() {
            return this.executionMoment;
        }

        /**
         * @return executionTarget
         */
        public String getExecutionTarget() {
            return this.executionTarget;
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
            private String executionFailStrategy; 
            private String executionMoment; 
            private String executionTarget; 
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
             * ExecutionFailStrategy.
             */
            public Builder executionFailStrategy(String executionFailStrategy) {
                this.executionFailStrategy = executionFailStrategy;
                return this;
            }

            /**
             * ExecutionMoment.
             */
            public Builder executionMoment(String executionMoment) {
                this.executionMoment = executionMoment;
                return this;
            }

            /**
             * ExecutionTarget.
             */
            public Builder executionTarget(String executionTarget) {
                this.executionTarget = executionTarget;
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
    public static class Config extends TeaModel {
        @NameInMap("ConfigKey")
        @Validation(required = true)
        private String configKey;

        @NameInMap("ConfigValue")
        @Validation(required = true)
        private String configValue;

        @NameInMap("Encrypt")
        private String encrypt;

        @NameInMap("FileName")
        @Validation(required = true)
        private String fileName;

        @NameInMap("Replace")
        private String replace;

        @NameInMap("ServiceName")
        @Validation(required = true)
        private String serviceName;

        private Config(Builder builder) {
            this.configKey = builder.configKey;
            this.configValue = builder.configValue;
            this.encrypt = builder.encrypt;
            this.fileName = builder.fileName;
            this.replace = builder.replace;
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
         * @return replace
         */
        public String getReplace() {
            return this.replace;
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
            private String replace; 
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
             * Replace.
             */
            public Builder replace(String replace) {
                this.replace = replace;
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
    public static class EcsOrder extends TeaModel {
        @NameInMap("DiskCapacity")
        @Validation(required = true, maximum = 2000, minimum = 40)
        private Integer diskCapacity;

        @NameInMap("DiskCount")
        @Validation(required = true, maximum = 4, minimum = 1)
        private Integer diskCount;

        @NameInMap("DiskType")
        @Validation(required = true)
        private String diskType;

        @NameInMap("Index")
        private Integer index;

        @NameInMap("InstanceType")
        @Validation(required = true)
        private String instanceType;

        @NameInMap("NodeCount")
        @Validation(required = true, maximum = 50, minimum = 2)
        private Integer nodeCount;

        @NameInMap("NodeType")
        @Validation(required = true)
        private String nodeType;

        private EcsOrder(Builder builder) {
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

        public static EcsOrder create() {
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

            public EcsOrder build() {
                return new EcsOrder(this);
            } 

        } 

    }
}
