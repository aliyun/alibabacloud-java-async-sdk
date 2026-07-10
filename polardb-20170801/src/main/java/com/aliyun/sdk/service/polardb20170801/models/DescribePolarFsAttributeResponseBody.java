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
    @com.aliyun.core.annotation.NameInMap("AccelerateType")
    private String accelerateType;

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

    @com.aliyun.core.annotation.NameInMap("CustomBucketPath")
    private String customBucketPath;

    @com.aliyun.core.annotation.NameInMap("CustomBucketPathList")
    private java.util.List<CustomBucketPathList> customBucketPathList;

    @com.aliyun.core.annotation.NameInMap("DBEndpointId")
    private String DBEndpointId;

    @com.aliyun.core.annotation.NameInMap("DBType")
    private String DBType;

    @com.aliyun.core.annotation.NameInMap("EndpointItems")
    private java.util.List<EndpointItems> endpointItems;

    @com.aliyun.core.annotation.NameInMap("ExpireTime")
    private String expireTime;

    @com.aliyun.core.annotation.NameInMap("Expired")
    private String expired;

    @com.aliyun.core.annotation.NameInMap("FileSystemId")
    private String fileSystemId;

    @com.aliyun.core.annotation.NameInMap("LockMode")
    private String lockMode;

    @com.aliyun.core.annotation.NameInMap("MaxscaleEndpointId")
    private String maxscaleEndpointId;

    @com.aliyun.core.annotation.NameInMap("MetaConnString")
    private String metaConnString;

    @com.aliyun.core.annotation.NameInMap("MetaInstanceName")
    private String metaInstanceName;

    @com.aliyun.core.annotation.NameInMap("MetaMxsConnString")
    private String metaMxsConnString;

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

    @com.aliyun.core.annotation.NameInMap("UserDefaultAccName")
    private String userDefaultAccName;

    @com.aliyun.core.annotation.NameInMap("UserDefaultAccSk")
    private String userDefaultAccSk;

    @com.aliyun.core.annotation.NameInMap("VPCId")
    private String VPCId;

    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    private String vSwitchId;

    @com.aliyun.core.annotation.NameInMap("ZoneId")
    private String zoneId;

    private DescribePolarFsAttributeResponseBody(Builder builder) {
        this.accelerateType = builder.accelerateType;
        this.acceleratedStorageSpace = builder.acceleratedStorageSpace;
        this.acceleratingEnable = builder.acceleratingEnable;
        this.bandwidth = builder.bandwidth;
        this.bandwidthBaseLine = builder.bandwidthBaseLine;
        this.bucketId = builder.bucketId;
        this.category = builder.category;
        this.clientDownloadPath = builder.clientDownloadPath;
        this.createTime = builder.createTime;
        this.customBucketPath = builder.customBucketPath;
        this.customBucketPathList = builder.customBucketPathList;
        this.DBEndpointId = builder.DBEndpointId;
        this.DBType = builder.DBType;
        this.endpointItems = builder.endpointItems;
        this.expireTime = builder.expireTime;
        this.expired = builder.expired;
        this.fileSystemId = builder.fileSystemId;
        this.lockMode = builder.lockMode;
        this.maxscaleEndpointId = builder.maxscaleEndpointId;
        this.metaConnString = builder.metaConnString;
        this.metaInstanceName = builder.metaInstanceName;
        this.metaMxsConnString = builder.metaMxsConnString;
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
        this.userDefaultAccName = builder.userDefaultAccName;
        this.userDefaultAccSk = builder.userDefaultAccSk;
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
     * @return accelerateType
     */
    public String getAccelerateType() {
        return this.accelerateType;
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
     * @return customBucketPath
     */
    public String getCustomBucketPath() {
        return this.customBucketPath;
    }

    /**
     * @return customBucketPathList
     */
    public java.util.List<CustomBucketPathList> getCustomBucketPathList() {
        return this.customBucketPathList;
    }

    /**
     * @return DBEndpointId
     */
    public String getDBEndpointId() {
        return this.DBEndpointId;
    }

    /**
     * @return DBType
     */
    public String getDBType() {
        return this.DBType;
    }

    /**
     * @return endpointItems
     */
    public java.util.List<EndpointItems> getEndpointItems() {
        return this.endpointItems;
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
     * @return maxscaleEndpointId
     */
    public String getMaxscaleEndpointId() {
        return this.maxscaleEndpointId;
    }

    /**
     * @return metaConnString
     */
    public String getMetaConnString() {
        return this.metaConnString;
    }

    /**
     * @return metaInstanceName
     */
    public String getMetaInstanceName() {
        return this.metaInstanceName;
    }

    /**
     * @return metaMxsConnString
     */
    public String getMetaMxsConnString() {
        return this.metaMxsConnString;
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
     * @return userDefaultAccName
     */
    public String getUserDefaultAccName() {
        return this.userDefaultAccName;
    }

    /**
     * @return userDefaultAccSk
     */
    public String getUserDefaultAccSk() {
        return this.userDefaultAccSk;
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
        private String accelerateType; 
        private Double acceleratedStorageSpace; 
        private String acceleratingEnable; 
        private Double bandwidth; 
        private Double bandwidthBaseLine; 
        private String bucketId; 
        private String category; 
        private String clientDownloadPath; 
        private String createTime; 
        private String customBucketPath; 
        private java.util.List<CustomBucketPathList> customBucketPathList; 
        private String DBEndpointId; 
        private String DBType; 
        private java.util.List<EndpointItems> endpointItems; 
        private String expireTime; 
        private String expired; 
        private String fileSystemId; 
        private String lockMode; 
        private String maxscaleEndpointId; 
        private String metaConnString; 
        private String metaInstanceName; 
        private String metaMxsConnString; 
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
        private String userDefaultAccName; 
        private String userDefaultAccSk; 
        private String VPCId; 
        private String vSwitchId; 
        private String zoneId; 

        private Builder() {
        } 

        private Builder(DescribePolarFsAttributeResponseBody model) {
            this.accelerateType = model.accelerateType;
            this.acceleratedStorageSpace = model.acceleratedStorageSpace;
            this.acceleratingEnable = model.acceleratingEnable;
            this.bandwidth = model.bandwidth;
            this.bandwidthBaseLine = model.bandwidthBaseLine;
            this.bucketId = model.bucketId;
            this.category = model.category;
            this.clientDownloadPath = model.clientDownloadPath;
            this.createTime = model.createTime;
            this.customBucketPath = model.customBucketPath;
            this.customBucketPathList = model.customBucketPathList;
            this.DBEndpointId = model.DBEndpointId;
            this.DBType = model.DBType;
            this.endpointItems = model.endpointItems;
            this.expireTime = model.expireTime;
            this.expired = model.expired;
            this.fileSystemId = model.fileSystemId;
            this.lockMode = model.lockMode;
            this.maxscaleEndpointId = model.maxscaleEndpointId;
            this.metaConnString = model.metaConnString;
            this.metaInstanceName = model.metaInstanceName;
            this.metaMxsConnString = model.metaMxsConnString;
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
            this.userDefaultAccName = model.userDefaultAccName;
            this.userDefaultAccSk = model.userDefaultAccSk;
            this.VPCId = model.VPCId;
            this.vSwitchId = model.vSwitchId;
            this.zoneId = model.zoneId;
        } 

        /**
         * AccelerateType.
         */
        public Builder accelerateType(String accelerateType) {
            this.accelerateType = accelerateType;
            return this;
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
         * CustomBucketPath.
         */
        public Builder customBucketPath(String customBucketPath) {
            this.customBucketPath = customBucketPath;
            return this;
        }

        /**
         * CustomBucketPathList.
         */
        public Builder customBucketPathList(java.util.List<CustomBucketPathList> customBucketPathList) {
            this.customBucketPathList = customBucketPathList;
            return this;
        }

        /**
         * DBEndpointId.
         */
        public Builder DBEndpointId(String DBEndpointId) {
            this.DBEndpointId = DBEndpointId;
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
         * EndpointItems.
         */
        public Builder endpointItems(java.util.List<EndpointItems> endpointItems) {
            this.endpointItems = endpointItems;
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
         * MaxscaleEndpointId.
         */
        public Builder maxscaleEndpointId(String maxscaleEndpointId) {
            this.maxscaleEndpointId = maxscaleEndpointId;
            return this;
        }

        /**
         * MetaConnString.
         */
        public Builder metaConnString(String metaConnString) {
            this.metaConnString = metaConnString;
            return this;
        }

        /**
         * MetaInstanceName.
         */
        public Builder metaInstanceName(String metaInstanceName) {
            this.metaInstanceName = metaInstanceName;
            return this;
        }

        /**
         * MetaMxsConnString.
         */
        public Builder metaMxsConnString(String metaMxsConnString) {
            this.metaMxsConnString = metaMxsConnString;
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
         * UserDefaultAccName.
         */
        public Builder userDefaultAccName(String userDefaultAccName) {
            this.userDefaultAccName = userDefaultAccName;
            return this;
        }

        /**
         * UserDefaultAccSk.
         */
        public Builder userDefaultAccSk(String userDefaultAccSk) {
            this.userDefaultAccSk = userDefaultAccSk;
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
    public static class CustomBucketPathList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bucket")
        private String bucket;

        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        private CustomBucketPathList(Builder builder) {
            this.bucket = builder.bucket;
            this.path = builder.path;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomBucketPathList create() {
            return builder().build();
        }

        /**
         * @return bucket
         */
        public String getBucket() {
            return this.bucket;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        public static final class Builder {
            private String bucket; 
            private String path; 

            private Builder() {
            } 

            private Builder(CustomBucketPathList model) {
                this.bucket = model.bucket;
                this.path = model.path;
            } 

            /**
             * Bucket.
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            /**
             * Path.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            public CustomBucketPathList build() {
                return new CustomBucketPathList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribePolarFsAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePolarFsAttributeResponseBody</p>
     */
    public static class AddressItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConnectionString")
        private String connectionString;

        @com.aliyun.core.annotation.NameInMap("IPAddress")
        private String IPAddress;

        @com.aliyun.core.annotation.NameInMap("NetType")
        private String netType;

        @com.aliyun.core.annotation.NameInMap("Port")
        private String port;

        @com.aliyun.core.annotation.NameInMap("VPCId")
        private String VPCId;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        private AddressItems(Builder builder) {
            this.connectionString = builder.connectionString;
            this.IPAddress = builder.IPAddress;
            this.netType = builder.netType;
            this.port = builder.port;
            this.VPCId = builder.VPCId;
            this.vSwitchId = builder.vSwitchId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AddressItems create() {
            return builder().build();
        }

        /**
         * @return connectionString
         */
        public String getConnectionString() {
            return this.connectionString;
        }

        /**
         * @return IPAddress
         */
        public String getIPAddress() {
            return this.IPAddress;
        }

        /**
         * @return netType
         */
        public String getNetType() {
            return this.netType;
        }

        /**
         * @return port
         */
        public String getPort() {
            return this.port;
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

        public static final class Builder {
            private String connectionString; 
            private String IPAddress; 
            private String netType; 
            private String port; 
            private String VPCId; 
            private String vSwitchId; 

            private Builder() {
            } 

            private Builder(AddressItems model) {
                this.connectionString = model.connectionString;
                this.IPAddress = model.IPAddress;
                this.netType = model.netType;
                this.port = model.port;
                this.VPCId = model.VPCId;
                this.vSwitchId = model.vSwitchId;
            } 

            /**
             * ConnectionString.
             */
            public Builder connectionString(String connectionString) {
                this.connectionString = connectionString;
                return this;
            }

            /**
             * IPAddress.
             */
            public Builder IPAddress(String IPAddress) {
                this.IPAddress = IPAddress;
                return this;
            }

            /**
             * NetType.
             */
            public Builder netType(String netType) {
                this.netType = netType;
                return this;
            }

            /**
             * Port.
             */
            public Builder port(String port) {
                this.port = port;
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

            public AddressItems build() {
                return new AddressItems(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribePolarFsAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePolarFsAttributeResponseBody</p>
     */
    public static class EndpointItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AddressItems")
        private java.util.List<AddressItems> addressItems;

        @com.aliyun.core.annotation.NameInMap("DBEndpointId")
        private String DBEndpointId;

        @com.aliyun.core.annotation.NameInMap("EndpointType")
        private String endpointType;

        private EndpointItems(Builder builder) {
            this.addressItems = builder.addressItems;
            this.DBEndpointId = builder.DBEndpointId;
            this.endpointType = builder.endpointType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EndpointItems create() {
            return builder().build();
        }

        /**
         * @return addressItems
         */
        public java.util.List<AddressItems> getAddressItems() {
            return this.addressItems;
        }

        /**
         * @return DBEndpointId
         */
        public String getDBEndpointId() {
            return this.DBEndpointId;
        }

        /**
         * @return endpointType
         */
        public String getEndpointType() {
            return this.endpointType;
        }

        public static final class Builder {
            private java.util.List<AddressItems> addressItems; 
            private String DBEndpointId; 
            private String endpointType; 

            private Builder() {
            } 

            private Builder(EndpointItems model) {
                this.addressItems = model.addressItems;
                this.DBEndpointId = model.DBEndpointId;
                this.endpointType = model.endpointType;
            } 

            /**
             * AddressItems.
             */
            public Builder addressItems(java.util.List<AddressItems> addressItems) {
                this.addressItems = addressItems;
                return this;
            }

            /**
             * DBEndpointId.
             */
            public Builder DBEndpointId(String DBEndpointId) {
                this.DBEndpointId = DBEndpointId;
                return this;
            }

            /**
             * EndpointType.
             */
            public Builder endpointType(String endpointType) {
                this.endpointType = endpointType;
                return this;
            }

            public EndpointItems build() {
                return new EndpointItems(this);
            } 

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
