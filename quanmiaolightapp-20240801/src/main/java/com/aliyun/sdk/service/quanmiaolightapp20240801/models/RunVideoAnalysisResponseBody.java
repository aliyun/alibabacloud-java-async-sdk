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
 * {@link RunVideoAnalysisResponseBody} extends {@link TeaModel}
 *
 * <p>RunVideoAnalysisResponseBody</p>
 */
public class RunVideoAnalysisResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("header")
    private RunVideoAnalysisResponseBodyHeader header;

    @com.aliyun.core.annotation.NameInMap("payload")
    private Payload payload;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private RunVideoAnalysisResponseBody(Builder builder) {
        this.header = builder.header;
        this.payload = builder.payload;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunVideoAnalysisResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return header
     */
    public RunVideoAnalysisResponseBodyHeader getHeader() {
        return this.header;
    }

    /**
     * @return payload
     */
    public Payload getPayload() {
        return this.payload;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private RunVideoAnalysisResponseBodyHeader header; 
        private Payload payload; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(RunVideoAnalysisResponseBody model) {
            this.header = model.header;
            this.payload = model.payload;
            this.requestId = model.requestId;
        } 

        /**
         * header.
         */
        public Builder header(RunVideoAnalysisResponseBodyHeader header) {
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
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public RunVideoAnalysisResponseBody build() {
            return new RunVideoAnalysisResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link RunVideoAnalysisResponseBody} extends {@link TeaModel}
     *
     * <p>RunVideoAnalysisResponseBody</p>
     */
    public static class RunVideoAnalysisResponseBodyHeader extends TeaModel {
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

        private RunVideoAnalysisResponseBodyHeader(Builder builder) {
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

        public static RunVideoAnalysisResponseBodyHeader create() {
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

            private Builder() {
            } 

            private Builder(RunVideoAnalysisResponseBodyHeader model) {
                this.errorCode = model.errorCode;
                this.errorMessage = model.errorMessage;
                this.event = model.event;
                this.eventInfo = model.eventInfo;
                this.sessionId = model.sessionId;
                this.taskId = model.taskId;
                this.traceId = model.traceId;
            } 

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

            public RunVideoAnalysisResponseBodyHeader build() {
                return new RunVideoAnalysisResponseBodyHeader(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunVideoAnalysisResponseBody} extends {@link TeaModel}
     *
     * <p>RunVideoAnalysisResponseBody</p>
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

            private Builder() {
            } 

            private Builder(Usage model) {
                this.inputTokens = model.inputTokens;
                this.outputTokens = model.outputTokens;
                this.totalTokens = model.totalTokens;
            } 

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
     * {@link RunVideoAnalysisResponseBody} extends {@link TeaModel}
     *
     * <p>RunVideoAnalysisResponseBody</p>
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

            private Builder() {
            } 

            private Builder(VideoShotAnalysisResults model) {
                this.endTime = model.endTime;
                this.startTime = model.startTime;
                this.text = model.text;
            } 

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
     * {@link RunVideoAnalysisResponseBody} extends {@link TeaModel}
     *
     * <p>RunVideoAnalysisResponseBody</p>
     */
    public static class VideoAnalysisResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("generateFinished")
        private Boolean generateFinished;

        @com.aliyun.core.annotation.NameInMap("modelId")
        private String modelId;

        @com.aliyun.core.annotation.NameInMap("text")
        private String text;

        @com.aliyun.core.annotation.NameInMap("usage")
        private Usage usage;

        @com.aliyun.core.annotation.NameInMap("videoShotAnalysisResults")
        private java.util.List<VideoShotAnalysisResults> videoShotAnalysisResults;

        private VideoAnalysisResult(Builder builder) {
            this.generateFinished = builder.generateFinished;
            this.modelId = builder.modelId;
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
         * @return modelId
         */
        public String getModelId() {
            return this.modelId;
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
            private String modelId; 
            private String text; 
            private Usage usage; 
            private java.util.List<VideoShotAnalysisResults> videoShotAnalysisResults; 

            private Builder() {
            } 

            private Builder(VideoAnalysisResult model) {
                this.generateFinished = model.generateFinished;
                this.modelId = model.modelId;
                this.text = model.text;
                this.usage = model.usage;
                this.videoShotAnalysisResults = model.videoShotAnalysisResults;
            } 

            /**
             * generateFinished.
             */
            public Builder generateFinished(Boolean generateFinished) {
                this.generateFinished = generateFinished;
                return this;
            }

            /**
             * modelId.
             */
            public Builder modelId(String modelId) {
                this.modelId = modelId;
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
     * {@link RunVideoAnalysisResponseBody} extends {@link TeaModel}
     *
     * <p>RunVideoAnalysisResponseBody</p>
     */
    public static class VideoCaptions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("endTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("endTimeFormat")
        private String endTimeFormat;

        @com.aliyun.core.annotation.NameInMap("speaker")
        private String speaker;

        @com.aliyun.core.annotation.NameInMap("startTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("startTimeFormat")
        private String startTimeFormat;

        @com.aliyun.core.annotation.NameInMap("text")
        private String text;

        private VideoCaptions(Builder builder) {
            this.endTime = builder.endTime;
            this.endTimeFormat = builder.endTimeFormat;
            this.speaker = builder.speaker;
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
         * @return speaker
         */
        public String getSpeaker() {
            return this.speaker;
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
            private String speaker; 
            private Long startTime; 
            private String startTimeFormat; 
            private String text; 

            private Builder() {
            } 

            private Builder(VideoCaptions model) {
                this.endTime = model.endTime;
                this.endTimeFormat = model.endTimeFormat;
                this.speaker = model.speaker;
                this.startTime = model.startTime;
                this.startTimeFormat = model.startTimeFormat;
                this.text = model.text;
            } 

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
             * speaker.
             */
            public Builder speaker(String speaker) {
                this.speaker = speaker;
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
     * {@link RunVideoAnalysisResponseBody} extends {@link TeaModel}
     *
     * <p>RunVideoAnalysisResponseBody</p>
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

            private Builder() {
            } 

            private Builder(VideoCaptionResult model) {
                this.generateFinished = model.generateFinished;
                this.videoCaptions = model.videoCaptions;
            } 

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
     * {@link RunVideoAnalysisResponseBody} extends {@link TeaModel}
     *
     * <p>RunVideoAnalysisResponseBody</p>
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

            private Builder() {
            } 

            private Builder(VideoGenerateResultUsage model) {
                this.inputTokens = model.inputTokens;
                this.outputTokens = model.outputTokens;
                this.totalTokens = model.totalTokens;
            } 

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
     * {@link RunVideoAnalysisResponseBody} extends {@link TeaModel}
     *
     * <p>RunVideoAnalysisResponseBody</p>
     */
    public static class VideoGenerateResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("generateFinished")
        private Boolean generateFinished;

        @com.aliyun.core.annotation.NameInMap("index")
        private Integer index;

        @com.aliyun.core.annotation.NameInMap("modelId")
        private String modelId;

        @com.aliyun.core.annotation.NameInMap("modelReduce")
        private Boolean modelReduce;

        @com.aliyun.core.annotation.NameInMap("reasonText")
        private String reasonText;

        @com.aliyun.core.annotation.NameInMap("text")
        private String text;

        @com.aliyun.core.annotation.NameInMap("usage")
        private VideoGenerateResultUsage usage;

        private VideoGenerateResult(Builder builder) {
            this.generateFinished = builder.generateFinished;
            this.index = builder.index;
            this.modelId = builder.modelId;
            this.modelReduce = builder.modelReduce;
            this.reasonText = builder.reasonText;
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
         * @return index
         */
        public Integer getIndex() {
            return this.index;
        }

        /**
         * @return modelId
         */
        public String getModelId() {
            return this.modelId;
        }

        /**
         * @return modelReduce
         */
        public Boolean getModelReduce() {
            return this.modelReduce;
        }

        /**
         * @return reasonText
         */
        public String getReasonText() {
            return this.reasonText;
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
            private Integer index; 
            private String modelId; 
            private Boolean modelReduce; 
            private String reasonText; 
            private String text; 
            private VideoGenerateResultUsage usage; 

            private Builder() {
            } 

            private Builder(VideoGenerateResult model) {
                this.generateFinished = model.generateFinished;
                this.index = model.index;
                this.modelId = model.modelId;
                this.modelReduce = model.modelReduce;
                this.reasonText = model.reasonText;
                this.text = model.text;
                this.usage = model.usage;
            } 

            /**
             * generateFinished.
             */
            public Builder generateFinished(Boolean generateFinished) {
                this.generateFinished = generateFinished;
                return this;
            }

            /**
             * index.
             */
            public Builder index(Integer index) {
                this.index = index;
                return this;
            }

            /**
             * modelId.
             */
            public Builder modelId(String modelId) {
                this.modelId = modelId;
                return this;
            }

            /**
             * modelReduce.
             */
            public Builder modelReduce(Boolean modelReduce) {
                this.modelReduce = modelReduce;
                return this;
            }

            /**
             * reasonText.
             */
            public Builder reasonText(String reasonText) {
                this.reasonText = reasonText;
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
     * {@link RunVideoAnalysisResponseBody} extends {@link TeaModel}
     *
     * <p>RunVideoAnalysisResponseBody</p>
     */
    public static class VideoGenerateResultsUsage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("inputTokens")
        private Long inputTokens;

        @com.aliyun.core.annotation.NameInMap("outputTokens")
        private Long outputTokens;

        @com.aliyun.core.annotation.NameInMap("totalTokens")
        private Long totalTokens;

        private VideoGenerateResultsUsage(Builder builder) {
            this.inputTokens = builder.inputTokens;
            this.outputTokens = builder.outputTokens;
            this.totalTokens = builder.totalTokens;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VideoGenerateResultsUsage create() {
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

            private Builder() {
            } 

            private Builder(VideoGenerateResultsUsage model) {
                this.inputTokens = model.inputTokens;
                this.outputTokens = model.outputTokens;
                this.totalTokens = model.totalTokens;
            } 

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

            public VideoGenerateResultsUsage build() {
                return new VideoGenerateResultsUsage(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunVideoAnalysisResponseBody} extends {@link TeaModel}
     *
     * <p>RunVideoAnalysisResponseBody</p>
     */
    public static class VideoGenerateResults extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("generateFinished")
        private Boolean generateFinished;

        @com.aliyun.core.annotation.NameInMap("index")
        private Integer index;

        @com.aliyun.core.annotation.NameInMap("modelId")
        private String modelId;

        @com.aliyun.core.annotation.NameInMap("reasonText")
        private String reasonText;

        @com.aliyun.core.annotation.NameInMap("text")
        private String text;

        @com.aliyun.core.annotation.NameInMap("usage")
        private VideoGenerateResultsUsage usage;

        private VideoGenerateResults(Builder builder) {
            this.generateFinished = builder.generateFinished;
            this.index = builder.index;
            this.modelId = builder.modelId;
            this.reasonText = builder.reasonText;
            this.text = builder.text;
            this.usage = builder.usage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VideoGenerateResults create() {
            return builder().build();
        }

        /**
         * @return generateFinished
         */
        public Boolean getGenerateFinished() {
            return this.generateFinished;
        }

        /**
         * @return index
         */
        public Integer getIndex() {
            return this.index;
        }

        /**
         * @return modelId
         */
        public String getModelId() {
            return this.modelId;
        }

        /**
         * @return reasonText
         */
        public String getReasonText() {
            return this.reasonText;
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
        public VideoGenerateResultsUsage getUsage() {
            return this.usage;
        }

        public static final class Builder {
            private Boolean generateFinished; 
            private Integer index; 
            private String modelId; 
            private String reasonText; 
            private String text; 
            private VideoGenerateResultsUsage usage; 

            private Builder() {
            } 

            private Builder(VideoGenerateResults model) {
                this.generateFinished = model.generateFinished;
                this.index = model.index;
                this.modelId = model.modelId;
                this.reasonText = model.reasonText;
                this.text = model.text;
                this.usage = model.usage;
            } 

            /**
             * generateFinished.
             */
            public Builder generateFinished(Boolean generateFinished) {
                this.generateFinished = generateFinished;
                return this;
            }

            /**
             * index.
             */
            public Builder index(Integer index) {
                this.index = index;
                return this;
            }

            /**
             * modelId.
             */
            public Builder modelId(String modelId) {
                this.modelId = modelId;
                return this;
            }

            /**
             * reasonText.
             */
            public Builder reasonText(String reasonText) {
                this.reasonText = reasonText;
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
            public Builder usage(VideoGenerateResultsUsage usage) {
                this.usage = usage;
                return this;
            }

            public VideoGenerateResults build() {
                return new VideoGenerateResults(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunVideoAnalysisResponseBody} extends {@link TeaModel}
     *
     * <p>RunVideoAnalysisResponseBody</p>
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

            private Builder() {
            } 

            private Builder(VideoMindMappingGenerateResultUsage model) {
                this.inputTokens = model.inputTokens;
                this.outputTokens = model.outputTokens;
                this.totalTokens = model.totalTokens;
            } 

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
     * {@link RunVideoAnalysisResponseBody} extends {@link TeaModel}
     *
     * <p>RunVideoAnalysisResponseBody</p>
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

            private Builder() {
            } 

            private Builder(ChildNodes model) {
                this.name = model.name;
            } 

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
     * {@link RunVideoAnalysisResponseBody} extends {@link TeaModel}
     *
     * <p>RunVideoAnalysisResponseBody</p>
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

            private Builder() {
            } 

            private Builder(VideoMindMappingsChildNodes model) {
                this.childNodes = model.childNodes;
                this.name = model.name;
            } 

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
     * {@link RunVideoAnalysisResponseBody} extends {@link TeaModel}
     *
     * <p>RunVideoAnalysisResponseBody</p>
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

            private Builder() {
            } 

            private Builder(VideoMindMappings model) {
                this.childNodes = model.childNodes;
                this.name = model.name;
            } 

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
     * {@link RunVideoAnalysisResponseBody} extends {@link TeaModel}
     *
     * <p>RunVideoAnalysisResponseBody</p>
     */
    public static class VideoMindMappingGenerateResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("generateFinished")
        private Boolean generateFinished;

        @com.aliyun.core.annotation.NameInMap("modelId")
        private String modelId;

        @com.aliyun.core.annotation.NameInMap("modelReduce")
        private Boolean modelReduce;

        @com.aliyun.core.annotation.NameInMap("text")
        private String text;

        @com.aliyun.core.annotation.NameInMap("usage")
        private VideoMindMappingGenerateResultUsage usage;

        @com.aliyun.core.annotation.NameInMap("videoMindMappings")
        private java.util.List<VideoMindMappings> videoMindMappings;

        private VideoMindMappingGenerateResult(Builder builder) {
            this.generateFinished = builder.generateFinished;
            this.modelId = builder.modelId;
            this.modelReduce = builder.modelReduce;
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
         * @return modelId
         */
        public String getModelId() {
            return this.modelId;
        }

        /**
         * @return modelReduce
         */
        public Boolean getModelReduce() {
            return this.modelReduce;
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
            private String modelId; 
            private Boolean modelReduce; 
            private String text; 
            private VideoMindMappingGenerateResultUsage usage; 
            private java.util.List<VideoMindMappings> videoMindMappings; 

            private Builder() {
            } 

            private Builder(VideoMindMappingGenerateResult model) {
                this.generateFinished = model.generateFinished;
                this.modelId = model.modelId;
                this.modelReduce = model.modelReduce;
                this.text = model.text;
                this.usage = model.usage;
                this.videoMindMappings = model.videoMindMappings;
            } 

            /**
             * generateFinished.
             */
            public Builder generateFinished(Boolean generateFinished) {
                this.generateFinished = generateFinished;
                return this;
            }

            /**
             * modelId.
             */
            public Builder modelId(String modelId) {
                this.modelId = modelId;
                return this;
            }

            /**
             * modelReduce.
             */
            public Builder modelReduce(Boolean modelReduce) {
                this.modelReduce = modelReduce;
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
     * {@link RunVideoAnalysisResponseBody} extends {@link TeaModel}
     *
     * <p>RunVideoAnalysisResponseBody</p>
     */
    public static class TimeIntervals extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("endTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("startTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("timestamp")
        private Long timestamp;

        @com.aliyun.core.annotation.NameInMap("url")
        private String url;

        private TimeIntervals(Builder builder) {
            this.endTime = builder.endTime;
            this.startTime = builder.startTime;
            this.timestamp = builder.timestamp;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TimeIntervals create() {
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
         * @return timestamp
         */
        public Long getTimestamp() {
            return this.timestamp;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private Long endTime; 
            private Long startTime; 
            private Long timestamp; 
            private String url; 

            private Builder() {
            } 

            private Builder(TimeIntervals model) {
                this.endTime = model.endTime;
                this.startTime = model.startTime;
                this.timestamp = model.timestamp;
                this.url = model.url;
            } 

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
             * timestamp.
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public TimeIntervals build() {
                return new TimeIntervals(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunVideoAnalysisResponseBody} extends {@link TeaModel}
     *
     * <p>RunVideoAnalysisResponseBody</p>
     */
    public static class VideoRoles extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("isAutoRecognition")
        private Boolean isAutoRecognition;

        @com.aliyun.core.annotation.NameInMap("ratio")
        private Float ratio;

        @com.aliyun.core.annotation.NameInMap("roleInfo")
        private String roleInfo;

        @com.aliyun.core.annotation.NameInMap("roleName")
        private String roleName;

        @com.aliyun.core.annotation.NameInMap("timeIntervals")
        private java.util.List<TimeIntervals> timeIntervals;

        private VideoRoles(Builder builder) {
            this.isAutoRecognition = builder.isAutoRecognition;
            this.ratio = builder.ratio;
            this.roleInfo = builder.roleInfo;
            this.roleName = builder.roleName;
            this.timeIntervals = builder.timeIntervals;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VideoRoles create() {
            return builder().build();
        }

        /**
         * @return isAutoRecognition
         */
        public Boolean getIsAutoRecognition() {
            return this.isAutoRecognition;
        }

        /**
         * @return ratio
         */
        public Float getRatio() {
            return this.ratio;
        }

        /**
         * @return roleInfo
         */
        public String getRoleInfo() {
            return this.roleInfo;
        }

        /**
         * @return roleName
         */
        public String getRoleName() {
            return this.roleName;
        }

        /**
         * @return timeIntervals
         */
        public java.util.List<TimeIntervals> getTimeIntervals() {
            return this.timeIntervals;
        }

        public static final class Builder {
            private Boolean isAutoRecognition; 
            private Float ratio; 
            private String roleInfo; 
            private String roleName; 
            private java.util.List<TimeIntervals> timeIntervals; 

            private Builder() {
            } 

            private Builder(VideoRoles model) {
                this.isAutoRecognition = model.isAutoRecognition;
                this.ratio = model.ratio;
                this.roleInfo = model.roleInfo;
                this.roleName = model.roleName;
                this.timeIntervals = model.timeIntervals;
            } 

            /**
             * isAutoRecognition.
             */
            public Builder isAutoRecognition(Boolean isAutoRecognition) {
                this.isAutoRecognition = isAutoRecognition;
                return this;
            }

            /**
             * ratio.
             */
            public Builder ratio(Float ratio) {
                this.ratio = ratio;
                return this;
            }

            /**
             * roleInfo.
             */
            public Builder roleInfo(String roleInfo) {
                this.roleInfo = roleInfo;
                return this;
            }

            /**
             * roleName.
             */
            public Builder roleName(String roleName) {
                this.roleName = roleName;
                return this;
            }

            /**
             * timeIntervals.
             */
            public Builder timeIntervals(java.util.List<TimeIntervals> timeIntervals) {
                this.timeIntervals = timeIntervals;
                return this;
            }

            public VideoRoles build() {
                return new VideoRoles(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunVideoAnalysisResponseBody} extends {@link TeaModel}
     *
     * <p>RunVideoAnalysisResponseBody</p>
     */
    public static class VideoRoleRecognitionResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("videoRoles")
        private java.util.List<VideoRoles> videoRoles;

        private VideoRoleRecognitionResult(Builder builder) {
            this.videoRoles = builder.videoRoles;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VideoRoleRecognitionResult create() {
            return builder().build();
        }

        /**
         * @return videoRoles
         */
        public java.util.List<VideoRoles> getVideoRoles() {
            return this.videoRoles;
        }

        public static final class Builder {
            private java.util.List<VideoRoles> videoRoles; 

            private Builder() {
            } 

            private Builder(VideoRoleRecognitionResult model) {
                this.videoRoles = model.videoRoles;
            } 

            /**
             * videoRoles.
             */
            public Builder videoRoles(java.util.List<VideoRoles> videoRoles) {
                this.videoRoles = videoRoles;
                return this;
            }

            public VideoRoleRecognitionResult build() {
                return new VideoRoleRecognitionResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunVideoAnalysisResponseBody} extends {@link TeaModel}
     *
     * <p>RunVideoAnalysisResponseBody</p>
     */
    public static class VideoSnapshots extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("url")
        private String url;

        private VideoSnapshots(Builder builder) {
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VideoSnapshots create() {
            return builder().build();
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String url; 

            private Builder() {
            } 

            private Builder(VideoSnapshots model) {
                this.url = model.url;
            } 

            /**
             * url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public VideoSnapshots build() {
                return new VideoSnapshots(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunVideoAnalysisResponseBody} extends {@link TeaModel}
     *
     * <p>RunVideoAnalysisResponseBody</p>
     */
    public static class VideoShots extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("endTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("endTimeFormat")
        private String endTimeFormat;

        @com.aliyun.core.annotation.NameInMap("startTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("startTimeFormat")
        private String startTimeFormat;

        @com.aliyun.core.annotation.NameInMap("videoSnapshots")
        private java.util.List<VideoSnapshots> videoSnapshots;

        private VideoShots(Builder builder) {
            this.endTime = builder.endTime;
            this.endTimeFormat = builder.endTimeFormat;
            this.startTime = builder.startTime;
            this.startTimeFormat = builder.startTimeFormat;
            this.videoSnapshots = builder.videoSnapshots;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VideoShots create() {
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
         * @return videoSnapshots
         */
        public java.util.List<VideoSnapshots> getVideoSnapshots() {
            return this.videoSnapshots;
        }

        public static final class Builder {
            private Long endTime; 
            private String endTimeFormat; 
            private Long startTime; 
            private String startTimeFormat; 
            private java.util.List<VideoSnapshots> videoSnapshots; 

            private Builder() {
            } 

            private Builder(VideoShots model) {
                this.endTime = model.endTime;
                this.endTimeFormat = model.endTimeFormat;
                this.startTime = model.startTime;
                this.startTimeFormat = model.startTimeFormat;
                this.videoSnapshots = model.videoSnapshots;
            } 

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
             * videoSnapshots.
             */
            public Builder videoSnapshots(java.util.List<VideoSnapshots> videoSnapshots) {
                this.videoSnapshots = videoSnapshots;
                return this;
            }

            public VideoShots build() {
                return new VideoShots(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunVideoAnalysisResponseBody} extends {@link TeaModel}
     *
     * <p>RunVideoAnalysisResponseBody</p>
     */
    public static class VideoShotSnapshotResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("videoShots")
        private java.util.List<VideoShots> videoShots;

        private VideoShotSnapshotResult(Builder builder) {
            this.videoShots = builder.videoShots;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VideoShotSnapshotResult create() {
            return builder().build();
        }

        /**
         * @return videoShots
         */
        public java.util.List<VideoShots> getVideoShots() {
            return this.videoShots;
        }

        public static final class Builder {
            private java.util.List<VideoShots> videoShots; 

            private Builder() {
            } 

            private Builder(VideoShotSnapshotResult model) {
                this.videoShots = model.videoShots;
            } 

            /**
             * videoShots.
             */
            public Builder videoShots(java.util.List<VideoShots> videoShots) {
                this.videoShots = videoShots;
                return this;
            }

            public VideoShotSnapshotResult build() {
                return new VideoShotSnapshotResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunVideoAnalysisResponseBody} extends {@link TeaModel}
     *
     * <p>RunVideoAnalysisResponseBody</p>
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

            private Builder() {
            } 

            private Builder(VideoTitleGenerateResultUsage model) {
                this.inputTokens = model.inputTokens;
                this.outputTokens = model.outputTokens;
                this.totalTokens = model.totalTokens;
            } 

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
     * {@link RunVideoAnalysisResponseBody} extends {@link TeaModel}
     *
     * <p>RunVideoAnalysisResponseBody</p>
     */
    public static class VideoTitleGenerateResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("generateFinished")
        private Boolean generateFinished;

        @com.aliyun.core.annotation.NameInMap("modelId")
        private String modelId;

        @com.aliyun.core.annotation.NameInMap("modelReduce")
        private Boolean modelReduce;

        @com.aliyun.core.annotation.NameInMap("text")
        private String text;

        @com.aliyun.core.annotation.NameInMap("usage")
        private VideoTitleGenerateResultUsage usage;

        private VideoTitleGenerateResult(Builder builder) {
            this.generateFinished = builder.generateFinished;
            this.modelId = builder.modelId;
            this.modelReduce = builder.modelReduce;
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
         * @return modelId
         */
        public String getModelId() {
            return this.modelId;
        }

        /**
         * @return modelReduce
         */
        public Boolean getModelReduce() {
            return this.modelReduce;
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
            private String modelId; 
            private Boolean modelReduce; 
            private String text; 
            private VideoTitleGenerateResultUsage usage; 

            private Builder() {
            } 

            private Builder(VideoTitleGenerateResult model) {
                this.generateFinished = model.generateFinished;
                this.modelId = model.modelId;
                this.modelReduce = model.modelReduce;
                this.text = model.text;
                this.usage = model.usage;
            } 

            /**
             * generateFinished.
             */
            public Builder generateFinished(Boolean generateFinished) {
                this.generateFinished = generateFinished;
                return this;
            }

            /**
             * modelId.
             */
            public Builder modelId(String modelId) {
                this.modelId = modelId;
                return this;
            }

            /**
             * modelReduce.
             */
            public Builder modelReduce(Boolean modelReduce) {
                this.modelReduce = modelReduce;
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
     * {@link RunVideoAnalysisResponseBody} extends {@link TeaModel}
     *
     * <p>RunVideoAnalysisResponseBody</p>
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

        @com.aliyun.core.annotation.NameInMap("videoGenerateResults")
        private java.util.List<VideoGenerateResults> videoGenerateResults;

        @com.aliyun.core.annotation.NameInMap("videoMindMappingGenerateResult")
        private VideoMindMappingGenerateResult videoMindMappingGenerateResult;

        @com.aliyun.core.annotation.NameInMap("videoRoleRecognitionResult")
        private VideoRoleRecognitionResult videoRoleRecognitionResult;

        @com.aliyun.core.annotation.NameInMap("videoShotSnapshotResult")
        private VideoShotSnapshotResult videoShotSnapshotResult;

        @com.aliyun.core.annotation.NameInMap("videoTitleGenerateResult")
        private VideoTitleGenerateResult videoTitleGenerateResult;

        private Output(Builder builder) {
            this.resultJsonFileUrl = builder.resultJsonFileUrl;
            this.videoAnalysisResult = builder.videoAnalysisResult;
            this.videoCaptionResult = builder.videoCaptionResult;
            this.videoGenerateResult = builder.videoGenerateResult;
            this.videoGenerateResults = builder.videoGenerateResults;
            this.videoMindMappingGenerateResult = builder.videoMindMappingGenerateResult;
            this.videoRoleRecognitionResult = builder.videoRoleRecognitionResult;
            this.videoShotSnapshotResult = builder.videoShotSnapshotResult;
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
         * @return videoGenerateResults
         */
        public java.util.List<VideoGenerateResults> getVideoGenerateResults() {
            return this.videoGenerateResults;
        }

        /**
         * @return videoMindMappingGenerateResult
         */
        public VideoMindMappingGenerateResult getVideoMindMappingGenerateResult() {
            return this.videoMindMappingGenerateResult;
        }

        /**
         * @return videoRoleRecognitionResult
         */
        public VideoRoleRecognitionResult getVideoRoleRecognitionResult() {
            return this.videoRoleRecognitionResult;
        }

        /**
         * @return videoShotSnapshotResult
         */
        public VideoShotSnapshotResult getVideoShotSnapshotResult() {
            return this.videoShotSnapshotResult;
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
            private java.util.List<VideoGenerateResults> videoGenerateResults; 
            private VideoMindMappingGenerateResult videoMindMappingGenerateResult; 
            private VideoRoleRecognitionResult videoRoleRecognitionResult; 
            private VideoShotSnapshotResult videoShotSnapshotResult; 
            private VideoTitleGenerateResult videoTitleGenerateResult; 

            private Builder() {
            } 

            private Builder(Output model) {
                this.resultJsonFileUrl = model.resultJsonFileUrl;
                this.videoAnalysisResult = model.videoAnalysisResult;
                this.videoCaptionResult = model.videoCaptionResult;
                this.videoGenerateResult = model.videoGenerateResult;
                this.videoGenerateResults = model.videoGenerateResults;
                this.videoMindMappingGenerateResult = model.videoMindMappingGenerateResult;
                this.videoRoleRecognitionResult = model.videoRoleRecognitionResult;
                this.videoShotSnapshotResult = model.videoShotSnapshotResult;
                this.videoTitleGenerateResult = model.videoTitleGenerateResult;
            } 

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
             * videoGenerateResults.
             */
            public Builder videoGenerateResults(java.util.List<VideoGenerateResults> videoGenerateResults) {
                this.videoGenerateResults = videoGenerateResults;
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
             * videoRoleRecognitionResult.
             */
            public Builder videoRoleRecognitionResult(VideoRoleRecognitionResult videoRoleRecognitionResult) {
                this.videoRoleRecognitionResult = videoRoleRecognitionResult;
                return this;
            }

            /**
             * videoShotSnapshotResult.
             */
            public Builder videoShotSnapshotResult(VideoShotSnapshotResult videoShotSnapshotResult) {
                this.videoShotSnapshotResult = videoShotSnapshotResult;
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
     * {@link RunVideoAnalysisResponseBody} extends {@link TeaModel}
     *
     * <p>RunVideoAnalysisResponseBody</p>
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

            private Builder() {
            } 

            private Builder(PayloadUsage model) {
                this.inputTokens = model.inputTokens;
                this.outputTokens = model.outputTokens;
                this.totalTokens = model.totalTokens;
            } 

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
     * {@link RunVideoAnalysisResponseBody} extends {@link TeaModel}
     *
     * <p>RunVideoAnalysisResponseBody</p>
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

            private Builder() {
            } 

            private Builder(Payload model) {
                this.output = model.output;
                this.usage = model.usage;
            } 

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
}
