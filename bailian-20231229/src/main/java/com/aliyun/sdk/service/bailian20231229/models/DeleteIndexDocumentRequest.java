// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20231229.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteIndexDocumentRequest} extends {@link RequestModel}
 *
 * <p>DeleteIndexDocumentRequest</p>
 */
public class DeleteIndexDocumentRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DocumentIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > documentIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IndexId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String indexId;

    private DeleteIndexDocumentRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.documentIds = builder.documentIds;
        this.indexId = builder.indexId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteIndexDocumentRequest create() {
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
     * @return documentIds
     */
    public java.util.List < String > getDocumentIds() {
        return this.documentIds;
    }

    /**
     * @return indexId
     */
    public String getIndexId() {
        return this.indexId;
    }

    public static final class Builder extends Request.Builder<DeleteIndexDocumentRequest, Builder> {
        private String workspaceId; 
        private java.util.List < String > documentIds; 
        private String indexId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteIndexDocumentRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.documentIds = request.documentIds;
            this.indexId = request.indexId;
        } 

        /**
         * <p>The ID of the workspace to which the knowledge base belongs. To view the workspace ID, you can click the Workspace Details icon in the upper-left corner on the <a href="https://bailian.console.aliyun.com/#/home">homepage</a> of the console.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ws_3Nt27MYcoK191ISp</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>The list of the primary key IDs of the documents.</p>
         * <p>This parameter is required.</p>
         */
        public Builder documentIds(java.util.List < String > documentIds) {
            String documentIdsShrink = shrink(documentIds, "DocumentIds", "json");
            this.putQueryParameter("DocumentIds", documentIdsShrink);
            this.documentIds = documentIds;
            return this;
        }

        /**
         * <p>The primary key ID of the knowledge base, which is the <code>Data.Id</code> parameter returned by the <a href="https://help.aliyun.com/zh/model-studio/developer-reference/api-bailian-2023-12-29-createindex">CreateIndex</a> operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>79c0aly8zw</p>
         */
        public Builder indexId(String indexId) {
            this.putQueryParameter("IndexId", indexId);
            this.indexId = indexId;
            return this;
        }

        @Override
        public DeleteIndexDocumentRequest build() {
            return new DeleteIndexDocumentRequest(this);
        } 

    } 

}
