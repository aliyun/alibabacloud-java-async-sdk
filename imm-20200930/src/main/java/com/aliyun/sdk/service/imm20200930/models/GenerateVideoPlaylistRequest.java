// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
    private java.util.List < SourceSubtitles> sourceSubtitles;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceURI")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceURI;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.Map < String, String > tags;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Targets")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < Targets> targets;

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
    public java.util.List < SourceSubtitles> getSourceSubtitles() {
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
    public java.util.Map < String, String > getTags() {
        return this.tags;
    }

    /**
     * @return targets
     */
    public java.util.List < Targets> getTargets() {
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
        private java.util.List < SourceSubtitles> sourceSubtitles; 
        private String sourceURI; 
        private java.util.Map < String, String > tags; 
        private java.util.List < Targets> targets; 
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
         * CredentialConfig.
         */
        public Builder credentialConfig(CredentialConfig credentialConfig) {
            String credentialConfigShrink = shrink(credentialConfig, "CredentialConfig", "json");
            this.putQueryParameter("CredentialConfig", credentialConfigShrink);
            this.credentialConfig = credentialConfig;
            return this;
        }

        /**
         * MasterURI.
         */
        public Builder masterURI(String masterURI) {
            this.putQueryParameter("MasterURI", masterURI);
            this.masterURI = masterURI;
            return this;
        }

        /**
         * Notification.
         */
        public Builder notification(Notification notification) {
            String notificationShrink = shrink(notification, "Notification", "json");
            this.putQueryParameter("Notification", notificationShrink);
            this.notification = notification;
            return this;
        }

        /**
         * OverwritePolicy.
         */
        public Builder overwritePolicy(String overwritePolicy) {
            this.putQueryParameter("OverwritePolicy", overwritePolicy);
            this.overwritePolicy = overwritePolicy;
            return this;
        }

        /**
         * ProjectName.
         */
        public Builder projectName(String projectName) {
            this.putQueryParameter("ProjectName", projectName);
            this.projectName = projectName;
            return this;
        }

        /**
         * SourceDuration.
         */
        public Builder sourceDuration(Float sourceDuration) {
            this.putQueryParameter("SourceDuration", sourceDuration);
            this.sourceDuration = sourceDuration;
            return this;
        }

        /**
         * SourceStartTime.
         */
        public Builder sourceStartTime(Float sourceStartTime) {
            this.putQueryParameter("SourceStartTime", sourceStartTime);
            this.sourceStartTime = sourceStartTime;
            return this;
        }

        /**
         * SourceSubtitles.
         */
        public Builder sourceSubtitles(java.util.List < SourceSubtitles> sourceSubtitles) {
            String sourceSubtitlesShrink = shrink(sourceSubtitles, "SourceSubtitles", "json");
            this.putQueryParameter("SourceSubtitles", sourceSubtitlesShrink);
            this.sourceSubtitles = sourceSubtitles;
            return this;
        }

        /**
         * SourceURI.
         */
        public Builder sourceURI(String sourceURI) {
            this.putQueryParameter("SourceURI", sourceURI);
            this.sourceURI = sourceURI;
            return this;
        }

        /**
         * Tags.
         */
        public Builder tags(java.util.Map < String, String > tags) {
            String tagsShrink = shrink(tags, "Tags", "json");
            this.putQueryParameter("Tags", tagsShrink);
            this.tags = tags;
            return this;
        }

        /**
         * Targets.
         */
        public Builder targets(java.util.List < Targets> targets) {
            String targetsShrink = shrink(targets, "Targets", "json");
            this.putQueryParameter("Targets", targetsShrink);
            this.targets = targets;
            return this;
        }

        /**
         * UserData.
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
             * Language.
             */
            public Builder language(String language) {
                this.language = language;
                return this;
            }

            /**
             * URI.
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
    public static class Targets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Audio")
        private TargetAudio audio;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private Float duration;

        @com.aliyun.core.annotation.NameInMap("InitialSegments")
        private java.util.List < Float > initialSegments;

        @com.aliyun.core.annotation.NameInMap("InitialTranscode")
        private Float initialTranscode;

        @com.aliyun.core.annotation.NameInMap("Subtitle")
        private TargetSubtitle subtitle;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.Map < String, String > tags;

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
        public java.util.List < Float > getInitialSegments() {
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
        public java.util.Map < String, String > getTags() {
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
            private java.util.List < Float > initialSegments; 
            private Float initialTranscode; 
            private TargetSubtitle subtitle; 
            private java.util.Map < String, String > tags; 
            private Integer transcodeAhead; 
            private String URI; 
            private TargetVideo video; 

            /**
             * Audio.
             */
            public Builder audio(TargetAudio audio) {
                this.audio = audio;
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
             * InitialSegments.
             */
            public Builder initialSegments(java.util.List < Float > initialSegments) {
                this.initialSegments = initialSegments;
                return this;
            }

            /**
             * InitialTranscode.
             */
            public Builder initialTranscode(Float initialTranscode) {
                this.initialTranscode = initialTranscode;
                return this;
            }

            /**
             * Subtitle.
             */
            public Builder subtitle(TargetSubtitle subtitle) {
                this.subtitle = subtitle;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(java.util.Map < String, String > tags) {
                this.tags = tags;
                return this;
            }

            /**
             * TranscodeAhead.
             */
            public Builder transcodeAhead(Integer transcodeAhead) {
                this.transcodeAhead = transcodeAhead;
                return this;
            }

            /**
             * URI.
             */
            public Builder URI(String URI) {
                this.URI = URI;
                return this;
            }

            /**
             * Video.
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
