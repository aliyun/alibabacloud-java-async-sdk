// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
         * <p>The list of videos.</p>
         */
        public Builder liveRecordVideoList(LiveRecordVideoList liveRecordVideoList) {
            this.liveRecordVideoList = liveRecordVideoList;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>25818875-5F78-4A13-****-D7393642CA58</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of videos.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public ListLiveRecordVideoResponseBody build() {
            return new ListLiveRecordVideoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListLiveRecordVideoResponseBody} extends {@link TeaModel}
     *
     * <p>ListLiveRecordVideoResponseBody</p>
     */
    public static class Snapshots extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Snapshot")
        private java.util.List<String> snapshot;

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
        public java.util.List<String> getSnapshot() {
            return this.snapshot;
        }

        public static final class Builder {
            private java.util.List<String> snapshot; 

            /**
             * Snapshot.
             */
            public Builder snapshot(java.util.List<String> snapshot) {
                this.snapshot = snapshot;
                return this;
            }

            public Snapshots build() {
                return new Snapshots(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListLiveRecordVideoResponseBody} extends {@link TeaModel}
     *
     * <p>ListLiveRecordVideoResponseBody</p>
     */
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
             * <p>The ID of the video category.</p>
             * 
             * <strong>example:</strong>
             * <p>78</p>
             */
            public Builder cateId(Integer cateId) {
                this.cateId = cateId;
                return this;
            }

            /**
             * <p>The category of the video.</p>
             * 
             * <strong>example:</strong>
             * <p>Category name</p>
             */
            public Builder cateName(String cateName) {
                this.cateName = cateName;
                return this;
            }

            /**
             * <p>The URL of the video thumbnail.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.aliyundoc.com/coversample.jpg">https://example.aliyundoc.com/coversample.jpg</a></p>
             */
            public Builder coverURL(String coverURL) {
                this.coverURL = coverURL;
                return this;
            }

            /**
             * <p>The time when the audio or video file was created. The time is in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2017-12-08T07:40:56Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The description of the video file.</p>
             * 
             * <strong>example:</strong>
             * <p>Description of the ApsaraVideo VOD video</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The duration of the video file. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>135.6</p>
             */
            public Builder duration(Float duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The time when the video was updated. The time is in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2017-12-08T09:40:56Z</p>
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * <p>The size of the source video file. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>10897890</p>
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * <p>The array of video snapshot URLs.</p>
             */
            public Builder snapshots(Snapshots snapshots) {
                this.snapshots = snapshots;
                return this;
            }

            /**
             * <p>The status of the video. Valid values:</p>
             * <ul>
             * <li><strong>Uploading</strong></li>
             * <li><strong>UploadFail</strong></li>
             * <li><strong>UploadSuccess</strong></li>
             * <li><strong>Transcoding</strong></li>
             * <li><strong>TranscodeFail</strong></li>
             * <li><strong>Blocked</strong></li>
             * <li><strong>Normal</strong>: The video is normal.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The tags of the video. Multiple tags are separated with commas (,).</p>
             * 
             * <strong>example:</strong>
             * <p>tag1, tag2</p>
             */
            public Builder tags(String tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The ID of the transcoding template group.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder templateGroupId(String templateGroupId) {
                this.templateGroupId = templateGroupId;
                return this;
            }

            /**
             * <p>The title of the video.</p>
             * 
             * <strong>example:</strong>
             * <p>Title of the ApsaraVideo VOD video</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * <p>The ID of the video.</p>
             * 
             * <strong>example:</strong>
             * <p>93ab850b4f6f*****54b6e91d24d81d4</p>
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
    /**
     * 
     * {@link ListLiveRecordVideoResponseBody} extends {@link TeaModel}
     *
     * <p>ListLiveRecordVideoResponseBody</p>
     */
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
             * <p>The name of the app.</p>
             * 
             * <strong>example:</strong>
             * <p>testApp</p>
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * <p>The domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * <p>The ID of the playlist.</p>
             * 
             * <strong>example:</strong>
             * <hr>
             */
            public Builder playlistId(String playlistId) {
                this.playlistId = playlistId;
                return this;
            }

            /**
             * <p>The recording end time. The time is in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2017-12-08T08:44:56Z</p>
             */
            public Builder recordEndTime(String recordEndTime) {
                this.recordEndTime = recordEndTime;
                return this;
            }

            /**
             * <p>The recording start time. The time is in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2017-12-08T07:40:56Z</p>
             */
            public Builder recordStartTime(String recordStartTime) {
                this.recordStartTime = recordStartTime;
                return this;
            }

            /**
             * <p>The name of the live-to-VOD file.</p>
             * 
             * <strong>example:</strong>
             * <p>live-test</p>
             */
            public Builder streamName(String streamName) {
                this.streamName = streamName;
                return this;
            }

            /**
             * <p>The information about the live-to-VOD file.</p>
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
    /**
     * 
     * {@link ListLiveRecordVideoResponseBody} extends {@link TeaModel}
     *
     * <p>ListLiveRecordVideoResponseBody</p>
     */
    public static class LiveRecordVideoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LiveRecordVideo")
        private java.util.List<LiveRecordVideo> liveRecordVideo;

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
        public java.util.List<LiveRecordVideo> getLiveRecordVideo() {
            return this.liveRecordVideo;
        }

        public static final class Builder {
            private java.util.List<LiveRecordVideo> liveRecordVideo; 

            /**
             * LiveRecordVideo.
             */
            public Builder liveRecordVideo(java.util.List<LiveRecordVideo> liveRecordVideo) {
                this.liveRecordVideo = liveRecordVideo;
                return this;
            }

            public LiveRecordVideoList build() {
                return new LiveRecordVideoList(this);
            } 

        } 

    }
}
