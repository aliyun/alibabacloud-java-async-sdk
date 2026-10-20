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
 * {@link CreateIndexRequest} extends {@link RequestModel}
 *
 * <p>CreateIndexRequest</p>
 */
public class CreateIndexRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CategoryIds")
    private java.util.List<String> categoryIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChunkSize")
    private Integer chunkSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Columns")
    private java.util.List<Columns> columns;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreateIndexType")
    private String createIndexType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DocumentIds")
    private java.util.List<String> documentIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EmbeddingModelName")
    private String embeddingModelName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableRewrite")
    private Boolean enableRewrite;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OverlapSize")
    private Integer overlapSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RerankInstruct")
    private String rerankInstruct;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RerankMinScore")
    private Double rerankMinScore;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RerankMode")
    private String rerankMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RerankModelName")
    private String rerankModelName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Separator")
    private String separator;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SinkInstanceId")
    private String sinkInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SinkRegion")
    private String sinkRegion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SinkType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sinkType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceType")
    private String sourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StructureType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String structureType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TableIds")
    private java.util.List<String> tableIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("channelType")
    private String channelType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("chunkMode")
    private String chunkMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("connectId")
    private String connectId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("database")
    private String database;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("datasourceCode")
    private String datasourceCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("enableHeaders")
    private Boolean enableHeaders;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("knowledgeScene")
    private String knowledgeScene;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("knowledgeType")
    private String knowledgeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("metaExtractColumns")
    private java.util.List<MetaExtractColumns> metaExtractColumns;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pipelineCommercialCu")
    @com.aliyun.core.annotation.Validation(maximum = 200, minimum = 1)
    private Integer pipelineCommercialCu;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pipelineCommercialType")
    private String pipelineCommercialType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pipelineRetrieveRateLimitStrategy")
    private String pipelineRetrieveRateLimitStrategy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("table")
    private String table;

    private CreateIndexRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.categoryIds = builder.categoryIds;
        this.chunkSize = builder.chunkSize;
        this.columns = builder.columns;
        this.createIndexType = builder.createIndexType;
        this.description = builder.description;
        this.documentIds = builder.documentIds;
        this.embeddingModelName = builder.embeddingModelName;
        this.enableRewrite = builder.enableRewrite;
        this.name = builder.name;
        this.overlapSize = builder.overlapSize;
        this.rerankInstruct = builder.rerankInstruct;
        this.rerankMinScore = builder.rerankMinScore;
        this.rerankMode = builder.rerankMode;
        this.rerankModelName = builder.rerankModelName;
        this.separator = builder.separator;
        this.sinkInstanceId = builder.sinkInstanceId;
        this.sinkRegion = builder.sinkRegion;
        this.sinkType = builder.sinkType;
        this.sourceType = builder.sourceType;
        this.structureType = builder.structureType;
        this.tableIds = builder.tableIds;
        this.channelType = builder.channelType;
        this.chunkMode = builder.chunkMode;
        this.connectId = builder.connectId;
        this.database = builder.database;
        this.datasourceCode = builder.datasourceCode;
        this.enableHeaders = builder.enableHeaders;
        this.knowledgeScene = builder.knowledgeScene;
        this.knowledgeType = builder.knowledgeType;
        this.metaExtractColumns = builder.metaExtractColumns;
        this.pipelineCommercialCu = builder.pipelineCommercialCu;
        this.pipelineCommercialType = builder.pipelineCommercialType;
        this.pipelineRetrieveRateLimitStrategy = builder.pipelineRetrieveRateLimitStrategy;
        this.table = builder.table;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateIndexRequest create() {
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
     * @return chunkSize
     */
    public Integer getChunkSize() {
        return this.chunkSize;
    }

    /**
     * @return columns
     */
    public java.util.List<Columns> getColumns() {
        return this.columns;
    }

    /**
     * @return createIndexType
     */
    public String getCreateIndexType() {
        return this.createIndexType;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return documentIds
     */
    public java.util.List<String> getDocumentIds() {
        return this.documentIds;
    }

    /**
     * @return embeddingModelName
     */
    public String getEmbeddingModelName() {
        return this.embeddingModelName;
    }

    /**
     * @return enableRewrite
     */
    public Boolean getEnableRewrite() {
        return this.enableRewrite;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return overlapSize
     */
    public Integer getOverlapSize() {
        return this.overlapSize;
    }

    /**
     * @return rerankInstruct
     */
    public String getRerankInstruct() {
        return this.rerankInstruct;
    }

    /**
     * @return rerankMinScore
     */
    public Double getRerankMinScore() {
        return this.rerankMinScore;
    }

    /**
     * @return rerankMode
     */
    public String getRerankMode() {
        return this.rerankMode;
    }

    /**
     * @return rerankModelName
     */
    public String getRerankModelName() {
        return this.rerankModelName;
    }

    /**
     * @return separator
     */
    public String getSeparator() {
        return this.separator;
    }

    /**
     * @return sinkInstanceId
     */
    public String getSinkInstanceId() {
        return this.sinkInstanceId;
    }

    /**
     * @return sinkRegion
     */
    public String getSinkRegion() {
        return this.sinkRegion;
    }

    /**
     * @return sinkType
     */
    public String getSinkType() {
        return this.sinkType;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * @return structureType
     */
    public String getStructureType() {
        return this.structureType;
    }

    /**
     * @return tableIds
     */
    public java.util.List<String> getTableIds() {
        return this.tableIds;
    }

    /**
     * @return channelType
     */
    public String getChannelType() {
        return this.channelType;
    }

    /**
     * @return chunkMode
     */
    public String getChunkMode() {
        return this.chunkMode;
    }

    /**
     * @return connectId
     */
    public String getConnectId() {
        return this.connectId;
    }

    /**
     * @return database
     */
    public String getDatabase() {
        return this.database;
    }

    /**
     * @return datasourceCode
     */
    public String getDatasourceCode() {
        return this.datasourceCode;
    }

    /**
     * @return enableHeaders
     */
    public Boolean getEnableHeaders() {
        return this.enableHeaders;
    }

    /**
     * @return knowledgeScene
     */
    public String getKnowledgeScene() {
        return this.knowledgeScene;
    }

    /**
     * @return knowledgeType
     */
    public String getKnowledgeType() {
        return this.knowledgeType;
    }

    /**
     * @return metaExtractColumns
     */
    public java.util.List<MetaExtractColumns> getMetaExtractColumns() {
        return this.metaExtractColumns;
    }

    /**
     * @return pipelineCommercialCu
     */
    public Integer getPipelineCommercialCu() {
        return this.pipelineCommercialCu;
    }

    /**
     * @return pipelineCommercialType
     */
    public String getPipelineCommercialType() {
        return this.pipelineCommercialType;
    }

    /**
     * @return pipelineRetrieveRateLimitStrategy
     */
    public String getPipelineRetrieveRateLimitStrategy() {
        return this.pipelineRetrieveRateLimitStrategy;
    }

    /**
     * @return table
     */
    public String getTable() {
        return this.table;
    }

    public static final class Builder extends Request.Builder<CreateIndexRequest, Builder> {
        private String workspaceId; 
        private java.util.List<String> categoryIds; 
        private Integer chunkSize; 
        private java.util.List<Columns> columns; 
        private String createIndexType; 
        private String description; 
        private java.util.List<String> documentIds; 
        private String embeddingModelName; 
        private Boolean enableRewrite; 
        private String name; 
        private Integer overlapSize; 
        private String rerankInstruct; 
        private Double rerankMinScore; 
        private String rerankMode; 
        private String rerankModelName; 
        private String separator; 
        private String sinkInstanceId; 
        private String sinkRegion; 
        private String sinkType; 
        private String sourceType; 
        private String structureType; 
        private java.util.List<String> tableIds; 
        private String channelType; 
        private String chunkMode; 
        private String connectId; 
        private String database; 
        private String datasourceCode; 
        private Boolean enableHeaders; 
        private String knowledgeScene; 
        private String knowledgeType; 
        private java.util.List<MetaExtractColumns> metaExtractColumns; 
        private Integer pipelineCommercialCu; 
        private String pipelineCommercialType; 
        private String pipelineRetrieveRateLimitStrategy; 
        private String table; 

        private Builder() {
            super();
        } 

        private Builder(CreateIndexRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.categoryIds = request.categoryIds;
            this.chunkSize = request.chunkSize;
            this.columns = request.columns;
            this.createIndexType = request.createIndexType;
            this.description = request.description;
            this.documentIds = request.documentIds;
            this.embeddingModelName = request.embeddingModelName;
            this.enableRewrite = request.enableRewrite;
            this.name = request.name;
            this.overlapSize = request.overlapSize;
            this.rerankInstruct = request.rerankInstruct;
            this.rerankMinScore = request.rerankMinScore;
            this.rerankMode = request.rerankMode;
            this.rerankModelName = request.rerankModelName;
            this.separator = request.separator;
            this.sinkInstanceId = request.sinkInstanceId;
            this.sinkRegion = request.sinkRegion;
            this.sinkType = request.sinkType;
            this.sourceType = request.sourceType;
            this.structureType = request.structureType;
            this.tableIds = request.tableIds;
            this.channelType = request.channelType;
            this.chunkMode = request.chunkMode;
            this.connectId = request.connectId;
            this.database = request.database;
            this.datasourceCode = request.datasourceCode;
            this.enableHeaders = request.enableHeaders;
            this.knowledgeScene = request.knowledgeScene;
            this.knowledgeType = request.knowledgeType;
            this.metaExtractColumns = request.metaExtractColumns;
            this.pipelineCommercialCu = request.pipelineCommercialCu;
            this.pipelineCommercialType = request.pipelineCommercialType;
            this.pipelineRetrieveRateLimitStrategy = request.pipelineRetrieveRateLimitStrategy;
            this.table = request.table;
        } 

        /**
         * <p>The workspace ID. The knowledge base is created in this workspace. For more information about how to obtain the ID, refer to <a href="https://help.aliyun.com/document_detail/2587495.html">How to use workspaces</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-3z7uw7fwz0vexxxx</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>You can import files synchronously when you create a knowledge base. Here, you can import all files under a specified category by specifying the category ID. We recommend that you import no more than 500 files. If you have remaining files, you can call the <strong>SubmitIndexAddDocumentsJob</strong> operation to continue importing them later.</p>
         */
        public Builder categoryIds(java.util.List<String> categoryIds) {
            String categoryIdsShrink = shrink(categoryIds, "CategoryIds", "json");
            this.putQueryParameter("CategoryIds", categoryIdsShrink);
            this.categoryIds = categoryIds;
            return this;
        }

        /**
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <p>The chunk size, which is the maximum number of characters in each text chunk. If the text exceeds this length:</p>
         * <ul>
         * <li><strong>Intelligent chunking</strong> (chunkMode is not specified): The text is highly likely to be truncated.</li>
         * <li><strong>Custom chunking</strong> (chunkMode is specified): The text is forcibly truncated.</li>
         * </ul>
         * <p>&lt;props=&quot;intl&quot;&gt;
         * The chunk size, which is the maximum number of characters in each text chunk. If the text exceeds this length, it is highly likely to be truncated.</p>
         * <p>Valid values: [1, 6000]. Default value: 500.</p>
         * <blockquote>
         * <p>If you set ChunkSize to a value less than 100, you must also set OverlapSize. You can also leave these two parameters unspecified, and the system uses the default values.</p>
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
         * <p>&lt;props=&quot;china&quot;&gt;
         * The structure of the data table, such as column names and types.</p>
         * <p>&lt;props=&quot;intl&quot;&gt;</p>
         * <blockquote>
         * <p>This parameter is not available. Do not pass this parameter.</p>
         * </blockquote>
         */
        public Builder columns(java.util.List<Columns> columns) {
            String columnsShrink = shrink(columns, "Columns", "json");
            this.putQueryParameter("Columns", columnsShrink);
            this.columns = columns;
            return this;
        }

        /**
         * <blockquote>
         * <p>This parameter is not available. Do not pass this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>standard</p>
         */
        public Builder createIndexType(String createIndexType) {
            this.putQueryParameter("CreateIndexType", createIndexType);
            this.createIndexType = createIndexType;
            return this;
        }

        /**
         * <p>The description of the knowledge base. The description must be 0 to 200 characters in length and can contain English and Chinese characters.
         * Default value: empty.</p>
         * 
         * <strong>example:</strong>
         * <p>The enterprise help document library includes important materials such as company policies and product lists</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>You can import files synchronously when you create a knowledge base. Here, you can specify the list of files to be imported by passing file IDs. We recommend that you import no more than 10,000 files. If you have remaining files, you can call the <strong>SubmitIndexAddDocumentsJob</strong> operation to continue importing them later.</p>
         */
        public Builder documentIds(java.util.List<String> documentIds) {
            String documentIdsShrink = shrink(documentIds, "DocumentIds", "json");
            this.putQueryParameter("DocumentIds", documentIdsShrink);
            this.documentIds = documentIds;
            return this;
        }

        /**
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <p>The embedding model used by the knowledge base. The embedding model is used to transform the original input prompt and knowledge text into numerical vectors for similarity comparison. Compared with the text-embedding-v3 model, the text-embedding-v4 model is comprehensively upgraded in terms of language support, code snippet vectorization effect, and selection of vector dimensions, and is suitable for most scenarios. For more information, refer to <a href="https://help.aliyun.com/document_detail/2842587.html">Quantization</a>. Valid values:</p>
         * <ul>
         * <li>text-embedding-v4</li>
         * <li>text-embedding-v3</li>
         * </ul>
         * <p>Default value: empty. In this case, the text-embedding-v3 model is used.</p>
         * <p>&lt;props=&quot;intl&quot;&gt;</p>
         * <p>The embedding model used by the knowledge base. The embedding model is used to transform the original input prompt and knowledge text into numerical vectors for similarity comparison. The default text-embedding-v2 model (which cannot be changed at the moment) supports not only Chinese and English but also multiple other languages, and performs normalization on the vector results. For more information, refer to <a href="https://help.aliyun.com/document_detail/2842587.html">Quantization</a>. Valid values:</p>
         * <ul>
         * <li>text-embedding-v2</li>
         * </ul>
         * <p>Default value: empty. In this case, the text-embedding-v2 model is used.</p>
         * 
         * <strong>example:</strong>
         * <p>text-embedding-v4</p>
         */
        public Builder embeddingModelName(String embeddingModelName) {
            this.putQueryParameter("EmbeddingModelName", embeddingModelName);
            this.embeddingModelName = embeddingModelName;
            return this;
        }

        /**
         * <p>Specifies whether to enable multi-turn conversation rewriting. Valid values:</p>
         * <ul>
         * <li>true: enabled.</li>
         * <li>false: disabled.</li>
         * </ul>
         * <p>Default value: true.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableRewrite(Boolean enableRewrite) {
            this.putQueryParameter("EnableRewrite", enableRewrite);
            this.enableRewrite = enableRewrite;
            return this;
        }

        /**
         * <p>The name of the knowledge base. The name must be 1 to 20 characters in length and can contain Chinese characters, English letters, digits, underscores (_), hyphens (-), periods (.), and colons (:).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Enterprise help document library</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The chunk overlap size, which indicates the number of overlapping characters between the current text chunk and the previous text chunk. Valid values: [0, 1024].</p>
         * <p>Default value: 100.</p>
         * <blockquote>
         * <p>OverlapSize must be less than ChunkSize. Otherwise, chunking exceptions occur.</p>
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
         * <p>&lt;props=&quot;intl&quot;&gt;This parameter is not available. Do not specify this parameter.</p>
         * <p>&lt;props=&quot;china&quot;&gt;Provides a natural language instruction to fine-tune the behavior of the reranking model.
         * <notice>This parameter takes effect only when rerank_mode is set to &quot;custom&quot;.</notice></p>
         * 
         * <strong>example:</strong>
         * <p>Given a web search query, retrieve relevant passages that answer the query.</p>
         */
        public Builder rerankInstruct(String rerankInstruct) {
            this.putQueryParameter("RerankInstruct", rerankInstruct);
            this.rerankInstruct = rerankInstruct;
            return this;
        }

        /**
         * <p>The similarity threshold. Only text chunks with a similarity score greater than this value are recalled. This parameter is used to filter the text chunks returned by the reranking model. Valid values: [0.01, 1.00].</p>
         * <p>Default value: 0.01.</p>
         * 
         * <strong>example:</strong>
         * <p>0.20</p>
         */
        public Builder rerankMinScore(Double rerankMinScore) {
            this.putQueryParameter("RerankMinScore", rerankMinScore);
            this.rerankMinScore = rerankMinScore;
            return this;
        }

        /**
         * <p>&lt;props=&quot;china&quot;&gt;
         * Specifies the instruction intervention mode of the reranking model to determine its scoring preference. Valid values:</p>
         * <ul>
         * <li><p><strong>qa</strong>: question answering mode. This is the default value. The model tends to assign higher scores to candidates that can directly answer the query. We recommend that you use this mode in question answering scenarios.</p>
         * </li>
         * <li><p><strong>similar</strong>: similarity mode. The model tends to assign higher scores to candidates that are highly consistent with the query content. We recommend that you use this mode in matching and retrieval scenarios.</p>
         * </li>
         * <li><p><strong>custom</strong>: custom mode. The ranking behavior of the model is determined by the instruction in the rerank_instruct parameter.</p>
         * </li>
         * </ul>
         * <p>&lt;props=&quot;intl&quot;&gt;This parameter is not available. Do not specify this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>qa</p>
         */
        public Builder rerankMode(String rerankMode) {
            this.putQueryParameter("RerankMode", rerankMode);
            this.rerankMode = rerankMode;
            return this;
        }

        /**
         * <p>The reranking model used by the knowledge base. The reranking model is a scoring system external to the knowledge base. It calculates the similarity score between the user\&quot;s question and each text chunk in the knowledge base, sorts the chunks in descending order of the scores, and returns the top K text chunks with the highest scores. Valid values:</p>
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <ul>
         * <li>qwen3-rerank-hybrid: qwen3-rerank (hybrid) reranking.</li>
         * <li>qwen3-rerank: qwen3-rerank reranking.</li>
         * <li>gte-rerank-hybrid: gte-rerank (hybrid) reranking.</li>
         * <li>gte-rerank: gte-rerank reranking.</li>
         * </ul>
         * <p>&lt;props=&quot;intl&quot;&gt;</p>
         * <ul>
         * <li>gte-rerank-hybrid: official reranking.</li>
         * <li>gte-rerank: gte-rerank reranking.</li>
         * </ul>
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <p>Default value: empty. In this case, qwen3-rerank is used.</p>
         * <blockquote>
         * <p>If you only need semantic reranking, you can use qwen3-rerank. If you need both semantic reranking and text matching features to ensure relevance, use qwen3-rerank-hybrid.</p>
         * </blockquote>
         * <p>&lt;props=&quot;intl&quot;&gt;</p>
         * <p>Default value: empty. In this case, gte-rerank-hybrid is used.</p>
         * <blockquote>
         * <p>If you only need semantic reranking, you can use gte-rerank. If you need both semantic reranking and text matching features to ensure relevance, use gte-rerank-hybrid.</p>
         * </blockquote>
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <blockquote>
         * <p>gte-rerank-hybrid and gte-rerank will stop receiving updates and are not recommended.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>gte-rerank-hybrid</p>
         */
        public Builder rerankModelName(String rerankModelName) {
            this.putQueryParameter("RerankModelName", rerankModelName);
            this.rerankModelName = rerankModelName;
            return this;
        }

        /**
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <p>The sentence separator. This parameter takes effect only when chunkMode is set to <strong>regex</strong>. In other modes, this parameter does not take effect even if it is passed. You can pass a regular expression (multiple regular expressions are not supported) to split the file into small text chunks.</p>
         * <p>When you use intelligent chunking (chunkMode is not specified), leave this parameter empty.</p>
         * <p>&lt;props=&quot;intl&quot;&gt;</p>
         * <blockquote>
         * <p>This parameter is not available. Do not pass this parameter.</p>
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
         * <p>The ID of the AnalyticDB for PostgreSQL instance. This parameter is required only when SinkType is set to ADB. Go to the <a href="https://gpdbnext.console.aliyun.com/gpdb/list">AnalyticDB for PostgreSQL Instance List</a> page to obtain the ID.</p>
         * 
         * <strong>example:</strong>
         * <p>gp-bp32109xxxx</p>
         */
        public Builder sinkInstanceId(String sinkInstanceId) {
            this.putQueryParameter("SinkInstanceId", sinkInstanceId);
            this.sinkInstanceId = sinkInstanceId;
            return this;
        }

        /**
         * <p>The region where the AnalyticDB for PostgreSQL instance resides. This parameter is required only when SinkType is set to ADB. You can call the &lt;props=&quot;china&quot;&gt;<a href="https://www.alibabacloud.com/help/en/analyticdb-for-postgresql/developer-reference/api-gpdb-2016-05-03-describeregions">DescribeRegions</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/zh/analyticdb/analyticdb-for-postgresql/developer-reference/api-gpdb-2016-05-03-describeregions?spm=a2c63.p38356.0.i3">DescribeRegions</a> operation to obtain the region list.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder sinkRegion(String sinkRegion) {
            this.putQueryParameter("SinkRegion", sinkRegion);
            this.sinkRegion = sinkRegion;
            return this;
        }

        /**
         * <p>The vector storage type of the knowledge base. For more information, refer to <a href="https://help.aliyun.com/document_detail/2807740.html">Knowledge base</a>. Valid values:</p>
         * <ul>
         * <li>BUILT_IN: stores vector data in Alibaba Cloud Model Studio.</li>
         * <li>ADB: AnalyticDB for PostgreSQL database. If you need advanced features such as managing, auditing, and monitoring the database, select ADB.<blockquote>
         * <p>If you have not used ADB storage in Alibaba Cloud Model Studio, go to the &lt;props=&quot;china&quot;&gt;<a href="https://bailian.console.aliyun.com/#/knowledge-base/create">Create Knowledge Base</a>&lt;props=&quot;intl&quot;&gt;<a href="https://bailian.console.alibabacloud.com/#/knowledge-base/create">Create Knowledge Base</a> page, select ADB-PG as the vector storage type, and complete the authorization as prompted. If you pass ADB, you must specify the SinkInstanceId and SinkRegion parameters.</p>
         * </blockquote>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>BUILT_IN</p>
         */
        public Builder sinkType(String sinkType) {
            this.putQueryParameter("SinkType", sinkType);
            this.sinkType = sinkType;
            return this;
        }

        /**
         * <blockquote>
         * <p>Notice: This parameter is required in the latest SDK version. Otherwise, an error is reported when you call the SubmitIndexJob operation: Required parameter(data_sources) missing or invalid.</notice></p>
         * </blockquote>
         * <p>The source of the imported data. Valid values:</p>
         * <ul>
         * <li>DATA_CENTER_CATEGORY: the category type. This value indicates that all files under a specified category in &lt;props=&quot;china&quot;&gt;<a href="https://bailian.console.aliyun.com/?tab=app#/data-center">Application Data</a>&lt;props=&quot;intl&quot;&gt;<a href="https://modelstudio.console.alibabacloud.com/?tab=app#/data-center">Application Data</a> are imported. You can import multiple categories at a time.</li>
         * <li>DATA_CENTER_FILE: the file type. This value indicates that specified files in &lt;props=&quot;china&quot;&gt;<a href="https://bailian.console.aliyun.com/?tab=app#/data-center">Application Data</a>&lt;props=&quot;intl&quot;&gt;<a href="https://modelstudio.console.alibabacloud.com/?tab=app#/data-center">Application Data</a> are imported. You can import multiple files at a time.</li>
         * </ul>
         * <blockquote>
         * <p>If you set this parameter to DATA_CENTER_CATEGORY, you must specify the CategoryIds parameter. If you set this parameter to DATA_CENTER_FILE, you must specify the DocumentIds parameter.</p>
         * </blockquote>
         * <blockquote>
         * <p>To create an empty knowledge base, you can use an empty category that contains no files: set this parameter to DATA_CENTER_CATEGORY and set CategoryIds to the ID of the empty category.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>DATA_CENTER_FILE</p>
         */
        public Builder sourceType(String sourceType) {
            this.putQueryParameter("SourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        /**
         * <p>The type of the knowledge base.</p>
         * <p><strong>Valid values</strong>:</p>
         * <ul>
         * <li>unstructured: a knowledge base for document search or audio and video. The default use scenario for the document search type is basic document question answering. &lt;props=&quot;china&quot;&gt;To create a knowledge base for other scenarios, you must also pass the knowledgeType and knowledgeScene parameters.</li>
         * </ul>
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <ul>
         * <li>structured: a knowledge base for data querying or image question answering.</li>
         * </ul>
         * <blockquote>
         * <p>Note that the type of a knowledge base cannot be changed after it is created.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>unstructured</p>
         */
        public Builder structureType(String structureType) {
            this.putQueryParameter("StructureType", structureType);
            this.structureType = structureType;
            return this;
        }

        /**
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <p>You can obtain the ID by clicking the ID icon next to the table name on the Tables tab of the Table Connector in <a href="https://bailian.console.aliyun.com/cn-beijing?tab=app#/connector/list">Data Connection</a>. If the list contains multiple IDs, only the first one is used.</p>
         * <p>&lt;props=&quot;intl&quot;&gt;</p>
         * <blockquote>
         * <p>This parameter is not available. Do not pass this parameter.</p>
         * </blockquote>
         */
        public Builder tableIds(java.util.List<String> tableIds) {
            String tableIdsShrink = shrink(tableIds, "TableIds", "json");
            this.putQueryParameter("TableIds", tableIdsShrink);
            this.tableIds = tableIds;
            return this;
        }

        /**
         * channelType.
         */
        public Builder channelType(String channelType) {
            this.putQueryParameter("channelType", channelType);
            this.channelType = channelType;
            return this;
        }

        /**
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <p>Enables custom chunking and specifies the chunking strategy. For more information, refer to <a href="https://help.aliyun.com/document_detail/2807740.html">Knowledge base</a>.</p>
         * <p>Valid values (you cannot pass multiple values at a time):</p>
         * <ul>
         * <li><strong>length</strong>: chunks by length. The text is strictly chunked according to the ChunkSize and OverlapSize you specify. If you do not pass these two parameters, the system uses the default values (ChunkSize is 500 and OverlapSize is 100). Chunking by length does not support Separator (it does not take effect even if passed).</li>
         * <li><strong>page</strong>: chunks by page. If ChunkSize is specified, it is considered during chunking (if not passed, the default value 500 is used). Chunking by page does not support OverlapSize and Separator (they do not take effect even if passed).</li>
         * <li><strong>h1</strong>: chunks by level-1 heading. If ChunkSize is specified, it is considered during chunking (if not passed, the default value 500 is used). Chunking by level-1 heading does not support OverlapSize and Separator (they do not take effect even if passed).</li>
         * <li><strong>h2</strong>: chunks by level-2 heading. If ChunkSize is specified, it is considered during chunking (if not passed, the default value 500 is used). Chunking by level-2 heading does not support OverlapSize and Separator (they do not take effect even if passed).</li>
         * <li><strong>regex</strong>: chunks by regular expression. In this case, you must specify the Separator parameter. If ChunkSize is specified, it is considered during chunking (if not passed, the default value 500 is used). Chunking by regular expression does not support OverlapSize (it does not take effect even if passed).</li>
         * </ul>
         * <p>Default value: empty. In this case, intelligent chunking is used.</p>
         * <p>&lt;props=&quot;intl&quot;&gt;</p>
         * <blockquote>
         * <p>This parameter is not available. Do not pass this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>regex</p>
         */
        public Builder chunkMode(String chunkMode) {
            this.putQueryParameter("chunkMode", chunkMode);
            this.chunkMode = chunkMode;
            return this;
        }

        /**
         * connectId.
         */
        public Builder connectId(String connectId) {
            this.putQueryParameter("connectId", connectId);
            this.connectId = connectId;
            return this;
        }

        /**
         * database.
         */
        public Builder database(String database) {
            this.putQueryParameter("database", database);
            this.database = database;
            return this;
        }

        /**
         * datasourceCode.
         */
        public Builder datasourceCode(String datasourceCode) {
            this.putQueryParameter("datasourceCode", datasourceCode);
            this.datasourceCode = datasourceCode;
            return this;
        }

        /**
         * <p>Specifies whether to use the first row of all .xlsx and .xls files as the header and concatenate it to each text chunk to prevent the large language model from mistakenly treating the header as a normal data row.</p>
         * <blockquote>
         * <p>Enable this feature only when all imported files are in .xlsx or .xls format and contain headers. Otherwise, do not enable it.</p>
         * </blockquote>
         * <p>Valid values:</p>
         * <ul>
         * <li>true: enabled.</li>
         * <li>false: disabled.</li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder enableHeaders(Boolean enableHeaders) {
            this.putQueryParameter("enableHeaders", enableHeaders);
            this.enableHeaders = enableHeaders;
            return this;
        }

        /**
         * knowledgeScene.
         */
        public Builder knowledgeScene(String knowledgeScene) {
            this.putQueryParameter("knowledgeScene", knowledgeScene);
            this.knowledgeScene = knowledgeScene;
            return this;
        }

        /**
         * <p>&lt;props=&quot;china&quot;&gt;
         * The specific knowledge type, which is used to further specify the type of data processed by the knowledge base.
         * <notice>This parameter must be provided or omitted together with knowledgeScene. It cannot be set separately. If both are omitted, the system uses the default configurations based on structureType.</notice></p>
         * <p><strong>Settings</strong> constraints: The value of this parameter must match the structureType you select and determines the active values for knowledgeScene.</p>
         * <p><strong>Valid values</strong>:</p>
         * <ul>
         * <li>document: document search. Must be used with structureType: unstructured.</li>
         * <li>table: data querying. Must be used with structureType: structured.</li>
         * <li>image: image question answering. Must be used with structureType: structured.</li>
         * <li>multimedia: audio and video search. Must be used with structureType: unstructured.</li>
         * </ul>
         * <p>&lt;props=&quot;intl&quot;&gt;This parameter is not available. Do not pass this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>document</p>
         */
        public Builder knowledgeType(String knowledgeType) {
            this.putQueryParameter("knowledgeType", knowledgeType);
            this.knowledgeType = knowledgeType;
            return this;
        }

        /**
         * <p>The metadata extraction configuration. Metadata is a series of additional attributes related to the content of unstructured data. These attributes are integrated into text chunks in the form of key-value pairs. For more information, refer to <a href="https://help.aliyun.com/document_detail/2807740.html">Knowledge base</a>.</p>
         */
        public Builder metaExtractColumns(java.util.List<MetaExtractColumns> metaExtractColumns) {
            String metaExtractColumnsShrink = shrink(metaExtractColumns, "metaExtractColumns", "json");
            this.putQueryParameter("metaExtractColumns", metaExtractColumnsShrink);
            this.metaExtractColumns = metaExtractColumns;
            return this;
        }

        /**
         * <p>&lt;props=&quot;china&quot;&gt;The number of RCUs for the knowledge base. This parameter is required only when pipelineCommercialType is set to enterprise. Valid values: [1, 200].</p>
         * <p>&lt;props=&quot;intl&quot;&gt;</p>
         * <blockquote>
         * <p>This parameter is not available. Do not pass this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pipelineCommercialCu(Integer pipelineCommercialCu) {
            this.putQueryParameter("pipelineCommercialCu", pipelineCommercialCu);
            this.pipelineCommercialCu = pipelineCommercialCu;
            return this;
        }

        /**
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <p>The <a href="https://help.aliyun.com/document_detail/2997110.html">edition</a> of the knowledge base. Valid values:</p>
         * <ul>
         * <li>standard: Standard Edition</li>
         * <li>enterprise: Ultimate Edition</li>
         * </ul>
         * <p>&lt;props=&quot;intl&quot;&gt;</p>
         * <blockquote>
         * <p>This parameter is not available. Do not pass this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>standard</p>
         */
        public Builder pipelineCommercialType(String pipelineCommercialType) {
            this.putQueryParameter("pipelineCommercialType", pipelineCommercialType);
            this.pipelineCommercialType = pipelineCommercialType;
            return this;
        }

        /**
         * <p>&lt;props=&quot;china&quot;&gt;The throttling handling strategy for the knowledge base dependency link. This parameter is required only when pipelineCommercialType is set to enterprise.
         * Valid values:
         * downgrade: downgrade processing (switches to lightweight link retrieval).
         * Default value: downgrade.</p>
         * <p>&lt;props=&quot;intl&quot;&gt;</p>
         * <blockquote>
         * <p>This parameter is not available. Do not pass this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>downgrade</p>
         */
        public Builder pipelineRetrieveRateLimitStrategy(String pipelineRetrieveRateLimitStrategy) {
            this.putQueryParameter("pipelineRetrieveRateLimitStrategy", pipelineRetrieveRateLimitStrategy);
            this.pipelineRetrieveRateLimitStrategy = pipelineRetrieveRateLimitStrategy;
            return this;
        }

        /**
         * table.
         */
        public Builder table(String table) {
            this.putQueryParameter("table", table);
            this.table = table;
            return this;
        }

        @Override
        public CreateIndexRequest build() {
            return new CreateIndexRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateIndexRequest} extends {@link TeaModel}
     *
     * <p>CreateIndexRequest</p>
     */
    public static class Columns extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Column")
        private String column;

        @com.aliyun.core.annotation.NameInMap("IsRecall")
        private Boolean isRecall;

        @com.aliyun.core.annotation.NameInMap("IsSearch")
        private Boolean isSearch;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Columns(Builder builder) {
            this.column = builder.column;
            this.isRecall = builder.isRecall;
            this.isSearch = builder.isSearch;
            this.name = builder.name;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Columns create() {
            return builder().build();
        }

        /**
         * @return column
         */
        public String getColumn() {
            return this.column;
        }

        /**
         * @return isRecall
         */
        public Boolean getIsRecall() {
            return this.isRecall;
        }

        /**
         * @return isSearch
         */
        public Boolean getIsSearch() {
            return this.isSearch;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String column; 
            private Boolean isRecall; 
            private Boolean isSearch; 
            private String name; 
            private String type; 

            private Builder() {
            } 

            private Builder(Columns model) {
                this.column = model.column;
                this.isRecall = model.isRecall;
                this.isSearch = model.isSearch;
                this.name = model.name;
                this.type = model.type;
            } 

            /**
             * <blockquote>
             * <p>This parameter is not available. Do not pass this parameter.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>school</p>
             */
            public Builder column(String column) {
                this.column = column;
                return this;
            }

            /**
             * <p>&lt;props=&quot;china&quot;&gt;</p>
             * <p>Specifies whether the column participates in model responses. If this parameter is set to true, the retrieval results of this column are used as input information when the large language model generates responses. Valid values:</p>
             * <ul>
             * <li>true: enabled.</li>
             * <li>false: disabled.</li>
             * </ul>
             * <p>&lt;props=&quot;intl&quot;&gt;</p>
             * <blockquote>
             * <p>This parameter is not available. Do not pass this parameter.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isRecall(Boolean isRecall) {
                this.isRecall = isRecall;
                return this;
            }

            /**
             * <p>&lt;props=&quot;china&quot;&gt;</p>
             * <p>Specifies whether the column participates in knowledge base retrieval. If this parameter is set to true, the knowledge base is allowed to search in the data of this column. Valid values:</p>
             * <ul>
             * <li>true: enabled.</li>
             * <li>false: disabled.</li>
             * </ul>
             * <p>&lt;props=&quot;intl&quot;&gt;</p>
             * <blockquote>
             * <p>This parameter is not available. Do not pass this parameter.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isSearch(Boolean isSearch) {
                this.isSearch = isSearch;
                return this;
            }

            /**
             * <p>&lt;props=&quot;china&quot;&gt;
             * The field name. The name must be consistent with the header of the data table created in Application Data.</p>
             * <p>&lt;props=&quot;intl&quot;&gt;</p>
             * <blockquote>
             * <p>This parameter is not available. Do not pass this parameter.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>School</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>&lt;props=&quot;china&quot;&gt;</p>
             * <p>The field type. The type must be consistent with the header of the data table created in Application Data. Valid values:</p>
             * <ul>
             * <li>string</li>
             * <li>double</li>
             * <li>long</li>
             * <li>datetime</li>
             * <li>image_url</li>
             * </ul>
             * <p>&lt;props=&quot;intl&quot;&gt;</p>
             * <blockquote>
             * <p>This parameter is not available. Do not pass this parameter.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>string</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Columns build() {
                return new Columns(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateIndexRequest} extends {@link TeaModel}
     *
     * <p>CreateIndexRequest</p>
     */
    public static class MetaExtractColumns extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Desc")
        private String desc;

        @com.aliyun.core.annotation.NameInMap("EnableLlm")
        private Boolean enableLlm;

        @com.aliyun.core.annotation.NameInMap("EnableSearch")
        private Boolean enableSearch;

        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private MetaExtractColumns(Builder builder) {
            this.desc = builder.desc;
            this.enableLlm = builder.enableLlm;
            this.enableSearch = builder.enableSearch;
            this.key = builder.key;
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MetaExtractColumns create() {
            return builder().build();
        }

        /**
         * @return desc
         */
        public String getDesc() {
            return this.desc;
        }

        /**
         * @return enableLlm
         */
        public Boolean getEnableLlm() {
            return this.enableLlm;
        }

        /**
         * @return enableSearch
         */
        public Boolean getEnableSearch() {
            return this.enableSearch;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String desc; 
            private Boolean enableLlm; 
            private Boolean enableSearch; 
            private String key; 
            private String type; 
            private String value; 

            private Builder() {
            } 

            private Builder(MetaExtractColumns model) {
                this.desc = model.desc;
                this.enableLlm = model.enableLlm;
                this.enableSearch = model.enableSearch;
                this.key = model.key;
                this.type = model.type;
                this.value = model.value;
            } 

            /**
             * <p>The Chinese description of the metadata field. The description must be 0 to 1,000 characters in length and can contain Chinese characters, English letters, digits, underscores (_), hyphens (-), periods (.), and colons (:). Default value: empty.</p>
             * 
             * <strong>example:</strong>
             * <p>Author name</p>
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * <p>Specifies whether the metadata field and its value participate in the response generation process of the large language model together with the content of the text chunk. Valid values:</p>
             * <ul>
             * <li>true: enabled.</li>
             * <li>false: disabled.</li>
             * </ul>
             * <p>Default value: false.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enableLlm(Boolean enableLlm) {
                this.enableLlm = enableLlm;
                return this;
            }

            /**
             * <p>Specifies whether the metadata field and its value participate in knowledge base retrieval together with the content of the text chunk. Valid values:</p>
             * <ul>
             * <li>true: enabled.</li>
             * <li>false: disabled.</li>
             * </ul>
             * <p>Default value: false.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enableSearch(Boolean enableSearch) {
                this.enableSearch = enableSearch;
                return this;
            }

            /**
             * <p>The metadata field. The field must be 1 to 50 characters in length and can contain only English letters and underscores (_). If you specify this parameter, you must also specify the Value and Type parameters.</p>
             * 
             * <strong>example:</strong>
             * <p>author</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value extraction method for the metadata field. Valid values:</p>
             * <ul>
             * <li>constant: constant.</li>
             * <li>variable: variable.</li>
             * <li>custom_prompt: large language model.</li>
             * <li>regular: regular expression.</li>
             * <li>keywords: keyword search.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>constant</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The value of the metadata field.</p>
             * 
             * <strong>example:</strong>
             * <p>Tim</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public MetaExtractColumns build() {
                return new MetaExtractColumns(this);
            } 

        } 

    }
}
