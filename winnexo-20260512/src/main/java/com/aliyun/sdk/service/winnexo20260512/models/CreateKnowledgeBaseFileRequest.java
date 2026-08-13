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
 * {@link CreateKnowledgeBaseFileRequest} extends {@link RequestModel}
 *
 * <p>CreateKnowledgeBaseFileRequest</p>
 */
public class CreateKnowledgeBaseFileRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("directoryId")
    private String directoryId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("fileExt")
    private String fileExt;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("fileName")
    private String fileName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("filePath")
    @com.aliyun.core.annotation.Validation(required = true)
    private String filePath;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("filePublicUrl")
    private String filePublicUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("fileRecordId")
    private String fileRecordId;

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

    private CreateKnowledgeBaseFileRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.directoryId = builder.directoryId;
        this.fileExt = builder.fileExt;
        this.fileName = builder.fileName;
        this.filePath = builder.filePath;
        this.filePublicUrl = builder.filePublicUrl;
        this.fileRecordId = builder.fileRecordId;
        this.knowledgeId = builder.knowledgeId;
        this.name = builder.name;
        this.operatingObjectName = builder.operatingObjectName;
        this.sourceTags = builder.sourceTags;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateKnowledgeBaseFileRequest create() {
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
     * @return fileExt
     */
    public String getFileExt() {
        return this.fileExt;
    }

    /**
     * @return fileName
     */
    public String getFileName() {
        return this.fileName;
    }

    /**
     * @return filePath
     */
    public String getFilePath() {
        return this.filePath;
    }

    /**
     * @return filePublicUrl
     */
    public String getFilePublicUrl() {
        return this.filePublicUrl;
    }

    /**
     * @return fileRecordId
     */
    public String getFileRecordId() {
        return this.fileRecordId;
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

    public static final class Builder extends Request.Builder<CreateKnowledgeBaseFileRequest, Builder> {
        private String description; 
        private String directoryId; 
        private String fileExt; 
        private String fileName; 
        private String filePath; 
        private String filePublicUrl; 
        private String fileRecordId; 
        private String knowledgeId; 
        private String name; 
        private String operatingObjectName; 
        private String sourceTags; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(CreateKnowledgeBaseFileRequest request) {
            super(request);
            this.description = request.description;
            this.directoryId = request.directoryId;
            this.fileExt = request.fileExt;
            this.fileName = request.fileName;
            this.filePath = request.filePath;
            this.filePublicUrl = request.filePublicUrl;
            this.fileRecordId = request.fileRecordId;
            this.knowledgeId = request.knowledgeId;
            this.name = request.name;
            this.operatingObjectName = request.operatingObjectName;
            this.sourceTags = request.sourceTags;
            this.tenantId = request.tenantId;
        } 

        /**
         * <p>资源描述（可选）</p>
         * 
         * <strong>example:</strong>
         * <p>hangzhou-release-version-3-eventbridge-numeric-queue-fix-20260529</p>
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
         * <p>文件后缀名（可选，如 pdf、docx）</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder fileExt(String fileExt) {
            this.putBodyParameter("fileExt", fileExt);
            this.fileExt = fileExt;
            return this;
        }

        /**
         * <p>原始文件名（可选，含后缀）</p>
         * 
         * <strong>example:</strong>
         * <p>BasicSimilarityScorer.cava</p>
         */
        public Builder fileName(String fileName) {
            this.putBodyParameter("fileName", fileName);
            this.fileName = fileName;
            return this;
        }

        /**
         * <p>文件 OSS 持久化地址（必填，对应 settings.file_path）</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>bi/batch-query-service.app.yaml</p>
         */
        public Builder filePath(String filePath) {
            this.putBodyParameter("filePath", filePath);
            this.filePath = filePath;
            return this;
        }

        /**
         * <p>文件公开访问 URL（可选，带签名，对应 settings.file_public_url）</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/winnexo/resource">https://example.com/winnexo/resource</a></p>
         */
        public Builder filePublicUrl(String filePublicUrl) {
            this.putBodyParameter("filePublicUrl", filePublicUrl);
            this.filePublicUrl = filePublicUrl;
            return this;
        }

        /**
         * <p>文件记录 ID（可选，对应 settings.file_record_id）</p>
         * 
         * <strong>example:</strong>
         * <p>exampleFileRecordId</p>
         */
        public Builder fileRecordId(String fileRecordId) {
            this.putBodyParameter("fileRecordId", fileRecordId);
            this.fileRecordId = fileRecordId;
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
         * <p>oklabs_tongyici</p>
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
         * <p>租户ID，公共参数；winnexo-cli 通过 --tenant-id 显式传入</p>
         * 
         * <strong>example:</strong>
         * <p>692318833855074</p>
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("tenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public CreateKnowledgeBaseFileRequest build() {
            return new CreateKnowledgeBaseFileRequest(this);
        } 

    } 

}
