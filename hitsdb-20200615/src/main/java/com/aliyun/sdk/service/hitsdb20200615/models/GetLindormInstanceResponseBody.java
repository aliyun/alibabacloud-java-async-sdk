// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hitsdb20200615.models;

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

    @com.aliyun.core.annotation.NameInMap("ArchiveStorage")
    private Integer archiveStorage;

    @com.aliyun.core.annotation.NameInMap("AutoRenew")
    private Boolean autoRenew;

    @com.aliyun.core.annotation.NameInMap("BackupInstance")
    private String backupInstance;

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

    @com.aliyun.core.annotation.NameInMap("EnableLProxy")
    private Boolean enableLProxy;

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

    @com.aliyun.core.annotation.NameInMap("EnableStoreTDE")
    private Boolean enableStoreTDE;

    @com.aliyun.core.annotation.NameInMap("EnableStream")
    private Boolean enableStream;

    @com.aliyun.core.annotation.NameInMap("EngineList")
    private java.util.List<EngineList> engineList;

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

    @com.aliyun.core.annotation.NameInMap("SingleZoneRiskAlert")
    private SingleZoneRiskAlert singleZoneRiskAlert;

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
        this.archiveStorage = builder.archiveStorage;
        this.autoRenew = builder.autoRenew;
        this.backupInstance = builder.backupInstance;
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
        this.enableLProxy = builder.enableLProxy;
        this.enableLTS = builder.enableLTS;
        this.enableLsqlVersionV3 = builder.enableLsqlVersionV3;
        this.enableMLCtrl = builder.enableMLCtrl;
        this.enableSSL = builder.enableSSL;
        this.enableShs = builder.enableShs;
        this.enableStoreTDE = builder.enableStoreTDE;
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
        this.singleZoneRiskAlert = builder.singleZoneRiskAlert;
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

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return archiveStorage
     */
    public Integer getArchiveStorage() {
        return this.archiveStorage;
    }

    /**
     * @return autoRenew
     */
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    /**
     * @return backupInstance
     */
    public String getBackupInstance() {
        return this.backupInstance;
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
     * @return enableLProxy
     */
    public Boolean getEnableLProxy() {
        return this.enableLProxy;
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
     * @return enableStoreTDE
     */
    public Boolean getEnableStoreTDE() {
        return this.enableStoreTDE;
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
    public java.util.List<EngineList> getEngineList() {
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
     * @return singleZoneRiskAlert
     */
    public SingleZoneRiskAlert getSingleZoneRiskAlert() {
        return this.singleZoneRiskAlert;
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
        private Integer archiveStorage; 
        private Boolean autoRenew; 
        private String backupInstance; 
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
        private Boolean enableLProxy; 
        private Boolean enableLTS; 
        private Boolean enableLsqlVersionV3; 
        private Boolean enableMLCtrl; 
        private Boolean enableSSL; 
        private Boolean enableShs; 
        private Boolean enableStoreTDE; 
        private Boolean enableStream; 
        private java.util.List<EngineList> engineList; 
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
        private SingleZoneRiskAlert singleZoneRiskAlert; 
        private String standbyVSwitchId; 
        private String standbyZoneId; 
        private String vpcId; 
        private String vswitchId; 
        private String zoneId; 

        private Builder() {
        } 

        private Builder(GetLindormInstanceResponseBody model) {
            this.aliUid = model.aliUid;
            this.arbiterVSwitchId = model.arbiterVSwitchId;
            this.arbiterZoneId = model.arbiterZoneId;
            this.archVersion = model.archVersion;
            this.archiveStorage = model.archiveStorage;
            this.autoRenew = model.autoRenew;
            this.backupInstance = model.backupInstance;
            this.coldStorage = model.coldStorage;
            this.coreDiskCategory = model.coreDiskCategory;
            this.coreNum = model.coreNum;
            this.coreSingleStorage = model.coreSingleStorage;
            this.coreSpec = model.coreSpec;
            this.createMilliseconds = model.createMilliseconds;
            this.createTime = model.createTime;
            this.deletionProtection = model.deletionProtection;
            this.diskCategory = model.diskCategory;
            this.diskThreshold = model.diskThreshold;
            this.diskUsage = model.diskUsage;
            this.enableBlob = model.enableBlob;
            this.enableCdc = model.enableCdc;
            this.enableCompute = model.enableCompute;
            this.enableKms = model.enableKms;
            this.enableLProxy = model.enableLProxy;
            this.enableLTS = model.enableLTS;
            this.enableLsqlVersionV3 = model.enableLsqlVersionV3;
            this.enableMLCtrl = model.enableMLCtrl;
            this.enableSSL = model.enableSSL;
            this.enableShs = model.enableShs;
            this.enableStoreTDE = model.enableStoreTDE;
            this.enableStream = model.enableStream;
            this.engineList = model.engineList;
            this.engineType = model.engineType;
            this.expireTime = model.expireTime;
            this.expiredMilliseconds = model.expiredMilliseconds;
            this.instanceAlias = model.instanceAlias;
            this.instanceId = model.instanceId;
            this.instanceStatus = model.instanceStatus;
            this.instanceStorage = model.instanceStorage;
            this.logDiskCategory = model.logDiskCategory;
            this.logNum = model.logNum;
            this.logSingleStorage = model.logSingleStorage;
            this.logSpec = model.logSpec;
            this.maintainEndTime = model.maintainEndTime;
            this.maintainStartTime = model.maintainStartTime;
            this.multiZoneCombination = model.multiZoneCombination;
            this.networkType = model.networkType;
            this.payType = model.payType;
            this.primaryVSwitchId = model.primaryVSwitchId;
            this.primaryZoneId = model.primaryZoneId;
            this.regionId = model.regionId;
            this.requestId = model.requestId;
            this.resourceGroupId = model.resourceGroupId;
            this.serviceType = model.serviceType;
            this.singleZoneRiskAlert = model.singleZoneRiskAlert;
            this.standbyVSwitchId = model.standbyVSwitchId;
            this.standbyZoneId = model.standbyZoneId;
            this.vpcId = model.vpcId;
            this.vswitchId = model.vswitchId;
            this.zoneId = model.zoneId;
        } 

        /**
         * <p>The 16-character AliUid of the Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>164901546557****</p>
         */
        public Builder aliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }

        /**
         * <p>The ID of the vSwitch in the arbiter zone for a multi-zone instance. The vSwitch must belong to the zone specified by ArbiterZoneId.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-uf6664pqjawb87k36****</p>
         */
        public Builder arbiterVSwitchId(String arbiterVSwitchId) {
            this.arbiterVSwitchId = arbiterVSwitchId;
            return this;
        }

        /**
         * <p>The ID of the arbiter zone for a multi-zone instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai-g</p>
         */
        public Builder arbiterZoneId(String arbiterZoneId) {
            this.arbiterZoneId = arbiterZoneId;
            return this;
        }

        /**
         * <p>The deployment architecture. Valid values:</p>
         * <ul>
         * <li><strong>1.0</strong>: single-zone.</li>
         * <li><strong>2.0</strong>: multi-zone.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        public Builder archVersion(String archVersion) {
            this.archVersion = archVersion;
            return this;
        }

        /**
         * <p>The billable storage capacity of the archive storage type. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder archiveStorage(Integer archiveStorage) {
            this.archiveStorage = archiveStorage;
            return this;
        }

        /**
         * <p>Indicates whether auto-renewal is enabled. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: enabled.</li>
         * <li><strong>false</strong>: disabled.</li>
         * </ul>
         * <blockquote>
         * <p>This parameter is returned only when the billing method of the instance is subscription.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder autoRenew(Boolean autoRenew) {
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * <p>The backup instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ld-xxxx</p>
         */
        public Builder backupInstance(String backupInstance) {
            this.backupInstance = backupInstance;
            return this;
        }

        /**
         * <p>Storage capacity of storage capacity cloud storage.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder coldStorage(Integer coldStorage) {
            this.coldStorage = coldStorage;
            return this;
        }

        /**
         * <p>The disk type of the core node for a multi-zone instance. Valid values:</p>
         * <ul>
         * <li><strong>cloud_efficiency</strong>: standard cloud storage.</li>
         * <li><strong>cloud_ssd</strong>: performance cloud storage.</li>
         * <li><strong>cloud_essd</strong>: enhanced performance cloud storage.</li>
         * <li><strong>cloud_essd_pl0</strong>: performance cloud storage PL0.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cloud_efficiency</p>
         */
        public Builder coreDiskCategory(String coreDiskCategory) {
            this.coreDiskCategory = coreDiskCategory;
            return this;
        }

        /**
         * <p>The number of core nodes for a multi-zone instance.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder coreNum(Integer coreNum) {
            this.coreNum = coreNum;
            return this;
        }

        /**
         * <p>The disk capacity of a single core node for a multi-zone instance.</p>
         * 
         * <strong>example:</strong>
         * <p>400</p>
         */
        public Builder coreSingleStorage(Integer coreSingleStorage) {
            this.coreSingleStorage = coreSingleStorage;
            return this;
        }

        /**
         * <p>The core node specifications for a multi-zone instance.</p>
         * 
         * <strong>example:</strong>
         * <p>lindorm.g.xlarge</p>
         */
        public Builder coreSpec(String coreSpec) {
            this.coreSpec = coreSpec;
            return this;
        }

        /**
         * <p>The creation time of the instance, represented as the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1627290664000</p>
         */
        public Builder createMilliseconds(Long createMilliseconds) {
            this.createMilliseconds = createMilliseconds;
            return this;
        }

        /**
         * <p>The time when the instance was created. The time is displayed in the <strong>yyyy-MM-dd HH:mm:ss</strong> format.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-07-26 17:10:26</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>Indicates whether deletion protection is enabled. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: enabled.</li>
         * <li><strong>false</strong>: disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder deletionProtection(String deletionProtection) {
            this.deletionProtection = deletionProtection;
            return this;
        }

        /**
         * <p>The storage type. Valid values:</p>
         * <ul>
         * <li><strong>cloud_efficiency</strong>: standard cloud storage.</li>
         * <li><strong>cloud_ssd</strong>: performance cloud storage.</li>
         * <li><strong>cloud_essd</strong>: enhanced performance cloud storage.</li>
         * <li><strong>cloud_essd_pl0</strong>: performance cloud storage PL0.</li>
         * <li><strong>capacity_cloud_storage</strong>: capacity cloud storage.</li>
         * <li><strong>local_ssd_pro</strong>: local SSD.</li>
         * <li><strong>local_hdd_pro</strong>: local HDD.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cloud_efficiency</p>
         */
        public Builder diskCategory(String diskCategory) {
            this.diskCategory = diskCategory;
            return this;
        }

        /**
         * <p>The disk space threshold.</p>
         * 
         * <strong>example:</strong>
         * <p>80%</p>
         */
        public Builder diskThreshold(String diskThreshold) {
            this.diskThreshold = diskThreshold;
            return this;
        }

        /**
         * <p>The disk space usage.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0%</p>
         */
        public Builder diskUsage(String diskUsage) {
            this.diskUsage = diskUsage;
            return this;
        }

        /**
         * <p>Indicates whether LBlob is enabled for the instance. Valid values:</p>
         * <ul>
         * <li>true: enabled.</li>
         * <li>false: disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableBlob(Boolean enableBlob) {
            this.enableBlob = enableBlob;
            return this;
        }

        /**
         * <p>Indicates whether the data subscription feature is enabled for the instance. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: enabled.</li>
         * <li><strong>false</strong>: disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder enableCdc(Boolean enableCdc) {
            this.enableCdc = enableCdc;
            return this;
        }

        /**
         * <p>Indicates whether the compute engine is enabled for the instance. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: enabled.</li>
         * <li><strong>false</strong>: disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableCompute(Boolean enableCompute) {
            this.enableCompute = enableCompute;
            return this;
        }

        /**
         * <p>Indicates whether Key Management Service (KMS) is enabled. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: enabled.</li>
         * <li><strong>false</strong>: disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder enableKms(Boolean enableKms) {
            this.enableKms = enableKms;
            return this;
        }

        /**
         * <p>Indicates whether LindormTable supports the Thrift and CQL protocols. If not supported, you can call the SwitchLProxyService operation to enable or disable the support. Valid values:</p>
         * <ul>
         * <li><p>True: supported.</p>
         * </li>
         * <li><p>False: not supported.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>False</p>
         */
        public Builder enableLProxy(Boolean enableLProxy) {
            this.enableLProxy = enableLProxy;
            return this;
        }

        /**
         * <p>Indicates whether Lindorm Tunnel Service is enabled for the instance. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: enabled.</li>
         * <li><strong>false</strong>: disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableLTS(Boolean enableLTS) {
            this.enableLTS = enableLTS;
            return this;
        }

        /**
         * <p>Indicates whether LindormTable supports LindormSQL-V3, which is compatible with the MySQL protocol. Instances purchased after October 24, 2023 support this feature by default. For existing instances, contact technical support for evaluation before enabling this feature. Valid values:</p>
         * <ul>
         * <li><p>True: supported.</p>
         * </li>
         * <li><p>False: not supported.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder enableLsqlVersionV3(Boolean enableLsqlVersionV3) {
            this.enableLsqlVersionV3 = enableLsqlVersionV3;
            return this;
        }

        /**
         * <p>Indicates whether the AI control node is enabled. Valid values:</p>
         * <ul>
         * <li><p>True: enabled.</p>
         * </li>
         * <li><p>False: disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>False</p>
         */
        public Builder enableMLCtrl(Boolean enableMLCtrl) {
            this.enableMLCtrl = enableMLCtrl;
            return this;
        }

        /**
         * <p>Indicates whether SSL encryption is enabled. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: enabled.</li>
         * <li><strong>false</strong>: disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder enableSSL(Boolean enableSSL) {
            this.enableSSL = enableSSL;
            return this;
        }

        /**
         * <p>Indicates whether History Server for the compute engine is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableShs(Boolean enableShs) {
            this.enableShs = enableShs;
            return this;
        }

        /**
         * <p>Indicates whether storage encryption is enabled. Valid values:</p>
         * <ul>
         * <li><p>true: enabled.</p>
         * </li>
         * <li><p>false: disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder enableStoreTDE(Boolean enableStoreTDE) {
            this.enableStoreTDE = enableStoreTDE;
            return this;
        }

        /**
         * <p>Indicates whether the streaming engine is enabled for the instance. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: enabled.</li>
         * <li><strong>false</strong>: disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableStream(Boolean enableStream) {
            this.enableStream = enableStream;
            return this;
        }

        /**
         * <p>The list of engine information.</p>
         */
        public Builder engineList(java.util.List<EngineList> engineList) {
            this.engineList = engineList;
            return this;
        }

        /**
         * <p>The supported engine types. The return value is the sum of the values of the following engine types:</p>
         * <ul>
         * <li>1: search engine</li>
         * <li>2: LindormTSDB</li>
         * <li>4: LindormTable</li>
         * <li>8: file engine</li>
         * </ul>
         * <blockquote>
         * <p>For example, if the value of EngineType is 15 (15 = 8 + 4 + 2 + 1), the instance supports the search engine, LindormTSDB, LindormTable, and file engine. If the value of EngineType is 6 (6 = 4 + 2), the instance supports LindormTSDB and LindormTable.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        public Builder engineType(Integer engineType) {
            this.engineType = engineType;
            return this;
        }

        /**
         * <p>The expiration time of the instance. The time is displayed in the <strong>yyyy-MM-dd HH:mm:ss</strong> format.</p>
         * <blockquote>
         * <p>This parameter is returned only when the billing method is subscription.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2021-08-27 00:00:00</p>
         */
        public Builder expireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }

        /**
         * <p>The time when the instance expires, represented as the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1629993600000</p>
         */
        public Builder expiredMilliseconds(Long expiredMilliseconds) {
            this.expiredMilliseconds = expiredMilliseconds;
            return this;
        }

        /**
         * <p>The name of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>test0726</p>
         */
        public Builder instanceAlias(String instanceAlias) {
            this.instanceAlias = instanceAlias;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ld-bp1o3y0yme2i2****</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The instance status. Valid values:</p>
         * <ul>
         * <li><strong>CREATING</strong>: The instance is being created.</li>
         * <li><strong>ACTIVATION</strong>: The instance is running.</li>
         * <li><strong>COLD_EXPANDING</strong>: Capacity cloud storage expansion in progress.</li>
         * <li><strong>MINOR_VERSION_TRANSING</strong>: The minor version is being upgraded.</li>
         * <li><strong>RESIZING</strong>: The nodes are being scaled up.</li>
         * <li><strong>SHRINKING</strong>: The nodes are being scaled down.</li>
         * <li><strong>CLASS_CHANGING</strong>: Instance specification upgrade or downgrade in progress.</li>
         * <li><strong>SSL_SWITCHING</strong>: The SSL certificate is being changed.</li>
         * <li><strong>CDC_OPENING</strong>: The data subscription feature is being enabled.</li>
         * <li><strong>TRANSFER</strong>: Data migration in progress.</li>
         * <li><strong>DATABASE_TRANSFER</strong>: Data is being migrated to the database.</li>
         * <li><strong>GUARD_CREATING</strong>: A disaster recovery instance is being created.</li>
         * <li><strong>BACKUP_RECOVERING</strong>: The backup is being restored.</li>
         * <li><strong>DATABASE_IMPORTING</strong>: Data import in progress.</li>
         * <li><strong>NET_MODIFYING</strong>: The network is being modified.</li>
         * <li><strong>NET_SWITCHING</strong>: The network is being switched between the internal network and the Internet.</li>
         * <li><strong>NET_CREATING</strong>: A network connection is being created.</li>
         * <li><strong>NET_DELETING</strong>: A network connection is being deleted.</li>
         * <li><strong>DELETING</strong>: The instance is being deleted.</li>
         * <li><strong>RESTARTING</strong>: The instance is being restarted.</li>
         * <li><strong>LOCKED</strong>: The instance has expired and is locked.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ACTIVATION</p>
         */
        public Builder instanceStatus(String instanceStatus) {
            this.instanceStatus = instanceStatus;
            return this;
        }

        /**
         * <p>The storage capacity of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>480</p>
         */
        public Builder instanceStorage(String instanceStorage) {
            this.instanceStorage = instanceStorage;
            return this;
        }

        /**
         * <p>The disk type of the log node for a multi-zone instance. Valid values:</p>
         * <ul>
         * <li><strong>cloud_efficiency</strong>: standard cloud storage.</li>
         * <li><strong>cloud_ssd</strong>: performance cloud storage.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cloud_ssd</p>
         */
        public Builder logDiskCategory(String logDiskCategory) {
            this.logDiskCategory = logDiskCategory;
            return this;
        }

        /**
         * <p>The number of log nodes for a multi-zone instance.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder logNum(Integer logNum) {
            this.logNum = logNum;
            return this;
        }

        /**
         * <p>The disk capacity of a single log node for a multi-zone instance.</p>
         * 
         * <strong>example:</strong>
         * <p>400GB</p>
         */
        public Builder logSingleStorage(Integer logSingleStorage) {
            this.logSingleStorage = logSingleStorage;
            return this;
        }

        /**
         * <p>The log node specifications for a multi-zone instance.</p>
         * 
         * <strong>example:</strong>
         * <p>lindorm.sn1.large</p>
         */
        public Builder logSpec(String logSpec) {
            this.logSpec = logSpec;
            return this;
        }

        /**
         * <p>The end time of the maintenance window. The time is displayed in the HH:mmZ format. UTC time is used.</p>
         * 
         * <strong>example:</strong>
         * <p>20:00Z</p>
         */
        public Builder maintainEndTime(String maintainEndTime) {
            this.maintainEndTime = maintainEndTime;
            return this;
        }

        /**
         * <p>The start time of the maintenance window. The time is displayed in the HH:mmZ format. UTC time is used.</p>
         * 
         * <strong>example:</strong>
         * <p>00:00Z</p>
         */
        public Builder maintainStartTime(String maintainStartTime) {
            this.maintainStartTime = maintainStartTime;
            return this;
        }

        /**
         * <p>The multi-zone combination. You can go to the buy page to view the supported zone combinations. Valid values:</p>
         * <ul>
         * <li><strong>ap-southeast-5abc-aliyun</strong>: Indonesia (Jakarta) Zones A, B, and C.</li>
         * <li><strong>cn-hangzhou-ehi-aliyun</strong>: China (Hangzhou) Zones E, H, and I.</li>
         * <li><strong>cn-beijing-acd-aliyun</strong>: China (Beijing) Zones A, C, and D.</li>
         * <li><strong>ap-southeast-1-abc-aliyun</strong>: Singapore Zones A, B, and C.</li>
         * <li><strong>cn-zhangjiakou-abc-aliyun</strong>: China (Zhangjiakou) Zones A, B, and C.</li>
         * <li><strong>cn-shanghai-efg-aliyun</strong>: China (Shanghai) Zones E, F, and G.</li>
         * <li><strong>cn-shanghai-abd-aliyun</strong>: China (Shanghai) Zones A, B, and D.</li>
         * <li><strong>cn-hangzhou-bef-aliyun</strong>: China (Hangzhou) Zones B, E, and F.</li>
         * <li><strong>cn-hangzhou-bce-aliyun</strong>: China (Hangzhou) Zones B, C, and E.</li>
         * <li><strong>cn-beijing-fgh-aliyun</strong>: China (Beijing) Zones F, G, and H.</li>
         * <li><strong>cn-shenzhen-abc-aliyun</strong>: China (Shenzhen) Zones A, B, and C.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai-efg-aliyun</p>
         */
        public Builder multiZoneCombination(String multiZoneCombination) {
            this.multiZoneCombination = multiZoneCombination;
            return this;
        }

        /**
         * <p>The network type of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc</p>
         */
        public Builder networkType(String networkType) {
            this.networkType = networkType;
            return this;
        }

        /**
         * <p>The billing method of the instance. Valid values:</p>
         * <ul>
         * <li><strong>PREPAY</strong>: subscription.</li>
         * <li><strong>POSTPAY</strong>: pay-as-you-go.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>POSTPAY</p>
         */
        public Builder payType(String payType) {
            this.payType = payType;
            return this;
        }

        /**
         * <p>The ID of the vSwitch in the primary zone for a multi-zone instance. The vSwitch must belong to the zone specified by PrimaryZoneId.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-uf6fdqa7c0pipnqzq****</p>
         */
        public Builder primaryVSwitchId(String primaryVSwitchId) {
            this.primaryVSwitchId = primaryVSwitchId;
            return this;
        }

        /**
         * <p>The ID of the primary zone for a multi-zone instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai-e</p>
         */
        public Builder primaryZoneId(String primaryZoneId) {
            this.primaryZoneId = primaryZoneId;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>633F1BE4-C8DA-5744-8FDF-A3075C3FE37F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aek2wvd6oia****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The instance type. Valid values:</p>
         * <ul>
         * <li><strong>lindorm</strong>: Lindorm single-zone instance.</li>
         * <li><strong>lindorm_multizone</strong>: Lindorm multi-zone instance.</li>
         * <li><strong>serverless_lindorm</strong>: Lindorm Serverless instance.</li>
         * <li><strong>lindorm_standalone</strong>: Lindorm single-node instance.</li>
         * <li><strong>lts</strong>: Lindorm Tunnel Service.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>lindorm</p>
         */
        public Builder serviceType(String serviceType) {
            this.serviceType = serviceType;
            return this;
        }

        /**
         * <p>The risk alert information for the single-zone deployment.</p>
         */
        public Builder singleZoneRiskAlert(SingleZoneRiskAlert singleZoneRiskAlert) {
            this.singleZoneRiskAlert = singleZoneRiskAlert;
            return this;
        }

        /**
         * <p>The ID of the vSwitch in the secondary zone for a multi-zone instance. The vSwitch must belong to the zone specified by StandbyZoneId.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-2zec0kcn08cgdtr6****</p>
         */
        public Builder standbyVSwitchId(String standbyVSwitchId) {
            this.standbyVSwitchId = standbyVSwitchId;
            return this;
        }

        /**
         * <p>The ID of the secondary zone for a multi-zone instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai-f</p>
         */
        public Builder standbyZoneId(String standbyZoneId) {
            this.standbyZoneId = standbyZoneId;
            return this;
        }

        /**
         * <p>The ID of the virtual private cloud (VPC) to which the instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1n3i15v90el48nx****</p>
         */
        public Builder vpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }

        /**
         * <p>The ID of the vSwitch.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1vbjzmod9q3l9eo****</p>
         */
        public Builder vswitchId(String vswitchId) {
            this.vswitchId = vswitchId;
            return this;
        }

        /**
         * <p>The zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-h</p>
         */
        public Builder zoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }

        public GetLindormInstanceResponseBody build() {
            return new GetLindormInstanceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetLindormInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetLindormInstanceResponseBody</p>
     */
    public static class EngineList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ArbiterCoreCount")
        private String arbiterCoreCount;

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

        @com.aliyun.core.annotation.NameInMap("PrimaryCoreCount")
        private String primaryCoreCount;

        @com.aliyun.core.annotation.NameInMap("Specification")
        private String specification;

        @com.aliyun.core.annotation.NameInMap("StandbyCoreCount")
        private String standbyCoreCount;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private EngineList(Builder builder) {
            this.arbiterCoreCount = builder.arbiterCoreCount;
            this.coreCount = builder.coreCount;
            this.cpuCount = builder.cpuCount;
            this.engine = builder.engine;
            this.isLastVersion = builder.isLastVersion;
            this.latestVersion = builder.latestVersion;
            this.memorySize = builder.memorySize;
            this.primaryCoreCount = builder.primaryCoreCount;
            this.specification = builder.specification;
            this.standbyCoreCount = builder.standbyCoreCount;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EngineList create() {
            return builder().build();
        }

        /**
         * @return arbiterCoreCount
         */
        public String getArbiterCoreCount() {
            return this.arbiterCoreCount;
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
         * @return primaryCoreCount
         */
        public String getPrimaryCoreCount() {
            return this.primaryCoreCount;
        }

        /**
         * @return specification
         */
        public String getSpecification() {
            return this.specification;
        }

        /**
         * @return standbyCoreCount
         */
        public String getStandbyCoreCount() {
            return this.standbyCoreCount;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String arbiterCoreCount; 
            private String coreCount; 
            private String cpuCount; 
            private String engine; 
            private Boolean isLastVersion; 
            private String latestVersion; 
            private String memorySize; 
            private String primaryCoreCount; 
            private String specification; 
            private String standbyCoreCount; 
            private String version; 

            private Builder() {
            } 

            private Builder(EngineList model) {
                this.arbiterCoreCount = model.arbiterCoreCount;
                this.coreCount = model.coreCount;
                this.cpuCount = model.cpuCount;
                this.engine = model.engine;
                this.isLastVersion = model.isLastVersion;
                this.latestVersion = model.latestVersion;
                this.memorySize = model.memorySize;
                this.primaryCoreCount = model.primaryCoreCount;
                this.specification = model.specification;
                this.standbyCoreCount = model.standbyCoreCount;
                this.version = model.version;
            } 

            /**
             * <p>The number of nodes in the arbiter zone.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder arbiterCoreCount(String arbiterCoreCount) {
                this.arbiterCoreCount = arbiterCoreCount;
                return this;
            }

            /**
             * <p>The number of engine nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder coreCount(String coreCount) {
                this.coreCount = coreCount;
                return this;
            }

            /**
             * <p>The number of CPUs for the engine node.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder cpuCount(String cpuCount) {
                this.cpuCount = cpuCount;
                return this;
            }

            /**
             * <p>The engine type. Valid values:</p>
             * <ul>
             * <li><strong>lindorm</strong>: LindormTable.</li>
             * <li><strong>tsdb</strong>: LindormTSDB.</li>
             * <li><strong>solr</strong>: search engine.</li>
             * <li><strong>store</strong>: file engine.</li>
             * <li><strong>bds</strong>: Lindorm Tunnel Service engine.</li>
             * <li><strong>compute</strong>: compute engine.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>lindorm</p>
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * <p>Indicates whether the engine is of the latest version. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: latest version.</li>
             * <li><strong>false</strong>: not the latest version.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isLastVersion(Boolean isLastVersion) {
                this.isLastVersion = isLastVersion;
                return this;
            }

            /**
             * <p>The latest version number of the engine.</p>
             * 
             * <strong>example:</strong>
             * <p>2.2.19.2</p>
             */
            public Builder latestVersion(String latestVersion) {
                this.latestVersion = latestVersion;
                return this;
            }

            /**
             * <p>The memory size of the engine node.</p>
             * 
             * <strong>example:</strong>
             * <p>8GB</p>
             */
            public Builder memorySize(String memorySize) {
                this.memorySize = memorySize;
                return this;
            }

            /**
             * <p>The number of nodes in the primary zone.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder primaryCoreCount(String primaryCoreCount) {
                this.primaryCoreCount = primaryCoreCount;
                return this;
            }

            /**
             * <p>The engine node specifications.</p>
             * 
             * <strong>example:</strong>
             * <p>lindorm.g.2xlarge</p>
             */
            public Builder specification(String specification) {
                this.specification = specification;
                return this;
            }

            /**
             * <p>The number of nodes in the secondary zone.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder standbyCoreCount(String standbyCoreCount) {
                this.standbyCoreCount = standbyCoreCount;
                return this;
            }

            /**
             * <p>The version number of the engine.</p>
             * 
             * <strong>example:</strong>
             * <p>2.2.3</p>
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
    /**
     * 
     * {@link GetLindormInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetLindormInstanceResponseBody</p>
     */
    public static class SingleZoneRiskAlert extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfirmDate")
        private String confirmDate;

        @com.aliyun.core.annotation.NameInMap("DispositionType")
        private String dispositionType;

        @com.aliyun.core.annotation.NameInMap("NeedAlert")
        private Boolean needAlert;

        @com.aliyun.core.annotation.NameInMap("PlannedCompletionDate")
        private String plannedCompletionDate;

        private SingleZoneRiskAlert(Builder builder) {
            this.confirmDate = builder.confirmDate;
            this.dispositionType = builder.dispositionType;
            this.needAlert = builder.needAlert;
            this.plannedCompletionDate = builder.plannedCompletionDate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SingleZoneRiskAlert create() {
            return builder().build();
        }

        /**
         * @return confirmDate
         */
        public String getConfirmDate() {
            return this.confirmDate;
        }

        /**
         * @return dispositionType
         */
        public String getDispositionType() {
            return this.dispositionType;
        }

        /**
         * @return needAlert
         */
        public Boolean getNeedAlert() {
            return this.needAlert;
        }

        /**
         * @return plannedCompletionDate
         */
        public String getPlannedCompletionDate() {
            return this.plannedCompletionDate;
        }

        public static final class Builder {
            private String confirmDate; 
            private String dispositionType; 
            private Boolean needAlert; 
            private String plannedCompletionDate; 

            private Builder() {
            } 

            private Builder(SingleZoneRiskAlert model) {
                this.confirmDate = model.confirmDate;
                this.dispositionType = model.dispositionType;
                this.needAlert = model.needAlert;
                this.plannedCompletionDate = model.plannedCompletionDate;
            } 

            /**
             * <p>The confirmation date for risk handling. The date is displayed in the yyyy-MM-dd format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-24</p>
             */
            public Builder confirmDate(String confirmDate) {
                this.confirmDate = confirmDate;
                return this;
            }

            /**
             * <p>The risk handling type for the single-zone deployment.</p>
             * 
             * <strong>example:</strong>
             * <p>NO_SET</p>
             */
            public Builder dispositionType(String dispositionType) {
                this.dispositionType = dispositionType;
                return this;
            }

            /**
             * <p>Indicates whether a risk alert for the single-zone deployment is required.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder needAlert(Boolean needAlert) {
                this.needAlert = needAlert;
                return this;
            }

            /**
             * <p>The planned completion date for risk handling. The date is displayed in the yyyy-MM-dd format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-30</p>
             */
            public Builder plannedCompletionDate(String plannedCompletionDate) {
                this.plannedCompletionDate = plannedCompletionDate;
                return this;
            }

            public SingleZoneRiskAlert build() {
                return new SingleZoneRiskAlert(this);
            } 

        } 

    }
}
