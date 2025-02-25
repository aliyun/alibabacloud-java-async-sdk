// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListClusterTemplatesResponseBody} extends {@link TeaModel}
 *
 * <p>ListClusterTemplatesResponseBody</p>
 */
public class ListClusterTemplatesResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TemplateInfoList")
    private TemplateInfoList templateInfoList;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListClusterTemplatesResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.templateInfoList = builder.templateInfoList;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListClusterTemplatesResponseBody create() {
        return builder().build();
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
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
     * @return templateInfoList
     */
    public TemplateInfoList getTemplateInfoList() {
        return this.templateInfoList;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private TemplateInfoList templateInfoList; 
        private Integer totalCount; 

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
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
         * TemplateInfoList.
         */
        public Builder templateInfoList(TemplateInfoList templateInfoList) {
            this.templateInfoList = templateInfoList;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListClusterTemplatesResponseBody build() {
            return new ListClusterTemplatesResponseBody(this);
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

        @NameInMap("Replace")
        private String replace;

        @NameInMap("ServiceName")
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
    public static class HostGroup extends TeaModel {
        @NameInMap("ChargeType")
        private String chargeType;

        @NameInMap("DiskCapacity")
        private Integer diskCapacity;

        @NameInMap("DiskCount")
        private Integer diskCount;

        @NameInMap("DiskType")
        private String diskType;

        @NameInMap("HostGroupId")
        private String hostGroupId;

        @NameInMap("HostGroupName")
        private String hostGroupName;

        @NameInMap("HostGroupType")
        private String hostGroupType;

        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("MultiInstanceTypes")
        private String multiInstanceTypes;

        @NameInMap("NodeCount")
        private Integer nodeCount;

        @NameInMap("Period")
        private String period;

        @NameInMap("SysDiskCapacity")
        private Integer sysDiskCapacity;

        @NameInMap("SysDiskType")
        private String sysDiskType;

        private HostGroup(Builder builder) {
            this.chargeType = builder.chargeType;
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
            this.sysDiskCapacity = builder.sysDiskCapacity;
            this.sysDiskType = builder.sysDiskType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HostGroup create() {
            return builder().build();
        }

        /**
         * @return chargeType
         */
        public String getChargeType() {
            return this.chargeType;
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
        public String getPeriod() {
            return this.period;
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

        public static final class Builder {
            private String chargeType; 
            private Integer diskCapacity; 
            private Integer diskCount; 
            private String diskType; 
            private String hostGroupId; 
            private String hostGroupName; 
            private String hostGroupType; 
            private String instanceType; 
            private String multiInstanceTypes; 
            private Integer nodeCount; 
            private String period; 
            private Integer sysDiskCapacity; 
            private String sysDiskType; 

            /**
             * ChargeType.
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
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
            public Builder period(String period) {
                this.period = period;
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

            public HostGroup build() {
                return new HostGroup(this);
            } 

        } 

    }
    public static class HostGroupList extends TeaModel {
        @NameInMap("HostGroup")
        private java.util.List < HostGroup> hostGroup;

        private HostGroupList(Builder builder) {
            this.hostGroup = builder.hostGroup;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HostGroupList create() {
            return builder().build();
        }

        /**
         * @return hostGroup
         */
        public java.util.List < HostGroup> getHostGroup() {
            return this.hostGroup;
        }

        public static final class Builder {
            private java.util.List < HostGroup> hostGroup; 

            /**
             * HostGroup.
             */
            public Builder hostGroup(java.util.List < HostGroup> hostGroup) {
                this.hostGroup = hostGroup;
                return this;
            }

            public HostGroupList build() {
                return new HostGroupList(this);
            } 

        } 

    }
    public static class SoftwareInfoList extends TeaModel {
        @NameInMap("SoftwareInfo")
        private java.util.List < String > softwareInfo;

        private SoftwareInfoList(Builder builder) {
            this.softwareInfo = builder.softwareInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SoftwareInfoList create() {
            return builder().build();
        }

        /**
         * @return softwareInfo
         */
        public java.util.List < String > getSoftwareInfo() {
            return this.softwareInfo;
        }

        public static final class Builder {
            private java.util.List < String > softwareInfo; 

            /**
             * SoftwareInfo.
             */
            public Builder softwareInfo(java.util.List < String > softwareInfo) {
                this.softwareInfo = softwareInfo;
                return this;
            }

            public SoftwareInfoList build() {
                return new SoftwareInfoList(this);
            } 

        } 

    }
    public static class TemplateInfo extends TeaModel {
        @NameInMap("AllowNotebook")
        private Boolean allowNotebook;

        @NameInMap("BootstrapActionList")
        private BootstrapActionList bootstrapActionList;

        @NameInMap("ClusterType")
        private String clusterType;

        @NameInMap("ConfigList")
        private ConfigList configList;

        @NameInMap("Configurations")
        private String configurations;

        @NameInMap("CreateSource")
        private String createSource;

        @NameInMap("DepositType")
        private String depositType;

        @NameInMap("EasEnable")
        private Boolean easEnable;

        @NameInMap("GmtCreate")
        private Long gmtCreate;

        @NameInMap("GmtModified")
        private Long gmtModified;

        @NameInMap("HighAvailabilityEnable")
        private Boolean highAvailabilityEnable;

        @NameInMap("HostGroupList")
        private HostGroupList hostGroupList;

        @NameInMap("Id")
        private String id;

        @NameInMap("InitCustomHiveMetaDb")
        private Boolean initCustomHiveMetaDb;

        @NameInMap("InstanceGeneration")
        private String instanceGeneration;

        @NameInMap("IoOptimized")
        private Boolean ioOptimized;

        @NameInMap("IsOpenPublicIp")
        private Boolean isOpenPublicIp;

        @NameInMap("KeyPairName")
        private String keyPairName;

        @NameInMap("LogEnable")
        private Boolean logEnable;

        @NameInMap("LogPath")
        private String logPath;

        @NameInMap("MachineType")
        private String machineType;

        @NameInMap("MasterNodeTotal")
        private Integer masterNodeTotal;

        @NameInMap("MetaStoreConf")
        private String metaStoreConf;

        @NameInMap("MetaStoreType")
        private String metaStoreType;

        @NameInMap("NetType")
        private String netType;

        @NameInMap("SecurityGroupId")
        private String securityGroupId;

        @NameInMap("SecurityGroupName")
        private String securityGroupName;

        @NameInMap("SoftwareInfoList")
        private SoftwareInfoList softwareInfoList;

        @NameInMap("SshEnable")
        private Boolean sshEnable;

        @NameInMap("TemplateName")
        private String templateName;

        @NameInMap("UseCustomHiveMetaDb")
        private Boolean useCustomHiveMetaDb;

        @NameInMap("UseLocalMetaDb")
        private Boolean useLocalMetaDb;

        @NameInMap("UserDefinedEmrEcsRole")
        private String userDefinedEmrEcsRole;

        @NameInMap("UserId")
        private String userId;

        @NameInMap("VSwitchId")
        private String vSwitchId;

        @NameInMap("VpcId")
        private String vpcId;

        @NameInMap("ZoneId")
        private String zoneId;

        private TemplateInfo(Builder builder) {
            this.allowNotebook = builder.allowNotebook;
            this.bootstrapActionList = builder.bootstrapActionList;
            this.clusterType = builder.clusterType;
            this.configList = builder.configList;
            this.configurations = builder.configurations;
            this.createSource = builder.createSource;
            this.depositType = builder.depositType;
            this.easEnable = builder.easEnable;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.highAvailabilityEnable = builder.highAvailabilityEnable;
            this.hostGroupList = builder.hostGroupList;
            this.id = builder.id;
            this.initCustomHiveMetaDb = builder.initCustomHiveMetaDb;
            this.instanceGeneration = builder.instanceGeneration;
            this.ioOptimized = builder.ioOptimized;
            this.isOpenPublicIp = builder.isOpenPublicIp;
            this.keyPairName = builder.keyPairName;
            this.logEnable = builder.logEnable;
            this.logPath = builder.logPath;
            this.machineType = builder.machineType;
            this.masterNodeTotal = builder.masterNodeTotal;
            this.metaStoreConf = builder.metaStoreConf;
            this.metaStoreType = builder.metaStoreType;
            this.netType = builder.netType;
            this.securityGroupId = builder.securityGroupId;
            this.securityGroupName = builder.securityGroupName;
            this.softwareInfoList = builder.softwareInfoList;
            this.sshEnable = builder.sshEnable;
            this.templateName = builder.templateName;
            this.useCustomHiveMetaDb = builder.useCustomHiveMetaDb;
            this.useLocalMetaDb = builder.useLocalMetaDb;
            this.userDefinedEmrEcsRole = builder.userDefinedEmrEcsRole;
            this.userId = builder.userId;
            this.vSwitchId = builder.vSwitchId;
            this.vpcId = builder.vpcId;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TemplateInfo create() {
            return builder().build();
        }

        /**
         * @return allowNotebook
         */
        public Boolean getAllowNotebook() {
            return this.allowNotebook;
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
         * @return createSource
         */
        public String getCreateSource() {
            return this.createSource;
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
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public Long getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return highAvailabilityEnable
         */
        public Boolean getHighAvailabilityEnable() {
            return this.highAvailabilityEnable;
        }

        /**
         * @return hostGroupList
         */
        public HostGroupList getHostGroupList() {
            return this.hostGroupList;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
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
         * @return machineType
         */
        public String getMachineType() {
            return this.machineType;
        }

        /**
         * @return masterNodeTotal
         */
        public Integer getMasterNodeTotal() {
            return this.masterNodeTotal;
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
         * @return softwareInfoList
         */
        public SoftwareInfoList getSoftwareInfoList() {
            return this.softwareInfoList;
        }

        /**
         * @return sshEnable
         */
        public Boolean getSshEnable() {
            return this.sshEnable;
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
         * @return userId
         */
        public String getUserId() {
            return this.userId;
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
            private Boolean allowNotebook; 
            private BootstrapActionList bootstrapActionList; 
            private String clusterType; 
            private ConfigList configList; 
            private String configurations; 
            private String createSource; 
            private String depositType; 
            private Boolean easEnable; 
            private Long gmtCreate; 
            private Long gmtModified; 
            private Boolean highAvailabilityEnable; 
            private HostGroupList hostGroupList; 
            private String id; 
            private Boolean initCustomHiveMetaDb; 
            private String instanceGeneration; 
            private Boolean ioOptimized; 
            private Boolean isOpenPublicIp; 
            private String keyPairName; 
            private Boolean logEnable; 
            private String logPath; 
            private String machineType; 
            private Integer masterNodeTotal; 
            private String metaStoreConf; 
            private String metaStoreType; 
            private String netType; 
            private String securityGroupId; 
            private String securityGroupName; 
            private SoftwareInfoList softwareInfoList; 
            private Boolean sshEnable; 
            private String templateName; 
            private Boolean useCustomHiveMetaDb; 
            private Boolean useLocalMetaDb; 
            private String userDefinedEmrEcsRole; 
            private String userId; 
            private String vSwitchId; 
            private String vpcId; 
            private String zoneId; 

            /**
             * AllowNotebook.
             */
            public Builder allowNotebook(Boolean allowNotebook) {
                this.allowNotebook = allowNotebook;
                return this;
            }

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
             * CreateSource.
             */
            public Builder createSource(String createSource) {
                this.createSource = createSource;
                return this;
            }

            /**
             * DepositType.
             */
            public Builder depositType(String depositType) {
                this.depositType = depositType;
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
             * GmtCreate.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
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
             * HostGroupList.
             */
            public Builder hostGroupList(HostGroupList hostGroupList) {
                this.hostGroupList = hostGroupList;
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
             * InitCustomHiveMetaDb.
             */
            public Builder initCustomHiveMetaDb(Boolean initCustomHiveMetaDb) {
                this.initCustomHiveMetaDb = initCustomHiveMetaDb;
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
             * IsOpenPublicIp.
             */
            public Builder isOpenPublicIp(Boolean isOpenPublicIp) {
                this.isOpenPublicIp = isOpenPublicIp;
                return this;
            }

            /**
             * KeyPairName.
             */
            public Builder keyPairName(String keyPairName) {
                this.keyPairName = keyPairName;
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
             * MachineType.
             */
            public Builder machineType(String machineType) {
                this.machineType = machineType;
                return this;
            }

            /**
             * MasterNodeTotal.
             */
            public Builder masterNodeTotal(Integer masterNodeTotal) {
                this.masterNodeTotal = masterNodeTotal;
                return this;
            }

            /**
             * MetaStoreConf.
             */
            public Builder metaStoreConf(String metaStoreConf) {
                this.metaStoreConf = metaStoreConf;
                return this;
            }

            /**
             * MetaStoreType.
             */
            public Builder metaStoreType(String metaStoreType) {
                this.metaStoreType = metaStoreType;
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
             * SecurityGroupName.
             */
            public Builder securityGroupName(String securityGroupName) {
                this.securityGroupName = securityGroupName;
                return this;
            }

            /**
             * SoftwareInfoList.
             */
            public Builder softwareInfoList(SoftwareInfoList softwareInfoList) {
                this.softwareInfoList = softwareInfoList;
                return this;
            }

            /**
             * SshEnable.
             */
            public Builder sshEnable(Boolean sshEnable) {
                this.sshEnable = sshEnable;
                return this;
            }

            /**
             * TemplateName.
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            /**
             * UseCustomHiveMetaDb.
             */
            public Builder useCustomHiveMetaDb(Boolean useCustomHiveMetaDb) {
                this.useCustomHiveMetaDb = useCustomHiveMetaDb;
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
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
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
             * VPC ID。
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

            public TemplateInfo build() {
                return new TemplateInfo(this);
            } 

        } 

    }
    public static class TemplateInfoList extends TeaModel {
        @NameInMap("TemplateInfo")
        private java.util.List < TemplateInfo> templateInfo;

        private TemplateInfoList(Builder builder) {
            this.templateInfo = builder.templateInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TemplateInfoList create() {
            return builder().build();
        }

        /**
         * @return templateInfo
         */
        public java.util.List < TemplateInfo> getTemplateInfo() {
            return this.templateInfo;
        }

        public static final class Builder {
            private java.util.List < TemplateInfo> templateInfo; 

            /**
             * TemplateInfo.
             */
            public Builder templateInfo(java.util.List < TemplateInfo> templateInfo) {
                this.templateInfo = templateInfo;
                return this;
            }

            public TemplateInfoList build() {
                return new TemplateInfoList(this);
            } 

        } 

    }
}
