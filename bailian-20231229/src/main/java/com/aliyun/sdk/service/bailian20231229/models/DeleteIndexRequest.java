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
 * {@link DeleteIndexRequest} extends {@link RequestModel}
 *
 * <p>DeleteIndexRequest</p>
 */
public class DeleteIndexRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IndexId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String indexId;

    private DeleteIndexRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.indexId = builder.indexId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteIndexRequest create() {
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
     * @return indexId
     */
    public String getIndexId() {
        return this.indexId;
    }

    public static final class Builder extends Request.Builder<DeleteIndexRequest, Builder> {
        private String workspaceId; 
        private String indexId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteIndexRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.indexId = request.indexId;
        } 

        /**
         * <p>The workspace ID of the knowledge base. For information about how to obtain the workspace ID, see <a href="https://help.aliyun.com/document_detail/2587495.html">How to use a workspace</a>.</p>
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
         * <p>The knowledge base ID, which is the <code>Data.Id</code> returned by the <strong>CreateIndex</strong> operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>f89ie0xxxx</p>
         */
        public Builder indexId(String indexId) {
            this.putQueryParameter("IndexId", indexId);
            this.indexId = indexId;
            return this;
        }

        @Override
        public DeleteIndexRequest build() {
            return new DeleteIndexRequest(this);
        } 

    } 

}
