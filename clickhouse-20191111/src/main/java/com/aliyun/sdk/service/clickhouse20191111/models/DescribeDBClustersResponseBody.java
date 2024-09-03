// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBClustersResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBClustersResponseBody</p>
 */
public class DescribeDBClustersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBClusters")
    private DBClusters DBClusters;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeDBClustersResponseBody(Builder builder) {
        this.DBClusters = builder.DBClusters;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBClustersResponseBody create() {
        return builder().build();
    }

    /**
     * @return DBClusters
     */
    public DBClusters getDBClusters() {
        return this.DBClusters;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private DBClusters DBClusters; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The details of the clusters.
         */
        public Builder DBClusters(DBClusters DBClusters) {
            this.DBClusters = DBClusters;
            return this;
        }

        /**
         * The total number of returned pages.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned per page. Valid values:
         * <p>
         * 
         * *   **30** (default)
         * *   **50**
         * *   **100**
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of entries that are returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDBClustersResponseBody build() {
            return new DescribeDBClustersResponseBody(this);
        } 

    } 

    public static class ScaleOutStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Progress")
        private String progress;

        @com.aliyun.core.annotation.NameInMap("Ratio")
        private String ratio;

        private ScaleOutStatus(Builder builder) {
            this.progress = builder.progress;
            this.ratio = builder.ratio;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScaleOutStatus create() {
            return builder().build();
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        /**
         * @return ratio
         */
        public String getRatio() {
            return this.ratio;
        }

        public static final class Builder {
            private String progress; 
            private String ratio; 

            /**
             * The progress of the data migration task in percentage.
             * <p>
             * 
             * >  This parameter is returned only when the cluster is in the SCALING_OUT state.
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * The progress of the data migration task. This value is displayed in the following format: Data volume that has been migrated/Total data volume.
             * <p>
             * 
             * >  This parameter is returned only when the cluster is in the SCALING_OUT state.
             */
            public Builder ratio(String ratio) {
                this.ratio = ratio;
                return this;
            }

            public ScaleOutStatus build() {
                return new ScaleOutStatus(this);
            } 

        } 

    }
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
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
             * The tag name.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value.
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
        @com.aliyun.core.annotation.NameInMap("Tag")
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
    public static class DBCluster extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliUid")
        private String aliUid;

        @com.aliyun.core.annotation.NameInMap("Bid")
        private String bid;

        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("CommodityCode")
        private String commodityCode;

        @com.aliyun.core.annotation.NameInMap("ConnectionString")
        private String connectionString;

        @com.aliyun.core.annotation.NameInMap("ControlVersion")
        private String controlVersion;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DBClusterDescription")
        private String DBClusterDescription;

        @com.aliyun.core.annotation.NameInMap("DBClusterId")
        private String DBClusterId;

        @com.aliyun.core.annotation.NameInMap("DBClusterNetworkType")
        private String DBClusterNetworkType;

        @com.aliyun.core.annotation.NameInMap("DBClusterStatus")
        private String DBClusterStatus;

        @com.aliyun.core.annotation.NameInMap("DBNodeClass")
        private String DBNodeClass;

        @com.aliyun.core.annotation.NameInMap("DBNodeCount")
        private Long DBNodeCount;

        @com.aliyun.core.annotation.NameInMap("DBNodeStorage")
        private Long DBNodeStorage;

        @com.aliyun.core.annotation.NameInMap("DbVersion")
        private String dbVersion;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private String expireTime;

        @com.aliyun.core.annotation.NameInMap("ExtStorageSize")
        private Integer extStorageSize;

        @com.aliyun.core.annotation.NameInMap("ExtStorageType")
        private String extStorageType;

        @com.aliyun.core.annotation.NameInMap("IsExpired")
        private String isExpired;

        @com.aliyun.core.annotation.NameInMap("LockMode")
        private String lockMode;

        @com.aliyun.core.annotation.NameInMap("LockReason")
        private String lockReason;

        @com.aliyun.core.annotation.NameInMap("PayType")
        private String payType;

        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("ScaleOutDisableWriteWindows")
        private String scaleOutDisableWriteWindows;

        @com.aliyun.core.annotation.NameInMap("ScaleOutStatus")
        private ScaleOutStatus scaleOutStatus;

        @com.aliyun.core.annotation.NameInMap("StorageType")
        private String storageType;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private Tags tags;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("VpcCloudInstanceId")
        private String vpcCloudInstanceId;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private DBCluster(Builder builder) {
            this.aliUid = builder.aliUid;
            this.bid = builder.bid;
            this.category = builder.category;
            this.commodityCode = builder.commodityCode;
            this.connectionString = builder.connectionString;
            this.controlVersion = builder.controlVersion;
            this.createTime = builder.createTime;
            this.DBClusterDescription = builder.DBClusterDescription;
            this.DBClusterId = builder.DBClusterId;
            this.DBClusterNetworkType = builder.DBClusterNetworkType;
            this.DBClusterStatus = builder.DBClusterStatus;
            this.DBNodeClass = builder.DBNodeClass;
            this.DBNodeCount = builder.DBNodeCount;
            this.DBNodeStorage = builder.DBNodeStorage;
            this.dbVersion = builder.dbVersion;
            this.expireTime = builder.expireTime;
            this.extStorageSize = builder.extStorageSize;
            this.extStorageType = builder.extStorageType;
            this.isExpired = builder.isExpired;
            this.lockMode = builder.lockMode;
            this.lockReason = builder.lockReason;
            this.payType = builder.payType;
            this.port = builder.port;
            this.regionId = builder.regionId;
            this.resourceGroupId = builder.resourceGroupId;
            this.scaleOutDisableWriteWindows = builder.scaleOutDisableWriteWindows;
            this.scaleOutStatus = builder.scaleOutStatus;
            this.storageType = builder.storageType;
            this.tags = builder.tags;
            this.vSwitchId = builder.vSwitchId;
            this.vpcCloudInstanceId = builder.vpcCloudInstanceId;
            this.vpcId = builder.vpcId;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBCluster create() {
            return builder().build();
        }

        /**
         * @return aliUid
         */
        public String getAliUid() {
            return this.aliUid;
        }

        /**
         * @return bid
         */
        public String getBid() {
            return this.bid;
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return commodityCode
         */
        public String getCommodityCode() {
            return this.commodityCode;
        }

        /**
         * @return connectionString
         */
        public String getConnectionString() {
            return this.connectionString;
        }

        /**
         * @return controlVersion
         */
        public String getControlVersion() {
            return this.controlVersion;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return DBClusterDescription
         */
        public String getDBClusterDescription() {
            return this.DBClusterDescription;
        }

        /**
         * @return DBClusterId
         */
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        /**
         * @return DBClusterNetworkType
         */
        public String getDBClusterNetworkType() {
            return this.DBClusterNetworkType;
        }

        /**
         * @return DBClusterStatus
         */
        public String getDBClusterStatus() {
            return this.DBClusterStatus;
        }

        /**
         * @return DBNodeClass
         */
        public String getDBNodeClass() {
            return this.DBNodeClass;
        }

        /**
         * @return DBNodeCount
         */
        public Long getDBNodeCount() {
            return this.DBNodeCount;
        }

        /**
         * @return DBNodeStorage
         */
        public Long getDBNodeStorage() {
            return this.DBNodeStorage;
        }

        /**
         * @return dbVersion
         */
        public String getDbVersion() {
            return this.dbVersion;
        }

        /**
         * @return expireTime
         */
        public String getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return extStorageSize
         */
        public Integer getExtStorageSize() {
            return this.extStorageSize;
        }

        /**
         * @return extStorageType
         */
        public String getExtStorageType() {
            return this.extStorageType;
        }

        /**
         * @return isExpired
         */
        public String getIsExpired() {
            return this.isExpired;
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
         * @return port
         */
        public Integer getPort() {
            return this.port;
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
         * @return scaleOutDisableWriteWindows
         */
        public String getScaleOutDisableWriteWindows() {
            return this.scaleOutDisableWriteWindows;
        }

        /**
         * @return scaleOutStatus
         */
        public ScaleOutStatus getScaleOutStatus() {
            return this.scaleOutStatus;
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
            private String aliUid; 
            private String bid; 
            private String category; 
            private String commodityCode; 
            private String connectionString; 
            private String controlVersion; 
            private String createTime; 
            private String DBClusterDescription; 
            private String DBClusterId; 
            private String DBClusterNetworkType; 
            private String DBClusterStatus; 
            private String DBNodeClass; 
            private Long DBNodeCount; 
            private Long DBNodeStorage; 
            private String dbVersion; 
            private String expireTime; 
            private Integer extStorageSize; 
            private String extStorageType; 
            private String isExpired; 
            private String lockMode; 
            private String lockReason; 
            private String payType; 
            private Integer port; 
            private String regionId; 
            private String resourceGroupId; 
            private String scaleOutDisableWriteWindows; 
            private ScaleOutStatus scaleOutStatus; 
            private String storageType; 
            private Tags tags; 
            private String vSwitchId; 
            private String vpcCloudInstanceId; 
            private String vpcId; 
            private String zoneId; 

            /**
             * The ID of the Alibaba Cloud account.
             */
            public Builder aliUid(String aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * The site ID. Valid values:
             * <p>
             * 
             * *   **26842**: the China site (aliyun.com)
             * *   **26888**: the international site (alibabacloud.com)
             */
            public Builder bid(String bid) {
                this.bid = bid;
                return this;
            }

            /**
             * The edition of the cluster. Valid values:
             * <p>
             * 
             * *   **Basic**: Single-replica Edition
             * *   **HighAvailability**: Double-replica Edition
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * The commodity code of the cluster.
             */
            public Builder commodityCode(String commodityCode) {
                this.commodityCode = commodityCode;
                return this;
            }

            /**
             * The VPC endpoint of the cluster.
             */
            public Builder connectionString(String connectionString) {
                this.connectionString = connectionString;
                return this;
            }

            /**
             * The version number of the backend management system of ApsaraDB for ClickHouse. Valid values:
             * <p>
             * 
             * *   **v1**
             * *   **v2**
             */
            public Builder controlVersion(String controlVersion) {
                this.controlVersion = controlVersion;
                return this;
            }

            /**
             * The time when the cluster was created. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The description of the cluster.
             */
            public Builder DBClusterDescription(String DBClusterDescription) {
                this.DBClusterDescription = DBClusterDescription;
                return this;
            }

            /**
             * The cluster ID.
             */
            public Builder DBClusterId(String DBClusterId) {
                this.DBClusterId = DBClusterId;
                return this;
            }

            /**
             * The network type of the cluster. Only VPC is supported.
             */
            public Builder DBClusterNetworkType(String DBClusterNetworkType) {
                this.DBClusterNetworkType = DBClusterNetworkType;
                return this;
            }

            /**
             * The state of the cluster. Valid values:
             * <p>
             * 
             * *   **Preparing**: The cluster is being prepared.
             * *   **Creating**: The cluster is being created.
             * *   **Running**: The cluster is running.
             * *   **Deleting**: The cluster is being deleted.
             * *   **SCALING_OUT**: The storage capacity of the cluster is being expanded.
             */
            public Builder DBClusterStatus(String DBClusterStatus) {
                this.DBClusterStatus = DBClusterStatus;
                return this;
            }

            /**
             * The specifications of the cluster.
             * <p>
             * 
             * *   Valid values when the cluster is of Single-replica Edition: -**S4**: 4 CPU cores and 16 GB of memory -**S8**: 8 CPU cores and 32 GB of memory
             * 
             *     *   **S16**: 16 CPU cores and 64 GB of memory
             *     *   **S32**: 32 CPU cores and 128 GB of memory
             *     *   **S64**: 64 CPU cores and 256 GB of memory
             *     *   **S104**: 104 CPU cores and 384 GB of memory
             * 
             * *   Valid values when the cluster is of Double-replica Edition: -**C4**: 4 CPU cores and 16 GB of memory -**C8**: 8 CPU cores and 32 GB of memory -**C16**: 16 CPU cores and 64 GB of memory -**C32**: 32 CPU cores and 128 GB of memory -**C64**: 64 CPU cores and 256 GB of memory -**C104**: 104 CPU cores and 384 GB of memory
             */
            public Builder DBNodeClass(String DBNodeClass) {
                this.DBNodeClass = DBNodeClass;
                return this;
            }

            /**
             * The number of nodes.
             * <p>
             * 
             * *   Valid values when the cluster is of Single-replica Edition: 1 to 48.
             * *   Valid values when the cluster is of Double-replica Edition: 1 to 24.
             */
            public Builder DBNodeCount(Long DBNodeCount) {
                this.DBNodeCount = DBNodeCount;
                return this;
            }

            /**
             * The storage capacity of each node. Valid values: 100 to 32000. Unit: GB.
             * <p>
             * 
             * >  This value is a multiple of 100.
             */
            public Builder DBNodeStorage(Long DBNodeStorage) {
                this.DBNodeStorage = DBNodeStorage;
                return this;
            }

            /**
             * DbVersion.
             */
            public Builder dbVersion(String dbVersion) {
                this.dbVersion = dbVersion;
                return this;
            }

            /**
             * The time when the cluster expired. The time is in the yyyy-MM-ddTHH:mm:ssZ format.
             * <p>
             * 
             * >  Pay-as-you-go clusters never expire. If the cluster is a pay-as-you-go cluster, an empty string is returned for this parameter.
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * The extended storage space.
             */
            public Builder extStorageSize(Integer extStorageSize) {
                this.extStorageSize = extStorageSize;
                return this;
            }

            /**
             * The extended storage type. Valid values:
             * <p>
             * 
             * *   **CloudSSD**: standard SSD.
             * *   **CloudESSD**: The cluster uses an enhanced SSD (ESSD) of performance level (PL) 1.
             * *   **CloudESSD_PL2**: The cluster uses an ESSD of PL 2.
             * *   **CloudESSD_PL3**: The cluster uses an ESSD of PL 3.
             * *   **CloudEfficiency**: The cluster uses an ultra disk.
             */
            public Builder extStorageType(String extStorageType) {
                this.extStorageType = extStorageType;
                return this;
            }

            /**
             * Indicates whether the cluster has expired. Valid values:
             * <p>
             * 
             * *   **true**: The cluster has expired.
             * *   **false**: The cluster has not expired.
             */
            public Builder isExpired(String isExpired) {
                this.isExpired = isExpired;
                return this;
            }

            /**
             * The lock mode of the cluster. Valid values:
             * <p>
             * 
             * *   **Unlock**: The cluster is not locked.
             * *   **ManualLock**: The cluster is manually locked.
             * *   **LockByExpiration**: The cluster is automatically locked due to cluster expiration.
             * *   **LockByRestoration**: The cluster is automatically locked because the cluster is about to be rolled back.
             * *   **LockByDiskQuota**: The cluster is automatically locked because the disk space is exhausted.
             */
            public Builder lockMode(String lockMode) {
                this.lockMode = lockMode;
                return this;
            }

            /**
             * The cause why the cluster was locked.
             * <p>
             * 
             * >  If the value of the LockMode parameter is Unlock, an empty string is returned for this parameter.
             */
            public Builder lockReason(String lockReason) {
                this.lockReason = lockReason;
                return this;
            }

            /**
             * The billing method of the cluster. Valid values:
             * <p>
             * 
             * *   **Postpaid**: The cluster uses the pay-as-you-go billing method.
             * *   **Prepaid**: The cluster uses the subscription billing method.
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            /**
             * The HTTP port number.
             */
            public Builder port(Integer port) {
                this.port = port;
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
             * The ID of the resource group to which the cluster belongs.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * ScaleOutDisableWriteWindows.
             */
            public Builder scaleOutDisableWriteWindows(String scaleOutDisableWriteWindows) {
                this.scaleOutDisableWriteWindows = scaleOutDisableWriteWindows;
                return this;
            }

            /**
             * The status of a data migration task.
             */
            public Builder scaleOutStatus(ScaleOutStatus scaleOutStatus) {
                this.scaleOutStatus = scaleOutStatus;
                return this;
            }

            /**
             * The storage type of the cluster. Valid values:
             * <p>
             * 
             * *   **CloudESSD**: The cluster uses an enhanced SSD (ESSD) of performance level (PL) 1.
             * *   **CloudESSD_PL2**: The cluster uses an ESSD of PL 2.
             * *   **CloudESSD_PL3**: The cluster uses an ESSD of PL 3.
             * *   **CloudEfficiency**: The cluster uses an ultra disk.
             */
            public Builder storageType(String storageType) {
                this.storageType = storageType;
                return this;
            }

            /**
             * The tags.
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
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
             * The ID of the VPC in which the cluster is deployed.
             */
            public Builder vpcCloudInstanceId(String vpcCloudInstanceId) {
                this.vpcCloudInstanceId = vpcCloudInstanceId;
                return this;
            }

            /**
             * The ID of the virtual private cloud (VPC) in which the cluster is deployed.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * The zone ID.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public DBCluster build() {
                return new DBCluster(this);
            } 

        } 

    }
    public static class DBClusters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBCluster")
        private java.util.List < DBCluster> DBCluster;

        private DBClusters(Builder builder) {
            this.DBCluster = builder.DBCluster;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBClusters create() {
            return builder().build();
        }

        /**
         * @return DBCluster
         */
        public java.util.List < DBCluster> getDBCluster() {
            return this.DBCluster;
        }

        public static final class Builder {
            private java.util.List < DBCluster> DBCluster; 

            /**
             * DBCluster.
             */
            public Builder DBCluster(java.util.List < DBCluster> DBCluster) {
                this.DBCluster = DBCluster;
                return this;
            }

            public DBClusters build() {
                return new DBClusters(this);
            } 

        } 

    }
}
