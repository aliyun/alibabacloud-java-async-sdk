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
 * {@link GetAgentDataSemanticsResponseBody} extends {@link TeaModel}
 *
 * <p>GetAgentDataSemanticsResponseBody</p>
 */
public class GetAgentDataSemanticsResponseBody extends TeaModel {
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

    private GetAgentDataSemanticsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAgentDataSemanticsResponseBody create() {
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

        private Builder(GetAgentDataSemanticsResponseBody model) {
            this.code = model.code;
            this.data = model.data;
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
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
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

        public GetAgentDataSemanticsResponseBody build() {
            return new GetAgentDataSemanticsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAgentDataSemanticsResponseBody} extends {@link TeaModel}
     *
     * <p>GetAgentDataSemanticsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Examples")
        private java.util.List<AgentDataSemanticsExample> examples;

        @com.aliyun.core.annotation.NameInMap("Joins")
        private java.util.List<AgentDataSemanticsJoin> joins;

        @com.aliyun.core.annotation.NameInMap("Metrics")
        private java.util.List<AgentDataSemanticsMetric> metrics;

        @com.aliyun.core.annotation.NameInMap("Text")
        private AgentDataSemanticsText text;

        @com.aliyun.core.annotation.NameInMap("VersionNo")
        private Long versionNo;

        private Data(Builder builder) {
            this.examples = builder.examples;
            this.joins = builder.joins;
            this.metrics = builder.metrics;
            this.text = builder.text;
            this.versionNo = builder.versionNo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
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
         * @return text
         */
        public AgentDataSemanticsText getText() {
            return this.text;
        }

        /**
         * @return versionNo
         */
        public Long getVersionNo() {
            return this.versionNo;
        }

        public static final class Builder {
            private java.util.List<AgentDataSemanticsExample> examples; 
            private java.util.List<AgentDataSemanticsJoin> joins; 
            private java.util.List<AgentDataSemanticsMetric> metrics; 
            private AgentDataSemanticsText text; 
            private Long versionNo; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.examples = model.examples;
                this.joins = model.joins;
                this.metrics = model.metrics;
                this.text = model.text;
                this.versionNo = model.versionNo;
            } 

            /**
             * Examples.
             */
            public Builder examples(java.util.List<AgentDataSemanticsExample> examples) {
                this.examples = examples;
                return this;
            }

            /**
             * Joins.
             */
            public Builder joins(java.util.List<AgentDataSemanticsJoin> joins) {
                this.joins = joins;
                return this;
            }

            /**
             * Metrics.
             */
            public Builder metrics(java.util.List<AgentDataSemanticsMetric> metrics) {
                this.metrics = metrics;
                return this;
            }

            /**
             * Text.
             */
            public Builder text(AgentDataSemanticsText text) {
                this.text = text;
                return this;
            }

            /**
             * VersionNo.
             */
            public Builder versionNo(Long versionNo) {
                this.versionNo = versionNo;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
