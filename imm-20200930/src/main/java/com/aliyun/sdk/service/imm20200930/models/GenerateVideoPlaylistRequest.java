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
         * <p><strong>Leave this parameter empty unless you have special requirements.</strong></p>
         * <p>The China authorization configuration. This parameter is optional. For more information, see <a href="https://help.aliyun.com/document_detail/465340.html">Use chained authorization to access resources of other entities</a>.</p>
         */
        public Builder credentialConfig(CredentialConfig credentialConfig) {
            String credentialConfigShrink = shrink(credentialConfig, "CredentialConfig", "json");
            this.putQueryParameter("CredentialConfig", credentialConfigShrink);
            this.credentialConfig = credentialConfig;
            return this;
        }

        /**
         * <p>The OSS URI of the Master Playlist.</p>
         * <p>The OSS URI follows the format oss://${Bucket}/${Object}, where ${Bucket} is the name of the OSS bucket in the same region as the current project, and ${Object} is the full path of the file with the &quot;.m3u8&quot; extension.</p>
         * <blockquote>
         * <p>If the playlist has subtitle input or multiple Target outputs, MasterURI is required. The subtitle URI or Target URI must be in the same directory as or a subdirectory of MasterURI.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>oss://test-bucket/test-object/master.m3u8</p>
         */
        public Builder masterURI(String masterURI) {
            this.putQueryParameter("MasterURI", masterURI);
            this.masterURI = masterURI;
            return this;
        }

        /**
         * <p>The message notification configuration. Click Notification for details. For the format of asynchronous notification messages, see <a href="https://help.aliyun.com/document_detail/2743997.html">Asynchronous notification message format</a>.</p>
         */
        public Builder notification(Notification notification) {
            String notificationShrink = shrink(notification, "Notification", "json");
            this.putQueryParameter("Notification", notificationShrink);
            this.notification = notification;
            return this;
        }

        /**
         * <p>The overwrite policy when the Media Playlist already exists. Valid values:</p>
         * <ul>
         * <li>overwrite (default): Overwrites the existing Media Playlist.</li>
         * <li>skip-existing: Skips generation and retains the existing Media Playlist.</li>
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
         * <p>The project name. For information about how to obtain the project name, see <a href="https://help.aliyun.com/document_detail/478153.html">Create a project</a>.</p>
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
         * <p>The duration for generating the playlist. Unit: seconds. Valid values:</p>
         * <ul>
         * <li><p>0 (default) or empty: continues until the end of the source video.</p>
         * </li>
         * <li><p>Greater than 0: continues for the specified duration from the start time of the playlist generation.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>If the time point corresponding to the specified parameter exceeds the end of the source video, the default value is used.</p>
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
         * <p>The start time for generating the playlist. Unit: seconds. Valid values:</p>
         * <ul>
         * <li><p>0 (default) or empty: starts from the beginning of the source video.</p>
         * </li>
         * <li><p>Greater than 0: starts from the specified time point in the source video.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>You can use this parameter together with <strong>SourceDuration</strong> to generate a playlist for a specific portion of the source video.</p>
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
         * <p>The list of subtitles to add. Default value: empty. Maximum number of subtitles: 2.</p>
         */
        public Builder sourceSubtitles(java.util.List<SourceSubtitles> sourceSubtitles) {
            String sourceSubtitlesShrink = shrink(sourceSubtitles, "SourceSubtitles", "json");
            this.putQueryParameter("SourceSubtitles", sourceSubtitlesShrink);
            this.sourceSubtitles = sourceSubtitles;
            return this;
        }

        /**
         * <p>The OSS URI of the video.</p>
         * <p>The OSS URI follows the format oss://${Bucket}/${Object}, where ${Bucket} is the name of the OSS bucket in the same area (Region) as the current project, and ${Object} is the full path of the file including the file name extension.</p>
         * <blockquote>
         * <p>Only OSS buckets with Standard storage class are supported.
         * Buckets with hotlink protection whitelist access settings are not supported.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://test-bucket/test-source-object/video.mp4</p>
         */
        public Builder sourceURI(String sourceURI) {
            this.putQueryParameter("SourceURI", sourceURI);
            this.sourceURI = sourceURI;
            return this;
        }

        /**
         * <p>The OSS object <a href="https://help.aliyun.com/document_detail/106678.html">tags</a> to add to the generated TS files. You can use tags to control the lifecycle of OSS files.</p>
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
         * <p>The array of just-in-time transcoding playlists. Maximum array length: 6. Each Target corresponds to at most one video Media Playlist and one or more subtitle Media Playlists.</p>
         * <blockquote>
         * <p>If more than one Target is configured, the <strong>MasterURI</strong> parameter must not be empty.</p>
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
         * <p>The custom information that is returned in asynchronous message notifications, which helps you associate message notifications within your system. Maximum length: 2,048 bytes.</p>
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

            private Builder() {
            } 

            private Builder(SourceSubtitles model) {
                this.language = model.language;
                this.URI = model.URI;
            } 

            /**
             * <p>The subtitle language. The standard is ISO 639-2. Default value: empty.</p>
             * 
             * <strong>example:</strong>
             * <p>eng</p>
             */
            public Builder language(String language) {
                this.language = language;
                return this;
            }

            /**
             * <p>The OSS URI of the subtitle to embed.</p>
             * <p>The OSS URI follows the format oss://${Bucket}/${Object}, where ${Bucket} is the name of the OSS bucket in the same region as the current project, and ${Object} is the full path of the file.</p>
             * <blockquote>
             * <p>The <strong>MasterURI</strong> parameter must not be empty, and the OSS URI <code>oss://${Bucket}/${Object}</code> of the subtitle to embed must be in the same directory as or a subdirectory of the <strong>MasterURI</strong> parameter.</p>
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

        @com.aliyun.core.annotation.NameInMap("Container")
        private String container;

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
            this.container = builder.container;
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
         * @return container
         */
        public String getContainer() {
            return this.container;
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
            private String container; 
            private Float duration; 
            private java.util.List<Float> initialSegments; 
            private Float initialTranscode; 
            private TargetSubtitle subtitle; 
            private java.util.Map<String, String> tags; 
            private Integer transcodeAhead; 
            private String URI; 
            private TargetVideo video; 

            private Builder() {
            } 

            private Builder(Targets model) {
                this.audio = model.audio;
                this.container = model.container;
                this.duration = model.duration;
                this.initialSegments = model.initialSegments;
                this.initialTranscode = model.initialTranscode;
                this.subtitle = model.subtitle;
                this.tags = model.tags;
                this.transcodeAhead = model.transcodeAhead;
                this.URI = model.URI;
                this.video = model.video;
            } 

            /**
             * <p>The audio processing parameter settings. An empty value (default) indicates that audio processing is disabled and the output TS files do not contain an audio stream.</p>
             * <blockquote>
             * <p>The Audio and Subtitle fields within the same Target are mutually exclusive. If the Audio field is set, the Subtitle field is ignored. Audio and Video can be set simultaneously, where Audio represents the audio information in the output video. You can also set only Audio to generate audio-only output.</p>
             * </blockquote>
             */
            public Builder audio(TargetAudio audio) {
                this.audio = audio;
                return this;
            }

            /**
             * <p>The HLS segment container type. Valid values:</p>
             * <ul>
             * <li><p>ts (default)</p>
             * </li>
             * <li><p>mp4</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ts</p>
             */
            public Builder container(String container) {
                this.container = container;
                return this;
            }

            /**
             * <p>The playback duration of a single TS file. Unit: seconds. Default value: 10. Valid values: [5, 15].</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder duration(Float duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The array of initial transcoding TS file durations. Maximum array length: 6. Default value: empty. This parameter is independent of the <strong>Duration</strong> parameter.</p>
             */
            public Builder initialSegments(java.util.List<Float> initialSegments) {
                this.initialSegments = initialSegments;
                return this;
            }

            /**
             * <p>The initial transcoding duration. Unit: seconds. Default value: 30.</p>
             * <ul>
             * <li>If the value is 0, no pre-transcoding is performed.</li>
             * <li>If the value is less than 0 or exceeds the source video length, the entire video is initially transcoded.</li>
             * <li>If the specified duration falls in the middle of a TS file, transcoding continues until the end of that TS file.</li>
             * </ul>
             * <blockquote>
             * <p>This parameter is mainly used to reduce the wait time for initial video playback and improve the playback experience. If you want to replace traditional VOD business scenarios, try initially transcoding the entire video.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder initialTranscode(Float initialTranscode) {
                this.initialTranscode = initialTranscode;
                return this;
            }

            /**
             * <p>The subtitle processing parameter settings.</p>
             * <blockquote>
             * <p>The Subtitle field is mutually exclusive with the Video or Audio fields within the same Target. Subtitles are generated only when Subtitle is set alone.</p>
             * </blockquote>
             */
            public Builder subtitle(TargetSubtitle subtitle) {
                this.subtitle = subtitle;
                return this;
            }

            /**
             * <p>The OSS object <a href="https://help.aliyun.com/document_detail/106678.html">tags</a> to add to the generated TS files. You can use OSS tags to control the lifecycle of OSS files.</p>
             * <blockquote>
             * <p>The tag values at this level are merged with the Tags defined at the parent level to form the tag values for the current Target. If a tag with the same name exists, the value at this level takes precedence.</p>
             * </blockquote>
             */
            public Builder tags(java.util.Map<String, String> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The number of TS files to transcode ahead when just-in-time transcoding is triggered. By default, 2 minutes of video is transcoded ahead.</p>
             * <ul>
             * <li>Example: If <strong>Duration</strong> is 10, the default value of <strong>TranscodeAhead</strong> is 12. You can specify this parameter to control the number of asynchronous ahead-of-time transcoding files. Valid values: [10, 30].</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder transcodeAhead(Integer transcodeAhead) {
                this.transcodeAhead = transcodeAhead;
                return this;
            }

            /**
             * <p>The OSS URI prefix of the just-in-time transcoding output files, including M3U8 files and TS files.</p>
             * <p>The OSS URI follows the format oss://${Bucket}/${Object}, where ${Bucket} is the name of the OSS bucket in the same region as the current project, and ${Object} is the full path prefix of the file without the file name extension.</p>
             * <ul>
             * <li>Example: If URI is oss://test-bucket/test-object/output-video, an oss://test-bucket/test-object/output-video.m3u8 file and multiple oss://test-bucket/test-object/output-video-${token}-${index}.ts files are generated. ${token} is a unique character string generated based on the transcoding parameters and is included in the API response. ${index} is the ordinal number of the TS file starting from 0.</li>
             * </ul>
             * <blockquote>
             * <p>If the <strong>MasterURI</strong> parameter is not empty, the URI must be in the same directory as or a subdirectory of the <strong>MasterURI</strong> parameter.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>oss://test-bucket/test-object/output-video</p>
             */
            public Builder URI(String URI) {
                this.URI = URI;
                return this;
            }

            /**
             * <p>The video processing parameter settings. An empty value (default) indicates that video processing is disabled and the output TS files do not contain a video stream.</p>
             * <blockquote>
             * <p>The Video and Subtitle fields within the same Target are mutually exclusive. If the Video field is set, the Subtitle field is ignored.</p>
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
