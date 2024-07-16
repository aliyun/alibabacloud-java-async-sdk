// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20231229.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * DocumentIds.
         */
        public Builder documentIds(java.util.List < String > documentIds) {
            String documentIdsShrink = shrink(documentIds, "DocumentIds", "json");
            this.putQueryParameter("DocumentIds", documentIdsShrink);
            this.documentIds = documentIds;
            return this;
        }

        /**
         * IndexId.
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
