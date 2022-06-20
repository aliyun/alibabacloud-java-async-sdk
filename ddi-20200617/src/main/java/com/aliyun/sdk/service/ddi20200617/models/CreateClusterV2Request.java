// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddi20200617.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateClusterV2Request} extends {@link RequestModel}
 *
 * <p>CreateClusterV2Request</p>
 */
public class CreateClusterV2Request extends Request {
    @Query
    @NameInMap("AuthorizeContent")
    private String authorizeContent;

    @Query
    @NameInMap("Auto")
    private Boolean auto;

    @Query
    @NameInMap("AutoPayOrder")
    private Boolean autoPayOrder;

    @Query
    @NameInMap("BootstrapAction")
    private java.util.List < BootstrapAction> bootstrapAction;

    @Query
    @NameInMap("ChargeType")
    private String chargeType;

    @Query
    @NameInMap("ClickHouseConf")
    private String clickHouseConf;

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
    @NameInMap("EmrVer")
    @Validation(required = true)
    private String emrVer;

    @Query
    @NameInMap("EnableEas")
    private Boolean enableEas;

    @Query
    @NameInMap("EnableHighAvailability")
    private Boolean enableHighAvailability;

    @Query
    @NameInMap("EnableSsh")
    private Boolean enableSsh;

    @Query
    @NameInMap("ExtraAttributes")
    private String extraAttributes;

    @Query
    @NameInMap("HostComponentInfo")
    private java.util.List < HostComponentInfo> hostComponentInfo;

    @Query
    @NameInMap("HostGroup")
    @Validation(required = true)
    private java.util.List < HostGroup> hostGroup;

    @Query
    @NameInMap("InitCustomHiveMetaDB")
    private Boolean initCustomHiveMetaDB;

    @Query
    @NameInMap("InstanceGeneration")
    private String instanceGeneration;

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
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("NetType")
    private String netType;

    @Query
    @NameInMap("Period")
    @Validation(maximum = 36, minimum = 1)
    private Integer period;

    @Query
    @NameInMap("PromotionInfo")
    private java.util.List < PromotionInfo> promotionInfo;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("RelatedClusterId")
    private String relatedClusterId;

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
    @NameInMap("ServiceInfo")
    private java.util.List < ServiceInfo> serviceInfo;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

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
    @NameInMap("UserInfo")
    private java.util.List < UserInfo> userInfo;

    @Query
    @NameInMap("VSwitchId")
    private String vSwitchId;

    @Query
    @NameInMap("VpcId")
    private String vpcId;

    @Query
    @NameInMap("WhiteListType")
    private String whiteListType;

    @Query
    @NameInMap("ZoneId")
    @Validation(required = true)
    private String zoneId;

    private CreateClusterV2Request(Builder builder) {
        super(builder);
        this.authorizeContent = builder.authorizeContent;
        this.auto = builder.auto;
        this.autoPayOrder = builder.autoPayOrder;
        this.bootstrapAction = builder.bootstrapAction;
        this.chargeType = builder.chargeType;
        this.clickHouseConf = builder.clickHouseConf;
        this.clientToken = builder.clientToken;
        this.clusterType = builder.clusterType;
        this.config = builder.config;
        this.configurations = builder.configurations;
        this.depositType = builder.depositType;
        this.emrVer = builder.emrVer;
        this.enableEas = builder.enableEas;
        this.enableHighAvailability = builder.enableHighAvailability;
        this.enableSsh = builder.enableSsh;
        this.extraAttributes = builder.extraAttributes;
        this.hostComponentInfo = builder.hostComponentInfo;
        this.hostGroup = builder.hostGroup;
        this.initCustomHiveMetaDB = builder.initCustomHiveMetaDB;
        this.instanceGeneration = builder.instanceGeneration;
        this.isOpenPublicIp = builder.isOpenPublicIp;
        this.keyPairName = builder.keyPairName;
        this.logPath = builder.logPath;
        this.machineType = builder.machineType;
        this.masterPwd = builder.masterPwd;
        this.metaStoreConf = builder.metaStoreConf;
        this.metaStoreType = builder.metaStoreType;
        this.name = builder.name;
        this.netType = builder.netType;
        this.period = builder.period;
        this.promotionInfo = builder.promotionInfo;
        this.regionId = builder.regionId;
        this.relatedClusterId = builder.relatedClusterId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.securityGroupId = builder.securityGroupId;
        this.securityGroupName = builder.securityGroupName;
        this.serviceInfo = builder.serviceInfo;
        this.tag = builder.tag;
        this.useCustomHiveMetaDB = builder.useCustomHiveMetaDB;
        this.useLocalMetaDb = builder.useLocalMetaDb;
        this.userDefinedEmrEcsRole = builder.userDefinedEmrEcsRole;
        this.userInfo = builder.userInfo;
        this.vSwitchId = builder.vSwitchId;
        this.vpcId = builder.vpcId;
        this.whiteListType = builder.whiteListType;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateClusterV2Request create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authorizeContent
     */
    public String getAuthorizeContent() {
        return this.authorizeContent;
    }

    /**
     * @return auto
     */
    public Boolean getAuto() {
        return this.auto;
    }

    /**
     * @return autoPayOrder
     */
    public Boolean getAutoPayOrder() {
        return this.autoPayOrder;
    }

    /**
     * @return bootstrapAction
     */
    public java.util.List < BootstrapAction> getBootstrapAction() {
        return this.bootstrapAction;
    }

    /**
     * @return chargeType
     */
    public String getChargeType() {
        return this.chargeType;
    }

    /**
     * @return clickHouseConf
     */
    public String getClickHouseConf() {
        return this.clickHouseConf;
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
     * @return emrVer
     */
    public String getEmrVer() {
        return this.emrVer;
    }

    /**
     * @return enableEas
     */
    public Boolean getEnableEas() {
        return this.enableEas;
    }

    /**
     * @return enableHighAvailability
     */
    public Boolean getEnableHighAvailability() {
        return this.enableHighAvailability;
    }

    /**
     * @return enableSsh
     */
    public Boolean getEnableSsh() {
        return this.enableSsh;
    }

    /**
     * @return extraAttributes
     */
    public String getExtraAttributes() {
        return this.extraAttributes;
    }

    /**
     * @return hostComponentInfo
     */
    public java.util.List < HostComponentInfo> getHostComponentInfo() {
        return this.hostComponentInfo;
    }

    /**
     * @return hostGroup
     */
    public java.util.List < HostGroup> getHostGroup() {
        return this.hostGroup;
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
     * @return period
     */
    public Integer getPeriod() {
        return this.period;
    }

    /**
     * @return promotionInfo
     */
    public java.util.List < PromotionInfo> getPromotionInfo() {
        return this.promotionInfo;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return relatedClusterId
     */
    public String getRelatedClusterId() {
        return this.relatedClusterId;
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
     * @return serviceInfo
     */
    public java.util.List < ServiceInfo> getServiceInfo() {
        return this.serviceInfo;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
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
     * @return userInfo
     */
    public java.util.List < UserInfo> getUserInfo() {
        return this.userInfo;
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
     * @return whiteListType
     */
    public String getWhiteListType() {
        return this.whiteListType;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<CreateClusterV2Request, Builder> {
        private String authorizeContent; 
        private Boolean auto; 
        private Boolean autoPayOrder; 
        private java.util.List < BootstrapAction> bootstrapAction; 
        private String chargeType; 
        private String clickHouseConf; 
        private String clientToken; 
        private String clusterType; 
        private java.util.List < Config> config; 
        private String configurations; 
        private String depositType; 
        private String emrVer; 
        private Boolean enableEas; 
        private Boolean enableHighAvailability; 
        private Boolean enableSsh; 
        private String extraAttributes; 
        private java.util.List < HostComponentInfo> hostComponentInfo; 
        private java.util.List < HostGroup> hostGroup; 
        private Boolean initCustomHiveMetaDB; 
        private String instanceGeneration; 
        private Boolean isOpenPublicIp; 
        private String keyPairName; 
        private String logPath; 
        private String machineType; 
        private String masterPwd; 
        private String metaStoreConf; 
        private String metaStoreType; 
        private String name; 
        private String netType; 
        private Integer period; 
        private java.util.List < PromotionInfo> promotionInfo; 
        private String regionId; 
        private String relatedClusterId; 
        private String resourceGroupId; 
        private Long resourceOwnerId; 
        private String securityGroupId; 
        private String securityGroupName; 
        private java.util.List < ServiceInfo> serviceInfo; 
        private java.util.List < Tag> tag; 
        private Boolean useCustomHiveMetaDB; 
        private Boolean useLocalMetaDb; 
        private String userDefinedEmrEcsRole; 
        private java.util.List < UserInfo> userInfo; 
        private String vSwitchId; 
        private String vpcId; 
        private String whiteListType; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(CreateClusterV2Request request) {
            super(request);
            this.authorizeContent = request.authorizeContent;
            this.auto = request.auto;
            this.autoPayOrder = request.autoPayOrder;
            this.bootstrapAction = request.bootstrapAction;
            this.chargeType = request.chargeType;
            this.clickHouseConf = request.clickHouseConf;
            this.clientToken = request.clientToken;
            this.clusterType = request.clusterType;
            this.config = request.config;
            this.configurations = request.configurations;
            this.depositType = request.depositType;
            this.emrVer = request.emrVer;
            this.enableEas = request.enableEas;
            this.enableHighAvailability = request.enableHighAvailability;
            this.enableSsh = request.enableSsh;
            this.extraAttributes = request.extraAttributes;
            this.hostComponentInfo = request.hostComponentInfo;
            this.hostGroup = request.hostGroup;
            this.initCustomHiveMetaDB = request.initCustomHiveMetaDB;
            this.instanceGeneration = request.instanceGeneration;
            this.isOpenPublicIp = request.isOpenPublicIp;
            this.keyPairName = request.keyPairName;
            this.logPath = request.logPath;
            this.machineType = request.machineType;
            this.masterPwd = request.masterPwd;
            this.metaStoreConf = request.metaStoreConf;
            this.metaStoreType = request.metaStoreType;
            this.name = request.name;
            this.netType = request.netType;
            this.period = request.period;
            this.promotionInfo = request.promotionInfo;
            this.regionId = request.regionId;
            this.relatedClusterId = request.relatedClusterId;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerId = request.resourceOwnerId;
            this.securityGroupId = request.securityGroupId;
            this.securityGroupName = request.securityGroupName;
            this.serviceInfo = request.serviceInfo;
            this.tag = request.tag;
            this.useCustomHiveMetaDB = request.useCustomHiveMetaDB;
            this.useLocalMetaDb = request.useLocalMetaDb;
            this.userDefinedEmrEcsRole = request.userDefinedEmrEcsRole;
            this.userInfo = request.userInfo;
            this.vSwitchId = request.vSwitchId;
            this.vpcId = request.vpcId;
            this.whiteListType = request.whiteListType;
            this.zoneId = request.zoneId;
        } 

        /**
         * AuthorizeContent.
         */
        public Builder authorizeContent(String authorizeContent) {
            this.putQueryParameter("AuthorizeContent", authorizeContent);
            this.authorizeContent = authorizeContent;
            return this;
        }

        /**
         * Auto.
         */
        public Builder auto(Boolean auto) {
            this.putQueryParameter("Auto", auto);
            this.auto = auto;
            return this;
        }

        /**
         * AutoPayOrder.
         */
        public Builder autoPayOrder(Boolean autoPayOrder) {
            this.putQueryParameter("AutoPayOrder", autoPayOrder);
            this.autoPayOrder = autoPayOrder;
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
         * ChargeType.
         */
        public Builder chargeType(String chargeType) {
            this.putQueryParameter("ChargeType", chargeType);
            this.chargeType = chargeType;
            return this;
        }

        /**
         * ClickHouseConf.
         */
        public Builder clickHouseConf(String clickHouseConf) {
            this.putQueryParameter("ClickHouseConf", clickHouseConf);
            this.clickHouseConf = clickHouseConf;
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
         * EmrVer.
         */
        public Builder emrVer(String emrVer) {
            this.putQueryParameter("EmrVer", emrVer);
            this.emrVer = emrVer;
            return this;
        }

        /**
         * EnableEas.
         */
        public Builder enableEas(Boolean enableEas) {
            this.putQueryParameter("EnableEas", enableEas);
            this.enableEas = enableEas;
            return this;
        }

        /**
         * EnableHighAvailability.
         */
        public Builder enableHighAvailability(Boolean enableHighAvailability) {
            this.putQueryParameter("EnableHighAvailability", enableHighAvailability);
            this.enableHighAvailability = enableHighAvailability;
            return this;
        }

        /**
         * EnableSsh.
         */
        public Builder enableSsh(Boolean enableSsh) {
            this.putQueryParameter("EnableSsh", enableSsh);
            this.enableSsh = enableSsh;
            return this;
        }

        /**
         * ExtraAttributes.
         */
        public Builder extraAttributes(String extraAttributes) {
            this.putQueryParameter("ExtraAttributes", extraAttributes);
            this.extraAttributes = extraAttributes;
            return this;
        }

        /**
         * HostComponentInfo.
         */
        public Builder hostComponentInfo(java.util.List < HostComponentInfo> hostComponentInfo) {
            this.putQueryParameter("HostComponentInfo", hostComponentInfo);
            this.hostComponentInfo = hostComponentInfo;
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
         * Period.
         */
        public Builder period(Integer period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * PromotionInfo.
         */
        public Builder promotionInfo(java.util.List < PromotionInfo> promotionInfo) {
            this.putQueryParameter("PromotionInfo", promotionInfo);
            this.promotionInfo = promotionInfo;
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
         * RelatedClusterId.
         */
        public Builder relatedClusterId(String relatedClusterId) {
            this.putQueryParameter("RelatedClusterId", relatedClusterId);
            this.relatedClusterId = relatedClusterId;
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
         * ServiceInfo.
         */
        public Builder serviceInfo(java.util.List < ServiceInfo> serviceInfo) {
            this.putQueryParameter("ServiceInfo", serviceInfo);
            this.serviceInfo = serviceInfo;
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
         * UserInfo.
         */
        public Builder userInfo(java.util.List < UserInfo> userInfo) {
            this.putQueryParameter("UserInfo", userInfo);
            this.userInfo = userInfo;
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
         * WhiteListType.
         */
        public Builder whiteListType(String whiteListType) {
            this.putQueryParameter("WhiteListType", whiteListType);
            this.whiteListType = whiteListType;
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
        public CreateClusterV2Request build() {
            return new CreateClusterV2Request(this);
        } 

    } 

    public static class BootstrapAction extends TeaModel {
        @NameInMap("Arg")
        private String arg;

        @NameInMap("Name")
        @Validation(required = true)
        private String name;

        @NameInMap("Path")
        @Validation(required = true)
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
    public static class HostComponentInfo extends TeaModel {
        @NameInMap("ComponentNameList")
        private java.util.List < String > componentNameList;

        @NameInMap("HostName")
        private String hostName;

        @NameInMap("ServiceName")
        private String serviceName;

        private HostComponentInfo(Builder builder) {
            this.componentNameList = builder.componentNameList;
            this.hostName = builder.hostName;
            this.serviceName = builder.serviceName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HostComponentInfo create() {
            return builder().build();
        }

        /**
         * @return componentNameList
         */
        public java.util.List < String > getComponentNameList() {
            return this.componentNameList;
        }

        /**
         * @return hostName
         */
        public String getHostName() {
            return this.hostName;
        }

        /**
         * @return serviceName
         */
        public String getServiceName() {
            return this.serviceName;
        }

        public static final class Builder {
            private java.util.List < String > componentNameList; 
            private String hostName; 
            private String serviceName; 

            /**
             * ComponentNameList.
             */
            public Builder componentNameList(java.util.List < String > componentNameList) {
                this.componentNameList = componentNameList;
                return this;
            }

            /**
             * HostName.
             */
            public Builder hostName(String hostName) {
                this.hostName = hostName;
                return this;
            }

            /**
             * ServiceName.
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            public HostComponentInfo build() {
                return new HostComponentInfo(this);
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

        @NameInMap("GpuDriver")
        private String gpuDriver;

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

        @NameInMap("NodeCount")
        @Validation(required = true, maximum = 1000, minimum = 2)
        private Integer nodeCount;

        @NameInMap("Period")
        private Integer period;

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
            this.gpuDriver = builder.gpuDriver;
            this.hostGroupId = builder.hostGroupId;
            this.hostGroupName = builder.hostGroupName;
            this.hostGroupType = builder.hostGroupType;
            this.instanceType = builder.instanceType;
            this.nodeCount = builder.nodeCount;
            this.period = builder.period;
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
         * @return gpuDriver
         */
        public String getGpuDriver() {
            return this.gpuDriver;
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
            private String gpuDriver; 
            private String hostGroupId; 
            private String hostGroupName; 
            private String hostGroupType; 
            private String instanceType; 
            private Integer nodeCount; 
            private Integer period; 
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
             * GpuDriver.
             */
            public Builder gpuDriver(String gpuDriver) {
                this.gpuDriver = gpuDriver;
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
    public static class PromotionInfo extends TeaModel {
        @NameInMap("ProductCode")
        private String productCode;

        @NameInMap("PromotionOptionCode")
        private String promotionOptionCode;

        @NameInMap("PromotionOptionNo")
        private String promotionOptionNo;

        private PromotionInfo(Builder builder) {
            this.productCode = builder.productCode;
            this.promotionOptionCode = builder.promotionOptionCode;
            this.promotionOptionNo = builder.promotionOptionNo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PromotionInfo create() {
            return builder().build();
        }

        /**
         * @return productCode
         */
        public String getProductCode() {
            return this.productCode;
        }

        /**
         * @return promotionOptionCode
         */
        public String getPromotionOptionCode() {
            return this.promotionOptionCode;
        }

        /**
         * @return promotionOptionNo
         */
        public String getPromotionOptionNo() {
            return this.promotionOptionNo;
        }

        public static final class Builder {
            private String productCode; 
            private String promotionOptionCode; 
            private String promotionOptionNo; 

            /**
             * ProductCode.
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            /**
             * PromotionOptionCode.
             */
            public Builder promotionOptionCode(String promotionOptionCode) {
                this.promotionOptionCode = promotionOptionCode;
                return this;
            }

            /**
             * PromotionOptionNo.
             */
            public Builder promotionOptionNo(String promotionOptionNo) {
                this.promotionOptionNo = promotionOptionNo;
                return this;
            }

            public PromotionInfo build() {
                return new PromotionInfo(this);
            } 

        } 

    }
    public static class ServiceInfo extends TeaModel {
        @NameInMap("ServiceName")
        private String serviceName;

        @NameInMap("ServiceVersion")
        private String serviceVersion;

        private ServiceInfo(Builder builder) {
            this.serviceName = builder.serviceName;
            this.serviceVersion = builder.serviceVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServiceInfo create() {
            return builder().build();
        }

        /**
         * @return serviceName
         */
        public String getServiceName() {
            return this.serviceName;
        }

        /**
         * @return serviceVersion
         */
        public String getServiceVersion() {
            return this.serviceVersion;
        }

        public static final class Builder {
            private String serviceName; 
            private String serviceVersion; 

            /**
             * ServiceName.
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            /**
             * ServiceVersion.
             */
            public Builder serviceVersion(String serviceVersion) {
                this.serviceVersion = serviceVersion;
                return this;
            }

            public ServiceInfo build() {
                return new ServiceInfo(this);
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
    public static class UserInfo extends TeaModel {
        @NameInMap("Password")
        @Validation(required = true)
        private String password;

        @NameInMap("UserId")
        @Validation(required = true)
        private String userId;

        @NameInMap("UserName")
        @Validation(required = true)
        private String userName;

        private UserInfo(Builder builder) {
            this.password = builder.password;
            this.userId = builder.userId;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserInfo create() {
            return builder().build();
        }

        /**
         * @return password
         */
        public String getPassword() {
            return this.password;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private String password; 
            private String userId; 
            private String userName; 

            /**
             * Password.
             */
            public Builder password(String password) {
                this.password = password;
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
             * UserName.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public UserInfo build() {
                return new UserInfo(this);
            } 

        } 

    }
}
