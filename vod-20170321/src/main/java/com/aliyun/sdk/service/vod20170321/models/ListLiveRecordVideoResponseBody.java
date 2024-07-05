// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListLiveRecordVideoResponseBody} extends {@link TeaModel}
 *
 * <p>ListLiveRecordVideoResponseBody</p>
 */
public class ListLiveRecordVideoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LiveRecordVideoList")
    private LiveRecordVideoList liveRecordVideoList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Integer total;

    private ListLiveRecordVideoResponseBody(Builder builder) {
        this.liveRecordVideoList = builder.liveRecordVideoList;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLiveRecordVideoResponseBody create() {
        return builder().build();
    }

    /**
     * @return liveRecordVideoList
     */
    public LiveRecordVideoList getLiveRecordVideoList() {
        return this.liveRecordVideoList;
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

    public static final class Builder {
        private LiveRecordVideoList liveRecordVideoList; 
        private String requestId; 
        private Integer total; 

        /**
         * The list of videos.
         */
        public Builder liveRecordVideoList(LiveRecordVideoList liveRecordVideoList) {
            this.liveRecordVideoList = liveRecordVideoList;
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
         * The total number of videos.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public ListLiveRecordVideoResponseBody build() {
            return new ListLiveRecordVideoResponseBody(this);
        } 

    } 

    public static class Snapshots extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Snapshot")
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
        @com.aliyun.core.annotation.NameInMap("CateId")
        private Integer cateId;

        @com.aliyun.core.annotation.NameInMap("CateName")
        private String cateName;

        @com.aliyun.core.annotation.NameInMap("CoverURL")
        private String coverURL;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private Float duration;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private String modifyTime;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Long size;

        @com.aliyun.core.annotation.NameInMap("Snapshots")
        private Snapshots snapshots;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private String tags;

        @com.aliyun.core.annotation.NameInMap("TemplateGroupId")
        private String templateGroupId;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("VideoId")
        private String videoId;

        private Video(Builder builder) {
            this.cateId = builder.cateId;
            this.cateName = builder.cateName;
            this.coverURL = builder.coverURL;
            this.creationTime = builder.creationTime;
            this.description = builder.description;
            this.duration = builder.duration;
            this.modifyTime = builder.modifyTime;
            this.size = builder.size;
            this.snapshots = builder.snapshots;
            this.status = builder.status;
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
         * @return cateId
         */
        public Integer getCateId() {
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
         * @return modifyTime
         */
        public String getModifyTime() {
            return this.modifyTime;
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
            private Integer cateId; 
            private String cateName; 
            private String coverURL; 
            private String creationTime; 
            private String description; 
            private Float duration; 
            private String modifyTime; 
            private Long size; 
            private Snapshots snapshots; 
            private String status; 
            private String tags; 
            private String templateGroupId; 
            private String title; 
            private String videoId; 

            /**
             * The ID of the video category.
             */
            public Builder cateId(Integer cateId) {
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
             * The URL of the video thumbnail.
             */
            public Builder coverURL(String coverURL) {
                this.coverURL = coverURL;
                return this;
            }

            /**
             * The time when the audio or video file was created. The time is in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
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
             * The duration of the video file. Unit: seconds.
             */
            public Builder duration(Float duration) {
                this.duration = duration;
                return this;
            }

            /**
             * The time when the video was updated. The time is in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * The size of the source video file. Unit: bytes.
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * The array of video snapshot URLs.
             */
            public Builder snapshots(Snapshots snapshots) {
                this.snapshots = snapshots;
                return this;
            }

            /**
             * The status of the video. Valid values:
             * <p>
             * 
             * *   **Uploading**
             * *   **UploadFail**
             * *   **UploadSuccess**
             * *   **Transcoding**
             * *   **TranscodeFail**
             * *   **Blocked**
             * *   **Normal**: The video is normal.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The tags of the video. Multiple tags are separated with commas (,).
             */
            public Builder tags(String tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The ID of the transcoding template group.
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
    public static class LiveRecordVideo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("PlaylistId")
        private String playlistId;

        @com.aliyun.core.annotation.NameInMap("RecordEndTime")
        private String recordEndTime;

        @com.aliyun.core.annotation.NameInMap("RecordStartTime")
        private String recordStartTime;

        @com.aliyun.core.annotation.NameInMap("StreamName")
        private String streamName;

        @com.aliyun.core.annotation.NameInMap("Video")
        private Video video;

        private LiveRecordVideo(Builder builder) {
            this.appName = builder.appName;
            this.domainName = builder.domainName;
            this.playlistId = builder.playlistId;
            this.recordEndTime = builder.recordEndTime;
            this.recordStartTime = builder.recordStartTime;
            this.streamName = builder.streamName;
            this.video = builder.video;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LiveRecordVideo create() {
            return builder().build();
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return playlistId
         */
        public String getPlaylistId() {
            return this.playlistId;
        }

        /**
         * @return recordEndTime
         */
        public String getRecordEndTime() {
            return this.recordEndTime;
        }

        /**
         * @return recordStartTime
         */
        public String getRecordStartTime() {
            return this.recordStartTime;
        }

        /**
         * @return streamName
         */
        public String getStreamName() {
            return this.streamName;
        }

        /**
         * @return video
         */
        public Video getVideo() {
            return this.video;
        }

        public static final class Builder {
            private String appName; 
            private String domainName; 
            private String playlistId; 
            private String recordEndTime; 
            private String recordStartTime; 
            private String streamName; 
            private Video video; 

            /**
             * The name of the app.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * The domain name.
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * The ID of the playlist.
             */
            public Builder playlistId(String playlistId) {
                this.playlistId = playlistId;
                return this;
            }

            /**
             * The recording end time. The time is in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder recordEndTime(String recordEndTime) {
                this.recordEndTime = recordEndTime;
                return this;
            }

            /**
             * The recording start time. The time is in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder recordStartTime(String recordStartTime) {
                this.recordStartTime = recordStartTime;
                return this;
            }

            /**
             * The name of the live-to-VOD file.
             */
            public Builder streamName(String streamName) {
                this.streamName = streamName;
                return this;
            }

            /**
             * The information about the live-to-VOD file.
             */
            public Builder video(Video video) {
                this.video = video;
                return this;
            }

            public LiveRecordVideo build() {
                return new LiveRecordVideo(this);
            } 

        } 

    }
    public static class LiveRecordVideoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LiveRecordVideo")
        private java.util.List < LiveRecordVideo> liveRecordVideo;

        private LiveRecordVideoList(Builder builder) {
            this.liveRecordVideo = builder.liveRecordVideo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LiveRecordVideoList create() {
            return builder().build();
        }

        /**
         * @return liveRecordVideo
         */
        public java.util.List < LiveRecordVideo> getLiveRecordVideo() {
            return this.liveRecordVideo;
        }

        public static final class Builder {
            private java.util.List < LiveRecordVideo> liveRecordVideo; 

            /**
             * LiveRecordVideo.
             */
            public Builder liveRecordVideo(java.util.List < LiveRecordVideo> liveRecordVideo) {
                this.liveRecordVideo = liveRecordVideo;
                return this;
            }

            public LiveRecordVideoList build() {
                return new LiveRecordVideoList(this);
            } 

        } 

    }
}
