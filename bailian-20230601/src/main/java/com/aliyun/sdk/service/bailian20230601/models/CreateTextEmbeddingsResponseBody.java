// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20230601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTextEmbeddingsResponseBody} extends {@link TeaModel}
 *
 * <p>CreateTextEmbeddingsResponseBody</p>
 */
public class CreateTextEmbeddingsResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("HttpStatusCode")
    private String httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private CreateTextEmbeddingsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTextEmbeddingsResponseBody create() {
        return builder().build();
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
     * @return httpStatusCode
     */
    public String getHttpStatusCode() {
        return this.httpStatusCode;
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
        private String httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

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
         * HttpStatusCode.
         */
        public Builder httpStatusCode(String httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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

        public CreateTextEmbeddingsResponseBody build() {
            return new CreateTextEmbeddingsResponseBody(this);
        } 

    } 

    public static class Embeddings extends TeaModel {
        @NameInMap("Embedding")
        private java.util.List < Double > embedding;

        @NameInMap("TextIndex")
        private Integer textIndex;

        private Embeddings(Builder builder) {
            this.embedding = builder.embedding;
            this.textIndex = builder.textIndex;
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
        public java.util.List < Double > getEmbedding() {
            return this.embedding;
        }

        /**
         * @return textIndex
         */
        public Integer getTextIndex() {
            return this.textIndex;
        }

        public static final class Builder {
            private java.util.List < Double > embedding; 
            private Integer textIndex; 

            /**
             * Embedding.
             */
            public Builder embedding(java.util.List < Double > embedding) {
                this.embedding = embedding;
                return this;
            }

            /**
             * TextIndex.
             */
            public Builder textIndex(Integer textIndex) {
                this.textIndex = textIndex;
                return this;
            }

            public Embeddings build() {
                return new Embeddings(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("Embeddings")
        private java.util.List < Embeddings> embeddings;

        private Data(Builder builder) {
            this.embeddings = builder.embeddings;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return embeddings
         */
        public java.util.List < Embeddings> getEmbeddings() {
            return this.embeddings;
        }

        public static final class Builder {
            private java.util.List < Embeddings> embeddings; 

            /**
             * Embeddings.
             */
            public Builder embeddings(java.util.List < Embeddings> embeddings) {
                this.embeddings = embeddings;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
