// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetVideoInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetVideoInfoResponseBody</p>
 */
public class GetVideoInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Video")
    private Video video;

    private GetVideoInfoResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.video = builder.video;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVideoInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return video
     */
    public Video getVideo() {
        return this.video;
    }

    public static final class Builder {
        private String requestId; 
        private Video video; 

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
        public Builder video(Video video) {
            this.video = video;
            return this;
        }

        public GetVideoInfoResponseBody build() {
            return new GetVideoInfoResponseBody(this);
        } 

    } 

    public static class Snapshots extends TeaModel {
        @NameInMap("Snapshot")
        private java.util.List < String > snapshot;

        private Snapshots(Builder builder) {
            this.snapshot = builder.snapshot;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Snapshots create() {
            return builder().build();
        }

        /**
         * @return snapshot
         */
        public java.util.List < String > getSnapshot() {
            return this.snapshot;
        }

        public static final class Builder {
            private java.util.List < String > snapshot; 

            /**
             * Snapshot.
             */
            public Builder snapshot(java.util.List < String > snapshot) {
                this.snapshot = snapshot;
                return this;
            }

            public Snapshots build() {
                return new Snapshots(this);
            } 

        } 

    }
    public static class Video extends TeaModel {
        @NameInMap("AppId")
        private String appId;

        @NameInMap("AuditStatus")
        private String auditStatus;

        @NameInMap("CateId")
        private Long cateId;

        @NameInMap("CateName")
        private String cateName;

        @NameInMap("CoverURL")
        private String coverURL;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("CustomMediaInfo")
        private String customMediaInfo;

        @NameInMap("Description")
        private String description;

        @NameInMap("Duration")
        private Float duration;

        @NameInMap("ModificationTime")
        private String modificationTime;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("Size")
        private Long size;

        @NameInMap("Snapshots")
        private Snapshots snapshots;

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

        private Video(Builder builder) {
            this.appId = builder.appId;
            this.auditStatus = builder.auditStatus;
            this.cateId = builder.cateId;
            this.cateName = builder.cateName;
            this.coverURL = builder.coverURL;
            this.creationTime = builder.creationTime;
            this.customMediaInfo = builder.customMediaInfo;
            this.description = builder.description;
            this.duration = builder.duration;
            this.modificationTime = builder.modificationTime;
            this.regionId = builder.regionId;
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
         * @return auditStatus
         */
        public String getAuditStatus() {
            return this.auditStatus;
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
         * @return customMediaInfo
         */
        public String getCustomMediaInfo() {
            return this.customMediaInfo;
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
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
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
        public Snapshots getSnapshots() {
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
            private String auditStatus; 
            private Long cateId; 
            private String cateName; 
            private String coverURL; 
            private String creationTime; 
            private String customMediaInfo; 
            private String description; 
            private Float duration; 
            private String modificationTime; 
            private String regionId; 
            private Long size; 
            private Snapshots snapshots; 
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
             * The review status of the video. Valid values:
             * <p>
             * 
             * *   **Normal**: pass
             * *   **Blocked**: failed
             */
            public Builder auditStatus(String auditStatus) {
                this.auditStatus = auditStatus;
                return this;
            }

            /**
             * The category ID of the video.
             */
            public Builder cateId(Long cateId) {
                this.cateId = cateId;
                return this;
            }

            /**
             * The category of the video.
             */
            public Builder cateName(String cateName) {
                this.cateName = cateName;
                return this;
            }

            /**
             * The thumbnail URL of the video.
             */
            public Builder coverURL(String coverURL) {
                this.coverURL = coverURL;
                return this;
            }

            /**
             * The time when the video was created. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The information about the custom media asset.
             * <p>
             * > This parameter has been deprecated. This parameter is no longer returned when you call the API.
             */
            public Builder customMediaInfo(String customMediaInfo) {
                this.customMediaInfo = customMediaInfo;
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
             * The time when the video was updated. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder modificationTime(String modificationTime) {
                this.modificationTime = modificationTime;
                return this;
            }

            /**
             * The region ID of the Object Storage Service (OSS) bucket.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The size of the source video file. Unit: byte.
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * The URL array of video snapshots.
             */
            public Builder snapshots(Snapshots snapshots) {
                this.snapshots = snapshots;
                return this;
            }

            /**
             * The video status. Valid values:
             * <p>
             * *   **Uploading**: The video is being uploaded.
             * *   **UploadFail**: The video failed to be uploaded.
             * *   **UploadSucc**: The video has been uploaded.
             * *   **Transcoding**: The video is being transcoded.
             * *   **TranscodeFail**: The video failed to be transcoded.
             * *   **Blocked**: The video failed the review.
             * *   **Normal**: The video passed the review.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The OSS bucket where the video is stored.
             */
            public Builder storageLocation(String storageLocation) {
                this.storageLocation = storageLocation;
                return this;
            }

            /**
             * The tags of the video. Separate multiple tags with commas (,).
             */
            public Builder tags(String tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The ID of the template group.
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

            public Video build() {
                return new Video(this);
            } 

        } 

    }
}
