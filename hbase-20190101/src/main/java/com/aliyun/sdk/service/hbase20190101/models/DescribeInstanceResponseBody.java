// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceResponseBody</p>
 */
public class DescribeInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AutoRenewal")
    private Boolean autoRenewal;

    @com.aliyun.core.annotation.NameInMap("BackupStatus")
    private String backupStatus;

    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.NameInMap("ClusterName")
    private String clusterName;

    @com.aliyun.core.annotation.NameInMap("ClusterType")
    private String clusterType;

    @com.aliyun.core.annotation.NameInMap("ColdStorageSize")
    private Integer coldStorageSize;

    @com.aliyun.core.annotation.NameInMap("ColdStorageStatus")
    private String coldStorageStatus;

    @com.aliyun.core.annotation.NameInMap("ConfirmMaintainTime")
    private String confirmMaintainTime;

    @com.aliyun.core.annotation.NameInMap("CoreDiskCount")
    private String coreDiskCount;

    @com.aliyun.core.annotation.NameInMap("CoreDiskSize")
    private Integer coreDiskSize;

    @com.aliyun.core.annotation.NameInMap("CoreDiskType")
    private String coreDiskType;

    @com.aliyun.core.annotation.NameInMap("CoreInstanceType")
    private String coreInstanceType;

    @com.aliyun.core.annotation.NameInMap("CoreNodeCount")
    private Integer coreNodeCount;

    @com.aliyun.core.annotation.NameInMap("CreatedTime")
    private String createdTime;

    @com.aliyun.core.annotation.NameInMap("CreatedTimeUTC")
    private String createdTimeUTC;

    @com.aliyun.core.annotation.NameInMap("Duration")
    private Integer duration;

    @com.aliyun.core.annotation.NameInMap("EnableHbaseProxy")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean enableHbaseProxy;

    @com.aliyun.core.annotation.NameInMap("EncryptionKey")
    private String encryptionKey;

    @com.aliyun.core.annotation.NameInMap("EncryptionType")
    private String encryptionType;

    @com.aliyun.core.annotation.NameInMap("Engine")
    private String engine;

    @com.aliyun.core.annotation.NameInMap("ExpireTime")
    private String expireTime;

    @com.aliyun.core.annotation.NameInMap("ExpireTimeUTC")
    private String expireTimeUTC;

    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("InstanceName")
    private String instanceName;

    @com.aliyun.core.annotation.NameInMap("IsDeletionProtection")
    private Boolean isDeletionProtection;

    @com.aliyun.core.annotation.NameInMap("IsHa")
    private Boolean isHa;

    @com.aliyun.core.annotation.NameInMap("IsLatestVersion")
    private Boolean isLatestVersion;

    @com.aliyun.core.annotation.NameInMap("IsMultiModel")
    private Boolean isMultiModel;

    @com.aliyun.core.annotation.NameInMap("LproxyMinorVersion")
    private String lproxyMinorVersion;

    @com.aliyun.core.annotation.NameInMap("MaintainEndTime")
    private String maintainEndTime;

    @com.aliyun.core.annotation.NameInMap("MaintainStartTime")
    private String maintainStartTime;

    @com.aliyun.core.annotation.NameInMap("MajorVersion")
    private String majorVersion;

    @com.aliyun.core.annotation.NameInMap("MasterDiskSize")
    private Integer masterDiskSize;

    @com.aliyun.core.annotation.NameInMap("MasterDiskType")
    private String masterDiskType;

    @com.aliyun.core.annotation.NameInMap("MasterInstanceType")
    private String masterInstanceType;

    @com.aliyun.core.annotation.NameInMap("MasterNodeCount")
    private Integer masterNodeCount;

    @com.aliyun.core.annotation.NameInMap("MinorVersion")
    private String minorVersion;

    @com.aliyun.core.annotation.NameInMap("ModuleId")
    private Integer moduleId;

    @com.aliyun.core.annotation.NameInMap("ModuleStackVersion")
    private String moduleStackVersion;

    @com.aliyun.core.annotation.NameInMap("NeedUpgrade")
    private Boolean needUpgrade;

    @com.aliyun.core.annotation.NameInMap("NeedUpgradeComps")
    private NeedUpgradeComps needUpgradeComps;

    @com.aliyun.core.annotation.NameInMap("NetworkType")
    private String networkType;

    @com.aliyun.core.annotation.NameInMap("ParentId")
    private String parentId;

    @com.aliyun.core.annotation.NameInMap("PayType")
    private String payType;

    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("Tags")
    private Tags tags;

    @com.aliyun.core.annotation.NameInMap("TaskProgress")
    private String taskProgress;

    @com.aliyun.core.annotation.NameInMap("TaskStatus")
    private String taskStatus;

    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    @com.aliyun.core.annotation.NameInMap("VswitchId")
    private String vswitchId;

    @com.aliyun.core.annotation.NameInMap("ZoneId")
    private String zoneId;

    private DescribeInstanceResponseBody(Builder builder) {
        this.autoRenewal = builder.autoRenewal;
        this.backupStatus = builder.backupStatus;
        this.clusterId = builder.clusterId;
        this.clusterName = builder.clusterName;
        this.clusterType = builder.clusterType;
        this.coldStorageSize = builder.coldStorageSize;
        this.coldStorageStatus = builder.coldStorageStatus;
        this.confirmMaintainTime = builder.confirmMaintainTime;
        this.coreDiskCount = builder.coreDiskCount;
        this.coreDiskSize = builder.coreDiskSize;
        this.coreDiskType = builder.coreDiskType;
        this.coreInstanceType = builder.coreInstanceType;
        this.coreNodeCount = builder.coreNodeCount;
        this.createdTime = builder.createdTime;
        this.createdTimeUTC = builder.createdTimeUTC;
        this.duration = builder.duration;
        this.enableHbaseProxy = builder.enableHbaseProxy;
        this.encryptionKey = builder.encryptionKey;
        this.encryptionType = builder.encryptionType;
        this.engine = builder.engine;
        this.expireTime = builder.expireTime;
        this.expireTimeUTC = builder.expireTimeUTC;
        this.instanceId = builder.instanceId;
        this.instanceName = builder.instanceName;
        this.isDeletionProtection = builder.isDeletionProtection;
        this.isHa = builder.isHa;
        this.isLatestVersion = builder.isLatestVersion;
        this.isMultiModel = builder.isMultiModel;
        this.lproxyMinorVersion = builder.lproxyMinorVersion;
        this.maintainEndTime = builder.maintainEndTime;
        this.maintainStartTime = builder.maintainStartTime;
        this.majorVersion = builder.majorVersion;
        this.masterDiskSize = builder.masterDiskSize;
        this.masterDiskType = builder.masterDiskType;
        this.masterInstanceType = builder.masterInstanceType;
        this.masterNodeCount = builder.masterNodeCount;
        this.minorVersion = builder.minorVersion;
        this.moduleId = builder.moduleId;
        this.moduleStackVersion = builder.moduleStackVersion;
        this.needUpgrade = builder.needUpgrade;
        this.needUpgradeComps = builder.needUpgradeComps;
        this.networkType = builder.networkType;
        this.parentId = builder.parentId;
        this.payType = builder.payType;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.resourceGroupId = builder.resourceGroupId;
        this.status = builder.status;
        this.tags = builder.tags;
        this.taskProgress = builder.taskProgress;
        this.taskStatus = builder.taskStatus;
        this.vpcId = builder.vpcId;
        this.vswitchId = builder.vswitchId;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceResponseBody create() {
        return builder().build();
    }

    /**
     * @return autoRenewal
     */
    public Boolean getAutoRenewal() {
        return this.autoRenewal;
    }

    /**
     * @return backupStatus
     */
    public String getBackupStatus() {
        return this.backupStatus;
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
     * @return coldStorageSize
     */
    public Integer getColdStorageSize() {
        return this.coldStorageSize;
    }

    /**
     * @return coldStorageStatus
     */
    public String getColdStorageStatus() {
        return this.coldStorageStatus;
    }

    /**
     * @return confirmMaintainTime
     */
    public String getConfirmMaintainTime() {
        return this.confirmMaintainTime;
    }

    /**
     * @return coreDiskCount
     */
    public String getCoreDiskCount() {
        return this.coreDiskCount;
    }

    /**
     * @return coreDiskSize
     */
    public Integer getCoreDiskSize() {
        return this.coreDiskSize;
    }

    /**
     * @return coreDiskType
     */
    public String getCoreDiskType() {
        return this.coreDiskType;
    }

    /**
     * @return coreInstanceType
     */
    public String getCoreInstanceType() {
        return this.coreInstanceType;
    }

    /**
     * @return coreNodeCount
     */
    public Integer getCoreNodeCount() {
        return this.coreNodeCount;
    }

    /**
     * @return createdTime
     */
    public String getCreatedTime() {
        return this.createdTime;
    }

    /**
     * @return createdTimeUTC
     */
    public String getCreatedTimeUTC() {
        return this.createdTimeUTC;
    }

    /**
     * @return duration
     */
    public Integer getDuration() {
        return this.duration;
    }

    /**
     * @return enableHbaseProxy
     */
    public Boolean getEnableHbaseProxy() {
        return this.enableHbaseProxy;
    }

    /**
     * @return encryptionKey
     */
    public String getEncryptionKey() {
        return this.encryptionKey;
    }

    /**
     * @return encryptionType
     */
    public String getEncryptionType() {
        return this.encryptionType;
    }

    /**
     * @return engine
     */
    public String getEngine() {
        return this.engine;
    }

    /**
     * @return expireTime
     */
    public String getExpireTime() {
        return this.expireTime;
    }

    /**
     * @return expireTimeUTC
     */
    public String getExpireTimeUTC() {
        return this.expireTimeUTC;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return isDeletionProtection
     */
    public Boolean getIsDeletionProtection() {
        return this.isDeletionProtection;
    }

    /**
     * @return isHa
     */
    public Boolean getIsHa() {
        return this.isHa;
    }

    /**
     * @return isLatestVersion
     */
    public Boolean getIsLatestVersion() {
        return this.isLatestVersion;
    }

    /**
     * @return isMultiModel
     */
    public Boolean getIsMultiModel() {
        return this.isMultiModel;
    }

    /**
     * @return lproxyMinorVersion
     */
    public String getLproxyMinorVersion() {
        return this.lproxyMinorVersion;
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
     * @return majorVersion
     */
    public String getMajorVersion() {
        return this.majorVersion;
    }

    /**
     * @return masterDiskSize
     */
    public Integer getMasterDiskSize() {
        return this.masterDiskSize;
    }

    /**
     * @return masterDiskType
     */
    public String getMasterDiskType() {
        return this.masterDiskType;
    }

    /**
     * @return masterInstanceType
     */
    public String getMasterInstanceType() {
        return this.masterInstanceType;
    }

    /**
     * @return masterNodeCount
     */
    public Integer getMasterNodeCount() {
        return this.masterNodeCount;
    }

    /**
     * @return minorVersion
     */
    public String getMinorVersion() {
        return this.minorVersion;
    }

    /**
     * @return moduleId
     */
    public Integer getModuleId() {
        return this.moduleId;
    }

    /**
     * @return moduleStackVersion
     */
    public String getModuleStackVersion() {
        return this.moduleStackVersion;
    }

    /**
     * @return needUpgrade
     */
    public Boolean getNeedUpgrade() {
        return this.needUpgrade;
    }

    /**
     * @return needUpgradeComps
     */
    public NeedUpgradeComps getNeedUpgradeComps() {
        return this.needUpgradeComps;
    }

    /**
     * @return networkType
     */
    public String getNetworkType() {
        return this.networkType;
    }

    /**
     * @return parentId
     */
    public String getParentId() {
        return this.parentId;
    }

    /**
     * @return payType
     */
    public String getPayType() {
        return this.payType;
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
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return tags
     */
    public Tags getTags() {
        return this.tags;
    }

    /**
     * @return taskProgress
     */
    public String getTaskProgress() {
        return this.taskProgress;
    }

    /**
     * @return taskStatus
     */
    public String getTaskStatus() {
        return this.taskStatus;
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
        private Boolean autoRenewal; 
        private String backupStatus; 
        private String clusterId; 
        private String clusterName; 
        private String clusterType; 
        private Integer coldStorageSize; 
        private String coldStorageStatus; 
        private String confirmMaintainTime; 
        private String coreDiskCount; 
        private Integer coreDiskSize; 
        private String coreDiskType; 
        private String coreInstanceType; 
        private Integer coreNodeCount; 
        private String createdTime; 
        private String createdTimeUTC; 
        private Integer duration; 
        private Boolean enableHbaseProxy; 
        private String encryptionKey; 
        private String encryptionType; 
        private String engine; 
        private String expireTime; 
        private String expireTimeUTC; 
        private String instanceId; 
        private String instanceName; 
        private Boolean isDeletionProtection; 
        private Boolean isHa; 
        private Boolean isLatestVersion; 
        private Boolean isMultiModel; 
        private String lproxyMinorVersion; 
        private String maintainEndTime; 
        private String maintainStartTime; 
        private String majorVersion; 
        private Integer masterDiskSize; 
        private String masterDiskType; 
        private String masterInstanceType; 
        private Integer masterNodeCount; 
        private String minorVersion; 
        private Integer moduleId; 
        private String moduleStackVersion; 
        private Boolean needUpgrade; 
        private NeedUpgradeComps needUpgradeComps; 
        private String networkType; 
        private String parentId; 
        private String payType; 
        private String regionId; 
        private String requestId; 
        private String resourceGroupId; 
        private String status; 
        private Tags tags; 
        private String taskProgress; 
        private String taskStatus; 
        private String vpcId; 
        private String vswitchId; 
        private String zoneId; 

        /**
         * AutoRenewal.
         */
        public Builder autoRenewal(Boolean autoRenewal) {
            this.autoRenewal = autoRenewal;
            return this;
        }

        /**
         * BackupStatus.
         */
        public Builder backupStatus(String backupStatus) {
            this.backupStatus = backupStatus;
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
         * ClusterName.
         */
        public Builder clusterName(String clusterName) {
            this.clusterName = clusterName;
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
         * ColdStorageSize.
         */
        public Builder coldStorageSize(Integer coldStorageSize) {
            this.coldStorageSize = coldStorageSize;
            return this;
        }

        /**
         * ColdStorageStatus.
         */
        public Builder coldStorageStatus(String coldStorageStatus) {
            this.coldStorageStatus = coldStorageStatus;
            return this;
        }

        /**
         * ConfirmMaintainTime.
         */
        public Builder confirmMaintainTime(String confirmMaintainTime) {
            this.confirmMaintainTime = confirmMaintainTime;
            return this;
        }

        /**
         * CoreDiskCount.
         */
        public Builder coreDiskCount(String coreDiskCount) {
            this.coreDiskCount = coreDiskCount;
            return this;
        }

        /**
         * CoreDiskSize.
         */
        public Builder coreDiskSize(Integer coreDiskSize) {
            this.coreDiskSize = coreDiskSize;
            return this;
        }

        /**
         * CoreDiskType.
         */
        public Builder coreDiskType(String coreDiskType) {
            this.coreDiskType = coreDiskType;
            return this;
        }

        /**
         * CoreInstanceType.
         */
        public Builder coreInstanceType(String coreInstanceType) {
            this.coreInstanceType = coreInstanceType;
            return this;
        }

        /**
         * CoreNodeCount.
         */
        public Builder coreNodeCount(Integer coreNodeCount) {
            this.coreNodeCount = coreNodeCount;
            return this;
        }

        /**
         * CreatedTime.
         */
        public Builder createdTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        /**
         * CreatedTimeUTC.
         */
        public Builder createdTimeUTC(String createdTimeUTC) {
            this.createdTimeUTC = createdTimeUTC;
            return this;
        }

        /**
         * Duration.
         */
        public Builder duration(Integer duration) {
            this.duration = duration;
            return this;
        }

        /**
         * EnableHbaseProxy.
         */
        public Builder enableHbaseProxy(Boolean enableHbaseProxy) {
            this.enableHbaseProxy = enableHbaseProxy;
            return this;
        }

        /**
         * EncryptionKey.
         */
        public Builder encryptionKey(String encryptionKey) {
            this.encryptionKey = encryptionKey;
            return this;
        }

        /**
         * EncryptionType.
         */
        public Builder encryptionType(String encryptionType) {
            this.encryptionType = encryptionType;
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
         * ExpireTime.
         */
        public Builder expireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }

        /**
         * ExpireTimeUTC.
         */
        public Builder expireTimeUTC(String expireTimeUTC) {
            this.expireTimeUTC = expireTimeUTC;
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
         * InstanceName.
         */
        public Builder instanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }

        /**
         * IsDeletionProtection.
         */
        public Builder isDeletionProtection(Boolean isDeletionProtection) {
            this.isDeletionProtection = isDeletionProtection;
            return this;
        }

        /**
         * IsHa.
         */
        public Builder isHa(Boolean isHa) {
            this.isHa = isHa;
            return this;
        }

        /**
         * IsLatestVersion.
         */
        public Builder isLatestVersion(Boolean isLatestVersion) {
            this.isLatestVersion = isLatestVersion;
            return this;
        }

        /**
         * IsMultiModel.
         */
        public Builder isMultiModel(Boolean isMultiModel) {
            this.isMultiModel = isMultiModel;
            return this;
        }

        /**
         * LproxyMinorVersion.
         */
        public Builder lproxyMinorVersion(String lproxyMinorVersion) {
            this.lproxyMinorVersion = lproxyMinorVersion;
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
         * MajorVersion.
         */
        public Builder majorVersion(String majorVersion) {
            this.majorVersion = majorVersion;
            return this;
        }

        /**
         * MasterDiskSize.
         */
        public Builder masterDiskSize(Integer masterDiskSize) {
            this.masterDiskSize = masterDiskSize;
            return this;
        }

        /**
         * MasterDiskType.
         */
        public Builder masterDiskType(String masterDiskType) {
            this.masterDiskType = masterDiskType;
            return this;
        }

        /**
         * MasterInstanceType.
         */
        public Builder masterInstanceType(String masterInstanceType) {
            this.masterInstanceType = masterInstanceType;
            return this;
        }

        /**
         * MasterNodeCount.
         */
        public Builder masterNodeCount(Integer masterNodeCount) {
            this.masterNodeCount = masterNodeCount;
            return this;
        }

        /**
         * MinorVersion.
         */
        public Builder minorVersion(String minorVersion) {
            this.minorVersion = minorVersion;
            return this;
        }

        /**
         * ModuleId.
         */
        public Builder moduleId(Integer moduleId) {
            this.moduleId = moduleId;
            return this;
        }

        /**
         * ModuleStackVersion.
         */
        public Builder moduleStackVersion(String moduleStackVersion) {
            this.moduleStackVersion = moduleStackVersion;
            return this;
        }

        /**
         * NeedUpgrade.
         */
        public Builder needUpgrade(Boolean needUpgrade) {
            this.needUpgrade = needUpgrade;
            return this;
        }

        /**
         * NeedUpgradeComps.
         */
        public Builder needUpgradeComps(NeedUpgradeComps needUpgradeComps) {
            this.needUpgradeComps = needUpgradeComps;
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
         * ParentId.
         */
        public Builder parentId(String parentId) {
            this.parentId = parentId;
            return this;
        }

        /**
         * PayType.
         */
        public Builder payType(String payType) {
            this.payType = payType;
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
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * Tags.
         */
        public Builder tags(Tags tags) {
            this.tags = tags;
            return this;
        }

        /**
         * TaskProgress.
         */
        public Builder taskProgress(String taskProgress) {
            this.taskProgress = taskProgress;
            return this;
        }

        /**
         * TaskStatus.
         */
        public Builder taskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
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
         * VswitchId.
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

        public DescribeInstanceResponseBody build() {
            return new DescribeInstanceResponseBody(this);
        } 

    } 

    public static class NeedUpgradeComps extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Comps")
        private java.util.List < String > comps;

        private NeedUpgradeComps(Builder builder) {
            this.comps = builder.comps;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NeedUpgradeComps create() {
            return builder().build();
        }

        /**
         * @return comps
         */
        public java.util.List < String > getComps() {
            return this.comps;
        }

        public static final class Builder {
            private java.util.List < String > comps; 

            /**
             * Comps.
             */
            public Builder comps(java.util.List < String > comps) {
                this.comps = comps;
                return this;
            }

            public NeedUpgradeComps build() {
                return new NeedUpgradeComps(this);
            } 

        } 

    }
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
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
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Tag")
        private java.util.List < Tag> tag;

        private Tags(Builder builder) {
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tag
         */
        public java.util.List < Tag> getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List < Tag> tag; 

            /**
             * Tag.
             */
            public Builder tag(java.util.List < Tag> tag) {
                this.tag = tag;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}
