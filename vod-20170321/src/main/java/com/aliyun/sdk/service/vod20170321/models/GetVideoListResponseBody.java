// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetVideoListResponseBody} extends {@link TeaModel}
 *
 * <p>GetVideoListResponseBody</p>
 */
public class GetVideoListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Total")
    private Integer total;

    @NameInMap("VideoList")
    private VideoList videoList;

    private GetVideoListResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.total = builder.total;
        this.videoList = builder.videoList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVideoListResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    /**
     * @return videoList
     */
    public VideoList getVideoList() {
        return this.videoList;
    }

    public static final class Builder {
        private String requestId; 
        private Integer total; 
        private VideoList videoList; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of videos.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        /**
         * The information about the video. The information about a maximum of first 5,000 video records can be obtained in a single request.
         */
        public Builder videoList(VideoList videoList) {
            this.videoList = videoList;
            return this;
        }

        public GetVideoListResponseBody build() {
            return new GetVideoListResponseBody(this);
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

        @NameInMap("RestoreExpiration")
        private String restoreExpiration;

        @NameInMap("RestoreStatus")
        private String restoreStatus;

        @NameInMap("Size")
        private Long size;

        @NameInMap("Snapshots")
        private Snapshots snapshots;

        @NameInMap("Status")
        private String status;

        @NameInMap("StorageClass")
        private String storageClass;

        @NameInMap("StorageLocation")
        private String storageLocation;

        @NameInMap("Tags")
        private String tags;

        @NameInMap("Title")
        private String title;

        @NameInMap("VideoId")
        private String videoId;

        private Video(Builder builder) {
            this.appId = builder.appId;
            this.cateId = builder.cateId;
            this.cateName = builder.cateName;
            this.coverURL = builder.coverURL;
            this.creationTime = builder.creationTime;
            this.description = builder.description;
            this.duration = builder.duration;
            this.modificationTime = builder.modificationTime;
            this.restoreExpiration = builder.restoreExpiration;
            this.restoreStatus = builder.restoreStatus;
            this.size = builder.size;
            this.snapshots = builder.snapshots;
            this.status = builder.status;
            this.storageClass = builder.storageClass;
            this.storageLocation = builder.storageLocation;
            this.tags = builder.tags;
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
         * @return restoreExpiration
         */
        public String getRestoreExpiration() {
            return this.restoreExpiration;
        }

        /**
         * @return restoreStatus
         */
        public String getRestoreStatus() {
            return this.restoreStatus;
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
         * @return storageClass
         */
        public String getStorageClass() {
            return this.storageClass;
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
            private String restoreExpiration; 
            private String restoreStatus; 
            private Long size; 
            private Snapshots snapshots; 
            private String status; 
            private String storageClass; 
            private String storageLocation; 
            private String tags; 
            private String title; 
            private String videoId; 

            /**
             * The ID of the application. Default value: **app-1000000**.
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
             * RestoreExpiration.
             */
            public Builder restoreExpiration(String restoreExpiration) {
                this.restoreExpiration = restoreExpiration;
                return this;
            }

            /**
             * RestoreStatus.
             */
            public Builder restoreStatus(String restoreStatus) {
                this.restoreStatus = restoreStatus;
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
            public Builder snapshots(Snapshots snapshots) {
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
             * StorageClass.
             */
            public Builder storageClass(String storageClass) {
                this.storageClass = storageClass;
                return this;
            }

            /**
             * The OSS bucket where the video file is stored.
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
    public static class VideoList extends TeaModel {
        @NameInMap("Video")
        private java.util.List < Video> video;

        private VideoList(Builder builder) {
            this.video = builder.video;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VideoList create() {
            return builder().build();
        }

        /**
         * @return video
         */
        public java.util.List < Video> getVideo() {
            return this.video;
        }

        public static final class Builder {
            private java.util.List < Video> video; 

            /**
             * Video.
             */
            public Builder video(java.util.List < Video> video) {
                this.video = video;
                return this;
            }

            public VideoList build() {
                return new VideoList(this);
            } 

        } 

    }
}
