// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20231229.models;

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
 * {@link SubmitIndexAddDocumentsJobRequest} extends {@link RequestModel}
 *
 * <p>SubmitIndexAddDocumentsJobRequest</p>
 */
public class SubmitIndexAddDocumentsJobRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CategoryIds")
    private java.util.List<String> categoryIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChunkMode")
    private String chunkMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChunkSize")
    private Integer chunkSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DocumentIds")
    private java.util.List<String> documentIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableHeaders")
    private Boolean enableHeaders;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IndexId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String indexId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OverlapSize")
    private Integer overlapSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Separator")
    private String separator;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceType;

    private SubmitIndexAddDocumentsJobRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.categoryIds = builder.categoryIds;
        this.chunkMode = builder.chunkMode;
        this.chunkSize = builder.chunkSize;
        this.documentIds = builder.documentIds;
        this.enableHeaders = builder.enableHeaders;
        this.indexId = builder.indexId;
        this.overlapSize = builder.overlapSize;
        this.separator = builder.separator;
        this.sourceType = builder.sourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitIndexAddDocumentsJobRequest create() {
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
     * @return categoryIds
     */
    public java.util.List<String> getCategoryIds() {
        return this.categoryIds;
    }

    /**
     * @return chunkMode
     */
    public String getChunkMode() {
        return this.chunkMode;
    }

    /**
     * @return chunkSize
     */
    public Integer getChunkSize() {
        return this.chunkSize;
    }

    /**
     * @return documentIds
     */
    public java.util.List<String> getDocumentIds() {
        return this.documentIds;
    }

    /**
     * @return enableHeaders
     */
    public Boolean getEnableHeaders() {
        return this.enableHeaders;
    }

    /**
     * @return indexId
     */
    public String getIndexId() {
        return this.indexId;
    }

    /**
     * @return overlapSize
     */
    public Integer getOverlapSize() {
        return this.overlapSize;
    }

    /**
     * @return separator
     */
    public String getSeparator() {
        return this.separator;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    public static final class Builder extends Request.Builder<SubmitIndexAddDocumentsJobRequest, Builder> {
        private String workspaceId; 
        private java.util.List<String> categoryIds; 
        private String chunkMode; 
        private Integer chunkSize; 
        private java.util.List<String> documentIds; 
        private Boolean enableHeaders; 
        private String indexId; 
        private Integer overlapSize; 
        private String separator; 
        private String sourceType; 

        private Builder() {
            super();
        } 

        private Builder(SubmitIndexAddDocumentsJobRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.categoryIds = request.categoryIds;
            this.chunkMode = request.chunkMode;
            this.chunkSize = request.chunkSize;
            this.documentIds = request.documentIds;
            this.enableHeaders = request.enableHeaders;
            this.indexId = request.indexId;
            this.overlapSize = request.overlapSize;
            this.separator = request.separator;
            this.sourceType = request.sourceType;
        } 

        /**
         * <p>The ID of the workspace to which the knowledge base belongs. To view the workspace ID, you can click the Workspace Details icon in the upper-left corner on the <a href="https://bailian.console.aliyun.com/#/home">homepage</a> of the console.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ws_3Nt27MYcoK191ISp</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>The list of primary key IDs of the category.</p>
         */
        public Builder categoryIds(java.util.List<String> categoryIds) {
            String categoryIdsShrink = shrink(categoryIds, "CategoryIds", "json");
            this.putQueryParameter("CategoryIds", categoryIdsShrink);
            this.categoryIds = categoryIds;
            return this;
        }

        /**
         * ChunkMode.
         */
        public Builder chunkMode(String chunkMode) {
            this.putQueryParameter("ChunkMode", chunkMode);
            this.chunkMode = chunkMode;
            return this;
        }

        /**
         * ChunkSize.
         */
        public Builder chunkSize(Integer chunkSize) {
            this.putQueryParameter("ChunkSize", chunkSize);
            this.chunkSize = chunkSize;
            return this;
        }

        /**
         * <p>The list of the primary key IDs of the documents.</p>
         */
        public Builder documentIds(java.util.List<String> documentIds) {
            String documentIdsShrink = shrink(documentIds, "DocumentIds", "json");
            this.putQueryParameter("DocumentIds", documentIdsShrink);
            this.documentIds = documentIds;
            return this;
        }

        /**
         * EnableHeaders.
         */
        public Builder enableHeaders(Boolean enableHeaders) {
            this.putQueryParameter("EnableHeaders", enableHeaders);
            this.enableHeaders = enableHeaders;
            return this;
        }

        /**
         * <p>The primary key ID of the knowledge base, which is the <code>Data.Id</code> parameter returned by the <a href="https://www.alibabacloud.com/help/en/model-studio/developer-reference/api-bailian-2023-12-29-createindex">CreateIndex</a> operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>79c0aly8zw</p>
         */
        public Builder indexId(String indexId) {
            this.putQueryParameter("IndexId", indexId);
            this.indexId = indexId;
            return this;
        }

        /**
         * OverlapSize.
         */
        public Builder overlapSize(Integer overlapSize) {
            this.putQueryParameter("OverlapSize", overlapSize);
            this.overlapSize = overlapSize;
            return this;
        }

        /**
         * Separator.
         */
        public Builder separator(String separator) {
            this.putQueryParameter("Separator", separator);
            this.separator = separator;
            return this;
        }

        /**
         * <p>The data type of <a href="https://bailian.console.aliyun.com/#/data-center">Data Management</a>. For more information, see <a href="https://www.alibabacloud.com/help/en/model-studio/user-guide/rag-knowledge-base">Create a knowledge base</a>. Valid values:</p>
         * <ul>
         * <li>DATA_CENTER_CATEGORY: The category type. Import all documents from one or more categories in Data Center.</li>
         * <li>DATA_CENTER_FILE: The document type. Import one or more documents from Data Center.</li>
         * </ul>
         * <blockquote>
         * <p> If this parameter is set to DATA_CENTER_CATEGORY, you must specify the <code>CategoryIds</code> parameter. If this parameter is set to DATA_CENTER_FILE, you must specify the <code>DocumentIds</code> parameter.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DATA_CENTER_FILE</p>
         */
        public Builder sourceType(String sourceType) {
            this.putQueryParameter("SourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        @Override
        public SubmitIndexAddDocumentsJobRequest build() {
            return new SubmitIndexAddDocumentsJobRequest(this);
        } 

    } 

}
