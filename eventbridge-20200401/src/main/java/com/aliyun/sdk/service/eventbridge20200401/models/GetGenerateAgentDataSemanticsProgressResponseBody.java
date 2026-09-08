// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import com.aliyun.sdk.gateway.eventbridge.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * 
 * {@link GetGenerateAgentDataSemanticsProgressResponseBody} extends {@link TeaModel}
 *
 * <p>GetGenerateAgentDataSemanticsProgressResponseBody</p>
 */
public class GetGenerateAgentDataSemanticsProgressResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetGenerateAgentDataSemanticsProgressResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetGenerateAgentDataSemanticsProgressResponseBody create() {
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
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetGenerateAgentDataSemanticsProgressResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The response code of the operation.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The generation progress details. When the initial generation is complete, a full snapshot of the current generation round is returned. When regeneration is complete, the current Metrics, Joins, Examples, and new Text are returned. To discard a regeneration, first call Get to retrieve the current official version, and then call Save with the four types of content unchanged to idempotently clean up temporary results.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The response message. If the request fails, an error message is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>Data semantics generation task not found.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The unique identifier that Alibaba Cloud generates for the request.</p>
         * 
         * <strong>example:</strong>
         * <p>5DAF96FB-A4DF-548C-B8A1-F2A8D2F4****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetGenerateAgentDataSemanticsProgressResponseBody build() {
            return new GetGenerateAgentDataSemanticsProgressResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetGenerateAgentDataSemanticsProgressResponseBody} extends {@link TeaModel}
     *
     * <p>GetGenerateAgentDataSemanticsProgressResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("Examples")
        private java.util.List<AgentDataSemanticsExample> examples;

        @com.aliyun.core.annotation.NameInMap("Joins")
        private java.util.List<AgentDataSemanticsJoin> joins;

        @com.aliyun.core.annotation.NameInMap("Metrics")
        private java.util.List<AgentDataSemanticsMetric> metrics;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private java.util.List<AgentDataSemanticsStageProgress> progress;

        @com.aliyun.core.annotation.NameInMap("Stage")
        private String stage;

        @com.aliyun.core.annotation.NameInMap("Text")
        private AgentDataSemanticsText text;

        private Data(Builder builder) {
            this.errorCode = builder.errorCode;
            this.errorMessage = builder.errorMessage;
            this.examples = builder.examples;
            this.joins = builder.joins;
            this.metrics = builder.metrics;
            this.progress = builder.progress;
            this.stage = builder.stage;
            this.text = builder.text;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
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
         * @return examples
         */
        public java.util.List<AgentDataSemanticsExample> getExamples() {
            return this.examples;
        }

        /**
         * @return joins
         */
        public java.util.List<AgentDataSemanticsJoin> getJoins() {
            return this.joins;
        }

        /**
         * @return metrics
         */
        public java.util.List<AgentDataSemanticsMetric> getMetrics() {
            return this.metrics;
        }

        /**
         * @return progress
         */
        public java.util.List<AgentDataSemanticsStageProgress> getProgress() {
            return this.progress;
        }

        /**
         * @return stage
         */
        public String getStage() {
            return this.stage;
        }

        /**
         * @return text
         */
        public AgentDataSemanticsText getText() {
            return this.text;
        }

        public static final class Builder {
            private String errorCode; 
            private String errorMessage; 
            private java.util.List<AgentDataSemanticsExample> examples; 
            private java.util.List<AgentDataSemanticsJoin> joins; 
            private java.util.List<AgentDataSemanticsMetric> metrics; 
            private java.util.List<AgentDataSemanticsStageProgress> progress; 
            private String stage; 
            private AgentDataSemanticsText text; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.errorCode = model.errorCode;
                this.errorMessage = model.errorMessage;
                this.examples = model.examples;
                this.joins = model.joins;
                this.metrics = model.metrics;
                this.progress = model.progress;
                this.stage = model.stage;
                this.text = model.text;
            } 

            /**
             * <p>The error code returned when the generation task fails.</p>
             * 
             * <strong>example:</strong>
             * <p>DataSemanticsGenerateFailed</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>The error message returned when the generation task fails.</p>
             * 
             * <strong>example:</strong>
             * <p>Failed to generate data semantics. Please retry later.</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The SQL example knowledge returned when the generation is complete. A maximum of 50 items can be returned.</p>
             */
            public Builder examples(java.util.List<AgentDataSemanticsExample> examples) {
                this.examples = examples;
                return this;
            }

            /**
             * <p>The data association knowledge returned when the generation is complete. A maximum of 100 items can be returned.</p>
             */
            public Builder joins(java.util.List<AgentDataSemanticsJoin> joins) {
                this.joins = joins;
                return this;
            }

            /**
             * <p>The SQL expression knowledge returned when the generation is complete. A maximum of 100 items can be returned.</p>
             */
            public Builder metrics(java.util.List<AgentDataSemanticsMetric> metrics) {
                this.metrics = metrics;
                return this;
            }

            /**
             * <p>The four-phase stage progress. This parameter may not be returned when the overall generation is complete.</p>
             */
            public Builder progress(java.util.List<AgentDataSemanticsStageProgress> progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The current overall stage.</p>
             * 
             * <strong>example:</strong>
             * <p>GENERATE</p>
             */
            public Builder stage(String stage) {
                this.stage = stage;
                return this;
            }

            /**
             * <p>The Markdown text knowledge returned when the generation is complete.</p>
             */
            public Builder text(AgentDataSemanticsText text) {
                this.text = text;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
