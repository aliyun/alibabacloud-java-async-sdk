// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link ListImageResponseBody} extends {@link TeaModel}
 *
 * <p>ListImageResponseBody</p>
 */
public class ListImageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListImageResponseBody(Builder builder) {
        this.code = builder.code;
        this.count = builder.count;
        this.data = builder.data;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListImageResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Integer count; 
        private java.util.List<Data> data; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListImageResponseBody model) {
            this.code = model.code;
            this.count = model.count;
            this.data = model.data;
            this.message = model.message;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Count.
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListImageResponseBody build() {
            return new ListImageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListImageResponseBody} extends {@link TeaModel}
     *
     * <p>ListImageResponseBody</p>
     */
    public static class AppList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        private AppList(Builder builder) {
            this.appId = builder.appId;
            this.appName = builder.appName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AppList create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        public static final class Builder {
            private String appId; 
            private String appName; 

            private Builder() {
            } 

            private Builder(AppList model) {
                this.appId = model.appId;
                this.appName = model.appName;
            } 

            /**
             * AppId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * AppName.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            public AppList build() {
                return new AppList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListImageResponseBody} extends {@link TeaModel}
     *
     * <p>ListImageResponseBody</p>
     */
    public static class ImageRegionDistributeList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ImageId")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private String progress;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("VersionId")
        private String versionId;

        private ImageRegionDistributeList(Builder builder) {
            this.imageId = builder.imageId;
            this.progress = builder.progress;
            this.regionId = builder.regionId;
            this.status = builder.status;
            this.versionId = builder.versionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageRegionDistributeList create() {
            return builder().build();
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return versionId
         */
        public String getVersionId() {
            return this.versionId;
        }

        public static final class Builder {
            private String imageId; 
            private String progress; 
            private String regionId; 
            private String status; 
            private String versionId; 

            private Builder() {
            } 

            private Builder(ImageRegionDistributeList model) {
                this.imageId = model.imageId;
                this.progress = model.progress;
                this.regionId = model.regionId;
                this.status = model.status;
                this.versionId = model.versionId;
            } 

            /**
             * ImageId.
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * Progress.
             */
            public Builder progress(String progress) {
                this.progress = progress;
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
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * VersionId.
             */
            public Builder versionId(String versionId) {
                this.versionId = versionId;
                return this;
            }

            public ImageRegionDistributeList build() {
                return new ImageRegionDistributeList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListImageResponseBody} extends {@link TeaModel}
     *
     * <p>ListImageResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliUid")
        private Long aliUid;

        @com.aliyun.core.annotation.NameInMap("AppList")
        private java.util.List<AppList> appList;

        @com.aliyun.core.annotation.NameInMap("BaseImageId")
        private String baseImageId;

        @com.aliyun.core.annotation.NameInMap("BaseImageVersion")
        private String baseImageVersion;

        @com.aliyun.core.annotation.NameInMap("BizType")
        private Integer bizType;

        @com.aliyun.core.annotation.NameInMap("CompatibleMode")
        private Boolean compatibleMode;

        @com.aliyun.core.annotation.NameInMap("DataDiskSize")
        private Integer dataDiskSize;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Distro")
        private String distro;

        @com.aliyun.core.annotation.NameInMap("DriverList")
        private java.util.List<String> driverList;

        @com.aliyun.core.annotation.NameInMap("FeatureList")
        private java.util.List<String> featureList;

        @com.aliyun.core.annotation.NameInMap("FotaChannel")
        private String fotaChannel;

        @com.aliyun.core.annotation.NameInMap("FotaVersion")
        private String fotaVersion;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("ImageCreateMode")
        private String imageCreateMode;

        @com.aliyun.core.annotation.NameInMap("ImageId")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("ImageName")
        private String imageName;

        @com.aliyun.core.annotation.NameInMap("ImageRegionDistributeList")
        private java.util.List<ImageRegionDistributeList> imageRegionDistributeList;

        @com.aliyun.core.annotation.NameInMap("ImageRegionList")
        private java.util.List<String> imageRegionList;

        @com.aliyun.core.annotation.NameInMap("ImageType")
        private String imageType;

        @com.aliyun.core.annotation.NameInMap("Language")
        private String language;

        @com.aliyun.core.annotation.NameInMap("LatestVersionId")
        private String latestVersionId;

        @com.aliyun.core.annotation.NameInMap("OnlineVersion")
        private Boolean onlineVersion;

        @com.aliyun.core.annotation.NameInMap("OnlineVersionId")
        private String onlineVersionId;

        @com.aliyun.core.annotation.NameInMap("OsType")
        private String osType;

        @com.aliyun.core.annotation.NameInMap("PackageType")
        private String packageType;

        @com.aliyun.core.annotation.NameInMap("ParentImageId")
        private String parentImageId;

        @com.aliyun.core.annotation.NameInMap("ParentImageVersion")
        private String parentImageVersion;

        @com.aliyun.core.annotation.NameInMap("Platform")
        private Integer platform;

        @com.aliyun.core.annotation.NameInMap("PlatformName")
        private String platformName;

        @com.aliyun.core.annotation.NameInMap("ProductType")
        private String productType;

        @com.aliyun.core.annotation.NameInMap("ProtocolType")
        private String protocolType;

        @com.aliyun.core.annotation.NameInMap("ResourceInstanceCategory")
        private String resourceInstanceCategory;

        @com.aliyun.core.annotation.NameInMap("SessionType")
        private String sessionType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("SupportedLanguageList")
        private java.util.List<String> supportedLanguageList;

        @com.aliyun.core.annotation.NameInMap("SystemDiskSize")
        private Integer systemDiskSize;

        @com.aliyun.core.annotation.NameInMap("VersionId")
        private String versionId;

        @com.aliyun.core.annotation.NameInMap("VersionName")
        private String versionName;

        @com.aliyun.core.annotation.NameInMap("VolumeEncryptionEnabled")
        private Boolean volumeEncryptionEnabled;

        @com.aliyun.core.annotation.NameInMap("VolumeEncryptionKey")
        private String volumeEncryptionKey;

        private Data(Builder builder) {
            this.aliUid = builder.aliUid;
            this.appList = builder.appList;
            this.baseImageId = builder.baseImageId;
            this.baseImageVersion = builder.baseImageVersion;
            this.bizType = builder.bizType;
            this.compatibleMode = builder.compatibleMode;
            this.dataDiskSize = builder.dataDiskSize;
            this.description = builder.description;
            this.distro = builder.distro;
            this.driverList = builder.driverList;
            this.featureList = builder.featureList;
            this.fotaChannel = builder.fotaChannel;
            this.fotaVersion = builder.fotaVersion;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.imageCreateMode = builder.imageCreateMode;
            this.imageId = builder.imageId;
            this.imageName = builder.imageName;
            this.imageRegionDistributeList = builder.imageRegionDistributeList;
            this.imageRegionList = builder.imageRegionList;
            this.imageType = builder.imageType;
            this.language = builder.language;
            this.latestVersionId = builder.latestVersionId;
            this.onlineVersion = builder.onlineVersion;
            this.onlineVersionId = builder.onlineVersionId;
            this.osType = builder.osType;
            this.packageType = builder.packageType;
            this.parentImageId = builder.parentImageId;
            this.parentImageVersion = builder.parentImageVersion;
            this.platform = builder.platform;
            this.platformName = builder.platformName;
            this.productType = builder.productType;
            this.protocolType = builder.protocolType;
            this.resourceInstanceCategory = builder.resourceInstanceCategory;
            this.sessionType = builder.sessionType;
            this.status = builder.status;
            this.supportedLanguageList = builder.supportedLanguageList;
            this.systemDiskSize = builder.systemDiskSize;
            this.versionId = builder.versionId;
            this.versionName = builder.versionName;
            this.volumeEncryptionEnabled = builder.volumeEncryptionEnabled;
            this.volumeEncryptionKey = builder.volumeEncryptionKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return aliUid
         */
        public Long getAliUid() {
            return this.aliUid;
        }

        /**
         * @return appList
         */
        public java.util.List<AppList> getAppList() {
            return this.appList;
        }

        /**
         * @return baseImageId
         */
        public String getBaseImageId() {
            return this.baseImageId;
        }

        /**
         * @return baseImageVersion
         */
        public String getBaseImageVersion() {
            return this.baseImageVersion;
        }

        /**
         * @return bizType
         */
        public Integer getBizType() {
            return this.bizType;
        }

        /**
         * @return compatibleMode
         */
        public Boolean getCompatibleMode() {
            return this.compatibleMode;
        }

        /**
         * @return dataDiskSize
         */
        public Integer getDataDiskSize() {
            return this.dataDiskSize;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return distro
         */
        public String getDistro() {
            return this.distro;
        }

        /**
         * @return driverList
         */
        public java.util.List<String> getDriverList() {
            return this.driverList;
        }

        /**
         * @return featureList
         */
        public java.util.List<String> getFeatureList() {
            return this.featureList;
        }

        /**
         * @return fotaChannel
         */
        public String getFotaChannel() {
            return this.fotaChannel;
        }

        /**
         * @return fotaVersion
         */
        public String getFotaVersion() {
            return this.fotaVersion;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return imageCreateMode
         */
        public String getImageCreateMode() {
            return this.imageCreateMode;
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        /**
         * @return imageName
         */
        public String getImageName() {
            return this.imageName;
        }

        /**
         * @return imageRegionDistributeList
         */
        public java.util.List<ImageRegionDistributeList> getImageRegionDistributeList() {
            return this.imageRegionDistributeList;
        }

        /**
         * @return imageRegionList
         */
        public java.util.List<String> getImageRegionList() {
            return this.imageRegionList;
        }

        /**
         * @return imageType
         */
        public String getImageType() {
            return this.imageType;
        }

        /**
         * @return language
         */
        public String getLanguage() {
            return this.language;
        }

        /**
         * @return latestVersionId
         */
        public String getLatestVersionId() {
            return this.latestVersionId;
        }

        /**
         * @return onlineVersion
         */
        public Boolean getOnlineVersion() {
            return this.onlineVersion;
        }

        /**
         * @return onlineVersionId
         */
        public String getOnlineVersionId() {
            return this.onlineVersionId;
        }

        /**
         * @return osType
         */
        public String getOsType() {
            return this.osType;
        }

        /**
         * @return packageType
         */
        public String getPackageType() {
            return this.packageType;
        }

        /**
         * @return parentImageId
         */
        public String getParentImageId() {
            return this.parentImageId;
        }

        /**
         * @return parentImageVersion
         */
        public String getParentImageVersion() {
            return this.parentImageVersion;
        }

        /**
         * @return platform
         */
        public Integer getPlatform() {
            return this.platform;
        }

        /**
         * @return platformName
         */
        public String getPlatformName() {
            return this.platformName;
        }

        /**
         * @return productType
         */
        public String getProductType() {
            return this.productType;
        }

        /**
         * @return protocolType
         */
        public String getProtocolType() {
            return this.protocolType;
        }

        /**
         * @return resourceInstanceCategory
         */
        public String getResourceInstanceCategory() {
            return this.resourceInstanceCategory;
        }

        /**
         * @return sessionType
         */
        public String getSessionType() {
            return this.sessionType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return supportedLanguageList
         */
        public java.util.List<String> getSupportedLanguageList() {
            return this.supportedLanguageList;
        }

        /**
         * @return systemDiskSize
         */
        public Integer getSystemDiskSize() {
            return this.systemDiskSize;
        }

        /**
         * @return versionId
         */
        public String getVersionId() {
            return this.versionId;
        }

        /**
         * @return versionName
         */
        public String getVersionName() {
            return this.versionName;
        }

        /**
         * @return volumeEncryptionEnabled
         */
        public Boolean getVolumeEncryptionEnabled() {
            return this.volumeEncryptionEnabled;
        }

        /**
         * @return volumeEncryptionKey
         */
        public String getVolumeEncryptionKey() {
            return this.volumeEncryptionKey;
        }

        public static final class Builder {
            private Long aliUid; 
            private java.util.List<AppList> appList; 
            private String baseImageId; 
            private String baseImageVersion; 
            private Integer bizType; 
            private Boolean compatibleMode; 
            private Integer dataDiskSize; 
            private String description; 
            private String distro; 
            private java.util.List<String> driverList; 
            private java.util.List<String> featureList; 
            private String fotaChannel; 
            private String fotaVersion; 
            private String gmtCreate; 
            private String gmtModified; 
            private String imageCreateMode; 
            private String imageId; 
            private String imageName; 
            private java.util.List<ImageRegionDistributeList> imageRegionDistributeList; 
            private java.util.List<String> imageRegionList; 
            private String imageType; 
            private String language; 
            private String latestVersionId; 
            private Boolean onlineVersion; 
            private String onlineVersionId; 
            private String osType; 
            private String packageType; 
            private String parentImageId; 
            private String parentImageVersion; 
            private Integer platform; 
            private String platformName; 
            private String productType; 
            private String protocolType; 
            private String resourceInstanceCategory; 
            private String sessionType; 
            private String status; 
            private java.util.List<String> supportedLanguageList; 
            private Integer systemDiskSize; 
            private String versionId; 
            private String versionName; 
            private Boolean volumeEncryptionEnabled; 
            private String volumeEncryptionKey; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.aliUid = model.aliUid;
                this.appList = model.appList;
                this.baseImageId = model.baseImageId;
                this.baseImageVersion = model.baseImageVersion;
                this.bizType = model.bizType;
                this.compatibleMode = model.compatibleMode;
                this.dataDiskSize = model.dataDiskSize;
                this.description = model.description;
                this.distro = model.distro;
                this.driverList = model.driverList;
                this.featureList = model.featureList;
                this.fotaChannel = model.fotaChannel;
                this.fotaVersion = model.fotaVersion;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.imageCreateMode = model.imageCreateMode;
                this.imageId = model.imageId;
                this.imageName = model.imageName;
                this.imageRegionDistributeList = model.imageRegionDistributeList;
                this.imageRegionList = model.imageRegionList;
                this.imageType = model.imageType;
                this.language = model.language;
                this.latestVersionId = model.latestVersionId;
                this.onlineVersion = model.onlineVersion;
                this.onlineVersionId = model.onlineVersionId;
                this.osType = model.osType;
                this.packageType = model.packageType;
                this.parentImageId = model.parentImageId;
                this.parentImageVersion = model.parentImageVersion;
                this.platform = model.platform;
                this.platformName = model.platformName;
                this.productType = model.productType;
                this.protocolType = model.protocolType;
                this.resourceInstanceCategory = model.resourceInstanceCategory;
                this.sessionType = model.sessionType;
                this.status = model.status;
                this.supportedLanguageList = model.supportedLanguageList;
                this.systemDiskSize = model.systemDiskSize;
                this.versionId = model.versionId;
                this.versionName = model.versionName;
                this.volumeEncryptionEnabled = model.volumeEncryptionEnabled;
                this.volumeEncryptionKey = model.volumeEncryptionKey;
            } 

            /**
             * AliUid.
             */
            public Builder aliUid(Long aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * AppList.
             */
            public Builder appList(java.util.List<AppList> appList) {
                this.appList = appList;
                return this;
            }

            /**
             * BaseImageId.
             */
            public Builder baseImageId(String baseImageId) {
                this.baseImageId = baseImageId;
                return this;
            }

            /**
             * BaseImageVersion.
             */
            public Builder baseImageVersion(String baseImageVersion) {
                this.baseImageVersion = baseImageVersion;
                return this;
            }

            /**
             * BizType.
             */
            public Builder bizType(Integer bizType) {
                this.bizType = bizType;
                return this;
            }

            /**
             * CompatibleMode.
             */
            public Builder compatibleMode(Boolean compatibleMode) {
                this.compatibleMode = compatibleMode;
                return this;
            }

            /**
             * DataDiskSize.
             */
            public Builder dataDiskSize(Integer dataDiskSize) {
                this.dataDiskSize = dataDiskSize;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Distro.
             */
            public Builder distro(String distro) {
                this.distro = distro;
                return this;
            }

            /**
             * DriverList.
             */
            public Builder driverList(java.util.List<String> driverList) {
                this.driverList = driverList;
                return this;
            }

            /**
             * FeatureList.
             */
            public Builder featureList(java.util.List<String> featureList) {
                this.featureList = featureList;
                return this;
            }

            /**
             * FotaChannel.
             */
            public Builder fotaChannel(String fotaChannel) {
                this.fotaChannel = fotaChannel;
                return this;
            }

            /**
             * FotaVersion.
             */
            public Builder fotaVersion(String fotaVersion) {
                this.fotaVersion = fotaVersion;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * ImageCreateMode.
             */
            public Builder imageCreateMode(String imageCreateMode) {
                this.imageCreateMode = imageCreateMode;
                return this;
            }

            /**
             * ImageId.
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * ImageName.
             */
            public Builder imageName(String imageName) {
                this.imageName = imageName;
                return this;
            }

            /**
             * ImageRegionDistributeList.
             */
            public Builder imageRegionDistributeList(java.util.List<ImageRegionDistributeList> imageRegionDistributeList) {
                this.imageRegionDistributeList = imageRegionDistributeList;
                return this;
            }

            /**
             * ImageRegionList.
             */
            public Builder imageRegionList(java.util.List<String> imageRegionList) {
                this.imageRegionList = imageRegionList;
                return this;
            }

            /**
             * ImageType.
             */
            public Builder imageType(String imageType) {
                this.imageType = imageType;
                return this;
            }

            /**
             * Language.
             */
            public Builder language(String language) {
                this.language = language;
                return this;
            }

            /**
             * LatestVersionId.
             */
            public Builder latestVersionId(String latestVersionId) {
                this.latestVersionId = latestVersionId;
                return this;
            }

            /**
             * OnlineVersion.
             */
            public Builder onlineVersion(Boolean onlineVersion) {
                this.onlineVersion = onlineVersion;
                return this;
            }

            /**
             * OnlineVersionId.
             */
            public Builder onlineVersionId(String onlineVersionId) {
                this.onlineVersionId = onlineVersionId;
                return this;
            }

            /**
             * OsType.
             */
            public Builder osType(String osType) {
                this.osType = osType;
                return this;
            }

            /**
             * PackageType.
             */
            public Builder packageType(String packageType) {
                this.packageType = packageType;
                return this;
            }

            /**
             * ParentImageId.
             */
            public Builder parentImageId(String parentImageId) {
                this.parentImageId = parentImageId;
                return this;
            }

            /**
             * ParentImageVersion.
             */
            public Builder parentImageVersion(String parentImageVersion) {
                this.parentImageVersion = parentImageVersion;
                return this;
            }

            /**
             * Platform.
             */
            public Builder platform(Integer platform) {
                this.platform = platform;
                return this;
            }

            /**
             * PlatformName.
             */
            public Builder platformName(String platformName) {
                this.platformName = platformName;
                return this;
            }

            /**
             * ProductType.
             */
            public Builder productType(String productType) {
                this.productType = productType;
                return this;
            }

            /**
             * ProtocolType.
             */
            public Builder protocolType(String protocolType) {
                this.protocolType = protocolType;
                return this;
            }

            /**
             * ResourceInstanceCategory.
             */
            public Builder resourceInstanceCategory(String resourceInstanceCategory) {
                this.resourceInstanceCategory = resourceInstanceCategory;
                return this;
            }

            /**
             * SessionType.
             */
            public Builder sessionType(String sessionType) {
                this.sessionType = sessionType;
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
             * SupportedLanguageList.
             */
            public Builder supportedLanguageList(java.util.List<String> supportedLanguageList) {
                this.supportedLanguageList = supportedLanguageList;
                return this;
            }

            /**
             * SystemDiskSize.
             */
            public Builder systemDiskSize(Integer systemDiskSize) {
                this.systemDiskSize = systemDiskSize;
                return this;
            }

            /**
             * VersionId.
             */
            public Builder versionId(String versionId) {
                this.versionId = versionId;
                return this;
            }

            /**
             * VersionName.
             */
            public Builder versionName(String versionName) {
                this.versionName = versionName;
                return this;
            }

            /**
             * VolumeEncryptionEnabled.
             */
            public Builder volumeEncryptionEnabled(Boolean volumeEncryptionEnabled) {
                this.volumeEncryptionEnabled = volumeEncryptionEnabled;
                return this;
            }

            /**
             * VolumeEncryptionKey.
             */
            public Builder volumeEncryptionKey(String volumeEncryptionKey) {
                this.volumeEncryptionKey = volumeEncryptionKey;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
