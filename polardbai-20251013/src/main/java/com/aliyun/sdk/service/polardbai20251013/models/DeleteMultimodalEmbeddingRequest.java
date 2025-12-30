// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbai20251013.models;

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
 * {@link DeleteMultimodalEmbeddingRequest} extends {@link RequestModel}
 *
 * <p>DeleteMultimodalEmbeddingRequest</p>
 */
public class DeleteMultimodalEmbeddingRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Embedding")
    @com.aliyun.core.annotation.Validation(required = true)
    private String embedding;

    private DeleteMultimodalEmbeddingRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.embedding = builder.embedding;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteMultimodalEmbeddingRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return embedding
     */
    public String getEmbedding() {
        return this.embedding;
    }

    public static final class Builder extends Request.Builder<DeleteMultimodalEmbeddingRequest, Builder> {
        private String DBClusterId; 
        private String embedding; 

        private Builder() {
            super();
        } 

        private Builder(DeleteMultimodalEmbeddingRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.embedding = request.embedding;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-2ze454l20me07****</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>polar4ai_multimodal_embedding_****</p>
         */
        public Builder embedding(String embedding) {
            this.putQueryParameter("Embedding", embedding);
            this.embedding = embedding;
            return this;
        }

        @Override
        public DeleteMultimodalEmbeddingRequest build() {
            return new DeleteMultimodalEmbeddingRequest(this);
        } 

    } 

}
