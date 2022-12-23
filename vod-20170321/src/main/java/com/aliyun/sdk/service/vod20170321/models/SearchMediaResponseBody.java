// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchMediaResponseBody} extends {@link TeaModel}
 *
 * <p>SearchMediaResponseBody</p>
 */
public class SearchMediaResponseBody extends TeaModel {
    @NameInMap("MediaList")
    private java.util.List < MediaList> mediaList;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ScrollToken")
    private String scrollToken;

    @NameInMap("Total")
    private Long total;

    private SearchMediaResponseBody(Builder builder) {
        this.mediaList = builder.mediaList;
        this.requestId = builder.requestId;
        this.scrollToken = builder.scrollToken;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchMediaResponseBody create() {
        return builder().build();
    }

    /**
     * @return mediaList
     */
    public java.util.List < MediaList> getMediaList() {
        return this.mediaList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return scrollToken
     */
    public String getScrollToken() {
        return this.scrollToken;
    }

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private java.util.List < MediaList> mediaList; 
        private String requestId; 
        private String scrollToken; 
        private Long total; 

        /**
         * Details about media assets.
         */
        public Builder mediaList(java.util.List < MediaList> mediaList) {
            this.mediaList = mediaList;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The pagination identifier.
         */
        public Builder scrollToken(String scrollToken) {
            this.scrollToken = scrollToken;
            return this;
        }

        /**
         * The total number of data records that meet the specified filter criteria.
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public SearchMediaResponseBody build() {
            return new SearchMediaResponseBody(this);
        } 

    } 

    public static class Categories extends TeaModel {
        @NameInMap("CateId")
        private Long cateId;

        @NameInMap("CateName")
        private String cateName;

        @NameInMap("Level")
        private Long level;

        @NameInMap("ParentId")
        private Long parentId;

        private Categories(Builder builder) {
            this.cateId = builder.cateId;
            this.cateName = builder.cateName;
            this.level = builder.level;
            this.parentId = builder.parentId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Categories create() {
            return builder().build();
        }

        /**
         * @return cateId
         */
        public Long getCateId() {
            return this.cateId;
        }

        /**
         * @return cateName
         */
        public String getCateName() {
            return this.cateName;
        }

        /**
         * @return level
         */
        public Long getLevel() {
            return this.level;
        }

        /**
         * @return parentId
         */
        public Long getParentId() {
            return this.parentId;
        }

        public static final class Builder {
            private Long cateId; 
            private String cateName; 
            private Long level; 
            private Long parentId; 

            /**
             * The category ID of the auxiliary media asset.
             */
            public Builder cateId(Long cateId) {
                this.cateId = cateId;
                return this;
            }

            /**
             * The name of the category.
             */
            public Builder cateName(String cateName) {
                this.cateName = cateName;
                return this;
            }

            /**
             * The level of the category.
             */
            public Builder level(Long level) {
                this.level = level;
                return this;
            }

            /**
             * The ID of the parent category.
             */
            public Builder parentId(Long parentId) {
                this.parentId = parentId;
                return this;
            }

            public Categories build() {
                return new Categories(this);
            } 

        } 

    }
    public static class AttachedMedia extends TeaModel {
        @NameInMap("AppId")
        private String appId;

        @NameInMap("BusinessType")
        private String businessType;

        @NameInMap("Categories")
        private java.util.List < Categories> categories;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("MediaId")
        private String mediaId;

        @NameInMap("ModificationTime")
        private String modificationTime;

        @NameInMap("Status")
        private String status;

        @NameInMap("StorageLocation")
        private String storageLocation;

        @NameInMap("Tags")
        private String tags;

        @NameInMap("Title")
        private String title;

        @NameInMap("URL")
        private String URL;

        private AttachedMedia(Builder builder) {
            this.appId = builder.appId;
            this.businessType = builder.businessType;
            this.categories = builder.categories;
            this.creationTime = builder.creationTime;
            this.description = builder.description;
            this.mediaId = builder.mediaId;
            this.modificationTime = builder.modificationTime;
            this.status = builder.status;
            this.storageLocation = builder.storageLocation;
            this.tags = builder.tags;
            this.title = builder.title;
            this.URL = builder.URL;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AttachedMedia create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return businessType
         */
        public String getBusinessType() {
            return this.businessType;
        }

        /**
         * @return categories
         */
        public java.util.List < Categories> getCategories() {
            return this.categories;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return mediaId
         */
        public String getMediaId() {
            return this.mediaId;
        }

        /**
         * @return modificationTime
         */
        public String getModificationTime() {
            return this.modificationTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return storageLocation
         */
        public String getStorageLocation() {
            return this.storageLocation;
        }

        /**
         * @return tags
         */
        public String getTags() {
            return this.tags;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return URL
         */
        public String getURL() {
            return this.URL;
        }

        public static final class Builder {
            private String appId; 
            private String businessType; 
            private java.util.List < Categories> categories; 
            private String creationTime; 
            private String description; 
            private String mediaId; 
            private String modificationTime; 
            private String status; 
            private String storageLocation; 
            private String tags; 
            private String title; 
            private String URL; 

            /**
             * The ID of the application.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * The type of the auxiliary media asset. Valid values:
             * <p>
             * 
             * *   **watermark**
             * *   **subtitle**
             * *   **material**
             */
            public Builder businessType(String businessType) {
                this.businessType = businessType;
                return this;
            }

            /**
             * The list of category IDs.
             */
            public Builder categories(java.util.List < Categories> categories) {
                this.categories = categories;
                return this;
            }

            /**
             * The time when the auxiliary media asset was created. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The description of the auxiliary media asset.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The ID of the auxiliary media asset.
             */
            public Builder mediaId(String mediaId) {
                this.mediaId = mediaId;
                return this;
            }

            /**
             * The time when the auxiliary media asset was updated. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder modificationTime(String modificationTime) {
                this.modificationTime = modificationTime;
                return this;
            }

            /**
             * The status of the auxiliary media asset. Valid values:
             * <p>
             * 
             * *   **Uploading**: The auxiliary media asset is being uploaded. This is the initial status.
             * *   **Normal**: The auxiliary media asset is uploaded.
             * *   **UploadFail**: The auxiliary media asset fails to be uploaded.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The endpoint of the OSS bucket in which the auxiliary media asset is stored.
             */
            public Builder storageLocation(String storageLocation) {
                this.storageLocation = storageLocation;
                return this;
            }

            /**
             * The tags of the auxiliary media asset.
             */
            public Builder tags(String tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The title of the auxiliary media asset.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * The URL of the auxiliary media asset.
             */
            public Builder URL(String URL) {
                this.URL = URL;
                return this;
            }

            public AttachedMedia build() {
                return new AttachedMedia(this);
            } 

        } 

    }
    public static class Audio extends TeaModel {
        @NameInMap("AppId")
        private String appId;

        @NameInMap("AudioId")
        private String audioId;

        @NameInMap("CateId")
        private Long cateId;

        @NameInMap("CateName")
        private String cateName;

        @NameInMap("CoverURL")
        private String coverURL;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("DownloadSwitch")
        private String downloadSwitch;

        @NameInMap("Duration")
        private Float duration;

        @NameInMap("MediaSource")
        private String mediaSource;

        @NameInMap("ModificationTime")
        private String modificationTime;

        @NameInMap("PreprocessStatus")
        private String preprocessStatus;

        @NameInMap("Size")
        private Long size;

        @NameInMap("Snapshots")
        private java.util.List < String > snapshots;

        @NameInMap("SpriteSnapshots")
        private java.util.List < String > spriteSnapshots;

        @NameInMap("Status")
        private String status;

        @NameInMap("StorageLocation")
        private String storageLocation;

        @NameInMap("Tags")
        private String tags;

        @NameInMap("Title")
        private String title;

        @NameInMap("TranscodeMode")
        private String transcodeMode;

        private Audio(Builder builder) {
            this.appId = builder.appId;
            this.audioId = builder.audioId;
            this.cateId = builder.cateId;
            this.cateName = builder.cateName;
            this.coverURL = builder.coverURL;
            this.creationTime = builder.creationTime;
            this.description = builder.description;
            this.downloadSwitch = builder.downloadSwitch;
            this.duration = builder.duration;
            this.mediaSource = builder.mediaSource;
            this.modificationTime = builder.modificationTime;
            this.preprocessStatus = builder.preprocessStatus;
            this.size = builder.size;
            this.snapshots = builder.snapshots;
            this.spriteSnapshots = builder.spriteSnapshots;
            this.status = builder.status;
            this.storageLocation = builder.storageLocation;
            this.tags = builder.tags;
            this.title = builder.title;
            this.transcodeMode = builder.transcodeMode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Audio create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return audioId
         */
        public String getAudioId() {
            return this.audioId;
        }

        /**
         * @return cateId
         */
        public Long getCateId() {
            return this.cateId;
        }

        /**
         * @return cateName
         */
        public String getCateName() {
            return this.cateName;
        }

        /**
         * @return coverURL
         */
        public String getCoverURL() {
            return this.coverURL;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return downloadSwitch
         */
        public String getDownloadSwitch() {
            return this.downloadSwitch;
        }

        /**
         * @return duration
         */
        public Float getDuration() {
            return this.duration;
        }

        /**
         * @return mediaSource
         */
        public String getMediaSource() {
            return this.mediaSource;
        }

        /**
         * @return modificationTime
         */
        public String getModificationTime() {
            return this.modificationTime;
        }

        /**
         * @return preprocessStatus
         */
        public String getPreprocessStatus() {
            return this.preprocessStatus;
        }

        /**
         * @return size
         */
        public Long getSize() {
            return this.size;
        }

        /**
         * @return snapshots
         */
        public java.util.List < String > getSnapshots() {
            return this.snapshots;
        }

        /**
         * @return spriteSnapshots
         */
        public java.util.List < String > getSpriteSnapshots() {
            return this.spriteSnapshots;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return storageLocation
         */
        public String getStorageLocation() {
            return this.storageLocation;
        }

        /**
         * @return tags
         */
        public String getTags() {
            return this.tags;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return transcodeMode
         */
        public String getTranscodeMode() {
            return this.transcodeMode;
        }

        public static final class Builder {
            private String appId; 
            private String audioId; 
            private Long cateId; 
            private String cateName; 
            private String coverURL; 
            private String creationTime; 
            private String description; 
            private String downloadSwitch; 
            private Float duration; 
            private String mediaSource; 
            private String modificationTime; 
            private String preprocessStatus; 
            private Long size; 
            private java.util.List < String > snapshots; 
            private java.util.List < String > spriteSnapshots; 
            private String status; 
            private String storageLocation; 
            private String tags; 
            private String title; 
            private String transcodeMode; 

            /**
             * The ID of the application.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * The ID of the audio file.
             */
            public Builder audioId(String audioId) {
                this.audioId = audioId;
                return this;
            }

            /**
             * The category ID of the audio file.
             */
            public Builder cateId(Long cateId) {
                this.cateId = cateId;
                return this;
            }

            /**
             * The name of the category.
             */
            public Builder cateName(String cateName) {
                this.cateName = cateName;
                return this;
            }

            /**
             * The URL of the thumbnail.
             */
            public Builder coverURL(String coverURL) {
                this.coverURL = coverURL;
                return this;
            }

            /**
             * The time when the audio file was created. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The description of the audio file.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The download switch. The audio file can be downloaded offline only when the download switch is turned on. Valid values:
             * <p>
             * 
             * *   **on**
             * *   **off**
             */
            public Builder downloadSwitch(String downloadSwitch) {
                this.downloadSwitch = downloadSwitch;
                return this;
            }

            /**
             * The duration of the audio file.
             */
            public Builder duration(Float duration) {
                this.duration = duration;
                return this;
            }

            /**
             * The source. Valid values:
             * <p>
             * 
             * *   **general**: The audio file is uploaded by using ApsaraVideo VOD.
             * *   **short_video**: The audio file is uploaded to ApsaraVideo VOD by using the short video SDK. For more information, see [Introduction](~~53407~~).
             * *   **editing**: The audio file is uploaded to ApsaraVideo VOD after online editing and production. For more information, see [ProduceEditingProjectVideo](~~68536~~).
             * *   **live**: The audio stream is recorded and uploaded as a file to ApsaraVideo VOD.
             */
            public Builder mediaSource(String mediaSource) {
                this.mediaSource = mediaSource;
                return this;
            }

            /**
             * The time when the audio file was updated. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder modificationTime(String modificationTime) {
                this.modificationTime = modificationTime;
                return this;
            }

            /**
             * The preprocessing status. Only preprocessed videos can be used for live streaming in the production studio. Valid values:
             * <p>
             * 
             * *   **UnPreprocess**
             * *   **Preprocessing**
             * *   **PreprocessSucceed**
             * *   **PreprocessFailed**
             */
            public Builder preprocessStatus(String preprocessStatus) {
                this.preprocessStatus = preprocessStatus;
                return this;
            }

            /**
             * The size of the audio file.
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * The list of automatic snapshots.
             */
            public Builder snapshots(java.util.List < String > snapshots) {
                this.snapshots = snapshots;
                return this;
            }

            /**
             * The list of sprite snapshots.
             */
            public Builder spriteSnapshots(java.util.List < String > spriteSnapshots) {
                this.spriteSnapshots = spriteSnapshots;
                return this;
            }

            /**
             * The status of the audio file. Valid values:
             * <p>
             * 
             * *   **Uploading**
             * *   **Normal**
             * *   **UploadFail**
             * *   **Deleted**
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The endpoint of the OSS bucket in which the audio file is stored.
             */
            public Builder storageLocation(String storageLocation) {
                this.storageLocation = storageLocation;
                return this;
            }

            /**
             * The tags of the audio file.
             */
            public Builder tags(String tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The title of the audio file.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * The transcoding mode. Default value: FastTranscode. Valid values:
             * <p>
             * 
             * *   **FastTranscode**: The audio file is immediately transcoded after it is uploaded. You cannot play the file before it is transcoded.
             * *   **NoTranscode**: The audio file can be played without being transcoded. You can immediately play the file after it is uploaded.
             * *   **AsyncTranscode**: The audio file can be immediately played and asynchronously transcoded after it is uploaded.
             */
            public Builder transcodeMode(String transcodeMode) {
                this.transcodeMode = transcodeMode;
                return this;
            }

            public Audio build() {
                return new Audio(this);
            } 

        } 

    }
    public static class Image extends TeaModel {
        @NameInMap("AppId")
        private String appId;

        @NameInMap("CateId")
        private Long cateId;

        @NameInMap("CateName")
        private String cateName;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("ImageId")
        private String imageId;

        @NameInMap("ModificationTime")
        private String modificationTime;

        @NameInMap("Status")
        private String status;

        @NameInMap("StorageLocation")
        private String storageLocation;

        @NameInMap("Tags")
        private String tags;

        @NameInMap("Title")
        private String title;

        @NameInMap("URL")
        private String URL;

        private Image(Builder builder) {
            this.appId = builder.appId;
            this.cateId = builder.cateId;
            this.cateName = builder.cateName;
            this.creationTime = builder.creationTime;
            this.description = builder.description;
            this.imageId = builder.imageId;
            this.modificationTime = builder.modificationTime;
            this.status = builder.status;
            this.storageLocation = builder.storageLocation;
            this.tags = builder.tags;
            this.title = builder.title;
            this.URL = builder.URL;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Image create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return cateId
         */
        public Long getCateId() {
            return this.cateId;
        }

        /**
         * @return cateName
         */
        public String getCateName() {
            return this.cateName;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        /**
         * @return modificationTime
         */
        public String getModificationTime() {
            return this.modificationTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return storageLocation
         */
        public String getStorageLocation() {
            return this.storageLocation;
        }

        /**
         * @return tags
         */
        public String getTags() {
            return this.tags;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return URL
         */
        public String getURL() {
            return this.URL;
        }

        public static final class Builder {
            private String appId; 
            private Long cateId; 
            private String cateName; 
            private String creationTime; 
            private String description; 
            private String imageId; 
            private String modificationTime; 
            private String status; 
            private String storageLocation; 
            private String tags; 
            private String title; 
            private String URL; 

            /**
             * The ID of the application.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * The category ID of the image file.
             */
            public Builder cateId(Long cateId) {
                this.cateId = cateId;
                return this;
            }

            /**
             * The name of the category.
             */
            public Builder cateName(String cateName) {
                this.cateName = cateName;
                return this;
            }

            /**
             * The time when the image file was created. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The description of the image file.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The ID of the image file.
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * The time when the image file was updated. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder modificationTime(String modificationTime) {
                this.modificationTime = modificationTime;
                return this;
            }

            /**
             * The status of the image file.
             * <p>
             * 
             * *   **Uploading**: The image file is being uploaded. This is the initial status.
             * *   **Normal**: The image file is uploaded.
             * *   **UploadFail**: The image file fails to be uploaded.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The endpoint of the OSS bucket in which the image file is stored.
             */
            public Builder storageLocation(String storageLocation) {
                this.storageLocation = storageLocation;
                return this;
            }

            /**
             * The tags of the image file.
             */
            public Builder tags(String tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The title of the image file.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * The URL of the image file.
             */
            public Builder URL(String URL) {
                this.URL = URL;
                return this;
            }

            public Image build() {
                return new Image(this);
            } 

        } 

    }
    public static class Video extends TeaModel {
        @NameInMap("AppId")
        private String appId;

        @NameInMap("CateId")
        private Long cateId;

        @NameInMap("CateName")
        private String cateName;

        @NameInMap("CoverURL")
        private String coverURL;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("DownloadSwitch")
        private String downloadSwitch;

        @NameInMap("Duration")
        private Float duration;

        @NameInMap("MediaSource")
        private String mediaSource;

        @NameInMap("ModificationTime")
        private String modificationTime;

        @NameInMap("PreprocessStatus")
        private String preprocessStatus;

        @NameInMap("Size")
        private Long size;

        @NameInMap("Snapshots")
        private java.util.List < String > snapshots;

        @NameInMap("SpriteSnapshots")
        private java.util.List < String > spriteSnapshots;

        @NameInMap("Status")
        private String status;

        @NameInMap("StorageLocation")
        private String storageLocation;

        @NameInMap("Tags")
        private String tags;

        @NameInMap("Title")
        private String title;

        @NameInMap("TranscodeMode")
        private String transcodeMode;

        @NameInMap("VideoId")
        private String videoId;

        private Video(Builder builder) {
            this.appId = builder.appId;
            this.cateId = builder.cateId;
            this.cateName = builder.cateName;
            this.coverURL = builder.coverURL;
            this.creationTime = builder.creationTime;
            this.description = builder.description;
            this.downloadSwitch = builder.downloadSwitch;
            this.duration = builder.duration;
            this.mediaSource = builder.mediaSource;
            this.modificationTime = builder.modificationTime;
            this.preprocessStatus = builder.preprocessStatus;
            this.size = builder.size;
            this.snapshots = builder.snapshots;
            this.spriteSnapshots = builder.spriteSnapshots;
            this.status = builder.status;
            this.storageLocation = builder.storageLocation;
            this.tags = builder.tags;
            this.title = builder.title;
            this.transcodeMode = builder.transcodeMode;
            this.videoId = builder.videoId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Video create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return cateId
         */
        public Long getCateId() {
            return this.cateId;
        }

        /**
         * @return cateName
         */
        public String getCateName() {
            return this.cateName;
        }

        /**
         * @return coverURL
         */
        public String getCoverURL() {
            return this.coverURL;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return downloadSwitch
         */
        public String getDownloadSwitch() {
            return this.downloadSwitch;
        }

        /**
         * @return duration
         */
        public Float getDuration() {
            return this.duration;
        }

        /**
         * @return mediaSource
         */
        public String getMediaSource() {
            return this.mediaSource;
        }

        /**
         * @return modificationTime
         */
        public String getModificationTime() {
            return this.modificationTime;
        }

        /**
         * @return preprocessStatus
         */
        public String getPreprocessStatus() {
            return this.preprocessStatus;
        }

        /**
         * @return size
         */
        public Long getSize() {
            return this.size;
        }

        /**
         * @return snapshots
         */
        public java.util.List < String > getSnapshots() {
            return this.snapshots;
        }

        /**
         * @return spriteSnapshots
         */
        public java.util.List < String > getSpriteSnapshots() {
            return this.spriteSnapshots;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return storageLocation
         */
        public String getStorageLocation() {
            return this.storageLocation;
        }

        /**
         * @return tags
         */
        public String getTags() {
            return this.tags;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return transcodeMode
         */
        public String getTranscodeMode() {
            return this.transcodeMode;
        }

        /**
         * @return videoId
         */
        public String getVideoId() {
            return this.videoId;
        }

        public static final class Builder {
            private String appId; 
            private Long cateId; 
            private String cateName; 
            private String coverURL; 
            private String creationTime; 
            private String description; 
            private String downloadSwitch; 
            private Float duration; 
            private String mediaSource; 
            private String modificationTime; 
            private String preprocessStatus; 
            private Long size; 
            private java.util.List < String > snapshots; 
            private java.util.List < String > spriteSnapshots; 
            private String status; 
            private String storageLocation; 
            private String tags; 
            private String title; 
            private String transcodeMode; 
            private String videoId; 

            /**
             * The ID of the application.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * The category ID of the video file.
             */
            public Builder cateId(Long cateId) {
                this.cateId = cateId;
                return this;
            }

            /**
             * The name of the category.
             */
            public Builder cateName(String cateName) {
                this.cateName = cateName;
                return this;
            }

            /**
             * The URL of the thumbnail.
             */
            public Builder coverURL(String coverURL) {
                this.coverURL = coverURL;
                return this;
            }

            /**
             * The time when the video file was created. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The description of the video file.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The download switch. The video file can be downloaded offline only when the download switch is turned on. Valid values:
             * <p>
             * 
             * *   **on**
             * *   **off**
             */
            public Builder downloadSwitch(String downloadSwitch) {
                this.downloadSwitch = downloadSwitch;
                return this;
            }

            /**
             * The duration of the video file. Unit: seconds.
             */
            public Builder duration(Float duration) {
                this.duration = duration;
                return this;
            }

            /**
             * The source. Valid values:
             * <p>
             * 
             * *   **general**: The video file is uploaded by using ApsaraVideo VOD.
             * *   **short_video**: The video file is uploaded by using the short video SDK.
             * *   **editing**: The video file is produced after online editing.
             * *   **live**: The video stream is recorded and uploaded as a file.
             */
            public Builder mediaSource(String mediaSource) {
                this.mediaSource = mediaSource;
                return this;
            }

            /**
             * The time when the video file was updated. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder modificationTime(String modificationTime) {
                this.modificationTime = modificationTime;
                return this;
            }

            /**
             * The preprocessing status. Valid values:
             * <p>
             * 
             * *   **UnPreprocess**
             * *   **Preprocessing**
             * *   **PreprocessSucceed**
             * *   **PreprocessFailed**
             */
            public Builder preprocessStatus(String preprocessStatus) {
                this.preprocessStatus = preprocessStatus;
                return this;
            }

            /**
             * The size of the video file.
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * The list of automatic snapshots.
             */
            public Builder snapshots(java.util.List < String > snapshots) {
                this.snapshots = snapshots;
                return this;
            }

            /**
             * The list of sprite snapshots.
             */
            public Builder spriteSnapshots(java.util.List < String > spriteSnapshots) {
                this.spriteSnapshots = spriteSnapshots;
                return this;
            }

            /**
             * The status of the video file. Valid values:
             * <p>
             * 
             * *   **Uploading**
             * *   **UploadFail**
             * *   **UploadSucc**
             * *   **Transcoding**
             * *   **TranscodeFail**
             * *   **Blocked**
             * *   **Normal**
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The endpoint of the OSS bucket in which the video file is stored.
             */
            public Builder storageLocation(String storageLocation) {
                this.storageLocation = storageLocation;
                return this;
            }

            /**
             * The tags of the video file.
             */
            public Builder tags(String tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The title of the video file.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * The transcoding mode. Default value: FastTranscode. Valid values:
             * <p>
             * 
             * *   **FastTranscode**: The video file is immediately transcoded after it is uploaded. You cannot play the file before it is transcoded.
             * *   **NoTranscode**: The video file can be played without being transcoded. You can immediately play the file after it is uploaded.
             * *   **AsyncTranscode**: The video file can be immediately played and asynchronously transcoded after it is uploaded.
             */
            public Builder transcodeMode(String transcodeMode) {
                this.transcodeMode = transcodeMode;
                return this;
            }

            /**
             * The ID of the video file.
             */
            public Builder videoId(String videoId) {
                this.videoId = videoId;
                return this;
            }

            public Video build() {
                return new Video(this);
            } 

        } 

    }
    public static class MediaList extends TeaModel {
        @NameInMap("AttachedMedia")
        private AttachedMedia attachedMedia;

        @NameInMap("Audio")
        private Audio audio;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("Image")
        private Image image;

        @NameInMap("MediaId")
        private String mediaId;

        @NameInMap("MediaType")
        private String mediaType;

        @NameInMap("Video")
        private Video video;

        private MediaList(Builder builder) {
            this.attachedMedia = builder.attachedMedia;
            this.audio = builder.audio;
            this.creationTime = builder.creationTime;
            this.image = builder.image;
            this.mediaId = builder.mediaId;
            this.mediaType = builder.mediaType;
            this.video = builder.video;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MediaList create() {
            return builder().build();
        }

        /**
         * @return attachedMedia
         */
        public AttachedMedia getAttachedMedia() {
            return this.attachedMedia;
        }

        /**
         * @return audio
         */
        public Audio getAudio() {
            return this.audio;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return image
         */
        public Image getImage() {
            return this.image;
        }

        /**
         * @return mediaId
         */
        public String getMediaId() {
            return this.mediaId;
        }

        /**
         * @return mediaType
         */
        public String getMediaType() {
            return this.mediaType;
        }

        /**
         * @return video
         */
        public Video getVideo() {
            return this.video;
        }

        public static final class Builder {
            private AttachedMedia attachedMedia; 
            private Audio audio; 
            private String creationTime; 
            private Image image; 
            private String mediaId; 
            private String mediaType; 
            private Video video; 

            /**
             * [Details about auxiliary media assets](~~86991~~).
             */
            public Builder attachedMedia(AttachedMedia attachedMedia) {
                this.attachedMedia = attachedMedia;
                return this;
            }

            /**
             * [Details about audio files](~~86991~~).
             */
            public Builder audio(Audio audio) {
                this.audio = audio;
                return this;
            }

            /**
             * The time when the media asset was created. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * [Details about image files](~~86991~~).
             */
            public Builder image(Image image) {
                this.image = image;
                return this;
            }

            /**
             * The ID of the media asset.
             */
            public Builder mediaId(String mediaId) {
                this.mediaId = mediaId;
                return this;
            }

            /**
             * The type of the media asset. Valid values:
             * <p>
             * 
             * *   **video**
             * *   **audio**
             * *   **image**
             * *   **attached**
             */
            public Builder mediaType(String mediaType) {
                this.mediaType = mediaType;
                return this;
            }

            /**
             * [Details about video files](~~86991~~).
             */
            public Builder video(Video video) {
                this.video = video;
                return this;
            }

            public MediaList build() {
                return new MediaList(this);
            } 

        } 

    }
}
