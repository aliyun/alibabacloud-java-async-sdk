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
 * {@link RunEssayCorrectionResponseBody} extends {@link TeaModel}
 *
 * <p>RunEssayCorrectionResponseBody</p>
 */
public class RunEssayCorrectionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("header")
    private RunEssayCorrectionResponseBodyHeader header;

    @com.aliyun.core.annotation.NameInMap("payload")
    private Payload payload;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private RunEssayCorrectionResponseBody(Builder builder) {
        this.header = builder.header;
        this.payload = builder.payload;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunEssayCorrectionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return header
     */
    public RunEssayCorrectionResponseBodyHeader getHeader() {
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
        private RunEssayCorrectionResponseBodyHeader header; 
        private Payload payload; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(RunEssayCorrectionResponseBody model) {
            this.header = model.header;
            this.payload = model.payload;
            this.requestId = model.requestId;
        } 

        /**
         * header.
         */
        public Builder header(RunEssayCorrectionResponseBodyHeader header) {
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
         * <p>117F5ABE-CF02-5502-9A3F-E56BC9081A64</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public RunEssayCorrectionResponseBody build() {
            return new RunEssayCorrectionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link RunEssayCorrectionResponseBody} extends {@link TeaModel}
     *
     * <p>RunEssayCorrectionResponseBody</p>
     */
    public static class RunEssayCorrectionResponseBodyHeader extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("errorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("errorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("event")
        private String event;

        @com.aliyun.core.annotation.NameInMap("sessionId")
        private String sessionId;

        @com.aliyun.core.annotation.NameInMap("taskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("traceId")
        private String traceId;

        private RunEssayCorrectionResponseBodyHeader(Builder builder) {
            this.errorCode = builder.errorCode;
            this.errorMessage = builder.errorMessage;
            this.event = builder.event;
            this.sessionId = builder.sessionId;
            this.taskId = builder.taskId;
            this.traceId = builder.traceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RunEssayCorrectionResponseBodyHeader create() {
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
            private String sessionId; 
            private String taskId; 
            private String traceId; 

            private Builder() {
            } 

            private Builder(RunEssayCorrectionResponseBodyHeader model) {
                this.errorCode = model.errorCode;
                this.errorMessage = model.errorMessage;
                this.event = model.event;
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

            public RunEssayCorrectionResponseBodyHeader build() {
                return new RunEssayCorrectionResponseBodyHeader(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunEssayCorrectionResponseBody} extends {@link TeaModel}
     *
     * <p>RunEssayCorrectionResponseBody</p>
     */
    public static class DimensionResults extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("analysis")
        private String analysis;

        @com.aliyun.core.annotation.NameInMap("maxScore")
        private Double maxScore;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("score")
        private Double score;

        private DimensionResults(Builder builder) {
            this.analysis = builder.analysis;
            this.maxScore = builder.maxScore;
            this.name = builder.name;
            this.score = builder.score;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DimensionResults create() {
            return builder().build();
        }

        /**
         * @return analysis
         */
        public String getAnalysis() {
            return this.analysis;
        }

        /**
         * @return maxScore
         */
        public Double getMaxScore() {
            return this.maxScore;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return score
         */
        public Double getScore() {
            return this.score;
        }

        public static final class Builder {
            private String analysis; 
            private Double maxScore; 
            private String name; 
            private Double score; 

            private Builder() {
            } 

            private Builder(DimensionResults model) {
                this.analysis = model.analysis;
                this.maxScore = model.maxScore;
                this.name = model.name;
                this.score = model.score;
            } 

            /**
             * analysis.
             */
            public Builder analysis(String analysis) {
                this.analysis = analysis;
                return this;
            }

            /**
             * maxScore.
             */
            public Builder maxScore(Double maxScore) {
                this.maxScore = maxScore;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * score.
             */
            public Builder score(Double score) {
                this.score = score;
                return this;
            }

            public DimensionResults build() {
                return new DimensionResults(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunEssayCorrectionResponseBody} extends {@link TeaModel}
     *
     * <p>RunEssayCorrectionResponseBody</p>
     */
    public static class Output extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("dimensionResults")
        private java.util.List<DimensionResults> dimensionResults;

        @com.aliyun.core.annotation.NameInMap("overallComment")
        private String overallComment;

        @com.aliyun.core.annotation.NameInMap("reasoningContent")
        private String reasoningContent;

        @com.aliyun.core.annotation.NameInMap("score")
        private Integer score;

        @com.aliyun.core.annotation.NameInMap("text")
        private String text;

        private Output(Builder builder) {
            this.dimensionResults = builder.dimensionResults;
            this.overallComment = builder.overallComment;
            this.reasoningContent = builder.reasoningContent;
            this.score = builder.score;
            this.text = builder.text;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Output create() {
            return builder().build();
        }

        /**
         * @return dimensionResults
         */
        public java.util.List<DimensionResults> getDimensionResults() {
            return this.dimensionResults;
        }

        /**
         * @return overallComment
         */
        public String getOverallComment() {
            return this.overallComment;
        }

        /**
         * @return reasoningContent
         */
        public String getReasoningContent() {
            return this.reasoningContent;
        }

        /**
         * @return score
         */
        public Integer getScore() {
            return this.score;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        public static final class Builder {
            private java.util.List<DimensionResults> dimensionResults; 
            private String overallComment; 
            private String reasoningContent; 
            private Integer score; 
            private String text; 

            private Builder() {
            } 

            private Builder(Output model) {
                this.dimensionResults = model.dimensionResults;
                this.overallComment = model.overallComment;
                this.reasoningContent = model.reasoningContent;
                this.score = model.score;
                this.text = model.text;
            } 

            /**
             * dimensionResults.
             */
            public Builder dimensionResults(java.util.List<DimensionResults> dimensionResults) {
                this.dimensionResults = dimensionResults;
                return this;
            }

            /**
             * overallComment.
             */
            public Builder overallComment(String overallComment) {
                this.overallComment = overallComment;
                return this;
            }

            /**
             * reasoningContent.
             */
            public Builder reasoningContent(String reasoningContent) {
                this.reasoningContent = reasoningContent;
                return this;
            }

            /**
             * score.
             */
            public Builder score(Integer score) {
                this.score = score;
                return this;
            }

            /**
             * text.
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            public Output build() {
                return new Output(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunEssayCorrectionResponseBody} extends {@link TeaModel}
     *
     * <p>RunEssayCorrectionResponseBody</p>
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
     * {@link RunEssayCorrectionResponseBody} extends {@link TeaModel}
     *
     * <p>RunEssayCorrectionResponseBody</p>
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
