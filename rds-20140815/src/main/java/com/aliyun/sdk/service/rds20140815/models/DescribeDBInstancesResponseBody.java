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
         * Items.
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The pagination token. If the results are displayed on multiple pages, pass this value in the <strong>NextToken</strong> parameter in the next request to display the next page.</p>
         * 
         * <strong>example:</strong>
         * <p>o7PORW5o2TJg****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The page number.</p>
         * <blockquote>
         * <p>If you specify the <strong>MaxResults</strong> or <strong>NextToken</strong> parameter, only <strong>1</strong> is returned for this parameter. You can ignore this return value.</p>
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
         * <p>The number of instances on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of records.</p>
         * <blockquote>
         * <p>If you specify the <strong>MaxResults</strong> or <strong>NextToken</strong> parameter, only the number of records on the current page is returned for this parameter. You can ignore this return value.</p>
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
        @com.aliyun.core.annotation.NameInMap("AutoRenewal")
        private Boolean autoRenewal;

        @com.aliyun.core.annotation.NameInMap("BlueGreenDeploymentName")
        private String blueGreenDeploymentName;

        @com.aliyun.core.annotation.NameInMap("BlueInstanceName")
        private String blueInstanceName;

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

        @com.aliyun.core.annotation.NameInMap("GreenInstanceName")
        private String greenInstanceName;

        @com.aliyun.core.annotation.NameInMap("GuardDBInstanceId")
        private String guardDBInstanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceNetworkType")
        private String instanceNetworkType;

        @com.aliyun.core.annotation.NameInMap("IoAccelerationEnabled")
        private String ioAccelerationEnabled;

        @com.aliyun.core.annotation.NameInMap("IsAnalyticIns")
        private String isAnalyticIns;

        @com.aliyun.core.annotation.NameInMap("IsAnalyticReadOnlyIns")
        private Boolean isAnalyticReadOnlyIns;

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
            this.autoRenewal = builder.autoRenewal;
            this.blueGreenDeploymentName = builder.blueGreenDeploymentName;
            this.blueInstanceName = builder.blueInstanceName;
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
            this.greenInstanceName = builder.greenInstanceName;
            this.guardDBInstanceId = builder.guardDBInstanceId;
            this.instanceNetworkType = builder.instanceNetworkType;
            this.ioAccelerationEnabled = builder.ioAccelerationEnabled;
            this.isAnalyticIns = builder.isAnalyticIns;
            this.isAnalyticReadOnlyIns = builder.isAnalyticReadOnlyIns;
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
         * @return autoRenewal
         */
        public Boolean getAutoRenewal() {
            return this.autoRenewal;
        }

        /**
         * @return blueGreenDeploymentName
         */
        public String getBlueGreenDeploymentName() {
            return this.blueGreenDeploymentName;
        }

        /**
         * @return blueInstanceName
         */
        public String getBlueInstanceName() {
            return this.blueInstanceName;
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
         * @return greenInstanceName
         */
        public String getGreenInstanceName() {
            return this.greenInstanceName;
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
         * @return isAnalyticIns
         */
        public String getIsAnalyticIns() {
            return this.isAnalyticIns;
        }

        /**
         * @return isAnalyticReadOnlyIns
         */
        public Boolean getIsAnalyticReadOnlyIns() {
            return this.isAnalyticReadOnlyIns;
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
            private Boolean autoRenewal; 
            private String blueGreenDeploymentName; 
            private String blueInstanceName; 
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
            private String greenInstanceName; 
            private String guardDBInstanceId; 
            private String instanceNetworkType; 
            private String ioAccelerationEnabled; 
            private String isAnalyticIns; 
            private Boolean isAnalyticReadOnlyIns; 
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
                this.autoRenewal = model.autoRenewal;
                this.blueGreenDeploymentName = model.blueGreenDeploymentName;
                this.blueInstanceName = model.blueInstanceName;
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
                this.greenInstanceName = model.greenInstanceName;
                this.guardDBInstanceId = model.guardDBInstanceId;
                this.instanceNetworkType = model.instanceNetworkType;
                this.ioAccelerationEnabled = model.ioAccelerationEnabled;
                this.isAnalyticIns = model.isAnalyticIns;
                this.isAnalyticReadOnlyIns = model.isAnalyticReadOnlyIns;
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
             * AutoRenewal.
             */
            public Builder autoRenewal(Boolean autoRenewal) {
                this.autoRenewal = autoRenewal;
                return this;
            }

            /**
             * BlueGreenDeploymentName.
             */
            public Builder blueGreenDeploymentName(String blueGreenDeploymentName) {
                this.blueGreenDeploymentName = blueGreenDeploymentName;
                return this;
            }

            /**
             * BlueInstanceName.
             */
            public Builder blueInstanceName(String blueInstanceName) {
                this.blueInstanceName = blueInstanceName;
                return this;
            }

            /**
             * BpeEnabled.
             */
            public Builder bpeEnabled(String bpeEnabled) {
                this.bpeEnabled = bpeEnabled;
                return this;
            }

            /**
             * BurstingEnabled.
             */
            public Builder burstingEnabled(Boolean burstingEnabled) {
                this.burstingEnabled = burstingEnabled;
                return this;
            }

            /**
             * Category.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * ColdDataEnabled.
             */
            public Builder coldDataEnabled(Boolean coldDataEnabled) {
                this.coldDataEnabled = coldDataEnabled;
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
             * DBInstanceCPU.
             */
            public Builder DBInstanceCPU(String DBInstanceCPU) {
                this.DBInstanceCPU = DBInstanceCPU;
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
             * DBInstanceMemory.
             */
            public Builder DBInstanceMemory(Integer DBInstanceMemory) {
                this.DBInstanceMemory = DBInstanceMemory;
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
             * GreenInstanceName.
             */
            public Builder greenInstanceName(String greenInstanceName) {
                this.greenInstanceName = greenInstanceName;
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
             * IoAccelerationEnabled.
             */
            public Builder ioAccelerationEnabled(String ioAccelerationEnabled) {
                this.ioAccelerationEnabled = ioAccelerationEnabled;
                return this;
            }

            /**
             * IsAnalyticIns.
             */
            public Builder isAnalyticIns(String isAnalyticIns) {
                this.isAnalyticIns = isAnalyticIns;
                return this;
            }

            /**
             * IsAnalyticReadOnlyIns.
             */
            public Builder isAnalyticReadOnlyIns(Boolean isAnalyticReadOnlyIns) {
                this.isAnalyticReadOnlyIns = isAnalyticReadOnlyIns;
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
