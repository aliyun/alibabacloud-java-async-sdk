// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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

        private Builder() {
        } 

        private Builder(DescribeDBInstancesResponseBody model) {
            this.items = model.items;
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
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>03C46A7A-E680-5B9F-B890-38789B52EB50</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
    public static class DBInstance extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DBClusterId")
        private String DBClusterId;

        @com.aliyun.core.annotation.NameInMap("DBInstanceClass")
        private String DBInstanceClass;

        @com.aliyun.core.annotation.NameInMap("DBInstanceDescription")
        private String DBInstanceDescription;

        @com.aliyun.core.annotation.NameInMap("DBInstanceId")
        private String DBInstanceId;

        @com.aliyun.core.annotation.NameInMap("DBInstanceStatus")
        private String DBInstanceStatus;

        @com.aliyun.core.annotation.NameInMap("DBInstanceType")
        private String DBInstanceType;

        @com.aliyun.core.annotation.NameInMap("DBType")
        private String DBType;

        @com.aliyun.core.annotation.NameInMap("DBVersion")
        private String DBVersion;

        @com.aliyun.core.annotation.NameInMap("Engine")
        private String engine;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private String expireTime;

        @com.aliyun.core.annotation.NameInMap("InstanceNetworkType")
        private String instanceNetworkType;

        @com.aliyun.core.annotation.NameInMap("LockMode")
        private String lockMode;

        @com.aliyun.core.annotation.NameInMap("LockReason")
        private String lockReason;

        @com.aliyun.core.annotation.NameInMap("PayType")
        private String payType;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private DBInstance(Builder builder) {
            this.createTime = builder.createTime;
            this.DBClusterId = builder.DBClusterId;
            this.DBInstanceClass = builder.DBInstanceClass;
            this.DBInstanceDescription = builder.DBInstanceDescription;
            this.DBInstanceId = builder.DBInstanceId;
            this.DBInstanceStatus = builder.DBInstanceStatus;
            this.DBInstanceType = builder.DBInstanceType;
            this.DBType = builder.DBType;
            this.DBVersion = builder.DBVersion;
            this.engine = builder.engine;
            this.expireTime = builder.expireTime;
            this.instanceNetworkType = builder.instanceNetworkType;
            this.lockMode = builder.lockMode;
            this.lockReason = builder.lockReason;
            this.payType = builder.payType;
            this.regionId = builder.regionId;
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
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return DBClusterId
         */
        public String getDBClusterId() {
            return this.DBClusterId;
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
         * @return DBInstanceStatus
         */
        public String getDBInstanceStatus() {
            return this.DBInstanceStatus;
        }

        /**
         * @return DBInstanceType
         */
        public String getDBInstanceType() {
            return this.DBInstanceType;
        }

        /**
         * @return DBType
         */
        public String getDBType() {
            return this.DBType;
        }

        /**
         * @return DBVersion
         */
        public String getDBVersion() {
            return this.DBVersion;
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
            private String createTime; 
            private String DBClusterId; 
            private String DBInstanceClass; 
            private String DBInstanceDescription; 
            private String DBInstanceId; 
            private String DBInstanceStatus; 
            private String DBInstanceType; 
            private String DBType; 
            private String DBVersion; 
            private String engine; 
            private String expireTime; 
            private String instanceNetworkType; 
            private String lockMode; 
            private String lockReason; 
            private String payType; 
            private String regionId; 
            private String vSwitchId; 
            private String vpcId; 
            private String zoneId; 

            private Builder() {
            } 

            private Builder(DBInstance model) {
                this.createTime = model.createTime;
                this.DBClusterId = model.DBClusterId;
                this.DBInstanceClass = model.DBInstanceClass;
                this.DBInstanceDescription = model.DBInstanceDescription;
                this.DBInstanceId = model.DBInstanceId;
                this.DBInstanceStatus = model.DBInstanceStatus;
                this.DBInstanceType = model.DBInstanceType;
                this.DBType = model.DBType;
                this.DBVersion = model.DBVersion;
                this.engine = model.engine;
                this.expireTime = model.expireTime;
                this.instanceNetworkType = model.instanceNetworkType;
                this.lockMode = model.lockMode;
                this.lockReason = model.lockReason;
                this.payType = model.payType;
                this.regionId = model.regionId;
                this.vSwitchId = model.vSwitchId;
                this.vpcId = model.vpcId;
                this.zoneId = model.zoneId;
            } 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * DBClusterId.
             */
            public Builder DBClusterId(String DBClusterId) {
                this.DBClusterId = DBClusterId;
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
             * DBInstanceStatus.
             */
            public Builder DBInstanceStatus(String DBInstanceStatus) {
                this.DBInstanceStatus = DBInstanceStatus;
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
             * DBType.
             */
            public Builder DBType(String DBType) {
                this.DBType = DBType;
                return this;
            }

            /**
             * DBVersion.
             */
            public Builder DBVersion(String DBVersion) {
                this.DBVersion = DBVersion;
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
