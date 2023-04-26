// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListLiveRecordVideoResponseBody} extends {@link TeaModel}
 *
 * <p>ListLiveRecordVideoResponseBody</p>
 */
public class ListLiveRecordVideoResponseBody extends TeaModel {
    @NameInMap("LiveRecordVideoList")
    private LiveRecordVideoList liveRecordVideoList;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Total")
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
         * The total number of videos returned.
         */
        public Builder liveRecordVideoList(LiveRecordVideoList liveRecordVideoList) {
            this.liveRecordVideoList = liveRecordVideoList;
            return this;
        }

        /**
         * The description of the video.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The title of the video.
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
        @NameInMap("CateId")
        private Integer cateId;

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

        @NameInMap("ModifyTime")
        private String modifyTime;

        @NameInMap("Size")
        private Long size;

        @NameInMap("Snapshots")
        private Snapshots snapshots;

        @NameInMap("Status")
        private String status;

        @NameInMap("Tags")
        private String tags;

        @NameInMap("TemplateGroupId")
        private String templateGroupId;

        @NameInMap("Title")
        private String title;

        @NameInMap("VideoId")
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
             * The time when the video was created. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder cateId(Integer cateId) {
                this.cateId = cateId;
                return this;
            }

            /**
             * The name of the application.
             */
            public Builder cateName(String cateName) {
                this.cateName = cateName;
                return this;
            }

            /**
             * CoverURL.
             */
            public Builder coverURL(String coverURL) {
                this.coverURL = coverURL;
                return this;
            }

            /**
             * The beginning of the time range to query. The query is performed based on the time range during which the required live streams were recorded. Specify the time in the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time must be in UTC.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The name of the live stream.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Duration.
             */
            public Builder duration(Float duration) {
                this.duration = duration;
                return this;
            }

            /**
             * ModifyTime.
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * Queries live-to-VOD videos.
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * Snapshots.
             */
            public Builder snapshots(Snapshots snapshots) {
                this.snapshots = snapshots;
                return this;
            }

            /**
             * The ID of the playlist.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * 2017-01-11T13:00:00Z
             */
            public Builder tags(String tags) {
                this.tags = tags;
                return this;
            }

            /**
             * TemplateGroupId.
             */
            public Builder templateGroupId(String templateGroupId) {
                this.templateGroupId = templateGroupId;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * 10
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
        @NameInMap("AppName")
        private String appName;

        @NameInMap("DomainName")
        private String domainName;

        @NameInMap("PlaylistId")
        private String playlistId;

        @NameInMap("RecordEndTime")
        private String recordEndTime;

        @NameInMap("RecordStartTime")
        private String recordStartTime;

        @NameInMap("StreamName")
        private String streamName;

        @NameInMap("Video")
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
             * The information about the video.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * The tags of the video. Separate multiple tags with commas (,).
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * The last time when the video was updated. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder playlistId(String playlistId) {
                this.playlistId = playlistId;
                return this;
            }

            /**
             * The domain name of the recorded live stream.
             */
            public Builder recordEndTime(String recordEndTime) {
                this.recordEndTime = recordEndTime;
                return this;
            }

            /**
             * The array of video snapshot URLs.
             */
            public Builder recordStartTime(String recordStartTime) {
                this.recordStartTime = recordStartTime;
                return this;
            }

            /**
             * The end of the time range to query. The query is performed based on the time range during which the required live streams were recorded. The end time must be later than the start time. Specify the time in the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time must be in UTC.
             */
            public Builder streamName(String streamName) {
                this.streamName = streamName;
                return this;
            }

            /**
             * The name of the application that was used to record the live stream.
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
        @NameInMap("LiveRecordVideo")
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
