// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchplat20240529.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetTextSparseEmbeddingResponseBody} extends {@link TeaModel}
 *
 * <p>GetTextSparseEmbeddingResponseBody</p>
 */
public class GetTextSparseEmbeddingResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("latency")
    private Integer latency;

    @com.aliyun.core.annotation.NameInMap("request_id")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private Result result;

    @com.aliyun.core.annotation.NameInMap("usage")
    private Usage usage;

    private GetTextSparseEmbeddingResponseBody(Builder builder) {
        this.latency = builder.latency;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.usage = builder.usage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTextSparseEmbeddingResponseBody create() {
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

        public GetTextSparseEmbeddingResponseBody build() {
            return new GetTextSparseEmbeddingResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetTextSparseEmbeddingResponseBody} extends {@link TeaModel}
     *
     * <p>GetTextSparseEmbeddingResponseBody</p>
     */
    public static class Embedding extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("token")
        private String token;

        @com.aliyun.core.annotation.NameInMap("token_id")
        private Integer tokenId;

        @com.aliyun.core.annotation.NameInMap("weight")
        private Float weight;

        private Embedding(Builder builder) {
            this.token = builder.token;
            this.tokenId = builder.tokenId;
            this.weight = builder.weight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Embedding create() {
            return builder().build();
        }

        /**
         * @return token
         */
        public String getToken() {
            return this.token;
        }

        /**
         * @return tokenId
         */
        public Integer getTokenId() {
            return this.tokenId;
        }

        /**
         * @return weight
         */
        public Float getWeight() {
            return this.weight;
        }

        public static final class Builder {
            private String token; 
            private Integer tokenId; 
            private Float weight; 

            /**
             * token.
             */
            public Builder token(String token) {
                this.token = token;
                return this;
            }

            /**
             * token_id.
             */
            public Builder tokenId(Integer tokenId) {
                this.tokenId = tokenId;
                return this;
            }

            /**
             * weight.
             */
            public Builder weight(Float weight) {
                this.weight = weight;
                return this;
            }

            public Embedding build() {
                return new Embedding(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTextSparseEmbeddingResponseBody} extends {@link TeaModel}
     *
     * <p>GetTextSparseEmbeddingResponseBody</p>
     */
    public static class SparseEmbeddings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("embedding")
        private java.util.List < Embedding> embedding;

        @com.aliyun.core.annotation.NameInMap("index")
        private Integer index;

        private SparseEmbeddings(Builder builder) {
            this.embedding = builder.embedding;
            this.index = builder.index;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SparseEmbeddings create() {
            return builder().build();
        }

        /**
         * @return embedding
         */
        public java.util.List < Embedding> getEmbedding() {
            return this.embedding;
        }

        /**
         * @return index
         */
        public Integer getIndex() {
            return this.index;
        }

        public static final class Builder {
            private java.util.List < Embedding> embedding; 
            private Integer index; 

            /**
             * embedding.
             */
            public Builder embedding(java.util.List < Embedding> embedding) {
                this.embedding = embedding;
                return this;
            }

            /**
             * index.
             */
            public Builder index(Integer index) {
                this.index = index;
                return this;
            }

            public SparseEmbeddings build() {
                return new SparseEmbeddings(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTextSparseEmbeddingResponseBody} extends {@link TeaModel}
     *
     * <p>GetTextSparseEmbeddingResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("sparse_embeddings")
        private java.util.List < SparseEmbeddings> sparseEmbeddings;

        private Result(Builder builder) {
            this.sparseEmbeddings = builder.sparseEmbeddings;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return sparseEmbeddings
         */
        public java.util.List < SparseEmbeddings> getSparseEmbeddings() {
            return this.sparseEmbeddings;
        }

        public static final class Builder {
            private java.util.List < SparseEmbeddings> sparseEmbeddings; 

            /**
             * sparse_embeddings.
             */
            public Builder sparseEmbeddings(java.util.List < SparseEmbeddings> sparseEmbeddings) {
                this.sparseEmbeddings = sparseEmbeddings;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTextSparseEmbeddingResponseBody} extends {@link TeaModel}
     *
     * <p>GetTextSparseEmbeddingResponseBody</p>
     */
    public static class Usage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("token_count")
        private Long tokenCount;

        private Usage(Builder builder) {
            this.tokenCount = builder.tokenCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Usage create() {
            return builder().build();
        }

        /**
         * @return tokenCount
         */
        public Long getTokenCount() {
            return this.tokenCount;
        }

        public static final class Builder {
            private Long tokenCount; 

            /**
             * token_count.
             */
            public Builder tokenCount(Long tokenCount) {
                this.tokenCount = tokenCount;
                return this;
            }

            public Usage build() {
                return new Usage(this);
            } 

        } 

    }
}
