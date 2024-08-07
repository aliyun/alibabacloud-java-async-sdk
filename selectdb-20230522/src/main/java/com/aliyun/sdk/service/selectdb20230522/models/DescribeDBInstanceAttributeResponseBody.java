// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.selectdb20230522.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBInstanceAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBInstanceAttributeResponseBody</p>
 */
public class DescribeDBInstanceAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CanUpgradeVersions")
    private java.util.List < String > canUpgradeVersions;

    @com.aliyun.core.annotation.NameInMap("ChargeType")
    private String chargeType;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("DBClusterList")
    private java.util.List < DBClusterList> DBClusterList;

    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    private String DBInstanceId;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("Engine")
    private String engine;

    @com.aliyun.core.annotation.NameInMap("EngineMinorVersion")
    private String engineMinorVersion;

    @com.aliyun.core.annotation.NameInMap("EngineVersion")
    private String engineVersion;

    @com.aliyun.core.annotation.NameInMap("ExpireTime")
    private String expireTime;

    @com.aliyun.core.annotation.NameInMap("GmtModified")
    private String gmtModified;

    @com.aliyun.core.annotation.NameInMap("LockMode")
    private Long lockMode;

    @com.aliyun.core.annotation.NameInMap("LockReason")
    private String lockReason;

    @com.aliyun.core.annotation.NameInMap("MaintainEndtime")
    private String maintainEndtime;

    @com.aliyun.core.annotation.NameInMap("MaintainStarttime")
    private String maintainStarttime;

    @com.aliyun.core.annotation.NameInMap("ObjectStoreSize")
    private Long objectStoreSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceCpu")
    private Long resourceCpu;

    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("StorageSize")
    private Long storageSize;

    @com.aliyun.core.annotation.NameInMap("SubDomain")
    private String subDomain;

    private DescribeDBInstanceAttributeResponseBody(Builder builder) {
        this.canUpgradeVersions = builder.canUpgradeVersions;
        this.chargeType = builder.chargeType;
        this.createTime = builder.createTime;
        this.DBClusterList = builder.DBClusterList;
        this.DBInstanceId = builder.DBInstanceId;
        this.description = builder.description;
        this.engine = builder.engine;
        this.engineMinorVersion = builder.engineMinorVersion;
        this.engineVersion = builder.engineVersion;
        this.expireTime = builder.expireTime;
        this.gmtModified = builder.gmtModified;
        this.lockMode = builder.lockMode;
        this.lockReason = builder.lockReason;
        this.maintainEndtime = builder.maintainEndtime;
        this.maintainStarttime = builder.maintainStarttime;
        this.objectStoreSize = builder.objectStoreSize;
        this.requestId = builder.requestId;
        this.resourceCpu = builder.resourceCpu;
        this.resourceGroupId = builder.resourceGroupId;
        this.status = builder.status;
        this.storageSize = builder.storageSize;
        this.subDomain = builder.subDomain;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBInstanceAttributeResponseBody create() {
        return builder().build();
    }

    /**
     * @return canUpgradeVersions
     */
    public java.util.List < String > getCanUpgradeVersions() {
        return this.canUpgradeVersions;
    }

    /**
     * @return chargeType
     */
    public String getChargeType() {
        return this.chargeType;
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
     * @return engineMinorVersion
     */
    public String getEngineMinorVersion() {
        return this.engineMinorVersion;
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
     * @return gmtModified
     */
    public String getGmtModified() {
        return this.gmtModified;
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
     * @return maintainEndtime
     */
    public String getMaintainEndtime() {
        return this.maintainEndtime;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
     * @return subDomain
     */
    public String getSubDomain() {
        return this.subDomain;
    }

    public static final class Builder {
        private java.util.List < String > canUpgradeVersions; 
        private String chargeType; 
        private String createTime; 
        private java.util.List < DBClusterList> DBClusterList; 
        private String DBInstanceId; 
        private String description; 
        private String engine; 
        private String engineMinorVersion; 
        private String engineVersion; 
        private String expireTime; 
        private String gmtModified; 
        private Long lockMode; 
        private String lockReason; 
        private String maintainEndtime; 
        private String maintainStarttime; 
        private Long objectStoreSize; 
        private String requestId; 
        private Long resourceCpu; 
        private String resourceGroupId; 
        private String status; 
        private Long storageSize; 
        private String subDomain; 

        /**
         * CanUpgradeVersions.
         */
        public Builder canUpgradeVersions(java.util.List < String > canUpgradeVersions) {
            this.canUpgradeVersions = canUpgradeVersions;
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
         * EngineMinorVersion.
         */
        public Builder engineMinorVersion(String engineMinorVersion) {
            this.engineMinorVersion = engineMinorVersion;
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
         * GmtModified.
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
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
         * MaintainEndtime.
         */
        public Builder maintainEndtime(String maintainEndtime) {
            this.maintainEndtime = maintainEndtime;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
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
         * SubDomain.
         */
        public Builder subDomain(String subDomain) {
            this.subDomain = subDomain;
            return this;
        }

        public DescribeDBInstanceAttributeResponseBody build() {
            return new DescribeDBInstanceAttributeResponseBody(this);
        } 

    } 

    public static class DBClusterList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CacheStorageSizeGB")
        private String cacheStorageSizeGB;

        @com.aliyun.core.annotation.NameInMap("CacheStorageType")
        private String cacheStorageType;

        @com.aliyun.core.annotation.NameInMap("ChargeType")
        private String chargeType;

        @com.aliyun.core.annotation.NameInMap("CpuCores")
        private Long cpuCores;

        @com.aliyun.core.annotation.NameInMap("CreatedTime")
        private String createdTime;

        @com.aliyun.core.annotation.NameInMap("DbClusterClass")
        private String dbClusterClass;

        @com.aliyun.core.annotation.NameInMap("DbClusterId")
        private String dbClusterId;

        @com.aliyun.core.annotation.NameInMap("DbClusterName")
        private String dbClusterName;

        @com.aliyun.core.annotation.NameInMap("DbInstanceName")
        private String dbInstanceName;

        @com.aliyun.core.annotation.NameInMap("Memory")
        private Long memory;

        @com.aliyun.core.annotation.NameInMap("PerformanceLevel")
        private String performanceLevel;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private DBClusterList(Builder builder) {
            this.cacheStorageSizeGB = builder.cacheStorageSizeGB;
            this.cacheStorageType = builder.cacheStorageType;
            this.chargeType = builder.chargeType;
            this.cpuCores = builder.cpuCores;
            this.createdTime = builder.createdTime;
            this.dbClusterClass = builder.dbClusterClass;
            this.dbClusterId = builder.dbClusterId;
            this.dbClusterName = builder.dbClusterName;
            this.dbInstanceName = builder.dbInstanceName;
            this.memory = builder.memory;
            this.performanceLevel = builder.performanceLevel;
            this.startTime = builder.startTime;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBClusterList create() {
            return builder().build();
        }

        /**
         * @return cacheStorageSizeGB
         */
        public String getCacheStorageSizeGB() {
            return this.cacheStorageSizeGB;
        }

        /**
         * @return cacheStorageType
         */
        public String getCacheStorageType() {
            return this.cacheStorageType;
        }

        /**
         * @return chargeType
         */
        public String getChargeType() {
            return this.chargeType;
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
         * @return dbInstanceName
         */
        public String getDbInstanceName() {
            return this.dbInstanceName;
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
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String cacheStorageSizeGB; 
            private String cacheStorageType; 
            private String chargeType; 
            private Long cpuCores; 
            private String createdTime; 
            private String dbClusterClass; 
            private String dbClusterId; 
            private String dbClusterName; 
            private String dbInstanceName; 
            private Long memory; 
            private String performanceLevel; 
            private String startTime; 
            private String status; 

            /**
             * CacheStorageSizeGB.
             */
            public Builder cacheStorageSizeGB(String cacheStorageSizeGB) {
                this.cacheStorageSizeGB = cacheStorageSizeGB;
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
             * ChargeType.
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
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
             * DbInstanceName.
             */
            public Builder dbInstanceName(String dbInstanceName) {
                this.dbInstanceName = dbInstanceName;
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
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public DBClusterList build() {
                return new DBClusterList(this);
            } 

        } 

    }
}
