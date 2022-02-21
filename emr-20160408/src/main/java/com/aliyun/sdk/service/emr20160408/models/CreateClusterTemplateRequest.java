// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateClusterTemplateRequest} extends {@link RequestModel}
 *
 * <p>CreateClusterTemplateRequest</p>
 */
public class CreateClusterTemplateRequest extends Request {
    @Query
    @NameInMap("AutoRenew")
    private Boolean autoRenew;

    @Query
    @NameInMap("BootstrapAction")
    private java.util.List < BootstrapAction> bootstrapAction;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("ClusterType")
    @Validation(required = true)
    private String clusterType;

    @Query
    @NameInMap("Config")
    private java.util.List < Config> config;

    @Query
    @NameInMap("Configurations")
    private String configurations;

    @Query
    @NameInMap("DepositType")
    private String depositType;

    @Query
    @NameInMap("EasEnable")
    private Boolean easEnable;

    @Query
    @NameInMap("EmrVer")
    @Validation(required = true)
    private String emrVer;

    @Query
    @NameInMap("HighAvailabilityEnable")
    private Boolean highAvailabilityEnable;

    @Query
    @NameInMap("HostGroup")
    @Validation(required = true)
    private java.util.List < HostGroup> hostGroup;

    @Query
    @NameInMap("InitCustomHiveMetaDb")
    private Boolean initCustomHiveMetaDb;

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
    @NameInMap("KeyPairName")
    private String keyPairName;

    @Query
    @NameInMap("LogPath")
    private String logPath;

    @Query
    @NameInMap("MachineType")
    private String machineType;

    @Query
    @NameInMap("MasterPwd")
    private String masterPwd;

    @Query
    @NameInMap("MetaStoreConf")
    private String metaStoreConf;

    @Query
    @NameInMap("MetaStoreType")
    private String metaStoreType;

    @Query
    @NameInMap("NetType")
    private String netType;

    @Query
    @NameInMap("OptionSoftWareList")
    private java.util.List < String > optionSoftWareList;

    @Query
    @NameInMap("Period")
    private Integer period;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("SecurityGroupId")
    private String securityGroupId;

    @Query
    @NameInMap("SecurityGroupName")
    private String securityGroupName;

    @Query
    @NameInMap("SshEnable")
    private Boolean sshEnable;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    @Query
    @NameInMap("TemplateName")
    @Validation(required = true)
    private String templateName;

    @Query
    @NameInMap("UseCustomHiveMetaDb")
    private Boolean useCustomHiveMetaDb;

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
    @NameInMap("ZoneId")
    @Validation(required = true)
    private String zoneId;

    private CreateClusterTemplateRequest(Builder builder) {
        super(builder);
        this.autoRenew = builder.autoRenew;
        this.bootstrapAction = builder.bootstrapAction;
        this.clientToken = builder.clientToken;
        this.clusterType = builder.clusterType;
        this.config = builder.config;
        this.configurations = builder.configurations;
        this.depositType = builder.depositType;
        this.easEnable = builder.easEnable;
        this.emrVer = builder.emrVer;
        this.highAvailabilityEnable = builder.highAvailabilityEnable;
        this.hostGroup = builder.hostGroup;
        this.initCustomHiveMetaDb = builder.initCustomHiveMetaDb;
        this.instanceGeneration = builder.instanceGeneration;
        this.ioOptimized = builder.ioOptimized;
        this.isOpenPublicIp = builder.isOpenPublicIp;
        this.keyPairName = builder.keyPairName;
        this.logPath = builder.logPath;
        this.machineType = builder.machineType;
        this.masterPwd = builder.masterPwd;
        this.metaStoreConf = builder.metaStoreConf;
        this.metaStoreType = builder.metaStoreType;
        this.netType = builder.netType;
        this.optionSoftWareList = builder.optionSoftWareList;
        this.period = builder.period;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.securityGroupId = builder.securityGroupId;
        this.securityGroupName = builder.securityGroupName;
        this.sshEnable = builder.sshEnable;
        this.tag = builder.tag;
        this.templateName = builder.templateName;
        this.useCustomHiveMetaDb = builder.useCustomHiveMetaDb;
        this.useLocalMetaDb = builder.useLocalMetaDb;
        this.userDefinedEmrEcsRole = builder.userDefinedEmrEcsRole;
        this.vSwitchId = builder.vSwitchId;
        this.vpcId = builder.vpcId;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateClusterTemplateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoRenew
     */
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    /**
     * @return bootstrapAction
     */
    public java.util.List < BootstrapAction> getBootstrapAction() {
        return this.bootstrapAction;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
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
     * @return depositType
     */
    public String getDepositType() {
        return this.depositType;
    }

    /**
     * @return easEnable
     */
    public Boolean getEasEnable() {
        return this.easEnable;
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
     * @return hostGroup
     */
    public java.util.List < HostGroup> getHostGroup() {
        return this.hostGroup;
    }

    /**
     * @return initCustomHiveMetaDb
     */
    public Boolean getInitCustomHiveMetaDb() {
        return this.initCustomHiveMetaDb;
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
     * @return keyPairName
     */
    public String getKeyPairName() {
        return this.keyPairName;
    }

    /**
     * @return logPath
     */
    public String getLogPath() {
        return this.logPath;
    }

    /**
     * @return machineType
     */
    public String getMachineType() {
        return this.machineType;
    }

    /**
     * @return masterPwd
     */
    public String getMasterPwd() {
        return this.masterPwd;
    }

    /**
     * @return metaStoreConf
     */
    public String getMetaStoreConf() {
        return this.metaStoreConf;
    }

    /**
     * @return metaStoreType
     */
    public String getMetaStoreType() {
        return this.metaStoreType;
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
     * @return period
     */
    public Integer getPeriod() {
        return this.period;
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
     * @return securityGroupName
     */
    public String getSecurityGroupName() {
        return this.securityGroupName;
    }

    /**
     * @return sshEnable
     */
    public Boolean getSshEnable() {
        return this.sshEnable;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    /**
     * @return templateName
     */
    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * @return useCustomHiveMetaDb
     */
    public Boolean getUseCustomHiveMetaDb() {
        return this.useCustomHiveMetaDb;
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

    public static final class Builder extends Request.Builder<CreateClusterTemplateRequest, Builder> {
        private Boolean autoRenew; 
        private java.util.List < BootstrapAction> bootstrapAction; 
        private String clientToken; 
        private String clusterType; 
        private java.util.List < Config> config; 
        private String configurations; 
        private String depositType; 
        private Boolean easEnable; 
        private String emrVer; 
        private Boolean highAvailabilityEnable; 
        private java.util.List < HostGroup> hostGroup; 
        private Boolean initCustomHiveMetaDb; 
        private String instanceGeneration; 
        private Boolean ioOptimized; 
        private Boolean isOpenPublicIp; 
        private String keyPairName; 
        private String logPath; 
        private String machineType; 
        private String masterPwd; 
        private String metaStoreConf; 
        private String metaStoreType; 
        private String netType; 
        private java.util.List < String > optionSoftWareList; 
        private Integer period; 
        private String regionId; 
        private String resourceGroupId; 
        private Long resourceOwnerId; 
        private String securityGroupId; 
        private String securityGroupName; 
        private Boolean sshEnable; 
        private java.util.List < Tag> tag; 
        private String templateName; 
        private Boolean useCustomHiveMetaDb; 
        private Boolean useLocalMetaDb; 
        private String userDefinedEmrEcsRole; 
        private String vSwitchId; 
        private String vpcId; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(CreateClusterTemplateRequest response) {
            super(response);
            this.autoRenew = response.autoRenew;
            this.bootstrapAction = response.bootstrapAction;
            this.clientToken = response.clientToken;
            this.clusterType = response.clusterType;
            this.config = response.config;
            this.configurations = response.configurations;
            this.depositType = response.depositType;
            this.easEnable = response.easEnable;
            this.emrVer = response.emrVer;
            this.highAvailabilityEnable = response.highAvailabilityEnable;
            this.hostGroup = response.hostGroup;
            this.initCustomHiveMetaDb = response.initCustomHiveMetaDb;
            this.instanceGeneration = response.instanceGeneration;
            this.ioOptimized = response.ioOptimized;
            this.isOpenPublicIp = response.isOpenPublicIp;
            this.keyPairName = response.keyPairName;
            this.logPath = response.logPath;
            this.machineType = response.machineType;
            this.masterPwd = response.masterPwd;
            this.metaStoreConf = response.metaStoreConf;
            this.metaStoreType = response.metaStoreType;
            this.netType = response.netType;
            this.optionSoftWareList = response.optionSoftWareList;
            this.period = response.period;
            this.regionId = response.regionId;
            this.resourceGroupId = response.resourceGroupId;
            this.resourceOwnerId = response.resourceOwnerId;
            this.securityGroupId = response.securityGroupId;
            this.securityGroupName = response.securityGroupName;
            this.sshEnable = response.sshEnable;
            this.tag = response.tag;
            this.templateName = response.templateName;
            this.useCustomHiveMetaDb = response.useCustomHiveMetaDb;
            this.useLocalMetaDb = response.useLocalMetaDb;
            this.userDefinedEmrEcsRole = response.userDefinedEmrEcsRole;
            this.vSwitchId = response.vSwitchId;
            this.vpcId = response.vpcId;
            this.zoneId = response.zoneId;
        } 

        /**
         * AutoRenew.
         */
        public Builder autoRenew(Boolean autoRenew) {
            this.putQueryParameter("AutoRenew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
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
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
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
         * DepositType.
         */
        public Builder depositType(String depositType) {
            this.putQueryParameter("DepositType", depositType);
            this.depositType = depositType;
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
         * HostGroup.
         */
        public Builder hostGroup(java.util.List < HostGroup> hostGroup) {
            this.putQueryParameter("HostGroup", hostGroup);
            this.hostGroup = hostGroup;
            return this;
        }

        /**
         * InitCustomHiveMetaDb.
         */
        public Builder initCustomHiveMetaDb(Boolean initCustomHiveMetaDb) {
            this.putQueryParameter("InitCustomHiveMetaDb", initCustomHiveMetaDb);
            this.initCustomHiveMetaDb = initCustomHiveMetaDb;
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
         * KeyPairName.
         */
        public Builder keyPairName(String keyPairName) {
            this.putQueryParameter("KeyPairName", keyPairName);
            this.keyPairName = keyPairName;
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
         * MachineType.
         */
        public Builder machineType(String machineType) {
            this.putQueryParameter("MachineType", machineType);
            this.machineType = machineType;
            return this;
        }

        /**
         * MasterPwd.
         */
        public Builder masterPwd(String masterPwd) {
            this.putQueryParameter("MasterPwd", masterPwd);
            this.masterPwd = masterPwd;
            return this;
        }

        /**
         * MetaStoreConf.
         */
        public Builder metaStoreConf(String metaStoreConf) {
            this.putQueryParameter("MetaStoreConf", metaStoreConf);
            this.metaStoreConf = metaStoreConf;
            return this;
        }

        /**
         * MetaStoreType.
         */
        public Builder metaStoreType(String metaStoreType) {
            this.putQueryParameter("MetaStoreType", metaStoreType);
            this.metaStoreType = metaStoreType;
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
         * Period.
         */
        public Builder period(Integer period) {
            this.putQueryParameter("Period", period);
            this.period = period;
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
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
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
         * SecurityGroupName.
         */
        public Builder securityGroupName(String securityGroupName) {
            this.putQueryParameter("SecurityGroupName", securityGroupName);
            this.securityGroupName = securityGroupName;
            return this;
        }

        /**
         * SshEnable.
         */
        public Builder sshEnable(Boolean sshEnable) {
            this.putQueryParameter("SshEnable", sshEnable);
            this.sshEnable = sshEnable;
            return this;
        }

        /**
         * Tag.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * TemplateName.
         */
        public Builder templateName(String templateName) {
            this.putQueryParameter("TemplateName", templateName);
            this.templateName = templateName;
            return this;
        }

        /**
         * UseCustomHiveMetaDb.
         */
        public Builder useCustomHiveMetaDb(Boolean useCustomHiveMetaDb) {
            this.putQueryParameter("UseCustomHiveMetaDb", useCustomHiveMetaDb);
            this.useCustomHiveMetaDb = useCustomHiveMetaDb;
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
         * ZoneId.
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public CreateClusterTemplateRequest build() {
            return new CreateClusterTemplateRequest(this);
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
    public static class HostGroup extends TeaModel {
        @NameInMap("AutoRenew")
        private Boolean autoRenew;

        @NameInMap("ChargeType")
        private String chargeType;

        @NameInMap("ClusterId")
        private String clusterId;

        @NameInMap("Comment")
        private String comment;

        @NameInMap("CreateType")
        private String createType;

        @NameInMap("DiskCapacity")
        @Validation(required = true, maximum = 20000, minimum = 40)
        private Integer diskCapacity;

        @NameInMap("DiskCount")
        @Validation(required = true, maximum = 4, minimum = 1)
        private Integer diskCount;

        @NameInMap("DiskType")
        @Validation(required = true)
        private String diskType;

        @NameInMap("HostGroupId")
        private String hostGroupId;

        @NameInMap("HostGroupName")
        @Validation(required = true)
        private String hostGroupName;

        @NameInMap("HostGroupType")
        @Validation(required = true)
        private String hostGroupType;

        @NameInMap("InstanceType")
        @Validation(required = true)
        private String instanceType;

        @NameInMap("MultiInstanceTypes")
        private String multiInstanceTypes;

        @NameInMap("NodeCount")
        @Validation(required = true, maximum = 1000, minimum = 2)
        private Integer nodeCount;

        @NameInMap("Period")
        private Integer period;

        @NameInMap("PrivatePoolOptionsId")
        private String privatePoolOptionsId;

        @NameInMap("PrivatePoolOptionsMatchCriteria")
        private String privatePoolOptionsMatchCriteria;

        @NameInMap("SysDiskCapacity")
        @Validation(required = true, maximum = 500, minimum = 40)
        private Integer sysDiskCapacity;

        @NameInMap("SysDiskType")
        @Validation(required = true)
        private String sysDiskType;

        @NameInMap("VSwitchId")
        private String vSwitchId;

        private HostGroup(Builder builder) {
            this.autoRenew = builder.autoRenew;
            this.chargeType = builder.chargeType;
            this.clusterId = builder.clusterId;
            this.comment = builder.comment;
            this.createType = builder.createType;
            this.diskCapacity = builder.diskCapacity;
            this.diskCount = builder.diskCount;
            this.diskType = builder.diskType;
            this.hostGroupId = builder.hostGroupId;
            this.hostGroupName = builder.hostGroupName;
            this.hostGroupType = builder.hostGroupType;
            this.instanceType = builder.instanceType;
            this.multiInstanceTypes = builder.multiInstanceTypes;
            this.nodeCount = builder.nodeCount;
            this.period = builder.period;
            this.privatePoolOptionsId = builder.privatePoolOptionsId;
            this.privatePoolOptionsMatchCriteria = builder.privatePoolOptionsMatchCriteria;
            this.sysDiskCapacity = builder.sysDiskCapacity;
            this.sysDiskType = builder.sysDiskType;
            this.vSwitchId = builder.vSwitchId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HostGroup create() {
            return builder().build();
        }

        /**
         * @return autoRenew
         */
        public Boolean getAutoRenew() {
            return this.autoRenew;
        }

        /**
         * @return chargeType
         */
        public String getChargeType() {
            return this.chargeType;
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return createType
         */
        public String getCreateType() {
            return this.createType;
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
         * @return hostGroupId
         */
        public String getHostGroupId() {
            return this.hostGroupId;
        }

        /**
         * @return hostGroupName
         */
        public String getHostGroupName() {
            return this.hostGroupName;
        }

        /**
         * @return hostGroupType
         */
        public String getHostGroupType() {
            return this.hostGroupType;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return multiInstanceTypes
         */
        public String getMultiInstanceTypes() {
            return this.multiInstanceTypes;
        }

        /**
         * @return nodeCount
         */
        public Integer getNodeCount() {
            return this.nodeCount;
        }

        /**
         * @return period
         */
        public Integer getPeriod() {
            return this.period;
        }

        /**
         * @return privatePoolOptionsId
         */
        public String getPrivatePoolOptionsId() {
            return this.privatePoolOptionsId;
        }

        /**
         * @return privatePoolOptionsMatchCriteria
         */
        public String getPrivatePoolOptionsMatchCriteria() {
            return this.privatePoolOptionsMatchCriteria;
        }

        /**
         * @return sysDiskCapacity
         */
        public Integer getSysDiskCapacity() {
            return this.sysDiskCapacity;
        }

        /**
         * @return sysDiskType
         */
        public String getSysDiskType() {
            return this.sysDiskType;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public static final class Builder {
            private Boolean autoRenew; 
            private String chargeType; 
            private String clusterId; 
            private String comment; 
            private String createType; 
            private Integer diskCapacity; 
            private Integer diskCount; 
            private String diskType; 
            private String hostGroupId; 
            private String hostGroupName; 
            private String hostGroupType; 
            private String instanceType; 
            private String multiInstanceTypes; 
            private Integer nodeCount; 
            private Integer period; 
            private String privatePoolOptionsId; 
            private String privatePoolOptionsMatchCriteria; 
            private Integer sysDiskCapacity; 
            private String sysDiskType; 
            private String vSwitchId; 

            /**
             * AutoRenew.
             */
            public Builder autoRenew(Boolean autoRenew) {
                this.autoRenew = autoRenew;
                return this;
            }

            /**
             * ChargeType.
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
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
             * Comment.
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * CreateType.
             */
            public Builder createType(String createType) {
                this.createType = createType;
                return this;
            }

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
             * HostGroupId.
             */
            public Builder hostGroupId(String hostGroupId) {
                this.hostGroupId = hostGroupId;
                return this;
            }

            /**
             * HostGroupName.
             */
            public Builder hostGroupName(String hostGroupName) {
                this.hostGroupName = hostGroupName;
                return this;
            }

            /**
             * HostGroupType.
             */
            public Builder hostGroupType(String hostGroupType) {
                this.hostGroupType = hostGroupType;
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
             * MultiInstanceTypes.
             */
            public Builder multiInstanceTypes(String multiInstanceTypes) {
                this.multiInstanceTypes = multiInstanceTypes;
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
             * Period.
             */
            public Builder period(Integer period) {
                this.period = period;
                return this;
            }

            /**
             * PrivatePoolOptionsId.
             */
            public Builder privatePoolOptionsId(String privatePoolOptionsId) {
                this.privatePoolOptionsId = privatePoolOptionsId;
                return this;
            }

            /**
             * PrivatePoolOptionsMatchCriteria.
             */
            public Builder privatePoolOptionsMatchCriteria(String privatePoolOptionsMatchCriteria) {
                this.privatePoolOptionsMatchCriteria = privatePoolOptionsMatchCriteria;
                return this;
            }

            /**
             * SysDiskCapacity.
             */
            public Builder sysDiskCapacity(Integer sysDiskCapacity) {
                this.sysDiskCapacity = sysDiskCapacity;
                return this;
            }

            /**
             * SysDiskType.
             */
            public Builder sysDiskType(String sysDiskType) {
                this.sysDiskType = sysDiskType;
                return this;
            }

            /**
             * VSwitchId.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            public HostGroup build() {
                return new HostGroup(this);
            } 

        } 

    }
    public static class Tag extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
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

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
