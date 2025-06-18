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
    @com.aliyun.core.annotation.NameInMap("ColorWords")
    private java.util.List<ColorWords> colorWords;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Height")
    private Integer height;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MusicUrl")
    private String musicUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MusicVolume")
    private Integer musicVolume;

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
        this.colorWords = builder.colorWords;
        this.height = builder.height;
        this.musicUrl = builder.musicUrl;
        this.musicVolume = builder.musicVolume;
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
     * @return colorWords
     */
    public java.util.List<ColorWords> getColorWords() {
        return this.colorWords;
    }

    /**
     * @return height
     */
    public Integer getHeight() {
        return this.height;
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
        private java.util.List<ColorWords> colorWords; 
        private Integer height; 
        private String musicUrl; 
        private Integer musicVolume; 
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
            this.colorWords = request.colorWords;
            this.height = request.height;
            this.musicUrl = request.musicUrl;
            this.musicVolume = request.musicVolume;
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
         * ColorWords.
         */
        public Builder colorWords(java.util.List<ColorWords> colorWords) {
            String colorWordsShrink = shrink(colorWords, "ColorWords", "json");
            this.putBodyParameter("ColorWords", colorWordsShrink);
            this.colorWords = colorWords;
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
}
