// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quanmiaolightapp20240801.models;

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
 * {@link GetVideoAnalysisTaskResponseBody} extends {@link TeaModel}
 *
 * <p>GetVideoAnalysisTaskResponseBody</p>
 */
public class GetVideoAnalysisTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private GetVideoAnalysisTaskResponseBody(Builder builder) {
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

    public static GetVideoAnalysisTaskResponseBody create() {
        return builder().build();
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

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * httpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>5D0E915E-655D-59A8-894F-93873F73AAE5</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetVideoAnalysisTaskResponseBody build() {
            return new GetVideoAnalysisTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetVideoAnalysisTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetVideoAnalysisTaskResponseBody</p>
     */
    public static class DataHeader extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("errorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("errorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("event")
        private String event;

        @com.aliyun.core.annotation.NameInMap("eventInfo")
        private String eventInfo;

        @com.aliyun.core.annotation.NameInMap("sessionId")
        private String sessionId;

        @com.aliyun.core.annotation.NameInMap("taskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("traceId")
        private String traceId;

        private DataHeader(Builder builder) {
            this.errorCode = builder.errorCode;
            this.errorMessage = builder.errorMessage;
            this.event = builder.event;
            this.eventInfo = builder.eventInfo;
            this.sessionId = builder.sessionId;
            this.taskId = builder.taskId;
            this.traceId = builder.traceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataHeader create() {
            return builder().build();
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return event
         */
        public String getEvent() {
            return this.event;
        }

        /**
         * @return eventInfo
         */
        public String getEventInfo() {
            return this.eventInfo;
        }

        /**
         * @return sessionId
         */
        public String getSessionId() {
            return this.sessionId;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return traceId
         */
        public String getTraceId() {
            return this.traceId;
        }

        public static final class Builder {
            private String errorCode; 
            private String errorMessage; 
            private String event; 
            private String eventInfo; 
            private String sessionId; 
            private String taskId; 
            private String traceId; 

            /**
             * errorCode.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * errorMessage.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * event.
             */
            public Builder event(String event) {
                this.event = event;
                return this;
            }

            /**
             * eventInfo.
             */
            public Builder eventInfo(String eventInfo) {
                this.eventInfo = eventInfo;
                return this;
            }

            /**
             * sessionId.
             */
            public Builder sessionId(String sessionId) {
                this.sessionId = sessionId;
                return this;
            }

            /**
             * taskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * traceId.
             */
            public Builder traceId(String traceId) {
                this.traceId = traceId;
                return this;
            }

            public DataHeader build() {
                return new DataHeader(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetVideoAnalysisTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetVideoAnalysisTaskResponseBody</p>
     */
    public static class Usage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("inputTokens")
        private Long inputTokens;

        @com.aliyun.core.annotation.NameInMap("outputTokens")
        private Long outputTokens;

        @com.aliyun.core.annotation.NameInMap("totalTokens")
        private Long totalTokens;

        private Usage(Builder builder) {
            this.inputTokens = builder.inputTokens;
            this.outputTokens = builder.outputTokens;
            this.totalTokens = builder.totalTokens;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Usage create() {
            return builder().build();
        }

        /**
         * @return inputTokens
         */
        public Long getInputTokens() {
            return this.inputTokens;
        }

        /**
         * @return outputTokens
         */
        public Long getOutputTokens() {
            return this.outputTokens;
        }

        /**
         * @return totalTokens
         */
        public Long getTotalTokens() {
            return this.totalTokens;
        }

        public static final class Builder {
            private Long inputTokens; 
            private Long outputTokens; 
            private Long totalTokens; 

            /**
             * inputTokens.
             */
            public Builder inputTokens(Long inputTokens) {
                this.inputTokens = inputTokens;
                return this;
            }

            /**
             * outputTokens.
             */
            public Builder outputTokens(Long outputTokens) {
                this.outputTokens = outputTokens;
                return this;
            }

            /**
             * totalTokens.
             */
            public Builder totalTokens(Long totalTokens) {
                this.totalTokens = totalTokens;
                return this;
            }

            public Usage build() {
                return new Usage(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetVideoAnalysisTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetVideoAnalysisTaskResponseBody</p>
     */
    public static class VideoShotAnalysisResults extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("endTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("startTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("text")
        private String text;

        private VideoShotAnalysisResults(Builder builder) {
            this.endTime = builder.endTime;
            this.startTime = builder.startTime;
            this.text = builder.text;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VideoShotAnalysisResults create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        public static final class Builder {
            private Long endTime; 
            private Long startTime; 
            private String text; 

            /**
             * endTime.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * startTime.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * text.
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            public VideoShotAnalysisResults build() {
                return new VideoShotAnalysisResults(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetVideoAnalysisTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetVideoAnalysisTaskResponseBody</p>
     */
    public static class VideoAnalysisResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("generateFinished")
        private Boolean generateFinished;

        @com.aliyun.core.annotation.NameInMap("text")
        private String text;

        @com.aliyun.core.annotation.NameInMap("usage")
        private Usage usage;

        @com.aliyun.core.annotation.NameInMap("videoShotAnalysisResults")
        private java.util.List<VideoShotAnalysisResults> videoShotAnalysisResults;

        private VideoAnalysisResult(Builder builder) {
            this.generateFinished = builder.generateFinished;
            this.text = builder.text;
            this.usage = builder.usage;
            this.videoShotAnalysisResults = builder.videoShotAnalysisResults;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VideoAnalysisResult create() {
            return builder().build();
        }

        /**
         * @return generateFinished
         */
        public Boolean getGenerateFinished() {
            return this.generateFinished;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        /**
         * @return usage
         */
        public Usage getUsage() {
            return this.usage;
        }

        /**
         * @return videoShotAnalysisResults
         */
        public java.util.List<VideoShotAnalysisResults> getVideoShotAnalysisResults() {
            return this.videoShotAnalysisResults;
        }

        public static final class Builder {
            private Boolean generateFinished; 
            private String text; 
            private Usage usage; 
            private java.util.List<VideoShotAnalysisResults> videoShotAnalysisResults; 

            /**
             * generateFinished.
             */
            public Builder generateFinished(Boolean generateFinished) {
                this.generateFinished = generateFinished;
                return this;
            }

            /**
             * text.
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            /**
             * usage.
             */
            public Builder usage(Usage usage) {
                this.usage = usage;
                return this;
            }

            /**
             * videoShotAnalysisResults.
             */
            public Builder videoShotAnalysisResults(java.util.List<VideoShotAnalysisResults> videoShotAnalysisResults) {
                this.videoShotAnalysisResults = videoShotAnalysisResults;
                return this;
            }

            public VideoAnalysisResult build() {
                return new VideoAnalysisResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetVideoAnalysisTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetVideoAnalysisTaskResponseBody</p>
     */
    public static class VideoCaptions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("endTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("endTimeFormat")
        private String endTimeFormat;

        @com.aliyun.core.annotation.NameInMap("startTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("startTimeFormat")
        private String startTimeFormat;

        @com.aliyun.core.annotation.NameInMap("text")
        private String text;

        private VideoCaptions(Builder builder) {
            this.endTime = builder.endTime;
            this.endTimeFormat = builder.endTimeFormat;
            this.startTime = builder.startTime;
            this.startTimeFormat = builder.startTimeFormat;
            this.text = builder.text;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VideoCaptions create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return endTimeFormat
         */
        public String getEndTimeFormat() {
            return this.endTimeFormat;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return startTimeFormat
         */
        public String getStartTimeFormat() {
            return this.startTimeFormat;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        public static final class Builder {
            private Long endTime; 
            private String endTimeFormat; 
            private Long startTime; 
            private String startTimeFormat; 
            private String text; 

            /**
             * endTime.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * endTimeFormat.
             */
            public Builder endTimeFormat(String endTimeFormat) {
                this.endTimeFormat = endTimeFormat;
                return this;
            }

            /**
             * startTime.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * startTimeFormat.
             */
            public Builder startTimeFormat(String startTimeFormat) {
                this.startTimeFormat = startTimeFormat;
                return this;
            }

            /**
             * text.
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            public VideoCaptions build() {
                return new VideoCaptions(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetVideoAnalysisTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetVideoAnalysisTaskResponseBody</p>
     */
    public static class VideoCaptionResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("generateFinished")
        private Boolean generateFinished;

        @com.aliyun.core.annotation.NameInMap("videoCaptions")
        private java.util.List<VideoCaptions> videoCaptions;

        private VideoCaptionResult(Builder builder) {
            this.generateFinished = builder.generateFinished;
            this.videoCaptions = builder.videoCaptions;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VideoCaptionResult create() {
            return builder().build();
        }

        /**
         * @return generateFinished
         */
        public Boolean getGenerateFinished() {
            return this.generateFinished;
        }

        /**
         * @return videoCaptions
         */
        public java.util.List<VideoCaptions> getVideoCaptions() {
            return this.videoCaptions;
        }

        public static final class Builder {
            private Boolean generateFinished; 
            private java.util.List<VideoCaptions> videoCaptions; 

            /**
             * generateFinished.
             */
            public Builder generateFinished(Boolean generateFinished) {
                this.generateFinished = generateFinished;
                return this;
            }

            /**
             * videoCaptions.
             */
            public Builder videoCaptions(java.util.List<VideoCaptions> videoCaptions) {
                this.videoCaptions = videoCaptions;
                return this;
            }

            public VideoCaptionResult build() {
                return new VideoCaptionResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetVideoAnalysisTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetVideoAnalysisTaskResponseBody</p>
     */
    public static class VideoGenerateResultUsage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("inputTokens")
        private Long inputTokens;

        @com.aliyun.core.annotation.NameInMap("outputTokens")
        private Long outputTokens;

        @com.aliyun.core.annotation.NameInMap("totalTokens")
        private Long totalTokens;

        private VideoGenerateResultUsage(Builder builder) {
            this.inputTokens = builder.inputTokens;
            this.outputTokens = builder.outputTokens;
            this.totalTokens = builder.totalTokens;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VideoGenerateResultUsage create() {
            return builder().build();
        }

        /**
         * @return inputTokens
         */
        public Long getInputTokens() {
            return this.inputTokens;
        }

        /**
         * @return outputTokens
         */
        public Long getOutputTokens() {
            return this.outputTokens;
        }

        /**
         * @return totalTokens
         */
        public Long getTotalTokens() {
            return this.totalTokens;
        }

        public static final class Builder {
            private Long inputTokens; 
            private Long outputTokens; 
            private Long totalTokens; 

            /**
             * inputTokens.
             */
            public Builder inputTokens(Long inputTokens) {
                this.inputTokens = inputTokens;
                return this;
            }

            /**
             * outputTokens.
             */
            public Builder outputTokens(Long outputTokens) {
                this.outputTokens = outputTokens;
                return this;
            }

            /**
             * totalTokens.
             */
            public Builder totalTokens(Long totalTokens) {
                this.totalTokens = totalTokens;
                return this;
            }

            public VideoGenerateResultUsage build() {
                return new VideoGenerateResultUsage(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetVideoAnalysisTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetVideoAnalysisTaskResponseBody</p>
     */
    public static class VideoGenerateResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("generateFinished")
        private Boolean generateFinished;

        @com.aliyun.core.annotation.NameInMap("text")
        private String text;

        @com.aliyun.core.annotation.NameInMap("usage")
        private VideoGenerateResultUsage usage;

        private VideoGenerateResult(Builder builder) {
            this.generateFinished = builder.generateFinished;
            this.text = builder.text;
            this.usage = builder.usage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VideoGenerateResult create() {
            return builder().build();
        }

        /**
         * @return generateFinished
         */
        public Boolean getGenerateFinished() {
            return this.generateFinished;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        /**
         * @return usage
         */
        public VideoGenerateResultUsage getUsage() {
            return this.usage;
        }

        public static final class Builder {
            private Boolean generateFinished; 
            private String text; 
            private VideoGenerateResultUsage usage; 

            /**
             * generateFinished.
             */
            public Builder generateFinished(Boolean generateFinished) {
                this.generateFinished = generateFinished;
                return this;
            }

            /**
             * text.
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            /**
             * usage.
             */
            public Builder usage(VideoGenerateResultUsage usage) {
                this.usage = usage;
                return this;
            }

            public VideoGenerateResult build() {
                return new VideoGenerateResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetVideoAnalysisTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetVideoAnalysisTaskResponseBody</p>
     */
    public static class VideoMindMappingGenerateResultUsage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("inputTokens")
        private Long inputTokens;

        @com.aliyun.core.annotation.NameInMap("outputTokens")
        private Long outputTokens;

        @com.aliyun.core.annotation.NameInMap("totalTokens")
        private Long totalTokens;

        private VideoMindMappingGenerateResultUsage(Builder builder) {
            this.inputTokens = builder.inputTokens;
            this.outputTokens = builder.outputTokens;
            this.totalTokens = builder.totalTokens;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VideoMindMappingGenerateResultUsage create() {
            return builder().build();
        }

        /**
         * @return inputTokens
         */
        public Long getInputTokens() {
            return this.inputTokens;
        }

        /**
         * @return outputTokens
         */
        public Long getOutputTokens() {
            return this.outputTokens;
        }

        /**
         * @return totalTokens
         */
        public Long getTotalTokens() {
            return this.totalTokens;
        }

        public static final class Builder {
            private Long inputTokens; 
            private Long outputTokens; 
            private Long totalTokens; 

            /**
             * inputTokens.
             */
            public Builder inputTokens(Long inputTokens) {
                this.inputTokens = inputTokens;
                return this;
            }

            /**
             * outputTokens.
             */
            public Builder outputTokens(Long outputTokens) {
                this.outputTokens = outputTokens;
                return this;
            }

            /**
             * totalTokens.
             */
            public Builder totalTokens(Long totalTokens) {
                this.totalTokens = totalTokens;
                return this;
            }

            public VideoMindMappingGenerateResultUsage build() {
                return new VideoMindMappingGenerateResultUsage(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetVideoAnalysisTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetVideoAnalysisTaskResponseBody</p>
     */
    public static class ChildNodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        private ChildNodes(Builder builder) {
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ChildNodes create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String name; 

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public ChildNodes build() {
                return new ChildNodes(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetVideoAnalysisTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetVideoAnalysisTaskResponseBody</p>
     */
    public static class VideoMindMappingsChildNodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("childNodes")
        private java.util.List<ChildNodes> childNodes;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        private VideoMindMappingsChildNodes(Builder builder) {
            this.childNodes = builder.childNodes;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VideoMindMappingsChildNodes create() {
            return builder().build();
        }

        /**
         * @return childNodes
         */
        public java.util.List<ChildNodes> getChildNodes() {
            return this.childNodes;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private java.util.List<ChildNodes> childNodes; 
            private String name; 

            /**
             * childNodes.
             */
            public Builder childNodes(java.util.List<ChildNodes> childNodes) {
                this.childNodes = childNodes;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public VideoMindMappingsChildNodes build() {
                return new VideoMindMappingsChildNodes(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetVideoAnalysisTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetVideoAnalysisTaskResponseBody</p>
     */
    public static class VideoMindMappings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("childNodes")
        private java.util.List<VideoMindMappingsChildNodes> childNodes;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        private VideoMindMappings(Builder builder) {
            this.childNodes = builder.childNodes;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VideoMindMappings create() {
            return builder().build();
        }

        /**
         * @return childNodes
         */
        public java.util.List<VideoMindMappingsChildNodes> getChildNodes() {
            return this.childNodes;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private java.util.List<VideoMindMappingsChildNodes> childNodes; 
            private String name; 

            /**
             * childNodes.
             */
            public Builder childNodes(java.util.List<VideoMindMappingsChildNodes> childNodes) {
                this.childNodes = childNodes;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public VideoMindMappings build() {
                return new VideoMindMappings(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetVideoAnalysisTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetVideoAnalysisTaskResponseBody</p>
     */
    public static class VideoMindMappingGenerateResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("generateFinished")
        private Boolean generateFinished;

        @com.aliyun.core.annotation.NameInMap("text")
        private String text;

        @com.aliyun.core.annotation.NameInMap("usage")
        private VideoMindMappingGenerateResultUsage usage;

        @com.aliyun.core.annotation.NameInMap("videoMindMappings")
        private java.util.List<VideoMindMappings> videoMindMappings;

        private VideoMindMappingGenerateResult(Builder builder) {
            this.generateFinished = builder.generateFinished;
            this.text = builder.text;
            this.usage = builder.usage;
            this.videoMindMappings = builder.videoMindMappings;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VideoMindMappingGenerateResult create() {
            return builder().build();
        }

        /**
         * @return generateFinished
         */
        public Boolean getGenerateFinished() {
            return this.generateFinished;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        /**
         * @return usage
         */
        public VideoMindMappingGenerateResultUsage getUsage() {
            return this.usage;
        }

        /**
         * @return videoMindMappings
         */
        public java.util.List<VideoMindMappings> getVideoMindMappings() {
            return this.videoMindMappings;
        }

        public static final class Builder {
            private Boolean generateFinished; 
            private String text; 
            private VideoMindMappingGenerateResultUsage usage; 
            private java.util.List<VideoMindMappings> videoMindMappings; 

            /**
             * generateFinished.
             */
            public Builder generateFinished(Boolean generateFinished) {
                this.generateFinished = generateFinished;
                return this;
            }

            /**
             * text.
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            /**
             * usage.
             */
            public Builder usage(VideoMindMappingGenerateResultUsage usage) {
                this.usage = usage;
                return this;
            }

            /**
             * videoMindMappings.
             */
            public Builder videoMindMappings(java.util.List<VideoMindMappings> videoMindMappings) {
                this.videoMindMappings = videoMindMappings;
                return this;
            }

            public VideoMindMappingGenerateResult build() {
                return new VideoMindMappingGenerateResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetVideoAnalysisTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetVideoAnalysisTaskResponseBody</p>
     */
    public static class VideoTitleGenerateResultUsage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("inputTokens")
        private Long inputTokens;

        @com.aliyun.core.annotation.NameInMap("outputTokens")
        private Long outputTokens;

        @com.aliyun.core.annotation.NameInMap("totalTokens")
        private Long totalTokens;

        private VideoTitleGenerateResultUsage(Builder builder) {
            this.inputTokens = builder.inputTokens;
            this.outputTokens = builder.outputTokens;
            this.totalTokens = builder.totalTokens;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VideoTitleGenerateResultUsage create() {
            return builder().build();
        }

        /**
         * @return inputTokens
         */
        public Long getInputTokens() {
            return this.inputTokens;
        }

        /**
         * @return outputTokens
         */
        public Long getOutputTokens() {
            return this.outputTokens;
        }

        /**
         * @return totalTokens
         */
        public Long getTotalTokens() {
            return this.totalTokens;
        }

        public static final class Builder {
            private Long inputTokens; 
            private Long outputTokens; 
            private Long totalTokens; 

            /**
             * inputTokens.
             */
            public Builder inputTokens(Long inputTokens) {
                this.inputTokens = inputTokens;
                return this;
            }

            /**
             * outputTokens.
             */
            public Builder outputTokens(Long outputTokens) {
                this.outputTokens = outputTokens;
                return this;
            }

            /**
             * totalTokens.
             */
            public Builder totalTokens(Long totalTokens) {
                this.totalTokens = totalTokens;
                return this;
            }

            public VideoTitleGenerateResultUsage build() {
                return new VideoTitleGenerateResultUsage(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetVideoAnalysisTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetVideoAnalysisTaskResponseBody</p>
     */
    public static class VideoTitleGenerateResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("generateFinished")
        private Boolean generateFinished;

        @com.aliyun.core.annotation.NameInMap("text")
        private String text;

        @com.aliyun.core.annotation.NameInMap("usage")
        private VideoTitleGenerateResultUsage usage;

        private VideoTitleGenerateResult(Builder builder) {
            this.generateFinished = builder.generateFinished;
            this.text = builder.text;
            this.usage = builder.usage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VideoTitleGenerateResult create() {
            return builder().build();
        }

        /**
         * @return generateFinished
         */
        public Boolean getGenerateFinished() {
            return this.generateFinished;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        /**
         * @return usage
         */
        public VideoTitleGenerateResultUsage getUsage() {
            return this.usage;
        }

        public static final class Builder {
            private Boolean generateFinished; 
            private String text; 
            private VideoTitleGenerateResultUsage usage; 

            /**
             * generateFinished.
             */
            public Builder generateFinished(Boolean generateFinished) {
                this.generateFinished = generateFinished;
                return this;
            }

            /**
             * text.
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            /**
             * usage.
             */
            public Builder usage(VideoTitleGenerateResultUsage usage) {
                this.usage = usage;
                return this;
            }

            public VideoTitleGenerateResult build() {
                return new VideoTitleGenerateResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetVideoAnalysisTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetVideoAnalysisTaskResponseBody</p>
     */
    public static class Output extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("resultJsonFileUrl")
        private String resultJsonFileUrl;

        @com.aliyun.core.annotation.NameInMap("videoAnalysisResult")
        private VideoAnalysisResult videoAnalysisResult;

        @com.aliyun.core.annotation.NameInMap("videoCaptionResult")
        private VideoCaptionResult videoCaptionResult;

        @com.aliyun.core.annotation.NameInMap("videoGenerateResult")
        private VideoGenerateResult videoGenerateResult;

        @com.aliyun.core.annotation.NameInMap("videoMindMappingGenerateResult")
        private VideoMindMappingGenerateResult videoMindMappingGenerateResult;

        @com.aliyun.core.annotation.NameInMap("videoTitleGenerateResult")
        private VideoTitleGenerateResult videoTitleGenerateResult;

        private Output(Builder builder) {
            this.resultJsonFileUrl = builder.resultJsonFileUrl;
            this.videoAnalysisResult = builder.videoAnalysisResult;
            this.videoCaptionResult = builder.videoCaptionResult;
            this.videoGenerateResult = builder.videoGenerateResult;
            this.videoMindMappingGenerateResult = builder.videoMindMappingGenerateResult;
            this.videoTitleGenerateResult = builder.videoTitleGenerateResult;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Output create() {
            return builder().build();
        }

        /**
         * @return resultJsonFileUrl
         */
        public String getResultJsonFileUrl() {
            return this.resultJsonFileUrl;
        }

        /**
         * @return videoAnalysisResult
         */
        public VideoAnalysisResult getVideoAnalysisResult() {
            return this.videoAnalysisResult;
        }

        /**
         * @return videoCaptionResult
         */
        public VideoCaptionResult getVideoCaptionResult() {
            return this.videoCaptionResult;
        }

        /**
         * @return videoGenerateResult
         */
        public VideoGenerateResult getVideoGenerateResult() {
            return this.videoGenerateResult;
        }

        /**
         * @return videoMindMappingGenerateResult
         */
        public VideoMindMappingGenerateResult getVideoMindMappingGenerateResult() {
            return this.videoMindMappingGenerateResult;
        }

        /**
         * @return videoTitleGenerateResult
         */
        public VideoTitleGenerateResult getVideoTitleGenerateResult() {
            return this.videoTitleGenerateResult;
        }

        public static final class Builder {
            private String resultJsonFileUrl; 
            private VideoAnalysisResult videoAnalysisResult; 
            private VideoCaptionResult videoCaptionResult; 
            private VideoGenerateResult videoGenerateResult; 
            private VideoMindMappingGenerateResult videoMindMappingGenerateResult; 
            private VideoTitleGenerateResult videoTitleGenerateResult; 

            /**
             * resultJsonFileUrl.
             */
            public Builder resultJsonFileUrl(String resultJsonFileUrl) {
                this.resultJsonFileUrl = resultJsonFileUrl;
                return this;
            }

            /**
             * videoAnalysisResult.
             */
            public Builder videoAnalysisResult(VideoAnalysisResult videoAnalysisResult) {
                this.videoAnalysisResult = videoAnalysisResult;
                return this;
            }

            /**
             * videoCaptionResult.
             */
            public Builder videoCaptionResult(VideoCaptionResult videoCaptionResult) {
                this.videoCaptionResult = videoCaptionResult;
                return this;
            }

            /**
             * videoGenerateResult.
             */
            public Builder videoGenerateResult(VideoGenerateResult videoGenerateResult) {
                this.videoGenerateResult = videoGenerateResult;
                return this;
            }

            /**
             * videoMindMappingGenerateResult.
             */
            public Builder videoMindMappingGenerateResult(VideoMindMappingGenerateResult videoMindMappingGenerateResult) {
                this.videoMindMappingGenerateResult = videoMindMappingGenerateResult;
                return this;
            }

            /**
             * videoTitleGenerateResult.
             */
            public Builder videoTitleGenerateResult(VideoTitleGenerateResult videoTitleGenerateResult) {
                this.videoTitleGenerateResult = videoTitleGenerateResult;
                return this;
            }

            public Output build() {
                return new Output(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetVideoAnalysisTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetVideoAnalysisTaskResponseBody</p>
     */
    public static class PayloadUsage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("inputTokens")
        private Long inputTokens;

        @com.aliyun.core.annotation.NameInMap("outputTokens")
        private Long outputTokens;

        @com.aliyun.core.annotation.NameInMap("totalTokens")
        private Long totalTokens;

        private PayloadUsage(Builder builder) {
            this.inputTokens = builder.inputTokens;
            this.outputTokens = builder.outputTokens;
            this.totalTokens = builder.totalTokens;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PayloadUsage create() {
            return builder().build();
        }

        /**
         * @return inputTokens
         */
        public Long getInputTokens() {
            return this.inputTokens;
        }

        /**
         * @return outputTokens
         */
        public Long getOutputTokens() {
            return this.outputTokens;
        }

        /**
         * @return totalTokens
         */
        public Long getTotalTokens() {
            return this.totalTokens;
        }

        public static final class Builder {
            private Long inputTokens; 
            private Long outputTokens; 
            private Long totalTokens; 

            /**
             * inputTokens.
             */
            public Builder inputTokens(Long inputTokens) {
                this.inputTokens = inputTokens;
                return this;
            }

            /**
             * outputTokens.
             */
            public Builder outputTokens(Long outputTokens) {
                this.outputTokens = outputTokens;
                return this;
            }

            /**
             * totalTokens.
             */
            public Builder totalTokens(Long totalTokens) {
                this.totalTokens = totalTokens;
                return this;
            }

            public PayloadUsage build() {
                return new PayloadUsage(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetVideoAnalysisTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetVideoAnalysisTaskResponseBody</p>
     */
    public static class Payload extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("output")
        private Output output;

        @com.aliyun.core.annotation.NameInMap("usage")
        private PayloadUsage usage;

        private Payload(Builder builder) {
            this.output = builder.output;
            this.usage = builder.usage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Payload create() {
            return builder().build();
        }

        /**
         * @return output
         */
        public Output getOutput() {
            return this.output;
        }

        /**
         * @return usage
         */
        public PayloadUsage getUsage() {
            return this.usage;
        }

        public static final class Builder {
            private Output output; 
            private PayloadUsage usage; 

            /**
             * output.
             */
            public Builder output(Output output) {
                this.output = output;
                return this;
            }

            /**
             * usage.
             */
            public Builder usage(PayloadUsage usage) {
                this.usage = usage;
                return this;
            }

            public Payload build() {
                return new Payload(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetVideoAnalysisTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetVideoAnalysisTaskResponseBody</p>
     */
    public static class TaskRunInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("concurrentChargeEnable")
        private Boolean concurrentChargeEnable;

        @com.aliyun.core.annotation.NameInMap("responseTime")
        private Long responseTime;

        private TaskRunInfo(Builder builder) {
            this.concurrentChargeEnable = builder.concurrentChargeEnable;
            this.responseTime = builder.responseTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskRunInfo create() {
            return builder().build();
        }

        /**
         * @return concurrentChargeEnable
         */
        public Boolean getConcurrentChargeEnable() {
            return this.concurrentChargeEnable;
        }

        /**
         * @return responseTime
         */
        public Long getResponseTime() {
            return this.responseTime;
        }

        public static final class Builder {
            private Boolean concurrentChargeEnable; 
            private Long responseTime; 

            /**
             * concurrentChargeEnable.
             */
            public Builder concurrentChargeEnable(Boolean concurrentChargeEnable) {
                this.concurrentChargeEnable = concurrentChargeEnable;
                return this;
            }

            /**
             * responseTime.
             */
            public Builder responseTime(Long responseTime) {
                this.responseTime = responseTime;
                return this;
            }

            public TaskRunInfo build() {
                return new TaskRunInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetVideoAnalysisTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetVideoAnalysisTaskResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("errorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("header")
        private DataHeader header;

        @com.aliyun.core.annotation.NameInMap("payload")
        private Payload payload;

        @com.aliyun.core.annotation.NameInMap("taskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("taskRunInfo")
        private TaskRunInfo taskRunInfo;

        @com.aliyun.core.annotation.NameInMap("taskStatus")
        private String taskStatus;

        private Data(Builder builder) {
            this.errorMessage = builder.errorMessage;
            this.header = builder.header;
            this.payload = builder.payload;
            this.taskId = builder.taskId;
            this.taskRunInfo = builder.taskRunInfo;
            this.taskStatus = builder.taskStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return header
         */
        public DataHeader getHeader() {
            return this.header;
        }

        /**
         * @return payload
         */
        public Payload getPayload() {
            return this.payload;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return taskRunInfo
         */
        public TaskRunInfo getTaskRunInfo() {
            return this.taskRunInfo;
        }

        /**
         * @return taskStatus
         */
        public String getTaskStatus() {
            return this.taskStatus;
        }

        public static final class Builder {
            private String errorMessage; 
            private DataHeader header; 
            private Payload payload; 
            private String taskId; 
            private TaskRunInfo taskRunInfo; 
            private String taskStatus; 

            /**
             * errorMessage.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * header.
             */
            public Builder header(DataHeader header) {
                this.header = header;
                return this;
            }

            /**
             * payload.
             */
            public Builder payload(Payload payload) {
                this.payload = payload;
                return this;
            }

            /**
             * taskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * taskRunInfo.
             */
            public Builder taskRunInfo(TaskRunInfo taskRunInfo) {
                this.taskRunInfo = taskRunInfo;
                return this;
            }

            /**
             * taskStatus.
             */
            public Builder taskStatus(String taskStatus) {
                this.taskStatus = taskStatus;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
