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
 * {@link GetMultiModalEmbeddingResponseBody} extends {@link TeaModel}
 *
 * <p>GetMultiModalEmbeddingResponseBody</p>
 */
public class GetMultiModalEmbeddingResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("latency")
    private Integer latency;

    @com.aliyun.core.annotation.NameInMap("request_id")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private Result result;

    @com.aliyun.core.annotation.NameInMap("usage")
    private Usage usage;

    private GetMultiModalEmbeddingResponseBody(Builder builder) {
        this.latency = builder.latency;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.usage = builder.usage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMultiModalEmbeddingResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetMultiModalEmbeddingResponseBody model) {
            this.latency = model.latency;
            this.requestId = model.requestId;
            this.result = model.result;
            this.usage = model.usage;
        } 

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

        public GetMultiModalEmbeddingResponseBody build() {
            return new GetMultiModalEmbeddingResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetMultiModalEmbeddingResponseBody} extends {@link TeaModel}
     *
     * <p>GetMultiModalEmbeddingResponseBody</p>
     */
    public static class Embeddings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("embedding")
        private java.util.List<Double> embedding;

        @com.aliyun.core.annotation.NameInMap("index")
        private Long index;

        private Embeddings(Builder builder) {
            this.embedding = builder.embedding;
            this.index = builder.index;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Embeddings create() {
            return builder().build();
        }

        /**
         * @return embedding
         */
        public java.util.List<Double> getEmbedding() {
            return this.embedding;
        }

        /**
         * @return index
         */
        public Long getIndex() {
            return this.index;
        }

        public static final class Builder {
            private java.util.List<Double> embedding; 
            private Long index; 

            private Builder() {
            } 

            private Builder(Embeddings model) {
                this.embedding = model.embedding;
                this.index = model.index;
            } 

            /**
             * embedding.
             */
            public Builder embedding(java.util.List<Double> embedding) {
                this.embedding = embedding;
                return this;
            }

            /**
             * index.
             */
            public Builder index(Long index) {
                this.index = index;
                return this;
            }

            public Embeddings build() {
                return new Embeddings(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetMultiModalEmbeddingResponseBody} extends {@link TeaModel}
     *
     * <p>GetMultiModalEmbeddingResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("embeddings")
        private java.util.List<Embeddings> embeddings;

        private Result(Builder builder) {
            this.embeddings = builder.embeddings;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return embeddings
         */
        public java.util.List<Embeddings> getEmbeddings() {
            return this.embeddings;
        }

        public static final class Builder {
            private java.util.List<Embeddings> embeddings; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.embeddings = model.embeddings;
            } 

            /**
             * embeddings.
             */
            public Builder embeddings(java.util.List<Embeddings> embeddings) {
                this.embeddings = embeddings;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetMultiModalEmbeddingResponseBody} extends {@link TeaModel}
     *
     * <p>GetMultiModalEmbeddingResponseBody</p>
     */
    public static class Usage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("image")
        private Long image;

        @com.aliyun.core.annotation.NameInMap("token_count")
        private Long tokenCount;

        private Usage(Builder builder) {
            this.image = builder.image;
            this.tokenCount = builder.tokenCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Usage create() {
            return builder().build();
        }

        /**
         * @return image
         */
        public Long getImage() {
            return this.image;
        }

        /**
         * @return tokenCount
         */
        public Long getTokenCount() {
            return this.tokenCount;
        }

        public static final class Builder {
            private Long image; 
            private Long tokenCount; 

            private Builder() {
            } 

            private Builder(Usage model) {
                this.image = model.image;
                this.tokenCount = model.tokenCount;
            } 

            /**
             * image.
             */
            public Builder image(Long image) {
                this.image = image;
                return this;
            }

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
