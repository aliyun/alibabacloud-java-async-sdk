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
 * {@link RunEnterpriseVocAnalysisResponseBody} extends {@link TeaModel}
 *
 * <p>RunEnterpriseVocAnalysisResponseBody</p>
 */
public class RunEnterpriseVocAnalysisResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("header")
    private RunEnterpriseVocAnalysisResponseBodyHeader header;

    @com.aliyun.core.annotation.NameInMap("payload")
    private Payload payload;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private RunEnterpriseVocAnalysisResponseBody(Builder builder) {
        this.header = builder.header;
        this.payload = builder.payload;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunEnterpriseVocAnalysisResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return header
     */
    public RunEnterpriseVocAnalysisResponseBodyHeader getHeader() {
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
        private RunEnterpriseVocAnalysisResponseBodyHeader header; 
        private Payload payload; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(RunEnterpriseVocAnalysisResponseBody model) {
            this.header = model.header;
            this.payload = model.payload;
            this.requestId = model.requestId;
        } 

        /**
         * header.
         */
        public Builder header(RunEnterpriseVocAnalysisResponseBodyHeader header) {
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
         * <p>49483FFC-0CB9-5163-8D3E-234E276E6DA8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public RunEnterpriseVocAnalysisResponseBody build() {
            return new RunEnterpriseVocAnalysisResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link RunEnterpriseVocAnalysisResponseBody} extends {@link TeaModel}
     *
     * <p>RunEnterpriseVocAnalysisResponseBody</p>
     */
    public static class RunEnterpriseVocAnalysisResponseBodyHeader extends TeaModel {
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

        private RunEnterpriseVocAnalysisResponseBodyHeader(Builder builder) {
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

        public static RunEnterpriseVocAnalysisResponseBodyHeader create() {
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

            private Builder(RunEnterpriseVocAnalysisResponseBodyHeader model) {
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

            public RunEnterpriseVocAnalysisResponseBodyHeader build() {
                return new RunEnterpriseVocAnalysisResponseBodyHeader(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunEnterpriseVocAnalysisResponseBody} extends {@link TeaModel}
     *
     * <p>RunEnterpriseVocAnalysisResponseBody</p>
     */
    public static class FilterResults extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("hit")
        private Boolean hit;

        @com.aliyun.core.annotation.NameInMap("tagName")
        private String tagName;

        @com.aliyun.core.annotation.NameInMap("tagValue")
        private String tagValue;

        private FilterResults(Builder builder) {
            this.hit = builder.hit;
            this.tagName = builder.tagName;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FilterResults create() {
            return builder().build();
        }

        /**
         * @return hit
         */
        public Boolean getHit() {
            return this.hit;
        }

        /**
         * @return tagName
         */
        public String getTagName() {
            return this.tagName;
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        public static final class Builder {
            private Boolean hit; 
            private String tagName; 
            private String tagValue; 

            private Builder() {
            } 

            private Builder(FilterResults model) {
                this.hit = model.hit;
                this.tagName = model.tagName;
                this.tagValue = model.tagValue;
            } 

            /**
             * hit.
             */
            public Builder hit(Boolean hit) {
                this.hit = hit;
                return this;
            }

            /**
             * tagName.
             */
            public Builder tagName(String tagName) {
                this.tagName = tagName;
                return this;
            }

            /**
             * tagValue.
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public FilterResults build() {
                return new FilterResults(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunEnterpriseVocAnalysisResponseBody} extends {@link TeaModel}
     *
     * <p>RunEnterpriseVocAnalysisResponseBody</p>
     */
    public static class FilterResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("filterResults")
        private java.util.List<FilterResults> filterResults;

        private FilterResult(Builder builder) {
            this.filterResults = builder.filterResults;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FilterResult create() {
            return builder().build();
        }

        /**
         * @return filterResults
         */
        public java.util.List<FilterResults> getFilterResults() {
            return this.filterResults;
        }

        public static final class Builder {
            private java.util.List<FilterResults> filterResults; 

            private Builder() {
            } 

            private Builder(FilterResult model) {
                this.filterResults = model.filterResults;
            } 

            /**
             * filterResults.
             */
            public Builder filterResults(java.util.List<FilterResults> filterResults) {
                this.filterResults = filterResults;
                return this;
            }

            public FilterResult build() {
                return new FilterResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunEnterpriseVocAnalysisResponseBody} extends {@link TeaModel}
     *
     * <p>RunEnterpriseVocAnalysisResponseBody</p>
     */
    public static class Output extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("filterResult")
        private FilterResult filterResult;

        @com.aliyun.core.annotation.NameInMap("text")
        private String text;

        private Output(Builder builder) {
            this.filterResult = builder.filterResult;
            this.text = builder.text;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Output create() {
            return builder().build();
        }

        /**
         * @return filterResult
         */
        public FilterResult getFilterResult() {
            return this.filterResult;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        public static final class Builder {
            private FilterResult filterResult; 
            private String text; 

            private Builder() {
            } 

            private Builder(Output model) {
                this.filterResult = model.filterResult;
                this.text = model.text;
            } 

            /**
             * filterResult.
             */
            public Builder filterResult(FilterResult filterResult) {
                this.filterResult = filterResult;
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
     * {@link RunEnterpriseVocAnalysisResponseBody} extends {@link TeaModel}
     *
     * <p>RunEnterpriseVocAnalysisResponseBody</p>
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
     * {@link RunEnterpriseVocAnalysisResponseBody} extends {@link TeaModel}
     *
     * <p>RunEnterpriseVocAnalysisResponseBody</p>
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
