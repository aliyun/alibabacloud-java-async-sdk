// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hitsdb20200615.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetLindormInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>GetLindormInstanceResponseBody</p>
 */
public class GetLindormInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AliUid")
    private Long aliUid;

    @com.aliyun.core.annotation.NameInMap("ArbiterVSwitchId")
    private String arbiterVSwitchId;

    @com.aliyun.core.annotation.NameInMap("ArbiterZoneId")
    private String arbiterZoneId;

    @com.aliyun.core.annotation.NameInMap("ArchVersion")
    private String archVersion;

    @com.aliyun.core.annotation.NameInMap("AutoRenew")
    private Boolean autoRenew;

    @com.aliyun.core.annotation.NameInMap("ColdStorage")
    private Integer coldStorage;

    @com.aliyun.core.annotation.NameInMap("CoreDiskCategory")
    private String coreDiskCategory;

    @com.aliyun.core.annotation.NameInMap("CoreNum")
    private Integer coreNum;

    @com.aliyun.core.annotation.NameInMap("CoreSingleStorage")
    private Integer coreSingleStorage;

    @com.aliyun.core.annotation.NameInMap("CoreSpec")
    private String coreSpec;

    @com.aliyun.core.annotation.NameInMap("CreateMilliseconds")
    private Long createMilliseconds;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("DeletionProtection")
    private String deletionProtection;

    @com.aliyun.core.annotation.NameInMap("DiskCategory")
    private String diskCategory;

    @com.aliyun.core.annotation.NameInMap("DiskThreshold")
    private String diskThreshold;

    @com.aliyun.core.annotation.NameInMap("DiskUsage")
    private String diskUsage;

    @com.aliyun.core.annotation.NameInMap("EnableBlob")
    private Boolean enableBlob;

    @com.aliyun.core.annotation.NameInMap("EnableCdc")
    private Boolean enableCdc;

    @com.aliyun.core.annotation.NameInMap("EnableCompute")
    private Boolean enableCompute;

    @com.aliyun.core.annotation.NameInMap("EnableKms")
    private Boolean enableKms;

    @com.aliyun.core.annotation.NameInMap("EnableLTS")
    private Boolean enableLTS;

    @com.aliyun.core.annotation.NameInMap("EnableLsqlVersionV3")
    private Boolean enableLsqlVersionV3;

    @com.aliyun.core.annotation.NameInMap("EnableMLCtrl")
    private Boolean enableMLCtrl;

    @com.aliyun.core.annotation.NameInMap("EnableSSL")
    private Boolean enableSSL;

    @com.aliyun.core.annotation.NameInMap("EnableShs")
    private Boolean enableShs;

    @com.aliyun.core.annotation.NameInMap("EnableStream")
    private Boolean enableStream;

    @com.aliyun.core.annotation.NameInMap("EngineList")
    private java.util.List < EngineList> engineList;

    @com.aliyun.core.annotation.NameInMap("EngineType")
    private Integer engineType;

    @com.aliyun.core.annotation.NameInMap("ExpireTime")
    private String expireTime;

    @com.aliyun.core.annotation.NameInMap("ExpiredMilliseconds")
    private Long expiredMilliseconds;

    @com.aliyun.core.annotation.NameInMap("InstanceAlias")
    private String instanceAlias;

    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("InstanceStatus")
    private String instanceStatus;

    @com.aliyun.core.annotation.NameInMap("InstanceStorage")
    private String instanceStorage;

    @com.aliyun.core.annotation.NameInMap("LogDiskCategory")
    private String logDiskCategory;

    @com.aliyun.core.annotation.NameInMap("LogNum")
    private Integer logNum;

    @com.aliyun.core.annotation.NameInMap("LogSingleStorage")
    private Integer logSingleStorage;

    @com.aliyun.core.annotation.NameInMap("LogSpec")
    private String logSpec;

    @com.aliyun.core.annotation.NameInMap("MaintainEndTime")
    private String maintainEndTime;

    @com.aliyun.core.annotation.NameInMap("MaintainStartTime")
    private String maintainStartTime;

    @com.aliyun.core.annotation.NameInMap("MultiZoneCombination")
    private String multiZoneCombination;

    @com.aliyun.core.annotation.NameInMap("NetworkType")
    private String networkType;

    @com.aliyun.core.annotation.NameInMap("PayType")
    private String payType;

    @com.aliyun.core.annotation.NameInMap("PrimaryVSwitchId")
    private String primaryVSwitchId;

    @com.aliyun.core.annotation.NameInMap("PrimaryZoneId")
    private String primaryZoneId;

    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.NameInMap("ServiceType")
    private String serviceType;

    @com.aliyun.core.annotation.NameInMap("StandbyVSwitchId")
    private String standbyVSwitchId;

    @com.aliyun.core.annotation.NameInMap("StandbyZoneId")
    private String standbyZoneId;

    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    @com.aliyun.core.annotation.NameInMap("VswitchId")
    private String vswitchId;

    @com.aliyun.core.annotation.NameInMap("ZoneId")
    private String zoneId;

    private GetLindormInstanceResponseBody(Builder builder) {
        this.aliUid = builder.aliUid;
        this.arbiterVSwitchId = builder.arbiterVSwitchId;
        this.arbiterZoneId = builder.arbiterZoneId;
        this.archVersion = builder.archVersion;
        this.autoRenew = builder.autoRenew;
        this.coldStorage = builder.coldStorage;
        this.coreDiskCategory = builder.coreDiskCategory;
        this.coreNum = builder.coreNum;
        this.coreSingleStorage = builder.coreSingleStorage;
        this.coreSpec = builder.coreSpec;
        this.createMilliseconds = builder.createMilliseconds;
        this.createTime = builder.createTime;
        this.deletionProtection = builder.deletionProtection;
        this.diskCategory = builder.diskCategory;
        this.diskThreshold = builder.diskThreshold;
        this.diskUsage = builder.diskUsage;
        this.enableBlob = builder.enableBlob;
        this.enableCdc = builder.enableCdc;
        this.enableCompute = builder.enableCompute;
        this.enableKms = builder.enableKms;
        this.enableLTS = builder.enableLTS;
        this.enableLsqlVersionV3 = builder.enableLsqlVersionV3;
        this.enableMLCtrl = builder.enableMLCtrl;
        this.enableSSL = builder.enableSSL;
        this.enableShs = builder.enableShs;
        this.enableStream = builder.enableStream;
        this.engineList = builder.engineList;
        this.engineType = builder.engineType;
        this.expireTime = builder.expireTime;
        this.expiredMilliseconds = builder.expiredMilliseconds;
        this.instanceAlias = builder.instanceAlias;
        this.instanceId = builder.instanceId;
        this.instanceStatus = builder.instanceStatus;
        this.instanceStorage = builder.instanceStorage;
        this.logDiskCategory = builder.logDiskCategory;
        this.logNum = builder.logNum;
        this.logSingleStorage = builder.logSingleStorage;
        this.logSpec = builder.logSpec;
        this.maintainEndTime = builder.maintainEndTime;
        this.maintainStartTime = builder.maintainStartTime;
        this.multiZoneCombination = builder.multiZoneCombination;
        this.networkType = builder.networkType;
        this.payType = builder.payType;
        this.primaryVSwitchId = builder.primaryVSwitchId;
        this.primaryZoneId = builder.primaryZoneId;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.resourceGroupId = builder.resourceGroupId;
        this.serviceType = builder.serviceType;
        this.standbyVSwitchId = builder.standbyVSwitchId;
        this.standbyZoneId = builder.standbyZoneId;
        this.vpcId = builder.vpcId;
        this.vswitchId = builder.vswitchId;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLindormInstanceResponseBody create() {
        return builder().build();
    }

    /**
     * @return aliUid
     */
    public Long getAliUid() {
        return this.aliUid;
    }

    /**
     * @return arbiterVSwitchId
     */
    public String getArbiterVSwitchId() {
        return this.arbiterVSwitchId;
    }

    /**
     * @return arbiterZoneId
     */
    public String getArbiterZoneId() {
        return this.arbiterZoneId;
    }

    /**
     * @return archVersion
     */
    public String getArchVersion() {
        return this.archVersion;
    }

    /**
     * @return autoRenew
     */
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    /**
     * @return coldStorage
     */
    public Integer getColdStorage() {
        return this.coldStorage;
    }

    /**
     * @return coreDiskCategory
     */
    public String getCoreDiskCategory() {
        return this.coreDiskCategory;
    }

    /**
     * @return coreNum
     */
    public Integer getCoreNum() {
        return this.coreNum;
    }

    /**
     * @return coreSingleStorage
     */
    public Integer getCoreSingleStorage() {
        return this.coreSingleStorage;
    }

    /**
     * @return coreSpec
     */
    public String getCoreSpec() {
        return this.coreSpec;
    }

    /**
     * @return createMilliseconds
     */
    public Long getCreateMilliseconds() {
        return this.createMilliseconds;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return deletionProtection
     */
    public String getDeletionProtection() {
        return this.deletionProtection;
    }

    /**
     * @return diskCategory
     */
    public String getDiskCategory() {
        return this.diskCategory;
    }

    /**
     * @return diskThreshold
     */
    public String getDiskThreshold() {
        return this.diskThreshold;
    }

    /**
     * @return diskUsage
     */
    public String getDiskUsage() {
        return this.diskUsage;
    }

    /**
     * @return enableBlob
     */
    public Boolean getEnableBlob() {
        return this.enableBlob;
    }

    /**
     * @return enableCdc
     */
    public Boolean getEnableCdc() {
        return this.enableCdc;
    }

    /**
     * @return enableCompute
     */
    public Boolean getEnableCompute() {
        return this.enableCompute;
    }

    /**
     * @return enableKms
     */
    public Boolean getEnableKms() {
        return this.enableKms;
    }

    /**
     * @return enableLTS
     */
    public Boolean getEnableLTS() {
        return this.enableLTS;
    }

    /**
     * @return enableLsqlVersionV3
     */
    public Boolean getEnableLsqlVersionV3() {
        return this.enableLsqlVersionV3;
    }

    /**
     * @return enableMLCtrl
     */
    public Boolean getEnableMLCtrl() {
        return this.enableMLCtrl;
    }

    /**
     * @return enableSSL
     */
    public Boolean getEnableSSL() {
        return this.enableSSL;
    }

    /**
     * @return enableShs
     */
    public Boolean getEnableShs() {
        return this.enableShs;
    }

    /**
     * @return enableStream
     */
    public Boolean getEnableStream() {
        return this.enableStream;
    }

    /**
     * @return engineList
     */
    public java.util.List < EngineList> getEngineList() {
        return this.engineList;
    }

    /**
     * @return engineType
     */
    public Integer getEngineType() {
        return this.engineType;
    }

    /**
     * @return expireTime
     */
    public String getExpireTime() {
        return this.expireTime;
    }

    /**
     * @return expiredMilliseconds
     */
    public Long getExpiredMilliseconds() {
        return this.expiredMilliseconds;
    }

    /**
     * @return instanceAlias
     */
    public String getInstanceAlias() {
        return this.instanceAlias;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceStatus
     */
    public String getInstanceStatus() {
        return this.instanceStatus;
    }

    /**
     * @return instanceStorage
     */
    public String getInstanceStorage() {
        return this.instanceStorage;
    }

    /**
     * @return logDiskCategory
     */
    public String getLogDiskCategory() {
        return this.logDiskCategory;
    }

    /**
     * @return logNum
     */
    public Integer getLogNum() {
        return this.logNum;
    }

    /**
     * @return logSingleStorage
     */
    public Integer getLogSingleStorage() {
        return this.logSingleStorage;
    }

    /**
     * @return logSpec
     */
    public String getLogSpec() {
        return this.logSpec;
    }

    /**
     * @return maintainEndTime
     */
    public String getMaintainEndTime() {
        return this.maintainEndTime;
    }

    /**
     * @return maintainStartTime
     */
    public String getMaintainStartTime() {
        return this.maintainStartTime;
    }

    /**
     * @return multiZoneCombination
     */
    public String getMultiZoneCombination() {
        return this.multiZoneCombination;
    }

    /**
     * @return networkType
     */
    public String getNetworkType() {
        return this.networkType;
    }

    /**
     * @return payType
     */
    public String getPayType() {
        return this.payType;
    }

    /**
     * @return primaryVSwitchId
     */
    public String getPrimaryVSwitchId() {
        return this.primaryVSwitchId;
    }

    /**
     * @return primaryZoneId
     */
    public String getPrimaryZoneId() {
        return this.primaryZoneId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return serviceType
     */
    public String getServiceType() {
        return this.serviceType;
    }

    /**
     * @return standbyVSwitchId
     */
    public String getStandbyVSwitchId() {
        return this.standbyVSwitchId;
    }

    /**
     * @return standbyZoneId
     */
    public String getStandbyZoneId() {
        return this.standbyZoneId;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * @return vswitchId
     */
    public String getVswitchId() {
        return this.vswitchId;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder {
        private Long aliUid; 
        private String arbiterVSwitchId; 
        private String arbiterZoneId; 
        private String archVersion; 
        private Boolean autoRenew; 
        private Integer coldStorage; 
        private String coreDiskCategory; 
        private Integer coreNum; 
        private Integer coreSingleStorage; 
        private String coreSpec; 
        private Long createMilliseconds; 
        private String createTime; 
        private String deletionProtection; 
        private String diskCategory; 
        private String diskThreshold; 
        private String diskUsage; 
        private Boolean enableBlob; 
        private Boolean enableCdc; 
        private Boolean enableCompute; 
        private Boolean enableKms; 
        private Boolean enableLTS; 
        private Boolean enableLsqlVersionV3; 
        private Boolean enableMLCtrl; 
        private Boolean enableSSL; 
        private Boolean enableShs; 
        private Boolean enableStream; 
        private java.util.List < EngineList> engineList; 
        private Integer engineType; 
        private String expireTime; 
        private Long expiredMilliseconds; 
        private String instanceAlias; 
        private String instanceId; 
        private String instanceStatus; 
        private String instanceStorage; 
        private String logDiskCategory; 
        private Integer logNum; 
        private Integer logSingleStorage; 
        private String logSpec; 
        private String maintainEndTime; 
        private String maintainStartTime; 
        private String multiZoneCombination; 
        private String networkType; 
        private String payType; 
        private String primaryVSwitchId; 
        private String primaryZoneId; 
        private String regionId; 
        private String requestId; 
        private String resourceGroupId; 
        private String serviceType; 
        private String standbyVSwitchId; 
        private String standbyZoneId; 
        private String vpcId; 
        private String vswitchId; 
        private String zoneId; 

        /**
         * AliUid.
         */
        public Builder aliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }

        /**
         * ArbiterVSwitchId.
         */
        public Builder arbiterVSwitchId(String arbiterVSwitchId) {
            this.arbiterVSwitchId = arbiterVSwitchId;
            return this;
        }

        /**
         * ArbiterZoneId.
         */
        public Builder arbiterZoneId(String arbiterZoneId) {
            this.arbiterZoneId = arbiterZoneId;
            return this;
        }

        /**
         * 部署架构，取值：
         * <p>
         * 
         * - **1.0**：单可用区。
         * - **2.0**：多可用区。
         */
        public Builder archVersion(String archVersion) {
            this.archVersion = archVersion;
            return this;
        }

        /**
         * AutoRenew.
         */
        public Builder autoRenew(Boolean autoRenew) {
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * The Capacity storage size of the instance.
         */
        public Builder coldStorage(Integer coldStorage) {
            this.coldStorage = coldStorage;
            return this;
        }

        /**
         * The disk type of the core nodes. This parameter is returned only for multi-zone instances. Valid values:
         * <p>
         * 
         * *   **cloud_efficiency**: This instance uses the Standard type of storage.
         * *   **cloud_ssd**: This instance uses the Performance type of storage.
         * *   **cloud_essd**: This instance uses ESSDs for storage.
         * *   **cloud_essd_pl0**: This instance uses PL0 ESSDs for storage.
         */
        public Builder coreDiskCategory(String coreDiskCategory) {
            this.coreDiskCategory = coreDiskCategory;
            return this;
        }

        /**
         * CoreNum.
         */
        public Builder coreNum(Integer coreNum) {
            this.coreNum = coreNum;
            return this;
        }

        /**
         * CoreSingleStorage.
         */
        public Builder coreSingleStorage(Integer coreSingleStorage) {
            this.coreSingleStorage = coreSingleStorage;
            return this;
        }

        /**
         * CoreSpec.
         */
        public Builder coreSpec(String coreSpec) {
            this.coreSpec = coreSpec;
            return this;
        }

        /**
         * CreateMilliseconds.
         */
        public Builder createMilliseconds(Long createMilliseconds) {
            this.createMilliseconds = createMilliseconds;
            return this;
        }

        /**
         * The storage capacity of the disk of a single log node. This parameter is returned only for multi-zone instances.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * DeletionProtection.
         */
        public Builder deletionProtection(String deletionProtection) {
            this.deletionProtection = deletionProtection;
            return this;
        }

        /**
         * The storage type of the instance. Valid values:
         * <p>
         * 
         * *   **cloud_efficiency**: This instance uses the Standard type of storage.
         * *   **cloud_ssd**: This instance uses the Performance type of storage.
         * *   **cloud_essd**: This instance uses ESSDs for storage.
         * *   **cloud_essd_pl0**: This instance uses PL0 ESSDs for storage.
         * *   **capacity_cloud_storage**: This instance uses the Capacity type of storage.
         * *   **local_ssd_pro**: This instance uses local SSDs for storage.
         * *   **local_hdd_pro**: This instance uses local HDDs for storage.
         */
        public Builder diskCategory(String diskCategory) {
            this.diskCategory = diskCategory;
            return this;
        }

        /**
         * DiskThreshold.
         */
        public Builder diskThreshold(String diskThreshold) {
            this.diskThreshold = diskThreshold;
            return this;
        }

        /**
         * DiskUsage.
         */
        public Builder diskUsage(String diskUsage) {
            this.diskUsage = diskUsage;
            return this;
        }

        /**
         * EnableBlob.
         */
        public Builder enableBlob(Boolean enableBlob) {
            this.enableBlob = enableBlob;
            return this;
        }

        /**
         * EnableCdc.
         */
        public Builder enableCdc(Boolean enableCdc) {
            this.enableCdc = enableCdc;
            return this;
        }

        /**
         * EnableCompute.
         */
        public Builder enableCompute(Boolean enableCompute) {
            this.enableCompute = enableCompute;
            return this;
        }

        /**
         * EnableKms.
         */
        public Builder enableKms(Boolean enableKms) {
            this.enableKms = enableKms;
            return this;
        }

        /**
         * 实例是否开通LTS引擎，返回值：
         * <p>
         * 
         * - **true**：开通LTS引擎。
         * - **false**：未开通LTS引擎。
         */
        public Builder enableLTS(Boolean enableLTS) {
            this.enableLTS = enableLTS;
            return this;
        }

        /**
         * EnableLsqlVersionV3.
         */
        public Builder enableLsqlVersionV3(Boolean enableLsqlVersionV3) {
            this.enableLsqlVersionV3 = enableLsqlVersionV3;
            return this;
        }

        /**
         * EnableMLCtrl.
         */
        public Builder enableMLCtrl(Boolean enableMLCtrl) {
            this.enableMLCtrl = enableMLCtrl;
            return this;
        }

        /**
         * EnableSSL.
         */
        public Builder enableSSL(Boolean enableSSL) {
            this.enableSSL = enableSSL;
            return this;
        }

        /**
         * EnableShs.
         */
        public Builder enableShs(Boolean enableShs) {
            this.enableShs = enableShs;
            return this;
        }

        /**
         * EnableStream.
         */
        public Builder enableStream(Boolean enableStream) {
            this.enableStream = enableStream;
            return this;
        }

        /**
         * The latest version number of the engine.
         */
        public Builder engineList(java.util.List < EngineList> engineList) {
            this.engineList = engineList;
            return this;
        }

        /**
         * EngineType.
         */
        public Builder engineType(Integer engineType) {
            this.engineType = engineType;
            return this;
        }

        /**
         * ExpireTime.
         */
        public Builder expireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }

        /**
         * ExpiredMilliseconds.
         */
        public Builder expiredMilliseconds(Long expiredMilliseconds) {
            this.expiredMilliseconds = expiredMilliseconds;
            return this;
        }

        /**
         * InstanceAlias.
         */
        public Builder instanceAlias(String instanceAlias) {
            this.instanceAlias = instanceAlias;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The status of the instance. Valid values:
         * <p>
         * 
         * *   **CREATING**: The instance is being created.
         * *   **ACTIVATION**: The instance is running.
         * *   **COLD_EXPANDING**: The Capacity storage of the instance is being scaled up.
         * *   **MINOR_VERSION_TRANSING**: The minor version of the instance is being updated.
         * *   **RESIZING**: The nodes in the instance are being scaled up.
         * *   **SHRINKING**: The nodes in the instance are being scaled down.
         * *   **CLASS_CHANGING**: The specification of the instance is being changed.
         * *   **SSL_SWITCHING: SSL**: The SSL configurations of the instance are being changed.
         * *   **CDC_OPENING**: Data subscription is being enabled for the instance.
         * *   **TRANSFER**: The data of the instance is being transferred.
         * *   **DATABASE_TRANSFER**: The data of the instance is being transferred to databases.
         * *   **GUARD_CREATING**: A disaster recovery instance is being created.
         * *   **BACKUP_RECOVERING**: The data of the instance is being restored from a backup.
         * *   **DATABASE_IMPORTING**: Data is being imported to the instance.
         * *   **NET_MODIFYING**: The network configurations of the instance are being changed.
         * *   **NET_SWITCHING**: The network of the instance is being switched between a virtual private cloud (VPC) and the Internet.
         * *   **NET_CREATING**: The connection to the instance is being created.
         * *   **NET_DELETING**: The connection to the instance is being deleted.
         * *   **DELETING**: The instance is being deleted.
         * *   **RESTARTING**: The instance is restarting.
         * *   **LOCKED**: The instance is locked because it expires.
         */
        public Builder instanceStatus(String instanceStatus) {
            this.instanceStatus = instanceStatus;
            return this;
        }

        /**
         * InstanceStorage.
         */
        public Builder instanceStorage(String instanceStorage) {
            this.instanceStorage = instanceStorage;
            return this;
        }

        /**
         * LogDiskCategory.
         */
        public Builder logDiskCategory(String logDiskCategory) {
            this.logDiskCategory = logDiskCategory;
            return this;
        }

        /**
         * LogNum.
         */
        public Builder logNum(Integer logNum) {
            this.logNum = logNum;
            return this;
        }

        /**
         * The storage capacity of the disk of a single log node. This parameter is returned only for multi-zone instances.
         */
        public Builder logSingleStorage(Integer logSingleStorage) {
            this.logSingleStorage = logSingleStorage;
            return this;
        }

        /**
         * LogSpec.
         */
        public Builder logSpec(String logSpec) {
            this.logSpec = logSpec;
            return this;
        }

        /**
         * MaintainEndTime.
         */
        public Builder maintainEndTime(String maintainEndTime) {
            this.maintainEndTime = maintainEndTime;
            return this;
        }

        /**
         * MaintainStartTime.
         */
        public Builder maintainStartTime(String maintainStartTime) {
            this.maintainStartTime = maintainStartTime;
            return this;
        }

        /**
         * MultiZoneCombination.
         */
        public Builder multiZoneCombination(String multiZoneCombination) {
            this.multiZoneCombination = multiZoneCombination;
            return this;
        }

        /**
         * NetworkType.
         */
        public Builder networkType(String networkType) {
            this.networkType = networkType;
            return this;
        }

        /**
         * 400
         */
        public Builder payType(String payType) {
            this.payType = payType;
            return this;
        }

        /**
         * PrimaryVSwitchId.
         */
        public Builder primaryVSwitchId(String primaryVSwitchId) {
            this.primaryVSwitchId = primaryVSwitchId;
            return this;
        }

        /**
         * PrimaryZoneId.
         */
        public Builder primaryZoneId(String primaryZoneId) {
            this.primaryZoneId = primaryZoneId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
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
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * ServiceType.
         */
        public Builder serviceType(String serviceType) {
            this.serviceType = serviceType;
            return this;
        }

        /**
         * StandbyVSwitchId.
         */
        public Builder standbyVSwitchId(String standbyVSwitchId) {
            this.standbyVSwitchId = standbyVSwitchId;
            return this;
        }

        /**
         * StandbyZoneId.
         */
        public Builder standbyZoneId(String standbyZoneId) {
            this.standbyZoneId = standbyZoneId;
            return this;
        }

        /**
         * The type of the log nodes. This parameter is returned only for multi-zone instances.
         */
        public Builder vpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }

        /**
         * The number of the log nodes. This parameter is returned only for multi-zone instances.
         */
        public Builder vswitchId(String vswitchId) {
            this.vswitchId = vswitchId;
            return this;
        }

        /**
         * ZoneId.
         */
        public Builder zoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }

        public GetLindormInstanceResponseBody build() {
            return new GetLindormInstanceResponseBody(this);
        } 

    } 

    public static class EngineList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CoreCount")
        private String coreCount;

        @com.aliyun.core.annotation.NameInMap("CpuCount")
        private String cpuCount;

        @com.aliyun.core.annotation.NameInMap("Engine")
        private String engine;

        @com.aliyun.core.annotation.NameInMap("IsLastVersion")
        private Boolean isLastVersion;

        @com.aliyun.core.annotation.NameInMap("LatestVersion")
        private String latestVersion;

        @com.aliyun.core.annotation.NameInMap("MemorySize")
        private String memorySize;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private EngineList(Builder builder) {
            this.coreCount = builder.coreCount;
            this.cpuCount = builder.cpuCount;
            this.engine = builder.engine;
            this.isLastVersion = builder.isLastVersion;
            this.latestVersion = builder.latestVersion;
            this.memorySize = builder.memorySize;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EngineList create() {
            return builder().build();
        }

        /**
         * @return coreCount
         */
        public String getCoreCount() {
            return this.coreCount;
        }

        /**
         * @return cpuCount
         */
        public String getCpuCount() {
            return this.cpuCount;
        }

        /**
         * @return engine
         */
        public String getEngine() {
            return this.engine;
        }

        /**
         * @return isLastVersion
         */
        public Boolean getIsLastVersion() {
            return this.isLastVersion;
        }

        /**
         * @return latestVersion
         */
        public String getLatestVersion() {
            return this.latestVersion;
        }

        /**
         * @return memorySize
         */
        public String getMemorySize() {
            return this.memorySize;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String coreCount; 
            private String cpuCount; 
            private String engine; 
            private Boolean isLastVersion; 
            private String latestVersion; 
            private String memorySize; 
            private String version; 

            /**
             * CoreCount.
             */
            public Builder coreCount(String coreCount) {
                this.coreCount = coreCount;
                return this;
            }

            /**
             * CpuCount.
             */
            public Builder cpuCount(String cpuCount) {
                this.cpuCount = cpuCount;
                return this;
            }

            /**
             * Engine.
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * IsLastVersion.
             */
            public Builder isLastVersion(Boolean isLastVersion) {
                this.isLastVersion = isLastVersion;
                return this;
            }

            /**
             * LatestVersion.
             */
            public Builder latestVersion(String latestVersion) {
                this.latestVersion = latestVersion;
                return this;
            }

            /**
             * MemorySize.
             */
            public Builder memorySize(String memorySize) {
                this.memorySize = memorySize;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public EngineList build() {
                return new EngineList(this);
            } 

        } 

    }
}
