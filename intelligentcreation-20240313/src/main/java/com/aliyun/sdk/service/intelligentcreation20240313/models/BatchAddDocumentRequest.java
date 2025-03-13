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
 * {@link BatchAddDocumentRequest} extends {@link RequestModel}
 *
 * <p>BatchAddDocumentRequest</p>
 */
public class BatchAddDocumentRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("knowledgeBaseId")
    private String knowledgeBaseId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("addDocumentInfos")
    private java.util.List<AddDocumentInfo> addDocumentInfos;

    private BatchAddDocumentRequest(Builder builder) {
        super(builder);
        this.knowledgeBaseId = builder.knowledgeBaseId;
        this.addDocumentInfos = builder.addDocumentInfos;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchAddDocumentRequest create() {
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
     * @return addDocumentInfos
     */
    public java.util.List<AddDocumentInfo> getAddDocumentInfos() {
        return this.addDocumentInfos;
    }

    public static final class Builder extends Request.Builder<BatchAddDocumentRequest, Builder> {
        private String knowledgeBaseId; 
        private java.util.List<AddDocumentInfo> addDocumentInfos; 

        private Builder() {
            super();
        } 

        private Builder(BatchAddDocumentRequest request) {
            super(request);
            this.knowledgeBaseId = request.knowledgeBaseId;
            this.addDocumentInfos = request.addDocumentInfos;
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
         * addDocumentInfos.
         */
        public Builder addDocumentInfos(java.util.List<AddDocumentInfo> addDocumentInfos) {
            this.putBodyParameter("addDocumentInfos", addDocumentInfos);
            this.addDocumentInfos = addDocumentInfos;
            return this;
        }

        @Override
        public BatchAddDocumentRequest build() {
            return new BatchAddDocumentRequest(this);
        } 

    } 

}
