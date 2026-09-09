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
 * {@link CreatePdfTranslateTaskRequest} extends {@link RequestModel}
 *
 * <p>CreatePdfTranslateTaskRequest</p>
 */
public class CreatePdfTranslateTaskRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("docId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String docId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("knowledge")
    private String knowledge;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("libraryId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String libraryId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("modelId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String modelId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("translateTo")
    private String translateTo;

    private CreatePdfTranslateTaskRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.docId = builder.docId;
        this.knowledge = builder.knowledge;
        this.libraryId = builder.libraryId;
        this.modelId = builder.modelId;
        this.translateTo = builder.translateTo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePdfTranslateTaskRequest create() {
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
     * @return docId
     */
    public String getDocId() {
        return this.docId;
    }

    /**
     * @return knowledge
     */
    public String getKnowledge() {
        return this.knowledge;
    }

    /**
     * @return libraryId
     */
    public String getLibraryId() {
        return this.libraryId;
    }

    /**
     * @return modelId
     */
    public String getModelId() {
        return this.modelId;
    }

    /**
     * @return translateTo
     */
    public String getTranslateTo() {
        return this.translateTo;
    }

    public static final class Builder extends Request.Builder<CreatePdfTranslateTaskRequest, Builder> {
        private String workspaceId; 
        private String docId; 
        private String knowledge; 
        private String libraryId; 
        private String modelId; 
        private String translateTo; 

        private Builder() {
            super();
        } 

        private Builder(CreatePdfTranslateTaskRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.docId = request.docId;
            this.knowledge = request.knowledge;
            this.libraryId = request.libraryId;
            this.modelId = request.modelId;
            this.translateTo = request.translateTo;
        } 

        /**
         * <p>Workspace ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-ik******RVYCKzt</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>Document ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>873648346573245</p>
         */
        public Builder docId(String docId) {
            this.putBodyParameter("docId", docId);
            this.docId = docId;
            return this;
        }

        /**
         * <p>Domain knowledge used as reference during translation</p>
         * 
         * <strong>example:</strong>
         * <p>净利润 (Net Profit)
         * 英文：Net Profit
         * 中文：净利润（通常指扣除所有费用和税后的利润）</p>
         */
        public Builder knowledge(String knowledge) {
            this.putBodyParameter("knowledge", knowledge);
            this.knowledge = knowledge;
            return this;
        }

        /**
         * <p>Document library ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cjshcxxxx</p>
         */
        public Builder libraryId(String libraryId) {
            this.putBodyParameter("libraryId", libraryId);
            this.libraryId = libraryId;
            return this;
        }

        /**
         * <p>Model ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen-plus</p>
         */
        public Builder modelId(String modelId) {
            this.putBodyParameter("modelId", modelId);
            this.modelId = modelId;
            return this;
        }

        /**
         * <p>Target language. Default is Chinese</p>
         * 
         * <strong>example:</strong>
         * <p>中文</p>
         */
        public Builder translateTo(String translateTo) {
            this.putBodyParameter("translateTo", translateTo);
            this.translateTo = translateTo;
            return this;
        }

        @Override
        public CreatePdfTranslateTaskRequest build() {
            return new CreatePdfTranslateTaskRequest(this);
        } 

    } 

}
