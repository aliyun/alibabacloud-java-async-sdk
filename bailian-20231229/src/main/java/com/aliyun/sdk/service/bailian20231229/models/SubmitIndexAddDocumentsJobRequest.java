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
    @com.aliyun.core.annotation.NameInMap("Extra")
    private Extra extra;

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
        this.extra = builder.extra;
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
     * @return extra
     */
    public Extra getExtra() {
        return this.extra;
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
        private Extra extra; 
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
            this.extra = request.extra;
            this.indexId = request.indexId;
            this.overlapSize = request.overlapSize;
            this.separator = request.separator;
            this.sourceType = request.sourceType;
        } 

        /**
         * <p>The workspace ID to which the knowledge base belongs. For information about how to obtain the workspace ID, see <a href="https://help.aliyun.com/document_detail/2587495.html">How to use a workspace</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-3shx2gu255oqxxxx</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>The list of category IDs.</p>
         */
        public Builder categoryIds(java.util.List<String> categoryIds) {
            String categoryIdsShrink = shrink(categoryIds, "CategoryIds", "json");
            this.putQueryParameter("CategoryIds", categoryIdsShrink);
            this.categoryIds = categoryIds;
            return this;
        }

        /**
         * <p>&lt;props=&quot;china&quot;&gt;
         * Enables custom chunking (applies only to files appended in this request). For more information, see <a href="https://help.aliyun.com/document_detail/2807740.html">Knowledge base</a>. Valid values (only one value can be specified at a time):</p>
         * <ul>
         * <li><strong>length</strong>: chunk by length. Strictly chunks according to the specified <code>ChunkSize</code> and <code>OverlapSize</code>. If these two parameters are not specified, the system uses default values (<code>ChunkSize</code> of 500 and <code>OverlapSize</code> of 100). Chunking by length does not support <code>Separator</code> (even if specified, it does not take effect).</li>
         * <li><strong>page</strong>: chunk by page. If <code>ChunkSize</code> is specified, it is also considered during chunking (if not specified, the default value of 500 is used). Chunking by page does not support <code>OverlapSize</code> or <code>Separator</code> (even if specified, they do not take effect).</li>
         * <li><strong>h1</strong>~<strong>h5</strong>: chunk by headings at the corresponding level (<code>h1</code> is the first-level heading, and so on, with support up to <code>h5</code> fifth-level heading). If <code>ChunkSize</code> is specified, it is also considered during chunking (if not specified, the default value of 500 is used). Chunking by heading does not support <code>OverlapSize</code> or <code>Separator</code> (even if specified, they do not take effect).</li>
         * <li><strong>regex</strong>: chunk by regular expression. The <code>Separator</code> parameter must be specified. If <code>ChunkSize</code> is specified, it is also considered during chunking (if not specified, the default value of 500 is used). Chunking by regex does not support <code>OverlapSize</code> (even if specified, it does not take effect).</li>
         * </ul>
         * <p>Default value: empty, which uses intelligent chunking.</p>
         * <p>&lt;props=&quot;intl&quot;&gt;</p>
         * <blockquote>
         * <p>This parameter is not yet available. Do not specify this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>length</p>
         */
        public Builder chunkMode(String chunkMode) {
            this.putQueryParameter("ChunkMode", chunkMode);
            this.chunkMode = chunkMode;
            return this;
        }

        /**
         * <p>&lt;props=&quot;china&quot;&gt;
         * The chunk length, which is the maximum number of characters per text chunk (applies only to files appended in this request). When this length is exceeded:</p>
         * <ul>
         * <li><strong>Intelligent chunking</strong> (without specifying <code>chunkMode</code>): the text is likely to be truncated.</li>
         * <li><strong>Custom chunking</strong> (with <code>chunkMode</code> specified): the text is forcibly split.</li>
         * </ul>
         * <p>Valid values: 1 to 6000. If this parameter is not specified, the default value of 500 is used.</p>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/2807740.html">Knowledge base</a>.</p>
         * <blockquote>
         * <p>If you specify <code>ChunkSize</code> with a value less than 100, you must also specify <code>OverlapSize</code>. You can also leave both parameters unspecified (the system uses default values).</p>
         * </blockquote>
         * <p>&lt;props=&quot;intl&quot;&gt;</p>
         * <blockquote>
         * <p>This parameter is not yet available. Do not specify this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>128</p>
         */
        public Builder chunkSize(Integer chunkSize) {
            this.putQueryParameter("ChunkSize", chunkSize);
            this.chunkSize = chunkSize;
            return this;
        }

        /**
         * <p>The list of file IDs.</p>
         */
        public Builder documentIds(java.util.List<String> documentIds) {
            String documentIdsShrink = shrink(documentIds, "DocumentIds", "json");
            this.putQueryParameter("DocumentIds", documentIdsShrink);
            this.documentIds = documentIds;
            return this;
        }

        /**
         * <p>Specifies whether to enable header assembly for Excel files. When enabled, the knowledge base treats the first row of all xlsx and xls files as headers and automatically appends them to each text chunk (data row), preventing the large language model from treating headers as regular data rows.</p>
         * <blockquote>
         * <p>Enable this feature only when all imported files are in xlsx or xls format and contain headers. Otherwise, leave it disabled.</p>
         * </blockquote>
         * <p>Valid values:</p>
         * <ul>
         * <li>true: Enabled.</li>
         * <li>false: Disabled.</li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder enableHeaders(Boolean enableHeaders) {
            this.putQueryParameter("EnableHeaders", enableHeaders);
            this.enableHeaders = enableHeaders;
            return this;
        }

        /**
         * Extra.
         */
        public Builder extra(Extra extra) {
            String extraShrink = shrink(extra, "Extra", "json");
            this.putQueryParameter("Extra", extraShrink);
            this.extra = extra;
            return this;
        }

        /**
         * <p>The knowledge base ID, which is the <code>Data.Id</code> returned by the <strong>CreateIndex</strong> operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>79c0alxxxx</p>
         */
        public Builder indexId(String indexId) {
            this.putQueryParameter("IndexId", indexId);
            this.indexId = indexId;
            return this;
        }

        /**
         * <p>&lt;props=&quot;china&quot;&gt;
         * The chunk overlap length (applies only to files appended in this request). It indicates the number of overlapping characters between the current text chunk and the previous text chunk. For more information, see <a href="https://help.aliyun.com/document_detail/2807740.html">Knowledge base</a>. Valid values: 0 to 1024.</p>
         * <p>If this parameter is not specified, the default value of 100 is used.</p>
         * <blockquote>
         * <p>The value of <code>OverlapSize</code> must be less than the value of <code>ChunkSize</code>. Otherwise, chunking exceptions may occur.</p>
         * </blockquote>
         * <p>&lt;props=&quot;intl&quot;&gt;</p>
         * <blockquote>
         * <p>This parameter is not yet available. Do not specify this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        public Builder overlapSize(Integer overlapSize) {
            this.putQueryParameter("OverlapSize", overlapSize);
            this.overlapSize = overlapSize;
            return this;
        }

        /**
         * <p>&lt;props=&quot;china&quot;&gt;
         * The sentence separator, which takes effect only when <code>chunkMode</code> is set to <strong>regex</strong> (otherwise, it does not take effect even if specified). You can specify a regular expression (only one is supported) to split the file into small text chunks. For more information, see <a href="https://help.aliyun.com/document_detail/2807740.html">Knowledge base</a>.</p>
         * <p>When using intelligent chunking (without specifying <code>chunkMode</code>), keep the default empty value.</p>
         * <p>&lt;props=&quot;intl&quot;&gt;</p>
         * <blockquote>
         * <p>This parameter is not yet available. Do not specify this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>(?&lt;=。)</p>
         */
        public Builder separator(String separator) {
            this.putQueryParameter("Separator", separator);
            this.separator = separator;
            return this;
        }

        /**
         * <p>The data source type. Valid values:</p>
         * <ul>
         * <li>DATA_CENTER_CATEGORY: category type. Imports all documents under specified categories in &lt;props=&quot;china&quot;&gt;<a href="https://bailian.console.aliyun.com/?tab=app#/data-center">Application Data</a>&lt;props=&quot;intl&quot;&gt;<a href="https://modelstudio.console.alibabacloud.com/?tab=app#/data-center">Application Data</a>. Multiple categories are supported.</li>
         * <li>DATA_CENTER_FILE: document type. Imports specified files from &lt;props=&quot;china&quot;&gt;<a href="https://bailian.console.aliyun.com/?tab=app#/data-center">Application Data</a>&lt;props=&quot;intl&quot;&gt;<a href="https://modelstudio.console.alibabacloud.com/?tab=app#/data-center">Application Data</a>. Multiple files are supported.</li>
         * </ul>
         * <blockquote>
         * <p>If this parameter is set to DATA_CENTER_CATEGORY, you must specify the <code>CategoryIds</code> parameter. If this parameter is set to DATA_CENTER_FILE, you must specify the <code>DocumentIds</code> parameter.</p>
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

    /**
     * 
     * {@link SubmitIndexAddDocumentsJobRequest} extends {@link TeaModel}
     *
     * <p>SubmitIndexAddDocumentsJobRequest</p>
     */
    public static class Extra extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("uniqueId")
        private String uniqueId;

        private Extra(Builder builder) {
            this.uniqueId = builder.uniqueId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Extra create() {
            return builder().build();
        }

        /**
         * @return uniqueId
         */
        public String getUniqueId() {
            return this.uniqueId;
        }

        public static final class Builder {
            private String uniqueId; 

            private Builder() {
            } 

            private Builder(Extra model) {
                this.uniqueId = model.uniqueId;
            } 

            /**
             * uniqueId.
             */
            public Builder uniqueId(String uniqueId) {
                this.uniqueId = uniqueId;
                return this;
            }

            public Extra build() {
                return new Extra(this);
            } 

        } 

    }
}
