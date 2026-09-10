// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribeKnowledgeBaseFilesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeKnowledgeBaseFilesResponseBody</p>
 */
public class DescribeKnowledgeBaseFilesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageRecordCount")
    private Integer pageRecordCount;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalRecordCount")
    private Integer totalRecordCount;

    private DescribeKnowledgeBaseFilesResponseBody(Builder builder) {
        this.items = builder.items;
        this.pageNumber = builder.pageNumber;
        this.pageRecordCount = builder.pageRecordCount;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeKnowledgeBaseFilesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageRecordCount
     */
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalRecordCount
     */
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static final class Builder {
        private java.util.List<Items> items; 
        private Integer pageNumber; 
        private Integer pageRecordCount; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalRecordCount; 

        private Builder() {
        } 

        private Builder(DescribeKnowledgeBaseFilesResponseBody model) {
            this.items = model.items;
            this.pageNumber = model.pageNumber;
            this.pageRecordCount = model.pageRecordCount;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalRecordCount = model.totalRecordCount;
        } 

        /**
         * <p>The list of files.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of records on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>9</p>
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * <p>The number of records per page. Valid values: <strong>30</strong>, <strong>50</strong>, and <strong>100</strong>.</p>
         * <p>Default value: <strong>30</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>CED079B7-A408-41A1-BFF1-EC608E******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>9</p>
         */
        public Builder totalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeKnowledgeBaseFilesResponseBody build() {
            return new DescribeKnowledgeBaseFilesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeKnowledgeBaseFilesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeKnowledgeBaseFilesResponseBody</p>
     */
    public static class Parameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MaxTokens")
        private Integer maxTokens;

        @com.aliyun.core.annotation.NameInMap("MergePeers")
        private Boolean mergePeers;

        private Parameters(Builder builder) {
            this.maxTokens = builder.maxTokens;
            this.mergePeers = builder.mergePeers;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Parameters create() {
            return builder().build();
        }

        /**
         * @return maxTokens
         */
        public Integer getMaxTokens() {
            return this.maxTokens;
        }

        /**
         * @return mergePeers
         */
        public Boolean getMergePeers() {
            return this.mergePeers;
        }

        public static final class Builder {
            private Integer maxTokens; 
            private Boolean mergePeers; 

            private Builder() {
            } 

            private Builder(Parameters model) {
                this.maxTokens = model.maxTokens;
                this.mergePeers = model.mergePeers;
            } 

            /**
             * <p>The maximum number of tokens per shard.</p>
             * 
             * <strong>example:</strong>
             * <p>512</p>
             */
            public Builder maxTokens(Integer maxTokens) {
                this.maxTokens = maxTokens;
                return this;
            }

            /**
             * <p>Specifies whether to merge adjacent small shards under the same heading.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder mergePeers(Boolean mergePeers) {
                this.mergePeers = mergePeers;
                return this;
            }

            public Parameters build() {
                return new Parameters(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeKnowledgeBaseFilesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeKnowledgeBaseFilesResponseBody</p>
     */
    public static class DefaultStrategy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Parameters")
        private Parameters parameters;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private DefaultStrategy(Builder builder) {
            this.parameters = builder.parameters;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DefaultStrategy create() {
            return builder().build();
        }

        /**
         * @return parameters
         */
        public Parameters getParameters() {
            return this.parameters;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Parameters parameters; 
            private String type; 

            private Builder() {
            } 

            private Builder(DefaultStrategy model) {
                this.parameters = model.parameters;
                this.type = model.type;
            } 

            /**
             * <p>The parameter list.</p>
             */
            public Builder parameters(Parameters parameters) {
                this.parameters = parameters;
                return this;
            }

            /**
             * <p>The default chunking strategy type. Valid values: hybrid and hierarchical.</p>
             * 
             * <strong>example:</strong>
             * <p>hybrid</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public DefaultStrategy build() {
                return new DefaultStrategy(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeKnowledgeBaseFilesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeKnowledgeBaseFilesResponseBody</p>
     */
    public static class Match extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContentType")
        private String contentType;

        private Match(Builder builder) {
            this.contentType = builder.contentType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Match create() {
            return builder().build();
        }

        /**
         * @return contentType
         */
        public String getContentType() {
            return this.contentType;
        }

        public static final class Builder {
            private String contentType; 

            private Builder() {
            } 

            private Builder(Match model) {
                this.contentType = model.contentType;
            } 

            /**
             * <p>The content type. Currently, table is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>table</p>
             */
            public Builder contentType(String contentType) {
                this.contentType = contentType;
                return this;
            }

            public Match build() {
                return new Match(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeKnowledgeBaseFilesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeKnowledgeBaseFilesResponseBody</p>
     */
    public static class StrategyParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MarkdownTables")
        private String markdownTables;

        @com.aliyun.core.annotation.NameInMap("MaxTokens")
        private Integer maxTokens;

        private StrategyParameters(Builder builder) {
            this.markdownTables = builder.markdownTables;
            this.maxTokens = builder.maxTokens;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StrategyParameters create() {
            return builder().build();
        }

        /**
         * @return markdownTables
         */
        public String getMarkdownTables() {
            return this.markdownTables;
        }

        /**
         * @return maxTokens
         */
        public Integer getMaxTokens() {
            return this.maxTokens;
        }

        public static final class Builder {
            private String markdownTables; 
            private Integer maxTokens; 

            private Builder() {
            } 

            private Builder(StrategyParameters model) {
                this.markdownTables = model.markdownTables;
                this.maxTokens = model.maxTokens;
            } 

            /**
             * <p>The Markdown table processing mode. Valid values: auto, on, and off.</p>
             * 
             * <strong>example:</strong>
             * <p>auto</p>
             */
            public Builder markdownTables(String markdownTables) {
                this.markdownTables = markdownTables;
                return this;
            }

            /**
             * <p>The maximum number of tokens per shard for matched content.</p>
             * 
             * <strong>example:</strong>
             * <p>512</p>
             */
            public Builder maxTokens(Integer maxTokens) {
                this.maxTokens = maxTokens;
                return this;
            }

            public StrategyParameters build() {
                return new StrategyParameters(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeKnowledgeBaseFilesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeKnowledgeBaseFilesResponseBody</p>
     */
    public static class Strategy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Parameters")
        private StrategyParameters parameters;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Strategy(Builder builder) {
            this.parameters = builder.parameters;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Strategy create() {
            return builder().build();
        }

        /**
         * @return parameters
         */
        public StrategyParameters getParameters() {
            return this.parameters;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private StrategyParameters parameters; 
            private String type; 

            private Builder() {
            } 

            private Builder(Strategy model) {
                this.parameters = model.parameters;
                this.type = model.type;
            } 

            /**
             * <p>The parameter list.</p>
             */
            public Builder parameters(StrategyParameters parameters) {
                this.parameters = parameters;
                return this;
            }

            /**
             * <p>The chunking strategy type applied after a rule is matched.</p>
             * 
             * <strong>example:</strong>
             * <p>hierarchical</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Strategy build() {
                return new Strategy(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeKnowledgeBaseFilesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeKnowledgeBaseFilesResponseBody</p>
     */
    public static class Rules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Match")
        private Match match;

        @com.aliyun.core.annotation.NameInMap("Strategy")
        private Strategy strategy;

        private Rules(Builder builder) {
            this.match = builder.match;
            this.strategy = builder.strategy;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rules create() {
            return builder().build();
        }

        /**
         * @return match
         */
        public Match getMatch() {
            return this.match;
        }

        /**
         * @return strategy
         */
        public Strategy getStrategy() {
            return this.strategy;
        }

        public static final class Builder {
            private Match match; 
            private Strategy strategy; 

            private Builder() {
            } 

            private Builder(Rules model) {
                this.match = model.match;
                this.strategy = model.strategy;
            } 

            /**
             * <p>The content type. Currently, table is supported.</p>
             */
            public Builder match(Match match) {
                this.match = match;
                return this;
            }

            /**
             * <p>The chunking strategy.</p>
             */
            public Builder strategy(Strategy strategy) {
                this.strategy = strategy;
                return this;
            }

            public Rules build() {
                return new Rules(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeKnowledgeBaseFilesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeKnowledgeBaseFilesResponseBody</p>
     */
    public static class ShardingStrategyConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DefaultStrategy")
        private DefaultStrategy defaultStrategy;

        @com.aliyun.core.annotation.NameInMap("Rules")
        private java.util.List<Rules> rules;

        private ShardingStrategyConfig(Builder builder) {
            this.defaultStrategy = builder.defaultStrategy;
            this.rules = builder.rules;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ShardingStrategyConfig create() {
            return builder().build();
        }

        /**
         * @return defaultStrategy
         */
        public DefaultStrategy getDefaultStrategy() {
            return this.defaultStrategy;
        }

        /**
         * @return rules
         */
        public java.util.List<Rules> getRules() {
            return this.rules;
        }

        public static final class Builder {
            private DefaultStrategy defaultStrategy; 
            private java.util.List<Rules> rules; 

            private Builder() {
            } 

            private Builder(ShardingStrategyConfig model) {
                this.defaultStrategy = model.defaultStrategy;
                this.rules = model.rules;
            } 

            /**
             * <p>The default chunking strategy type. Valid values: hybrid and hierarchical.</p>
             */
            public Builder defaultStrategy(DefaultStrategy defaultStrategy) {
                this.defaultStrategy = defaultStrategy;
                return this;
            }

            /**
             * <p>The list of override rules matched in order.</p>
             */
            public Builder rules(java.util.List<Rules> rules) {
                this.rules = rules;
                return this;
            }

            public ShardingStrategyConfig build() {
                return new ShardingStrategyConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeKnowledgeBaseFilesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeKnowledgeBaseFilesResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("FileId")
        private String fileId;

        @com.aliyun.core.annotation.NameInMap("FileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("FileSize")
        private Long fileSize;

        @com.aliyun.core.annotation.NameInMap("FileType")
        private String fileType;

        @com.aliyun.core.annotation.NameInMap("InheritSpaceStrategy")
        private Boolean inheritSpaceStrategy;

        @com.aliyun.core.annotation.NameInMap("KnowledgeBaseId")
        private String knowledgeBaseId;

        @com.aliyun.core.annotation.NameInMap("KnowledgeSpaceId")
        private String knowledgeSpaceId;

        @com.aliyun.core.annotation.NameInMap("Metadata")
        private java.util.Map<String, ?> metadata;

        @com.aliyun.core.annotation.NameInMap("OSSPath")
        private String OSSPath;

        @com.aliyun.core.annotation.NameInMap("ShardCount")
        private Integer shardCount;

        @com.aliyun.core.annotation.NameInMap("ShardingStrategyConfig")
        private ShardingStrategyConfig shardingStrategyConfig;

        @com.aliyun.core.annotation.NameInMap("SourceType")
        private String sourceType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UpdatedAt")
        private String updatedAt;

        @com.aliyun.core.annotation.NameInMap("UploadTime")
        private String uploadTime;

        private Items(Builder builder) {
            this.errorMessage = builder.errorMessage;
            this.fileId = builder.fileId;
            this.fileName = builder.fileName;
            this.fileSize = builder.fileSize;
            this.fileType = builder.fileType;
            this.inheritSpaceStrategy = builder.inheritSpaceStrategy;
            this.knowledgeBaseId = builder.knowledgeBaseId;
            this.knowledgeSpaceId = builder.knowledgeSpaceId;
            this.metadata = builder.metadata;
            this.OSSPath = builder.OSSPath;
            this.shardCount = builder.shardCount;
            this.shardingStrategyConfig = builder.shardingStrategyConfig;
            this.sourceType = builder.sourceType;
            this.status = builder.status;
            this.updatedAt = builder.updatedAt;
            this.uploadTime = builder.uploadTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return fileId
         */
        public String getFileId() {
            return this.fileId;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return fileSize
         */
        public Long getFileSize() {
            return this.fileSize;
        }

        /**
         * @return fileType
         */
        public String getFileType() {
            return this.fileType;
        }

        /**
         * @return inheritSpaceStrategy
         */
        public Boolean getInheritSpaceStrategy() {
            return this.inheritSpaceStrategy;
        }

        /**
         * @return knowledgeBaseId
         */
        public String getKnowledgeBaseId() {
            return this.knowledgeBaseId;
        }

        /**
         * @return knowledgeSpaceId
         */
        public String getKnowledgeSpaceId() {
            return this.knowledgeSpaceId;
        }

        /**
         * @return metadata
         */
        public java.util.Map<String, ?> getMetadata() {
            return this.metadata;
        }

        /**
         * @return OSSPath
         */
        public String getOSSPath() {
            return this.OSSPath;
        }

        /**
         * @return shardCount
         */
        public Integer getShardCount() {
            return this.shardCount;
        }

        /**
         * @return shardingStrategyConfig
         */
        public ShardingStrategyConfig getShardingStrategyConfig() {
            return this.shardingStrategyConfig;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return updatedAt
         */
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        /**
         * @return uploadTime
         */
        public String getUploadTime() {
            return this.uploadTime;
        }

        public static final class Builder {
            private String errorMessage; 
            private String fileId; 
            private String fileName; 
            private Long fileSize; 
            private String fileType; 
            private Boolean inheritSpaceStrategy; 
            private String knowledgeBaseId; 
            private String knowledgeSpaceId; 
            private java.util.Map<String, ?> metadata; 
            private String OSSPath; 
            private Integer shardCount; 
            private ShardingStrategyConfig shardingStrategyConfig; 
            private String sourceType; 
            private String status; 
            private String updatedAt; 
            private String uploadTime; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.errorMessage = model.errorMessage;
                this.fileId = model.fileId;
                this.fileName = model.fileName;
                this.fileSize = model.fileSize;
                this.fileType = model.fileType;
                this.inheritSpaceStrategy = model.inheritSpaceStrategy;
                this.knowledgeBaseId = model.knowledgeBaseId;
                this.knowledgeSpaceId = model.knowledgeSpaceId;
                this.metadata = model.metadata;
                this.OSSPath = model.OSSPath;
                this.shardCount = model.shardCount;
                this.shardingStrategyConfig = model.shardingStrategyConfig;
                this.sourceType = model.sourceType;
                this.status = model.status;
                this.updatedAt = model.updatedAt;
                this.uploadTime = model.uploadTime;
            } 

            /**
             * <p>The error message.</p>
             * 
             * <strong>example:</strong>
             * <p>Not Support.</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The file ID.</p>
             * 
             * <strong>example:</strong>
             * <p>5b2dbb13-xxxx-xxxx-xxxx-a55fe8daec8f</p>
             */
            public Builder fileId(String fileId) {
                this.fileId = fileId;
                return this;
            }

            /**
             * <p>The file name.</p>
             * 
             * <strong>example:</strong>
             * <p>Financial_report.pdf</p>
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * <p>The file size, in bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>318881</p>
             */
            public Builder fileSize(Long fileSize) {
                this.fileSize = fileSize;
                return this;
            }

            /**
             * <p>The file type.</p>
             * 
             * <strong>example:</strong>
             * <p>pdf</p>
             */
            public Builder fileType(String fileType) {
                this.fileType = fileType;
                return this;
            }

            /**
             * <p>Indicates whether the chunking strategy is inherited from the knowledge space.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder inheritSpaceStrategy(Boolean inheritSpaceStrategy) {
                this.inheritSpaceStrategy = inheritSpaceStrategy;
                return this;
            }

            /**
             * <p>The knowledge base ID.</p>
             * 
             * <strong>example:</strong>
             * <p>pkb-xxxxxx</p>
             */
            public Builder knowledgeBaseId(String knowledgeBaseId) {
                this.knowledgeBaseId = knowledgeBaseId;
                return this;
            }

            /**
             * <p>The knowledge space ID.</p>
             * 
             * <strong>example:</strong>
             * <p>pks-xxxxxx</p>
             */
            public Builder knowledgeSpaceId(String knowledgeSpaceId) {
                this.knowledgeSpaceId = knowledgeSpaceId;
                return this;
            }

            /**
             * <p>The document metadata.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder metadata(java.util.Map<String, ?> metadata) {
                this.metadata = metadata;
                return this;
            }

            /**
             * <p>The OSS file path.</p>
             * 
             * <strong>example:</strong>
             * <p>oss://test-bucket-example/pks-xxxx/pkb-xxxx/Financial_report.pdf</p>
             */
            public Builder OSSPath(String OSSPath) {
                this.OSSPath = OSSPath;
                return this;
            }

            /**
             * <p>The number of shards.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder shardCount(Integer shardCount) {
                this.shardCount = shardCount;
                return this;
            }

            /**
             * <p>The chunking strategy configuration currently in effect for the document. This value may be empty if the complete configuration was not saved for existing objects.</p>
             */
            public Builder shardingStrategyConfig(ShardingStrategyConfig shardingStrategyConfig) {
                this.shardingStrategyConfig = shardingStrategyConfig;
                return this;
            }

            /**
             * <p>The source type.</p>
             * 
             * <strong>example:</strong>
             * <p>OSS</p>
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * <p>The status.</p>
             * 
             * <strong>example:</strong>
             * <p>COMPLETED</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The update time.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-06-15T22:28:53Z</p>
             */
            public Builder updatedAt(String updatedAt) {
                this.updatedAt = updatedAt;
                return this;
            }

            /**
             * <p>The upload time.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-06-15T22:28:53Z</p>
             */
            public Builder uploadTime(String uploadTime) {
                this.uploadTime = uploadTime;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
