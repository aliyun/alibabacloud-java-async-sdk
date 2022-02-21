// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
    public static class DBInstance extends TeaModel {
        @NameInMap("ConnectionMode")
        private String connectionMode;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("DBInstanceCategory")
        private String DBInstanceCategory;

        @NameInMap("DBInstanceDescription")
        private String DBInstanceDescription;

        @NameInMap("DBInstanceId")
        private String DBInstanceId;

        @NameInMap("DBInstanceMode")
        private String DBInstanceMode;

        @NameInMap("DBInstanceNetType")
        private String DBInstanceNetType;

        @NameInMap("DBInstanceStatus")
        private String DBInstanceStatus;

        @NameInMap("Engine")
        private String engine;

        @NameInMap("EngineVersion")
        private String engineVersion;

        @NameInMap("ExpireTime")
        private String expireTime;

        @NameInMap("InstanceDeployType")
        private String instanceDeployType;

        @NameInMap("InstanceNetworkType")
        private String instanceNetworkType;

        @NameInMap("LockMode")
        private String lockMode;

        @NameInMap("LockReason")
        private String lockReason;

        @NameInMap("MasterNodeNum")
        private Integer masterNodeNum;

        @NameInMap("PayType")
        private String payType;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("SegNodeNum")
        private String segNodeNum;

        @NameInMap("StorageSize")
        private String storageSize;

        @NameInMap("StorageType")
        private String storageType;

        @NameInMap("Tags")
        private Tags tags;

        @NameInMap("VSwitchId")
        private String vSwitchId;

        @NameInMap("VpcId")
        private String vpcId;

        @NameInMap("ZoneId")
        private String zoneId;

        private DBInstance(Builder builder) {
            this.connectionMode = builder.connectionMode;
            this.createTime = builder.createTime;
            this.DBInstanceCategory = builder.DBInstanceCategory;
            this.DBInstanceDescription = builder.DBInstanceDescription;
            this.DBInstanceId = builder.DBInstanceId;
            this.DBInstanceMode = builder.DBInstanceMode;
            this.DBInstanceNetType = builder.DBInstanceNetType;
            this.DBInstanceStatus = builder.DBInstanceStatus;
            this.engine = builder.engine;
            this.engineVersion = builder.engineVersion;
            this.expireTime = builder.expireTime;
            this.instanceDeployType = builder.instanceDeployType;
            this.instanceNetworkType = builder.instanceNetworkType;
            this.lockMode = builder.lockMode;
            this.lockReason = builder.lockReason;
            this.masterNodeNum = builder.masterNodeNum;
            this.payType = builder.payType;
            this.regionId = builder.regionId;
            this.segNodeNum = builder.segNodeNum;
            this.storageSize = builder.storageSize;
            this.storageType = builder.storageType;
            this.tags = builder.tags;
            this.vSwitchId = builder.vSwitchId;
            this.vpcId = builder.vpcId;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBInstance create() {
            return builder().build();
        }

        /**
         * @return connectionMode
         */
        public String getConnectionMode() {
            return this.connectionMode;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return DBInstanceCategory
         */
        public String getDBInstanceCategory() {
            return this.DBInstanceCategory;
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
         * @return DBInstanceMode
         */
        public String getDBInstanceMode() {
            return this.DBInstanceMode;
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
         * @return instanceDeployType
         */
        public String getInstanceDeployType() {
            return this.instanceDeployType;
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
         * @return masterNodeNum
         */
        public Integer getMasterNodeNum() {
            return this.masterNodeNum;
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
         * @return segNodeNum
         */
        public String getSegNodeNum() {
            return this.segNodeNum;
        }

        /**
         * @return storageSize
         */
        public String getStorageSize() {
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
        public Tags getTags() {
            return this.tags;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
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
            private String connectionMode; 
            private String createTime; 
            private String DBInstanceCategory; 
            private String DBInstanceDescription; 
            private String DBInstanceId; 
            private String DBInstanceMode; 
            private String DBInstanceNetType; 
            private String DBInstanceStatus; 
            private String engine; 
            private String engineVersion; 
            private String expireTime; 
            private String instanceDeployType; 
            private String instanceNetworkType; 
            private String lockMode; 
            private String lockReason; 
            private Integer masterNodeNum; 
            private String payType; 
            private String regionId; 
            private String segNodeNum; 
            private String storageSize; 
            private String storageType; 
            private Tags tags; 
            private String vSwitchId; 
            private String vpcId; 
            private String zoneId; 

            /**
             * ConnectionMode.
             */
            public Builder connectionMode(String connectionMode) {
                this.connectionMode = connectionMode;
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
             * DBInstanceCategory.
             */
            public Builder DBInstanceCategory(String DBInstanceCategory) {
                this.DBInstanceCategory = DBInstanceCategory;
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
             * DBInstanceMode.
             */
            public Builder DBInstanceMode(String DBInstanceMode) {
                this.DBInstanceMode = DBInstanceMode;
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
             * InstanceDeployType.
             */
            public Builder instanceDeployType(String instanceDeployType) {
                this.instanceDeployType = instanceDeployType;
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
             * MasterNodeNum.
             */
            public Builder masterNodeNum(Integer masterNodeNum) {
                this.masterNodeNum = masterNodeNum;
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
             * SegNodeNum.
             */
            public Builder segNodeNum(String segNodeNum) {
                this.segNodeNum = segNodeNum;
                return this;
            }

            /**
             * StorageSize.
             */
            public Builder storageSize(String storageSize) {
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
            public Builder tags(Tags tags) {
                this.tags = tags;
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
             * VpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
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
