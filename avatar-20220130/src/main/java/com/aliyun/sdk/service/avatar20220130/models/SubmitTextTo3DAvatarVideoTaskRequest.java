// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.avatar20220130.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitTextTo3DAvatarVideoTaskRequest} extends {@link RequestModel}
 *
 * <p>SubmitTextTo3DAvatarVideoTaskRequest</p>
 */
public class SubmitTextTo3DAvatarVideoTaskRequest extends Request {
    @Query
    @NameInMap("App")
    @Validation(required = true)
    private App app;

    @Query
    @NameInMap("AudioInfo")
    private AudioInfo audioInfo;

    @Query
    @NameInMap("AvatarInfo")
    private AvatarInfo avatarInfo;

    @Query
    @NameInMap("Callback")
    private Boolean callback;

    @Query
    @NameInMap("CallbackParams")
    private String callbackParams;

    @Query
    @NameInMap("ExtParams")
    private String extParams;

    @Query
    @NameInMap("TenantId")
    @Validation(required = true)
    private Long tenantId;

    @Query
    @NameInMap("Text")
    @Validation(required = true)
    private String text;

    @Query
    @NameInMap("Title")
    @Validation(required = true)
    private String title;

    @Query
    @NameInMap("VideoInfo")
    private VideoInfo videoInfo;

    private SubmitTextTo3DAvatarVideoTaskRequest(Builder builder) {
        super(builder);
        this.app = builder.app;
        this.audioInfo = builder.audioInfo;
        this.avatarInfo = builder.avatarInfo;
        this.callback = builder.callback;
        this.callbackParams = builder.callbackParams;
        this.extParams = builder.extParams;
        this.tenantId = builder.tenantId;
        this.text = builder.text;
        this.title = builder.title;
        this.videoInfo = builder.videoInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitTextTo3DAvatarVideoTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return app
     */
    public App getApp() {
        return this.app;
    }

    /**
     * @return audioInfo
     */
    public AudioInfo getAudioInfo() {
        return this.audioInfo;
    }

    /**
     * @return avatarInfo
     */
    public AvatarInfo getAvatarInfo() {
        return this.avatarInfo;
    }

    /**
     * @return callback
     */
    public Boolean getCallback() {
        return this.callback;
    }

    /**
     * @return callbackParams
     */
    public String getCallbackParams() {
        return this.callbackParams;
    }

    /**
     * @return extParams
     */
    public String getExtParams() {
        return this.extParams;
    }

    /**
     * @return tenantId
     */
    public Long getTenantId() {
        return this.tenantId;
    }

    /**
     * @return text
     */
    public String getText() {
        return this.text;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @return videoInfo
     */
    public VideoInfo getVideoInfo() {
        return this.videoInfo;
    }

    public static final class Builder extends Request.Builder<SubmitTextTo3DAvatarVideoTaskRequest, Builder> {
        private App app; 
        private AudioInfo audioInfo; 
        private AvatarInfo avatarInfo; 
        private Boolean callback; 
        private String callbackParams; 
        private String extParams; 
        private Long tenantId; 
        private String text; 
        private String title; 
        private VideoInfo videoInfo; 

        private Builder() {
            super();
        } 

        private Builder(SubmitTextTo3DAvatarVideoTaskRequest request) {
            super(request);
            this.app = request.app;
            this.audioInfo = request.audioInfo;
            this.avatarInfo = request.avatarInfo;
            this.callback = request.callback;
            this.callbackParams = request.callbackParams;
            this.extParams = request.extParams;
            this.tenantId = request.tenantId;
            this.text = request.text;
            this.title = request.title;
            this.videoInfo = request.videoInfo;
        } 

        /**
         * App.
         */
        public Builder app(App app) {
            String appShrink = shrink(app, "App", "json");
            this.putQueryParameter("App", appShrink);
            this.app = app;
            return this;
        }

        /**
         * AudioInfo.
         */
        public Builder audioInfo(AudioInfo audioInfo) {
            String audioInfoShrink = shrink(audioInfo, "AudioInfo", "json");
            this.putQueryParameter("AudioInfo", audioInfoShrink);
            this.audioInfo = audioInfo;
            return this;
        }

        /**
         * AvatarInfo.
         */
        public Builder avatarInfo(AvatarInfo avatarInfo) {
            String avatarInfoShrink = shrink(avatarInfo, "AvatarInfo", "json");
            this.putQueryParameter("AvatarInfo", avatarInfoShrink);
            this.avatarInfo = avatarInfo;
            return this;
        }

        /**
         * Callback.
         */
        public Builder callback(Boolean callback) {
            this.putQueryParameter("Callback", callback);
            this.callback = callback;
            return this;
        }

        /**
         * CallbackParams.
         */
        public Builder callbackParams(String callbackParams) {
            this.putQueryParameter("CallbackParams", callbackParams);
            this.callbackParams = callbackParams;
            return this;
        }

        /**
         * ExtParams.
         */
        public Builder extParams(String extParams) {
            this.putQueryParameter("ExtParams", extParams);
            this.extParams = extParams;
            return this;
        }

        /**
         * TenantId.
         */
        public Builder tenantId(Long tenantId) {
            this.putQueryParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * Text.
         */
        public Builder text(String text) {
            this.putQueryParameter("Text", text);
            this.text = text;
            return this;
        }

        /**
         * Title.
         */
        public Builder title(String title) {
            this.putQueryParameter("Title", title);
            this.title = title;
            return this;
        }

        /**
         * VideoInfo.
         */
        public Builder videoInfo(VideoInfo videoInfo) {
            String videoInfoShrink = shrink(videoInfo, "VideoInfo", "json");
            this.putQueryParameter("VideoInfo", videoInfoShrink);
            this.videoInfo = videoInfo;
            return this;
        }

        @Override
        public SubmitTextTo3DAvatarVideoTaskRequest build() {
            return new SubmitTextTo3DAvatarVideoTaskRequest(this);
        } 

    } 

    public static class App extends TeaModel {
        @NameInMap("AppId")
        @Validation(required = true)
        private String appId;

        private App(Builder builder) {
            this.appId = builder.appId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static App create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        public static final class Builder {
            private String appId; 

            /**
             * AppId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            public App build() {
                return new App(this);
            } 

        } 

    }
    public static class AudioInfo extends TeaModel {
        @NameInMap("PitchRate")
        private Integer pitchRate;

        @NameInMap("SampleRate")
        private Integer sampleRate;

        @NameInMap("SpeechRate")
        private Integer speechRate;

        @NameInMap("Voice")
        private String voice;

        @NameInMap("Volume")
        private Integer volume;

        private AudioInfo(Builder builder) {
            this.pitchRate = builder.pitchRate;
            this.sampleRate = builder.sampleRate;
            this.speechRate = builder.speechRate;
            this.voice = builder.voice;
            this.volume = builder.volume;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AudioInfo create() {
            return builder().build();
        }

        /**
         * @return pitchRate
         */
        public Integer getPitchRate() {
            return this.pitchRate;
        }

        /**
         * @return sampleRate
         */
        public Integer getSampleRate() {
            return this.sampleRate;
        }

        /**
         * @return speechRate
         */
        public Integer getSpeechRate() {
            return this.speechRate;
        }

        /**
         * @return voice
         */
        public String getVoice() {
            return this.voice;
        }

        /**
         * @return volume
         */
        public Integer getVolume() {
            return this.volume;
        }

        public static final class Builder {
            private Integer pitchRate; 
            private Integer sampleRate; 
            private Integer speechRate; 
            private String voice; 
            private Integer volume; 

            /**
             * PitchRate.
             */
            public Builder pitchRate(Integer pitchRate) {
                this.pitchRate = pitchRate;
                return this;
            }

            /**
             * SampleRate.
             */
            public Builder sampleRate(Integer sampleRate) {
                this.sampleRate = sampleRate;
                return this;
            }

            /**
             * SpeechRate.
             */
            public Builder speechRate(Integer speechRate) {
                this.speechRate = speechRate;
                return this;
            }

            /**
             * Voice.
             */
            public Builder voice(String voice) {
                this.voice = voice;
                return this;
            }

            /**
             * Volume.
             */
            public Builder volume(Integer volume) {
                this.volume = volume;
                return this;
            }

            public AudioInfo build() {
                return new AudioInfo(this);
            } 

        } 

    }
    public static class AvatarInfo extends TeaModel {
        @NameInMap("Angle")
        private Integer angle;

        @NameInMap("Code")
        private String code;

        @NameInMap("IndustryCode")
        private String industryCode;

        @NameInMap("Locate")
        private Integer locate;

        private AvatarInfo(Builder builder) {
            this.angle = builder.angle;
            this.code = builder.code;
            this.industryCode = builder.industryCode;
            this.locate = builder.locate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AvatarInfo create() {
            return builder().build();
        }

        /**
         * @return angle
         */
        public Integer getAngle() {
            return this.angle;
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return industryCode
         */
        public String getIndustryCode() {
            return this.industryCode;
        }

        /**
         * @return locate
         */
        public Integer getLocate() {
            return this.locate;
        }

        public static final class Builder {
            private Integer angle; 
            private String code; 
            private String industryCode; 
            private Integer locate; 

            /**
             * Angle.
             */
            public Builder angle(Integer angle) {
                this.angle = angle;
                return this;
            }

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * IndustryCode.
             */
            public Builder industryCode(String industryCode) {
                this.industryCode = industryCode;
                return this;
            }

            /**
             * Locate.
             */
            public Builder locate(Integer locate) {
                this.locate = locate;
                return this;
            }

            public AvatarInfo build() {
                return new AvatarInfo(this);
            } 

        } 

    }
    public static class SubtitleStyle extends TeaModel {
        @NameInMap("Color")
        private String color;

        @NameInMap("Name")
        private String name;

        @NameInMap("OutlineColor")
        private String outlineColor;

        @NameInMap("Size")
        private Integer size;

        @NameInMap("Y")
        private Integer y;

        private SubtitleStyle(Builder builder) {
            this.color = builder.color;
            this.name = builder.name;
            this.outlineColor = builder.outlineColor;
            this.size = builder.size;
            this.y = builder.y;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubtitleStyle create() {
            return builder().build();
        }

        /**
         * @return color
         */
        public String getColor() {
            return this.color;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return outlineColor
         */
        public String getOutlineColor() {
            return this.outlineColor;
        }

        /**
         * @return size
         */
        public Integer getSize() {
            return this.size;
        }

        /**
         * @return y
         */
        public Integer getY() {
            return this.y;
        }

        public static final class Builder {
            private String color; 
            private String name; 
            private String outlineColor; 
            private Integer size; 
            private Integer y; 

            /**
             * Color.
             */
            public Builder color(String color) {
                this.color = color;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * OutlineColor.
             */
            public Builder outlineColor(String outlineColor) {
                this.outlineColor = outlineColor;
                return this;
            }

            /**
             * Size.
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            /**
             * Y.
             */
            public Builder y(Integer y) {
                this.y = y;
                return this;
            }

            public SubtitleStyle build() {
                return new SubtitleStyle(this);
            } 

        } 

    }
    public static class VideoInfo extends TeaModel {
        @NameInMap("AlphaFormat")
        private Integer alphaFormat;

        @NameInMap("BackgroundImageUrl")
        private String backgroundImageUrl;

        @NameInMap("IsAlpha")
        private Boolean isAlpha;

        @NameInMap("IsSubtitles")
        @Deprecated
        private Boolean isSubtitles;

        @NameInMap("Resolution")
        @Validation(required = true)
        private Integer resolution;

        @NameInMap("SubtitleEmbedded")
        private Boolean subtitleEmbedded;

        @NameInMap("SubtitleStyle")
        private SubtitleStyle subtitleStyle;

        private VideoInfo(Builder builder) {
            this.alphaFormat = builder.alphaFormat;
            this.backgroundImageUrl = builder.backgroundImageUrl;
            this.isAlpha = builder.isAlpha;
            this.isSubtitles = builder.isSubtitles;
            this.resolution = builder.resolution;
            this.subtitleEmbedded = builder.subtitleEmbedded;
            this.subtitleStyle = builder.subtitleStyle;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VideoInfo create() {
            return builder().build();
        }

        /**
         * @return alphaFormat
         */
        public Integer getAlphaFormat() {
            return this.alphaFormat;
        }

        /**
         * @return backgroundImageUrl
         */
        public String getBackgroundImageUrl() {
            return this.backgroundImageUrl;
        }

        /**
         * @return isAlpha
         */
        public Boolean getIsAlpha() {
            return this.isAlpha;
        }

        /**
         * @return isSubtitles
         */
        public Boolean getIsSubtitles() {
            return this.isSubtitles;
        }

        /**
         * @return resolution
         */
        public Integer getResolution() {
            return this.resolution;
        }

        /**
         * @return subtitleEmbedded
         */
        public Boolean getSubtitleEmbedded() {
            return this.subtitleEmbedded;
        }

        /**
         * @return subtitleStyle
         */
        public SubtitleStyle getSubtitleStyle() {
            return this.subtitleStyle;
        }

        public static final class Builder {
            private Integer alphaFormat; 
            private String backgroundImageUrl; 
            private Boolean isAlpha; 
            private Boolean isSubtitles; 
            private Integer resolution; 
            private Boolean subtitleEmbedded; 
            private SubtitleStyle subtitleStyle; 

            /**
             * AlphaFormat.
             */
            public Builder alphaFormat(Integer alphaFormat) {
                this.alphaFormat = alphaFormat;
                return this;
            }

            /**
             * BackgroundImageUrl.
             */
            public Builder backgroundImageUrl(String backgroundImageUrl) {
                this.backgroundImageUrl = backgroundImageUrl;
                return this;
            }

            /**
             * IsAlpha.
             */
            public Builder isAlpha(Boolean isAlpha) {
                this.isAlpha = isAlpha;
                return this;
            }

            /**
             * IsSubtitles.
             */
            public Builder isSubtitles(Boolean isSubtitles) {
                this.isSubtitles = isSubtitles;
                return this;
            }

            /**
             * Resolution.
             */
            public Builder resolution(Integer resolution) {
                this.resolution = resolution;
                return this;
            }

            /**
             * SubtitleEmbedded.
             */
            public Builder subtitleEmbedded(Boolean subtitleEmbedded) {
                this.subtitleEmbedded = subtitleEmbedded;
                return this;
            }

            /**
             * SubtitleStyle.
             */
            public Builder subtitleStyle(SubtitleStyle subtitleStyle) {
                this.subtitleStyle = subtitleStyle;
                return this;
            }

            public VideoInfo build() {
                return new VideoInfo(this);
            } 

        } 

    }
}
