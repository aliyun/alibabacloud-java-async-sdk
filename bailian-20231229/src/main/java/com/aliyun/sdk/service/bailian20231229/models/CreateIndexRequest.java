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
    @com.aliyun.core.annotation.NameInMap("DataSource")
    private DataSource dataSource;

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
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OverlapSize")
    private Integer overlapSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RerankMinScore")
    private Double rerankMinScore;

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
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StructureType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String structureType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("metaExtractColumns")
    private java.util.List<MetaExtractColumns> metaExtractColumns;

    private CreateIndexRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.categoryIds = builder.categoryIds;
        this.chunkSize = builder.chunkSize;
        this.columns = builder.columns;
        this.dataSource = builder.dataSource;
        this.description = builder.description;
        this.documentIds = builder.documentIds;
        this.embeddingModelName = builder.embeddingModelName;
        this.name = builder.name;
        this.overlapSize = builder.overlapSize;
        this.rerankMinScore = builder.rerankMinScore;
        this.rerankModelName = builder.rerankModelName;
        this.separator = builder.separator;
        this.sinkInstanceId = builder.sinkInstanceId;
        this.sinkRegion = builder.sinkRegion;
        this.sinkType = builder.sinkType;
        this.sourceType = builder.sourceType;
        this.structureType = builder.structureType;
        this.metaExtractColumns = builder.metaExtractColumns;
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
     * @return dataSource
     */
    public DataSource getDataSource() {
        return this.dataSource;
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
     * @return rerankMinScore
     */
    public Double getRerankMinScore() {
        return this.rerankMinScore;
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
     * @return metaExtractColumns
     */
    public java.util.List<MetaExtractColumns> getMetaExtractColumns() {
        return this.metaExtractColumns;
    }

    public static final class Builder extends Request.Builder<CreateIndexRequest, Builder> {
        private String workspaceId; 
        private java.util.List<String> categoryIds; 
        private Integer chunkSize; 
        private java.util.List<Columns> columns; 
        private DataSource dataSource; 
        private String description; 
        private java.util.List<String> documentIds; 
        private String embeddingModelName; 
        private String name; 
        private Integer overlapSize; 
        private Double rerankMinScore; 
        private String rerankModelName; 
        private String separator; 
        private String sinkInstanceId; 
        private String sinkRegion; 
        private String sinkType; 
        private String sourceType; 
        private String structureType; 
        private java.util.List<MetaExtractColumns> metaExtractColumns; 

        private Builder() {
            super();
        } 

        private Builder(CreateIndexRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.categoryIds = request.categoryIds;
            this.chunkSize = request.chunkSize;
            this.columns = request.columns;
            this.dataSource = request.dataSource;
            this.description = request.description;
            this.documentIds = request.documentIds;
            this.embeddingModelName = request.embeddingModelName;
            this.name = request.name;
            this.overlapSize = request.overlapSize;
            this.rerankMinScore = request.rerankMinScore;
            this.rerankModelName = request.rerankModelName;
            this.separator = request.separator;
            this.sinkInstanceId = request.sinkInstanceId;
            this.sinkRegion = request.sinkRegion;
            this.sinkType = request.sinkType;
            this.sourceType = request.sourceType;
            this.structureType = request.structureType;
            this.metaExtractColumns = request.metaExtractColumns;
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
         * <p>The list of primary key IDs of the categories to be imported into the knowledge base.</p>
         */
        public Builder categoryIds(java.util.List<String> categoryIds) {
            String categoryIdsShrink = shrink(categoryIds, "CategoryIds", "json");
            this.putQueryParameter("CategoryIds", categoryIdsShrink);
            this.categoryIds = categoryIds;
            return this;
        }

        /**
         * <p>The estimated length of chunks. The maximum number of characters for a chunk. Texts exceeding this limit are splited. For more information, see <a href="https://www.alibabacloud.com/help/en/model-studio/user-guide/rag-knowledge-base">Create a knowledge base</a>. Valid values: [1-2048].</p>
         * <p>The default value is empty, which means using the intelligent splitting method.</p>
         * <blockquote>
         * <p> If you specify the <code>ChunkSize</code> parameter, you must also specify the <code>OverlapSize</code> and <code>Separator</code> parameters. If you do not specify these three parameters, the system uses the intelligent splitting method by default.</p>
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
         * Columns.
         */
        public Builder columns(java.util.List<Columns> columns) {
            String columnsShrink = shrink(columns, "Columns", "json");
            this.putQueryParameter("Columns", columnsShrink);
            this.columns = columns;
            return this;
        }

        /**
         * <blockquote>
         * <p> This parameter is not available. Do not specify this parameter.</p>
         * </blockquote>
         */
        public Builder dataSource(DataSource dataSource) {
            String dataSourceShrink = shrink(dataSource, "DataSource", "json");
            this.putQueryParameter("DataSource", dataSourceShrink);
            this.dataSource = dataSource;
            return this;
        }

        /**
         * <p>The description of the knowledge base. The description must be 0 to 1,000 characters in length. This parameter is empty by default.</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The list of primary key IDs of the documents to be imported into the knowledge base.</p>
         */
        public Builder documentIds(java.util.List<String> documentIds) {
            String documentIdsShrink = shrink(documentIds, "DocumentIds", "json");
            this.putQueryParameter("DocumentIds", documentIdsShrink);
            this.documentIds = documentIds;
            return this;
        }

        /**
         * <p>The name of the embedding model. The embedding model converts the original input prompt and knowledge text into numerical vectors for similarity comparison. The default and only model available is DashScope text-embedding-v2. It supports multiple languages including Chinese and English and normalizes the vector results. For more information, see <a href="https://www.alibabacloud.com/help/en/model-studio/user-guide/rag-knowledge-base">Create a knowledge base</a>. Valid value:</p>
         * <ul>
         * <li>text-embedding-v2</li>
         * </ul>
         * <p>The default value is null, which means using the text-embedding-v2 model.</p>
         * 
         * <strong>example:</strong>
         * <p>text-embedding-v2</p>
         */
        public Builder embeddingModelName(String embeddingModelName) {
            this.putQueryParameter("EmbeddingModelName", embeddingModelName);
            this.embeddingModelName = embeddingModelName;
            return this;
        }

        /**
         * <p>The name of the knowledge base. The name must be 1 to 20 characters in length and can contain characters classified as letter in Unicode, including English letters, Chinese characters, digits, among others. The name can also contain colons (:), underscores (_), periods (.), and hyphens (-).</p>
         * <p>This parameter is required.</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The overlap length. The number of overlapping characters between two consecutive chunks. For more information, see <a href="https://www.alibabacloud.com/help/en/model-studio/user-guide/rag-knowledge-base">Create a knowledge base</a>. Valid values: 0 to 1024.</p>
         * <p>The default value is empty, which means using the intelligent splitting method.</p>
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
         * <p>Similarity Threshold. The lowest similarity score of chunks that can be returned. This parameter is used to filter text chunks returned by the rank model. For more information, see <a href="https://www.alibabacloud.com/help/en/model-studio/user-guide/rag-knowledge-base">Create a knowledge base</a>. Valid values: [0.01-1.00].</p>
         * <p>Default value: 0.20.</p>
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
         * <p>The name of the rank model. The rank model is a scoring system outside the knowledge base. It calculates the similarity score of each text chunk in the input question and knowledge base and ranks them in descending order. Then, the model returns the top K chunks with the highest scores. For more information, see <a href="https://www.alibabacloud.com/help/en/model-studio/user-guide/rag-knowledge-base">Create a knowledge base</a>. Valid values:</p>
         * <ul>
         * <li>gte-rerank-hybrid</li>
         * <li>gte-rerank</li>
         * </ul>
         * <p>The default value is empty, which means using the official gte-rerank-hybrid model.</p>
         * <blockquote>
         * <p> If you need only semantic ranking, we recommend that you use gte-rerank. If you need both semantic ranking and text matching features to ensure relevance, we recommend that you use gte-rerank-hybrid.</p>
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
         * <p>The clause identifier. The document is split into chunks based on this identifier. For more information, see <a href="https://www.alibabacloud.com/help/en/model-studio/user-guide/rag-knowledge-base">Create a knowledge base</a>. You can specify multiple identifiers and do not need to add any other characters to separate them. For example: !,\\n. Valid values:</p>
         * <ul>
         * <li>\n: line break</li>
         * <li>，: Chinese comma</li>
         * <li>,: English comma</li>
         * <li>。 : Chinese full stop</li>
         * <li>.: English full stop</li>
         * <li>！ : Chinese exclamation point</li>
         * <li>! : English exclamation point</li>
         * <li>；: Chinese semicolon</li>
         * <li>;: English semicolon</li>
         * <li>？: Chinese question mark</li>
         * <li>?: English question mark</li>
         * </ul>
         * <p>The default value is empty, which means using the intelligent splitting method.</p>
         * 
         * <strong>example:</strong>
         * <p>,</p>
         */
        public Builder separator(String separator) {
            this.putQueryParameter("Separator", separator);
            this.separator = separator;
            return this;
        }

        /**
         * <p>The ID of the vector storage instance. This parameter is available only when SinkType is set to ADB. You can view the ID on the <a href="https://gpdbnext.console.aliyun.com/gpdb/list">Instances</a> page of AnalyticDB for PostgreSQL.</p>
         * 
         * <strong>example:</strong>
         * <p>gp-bp321093j84</p>
         */
        public Builder sinkInstanceId(String sinkInstanceId) {
            this.putQueryParameter("SinkInstanceId", sinkInstanceId);
            this.sinkInstanceId = sinkInstanceId;
            return this;
        }

        /**
         * <p>The region of the vector storage instance. This parameter is available only when SinkType is set to ADB. You can call the <a href="https://www.alibabacloud.com/help/en/analyticdb/analyticdb-for-postgresql/developer-reference/api-gpdb-2016-05-03-describeregions">DescribeRegions</a> operation to query the most recent region list.</p>
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
         * <p>The vector storage type of the knowledge base. For more information, see <a href="https://www.alibabacloud.com/help/en/model-studio/user-guide/rag-knowledge-base">Create a knowledge base</a>. Valid values:</p>
         * <ul>
         * <li>DEFAULT: The built-in vector database.</li>
         * <li>ADB: AnalyticDB for PostgreSQL database. If you need advanced features, such as managing, auditing, and monitoring, we recommend that you specify ADB.</li>
         * </ul>
         * <blockquote>
         * <p> If you have not used AnalyticDB for AnalyticDB in Model Studio before, go to the <a href="https://bailian.console.aliyun.com/#/knowledge-base/create">Create Knowledge Base</a> page, select ADB-PG as Vector Storage Type, and follow the instructions to grant permissions. If you specify ADB, you must also specify the <code>SinkInstanceId</code> and <code>SinkRegion</code> parameters.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DEFAULT</p>
         */
        public Builder sinkType(String sinkType) {
            this.putQueryParameter("SinkType", sinkType);
            this.sinkType = sinkType;
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
         * <blockquote>
         * <p> If you want to create an empty knowledge base, you can use an empty category. Set this parameter to DATA_CENTER_CATEGORY. And specify the ID of an empty category for the <code>CategoryIds</code> parameter.</p>
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

        /**
         * <p>The data type of the knowledge base. For more information, see <a href="https://www.alibabacloud.com/help/en/model-studio/user-guide/rag-knowledge-base">Create a knowledge base</a>. Valid value:</p>
         * <ul>
         * <li>unstructured</li>
         * </ul>
         * <blockquote>
         * <p> After a knowledge base is created, its data type cannot be changed. You cannot create a structured knowledge base by calling an API operation. Use the console instead.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>structured</p>
         */
        public Builder structureType(String structureType) {
            this.putQueryParameter("StructureType", structureType);
            this.structureType = structureType;
            return this;
        }

        /**
         * metaExtractColumns.
         */
        public Builder metaExtractColumns(java.util.List<MetaExtractColumns> metaExtractColumns) {
            String metaExtractColumnsShrink = shrink(metaExtractColumns, "metaExtractColumns", "json");
            this.putQueryParameter("metaExtractColumns", metaExtractColumnsShrink);
            this.metaExtractColumns = metaExtractColumns;
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

            /**
             * Column.
             */
            public Builder column(String column) {
                this.column = column;
                return this;
            }

            /**
             * IsRecall.
             */
            public Builder isRecall(Boolean isRecall) {
                this.isRecall = isRecall;
                return this;
            }

            /**
             * IsSearch.
             */
            public Builder isSearch(Boolean isSearch) {
                this.isSearch = isSearch;
                return this;
            }

            /**
             * <p>The name of the knowledge base. The name must be 1 to 20 characters in length and can contain characters classified as letter in Unicode, including English letters, Chinese characters, digits, among others. The name can also contain colons (:), underscores (_), periods (.), and hyphens (-).</p>
             * <p>This parameter is required.</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Type.
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
    public static class DataSource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CredentialId")
        private String credentialId;

        @com.aliyun.core.annotation.NameInMap("CredentialKey")
        private String credentialKey;

        @com.aliyun.core.annotation.NameInMap("Database")
        private String database;

        @com.aliyun.core.annotation.NameInMap("Endpoint")
        private String endpoint;

        @com.aliyun.core.annotation.NameInMap("IsPrivateLink")
        private Boolean isPrivateLink;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("SubPath")
        private String subPath;

        @com.aliyun.core.annotation.NameInMap("SubType")
        private String subType;

        @com.aliyun.core.annotation.NameInMap("Table")
        private String table;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private DataSource(Builder builder) {
            this.credentialId = builder.credentialId;
            this.credentialKey = builder.credentialKey;
            this.database = builder.database;
            this.endpoint = builder.endpoint;
            this.isPrivateLink = builder.isPrivateLink;
            this.region = builder.region;
            this.subPath = builder.subPath;
            this.subType = builder.subType;
            this.table = builder.table;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataSource create() {
            return builder().build();
        }

        /**
         * @return credentialId
         */
        public String getCredentialId() {
            return this.credentialId;
        }

        /**
         * @return credentialKey
         */
        public String getCredentialKey() {
            return this.credentialKey;
        }

        /**
         * @return database
         */
        public String getDatabase() {
            return this.database;
        }

        /**
         * @return endpoint
         */
        public String getEndpoint() {
            return this.endpoint;
        }

        /**
         * @return isPrivateLink
         */
        public Boolean getIsPrivateLink() {
            return this.isPrivateLink;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return subPath
         */
        public String getSubPath() {
            return this.subPath;
        }

        /**
         * @return subType
         */
        public String getSubType() {
            return this.subType;
        }

        /**
         * @return table
         */
        public String getTable() {
            return this.table;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String credentialId; 
            private String credentialKey; 
            private String database; 
            private String endpoint; 
            private Boolean isPrivateLink; 
            private String region; 
            private String subPath; 
            private String subType; 
            private String table; 
            private String type; 

            /**
             * <blockquote>
             * <p> This parameter is not available. Do not specify this parameter.</p>
             * </blockquote>
             */
            public Builder credentialId(String credentialId) {
                this.credentialId = credentialId;
                return this;
            }

            /**
             * <blockquote>
             * <p> This parameter is not available. Do not specify this parameter.</p>
             * </blockquote>
             */
            public Builder credentialKey(String credentialKey) {
                this.credentialKey = credentialKey;
                return this;
            }

            /**
             * <blockquote>
             * <p> This parameter is not available. Do not specify this parameter.</p>
             * </blockquote>
             */
            public Builder database(String database) {
                this.database = database;
                return this;
            }

            /**
             * <blockquote>
             * <p> This parameter is not available. Do not specify this parameter.</p>
             * </blockquote>
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * <blockquote>
             * <p> This parameter is not available. Do not specify this parameter.</p>
             * </blockquote>
             */
            public Builder isPrivateLink(Boolean isPrivateLink) {
                this.isPrivateLink = isPrivateLink;
                return this;
            }

            /**
             * <blockquote>
             * <p> This parameter is not available. Do not specify this parameter.</p>
             * </blockquote>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <blockquote>
             * <p> This parameter is not available. Do not specify this parameter.</p>
             * </blockquote>
             */
            public Builder subPath(String subPath) {
                this.subPath = subPath;
                return this;
            }

            /**
             * <blockquote>
             * <p> This parameter is not available. Do not specify this parameter.</p>
             * </blockquote>
             */
            public Builder subType(String subType) {
                this.subType = subType;
                return this;
            }

            /**
             * <blockquote>
             * <p> This parameter is not available. Do not specify this parameter.</p>
             * </blockquote>
             */
            public Builder table(String table) {
                this.table = table;
                return this;
            }

            /**
             * <blockquote>
             * <p> This parameter is not available. Do not specify this parameter.</p>
             * </blockquote>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public DataSource build() {
                return new DataSource(this);
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

            /**
             * Desc.
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * EnableLlm.
             */
            public Builder enableLlm(Boolean enableLlm) {
                this.enableLlm = enableLlm;
                return this;
            }

            /**
             * EnableSearch.
             */
            public Builder enableSearch(Boolean enableSearch) {
                this.enableSearch = enableSearch;
                return this;
            }

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <blockquote>
             * <p> This parameter is not available. Do not specify this parameter.</p>
             * </blockquote>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Value.
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
