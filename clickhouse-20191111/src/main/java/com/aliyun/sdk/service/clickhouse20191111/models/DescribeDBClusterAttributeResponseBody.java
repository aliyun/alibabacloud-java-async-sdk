// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBClusterAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBClusterAttributeResponseBody</p>
 */
public class DescribeDBClusterAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBCluster")
    private DBCluster DBCluster;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDBClusterAttributeResponseBody(Builder builder) {
        this.DBCluster = builder.DBCluster;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBClusterAttributeResponseBody create() {
        return builder().build();
    }

    /**
     * @return DBCluster
     */
    public DBCluster getDBCluster() {
        return this.DBCluster;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DBCluster DBCluster; 
        private String requestId; 

        /**
         * The information about the cluster.
         */
        public Builder DBCluster(DBCluster DBCluster) {
            this.DBCluster = DBCluster;
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

        @com.aliyun.core.annotation.NameInMap("AppointmentRestartTime")
        private String appointmentRestartTime;

        @com.aliyun.core.annotation.NameInMap("AvailableUpgradeMajorVersion")
        private java.util.Map < String, ? > availableUpgradeMajorVersion;

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

        @com.aliyun.core.annotation.NameInMap("DBClusterType")
        private String DBClusterType;

        @com.aliyun.core.annotation.NameInMap("DBNodeClass")
        private String DBNodeClass;

        @com.aliyun.core.annotation.NameInMap("DBNodeCount")
        private Long DBNodeCount;

        @com.aliyun.core.annotation.NameInMap("DBNodeStorage")
        private Long DBNodeStorage;

        @com.aliyun.core.annotation.NameInMap("EncryptionKey")
        private String encryptionKey;

        @com.aliyun.core.annotation.NameInMap("EncryptionType")
        private String encryptionType;

        @com.aliyun.core.annotation.NameInMap("Engine")
        private String engine;

        @com.aliyun.core.annotation.NameInMap("EngineLatestMinorVersion")
        private String engineLatestMinorVersion;

        @com.aliyun.core.annotation.NameInMap("EngineMinorVersion")
        private String engineMinorVersion;

        @com.aliyun.core.annotation.NameInMap("EngineVersion")
        private String engineVersion;

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

        @com.aliyun.core.annotation.NameInMap("MaintainAutoType")
        private Boolean maintainAutoType;

        @com.aliyun.core.annotation.NameInMap("MaintainTime")
        private String maintainTime;

        @com.aliyun.core.annotation.NameInMap("PayType")
        private String payType;

        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("PublicConnectionString")
        private String publicConnectionString;

        @com.aliyun.core.annotation.NameInMap("PublicIpAddr")
        private String publicIpAddr;

        @com.aliyun.core.annotation.NameInMap("PublicPort")
        private String publicPort;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("ScaleOutStatus")
        private ScaleOutStatus scaleOutStatus;

        @com.aliyun.core.annotation.NameInMap("StorageType")
        private String storageType;

        @com.aliyun.core.annotation.NameInMap("SupportBackup")
        private Integer supportBackup;

        @com.aliyun.core.annotation.NameInMap("SupportHttpsPort")
        private Boolean supportHttpsPort;

        @com.aliyun.core.annotation.NameInMap("SupportMysqlPort")
        private Boolean supportMysqlPort;

        @com.aliyun.core.annotation.NameInMap("SupportOss")
        private Integer supportOss;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private Tags tags;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("VpcCloudInstanceId")
        private String vpcCloudInstanceId;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("VpcIpAddr")
        private String vpcIpAddr;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        @com.aliyun.core.annotation.NameInMap("ZoneIdVswitchMap")
        private java.util.Map < String, ? > zoneIdVswitchMap;

        @com.aliyun.core.annotation.NameInMap("ZookeeperClass")
        private String zookeeperClass;

        private DBCluster(Builder builder) {
            this.aliUid = builder.aliUid;
            this.appointmentRestartTime = builder.appointmentRestartTime;
            this.availableUpgradeMajorVersion = builder.availableUpgradeMajorVersion;
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
            this.DBClusterType = builder.DBClusterType;
            this.DBNodeClass = builder.DBNodeClass;
            this.DBNodeCount = builder.DBNodeCount;
            this.DBNodeStorage = builder.DBNodeStorage;
            this.encryptionKey = builder.encryptionKey;
            this.encryptionType = builder.encryptionType;
            this.engine = builder.engine;
            this.engineLatestMinorVersion = builder.engineLatestMinorVersion;
            this.engineMinorVersion = builder.engineMinorVersion;
            this.engineVersion = builder.engineVersion;
            this.expireTime = builder.expireTime;
            this.extStorageSize = builder.extStorageSize;
            this.extStorageType = builder.extStorageType;
            this.isExpired = builder.isExpired;
            this.lockMode = builder.lockMode;
            this.lockReason = builder.lockReason;
            this.maintainAutoType = builder.maintainAutoType;
            this.maintainTime = builder.maintainTime;
            this.payType = builder.payType;
            this.port = builder.port;
            this.publicConnectionString = builder.publicConnectionString;
            this.publicIpAddr = builder.publicIpAddr;
            this.publicPort = builder.publicPort;
            this.regionId = builder.regionId;
            this.resourceGroupId = builder.resourceGroupId;
            this.scaleOutStatus = builder.scaleOutStatus;
            this.storageType = builder.storageType;
            this.supportBackup = builder.supportBackup;
            this.supportHttpsPort = builder.supportHttpsPort;
            this.supportMysqlPort = builder.supportMysqlPort;
            this.supportOss = builder.supportOss;
            this.tags = builder.tags;
            this.vSwitchId = builder.vSwitchId;
            this.vpcCloudInstanceId = builder.vpcCloudInstanceId;
            this.vpcId = builder.vpcId;
            this.vpcIpAddr = builder.vpcIpAddr;
            this.zoneId = builder.zoneId;
            this.zoneIdVswitchMap = builder.zoneIdVswitchMap;
            this.zookeeperClass = builder.zookeeperClass;
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
         * @return appointmentRestartTime
         */
        public String getAppointmentRestartTime() {
            return this.appointmentRestartTime;
        }

        /**
         * @return availableUpgradeMajorVersion
         */
        public java.util.Map < String, ? > getAvailableUpgradeMajorVersion() {
            return this.availableUpgradeMajorVersion;
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
         * @return DBClusterType
         */
        public String getDBClusterType() {
            return this.DBClusterType;
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
         * @return encryptionKey
         */
        public String getEncryptionKey() {
            return this.encryptionKey;
        }

        /**
         * @return encryptionType
         */
        public String getEncryptionType() {
            return this.encryptionType;
        }

        /**
         * @return engine
         */
        public String getEngine() {
            return this.engine;
        }

        /**
         * @return engineLatestMinorVersion
         */
        public String getEngineLatestMinorVersion() {
            return this.engineLatestMinorVersion;
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
         * @return maintainAutoType
         */
        public Boolean getMaintainAutoType() {
            return this.maintainAutoType;
        }

        /**
         * @return maintainTime
         */
        public String getMaintainTime() {
            return this.maintainTime;
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
         * @return publicConnectionString
         */
        public String getPublicConnectionString() {
            return this.publicConnectionString;
        }

        /**
         * @return publicIpAddr
         */
        public String getPublicIpAddr() {
            return this.publicIpAddr;
        }

        /**
         * @return publicPort
         */
        public String getPublicPort() {
            return this.publicPort;
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
         * @return supportBackup
         */
        public Integer getSupportBackup() {
            return this.supportBackup;
        }

        /**
         * @return supportHttpsPort
         */
        public Boolean getSupportHttpsPort() {
            return this.supportHttpsPort;
        }

        /**
         * @return supportMysqlPort
         */
        public Boolean getSupportMysqlPort() {
            return this.supportMysqlPort;
        }

        /**
         * @return supportOss
         */
        public Integer getSupportOss() {
            return this.supportOss;
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
         * @return vpcIpAddr
         */
        public String getVpcIpAddr() {
            return this.vpcIpAddr;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        /**
         * @return zoneIdVswitchMap
         */
        public java.util.Map < String, ? > getZoneIdVswitchMap() {
            return this.zoneIdVswitchMap;
        }

        /**
         * @return zookeeperClass
         */
        public String getZookeeperClass() {
            return this.zookeeperClass;
        }

        public static final class Builder {
            private String aliUid; 
            private String appointmentRestartTime; 
            private java.util.Map < String, ? > availableUpgradeMajorVersion; 
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
            private String DBClusterType; 
            private String DBNodeClass; 
            private Long DBNodeCount; 
            private Long DBNodeStorage; 
            private String encryptionKey; 
            private String encryptionType; 
            private String engine; 
            private String engineLatestMinorVersion; 
            private String engineMinorVersion; 
            private String engineVersion; 
            private String expireTime; 
            private Integer extStorageSize; 
            private String extStorageType; 
            private String isExpired; 
            private String lockMode; 
            private String lockReason; 
            private Boolean maintainAutoType; 
            private String maintainTime; 
            private String payType; 
            private Integer port; 
            private String publicConnectionString; 
            private String publicIpAddr; 
            private String publicPort; 
            private String regionId; 
            private String resourceGroupId; 
            private ScaleOutStatus scaleOutStatus; 
            private String storageType; 
            private Integer supportBackup; 
            private Boolean supportHttpsPort; 
            private Boolean supportMysqlPort; 
            private Integer supportOss; 
            private Tags tags; 
            private String vSwitchId; 
            private String vpcCloudInstanceId; 
            private String vpcId; 
            private String vpcIpAddr; 
            private String zoneId; 
            private java.util.Map < String, ? > zoneIdVswitchMap; 
            private String zookeeperClass; 

            /**
             * The ID of the Alibaba Cloud account.
             */
            public Builder aliUid(String aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * The scheduled restart time. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time is displayed in Coordinated Universal Time (UTC).
             */
            public Builder appointmentRestartTime(String appointmentRestartTime) {
                this.appointmentRestartTime = appointmentRestartTime;
                return this;
            }

            /**
             * AvailableUpgradeMajorVersion.
             */
            public Builder availableUpgradeMajorVersion(java.util.Map < String, ? > availableUpgradeMajorVersion) {
                this.availableUpgradeMajorVersion = availableUpgradeMajorVersion;
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
             * The version of the ApsaraDB for ClickHouse console that is used to manage the cluster. Valid values:
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
             * The time when the cluster was created. The value is in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
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
             * The cluster state. Valid values:
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
             * The type of the cluster. Valid values:
             * <p>
             * 
             * *   **Common**: a common cluster
             * *   **Readonly**: a read-only cluster
             * *   **Guard**: a disaster recovery cluster
             */
            public Builder DBClusterType(String DBClusterType) {
                this.DBClusterType = DBClusterType;
                return this;
            }

            /**
             * The specifications of the cluster.
             * <p>
             * 
             * *   Valid values when the cluster is of Single-replica Edition:
             * 
             *     *   **S4-NEW**
             *     *   **S8**
             *     *   **S16**
             *     *   **S32**
             *     *   **S64**
             *     *   **S104**
             * 
             * *   Valid values when the cluster is of Double-replica Edition:
             * 
             *     *   **C4-NEW**
             *     *   **C8**
             *     *   **C16**
             *     *   **C32**
             *     *   **C64**
             *     *   **C104**
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
             * The storage capacity of a single node of the cluster. Unit: GB.
             * <p>
             * 
             * Valid values: 100 to 32000.
             * 
             * >  This value is a multiple of 100.
             */
            public Builder DBNodeStorage(Long DBNodeStorage) {
                this.DBNodeStorage = DBNodeStorage;
                return this;
            }

            /**
             * The Key Management Service (KMS) key that is used to encrypt data.
             * <p>
             * 
             * >  If the value of the EncryptionType parameter is off, an empty string is returned for this parameter.
             */
            public Builder encryptionKey(String encryptionKey) {
                this.encryptionKey = encryptionKey;
                return this;
            }

            /**
             * The encryption type. Valid values:
             * <p>
             * 
             * *   **CloudDisk**: Disk encryption is enabled.
             * *   **off**: Data is not encrypted.
             */
            public Builder encryptionType(String encryptionType) {
                this.encryptionType = encryptionType;
                return this;
            }

            /**
             * The type of the database engine.
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * The latest minor version to which the cluster can be updated.
             */
            public Builder engineLatestMinorVersion(String engineLatestMinorVersion) {
                this.engineLatestMinorVersion = engineLatestMinorVersion;
                return this;
            }

            /**
             * The current minor version.
             */
            public Builder engineMinorVersion(String engineMinorVersion) {
                this.engineMinorVersion = engineMinorVersion;
                return this;
            }

            /**
             * The engine version.
             */
            public Builder engineVersion(String engineVersion) {
                this.engineVersion = engineVersion;
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
             * The extended storage space. Unit: GB.
             */
            public Builder extStorageSize(Integer extStorageSize) {
                this.extStorageSize = extStorageSize;
                return this;
            }

            /**
             * The extended storage type. Valid values:
             * <p>
             * 
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
             * *   **true**
             * *   **false**
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
             * The update type. If the value of the parameter is **false**, it indicates a manual update.
             */
            public Builder maintainAutoType(Boolean maintainAutoType) {
                this.maintainAutoType = maintainAutoType;
                return this;
            }

            /**
             * The maintenance window of the cluster. The value is in the HH:mmZ-HH:mmZ format. The time is displayed in UTC.
             * <p>
             * 
             * For example, if you set the maintenance window to 00:00Z-01:00Z, the cluster can be maintained from 08:00 (UTC+8) to 09:00 (UTC+8).
             */
            public Builder maintainTime(String maintainTime) {
                this.maintainTime = maintainTime;
                return this;
            }

            /**
             * The billing method of the cluster. Valid values:
             * <p>
             * 
             * *   **Postpaid**: indicates the pay-as-you-go billing method.
             * *   **Prepaid**: indicates the subscription billing method.
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
             * The public endpoint.
             */
            public Builder publicConnectionString(String publicConnectionString) {
                this.publicConnectionString = publicConnectionString;
                return this;
            }

            /**
             * The IP address that is used to connect to the cluster over the Internet.
             */
            public Builder publicIpAddr(String publicIpAddr) {
                this.publicIpAddr = publicIpAddr;
                return this;
            }

            /**
             * The TCP port number in the public endpoint.
             */
            public Builder publicPort(String publicPort) {
                this.publicPort = publicPort;
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
             * The status of the data migration task.
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
             * Indicates whether data backup is supported. Valid values:
             * <p>
             * 
             * *   **1**: Data backup is supported.
             * *   **2**: Data backup is not supported.
             */
            public Builder supportBackup(Integer supportBackup) {
                this.supportBackup = supportBackup;
                return this;
            }

            /**
             * Indicates whether HTTPS ports are supported. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder supportHttpsPort(Boolean supportHttpsPort) {
                this.supportHttpsPort = supportHttpsPort;
                return this;
            }

            /**
             * Indicates whether the cluster supports a MySQL port. Valid values:
             * <p>
             * 
             * *   **true**: A MySQL port is supported.
             * *   **false**: A MySQL port is not supported.
             */
            public Builder supportMysqlPort(Boolean supportMysqlPort) {
                this.supportMysqlPort = supportMysqlPort;
                return this;
            }

            /**
             * Indicates whether tiered storage of hot data and cold data is supported. Valid values:
             * <p>
             * 
             * *   **1**: Tiered storage of hot data and cold data is supported.
             * *   **2**: Tiered storage of hot data and cold data is not supported.
             */
            public Builder supportOss(Integer supportOss) {
                this.supportOss = supportOss;
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
             * The virtual private cloud (VPC) ID.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * The IP address that is used to connect to the cluster over the VPC.
             */
            public Builder vpcIpAddr(String vpcIpAddr) {
                this.vpcIpAddr = vpcIpAddr;
                return this;
            }

            /**
             * The zone ID.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            /**
             * The list of vSwitch IDs in multi-zone clusters.
             */
            public Builder zoneIdVswitchMap(java.util.Map < String, ? > zoneIdVswitchMap) {
                this.zoneIdVswitchMap = zoneIdVswitchMap;
                return this;
            }

            /**
             * The ZooKeeper specifications.
             */
            public Builder zookeeperClass(String zookeeperClass) {
                this.zookeeperClass = zookeeperClass;
                return this;
            }

            public DBCluster build() {
                return new DBCluster(this);
            } 

        } 

    }
}
