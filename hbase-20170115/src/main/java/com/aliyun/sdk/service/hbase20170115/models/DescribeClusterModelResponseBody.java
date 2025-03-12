// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20170115.models;

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
 * {@link DescribeClusterModelResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeClusterModelResponseBody</p>
 */
public class DescribeClusterModelResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AutoRenew")
    private String autoRenew;

    @com.aliyun.core.annotation.NameInMap("BackupStatus")
    private String backupStatus;

    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.NameInMap("ClusterName")
    private String clusterName;

    @com.aliyun.core.annotation.NameInMap("ClusterType")
    private String clusterType;

    @com.aliyun.core.annotation.NameInMap("ColdStorageStatus")
    private String coldStorageStatus;

    @com.aliyun.core.annotation.NameInMap("CoreDiskQuantity")
    private Integer coreDiskQuantity;

    @com.aliyun.core.annotation.NameInMap("CoreDiskSize")
    private String coreDiskSize;

    @com.aliyun.core.annotation.NameInMap("CoreDiskType")
    private String coreDiskType;

    @com.aliyun.core.annotation.NameInMap("CoreInstanceQuantity")
    private Integer coreInstanceQuantity;

    @com.aliyun.core.annotation.NameInMap("CoreInstanceType")
    private String coreInstanceType;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("DbType")
    private String dbType;

    @com.aliyun.core.annotation.NameInMap("ExpireTime")
    private String expireTime;

    @com.aliyun.core.annotation.NameInMap("HaType")
    private String haType;

    @com.aliyun.core.annotation.NameInMap("HasUser")
    private String hasUser;

    @com.aliyun.core.annotation.NameInMap("IsMultimod")
    private String isMultimod;

    @com.aliyun.core.annotation.NameInMap("LockMode")
    private String lockMode;

    @com.aliyun.core.annotation.NameInMap("MainVersion")
    private String mainVersion;

    @com.aliyun.core.annotation.NameInMap("MasterDiskSize")
    private Integer masterDiskSize;

    @com.aliyun.core.annotation.NameInMap("MasterDiskType")
    private String masterDiskType;

    @com.aliyun.core.annotation.NameInMap("MasterInstanceType")
    private String masterInstanceType;

    @com.aliyun.core.annotation.NameInMap("MinorVersion")
    private String minorVersion;

    @com.aliyun.core.annotation.NameInMap("PayType")
    private String payType;

    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("Tags")
    private Tags tags;

    @com.aliyun.core.annotation.NameInMap("UpdateStatus")
    private String updateStatus;

    @com.aliyun.core.annotation.NameInMap("ZoneId")
    private String zoneId;

    private DescribeClusterModelResponseBody(Builder builder) {
        this.autoRenew = builder.autoRenew;
        this.backupStatus = builder.backupStatus;
        this.clusterId = builder.clusterId;
        this.clusterName = builder.clusterName;
        this.clusterType = builder.clusterType;
        this.coldStorageStatus = builder.coldStorageStatus;
        this.coreDiskQuantity = builder.coreDiskQuantity;
        this.coreDiskSize = builder.coreDiskSize;
        this.coreDiskType = builder.coreDiskType;
        this.coreInstanceQuantity = builder.coreInstanceQuantity;
        this.coreInstanceType = builder.coreInstanceType;
        this.createTime = builder.createTime;
        this.dbType = builder.dbType;
        this.expireTime = builder.expireTime;
        this.haType = builder.haType;
        this.hasUser = builder.hasUser;
        this.isMultimod = builder.isMultimod;
        this.lockMode = builder.lockMode;
        this.mainVersion = builder.mainVersion;
        this.masterDiskSize = builder.masterDiskSize;
        this.masterDiskType = builder.masterDiskType;
        this.masterInstanceType = builder.masterInstanceType;
        this.minorVersion = builder.minorVersion;
        this.payType = builder.payType;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.tags = builder.tags;
        this.updateStatus = builder.updateStatus;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClusterModelResponseBody create() {
        return builder().build();
    }

    /**
     * @return autoRenew
     */
    public String getAutoRenew() {
        return this.autoRenew;
    }

    /**
     * @return backupStatus
     */
    public String getBackupStatus() {
        return this.backupStatus;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return clusterName
     */
    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * @return clusterType
     */
    public String getClusterType() {
        return this.clusterType;
    }

    /**
     * @return coldStorageStatus
     */
    public String getColdStorageStatus() {
        return this.coldStorageStatus;
    }

    /**
     * @return coreDiskQuantity
     */
    public Integer getCoreDiskQuantity() {
        return this.coreDiskQuantity;
    }

    /**
     * @return coreDiskSize
     */
    public String getCoreDiskSize() {
        return this.coreDiskSize;
    }

    /**
     * @return coreDiskType
     */
    public String getCoreDiskType() {
        return this.coreDiskType;
    }

    /**
     * @return coreInstanceQuantity
     */
    public Integer getCoreInstanceQuantity() {
        return this.coreInstanceQuantity;
    }

    /**
     * @return coreInstanceType
     */
    public String getCoreInstanceType() {
        return this.coreInstanceType;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return dbType
     */
    public String getDbType() {
        return this.dbType;
    }

    /**
     * @return expireTime
     */
    public String getExpireTime() {
        return this.expireTime;
    }

    /**
     * @return haType
     */
    public String getHaType() {
        return this.haType;
    }

    /**
     * @return hasUser
     */
    public String getHasUser() {
        return this.hasUser;
    }

    /**
     * @return isMultimod
     */
    public String getIsMultimod() {
        return this.isMultimod;
    }

    /**
     * @return lockMode
     */
    public String getLockMode() {
        return this.lockMode;
    }

    /**
     * @return mainVersion
     */
    public String getMainVersion() {
        return this.mainVersion;
    }

    /**
     * @return masterDiskSize
     */
    public Integer getMasterDiskSize() {
        return this.masterDiskSize;
    }

    /**
     * @return masterDiskType
     */
    public String getMasterDiskType() {
        return this.masterDiskType;
    }

    /**
     * @return masterInstanceType
     */
    public String getMasterInstanceType() {
        return this.masterInstanceType;
    }

    /**
     * @return minorVersion
     */
    public String getMinorVersion() {
        return this.minorVersion;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return tags
     */
    public Tags getTags() {
        return this.tags;
    }

    /**
     * @return updateStatus
     */
    public String getUpdateStatus() {
        return this.updateStatus;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder {
        private String autoRenew; 
        private String backupStatus; 
        private String clusterId; 
        private String clusterName; 
        private String clusterType; 
        private String coldStorageStatus; 
        private Integer coreDiskQuantity; 
        private String coreDiskSize; 
        private String coreDiskType; 
        private Integer coreInstanceQuantity; 
        private String coreInstanceType; 
        private String createTime; 
        private String dbType; 
        private String expireTime; 
        private String haType; 
        private String hasUser; 
        private String isMultimod; 
        private String lockMode; 
        private String mainVersion; 
        private Integer masterDiskSize; 
        private String masterDiskType; 
        private String masterInstanceType; 
        private String minorVersion; 
        private String payType; 
        private String regionId; 
        private String requestId; 
        private String status; 
        private Tags tags; 
        private String updateStatus; 
        private String zoneId; 

        /**
         * AutoRenew.
         */
        public Builder autoRenew(String autoRenew) {
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * BackupStatus.
         */
        public Builder backupStatus(String backupStatus) {
            this.backupStatus = backupStatus;
            return this;
        }

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        /**
         * ClusterName.
         */
        public Builder clusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }

        /**
         * ClusterType.
         */
        public Builder clusterType(String clusterType) {
            this.clusterType = clusterType;
            return this;
        }

        /**
         * ColdStorageStatus.
         */
        public Builder coldStorageStatus(String coldStorageStatus) {
            this.coldStorageStatus = coldStorageStatus;
            return this;
        }

        /**
         * CoreDiskQuantity.
         */
        public Builder coreDiskQuantity(Integer coreDiskQuantity) {
            this.coreDiskQuantity = coreDiskQuantity;
            return this;
        }

        /**
         * CoreDiskSize.
         */
        public Builder coreDiskSize(String coreDiskSize) {
            this.coreDiskSize = coreDiskSize;
            return this;
        }

        /**
         * CoreDiskType.
         */
        public Builder coreDiskType(String coreDiskType) {
            this.coreDiskType = coreDiskType;
            return this;
        }

        /**
         * CoreInstanceQuantity.
         */
        public Builder coreInstanceQuantity(Integer coreInstanceQuantity) {
            this.coreInstanceQuantity = coreInstanceQuantity;
            return this;
        }

        /**
         * CoreInstanceType.
         */
        public Builder coreInstanceType(String coreInstanceType) {
            this.coreInstanceType = coreInstanceType;
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
         * DbType.
         */
        public Builder dbType(String dbType) {
            this.dbType = dbType;
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
         * HaType.
         */
        public Builder haType(String haType) {
            this.haType = haType;
            return this;
        }

        /**
         * HasUser.
         */
        public Builder hasUser(String hasUser) {
            this.hasUser = hasUser;
            return this;
        }

        /**
         * IsMultimod.
         */
        public Builder isMultimod(String isMultimod) {
            this.isMultimod = isMultimod;
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
         * MainVersion.
         */
        public Builder mainVersion(String mainVersion) {
            this.mainVersion = mainVersion;
            return this;
        }

        /**
         * MasterDiskSize.
         */
        public Builder masterDiskSize(Integer masterDiskSize) {
            this.masterDiskSize = masterDiskSize;
            return this;
        }

        /**
         * MasterDiskType.
         */
        public Builder masterDiskType(String masterDiskType) {
            this.masterDiskType = masterDiskType;
            return this;
        }

        /**
         * MasterInstanceType.
         */
        public Builder masterInstanceType(String masterInstanceType) {
            this.masterInstanceType = masterInstanceType;
            return this;
        }

        /**
         * MinorVersion.
         */
        public Builder minorVersion(String minorVersion) {
            this.minorVersion = minorVersion;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
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
         * UpdateStatus.
         */
        public Builder updateStatus(String updateStatus) {
            this.updateStatus = updateStatus;
            return this;
        }

        /**
         * ZoneId.
         */
        public Builder zoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }

        public DescribeClusterModelResponseBody build() {
            return new DescribeClusterModelResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeClusterModelResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeClusterModelResponseBody</p>
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
     * {@link DescribeClusterModelResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeClusterModelResponseBody</p>
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
}
