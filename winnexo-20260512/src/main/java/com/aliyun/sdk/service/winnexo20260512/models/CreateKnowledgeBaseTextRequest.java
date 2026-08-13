// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.winnexo20260512.models;

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
 * {@link CreateKnowledgeBaseTextRequest} extends {@link RequestModel}
 *
 * <p>CreateKnowledgeBaseTextRequest</p>
 */
public class CreateKnowledgeBaseTextRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("directoryId")
    private String directoryId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("knowledgeId")
    private String knowledgeId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("operatingObjectName")
    private String operatingObjectName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sourceTags")
    private String sourceTags;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("textContent")
    @com.aliyun.core.annotation.Validation(required = true)
    private String textContent;

    private CreateKnowledgeBaseTextRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.directoryId = builder.directoryId;
        this.knowledgeId = builder.knowledgeId;
        this.name = builder.name;
        this.operatingObjectName = builder.operatingObjectName;
        this.sourceTags = builder.sourceTags;
        this.tenantId = builder.tenantId;
        this.textContent = builder.textContent;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateKnowledgeBaseTextRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return directoryId
     */
    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * @return knowledgeId
     */
    public String getKnowledgeId() {
        return this.knowledgeId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return operatingObjectName
     */
    public String getOperatingObjectName() {
        return this.operatingObjectName;
    }

    /**
     * @return sourceTags
     */
    public String getSourceTags() {
        return this.sourceTags;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return textContent
     */
    public String getTextContent() {
        return this.textContent;
    }

    public static final class Builder extends Request.Builder<CreateKnowledgeBaseTextRequest, Builder> {
        private String description; 
        private String directoryId; 
        private String knowledgeId; 
        private String name; 
        private String operatingObjectName; 
        private String sourceTags; 
        private String tenantId; 
        private String textContent; 

        private Builder() {
            super();
        } 

        private Builder(CreateKnowledgeBaseTextRequest request) {
            super(request);
            this.description = request.description;
            this.directoryId = request.directoryId;
            this.knowledgeId = request.knowledgeId;
            this.name = request.name;
            this.operatingObjectName = request.operatingObjectName;
            this.sourceTags = request.sourceTags;
            this.tenantId = request.tenantId;
            this.textContent = request.textContent;
        } 

        /**
         * <p>资源描述（可选）</p>
         * 
         * <strong>example:</strong>
         * <p>InterviewMaster operations and health check service</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>目标企业知识库目录 ID；不传时自动绑定到当前数字员工默认根目录，传入时必须是当前租户下已有的企业知识库目录</p>
         * 
         * <strong>example:</strong>
         * <p>exampleDirectoryId</p>
         */
        public Builder directoryId(String directoryId) {
            this.putBodyParameter("directoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * <p>知识库 ID（可选，透传给 document_agent）</p>
         * 
         * <strong>example:</strong>
         * <p>exampleKnowledgeId</p>
         */
        public Builder knowledgeId(String knowledgeId) {
            this.putBodyParameter("knowledgeId", knowledgeId);
            this.knowledgeId = knowledgeId;
            return this;
        }

        /**
         * <p>资源显示名称</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>KL_tongyici</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>数字员工名称（运营对象 name，可选）</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder operatingObjectName(String operatingObjectName) {
            this.putBodyParameter("operatingObjectName", operatingObjectName);
            this.operatingObjectName = operatingObjectName;
            return this;
        }

        /**
         * <p>资源标签（可选，JSON 字符串列表，如 [&quot;tagA&quot;,&quot;tagB&quot;]）</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder sourceTags(String sourceTags) {
            this.putBodyParameter("sourceTags", sourceTags);
            this.sourceTags = sourceTags;
            return this;
        }

        /**
         * <p>租户ID，公共参数，缺省时使用调用方默认租户</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("tenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * <p>纯文本正文（必填）</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder textContent(String textContent) {
            this.putBodyParameter("textContent", textContent);
            this.textContent = textContent;
            return this;
        }

        @Override
        public CreateKnowledgeBaseTextRequest build() {
            return new CreateKnowledgeBaseTextRequest(this);
        } 

    } 

}
