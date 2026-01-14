// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pailangstudio20240710.models;

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
 * {@link UpdateKnowledgeBaseChunkRequest} extends {@link RequestModel}
 *
 * <p>UpdateKnowledgeBaseChunkRequest</p>
 */
public class UpdateKnowledgeBaseChunkRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("KnowledgeBaseId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String knowledgeBaseId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("KnowledgeBaseChunkId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String knowledgeBaseChunkId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ChunkContent")
    private String chunkContent;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ChunkStatus")
    private String chunkStatus;

    private UpdateKnowledgeBaseChunkRequest(Builder builder) {
        super(builder);
        this.knowledgeBaseId = builder.knowledgeBaseId;
        this.knowledgeBaseChunkId = builder.knowledgeBaseChunkId;
        this.chunkContent = builder.chunkContent;
        this.chunkStatus = builder.chunkStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateKnowledgeBaseChunkRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return knowledgeBaseId
     */
    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    /**
     * @return knowledgeBaseChunkId
     */
    public String getKnowledgeBaseChunkId() {
        return this.knowledgeBaseChunkId;
    }

    /**
     * @return chunkContent
     */
    public String getChunkContent() {
        return this.chunkContent;
    }

    /**
     * @return chunkStatus
     */
    public String getChunkStatus() {
        return this.chunkStatus;
    }

    public static final class Builder extends Request.Builder<UpdateKnowledgeBaseChunkRequest, Builder> {
        private String knowledgeBaseId; 
        private String knowledgeBaseChunkId; 
        private String chunkContent; 
        private String chunkStatus; 

        private Builder() {
            super();
        } 

        private Builder(UpdateKnowledgeBaseChunkRequest request) {
            super(request);
            this.knowledgeBaseId = request.knowledgeBaseId;
            this.knowledgeBaseChunkId = request.knowledgeBaseChunkId;
            this.chunkContent = request.chunkContent;
            this.chunkStatus = request.chunkStatus;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>d-ab****89</p>
         */
        public Builder knowledgeBaseId(String knowledgeBaseId) {
            this.putPathParameter("KnowledgeBaseId", knowledgeBaseId);
            this.knowledgeBaseId = knowledgeBaseId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-426655440000</p>
         */
        public Builder knowledgeBaseChunkId(String knowledgeBaseChunkId) {
            this.putPathParameter("KnowledgeBaseChunkId", knowledgeBaseChunkId);
            this.knowledgeBaseChunkId = knowledgeBaseChunkId;
            return this;
        }

        /**
         * ChunkContent.
         */
        public Builder chunkContent(String chunkContent) {
            this.putBodyParameter("ChunkContent", chunkContent);
            this.chunkContent = chunkContent;
            return this;
        }

        /**
         * ChunkStatus.
         */
        public Builder chunkStatus(String chunkStatus) {
            this.putBodyParameter("ChunkStatus", chunkStatus);
            this.chunkStatus = chunkStatus;
            return this;
        }

        @Override
        public UpdateKnowledgeBaseChunkRequest build() {
            return new UpdateKnowledgeBaseChunkRequest(this);
        } 

    } 

}
