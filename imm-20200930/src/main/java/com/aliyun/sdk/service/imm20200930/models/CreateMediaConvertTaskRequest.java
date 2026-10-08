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
    @com.aliyun.core.annotation.NameInMap("TargetGroups")
    private java.util.List<TargetGroups> targetGroups;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Targets")
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
        this.targetGroups = builder.targetGroups;
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
     * @return targetGroups
     */
    public java.util.List<TargetGroups> getTargetGroups() {
        return this.targetGroups;
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
        private java.util.List<TargetGroups> targetGroups; 
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
            this.targetGroups = request.targetGroups;
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
         * <p>When concatenating media files, this specifies the index of the primary file in the Sources list. The default transcoding parameters (such as resolution and frame rate from the <code>Video</code> and <code>Audio</code> objects) are taken from this primary file. The default index is 0.</p>
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
         * <p><strong>You can leave this parameter empty if you do not have special requirements.</strong></p>
         * <p>The chained authorization configuration. For more information, see <a href="https://help.aliyun.com/document_detail/465340.html">Use chained authorization to access resources of other entities</a>.</p>
         */
        public Builder credentialConfig(CredentialConfig credentialConfig) {
            String credentialConfigShrink = shrink(credentialConfig, "CredentialConfig", "json");
            this.putQueryParameter("CredentialConfig", credentialConfigShrink);
            this.credentialConfig = credentialConfig;
            return this;
        }

        /**
         * <p>The message notification settings. For more information, click Notification. For information about the format of asynchronous notifications, see <a href="https://help.aliyun.com/document_detail/2743997.html">Asynchronous notification format</a>.</p>
         */
        public Builder notification(Notification notification) {
            String notificationShrink = shrink(notification, "Notification", "json");
            this.putQueryParameter("Notification", notificationShrink);
            this.notification = notification;
            return this;
        }

        /**
         * <p>The name of the project. For more information about how to obtain the project name, see <a href="https://help.aliyun.com/document_detail/478153.html">Create a project</a>.</p>
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
         * <p>A list of media files. If you provide more than one file, they are concatenated in the order of their URIs.</p>
         * <p>This parameter is required.</p>
         */
        public Builder sources(java.util.List<Sources> sources) {
            String sourcesShrink = shrink(sources, "Sources", "json");
            this.putQueryParameter("Sources", sourcesShrink);
            this.sources = sources;
            return this;
        }

        /**
         * <p>Custom tags for searching and filtering asynchronous tasks.</p>
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
         * <p>A list of media packaging tasks to convert and package the input media into HLS outputs. Each TargetGroup corresponds to one HLS master playlist.</p>
         */
        public Builder targetGroups(java.util.List<TargetGroups> targetGroups) {
            String targetGroupsShrink = shrink(targetGroups, "TargetGroups", "json");
            this.putQueryParameter("TargetGroups", targetGroupsShrink);
            this.targetGroups = targetGroups;
            return this;
        }

        /**
         * <p>A list of media processing tasks.</p>
         */
        public Builder targets(java.util.List<Targets> targets) {
            String targetsShrink = shrink(targets, "Targets", "json");
            this.putQueryParameter("Targets", targetsShrink);
            this.targets = targets;
            return this;
        }

        /**
         * <p>The custom user data. This data is returned in the asynchronous notification, allowing you to associate the notification with your internal system. The maximum length is 2,048 bytes.</p>
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
             * <p>The language of the subtitle. The value must comply with the ISO 639-2 standard.</p>
             * 
             * <strong>example:</strong>
             * <p>eng</p>
             */
            public Builder language(String language) {
                this.language = language;
                return this;
            }

            /**
             * <p>The subtitle delay, in seconds. The default value is 0.</p>
             * 
             * <strong>example:</strong>
             * <p>10.5</p>
             */
            public Builder timeOffset(Double timeOffset) {
                this.timeOffset = timeOffset;
                return this;
            }

            /**
             * <p>The OSS URI of the object. The URI must use the <code>oss://${Bucket}/${Object}</code> format, where <code>${Bucket}</code> is the name of an OSS bucket in the same region as the project, and <code>${Object}</code> is the full path to the object, including its file extension.
             * Supported subtitle formats include: srt, vtt, mov_text, ass, dvd_sub, and pgs.</p>
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
             * <p>The alignment mode for the added audio and video streams. Valid values include:</p>
             * <ul>
             * <li><p>false (default): No alignment is performed.</p>
             * </li>
             * <li><p>loop: Aligns content by looping the audio or video.</p>
             * </li>
             * <li><p>pad: Aligns content by padding with silent frames or black frames.</p>
             * </li>
             * </ul>
             * <blockquote>
             * <ul>
             * <li>This parameter only takes effect if Attached is set to true.</li>
             * </ul>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder alignMode(String alignMode) {
                this.alignMode = alignMode;
                return this;
            }

            /**
             * <p>If true, adds the current source media file to the output as a synchronized audio stream or video stream. The default is false.</p>
             * <blockquote>
             * <ul>
             * <li>You cannot set Attached to true for the source media file referenced by AlignmentIndex.</li>
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
             * <p>Specifies whether to disable the audio from the source media file. Valid values include:</p>
             * <ul>
             * <li><p>true: Disables the audio.</p>
             * </li>
             * <li><p>false (default): Includes the audio.</p>
             * </li>
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
             * <p>Specifies whether to disable the video from the source media file. Valid values include:</p>
             * <ul>
             * <li><p>true: Disables the video.</p>
             * </li>
             * <li><p>false (default): Includes the video.</p>
             * </li>
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
             * <p>The duration of media transcoding in seconds. The default value, 0, transcodes the media until its end.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder duration(Double duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The start time of media transcoding, in seconds. Valid values include:</p>
             * <ul>
             * <li><p>0 (default): Transcoding starts from the beginning of the media file.</p>
             * </li>
             * <li><p>n (a value greater than 0): Transcoding starts n seconds into the media file.</p>
             * </li>
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
             * <p>A list of subtitles to add.</p>
             */
            public Builder subtitles(java.util.List<Subtitles> subtitles) {
                this.subtitles = subtitles;
                return this;
            }

            /**
             * <p>The OSS URI of the object. The URI must use the <code>oss://${Bucket}/${Object}</code> format, where <code>${Bucket}</code> is the name of an OSS bucket in the same region as the project, and <code>${Object}</code> is the full path to the object, including its file extension.</p>
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
             * <p>The duration of each segment, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder duration(Double duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The media packaging format. Only <code>hls</code> is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>hls</p>
             */
            public Builder format(String format) {
                this.format = format;
                return this;
            }

            /**
             * <p>The starting sequence number for segments. The default is 0.</p>
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
    public static class TargetGroupsTargets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Audio")
        private TargetAudio audio;

        @com.aliyun.core.annotation.NameInMap("Container")
        private String container;

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

        private TargetGroupsTargets(Builder builder) {
            this.audio = builder.audio;
            this.container = builder.container;
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

        public static TargetGroupsTargets create() {
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
            private Segment segment; 
            private Float speed; 
            private Boolean stripMetadata; 
            private TargetSubtitle subtitle; 
            private String URI; 
            private TargetVideo video; 

            private Builder() {
            } 

            private Builder(TargetGroupsTargets model) {
                this.audio = model.audio;
                this.container = model.container;
                this.segment = model.segment;
                this.speed = model.speed;
                this.stripMetadata = model.stripMetadata;
                this.subtitle = model.subtitle;
                this.URI = model.URI;
                this.video = model.video;
            } 

            /**
             * <p>The audio processing parameters.</p>
             * <blockquote>
             * <p>Notice: If this parameter is left empty, the first audio stream, if it exists, is copied directly to the output file.</p>
             * </blockquote>
             */
            public Builder audio(TargetAudio audio) {
                this.audio = audio;
                return this;
            }

            /**
             * <p>The packaging container type. Only <code>mp4</code> and <code>ts</code> are supported.</p>
             * 
             * <strong>example:</strong>
             * <p>mp4</p>
             */
            public Builder container(String container) {
                this.container = container;
                return this;
            }

            /**
             * <p>The media packaging settings.</p>
             */
            public Builder segment(Segment segment) {
                this.segment = segment;
                return this;
            }

            /**
             * <p>The playback speed of the output media. The value must be between 0.5 and 1.0, inclusive. The default value is 1.0.</p>
             * <blockquote>
             * <p>This parameter specifies the default playback speed of the output file as a ratio of the source file\&quot;s speed. It does not perform speed-up transcoding.</p>
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
             * <p>If true, removes metadata from the output file. The default is false.</p>
             */
            public Builder stripMetadata(Boolean stripMetadata) {
                this.stripMetadata = stripMetadata;
                return this;
            }

            /**
             * <p>The subtitle processing parameters.</p>
             * <blockquote>
             * <p>Notice: You must use the <code>Subtitle.ExtractSubtitle</code> parameter to package subtitle streams. The <code>URI</code> in <code>Subtitle.ExtractSubtitle</code> must be in the same directory as or a subdirectory of <code>TargetGroups.URI</code>. The <code>Format</code> in <code>Subtitle.ExtractSubtitle</code> must be <code>vtt</code>. You only need to configure this parameter in one <code>Target</code> to package all subtitle streams.</p>
             * </blockquote>
             */
            public Builder subtitle(TargetSubtitle subtitle) {
                this.subtitle = subtitle;
                return this;
            }

            /**
             * <p>The OSS URI of the output HLS media playlist file for the subtask.</p>
             * <blockquote>
             * <p>Notice: This URI must be in the same directory as or a subdirectory of <code>TargetGroups.URI</code>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>oss://test-bucket/test-target-object.mp4</p>
             */
            public Builder URI(String URI) {
                this.URI = URI;
                return this;
            }

            /**
             * <p>The video processing parameters.</p>
             * <blockquote>
             * <p>Notice: If this parameter is left empty, the first video stream, if it exists, is copied directly to the output file.</p>
             * </blockquote>
             */
            public Builder video(TargetVideo video) {
                this.video = video;
                return this;
            }

            public TargetGroupsTargets build() {
                return new TargetGroupsTargets(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateMediaConvertTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateMediaConvertTaskRequest</p>
     */
    public static class TargetGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Targets")
        private java.util.List<TargetGroupsTargets> targets;

        @com.aliyun.core.annotation.NameInMap("URI")
        private String URI;

        private TargetGroups(Builder builder) {
            this.targets = builder.targets;
            this.URI = builder.URI;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TargetGroups create() {
            return builder().build();
        }

        /**
         * @return targets
         */
        public java.util.List<TargetGroupsTargets> getTargets() {
            return this.targets;
        }

        /**
         * @return URI
         */
        public String getURI() {
            return this.URI;
        }

        public static final class Builder {
            private java.util.List<TargetGroupsTargets> targets; 
            private String URI; 

            private Builder() {
            } 

            private Builder(TargetGroups model) {
                this.targets = model.targets;
                this.URI = model.URI;
            } 

            /**
             * <p>A list of media packaging subtasks. Each <code>Target</code> corresponds to a variant stream (<code>#EXT-X-STREAM-INF</code>) in the HLS master playlist and generates a corresponding HLS media playlist.</p>
             */
            public Builder targets(java.util.List<TargetGroupsTargets> targets) {
                this.targets = targets;
                return this;
            }

            /**
             * <p>The OSS URI of the output HLS master playlist file for the packaging task.</p>
             * 
             * <strong>example:</strong>
             * <p>oss://test-bucket/test-object/master.m3u8</p>
             */
            public Builder URI(String URI) {
                this.URI = URI;
                return this;
            }

            public TargetGroups build() {
                return new TargetGroups(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateMediaConvertTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateMediaConvertTaskRequest</p>
     */
    public static class AttachedPicture extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Stream")
        private java.util.List<Integer> stream;

        private AttachedPicture(Builder builder) {
            this.stream = builder.stream;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AttachedPicture create() {
            return builder().build();
        }

        /**
         * @return stream
         */
        public java.util.List<Integer> getStream() {
            return this.stream;
        }

        public static final class Builder {
            private java.util.List<Integer> stream; 

            private Builder() {
            } 

            private Builder(AttachedPicture model) {
                this.stream = model.stream;
            } 

            /**
             * <p>A list of indexes of the attached pictures in the source file to process. An empty list (default) indicates that no attached pictures are retained. An index of -1 indicates that all attached pictures are retained.</p>
             * <ul>
             * <li>Example: <code>[0,1]</code> processes the attached pictures with index 0 and 1; <code>[1]</code> processes the attached picture with index 1; <code>[-1]</code> processes all attached pictures.</li>
             * </ul>
             * <blockquote>
             * <p>If a specified index does not correspond to an existing attached picture, it is ignored.</p>
             * </blockquote>
             */
            public Builder stream(java.util.List<Integer> stream) {
                this.stream = stream;
                return this;
            }

            public AttachedPicture build() {
                return new AttachedPicture(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateMediaConvertTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateMediaConvertTaskRequest</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Stream")
        private java.util.List<Integer> stream;

        private Data(Builder builder) {
            this.stream = builder.stream;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return stream
         */
        public java.util.List<Integer> getStream() {
            return this.stream;
        }

        public static final class Builder {
            private java.util.List<Integer> stream; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.stream = model.stream;
            } 

            /**
             * <p>A list of indexes of the data streams in the source file to process. An empty list (default) indicates that no data streams are retained. An index of -1 indicates that all data streams are retained.</p>
             * <ul>
             * <li>Example: <code>[0,1]</code> processes the data streams with index 0 and 1; <code>[1]</code> processes the data stream with index 1; <code>[-1]</code> processes all data streams.</li>
             * </ul>
             * <blockquote>
             * <p>If a specified index does not correspond to an existing data stream, it is ignored.</p>
             * </blockquote>
             */
            public Builder stream(java.util.List<Integer> stream) {
                this.stream = stream;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateMediaConvertTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateMediaConvertTaskRequest</p>
     */
    public static class TargetsSegment extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Duration")
        private Double duration;

        @com.aliyun.core.annotation.NameInMap("Format")
        private String format;

        @com.aliyun.core.annotation.NameInMap("StartNumber")
        private Integer startNumber;

        private TargetsSegment(Builder builder) {
            this.duration = builder.duration;
            this.format = builder.format;
            this.startNumber = builder.startNumber;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TargetsSegment create() {
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

            private Builder(TargetsSegment model) {
                this.duration = model.duration;
                this.format = model.format;
                this.startNumber = model.startNumber;
            } 

            /**
             * <p>The duration of each segment, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder duration(Double duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The segmentation method. Valid values include:</p>
             * <ul>
             * <li><p>hls</p>
             * </li>
             * <li><p>dash</p>
             * </li>
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
             * <p>The starting sequence number. This parameter is supported only for HLS. The default value is 0.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder startNumber(Integer startNumber) {
                this.startNumber = startNumber;
                return this;
            }

            public TargetsSegment build() {
                return new TargetsSegment(this);
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
        @com.aliyun.core.annotation.NameInMap("AttachedPicture")
        private AttachedPicture attachedPicture;

        @com.aliyun.core.annotation.NameInMap("Audio")
        private TargetAudio audio;

        @com.aliyun.core.annotation.NameInMap("Container")
        private String container;

        @com.aliyun.core.annotation.NameInMap("Data")
        private Data data;

        @com.aliyun.core.annotation.NameInMap("Image")
        private TargetImage image;

        @com.aliyun.core.annotation.NameInMap("Segment")
        private TargetsSegment segment;

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
            this.attachedPicture = builder.attachedPicture;
            this.audio = builder.audio;
            this.container = builder.container;
            this.data = builder.data;
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
         * @return attachedPicture
         */
        public AttachedPicture getAttachedPicture() {
            return this.attachedPicture;
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
         * @return data
         */
        public Data getData() {
            return this.data;
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
        public TargetsSegment getSegment() {
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
            private AttachedPicture attachedPicture; 
            private TargetAudio audio; 
            private String container; 
            private Data data; 
            private TargetImage image; 
            private TargetsSegment segment; 
            private Float speed; 
            private Boolean stripMetadata; 
            private TargetSubtitle subtitle; 
            private String URI; 
            private TargetVideo video; 

            private Builder() {
            } 

            private Builder(Targets model) {
                this.attachedPicture = model.attachedPicture;
                this.audio = model.audio;
                this.container = model.container;
                this.data = model.data;
                this.image = model.image;
                this.segment = model.segment;
                this.speed = model.speed;
                this.stripMetadata = model.stripMetadata;
                this.subtitle = model.subtitle;
                this.URI = model.URI;
                this.video = model.video;
            } 

            /**
             * <p>Settings for retaining attached pictures.</p>
             * <blockquote>
             * <p>Notice: Retaining attached pictures is supported only when the <code>Container</code> parameter is set to <code>mp4</code> or <code>mkv</code>.</p>
             * </blockquote>
             */
            public Builder attachedPicture(AttachedPicture attachedPicture) {
                this.attachedPicture = attachedPicture;
                return this;
            }

            /**
             * <p>The audio processing parameters.</p>
             * <blockquote>
             * <p>Notice: If this parameter is left empty, the first audio stream, if it exists, is copied directly to the output file.</p>
             * </blockquote>
             */
            public Builder audio(TargetAudio audio) {
                this.audio = audio;
                return this;
            }

            /**
             * <p>The media container type. Valid container types include:</p>
             * <ul>
             * <li><p>Audio/video containers: mp4, mkv, mov, asf, avi, mxf, ts, flv</p>
             * </li>
             * <li><p>Audio-only containers: mp3, aac, flac, oga, ac3, opus</p>
             * <blockquote>
             * <p>Notice: </p>
             * </blockquote>
             * <p>The <code>Container</code> and <code>URI</code> parameters must be set together. To perform only subtitle extraction, frame capture, sprite generation, or animated image generation, leave both <code>Container</code> and <code>URI</code> empty. In this case, parameters such as <code>Segment</code>, <code>Video</code>, <code>Audio</code>, and <code>Speed</code> are ignored.</p>
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
             * <p>Settings for retaining data streams.</p>
             * <blockquote>
             * <p>Notice: Retaining data streams is supported only when the <code>Container</code> parameter is set to <code>mp4</code>.</p>
             * </blockquote>
             */
            public Builder data(Data data) {
                this.data = data;
                return this;
            }

            /**
             * <p>The parameters for frame capture, sprite generation, and animated image generation.</p>
             */
            public Builder image(TargetImage image) {
                this.image = image;
                return this;
            }

            /**
             * <p>Settings for media segmentation.</p>
             */
            public Builder segment(TargetsSegment segment) {
                this.segment = segment;
                return this;
            }

            /**
             * <p>The playback speed of the output media. The value must be between 0.5 and 1.0, inclusive. The default value is 1.0.</p>
             * <blockquote>
             * <p>This parameter specifies the default playback speed of the output file as a ratio of the source file\&quot;s speed. It does not perform speed-up transcoding.</p>
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
             * <p>If true, removes metadata such as <code>title</code> and <code>album</code> from the media file. The default is false.</p>
             */
            public Builder stripMetadata(Boolean stripMetadata) {
                this.stripMetadata = stripMetadata;
                return this;
            }

            /**
             * <p>The subtitle processing parameters.</p>
             * <blockquote>
             * <p>Notice: If this parameter is left empty, the first subtitle stream, if it exists, is copied directly to the output file.</p>
             * </blockquote>
             */
            public Builder subtitle(TargetSubtitle subtitle) {
                this.subtitle = subtitle;
                return this;
            }

            /**
             * <p>The OSS URI of the output file for media transcoding.</p>
             * <p>The URI must be in the <code>oss://${Bucket}/${Object}</code> format. In this format, <code>${Bucket}</code> is the name of the OSS bucket, which must be in the same region as the project, and <code>${Object}</code> is the full path to the object, including the file extension.</p>
             * <ul>
             * <li><p>If the <strong>URI</strong> has a file extension, all output media files are saved to this <strong>URI</strong>. If multiple files are generated, they will overwrite each other.</p>
             * </li>
             * <li><p>If the <strong>URI</strong> does not have a file extension, the final output URI is generated based on the <strong>URI</strong>, <strong>Container</strong>, and <strong>Segment</strong> parameters. For example, if the <strong>URI</strong> is <code>oss://examplebucket/outputVideo</code>:</p>
             * <ul>
             * <li><p>If <strong>Container</strong> is <code>mp4</code> and <strong>Segment</strong> is empty, the OSS URI of the generated media file is <code>oss://examplebucket/outputVideo.mp4</code>.</p>
             * </li>
             * <li><p>If <strong>Container</strong> is <code>ts</code> and <strong>Format</strong> in <strong>Segment</strong> is <code>hls</code>, the process generates an m3u8 file with the OSS URI <code>oss://examplebucket/outputVideo.m3u8</code> and multiple TS files prefixed with <code>oss://examplebucket/outputVideo</code>.</p>
             * </li>
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
             * <p>The video processing parameters.</p>
             * <blockquote>
             * <p>Notice: If this parameter is left empty, the first video stream, if it exists, is copied directly to the output file.</p>
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
