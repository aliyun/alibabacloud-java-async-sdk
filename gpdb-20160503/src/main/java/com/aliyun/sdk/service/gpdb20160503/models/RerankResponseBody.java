// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RerankResponseBody} extends {@link TeaModel}
 *
 * <p>RerankResponseBody</p>
 */
public class RerankResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Results")
    private Results results;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("Tokens")
    private Integer tokens;

    private RerankResponseBody(Builder builder) {
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.results = builder.results;
        this.status = builder.status;
        this.tokens = builder.tokens;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RerankResponseBody create() {
        return builder().build();
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
     * @return results
     */
    public Results getResults() {
        return this.results;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return tokens
     */
    public Integer getTokens() {
        return this.tokens;
    }

    public static final class Builder {
        private String message; 
        private String requestId; 
        private Results results; 
        private String status; 
        private Integer tokens; 

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
         * Results.
         */
        public Builder results(Results results) {
            this.results = results;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * Tokens.
         */
        public Builder tokens(Integer tokens) {
            this.tokens = tokens;
            return this;
        }

        public RerankResponseBody build() {
            return new RerankResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link RerankResponseBody} extends {@link TeaModel}
     *
     * <p>RerankResponseBody</p>
     */
    public static class ResultsResults extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Document")
        private String document;

        @com.aliyun.core.annotation.NameInMap("Index")
        private Integer index;

        @com.aliyun.core.annotation.NameInMap("RelevanceScore")
        private Float relevanceScore;

        private ResultsResults(Builder builder) {
            this.document = builder.document;
            this.index = builder.index;
            this.relevanceScore = builder.relevanceScore;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultsResults create() {
            return builder().build();
        }

        /**
         * @return document
         */
        public String getDocument() {
            return this.document;
        }

        /**
         * @return index
         */
        public Integer getIndex() {
            return this.index;
        }

        /**
         * @return relevanceScore
         */
        public Float getRelevanceScore() {
            return this.relevanceScore;
        }

        public static final class Builder {
            private String document; 
            private Integer index; 
            private Float relevanceScore; 

            /**
             * Document.
             */
            public Builder document(String document) {
                this.document = document;
                return this;
            }

            /**
             * Index.
             */
            public Builder index(Integer index) {
                this.index = index;
                return this;
            }

            /**
             * RelevanceScore.
             */
            public Builder relevanceScore(Float relevanceScore) {
                this.relevanceScore = relevanceScore;
                return this;
            }

            public ResultsResults build() {
                return new ResultsResults(this);
            } 

        } 

    }
    /**
     * 
     * {@link RerankResponseBody} extends {@link TeaModel}
     *
     * <p>RerankResponseBody</p>
     */
    public static class Results extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Results")
        private java.util.List < ResultsResults> results;

        private Results(Builder builder) {
            this.results = builder.results;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Results create() {
            return builder().build();
        }

        /**
         * @return results
         */
        public java.util.List < ResultsResults> getResults() {
            return this.results;
        }

        public static final class Builder {
            private java.util.List < ResultsResults> results; 

            /**
             * Results.
             */
            public Builder results(java.util.List < ResultsResults> results) {
                this.results = results;
                return this;
            }

            public Results build() {
                return new Results(this);
            } 

        } 

    }
}
