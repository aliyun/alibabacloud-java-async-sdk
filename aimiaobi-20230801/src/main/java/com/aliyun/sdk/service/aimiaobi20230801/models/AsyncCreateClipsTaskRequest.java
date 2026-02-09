// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

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
 * {@link AsyncCreateClipsTaskRequest} extends {@link RequestModel}
 *
 * <p>AsyncCreateClipsTaskRequest</p>
 */
public class AsyncCreateClipsTaskRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CloseMusic")
    private Boolean closeMusic;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CloseSubtitle")
    private Boolean closeSubtitle;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CloseVoice")
    private Boolean closeVoice;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClosingCreditsUrl")
    private String closingCreditsUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ColorWords")
    private java.util.List<ColorWords> colorWords;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CosyVoiceAppKey")
    private String cosyVoiceAppKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CosyVoiceToken")
    private String cosyVoiceToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CustomVoiceStyle")
    private String customVoiceStyle;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CustomVoiceUrl")
    private String customVoiceUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CustomVoiceVolume")
    private Integer customVoiceVolume;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Height")
    private Integer height;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("HighDefSourceVideos")
    private java.util.List<HighDefSourceVideos> highDefSourceVideos;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MusicStyle")
    private String musicStyle;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MusicUrl")
    private String musicUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MusicVolume")
    private Integer musicVolume;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OpeningCreditsUrl")
    private String openingCreditsUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Stickers")
    private java.util.List<Stickers> stickers;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SubtitleFontSize")
    private Integer subtitleFontSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VoiceStyle")
    private String voiceStyle;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VoiceVolume")
    private Integer voiceVolume;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Width")
    private Integer width;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private AsyncCreateClipsTaskRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.closeMusic = builder.closeMusic;
        this.closeSubtitle = builder.closeSubtitle;
        this.closeVoice = builder.closeVoice;
        this.closingCreditsUrl = builder.closingCreditsUrl;
        this.colorWords = builder.colorWords;
        this.cosyVoiceAppKey = builder.cosyVoiceAppKey;
        this.cosyVoiceToken = builder.cosyVoiceToken;
        this.customVoiceStyle = builder.customVoiceStyle;
        this.customVoiceUrl = builder.customVoiceUrl;
        this.customVoiceVolume = builder.customVoiceVolume;
        this.height = builder.height;
        this.highDefSourceVideos = builder.highDefSourceVideos;
        this.musicStyle = builder.musicStyle;
        this.musicUrl = builder.musicUrl;
        this.musicVolume = builder.musicVolume;
        this.openingCreditsUrl = builder.openingCreditsUrl;
        this.stickers = builder.stickers;
        this.subtitleFontSize = builder.subtitleFontSize;
        this.taskId = builder.taskId;
        this.voiceStyle = builder.voiceStyle;
        this.voiceVolume = builder.voiceVolume;
        this.width = builder.width;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AsyncCreateClipsTaskRequest create() {
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
     * @return closeMusic
     */
    public Boolean getCloseMusic() {
        return this.closeMusic;
    }

    /**
     * @return closeSubtitle
     */
    public Boolean getCloseSubtitle() {
        return this.closeSubtitle;
    }

    /**
     * @return closeVoice
     */
    public Boolean getCloseVoice() {
        return this.closeVoice;
    }

    /**
     * @return closingCreditsUrl
     */
    public String getClosingCreditsUrl() {
        return this.closingCreditsUrl;
    }

    /**
     * @return colorWords
     */
    public java.util.List<ColorWords> getColorWords() {
        return this.colorWords;
    }

    /**
     * @return cosyVoiceAppKey
     */
    public String getCosyVoiceAppKey() {
        return this.cosyVoiceAppKey;
    }

    /**
     * @return cosyVoiceToken
     */
    public String getCosyVoiceToken() {
        return this.cosyVoiceToken;
    }

    /**
     * @return customVoiceStyle
     */
    public String getCustomVoiceStyle() {
        return this.customVoiceStyle;
    }

    /**
     * @return customVoiceUrl
     */
    public String getCustomVoiceUrl() {
        return this.customVoiceUrl;
    }

    /**
     * @return customVoiceVolume
     */
    public Integer getCustomVoiceVolume() {
        return this.customVoiceVolume;
    }

    /**
     * @return height
     */
    public Integer getHeight() {
        return this.height;
    }

    /**
     * @return highDefSourceVideos
     */
    public java.util.List<HighDefSourceVideos> getHighDefSourceVideos() {
        return this.highDefSourceVideos;
    }

    /**
     * @return musicStyle
     */
    public String getMusicStyle() {
        return this.musicStyle;
    }

    /**
     * @return musicUrl
     */
    public String getMusicUrl() {
        return this.musicUrl;
    }

    /**
     * @return musicVolume
     */
    public Integer getMusicVolume() {
        return this.musicVolume;
    }

    /**
     * @return openingCreditsUrl
     */
    public String getOpeningCreditsUrl() {
        return this.openingCreditsUrl;
    }

    /**
     * @return stickers
     */
    public java.util.List<Stickers> getStickers() {
        return this.stickers;
    }

    /**
     * @return subtitleFontSize
     */
    public Integer getSubtitleFontSize() {
        return this.subtitleFontSize;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return voiceStyle
     */
    public String getVoiceStyle() {
        return this.voiceStyle;
    }

    /**
     * @return voiceVolume
     */
    public Integer getVoiceVolume() {
        return this.voiceVolume;
    }

    /**
     * @return width
     */
    public Integer getWidth() {
        return this.width;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<AsyncCreateClipsTaskRequest, Builder> {
        private String regionId; 
        private Boolean closeMusic; 
        private Boolean closeSubtitle; 
        private Boolean closeVoice; 
        private String closingCreditsUrl; 
        private java.util.List<ColorWords> colorWords; 
        private String cosyVoiceAppKey; 
        private String cosyVoiceToken; 
        private String customVoiceStyle; 
        private String customVoiceUrl; 
        private Integer customVoiceVolume; 
        private Integer height; 
        private java.util.List<HighDefSourceVideos> highDefSourceVideos; 
        private String musicStyle; 
        private String musicUrl; 
        private Integer musicVolume; 
        private String openingCreditsUrl; 
        private java.util.List<Stickers> stickers; 
        private Integer subtitleFontSize; 
        private String taskId; 
        private String voiceStyle; 
        private Integer voiceVolume; 
        private Integer width; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(AsyncCreateClipsTaskRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.closeMusic = request.closeMusic;
            this.closeSubtitle = request.closeSubtitle;
            this.closeVoice = request.closeVoice;
            this.closingCreditsUrl = request.closingCreditsUrl;
            this.colorWords = request.colorWords;
            this.cosyVoiceAppKey = request.cosyVoiceAppKey;
            this.cosyVoiceToken = request.cosyVoiceToken;
            this.customVoiceStyle = request.customVoiceStyle;
            this.customVoiceUrl = request.customVoiceUrl;
            this.customVoiceVolume = request.customVoiceVolume;
            this.height = request.height;
            this.highDefSourceVideos = request.highDefSourceVideos;
            this.musicStyle = request.musicStyle;
            this.musicUrl = request.musicUrl;
            this.musicVolume = request.musicVolume;
            this.openingCreditsUrl = request.openingCreditsUrl;
            this.stickers = request.stickers;
            this.subtitleFontSize = request.subtitleFontSize;
            this.taskId = request.taskId;
            this.voiceStyle = request.voiceStyle;
            this.voiceVolume = request.voiceVolume;
            this.width = request.width;
            this.workspaceId = request.workspaceId;
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
         * CloseMusic.
         */
        public Builder closeMusic(Boolean closeMusic) {
            this.putBodyParameter("CloseMusic", closeMusic);
            this.closeMusic = closeMusic;
            return this;
        }

        /**
         * CloseSubtitle.
         */
        public Builder closeSubtitle(Boolean closeSubtitle) {
            this.putBodyParameter("CloseSubtitle", closeSubtitle);
            this.closeSubtitle = closeSubtitle;
            return this;
        }

        /**
         * CloseVoice.
         */
        public Builder closeVoice(Boolean closeVoice) {
            this.putBodyParameter("CloseVoice", closeVoice);
            this.closeVoice = closeVoice;
            return this;
        }

        /**
         * ClosingCreditsUrl.
         */
        public Builder closingCreditsUrl(String closingCreditsUrl) {
            this.putBodyParameter("ClosingCreditsUrl", closingCreditsUrl);
            this.closingCreditsUrl = closingCreditsUrl;
            return this;
        }

        /**
         * ColorWords.
         */
        public Builder colorWords(java.util.List<ColorWords> colorWords) {
            String colorWordsShrink = shrink(colorWords, "ColorWords", "json");
            this.putBodyParameter("ColorWords", colorWordsShrink);
            this.colorWords = colorWords;
            return this;
        }

        /**
         * CosyVoiceAppKey.
         */
        public Builder cosyVoiceAppKey(String cosyVoiceAppKey) {
            this.putBodyParameter("CosyVoiceAppKey", cosyVoiceAppKey);
            this.cosyVoiceAppKey = cosyVoiceAppKey;
            return this;
        }

        /**
         * CosyVoiceToken.
         */
        public Builder cosyVoiceToken(String cosyVoiceToken) {
            this.putBodyParameter("CosyVoiceToken", cosyVoiceToken);
            this.cosyVoiceToken = cosyVoiceToken;
            return this;
        }

        /**
         * CustomVoiceStyle.
         */
        public Builder customVoiceStyle(String customVoiceStyle) {
            this.putBodyParameter("CustomVoiceStyle", customVoiceStyle);
            this.customVoiceStyle = customVoiceStyle;
            return this;
        }

        /**
         * CustomVoiceUrl.
         */
        public Builder customVoiceUrl(String customVoiceUrl) {
            this.putBodyParameter("CustomVoiceUrl", customVoiceUrl);
            this.customVoiceUrl = customVoiceUrl;
            return this;
        }

        /**
         * CustomVoiceVolume.
         */
        public Builder customVoiceVolume(Integer customVoiceVolume) {
            this.putBodyParameter("CustomVoiceVolume", customVoiceVolume);
            this.customVoiceVolume = customVoiceVolume;
            return this;
        }

        /**
         * Height.
         */
        public Builder height(Integer height) {
            this.putBodyParameter("Height", height);
            this.height = height;
            return this;
        }

        /**
         * HighDefSourceVideos.
         */
        public Builder highDefSourceVideos(java.util.List<HighDefSourceVideos> highDefSourceVideos) {
            String highDefSourceVideosShrink = shrink(highDefSourceVideos, "HighDefSourceVideos", "json");
            this.putBodyParameter("HighDefSourceVideos", highDefSourceVideosShrink);
            this.highDefSourceVideos = highDefSourceVideos;
            return this;
        }

        /**
         * MusicStyle.
         */
        public Builder musicStyle(String musicStyle) {
            this.putBodyParameter("MusicStyle", musicStyle);
            this.musicStyle = musicStyle;
            return this;
        }

        /**
         * MusicUrl.
         */
        public Builder musicUrl(String musicUrl) {
            this.putBodyParameter("MusicUrl", musicUrl);
            this.musicUrl = musicUrl;
            return this;
        }

        /**
         * MusicVolume.
         */
        public Builder musicVolume(Integer musicVolume) {
            this.putBodyParameter("MusicVolume", musicVolume);
            this.musicVolume = musicVolume;
            return this;
        }

        /**
         * OpeningCreditsUrl.
         */
        public Builder openingCreditsUrl(String openingCreditsUrl) {
            this.putBodyParameter("OpeningCreditsUrl", openingCreditsUrl);
            this.openingCreditsUrl = openingCreditsUrl;
            return this;
        }

        /**
         * Stickers.
         */
        public Builder stickers(java.util.List<Stickers> stickers) {
            String stickersShrink = shrink(stickers, "Stickers", "json");
            this.putBodyParameter("Stickers", stickersShrink);
            this.stickers = stickers;
            return this;
        }

        /**
         * SubtitleFontSize.
         */
        public Builder subtitleFontSize(Integer subtitleFontSize) {
            this.putBodyParameter("SubtitleFontSize", subtitleFontSize);
            this.subtitleFontSize = subtitleFontSize;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>17a299a9-f223-4707-b0dd-4c22519bddf5</p>
         */
        public Builder taskId(String taskId) {
            this.putBodyParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * VoiceStyle.
         */
        public Builder voiceStyle(String voiceStyle) {
            this.putBodyParameter("VoiceStyle", voiceStyle);
            this.voiceStyle = voiceStyle;
            return this;
        }

        /**
         * VoiceVolume.
         */
        public Builder voiceVolume(Integer voiceVolume) {
            this.putBodyParameter("VoiceVolume", voiceVolume);
            this.voiceVolume = voiceVolume;
            return this;
        }

        /**
         * Width.
         */
        public Builder width(Integer width) {
            this.putBodyParameter("Width", width);
            this.width = width;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-ipe7d81yq4sl5jmk</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public AsyncCreateClipsTaskRequest build() {
            return new AsyncCreateClipsTaskRequest(this);
        } 

    } 

    /**
     * 
     * {@link AsyncCreateClipsTaskRequest} extends {@link TeaModel}
     *
     * <p>AsyncCreateClipsTaskRequest</p>
     */
    public static class ColorWords extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("EffectColorStyle")
        private String effectColorStyle;

        @com.aliyun.core.annotation.NameInMap("FontSize")
        private Integer fontSize;

        @com.aliyun.core.annotation.NameInMap("TimelineIn")
        private Integer timelineIn;

        @com.aliyun.core.annotation.NameInMap("TimelineOut")
        private Integer timelineOut;

        @com.aliyun.core.annotation.NameInMap("X")
        private Float x;

        @com.aliyun.core.annotation.NameInMap("Y")
        private Float y;

        private ColorWords(Builder builder) {
            this.content = builder.content;
            this.effectColorStyle = builder.effectColorStyle;
            this.fontSize = builder.fontSize;
            this.timelineIn = builder.timelineIn;
            this.timelineOut = builder.timelineOut;
            this.x = builder.x;
            this.y = builder.y;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ColorWords create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return effectColorStyle
         */
        public String getEffectColorStyle() {
            return this.effectColorStyle;
        }

        /**
         * @return fontSize
         */
        public Integer getFontSize() {
            return this.fontSize;
        }

        /**
         * @return timelineIn
         */
        public Integer getTimelineIn() {
            return this.timelineIn;
        }

        /**
         * @return timelineOut
         */
        public Integer getTimelineOut() {
            return this.timelineOut;
        }

        /**
         * @return x
         */
        public Float getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public Float getY() {
            return this.y;
        }

        public static final class Builder {
            private String content; 
            private String effectColorStyle; 
            private Integer fontSize; 
            private Integer timelineIn; 
            private Integer timelineOut; 
            private Float x; 
            private Float y; 

            private Builder() {
            } 

            private Builder(ColorWords model) {
                this.content = model.content;
                this.effectColorStyle = model.effectColorStyle;
                this.fontSize = model.fontSize;
                this.timelineIn = model.timelineIn;
                this.timelineOut = model.timelineOut;
                this.x = model.x;
                this.y = model.y;
            } 

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * EffectColorStyle.
             */
            public Builder effectColorStyle(String effectColorStyle) {
                this.effectColorStyle = effectColorStyle;
                return this;
            }

            /**
             * FontSize.
             */
            public Builder fontSize(Integer fontSize) {
                this.fontSize = fontSize;
                return this;
            }

            /**
             * TimelineIn.
             */
            public Builder timelineIn(Integer timelineIn) {
                this.timelineIn = timelineIn;
                return this;
            }

            /**
             * TimelineOut.
             */
            public Builder timelineOut(Integer timelineOut) {
                this.timelineOut = timelineOut;
                return this;
            }

            /**
             * X.
             */
            public Builder x(Float x) {
                this.x = x;
                return this;
            }

            /**
             * Y.
             */
            public Builder y(Float y) {
                this.y = y;
                return this;
            }

            public ColorWords build() {
                return new ColorWords(this);
            } 

        } 

    }
    /**
     * 
     * {@link AsyncCreateClipsTaskRequest} extends {@link TeaModel}
     *
     * <p>AsyncCreateClipsTaskRequest</p>
     */
    public static class HighDefSourceVideos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("VideoId")
        private String videoId;

        @com.aliyun.core.annotation.NameInMap("VideoName")
        private String videoName;

        @com.aliyun.core.annotation.NameInMap("VideoUrl")
        private String videoUrl;

        private HighDefSourceVideos(Builder builder) {
            this.videoId = builder.videoId;
            this.videoName = builder.videoName;
            this.videoUrl = builder.videoUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HighDefSourceVideos create() {
            return builder().build();
        }

        /**
         * @return videoId
         */
        public String getVideoId() {
            return this.videoId;
        }

        /**
         * @return videoName
         */
        public String getVideoName() {
            return this.videoName;
        }

        /**
         * @return videoUrl
         */
        public String getVideoUrl() {
            return this.videoUrl;
        }

        public static final class Builder {
            private String videoId; 
            private String videoName; 
            private String videoUrl; 

            private Builder() {
            } 

            private Builder(HighDefSourceVideos model) {
                this.videoId = model.videoId;
                this.videoName = model.videoName;
                this.videoUrl = model.videoUrl;
            } 

            /**
             * VideoId.
             */
            public Builder videoId(String videoId) {
                this.videoId = videoId;
                return this;
            }

            /**
             * VideoName.
             */
            public Builder videoName(String videoName) {
                this.videoName = videoName;
                return this;
            }

            /**
             * VideoUrl.
             */
            public Builder videoUrl(String videoUrl) {
                this.videoUrl = videoUrl;
                return this;
            }

            public HighDefSourceVideos build() {
                return new HighDefSourceVideos(this);
            } 

        } 

    }
    /**
     * 
     * {@link AsyncCreateClipsTaskRequest} extends {@link TeaModel}
     *
     * <p>AsyncCreateClipsTaskRequest</p>
     */
    public static class Stickers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Duration")
        private Integer duration;

        @com.aliyun.core.annotation.NameInMap("DyncFrames")
        private Integer dyncFrames;

        @com.aliyun.core.annotation.NameInMap("Height")
        private Integer height;

        @com.aliyun.core.annotation.NameInMap("TimelineIn")
        private Integer timelineIn;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        @com.aliyun.core.annotation.NameInMap("Width")
        private Integer width;

        @com.aliyun.core.annotation.NameInMap("X")
        private Float x;

        @com.aliyun.core.annotation.NameInMap("Y")
        private Float y;

        private Stickers(Builder builder) {
            this.duration = builder.duration;
            this.dyncFrames = builder.dyncFrames;
            this.height = builder.height;
            this.timelineIn = builder.timelineIn;
            this.url = builder.url;
            this.width = builder.width;
            this.x = builder.x;
            this.y = builder.y;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Stickers create() {
            return builder().build();
        }

        /**
         * @return duration
         */
        public Integer getDuration() {
            return this.duration;
        }

        /**
         * @return dyncFrames
         */
        public Integer getDyncFrames() {
            return this.dyncFrames;
        }

        /**
         * @return height
         */
        public Integer getHeight() {
            return this.height;
        }

        /**
         * @return timelineIn
         */
        public Integer getTimelineIn() {
            return this.timelineIn;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        /**
         * @return width
         */
        public Integer getWidth() {
            return this.width;
        }

        /**
         * @return x
         */
        public Float getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public Float getY() {
            return this.y;
        }

        public static final class Builder {
            private Integer duration; 
            private Integer dyncFrames; 
            private Integer height; 
            private Integer timelineIn; 
            private String url; 
            private Integer width; 
            private Float x; 
            private Float y; 

            private Builder() {
            } 

            private Builder(Stickers model) {
                this.duration = model.duration;
                this.dyncFrames = model.dyncFrames;
                this.height = model.height;
                this.timelineIn = model.timelineIn;
                this.url = model.url;
                this.width = model.width;
                this.x = model.x;
                this.y = model.y;
            } 

            /**
             * Duration.
             */
            public Builder duration(Integer duration) {
                this.duration = duration;
                return this;
            }

            /**
             * DyncFrames.
             */
            public Builder dyncFrames(Integer dyncFrames) {
                this.dyncFrames = dyncFrames;
                return this;
            }

            /**
             * Height.
             */
            public Builder height(Integer height) {
                this.height = height;
                return this;
            }

            /**
             * TimelineIn.
             */
            public Builder timelineIn(Integer timelineIn) {
                this.timelineIn = timelineIn;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            /**
             * Width.
             */
            public Builder width(Integer width) {
                this.width = width;
                return this;
            }

            /**
             * X.
             */
            public Builder x(Float x) {
                this.x = x;
                return this;
            }

            /**
             * Y.
             */
            public Builder y(Float y) {
                this.y = y;
                return this;
            }

            public Stickers build() {
                return new Stickers(this);
            } 

        } 

    }
}
