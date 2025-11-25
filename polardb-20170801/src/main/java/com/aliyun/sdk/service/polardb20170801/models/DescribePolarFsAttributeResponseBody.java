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
 * {@link DescribePolarFsAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePolarFsAttributeResponseBody</p>
 */
public class DescribePolarFsAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AcceleratedStorageSpace")
    private Double acceleratedStorageSpace;

    @com.aliyun.core.annotation.NameInMap("AcceleratingEnable")
    private String acceleratingEnable;

    @com.aliyun.core.annotation.NameInMap("Bandwidth")
    private Double bandwidth;

    @com.aliyun.core.annotation.NameInMap("BandwidthBaseLine")
    private Double bandwidthBaseLine;

    @com.aliyun.core.annotation.NameInMap("BucketId")
    private String bucketId;

    @com.aliyun.core.annotation.NameInMap("Category")
    private String category;

    @com.aliyun.core.annotation.NameInMap("ClientDownloadPath")
    private String clientDownloadPath;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("DBType")
    private String DBType;

    @com.aliyun.core.annotation.NameInMap("ExpireTime")
    private String expireTime;

    @com.aliyun.core.annotation.NameInMap("Expired")
    private String expired;

    @com.aliyun.core.annotation.NameInMap("FileSystemId")
    private String fileSystemId;

    @com.aliyun.core.annotation.NameInMap("LockMode")
    private String lockMode;

    @com.aliyun.core.annotation.NameInMap("MetaUrl")
    private String metaUrl;

    @com.aliyun.core.annotation.NameInMap("MinorVersion")
    private String minorVersion;

    @com.aliyun.core.annotation.NameInMap("MountInfo")
    private MountInfo mountInfo;

    @com.aliyun.core.annotation.NameInMap("PayType")
    private String payType;

    @com.aliyun.core.annotation.NameInMap("PolarFsInstanceDescription")
    private String polarFsInstanceDescription;

    @com.aliyun.core.annotation.NameInMap("PolarFsInstanceId")
    private String polarFsInstanceId;

    @com.aliyun.core.annotation.NameInMap("PolarFsStatus")
    private String polarFsStatus;

    @com.aliyun.core.annotation.NameInMap("PolarFsType")
    private String polarFsType;

    @com.aliyun.core.annotation.NameInMap("PolarFsVersion")
    private String polarFsVersion;

    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("RelativeDbClusterId")
    private String relativeDbClusterId;

    @com.aliyun.core.annotation.NameInMap("RelativePfsClusterId")
    private String relativePfsClusterId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
    private String securityGroupId;

    @com.aliyun.core.annotation.NameInMap("StorageSpace")
    private Double storageSpace;

    @com.aliyun.core.annotation.NameInMap("StorageType")
    private String storageType;

    @com.aliyun.core.annotation.NameInMap("StorageUsed")
    private Double storageUsed;

    @com.aliyun.core.annotation.NameInMap("VPCId")
    private String VPCId;

    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    private String vSwitchId;

    @com.aliyun.core.annotation.NameInMap("ZoneId")
    private String zoneId;

    private DescribePolarFsAttributeResponseBody(Builder builder) {
        this.acceleratedStorageSpace = builder.acceleratedStorageSpace;
        this.acceleratingEnable = builder.acceleratingEnable;
        this.bandwidth = builder.bandwidth;
        this.bandwidthBaseLine = builder.bandwidthBaseLine;
        this.bucketId = builder.bucketId;
        this.category = builder.category;
        this.clientDownloadPath = builder.clientDownloadPath;
        this.createTime = builder.createTime;
        this.DBType = builder.DBType;
        this.expireTime = builder.expireTime;
        this.expired = builder.expired;
        this.fileSystemId = builder.fileSystemId;
        this.lockMode = builder.lockMode;
        this.metaUrl = builder.metaUrl;
        this.minorVersion = builder.minorVersion;
        this.mountInfo = builder.mountInfo;
        this.payType = builder.payType;
        this.polarFsInstanceDescription = builder.polarFsInstanceDescription;
        this.polarFsInstanceId = builder.polarFsInstanceId;
        this.polarFsStatus = builder.polarFsStatus;
        this.polarFsType = builder.polarFsType;
        this.polarFsVersion = builder.polarFsVersion;
        this.regionId = builder.regionId;
        this.relativeDbClusterId = builder.relativeDbClusterId;
        this.relativePfsClusterId = builder.relativePfsClusterId;
        this.requestId = builder.requestId;
        this.securityGroupId = builder.securityGroupId;
        this.storageSpace = builder.storageSpace;
        this.storageType = builder.storageType;
        this.storageUsed = builder.storageUsed;
        this.VPCId = builder.VPCId;
        this.vSwitchId = builder.vSwitchId;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePolarFsAttributeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceleratedStorageSpace
     */
    public Double getAcceleratedStorageSpace() {
        return this.acceleratedStorageSpace;
    }

    /**
     * @return acceleratingEnable
     */
    public String getAcceleratingEnable() {
        return this.acceleratingEnable;
    }

    /**
     * @return bandwidth
     */
    public Double getBandwidth() {
        return this.bandwidth;
    }

    /**
     * @return bandwidthBaseLine
     */
    public Double getBandwidthBaseLine() {
        return this.bandwidthBaseLine;
    }

    /**
     * @return bucketId
     */
    public String getBucketId() {
        return this.bucketId;
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return clientDownloadPath
     */
    public String getClientDownloadPath() {
        return this.clientDownloadPath;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return DBType
     */
    public String getDBType() {
        return this.DBType;
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
     * @return fileSystemId
     */
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    /**
     * @return lockMode
     */
    public String getLockMode() {
        return this.lockMode;
    }

    /**
     * @return metaUrl
     */
    public String getMetaUrl() {
        return this.metaUrl;
    }

    /**
     * @return minorVersion
     */
    public String getMinorVersion() {
        return this.minorVersion;
    }

    /**
     * @return mountInfo
     */
    public MountInfo getMountInfo() {
        return this.mountInfo;
    }

    /**
     * @return payType
     */
    public String getPayType() {
        return this.payType;
    }

    /**
     * @return polarFsInstanceDescription
     */
    public String getPolarFsInstanceDescription() {
        return this.polarFsInstanceDescription;
    }

    /**
     * @return polarFsInstanceId
     */
    public String getPolarFsInstanceId() {
        return this.polarFsInstanceId;
    }

    /**
     * @return polarFsStatus
     */
    public String getPolarFsStatus() {
        return this.polarFsStatus;
    }

    /**
     * @return polarFsType
     */
    public String getPolarFsType() {
        return this.polarFsType;
    }

    /**
     * @return polarFsVersion
     */
    public String getPolarFsVersion() {
        return this.polarFsVersion;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return relativeDbClusterId
     */
    public String getRelativeDbClusterId() {
        return this.relativeDbClusterId;
    }

    /**
     * @return relativePfsClusterId
     */
    public String getRelativePfsClusterId() {
        return this.relativePfsClusterId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    /**
     * @return storageSpace
     */
    public Double getStorageSpace() {
        return this.storageSpace;
    }

    /**
     * @return storageType
     */
    public String getStorageType() {
        return this.storageType;
    }

    /**
     * @return storageUsed
     */
    public Double getStorageUsed() {
        return this.storageUsed;
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
        private Double acceleratedStorageSpace; 
        private String acceleratingEnable; 
        private Double bandwidth; 
        private Double bandwidthBaseLine; 
        private String bucketId; 
        private String category; 
        private String clientDownloadPath; 
        private String createTime; 
        private String DBType; 
        private String expireTime; 
        private String expired; 
        private String fileSystemId; 
        private String lockMode; 
        private String metaUrl; 
        private String minorVersion; 
        private MountInfo mountInfo; 
        private String payType; 
        private String polarFsInstanceDescription; 
        private String polarFsInstanceId; 
        private String polarFsStatus; 
        private String polarFsType; 
        private String polarFsVersion; 
        private String regionId; 
        private String relativeDbClusterId; 
        private String relativePfsClusterId; 
        private String requestId; 
        private String securityGroupId; 
        private Double storageSpace; 
        private String storageType; 
        private Double storageUsed; 
        private String VPCId; 
        private String vSwitchId; 
        private String zoneId; 

        private Builder() {
        } 

        private Builder(DescribePolarFsAttributeResponseBody model) {
            this.acceleratedStorageSpace = model.acceleratedStorageSpace;
            this.acceleratingEnable = model.acceleratingEnable;
            this.bandwidth = model.bandwidth;
            this.bandwidthBaseLine = model.bandwidthBaseLine;
            this.bucketId = model.bucketId;
            this.category = model.category;
            this.clientDownloadPath = model.clientDownloadPath;
            this.createTime = model.createTime;
            this.DBType = model.DBType;
            this.expireTime = model.expireTime;
            this.expired = model.expired;
            this.fileSystemId = model.fileSystemId;
            this.lockMode = model.lockMode;
            this.metaUrl = model.metaUrl;
            this.minorVersion = model.minorVersion;
            this.mountInfo = model.mountInfo;
            this.payType = model.payType;
            this.polarFsInstanceDescription = model.polarFsInstanceDescription;
            this.polarFsInstanceId = model.polarFsInstanceId;
            this.polarFsStatus = model.polarFsStatus;
            this.polarFsType = model.polarFsType;
            this.polarFsVersion = model.polarFsVersion;
            this.regionId = model.regionId;
            this.relativeDbClusterId = model.relativeDbClusterId;
            this.relativePfsClusterId = model.relativePfsClusterId;
            this.requestId = model.requestId;
            this.securityGroupId = model.securityGroupId;
            this.storageSpace = model.storageSpace;
            this.storageType = model.storageType;
            this.storageUsed = model.storageUsed;
            this.VPCId = model.VPCId;
            this.vSwitchId = model.vSwitchId;
            this.zoneId = model.zoneId;
        } 

        /**
         * AcceleratedStorageSpace.
         */
        public Builder acceleratedStorageSpace(Double acceleratedStorageSpace) {
            this.acceleratedStorageSpace = acceleratedStorageSpace;
            return this;
        }

        /**
         * AcceleratingEnable.
         */
        public Builder acceleratingEnable(String acceleratingEnable) {
            this.acceleratingEnable = acceleratingEnable;
            return this;
        }

        /**
         * Bandwidth.
         */
        public Builder bandwidth(Double bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }

        /**
         * BandwidthBaseLine.
         */
        public Builder bandwidthBaseLine(Double bandwidthBaseLine) {
            this.bandwidthBaseLine = bandwidthBaseLine;
            return this;
        }

        /**
         * BucketId.
         */
        public Builder bucketId(String bucketId) {
            this.bucketId = bucketId;
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
         * ClientDownloadPath.
         */
        public Builder clientDownloadPath(String clientDownloadPath) {
            this.clientDownloadPath = clientDownloadPath;
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
         * DBType.
         */
        public Builder DBType(String DBType) {
            this.DBType = DBType;
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
         * Expired.
         */
        public Builder expired(String expired) {
            this.expired = expired;
            return this;
        }

        /**
         * FileSystemId.
         */
        public Builder fileSystemId(String fileSystemId) {
            this.fileSystemId = fileSystemId;
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
         * MetaUrl.
         */
        public Builder metaUrl(String metaUrl) {
            this.metaUrl = metaUrl;
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
         * MountInfo.
         */
        public Builder mountInfo(MountInfo mountInfo) {
            this.mountInfo = mountInfo;
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
         * PolarFsInstanceDescription.
         */
        public Builder polarFsInstanceDescription(String polarFsInstanceDescription) {
            this.polarFsInstanceDescription = polarFsInstanceDescription;
            return this;
        }

        /**
         * PolarFsInstanceId.
         */
        public Builder polarFsInstanceId(String polarFsInstanceId) {
            this.polarFsInstanceId = polarFsInstanceId;
            return this;
        }

        /**
         * PolarFsStatus.
         */
        public Builder polarFsStatus(String polarFsStatus) {
            this.polarFsStatus = polarFsStatus;
            return this;
        }

        /**
         * PolarFsType.
         */
        public Builder polarFsType(String polarFsType) {
            this.polarFsType = polarFsType;
            return this;
        }

        /**
         * PolarFsVersion.
         */
        public Builder polarFsVersion(String polarFsVersion) {
            this.polarFsVersion = polarFsVersion;
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
         * RelativeDbClusterId.
         */
        public Builder relativeDbClusterId(String relativeDbClusterId) {
            this.relativeDbClusterId = relativeDbClusterId;
            return this;
        }

        /**
         * RelativePfsClusterId.
         */
        public Builder relativePfsClusterId(String relativePfsClusterId) {
            this.relativePfsClusterId = relativePfsClusterId;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>3F9E6A3B-C13E-4064-A010-18582A******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SecurityGroupId.
         */
        public Builder securityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * StorageSpace.
         */
        public Builder storageSpace(Double storageSpace) {
            this.storageSpace = storageSpace;
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
         * StorageUsed.
         */
        public Builder storageUsed(Double storageUsed) {
            this.storageUsed = storageUsed;
            return this;
        }

        /**
         * VPCId.
         */
        public Builder VPCId(String VPCId) {
            this.VPCId = VPCId;
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
         * ZoneId.
         */
        public Builder zoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }

        public DescribePolarFsAttributeResponseBody build() {
            return new DescribePolarFsAttributeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePolarFsAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePolarFsAttributeResponseBody</p>
     */
    public static class MountInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PolarDbProxy")
        private String polarDbProxy;

        @com.aliyun.core.annotation.NameInMap("PolarFsCluster")
        private String polarFsCluster;

        @com.aliyun.core.annotation.NameInMap("Token")
        private String token;

        private MountInfo(Builder builder) {
            this.polarDbProxy = builder.polarDbProxy;
            this.polarFsCluster = builder.polarFsCluster;
            this.token = builder.token;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MountInfo create() {
            return builder().build();
        }

        /**
         * @return polarDbProxy
         */
        public String getPolarDbProxy() {
            return this.polarDbProxy;
        }

        /**
         * @return polarFsCluster
         */
        public String getPolarFsCluster() {
            return this.polarFsCluster;
        }

        /**
         * @return token
         */
        public String getToken() {
            return this.token;
        }

        public static final class Builder {
            private String polarDbProxy; 
            private String polarFsCluster; 
            private String token; 

            private Builder() {
            } 

            private Builder(MountInfo model) {
                this.polarDbProxy = model.polarDbProxy;
                this.polarFsCluster = model.polarFsCluster;
                this.token = model.token;
            } 

            /**
             * PolarDbProxy.
             */
            public Builder polarDbProxy(String polarDbProxy) {
                this.polarDbProxy = polarDbProxy;
                return this;
            }

            /**
             * PolarFsCluster.
             */
            public Builder polarFsCluster(String polarFsCluster) {
                this.polarFsCluster = polarFsCluster;
                return this;
            }

            /**
             * Token.
             */
            public Builder token(String token) {
                this.token = token;
                return this;
            }

            public MountInfo build() {
                return new MountInfo(this);
            } 

        } 

    }
}
