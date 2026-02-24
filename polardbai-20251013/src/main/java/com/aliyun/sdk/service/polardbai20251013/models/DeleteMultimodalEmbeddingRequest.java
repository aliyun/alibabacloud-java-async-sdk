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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceRegionId")
    private String sourceRegionId;

    private DeleteMultimodalEmbeddingRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.embedding = builder.embedding;
        this.sourceRegionId = builder.sourceRegionId;
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

    /**
     * @return sourceRegionId
     */
    public String getSourceRegionId() {
        return this.sourceRegionId;
    }

    public static final class Builder extends Request.Builder<DeleteMultimodalEmbeddingRequest, Builder> {
        private String DBClusterId; 
        private String embedding; 
        private String sourceRegionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteMultimodalEmbeddingRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.embedding = request.embedding;
            this.sourceRegionId = request.sourceRegionId;
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

        /**
         * SourceRegionId.
         */
        public Builder sourceRegionId(String sourceRegionId) {
            this.putQueryParameter("SourceRegionId", sourceRegionId);
            this.sourceRegionId = sourceRegionId;
            return this;
        }

        @Override
        public DeleteMultimodalEmbeddingRequest build() {
            return new DeleteMultimodalEmbeddingRequest(this);
        } 

    } 

}
