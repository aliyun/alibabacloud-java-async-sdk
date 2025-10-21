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
 * {@link RunVideoDetectShotResponseBody} extends {@link TeaModel}
 *
 * <p>RunVideoDetectShotResponseBody</p>
 */
public class RunVideoDetectShotResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("header")
    private RunVideoDetectShotResponseBodyHeader header;

    @com.aliyun.core.annotation.NameInMap("payload")
    private Payload payload;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private RunVideoDetectShotResponseBody(Builder builder) {
        this.header = builder.header;
        this.payload = builder.payload;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunVideoDetectShotResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return header
     */
    public RunVideoDetectShotResponseBodyHeader getHeader() {
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
        private RunVideoDetectShotResponseBodyHeader header; 
        private Payload payload; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(RunVideoDetectShotResponseBody model) {
            this.header = model.header;
            this.payload = model.payload;
            this.requestId = model.requestId;
        } 

        /**
         * header.
         */
        public Builder header(RunVideoDetectShotResponseBodyHeader header) {
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
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>58868FD6-53D7-5ACD-80F7-854C8EA256EF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public RunVideoDetectShotResponseBody build() {
            return new RunVideoDetectShotResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link RunVideoDetectShotResponseBody} extends {@link TeaModel}
     *
     * <p>RunVideoDetectShotResponseBody</p>
     */
    public static class RunVideoDetectShotResponseBodyHeader extends TeaModel {
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

        private RunVideoDetectShotResponseBodyHeader(Builder builder) {
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

        public static RunVideoDetectShotResponseBodyHeader create() {
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

            private Builder(RunVideoDetectShotResponseBodyHeader model) {
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

            public RunVideoDetectShotResponseBodyHeader build() {
                return new RunVideoDetectShotResponseBodyHeader(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunVideoDetectShotResponseBody} extends {@link TeaModel}
     *
     * <p>RunVideoDetectShotResponseBody</p>
     */
    public static class VideoRecognitionResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("asr")
        private String asr;

        @com.aliyun.core.annotation.NameInMap("endTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("ocr")
        private String ocr;

        @com.aliyun.core.annotation.NameInMap("startTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("vl")
        private String vl;

        private VideoRecognitionResult(Builder builder) {
            this.asr = builder.asr;
            this.endTime = builder.endTime;
            this.ocr = builder.ocr;
            this.startTime = builder.startTime;
            this.vl = builder.vl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VideoRecognitionResult create() {
            return builder().build();
        }

        /**
         * @return asr
         */
        public String getAsr() {
            return this.asr;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return ocr
         */
        public String getOcr() {
            return this.ocr;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return vl
         */
        public String getVl() {
            return this.vl;
        }

        public static final class Builder {
            private String asr; 
            private Long endTime; 
            private String ocr; 
            private Long startTime; 
            private String vl; 

            private Builder() {
            } 

            private Builder(VideoRecognitionResult model) {
                this.asr = model.asr;
                this.endTime = model.endTime;
                this.ocr = model.ocr;
                this.startTime = model.startTime;
                this.vl = model.vl;
            } 

            /**
             * asr.
             */
            public Builder asr(String asr) {
                this.asr = asr;
                return this;
            }

            /**
             * endTime.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * ocr.
             */
            public Builder ocr(String ocr) {
                this.ocr = ocr;
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
             * vl.
             */
            public Builder vl(String vl) {
                this.vl = vl;
                return this;
            }

            public VideoRecognitionResult build() {
                return new VideoRecognitionResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunVideoDetectShotResponseBody} extends {@link TeaModel}
     *
     * <p>RunVideoDetectShotResponseBody</p>
     */
    public static class VideoSplitResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("reasonText")
        private String reasonText;

        @com.aliyun.core.annotation.NameInMap("text")
        private String text;

        @com.aliyun.core.annotation.NameInMap("videoParts")
        private java.util.List<java.util.Map<String, String>> videoParts;

        @com.aliyun.core.annotation.NameInMap("videoRecognitionResult")
        private java.util.List<VideoRecognitionResult> videoRecognitionResult;

        private VideoSplitResult(Builder builder) {
            this.reasonText = builder.reasonText;
            this.text = builder.text;
            this.videoParts = builder.videoParts;
            this.videoRecognitionResult = builder.videoRecognitionResult;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VideoSplitResult create() {
            return builder().build();
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
         * @return videoParts
         */
        public java.util.List<java.util.Map<String, String>> getVideoParts() {
            return this.videoParts;
        }

        /**
         * @return videoRecognitionResult
         */
        public java.util.List<VideoRecognitionResult> getVideoRecognitionResult() {
            return this.videoRecognitionResult;
        }

        public static final class Builder {
            private String reasonText; 
            private String text; 
            private java.util.List<java.util.Map<String, String>> videoParts; 
            private java.util.List<VideoRecognitionResult> videoRecognitionResult; 

            private Builder() {
            } 

            private Builder(VideoSplitResult model) {
                this.reasonText = model.reasonText;
                this.text = model.text;
                this.videoParts = model.videoParts;
                this.videoRecognitionResult = model.videoRecognitionResult;
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
             * videoParts.
             */
            public Builder videoParts(java.util.List<java.util.Map<String, String>> videoParts) {
                this.videoParts = videoParts;
                return this;
            }

            /**
             * videoRecognitionResult.
             */
            public Builder videoRecognitionResult(java.util.List<VideoRecognitionResult> videoRecognitionResult) {
                this.videoRecognitionResult = videoRecognitionResult;
                return this;
            }

            public VideoSplitResult build() {
                return new VideoSplitResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunVideoDetectShotResponseBody} extends {@link TeaModel}
     *
     * <p>RunVideoDetectShotResponseBody</p>
     */
    public static class Output extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("videoSplitResult")
        private VideoSplitResult videoSplitResult;

        private Output(Builder builder) {
            this.videoSplitResult = builder.videoSplitResult;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Output create() {
            return builder().build();
        }

        /**
         * @return videoSplitResult
         */
        public VideoSplitResult getVideoSplitResult() {
            return this.videoSplitResult;
        }

        public static final class Builder {
            private VideoSplitResult videoSplitResult; 

            private Builder() {
            } 

            private Builder(Output model) {
                this.videoSplitResult = model.videoSplitResult;
            } 

            /**
             * videoSplitResult.
             */
            public Builder videoSplitResult(VideoSplitResult videoSplitResult) {
                this.videoSplitResult = videoSplitResult;
                return this;
            }

            public Output build() {
                return new Output(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunVideoDetectShotResponseBody} extends {@link TeaModel}
     *
     * <p>RunVideoDetectShotResponseBody</p>
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
     * {@link RunVideoDetectShotResponseBody} extends {@link TeaModel}
     *
     * <p>RunVideoDetectShotResponseBody</p>
     */
    public static class Payload extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("output")
        private Output output;

        @com.aliyun.core.annotation.NameInMap("usage")
        private Usage usage;

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
        public Usage getUsage() {
            return this.usage;
        }

        public static final class Builder {
            private Output output; 
            private Usage usage; 

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
            public Builder usage(Usage usage) {
                this.usage = usage;
                return this;
            }

            public Payload build() {
                return new Payload(this);
            } 

        } 

    }
}
