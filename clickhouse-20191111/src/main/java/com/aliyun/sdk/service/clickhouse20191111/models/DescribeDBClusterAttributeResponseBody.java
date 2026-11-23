// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeDBClusterAttributeResponseBody model) {
            this.DBCluster = model.DBCluster;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The cluster information.</p>
         */
        public Builder DBCluster(DBCluster DBCluster) {
            this.DBCluster = DBCluster;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>05321590-BB65-4720-8CB6-8218E041CDD0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDBClusterAttributeResponseBody build() {
            return new DescribeDBClusterAttributeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDBClusterAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBClusterAttributeResponseBody</p>
     */
    public static class LangfuseInstanceIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LangfuseInstanceId")
        private java.util.List<String> langfuseInstanceId;

        private LangfuseInstanceIds(Builder builder) {
            this.langfuseInstanceId = builder.langfuseInstanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LangfuseInstanceIds create() {
            return builder().build();
        }

        /**
         * @return langfuseInstanceId
         */
        public java.util.List<String> getLangfuseInstanceId() {
            return this.langfuseInstanceId;
        }

        public static final class Builder {
            private java.util.List<String> langfuseInstanceId; 

            private Builder() {
            } 

            private Builder(LangfuseInstanceIds model) {
                this.langfuseInstanceId = model.langfuseInstanceId;
            } 

            /**
             * LangfuseInstanceId.
             */
            public Builder langfuseInstanceId(java.util.List<String> langfuseInstanceId) {
                this.langfuseInstanceId = langfuseInstanceId;
                return this;
            }

            public LangfuseInstanceIds build() {
                return new LangfuseInstanceIds(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDBClusterAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBClusterAttributeResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(ScaleOutStatus model) {
                this.progress = model.progress;
                this.ratio = model.ratio;
            } 

            /**
             * <p>The percentage of data migrated.</p>
             * <blockquote>
             * <p>This parameter is returned only when the cluster status is SCALING_OUT.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The data migration progress. Format: Migrated data volume/Total data volume.</p>
             * <blockquote>
             * <p>This parameter is returned only when the cluster status is SCALING_OUT.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>0MB/60469MB</p>
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
    /**
     * 
     * {@link DescribeDBClusterAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBClusterAttributeResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Tag model) {
                this.key = model.key;
                this.value = model.value;
            } 

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
    /**
     * 
     * {@link DescribeDBClusterAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBClusterAttributeResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Tag")
        private java.util.List<Tag> tag;

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
        public java.util.List<Tag> getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List<Tag> tag; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.tag = model.tag;
            } 

            /**
             * Tag.
             */
            public Builder tag(java.util.List<Tag> tag) {
                this.tag = tag;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDBClusterAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBClusterAttributeResponseBody</p>
     */
    public static class DBCluster extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliUid")
        private String aliUid;

        @com.aliyun.core.annotation.NameInMap("AppointmentElectZookeeperDisableWrite")
        private Boolean appointmentElectZookeeperDisableWrite;

        @com.aliyun.core.annotation.NameInMap("AppointmentElectZookeeperTime")
        private String appointmentElectZookeeperTime;

        @com.aliyun.core.annotation.NameInMap("AppointmentRestartNodeList")
        private String appointmentRestartNodeList;

        @com.aliyun.core.annotation.NameInMap("AppointmentRestartNodeTime")
        private String appointmentRestartNodeTime;

        @com.aliyun.core.annotation.NameInMap("AppointmentRestartTime")
        private String appointmentRestartTime;

        @com.aliyun.core.annotation.NameInMap("AvailableUpgradeMajorVersion")
        private java.util.Map<String, ?> availableUpgradeMajorVersion;

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

        @com.aliyun.core.annotation.NameInMap("LangfuseInstanceIds")
        private LangfuseInstanceIds langfuseInstanceIds;

        @com.aliyun.core.annotation.NameInMap("LbKind")
        private String lbKind;

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

        @com.aliyun.core.annotation.NameInMap("WebUISnatStatus")
        private String webUISnatStatus;

        @com.aliyun.core.annotation.NameInMap("WebUIStatus")
        private String webUIStatus;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        @com.aliyun.core.annotation.NameInMap("ZoneIdVswitchMap")
        private java.util.Map<String, ?> zoneIdVswitchMap;

        @com.aliyun.core.annotation.NameInMap("ZookeeperClass")
        private String zookeeperClass;

        private DBCluster(Builder builder) {
            this.aliUid = builder.aliUid;
            this.appointmentElectZookeeperDisableWrite = builder.appointmentElectZookeeperDisableWrite;
            this.appointmentElectZookeeperTime = builder.appointmentElectZookeeperTime;
            this.appointmentRestartNodeList = builder.appointmentRestartNodeList;
            this.appointmentRestartNodeTime = builder.appointmentRestartNodeTime;
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
            this.langfuseInstanceIds = builder.langfuseInstanceIds;
            this.lbKind = builder.lbKind;
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
            this.webUISnatStatus = builder.webUISnatStatus;
            this.webUIStatus = builder.webUIStatus;
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
         * @return appointmentElectZookeeperDisableWrite
         */
        public Boolean getAppointmentElectZookeeperDisableWrite() {
            return this.appointmentElectZookeeperDisableWrite;
        }

        /**
         * @return appointmentElectZookeeperTime
         */
        public String getAppointmentElectZookeeperTime() {
            return this.appointmentElectZookeeperTime;
        }

        /**
         * @return appointmentRestartNodeList
         */
        public String getAppointmentRestartNodeList() {
            return this.appointmentRestartNodeList;
        }

        /**
         * @return appointmentRestartNodeTime
         */
        public String getAppointmentRestartNodeTime() {
            return this.appointmentRestartNodeTime;
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
        public java.util.Map<String, ?> getAvailableUpgradeMajorVersion() {
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
         * @return langfuseInstanceIds
         */
        public LangfuseInstanceIds getLangfuseInstanceIds() {
            return this.langfuseInstanceIds;
        }

        /**
         * @return lbKind
         */
        public String getLbKind() {
            return this.lbKind;
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
         * @return webUISnatStatus
         */
        public String getWebUISnatStatus() {
            return this.webUISnatStatus;
        }

        /**
         * @return webUIStatus
         */
        public String getWebUIStatus() {
            return this.webUIStatus;
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
        public java.util.Map<String, ?> getZoneIdVswitchMap() {
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
            private Boolean appointmentElectZookeeperDisableWrite; 
            private String appointmentElectZookeeperTime; 
            private String appointmentRestartNodeList; 
            private String appointmentRestartNodeTime; 
            private String appointmentRestartTime; 
            private java.util.Map<String, ?> availableUpgradeMajorVersion; 
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
            private LangfuseInstanceIds langfuseInstanceIds; 
            private String lbKind; 
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
            private String webUISnatStatus; 
            private String webUIStatus; 
            private String zoneId; 
            private java.util.Map<String, ?> zoneIdVswitchMap; 
            private String zookeeperClass; 

            private Builder() {
            } 

            private Builder(DBCluster model) {
                this.aliUid = model.aliUid;
                this.appointmentElectZookeeperDisableWrite = model.appointmentElectZookeeperDisableWrite;
                this.appointmentElectZookeeperTime = model.appointmentElectZookeeperTime;
                this.appointmentRestartNodeList = model.appointmentRestartNodeList;
                this.appointmentRestartNodeTime = model.appointmentRestartNodeTime;
                this.appointmentRestartTime = model.appointmentRestartTime;
                this.availableUpgradeMajorVersion = model.availableUpgradeMajorVersion;
                this.bid = model.bid;
                this.category = model.category;
                this.commodityCode = model.commodityCode;
                this.connectionString = model.connectionString;
                this.controlVersion = model.controlVersion;
                this.createTime = model.createTime;
                this.DBClusterDescription = model.DBClusterDescription;
                this.DBClusterId = model.DBClusterId;
                this.DBClusterNetworkType = model.DBClusterNetworkType;
                this.DBClusterStatus = model.DBClusterStatus;
                this.DBClusterType = model.DBClusterType;
                this.DBNodeClass = model.DBNodeClass;
                this.DBNodeCount = model.DBNodeCount;
                this.DBNodeStorage = model.DBNodeStorage;
                this.encryptionKey = model.encryptionKey;
                this.encryptionType = model.encryptionType;
                this.engine = model.engine;
                this.engineLatestMinorVersion = model.engineLatestMinorVersion;
                this.engineMinorVersion = model.engineMinorVersion;
                this.engineVersion = model.engineVersion;
                this.expireTime = model.expireTime;
                this.extStorageSize = model.extStorageSize;
                this.extStorageType = model.extStorageType;
                this.isExpired = model.isExpired;
                this.langfuseInstanceIds = model.langfuseInstanceIds;
                this.lbKind = model.lbKind;
                this.lockMode = model.lockMode;
                this.lockReason = model.lockReason;
                this.maintainAutoType = model.maintainAutoType;
                this.maintainTime = model.maintainTime;
                this.payType = model.payType;
                this.port = model.port;
                this.publicConnectionString = model.publicConnectionString;
                this.publicIpAddr = model.publicIpAddr;
                this.publicPort = model.publicPort;
                this.regionId = model.regionId;
                this.resourceGroupId = model.resourceGroupId;
                this.scaleOutStatus = model.scaleOutStatus;
                this.storageType = model.storageType;
                this.supportBackup = model.supportBackup;
                this.supportHttpsPort = model.supportHttpsPort;
                this.supportMysqlPort = model.supportMysqlPort;
                this.supportOss = model.supportOss;
                this.tags = model.tags;
                this.vSwitchId = model.vSwitchId;
                this.vpcCloudInstanceId = model.vpcCloudInstanceId;
                this.vpcId = model.vpcId;
                this.vpcIpAddr = model.vpcIpAddr;
                this.webUISnatStatus = model.webUISnatStatus;
                this.webUIStatus = model.webUIStatus;
                this.zoneId = model.zoneId;
                this.zoneIdVswitchMap = model.zoneIdVswitchMap;
                this.zookeeperClass = model.zookeeperClass;
            } 

            /**
             * <p>The Alibaba Cloud account ID.</p>
             * 
             * <strong>example:</strong>
             * <p>140692647406****</p>
             */
            public Builder aliUid(String aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * <p>The configuration for disabling writes during a primary switchover restart. Valid values:</p>
             * <ul>
             * <li>true: Writes to the instance are disabled during the primary switchover.</li>
             * <li>false: Writes to the instance are not disabled during the primary switchover.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder appointmentElectZookeeperDisableWrite(Boolean appointmentElectZookeeperDisableWrite) {
                this.appointmentElectZookeeperDisableWrite = appointmentElectZookeeperDisableWrite;
                return this;
            }

            /**
             * <p>The scheduled time for the primary switchover. The time is in the YYYY-MM-DDThh:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-11-06T12:00:00Z</p>
             */
            public Builder appointmentElectZookeeperTime(String appointmentElectZookeeperTime) {
                this.appointmentElectZookeeperTime = appointmentElectZookeeperTime;
                return this;
            }

            /**
             * <p>The list of nodes scheduled for a partial restart.</p>
             * 
             * <strong>example:</strong>
             * <p>ck-k1a976p3n********-<strong><strong>-clickhouse-s-0-r-0,ck-k1a976p3n</strong></strong><strong><strong>-</strong></strong>-clickhouse-s-0-r-1</p>
             */
            public Builder appointmentRestartNodeList(String appointmentRestartNodeList) {
                this.appointmentRestartNodeList = appointmentRestartNodeList;
                return this;
            }

            /**
             * <p>The scheduled time for the partial node restart. The time is in the YYYY-MM-DDThh:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-11-06T12:00:00Z</p>
             */
            public Builder appointmentRestartNodeTime(String appointmentRestartNodeTime) {
                this.appointmentRestartNodeTime = appointmentRestartNodeTime;
                return this;
            }

            /**
             * <p>The scheduled restart time. The time is in the YYYY-MM-DDThh:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-11-06T12:00:00Z</p>
             */
            public Builder appointmentRestartTime(String appointmentRestartTime) {
                this.appointmentRestartTime = appointmentRestartTime;
                return this;
            }

            /**
             * <p>The target major version to which the cluster can be upgraded.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;MajorVersion&quot;:&quot;MinorVersion&quot;}</p>
             */
            public Builder availableUpgradeMajorVersion(java.util.Map<String, ?> availableUpgradeMajorVersion) {
                this.availableUpgradeMajorVersion = availableUpgradeMajorVersion;
                return this;
            }

            /**
             * <p>The site ID. Valid values:</p>
             * <ul>
             * <li><strong>26842</strong>: Chinese site.</li>
             * <li><strong>26888</strong>: International site.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>26842</p>
             */
            public Builder bid(String bid) {
                this.bid = bid;
                return this;
            }

            /**
             * <p>The replica configuration. Valid values:</p>
             * <ul>
             * <li><strong>Basic</strong>: Single-replica edition.</li>
             * <li><strong>HighAvailability</strong>: Master-replica cluster.</li>
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
             * <p>The commodity code.</p>
             * 
             * <strong>example:</strong>
             * <p>clickhouse_go_public_cn</p>
             */
            public Builder commodityCode(String commodityCode) {
                this.commodityCode = commodityCode;
                return this;
            }

            /**
             * <p>The VPC endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>cc-bp1qx68m06981****.ads.rds.aliyuncs.com</p>
             */
            public Builder connectionString(String connectionString) {
                this.connectionString = connectionString;
                return this;
            }

            /**
             * <p>The version number of the backend control system. Valid values:</p>
             * <ul>
             * <li><strong>v1</strong></li>
             * <li><strong>v2</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>v1</p>
             */
            public Builder controlVersion(String controlVersion) {
                this.controlVersion = controlVersion;
                return this;
            }

            /**
             * <p>The time when the cluster was created. The time is in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-12-13T11:33:11Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>cc-bp108z124a8o7****</p>
             */
            public Builder DBClusterDescription(String DBClusterDescription) {
                this.DBClusterDescription = DBClusterDescription;
                return this;
            }

            /**
             * <p>The cluster ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cc-bp108z124a8o7****</p>
             */
            public Builder DBClusterId(String DBClusterId) {
                this.DBClusterId = DBClusterId;
                return this;
            }

            /**
             * <p>The network type. Only VPC is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc</p>
             */
            public Builder DBClusterNetworkType(String DBClusterNetworkType) {
                this.DBClusterNetworkType = DBClusterNetworkType;
                return this;
            }

            /**
             * <p>The cluster status. Valid values:</p>
             * <ul>
             * <li><strong>Preparing</strong>: Preparing.</li>
             * <li><strong>Creating</strong>: Creating.</li>
             * <li><strong>Running</strong>: Running.</li>
             * <li><strong>Deleting</strong>: Deleting.</li>
             * <li><strong>SCALING_OUT</strong>: Scaling out.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder DBClusterStatus(String DBClusterStatus) {
                this.DBClusterStatus = DBClusterStatus;
                return this;
            }

            /**
             * <p>The cluster type. Valid values:</p>
             * <ul>
             * <li><strong>Common</strong>: Standard cluster.</li>
             * <li><strong>Readonly</strong>: Read-only cluster.</li>
             * <li><strong>Guard</strong>: Disaster recovery cluster.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Common</p>
             */
            public Builder DBClusterType(String DBClusterType) {
                this.DBClusterType = DBClusterType;
                return this;
            }

            /**
             * <p>The cluster specifications. Valid values:</p>
             * <ul>
             * <li>Single-replica edition:<ul>
             * <li><strong>S4-NEW</strong></li>
             * <li><strong>S8</strong></li>
             * <li><strong>S16</strong></li>
             * <li><strong>S32</strong></li>
             * <li><strong>S64</strong></li>
             * <li><strong>S104</strong></li>
             * </ul>
             * </li>
             * <li>Master-replica cluster: <ul>
             * <li><strong>C4-NEW</strong></li>
             * <li><strong>C8</strong></li>
             * <li><strong>C16</strong></li>
             * <li><strong>C32</strong></li>
             * <li><strong>C64</strong></li>
             * <li><strong>C104</strong></li>
             * </ul>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>C8</p>
             */
            public Builder DBNodeClass(String DBNodeClass) {
                this.DBNodeClass = DBNodeClass;
                return this;
            }

            /**
             * <p>The number of nodes. Valid values:</p>
             * <ul>
             * <li>Single-replica edition: 1 to 48.</li>
             * <li>Master-replica cluster: 1 to 24.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder DBNodeCount(Long DBNodeCount) {
                this.DBNodeCount = DBNodeCount;
                return this;
            }

            /**
             * <p>The storage space per node. Unit: GB.</p>
             * <p>Valid values: 100 to 32000.</p>
             * <blockquote>
             * <p>The step size is 100 GB.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder DBNodeStorage(Long DBNodeStorage) {
                this.DBNodeStorage = DBNodeStorage;
                return this;
            }

            /**
             * <p>The KMS key.</p>
             * <blockquote>
             * <p>If the encryption type is off, this parameter is empty.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>685f416f-87c9-4554-8d3a-75b6ce25****</p>
             */
            public Builder encryptionKey(String encryptionKey) {
                this.encryptionKey = encryptionKey;
                return this;
            }

            /**
             * <p>The encryption type. Valid values:</p>
             * <ul>
             * <li><strong>CloudDisk</strong>: Cloud disk encryption.</li>
             * <li><strong>off</strong>: No encryption.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CloudDisk</p>
             */
            public Builder encryptionType(String encryptionType) {
                this.encryptionType = encryptionType;
                return this;
            }

            /**
             * <p>The engine type.</p>
             * 
             * <strong>example:</strong>
             * <p>ClickHouse</p>
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * <p>The latest minor version to which the engine can be upgraded.</p>
             * 
             * <strong>example:</strong>
             * <p>1.34.0</p>
             */
            public Builder engineLatestMinorVersion(String engineLatestMinorVersion) {
                this.engineLatestMinorVersion = engineLatestMinorVersion;
                return this;
            }

            /**
             * <p>The current minor version.</p>
             * 
             * <strong>example:</strong>
             * <p>1.6.0</p>
             */
            public Builder engineMinorVersion(String engineMinorVersion) {
                this.engineMinorVersion = engineMinorVersion;
                return this;
            }

            /**
             * <p>The DPI engine version.</p>
             * 
             * <strong>example:</strong>
             * <p>21.8.10.19</p>
             */
            public Builder engineVersion(String engineVersion) {
                this.engineVersion = engineVersion;
                return this;
            }

            /**
             * <p>The expiration time of the cluster. The time is in the yyyy-MM-ddTHH:mm:ssZ format.</p>
             * <blockquote>
             * <p>Pay-as-you-go clusters do not have an expiration time. This parameter is empty for pay-as-you-go clusters.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2022-11-11T16:00:00Z</p>
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * <p>The extended storage space. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>500</p>
             */
            public Builder extStorageSize(Integer extStorageSize) {
                this.extStorageSize = extStorageSize;
                return this;
            }

            /**
             * <p>The extended storage type. Valid values:</p>
             * <p>&lt;props=&quot;china&quot;&gt;- <strong>CloudESSD_PL0</strong>: PL0 ESSD.</p>
             * <ul>
             * <li><strong>CloudESSD</strong>: PL1 ESSD.</li>
             * <li><strong>CloudESSD_PL2</strong>: PL2 ESSD.</li>
             * <li><strong>CloudESSD_PL3</strong>: PL3 ESSD.</li>
             * <li><strong>CloudEfficiency</strong>: Ultra disk.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CloudESSD</p>
             */
            public Builder extStorageType(String extStorageType) {
                this.extStorageType = extStorageType;
                return this;
            }

            /**
             * <p>Indicates whether the cluster has expired. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: Expired.</li>
             * <li><strong>false</strong>: Not expired.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isExpired(String isExpired) {
                this.isExpired = isExpired;
                return this;
            }

            /**
             * LangfuseInstanceIds.
             */
            public Builder langfuseInstanceIds(LangfuseInstanceIds langfuseInstanceIds) {
                this.langfuseInstanceIds = langfuseInstanceIds;
                return this;
            }

            /**
             * <p>The load balancer type.</p>
             * 
             * <strong>example:</strong>
             * <p>clb</p>
             */
            public Builder lbKind(String lbKind) {
                this.lbKind = lbKind;
                return this;
            }

            /**
             * <p>The lock mode of the cluster. Valid values:</p>
             * <ul>
             * <li><strong>Unlock</strong>: Normal.</li>
             * <li><strong>ManualLock</strong>: Manually locked.</li>
             * <li><strong>LockByExpiration</strong>: Automatically locked due to expiration.</li>
             * <li><strong>LockByRestoration</strong>: Automatically locked before a rollback.</li>
             * <li><strong>LockByDiskQuota</strong>: Automatically locked due to full storage space.</li>
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
             * <p>The reason for locking.</p>
             * <blockquote>
             * <p>If the lock mode is Unlock, this parameter is empty.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>DISK_FULL</p>
             */
            public Builder lockReason(String lockReason) {
                this.lockReason = lockReason;
                return this;
            }

            /**
             * <p>The upgrade type. A value of <strong>false</strong> indicates manual upgrade.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder maintainAutoType(Boolean maintainAutoType) {
                this.maintainAutoType = maintainAutoType;
                return this;
            }

            /**
             * <p>The maintenance window of the cluster. The time is in the HH:mmZ-HH:mmZ format. The time is displayed in UTC.</p>
             * <p>Example: 00:00Z-01:00Z indicates that routine maintenance can be performed from 00:00 to 01:00 UTC (08:00 to 09:00 UTC+8).</p>
             * 
             * <strong>example:</strong>
             * <p>00:00Z-01:00Z</p>
             */
            public Builder maintainTime(String maintainTime) {
                this.maintainTime = maintainTime;
                return this;
            }

            /**
             * <p>The billing method. Valid values:</p>
             * <ul>
             * <li><strong>Postpaid</strong>: Pay-as-you-go.</li>
             * <li><strong>Prepaid</strong>: Subscription.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Prepaid</p>
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            /**
             * <p>The HTTP port number.</p>
             * 
             * <strong>example:</strong>
             * <p>8123</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The public endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>cc-bp1199ya710s7****.public.clickhouse.ads.aliyuncs.com</p>
             */
            public Builder publicConnectionString(String publicConnectionString) {
                this.publicConnectionString = publicConnectionString;
                return this;
            }

            /**
             * <p>The IP address of the public endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>121.40.xx.xx</p>
             */
            public Builder publicIpAddr(String publicIpAddr) {
                this.publicIpAddr = publicIpAddr;
                return this;
            }

            /**
             * <p>The public TCP port number.</p>
             * 
             * <strong>example:</strong>
             * <p>3306</p>
             */
            public Builder publicPort(String publicPort) {
                this.publicPort = publicPort;
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
             * <p>rg-acfmyf65je6****</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The data migration status.</p>
             */
            public Builder scaleOutStatus(ScaleOutStatus scaleOutStatus) {
                this.scaleOutStatus = scaleOutStatus;
                return this;
            }

            /**
             * <p>The storage type. Valid values:</p>
             * <p>&lt;props=&quot;china&quot;&gt;- <strong>CloudESSD_PL0</strong>: PL0 ESSD.</p>
             * <ul>
             * <li><strong>CloudESSD</strong>: PL1 ESSD.</li>
             * <li><strong>CloudESSD_PL2</strong>: PL2 ESSD.</li>
             * <li><strong>CloudESSD_PL3</strong>: PL3 ESSD.</li>
             * <li><strong>CloudEfficiency</strong>: Ultra disk.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CloudESSD</p>
             */
            public Builder storageType(String storageType) {
                this.storageType = storageType;
                return this;
            }

            /**
             * <p>Indicates whether data backup is supported. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: Data backup is supported.</li>
             * <li><strong>2</strong>: Data backup is not supported.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder supportBackup(Integer supportBackup) {
                this.supportBackup = supportBackup;
                return this;
            }

            /**
             * <p>Indicates whether the HTTPS port is supported. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: The HTTPS port is supported.</li>
             * <li><strong>false</strong>: The HTTPS port is not supported.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder supportHttpsPort(Boolean supportHttpsPort) {
                this.supportHttpsPort = supportHttpsPort;
                return this;
            }

            /**
             * <p>Indicates whether the MySQL port is supported. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: The MySQL port is supported.</li>
             * <li><strong>false</strong>: The MySQL port is not supported.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder supportMysqlPort(Boolean supportMysqlPort) {
                this.supportMysqlPort = supportMysqlPort;
                return this;
            }

            /**
             * <p>Indicates whether tiered storage of hot and cold data is supported. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: Tiered storage of hot and cold data is supported.</li>
             * <li><strong>2</strong>: Tiered storage of hot and cold data is not supported.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
             * <p>The vSwitch ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-bp1n874li1t5y57wi****</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>The VPC resource ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-bp10tr8k9qasioaty****</p>
             */
            public Builder vpcCloudInstanceId(String vpcCloudInstanceId) {
                this.vpcCloudInstanceId = vpcCloudInstanceId;
                return this;
            }

            /**
             * <p>The VPC ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-bp10tr8k9qasioaty****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>The IP address of the VPC network connectivity string.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.xx.xx</p>
             */
            public Builder vpcIpAddr(String vpcIpAddr) {
                this.vpcIpAddr = vpcIpAddr;
                return this;
            }

            /**
             * <p>The status of the WebUI public network gateway.</p>
             * 
             * <strong>example:</strong>
             * <p>active</p>
             */
            public Builder webUISnatStatus(String webUISnatStatus) {
                this.webUISnatStatus = webUISnatStatus;
                return this;
            }

            /**
             * <p>The WebUI status.</p>
             * 
             * <strong>example:</strong>
             * <p>active</p>
             */
            public Builder webUIStatus(String webUIStatus) {
                this.webUIStatus = webUIStatus;
                return this;
            }

            /**
             * <p>The zone ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-h</p>
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            /**
             * <p>The list of vSwitch IDs for the multi-zone instance.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;cn-shanghai-f&quot;: &quot;vsw-zm0n42d5vvuo****&quot;}</p>
             */
            public Builder zoneIdVswitchMap(java.util.Map<String, ?> zoneIdVswitchMap) {
                this.zoneIdVswitchMap = zoneIdVswitchMap;
                return this;
            }

            /**
             * <p>The Zookeeper specifications.</p>
             * 
             * <strong>example:</strong>
             * <p>4 Core 8 GB</p>
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
