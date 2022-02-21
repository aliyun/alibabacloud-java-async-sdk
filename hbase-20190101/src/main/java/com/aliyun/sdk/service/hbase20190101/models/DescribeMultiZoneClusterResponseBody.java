// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMultiZoneClusterResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMultiZoneClusterResponseBody</p>
 */
public class DescribeMultiZoneClusterResponseBody extends TeaModel {
    @NameInMap("ArbiterVSwitchIds")
    private String arbiterVSwitchIds;

    @NameInMap("ArbiterZoneId")
    private String arbiterZoneId;

    @NameInMap("AutoRenewal")
    private Boolean autoRenewal;

    @NameInMap("ClusterId")
    private String clusterId;

    @NameInMap("ClusterName")
    private String clusterName;

    @NameInMap("CoreDiskCount")
    private String coreDiskCount;

    @NameInMap("CoreDiskSize")
    private Integer coreDiskSize;

    @NameInMap("CoreDiskType")
    private String coreDiskType;

    @NameInMap("CoreInstanceType")
    private String coreInstanceType;

    @NameInMap("CoreNodeCount")
    private Integer coreNodeCount;

    @NameInMap("CreatedTime")
    private String createdTime;

    @NameInMap("CreatedTimeUTC")
    private String createdTimeUTC;

    @NameInMap("Duration")
    private Integer duration;

    @NameInMap("EncryptionKey")
    private String encryptionKey;

    @NameInMap("EncryptionType")
    private String encryptionType;

    @NameInMap("Engine")
    private String engine;

    @NameInMap("ExpireTime")
    private String expireTime;

    @NameInMap("ExpireTimeUTC")
    private String expireTimeUTC;

    @NameInMap("InstanceId")
    private String instanceId;

    @NameInMap("InstanceName")
    private String instanceName;

    @NameInMap("IsDeletionProtection")
    private Boolean isDeletionProtection;

    @NameInMap("LogDiskCount")
    private String logDiskCount;

    @NameInMap("LogDiskSize")
    private Integer logDiskSize;

    @NameInMap("LogDiskType")
    private String logDiskType;

    @NameInMap("LogInstanceType")
    private String logInstanceType;

    @NameInMap("LogNodeCount")
    private Integer logNodeCount;

    @NameInMap("MaintainEndTime")
    private String maintainEndTime;

    @NameInMap("MaintainStartTime")
    private String maintainStartTime;

    @NameInMap("MajorVersion")
    private String majorVersion;

    @NameInMap("MasterDiskSize")
    private Integer masterDiskSize;

    @NameInMap("MasterDiskType")
    private String masterDiskType;

    @NameInMap("MasterInstanceType")
    private String masterInstanceType;

    @NameInMap("MasterNodeCount")
    private Integer masterNodeCount;

    @NameInMap("ModuleId")
    private Integer moduleId;

    @NameInMap("ModuleStackVersion")
    private String moduleStackVersion;

    @NameInMap("MultiZoneCombination")
    private String multiZoneCombination;

    @NameInMap("MultiZoneInstanceModels")
    private MultiZoneInstanceModels multiZoneInstanceModels;

    @NameInMap("NetworkType")
    private String networkType;

    @NameInMap("ParentId")
    private String parentId;

    @NameInMap("PayType")
    private String payType;

    @NameInMap("PrimaryVSwitchIds")
    private String primaryVSwitchIds;

    @NameInMap("PrimaryZoneId")
    private String primaryZoneId;

    @NameInMap("RegionId")
    private String regionId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @NameInMap("StandbyVSwitchIds")
    private String standbyVSwitchIds;

    @NameInMap("StandbyZoneId")
    private String standbyZoneId;

    @NameInMap("Status")
    private String status;

    @NameInMap("Tags")
    private Tags tags;

    @NameInMap("VpcId")
    private String vpcId;

    private DescribeMultiZoneClusterResponseBody(Builder builder) {
        this.arbiterVSwitchIds = builder.arbiterVSwitchIds;
        this.arbiterZoneId = builder.arbiterZoneId;
        this.autoRenewal = builder.autoRenewal;
        this.clusterId = builder.clusterId;
        this.clusterName = builder.clusterName;
        this.coreDiskCount = builder.coreDiskCount;
        this.coreDiskSize = builder.coreDiskSize;
        this.coreDiskType = builder.coreDiskType;
        this.coreInstanceType = builder.coreInstanceType;
        this.coreNodeCount = builder.coreNodeCount;
        this.createdTime = builder.createdTime;
        this.createdTimeUTC = builder.createdTimeUTC;
        this.duration = builder.duration;
        this.encryptionKey = builder.encryptionKey;
        this.encryptionType = builder.encryptionType;
        this.engine = builder.engine;
        this.expireTime = builder.expireTime;
        this.expireTimeUTC = builder.expireTimeUTC;
        this.instanceId = builder.instanceId;
        this.instanceName = builder.instanceName;
        this.isDeletionProtection = builder.isDeletionProtection;
        this.logDiskCount = builder.logDiskCount;
        this.logDiskSize = builder.logDiskSize;
        this.logDiskType = builder.logDiskType;
        this.logInstanceType = builder.logInstanceType;
        this.logNodeCount = builder.logNodeCount;
        this.maintainEndTime = builder.maintainEndTime;
        this.maintainStartTime = builder.maintainStartTime;
        this.majorVersion = builder.majorVersion;
        this.masterDiskSize = builder.masterDiskSize;
        this.masterDiskType = builder.masterDiskType;
        this.masterInstanceType = builder.masterInstanceType;
        this.masterNodeCount = builder.masterNodeCount;
        this.moduleId = builder.moduleId;
        this.moduleStackVersion = builder.moduleStackVersion;
        this.multiZoneCombination = builder.multiZoneCombination;
        this.multiZoneInstanceModels = builder.multiZoneInstanceModels;
        this.networkType = builder.networkType;
        this.parentId = builder.parentId;
        this.payType = builder.payType;
        this.primaryVSwitchIds = builder.primaryVSwitchIds;
        this.primaryZoneId = builder.primaryZoneId;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.resourceGroupId = builder.resourceGroupId;
        this.standbyVSwitchIds = builder.standbyVSwitchIds;
        this.standbyZoneId = builder.standbyZoneId;
        this.status = builder.status;
        this.tags = builder.tags;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMultiZoneClusterResponseBody create() {
        return builder().build();
    }

    /**
     * @return arbiterVSwitchIds
     */
    public String getArbiterVSwitchIds() {
        return this.arbiterVSwitchIds;
    }

    /**
     * @return arbiterZoneId
     */
    public String getArbiterZoneId() {
        return this.arbiterZoneId;
    }

    /**
     * @return autoRenewal
     */
    public Boolean getAutoRenewal() {
        return this.autoRenewal;
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
     * @return logDiskCount
     */
    public String getLogDiskCount() {
        return this.logDiskCount;
    }

    /**
     * @return logDiskSize
     */
    public Integer getLogDiskSize() {
        return this.logDiskSize;
    }

    /**
     * @return logDiskType
     */
    public String getLogDiskType() {
        return this.logDiskType;
    }

    /**
     * @return logInstanceType
     */
    public String getLogInstanceType() {
        return this.logInstanceType;
    }

    /**
     * @return logNodeCount
     */
    public Integer getLogNodeCount() {
        return this.logNodeCount;
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
     * @return multiZoneCombination
     */
    public String getMultiZoneCombination() {
        return this.multiZoneCombination;
    }

    /**
     * @return multiZoneInstanceModels
     */
    public MultiZoneInstanceModels getMultiZoneInstanceModels() {
        return this.multiZoneInstanceModels;
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
     * @return primaryVSwitchIds
     */
    public String getPrimaryVSwitchIds() {
        return this.primaryVSwitchIds;
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
     * @return standbyVSwitchIds
     */
    public String getStandbyVSwitchIds() {
        return this.standbyVSwitchIds;
    }

    /**
     * @return standbyZoneId
     */
    public String getStandbyZoneId() {
        return this.standbyZoneId;
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
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder {
        private String arbiterVSwitchIds; 
        private String arbiterZoneId; 
        private Boolean autoRenewal; 
        private String clusterId; 
        private String clusterName; 
        private String coreDiskCount; 
        private Integer coreDiskSize; 
        private String coreDiskType; 
        private String coreInstanceType; 
        private Integer coreNodeCount; 
        private String createdTime; 
        private String createdTimeUTC; 
        private Integer duration; 
        private String encryptionKey; 
        private String encryptionType; 
        private String engine; 
        private String expireTime; 
        private String expireTimeUTC; 
        private String instanceId; 
        private String instanceName; 
        private Boolean isDeletionProtection; 
        private String logDiskCount; 
        private Integer logDiskSize; 
        private String logDiskType; 
        private String logInstanceType; 
        private Integer logNodeCount; 
        private String maintainEndTime; 
        private String maintainStartTime; 
        private String majorVersion; 
        private Integer masterDiskSize; 
        private String masterDiskType; 
        private String masterInstanceType; 
        private Integer masterNodeCount; 
        private Integer moduleId; 
        private String moduleStackVersion; 
        private String multiZoneCombination; 
        private MultiZoneInstanceModels multiZoneInstanceModels; 
        private String networkType; 
        private String parentId; 
        private String payType; 
        private String primaryVSwitchIds; 
        private String primaryZoneId; 
        private String regionId; 
        private String requestId; 
        private String resourceGroupId; 
        private String standbyVSwitchIds; 
        private String standbyZoneId; 
        private String status; 
        private Tags tags; 
        private String vpcId; 

        /**
         * ArbiterVSwitchIds.
         */
        public Builder arbiterVSwitchIds(String arbiterVSwitchIds) {
            this.arbiterVSwitchIds = arbiterVSwitchIds;
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
         * AutoRenewal.
         */
        public Builder autoRenewal(Boolean autoRenewal) {
            this.autoRenewal = autoRenewal;
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
         * LogDiskCount.
         */
        public Builder logDiskCount(String logDiskCount) {
            this.logDiskCount = logDiskCount;
            return this;
        }

        /**
         * LogDiskSize.
         */
        public Builder logDiskSize(Integer logDiskSize) {
            this.logDiskSize = logDiskSize;
            return this;
        }

        /**
         * LogDiskType.
         */
        public Builder logDiskType(String logDiskType) {
            this.logDiskType = logDiskType;
            return this;
        }

        /**
         * LogInstanceType.
         */
        public Builder logInstanceType(String logInstanceType) {
            this.logInstanceType = logInstanceType;
            return this;
        }

        /**
         * LogNodeCount.
         */
        public Builder logNodeCount(Integer logNodeCount) {
            this.logNodeCount = logNodeCount;
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
         * MultiZoneCombination.
         */
        public Builder multiZoneCombination(String multiZoneCombination) {
            this.multiZoneCombination = multiZoneCombination;
            return this;
        }

        /**
         * MultiZoneInstanceModels.
         */
        public Builder multiZoneInstanceModels(MultiZoneInstanceModels multiZoneInstanceModels) {
            this.multiZoneInstanceModels = multiZoneInstanceModels;
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
         * PrimaryVSwitchIds.
         */
        public Builder primaryVSwitchIds(String primaryVSwitchIds) {
            this.primaryVSwitchIds = primaryVSwitchIds;
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
         * StandbyVSwitchIds.
         */
        public Builder standbyVSwitchIds(String standbyVSwitchIds) {
            this.standbyVSwitchIds = standbyVSwitchIds;
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
         * VpcId.
         */
        public Builder vpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }

        public DescribeMultiZoneClusterResponseBody build() {
            return new DescribeMultiZoneClusterResponseBody(this);
        } 

    } 

    public static class MultiZoneInstanceModel extends TeaModel {
        @NameInMap("InsName")
        private String insName;

        @NameInMap("IsLatestVersion")
        private Boolean isLatestVersion;

        @NameInMap("MinorVersion")
        private String minorVersion;

        @NameInMap("Role")
        private String role;

        @NameInMap("Status")
        private String status;

        private MultiZoneInstanceModel(Builder builder) {
            this.insName = builder.insName;
            this.isLatestVersion = builder.isLatestVersion;
            this.minorVersion = builder.minorVersion;
            this.role = builder.role;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MultiZoneInstanceModel create() {
            return builder().build();
        }

        /**
         * @return insName
         */
        public String getInsName() {
            return this.insName;
        }

        /**
         * @return isLatestVersion
         */
        public Boolean getIsLatestVersion() {
            return this.isLatestVersion;
        }

        /**
         * @return minorVersion
         */
        public String getMinorVersion() {
            return this.minorVersion;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String insName; 
            private Boolean isLatestVersion; 
            private String minorVersion; 
            private String role; 
            private String status; 

            /**
             * InsName.
             */
            public Builder insName(String insName) {
                this.insName = insName;
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
             * MinorVersion.
             */
            public Builder minorVersion(String minorVersion) {
                this.minorVersion = minorVersion;
                return this;
            }

            /**
             * Role.
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public MultiZoneInstanceModel build() {
                return new MultiZoneInstanceModel(this);
            } 

        } 

    }
    public static class MultiZoneInstanceModels extends TeaModel {
        @NameInMap("MultiZoneInstanceModel")
        private java.util.List < MultiZoneInstanceModel> multiZoneInstanceModel;

        private MultiZoneInstanceModels(Builder builder) {
            this.multiZoneInstanceModel = builder.multiZoneInstanceModel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MultiZoneInstanceModels create() {
            return builder().build();
        }

        /**
         * @return multiZoneInstanceModel
         */
        public java.util.List < MultiZoneInstanceModel> getMultiZoneInstanceModel() {
            return this.multiZoneInstanceModel;
        }

        public static final class Builder {
            private java.util.List < MultiZoneInstanceModel> multiZoneInstanceModel; 

            /**
             * MultiZoneInstanceModel.
             */
            public Builder multiZoneInstanceModel(java.util.List < MultiZoneInstanceModel> multiZoneInstanceModel) {
                this.multiZoneInstanceModel = multiZoneInstanceModel;
                return this;
            }

            public MultiZoneInstanceModels build() {
                return new MultiZoneInstanceModels(this);
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
    public static class Tags extends TeaModel {
        @NameInMap("Tag")
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
