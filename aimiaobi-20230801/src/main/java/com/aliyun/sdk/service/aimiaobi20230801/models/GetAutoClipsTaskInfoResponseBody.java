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
 * {@link GetAutoClipsTaskInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetAutoClipsTaskInfoResponseBody</p>
 */
public class GetAutoClipsTaskInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetAutoClipsTaskInfoResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAutoClipsTaskInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetAutoClipsTaskInfoResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>1813ceee-7fe5-41b4-87e5-982a4d18cca5</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAutoClipsTaskInfoResponseBody build() {
            return new GetAutoClipsTaskInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAutoClipsTaskInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetAutoClipsTaskInfoResponseBody</p>
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
     * {@link GetAutoClipsTaskInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetAutoClipsTaskInfoResponseBody</p>
     */
    public static class Clips extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClipId")
        private String clipId;

        @com.aliyun.core.annotation.NameInMap("ContentInner")
        private String contentInner;

        @com.aliyun.core.annotation.NameInMap("In")
        private Integer in;

        @com.aliyun.core.annotation.NameInMap("InEx")
        private Float inEx;

        @com.aliyun.core.annotation.NameInMap("Out")
        private Integer out;

        @com.aliyun.core.annotation.NameInMap("OutEx")
        private Float outEx;

        @com.aliyun.core.annotation.NameInMap("VideoId")
        private String videoId;

        @com.aliyun.core.annotation.NameInMap("VideoName")
        private String videoName;

        private Clips(Builder builder) {
            this.clipId = builder.clipId;
            this.contentInner = builder.contentInner;
            this.in = builder.in;
            this.inEx = builder.inEx;
            this.out = builder.out;
            this.outEx = builder.outEx;
            this.videoId = builder.videoId;
            this.videoName = builder.videoName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Clips create() {
            return builder().build();
        }

        /**
         * @return clipId
         */
        public String getClipId() {
            return this.clipId;
        }

        /**
         * @return contentInner
         */
        public String getContentInner() {
            return this.contentInner;
        }

        /**
         * @return in
         */
        public Integer getIn() {
            return this.in;
        }

        /**
         * @return inEx
         */
        public Float getInEx() {
            return this.inEx;
        }

        /**
         * @return out
         */
        public Integer getOut() {
            return this.out;
        }

        /**
         * @return outEx
         */
        public Float getOutEx() {
            return this.outEx;
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

        public static final class Builder {
            private String clipId; 
            private String contentInner; 
            private Integer in; 
            private Float inEx; 
            private Integer out; 
            private Float outEx; 
            private String videoId; 
            private String videoName; 

            private Builder() {
            } 

            private Builder(Clips model) {
                this.clipId = model.clipId;
                this.contentInner = model.contentInner;
                this.in = model.in;
                this.inEx = model.inEx;
                this.out = model.out;
                this.outEx = model.outEx;
                this.videoId = model.videoId;
                this.videoName = model.videoName;
            } 

            /**
             * ClipId.
             */
            public Builder clipId(String clipId) {
                this.clipId = clipId;
                return this;
            }

            /**
             * ContentInner.
             */
            public Builder contentInner(String contentInner) {
                this.contentInner = contentInner;
                return this;
            }

            /**
             * In.
             */
            public Builder in(Integer in) {
                this.in = in;
                return this;
            }

            /**
             * InEx.
             */
            public Builder inEx(Float inEx) {
                this.inEx = inEx;
                return this;
            }

            /**
             * Out.
             */
            public Builder out(Integer out) {
                this.out = out;
                return this;
            }

            /**
             * OutEx.
             */
            public Builder outEx(Float outEx) {
                this.outEx = outEx;
                return this;
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

            public Clips build() {
                return new Clips(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAutoClipsTaskInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetAutoClipsTaskInfoResponseBody</p>
     */
    public static class Timelines extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Clips")
        private java.util.List<Clips> clips;

        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("TimelineId")
        private String timelineId;

        private Timelines(Builder builder) {
            this.clips = builder.clips;
            this.content = builder.content;
            this.timelineId = builder.timelineId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Timelines create() {
            return builder().build();
        }

        /**
         * @return clips
         */
        public java.util.List<Clips> getClips() {
            return this.clips;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return timelineId
         */
        public String getTimelineId() {
            return this.timelineId;
        }

        public static final class Builder {
            private java.util.List<Clips> clips; 
            private String content; 
            private String timelineId; 

            private Builder() {
            } 

            private Builder(Timelines model) {
                this.clips = model.clips;
                this.content = model.content;
                this.timelineId = model.timelineId;
            } 

            /**
             * Clips.
             */
            public Builder clips(java.util.List<Clips> clips) {
                this.clips = clips;
                return this;
            }

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * TimelineId.
             */
            public Builder timelineId(String timelineId) {
                this.timelineId = timelineId;
                return this;
            }

            public Timelines build() {
                return new Timelines(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAutoClipsTaskInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetAutoClipsTaskInfoResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ColorWords")
        private java.util.List<ColorWords> colorWords;

        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("MediaCloudTimeline")
        private String mediaCloudTimeline;

        @com.aliyun.core.annotation.NameInMap("MusicStyle")
        private String musicStyle;

        @com.aliyun.core.annotation.NameInMap("MusicUrl")
        private String musicUrl;

        @com.aliyun.core.annotation.NameInMap("MusicVolume")
        private Integer musicVolume;

        @com.aliyun.core.annotation.NameInMap("OutputVideoUrl")
        private String outputVideoUrl;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("Step")
        private String step;

        @com.aliyun.core.annotation.NameInMap("SubtitleFontSize")
        private Integer subtitleFontSize;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("Timelines")
        private java.util.List<Timelines> timelines;

        @com.aliyun.core.annotation.NameInMap("VoiceStyle")
        private String voiceStyle;

        @com.aliyun.core.annotation.NameInMap("VoiceVolume")
        private Integer voiceVolume;

        private Data(Builder builder) {
            this.colorWords = builder.colorWords;
            this.content = builder.content;
            this.errorMessage = builder.errorMessage;
            this.mediaCloudTimeline = builder.mediaCloudTimeline;
            this.musicStyle = builder.musicStyle;
            this.musicUrl = builder.musicUrl;
            this.musicVolume = builder.musicVolume;
            this.outputVideoUrl = builder.outputVideoUrl;
            this.status = builder.status;
            this.step = builder.step;
            this.subtitleFontSize = builder.subtitleFontSize;
            this.taskId = builder.taskId;
            this.timelines = builder.timelines;
            this.voiceStyle = builder.voiceStyle;
            this.voiceVolume = builder.voiceVolume;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return colorWords
         */
        public java.util.List<ColorWords> getColorWords() {
            return this.colorWords;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return mediaCloudTimeline
         */
        public String getMediaCloudTimeline() {
            return this.mediaCloudTimeline;
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
         * @return outputVideoUrl
         */
        public String getOutputVideoUrl() {
            return this.outputVideoUrl;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return step
         */
        public String getStep() {
            return this.step;
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
         * @return timelines
         */
        public java.util.List<Timelines> getTimelines() {
            return this.timelines;
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

        public static final class Builder {
            private java.util.List<ColorWords> colorWords; 
            private String content; 
            private String errorMessage; 
            private String mediaCloudTimeline; 
            private String musicStyle; 
            private String musicUrl; 
            private Integer musicVolume; 
            private String outputVideoUrl; 
            private Integer status; 
            private String step; 
            private Integer subtitleFontSize; 
            private String taskId; 
            private java.util.List<Timelines> timelines; 
            private String voiceStyle; 
            private Integer voiceVolume; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.colorWords = model.colorWords;
                this.content = model.content;
                this.errorMessage = model.errorMessage;
                this.mediaCloudTimeline = model.mediaCloudTimeline;
                this.musicStyle = model.musicStyle;
                this.musicUrl = model.musicUrl;
                this.musicVolume = model.musicVolume;
                this.outputVideoUrl = model.outputVideoUrl;
                this.status = model.status;
                this.step = model.step;
                this.subtitleFontSize = model.subtitleFontSize;
                this.taskId = model.taskId;
                this.timelines = model.timelines;
                this.voiceStyle = model.voiceStyle;
                this.voiceVolume = model.voiceVolume;
            } 

            /**
             * ColorWords.
             */
            public Builder colorWords(java.util.List<ColorWords> colorWords) {
                this.colorWords = colorWords;
                return this;
            }

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * ErrorMessage.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * MediaCloudTimeline.
             */
            public Builder mediaCloudTimeline(String mediaCloudTimeline) {
                this.mediaCloudTimeline = mediaCloudTimeline;
                return this;
            }

            /**
             * MusicStyle.
             */
            public Builder musicStyle(String musicStyle) {
                this.musicStyle = musicStyle;
                return this;
            }

            /**
             * MusicUrl.
             */
            public Builder musicUrl(String musicUrl) {
                this.musicUrl = musicUrl;
                return this;
            }

            /**
             * MusicVolume.
             */
            public Builder musicVolume(Integer musicVolume) {
                this.musicVolume = musicVolume;
                return this;
            }

            /**
             * OutputVideoUrl.
             */
            public Builder outputVideoUrl(String outputVideoUrl) {
                this.outputVideoUrl = outputVideoUrl;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * Step.
             */
            public Builder step(String step) {
                this.step = step;
                return this;
            }

            /**
             * SubtitleFontSize.
             */
            public Builder subtitleFontSize(Integer subtitleFontSize) {
                this.subtitleFontSize = subtitleFontSize;
                return this;
            }

            /**
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * Timelines.
             */
            public Builder timelines(java.util.List<Timelines> timelines) {
                this.timelines = timelines;
                return this;
            }

            /**
             * VoiceStyle.
             */
            public Builder voiceStyle(String voiceStyle) {
                this.voiceStyle = voiceStyle;
                return this;
            }

            /**
             * VoiceVolume.
             */
            public Builder voiceVolume(Integer voiceVolume) {
                this.voiceVolume = voiceVolume;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
