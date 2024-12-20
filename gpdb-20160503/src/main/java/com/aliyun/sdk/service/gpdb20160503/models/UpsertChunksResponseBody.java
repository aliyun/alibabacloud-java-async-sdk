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
 * {@link UpsertChunksResponseBody} extends {@link TeaModel}
 *
 * <p>UpsertChunksResponseBody</p>
 */
public class UpsertChunksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EmbeddingTokens")
    private String embeddingTokens;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
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
         * <p>Number of tokens used during vectorization.</p>
         * <blockquote>
         * <p>A token refers to the smallest unit into which the input text is divided. A token can be a word, a phrase, a punctuation mark, a character, etc.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder embeddingTokens(String embeddingTokens) {
            this.embeddingTokens = embeddingTokens;
            return this;
        }

        /**
         * <p>Return message.</p>
         * 
         * <strong>example:</strong>
         * <p>Successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ABB39CC3-4488-4857-905D-2E4A051D0521</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>API execution status, with the following values:</p>
         * <ul>
         * <li><strong>success</strong>: Execution succeeded.</li>
         * <li><strong>fail</strong>: Execution failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>success</p>
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
