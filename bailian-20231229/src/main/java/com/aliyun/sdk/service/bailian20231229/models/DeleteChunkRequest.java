// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20231229.models;

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
 * {@link DeleteChunkRequest} extends {@link RequestModel}
 *
 * <p>DeleteChunkRequest</p>
 */
public class DeleteChunkRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChunkIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> chunkIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PipelineId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pipelineId;

    private DeleteChunkRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.chunkIds = builder.chunkIds;
        this.pipelineId = builder.pipelineId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteChunkRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return chunkIds
     */
    public java.util.List<String> getChunkIds() {
        return this.chunkIds;
    }

    /**
     * @return pipelineId
     */
    public String getPipelineId() {
        return this.pipelineId;
    }

    public static final class Builder extends Request.Builder<DeleteChunkRequest, Builder> {
        private String workspaceId; 
        private java.util.List<String> chunkIds; 
        private String pipelineId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteChunkRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.chunkIds = request.chunkIds;
            this.pipelineId = request.pipelineId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-3z7uw7fwz0vexxxx</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder chunkIds(java.util.List<String> chunkIds) {
            String chunkIdsShrink = shrink(chunkIds, "ChunkIds", "json");
            this.putQueryParameter("ChunkIds", chunkIdsShrink);
            this.chunkIds = chunkIds;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>79c0alxxxx</p>
         */
        public Builder pipelineId(String pipelineId) {
            this.putQueryParameter("PipelineId", pipelineId);
            this.pipelineId = pipelineId;
            return this;
        }

        @Override
        public DeleteChunkRequest build() {
            return new DeleteChunkRequest(this);
        } 

    } 

}
