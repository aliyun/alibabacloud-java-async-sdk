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

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetAutoClipsTaskInfoResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
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
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetAutoClipsTaskInfoResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
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
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
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
    public static class EndTime extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Hour")
        private Integer hour;

        @com.aliyun.core.annotation.NameInMap("MillSecond")
        private Integer millSecond;

        @com.aliyun.core.annotation.NameInMap("Minute")
        private Integer minute;

        @com.aliyun.core.annotation.NameInMap("Second")
        private Integer second;

        private EndTime(Builder builder) {
            this.hour = builder.hour;
            this.millSecond = builder.millSecond;
            this.minute = builder.minute;
            this.second = builder.second;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EndTime create() {
            return builder().build();
        }

        /**
         * @return hour
         */
        public Integer getHour() {
            return this.hour;
        }

        /**
         * @return millSecond
         */
        public Integer getMillSecond() {
            return this.millSecond;
        }

        /**
         * @return minute
         */
        public Integer getMinute() {
            return this.minute;
        }

        /**
         * @return second
         */
        public Integer getSecond() {
            return this.second;
        }

        public static final class Builder {
            private Integer hour; 
            private Integer millSecond; 
            private Integer minute; 
            private Integer second; 

            private Builder() {
            } 

            private Builder(EndTime model) {
                this.hour = model.hour;
                this.millSecond = model.millSecond;
                this.minute = model.minute;
                this.second = model.second;
            } 

            /**
             * Hour.
             */
            public Builder hour(Integer hour) {
                this.hour = hour;
                return this;
            }

            /**
             * MillSecond.
             */
            public Builder millSecond(Integer millSecond) {
                this.millSecond = millSecond;
                return this;
            }

            /**
             * Minute.
             */
            public Builder minute(Integer minute) {
                this.minute = minute;
                return this;
            }

            /**
             * Second.
             */
            public Builder second(Integer second) {
                this.second = second;
                return this;
            }

            public EndTime build() {
                return new EndTime(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAutoClipsTaskInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetAutoClipsTaskInfoResponseBody</p>
     */
    public static class StartTime extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Hour")
        private Integer hour;

        @com.aliyun.core.annotation.NameInMap("MillSecond")
        private Integer millSecond;

        @com.aliyun.core.annotation.NameInMap("Minute")
        private Integer minute;

        @com.aliyun.core.annotation.NameInMap("Second")
        private Integer second;

        private StartTime(Builder builder) {
            this.hour = builder.hour;
            this.millSecond = builder.millSecond;
            this.minute = builder.minute;
            this.second = builder.second;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StartTime create() {
            return builder().build();
        }

        /**
         * @return hour
         */
        public Integer getHour() {
            return this.hour;
        }

        /**
         * @return millSecond
         */
        public Integer getMillSecond() {
            return this.millSecond;
        }

        /**
         * @return minute
         */
        public Integer getMinute() {
            return this.minute;
        }

        /**
         * @return second
         */
        public Integer getSecond() {
            return this.second;
        }

        public static final class Builder {
            private Integer hour; 
            private Integer millSecond; 
            private Integer minute; 
            private Integer second; 

            private Builder() {
            } 

            private Builder(StartTime model) {
                this.hour = model.hour;
                this.millSecond = model.millSecond;
                this.minute = model.minute;
                this.second = model.second;
            } 

            /**
             * Hour.
             */
            public Builder hour(Integer hour) {
                this.hour = hour;
                return this;
            }

            /**
             * MillSecond.
             */
            public Builder millSecond(Integer millSecond) {
                this.millSecond = millSecond;
                return this;
            }

            /**
             * Minute.
             */
            public Builder minute(Integer minute) {
                this.minute = minute;
                return this;
            }

            /**
             * Second.
             */
            public Builder second(Integer second) {
                this.second = second;
                return this;
            }

            public StartTime build() {
                return new StartTime(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAutoClipsTaskInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetAutoClipsTaskInfoResponseBody</p>
     */
    public static class LensInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AnalysisContent")
        private String analysisContent;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private EndTime endTime;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private StartTime startTime;

        private LensInfos(Builder builder) {
            this.analysisContent = builder.analysisContent;
            this.endTime = builder.endTime;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LensInfos create() {
            return builder().build();
        }

        /**
         * @return analysisContent
         */
        public String getAnalysisContent() {
            return this.analysisContent;
        }

        /**
         * @return endTime
         */
        public EndTime getEndTime() {
            return this.endTime;
        }

        /**
         * @return startTime
         */
        public StartTime getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private String analysisContent; 
            private EndTime endTime; 
            private StartTime startTime; 

            private Builder() {
            } 

            private Builder(LensInfos model) {
                this.analysisContent = model.analysisContent;
                this.endTime = model.endTime;
                this.startTime = model.startTime;
            } 

            /**
             * AnalysisContent.
             */
            public Builder analysisContent(String analysisContent) {
                this.analysisContent = analysisContent;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(EndTime endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(StartTime startTime) {
                this.startTime = startTime;
                return this;
            }

            public LensInfos build() {
                return new LensInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAutoClipsTaskInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetAutoClipsTaskInfoResponseBody</p>
     */
    public static class AnalysisResults extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LensInfos")
        private java.util.List<LensInfos> lensInfos;

        @com.aliyun.core.annotation.NameInMap("MediaId")
        private String mediaId;

        @com.aliyun.core.annotation.NameInMap("MediaName")
        private String mediaName;

        @com.aliyun.core.annotation.NameInMap("MediaUrl")
        private String mediaUrl;

        private AnalysisResults(Builder builder) {
            this.lensInfos = builder.lensInfos;
            this.mediaId = builder.mediaId;
            this.mediaName = builder.mediaName;
            this.mediaUrl = builder.mediaUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AnalysisResults create() {
            return builder().build();
        }

        /**
         * @return lensInfos
         */
        public java.util.List<LensInfos> getLensInfos() {
            return this.lensInfos;
        }

        /**
         * @return mediaId
         */
        public String getMediaId() {
            return this.mediaId;
        }

        /**
         * @return mediaName
         */
        public String getMediaName() {
            return this.mediaName;
        }

        /**
         * @return mediaUrl
         */
        public String getMediaUrl() {
            return this.mediaUrl;
        }

        public static final class Builder {
            private java.util.List<LensInfos> lensInfos; 
            private String mediaId; 
            private String mediaName; 
            private String mediaUrl; 

            private Builder() {
            } 

            private Builder(AnalysisResults model) {
                this.lensInfos = model.lensInfos;
                this.mediaId = model.mediaId;
                this.mediaName = model.mediaName;
                this.mediaUrl = model.mediaUrl;
            } 

            /**
             * LensInfos.
             */
            public Builder lensInfos(java.util.List<LensInfos> lensInfos) {
                this.lensInfos = lensInfos;
                return this;
            }

            /**
             * MediaId.
             */
            public Builder mediaId(String mediaId) {
                this.mediaId = mediaId;
                return this;
            }

            /**
             * MediaName.
             */
            public Builder mediaName(String mediaName) {
                this.mediaName = mediaName;
                return this;
            }

            /**
             * MediaUrl.
             */
            public Builder mediaUrl(String mediaUrl) {
                this.mediaUrl = mediaUrl;
                return this;
            }

            public AnalysisResults build() {
                return new AnalysisResults(this);
            } 

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
    public static class ReferenceVideo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("VideoId")
        private String videoId;

        @com.aliyun.core.annotation.NameInMap("VideoName")
        private String videoName;

        @com.aliyun.core.annotation.NameInMap("VideoUrl")
        private String videoUrl;

        private ReferenceVideo(Builder builder) {
            this.videoId = builder.videoId;
            this.videoName = builder.videoName;
            this.videoUrl = builder.videoUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReferenceVideo create() {
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

            private Builder(ReferenceVideo model) {
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

            public ReferenceVideo build() {
                return new ReferenceVideo(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAutoClipsTaskInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetAutoClipsTaskInfoResponseBody</p>
     */
    public static class SourceVideos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("VideoId")
        private String videoId;

        @com.aliyun.core.annotation.NameInMap("VideoName")
        private String videoName;

        @com.aliyun.core.annotation.NameInMap("VideoUrl")
        private String videoUrl;

        private SourceVideos(Builder builder) {
            this.videoId = builder.videoId;
            this.videoName = builder.videoName;
            this.videoUrl = builder.videoUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SourceVideos create() {
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

            private Builder(SourceVideos model) {
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

            public SourceVideos build() {
                return new SourceVideos(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAutoClipsTaskInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetAutoClipsTaskInfoResponseBody</p>
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
        @com.aliyun.core.annotation.NameInMap("AnalysisResults")
        private java.util.List<AnalysisResults> analysisResults;

        @com.aliyun.core.annotation.NameInMap("CloseMusic")
        private Boolean closeMusic;

        @com.aliyun.core.annotation.NameInMap("CloseSubtitle")
        private Boolean closeSubtitle;

        @com.aliyun.core.annotation.NameInMap("CloseVoice")
        private Boolean closeVoice;

        @com.aliyun.core.annotation.NameInMap("ClosingCreditsUrl")
        private String closingCreditsUrl;

        @com.aliyun.core.annotation.NameInMap("ColorWords")
        private java.util.List<ColorWords> colorWords;

        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("CustomVoiceStyle")
        private String customVoiceStyle;

        @com.aliyun.core.annotation.NameInMap("CustomVoiceUrl")
        private String customVoiceUrl;

        @com.aliyun.core.annotation.NameInMap("CustomVoiceVolume")
        private Integer customVoiceVolume;

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

        @com.aliyun.core.annotation.NameInMap("OpeningCreditsUrl")
        private String openingCreditsUrl;

        @com.aliyun.core.annotation.NameInMap("OutputVideoFileKey")
        private String outputVideoFileKey;

        @com.aliyun.core.annotation.NameInMap("OutputVideoUrl")
        private String outputVideoUrl;

        @com.aliyun.core.annotation.NameInMap("ReferenceVideo")
        private ReferenceVideo referenceVideo;

        @com.aliyun.core.annotation.NameInMap("SourceVideos")
        private java.util.List<SourceVideos> sourceVideos;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("Step")
        private String step;

        @com.aliyun.core.annotation.NameInMap("Stickers")
        private java.util.List<Stickers> stickers;

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
            this.analysisResults = builder.analysisResults;
            this.closeMusic = builder.closeMusic;
            this.closeSubtitle = builder.closeSubtitle;
            this.closeVoice = builder.closeVoice;
            this.closingCreditsUrl = builder.closingCreditsUrl;
            this.colorWords = builder.colorWords;
            this.content = builder.content;
            this.customVoiceStyle = builder.customVoiceStyle;
            this.customVoiceUrl = builder.customVoiceUrl;
            this.customVoiceVolume = builder.customVoiceVolume;
            this.errorMessage = builder.errorMessage;
            this.mediaCloudTimeline = builder.mediaCloudTimeline;
            this.musicStyle = builder.musicStyle;
            this.musicUrl = builder.musicUrl;
            this.musicVolume = builder.musicVolume;
            this.openingCreditsUrl = builder.openingCreditsUrl;
            this.outputVideoFileKey = builder.outputVideoFileKey;
            this.outputVideoUrl = builder.outputVideoUrl;
            this.referenceVideo = builder.referenceVideo;
            this.sourceVideos = builder.sourceVideos;
            this.status = builder.status;
            this.step = builder.step;
            this.stickers = builder.stickers;
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
         * @return analysisResults
         */
        public java.util.List<AnalysisResults> getAnalysisResults() {
            return this.analysisResults;
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
         * @return content
         */
        public String getContent() {
            return this.content;
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
         * @return openingCreditsUrl
         */
        public String getOpeningCreditsUrl() {
            return this.openingCreditsUrl;
        }

        /**
         * @return outputVideoFileKey
         */
        public String getOutputVideoFileKey() {
            return this.outputVideoFileKey;
        }

        /**
         * @return outputVideoUrl
         */
        public String getOutputVideoUrl() {
            return this.outputVideoUrl;
        }

        /**
         * @return referenceVideo
         */
        public ReferenceVideo getReferenceVideo() {
            return this.referenceVideo;
        }

        /**
         * @return sourceVideos
         */
        public java.util.List<SourceVideos> getSourceVideos() {
            return this.sourceVideos;
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
            private java.util.List<AnalysisResults> analysisResults; 
            private Boolean closeMusic; 
            private Boolean closeSubtitle; 
            private Boolean closeVoice; 
            private String closingCreditsUrl; 
            private java.util.List<ColorWords> colorWords; 
            private String content; 
            private String customVoiceStyle; 
            private String customVoiceUrl; 
            private Integer customVoiceVolume; 
            private String errorMessage; 
            private String mediaCloudTimeline; 
            private String musicStyle; 
            private String musicUrl; 
            private Integer musicVolume; 
            private String openingCreditsUrl; 
            private String outputVideoFileKey; 
            private String outputVideoUrl; 
            private ReferenceVideo referenceVideo; 
            private java.util.List<SourceVideos> sourceVideos; 
            private Integer status; 
            private String step; 
            private java.util.List<Stickers> stickers; 
            private Integer subtitleFontSize; 
            private String taskId; 
            private java.util.List<Timelines> timelines; 
            private String voiceStyle; 
            private Integer voiceVolume; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.analysisResults = model.analysisResults;
                this.closeMusic = model.closeMusic;
                this.closeSubtitle = model.closeSubtitle;
                this.closeVoice = model.closeVoice;
                this.closingCreditsUrl = model.closingCreditsUrl;
                this.colorWords = model.colorWords;
                this.content = model.content;
                this.customVoiceStyle = model.customVoiceStyle;
                this.customVoiceUrl = model.customVoiceUrl;
                this.customVoiceVolume = model.customVoiceVolume;
                this.errorMessage = model.errorMessage;
                this.mediaCloudTimeline = model.mediaCloudTimeline;
                this.musicStyle = model.musicStyle;
                this.musicUrl = model.musicUrl;
                this.musicVolume = model.musicVolume;
                this.openingCreditsUrl = model.openingCreditsUrl;
                this.outputVideoFileKey = model.outputVideoFileKey;
                this.outputVideoUrl = model.outputVideoUrl;
                this.referenceVideo = model.referenceVideo;
                this.sourceVideos = model.sourceVideos;
                this.status = model.status;
                this.step = model.step;
                this.stickers = model.stickers;
                this.subtitleFontSize = model.subtitleFontSize;
                this.taskId = model.taskId;
                this.timelines = model.timelines;
                this.voiceStyle = model.voiceStyle;
                this.voiceVolume = model.voiceVolume;
            } 

            /**
             * AnalysisResults.
             */
            public Builder analysisResults(java.util.List<AnalysisResults> analysisResults) {
                this.analysisResults = analysisResults;
                return this;
            }

            /**
             * CloseMusic.
             */
            public Builder closeMusic(Boolean closeMusic) {
                this.closeMusic = closeMusic;
                return this;
            }

            /**
             * CloseSubtitle.
             */
            public Builder closeSubtitle(Boolean closeSubtitle) {
                this.closeSubtitle = closeSubtitle;
                return this;
            }

            /**
             * CloseVoice.
             */
            public Builder closeVoice(Boolean closeVoice) {
                this.closeVoice = closeVoice;
                return this;
            }

            /**
             * ClosingCreditsUrl.
             */
            public Builder closingCreditsUrl(String closingCreditsUrl) {
                this.closingCreditsUrl = closingCreditsUrl;
                return this;
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
             * CustomVoiceStyle.
             */
            public Builder customVoiceStyle(String customVoiceStyle) {
                this.customVoiceStyle = customVoiceStyle;
                return this;
            }

            /**
             * CustomVoiceUrl.
             */
            public Builder customVoiceUrl(String customVoiceUrl) {
                this.customVoiceUrl = customVoiceUrl;
                return this;
            }

            /**
             * CustomVoiceVolume.
             */
            public Builder customVoiceVolume(Integer customVoiceVolume) {
                this.customVoiceVolume = customVoiceVolume;
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
             * OpeningCreditsUrl.
             */
            public Builder openingCreditsUrl(String openingCreditsUrl) {
                this.openingCreditsUrl = openingCreditsUrl;
                return this;
            }

            /**
             * OutputVideoFileKey.
             */
            public Builder outputVideoFileKey(String outputVideoFileKey) {
                this.outputVideoFileKey = outputVideoFileKey;
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
             * ReferenceVideo.
             */
            public Builder referenceVideo(ReferenceVideo referenceVideo) {
                this.referenceVideo = referenceVideo;
                return this;
            }

            /**
             * SourceVideos.
             */
            public Builder sourceVideos(java.util.List<SourceVideos> sourceVideos) {
                this.sourceVideos = sourceVideos;
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
             * Stickers.
             */
            public Builder stickers(java.util.List<Stickers> stickers) {
                this.stickers = stickers;
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
