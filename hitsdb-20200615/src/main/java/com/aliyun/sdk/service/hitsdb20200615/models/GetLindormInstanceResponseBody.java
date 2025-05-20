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
            this.standbyVSwitchId = model.standbyVSwitchId;
            this.standbyZoneId = model.standbyZoneId;
            this.vpcId = model.vpcId;
            this.vswitchId = model.vswitchId;
            this.zoneId = model.zoneId;
        } 

        /**
         * <p>16-digit AliUid of the Alibaba Cloud primary account (main account).</p>
         * 
         * <strong>example:</strong>
         * <p>164901546557****</p>
         */
        public Builder aliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }

        /**
         * <p>Multi-AZ instance, coordinating Availability Zone virtual switch ID, which must be located in the Availability Zone corresponding to ArbiterZoneId.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-uf6664pqjawb87k36****</p>
         */
        public Builder arbiterVSwitchId(String arbiterVSwitchId) {
            this.arbiterVSwitchId = arbiterVSwitchId;
            return this;
        }

        /**
         * <p>Multi-zone instance, coordinating Availability Zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai-g</p>
         */
        public Builder arbiterZoneId(String arbiterZoneId) {
            this.arbiterZoneId = arbiterZoneId;
            return this;
        }

        /**
         * <p>The architecture of the instance. Valid values:</p>
         * <ul>
         * <li><strong>1.0</strong>: The instance is deployed in a single zone.</li>
         * <li><strong>2.0</strong>: The instance is deployed across multiple zones.</li>
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
         * <p>The Archive storage size of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>0GB</p>
         */
        public Builder archiveStorage(Integer archiveStorage) {
            this.archiveStorage = archiveStorage;
            return this;
        }

        /**
         * <p>Indicates whether auto-renewal is enabled, with the following returns:</p>
         * <ul>
         * <li><strong>true</strong>: Enabled. </li>
         * <li><strong>false</strong>: Disabled.<blockquote>
         * <p>This parameter is returned when the instance&quot;s payment type is prepaid.</p>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder autoRenew(Boolean autoRenew) {
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * <p>The Capacity storage size of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>0GB</p>
         */
        public Builder coldStorage(Integer coldStorage) {
            this.coldStorage = coldStorage;
            return this;
        }

        /**
         * <p>The disk type of the core nodes. This parameter is returned only for multi-zone instances. Valid values:</p>
         * <ul>
         * <li><strong>cloud_efficiency</strong>: This instance uses the Standard type of storage.</li>
         * <li><strong>cloud_ssd</strong>: This instance uses the Performance type of storage.</li>
         * <li><strong>cloud_essd</strong>: This instance uses ESSDs for storage.</li>
         * <li><strong>cloud_essd_pl0</strong>: This instance uses PL0 ESSDs for storage.</li>
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
         * <p>Multi-zone instance, number of core nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder coreNum(Integer coreNum) {
            this.coreNum = coreNum;
            return this;
        }

        /**
         * <p>Multi-zone instance, core single-node disk capacity.</p>
         * 
         * <strong>example:</strong>
         * <p>400</p>
         */
        public Builder coreSingleStorage(Integer coreSingleStorage) {
            this.coreSingleStorage = coreSingleStorage;
            return this;
        }

        /**
         * <p>Multi-zone instance, core node specification.</p>
         * 
         * <strong>example:</strong>
         * <p>lindorm.g.xlarge</p>
         */
        public Builder coreSpec(String coreSpec) {
            this.coreSpec = coreSpec;
            return this;
        }

        /**
         * <p>The timestamp in milliseconds between the instance creation time and 1970-01-01 00:00:00.</p>
         * 
         * <strong>example:</strong>
         * <p>1627290664000</p>
         */
        public Builder createMilliseconds(Long createMilliseconds) {
            this.createMilliseconds = createMilliseconds;
            return this;
        }

        /**
         * <p>The storage capacity of the disk of a single log node. This parameter is returned only for multi-zone instances.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-07-26 17:10:26</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>Indicates whether deletion protection is enabled, returning:</p>
         * <ul>
         * <li><strong>true</strong>: Enabled.</li>
         * <li><strong>false</strong>: Disabled.</li>
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
         * <p>The storage type of the instance. Valid values:</p>
         * <ul>
         * <li><strong>cloud_efficiency</strong>: This instance uses the Standard type of storage.</li>
         * <li><strong>cloud_ssd</strong>: This instance uses the Performance type of storage.</li>
         * <li><strong>cloud_essd</strong>: This instance uses ESSDs for storage.</li>
         * <li><strong>cloud_essd_pl0</strong>: This instance uses PL0 ESSDs for storage.</li>
         * <li><strong>capacity_cloud_storage</strong>: This instance uses the Capacity type of storage.</li>
         * <li><strong>local_ssd_pro</strong>: This instance uses local SSDs for storage.</li>
         * <li><strong>local_hdd_pro</strong>: This instance uses local HDDs for storage.</li>
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
         * <p>The threshold for disk space.</p>
         * 
         * <strong>example:</strong>
         * <p>80%</p>
         */
        public Builder diskThreshold(String diskThreshold) {
            this.diskThreshold = diskThreshold;
            return this;
        }

        /**
         * <p>Disk space usage rate.</p>
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
         * <p>true: LBlob is enabled for the instance. false: LBlob is not enabled for the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableBlob(Boolean enableBlob) {
            this.enableBlob = enableBlob;
            return this;
        }

        /**
         * <p>Indicates whether the data subscription feature for the instance is enabled. Returns:</p>
         * <ul>
         * <li><strong>true</strong>: Enabled. </li>
         * <li><strong>false</strong>: Not enabled.</li>
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
         * <p>Indicates whether the instance&quot;s compute engine is enabled, returning:</p>
         * <ul>
         * <li><strong>true</strong>: Enabled. </li>
         * <li><strong>false</strong>: Not enabled.</li>
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
         * <p>Indicates whether the Key Management Service (KMS) is enabled, returning:</p>
         * <ul>
         * <li><strong>true</strong>: Enabled.</li>
         * <li><strong>false</strong>: Disabled.</li>
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
         * <p>Indicates whether LindormTable supports the Thrift and CQL protocols. If these protocols are not supported. You can call the SwitchLProxyService operation to enable or disable the support on these protocols for LindormTable.</p>
         * <p>True: LindormTable supports the Thrift and CQL protocols.</p>
         * <p>False: LindormTable does not support the Thrift and CQL protocols.</p>
         * 
         * <strong>example:</strong>
         * <p>False</p>
         */
        public Builder enableLProxy(Boolean enableLProxy) {
            this.enableLProxy = enableLProxy;
            return this;
        }

        /**
         * <p>Indicates whether the LTS engine is activated for the instance. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The LTS engine is activated for the instance.</li>
         * <li><strong>false</strong>: The LTS engine is not activated for the instance.</li>
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
         * <p>Indicates whether LindormTable of the instance supports LindormSQL V3 that is compatible with MySQL. By default, LindormTable of instances that are purchased after October 24, 2023 supports LindormSQL V3. If your instance is purchased before this date and want to enable LindormSQL V3, contact the technical support.</p>
         * <ul>
         * <li>True: LindormTable supports LindormSQL V3.</li>
         * <li>False: LindormTable does not support LindormSQL V3.</li>
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
         * <p>Indicates whether AI control nodes are enabled for the instance.</p>
         * <ul>
         * <li>True: AI control nodes are enabled for the instance.</li>
         * <li>False: AI control nodes are not enabled for the instance.</li>
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
         * <p>Indicates whether SSL link encryption is enabled, returning:</p>
         * <ul>
         * <li><strong>true</strong>: Enabled. </li>
         * <li><strong>false</strong>: Disabled.</li>
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
         * <p>Whether to enable the Compute Engine History Server.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableShs(Boolean enableShs) {
            this.enableShs = enableShs;
            return this;
        }

        /**
         * <p>Indicates whether the Transparent Data Encryption (TDE) is enabled, returning:</p>
         * <ul>
         * <li><strong>true</strong>: Enabled. </li>
         * <li><strong>false</strong>: Disabled.</li>
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
         * <p>Indicates whether the instance has the stream engine enabled. Return values:</p>
         * <ul>
         * <li><strong>true</strong>: Stream engine is enabled. </li>
         * <li><strong>false</strong>: Stream engine is not enabled.</li>
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
         * <p>The list of engines supported by the instance.</p>
         */
        public Builder engineList(java.util.List<EngineList> engineList) {
            this.engineList = engineList;
            return this;
        }

        /**
         * <p>Supported engine types, the return value is obtained by performing addition operations on the values of the following engine types.</p>
         * <ul>
         * <li>1: Search Engine </li>
         * <li>2: Time Series Engine</li>
         * <li>4: Wide Table Engine</li>
         * <li>8: File Engine<blockquote>
         * <p>For example: If EngineType is 15, where 15 = 8 + 4 + 2 + 1, it indicates that the instance supports Search Engine, Time Series Engine, Wide Table Engine, and File Engine. If EngineType is 6, where 6 = 4 + 2, it signifies that the instance supports Time Series Engine and Wide Table Engine.</p>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        public Builder engineType(Integer engineType) {
            this.engineType = engineType;
            return this;
        }

        /**
         * <p>Expiration time of the instance, format: <strong>yyyy-MM-dd HH:mm:ss</strong>.</p>
         * <blockquote>
         * <p>This parameter is only returned when the payment type is pre-paid.</p>
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
         * <p>The millisecond value between the instance expiration time and 1970-01-01 00:00:00.</p>
         * 
         * <strong>example:</strong>
         * <p>1629993600000</p>
         */
        public Builder expiredMilliseconds(Long expiredMilliseconds) {
            this.expiredMilliseconds = expiredMilliseconds;
            return this;
        }

        /**
         * <p>Instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>test0726</p>
         */
        public Builder instanceAlias(String instanceAlias) {
            this.instanceAlias = instanceAlias;
            return this;
        }

        /**
         * <p>Instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ld-bp1o3y0yme2i2****</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The status of the instance. Valid values:</p>
         * <ul>
         * <li><strong>CREATING</strong>: The instance is being created.</li>
         * <li><strong>ACTIVATION</strong>: The instance is running.</li>
         * <li><strong>COLD_EXPANDING</strong>: The Capacity storage of the instance is being scaled up.</li>
         * <li><strong>MINOR_VERSION_TRANSING</strong>: The minor version of the instance is being updated.</li>
         * <li><strong>RESIZING</strong>: The nodes in the instance are being scaled up.</li>
         * <li><strong>SHRINKING</strong>: The nodes in the instance are being scaled down.</li>
         * <li><strong>CLASS_CHANGING</strong>: The specification of the instance is being changed.</li>
         * <li><strong>SSL_SWITCHING: SSL</strong>: The SSL configurations of the instance are being changed.</li>
         * <li><strong>CDC_OPENING</strong>: Data subscription is being enabled for the instance.</li>
         * <li><strong>TRANSFER</strong>: The data of the instance is being transferred.</li>
         * <li><strong>DATABASE_TRANSFER</strong>: The data of the instance is being transferred to databases.</li>
         * <li><strong>GUARD_CREATING</strong>: A disaster recovery instance is being created.</li>
         * <li><strong>BACKUP_RECOVERING</strong>: The data of the instance is being restored from a backup.</li>
         * <li><strong>DATABASE_IMPORTING</strong>: Data is being imported to the instance.</li>
         * <li><strong>NET_MODIFYING</strong>: The network configurations of the instance are being changed.</li>
         * <li><strong>NET_SWITCHING</strong>: The network of the instance is being switched between a virtual private cloud (VPC) and the Internet.</li>
         * <li><strong>NET_CREATING</strong>: The connection to the instance is being created.</li>
         * <li><strong>NET_DELETING</strong>: The connection to the instance is being deleted.</li>
         * <li><strong>DELETING</strong>: The instance is being deleted.</li>
         * <li><strong>RESTARTING</strong>: The instance is restarting.</li>
         * <li><strong>LOCKED</strong>: The instance is locked because it expires.</li>
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
         * <p>Instance&quot;s storage capacity.</p>
         * 
         * <strong>example:</strong>
         * <p>480</p>
         */
        public Builder instanceStorage(String instanceStorage) {
            this.instanceStorage = instanceStorage;
            return this;
        }

        /**
         * <p>Multi-zone instance, log node disk type, returns:</p>
         * <ul>
         * <li><strong>cloud_efficiency</strong>: Standard cloud storage. </li>
         * <li><strong>cloud_ssd</strong>: Performance cloud storage.</li>
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
         * <p>Multi-zone instance, number of log nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder logNum(Integer logNum) {
            this.logNum = logNum;
            return this;
        }

        /**
         * <p>The storage capacity of the disk of a single log node. This parameter is returned only for multi-zone instances.</p>
         * 
         * <strong>example:</strong>
         * <p>400GB</p>
         */
        public Builder logSingleStorage(Integer logSingleStorage) {
            this.logSingleStorage = logSingleStorage;
            return this;
        }

        /**
         * <p>Multi-zone instance, log node specification.</p>
         * 
         * <strong>example:</strong>
         * <p>lindorm.sn1.large</p>
         */
        public Builder logSpec(String logSpec) {
            this.logSpec = logSpec;
            return this;
        }

        /**
         * <p>Maintainable end time.</p>
         * 
         * <strong>example:</strong>
         * <p>20:00Z</p>
         */
        public Builder maintainEndTime(String maintainEndTime) {
            this.maintainEndTime = maintainEndTime;
            return this;
        }

        /**
         * <p>Maintainable start time.</p>
         * 
         * <strong>example:</strong>
         * <p>00:00Z</p>
         */
        public Builder maintainStartTime(String maintainStartTime) {
            this.maintainStartTime = maintainStartTime;
            return this;
        }

        /**
         * <p>Multi-zone combinations. For support details on zone combinations, please refer to the product page.</p>
         * <ul>
         * <li><strong>ap-southeast-5abc-aliyun</strong>: Indonesia (Jakarta) A+B+C. </li>
         * <li><strong>cn-hangzhou-ehi-aliyun</strong>: East China 1 (Hangzhou) E+H+I.</li>
         * <li><strong>cn-beijing-acd-aliyun</strong>: North China 2 (Beijing) A+C+D.</li>
         * <li><strong>ap-southeast-1-abc-aliyun</strong>: Singapore A+B+C.</li>
         * <li><strong>cn-zhangjiakou-abc-aliyun</strong>: North China 3 (Zhangjiakou) A+B+C.</li>
         * <li><strong>cn-shanghai-efg-aliyun</strong>: East China 2 (Shanghai) E+F+G.</li>
         * <li><strong>cn-shanghai-abd-aliyun</strong>: East China 2 (Shanghai) A+B+D.</li>
         * <li><strong>cn-hangzhou-bef-aliyun</strong>: East China 1 (Hangzhou) B+E+F.</li>
         * <li><strong>cn-hangzhou-bce-aliyun</strong>: East China 1 (Hangzhou) B+C+E.</li>
         * <li><strong>cn-beijing-fgh-aliyun</strong>: North China 2 (Beijing) F+G+H.</li>
         * <li><strong>cn-shenzhen-abc-aliyun</strong>: South China 1 (Shenzhen) A+B+C.</li>
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
         * <p>Instance&quot;s network type.</p>
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
         * <p>PREPAY: subscription.
         * POSTPAY: pay-as-you-go.</p>
         * 
         * <strong>example:</strong>
         * <p>POSTPAY</p>
         */
        public Builder payType(String payType) {
            this.payType = payType;
            return this;
        }

        /**
         * <p>Multi-zone instance, the virtual switch ID of the primary availability zone, which must be in the availability zone corresponding to PrimaryZoneId.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-uf6fdqa7c0pipnqzq****</p>
         */
        public Builder primaryVSwitchId(String primaryVSwitchId) {
            this.primaryVSwitchId = primaryVSwitchId;
            return this;
        }

        /**
         * <p>Multi-zone instance, availability zone ID of the primary zone.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai-e</p>
         */
        public Builder primaryZoneId(String primaryZoneId) {
            this.primaryZoneId = primaryZoneId;
            return this;
        }

        /**
         * <p>Region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>633F1BE4-C8DA-5744-8FDF-A3075C3FE37F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aek2wvd6oia****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>Instance type, valid values:</p>
         * <ul>
         * <li><strong>lindorm</strong>: represents a Lindorm single-zone instance.</li>
         * <li><strong>lindorm_multizone</strong>: represents a Lindorm multi-zone instance.</li>
         * <li><strong>serverless_lindorm</strong>: represents a Lindorm Serverless instance.</li>
         * <li><strong>lindorm_standalone</strong>: represents a Lindorm standalone instance.</li>
         * <li><strong>lts</strong>: represents the Lindorm Data Channel Service type.</li>
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
         * <p>Multi-zone instance, the virtual switch ID of the backup availability zone, which must be in the availability zone corresponding to StandbyZoneId.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-2zec0kcn08cgdtr6****</p>
         */
        public Builder standbyVSwitchId(String standbyVSwitchId) {
            this.standbyVSwitchId = standbyVSwitchId;
            return this;
        }

        /**
         * <p>Multi-zone instance, backup availability zone&quot;s availability zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai-f</p>
         */
        public Builder standbyZoneId(String standbyZoneId) {
            this.standbyZoneId = standbyZoneId;
            return this;
        }

        /**
         * <p>The type of the log nodes. This parameter is returned only for multi-zone instances.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1n3i15v90el48nx****</p>
         */
        public Builder vpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }

        /**
         * <p>The number of the log nodes. This parameter is returned only for multi-zone instances.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1vbjzmod9q3l9eo****</p>
         */
        public Builder vswitchId(String vswitchId) {
            this.vswitchId = vswitchId;
            return this;
        }

        /**
         * <p>Availability Zone ID.</p>
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
             * ArbiterCoreCount.
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
             * <p>The number of CPU cores on the engine node.</p>
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
             * <li><strong>solr</strong>: LindormSearch.</li>
             * <li><strong>store</strong>: LindormDFS.</li>
             * <li><strong>bds</strong>: Lindorm Tunnel Service (LTS).</li>
             * <li><strong>compute</strong>: Lindorm Distributed Processing System (LDPS).</li>
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
             * <p>Indicates whether the version of the engine is the latest. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: The version of the engine is the latest.</li>
             * <li><strong>false</strong>: The version of the engine is not the latest.</li>
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
             * <p>The memory size of the engine nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>8GB</p>
             */
            public Builder memorySize(String memorySize) {
                this.memorySize = memorySize;
                return this;
            }

            /**
             * PrimaryCoreCount.
             */
            public Builder primaryCoreCount(String primaryCoreCount) {
                this.primaryCoreCount = primaryCoreCount;
                return this;
            }

            /**
             * <p>The specification of the engine node.</p>
             * 
             * <strong>example:</strong>
             * <p>lindorm.g.2xlarge</p>
             */
            public Builder specification(String specification) {
                this.specification = specification;
                return this;
            }

            /**
             * StandbyCoreCount.
             */
            public Builder standbyCoreCount(String standbyCoreCount) {
                this.standbyCoreCount = standbyCoreCount;
                return this;
            }

            /**
             * <p>The version of the engine.</p>
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
}
