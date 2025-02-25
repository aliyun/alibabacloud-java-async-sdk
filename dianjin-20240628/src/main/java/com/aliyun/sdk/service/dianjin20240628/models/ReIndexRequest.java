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
 * {@link ReIndexRequest} extends {@link RequestModel}
 *
 * <p>ReIndexRequest</p>
 */
public class ReIndexRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("documentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String documentId;

    private ReIndexRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.documentId = builder.documentId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReIndexRequest create() {
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

    public static final class Builder extends Request.Builder<ReIndexRequest, Builder> {
        private String workspaceId; 
        private String documentId; 

        private Builder() {
            super();
        } 

        private Builder(ReIndexRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.documentId = request.documentId;
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
         * 
         * <strong>example:</strong>
         * <p>8326472354762354</p>
         */
        public Builder documentId(String documentId) {
            this.putQueryParameter("documentId", documentId);
            this.documentId = documentId;
            return this;
        }

        @Override
        public ReIndexRequest build() {
            return new ReIndexRequest(this);
        } 

    } 

}
