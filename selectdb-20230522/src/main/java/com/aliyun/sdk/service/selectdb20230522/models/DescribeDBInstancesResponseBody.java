// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.selectdb20230522.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBInstancesResponseBody</p>
 */
public class DescribeDBInstancesResponseBody extends TeaModel {
    @NameInMap("Items")
    private java.util.List < Items> items;

    @NameInMap("PageNumber")
    private Long pageNumber;

    @NameInMap("PageSize")
    private Long pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalRecordCount")
    private Long totalRecordCount;

    private DescribeDBInstancesResponseBody(Builder builder) {
        this.items = builder.items;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBInstancesResponseBody create() {
        return builder().build();
    }

    /**
     * @return items
     */
    public java.util.List < Items> getItems() {
        return this.items;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalRecordCount
     */
    public Long getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static final class Builder {
        private java.util.List < Items> items; 
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 
        private Long totalRecordCount; 

        /**
         * Items.
         */
        public Builder items(java.util.List < Items> items) {
            this.items = items;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
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
         * TotalRecordCount.
         */
        public Builder totalRecordCount(Long totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeDBInstancesResponseBody build() {
            return new DescribeDBInstancesResponseBody(this);
        } 

    } 

    public static class DBClusterList extends TeaModel {
        @NameInMap("CacheStorageSizeGiB")
        private Long cacheStorageSizeGiB;

        @NameInMap("CacheStorageType")
        private String cacheStorageType;

        @NameInMap("CpuCores")
        private Long cpuCores;

        @NameInMap("CreatedTime")
        private String createdTime;

        @NameInMap("DBInstanceId")
        private String DBInstanceId;

        @NameInMap("DbClusterClass")
        private String dbClusterClass;

        @NameInMap("DbClusterId")
        private String dbClusterId;

        @NameInMap("DbClusterName")
        private String dbClusterName;

        @NameInMap("Memory")
        private Long memory;

        @NameInMap("PerformanceLevel")
        private String performanceLevel;

        @NameInMap("Status")
        private String status;

        @NameInMap("objectStoreSizeGiB")
        private Long objectStoreSizeGiB;

        private DBClusterList(Builder builder) {
            this.cacheStorageSizeGiB = builder.cacheStorageSizeGiB;
            this.cacheStorageType = builder.cacheStorageType;
            this.cpuCores = builder.cpuCores;
            this.createdTime = builder.createdTime;
            this.DBInstanceId = builder.DBInstanceId;
            this.dbClusterClass = builder.dbClusterClass;
            this.dbClusterId = builder.dbClusterId;
            this.dbClusterName = builder.dbClusterName;
            this.memory = builder.memory;
            this.performanceLevel = builder.performanceLevel;
            this.status = builder.status;
            this.objectStoreSizeGiB = builder.objectStoreSizeGiB;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBClusterList create() {
            return builder().build();
        }

        /**
         * @return cacheStorageSizeGiB
         */
        public Long getCacheStorageSizeGiB() {
            return this.cacheStorageSizeGiB;
        }

        /**
         * @return cacheStorageType
         */
        public String getCacheStorageType() {
            return this.cacheStorageType;
        }

        /**
         * @return cpuCores
         */
        public Long getCpuCores() {
            return this.cpuCores;
        }

        /**
         * @return createdTime
         */
        public String getCreatedTime() {
            return this.createdTime;
        }

        /**
         * @return DBInstanceId
         */
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        /**
         * @return dbClusterClass
         */
        public String getDbClusterClass() {
            return this.dbClusterClass;
        }

        /**
         * @return dbClusterId
         */
        public String getDbClusterId() {
            return this.dbClusterId;
        }

        /**
         * @return dbClusterName
         */
        public String getDbClusterName() {
            return this.dbClusterName;
        }

        /**
         * @return memory
         */
        public Long getMemory() {
            return this.memory;
        }

        /**
         * @return performanceLevel
         */
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return objectStoreSizeGiB
         */
        public Long getObjectStoreSizeGiB() {
            return this.objectStoreSizeGiB;
        }

        public static final class Builder {
            private Long cacheStorageSizeGiB; 
            private String cacheStorageType; 
            private Long cpuCores; 
            private String createdTime; 
            private String DBInstanceId; 
            private String dbClusterClass; 
            private String dbClusterId; 
            private String dbClusterName; 
            private Long memory; 
            private String performanceLevel; 
            private String status; 
            private Long objectStoreSizeGiB; 

            /**
             * CacheStorageSizeGiB.
             */
            public Builder cacheStorageSizeGiB(Long cacheStorageSizeGiB) {
                this.cacheStorageSizeGiB = cacheStorageSizeGiB;
                return this;
            }

            /**
             * CacheStorageType.
             */
            public Builder cacheStorageType(String cacheStorageType) {
                this.cacheStorageType = cacheStorageType;
                return this;
            }

            /**
             * CpuCores.
             */
            public Builder cpuCores(Long cpuCores) {
                this.cpuCores = cpuCores;
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
             * DBInstanceId.
             */
            public Builder DBInstanceId(String DBInstanceId) {
                this.DBInstanceId = DBInstanceId;
                return this;
            }

            /**
             * DbClusterClass.
             */
            public Builder dbClusterClass(String dbClusterClass) {
                this.dbClusterClass = dbClusterClass;
                return this;
            }

            /**
             * DbClusterId.
             */
            public Builder dbClusterId(String dbClusterId) {
                this.dbClusterId = dbClusterId;
                return this;
            }

            /**
             * DbClusterName.
             */
            public Builder dbClusterName(String dbClusterName) {
                this.dbClusterName = dbClusterName;
                return this;
            }

            /**
             * Memory.
             */
            public Builder memory(Long memory) {
                this.memory = memory;
                return this;
            }

            /**
             * PerformanceLevel.
             */
            public Builder performanceLevel(String performanceLevel) {
                this.performanceLevel = performanceLevel;
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
             * objectStoreSizeGiB.
             */
            public Builder objectStoreSizeGiB(Long objectStoreSizeGiB) {
                this.objectStoreSizeGiB = objectStoreSizeGiB;
                return this;
            }

            public DBClusterList build() {
                return new DBClusterList(this);
            } 

        } 

    }
    public static class Tags extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
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

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    public static class Items extends TeaModel {
        @NameInMap("Category")
        private String category;

        @NameInMap("ChargeType")
        private String chargeType;

        @NameInMap("ClusterCount")
        private Integer clusterCount;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("DBClusterList")
        private java.util.List < DBClusterList> DBClusterList;

        @NameInMap("DBInstanceId")
        private String DBInstanceId;

        @NameInMap("Description")
        private String description;

        @NameInMap("Engine")
        private String engine;

        @NameInMap("EngineVersion")
        private String engineVersion;

        @NameInMap("ExpireTime")
        private String expireTime;

        @NameInMap("GmtCreated")
        private String gmtCreated;

        @NameInMap("GmtModified")
        private String gmtModified;

        @NameInMap("InstanceClass")
        private String instanceClass;

        @NameInMap("InstanceUsedType")
        private String instanceUsedType;

        @NameInMap("IsDeleted")
        private Boolean isDeleted;

        @NameInMap("LockMode")
        private Long lockMode;

        @NameInMap("LockReason")
        private String lockReason;

        @NameInMap("MaintainEndTimeStr")
        private String maintainEndTimeStr;

        @NameInMap("MaintainEndtime")
        private String maintainEndtime;

        @NameInMap("MaintainStartTimeStr")
        private String maintainStartTimeStr;

        @NameInMap("MaintainStarttime")
        private String maintainStarttime;

        @NameInMap("ObjectStoreSize")
        private Long objectStoreSize;

        @NameInMap("ParentInstance")
        private String parentInstance;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("ResourceCpu")
        private Long resourceCpu;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("ResourceMemory")
        private Long resourceMemory;

        @NameInMap("ScaleMax")
        private Long scaleMax;

        @NameInMap("ScaleMin")
        private Long scaleMin;

        @NameInMap("ScaleReplica")
        private Long scaleReplica;

        @NameInMap("Status")
        private String status;

        @NameInMap("StorageSize")
        private Long storageSize;

        @NameInMap("StorageType")
        private String storageType;

        @NameInMap("Tags")
        private java.util.List < Tags> tags;

        @NameInMap("TenantClusterId")
        private String tenantClusterId;

        @NameInMap("TenantToken")
        private String tenantToken;

        @NameInMap("TenantUserId")
        private String tenantUserId;

        @NameInMap("VpcId")
        private String vpcId;

        @NameInMap("VswitchId")
        private String vswitchId;

        @NameInMap("ZoneId")
        private String zoneId;

        @NameInMap("connectionString")
        private String connectionString;

        private Items(Builder builder) {
            this.category = builder.category;
            this.chargeType = builder.chargeType;
            this.clusterCount = builder.clusterCount;
            this.createTime = builder.createTime;
            this.DBClusterList = builder.DBClusterList;
            this.DBInstanceId = builder.DBInstanceId;
            this.description = builder.description;
            this.engine = builder.engine;
            this.engineVersion = builder.engineVersion;
            this.expireTime = builder.expireTime;
            this.gmtCreated = builder.gmtCreated;
            this.gmtModified = builder.gmtModified;
            this.instanceClass = builder.instanceClass;
            this.instanceUsedType = builder.instanceUsedType;
            this.isDeleted = builder.isDeleted;
            this.lockMode = builder.lockMode;
            this.lockReason = builder.lockReason;
            this.maintainEndTimeStr = builder.maintainEndTimeStr;
            this.maintainEndtime = builder.maintainEndtime;
            this.maintainStartTimeStr = builder.maintainStartTimeStr;
            this.maintainStarttime = builder.maintainStarttime;
            this.objectStoreSize = builder.objectStoreSize;
            this.parentInstance = builder.parentInstance;
            this.regionId = builder.regionId;
            this.resourceCpu = builder.resourceCpu;
            this.resourceGroupId = builder.resourceGroupId;
            this.resourceMemory = builder.resourceMemory;
            this.scaleMax = builder.scaleMax;
            this.scaleMin = builder.scaleMin;
            this.scaleReplica = builder.scaleReplica;
            this.status = builder.status;
            this.storageSize = builder.storageSize;
            this.storageType = builder.storageType;
            this.tags = builder.tags;
            this.tenantClusterId = builder.tenantClusterId;
            this.tenantToken = builder.tenantToken;
            this.tenantUserId = builder.tenantUserId;
            this.vpcId = builder.vpcId;
            this.vswitchId = builder.vswitchId;
            this.zoneId = builder.zoneId;
            this.connectionString = builder.connectionString;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return chargeType
         */
        public String getChargeType() {
            return this.chargeType;
        }

        /**
         * @return clusterCount
         */
        public Integer getClusterCount() {
            return this.clusterCount;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return DBClusterList
         */
        public java.util.List < DBClusterList> getDBClusterList() {
            return this.DBClusterList;
        }

        /**
         * @return DBInstanceId
         */
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return engine
         */
        public String getEngine() {
            return this.engine;
        }

        /**
         * @return engineVersion
         */
        public String getEngineVersion() {
            return this.engineVersion;
        }

        /**
         * @return expireTime
         */
        public String getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return gmtCreated
         */
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return instanceClass
         */
        public String getInstanceClass() {
            return this.instanceClass;
        }

        /**
         * @return instanceUsedType
         */
        public String getInstanceUsedType() {
            return this.instanceUsedType;
        }

        /**
         * @return isDeleted
         */
        public Boolean getIsDeleted() {
            return this.isDeleted;
        }

        /**
         * @return lockMode
         */
        public Long getLockMode() {
            return this.lockMode;
        }

        /**
         * @return lockReason
         */
        public String getLockReason() {
            return this.lockReason;
        }

        /**
         * @return maintainEndTimeStr
         */
        public String getMaintainEndTimeStr() {
            return this.maintainEndTimeStr;
        }

        /**
         * @return maintainEndtime
         */
        public String getMaintainEndtime() {
            return this.maintainEndtime;
        }

        /**
         * @return maintainStartTimeStr
         */
        public String getMaintainStartTimeStr() {
            return this.maintainStartTimeStr;
        }

        /**
         * @return maintainStarttime
         */
        public String getMaintainStarttime() {
            return this.maintainStarttime;
        }

        /**
         * @return objectStoreSize
         */
        public Long getObjectStoreSize() {
            return this.objectStoreSize;
        }

        /**
         * @return parentInstance
         */
        public String getParentInstance() {
            return this.parentInstance;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return resourceCpu
         */
        public Long getResourceCpu() {
            return this.resourceCpu;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return resourceMemory
         */
        public Long getResourceMemory() {
            return this.resourceMemory;
        }

        /**
         * @return scaleMax
         */
        public Long getScaleMax() {
            return this.scaleMax;
        }

        /**
         * @return scaleMin
         */
        public Long getScaleMin() {
            return this.scaleMin;
        }

        /**
         * @return scaleReplica
         */
        public Long getScaleReplica() {
            return this.scaleReplica;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return storageSize
         */
        public Long getStorageSize() {
            return this.storageSize;
        }

        /**
         * @return storageType
         */
        public String getStorageType() {
            return this.storageType;
        }

        /**
         * @return tags
         */
        public java.util.List < Tags> getTags() {
            return this.tags;
        }

        /**
         * @return tenantClusterId
         */
        public String getTenantClusterId() {
            return this.tenantClusterId;
        }

        /**
         * @return tenantToken
         */
        public String getTenantToken() {
            return this.tenantToken;
        }

        /**
         * @return tenantUserId
         */
        public String getTenantUserId() {
            return this.tenantUserId;
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

        /**
         * @return connectionString
         */
        public String getConnectionString() {
            return this.connectionString;
        }

        public static final class Builder {
            private String category; 
            private String chargeType; 
            private Integer clusterCount; 
            private String createTime; 
            private java.util.List < DBClusterList> DBClusterList; 
            private String DBInstanceId; 
            private String description; 
            private String engine; 
            private String engineVersion; 
            private String expireTime; 
            private String gmtCreated; 
            private String gmtModified; 
            private String instanceClass; 
            private String instanceUsedType; 
            private Boolean isDeleted; 
            private Long lockMode; 
            private String lockReason; 
            private String maintainEndTimeStr; 
            private String maintainEndtime; 
            private String maintainStartTimeStr; 
            private String maintainStarttime; 
            private Long objectStoreSize; 
            private String parentInstance; 
            private String regionId; 
            private Long resourceCpu; 
            private String resourceGroupId; 
            private Long resourceMemory; 
            private Long scaleMax; 
            private Long scaleMin; 
            private Long scaleReplica; 
            private String status; 
            private Long storageSize; 
            private String storageType; 
            private java.util.List < Tags> tags; 
            private String tenantClusterId; 
            private String tenantToken; 
            private String tenantUserId; 
            private String vpcId; 
            private String vswitchId; 
            private String zoneId; 
            private String connectionString; 

            /**
             * Category.
             */
            public Builder category(String category) {
                this.category = category;
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
             * ClusterCount.
             */
            public Builder clusterCount(Integer clusterCount) {
                this.clusterCount = clusterCount;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * DBClusterList.
             */
            public Builder DBClusterList(java.util.List < DBClusterList> DBClusterList) {
                this.DBClusterList = DBClusterList;
                return this;
            }

            /**
             * DBInstanceId.
             */
            public Builder DBInstanceId(String DBInstanceId) {
                this.DBInstanceId = DBInstanceId;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
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
             * EngineVersion.
             */
            public Builder engineVersion(String engineVersion) {
                this.engineVersion = engineVersion;
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
             * GmtCreated.
             */
            public Builder gmtCreated(String gmtCreated) {
                this.gmtCreated = gmtCreated;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * InstanceClass.
             */
            public Builder instanceClass(String instanceClass) {
                this.instanceClass = instanceClass;
                return this;
            }

            /**
             * InstanceUsedType.
             */
            public Builder instanceUsedType(String instanceUsedType) {
                this.instanceUsedType = instanceUsedType;
                return this;
            }

            /**
             * IsDeleted.
             */
            public Builder isDeleted(Boolean isDeleted) {
                this.isDeleted = isDeleted;
                return this;
            }

            /**
             * LockMode.
             */
            public Builder lockMode(Long lockMode) {
                this.lockMode = lockMode;
                return this;
            }

            /**
             * LockReason.
             */
            public Builder lockReason(String lockReason) {
                this.lockReason = lockReason;
                return this;
            }

            /**
             * MaintainEndTimeStr.
             */
            public Builder maintainEndTimeStr(String maintainEndTimeStr) {
                this.maintainEndTimeStr = maintainEndTimeStr;
                return this;
            }

            /**
             * MaintainEndtime.
             */
            public Builder maintainEndtime(String maintainEndtime) {
                this.maintainEndtime = maintainEndtime;
                return this;
            }

            /**
             * MaintainStartTimeStr.
             */
            public Builder maintainStartTimeStr(String maintainStartTimeStr) {
                this.maintainStartTimeStr = maintainStartTimeStr;
                return this;
            }

            /**
             * MaintainStarttime.
             */
            public Builder maintainStarttime(String maintainStarttime) {
                this.maintainStarttime = maintainStarttime;
                return this;
            }

            /**
             * ObjectStoreSize.
             */
            public Builder objectStoreSize(Long objectStoreSize) {
                this.objectStoreSize = objectStoreSize;
                return this;
            }

            /**
             * ParentInstance.
             */
            public Builder parentInstance(String parentInstance) {
                this.parentInstance = parentInstance;
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
             * ResourceCpu.
             */
            public Builder resourceCpu(Long resourceCpu) {
                this.resourceCpu = resourceCpu;
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
             * ResourceMemory.
             */
            public Builder resourceMemory(Long resourceMemory) {
                this.resourceMemory = resourceMemory;
                return this;
            }

            /**
             * ScaleMax.
             */
            public Builder scaleMax(Long scaleMax) {
                this.scaleMax = scaleMax;
                return this;
            }

            /**
             * ScaleMin.
             */
            public Builder scaleMin(Long scaleMin) {
                this.scaleMin = scaleMin;
                return this;
            }

            /**
             * ScaleReplica.
             */
            public Builder scaleReplica(Long scaleReplica) {
                this.scaleReplica = scaleReplica;
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
             * StorageSize.
             */
            public Builder storageSize(Long storageSize) {
                this.storageSize = storageSize;
                return this;
            }

            /**
             * StorageType.
             */
            public Builder storageType(String storageType) {
                this.storageType = storageType;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * TenantClusterId.
             */
            public Builder tenantClusterId(String tenantClusterId) {
                this.tenantClusterId = tenantClusterId;
                return this;
            }

            /**
             * TenantToken.
             */
            public Builder tenantToken(String tenantToken) {
                this.tenantToken = tenantToken;
                return this;
            }

            /**
             * TenantUserId.
             */
            public Builder tenantUserId(String tenantUserId) {
                this.tenantUserId = tenantUserId;
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

            /**
             * connectionString.
             */
            public Builder connectionString(String connectionString) {
                this.connectionString = connectionString;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
