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
 * {@link UpdateChunkRequest} extends {@link RequestModel}
 *
 * <p>UpdateChunkRequest</p>
 */
public class UpdateChunkRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChunkId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String chunkId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dataId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsDisplayedChunkContent")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean isDisplayedChunkContent;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PipelineId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pipelineId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("content")
    @com.aliyun.core.annotation.Validation(required = true)
    private String content;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("title")
    private String title;

    private UpdateChunkRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.chunkId = builder.chunkId;
        this.dataId = builder.dataId;
        this.isDisplayedChunkContent = builder.isDisplayedChunkContent;
        this.pipelineId = builder.pipelineId;
        this.content = builder.content;
        this.title = builder.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateChunkRequest create() {
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
     * @return chunkId
     */
    public String getChunkId() {
        return this.chunkId;
    }

    /**
     * @return dataId
     */
    public String getDataId() {
        return this.dataId;
    }

    /**
     * @return isDisplayedChunkContent
     */
    public Boolean getIsDisplayedChunkContent() {
        return this.isDisplayedChunkContent;
    }

    /**
     * @return pipelineId
     */
    public String getPipelineId() {
        return this.pipelineId;
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    public static final class Builder extends Request.Builder<UpdateChunkRequest, Builder> {
        private String workspaceId; 
        private String chunkId; 
        private String dataId; 
        private Boolean isDisplayedChunkContent; 
        private String pipelineId; 
        private String content; 
        private String title; 

        private Builder() {
            super();
        } 

        private Builder(UpdateChunkRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.chunkId = request.chunkId;
            this.dataId = request.dataId;
            this.isDisplayedChunkContent = request.isDisplayedChunkContent;
            this.pipelineId = request.pipelineId;
            this.content = request.content;
            this.title = request.title;
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
         * 
         * <strong>example:</strong>
         * <p>llm-5ip55o1zrzxx_09fe52x_table_033b551e10024029992e79767b151fxx_10024xx_0</p>
         */
        public Builder chunkId(String chunkId) {
            this.putQueryParameter("ChunkId", chunkId);
            this.chunkId = chunkId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>doc_c134aa2073204a5d936d870bf960f56axxxxxxxx</p>
         */
        public Builder dataId(String dataId) {
            this.putQueryParameter("DataId", dataId);
            this.dataId = dataId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isDisplayedChunkContent(Boolean isDisplayedChunkContent) {
            this.putQueryParameter("IsDisplayedChunkContent", isDisplayedChunkContent);
            this.isDisplayedChunkContent = isDisplayedChunkContent;
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

        /**
         * <p>This parameter is required.</p>
         */
        public Builder content(String content) {
            this.putQueryParameter("content", content);
            this.content = content;
            return this;
        }

        /**
         * title.
         */
        public Builder title(String title) {
            this.putQueryParameter("title", title);
            this.title = title;
            return this;
        }

        @Override
        public UpdateChunkRequest build() {
            return new UpdateChunkRequest(this);
        } 

    } 

}
