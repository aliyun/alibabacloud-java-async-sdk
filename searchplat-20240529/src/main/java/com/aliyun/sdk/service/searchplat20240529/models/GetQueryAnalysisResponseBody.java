// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchplat20240529.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetQueryAnalysisResponseBody} extends {@link TeaModel}
 *
 * <p>GetQueryAnalysisResponseBody</p>
 */
public class GetQueryAnalysisResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("latency")
    private Integer latency;

    @com.aliyun.core.annotation.NameInMap("request_id")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private Result result;

    @com.aliyun.core.annotation.NameInMap("usage")
    private Usage usage;

    private GetQueryAnalysisResponseBody(Builder builder) {
        this.latency = builder.latency;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.usage = builder.usage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetQueryAnalysisResponseBody create() {
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

        public GetQueryAnalysisResponseBody build() {
            return new GetQueryAnalysisResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("intent")
        private String intent;

        @com.aliyun.core.annotation.NameInMap("queries")
        private java.util.List < String > queries;

        @com.aliyun.core.annotation.NameInMap("query")
        private String query;

        @com.aliyun.core.annotation.NameInMap("sql")
        private java.util.Map < String, ? > sql;

        private Result(Builder builder) {
            this.intent = builder.intent;
            this.queries = builder.queries;
            this.query = builder.query;
            this.sql = builder.sql;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return intent
         */
        public String getIntent() {
            return this.intent;
        }

        /**
         * @return queries
         */
        public java.util.List < String > getQueries() {
            return this.queries;
        }

        /**
         * @return query
         */
        public String getQuery() {
            return this.query;
        }

        /**
         * @return sql
         */
        public java.util.Map < String, ? > getSql() {
            return this.sql;
        }

        public static final class Builder {
            private String intent; 
            private java.util.List < String > queries; 
            private String query; 
            private java.util.Map < String, ? > sql; 

            /**
             * intent.
             */
            public Builder intent(String intent) {
                this.intent = intent;
                return this;
            }

            /**
             * queries.
             */
            public Builder queries(java.util.List < String > queries) {
                this.queries = queries;
                return this;
            }

            /**
             * query.
             */
            public Builder query(String query) {
                this.query = query;
                return this;
            }

            /**
             * sql.
             */
            public Builder sql(java.util.Map < String, ? > sql) {
                this.sql = sql;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
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
