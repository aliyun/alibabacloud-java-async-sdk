// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpsertChunksResponseBody} extends {@link TeaModel}
 *
 * <p>UpsertChunksResponseBody</p>
 */
public class UpsertChunksResponseBody extends TeaModel {
    @NameInMap("EmbeddingTokens")
    private String embeddingTokens;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Status")
    private String status;

    private UpsertChunksResponseBody(Builder builder) {
        this.embeddingTokens = builder.embeddingTokens;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpsertChunksResponseBody create() {
        return builder().build();
    }

    /**
     * @return embeddingTokens
     */
    public String getEmbeddingTokens() {
        return this.embeddingTokens;
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
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String embeddingTokens; 
        private String message; 
        private String requestId; 
        private String status; 

        /**
         * EmbeddingTokens.
         */
        public Builder embeddingTokens(String embeddingTokens) {
            this.embeddingTokens = embeddingTokens;
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
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public UpsertChunksResponseBody build() {
            return new UpsertChunksResponseBody(this);
        } 

    } 

}
