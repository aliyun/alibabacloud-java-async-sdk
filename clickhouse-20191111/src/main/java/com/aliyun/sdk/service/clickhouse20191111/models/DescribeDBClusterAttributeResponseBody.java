// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBClusterAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBClusterAttributeResponseBody</p>
 */
public class DescribeDBClusterAttributeResponseBody extends TeaModel {
    @NameInMap("DBCluster")
    private DBCluster DBCluster;

    @NameInMap("RequestId")
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
         * DBCluster.
         */
        public Builder DBCluster(DBCluster DBCluster) {
            this.DBCluster = DBCluster;
            return this;
        }

        /**
         * RequestId.
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
        @NameInMap("Progress")
        private String progress;

        @NameInMap("Ratio")
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
             * Progress.
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * Ratio.
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
    public static class DBCluster extends TeaModel {
        @NameInMap("AliUid")
        private String aliUid;

        @NameInMap("AppointmentRestartTime")
        private String appointmentRestartTime;

        @NameInMap("Bid")
        private String bid;

        @NameInMap("Category")
        private String category;

        @NameInMap("CommodityCode")
        private String commodityCode;

        @NameInMap("ConnectionString")
        private String connectionString;

        @NameInMap("ControlVersion")
        private String controlVersion;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("DBClusterDescription")
        private String DBClusterDescription;

        @NameInMap("DBClusterId")
        private String DBClusterId;

        @NameInMap("DBClusterNetworkType")
        private String DBClusterNetworkType;

        @NameInMap("DBClusterStatus")
        private String DBClusterStatus;

        @NameInMap("DBClusterType")
        private String DBClusterType;

        @NameInMap("DBNodeClass")
        private String DBNodeClass;

        @NameInMap("DBNodeCount")
        private Long DBNodeCount;

        @NameInMap("DBNodeStorage")
        private Long DBNodeStorage;

        @NameInMap("EncryptionKey")
        private String encryptionKey;

        @NameInMap("EncryptionType")
        private String encryptionType;

        @NameInMap("Engine")
        private String engine;

        @NameInMap("EngineLatestMinorVersion")
        private String engineLatestMinorVersion;

        @NameInMap("EngineMinorVersion")
        private String engineMinorVersion;

        @NameInMap("EngineVersion")
        private String engineVersion;

        @NameInMap("ExpireTime")
        private String expireTime;

        @NameInMap("ExtStorageSize")
        private Integer extStorageSize;

        @NameInMap("ExtStorageType")
        private String extStorageType;

        @NameInMap("IsExpired")
        private String isExpired;

        @NameInMap("LockMode")
        private String lockMode;

        @NameInMap("LockReason")
        private String lockReason;

        @NameInMap("MaintainAutoType")
        private Boolean maintainAutoType;

        @NameInMap("MaintainTime")
        private String maintainTime;

        @NameInMap("PayType")
        private String payType;

        @NameInMap("Port")
        private Integer port;

        @NameInMap("PublicConnectionString")
        private String publicConnectionString;

        @NameInMap("PublicIpAddr")
        private String publicIpAddr;

        @NameInMap("PublicPort")
        private String publicPort;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("ScaleOutStatus")
        private ScaleOutStatus scaleOutStatus;

        @NameInMap("StorageType")
        private String storageType;

        @NameInMap("SupportBackup")
        private Integer supportBackup;

        @NameInMap("SupportHttpsPort")
        private Boolean supportHttpsPort;

        @NameInMap("SupportMysqlPort")
        private Boolean supportMysqlPort;

        @NameInMap("SupportOss")
        private Integer supportOss;

        @NameInMap("Tags")
        private Tags tags;

        @NameInMap("VSwitchId")
        private String vSwitchId;

        @NameInMap("VpcCloudInstanceId")
        private String vpcCloudInstanceId;

        @NameInMap("VpcId")
        private String vpcId;

        @NameInMap("VpcIpAddr")
        private String vpcIpAddr;

        @NameInMap("ZoneId")
        private String zoneId;

        @NameInMap("ZoneIdVswitchMap")
        private java.util.Map < String, ? > zoneIdVswitchMap;

        @NameInMap("ZookeeperClass")
        private String zookeeperClass;

        private DBCluster(Builder builder) {
            this.aliUid = builder.aliUid;
            this.appointmentRestartTime = builder.appointmentRestartTime;
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
             * AliUid.
             */
            public Builder aliUid(String aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * AppointmentRestartTime.
             */
            public Builder appointmentRestartTime(String appointmentRestartTime) {
                this.appointmentRestartTime = appointmentRestartTime;
                return this;
            }

            /**
             * Bid.
             */
            public Builder bid(String bid) {
                this.bid = bid;
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
             * CommodityCode.
             */
            public Builder commodityCode(String commodityCode) {
                this.commodityCode = commodityCode;
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
             * ControlVersion.
             */
            public Builder controlVersion(String controlVersion) {
                this.controlVersion = controlVersion;
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
             * DBClusterDescription.
             */
            public Builder DBClusterDescription(String DBClusterDescription) {
                this.DBClusterDescription = DBClusterDescription;
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
             * DBClusterNetworkType.
             */
            public Builder DBClusterNetworkType(String DBClusterNetworkType) {
                this.DBClusterNetworkType = DBClusterNetworkType;
                return this;
            }

            /**
             * DBClusterStatus.
             */
            public Builder DBClusterStatus(String DBClusterStatus) {
                this.DBClusterStatus = DBClusterStatus;
                return this;
            }

            /**
             * DBClusterType.
             */
            public Builder DBClusterType(String DBClusterType) {
                this.DBClusterType = DBClusterType;
                return this;
            }

            /**
             * DBNodeClass.
             */
            public Builder DBNodeClass(String DBNodeClass) {
                this.DBNodeClass = DBNodeClass;
                return this;
            }

            /**
             * DBNodeCount.
             */
            public Builder DBNodeCount(Long DBNodeCount) {
                this.DBNodeCount = DBNodeCount;
                return this;
            }

            /**
             * DBNodeStorage.
             */
            public Builder DBNodeStorage(Long DBNodeStorage) {
                this.DBNodeStorage = DBNodeStorage;
                return this;
            }

            /**
             * EncryptionKey.
             */
            public Builder encryptionKey(String encryptionKey) {
                this.encryptionKey = encryptionKey;
                return this;
            }

            /**
             * EncryptionType.
             */
            public Builder encryptionType(String encryptionType) {
                this.encryptionType = encryptionType;
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
             * EngineLatestMinorVersion.
             */
            public Builder engineLatestMinorVersion(String engineLatestMinorVersion) {
                this.engineLatestMinorVersion = engineLatestMinorVersion;
                return this;
            }

            /**
             * EngineMinorVersion.
             */
            public Builder engineMinorVersion(String engineMinorVersion) {
                this.engineMinorVersion = engineMinorVersion;
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
             * ExtStorageSize.
             */
            public Builder extStorageSize(Integer extStorageSize) {
                this.extStorageSize = extStorageSize;
                return this;
            }

            /**
             * ExtStorageType.
             */
            public Builder extStorageType(String extStorageType) {
                this.extStorageType = extStorageType;
                return this;
            }

            /**
             * IsExpired.
             */
            public Builder isExpired(String isExpired) {
                this.isExpired = isExpired;
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
             * MaintainAutoType.
             */
            public Builder maintainAutoType(Boolean maintainAutoType) {
                this.maintainAutoType = maintainAutoType;
                return this;
            }

            /**
             * MaintainTime.
             */
            public Builder maintainTime(String maintainTime) {
                this.maintainTime = maintainTime;
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
             * Port.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * PublicConnectionString.
             */
            public Builder publicConnectionString(String publicConnectionString) {
                this.publicConnectionString = publicConnectionString;
                return this;
            }

            /**
             * PublicIpAddr.
             */
            public Builder publicIpAddr(String publicIpAddr) {
                this.publicIpAddr = publicIpAddr;
                return this;
            }

            /**
             * PublicPort.
             */
            public Builder publicPort(String publicPort) {
                this.publicPort = publicPort;
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
             * ScaleOutStatus.
             */
            public Builder scaleOutStatus(ScaleOutStatus scaleOutStatus) {
                this.scaleOutStatus = scaleOutStatus;
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
             * SupportBackup.
             */
            public Builder supportBackup(Integer supportBackup) {
                this.supportBackup = supportBackup;
                return this;
            }

            /**
             * SupportHttpsPort.
             */
            public Builder supportHttpsPort(Boolean supportHttpsPort) {
                this.supportHttpsPort = supportHttpsPort;
                return this;
            }

            /**
             * SupportMysqlPort.
             */
            public Builder supportMysqlPort(Boolean supportMysqlPort) {
                this.supportMysqlPort = supportMysqlPort;
                return this;
            }

            /**
             * SupportOss.
             */
            public Builder supportOss(Integer supportOss) {
                this.supportOss = supportOss;
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
             * VpcCloudInstanceId.
             */
            public Builder vpcCloudInstanceId(String vpcCloudInstanceId) {
                this.vpcCloudInstanceId = vpcCloudInstanceId;
                return this;
            }

            /**
             * VPC ID。
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * VpcIpAddr.
             */
            public Builder vpcIpAddr(String vpcIpAddr) {
                this.vpcIpAddr = vpcIpAddr;
                return this;
            }

            /**
             * ZoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            /**
             * ZoneIdVswitchMap.
             */
            public Builder zoneIdVswitchMap(java.util.Map < String, ? > zoneIdVswitchMap) {
                this.zoneIdVswitchMap = zoneIdVswitchMap;
                return this;
            }

            /**
             * ZookeeperClass.
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
