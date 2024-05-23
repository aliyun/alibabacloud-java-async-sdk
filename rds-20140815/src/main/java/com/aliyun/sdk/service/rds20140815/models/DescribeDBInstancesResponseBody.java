// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBInstancesResponseBody</p>
 */
public class DescribeDBInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private Items items;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageRecordCount")
    private Integer pageRecordCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalRecordCount")
    private Integer totalRecordCount;

    private DescribeDBInstancesResponseBody(Builder builder) {
        this.items = builder.items;
        this.nextToken = builder.nextToken;
        this.pageNumber = builder.pageNumber;
        this.pageRecordCount = builder.pageRecordCount;
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
    public Items getItems() {
        return this.items;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageRecordCount
     */
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
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
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static final class Builder {
        private Items items; 
        private String nextToken; 
        private Integer pageNumber; 
        private Integer pageRecordCount; 
        private String requestId; 
        private Integer totalRecordCount; 

        /**
         * The information about the instances.
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * The token that is used to display the next page. If the returned entries are displayed on multiple pages, the next page can be displayed when you call this operation again with **NextToken** specified.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The page number of the returned page.
         * <p>
         * 
         * > If you specify **MaxResults** or **NextToken**, only the value **1** is returned. You can ignore the value 1.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned on the current page.
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of entries returned.
         * <p>
         * 
         * > If you specify **MaxResults** or **NextToken**, only the number of entries on the current page is returned. You can ignore the number.
         */
        public Builder totalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeDBInstancesResponseBody build() {
            return new DescribeDBInstancesResponseBody(this);
        } 

    } 

    public static class ReadOnlyDBInstanceId extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBInstanceId")
        private String DBInstanceId;

        private ReadOnlyDBInstanceId(Builder builder) {
            this.DBInstanceId = builder.DBInstanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReadOnlyDBInstanceId create() {
            return builder().build();
        }

        /**
         * @return DBInstanceId
         */
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public static final class Builder {
            private String DBInstanceId; 

            /**
             * The read-only instance ID.
             */
            public Builder DBInstanceId(String DBInstanceId) {
                this.DBInstanceId = DBInstanceId;
                return this;
            }

            public ReadOnlyDBInstanceId build() {
                return new ReadOnlyDBInstanceId(this);
            } 

        } 

    }
    public static class ReadOnlyDBInstanceIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ReadOnlyDBInstanceId")
        private java.util.List < ReadOnlyDBInstanceId> readOnlyDBInstanceId;

        private ReadOnlyDBInstanceIds(Builder builder) {
            this.readOnlyDBInstanceId = builder.readOnlyDBInstanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReadOnlyDBInstanceIds create() {
            return builder().build();
        }

        /**
         * @return readOnlyDBInstanceId
         */
        public java.util.List < ReadOnlyDBInstanceId> getReadOnlyDBInstanceId() {
            return this.readOnlyDBInstanceId;
        }

        public static final class Builder {
            private java.util.List < ReadOnlyDBInstanceId> readOnlyDBInstanceId; 

            /**
             * ReadOnlyDBInstanceId.
             */
            public Builder readOnlyDBInstanceId(java.util.List < ReadOnlyDBInstanceId> readOnlyDBInstanceId) {
                this.readOnlyDBInstanceId = readOnlyDBInstanceId;
                return this;
            }

            public ReadOnlyDBInstanceIds build() {
                return new ReadOnlyDBInstanceIds(this);
            } 

        } 

    }
    public static class DBInstance extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BpeEnabled")
        private String bpeEnabled;

        @com.aliyun.core.annotation.NameInMap("BurstingEnabled")
        private Boolean burstingEnabled;

        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("ColdDataEnabled")
        private Boolean coldDataEnabled;

        @com.aliyun.core.annotation.NameInMap("ConnectionMode")
        private String connectionMode;

        @com.aliyun.core.annotation.NameInMap("ConnectionString")
        private String connectionString;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DBInstanceCPU")
        private String DBInstanceCPU;

        @com.aliyun.core.annotation.NameInMap("DBInstanceClass")
        private String DBInstanceClass;

        @com.aliyun.core.annotation.NameInMap("DBInstanceDescription")
        private String DBInstanceDescription;

        @com.aliyun.core.annotation.NameInMap("DBInstanceId")
        private String DBInstanceId;

        @com.aliyun.core.annotation.NameInMap("DBInstanceMemory")
        private Integer DBInstanceMemory;

        @com.aliyun.core.annotation.NameInMap("DBInstanceNetType")
        private String DBInstanceNetType;

        @com.aliyun.core.annotation.NameInMap("DBInstanceStatus")
        private String DBInstanceStatus;

        @com.aliyun.core.annotation.NameInMap("DBInstanceStorageType")
        private String DBInstanceStorageType;

        @com.aliyun.core.annotation.NameInMap("DBInstanceType")
        private String DBInstanceType;

        @com.aliyun.core.annotation.NameInMap("DedicatedHostGroupId")
        private String dedicatedHostGroupId;

        @com.aliyun.core.annotation.NameInMap("DedicatedHostGroupName")
        private String dedicatedHostGroupName;

        @com.aliyun.core.annotation.NameInMap("DedicatedHostIdForLog")
        private String dedicatedHostIdForLog;

        @com.aliyun.core.annotation.NameInMap("DedicatedHostIdForMaster")
        private String dedicatedHostIdForMaster;

        @com.aliyun.core.annotation.NameInMap("DedicatedHostIdForSlave")
        private String dedicatedHostIdForSlave;

        @com.aliyun.core.annotation.NameInMap("DedicatedHostNameForLog")
        private String dedicatedHostNameForLog;

        @com.aliyun.core.annotation.NameInMap("DedicatedHostNameForMaster")
        private String dedicatedHostNameForMaster;

        @com.aliyun.core.annotation.NameInMap("DedicatedHostNameForSlave")
        private String dedicatedHostNameForSlave;

        @com.aliyun.core.annotation.NameInMap("DedicatedHostZoneIdForLog")
        private String dedicatedHostZoneIdForLog;

        @com.aliyun.core.annotation.NameInMap("DedicatedHostZoneIdForMaster")
        private String dedicatedHostZoneIdForMaster;

        @com.aliyun.core.annotation.NameInMap("DedicatedHostZoneIdForSlave")
        private String dedicatedHostZoneIdForSlave;

        @com.aliyun.core.annotation.NameInMap("DeletionProtection")
        private Boolean deletionProtection;

        @com.aliyun.core.annotation.NameInMap("DestroyTime")
        private String destroyTime;

        @com.aliyun.core.annotation.NameInMap("Engine")
        private String engine;

        @com.aliyun.core.annotation.NameInMap("EngineVersion")
        private String engineVersion;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private String expireTime;

        @com.aliyun.core.annotation.NameInMap("GeneralGroupName")
        private String generalGroupName;

        @com.aliyun.core.annotation.NameInMap("GuardDBInstanceId")
        private String guardDBInstanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceNetworkType")
        private String instanceNetworkType;

        @com.aliyun.core.annotation.NameInMap("IoAccelerationEnabled")
        private String ioAccelerationEnabled;

        @com.aliyun.core.annotation.NameInMap("LockMode")
        private String lockMode;

        @com.aliyun.core.annotation.NameInMap("LockReason")
        private String lockReason;

        @com.aliyun.core.annotation.NameInMap("MasterInstanceId")
        private String masterInstanceId;

        @com.aliyun.core.annotation.NameInMap("MutriORsignle")
        private Boolean mutriORsignle;

        @com.aliyun.core.annotation.NameInMap("PayType")
        private String payType;

        @com.aliyun.core.annotation.NameInMap("ReadOnlyDBInstanceIds")
        private ReadOnlyDBInstanceIds readOnlyDBInstanceIds;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("SwitchWeight")
        private Integer switchWeight;

        @com.aliyun.core.annotation.NameInMap("TempDBInstanceId")
        private String tempDBInstanceId;

        @com.aliyun.core.annotation.NameInMap("Tips")
        private String tips;

        @com.aliyun.core.annotation.NameInMap("TipsLevel")
        private Integer tipsLevel;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("VpcCloudInstanceId")
        private String vpcCloudInstanceId;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("VpcName")
        private String vpcName;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private DBInstance(Builder builder) {
            this.bpeEnabled = builder.bpeEnabled;
            this.burstingEnabled = builder.burstingEnabled;
            this.category = builder.category;
            this.coldDataEnabled = builder.coldDataEnabled;
            this.connectionMode = builder.connectionMode;
            this.connectionString = builder.connectionString;
            this.createTime = builder.createTime;
            this.DBInstanceCPU = builder.DBInstanceCPU;
            this.DBInstanceClass = builder.DBInstanceClass;
            this.DBInstanceDescription = builder.DBInstanceDescription;
            this.DBInstanceId = builder.DBInstanceId;
            this.DBInstanceMemory = builder.DBInstanceMemory;
            this.DBInstanceNetType = builder.DBInstanceNetType;
            this.DBInstanceStatus = builder.DBInstanceStatus;
            this.DBInstanceStorageType = builder.DBInstanceStorageType;
            this.DBInstanceType = builder.DBInstanceType;
            this.dedicatedHostGroupId = builder.dedicatedHostGroupId;
            this.dedicatedHostGroupName = builder.dedicatedHostGroupName;
            this.dedicatedHostIdForLog = builder.dedicatedHostIdForLog;
            this.dedicatedHostIdForMaster = builder.dedicatedHostIdForMaster;
            this.dedicatedHostIdForSlave = builder.dedicatedHostIdForSlave;
            this.dedicatedHostNameForLog = builder.dedicatedHostNameForLog;
            this.dedicatedHostNameForMaster = builder.dedicatedHostNameForMaster;
            this.dedicatedHostNameForSlave = builder.dedicatedHostNameForSlave;
            this.dedicatedHostZoneIdForLog = builder.dedicatedHostZoneIdForLog;
            this.dedicatedHostZoneIdForMaster = builder.dedicatedHostZoneIdForMaster;
            this.dedicatedHostZoneIdForSlave = builder.dedicatedHostZoneIdForSlave;
            this.deletionProtection = builder.deletionProtection;
            this.destroyTime = builder.destroyTime;
            this.engine = builder.engine;
            this.engineVersion = builder.engineVersion;
            this.expireTime = builder.expireTime;
            this.generalGroupName = builder.generalGroupName;
            this.guardDBInstanceId = builder.guardDBInstanceId;
            this.instanceNetworkType = builder.instanceNetworkType;
            this.ioAccelerationEnabled = builder.ioAccelerationEnabled;
            this.lockMode = builder.lockMode;
            this.lockReason = builder.lockReason;
            this.masterInstanceId = builder.masterInstanceId;
            this.mutriORsignle = builder.mutriORsignle;
            this.payType = builder.payType;
            this.readOnlyDBInstanceIds = builder.readOnlyDBInstanceIds;
            this.regionId = builder.regionId;
            this.resourceGroupId = builder.resourceGroupId;
            this.switchWeight = builder.switchWeight;
            this.tempDBInstanceId = builder.tempDBInstanceId;
            this.tips = builder.tips;
            this.tipsLevel = builder.tipsLevel;
            this.vSwitchId = builder.vSwitchId;
            this.vpcCloudInstanceId = builder.vpcCloudInstanceId;
            this.vpcId = builder.vpcId;
            this.vpcName = builder.vpcName;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBInstance create() {
            return builder().build();
        }

        /**
         * @return bpeEnabled
         */
        public String getBpeEnabled() {
            return this.bpeEnabled;
        }

        /**
         * @return burstingEnabled
         */
        public Boolean getBurstingEnabled() {
            return this.burstingEnabled;
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return coldDataEnabled
         */
        public Boolean getColdDataEnabled() {
            return this.coldDataEnabled;
        }

        /**
         * @return connectionMode
         */
        public String getConnectionMode() {
            return this.connectionMode;
        }

        /**
         * @return connectionString
         */
        public String getConnectionString() {
            return this.connectionString;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return DBInstanceCPU
         */
        public String getDBInstanceCPU() {
            return this.DBInstanceCPU;
        }

        /**
         * @return DBInstanceClass
         */
        public String getDBInstanceClass() {
            return this.DBInstanceClass;
        }

        /**
         * @return DBInstanceDescription
         */
        public String getDBInstanceDescription() {
            return this.DBInstanceDescription;
        }

        /**
         * @return DBInstanceId
         */
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        /**
         * @return DBInstanceMemory
         */
        public Integer getDBInstanceMemory() {
            return this.DBInstanceMemory;
        }

        /**
         * @return DBInstanceNetType
         */
        public String getDBInstanceNetType() {
            return this.DBInstanceNetType;
        }

        /**
         * @return DBInstanceStatus
         */
        public String getDBInstanceStatus() {
            return this.DBInstanceStatus;
        }

        /**
         * @return DBInstanceStorageType
         */
        public String getDBInstanceStorageType() {
            return this.DBInstanceStorageType;
        }

        /**
         * @return DBInstanceType
         */
        public String getDBInstanceType() {
            return this.DBInstanceType;
        }

        /**
         * @return dedicatedHostGroupId
         */
        public String getDedicatedHostGroupId() {
            return this.dedicatedHostGroupId;
        }

        /**
         * @return dedicatedHostGroupName
         */
        public String getDedicatedHostGroupName() {
            return this.dedicatedHostGroupName;
        }

        /**
         * @return dedicatedHostIdForLog
         */
        public String getDedicatedHostIdForLog() {
            return this.dedicatedHostIdForLog;
        }

        /**
         * @return dedicatedHostIdForMaster
         */
        public String getDedicatedHostIdForMaster() {
            return this.dedicatedHostIdForMaster;
        }

        /**
         * @return dedicatedHostIdForSlave
         */
        public String getDedicatedHostIdForSlave() {
            return this.dedicatedHostIdForSlave;
        }

        /**
         * @return dedicatedHostNameForLog
         */
        public String getDedicatedHostNameForLog() {
            return this.dedicatedHostNameForLog;
        }

        /**
         * @return dedicatedHostNameForMaster
         */
        public String getDedicatedHostNameForMaster() {
            return this.dedicatedHostNameForMaster;
        }

        /**
         * @return dedicatedHostNameForSlave
         */
        public String getDedicatedHostNameForSlave() {
            return this.dedicatedHostNameForSlave;
        }

        /**
         * @return dedicatedHostZoneIdForLog
         */
        public String getDedicatedHostZoneIdForLog() {
            return this.dedicatedHostZoneIdForLog;
        }

        /**
         * @return dedicatedHostZoneIdForMaster
         */
        public String getDedicatedHostZoneIdForMaster() {
            return this.dedicatedHostZoneIdForMaster;
        }

        /**
         * @return dedicatedHostZoneIdForSlave
         */
        public String getDedicatedHostZoneIdForSlave() {
            return this.dedicatedHostZoneIdForSlave;
        }

        /**
         * @return deletionProtection
         */
        public Boolean getDeletionProtection() {
            return this.deletionProtection;
        }

        /**
         * @return destroyTime
         */
        public String getDestroyTime() {
            return this.destroyTime;
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
         * @return generalGroupName
         */
        public String getGeneralGroupName() {
            return this.generalGroupName;
        }

        /**
         * @return guardDBInstanceId
         */
        public String getGuardDBInstanceId() {
            return this.guardDBInstanceId;
        }

        /**
         * @return instanceNetworkType
         */
        public String getInstanceNetworkType() {
            return this.instanceNetworkType;
        }

        /**
         * @return ioAccelerationEnabled
         */
        public String getIoAccelerationEnabled() {
            return this.ioAccelerationEnabled;
        }

        /**
         * @return lockMode
         */
        public String getLockMode() {
            return this.lockMode;
        }

        /**
         * @return lockReason
         */
        public String getLockReason() {
            return this.lockReason;
        }

        /**
         * @return masterInstanceId
         */
        public String getMasterInstanceId() {
            return this.masterInstanceId;
        }

        /**
         * @return mutriORsignle
         */
        public Boolean getMutriORsignle() {
            return this.mutriORsignle;
        }

        /**
         * @return payType
         */
        public String getPayType() {
            return this.payType;
        }

        /**
         * @return readOnlyDBInstanceIds
         */
        public ReadOnlyDBInstanceIds getReadOnlyDBInstanceIds() {
            return this.readOnlyDBInstanceIds;
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
         * @return switchWeight
         */
        public Integer getSwitchWeight() {
            return this.switchWeight;
        }

        /**
         * @return tempDBInstanceId
         */
        public String getTempDBInstanceId() {
            return this.tempDBInstanceId;
        }

        /**
         * @return tips
         */
        public String getTips() {
            return this.tips;
        }

        /**
         * @return tipsLevel
         */
        public Integer getTipsLevel() {
            return this.tipsLevel;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return vpcCloudInstanceId
         */
        public String getVpcCloudInstanceId() {
            return this.vpcCloudInstanceId;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return vpcName
         */
        public String getVpcName() {
            return this.vpcName;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String bpeEnabled; 
            private Boolean burstingEnabled; 
            private String category; 
            private Boolean coldDataEnabled; 
            private String connectionMode; 
            private String connectionString; 
            private String createTime; 
            private String DBInstanceCPU; 
            private String DBInstanceClass; 
            private String DBInstanceDescription; 
            private String DBInstanceId; 
            private Integer DBInstanceMemory; 
            private String DBInstanceNetType; 
            private String DBInstanceStatus; 
            private String DBInstanceStorageType; 
            private String DBInstanceType; 
            private String dedicatedHostGroupId; 
            private String dedicatedHostGroupName; 
            private String dedicatedHostIdForLog; 
            private String dedicatedHostIdForMaster; 
            private String dedicatedHostIdForSlave; 
            private String dedicatedHostNameForLog; 
            private String dedicatedHostNameForMaster; 
            private String dedicatedHostNameForSlave; 
            private String dedicatedHostZoneIdForLog; 
            private String dedicatedHostZoneIdForMaster; 
            private String dedicatedHostZoneIdForSlave; 
            private Boolean deletionProtection; 
            private String destroyTime; 
            private String engine; 
            private String engineVersion; 
            private String expireTime; 
            private String generalGroupName; 
            private String guardDBInstanceId; 
            private String instanceNetworkType; 
            private String ioAccelerationEnabled; 
            private String lockMode; 
            private String lockReason; 
            private String masterInstanceId; 
            private Boolean mutriORsignle; 
            private String payType; 
            private ReadOnlyDBInstanceIds readOnlyDBInstanceIds; 
            private String regionId; 
            private String resourceGroupId; 
            private Integer switchWeight; 
            private String tempDBInstanceId; 
            private String tips; 
            private Integer tipsLevel; 
            private String vSwitchId; 
            private String vpcCloudInstanceId; 
            private String vpcId; 
            private String vpcName; 
            private String zoneId; 

            /**
             * A deprecated parameter.
             */
            public Builder bpeEnabled(String bpeEnabled) {
                this.bpeEnabled = bpeEnabled;
                return this;
            }

            /**
             * Indicates whether the I/O burst feature is enabled. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder burstingEnabled(Boolean burstingEnabled) {
                this.burstingEnabled = burstingEnabled;
                return this;
            }

            /**
             * The RDS edition of the instance. Valid values:
             * <p>
             * 
             * *   **Basic**: RDS Basic Edition
             * *   **HighAvailability**: RDS High-availability Edition
             * *   **Finance**: RDS Enterprise Edition
             * 
             * >  This parameter is returned only when the **InstanceLevel** parameter is set to **1**.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * A reserved parameter.
             */
            public Builder coldDataEnabled(Boolean coldDataEnabled) {
                this.coldDataEnabled = coldDataEnabled;
                return this;
            }

            /**
             * The connection mode of the instance. Valid values:
             * <p>
             * 
             * *   **Standard**: standard mode
             * *   **Safe**: database proxy mode
             */
            public Builder connectionMode(String connectionMode) {
                this.connectionMode = connectionMode;
                return this;
            }

            /**
             * The endpoint of the instance.
             */
            public Builder connectionString(String connectionString) {
                this.connectionString = connectionString;
                return this;
            }

            /**
             * The creation time of the instance. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The number of CPU instances.
             * <p>
             * 
             * Returns only when the InstanceLevel parameter is 1.
             */
            public Builder DBInstanceCPU(String DBInstanceCPU) {
                this.DBInstanceCPU = DBInstanceCPU;
                return this;
            }

            /**
             * The instance type of the instance. For information, see [Primary ApsaraDB RDS instance types](~~26312~~).
             */
            public Builder DBInstanceClass(String DBInstanceClass) {
                this.DBInstanceClass = DBInstanceClass;
                return this;
            }

            /**
             * The instance description.
             */
            public Builder DBInstanceDescription(String DBInstanceDescription) {
                this.DBInstanceDescription = DBInstanceDescription;
                return this;
            }

            /**
             * The instance ID.
             */
            public Builder DBInstanceId(String DBInstanceId) {
                this.DBInstanceId = DBInstanceId;
                return this;
            }

            /**
             * The memory size of the node. Unit: MB.
             * <p>
             * 
             * Returns only when the InstanceLevel parameter is 1.
             */
            public Builder DBInstanceMemory(Integer DBInstanceMemory) {
                this.DBInstanceMemory = DBInstanceMemory;
                return this;
            }

            /**
             * The type of the network connection to the instance. Valid values:
             * <p>
             * 
             * *   **Internet**
             * *   **Intranet**
             */
            public Builder DBInstanceNetType(String DBInstanceNetType) {
                this.DBInstanceNetType = DBInstanceNetType;
                return this;
            }

            /**
             * The instance status. For more information, see [Instance statuses](~~26315~~).
             */
            public Builder DBInstanceStatus(String DBInstanceStatus) {
                this.DBInstanceStatus = DBInstanceStatus;
                return this;
            }

            /**
             * The storage type of the instance.
             */
            public Builder DBInstanceStorageType(String DBInstanceStorageType) {
                this.DBInstanceStorageType = DBInstanceStorageType;
                return this;
            }

            /**
             * The type of the instance. Valid values:
             * <p>
             * 
             * *   **Primary**: primary instance
             * *   **Readonly**: read-only instance
             * *   **Guard**: disaster recovery instance
             * *   **Temp**: temporary instance
             */
            public Builder DBInstanceType(String DBInstanceType) {
                this.DBInstanceType = DBInstanceType;
                return this;
            }

            /**
             * The ID of the dedicated cluster.
             */
            public Builder dedicatedHostGroupId(String dedicatedHostGroupId) {
                this.dedicatedHostGroupId = dedicatedHostGroupId;
                return this;
            }

            /**
             * The name of the dedicated cluster.
             */
            public Builder dedicatedHostGroupName(String dedicatedHostGroupName) {
                this.dedicatedHostGroupName = dedicatedHostGroupName;
                return this;
            }

            /**
             * The ID of the host on which the logger instance resides.
             */
            public Builder dedicatedHostIdForLog(String dedicatedHostIdForLog) {
                this.dedicatedHostIdForLog = dedicatedHostIdForLog;
                return this;
            }

            /**
             * The ID of the host on which the primary instance resides.
             */
            public Builder dedicatedHostIdForMaster(String dedicatedHostIdForMaster) {
                this.dedicatedHostIdForMaster = dedicatedHostIdForMaster;
                return this;
            }

            /**
             * The ID of the host on which the secondary instance resides.
             */
            public Builder dedicatedHostIdForSlave(String dedicatedHostIdForSlave) {
                this.dedicatedHostIdForSlave = dedicatedHostIdForSlave;
                return this;
            }

            /**
             * The name of the host on which the logger instance resides.
             */
            public Builder dedicatedHostNameForLog(String dedicatedHostNameForLog) {
                this.dedicatedHostNameForLog = dedicatedHostNameForLog;
                return this;
            }

            /**
             * The name of the host on which the primary instance resides.
             */
            public Builder dedicatedHostNameForMaster(String dedicatedHostNameForMaster) {
                this.dedicatedHostNameForMaster = dedicatedHostNameForMaster;
                return this;
            }

            /**
             * The name of the host on which the secondary instance resides.
             */
            public Builder dedicatedHostNameForSlave(String dedicatedHostNameForSlave) {
                this.dedicatedHostNameForSlave = dedicatedHostNameForSlave;
                return this;
            }

            /**
             * The zone ID of the host on which the logger instance resides.
             */
            public Builder dedicatedHostZoneIdForLog(String dedicatedHostZoneIdForLog) {
                this.dedicatedHostZoneIdForLog = dedicatedHostZoneIdForLog;
                return this;
            }

            /**
             * The zone ID of the host on which the primary instance resides.
             */
            public Builder dedicatedHostZoneIdForMaster(String dedicatedHostZoneIdForMaster) {
                this.dedicatedHostZoneIdForMaster = dedicatedHostZoneIdForMaster;
                return this;
            }

            /**
             * The zone ID of the host on which the secondary instance resides.
             */
            public Builder dedicatedHostZoneIdForSlave(String dedicatedHostZoneIdForSlave) {
                this.dedicatedHostZoneIdForSlave = dedicatedHostZoneIdForSlave;
                return this;
            }

            /**
             * Indicates whether the release protection feature is enabled for the instance. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder deletionProtection(Boolean deletionProtection) {
                this.deletionProtection = deletionProtection;
                return this;
            }

            /**
             * The time when the instance was destroyed. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder destroyTime(String destroyTime) {
                this.destroyTime = destroyTime;
                return this;
            }

            /**
             * The database engine of the instance.
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * The database engine version.
             */
            public Builder engineVersion(String engineVersion) {
                this.engineVersion = engineVersion;
                return this;
            }

            /**
             * The expiration time of the instance. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             * <p>
             * 
             * >  Pay-as-you-go instances never expire.
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * The name of the dedicated cluster to which the instance belongs. This parameter is returned only when the instance is created in an ApsaraDB MyBase cluster that runs MySQL on Standard Edition.
             */
            public Builder generalGroupName(String generalGroupName) {
                this.generalGroupName = generalGroupName;
                return this;
            }

            /**
             * The ID of the disaster recovery instance. This parameter is returned only when the instance is a primary instance and has a disaster recovery instance attached.
             */
            public Builder guardDBInstanceId(String guardDBInstanceId) {
                this.guardDBInstanceId = guardDBInstanceId;
                return this;
            }

            /**
             * The network type of the instance. Valid values:
             * <p>
             * 
             * *   **Classic**
             * *   **VPC**
             */
            public Builder instanceNetworkType(String instanceNetworkType) {
                this.instanceNetworkType = instanceNetworkType;
                return this;
            }

            /**
             * Indicates whether the I/O acceleration feature is enabled. Valid values:
             * <p>
             * 
             * *   1: enabled
             * *   0: disabled
             */
            public Builder ioAccelerationEnabled(String ioAccelerationEnabled) {
                this.ioAccelerationEnabled = ioAccelerationEnabled;
                return this;
            }

            /**
             * The lock mode of the instance. Valid values:
             * <p>
             * 
             * *   **Unlock**: The instance is not locked.
             * *   **ManualLock**: The instance is manually locked.
             * *   **LockByExpiration**: The instance is automatically locked due to instance expiration.
             * *   **LockByRestoration**: The instance is automatically locked before the instance is rolled back.
             * *   **LockByDiskQuota**: The instance is automatically locked due to exhausted storage capacity.
             * *   **Released**: The instance is released. After an instance is released, the instance cannot be unlocked. You can only restore the backup data of the instance to a new instance. This process requires a long period of time.
             */
            public Builder lockMode(String lockMode) {
                this.lockMode = lockMode;
                return this;
            }

            /**
             * The reason why the instance was locked.
             */
            public Builder lockReason(String lockReason) {
                this.lockReason = lockReason;
                return this;
            }

            /**
             * The ID of the primary instance. If this parameter is null, the instance is a primary instance.
             */
            public Builder masterInstanceId(String masterInstanceId) {
                this.masterInstanceId = masterInstanceId;
                return this;
            }

            /**
             * Indicates whether the multi-zone deployment method is used for the instance. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             * 
             * >  If the multi-zone deployment method is used for the instance, the zone ID of the instance contains MAZ. Example: `cn-hangzhou-MAZ10(h,i)`.
             */
            public Builder mutriORsignle(Boolean mutriORsignle) {
                this.mutriORsignle = mutriORsignle;
                return this;
            }

            /**
             * The billing method of the instance. Valid values:
             * <p>
             * 
             * *   **Postpaid**: pay-as-you-go
             * *   **Prepaid**: subscription
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            /**
             * The IDs of the read-only instances. This parameter is returned only when the instance is a primary instance and has the read-only instances attached.
             */
            public Builder readOnlyDBInstanceIds(ReadOnlyDBInstanceIds readOnlyDBInstanceIds) {
                this.readOnlyDBInstanceIds = readOnlyDBInstanceIds;
                return this;
            }

            /**
             * The region ID.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The resource group ID.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * Indicates whether the instance supports weight-based switchovers for high availability. This parameter is returned only when the instance is created in an ApsaraDB MyBase cluster that runs MySQL on Standard Edition. Valid values:
             * <p>
             * 
             * *   **100**: The instance supports weight-based switchovers for high availability.
             * *   **0**: The instance does not support weight-based switchovers for high availability.
             */
            public Builder switchWeight(Integer switchWeight) {
                this.switchWeight = switchWeight;
                return this;
            }

            /**
             * The ID of the temporary instance. This parameter is returned only when the instance is a primary instance and has a temporary instance attached.
             */
            public Builder tempDBInstanceId(String tempDBInstanceId) {
                this.tempDBInstanceId = tempDBInstanceId;
                return this;
            }

            /**
             * The information about the exception that is detected on the instance. This parameter is returned only when the instance is created in an ApsaraDB MyBase cluster that runs MySQL on Standard Edition.
             */
            public Builder tips(String tips) {
                this.tips = tips;
                return this;
            }

            /**
             * The severity of the exception that is detected on the instance. This parameter is returned only when the instance is created in an ApsaraDB MyBase cluster that runs MySQL on Standard Edition. Valid values:
             * <p>
             * 
             * *   **1**: The instance is normal.
             * *   **2**: The specifications of the read-only instances do not match the specifications of the primary instance, and instance performance may be affected. You must adjust the specifications of these instances based on your business requirements.
             */
            public Builder tipsLevel(Integer tipsLevel) {
                this.tipsLevel = tipsLevel;
                return this;
            }

            /**
             * The vSwitch ID.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * The ID of the instance. This parameter is returned only when the instance resides in a VPC.
             */
            public Builder vpcCloudInstanceId(String vpcCloudInstanceId) {
                this.vpcCloudInstanceId = vpcCloudInstanceId;
                return this;
            }

            /**
             * The virtual private cloud (VPC) ID.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * The VPC name.
             */
            public Builder vpcName(String vpcName) {
                this.vpcName = vpcName;
                return this;
            }

            /**
             * The zone ID.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public DBInstance build() {
                return new DBInstance(this);
            } 

        } 

    }
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBInstance")
        private java.util.List < DBInstance> DBInstance;

        private Items(Builder builder) {
            this.DBInstance = builder.DBInstance;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return DBInstance
         */
        public java.util.List < DBInstance> getDBInstance() {
            return this.DBInstance;
        }

        public static final class Builder {
            private java.util.List < DBInstance> DBInstance; 

            /**
             * DBInstance.
             */
            public Builder DBInstance(java.util.List < DBInstance> DBInstance) {
                this.DBInstance = DBInstance;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
