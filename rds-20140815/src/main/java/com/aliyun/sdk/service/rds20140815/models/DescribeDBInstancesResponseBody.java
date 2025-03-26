// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeDBInstancesResponseBody model) {
            this.items = model.items;
            this.nextToken = model.nextToken;
            this.pageNumber = model.pageNumber;
            this.pageRecordCount = model.pageRecordCount;
            this.requestId = model.requestId;
            this.totalRecordCount = model.totalRecordCount;
        } 

        /**
         * <p>The information about the instances.</p>
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The token that is used to display the next page. If the returned entries are displayed on multiple pages, the next page can be displayed when you call this operation again with <strong>NextToken</strong> specified.</p>
         * 
         * <strong>example:</strong>
         * <p>o7PORW5o2TJg**********</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
         * <blockquote>
         * <p>If you specify <strong>MaxResults</strong> or <strong>NextToken</strong>, only the value <strong>1</strong> is returned. You can ignore the value 1.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * <blockquote>
         * <p>If you specify <strong>MaxResults</strong> or <strong>NextToken</strong>, only the number of entries on the current page is returned. You can ignore the number.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeDBInstancesResponseBody build() {
            return new DescribeDBInstancesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDBInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstancesResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(ReadOnlyDBInstanceId model) {
                this.DBInstanceId = model.DBInstanceId;
            } 

            /**
             * <p>The read-only instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rr-uf6wjk5xxxxxxx</p>
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
    /**
     * 
     * {@link DescribeDBInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstancesResponseBody</p>
     */
    public static class ReadOnlyDBInstanceIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ReadOnlyDBInstanceId")
        private java.util.List<ReadOnlyDBInstanceId> readOnlyDBInstanceId;

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
        public java.util.List<ReadOnlyDBInstanceId> getReadOnlyDBInstanceId() {
            return this.readOnlyDBInstanceId;
        }

        public static final class Builder {
            private java.util.List<ReadOnlyDBInstanceId> readOnlyDBInstanceId; 

            private Builder() {
            } 

            private Builder(ReadOnlyDBInstanceIds model) {
                this.readOnlyDBInstanceId = model.readOnlyDBInstanceId;
            } 

            /**
             * ReadOnlyDBInstanceId.
             */
            public Builder readOnlyDBInstanceId(java.util.List<ReadOnlyDBInstanceId> readOnlyDBInstanceId) {
                this.readOnlyDBInstanceId = readOnlyDBInstanceId;
                return this;
            }

            public ReadOnlyDBInstanceIds build() {
                return new ReadOnlyDBInstanceIds(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDBInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstancesResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(DBInstance model) {
                this.bpeEnabled = model.bpeEnabled;
                this.burstingEnabled = model.burstingEnabled;
                this.category = model.category;
                this.coldDataEnabled = model.coldDataEnabled;
                this.connectionMode = model.connectionMode;
                this.connectionString = model.connectionString;
                this.createTime = model.createTime;
                this.DBInstanceCPU = model.DBInstanceCPU;
                this.DBInstanceClass = model.DBInstanceClass;
                this.DBInstanceDescription = model.DBInstanceDescription;
                this.DBInstanceId = model.DBInstanceId;
                this.DBInstanceMemory = model.DBInstanceMemory;
                this.DBInstanceNetType = model.DBInstanceNetType;
                this.DBInstanceStatus = model.DBInstanceStatus;
                this.DBInstanceStorageType = model.DBInstanceStorageType;
                this.DBInstanceType = model.DBInstanceType;
                this.dedicatedHostGroupId = model.dedicatedHostGroupId;
                this.dedicatedHostGroupName = model.dedicatedHostGroupName;
                this.dedicatedHostIdForLog = model.dedicatedHostIdForLog;
                this.dedicatedHostIdForMaster = model.dedicatedHostIdForMaster;
                this.dedicatedHostIdForSlave = model.dedicatedHostIdForSlave;
                this.dedicatedHostNameForLog = model.dedicatedHostNameForLog;
                this.dedicatedHostNameForMaster = model.dedicatedHostNameForMaster;
                this.dedicatedHostNameForSlave = model.dedicatedHostNameForSlave;
                this.dedicatedHostZoneIdForLog = model.dedicatedHostZoneIdForLog;
                this.dedicatedHostZoneIdForMaster = model.dedicatedHostZoneIdForMaster;
                this.dedicatedHostZoneIdForSlave = model.dedicatedHostZoneIdForSlave;
                this.deletionProtection = model.deletionProtection;
                this.destroyTime = model.destroyTime;
                this.engine = model.engine;
                this.engineVersion = model.engineVersion;
                this.expireTime = model.expireTime;
                this.generalGroupName = model.generalGroupName;
                this.guardDBInstanceId = model.guardDBInstanceId;
                this.instanceNetworkType = model.instanceNetworkType;
                this.ioAccelerationEnabled = model.ioAccelerationEnabled;
                this.lockMode = model.lockMode;
                this.lockReason = model.lockReason;
                this.masterInstanceId = model.masterInstanceId;
                this.mutriORsignle = model.mutriORsignle;
                this.payType = model.payType;
                this.readOnlyDBInstanceIds = model.readOnlyDBInstanceIds;
                this.regionId = model.regionId;
                this.resourceGroupId = model.resourceGroupId;
                this.switchWeight = model.switchWeight;
                this.tempDBInstanceId = model.tempDBInstanceId;
                this.tips = model.tips;
                this.tipsLevel = model.tipsLevel;
                this.vSwitchId = model.vSwitchId;
                this.vpcCloudInstanceId = model.vpcCloudInstanceId;
                this.vpcId = model.vpcId;
                this.vpcName = model.vpcName;
                this.zoneId = model.zoneId;
            } 

            /**
             * <p>A deprecated parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder bpeEnabled(String bpeEnabled) {
                this.bpeEnabled = bpeEnabled;
                return this;
            }

            /**
             * <p>Indicates whether the I/O burst feature is enabled. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder burstingEnabled(Boolean burstingEnabled) {
                this.burstingEnabled = burstingEnabled;
                return this;
            }

            /**
             * <p>The RDS edition of the instance. Valid values:</p>
             * <ul>
             * <li><strong>Basic</strong>: RDS Basic Edition</li>
             * <li><strong>HighAvailability</strong>: RDS High-availability Edition</li>
             * <li><strong>Finance</strong>: RDS Enterprise Edition</li>
             * </ul>
             * <blockquote>
             * <p> This parameter is returned only when the <strong>InstanceLevel</strong> parameter is set to <strong>1</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Basic</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>A reserved parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder coldDataEnabled(Boolean coldDataEnabled) {
                this.coldDataEnabled = coldDataEnabled;
                return this;
            }

            /**
             * <p>The connection mode of the instance. Valid values:</p>
             * <ul>
             * <li><strong>Standard</strong>: standard mode</li>
             * <li><strong>Safe</strong>: database proxy mode</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Standard</p>
             */
            public Builder connectionMode(String connectionMode) {
                this.connectionMode = connectionMode;
                return this;
            }

            /**
             * <p>The endpoint of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-uf6wjk5xxxxxxx.mysql.rds.aliyuncs.com</p>
             */
            public Builder connectionString(String connectionString) {
                this.connectionString = connectionString;
                return this;
            }

            /**
             * <p>The creation time of the instance. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-11-05T11:26:02Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The number of CPU instances.</p>
             * <p>Returns only when the InstanceLevel parameter is 1.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder DBInstanceCPU(String DBInstanceCPU) {
                this.DBInstanceCPU = DBInstanceCPU;
                return this;
            }

            /**
             * <p>The instance type of the instance. For information, see <a href="https://help.aliyun.com/document_detail/26312.html">Primary ApsaraDB RDS instance types</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>rds.mys2.small</p>
             */
            public Builder DBInstanceClass(String DBInstanceClass) {
                this.DBInstanceClass = DBInstanceClass;
                return this;
            }

            /**
             * <p>The instance description.</p>
             * 
             * <strong>example:</strong>
             * <p>Test database</p>
             */
            public Builder DBInstanceDescription(String DBInstanceDescription) {
                this.DBInstanceDescription = DBInstanceDescription;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-uf6wjk5xxxxxxxxxx</p>
             */
            public Builder DBInstanceId(String DBInstanceId) {
                this.DBInstanceId = DBInstanceId;
                return this;
            }

            /**
             * <p>The memory size of the node. Unit: MB.</p>
             * <p>Returns only when the InstanceLevel parameter is 1.</p>
             * 
             * <strong>example:</strong>
             * <p>4096</p>
             */
            public Builder DBInstanceMemory(Integer DBInstanceMemory) {
                this.DBInstanceMemory = DBInstanceMemory;
                return this;
            }

            /**
             * <p>The type of the network connection to the instance. Valid values:</p>
             * <ul>
             * <li><strong>Internet</strong></li>
             * <li><strong>Intranet</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Internet</p>
             */
            public Builder DBInstanceNetType(String DBInstanceNetType) {
                this.DBInstanceNetType = DBInstanceNetType;
                return this;
            }

            /**
             * <p>The instance status. For more information, see <a href="https://help.aliyun.com/document_detail/26315.html">Instance statuses</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder DBInstanceStatus(String DBInstanceStatus) {
                this.DBInstanceStatus = DBInstanceStatus;
                return this;
            }

            /**
             * <p>The storage type of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>ModuleList.4.ModuleCode</p>
             */
            public Builder DBInstanceStorageType(String DBInstanceStorageType) {
                this.DBInstanceStorageType = DBInstanceStorageType;
                return this;
            }

            /**
             * <p>The type of the instance. Valid values:</p>
             * <ul>
             * <li><strong>Primary</strong>: primary instance</li>
             * <li><strong>Readonly</strong>: read-only instance</li>
             * <li><strong>Guard</strong>: disaster recovery instance</li>
             * <li><strong>Temp</strong>: temporary instance</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Primary</p>
             */
            public Builder DBInstanceType(String DBInstanceType) {
                this.DBInstanceType = DBInstanceType;
                return this;
            }

            /**
             * <p>The ID of the dedicated cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>dhg-7a9xxxxxxxx</p>
             */
            public Builder dedicatedHostGroupId(String dedicatedHostGroupId) {
                this.dedicatedHostGroupId = dedicatedHostGroupId;
                return this;
            }

            /**
             * <p>The name of the dedicated cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>testhostgroup</p>
             */
            public Builder dedicatedHostGroupName(String dedicatedHostGroupName) {
                this.dedicatedHostGroupName = dedicatedHostGroupName;
                return this;
            }

            /**
             * <p>The ID of the host on which the logger instance resides.</p>
             * 
             * <strong>example:</strong>
             * <p>dh-bpxxxx</p>
             */
            public Builder dedicatedHostIdForLog(String dedicatedHostIdForLog) {
                this.dedicatedHostIdForLog = dedicatedHostIdForLog;
                return this;
            }

            /**
             * <p>The ID of the host on which the primary instance resides.</p>
             * 
             * <strong>example:</strong>
             * <p>dh-bpxxxx</p>
             */
            public Builder dedicatedHostIdForMaster(String dedicatedHostIdForMaster) {
                this.dedicatedHostIdForMaster = dedicatedHostIdForMaster;
                return this;
            }

            /**
             * <p>The ID of the host on which the secondary instance resides.</p>
             * 
             * <strong>example:</strong>
             * <p>dh-bpxxxx</p>
             */
            public Builder dedicatedHostIdForSlave(String dedicatedHostIdForSlave) {
                this.dedicatedHostIdForSlave = dedicatedHostIdForSlave;
                return this;
            }

            /**
             * <p>The name of the host on which the logger instance resides.</p>
             * 
             * <strong>example:</strong>
             * <p>testlog</p>
             */
            public Builder dedicatedHostNameForLog(String dedicatedHostNameForLog) {
                this.dedicatedHostNameForLog = dedicatedHostNameForLog;
                return this;
            }

            /**
             * <p>The name of the host on which the primary instance resides.</p>
             * 
             * <strong>example:</strong>
             * <p>testmaster</p>
             */
            public Builder dedicatedHostNameForMaster(String dedicatedHostNameForMaster) {
                this.dedicatedHostNameForMaster = dedicatedHostNameForMaster;
                return this;
            }

            /**
             * <p>The name of the host on which the secondary instance resides.</p>
             * 
             * <strong>example:</strong>
             * <p>testslave</p>
             */
            public Builder dedicatedHostNameForSlave(String dedicatedHostNameForSlave) {
                this.dedicatedHostNameForSlave = dedicatedHostNameForSlave;
                return this;
            }

            /**
             * <p>The zone ID of the host on which the logger instance resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-b</p>
             */
            public Builder dedicatedHostZoneIdForLog(String dedicatedHostZoneIdForLog) {
                this.dedicatedHostZoneIdForLog = dedicatedHostZoneIdForLog;
                return this;
            }

            /**
             * <p>The zone ID of the host on which the primary instance resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-c</p>
             */
            public Builder dedicatedHostZoneIdForMaster(String dedicatedHostZoneIdForMaster) {
                this.dedicatedHostZoneIdForMaster = dedicatedHostZoneIdForMaster;
                return this;
            }

            /**
             * <p>The zone ID of the host on which the secondary instance resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-d</p>
             */
            public Builder dedicatedHostZoneIdForSlave(String dedicatedHostZoneIdForSlave) {
                this.dedicatedHostZoneIdForSlave = dedicatedHostZoneIdForSlave;
                return this;
            }

            /**
             * <p>Indicates whether the release protection feature is enabled for the instance. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder deletionProtection(Boolean deletionProtection) {
                this.deletionProtection = deletionProtection;
                return this;
            }

            /**
             * <p>The time when the instance was destroyed. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-11-05T11:26:02Z</p>
             */
            public Builder destroyTime(String destroyTime) {
                this.destroyTime = destroyTime;
                return this;
            }

            /**
             * <p>The database engine of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>MySQL</p>
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * <p>The database engine version.</p>
             * 
             * <strong>example:</strong>
             * <p>5.7</p>
             */
            public Builder engineVersion(String engineVersion) {
                this.engineVersion = engineVersion;
                return this;
            }

            /**
             * <p>The expiration time of the instance. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * <blockquote>
             * <p> Pay-as-you-go instances never expire.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2019-02-27T16:00:00Z</p>
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * <p>The name of the dedicated cluster to which the instance belongs. This parameter is returned only when the instance is created in an ApsaraDB MyBase cluster that runs MySQL on Standard Edition.</p>
             * 
             * <strong>example:</strong>
             * <p>TestGroup</p>
             */
            public Builder generalGroupName(String generalGroupName) {
                this.generalGroupName = generalGroupName;
                return this;
            }

            /**
             * <p>The ID of the disaster recovery instance. This parameter is returned only when the instance is a primary instance and has a disaster recovery instance attached.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-uf64zsuxxxxxxxxxx</p>
             */
            public Builder guardDBInstanceId(String guardDBInstanceId) {
                this.guardDBInstanceId = guardDBInstanceId;
                return this;
            }

            /**
             * <p>The network type of the instance. Valid values:</p>
             * <ul>
             * <li><strong>Classic</strong></li>
             * <li><strong>VPC</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Classic</p>
             */
            public Builder instanceNetworkType(String instanceNetworkType) {
                this.instanceNetworkType = instanceNetworkType;
                return this;
            }

            /**
             * <p>Indicates whether the I/O acceleration feature is enabled. Valid values:</p>
             * <ul>
             * <li>1: enabled</li>
             * <li>0: disabled</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder ioAccelerationEnabled(String ioAccelerationEnabled) {
                this.ioAccelerationEnabled = ioAccelerationEnabled;
                return this;
            }

            /**
             * <p>The lock mode of the instance. Valid values:</p>
             * <ul>
             * <li><strong>Unlock</strong>: The instance is not locked.</li>
             * <li><strong>ManualLock</strong>: The instance is manually locked.</li>
             * <li><strong>LockByExpiration</strong>: The instance is automatically locked due to instance expiration.</li>
             * <li><strong>LockByRestoration</strong>: The instance is automatically locked before the instance is rolled back.</li>
             * <li><strong>LockByDiskQuota</strong>: The instance is automatically locked due to exhausted storage capacity.</li>
             * <li><strong>Released</strong>: The instance is released. After an instance is released, the instance cannot be unlocked. You can only restore the backup data of the instance to a new instance. This process requires a long period of time.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Unlock</p>
             */
            public Builder lockMode(String lockMode) {
                this.lockMode = lockMode;
                return this;
            }

            /**
             * <p>The reason why the instance was locked.</p>
             * 
             * <strong>example:</strong>
             * <p>instance_expired</p>
             */
            public Builder lockReason(String lockReason) {
                this.lockReason = lockReason;
                return this;
            }

            /**
             * <p>The ID of the primary instance. If this parameter is null, the instance is a primary instance.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-uf6wjk5xxxxxxxxxx</p>
             */
            public Builder masterInstanceId(String masterInstanceId) {
                this.masterInstanceId = masterInstanceId;
                return this;
            }

            /**
             * <p>Indicates whether the multi-zone deployment method is used for the instance. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * <blockquote>
             * <p> If the multi-zone deployment method is used for the instance, the zone ID of the instance contains MAZ. Example: <code>cn-hangzhou-MAZ10(h,i)</code>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder mutriORsignle(Boolean mutriORsignle) {
                this.mutriORsignle = mutriORsignle;
                return this;
            }

            /**
             * <p>The billing method of the instance. Valid values:</p>
             * <ul>
             * <li><strong>Postpaid</strong>: pay-as-you-go</li>
             * <li><strong>Prepaid</strong>: subscription</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Postpaid</p>
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            /**
             * <p>The IDs of the read-only instances. This parameter is returned only when the instance is a primary instance and has the read-only instances attached.</p>
             */
            public Builder readOnlyDBInstanceIds(ReadOnlyDBInstanceIds readOnlyDBInstanceIds) {
                this.readOnlyDBInstanceIds = readOnlyDBInstanceIds;
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
             * <p>The resource group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-acfmyxxxxxxx</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>Indicates whether the instance supports weight-based switchovers for high availability. This parameter is returned only when the instance is created in an ApsaraDB MyBase cluster that runs MySQL on Standard Edition. Valid values:</p>
             * <ul>
             * <li><strong>100</strong>: The instance supports weight-based switchovers for high availability.</li>
             * <li><strong>0</strong>: The instance does not support weight-based switchovers for high availability.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder switchWeight(Integer switchWeight) {
                this.switchWeight = switchWeight;
                return this;
            }

            /**
             * <p>The ID of the temporary instance. This parameter is returned only when the instance is a primary instance and has a temporary instance attached.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-uf64zsuxxxxxxxxxx</p>
             */
            public Builder tempDBInstanceId(String tempDBInstanceId) {
                this.tempDBInstanceId = tempDBInstanceId;
                return this;
            }

            /**
             * <p>The information about the exception that is detected on the instance. This parameter is returned only when the instance is created in an ApsaraDB MyBase cluster that runs MySQL on Standard Edition.</p>
             * 
             * <strong>example:</strong>
             * <p>Run as expected.</p>
             */
            public Builder tips(String tips) {
                this.tips = tips;
                return this;
            }

            /**
             * <p>The severity of the exception that is detected on the instance. This parameter is returned only when the instance is created in an ApsaraDB MyBase cluster that runs MySQL on Standard Edition. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: The instance is normal.</li>
             * <li><strong>2</strong>: The specifications of the read-only instances do not match the specifications of the primary instance, and instance performance may be affected. You must adjust the specifications of these instances based on your business requirements.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder tipsLevel(Integer tipsLevel) {
                this.tipsLevel = tipsLevel;
                return this;
            }

            /**
             * <p>The vSwitch ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-uf6adz52c2pxxxxxxx</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>The ID of the instance. This parameter is returned only when the instance resides in a VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-uf6wjk5xxxxxxx</p>
             */
            public Builder vpcCloudInstanceId(String vpcCloudInstanceId) {
                this.vpcCloudInstanceId = vpcCloudInstanceId;
                return this;
            }

            /**
             * <p>The virtual private cloud (VPC) ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-uf6f7l4fg90xxxxxxx</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>The VPC name.</p>
             * 
             * <strong>example:</strong>
             * <p>test-huadong</p>
             */
            public Builder vpcName(String vpcName) {
                this.vpcName = vpcName;
                return this;
            }

            /**
             * <p>The zone ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-a</p>
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
    /**
     * 
     * {@link DescribeDBInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstancesResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBInstance")
        private java.util.List<DBInstance> DBInstance;

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
        public java.util.List<DBInstance> getDBInstance() {
            return this.DBInstance;
        }

        public static final class Builder {
            private java.util.List<DBInstance> DBInstance; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.DBInstance = model.DBInstance;
            } 

            /**
             * DBInstance.
             */
            public Builder DBInstance(java.util.List<DBInstance> DBInstance) {
                this.DBInstance = DBInstance;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
