// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBClusterAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBClusterAttributeResponseBody</p>
 */
public class DescribeDBClusterAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private Items items;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDBClusterAttributeResponseBody(Builder builder) {
        this.items = builder.items;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBClusterAttributeResponseBody create() {
        return builder().build();
    }

    /**
     * @return items
     */
    public Items getItems() {
        return this.items;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Items items; 
        private String requestId; 

        /**
         * The queried information about the AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDBClusterAttributeResponseBody build() {
            return new DescribeDBClusterAttributeResponseBody(this);
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
             * The tag key.
             * <p>
             * 
             * >  You can call the [TagResources](~~179253~~) operation to add tags to a cluster.
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
        @com.aliyun.core.annotation.NameInMap("ClickhouseEngineCacheSize")
        private Integer clickhouseEngineCacheSize;

        @com.aliyun.core.annotation.NameInMap("ClickhouseEngineEnabled")
        private Boolean clickhouseEngineEnabled;

        @com.aliyun.core.annotation.NameInMap("CommodityCode")
        private String commodityCode;

        @com.aliyun.core.annotation.NameInMap("ComputeResource")
        private String computeResource;

        @com.aliyun.core.annotation.NameInMap("ComputeResourceTotal")
        private String computeResourceTotal;

        @com.aliyun.core.annotation.NameInMap("ConnectionString")
        private String connectionString;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("DBClusterDescription")
        private String DBClusterDescription;

        @com.aliyun.core.annotation.NameInMap("DBClusterId")
        private String DBClusterId;

        @com.aliyun.core.annotation.NameInMap("DBClusterNetworkType")
        private String DBClusterNetworkType;

        @com.aliyun.core.annotation.NameInMap("DBClusterStatus")
        private String DBClusterStatus;

        @com.aliyun.core.annotation.NameInMap("DBClusterType")
        private String DBClusterType;

        @com.aliyun.core.annotation.NameInMap("DBVersion")
        private String DBVersion;

        @com.aliyun.core.annotation.NameInMap("Engine")
        private String engine;

        @com.aliyun.core.annotation.NameInMap("EngineVersion")
        private String engineVersion;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private String expireTime;

        @com.aliyun.core.annotation.NameInMap("Expired")
        private String expired;

        @com.aliyun.core.annotation.NameInMap("KmsId")
        private String kmsId;

        @com.aliyun.core.annotation.NameInMap("LockMode")
        private String lockMode;

        @com.aliyun.core.annotation.NameInMap("LockReason")
        private String lockReason;

        @com.aliyun.core.annotation.NameInMap("MaintainTime")
        private String maintainTime;

        @com.aliyun.core.annotation.NameInMap("Mode")
        private String mode;

        @com.aliyun.core.annotation.NameInMap("PayType")
        private String payType;

        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("ProductForm")
        private String productForm;

        @com.aliyun.core.annotation.NameInMap("ProductVersion")
        private String productVersion;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ReservedACU")
        private String reservedACU;

        @com.aliyun.core.annotation.NameInMap("ReservedNodeCount")
        private Integer reservedNodeCount;

        @com.aliyun.core.annotation.NameInMap("ReservedNodeSize")
        private String reservedNodeSize;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("StorageResource")
        private String storageResource;

        @com.aliyun.core.annotation.NameInMap("StorageResourceTotal")
        private String storageResourceTotal;

        @com.aliyun.core.annotation.NameInMap("SupportedFeatures")
        private java.util.Map < String, String > supportedFeatures;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private Tags tags;

        @com.aliyun.core.annotation.NameInMap("UserENIStatus")
        private Boolean userENIStatus;

        @com.aliyun.core.annotation.NameInMap("VPCId")
        private String VPCId;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private DBCluster(Builder builder) {
            this.clickhouseEngineCacheSize = builder.clickhouseEngineCacheSize;
            this.clickhouseEngineEnabled = builder.clickhouseEngineEnabled;
            this.commodityCode = builder.commodityCode;
            this.computeResource = builder.computeResource;
            this.computeResourceTotal = builder.computeResourceTotal;
            this.connectionString = builder.connectionString;
            this.creationTime = builder.creationTime;
            this.DBClusterDescription = builder.DBClusterDescription;
            this.DBClusterId = builder.DBClusterId;
            this.DBClusterNetworkType = builder.DBClusterNetworkType;
            this.DBClusterStatus = builder.DBClusterStatus;
            this.DBClusterType = builder.DBClusterType;
            this.DBVersion = builder.DBVersion;
            this.engine = builder.engine;
            this.engineVersion = builder.engineVersion;
            this.expireTime = builder.expireTime;
            this.expired = builder.expired;
            this.kmsId = builder.kmsId;
            this.lockMode = builder.lockMode;
            this.lockReason = builder.lockReason;
            this.maintainTime = builder.maintainTime;
            this.mode = builder.mode;
            this.payType = builder.payType;
            this.port = builder.port;
            this.productForm = builder.productForm;
            this.productVersion = builder.productVersion;
            this.regionId = builder.regionId;
            this.reservedACU = builder.reservedACU;
            this.reservedNodeCount = builder.reservedNodeCount;
            this.reservedNodeSize = builder.reservedNodeSize;
            this.resourceGroupId = builder.resourceGroupId;
            this.storageResource = builder.storageResource;
            this.storageResourceTotal = builder.storageResourceTotal;
            this.supportedFeatures = builder.supportedFeatures;
            this.tags = builder.tags;
            this.userENIStatus = builder.userENIStatus;
            this.VPCId = builder.VPCId;
            this.vSwitchId = builder.vSwitchId;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBCluster create() {
            return builder().build();
        }

        /**
         * @return clickhouseEngineCacheSize
         */
        public Integer getClickhouseEngineCacheSize() {
            return this.clickhouseEngineCacheSize;
        }

        /**
         * @return clickhouseEngineEnabled
         */
        public Boolean getClickhouseEngineEnabled() {
            return this.clickhouseEngineEnabled;
        }

        /**
         * @return commodityCode
         */
        public String getCommodityCode() {
            return this.commodityCode;
        }

        /**
         * @return computeResource
         */
        public String getComputeResource() {
            return this.computeResource;
        }

        /**
         * @return computeResourceTotal
         */
        public String getComputeResourceTotal() {
            return this.computeResourceTotal;
        }

        /**
         * @return connectionString
         */
        public String getConnectionString() {
            return this.connectionString;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
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
         * @return DBClusterType
         */
        public String getDBClusterType() {
            return this.DBClusterType;
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
         * @return expired
         */
        public String getExpired() {
            return this.expired;
        }

        /**
         * @return kmsId
         */
        public String getKmsId() {
            return this.kmsId;
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
         * @return maintainTime
         */
        public String getMaintainTime() {
            return this.maintainTime;
        }

        /**
         * @return mode
         */
        public String getMode() {
            return this.mode;
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
         * @return productForm
         */
        public String getProductForm() {
            return this.productForm;
        }

        /**
         * @return productVersion
         */
        public String getProductVersion() {
            return this.productVersion;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return reservedACU
         */
        public String getReservedACU() {
            return this.reservedACU;
        }

        /**
         * @return reservedNodeCount
         */
        public Integer getReservedNodeCount() {
            return this.reservedNodeCount;
        }

        /**
         * @return reservedNodeSize
         */
        public String getReservedNodeSize() {
            return this.reservedNodeSize;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return storageResource
         */
        public String getStorageResource() {
            return this.storageResource;
        }

        /**
         * @return storageResourceTotal
         */
        public String getStorageResourceTotal() {
            return this.storageResourceTotal;
        }

        /**
         * @return supportedFeatures
         */
        public java.util.Map < String, String > getSupportedFeatures() {
            return this.supportedFeatures;
        }

        /**
         * @return tags
         */
        public Tags getTags() {
            return this.tags;
        }

        /**
         * @return userENIStatus
         */
        public Boolean getUserENIStatus() {
            return this.userENIStatus;
        }

        /**
         * @return VPCId
         */
        public String getVPCId() {
            return this.VPCId;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private Integer clickhouseEngineCacheSize; 
            private Boolean clickhouseEngineEnabled; 
            private String commodityCode; 
            private String computeResource; 
            private String computeResourceTotal; 
            private String connectionString; 
            private String creationTime; 
            private String DBClusterDescription; 
            private String DBClusterId; 
            private String DBClusterNetworkType; 
            private String DBClusterStatus; 
            private String DBClusterType; 
            private String DBVersion; 
            private String engine; 
            private String engineVersion; 
            private String expireTime; 
            private String expired; 
            private String kmsId; 
            private String lockMode; 
            private String lockReason; 
            private String maintainTime; 
            private String mode; 
            private String payType; 
            private Integer port; 
            private String productForm; 
            private String productVersion; 
            private String regionId; 
            private String reservedACU; 
            private Integer reservedNodeCount; 
            private String reservedNodeSize; 
            private String resourceGroupId; 
            private String storageResource; 
            private String storageResourceTotal; 
            private java.util.Map < String, String > supportedFeatures; 
            private Tags tags; 
            private Boolean userENIStatus; 
            private String VPCId; 
            private String vSwitchId; 
            private String zoneId; 

            /**
             * The cache size of the ClickHouse wide table engine. Unit: GB. If a value of -1 is returned, the ClickHouse wide table engine is disabled. If a value other than -1 is returned, this parameter indicates the disk cache size.
             */
            public Builder clickhouseEngineCacheSize(Integer clickhouseEngineCacheSize) {
                this.clickhouseEngineCacheSize = clickhouseEngineCacheSize;
                return this;
            }

            /**
             * Indicates whether the ClickHouse wide table engine is enabled. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder clickhouseEngineEnabled(Boolean clickhouseEngineEnabled) {
                this.clickhouseEngineEnabled = clickhouseEngineEnabled;
                return this;
            }

            /**
             * The billing method of the cluster. Valid values:
             * <p>
             * 
             * *   **ads**: pay-as-you-go.
             * *   **ads_pre**: subscription.
             */
            public Builder commodityCode(String commodityCode) {
                this.commodityCode = commodityCode;
                return this;
            }

            /**
             * The specifications of reserved computing resources. Each ACU is approximately equal to 1 core and 4 GB memory. Computing resources are used to compute data. The increase in the computing resources can accelerate queries. You can scale computing resources based on your business requirements.
             */
            public Builder computeResource(String computeResource) {
                this.computeResource = computeResource;
                return this;
            }

            /**
             * The total amount of computing resources in the cluster. Each ACU is approximately equal to 1 core and 4 GB memory.
             */
            public Builder computeResourceTotal(String computeResourceTotal) {
                this.computeResourceTotal = computeResourceTotal;
                return this;
            }

            /**
             * The public endpoint that is used to connect to the cluster.
             */
            public Builder connectionString(String connectionString) {
                this.connectionString = connectionString;
                return this;
            }

            /**
             * The time when the cluster was created. The time follows the ISO 8601 standard in the `YYYY-MM-DDThh:mm:ssZ` format. The time is displayed in UTC.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
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
             * The ID of the AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.
             */
            public Builder DBClusterId(String DBClusterId) {
                this.DBClusterId = DBClusterId;
                return this;
            }

            /**
             * The network type of the cluster. **VPC** is returned.
             */
            public Builder DBClusterNetworkType(String DBClusterNetworkType) {
                this.DBClusterNetworkType = DBClusterNetworkType;
                return this;
            }

            /**
             * The status of the cluster. Valid values:
             * <p>
             * 
             * *   **Preparing**
             * *   **Creating**
             * *   **Running**
             * *   **Deleting**
             * *   **Restoring**
             * *   **ClassChanging**
             * *   **NetAddressCreating**
             * *   **NetAddressDeleting**
             * *   **NetAddressModifying**
             */
            public Builder DBClusterStatus(String DBClusterStatus) {
                this.DBClusterStatus = DBClusterStatus;
                return this;
            }

            /**
             * The type of the cluster. By default, **Common** is returned, which indicates a common cluster.
             */
            public Builder DBClusterType(String DBClusterType) {
                this.DBClusterType = DBClusterType;
                return this;
            }

            /**
             * The engine version of the AnalyticDB for MySQL Data Lakehouse Edition cluster. **5.0** is returned.
             */
            public Builder DBVersion(String DBVersion) {
                this.DBVersion = DBVersion;
                return this;
            }

            /**
             * The engine of the cluster. **AnalyticDB** is returned.
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * The minor version of the cluster.
             */
            public Builder engineVersion(String engineVersion) {
                this.engineVersion = engineVersion;
                return this;
            }

            /**
             * The time when the cluster expires.
             * <p>
             * 
             * *   If the billing method of the cluster is subscription, the actual expiration time is returned.
             * *   If the billing method of the cluster is pay-as-you-go, null is returned.
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * Indicates whether the subscription cluster has expired. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             * 
             * > 
             * 
             * *   If the cluster has expired, the system locks or releases the cluster within a period of time. We recommend that you renew the expired cluster. For more information, see [Renewal policy](~~135248~~).
             * 
             * *   This parameter is not returned for pay-as-you-go clusters.
             */
            public Builder expired(String expired) {
                this.expired = expired;
                return this;
            }

            /**
             * The ID of the key that is used to encrypt disk data.
             * <p>
             * 
             * >  This parameter is returned only when disk encryption is enabled.
             */
            public Builder kmsId(String kmsId) {
                this.kmsId = kmsId;
                return this;
            }

            /**
             * The lock mode of the cluster. Valid values:
             * <p>
             * 
             * *   **Unlock**: The cluster is not locked.
             * *   **ManualLock**: The cluster is manually locked.
             * *   **LockByExpiration**: The cluster is automatically locked due to cluster expiration.
             */
            public Builder lockMode(String lockMode) {
                this.lockMode = lockMode;
                return this;
            }

            /**
             * The reason why the cluster is locked.
             * <p>
             * 
             * >  This parameter is returned only when the cluster was locked. **instance_expire** is returned.
             */
            public Builder lockReason(String lockReason) {
                this.lockReason = lockReason;
                return this;
            }

            /**
             * The maintenance window of the cluster. The time is displayed in the `HH:mmZ-HH:mmZ` format in UTC.
             * <p>
             * 
             * >  For more information about maintenance windows, see [Configure a maintenance window](~~122569~~).
             */
            public Builder maintainTime(String maintainTime) {
                this.maintainTime = maintainTime;
                return this;
            }

            /**
             * The mode of the cluster. By default, **flexible** is returned, which indicates that the cluster is in elastic mode.
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * The billing method of the cluster. Valid values:
             * <p>
             * 
             * *   **Postpaid**: pay-as-you-go.
             * *   **Prepaid**: subscription.
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            /**
             * The port number that is used to connect to the cluster.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * A reserved parameter.
             */
            public Builder productForm(String productForm) {
                this.productForm = productForm;
                return this;
            }

            /**
             * The edition of the cluster. Valid values:
             * <p>
             * 
             * *   **BasicVersion**: Basic Edition.
             * *   **EnterpriseVersion**: Enterprise Edition.
             */
            public Builder productVersion(String productVersion) {
                this.productVersion = productVersion;
                return this;
            }

            /**
             * The region ID of the cluster.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The amount of remaining reserved computing resources that are available in the cluster. Each ACU is approximately equal to 1 core and 4 GB memory.
             */
            public Builder reservedACU(String reservedACU) {
                this.reservedACU = reservedACU;
                return this;
            }

            /**
             * A reserved parameter.
             */
            public Builder reservedNodeCount(Integer reservedNodeCount) {
                this.reservedNodeCount = reservedNodeCount;
                return this;
            }

            /**
             * A reserved parameter.
             */
            public Builder reservedNodeSize(String reservedNodeSize) {
                this.reservedNodeSize = reservedNodeSize;
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
             * The specifications of reserved storage resources. Each AnalyticDB compute unit (ACU) is approximately equal to 1 core and 4 GB memory. Storage resources are used to read and write data. The increase in the storage resources can improve the read and write performance of the cluster.
             */
            public Builder storageResource(String storageResource) {
                this.storageResource = storageResource;
                return this;
            }

            /**
             * The total amount of storage resources in the cluster. Each ACU is approximately equal to 1 core and 4 GB memory.
             */
            public Builder storageResourceTotal(String storageResourceTotal) {
                this.storageResourceTotal = storageResourceTotal;
                return this;
            }

            /**
             * Reserved parameters.
             */
            public Builder supportedFeatures(java.util.Map < String, String > supportedFeatures) {
                this.supportedFeatures = supportedFeatures;
                return this;
            }

            /**
             * The tags that are added to the cluster.
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * Indicates whether Elastic Network Interface (ENI) is enabled. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder userENIStatus(Boolean userENIStatus) {
                this.userENIStatus = userENIStatus;
                return this;
            }

            /**
             * The virtual private cloud (VPC) ID of the cluster.
             */
            public Builder VPCId(String VPCId) {
                this.VPCId = VPCId;
                return this;
            }

            /**
             * The vSwitch ID of the cluster.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * The zone ID of the cluster.
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
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBCluster")
        private java.util.List < DBCluster> DBCluster;

        private Items(Builder builder) {
            this.DBCluster = builder.DBCluster;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
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

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
