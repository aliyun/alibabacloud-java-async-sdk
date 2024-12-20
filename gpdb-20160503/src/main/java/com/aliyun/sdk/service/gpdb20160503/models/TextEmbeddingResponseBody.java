// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
 * {@link TextEmbeddingResponseBody} extends {@link TeaModel}
 *
 * <p>TextEmbeddingResponseBody</p>
 */
public class TextEmbeddingResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Results")
    private Results results;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("TextTokens")
    private Integer textTokens;

    private TextEmbeddingResponseBody(Builder builder) {
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.results = builder.results;
        this.status = builder.status;
        this.textTokens = builder.textTokens;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TextEmbeddingResponseBody create() {
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
     * @return textTokens
     */
    public Integer getTextTokens() {
        return this.textTokens;
    }

    public static final class Builder {
        private String message; 
        private String requestId; 
        private Results results; 
        private String status; 
        private Integer textTokens; 

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
         * TextTokens.
         */
        public Builder textTokens(Integer textTokens) {
            this.textTokens = textTokens;
            return this;
        }

        public TextEmbeddingResponseBody build() {
            return new TextEmbeddingResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link TextEmbeddingResponseBody} extends {@link TeaModel}
     *
     * <p>TextEmbeddingResponseBody</p>
     */
    public static class Embedding extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Embedding")
        private java.util.List<Double> embedding;

        private Embedding(Builder builder) {
            this.embedding = builder.embedding;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Embedding create() {
            return builder().build();
        }

        /**
         * @return embedding
         */
        public java.util.List<Double> getEmbedding() {
            return this.embedding;
        }

        public static final class Builder {
            private java.util.List<Double> embedding; 

            /**
             * Embedding.
             */
            public Builder embedding(java.util.List<Double> embedding) {
                this.embedding = embedding;
                return this;
            }

            public Embedding build() {
                return new Embedding(this);
            } 

        } 

    }
    /**
     * 
     * {@link TextEmbeddingResponseBody} extends {@link TeaModel}
     *
     * <p>TextEmbeddingResponseBody</p>
     */
    public static class ResultsResults extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Embedding")
        private Embedding embedding;

        @com.aliyun.core.annotation.NameInMap("Index")
        private Integer index;

        private ResultsResults(Builder builder) {
            this.embedding = builder.embedding;
            this.index = builder.index;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultsResults create() {
            return builder().build();
        }

        /**
         * @return embedding
         */
        public Embedding getEmbedding() {
            return this.embedding;
        }

        /**
         * @return index
         */
        public Integer getIndex() {
            return this.index;
        }

        public static final class Builder {
            private Embedding embedding; 
            private Integer index; 

            /**
             * Embedding.
             */
            public Builder embedding(Embedding embedding) {
                this.embedding = embedding;
                return this;
            }

            /**
             * Index.
             */
            public Builder index(Integer index) {
                this.index = index;
                return this;
            }

            public ResultsResults build() {
                return new ResultsResults(this);
            } 

        } 

    }
    /**
     * 
     * {@link TextEmbeddingResponseBody} extends {@link TeaModel}
     *
     * <p>TextEmbeddingResponseBody</p>
     */
    public static class Results extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Results")
        private java.util.List<ResultsResults> results;

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
        public java.util.List<ResultsResults> getResults() {
            return this.results;
        }

        public static final class Builder {
            private java.util.List<ResultsResults> results; 

            /**
             * Results.
             */
            public Builder results(java.util.List<ResultsResults> results) {
                this.results = results;
                return this;
            }

            public Results build() {
                return new Results(this);
            } 

        } 

    }
}
