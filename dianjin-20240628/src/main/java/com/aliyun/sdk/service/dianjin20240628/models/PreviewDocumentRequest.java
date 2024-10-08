// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dianjin20240628.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link PreviewDocumentRequest} extends {@link RequestModel}
 *
 * <p>PreviewDocumentRequest</p>
 */
public class PreviewDocumentRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("documentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String documentId;

    private PreviewDocumentRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.documentId = builder.documentId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PreviewDocumentRequest create() {
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
     * @return documentId
     */
    public String getDocumentId() {
        return this.documentId;
    }

    public static final class Builder extends Request.Builder<PreviewDocumentRequest, Builder> {
        private String workspaceId; 
        private String documentId; 

        private Builder() {
            super();
        } 

        private Builder(PreviewDocumentRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.documentId = request.documentId;
        } 

        /**
         * workspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * documentId.
         */
        public Builder documentId(String documentId) {
            this.putQueryParameter("documentId", documentId);
            this.documentId = documentId;
            return this;
        }

        @Override
        public PreviewDocumentRequest build() {
            return new PreviewDocumentRequest(this);
        } 

    } 

}
