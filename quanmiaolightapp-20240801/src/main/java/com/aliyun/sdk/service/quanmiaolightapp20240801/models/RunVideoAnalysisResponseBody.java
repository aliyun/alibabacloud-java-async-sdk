// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quanmiaolightapp20240801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
    public static class VideoAnalysisResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("generateFinished")
        private Boolean generateFinished;

        @com.aliyun.core.annotation.NameInMap("text")
        private String text;

        @com.aliyun.core.annotation.NameInMap("usage")
        private Usage usage;

        @com.aliyun.core.annotation.NameInMap("videoShotAnalysisResults")
        private java.util.List < VideoShotAnalysisResults> videoShotAnalysisResults;

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
        public java.util.List < VideoShotAnalysisResults> getVideoShotAnalysisResults() {
            return this.videoShotAnalysisResults;
        }

        public static final class Builder {
            private Boolean generateFinished; 
            private String text; 
            private Usage usage; 
            private java.util.List < VideoShotAnalysisResults> videoShotAnalysisResults; 

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
            public Builder videoShotAnalysisResults(java.util.List < VideoShotAnalysisResults> videoShotAnalysisResults) {
                this.videoShotAnalysisResults = videoShotAnalysisResults;
                return this;
            }

            public VideoAnalysisResult build() {
                return new VideoAnalysisResult(this);
            } 

        } 

    }
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
    public static class VideoCaptionResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("generateFinished")
        private Boolean generateFinished;

        @com.aliyun.core.annotation.NameInMap("videoCaptions")
        private java.util.List < VideoCaptions> videoCaptions;

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
        public java.util.List < VideoCaptions> getVideoCaptions() {
            return this.videoCaptions;
        }

        public static final class Builder {
            private Boolean generateFinished; 
            private java.util.List < VideoCaptions> videoCaptions; 

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
            public Builder videoCaptions(java.util.List < VideoCaptions> videoCaptions) {
                this.videoCaptions = videoCaptions;
                return this;
            }

            public VideoCaptionResult build() {
                return new VideoCaptionResult(this);
            } 

        } 

    }
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
    public static class VideoMindMappingsChildNodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("childNodes")
        private java.util.List < ChildNodes> childNodes;

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
        public java.util.List < ChildNodes> getChildNodes() {
            return this.childNodes;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private java.util.List < ChildNodes> childNodes; 
            private String name; 

            /**
             * childNodes.
             */
            public Builder childNodes(java.util.List < ChildNodes> childNodes) {
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
    public static class VideoMindMappings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("childNodes")
        private java.util.List < VideoMindMappingsChildNodes> childNodes;

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
        public java.util.List < VideoMindMappingsChildNodes> getChildNodes() {
            return this.childNodes;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private java.util.List < VideoMindMappingsChildNodes> childNodes; 
            private String name; 

            /**
             * childNodes.
             */
            public Builder childNodes(java.util.List < VideoMindMappingsChildNodes> childNodes) {
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
    public static class VideoMindMappingGenerateResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("generateFinished")
        private Boolean generateFinished;

        @com.aliyun.core.annotation.NameInMap("text")
        private String text;

        @com.aliyun.core.annotation.NameInMap("usage")
        private VideoMindMappingGenerateResultUsage usage;

        @com.aliyun.core.annotation.NameInMap("videoMindMappings")
        private java.util.List < VideoMindMappings> videoMindMappings;

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
        public java.util.List < VideoMindMappings> getVideoMindMappings() {
            return this.videoMindMappings;
        }

        public static final class Builder {
            private Boolean generateFinished; 
            private String text; 
            private VideoMindMappingGenerateResultUsage usage; 
            private java.util.List < VideoMindMappings> videoMindMappings; 

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
            public Builder videoMindMappings(java.util.List < VideoMindMappings> videoMindMappings) {
                this.videoMindMappings = videoMindMappings;
                return this;
            }

            public VideoMindMappingGenerateResult build() {
                return new VideoMindMappingGenerateResult(this);
            } 

        } 

    }
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
    public static class Output extends TeaModel {
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
            private VideoAnalysisResult videoAnalysisResult; 
            private VideoCaptionResult videoCaptionResult; 
            private VideoGenerateResult videoGenerateResult; 
            private VideoMindMappingGenerateResult videoMindMappingGenerateResult; 
            private VideoTitleGenerateResult videoTitleGenerateResult; 

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
}
