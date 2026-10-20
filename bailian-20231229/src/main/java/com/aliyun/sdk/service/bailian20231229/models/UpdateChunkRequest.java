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
         * <p>The ID of the workspace to which the knowledge base belongs. For information about how to obtain the workspace ID, see <a href="https://help.aliyun.com/document_detail/2587495.html">How to use a workspace</a>.</p>
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
         * <p>The ID of the text chunk to modify. You can obtain this value by calling the <strong>ListChunks</strong> operation. The value is in the Node.Metadata._id field of the response.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-5ip55o1zrzxx_09fe52x_xxxxx_033b551e10024029992e79767b151fxx_10024xx_0</p>
         */
        public Builder chunkId(String chunkId) {
            this.putQueryParameter("ChunkId", chunkId);
            this.chunkId = chunkId;
            return this;
        }

        /**
         * <p>The file ID, which is the <code>FileId</code> returned by the <strong>AddFile</strong> operation. You can also obtain it from the &lt;props=&quot;china&quot;&gt;<a href="https://bailian.console.aliyun.com/?tab=app#/data-center">application data</a>-Files&lt;props=&quot;intl&quot;&gt;<a href="https://modelstudio.console.alibabacloud.com/?tab=app#/data-center">application data</a>-Files tab in the Alibaba Cloud Model Studio console by clicking the ID icon next to the corresponding file.</p>
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
         * <p>Specifies whether the text chunk participates in knowledge base retrieval. Valid values:</p>
         * <ul>
         * <li>true: Participates.</li>
         * <li>false: Does not participate.</li>
         * </ul>
         * <p>Default value: true.</p>
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
         * <p>The knowledge base ID, which is the <code>Data.Id</code> returned when you call the <strong>CreateIndex</strong> operation, or retrieved from the &lt;props=&quot;china&quot;&gt;<a href="https://bailian.console.aliyun.com/?tab=app#/knowledge-base">knowledge base</a>&lt;props=&quot;intl&quot;&gt;<a href="https://modelstudio.console.alibabacloud.com/?tab=app#/knowledge-base">knowledge base</a> page.</p>
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
         * <p>The new content of the text chunk. The content length must be between 10 and 6,000 characters, and must not exceed the maximum segment length set when the knowledge base was created.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>The type of certainty obtained in philosophy is not scientific certainty (that is, certainty that is the same for every rational mind), but a kind of personal conviction that can only be obtained in the overall nature of humanity. Every form of philosophy differs from science in that no philosophy has received universal acceptance..</p>
         */
        public Builder content(String content) {
            this.putQueryParameter("content", content);
            this.content = content;
            return this;
        }

        /**
         * <p>The new title of the text chunk. The length limit is 0–50 characters. An empty string is allowed. If you pass an empty string, the existing title is cleared. If you do not pass this parameter, the original title is retained.</p>
         * 
         * <strong>example:</strong>
         * <p>What is philosophy</p>
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
