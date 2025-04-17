// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

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
 * {@link CreateMediaConvertTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateMediaConvertTaskRequest</p>
 */
public class CreateMediaConvertTaskRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AlignmentIndex")
    private Integer alignmentIndex;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CredentialConfig")
    private CredentialConfig credentialConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Notification")
    private Notification notification;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Sources")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Sources> sources;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.Map<String, ?> tags;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Targets")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Targets> targets;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    private CreateMediaConvertTaskRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.alignmentIndex = builder.alignmentIndex;
        this.credentialConfig = builder.credentialConfig;
        this.notification = builder.notification;
        this.projectName = builder.projectName;
        this.sources = builder.sources;
        this.tags = builder.tags;
        this.targets = builder.targets;
        this.userData = builder.userData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMediaConvertTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return alignmentIndex
     */
    public Integer getAlignmentIndex() {
        return this.alignmentIndex;
    }

    /**
     * @return credentialConfig
     */
    public CredentialConfig getCredentialConfig() {
        return this.credentialConfig;
    }

    /**
     * @return notification
     */
    public Notification getNotification() {
        return this.notification;
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @return sources
     */
    public java.util.List<Sources> getSources() {
        return this.sources;
    }

    /**
     * @return tags
     */
    public java.util.Map<String, ?> getTags() {
        return this.tags;
    }

    /**
     * @return targets
     */
    public java.util.List<Targets> getTargets() {
        return this.targets;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    public static final class Builder extends Request.Builder<CreateMediaConvertTaskRequest, Builder> {
        private String regionId; 
        private Integer alignmentIndex; 
        private CredentialConfig credentialConfig; 
        private Notification notification; 
        private String projectName; 
        private java.util.List<Sources> sources; 
        private java.util.Map<String, ?> tags; 
        private java.util.List<Targets> targets; 
        private String userData; 

        private Builder() {
            super();
        } 

        private Builder(CreateMediaConvertTaskRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.alignmentIndex = request.alignmentIndex;
            this.credentialConfig = request.credentialConfig;
            this.notification = request.notification;
            this.projectName = request.projectName;
            this.sources = request.sources;
            this.tags = request.tags;
            this.targets = request.targets;
            this.userData = request.userData;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The sequence number of the main media file in the concatenation list of media files. The main media file provides the default transcoding settings, such as the resolution and the frame rate, for videos and audios. Default value: <code>0</code>. A value of <code>0</code> specifies that the main media file is aligned with the first media file in the concatenation list.</p>
         */
        public Builder alignmentIndex(Integer alignmentIndex) {
            this.putQueryParameter("AlignmentIndex", alignmentIndex);
            this.alignmentIndex = alignmentIndex;
            return this;
        }

        /**
         * <p><strong>If you have no special requirements, leave this parameter empty.</strong></p>
         * <p>The authorization chain. For more information, see <a href="https://help.aliyun.com/document_detail/465340.html">Use authorization chains to access resources of other entities</a>.</p>
         */
        public Builder credentialConfig(CredentialConfig credentialConfig) {
            String credentialConfigShrink = shrink(credentialConfig, "CredentialConfig", "json");
            this.putQueryParameter("CredentialConfig", credentialConfigShrink);
            this.credentialConfig = credentialConfig;
            return this;
        }

        /**
         * <p>The notification settings. For more information, see &quot;Notification&quot;. For information about the asynchronous notification format, see <a href="https://help.aliyun.com/document_detail/2743997.html">Asynchronous notification format</a>.</p>
         */
        public Builder notification(Notification notification) {
            String notificationShrink = shrink(notification, "Notification", "json");
            this.putQueryParameter("Notification", notificationShrink);
            this.notification = notification;
            return this;
        }

        /**
         * <p>The name of the project. You can obtain the name of the project from the response of the <a href="https://help.aliyun.com/document_detail/478153.html">CreateProject</a> operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>immtest</p>
         */
        public Builder projectName(String projectName) {
            this.putQueryParameter("ProjectName", projectName);
            this.projectName = projectName;
            return this;
        }

        /**
         * <p>The source media files. If multiple files exist at the same time, the Concat feature is enabled. The video files are concatenated in the order of their URI inputs.</p>
         * <p>This parameter is required.</p>
         */
        public Builder sources(java.util.List<Sources> sources) {
            String sourcesShrink = shrink(sources, "Sources", "json");
            this.putQueryParameter("Sources", sourcesShrink);
            this.sources = sources;
            return this;
        }

        /**
         * <p>The custom tags. You can search for or filter asynchronous tasks by custom tag.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;test&quot;:&quot;val1&quot;}</p>
         */
        public Builder tags(java.util.Map<String, ?> tags) {
            String tagsShrink = shrink(tags, "Tags", "json");
            this.putQueryParameter("Tags", tagsShrink);
            this.tags = tags;
            return this;
        }

        /**
         * <p>The media processing tasks. You can specify multiple values for this parameter.</p>
         * <p>This parameter is required.</p>
         */
        public Builder targets(java.util.List<Targets> targets) {
            String targetsShrink = shrink(targets, "Targets", "json");
            this.putQueryParameter("Targets", targetsShrink);
            this.targets = targets;
            return this;
        }

        /**
         * <p>The custom information, which is returned as asynchronous notifications to facilitate notification management in your system. The maximum information length is 2,048 bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;ID&quot;: &quot;user1&quot;,&quot;Name&quot;: &quot;test-user1&quot;,&quot;Avatar&quot;: &quot;<a href="http://example.com?id=user1%22%7D">http://example.com?id=user1&quot;}</a></p>
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        @Override
        public CreateMediaConvertTaskRequest build() {
            return new CreateMediaConvertTaskRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateMediaConvertTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateMediaConvertTaskRequest</p>
     */
    public static class Subtitles extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Language")
        private String language;

        @com.aliyun.core.annotation.NameInMap("TimeOffset")
        private Double timeOffset;

        @com.aliyun.core.annotation.NameInMap("URI")
        private String URI;

        private Subtitles(Builder builder) {
            this.language = builder.language;
            this.timeOffset = builder.timeOffset;
            this.URI = builder.URI;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Subtitles create() {
            return builder().build();
        }

        /**
         * @return language
         */
        public String getLanguage() {
            return this.language;
        }

        /**
         * @return timeOffset
         */
        public Double getTimeOffset() {
            return this.timeOffset;
        }

        /**
         * @return URI
         */
        public String getURI() {
            return this.URI;
        }

        public static final class Builder {
            private String language; 
            private Double timeOffset; 
            private String URI; 

            private Builder() {
            } 

            private Builder(Subtitles model) {
                this.language = model.language;
                this.timeOffset = model.timeOffset;
                this.URI = model.URI;
            } 

            /**
             * <p>The subtitle language. If you specify this parameter, comply with the ISO 639-2 standard. This parameter is left empty by default.</p>
             * 
             * <strong>example:</strong>
             * <p>eng</p>
             */
            public Builder language(String language) {
                this.language = language;
                return this;
            }

            /**
             * <p>The time offset of the subtitle. Unit: seconds. Default value: 0.</p>
             * 
             * <strong>example:</strong>
             * <p>10.5</p>
             */
            public Builder timeOffset(Double timeOffset) {
                this.timeOffset = timeOffset;
                return this;
            }

            /**
             * <p>The URI of the Object Storage Service (OSS) bucket. Specify the value in the <code>oss://${Bucket}/${Object}</code> format. <code>${Bucket}</code> specifies the name of the OSS bucket that resides in the same region with the current project. <code>${Object}</code> specifies the complete path to the file whose name contains an extension. The following subtitle formats are supported: srt, vtt, mov_text, ass, dvd_sub, and pgs.</p>
             * 
             * <strong>example:</strong>
             * <p>oss://test-bucket/subtitles</p>
             */
            public Builder URI(String URI) {
                this.URI = URI;
                return this;
            }

            public Subtitles build() {
                return new Subtitles(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateMediaConvertTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateMediaConvertTaskRequest</p>
     */
    public static class Sources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlignMode")
        private String alignMode;

        @com.aliyun.core.annotation.NameInMap("Attached")
        private Boolean attached;

        @com.aliyun.core.annotation.NameInMap("DisableAudio")
        private Boolean disableAudio;

        @com.aliyun.core.annotation.NameInMap("DisableVideo")
        private Boolean disableVideo;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private Double duration;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Double startTime;

        @com.aliyun.core.annotation.NameInMap("Subtitles")
        private java.util.List<Subtitles> subtitles;

        @com.aliyun.core.annotation.NameInMap("URI")
        private String URI;

        private Sources(Builder builder) {
            this.alignMode = builder.alignMode;
            this.attached = builder.attached;
            this.disableAudio = builder.disableAudio;
            this.disableVideo = builder.disableVideo;
            this.duration = builder.duration;
            this.startTime = builder.startTime;
            this.subtitles = builder.subtitles;
            this.URI = builder.URI;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Sources create() {
            return builder().build();
        }

        /**
         * @return alignMode
         */
        public String getAlignMode() {
            return this.alignMode;
        }

        /**
         * @return attached
         */
        public Boolean getAttached() {
            return this.attached;
        }

        /**
         * @return disableAudio
         */
        public Boolean getDisableAudio() {
            return this.disableAudio;
        }

        /**
         * @return disableVideo
         */
        public Boolean getDisableVideo() {
            return this.disableVideo;
        }

        /**
         * @return duration
         */
        public Double getDuration() {
            return this.duration;
        }

        /**
         * @return startTime
         */
        public Double getStartTime() {
            return this.startTime;
        }

        /**
         * @return subtitles
         */
        public java.util.List<Subtitles> getSubtitles() {
            return this.subtitles;
        }

        /**
         * @return URI
         */
        public String getURI() {
            return this.URI;
        }

        public static final class Builder {
            private String alignMode; 
            private Boolean attached; 
            private Boolean disableAudio; 
            private Boolean disableVideo; 
            private Double duration; 
            private Double startTime; 
            private java.util.List<Subtitles> subtitles; 
            private String URI; 

            private Builder() {
            } 

            private Builder(Sources model) {
                this.alignMode = model.alignMode;
                this.attached = model.attached;
                this.disableAudio = model.disableAudio;
                this.disableVideo = model.disableVideo;
                this.duration = model.duration;
                this.startTime = model.startTime;
                this.subtitles = model.subtitles;
                this.URI = model.URI;
            } 

            /**
             * AlignMode.
             */
            public Builder alignMode(String alignMode) {
                this.alignMode = alignMode;
                return this;
            }

            /**
             * Attached.
             */
            public Builder attached(Boolean attached) {
                this.attached = attached;
                return this;
            }

            /**
             * DisableAudio.
             */
            public Builder disableAudio(Boolean disableAudio) {
                this.disableAudio = disableAudio;
                return this;
            }

            /**
             * DisableVideo.
             */
            public Builder disableVideo(Boolean disableVideo) {
                this.disableVideo = disableVideo;
                return this;
            }

            /**
             * <p>The transcoding duration of the media. Unit: seconds. Default value: 0. A value of 0 specifies that the transcoding duration lasts until the end of the video.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder duration(Double duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The start time of the media transcoding task. Unit: seconds. Valid values:</p>
             * <ul>
             * <li>0 (default): starts transcoding when the media starts playing.</li>
             * <li>n: starts transcoding n seconds after the media starts playing. n must be greater than 0.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder startTime(Double startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The subtitles. By default, this parameter is left empty.</p>
             */
            public Builder subtitles(java.util.List<Subtitles> subtitles) {
                this.subtitles = subtitles;
                return this;
            }

            /**
             * <p>The URI of the Object Storage Service (OSS) bucket. Specify the value in the <code>oss://${Bucket}/${Object}</code> format. <code>${Bucket}</code> specifies the name of the OSS bucket that resides in the same region with the current project. <code>${Object}</code> specifies the complete path to the file whose name contains an extension.</p>
             * 
             * <strong>example:</strong>
             * <p>oss://test-bucket/test-object</p>
             */
            public Builder URI(String URI) {
                this.URI = URI;
                return this;
            }

            public Sources build() {
                return new Sources(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateMediaConvertTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateMediaConvertTaskRequest</p>
     */
    public static class Segment extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Duration")
        private Double duration;

        @com.aliyun.core.annotation.NameInMap("Format")
        private String format;

        @com.aliyun.core.annotation.NameInMap("StartNumber")
        private Integer startNumber;

        private Segment(Builder builder) {
            this.duration = builder.duration;
            this.format = builder.format;
            this.startNumber = builder.startNumber;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Segment create() {
            return builder().build();
        }

        /**
         * @return duration
         */
        public Double getDuration() {
            return this.duration;
        }

        /**
         * @return format
         */
        public String getFormat() {
            return this.format;
        }

        /**
         * @return startNumber
         */
        public Integer getStartNumber() {
            return this.startNumber;
        }

        public static final class Builder {
            private Double duration; 
            private String format; 
            private Integer startNumber; 

            private Builder() {
            } 

            private Builder(Segment model) {
                this.duration = model.duration;
                this.format = model.format;
                this.startNumber = model.startNumber;
            } 

            /**
             * <p>The duration of the segment. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder duration(Double duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The media segmentation mode. Valid values:</p>
             * <ul>
             * <li>hls</li>
             * <li>dash</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>hls</p>
             */
            public Builder format(String format) {
                this.format = format;
                return this;
            }

            /**
             * <p>The start sequence number. You can specify this parameter only if you set Format to hls. Default value: 0.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder startNumber(Integer startNumber) {
                this.startNumber = startNumber;
                return this;
            }

            public Segment build() {
                return new Segment(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateMediaConvertTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateMediaConvertTaskRequest</p>
     */
    public static class Targets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Audio")
        private TargetAudio audio;

        @com.aliyun.core.annotation.NameInMap("Container")
        private String container;

        @com.aliyun.core.annotation.NameInMap("Image")
        private TargetImage image;

        @com.aliyun.core.annotation.NameInMap("Segment")
        private Segment segment;

        @com.aliyun.core.annotation.NameInMap("Speed")
        private Float speed;

        @com.aliyun.core.annotation.NameInMap("StripMetadata")
        private Boolean stripMetadata;

        @com.aliyun.core.annotation.NameInMap("Subtitle")
        private TargetSubtitle subtitle;

        @com.aliyun.core.annotation.NameInMap("URI")
        private String URI;

        @com.aliyun.core.annotation.NameInMap("Video")
        private TargetVideo video;

        private Targets(Builder builder) {
            this.audio = builder.audio;
            this.container = builder.container;
            this.image = builder.image;
            this.segment = builder.segment;
            this.speed = builder.speed;
            this.stripMetadata = builder.stripMetadata;
            this.subtitle = builder.subtitle;
            this.URI = builder.URI;
            this.video = builder.video;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Targets create() {
            return builder().build();
        }

        /**
         * @return audio
         */
        public TargetAudio getAudio() {
            return this.audio;
        }

        /**
         * @return container
         */
        public String getContainer() {
            return this.container;
        }

        /**
         * @return image
         */
        public TargetImage getImage() {
            return this.image;
        }

        /**
         * @return segment
         */
        public Segment getSegment() {
            return this.segment;
        }

        /**
         * @return speed
         */
        public Float getSpeed() {
            return this.speed;
        }

        /**
         * @return stripMetadata
         */
        public Boolean getStripMetadata() {
            return this.stripMetadata;
        }

        /**
         * @return subtitle
         */
        public TargetSubtitle getSubtitle() {
            return this.subtitle;
        }

        /**
         * @return URI
         */
        public String getURI() {
            return this.URI;
        }

        /**
         * @return video
         */
        public TargetVideo getVideo() {
            return this.video;
        }

        public static final class Builder {
            private TargetAudio audio; 
            private String container; 
            private TargetImage image; 
            private Segment segment; 
            private Float speed; 
            private Boolean stripMetadata; 
            private TargetSubtitle subtitle; 
            private String URI; 
            private TargetVideo video; 

            private Builder() {
            } 

            private Builder(Targets model) {
                this.audio = model.audio;
                this.container = model.container;
                this.image = model.image;
                this.segment = model.segment;
                this.speed = model.speed;
                this.stripMetadata = model.stripMetadata;
                this.subtitle = model.subtitle;
                this.URI = model.URI;
                this.video = model.video;
            } 

            /**
             * <p>The audio processing settings.</p>
             * <blockquote>
             * <p> If you leave Audio empty and the first audio stream exists, the first audio stream is directly copied to the output file.</p>
             * </blockquote>
             */
            public Builder audio(TargetAudio audio) {
                this.audio = audio;
                return this;
            }

            /**
             * <p>The type of the media container.</p>
             * <ul>
             * <li><p>Valid values for audio and video containers: mp4, mkv, mov, asf, avi, mxf, ts, and flv.</p>
             * </li>
             * <li><p>Valid values only for audio containers: mp3, aac, flac, oga, ac3, and opus.</p>
             * <p>**</p>
             * <p><strong>Note</strong> Specify Container and URI at the same time. If you want to extract subtitles, capture frames, capture image sprites, or rotate media images, set Container and URI to null. In this case, Segment, Video, Audio, and Speed do not take effect.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>mp4</p>
             */
            public Builder container(String container) {
                this.container = container;
                return this;
            }

            /**
             * <p>The frame capturing, sprite capturing, and media rotation settings.</p>
             */
            public Builder image(TargetImage image) {
                this.image = image;
                return this;
            }

            /**
             * <p>The media segmentation settings. By default, no segmentation is performed.</p>
             */
            public Builder segment(Segment segment) {
                this.segment = segment;
                return this;
            }

            /**
             * <p>The playback speed of the media. Valid values: 0.5 to 2. Default value: 1.0.</p>
             * <blockquote>
             * <p> This parameter specifies the ratio of the non-regular playback speed of the transcoded media file to the default playback speed of the source media file.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1.0</p>
             */
            public Builder speed(Float speed) {
                this.speed = speed;
                return this;
            }

            /**
             * <p>Specifies whether to remove the metadata, such as <code>title</code> and <code>album</code>, from the media file. Default value: false.</p>
             */
            public Builder stripMetadata(Boolean stripMetadata) {
                this.stripMetadata = stripMetadata;
                return this;
            }

            /**
             * <p>The subtitle processing settings.</p>
             * <blockquote>
             * <p> If you leave Subtitle empty and the first subtitle stream exists, the first subtitle stream is directly copied to the output file.</p>
             * </blockquote>
             */
            public Builder subtitle(TargetSubtitle subtitle) {
                this.subtitle = subtitle;
                return this;
            }

            /**
             * <p>The URI of the OSS bucket in which you want to store the media transcoding output file.</p>
             * <p>Specify the value in the <code>oss://${Bucket}/${Object}</code> format. <code>${Bucket}</code> specifies the name of the OSS bucket that resides in the same region with the current project. <code>${Object}</code> specifies the complete path to the file whose name contains an extension.</p>
             * <ul>
             * <li><p>If the value of <strong>URI</strong> contains an extension, the endpoint of the OSS bucket matches the URI. If multiple media transcoding output files exist, the endpoints of the correspodning OSS buckets may be overwritten.****</p>
             * </li>
             * <li><p>If the value of <strong>URI</strong> does not contain an extension, the endpoint of the OSS bucket consists of the following parameters: <strong>URI</strong>, <strong>Container</strong>, and <strong>Segment</strong>. In the following examples, the value of <strong>URI</strong> is <code>oss://examplebucket/outputVideo</code>.</p>
             * <ul>
             * <li>If the value of <strong>Container</strong> is <code>mp4</code> and the value of <strong>Segment</strong> is null, the endpoint of the OSS bucket is <code>oss://examplebucket/outputVideo.mp4</code>.</li>
             * <li>If the value of <strong>Container</strong> is <code>ts</code> and the value of <strong>Format</strong> in <strong>Segment</strong> is <code>hls</code>, the endpoint of the OSS bucket is <code>oss://examplebucket/outputVideo.m3u8</code>. In addition, multiple ts files prefixed with <code>oss://examplebucket/outputVideo</code> are generated.</li>
             * </ul>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>oss://test-bucket/targets</p>
             */
            public Builder URI(String URI) {
                this.URI = URI;
                return this;
            }

            /**
             * <p>The video processing settings.</p>
             * <blockquote>
             * <p> If you leave Video empty and the first video stream exists, the first video stream is directly copied to the output file.</p>
             * </blockquote>
             */
            public Builder video(TargetVideo video) {
                this.video = video;
                return this;
            }

            public Targets build() {
                return new Targets(this);
            } 

        } 

    }
}
