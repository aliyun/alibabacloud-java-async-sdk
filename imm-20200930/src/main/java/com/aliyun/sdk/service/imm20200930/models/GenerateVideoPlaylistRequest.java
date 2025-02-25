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
 * {@link GenerateVideoPlaylistRequest} extends {@link RequestModel}
 *
 * <p>GenerateVideoPlaylistRequest</p>
 */
public class GenerateVideoPlaylistRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CredentialConfig")
    private CredentialConfig credentialConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MasterURI")
    private String masterURI;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Notification")
    private Notification notification;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OverwritePolicy")
    private String overwritePolicy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceDuration")
    private Float sourceDuration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceStartTime")
    private Float sourceStartTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceSubtitles")
    private java.util.List<SourceSubtitles> sourceSubtitles;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceURI")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceURI;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.Map<String, String> tags;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Targets")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Targets> targets;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    private GenerateVideoPlaylistRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.credentialConfig = builder.credentialConfig;
        this.masterURI = builder.masterURI;
        this.notification = builder.notification;
        this.overwritePolicy = builder.overwritePolicy;
        this.projectName = builder.projectName;
        this.sourceDuration = builder.sourceDuration;
        this.sourceStartTime = builder.sourceStartTime;
        this.sourceSubtitles = builder.sourceSubtitles;
        this.sourceURI = builder.sourceURI;
        this.tags = builder.tags;
        this.targets = builder.targets;
        this.userData = builder.userData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateVideoPlaylistRequest create() {
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
     * @return credentialConfig
     */
    public CredentialConfig getCredentialConfig() {
        return this.credentialConfig;
    }

    /**
     * @return masterURI
     */
    public String getMasterURI() {
        return this.masterURI;
    }

    /**
     * @return notification
     */
    public Notification getNotification() {
        return this.notification;
    }

    /**
     * @return overwritePolicy
     */
    public String getOverwritePolicy() {
        return this.overwritePolicy;
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @return sourceDuration
     */
    public Float getSourceDuration() {
        return this.sourceDuration;
    }

    /**
     * @return sourceStartTime
     */
    public Float getSourceStartTime() {
        return this.sourceStartTime;
    }

    /**
     * @return sourceSubtitles
     */
    public java.util.List<SourceSubtitles> getSourceSubtitles() {
        return this.sourceSubtitles;
    }

    /**
     * @return sourceURI
     */
    public String getSourceURI() {
        return this.sourceURI;
    }

    /**
     * @return tags
     */
    public java.util.Map<String, String> getTags() {
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

    public static final class Builder extends Request.Builder<GenerateVideoPlaylistRequest, Builder> {
        private String regionId; 
        private CredentialConfig credentialConfig; 
        private String masterURI; 
        private Notification notification; 
        private String overwritePolicy; 
        private String projectName; 
        private Float sourceDuration; 
        private Float sourceStartTime; 
        private java.util.List<SourceSubtitles> sourceSubtitles; 
        private String sourceURI; 
        private java.util.Map<String, String> tags; 
        private java.util.List<Targets> targets; 
        private String userData; 

        private Builder() {
            super();
        } 

        private Builder(GenerateVideoPlaylistRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.credentialConfig = request.credentialConfig;
            this.masterURI = request.masterURI;
            this.notification = request.notification;
            this.overwritePolicy = request.overwritePolicy;
            this.projectName = request.projectName;
            this.sourceDuration = request.sourceDuration;
            this.sourceStartTime = request.sourceStartTime;
            this.sourceSubtitles = request.sourceSubtitles;
            this.sourceURI = request.sourceURI;
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
         * <p><strong>If you do not have special requirements, leave this parameter empty.</strong></p>
         * <p>The authorization chain settings. For more information, see <a href="https://help.aliyun.com/document_detail/465340.html">Use authorization chains to access resources of other entities</a>.</p>
         */
        public Builder credentialConfig(CredentialConfig credentialConfig) {
            String credentialConfigShrink = shrink(credentialConfig, "CredentialConfig", "json");
            this.putQueryParameter("CredentialConfig", credentialConfigShrink);
            this.credentialConfig = credentialConfig;
            return this;
        }

        /**
         * <p>The OSS path of the master playlist.</p>
         * <p>The OSS path must be in the oss://${Bucket}/${Object} format. ${Bucket} specifies the name of the OSS bucket that is in the same region as the current project. ${Object} specifies the full path of the file that is suffixed with .m3u8.</p>
         * <blockquote>
         * <p> If a playlist contains subtitles or multiple outputs, the MasterURI parameter is required and the URI of subtitle files or outputs must be in the directory specified by the MasterURI parameter or its subdirectory.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>oss://bucket/object/master.m3u8</p>
         */
        public Builder masterURI(String masterURI) {
            this.putQueryParameter("MasterURI", masterURI);
            this.masterURI = masterURI;
            return this;
        }

        /**
         * <p>The notification settings. To view details, click Notification. For information about the asynchronous notification format, see <a href="https://help.aliyun.com/document_detail/2743997.html">Asynchronous message examples</a>.</p>
         */
        public Builder notification(Notification notification) {
            String notificationShrink = shrink(notification, "Notification", "json");
            this.putQueryParameter("Notification", notificationShrink);
            this.notification = notification;
            return this;
        }

        /**
         * <p>The overwrite policy when the media playlist exists. Valid values:</p>
         * <ul>
         * <li>overwrite (default): overwrites an existing media playlist.</li>
         * <li>skip-existing: skips generation and retains the existing media playlist.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>overwrite</p>
         */
        public Builder overwritePolicy(String overwritePolicy) {
            this.putQueryParameter("OverwritePolicy", overwritePolicy);
            this.overwritePolicy = overwritePolicy;
            return this;
        }

        /**
         * <p>The project name.<a href="~~478153~~"></a></p>
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
         * <p>The period of time during which the playlist is generated. Unit: seconds.</p>
         * <ul>
         * <li>If you set this parameter to 0 (default) or leave this parameter empty, a playlist is generated until the end time of the source video.</li>
         * <li>If you set this parameter to a value greater than 0, a playlist is generated for the specified period of time from the start time that you specify.</li>
         * </ul>
         * <blockquote>
         * <p> If you set this parameter to a value that exceeds the end time of a source video, use the default value.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder sourceDuration(Float sourceDuration) {
            this.putQueryParameter("SourceDuration", sourceDuration);
            this.sourceDuration = sourceDuration;
            return this;
        }

        /**
         * <p>The time when the playlist starts to generate. Unit: seconds.</p>
         * <ul>
         * <li>If you set this parameter to 0 (default) or leave this parameter empty, the start time of the source video is used as the time when a playlist starts to generate.</li>
         * <li>If you set this parameter to a value greater than 0, the time when a playlist starts to generate is the specified point in time.</li>
         * </ul>
         * <blockquote>
         * <p> If you use this parameter together with the <strong>SourceDuration</strong> parameter, a playlist can be generated based on the partial content of a source video.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder sourceStartTime(Float sourceStartTime) {
            this.putQueryParameter("SourceStartTime", sourceStartTime);
            this.sourceStartTime = sourceStartTime;
            return this;
        }

        /**
         * <p>The subtitle files. By default, this parameter is left empty. Up to two subtitle files are supported.</p>
         */
        public Builder sourceSubtitles(java.util.List<SourceSubtitles> sourceSubtitles) {
            String sourceSubtitlesShrink = shrink(sourceSubtitles, "SourceSubtitles", "json");
            this.putQueryParameter("SourceSubtitles", sourceSubtitlesShrink);
            this.sourceSubtitles = sourceSubtitles;
            return this;
        }

        /**
         * <p>The OSS path of the video file.</p>
         * <p>The OSS path must be in the oss://${Bucket}/${Object} format. ${Bucket} specifies the name of the OSS bucket that is in the same region as the current project. ${Object} specifies the full path of the file that contains the file name extension.</p>
         * <blockquote>
         * <p> Only OSS buckets of the Standard storage class are supported. OSS buckets for which hotlink protection whitelists are configured are not supported.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://imm-test/testcases/video.mp4</p>
         */
        public Builder sourceURI(String sourceURI) {
            this.putQueryParameter("SourceURI", sourceURI);
            this.sourceURI = sourceURI;
            return this;
        }

        /**
         * <p>The <a href="https://help.aliyun.com/document_detail/106678.html">tags</a> that you want to add to a TS file in OSS. You can use tags to manage the lifecycles of TS files in OSS.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;key1&quot;: &quot;value1&quot;, &quot;key2&quot;: &quot;value2&quot;}</p>
         */
        public Builder tags(java.util.Map<String, String> tags) {
            String tagsShrink = shrink(tags, "Tags", "json");
            this.putQueryParameter("Tags", tagsShrink);
            this.tags = tags;
            return this;
        }

        /**
         * <p>The live transcoding playlists. Up to 6 playlists are supported. Each output corresponds to at most one video media playlist and one or more subtitle media playlists.</p>
         * <blockquote>
         * <p> If more than one output is configured, the <strong>MasterURI</strong> parameter is required.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         */
        public Builder targets(java.util.List<Targets> targets) {
            String targetsShrink = shrink(targets, "Targets", "json");
            this.putQueryParameter("Targets", targetsShrink);
            this.targets = targets;
            return this;
        }

        /**
         * <p>The custom user information, which is returned in asynchronous notifications to help you handle the notifications in the system. The maximum length of a notification is 2048 bytes.</p>
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
        public GenerateVideoPlaylistRequest build() {
            return new GenerateVideoPlaylistRequest(this);
        } 

    } 

    /**
     * 
     * {@link GenerateVideoPlaylistRequest} extends {@link TeaModel}
     *
     * <p>GenerateVideoPlaylistRequest</p>
     */
    public static class SourceSubtitles extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Language")
        private String language;

        @com.aliyun.core.annotation.NameInMap("URI")
        @com.aliyun.core.annotation.Validation(required = true)
        private String URI;

        private SourceSubtitles(Builder builder) {
            this.language = builder.language;
            this.URI = builder.URI;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SourceSubtitles create() {
            return builder().build();
        }

        /**
         * @return language
         */
        public String getLanguage() {
            return this.language;
        }

        /**
         * @return URI
         */
        public String getURI() {
            return this.URI;
        }

        public static final class Builder {
            private String language; 
            private String URI; 

            /**
             * <p>The subtitle language. If you configure this parameter, the value must comply with the ISO 639-2 standard. By default, this parameter is left empty.</p>
             * 
             * <strong>example:</strong>
             * <p>eng</p>
             */
            public Builder language(String language) {
                this.language = language;
                return this;
            }

            /**
             * <p>The OSS path of the subtitle file.</p>
             * <p>The OSS path must be in the oss://${Bucket}/${Object} format. ${Bucket} specifies the name of the OSS bucket that is in the same region as the current project. ${Object} specifies the full path of the file.</p>
             * <blockquote>
             * <p> The <strong>MasterURI</strong> parameter cannot be left empty, and the OSS path <code>oss://${Bucket}/${Object}</code> of a subtitle file must be in the directory specified by the <strong>MasterURI</strong> parameter or its subdirectory.</p>
             * </blockquote>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>oss://test-bucket/test-object/subtitle/eng.vtt</p>
             */
            public Builder URI(String URI) {
                this.URI = URI;
                return this;
            }

            public SourceSubtitles build() {
                return new SourceSubtitles(this);
            } 

        } 

    }
    /**
     * 
     * {@link GenerateVideoPlaylistRequest} extends {@link TeaModel}
     *
     * <p>GenerateVideoPlaylistRequest</p>
     */
    public static class Targets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Audio")
        private TargetAudio audio;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private Float duration;

        @com.aliyun.core.annotation.NameInMap("InitialSegments")
        private java.util.List<Float> initialSegments;

        @com.aliyun.core.annotation.NameInMap("InitialTranscode")
        private Float initialTranscode;

        @com.aliyun.core.annotation.NameInMap("Subtitle")
        private TargetSubtitle subtitle;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.Map<String, String> tags;

        @com.aliyun.core.annotation.NameInMap("TranscodeAhead")
        private Integer transcodeAhead;

        @com.aliyun.core.annotation.NameInMap("URI")
        private String URI;

        @com.aliyun.core.annotation.NameInMap("Video")
        private TargetVideo video;

        private Targets(Builder builder) {
            this.audio = builder.audio;
            this.duration = builder.duration;
            this.initialSegments = builder.initialSegments;
            this.initialTranscode = builder.initialTranscode;
            this.subtitle = builder.subtitle;
            this.tags = builder.tags;
            this.transcodeAhead = builder.transcodeAhead;
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
         * @return duration
         */
        public Float getDuration() {
            return this.duration;
        }

        /**
         * @return initialSegments
         */
        public java.util.List<Float> getInitialSegments() {
            return this.initialSegments;
        }

        /**
         * @return initialTranscode
         */
        public Float getInitialTranscode() {
            return this.initialTranscode;
        }

        /**
         * @return subtitle
         */
        public TargetSubtitle getSubtitle() {
            return this.subtitle;
        }

        /**
         * @return tags
         */
        public java.util.Map<String, String> getTags() {
            return this.tags;
        }

        /**
         * @return transcodeAhead
         */
        public Integer getTranscodeAhead() {
            return this.transcodeAhead;
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
            private Float duration; 
            private java.util.List<Float> initialSegments; 
            private Float initialTranscode; 
            private TargetSubtitle subtitle; 
            private java.util.Map<String, String> tags; 
            private Integer transcodeAhead; 
            private String URI; 
            private TargetVideo video; 

            /**
             * <p>The audio processing configuration. If you set this parameter to null (default), audio processing is disabled. The generated TS files do not contain audio streams.</p>
             * <blockquote>
             * <p> The Audio and Subtitle parameters in the same output are mutually exclusive. If the Audio parameter is configured, the Subtitle parameter is ignored. The Audio and Video parameters can be configured at the same time. You can also configure only the Audio parameter to generate only audio information.</p>
             * </blockquote>
             */
            public Builder audio(TargetAudio audio) {
                this.audio = audio;
                return this;
            }

            /**
             * <p>The playback duration of a single TS file. Unit: seconds. Default value: 10. Valid values: 5 to 15.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder duration(Float duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The array of the durations of the pre-transcoded TS files. The array can contain the durations of up to six pre-transcoded TS files. By default, this parameter is left empty. This parameter is independent of the <strong>Duration</strong> parameter.</p>
             */
            public Builder initialSegments(java.util.List<Float> initialSegments) {
                this.initialSegments = initialSegments;
                return this;
            }

            /**
             * <p>The pre-transcoding duration. Unit: seconds. Default value: 30.</p>
             * <ul>
             * <li>If you set this parameter to 0, pre-transcoding is disabled.</li>
             * <li>If you set this parameter to a value that is less than 0 or greater than the duration of a source video, the entire video is pre-transcoded.</li>
             * <li>If you set this parameter to a value that is within the middle of the playback duration of a TS file, the transcoding continues until the end of the playback duration.</li>
             * </ul>
             * <blockquote>
             * <p> This parameter is used to reduce the time spent in waiting for the initial playback of a video and improve the playback experience. If you want to replace the traditional video on demand (VOD) business scenario, you can try to pre-transcode the entire video.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>30.0</p>
             */
            public Builder initialTranscode(Float initialTranscode) {
                this.initialTranscode = initialTranscode;
                return this;
            }

            /**
             * <p>The subtitle processing configuration.</p>
             * <blockquote>
             * <p> The Subtitle and Video or Audio parameters in the same output are mutually exclusive. You must configure the Subtitle parameter independently to generate subtitles.</p>
             * </blockquote>
             */
            public Builder subtitle(TargetSubtitle subtitle) {
                this.subtitle = subtitle;
                return this;
            }

            /**
             * <p>The <a href="https://help.aliyun.com/document_detail/106678.html">tags</a> that you want to add to a TS file in OSS. You can use tags to manage the lifecycles of TS files in OSS.</p>
             * <blockquote>
             * <p> The combination of the value of the Tags parameter and the value of the Tags parameter in the upper level is used as the tag value of the current output. If the value of the Tags parameter in the current level is the same as the value of the Tags parameter in the upper level, use the value of the Tags parameter in the current level.</p>
             * </blockquote>
             */
            public Builder tags(java.util.Map<String, String> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The number of TS files that are pre-transcoded when the live transcoding is triggered. By default, a 2-minute video is pre-transcoded.</p>
             * <ul>
             * <li>Example: If you set the <strong>Duration</strong> parameter to 10, the value of the <strong>TranscodeAhead</strong> parameter is 12 by default. You can configure this parameter to manage the number of pre-transcoded files in an asynchronous manner. Valid values: 10 to 30.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder transcodeAhead(Integer transcodeAhead) {
                this.transcodeAhead = transcodeAhead;
                return this;
            }

            /**
             * <p>The prefix of the OSS path that is used to store the live transcoding files. The live transcoding files include a M3U8 file and multiple TS files.</p>
             * <p>The OSS path must be in the oss://${Bucket}/${Object} format. ${Bucket} specifies the name of the OSS bucket that is in the same region as the current project. ${Object} specifies the prefix of the full path of the file that does not contain the file name extension.</p>
             * <ul>
             * <li>Example: If the URI is oss://test-bucket/test-object/output-video, the output-video.m3u8 file and multiple output-video-${token}-${index}.ts files are generated in the oss://test-bucket/test-object/ directory. ${token} is a unique string generated based on the transcoding parameters. The ${token} parameter is included in the response of the operation. ${index} is the serial number of the generated TS files that are numbered starting from 0.</li>
             * </ul>
             * <blockquote>
             * <p> If the <strong>MasterURI</strong> parameter is not left empty, the URI specified by this parameter must be in the directory specified by the <strong>MasterURI</strong> parameter or its subdirectory.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>oss://imm-test/testcases/video</p>
             */
            public Builder URI(String URI) {
                this.URI = URI;
                return this;
            }

            /**
             * <p>The video processing configuration. If you set this parameter to null (default), video processing is disabled. The generated TS files do not contain video streams.</p>
             * <blockquote>
             * <p> The Video and Subtitle parameters in the same output are mutually exclusive. If the Video parameter is configured, the Subtitle parameter is ignored.</p>
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
