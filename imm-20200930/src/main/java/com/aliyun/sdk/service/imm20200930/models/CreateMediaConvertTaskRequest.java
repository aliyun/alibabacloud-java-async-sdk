// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
    private java.util.List < Sources> sources;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.Map < String, ? > tags;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Targets")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < Targets> targets;

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
    public java.util.List < Sources> getSources() {
        return this.sources;
    }

    /**
     * @return tags
     */
    public java.util.Map < String, ? > getTags() {
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

    public static final class Builder extends Request.Builder<CreateMediaConvertTaskRequest, Builder> {
        private String regionId; 
        private Integer alignmentIndex; 
        private CredentialConfig credentialConfig; 
        private Notification notification; 
        private String projectName; 
        private java.util.List < Sources> sources; 
        private java.util.Map < String, ? > tags; 
        private java.util.List < Targets> targets; 
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
         * AlignmentIndex.
         */
        public Builder alignmentIndex(Integer alignmentIndex) {
            this.putQueryParameter("AlignmentIndex", alignmentIndex);
            this.alignmentIndex = alignmentIndex;
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
         * 消息通知配置，支持使用MNS、RocketMQ接收异步消息通知。
         */
        public Builder notification(Notification notification) {
            String notificationShrink = shrink(notification, "Notification", "json");
            this.putQueryParameter("Notification", notificationShrink);
            this.notification = notification;
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
         * Sources.
         */
        public Builder sources(java.util.List < Sources> sources) {
            String sourcesShrink = shrink(sources, "Sources", "json");
            this.putQueryParameter("Sources", sourcesShrink);
            this.sources = sources;
            return this;
        }

        /**
         * Tags.
         */
        public Builder tags(java.util.Map < String, ? > tags) {
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
        public CreateMediaConvertTaskRequest build() {
            return new CreateMediaConvertTaskRequest(this);
        } 

    } 

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

            /**
             * Language.
             */
            public Builder language(String language) {
                this.language = language;
                return this;
            }

            /**
             * TimeOffset.
             */
            public Builder timeOffset(Double timeOffset) {
                this.timeOffset = timeOffset;
                return this;
            }

            /**
             * URI.
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
    public static class Sources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Duration")
        private Double duration;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Double startTime;

        @com.aliyun.core.annotation.NameInMap("Subtitles")
        private java.util.List < Subtitles> subtitles;

        @com.aliyun.core.annotation.NameInMap("URI")
        private String URI;

        private Sources(Builder builder) {
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
        public java.util.List < Subtitles> getSubtitles() {
            return this.subtitles;
        }

        /**
         * @return URI
         */
        public String getURI() {
            return this.URI;
        }

        public static final class Builder {
            private Double duration; 
            private Double startTime; 
            private java.util.List < Subtitles> subtitles; 
            private String URI; 

            /**
             * Duration.
             */
            public Builder duration(Double duration) {
                this.duration = duration;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(Double startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * Subtitles.
             */
            public Builder subtitles(java.util.List < Subtitles> subtitles) {
                this.subtitles = subtitles;
                return this;
            }

            /**
             * URI.
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

            /**
             * Duration.
             */
            public Builder duration(Double duration) {
                this.duration = duration;
                return this;
            }

            /**
             * Format.
             */
            public Builder format(String format) {
                this.format = format;
                return this;
            }

            /**
             * StartNumber.
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

            /**
             * Audio.
             */
            public Builder audio(TargetAudio audio) {
                this.audio = audio;
                return this;
            }

            /**
             * Container.
             */
            public Builder container(String container) {
                this.container = container;
                return this;
            }

            /**
             * Image.
             */
            public Builder image(TargetImage image) {
                this.image = image;
                return this;
            }

            /**
             * Segment.
             */
            public Builder segment(Segment segment) {
                this.segment = segment;
                return this;
            }

            /**
             * Speed.
             */
            public Builder speed(Float speed) {
                this.speed = speed;
                return this;
            }

            /**
             * StripMetadata.
             */
            public Builder stripMetadata(Boolean stripMetadata) {
                this.stripMetadata = stripMetadata;
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
