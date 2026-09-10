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
 * {@link DescribeKnowledgeSpaceAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeKnowledgeSpaceAttributeResponseBody</p>
 */
public class DescribeKnowledgeSpaceAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ACLMode")
    private String ACLMode;

    @com.aliyun.core.annotation.NameInMap("CreationTime")
    private String creationTime;

    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

    @com.aliyun.core.annotation.NameInMap("DBName")
    private String DBName;

    @com.aliyun.core.annotation.NameInMap("DBType")
    private String DBType;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("EmbeddingDimension")
    private Integer embeddingDimension;

    @com.aliyun.core.annotation.NameInMap("EmbeddingModel")
    private String embeddingModel;

    @com.aliyun.core.annotation.NameInMap("KnowledgeBaseCount")
    private Integer knowledgeBaseCount;

    @com.aliyun.core.annotation.NameInMap("KnowledgeSpaceId")
    private String knowledgeSpaceId;

    @com.aliyun.core.annotation.NameInMap("LLMModel")
    private String LLMModel;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("OSSBucket")
    private String OSSBucket;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RerankModel")
    private String rerankModel;

    @com.aliyun.core.annotation.NameInMap("ShardSize")
    private Integer shardSize;

    @com.aliyun.core.annotation.NameInMap("ShardingStrategyConfig")
    private ShardingStrategyConfig shardingStrategyConfig;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("Strategy")
    private String strategy;

    @com.aliyun.core.annotation.NameInMap("TotalDocs")
    private Integer totalDocs;

    @com.aliyun.core.annotation.NameInMap("TotalSizeBytes")
    private Long totalSizeBytes;

    private DescribeKnowledgeSpaceAttributeResponseBody(Builder builder) {
        this.ACLMode = builder.ACLMode;
        this.creationTime = builder.creationTime;
        this.DBClusterId = builder.DBClusterId;
        this.DBName = builder.DBName;
        this.DBType = builder.DBType;
        this.description = builder.description;
        this.embeddingDimension = builder.embeddingDimension;
        this.embeddingModel = builder.embeddingModel;
        this.knowledgeBaseCount = builder.knowledgeBaseCount;
        this.knowledgeSpaceId = builder.knowledgeSpaceId;
        this.LLMModel = builder.LLMModel;
        this.name = builder.name;
        this.OSSBucket = builder.OSSBucket;
        this.requestId = builder.requestId;
        this.rerankModel = builder.rerankModel;
        this.shardSize = builder.shardSize;
        this.shardingStrategyConfig = builder.shardingStrategyConfig;
        this.status = builder.status;
        this.strategy = builder.strategy;
        this.totalDocs = builder.totalDocs;
        this.totalSizeBytes = builder.totalSizeBytes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeKnowledgeSpaceAttributeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ACLMode
     */
    public String getACLMode() {
        return this.ACLMode;
    }

    /**
     * @return creationTime
     */
    public String getCreationTime() {
        return this.creationTime;
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return DBName
     */
    public String getDBName() {
        return this.DBName;
    }

    /**
     * @return DBType
     */
    public String getDBType() {
        return this.DBType;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return embeddingDimension
     */
    public Integer getEmbeddingDimension() {
        return this.embeddingDimension;
    }

    /**
     * @return embeddingModel
     */
    public String getEmbeddingModel() {
        return this.embeddingModel;
    }

    /**
     * @return knowledgeBaseCount
     */
    public Integer getKnowledgeBaseCount() {
        return this.knowledgeBaseCount;
    }

    /**
     * @return knowledgeSpaceId
     */
    public String getKnowledgeSpaceId() {
        return this.knowledgeSpaceId;
    }

    /**
     * @return LLMModel
     */
    public String getLLMModel() {
        return this.LLMModel;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return OSSBucket
     */
    public String getOSSBucket() {
        return this.OSSBucket;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return rerankModel
     */
    public String getRerankModel() {
        return this.rerankModel;
    }

    /**
     * @return shardSize
     */
    public Integer getShardSize() {
        return this.shardSize;
    }

    /**
     * @return shardingStrategyConfig
     */
    public ShardingStrategyConfig getShardingStrategyConfig() {
        return this.shardingStrategyConfig;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return strategy
     */
    public String getStrategy() {
        return this.strategy;
    }

    /**
     * @return totalDocs
     */
    public Integer getTotalDocs() {
        return this.totalDocs;
    }

    /**
     * @return totalSizeBytes
     */
    public Long getTotalSizeBytes() {
        return this.totalSizeBytes;
    }

    public static final class Builder {
        private String ACLMode; 
        private String creationTime; 
        private String DBClusterId; 
        private String DBName; 
        private String DBType; 
        private String description; 
        private Integer embeddingDimension; 
        private String embeddingModel; 
        private Integer knowledgeBaseCount; 
        private String knowledgeSpaceId; 
        private String LLMModel; 
        private String name; 
        private String OSSBucket; 
        private String requestId; 
        private String rerankModel; 
        private Integer shardSize; 
        private ShardingStrategyConfig shardingStrategyConfig; 
        private String status; 
        private String strategy; 
        private Integer totalDocs; 
        private Long totalSizeBytes; 

        private Builder() {
        } 

        private Builder(DescribeKnowledgeSpaceAttributeResponseBody model) {
            this.ACLMode = model.ACLMode;
            this.creationTime = model.creationTime;
            this.DBClusterId = model.DBClusterId;
            this.DBName = model.DBName;
            this.DBType = model.DBType;
            this.description = model.description;
            this.embeddingDimension = model.embeddingDimension;
            this.embeddingModel = model.embeddingModel;
            this.knowledgeBaseCount = model.knowledgeBaseCount;
            this.knowledgeSpaceId = model.knowledgeSpaceId;
            this.LLMModel = model.LLMModel;
            this.name = model.name;
            this.OSSBucket = model.OSSBucket;
            this.requestId = model.requestId;
            this.rerankModel = model.rerankModel;
            this.shardSize = model.shardSize;
            this.shardingStrategyConfig = model.shardingStrategyConfig;
            this.status = model.status;
            this.strategy = model.strategy;
            this.totalDocs = model.totalDocs;
            this.totalSizeBytes = model.totalSizeBytes;
        } 

        /**
         * <p>The access control list (ACL) mode of the knowledge space. Valid values:</p>
         * <ul>
         * <li>DISABLED</li>
         * <li>ENFORCED</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ENFORCED</p>
         */
        public Builder ACLMode(String ACLMode) {
            this.ACLMode = ACLMode;
            return this;
        }

        /**
         * <p>The time when the knowledge space was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-06-25T09:53:44Z</p>
         */
        public Builder creationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }

        /**
         * <p>The ID of the PolarDB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-*************</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The name of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>polar_rag_meta</p>
         */
        public Builder DBName(String DBName) {
            this.DBName = DBName;
            return this;
        }

        /**
         * <p>The type of the database engine. Valid values:</p>
         * <ul>
         * <li>MySQL</li>
         * <li>PostgreSQL</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        public Builder DBType(String DBType) {
            this.DBType = DBType;
            return this;
        }

        /**
         * <p>The description of the knowledge space.</p>
         * 
         * <strong>example:</strong>
         * <p>testDesc</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The vector dimensions.</p>
         * 
         * <strong>example:</strong>
         * <p>1536</p>
         */
        public Builder embeddingDimension(Integer embeddingDimension) {
            this.embeddingDimension = embeddingDimension;
            return this;
        }

        /**
         * <p>The embedding model.</p>
         * 
         * <strong>example:</strong>
         * <p>text-embedding-v4</p>
         */
        public Builder embeddingModel(String embeddingModel) {
            this.embeddingModel = embeddingModel;
            return this;
        }

        /**
         * <p>The total number of knowledge bases.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder knowledgeBaseCount(Integer knowledgeBaseCount) {
            this.knowledgeBaseCount = knowledgeBaseCount;
            return this;
        }

        /**
         * <p>The unique identifier of the knowledge space.</p>
         * 
         * <strong>example:</strong>
         * <p>pks-xxxxxx</p>
         */
        public Builder knowledgeSpaceId(String knowledgeSpaceId) {
            this.knowledgeSpaceId = knowledgeSpaceId;
            return this;
        }

        /**
         * <p>The large language model.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen3.6-plus</p>
         */
        public Builder LLMModel(String LLMModel) {
            this.LLMModel = LLMModel;
            return this;
        }

        /**
         * <p>The name of the knowledge space.</p>
         * 
         * <strong>example:</strong>
         * <p>testName</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>OSS Bucket</p>
         * 
         * <strong>example:</strong>
         * <p>test-bucket</p>
         */
        public Builder OSSBucket(String OSSBucket) {
            this.OSSBucket = OSSBucket;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>6BD9CDE4-5E7B-4BF3-9BB8-83C73E******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The reranking model.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen3-rerank</p>
         */
        public Builder rerankModel(String rerankModel) {
            this.rerankModel = rerankModel;
            return this;
        }

        /**
         * <p>The chunk size in tokens.</p>
         * 
         * <strong>example:</strong>
         * <p>512</p>
         */
        public Builder shardSize(Integer shardSize) {
            this.shardSize = shardSize;
            return this;
        }

        /**
         * <p>The default chunking strategy configuration of the knowledge space. This parameter may be empty if existing instances do not have the complete configuration saved.</p>
         */
        public Builder shardingStrategyConfig(ShardingStrategyConfig shardingStrategyConfig) {
            this.shardingStrategyConfig = shardingStrategyConfig;
            return this;
        }

        /**
         * <p>The instance status.</p>
         * 
         * <strong>example:</strong>
         * <p>Activation</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The chunking strategy.</p>
         * 
         * <strong>example:</strong>
         * <p>hybrid</p>
         */
        public Builder strategy(String strategy) {
            this.strategy = strategy;
            return this;
        }

        /**
         * <p>The total number of documents.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalDocs(Integer totalDocs) {
            this.totalDocs = totalDocs;
            return this;
        }

        /**
         * <p>The total size in bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>318881</p>
         */
        public Builder totalSizeBytes(Long totalSizeBytes) {
            this.totalSizeBytes = totalSizeBytes;
            return this;
        }

        public DescribeKnowledgeSpaceAttributeResponseBody build() {
            return new DescribeKnowledgeSpaceAttributeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeKnowledgeSpaceAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeKnowledgeSpaceAttributeResponseBody</p>
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
             * <p>The maximum number of tokens in a single chunk.</p>
             * 
             * <strong>example:</strong>
             * <p>512</p>
             */
            public Builder maxTokens(Integer maxTokens) {
                this.maxTokens = maxTokens;
                return this;
            }

            /**
             * <p>Specifies whether to merge adjacent small chunks under the same heading.</p>
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
     * {@link DescribeKnowledgeSpaceAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeKnowledgeSpaceAttributeResponseBody</p>
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
             * <p>The parameter details.</p>
             */
            public Builder parameters(Parameters parameters) {
                this.parameters = parameters;
                return this;
            }

            /**
             * <p>The type of the default chunking strategy. Valid values: hybrid or hierarchical.</p>
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
     * {@link DescribeKnowledgeSpaceAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeKnowledgeSpaceAttributeResponseBody</p>
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
     * {@link DescribeKnowledgeSpaceAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeKnowledgeSpaceAttributeResponseBody</p>
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
             * <p>The Markdown table processing mode. Valid values: auto, on, or off.</p>
             * 
             * <strong>example:</strong>
             * <p>auto</p>
             */
            public Builder markdownTables(String markdownTables) {
                this.markdownTables = markdownTables;
                return this;
            }

            /**
             * <p>The maximum number of tokens in a single chunk for matched content.</p>
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
     * {@link DescribeKnowledgeSpaceAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeKnowledgeSpaceAttributeResponseBody</p>
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
             * <p>The parameter details.</p>
             */
            public Builder parameters(StrategyParameters parameters) {
                this.parameters = parameters;
                return this;
            }

            /**
             * <p>The chunking strategy type used when a rule is matched.</p>
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
     * {@link DescribeKnowledgeSpaceAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeKnowledgeSpaceAttributeResponseBody</p>
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
     * {@link DescribeKnowledgeSpaceAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeKnowledgeSpaceAttributeResponseBody</p>
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
             * <p>The default chunking strategy. This strategy is used when no rule is matched.</p>
             */
            public Builder defaultStrategy(DefaultStrategy defaultStrategy) {
                this.defaultStrategy = defaultStrategy;
                return this;
            }

            /**
             * <p>The list of override rules that are matched in order.</p>
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
}
