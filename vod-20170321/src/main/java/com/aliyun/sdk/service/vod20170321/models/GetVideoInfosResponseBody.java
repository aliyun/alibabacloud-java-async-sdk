// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetVideoInfosResponseBody} extends {@link TeaModel}
 *
 * <p>GetVideoInfosResponseBody</p>
 */
public class GetVideoInfosResponseBody extends TeaModel {
    @NameInMap("NonExistVideoIds")
    private java.util.List < String > nonExistVideoIds;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("VideoList")
    private java.util.List < VideoList> videoList;

    private GetVideoInfosResponseBody(Builder builder) {
        this.nonExistVideoIds = builder.nonExistVideoIds;
        this.requestId = builder.requestId;
        this.videoList = builder.videoList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVideoInfosResponseBody create() {
        return builder().build();
    }

    /**
     * @return nonExistVideoIds
     */
    public java.util.List < String > getNonExistVideoIds() {
        return this.nonExistVideoIds;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return videoList
     */
    public java.util.List < VideoList> getVideoList() {
        return this.videoList;
    }

    public static final class Builder {
        private java.util.List < String > nonExistVideoIds; 
        private String requestId; 
        private java.util.List < VideoList> videoList; 

        /**
         * The IDs of the videos that do not exist.
         */
        public Builder nonExistVideoIds(java.util.List < String > nonExistVideoIds) {
            this.nonExistVideoIds = nonExistVideoIds;
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
         * The information about the video.
         */
        public Builder videoList(java.util.List < VideoList> videoList) {
            this.videoList = videoList;
            return this;
        }

        public GetVideoInfosResponseBody build() {
            return new GetVideoInfosResponseBody(this);
        } 

    } 

    public static class VideoList extends TeaModel {
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

        @NameInMap("Duration")
        private Float duration;

        @NameInMap("ModificationTime")
        private String modificationTime;

        @NameInMap("Size")
        private Long size;

        @NameInMap("Snapshots")
        private java.util.List < String > snapshots;

        @NameInMap("Status")
        private String status;

        @NameInMap("StorageLocation")
        private String storageLocation;

        @NameInMap("Tags")
        private String tags;

        @NameInMap("TemplateGroupId")
        private String templateGroupId;

        @NameInMap("Title")
        private String title;

        @NameInMap("VideoId")
        private String videoId;

        private VideoList(Builder builder) {
            this.appId = builder.appId;
            this.cateId = builder.cateId;
            this.cateName = builder.cateName;
            this.coverURL = builder.coverURL;
            this.creationTime = builder.creationTime;
            this.description = builder.description;
            this.duration = builder.duration;
            this.modificationTime = builder.modificationTime;
            this.size = builder.size;
            this.snapshots = builder.snapshots;
            this.status = builder.status;
            this.storageLocation = builder.storageLocation;
            this.tags = builder.tags;
            this.templateGroupId = builder.templateGroupId;
            this.title = builder.title;
            this.videoId = builder.videoId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VideoList create() {
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
         * @return duration
         */
        public Float getDuration() {
            return this.duration;
        }

        /**
         * @return modificationTime
         */
        public String getModificationTime() {
            return this.modificationTime;
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
         * @return templateGroupId
         */
        public String getTemplateGroupId() {
            return this.templateGroupId;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
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
            private Float duration; 
            private String modificationTime; 
            private Long size; 
            private java.util.List < String > snapshots; 
            private String status; 
            private String storageLocation; 
            private String tags; 
            private String templateGroupId; 
            private String title; 
            private String videoId; 

            /**
             * The ID of the application.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * The ID of the video category.
             */
            public Builder cateId(Long cateId) {
                this.cateId = cateId;
                return this;
            }

            /**
             * The name of the video category.
             */
            public Builder cateName(String cateName) {
                this.cateName = cateName;
                return this;
            }

            /**
             * The URL of the video thumbnail.
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
             * The description of the video.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The duration of the video. Unit: seconds.
             */
            public Builder duration(Float duration) {
                this.duration = duration;
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
             * The size of the video mezzanine file. Unit: byte.
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * The URL array of video snapshots.
             */
            public Builder snapshots(java.util.List < String > snapshots) {
                this.snapshots = snapshots;
                return this;
            }

            /**
             * The status of the video. By default, videos in all states are returned. Multiple states are separated by commas (,). Valid values:
             * <p>
             * 
             * *   **Uploading**: The video is being uploaded.
             * *   **UploadFail**: The video fails to be uploaded.
             * *   **UploadSucc**: The video is uploaded.
             * *   **Transcoding**: The video is being transcoded.
             * *   **TranscodeFail**: The video fails to be transcoded.
             * *   **Blocked**: The video is blocked.
             * *   **Normal**: The video can be played.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The Object Storage Service (OSS) bucket where the video file is stored.
             */
            public Builder storageLocation(String storageLocation) {
                this.storageLocation = storageLocation;
                return this;
            }

            /**
             * The tags of the video. Multiple tags are separated by commas (,).
             */
            public Builder tags(String tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The ID of the template group that was used to transcode the video.
             */
            public Builder templateGroupId(String templateGroupId) {
                this.templateGroupId = templateGroupId;
                return this;
            }

            /**
             * The title of the video.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * The ID of the video.
             */
            public Builder videoId(String videoId) {
                this.videoId = videoId;
                return this;
            }

            public VideoList build() {
                return new VideoList(this);
            } 

        } 

    }
}
