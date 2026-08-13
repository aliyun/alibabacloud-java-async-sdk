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
 * {@link ReplaceKnowledgeBaseSourceFileRequest} extends {@link RequestModel}
 *
 * <p>ReplaceKnowledgeBaseSourceFileRequest</p>
 */
public class ReplaceKnowledgeBaseSourceFileRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("fileName")
    private String fileName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("filePath")
    @com.aliyun.core.annotation.Validation(required = true)
    private String filePath;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("filePublicUrl")
    @com.aliyun.core.annotation.Validation(required = true)
    private String filePublicUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("fileRecordId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileRecordId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("forceSync")
    private Boolean forceSync;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    private ReplaceKnowledgeBaseSourceFileRequest(Builder builder) {
        super(builder);
        this.fileName = builder.fileName;
        this.filePath = builder.filePath;
        this.filePublicUrl = builder.filePublicUrl;
        this.fileRecordId = builder.fileRecordId;
        this.forceSync = builder.forceSync;
        this.sourceId = builder.sourceId;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReplaceKnowledgeBaseSourceFileRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return forceSync
     */
    public Boolean getForceSync() {
        return this.forceSync;
    }

    /**
     * @return sourceId
     */
    public String getSourceId() {
        return this.sourceId;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<ReplaceKnowledgeBaseSourceFileRequest, Builder> {
        private String fileName; 
        private String filePath; 
        private String filePublicUrl; 
        private String fileRecordId; 
        private Boolean forceSync; 
        private String sourceId; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(ReplaceKnowledgeBaseSourceFileRequest request) {
            super(request);
            this.fileName = request.fileName;
            this.filePath = request.filePath;
            this.filePublicUrl = request.filePublicUrl;
            this.fileRecordId = request.fileRecordId;
            this.forceSync = request.forceSync;
            this.sourceId = request.sourceId;
            this.tenantId = request.tenantId;
        } 

        /**
         * <p>新文件名（可选；不传或空字符串时保持原文件名）</p>
         * 
         * <strong>example:</strong>
         * <p>example.pdf</p>
         */
        public Builder fileName(String fileName) {
            this.putBodyParameter("fileName", fileName);
            this.fileName = fileName;
            return this;
        }

        /**
         * <p>新文件的 OSS 持久化地址（由上传签名接口返回）</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder filePath(String filePath) {
            this.putBodyParameter("filePath", filePath);
            this.filePath = filePath;
            return this;
        }

        /**
         * <p>新文件的公开访问 URL（可能携带临时签名）</p>
         * <p>This parameter is required.</p>
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
         * <p>新文件的文件记录 ID</p>
         * <p>This parameter is required.</p>
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
         * <p>是否同步等待重新解析完成；默认 false，异步入队</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder forceSync(Boolean forceSync) {
            this.putBodyParameter("forceSync", forceSync);
            this.forceSync = forceSync;
            return this;
        }

        /**
         * <p>待替换的企业知识库 FILE 数据源 ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleSourceId</p>
         */
        public Builder sourceId(String sourceId) {
            this.putBodyParameter("sourceId", sourceId);
            this.sourceId = sourceId;
            return this;
        }

        /**
         * <p>租户ID，公共参数，缺省时使用调用方默认租户</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("tenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public ReplaceKnowledgeBaseSourceFileRequest build() {
            return new ReplaceKnowledgeBaseSourceFileRequest(this);
        } 

    } 

}
