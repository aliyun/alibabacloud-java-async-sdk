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
 * {@link DescribeDBInstancesForCloneResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBInstancesForCloneResponseBody</p>
 */
public class DescribeDBInstancesForCloneResponseBody extends TeaModel {
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

    private DescribeDBInstancesForCloneResponseBody(Builder builder) {
        this.items = builder.items;
        this.pageNumber = builder.pageNumber;
        this.pageRecordCount = builder.pageRecordCount;
        this.requestId = builder.requestId;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBInstancesForCloneResponseBody create() {
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

        private Builder(DescribeDBInstancesForCloneResponseBody model) {
            this.items = model.items;
            this.pageNumber = model.pageNumber;
            this.pageRecordCount = model.pageRecordCount;
            this.requestId = model.requestId;
            this.totalRecordCount = model.totalRecordCount;
        } 

        /**
         * <p>An array that consists of the details about the instances.</p>
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
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
         * <p>1E43AAE0-BEE8-43DA-860D-EAF2AA0724DC</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        public Builder totalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeDBInstancesForCloneResponseBody build() {
            return new DescribeDBInstancesForCloneResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDBInstancesForCloneResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstancesForCloneResponseBody</p>
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
             * <p>The ID of the read-only instance.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-bpxxxxxxxxx</p>
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
     * {@link DescribeDBInstancesForCloneResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstancesForCloneResponseBody</p>
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
     * {@link DescribeDBInstancesForCloneResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstancesForCloneResponseBody</p>
     */
    public static class DBInstance extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("ConnectionMode")
        private String connectionMode;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DBInstanceClass")
        private String DBInstanceClass;

        @com.aliyun.core.annotation.NameInMap("DBInstanceDescription")
        private String DBInstanceDescription;

        @com.aliyun.core.annotation.NameInMap("DBInstanceId")
        private String DBInstanceId;

        @com.aliyun.core.annotation.NameInMap("DBInstanceNetType")
        private String DBInstanceNetType;

        @com.aliyun.core.annotation.NameInMap("DBInstanceStatus")
        private String DBInstanceStatus;

        @com.aliyun.core.annotation.NameInMap("DBInstanceStorageType")
        private String DBInstanceStorageType;

        @com.aliyun.core.annotation.NameInMap("DBInstanceType")
        private String DBInstanceType;

        @com.aliyun.core.annotation.NameInMap("DestroyTime")
        private String destroyTime;

        @com.aliyun.core.annotation.NameInMap("Engine")
        private String engine;

        @com.aliyun.core.annotation.NameInMap("EngineVersion")
        private String engineVersion;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private String expireTime;

        @com.aliyun.core.annotation.NameInMap("GuardDBInstanceId")
        private String guardDBInstanceId;

        @com.aliyun.core.annotation.NameInMap("InsId")
        private Integer insId;

        @com.aliyun.core.annotation.NameInMap("InstanceNetworkType")
        private String instanceNetworkType;

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

        @com.aliyun.core.annotation.NameInMap("ReplicateId")
        private String replicateId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("TempDBInstanceId")
        private String tempDBInstanceId;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("VpcCloudInstanceId")
        private String vpcCloudInstanceId;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private DBInstance(Builder builder) {
            this.category = builder.category;
            this.connectionMode = builder.connectionMode;
            this.createTime = builder.createTime;
            this.DBInstanceClass = builder.DBInstanceClass;
            this.DBInstanceDescription = builder.DBInstanceDescription;
            this.DBInstanceId = builder.DBInstanceId;
            this.DBInstanceNetType = builder.DBInstanceNetType;
            this.DBInstanceStatus = builder.DBInstanceStatus;
            this.DBInstanceStorageType = builder.DBInstanceStorageType;
            this.DBInstanceType = builder.DBInstanceType;
            this.destroyTime = builder.destroyTime;
            this.engine = builder.engine;
            this.engineVersion = builder.engineVersion;
            this.expireTime = builder.expireTime;
            this.guardDBInstanceId = builder.guardDBInstanceId;
            this.insId = builder.insId;
            this.instanceNetworkType = builder.instanceNetworkType;
            this.lockMode = builder.lockMode;
            this.lockReason = builder.lockReason;
            this.masterInstanceId = builder.masterInstanceId;
            this.mutriORsignle = builder.mutriORsignle;
            this.payType = builder.payType;
            this.readOnlyDBInstanceIds = builder.readOnlyDBInstanceIds;
            this.regionId = builder.regionId;
            this.replicateId = builder.replicateId;
            this.resourceGroupId = builder.resourceGroupId;
            this.tempDBInstanceId = builder.tempDBInstanceId;
            this.vSwitchId = builder.vSwitchId;
            this.vpcCloudInstanceId = builder.vpcCloudInstanceId;
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
         * @return guardDBInstanceId
         */
        public String getGuardDBInstanceId() {
            return this.guardDBInstanceId;
        }

        /**
         * @return insId
         */
        public Integer getInsId() {
            return this.insId;
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
         * @return replicateId
         */
        public String getReplicateId() {
            return this.replicateId;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return tempDBInstanceId
         */
        public String getTempDBInstanceId() {
            return this.tempDBInstanceId;
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
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String category; 
            private String connectionMode; 
            private String createTime; 
            private String DBInstanceClass; 
            private String DBInstanceDescription; 
            private String DBInstanceId; 
            private String DBInstanceNetType; 
            private String DBInstanceStatus; 
            private String DBInstanceStorageType; 
            private String DBInstanceType; 
            private String destroyTime; 
            private String engine; 
            private String engineVersion; 
            private String expireTime; 
            private String guardDBInstanceId; 
            private Integer insId; 
            private String instanceNetworkType; 
            private String lockMode; 
            private String lockReason; 
            private String masterInstanceId; 
            private Boolean mutriORsignle; 
            private String payType; 
            private ReadOnlyDBInstanceIds readOnlyDBInstanceIds; 
            private String regionId; 
            private String replicateId; 
            private String resourceGroupId; 
            private String tempDBInstanceId; 
            private String vSwitchId; 
            private String vpcCloudInstanceId; 
            private String vpcId; 
            private String zoneId; 

            private Builder() {
            } 

            private Builder(DBInstance model) {
                this.category = model.category;
                this.connectionMode = model.connectionMode;
                this.createTime = model.createTime;
                this.DBInstanceClass = model.DBInstanceClass;
                this.DBInstanceDescription = model.DBInstanceDescription;
                this.DBInstanceId = model.DBInstanceId;
                this.DBInstanceNetType = model.DBInstanceNetType;
                this.DBInstanceStatus = model.DBInstanceStatus;
                this.DBInstanceStorageType = model.DBInstanceStorageType;
                this.DBInstanceType = model.DBInstanceType;
                this.destroyTime = model.destroyTime;
                this.engine = model.engine;
                this.engineVersion = model.engineVersion;
                this.expireTime = model.expireTime;
                this.guardDBInstanceId = model.guardDBInstanceId;
                this.insId = model.insId;
                this.instanceNetworkType = model.instanceNetworkType;
                this.lockMode = model.lockMode;
                this.lockReason = model.lockReason;
                this.masterInstanceId = model.masterInstanceId;
                this.mutriORsignle = model.mutriORsignle;
                this.payType = model.payType;
                this.readOnlyDBInstanceIds = model.readOnlyDBInstanceIds;
                this.regionId = model.regionId;
                this.replicateId = model.replicateId;
                this.resourceGroupId = model.resourceGroupId;
                this.tempDBInstanceId = model.tempDBInstanceId;
                this.vSwitchId = model.vSwitchId;
                this.vpcCloudInstanceId = model.vpcCloudInstanceId;
                this.vpcId = model.vpcId;
                this.zoneId = model.zoneId;
            } 

            /**
             * <p>The RDS edition of the instance. Valid values:</p>
             * <ul>
             * <li><strong>Basic</strong>: RDS Basic Edition</li>
             * <li><strong>HighAvailability</strong>: RDS High-availability Edition</li>
             * <li><strong>Finance</strong>: RDS Enterprise Edition</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>HighAvailability</p>
             */
            public Builder category(String category) {
                this.category = category;
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
             * <p>The time when the instance was created. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-11-05T11:26:02Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The instance type of the instance. For more information, see <a href="https://help.aliyun.com/document_detail/26312.html">Instance types</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>mysql.n1.micro.1</p>
             */
            public Builder DBInstanceClass(String DBInstanceClass) {
                this.DBInstanceClass = DBInstanceClass;
                return this;
            }

            /**
             * <p>The name of the instance. It must be 2 to 256 characters in length. The value can contain letters, digits, underscores (_), and hyphens (-). The value must start with a letter.</p>
             * <blockquote>
             * <p>The value cannot start with http:// or https://.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Test</p>
             */
            public Builder DBInstanceDescription(String DBInstanceDescription) {
                this.DBInstanceDescription = DBInstanceDescription;
                return this;
            }

            /**
             * <p>The ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-uf6wjk5xxxxxxxxxx</p>
             */
            public Builder DBInstanceId(String DBInstanceId) {
                this.DBInstanceId = DBInstanceId;
                return this;
            }

            /**
             * <p>The network connection type of the instance. Valid values:</p>
             * <ul>
             * <li><strong>Internet</strong></li>
             * <li><strong>Intranet</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Intranet</p>
             */
            public Builder DBInstanceNetType(String DBInstanceNetType) {
                this.DBInstanceNetType = DBInstanceNetType;
                return this;
            }

            /**
             * <p>The status of the instance. For more information, see <a href="https://help.aliyun.com/document_detail/26315.html">Instance state table</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder DBInstanceStatus(String DBInstanceStatus) {
                this.DBInstanceStatus = DBInstanceStatus;
                return this;
            }

            /**
             * <p>The storage type of the instance. Valid values:</p>
             * <ul>
             * <li><strong>local_ssd/ephemeral_ssd</strong>: local SSD</li>
             * <li><strong>cloud_ssd</strong>: standard SSD.</li>
             * <li><strong>cloud_essd</strong>: enhanced SSD (ESSD)</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>local_ssd</p>
             */
            public Builder DBInstanceStorageType(String DBInstanceStorageType) {
                this.DBInstanceStorageType = DBInstanceStorageType;
                return this;
            }

            /**
             * <p>The role of the instance. Valid values:</p>
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
             * <p>The time when the instance was destroyed. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-12-05T11:26:02Z</p>
             */
            public Builder destroyTime(String destroyTime) {
                this.destroyTime = destroyTime;
                return this;
            }

            /**
             * <p>The database engine of the instance. Valid values:</p>
             * <ul>
             * <li>MySQL</li>
             * <li>SQLServer</li>
             * <li>PostgreSQL</li>
             * <li>PPAS</li>
             * <li>MariaDB</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>MySQL</p>
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * <p>The version of the database engine.</p>
             * 
             * <strong>example:</strong>
             * <p>5.7</p>
             */
            public Builder engineVersion(String engineVersion) {
                this.engineVersion = engineVersion;
                return this;
            }

            /**
             * <p>The time when the instance expired. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-11-28T11:26:02Z</p>
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * <p>The ID of the disaster recovery instance. This parameter is returned only when the instance is a primary instance and has a disaster recovery instance.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-uf64zsuxxxxxxxxxx</p>
             */
            public Builder guardDBInstanceId(String guardDBInstanceId) {
                this.guardDBInstanceId = guardDBInstanceId;
                return this;
            }

            /**
             * <p>The ID of the instance role.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder insId(Integer insId) {
                this.insId = insId;
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
             * <p>The lock method of the instance. Valid values:</p>
             * <ul>
             * <li><strong>Unlock</strong>: The instance is not locked.</li>
             * <li><strong>ManualLock</strong>: The instance is manually locked.</li>
             * <li><strong>LockByExpiration</strong>: The instance is automatically locked after it expires.</li>
             * <li><strong>LockByRestoration</strong>: The instance is automatically locked before a rollback.</li>
             * <li><strong>LockByDiskQuota</strong>: The instance is automatically locked because its storage capacity is exhausted and the instance is inaccessible.</li>
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
             * <p>The ID of the primary instance. If the value of this parameter is null, the instance is a primary instance.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-uf6wjk5xxxxxxxxxx</p>
             */
            public Builder masterInstanceId(String masterInstanceId) {
                this.masterInstanceId = masterInstanceId;
                return this;
            }

            /**
             * <p>Indicates whether multi-region deployment is used. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: Multi-region deployment is used.</li>
             * <li><strong>false</strong>: Multi-region deployment is not used.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
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
             * <p>An array consisting of the IDs of the read-only instances that are attached to the primary instance.</p>
             */
            public Builder readOnlyDBInstanceIds(ReadOnlyDBInstanceIds readOnlyDBInstanceIds) {
                this.readOnlyDBInstanceIds = readOnlyDBInstanceIds;
                return this;
            }

            /**
             * <p>The region ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>None.</p>
             * 
             * <strong>example:</strong>
             * <p>N/A</p>
             */
            public Builder replicateId(String replicateId) {
                this.replicateId = replicateId;
                return this;
            }

            /**
             * <p>The ID of the resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-acfmyxxxxx</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The ID of the temporary instance.</p>
             * 
             * <strong>example:</strong>
             * <p>sub138xxxxx_rm-xxxxx</p>
             */
            public Builder tempDBInstanceId(String tempDBInstanceId) {
                this.tempDBInstanceId = tempDBInstanceId;
                return this;
            }

            /**
             * <p>The ID of the vSwitch.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-uf6adz52c2pxxxxxxxxxx</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>The ID of the instance in the VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-uf6wjk5xxxxxxxxxx</p>
             */
            public Builder vpcCloudInstanceId(String vpcCloudInstanceId) {
                this.vpcCloudInstanceId = vpcCloudInstanceId;
                return this;
            }

            /**
             * <p>The ID of the virtual private cloud (VPC).</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-bp1opxu1zkhxxxxxxxxxx</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>The zone ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-h</p>
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
     * {@link DescribeDBInstancesForCloneResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstancesForCloneResponseBody</p>
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
