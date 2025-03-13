// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240313.models;

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
 * {@link DescribeDocumentRequest} extends {@link RequestModel}
 *
 * <p>DescribeDocumentRequest</p>
 */
public class DescribeDocumentRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("knowledgeBaseId")
    private String knowledgeBaseId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("documentId")
    private String documentId;

    private DescribeDocumentRequest(Builder builder) {
        super(builder);
        this.knowledgeBaseId = builder.knowledgeBaseId;
        this.documentId = builder.documentId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDocumentRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return knowledgeBaseId
     */
    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    /**
     * @return documentId
     */
    public String getDocumentId() {
        return this.documentId;
    }

    public static final class Builder extends Request.Builder<DescribeDocumentRequest, Builder> {
        private String knowledgeBaseId; 
        private String documentId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDocumentRequest request) {
            super(request);
            this.knowledgeBaseId = request.knowledgeBaseId;
            this.documentId = request.documentId;
        } 

        /**
         * knowledgeBaseId.
         */
        public Builder knowledgeBaseId(String knowledgeBaseId) {
            this.putPathParameter("knowledgeBaseId", knowledgeBaseId);
            this.knowledgeBaseId = knowledgeBaseId;
            return this;
        }

        /**
         * documentId.
         */
        public Builder documentId(String documentId) {
            this.putPathParameter("documentId", documentId);
            this.documentId = documentId;
            return this;
        }

        @Override
        public DescribeDocumentRequest build() {
            return new DescribeDocumentRequest(this);
        } 

    } 

}
