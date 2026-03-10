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
 * {@link CreateHighlightTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateHighlightTaskRequest</p>
 */
public class CreateHighlightTaskRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CredentialConfig")
    private CredentialConfig credentialConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Edit")
    private Edit edit;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Highlight")
    private Highlight highlight;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Mode")
    private String mode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Notification")
    private Notification notification;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Output")
    @com.aliyun.core.annotation.Validation(required = true)
    private Output output;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Sources")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Sources> sources;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.Map<String, ?> tags;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    private CreateHighlightTaskRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.credentialConfig = builder.credentialConfig;
        this.edit = builder.edit;
        this.highlight = builder.highlight;
        this.mode = builder.mode;
        this.notification = builder.notification;
        this.output = builder.output;
        this.projectName = builder.projectName;
        this.sources = builder.sources;
        this.tags = builder.tags;
        this.type = builder.type;
        this.userData = builder.userData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateHighlightTaskRequest create() {
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
     * @return edit
     */
    public Edit getEdit() {
        return this.edit;
    }

    /**
     * @return highlight
     */
    public Highlight getHighlight() {
        return this.highlight;
    }

    /**
     * @return mode
     */
    public String getMode() {
        return this.mode;
    }

    /**
     * @return notification
     */
    public Notification getNotification() {
        return this.notification;
    }

    /**
     * @return output
     */
    public Output getOutput() {
        return this.output;
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
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    public static final class Builder extends Request.Builder<CreateHighlightTaskRequest, Builder> {
        private String regionId; 
        private CredentialConfig credentialConfig; 
        private Edit edit; 
        private Highlight highlight; 
        private String mode; 
        private Notification notification; 
        private Output output; 
        private String projectName; 
        private java.util.List<Sources> sources; 
        private java.util.Map<String, ?> tags; 
        private String type; 
        private String userData; 

        private Builder() {
            super();
        } 

        private Builder(CreateHighlightTaskRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.credentialConfig = request.credentialConfig;
            this.edit = request.edit;
            this.highlight = request.highlight;
            this.mode = request.mode;
            this.notification = request.notification;
            this.output = request.output;
            this.projectName = request.projectName;
            this.sources = request.sources;
            this.tags = request.tags;
            this.type = request.type;
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
            this.putBodyParameter("CredentialConfig", credentialConfigShrink);
            this.credentialConfig = credentialConfig;
            return this;
        }

        /**
         * Edit.
         */
        public Builder edit(Edit edit) {
            String editShrink = shrink(edit, "Edit", "json");
            this.putBodyParameter("Edit", editShrink);
            this.edit = edit;
            return this;
        }

        /**
         * Highlight.
         */
        public Builder highlight(Highlight highlight) {
            String highlightShrink = shrink(highlight, "Highlight", "json");
            this.putBodyParameter("Highlight", highlightShrink);
            this.highlight = highlight;
            return this;
        }

        /**
         * Mode.
         */
        public Builder mode(String mode) {
            this.putBodyParameter("Mode", mode);
            this.mode = mode;
            return this;
        }

        /**
         * Notification.
         */
        public Builder notification(Notification notification) {
            String notificationShrink = shrink(notification, "Notification", "json");
            this.putBodyParameter("Notification", notificationShrink);
            this.notification = notification;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder output(Output output) {
            String outputShrink = shrink(output, "Output", "json");
            this.putBodyParameter("Output", outputShrink);
            this.output = output;
            return this;
        }

        /**
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
         * <p>This parameter is required.</p>
         */
        public Builder sources(java.util.List<Sources> sources) {
            String sourcesShrink = shrink(sources, "Sources", "json");
            this.putBodyParameter("Sources", sourcesShrink);
            this.sources = sources;
            return this;
        }

        /**
         * Tags.
         */
        public Builder tags(java.util.Map<String, ?> tags) {
            String tagsShrink = shrink(tags, "Tags", "json");
            this.putBodyParameter("Tags", tagsShrink);
            this.tags = tags;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Retrieval</p>
         */
        public Builder type(String type) {
            this.putBodyParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * UserData.
         */
        public Builder userData(String userData) {
            this.putBodyParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        @Override
        public CreateHighlightTaskRequest build() {
            return new CreateHighlightTaskRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateHighlightTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateHighlightTaskRequest</p>
     */
    public static class BackgroundMusics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("URI")
        @com.aliyun.core.annotation.Validation(required = true)
        private String URI;

        @com.aliyun.core.annotation.NameInMap("Volume")
        private Double volume;

        private BackgroundMusics(Builder builder) {
            this.URI = builder.URI;
            this.volume = builder.volume;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BackgroundMusics create() {
            return builder().build();
        }

        /**
         * @return URI
         */
        public String getURI() {
            return this.URI;
        }

        /**
         * @return volume
         */
        public Double getVolume() {
            return this.volume;
        }

        public static final class Builder {
            private String URI; 
            private Double volume; 

            private Builder() {
            } 

            private Builder(BackgroundMusics model) {
                this.URI = model.URI;
                this.volume = model.volume;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>oss://test-bucket/test-object</p>
             */
            public Builder URI(String URI) {
                this.URI = URI;
                return this;
            }

            /**
             * Volume.
             */
            public Builder volume(Double volume) {
                this.volume = volume;
                return this;
            }

            public BackgroundMusics build() {
                return new BackgroundMusics(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateHighlightTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateHighlightTaskRequest</p>
     */
    public static class Transitions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Duration")
        private Double duration;

        @com.aliyun.core.annotation.NameInMap("Transition")
        @com.aliyun.core.annotation.Validation(required = true)
        private String transition;

        @com.aliyun.core.annotation.NameInMap("Weight")
        private Long weight;

        private Transitions(Builder builder) {
            this.duration = builder.duration;
            this.transition = builder.transition;
            this.weight = builder.weight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Transitions create() {
            return builder().build();
        }

        /**
         * @return duration
         */
        public Double getDuration() {
            return this.duration;
        }

        /**
         * @return transition
         */
        public String getTransition() {
            return this.transition;
        }

        /**
         * @return weight
         */
        public Long getWeight() {
            return this.weight;
        }

        public static final class Builder {
            private Double duration; 
            private String transition; 
            private Long weight; 

            private Builder() {
            } 

            private Builder(Transitions model) {
                this.duration = model.duration;
                this.transition = model.transition;
                this.weight = model.weight;
            } 

            /**
             * Duration.
             */
            public Builder duration(Double duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>directional</p>
             */
            public Builder transition(String transition) {
                this.transition = transition;
                return this;
            }

            /**
             * Weight.
             */
            public Builder weight(Long weight) {
                this.weight = weight;
                return this;
            }

            public Transitions build() {
                return new Transitions(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateHighlightTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateHighlightTaskRequest</p>
     */
    public static class VfxEffects extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("VfxEffect")
        @com.aliyun.core.annotation.Validation(required = true)
        private String vfxEffect;

        @com.aliyun.core.annotation.NameInMap("Weight")
        private Long weight;

        private VfxEffects(Builder builder) {
            this.vfxEffect = builder.vfxEffect;
            this.weight = builder.weight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VfxEffects create() {
            return builder().build();
        }

        /**
         * @return vfxEffect
         */
        public String getVfxEffect() {
            return this.vfxEffect;
        }

        /**
         * @return weight
         */
        public Long getWeight() {
            return this.weight;
        }

        public static final class Builder {
            private String vfxEffect; 
            private Long weight; 

            private Builder() {
            } 

            private Builder(VfxEffects model) {
                this.vfxEffect = model.vfxEffect;
                this.weight = model.weight;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>open</p>
             */
            public Builder vfxEffect(String vfxEffect) {
                this.vfxEffect = vfxEffect;
                return this;
            }

            /**
             * Weight.
             */
            public Builder weight(Long weight) {
                this.weight = weight;
                return this;
            }

            public VfxEffects build() {
                return new VfxEffects(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateHighlightTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateHighlightTaskRequest</p>
     */
    public static class Edit extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BackgroundMusicMode")
        private String backgroundMusicMode;

        @com.aliyun.core.annotation.NameInMap("BackgroundMusics")
        private java.util.List<BackgroundMusics> backgroundMusics;

        @com.aliyun.core.annotation.NameInMap("Mode")
        @com.aliyun.core.annotation.Validation(required = true)
        private String mode;

        @com.aliyun.core.annotation.NameInMap("TransitionMode")
        private String transitionMode;

        @com.aliyun.core.annotation.NameInMap("Transitions")
        private java.util.List<Transitions> transitions;

        @com.aliyun.core.annotation.NameInMap("VfxEffectMode")
        private String vfxEffectMode;

        @com.aliyun.core.annotation.NameInMap("VfxEffects")
        private java.util.List<VfxEffects> vfxEffects;

        private Edit(Builder builder) {
            this.backgroundMusicMode = builder.backgroundMusicMode;
            this.backgroundMusics = builder.backgroundMusics;
            this.mode = builder.mode;
            this.transitionMode = builder.transitionMode;
            this.transitions = builder.transitions;
            this.vfxEffectMode = builder.vfxEffectMode;
            this.vfxEffects = builder.vfxEffects;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Edit create() {
            return builder().build();
        }

        /**
         * @return backgroundMusicMode
         */
        public String getBackgroundMusicMode() {
            return this.backgroundMusicMode;
        }

        /**
         * @return backgroundMusics
         */
        public java.util.List<BackgroundMusics> getBackgroundMusics() {
            return this.backgroundMusics;
        }

        /**
         * @return mode
         */
        public String getMode() {
            return this.mode;
        }

        /**
         * @return transitionMode
         */
        public String getTransitionMode() {
            return this.transitionMode;
        }

        /**
         * @return transitions
         */
        public java.util.List<Transitions> getTransitions() {
            return this.transitions;
        }

        /**
         * @return vfxEffectMode
         */
        public String getVfxEffectMode() {
            return this.vfxEffectMode;
        }

        /**
         * @return vfxEffects
         */
        public java.util.List<VfxEffects> getVfxEffects() {
            return this.vfxEffects;
        }

        public static final class Builder {
            private String backgroundMusicMode; 
            private java.util.List<BackgroundMusics> backgroundMusics; 
            private String mode; 
            private String transitionMode; 
            private java.util.List<Transitions> transitions; 
            private String vfxEffectMode; 
            private java.util.List<VfxEffects> vfxEffects; 

            private Builder() {
            } 

            private Builder(Edit model) {
                this.backgroundMusicMode = model.backgroundMusicMode;
                this.backgroundMusics = model.backgroundMusics;
                this.mode = model.mode;
                this.transitionMode = model.transitionMode;
                this.transitions = model.transitions;
                this.vfxEffectMode = model.vfxEffectMode;
                this.vfxEffects = model.vfxEffects;
            } 

            /**
             * BackgroundMusicMode.
             */
            public Builder backgroundMusicMode(String backgroundMusicMode) {
                this.backgroundMusicMode = backgroundMusicMode;
                return this;
            }

            /**
             * BackgroundMusics.
             */
            public Builder backgroundMusics(java.util.List<BackgroundMusics> backgroundMusics) {
                this.backgroundMusics = backgroundMusics;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>Sequential</p>
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * TransitionMode.
             */
            public Builder transitionMode(String transitionMode) {
                this.transitionMode = transitionMode;
                return this;
            }

            /**
             * Transitions.
             */
            public Builder transitions(java.util.List<Transitions> transitions) {
                this.transitions = transitions;
                return this;
            }

            /**
             * VfxEffectMode.
             */
            public Builder vfxEffectMode(String vfxEffectMode) {
                this.vfxEffectMode = vfxEffectMode;
                return this;
            }

            /**
             * VfxEffects.
             */
            public Builder vfxEffects(java.util.List<VfxEffects> vfxEffects) {
                this.vfxEffects = vfxEffects;
                return this;
            }

            public Edit build() {
                return new Edit(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateHighlightTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateHighlightTaskRequest</p>
     */
    public static class Highlight extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        @com.aliyun.core.annotation.Validation(required = true)
        private String content;

        private Highlight(Builder builder) {
            this.content = builder.content;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Highlight create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        public static final class Builder {
            private String content; 

            private Builder() {
            } 

            private Builder(Highlight model) {
                this.content = model.content;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>character</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            public Highlight build() {
                return new Highlight(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateHighlightTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateHighlightTaskRequest</p>
     */
    public static class Segment extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Duration")
        private Double duration;

        @com.aliyun.core.annotation.NameInMap("Format")
        private String format;

        @com.aliyun.core.annotation.NameInMap("StartNumber")
        private Long startNumber;

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
        public Long getStartNumber() {
            return this.startNumber;
        }

        public static final class Builder {
            private Double duration; 
            private String format; 
            private Long startNumber; 

            private Builder() {
            } 

            private Builder(Segment model) {
                this.duration = model.duration;
                this.format = model.format;
                this.startNumber = model.startNumber;
            } 

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
            public Builder startNumber(Long startNumber) {
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
     * {@link CreateHighlightTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateHighlightTaskRequest</p>
     */
    public static class Output extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Audio")
        private TargetAudio audio;

        @com.aliyun.core.annotation.NameInMap("Container")
        private String container;

        @com.aliyun.core.annotation.NameInMap("MaxDuration")
        private Double maxDuration;

        @com.aliyun.core.annotation.NameInMap("Segment")
        private Segment segment;

        @com.aliyun.core.annotation.NameInMap("Speed")
        private Double speed;

        @com.aliyun.core.annotation.NameInMap("URI")
        @com.aliyun.core.annotation.Validation(required = true)
        private String URI;

        @com.aliyun.core.annotation.NameInMap("Video")
        private TargetVideo video;

        private Output(Builder builder) {
            this.audio = builder.audio;
            this.container = builder.container;
            this.maxDuration = builder.maxDuration;
            this.segment = builder.segment;
            this.speed = builder.speed;
            this.URI = builder.URI;
            this.video = builder.video;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Output create() {
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
         * @return maxDuration
         */
        public Double getMaxDuration() {
            return this.maxDuration;
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
        public Double getSpeed() {
            return this.speed;
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
            private Double maxDuration; 
            private Segment segment; 
            private Double speed; 
            private String URI; 
            private TargetVideo video; 

            private Builder() {
            } 

            private Builder(Output model) {
                this.audio = model.audio;
                this.container = model.container;
                this.maxDuration = model.maxDuration;
                this.segment = model.segment;
                this.speed = model.speed;
                this.URI = model.URI;
                this.video = model.video;
            } 

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
             * MaxDuration.
             */
            public Builder maxDuration(Double maxDuration) {
                this.maxDuration = maxDuration;
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
            public Builder speed(Double speed) {
                this.speed = speed;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>oss://test-bucket/test-target-object.mp4</p>
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

            public Output build() {
                return new Output(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateHighlightTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateHighlightTaskRequest</p>
     */
    public static class Sources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Duration")
        private Double duration;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Double startTime;

        @com.aliyun.core.annotation.NameInMap("URI")
        @com.aliyun.core.annotation.Validation(required = true)
        private String URI;

        private Sources(Builder builder) {
            this.duration = builder.duration;
            this.startTime = builder.startTime;
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
         * @return URI
         */
        public String getURI() {
            return this.URI;
        }

        public static final class Builder {
            private Double duration; 
            private Double startTime; 
            private String URI; 

            private Builder() {
            } 

            private Builder(Sources model) {
                this.duration = model.duration;
                this.startTime = model.startTime;
                this.URI = model.URI;
            } 

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
             * <p>This parameter is required.</p>
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
}
