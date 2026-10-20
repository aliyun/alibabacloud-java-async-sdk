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
 * {@link AddChunkRequest} extends {@link RequestModel}
 *
 * <p>AddChunkRequest</p>
 */
public class AddChunkRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PipelineId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pipelineId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("dataId")
    private String dataId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("field")
    private java.util.Map<String, ?> field;

    private AddChunkRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.pipelineId = builder.pipelineId;
        this.dataId = builder.dataId;
        this.field = builder.field;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddChunkRequest create() {
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
     * @return pipelineId
     */
    public String getPipelineId() {
        return this.pipelineId;
    }

    /**
     * @return dataId
     */
    public String getDataId() {
        return this.dataId;
    }

    /**
     * @return field
     */
    public java.util.Map<String, ?> getField() {
        return this.field;
    }

    public static final class Builder extends Request.Builder<AddChunkRequest, Builder> {
        private String workspaceId; 
        private String pipelineId; 
        private String dataId; 
        private java.util.Map<String, ?> field; 

        private Builder() {
            super();
        } 

        private Builder(AddChunkRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.pipelineId = request.pipelineId;
            this.dataId = request.dataId;
            this.field = request.field;
        } 

        /**
         * <p>The workspace ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-19hxxxxx7htdf9lh</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>The knowledge base ID.</p>
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
         * <p>The file ID.</p>
         * 
         * <strong>example:</strong>
         * <p>doc_xxx</p>
         */
        public Builder dataId(String dataId) {
            this.putQueryParameter("dataId", dataId);
            this.dataId = dataId;
            return this;
        }

        /**
         * <p>The chunk content to insert, passed as key-value pairs. For document search knowledge bases, use the following fixed key list:</p>
         * <ul>
         * <li>content (<strong>String</strong>): <strong>Required</strong>. The body content of the chunk.</li>
         * <li>title (<strong>String</strong>): <strong>Optional</strong>. The title of the chunk.</li>
         * <li>image_urls (<strong>Array</strong>): <strong>Optional</strong>. Image URLs included in the chunk. A maximum of 10 images are supported.</li>
         * </ul>
         * <p>For data query and image Q&amp;A knowledge bases, the keys are not fixed and are determined by the data source spreadsheet of the knowledge base. The key is the Excel column header, and the value is the corresponding column value.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;content&quot;: &quot;The Bailian platform supports parsing multiple document formats including PDF, Word, and PPT.&quot;,
         *   &quot;title&quot;: &quot;Document Parsing and Chunking&quot;,
         *   &quot;image_urls&quot;: [
         * &quot;<a href="https://example.com/images/chunk-flow.png">https://example.com/images/chunk-flow.png</a>&quot;,
         *   &quot;<a href="https://example.com/images/parsing-result.png">https://example.com/images/parsing-result.png</a>&quot;
         *   ]
         * }</p>
         */
        public Builder field(java.util.Map<String, ?> field) {
            String fieldShrink = shrink(field, "field", "json");
            this.putQueryParameter("field", fieldShrink);
            this.field = field;
            return this;
        }

        @Override
        public AddChunkRequest build() {
            return new AddChunkRequest(this);
        } 

    } 

}
