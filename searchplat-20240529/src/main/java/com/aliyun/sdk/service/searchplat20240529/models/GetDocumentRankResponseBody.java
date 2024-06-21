// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchplat20240529.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDocumentRankResponseBody} extends {@link TeaModel}
 *
 * <p>GetDocumentRankResponseBody</p>
 */
public class GetDocumentRankResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("latency")
    private Integer latency;

    @com.aliyun.core.annotation.NameInMap("request_id")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private Result result;

    @com.aliyun.core.annotation.NameInMap("usage")
    private Usage usage;

    private GetDocumentRankResponseBody(Builder builder) {
        this.latency = builder.latency;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.usage = builder.usage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDocumentRankResponseBody create() {
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

        public GetDocumentRankResponseBody build() {
            return new GetDocumentRankResponseBody(this);
        } 

    } 

    public static class Scores extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("index")
        private Integer index;

        @com.aliyun.core.annotation.NameInMap("score")
        private Double score;

        private Scores(Builder builder) {
            this.index = builder.index;
            this.score = builder.score;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Scores create() {
            return builder().build();
        }

        /**
         * @return index
         */
        public Integer getIndex() {
            return this.index;
        }

        /**
         * @return score
         */
        public Double getScore() {
            return this.score;
        }

        public static final class Builder {
            private Integer index; 
            private Double score; 

            /**
             * index.
             */
            public Builder index(Integer index) {
                this.index = index;
                return this;
            }

            /**
             * score.
             */
            public Builder score(Double score) {
                this.score = score;
                return this;
            }

            public Scores build() {
                return new Scores(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("scores")
        private java.util.List < Scores> scores;

        private Result(Builder builder) {
            this.scores = builder.scores;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return scores
         */
        public java.util.List < Scores> getScores() {
            return this.scores;
        }

        public static final class Builder {
            private java.util.List < Scores> scores; 

            /**
             * scores.
             */
            public Builder scores(java.util.List < Scores> scores) {
                this.scores = scores;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
    public static class Usage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("doc_count")
        private Long docCount;

        private Usage(Builder builder) {
            this.docCount = builder.docCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Usage create() {
            return builder().build();
        }

        /**
         * @return docCount
         */
        public Long getDocCount() {
            return this.docCount;
        }

        public static final class Builder {
            private Long docCount; 

            /**
             * doc_count.
             */
            public Builder docCount(Long docCount) {
                this.docCount = docCount;
                return this;
            }

            public Usage build() {
                return new Usage(this);
            } 

        } 

    }
}
