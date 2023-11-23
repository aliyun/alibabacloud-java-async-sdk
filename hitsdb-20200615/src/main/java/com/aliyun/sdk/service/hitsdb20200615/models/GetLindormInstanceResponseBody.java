// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hitsdb20200615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetLindormInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>GetLindormInstanceResponseBody</p>
 */
public class GetLindormInstanceResponseBody extends TeaModel {
    @NameInMap("AliUid")
    private Long aliUid;

    @NameInMap("ArbiterVSwitchId")
    private String arbiterVSwitchId;

    @NameInMap("ArbiterZoneId")
    private String arbiterZoneId;

    @NameInMap("ArchVersion")
    private String archVersion;

    @NameInMap("AutoRenew")
    private Boolean autoRenew;

    @NameInMap("ColdStorage")
    private Integer coldStorage;

    @NameInMap("CoreDiskCategory")
    private String coreDiskCategory;

    @NameInMap("CoreNum")
    private Integer coreNum;

    @NameInMap("CoreSingleStorage")
    private Integer coreSingleStorage;

    @NameInMap("CoreSpec")
    private String coreSpec;

    @NameInMap("CreateMilliseconds")
    private Long createMilliseconds;

    @NameInMap("CreateTime")
    private String createTime;

    @NameInMap("DeletionProtection")
    private String deletionProtection;

    @NameInMap("DiskCategory")
    private String diskCategory;

    @NameInMap("DiskThreshold")
    private String diskThreshold;

    @NameInMap("DiskUsage")
    private String diskUsage;

    @NameInMap("EnableBlob")
    private Boolean enableBlob;

    @NameInMap("EnableCdc")
    private Boolean enableCdc;

    @NameInMap("EnableCompute")
    private Boolean enableCompute;

    @NameInMap("EnableKms")
    private Boolean enableKms;

    @NameInMap("EnableLTS")
    private Boolean enableLTS;

    @NameInMap("EnableLsqlVersionV3")
    private Boolean enableLsqlVersionV3;

    @NameInMap("EnableMLCtrl")
    private Boolean enableMLCtrl;

    @NameInMap("EnableSSL")
    private Boolean enableSSL;

    @NameInMap("EnableShs")
    private Boolean enableShs;

    @NameInMap("EnableStream")
    private Boolean enableStream;

    @NameInMap("EngineList")
    private java.util.List < EngineList> engineList;

    @NameInMap("EngineType")
    private Integer engineType;

    @NameInMap("ExpireTime")
    private String expireTime;

    @NameInMap("ExpiredMilliseconds")
    private Long expiredMilliseconds;

    @NameInMap("InstanceAlias")
    private String instanceAlias;

    @NameInMap("InstanceId")
    private String instanceId;

    @NameInMap("InstanceStatus")
    private String instanceStatus;

    @NameInMap("InstanceStorage")
    private String instanceStorage;

    @NameInMap("LogDiskCategory")
    private String logDiskCategory;

    @NameInMap("LogNum")
    private Integer logNum;

    @NameInMap("LogSingleStorage")
    private Integer logSingleStorage;

    @NameInMap("LogSpec")
    private String logSpec;

    @NameInMap("MaintainEndTime")
    private String maintainEndTime;

    @NameInMap("MaintainStartTime")
    private String maintainStartTime;

    @NameInMap("MultiZoneCombination")
    private String multiZoneCombination;

    @NameInMap("NetworkType")
    private String networkType;

    @NameInMap("PayType")
    private String payType;

    @NameInMap("PrimaryVSwitchId")
    private String primaryVSwitchId;

    @NameInMap("PrimaryZoneId")
    private String primaryZoneId;

    @NameInMap("RegionId")
    private String regionId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @NameInMap("ServiceType")
    private String serviceType;

    @NameInMap("StandbyVSwitchId")
    private String standbyVSwitchId;

    @NameInMap("StandbyZoneId")
    private String standbyZoneId;

    @NameInMap("VpcId")
    private String vpcId;

    @NameInMap("VswitchId")
    private String vswitchId;

    @NameInMap("ZoneId")
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
         * ArchVersion.
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
         * ColdStorage.
         */
        public Builder coldStorage(Integer coldStorage) {
            this.coldStorage = coldStorage;
            return this;
        }

        /**
         * CoreDiskCategory.
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
         * DiskCategory.
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
         * EnableLTS.
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
         * EngineList.
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
         * InstanceStatus.
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
         * LogSingleStorage.
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
        @NameInMap("CoreCount")
        private String coreCount;

        @NameInMap("CpuCount")
        private String cpuCount;

        @NameInMap("Engine")
        private String engine;

        @NameInMap("IsLastVersion")
        private Boolean isLastVersion;

        @NameInMap("LatestVersion")
        private String latestVersion;

        @NameInMap("MemorySize")
        private String memorySize;

        @NameInMap("Version")
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
