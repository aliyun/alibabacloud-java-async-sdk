// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstancesResponseBody</p>
 */
public class DescribeInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Instances")
    private Instances instances;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribeInstancesResponseBody(Builder builder) {
        this.instances = builder.instances;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstancesResponseBody create() {
        return builder().build();
    }

    /**
     * @return instances
     */
    public Instances getInstances() {
        return this.instances;
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
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Instances instances; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Long totalCount; 

        /**
         * Instances.
         */
        public Builder instances(Instances instances) {
            this.instances = instances;
            return this;
        }

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
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeInstancesResponseBody build() {
            return new DescribeInstancesResponseBody(this);
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
    public static class Instance extends TeaModel {
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

        @com.aliyun.core.annotation.NameInMap("ColdStorageStatus")
        private String coldStorageStatus;

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

        @com.aliyun.core.annotation.NameInMap("ModuleId")
        private Integer moduleId;

        @com.aliyun.core.annotation.NameInMap("ModuleStackVersion")
        private String moduleStackVersion;

        @com.aliyun.core.annotation.NameInMap("NetworkType")
        private String networkType;

        @com.aliyun.core.annotation.NameInMap("ParentId")
        private String parentId;

        @com.aliyun.core.annotation.NameInMap("PayType")
        private String payType;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private Tags tags;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("VswitchId")
        private String vswitchId;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private Instance(Builder builder) {
            this.autoRenewal = builder.autoRenewal;
            this.backupStatus = builder.backupStatus;
            this.clusterId = builder.clusterId;
            this.clusterName = builder.clusterName;
            this.clusterType = builder.clusterType;
            this.coldStorageStatus = builder.coldStorageStatus;
            this.coreDiskCount = builder.coreDiskCount;
            this.coreDiskSize = builder.coreDiskSize;
            this.coreDiskType = builder.coreDiskType;
            this.coreInstanceType = builder.coreInstanceType;
            this.coreNodeCount = builder.coreNodeCount;
            this.createdTime = builder.createdTime;
            this.createdTimeUTC = builder.createdTimeUTC;
            this.duration = builder.duration;
            this.engine = builder.engine;
            this.expireTime = builder.expireTime;
            this.expireTimeUTC = builder.expireTimeUTC;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.isDeletionProtection = builder.isDeletionProtection;
            this.isHa = builder.isHa;
            this.majorVersion = builder.majorVersion;
            this.masterDiskSize = builder.masterDiskSize;
            this.masterDiskType = builder.masterDiskType;
            this.masterInstanceType = builder.masterInstanceType;
            this.masterNodeCount = builder.masterNodeCount;
            this.moduleId = builder.moduleId;
            this.moduleStackVersion = builder.moduleStackVersion;
            this.networkType = builder.networkType;
            this.parentId = builder.parentId;
            this.payType = builder.payType;
            this.regionId = builder.regionId;
            this.resourceGroupId = builder.resourceGroupId;
            this.status = builder.status;
            this.tags = builder.tags;
            this.vpcId = builder.vpcId;
            this.vswitchId = builder.vswitchId;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instance create() {
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
         * @return coldStorageStatus
         */
        public String getColdStorageStatus() {
            return this.coldStorageStatus;
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
            private String coldStorageStatus; 
            private String coreDiskCount; 
            private Integer coreDiskSize; 
            private String coreDiskType; 
            private String coreInstanceType; 
            private Integer coreNodeCount; 
            private String createdTime; 
            private String createdTimeUTC; 
            private Integer duration; 
            private String engine; 
            private String expireTime; 
            private String expireTimeUTC; 
            private String instanceId; 
            private String instanceName; 
            private Boolean isDeletionProtection; 
            private Boolean isHa; 
            private String majorVersion; 
            private Integer masterDiskSize; 
            private String masterDiskType; 
            private String masterInstanceType; 
            private Integer masterNodeCount; 
            private Integer moduleId; 
            private String moduleStackVersion; 
            private String networkType; 
            private String parentId; 
            private String payType; 
            private String regionId; 
            private String resourceGroupId; 
            private String status; 
            private Tags tags; 
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
             * ColdStorageStatus.
             */
            public Builder coldStorageStatus(String coldStorageStatus) {
                this.coldStorageStatus = coldStorageStatus;
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

            public Instance build() {
                return new Instance(this);
            } 

        } 

    }
    public static class Instances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Instance")
        private java.util.List < Instance> instance;

        private Instances(Builder builder) {
            this.instance = builder.instance;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instances create() {
            return builder().build();
        }

        /**
         * @return instance
         */
        public java.util.List < Instance> getInstance() {
            return this.instance;
        }

        public static final class Builder {
            private java.util.List < Instance> instance; 

            /**
             * Instance.
             */
            public Builder instance(java.util.List < Instance> instance) {
                this.instance = instance;
                return this;
            }

            public Instances build() {
                return new Instances(this);
            } 

        } 

    }
}
