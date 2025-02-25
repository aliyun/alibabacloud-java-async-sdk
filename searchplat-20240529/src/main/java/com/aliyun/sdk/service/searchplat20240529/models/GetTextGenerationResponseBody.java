// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchplat20240529.models;

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
 * {@link GetTextGenerationResponseBody} extends {@link TeaModel}
 *
 * <p>GetTextGenerationResponseBody</p>
 */
public class GetTextGenerationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("latency")
    private Integer latency;

    @com.aliyun.core.annotation.NameInMap("request_id")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private Result result;

    @com.aliyun.core.annotation.NameInMap("usage")
    private Usage usage;

    private GetTextGenerationResponseBody(Builder builder) {
        this.latency = builder.latency;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.usage = builder.usage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTextGenerationResponseBody create() {
        return builder().build();
    }

    /**
     * @return latency
     */
    public Integer getLatency() {
        return this.latency;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    /**
     * @return usage
     */
    public Usage getUsage() {
        return this.usage;
    }

    public static final class Builder {
        private Integer latency; 
        private String requestId; 
        private Result result; 
        private Usage usage; 

        /**
         * latency.
         */
        public Builder latency(Integer latency) {
            this.latency = latency;
            return this;
        }

        /**
         * request_id.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * usage.
         */
        public Builder usage(Usage usage) {
            this.usage = usage;
            return this;
        }

        public GetTextGenerationResponseBody build() {
            return new GetTextGenerationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetTextGenerationResponseBody} extends {@link TeaModel}
     *
     * <p>GetTextGenerationResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("text")
        private String text;

        private Result(Builder builder) {
            this.text = builder.text;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        public static final class Builder {
            private String text; 

            /**
             * text.
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTextGenerationResponseBody} extends {@link TeaModel}
     *
     * <p>GetTextGenerationResponseBody</p>
     */
    public static class Usage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("input_tokens")
        private Long inputTokens;

        @com.aliyun.core.annotation.NameInMap("output_tokens")
        private Long outputTokens;

        @com.aliyun.core.annotation.NameInMap("total_tokens")
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
             * input_tokens.
             */
            public Builder inputTokens(Long inputTokens) {
                this.inputTokens = inputTokens;
                return this;
            }

            /**
             * output_tokens.
             */
            public Builder outputTokens(Long outputTokens) {
                this.outputTokens = outputTokens;
                return this;
            }

            /**
             * total_tokens.
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
}
