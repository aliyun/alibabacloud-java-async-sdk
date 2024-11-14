// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.selectdb20230522.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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

    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

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

    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List < Tags> tags;

    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    @com.aliyun.core.annotation.NameInMap("ZoneId")
    private String zoneId;

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
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.resourceCpu = builder.resourceCpu;
        this.resourceGroupId = builder.resourceGroupId;
        this.status = builder.status;
        this.storageSize = builder.storageSize;
        this.subDomain = builder.subDomain;
        this.tags = builder.tags;
        this.vpcId = builder.vpcId;
        this.zoneId = builder.zoneId;
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

    /**
     * @return tags
     */
    public java.util.List < Tags> getTags() {
        return this.tags;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
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
        private String regionId; 
        private String requestId; 
        private Long resourceCpu; 
        private String resourceGroupId; 
        private String status; 
        private Long storageSize; 
        private String subDomain; 
        private java.util.List < Tags> tags; 
        private String vpcId; 
        private String zoneId; 

        /**
         * <p>The information returned.</p>
         */
        public Builder canUpgradeVersions(java.util.List < String > canUpgradeVersions) {
            this.canUpgradeVersions = canUpgradeVersions;
            return this;
        }

        /**
         * <p>The billing method of the instance. Valid values:</p>
         * <ul>
         * <li><strong>Postpaid</strong>: pay-as-you-go.</li>
         * <li><strong>Prepaid</strong>: subscription.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Prepaid</p>
         */
        public Builder chargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }

        /**
         * <p>The time when the instance was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-08-14T03:00:42Z</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The information about each cluster returned.</p>
         */
        public Builder DBClusterList(java.util.List < DBClusterList> DBClusterList) {
            this.DBClusterList = DBClusterList;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>selectdb-cn-7213cjv****</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The description of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The database engine of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>selectdb</p>
         */
        public Builder engine(String engine) {
            this.engine = engine;
            return this;
        }

        /**
         * <p>The minor kernel version number of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>3.0.1</p>
         */
        public Builder engineMinorVersion(String engineMinorVersion) {
            this.engineMinorVersion = engineMinorVersion;
            return this;
        }

        /**
         * <p>The database engine version of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>2.4</p>
         */
        public Builder engineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }

        /**
         * <p>The time when the instance expires.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-09-17T00:00Z</p>
         */
        public Builder expireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }

        /**
         * <p>The time when the instance was last modified, such as when you restarted the instance or applied for a public endpoint for the instance. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mmZ format. The time must be in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-08-17T09:58Z</p>
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * <p>The lock mode of the instance. Set the value to <strong>lock</strong>, which specifies that the instance is locked when it automatically expires or has an overdue payment.</p>
         * 
         * <strong>example:</strong>
         * <p>lock</p>
         */
        public Builder lockMode(Long lockMode) {
            this.lockMode = lockMode;
            return this;
        }

        /**
         * <p>The reason why the instance is locked.</p>
         * 
         * <strong>example:</strong>
         * <p>nolock</p>
         */
        public Builder lockReason(String lockReason) {
            this.lockReason = lockReason;
            return this;
        }

        /**
         * <p>The end time of the instance maintenance window.</p>
         */
        public Builder maintainEndtime(String maintainEndtime) {
            this.maintainEndtime = maintainEndtime;
            return this;
        }

        /**
         * <p>The start time of the instance maintenance window.</p>
         */
        public Builder maintainStarttime(String maintainStarttime) {
            this.maintainStarttime = maintainStarttime;
            return this;
        }

        /**
         * <p>The storage capacity of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder objectStoreSize(Long objectStoreSize) {
            this.objectStoreSize = objectStoreSize;
            return this;
        }

        /**
         * <p>地域ID。</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>06758CAB-1204-5852-A471-29C87D5C1D0F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of CPU cores of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        public Builder resourceCpu(Long resourceCpu) {
            this.resourceCpu = resourceCpu;
            return this;
        }

        /**
         * <p>The ID of the resource group to which the instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aekzbck4asz3dsa</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The state of the instance. Valid values:</p>
         * <ul>
         * <li><strong>CREATING</strong>: The instance is being created.</li>
         * <li><strong>ACTIVATION</strong>: The instance is running.</li>
         * <li><strong>RESOURCE_CHANGING</strong>: The resource configuration of the instance is being changed.</li>
         * <li><strong>ORDER_PREPARING</strong>: The order is being confirmed.</li>
         * <li><strong>READONLY_RESOURCE_CHANGING</strong>: The resource configuration of the instance is being changed and the instance is write-locked.</li>
         * <li><strong>DELETING</strong>: The instance is being deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ACTIVATION</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The cache size.</p>
         * 
         * <strong>example:</strong>
         * <p>400</p>
         */
        public Builder storageSize(Long storageSize) {
            this.storageSize = storageSize;
            return this;
        }

        /**
         * <p>The zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing-h-aliyun</p>
         */
        public Builder subDomain(String subDomain) {
            this.subDomain = subDomain;
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
         * <p>VPC ID。</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp175iuvg8nxqraf2****</p>
         */
        public Builder vpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }

        /**
         * <p>实例可用区ID</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing-h</p>
         */
        public Builder zoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }

        public DescribeDBInstanceAttributeResponseBody build() {
            return new DescribeDBInstanceAttributeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDBInstanceAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstanceAttributeResponseBody</p>
     */
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

        @com.aliyun.core.annotation.NameInMap("ModifiedTime")
        private String modifiedTime;

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
            this.modifiedTime = builder.modifiedTime;
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
         * @return modifiedTime
         */
        public String getModifiedTime() {
            return this.modifiedTime;
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
            private String modifiedTime; 
            private String performanceLevel; 
            private String startTime; 
            private String status; 

            /**
             * <p>The cache size. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder cacheStorageSizeGB(String cacheStorageSizeGB) {
                this.cacheStorageSizeGB = cacheStorageSizeGB;
                return this;
            }

            /**
             * <p>The cache type.</p>
             * 
             * <strong>example:</strong>
             * <p>cloud_essd</p>
             */
            public Builder cacheStorageType(String cacheStorageType) {
                this.cacheStorageType = cacheStorageType;
                return this;
            }

            /**
             * <p>The billing method of the cluster. Valid values:</p>
             * <ul>
             * <li><strong>Postpaid</strong>: pay-as-you-go.</li>
             * <li><strong>Prepaid</strong>: subscription.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Prepaid</p>
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * <p>The number of CPU cores.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder cpuCores(Long cpuCores) {
                this.cpuCores = cpuCores;
                return this;
            }

            /**
             * <p>The time when the cluster was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-08-14T09:24:13Z</p>
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * <p>The specifications of the cluster. Valid values:</p>
             * <ul>
             * <li><strong>selectdb.xlarge</strong>: 4 CPU cores and 32 GB of memory.</li>
             * <li><strong>selectdb.2xlarge</strong>: 8 CPU cores and 64 GB of memory.</li>
             * <li><strong>selectdb.4xlarge</strong>: 16 CPU cores and 128 GB of memory.</li>
             * <li><strong>selectdb.8xlarge</strong>: 32 CPU cores and 256 GB of memory.</li>
             * <li><strong>selectdb.16xlarge</strong>: 64 CPU cores and 512 GB of memory.</li>
             * <li><strong>selectdb.24xlarge</strong>: 96 CPU cores and 768 GB of memory.</li>
             * <li><strong>selectdb.32xlarge</strong>: 128 CPU cores and 1,024 GB of memory.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>selectdb.2xlarge</p>
             */
            public Builder dbClusterClass(String dbClusterClass) {
                this.dbClusterClass = dbClusterClass;
                return this;
            }

            /**
             * <p>The ID of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>selectdb-cn-h033cjs****-be</p>
             */
            public Builder dbClusterId(String dbClusterId) {
                this.dbClusterId = dbClusterId;
                return this;
            }

            /**
             * <p>The name of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>test01</p>
             */
            public Builder dbClusterName(String dbClusterName) {
                this.dbClusterName = dbClusterName;
                return this;
            }

            /**
             * <p>The instance name.</p>
             */
            public Builder dbInstanceName(String dbInstanceName) {
                this.dbInstanceName = dbInstanceName;
                return this;
            }

            /**
             * <p>The memory size.</p>
             * 
             * <strong>example:</strong>
             * <p>64</p>
             */
            public Builder memory(Long memory) {
                this.memory = memory;
                return this;
            }

            /**
             * <p>修改时间。</p>
             * 
             * <strong>example:</strong>
             * <p>2024-07-02T16:35:44+08:00</p>
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * <p>The performance level.</p>
             * 
             * <strong>example:</strong>
             * <p>PL1</p>
             */
            public Builder performanceLevel(String performanceLevel) {
                this.performanceLevel = performanceLevel;
                return this;
            }

            /**
             * <p>The time when the cluster started.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-08-14T09:24:13Z</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The state of the cluster. Valid values:</p>
             * <ul>
             * <li><strong>CREATING</strong>: The cluster is being created.</li>
             * <li><strong>ACTIVATION</strong>: The cluster is running.</li>
             * <li><strong>RESOURCE_CHANGING</strong>: The resource configuration of the cluster is being changed.</li>
             * <li><strong>ORDER_PREPARING</strong>: The order is being confirmed.</li>
             * <li><strong>READONLY_RESOURCE_CHANGING</strong>: The resource configuration of the cluster is being changed and the cluster is write-locked.</li>
             * <li><strong>DELETING</strong>: The cluster is being deleted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ACTIVATION</p>
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
    /**
     * 
     * {@link DescribeDBInstanceAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstanceAttributeResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("TagValue")
        private String tagValue;

        private Tags(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        public static final class Builder {
            private String tagKey; 
            private String tagValue; 

            /**
             * TagKey.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * TagValue.
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}
