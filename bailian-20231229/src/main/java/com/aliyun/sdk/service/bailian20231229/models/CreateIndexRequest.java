// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20231229.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
    private java.util.List < String > categoryIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChunkSize")
    private Integer chunkSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Columns")
    private java.util.List < Columns> columns;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataSource")
    private DataSource dataSource;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DocumentIds")
    private java.util.List < String > documentIds;

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
    public java.util.List < String > getCategoryIds() {
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
    public java.util.List < Columns> getColumns() {
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
    public java.util.List < String > getDocumentIds() {
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

    public static final class Builder extends Request.Builder<CreateIndexRequest, Builder> {
        private String workspaceId; 
        private java.util.List < String > categoryIds; 
        private Integer chunkSize; 
        private java.util.List < Columns> columns; 
        private DataSource dataSource; 
        private String description; 
        private java.util.List < String > documentIds; 
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
        } 

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * CategoryIds.
         */
        public Builder categoryIds(java.util.List < String > categoryIds) {
            String categoryIdsShrink = shrink(categoryIds, "CategoryIds", "json");
            this.putQueryParameter("CategoryIds", categoryIdsShrink);
            this.categoryIds = categoryIds;
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
         * Columns.
         */
        public Builder columns(java.util.List < Columns> columns) {
            String columnsShrink = shrink(columns, "Columns", "json");
            this.putQueryParameter("Columns", columnsShrink);
            this.columns = columns;
            return this;
        }

        /**
         * DataSource.
         */
        public Builder dataSource(DataSource dataSource) {
            String dataSourceShrink = shrink(dataSource, "DataSource", "json");
            this.putQueryParameter("DataSource", dataSourceShrink);
            this.dataSource = dataSource;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * DocumentIds.
         */
        public Builder documentIds(java.util.List < String > documentIds) {
            String documentIdsShrink = shrink(documentIds, "DocumentIds", "json");
            this.putQueryParameter("DocumentIds", documentIdsShrink);
            this.documentIds = documentIds;
            return this;
        }

        /**
         * EmbeddingModelName.
         */
        public Builder embeddingModelName(String embeddingModelName) {
            this.putQueryParameter("EmbeddingModelName", embeddingModelName);
            this.embeddingModelName = embeddingModelName;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
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
         * RerankMinScore.
         */
        public Builder rerankMinScore(Double rerankMinScore) {
            this.putQueryParameter("RerankMinScore", rerankMinScore);
            this.rerankMinScore = rerankMinScore;
            return this;
        }

        /**
         * RerankModelName.
         */
        public Builder rerankModelName(String rerankModelName) {
            this.putQueryParameter("RerankModelName", rerankModelName);
            this.rerankModelName = rerankModelName;
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
         * SinkInstanceId.
         */
        public Builder sinkInstanceId(String sinkInstanceId) {
            this.putQueryParameter("SinkInstanceId", sinkInstanceId);
            this.sinkInstanceId = sinkInstanceId;
            return this;
        }

        /**
         * SinkRegion.
         */
        public Builder sinkRegion(String sinkRegion) {
            this.putQueryParameter("SinkRegion", sinkRegion);
            this.sinkRegion = sinkRegion;
            return this;
        }

        /**
         * SinkType.
         */
        public Builder sinkType(String sinkType) {
            this.putQueryParameter("SinkType", sinkType);
            this.sinkType = sinkType;
            return this;
        }

        /**
         * SourceType.
         */
        public Builder sourceType(String sourceType) {
            this.putQueryParameter("SourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        /**
         * StructureType.
         */
        public Builder structureType(String structureType) {
            this.putQueryParameter("StructureType", structureType);
            this.structureType = structureType;
            return this;
        }

        @Override
        public CreateIndexRequest build() {
            return new CreateIndexRequest(this);
        } 

    } 

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
             * Name.
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
             * CredentialId.
             */
            public Builder credentialId(String credentialId) {
                this.credentialId = credentialId;
                return this;
            }

            /**
             * CredentialKey.
             */
            public Builder credentialKey(String credentialKey) {
                this.credentialKey = credentialKey;
                return this;
            }

            /**
             * Database.
             */
            public Builder database(String database) {
                this.database = database;
                return this;
            }

            /**
             * Endpoint.
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * IsPrivateLink.
             */
            public Builder isPrivateLink(Boolean isPrivateLink) {
                this.isPrivateLink = isPrivateLink;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * SubPath.
             */
            public Builder subPath(String subPath) {
                this.subPath = subPath;
                return this;
            }

            /**
             * SubType.
             */
            public Builder subType(String subType) {
                this.subType = subType;
                return this;
            }

            /**
             * Table.
             */
            public Builder table(String table) {
                this.table = table;
                return this;
            }

            /**
             * Type.
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
}
