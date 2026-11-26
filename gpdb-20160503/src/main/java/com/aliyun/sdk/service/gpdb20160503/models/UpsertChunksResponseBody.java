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

    @com.aliyun.core.annotation.NameInMap("JobId")
    private String jobId;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private UpsertChunksResponseBody(Builder builder) {
        this.embeddingTokens = builder.embeddingTokens;
        this.jobId = builder.jobId;
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return embeddingTokens
     */
    public String getEmbeddingTokens() {
        return this.embeddingTokens;
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
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
        private String jobId; 
        private String message; 
        private String requestId; 
        private String status; 

        private Builder() {
        } 

        private Builder(UpsertChunksResponseBody model) {
            this.embeddingTokens = model.embeddingTokens;
            this.jobId = model.jobId;
            this.message = model.message;
            this.requestId = model.requestId;
            this.status = model.status;
        } 

        /**
         * <p>The number of tokens used for vectorization.</p>
         * <blockquote>
         * <p>A token is the smallest unit into which input text is divided. A token can be a word, a phrase, a punctuation mark, or a character.</p>
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
         * <p>The job ID. You can use this ID to call the GetGraphRAGJob operation to query the job status later.</p>
         * <blockquote>
         * <p>This parameter is returned only when knowledge graph construction is enabled for the knowledge base.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>231460f8-75dc-405e-a669-0c5204887e91</p>
         */
        public Builder jobId(String jobId) {
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>Successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ABB39CC3-4488-4857-905D-2E4A051D0521</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The execution status of the API operation. Valid values:</p>
         * <ul>
         * <li><strong>success</strong>: The operation is successful.</li>
         * <li><strong>fail</strong>: The operation fails.</li>
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
