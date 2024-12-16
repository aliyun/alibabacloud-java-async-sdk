// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RunDocIntroductionResponseBody} extends {@link TeaModel}
 *
 * <p>RunDocIntroductionResponseBody</p>
 */
public class RunDocIntroductionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Header")
    private RunDocIntroductionResponseBodyHeader header;

    @com.aliyun.core.annotation.NameInMap("Payload")
    private Payload payload;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private RunDocIntroductionResponseBody(Builder builder) {
        this.header = builder.header;
        this.payload = builder.payload;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunDocIntroductionResponseBody create() {
        return builder().build();
    }

    /**
     * @return header
     */
    public RunDocIntroductionResponseBodyHeader getHeader() {
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
        private RunDocIntroductionResponseBodyHeader header; 
        private Payload payload; 
        private String requestId; 

        /**
         * Header.
         */
        public Builder header(RunDocIntroductionResponseBodyHeader header) {
            this.header = header;
            return this;
        }

        /**
         * Payload.
         */
        public Builder payload(Payload payload) {
            this.payload = payload;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public RunDocIntroductionResponseBody build() {
            return new RunDocIntroductionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link RunDocIntroductionResponseBody} extends {@link TeaModel}
     *
     * <p>RunDocIntroductionResponseBody</p>
     */
    public static class RunDocIntroductionResponseBodyHeader extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("Event")
        private String event;

        @com.aliyun.core.annotation.NameInMap("EventInfo")
        private String eventInfo;

        @com.aliyun.core.annotation.NameInMap("SessionId")
        private String sessionId;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("TraceId")
        private String traceId;

        private RunDocIntroductionResponseBodyHeader(Builder builder) {
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

        public static RunDocIntroductionResponseBodyHeader create() {
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
             * ErrorCode.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
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
             * Event.
             */
            public Builder event(String event) {
                this.event = event;
                return this;
            }

            /**
             * EventInfo.
             */
            public Builder eventInfo(String eventInfo) {
                this.eventInfo = eventInfo;
                return this;
            }

            /**
             * SessionId.
             */
            public Builder sessionId(String sessionId) {
                this.sessionId = sessionId;
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
             * TraceId.
             */
            public Builder traceId(String traceId) {
                this.traceId = traceId;
                return this;
            }

            public RunDocIntroductionResponseBodyHeader build() {
                return new RunDocIntroductionResponseBodyHeader(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunDocIntroductionResponseBody} extends {@link TeaModel}
     *
     * <p>RunDocIntroductionResponseBody</p>
     */
    public static class Blocks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BeginTime")
        private Long beginTime;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("Height")
        private Integer height;

        @com.aliyun.core.annotation.NameInMap("PageId")
        private Integer pageId;

        @com.aliyun.core.annotation.NameInMap("Width")
        private Integer width;

        @com.aliyun.core.annotation.NameInMap("X")
        private Integer x;

        @com.aliyun.core.annotation.NameInMap("Y")
        private Integer y;

        private Blocks(Builder builder) {
            this.beginTime = builder.beginTime;
            this.endTime = builder.endTime;
            this.height = builder.height;
            this.pageId = builder.pageId;
            this.width = builder.width;
            this.x = builder.x;
            this.y = builder.y;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Blocks create() {
            return builder().build();
        }

        /**
         * @return beginTime
         */
        public Long getBeginTime() {
            return this.beginTime;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return height
         */
        public Integer getHeight() {
            return this.height;
        }

        /**
         * @return pageId
         */
        public Integer getPageId() {
            return this.pageId;
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
        public Integer getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public Integer getY() {
            return this.y;
        }

        public static final class Builder {
            private Long beginTime; 
            private Long endTime; 
            private Integer height; 
            private Integer pageId; 
            private Integer width; 
            private Integer x; 
            private Integer y; 

            /**
             * BeginTime.
             */
            public Builder beginTime(Long beginTime) {
                this.beginTime = beginTime;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
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
             * PageId.
             */
            public Builder pageId(Integer pageId) {
                this.pageId = pageId;
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
            public Builder x(Integer x) {
                this.x = x;
                return this;
            }

            /**
             * Y.
             */
            public Builder y(Integer y) {
                this.y = y;
                return this;
            }

            public Blocks build() {
                return new Blocks(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunDocIntroductionResponseBody} extends {@link TeaModel}
     *
     * <p>RunDocIntroductionResponseBody</p>
     */
    public static class Introductions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Blocks")
        private java.util.List < Blocks> blocks;

        @com.aliyun.core.annotation.NameInMap("StartPageId")
        private Integer startPageId;

        @com.aliyun.core.annotation.NameInMap("Summary")
        private String summary;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        private Introductions(Builder builder) {
            this.blocks = builder.blocks;
            this.startPageId = builder.startPageId;
            this.summary = builder.summary;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Introductions create() {
            return builder().build();
        }

        /**
         * @return blocks
         */
        public java.util.List < Blocks> getBlocks() {
            return this.blocks;
        }

        /**
         * @return startPageId
         */
        public Integer getStartPageId() {
            return this.startPageId;
        }

        /**
         * @return summary
         */
        public String getSummary() {
            return this.summary;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private java.util.List < Blocks> blocks; 
            private Integer startPageId; 
            private String summary; 
            private String title; 

            /**
             * Blocks.
             */
            public Builder blocks(java.util.List < Blocks> blocks) {
                this.blocks = blocks;
                return this;
            }

            /**
             * StartPageId.
             */
            public Builder startPageId(Integer startPageId) {
                this.startPageId = startPageId;
                return this;
            }

            /**
             * Summary.
             */
            public Builder summary(String summary) {
                this.summary = summary;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public Introductions build() {
                return new Introductions(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunDocIntroductionResponseBody} extends {@link TeaModel}
     *
     * <p>RunDocIntroductionResponseBody</p>
     */
    public static class Output extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Introductions")
        private java.util.List < Introductions> introductions;

        @com.aliyun.core.annotation.NameInMap("KeyPoint")
        private String keyPoint;

        @com.aliyun.core.annotation.NameInMap("Summary")
        private String summary;

        private Output(Builder builder) {
            this.introductions = builder.introductions;
            this.keyPoint = builder.keyPoint;
            this.summary = builder.summary;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Output create() {
            return builder().build();
        }

        /**
         * @return introductions
         */
        public java.util.List < Introductions> getIntroductions() {
            return this.introductions;
        }

        /**
         * @return keyPoint
         */
        public String getKeyPoint() {
            return this.keyPoint;
        }

        /**
         * @return summary
         */
        public String getSummary() {
            return this.summary;
        }

        public static final class Builder {
            private java.util.List < Introductions> introductions; 
            private String keyPoint; 
            private String summary; 

            /**
             * Introductions.
             */
            public Builder introductions(java.util.List < Introductions> introductions) {
                this.introductions = introductions;
                return this;
            }

            /**
             * KeyPoint.
             */
            public Builder keyPoint(String keyPoint) {
                this.keyPoint = keyPoint;
                return this;
            }

            /**
             * Summary.
             */
            public Builder summary(String summary) {
                this.summary = summary;
                return this;
            }

            public Output build() {
                return new Output(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunDocIntroductionResponseBody} extends {@link TeaModel}
     *
     * <p>RunDocIntroductionResponseBody</p>
     */
    public static class Usage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InputTokens")
        private Long inputTokens;

        @com.aliyun.core.annotation.NameInMap("OutputTokens")
        private Long outputTokens;

        @com.aliyun.core.annotation.NameInMap("TotalTokens")
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
             * InputTokens.
             */
            public Builder inputTokens(Long inputTokens) {
                this.inputTokens = inputTokens;
                return this;
            }

            /**
             * OutputTokens.
             */
            public Builder outputTokens(Long outputTokens) {
                this.outputTokens = outputTokens;
                return this;
            }

            /**
             * TotalTokens.
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
     * {@link RunDocIntroductionResponseBody} extends {@link TeaModel}
     *
     * <p>RunDocIntroductionResponseBody</p>
     */
    public static class Payload extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Output")
        private Output output;

        @com.aliyun.core.annotation.NameInMap("Usage")
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

            /**
             * Output.
             */
            public Builder output(Output output) {
                this.output = output;
                return this;
            }

            /**
             * Usage.
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
