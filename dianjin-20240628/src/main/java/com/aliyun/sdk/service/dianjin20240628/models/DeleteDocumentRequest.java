// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dianjin20240628.models;

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
 * {@link DeleteDocumentRequest} extends {@link RequestModel}
 *
 * <p>DeleteDocumentRequest</p>
 */
public class DeleteDocumentRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("docIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> docIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("libraryId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String libraryId;

    private DeleteDocumentRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.docIds = builder.docIds;
        this.libraryId = builder.libraryId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDocumentRequest create() {
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
     * @return docIds
     */
    public java.util.List<String> getDocIds() {
        return this.docIds;
    }

    /**
     * @return libraryId
     */
    public String getLibraryId() {
        return this.libraryId;
    }

    public static final class Builder extends Request.Builder<DeleteDocumentRequest, Builder> {
        private String workspaceId; 
        private java.util.List<String> docIds; 
        private String libraryId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDocumentRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.docIds = request.docIds;
            this.libraryId = request.libraryId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-xxxxx</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder docIds(java.util.List<String> docIds) {
            this.putBodyParameter("docIds", docIds);
            this.docIds = docIds;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3akzl28vap</p>
         */
        public Builder libraryId(String libraryId) {
            this.putBodyParameter("libraryId", libraryId);
            this.libraryId = libraryId;
            return this;
        }

        @Override
        public DeleteDocumentRequest build() {
            return new DeleteDocumentRequest(this);
        } 

    } 

}
