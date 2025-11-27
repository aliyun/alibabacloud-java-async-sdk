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
         * <p>When performing media concatenation, the index of the primary media file (which provides the default transcoding parameters for <code>Video</code> and <code>Audio</code>, including resolution, frame rate, etc.) in the concatenation list. The default value is 0 (aligning with the first media file in the concatenation list).</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder alignmentIndex(Integer alignmentIndex) {
            this.putQueryParameter("AlignmentIndex", alignmentIndex);
            this.alignmentIndex = alignmentIndex;
            return this;
        }

        /**
         * <p><strong>If there are no special requirements, please leave this blank.</strong></p>
         * <p>Chain authorization configuration. For more information, see <a href="https://help.aliyun.com/document_detail/465340.html">Using Chain Authorization to Access Other Entity Resources</a>.</p>
         */
        public Builder credentialConfig(CredentialConfig credentialConfig) {
            String credentialConfigShrink = shrink(credentialConfig, "CredentialConfig", "json");
            this.putQueryParameter("CredentialConfig", credentialConfigShrink);
            this.credentialConfig = credentialConfig;
            return this;
        }

        /**
         * <p>Notification configuration. For details, click Notification. The format of asynchronous notification messages can be found in <a href="https://help.aliyun.com/document_detail/2743997.html">Asynchronous Notification Message Format</a>.</p>
         */
        public Builder notification(Notification notification) {
            String notificationShrink = shrink(notification, "Notification", "json");
            this.putQueryParameter("Notification", notificationShrink);
            this.notification = notification;
            return this;
        }

        /**
         * <p>The name of the project. For how to obtain it, see <a href="https://help.aliyun.com/document_detail/478153.html">Creating a Project</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-project</p>
         */
        public Builder projectName(String projectName) {
            this.putQueryParameter("ProjectName", projectName);
            this.projectName = projectName;
            return this;
        }

        /**
         * <p>A list of media files. If the list contains more than one element, it indicates that the Concat (concatenation) function is enabled. The Concat order follows the sequence of the input video file URIs.</p>
         * <p>This parameter is required.</p>
         */
        public Builder sources(java.util.List<Sources> sources) {
            String sourcesShrink = shrink(sources, "Sources", "json");
            this.putQueryParameter("Sources", sourcesShrink);
            this.sources = sources;
            return this;
        }

        /**
         * <p>Custom tags used for searching and filtering asynchronous tasks.</p>
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
         * <p>List of media processing tasks, supporting multiple task configurations.</p>
         * <p>This parameter is required.</p>
         */
        public Builder targets(java.util.List<Targets> targets) {
            String targetsShrink = shrink(targets, "Targets", "json");
            this.putQueryParameter("Targets", targetsShrink);
            this.targets = targets;
            return this;
        }

        /**
         * <p>User-defined information that will be returned in asynchronous message notifications, used for convenient association and processing within your system. The maximum length is 2048 bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;ID&quot;: &quot;testuid&quot;,&quot;Name&quot;: &quot;test-user&quot;,&quot;Avatar&quot;: &quot;<a href="http://test.com/testuid%22%7D">http://test.com/testuid&quot;}</a></p>
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
             * <p>The language of the subtitle, referenced by ISO 639-2, with a default value of empty.</p>
             * 
             * <strong>example:</strong>
             * <p>eng</p>
             */
            public Builder language(String language) {
                this.language = language;
                return this;
            }

            /**
             * <p>The subtitle delay time, in seconds, with a default value of 0.</p>
             * 
             * <strong>example:</strong>
             * <p>10.5</p>
             */
            public Builder timeOffset(Double timeOffset) {
                this.timeOffset = timeOffset;
                return this;
            }

            /**
             * <p>The OSS address rule is <code>oss://${Bucket}/${Object}</code>, where <code>${Bucket}</code> is the name of the OSS Bucket in the same region (Region) as the current project, and <code>${Object}</code> is the complete path of the file including the file extension.
             * Supported subtitle formats include: srt, vtt, mov_text, ass, dvd_sub, pgs.</p>
             * 
             * <strong>example:</strong>
             * <p>oss://test-bucket/test-object</p>
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
             * <p>The alignment strategy for adding audio and video streams, with the following value range:</p>
             * <ul>
             * <li>false (default): No alignment.</li>
             * <li>loop: Loop the audio and video content to align.</li>
             * <li>pad: Align by padding silent frames and black video frames.<blockquote>
             * <ul>
             * <li>Only valid when the Attached parameter is true.</li>
             * </ul>
             * </blockquote>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder alignMode(String alignMode) {
                this.alignMode = alignMode;
                return this;
            }

            /**
             * <p>Add the current source media file as a synchronized audio or video stream to the output media file, with a default value of false.</p>
             * <blockquote>
             * <ul>
             * <li>The AlignmentIndex parameter pointing to the Attached parameter of the Source cannot be true.</li>
             * </ul>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder attached(Boolean attached) {
                this.attached = attached;
                return this;
            }

            /**
             * <p>Whether to disable the audio in the source media file. The value range is as follows:</p>
             * <ul>
             * <li>true: Disable.</li>
             * <li>false (default): Do not disable.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder disableAudio(Boolean disableAudio) {
                this.disableAudio = disableAudio;
                return this;
            }

            /**
             * <p>Whether to disable the video in the source media file. The value range is as follows:</p>
             * <ul>
             * <li>true: Disable.</li>
             * <li>false (default): Do not disable.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder disableVideo(Boolean disableVideo) {
                this.disableVideo = disableVideo;
                return this;
            }

            /**
             * <p>The duration of media transcoding, in seconds. The default value is 0, indicating until the end of the video.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder duration(Double duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The start time for media transcoding, in seconds. The value range is as follows:</p>
             * <ul>
             * <li>0 (default): Start transcoding from the beginning of the media.</li>
             * <li>n (greater than 0): Start transcoding n seconds after the beginning of the media.</li>
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
             * <p>A list of subtitles to add, which is empty by default.</p>
             */
            public Builder subtitles(java.util.List<Subtitles> subtitles) {
                this.subtitles = subtitles;
                return this;
            }

            /**
             * <p>The OSS address rule is <code>oss://${Bucket}/${Object}</code>, where <code>${Bucket}</code> is the name of the OSS Bucket in the same region (Region) as the current project, and <code>${Object}</code> is the complete path of the file including the file extension.</p>
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
             * <p>Segment length. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder duration(Double duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>Media slicing method. The value range is as follows:</p>
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
             * <p>Starting sequence number, supported only for hls, default is 0.</p>
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
             * <p>Audio processing parameter configuration.</p>
             * <blockquote>
             * <p>Notice: If Audio is null, the first audio stream (if present) will be directly copied to the output file.</notice></p>
             * </blockquote>
             */
            public Builder audio(TargetAudio audio) {
                this.audio = audio;
                return this;
            }

            /**
             * <p>Media container type. Available container types are as follows:</p>
             * <ul>
             * <li>Audio and video containers: mp4, mkv, mov, asf, avi, mxf, ts, flv</li>
             * <li>Audio containers: mp3, aac, flac, oga, ac3, opus<blockquote>
             * <p>Notice: Both Container and URI parameters need to be set. If only subtitle extraction, frame capture, sprite image capture, or media-to-gif conversion is performed, both Container and URI should be set to null, making the Segment, Video, Audio, and Speed parameters meaningless.</notice></p>
             * </blockquote>
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
             * <p>Configuration for frame capture, sprite image capture, and media to animated image conversion.</p>
             */
            public Builder image(TargetImage image) {
                this.image = image;
                return this;
            }

            /**
             * <p>Media segment settings, no segmentation by default.</p>
             */
            public Builder segment(Segment segment) {
                this.segment = segment;
                return this;
            }

            /**
             * <p>Media playback speed setting, with a value range of [0.5,1.0], default is 1.0.</p>
             * <blockquote>
             * <p>The ratio of the playback speed of the transcoded media file to the original media file, not a speed-up transcoding.</p>
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
             * <p>Removes metadata from the media file, such as <code>title</code>, <code>album</code>, etc. The default value is false.</p>
             */
            public Builder stripMetadata(Boolean stripMetadata) {
                this.stripMetadata = stripMetadata;
                return this;
            }

            /**
             * <p>Subtitle processing parameter configuration.</p>
             * <blockquote>
             * <p>Notice: If Subtitle is null, the first subtitle stream (if present) will be directly copied to the output file.</notice></p>
             * </blockquote>
             */
            public Builder subtitle(TargetSubtitle subtitle) {
                this.subtitle = subtitle;
                return this;
            }

            /**
             * <p>OSS address for the output file of media transcoding.</p>
             * <p>The OSS address rule is <code>oss://${Bucket}/${Object}</code>, where <code>${Bucket}</code> is the name of the OSS Bucket in the same region (Region) as the current project, and <code>${Object}</code> is the complete path of the file including the file extension.</p>
             * <ul>
             * <li>When <strong>URI</strong> has an extension, the OSS address for the transcoded media file will be <strong>URI</strong>. If there are multiple output files, they may overwrite each other.</li>
             * <li>When <strong>URI</strong> does not have an extension, the OSS address for the transcoded media file is determined by the <strong>URI</strong>, <strong>Container</strong>, and <strong>Segment</strong> parameters. For example, if <strong>URI</strong> is <code>oss://examplebucket/outputVideo</code>:<ul>
             * <li>When <strong>Container</strong> is <code>mp4</code> and <strong>Segment</strong> is empty, the generated media file&quot;s OSS address will be <code>oss://examplebucket/outputVideo.mp4</code>.</li>
             * <li>When <strong>Container</strong> is <code>ts</code> and <strong>Segment</strong>&quot;s <strong>Format</strong> is <code>hls</code>, it will generate an m3u8 file with the OSS address <code>oss://examplebucket/outputVideo.m3u8</code> and multiple ts files with the prefix <code>oss://examplebucket/outputVideo</code>.</li>
             * </ul>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>oss://test-bucket/test-target-object.mp4</p>
             */
            public Builder URI(String URI) {
                this.URI = URI;
                return this;
            }

            /**
             * <p>Video processing parameter configuration.</p>
             * <blockquote>
             * <p>Notice: If Video is null, the first video stream (if present) will be directly copied to the output file.</notice></p>
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
