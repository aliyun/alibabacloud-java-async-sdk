// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
    private Items items;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageRecordCount")
    private Integer pageRecordCount;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalRecordCount")
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
         * Items.
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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
         * PageRecordCount.
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
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
        public Builder totalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeDBInstancesResponseBody build() {
            return new DescribeDBInstancesResponseBody(this);
        } 

    } 

    public static class ReadOnlyDBInstanceId extends TeaModel {
        @NameInMap("DBInstanceId")
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
             * DBInstanceId.
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
        @NameInMap("ReadOnlyDBInstanceId")
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
        @NameInMap("Category")
        private String category;

        @NameInMap("ConnectionMode")
        private String connectionMode;

        @NameInMap("ConnectionString")
        private String connectionString;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("DBInstanceClass")
        private String DBInstanceClass;

        @NameInMap("DBInstanceDescription")
        private String DBInstanceDescription;

        @NameInMap("DBInstanceId")
        private String DBInstanceId;

        @NameInMap("DBInstanceNetType")
        private String DBInstanceNetType;

        @NameInMap("DBInstanceStatus")
        private String DBInstanceStatus;

        @NameInMap("DBInstanceStorageType")
        private String DBInstanceStorageType;

        @NameInMap("DBInstanceType")
        private String DBInstanceType;

        @NameInMap("DedicatedHostGroupId")
        private String dedicatedHostGroupId;

        @NameInMap("DedicatedHostGroupName")
        private String dedicatedHostGroupName;

        @NameInMap("DedicatedHostIdForLog")
        private String dedicatedHostIdForLog;

        @NameInMap("DedicatedHostIdForMaster")
        private String dedicatedHostIdForMaster;

        @NameInMap("DedicatedHostIdForSlave")
        private String dedicatedHostIdForSlave;

        @NameInMap("DedicatedHostNameForLog")
        private String dedicatedHostNameForLog;

        @NameInMap("DedicatedHostNameForMaster")
        private String dedicatedHostNameForMaster;

        @NameInMap("DedicatedHostNameForSlave")
        private String dedicatedHostNameForSlave;

        @NameInMap("DedicatedHostZoneIdForLog")
        private String dedicatedHostZoneIdForLog;

        @NameInMap("DedicatedHostZoneIdForMaster")
        private String dedicatedHostZoneIdForMaster;

        @NameInMap("DedicatedHostZoneIdForSlave")
        private String dedicatedHostZoneIdForSlave;

        @NameInMap("DeletionProtection")
        private Boolean deletionProtection;

        @NameInMap("DestroyTime")
        private String destroyTime;

        @NameInMap("Engine")
        private String engine;

        @NameInMap("EngineVersion")
        private String engineVersion;

        @NameInMap("ExpireTime")
        private String expireTime;

        @NameInMap("GeneralGroupName")
        private String generalGroupName;

        @NameInMap("GuardDBInstanceId")
        private String guardDBInstanceId;

        @NameInMap("InstanceNetworkType")
        private String instanceNetworkType;

        @NameInMap("LockMode")
        private String lockMode;

        @NameInMap("LockReason")
        private String lockReason;

        @NameInMap("MasterInstanceId")
        private String masterInstanceId;

        @NameInMap("MutriORsignle")
        private Boolean mutriORsignle;

        @NameInMap("PayType")
        private String payType;

        @NameInMap("ReadOnlyDBInstanceIds")
        private ReadOnlyDBInstanceIds readOnlyDBInstanceIds;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("SwitchWeight")
        private Integer switchWeight;

        @NameInMap("TempDBInstanceId")
        private String tempDBInstanceId;

        @NameInMap("Tips")
        private String tips;

        @NameInMap("TipsLevel")
        private Integer tipsLevel;

        @NameInMap("VSwitchId")
        private String vSwitchId;

        @NameInMap("VpcCloudInstanceId")
        private String vpcCloudInstanceId;

        @NameInMap("VpcId")
        private String vpcId;

        @NameInMap("VpcName")
        private String vpcName;

        @NameInMap("ZoneId")
        private String zoneId;

        private DBInstance(Builder builder) {
            this.category = builder.category;
            this.connectionMode = builder.connectionMode;
            this.connectionString = builder.connectionString;
            this.createTime = builder.createTime;
            this.DBInstanceClass = builder.DBInstanceClass;
            this.DBInstanceDescription = builder.DBInstanceDescription;
            this.DBInstanceId = builder.DBInstanceId;
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
         * @return category
         */
        public String getCategory() {
            return this.category;
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
            private String category; 
            private String connectionMode; 
            private String connectionString; 
            private String createTime; 
            private String DBInstanceClass; 
            private String DBInstanceDescription; 
            private String DBInstanceId; 
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
             * Category.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * ConnectionMode.
             */
            public Builder connectionMode(String connectionMode) {
                this.connectionMode = connectionMode;
                return this;
            }

            /**
             * ConnectionString.
             */
            public Builder connectionString(String connectionString) {
                this.connectionString = connectionString;
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
             * DBInstanceClass.
             */
            public Builder DBInstanceClass(String DBInstanceClass) {
                this.DBInstanceClass = DBInstanceClass;
                return this;
            }

            /**
             * DBInstanceDescription.
             */
            public Builder DBInstanceDescription(String DBInstanceDescription) {
                this.DBInstanceDescription = DBInstanceDescription;
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
             * DBInstanceNetType.
             */
            public Builder DBInstanceNetType(String DBInstanceNetType) {
                this.DBInstanceNetType = DBInstanceNetType;
                return this;
            }

            /**
             * DBInstanceStatus.
             */
            public Builder DBInstanceStatus(String DBInstanceStatus) {
                this.DBInstanceStatus = DBInstanceStatus;
                return this;
            }

            /**
             * DBInstanceStorageType.
             */
            public Builder DBInstanceStorageType(String DBInstanceStorageType) {
                this.DBInstanceStorageType = DBInstanceStorageType;
                return this;
            }

            /**
             * DBInstanceType.
             */
            public Builder DBInstanceType(String DBInstanceType) {
                this.DBInstanceType = DBInstanceType;
                return this;
            }

            /**
             * DedicatedHostGroupId.
             */
            public Builder dedicatedHostGroupId(String dedicatedHostGroupId) {
                this.dedicatedHostGroupId = dedicatedHostGroupId;
                return this;
            }

            /**
             * DedicatedHostGroupName.
             */
            public Builder dedicatedHostGroupName(String dedicatedHostGroupName) {
                this.dedicatedHostGroupName = dedicatedHostGroupName;
                return this;
            }

            /**
             * DedicatedHostIdForLog.
             */
            public Builder dedicatedHostIdForLog(String dedicatedHostIdForLog) {
                this.dedicatedHostIdForLog = dedicatedHostIdForLog;
                return this;
            }

            /**
             * DedicatedHostIdForMaster.
             */
            public Builder dedicatedHostIdForMaster(String dedicatedHostIdForMaster) {
                this.dedicatedHostIdForMaster = dedicatedHostIdForMaster;
                return this;
            }

            /**
             * DedicatedHostIdForSlave.
             */
            public Builder dedicatedHostIdForSlave(String dedicatedHostIdForSlave) {
                this.dedicatedHostIdForSlave = dedicatedHostIdForSlave;
                return this;
            }

            /**
             * DedicatedHostNameForLog.
             */
            public Builder dedicatedHostNameForLog(String dedicatedHostNameForLog) {
                this.dedicatedHostNameForLog = dedicatedHostNameForLog;
                return this;
            }

            /**
             * DedicatedHostNameForMaster.
             */
            public Builder dedicatedHostNameForMaster(String dedicatedHostNameForMaster) {
                this.dedicatedHostNameForMaster = dedicatedHostNameForMaster;
                return this;
            }

            /**
             * DedicatedHostNameForSlave.
             */
            public Builder dedicatedHostNameForSlave(String dedicatedHostNameForSlave) {
                this.dedicatedHostNameForSlave = dedicatedHostNameForSlave;
                return this;
            }

            /**
             * DedicatedHostZoneIdForLog.
             */
            public Builder dedicatedHostZoneIdForLog(String dedicatedHostZoneIdForLog) {
                this.dedicatedHostZoneIdForLog = dedicatedHostZoneIdForLog;
                return this;
            }

            /**
             * DedicatedHostZoneIdForMaster.
             */
            public Builder dedicatedHostZoneIdForMaster(String dedicatedHostZoneIdForMaster) {
                this.dedicatedHostZoneIdForMaster = dedicatedHostZoneIdForMaster;
                return this;
            }

            /**
             * DedicatedHostZoneIdForSlave.
             */
            public Builder dedicatedHostZoneIdForSlave(String dedicatedHostZoneIdForSlave) {
                this.dedicatedHostZoneIdForSlave = dedicatedHostZoneIdForSlave;
                return this;
            }

            /**
             * DeletionProtection.
             */
            public Builder deletionProtection(Boolean deletionProtection) {
                this.deletionProtection = deletionProtection;
                return this;
            }

            /**
             * DestroyTime.
             */
            public Builder destroyTime(String destroyTime) {
                this.destroyTime = destroyTime;
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
             * GeneralGroupName.
             */
            public Builder generalGroupName(String generalGroupName) {
                this.generalGroupName = generalGroupName;
                return this;
            }

            /**
             * GuardDBInstanceId.
             */
            public Builder guardDBInstanceId(String guardDBInstanceId) {
                this.guardDBInstanceId = guardDBInstanceId;
                return this;
            }

            /**
             * InstanceNetworkType.
             */
            public Builder instanceNetworkType(String instanceNetworkType) {
                this.instanceNetworkType = instanceNetworkType;
                return this;
            }

            /**
             * LockMode.
             */
            public Builder lockMode(String lockMode) {
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
             * MasterInstanceId.
             */
            public Builder masterInstanceId(String masterInstanceId) {
                this.masterInstanceId = masterInstanceId;
                return this;
            }

            /**
             * MutriORsignle.
             */
            public Builder mutriORsignle(Boolean mutriORsignle) {
                this.mutriORsignle = mutriORsignle;
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
             * ReadOnlyDBInstanceIds.
             */
            public Builder readOnlyDBInstanceIds(ReadOnlyDBInstanceIds readOnlyDBInstanceIds) {
                this.readOnlyDBInstanceIds = readOnlyDBInstanceIds;
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
             * SwitchWeight.
             */
            public Builder switchWeight(Integer switchWeight) {
                this.switchWeight = switchWeight;
                return this;
            }

            /**
             * TempDBInstanceId.
             */
            public Builder tempDBInstanceId(String tempDBInstanceId) {
                this.tempDBInstanceId = tempDBInstanceId;
                return this;
            }

            /**
             * Tips.
             */
            public Builder tips(String tips) {
                this.tips = tips;
                return this;
            }

            /**
             * TipsLevel.
             */
            public Builder tipsLevel(Integer tipsLevel) {
                this.tipsLevel = tipsLevel;
                return this;
            }

            /**
             * VSwitchId.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * VpcCloudInstanceId.
             */
            public Builder vpcCloudInstanceId(String vpcCloudInstanceId) {
                this.vpcCloudInstanceId = vpcCloudInstanceId;
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
             * VpcName.
             */
            public Builder vpcName(String vpcName) {
                this.vpcName = vpcName;
                return this;
            }

            /**
             * ZoneId.
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
        @NameInMap("DBInstance")
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
