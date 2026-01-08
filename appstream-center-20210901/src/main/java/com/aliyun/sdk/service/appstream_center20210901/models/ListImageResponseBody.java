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
         * <p>The HTTP status code that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>22</p>
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The message that is returned for the request.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The page number returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>8737D130-BFD0-5D51-96F6-C08EB1139A25</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>true: The request is successful.</li>
         * <li>false: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
             * <p>The ID of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>ca-xxx</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The name of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>应用名称</p>
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
             * <p>System image IDs follow a descriptive, human-readable format, while custom image IDs are automatically generated by the system.</p>
             * 
             * <strong>example:</strong>
             * <p>imgc-xxx</p>
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * <p>The progress.</p>
             * 
             * <strong>example:</strong>
             * <p>70%</p>
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The supported region.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The status.</p>
             * 
             * <strong>example:</strong>
             * <p>INIT</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The version of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>iv-xxx</p>
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
    public static class TagList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private TagList(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TagList create() {
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

            private Builder(TagList model) {
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

            public TagList build() {
                return new TagList(this);
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

        @com.aliyun.core.annotation.NameInMap("EnvironmentId")
        private String environmentId;

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

        @com.aliyun.core.annotation.NameInMap("ImageIconUrl")
        private String imageIconUrl;

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

        @com.aliyun.core.annotation.NameInMap("Rating")
        private Integer rating;

        @com.aliyun.core.annotation.NameInMap("ResourceInstanceCategory")
        private String resourceInstanceCategory;

        @com.aliyun.core.annotation.NameInMap("Scene")
        private String scene;

        @com.aliyun.core.annotation.NameInMap("SessionType")
        private String sessionType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("SupportedLanguageList")
        private java.util.List<String> supportedLanguageList;

        @com.aliyun.core.annotation.NameInMap("SystemDiskSize")
        private Integer systemDiskSize;

        @com.aliyun.core.annotation.NameInMap("TagList")
        private java.util.List<TagList> tagList;

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
            this.environmentId = builder.environmentId;
            this.featureList = builder.featureList;
            this.fotaChannel = builder.fotaChannel;
            this.fotaVersion = builder.fotaVersion;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.imageCreateMode = builder.imageCreateMode;
            this.imageIconUrl = builder.imageIconUrl;
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
            this.rating = builder.rating;
            this.resourceInstanceCategory = builder.resourceInstanceCategory;
            this.scene = builder.scene;
            this.sessionType = builder.sessionType;
            this.status = builder.status;
            this.supportedLanguageList = builder.supportedLanguageList;
            this.systemDiskSize = builder.systemDiskSize;
            this.tagList = builder.tagList;
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
         * @return environmentId
         */
        public String getEnvironmentId() {
            return this.environmentId;
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
         * @return imageIconUrl
         */
        public String getImageIconUrl() {
            return this.imageIconUrl;
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
         * @return rating
         */
        public Integer getRating() {
            return this.rating;
        }

        /**
         * @return resourceInstanceCategory
         */
        public String getResourceInstanceCategory() {
            return this.resourceInstanceCategory;
        }

        /**
         * @return scene
         */
        public String getScene() {
            return this.scene;
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
         * @return tagList
         */
        public java.util.List<TagList> getTagList() {
            return this.tagList;
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
            private String environmentId; 
            private java.util.List<String> featureList; 
            private String fotaChannel; 
            private String fotaVersion; 
            private String gmtCreate; 
            private String gmtModified; 
            private String imageCreateMode; 
            private String imageIconUrl; 
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
            private Integer rating; 
            private String resourceInstanceCategory; 
            private String scene; 
            private String sessionType; 
            private String status; 
            private java.util.List<String> supportedLanguageList; 
            private Integer systemDiskSize; 
            private java.util.List<TagList> tagList; 
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
                this.environmentId = model.environmentId;
                this.featureList = model.featureList;
                this.fotaChannel = model.fotaChannel;
                this.fotaVersion = model.fotaVersion;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.imageCreateMode = model.imageCreateMode;
                this.imageIconUrl = model.imageIconUrl;
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
                this.rating = model.rating;
                this.resourceInstanceCategory = model.resourceInstanceCategory;
                this.scene = model.scene;
                this.sessionType = model.sessionType;
                this.status = model.status;
                this.supportedLanguageList = model.supportedLanguageList;
                this.systemDiskSize = model.systemDiskSize;
                this.tagList = model.tagList;
                this.versionId = model.versionId;
                this.versionName = model.versionName;
                this.volumeEncryptionEnabled = model.volumeEncryptionEnabled;
                this.volumeEncryptionKey = model.volumeEncryptionKey;
            } 

            /**
             * <p>The tenant ID.</p>
             * 
             * <strong>example:</strong>
             * <p>123456789</p>
             */
            public Builder aliUid(Long aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * <p>The application configuration.</p>
             */
            public Builder appList(java.util.List<AppList> appList) {
                this.appList = appList;
                return this;
            }

            /**
             * <p>The base image ID.</p>
             * 
             * <strong>example:</strong>
             * <p>imgc-xxx</p>
             */
            public Builder baseImageId(String baseImageId) {
                this.baseImageId = baseImageId;
                return this;
            }

            /**
             * <p>The version of the base image.</p>
             * 
             * <strong>example:</strong>
             * <p>iv-xxx</p>
             */
            public Builder baseImageVersion(String baseImageVersion) {
                this.baseImageVersion = baseImageVersion;
                return this;
            }

            /**
             * <p>The service type.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder bizType(Integer bizType) {
                this.bizType = bizType;
                return this;
            }

            /**
             * <p>Specifies whether to use the compatibility mode.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder compatibleMode(Boolean compatibleMode) {
                this.compatibleMode = compatibleMode;
                return this;
            }

            /**
             * <p>The size of the data disk. Unit: GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder dataDiskSize(Integer dataDiskSize) {
                this.dataDiskSize = dataDiskSize;
                return this;
            }

            /**
             * <p>The description of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>描述</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the release.</p>
             * 
             * <strong>example:</strong>
             * <p>Ubuntu 22.04 64位</p>
             */
            public Builder distro(String distro) {
                this.distro = distro;
                return this;
            }

            /**
             * <p>The information about each driver.</p>
             */
            public Builder driverList(java.util.List<String> driverList) {
                this.driverList = driverList;
                return this;
            }

            /**
             * EnvironmentId.
             */
            public Builder environmentId(String environmentId) {
                this.environmentId = environmentId;
                return this;
            }

            /**
             * <p>The image feature tags.</p>
             */
            public Builder featureList(java.util.List<String> featureList) {
                this.featureList = featureList;
                return this;
            }

            /**
             * <blockquote>
             * <p> This parameter is not available for public use.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>镜像支持的fota渠道，暂未启用</p>
             */
            public Builder fotaChannel(String fotaChannel) {
                this.fotaChannel = fotaChannel;
                return this;
            }

            /**
             * <p>The FOTA version.</p>
             * 
             * <strong>example:</strong>
             * <p>2.3.0-xxx</p>
             */
            public Builder fotaVersion(String fotaVersion) {
                this.fotaVersion = fotaVersion;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-04-25 15:13:57</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The update time.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-04-25 15:13:57</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The image creation type.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>BY_SNAPSHOT_ID: The image is created from the snapshot or contains only a system disk.</li>
             * <li>BUILDER_MANUAL: The image is manually generated.</li>
             * <li>INSTANCE_AUTO: The image is automatically generated based on an instance.</li>
             * <li>BY_INSTANCE_ID: The image is created from an instance or contains both a system disk and data disks.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>BUILDER_MANUAL</p>
             */
            public Builder imageCreateMode(String imageCreateMode) {
                this.imageCreateMode = imageCreateMode;
                return this;
            }

            /**
             * ImageIconUrl.
             */
            public Builder imageIconUrl(String imageIconUrl) {
                this.imageIconUrl = imageIconUrl;
                return this;
            }

            /**
             * <p>System image IDs follow a descriptive, human-readable format, while custom image IDs are automatically generated by the system.</p>
             * 
             * <strong>example:</strong>
             * <p>imgc-xxxx</p>
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * <p>The image name.</p>
             * 
             * <strong>example:</strong>
             * <p>DemoImage</p>
             */
            public Builder imageName(String imageName) {
                this.imageName = imageName;
                return this;
            }

            /**
             * <p>Layered supported regions information.</p>
             */
            public Builder imageRegionDistributeList(java.util.List<ImageRegionDistributeList> imageRegionDistributeList) {
                this.imageRegionDistributeList = imageRegionDistributeList;
                return this;
            }

            /**
             * <p>The region ID.</p>
             */
            public Builder imageRegionList(java.util.List<String> imageRegionList) {
                this.imageRegionList = imageRegionList;
                return this;
            }

            /**
             * <p>The type of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>User</p>
             */
            public Builder imageType(String imageType) {
                this.imageType = imageType;
                return this;
            }

            /**
             * <p>The image language. When the packaging type is VHD or Container, the image inherits its properties from the ECS-type image within the same image bundle.</p>
             * 
             * <strong>example:</strong>
             * <p>zh-CN</p>
             */
            public Builder language(String language) {
                this.language = language;
                return this;
            }

            /**
             * <p>The latest sub-version of the image. (An image consists of multiple sub-versions.)</p>
             * 
             * <strong>example:</strong>
             * <p>iv-xxx</p>
             */
            public Builder latestVersionId(String latestVersionId) {
                this.latestVersionId = latestVersionId;
                return this;
            }

            /**
             * <p>Indicates whether the current version is the active version.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder onlineVersion(Boolean onlineVersion) {
                this.onlineVersion = onlineVersion;
                return this;
            }

            /**
             * <p>This image tag currently points to the specified sub-version of the parent image. (An image consists of multiple sub-versions.)</p>
             * 
             * <strong>example:</strong>
             * <p>iv-xxxx</p>
             */
            public Builder onlineVersionId(String onlineVersionId) {
                this.onlineVersionId = onlineVersionId;
                return this;
            }

            /**
             * <p>The type of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>Windows</p>
             */
            public Builder osType(String osType) {
                this.osType = osType;
                return this;
            }

            /**
             * <p>The image encapsulation type.</p>
             * 
             * <strong>example:</strong>
             * <p>ECS</p>
             */
            public Builder packageType(String packageType) {
                this.packageType = packageType;
                return this;
            }

            /**
             * <p>The ID of the parent image from which this image is derived. Note: This field is only applicable to custom images, as system images do not have a parent.</p>
             * 
             * <strong>example:</strong>
             * <p>imgc-xxx</p>
             */
            public Builder parentImageId(String parentImageId) {
                this.parentImageId = parentImageId;
                return this;
            }

            /**
             * <p>The version of the parent image.</p>
             * 
             * <strong>example:</strong>
             * <p>iv-xxx</p>
             */
            public Builder parentImageVersion(String parentImageVersion) {
                this.parentImageVersion = parentImageVersion;
                return this;
            }

            /**
             * <p>The operating system platform of the image.</p>
             * <blockquote>
             * <p> When the packaging type is VHD or Container, the image inherits its properties from the ECS-type image within the same image bundle.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Windows</p>
             */
            public Builder platform(Integer platform) {
                this.platform = platform;
                return this;
            }

            /**
             * <p>The name of the operating system platform.</p>
             * 
             * <strong>example:</strong>
             * <p>Windows Server 2022</p>
             */
            public Builder platformName(String platformName) {
                this.platformName = platformName;
                return this;
            }

            /**
             * <p>The product type.</p>
             * 
             * <strong>example:</strong>
             * <p>CloudApp</p>
             */
            public Builder productType(String productType) {
                this.productType = productType;
                return this;
            }

            /**
             * <p>The protocol type.</p>
             * 
             * <strong>example:</strong>
             * <p>ASP</p>
             */
            public Builder protocolType(String protocolType) {
                this.protocolType = protocolType;
                return this;
            }

            /**
             * Rating.
             */
            public Builder rating(Integer rating) {
                this.rating = rating;
                return this;
            }

            /**
             * <p>The types of resources that are supported by the images.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;eds.cpu.category&quot;]</p>
             */
            public Builder resourceInstanceCategory(String resourceInstanceCategory) {
                this.resourceInstanceCategory = resourceInstanceCategory;
                return this;
            }

            /**
             * Scene.
             */
            public Builder scene(String scene) {
                this.scene = scene;
                return this;
            }

            /**
             * <p>The type of the session.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>SINGLE_SESSION</li>
             * <li>MULTIPLE_SESSION</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SINGLE_SESSION</p>
             */
            public Builder sessionType(String sessionType) {
                this.sessionType = sessionType;
                return this;
            }

            /**
             * <p>The state of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>INIT</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The supported languages.</p>
             */
            public Builder supportedLanguageList(java.util.List<String> supportedLanguageList) {
                this.supportedLanguageList = supportedLanguageList;
                return this;
            }

            /**
             * <p>The size of the system disk. Unit: GiB.</p>
             * <blockquote>
             * <p> The system disk must be at least as large as the image.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>40</p>
             */
            public Builder systemDiskSize(Integer systemDiskSize) {
                this.systemDiskSize = systemDiskSize;
                return this;
            }

            /**
             * TagList.
             */
            public Builder tagList(java.util.List<TagList> tagList) {
                this.tagList = tagList;
                return this;
            }

            /**
             * <p>The version of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>iv-xxx</p>
             */
            public Builder versionId(String versionId) {
                this.versionId = versionId;
                return this;
            }

            /**
             * <p>The version number.</p>
             * 
             * <strong>example:</strong>
             * <p>v0.1.0</p>
             */
            public Builder versionName(String versionName) {
                this.versionName = versionName;
                return this;
            }

            /**
             * <p>Specifies whether to enable disk encryption.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder volumeEncryptionEnabled(Boolean volumeEncryptionEnabled) {
                this.volumeEncryptionEnabled = volumeEncryptionEnabled;
                return this;
            }

            /**
             * <p>The ID of the Key Management Service (KMS) key that is used to encrypt the disk.</p>
             * 
             * <strong>example:</strong>
             * <p>a7b3c0c8-xxxx</p>
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
