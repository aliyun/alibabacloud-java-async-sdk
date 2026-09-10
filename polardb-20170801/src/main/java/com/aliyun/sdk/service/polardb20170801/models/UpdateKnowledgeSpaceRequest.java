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
 * {@link UpdateKnowledgeSpaceRequest} extends {@link RequestModel}
 *
 * <p>UpdateKnowledgeSpaceRequest</p>
 */
public class UpdateKnowledgeSpaceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KnowledgeSpaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String knowledgeSpaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LLMModel")
    private String LLMModel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RerankModel")
    private String rerankModel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ShardingStrategyConfig")
    private ShardingStrategyConfig shardingStrategyConfig;

    private UpdateKnowledgeSpaceRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.knowledgeSpaceId = builder.knowledgeSpaceId;
        this.LLMModel = builder.LLMModel;
        this.name = builder.name;
        this.regionId = builder.regionId;
        this.rerankModel = builder.rerankModel;
        this.shardingStrategyConfig = builder.shardingStrategyConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateKnowledgeSpaceRequest create() {
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return rerankModel
     */
    public String getRerankModel() {
        return this.rerankModel;
    }

    /**
     * @return shardingStrategyConfig
     */
    public ShardingStrategyConfig getShardingStrategyConfig() {
        return this.shardingStrategyConfig;
    }

    public static final class Builder extends Request.Builder<UpdateKnowledgeSpaceRequest, Builder> {
        private String description; 
        private String knowledgeSpaceId; 
        private String LLMModel; 
        private String name; 
        private String regionId; 
        private String rerankModel; 
        private ShardingStrategyConfig shardingStrategyConfig; 

        private Builder() {
            super();
        } 

        private Builder(UpdateKnowledgeSpaceRequest request) {
            super(request);
            this.description = request.description;
            this.knowledgeSpaceId = request.knowledgeSpaceId;
            this.LLMModel = request.LLMModel;
            this.name = request.name;
            this.regionId = request.regionId;
            this.rerankModel = request.rerankModel;
            this.shardingStrategyConfig = request.shardingStrategyConfig;
        } 

        /**
         * <p>The description of the knowledge space. The description can be up to 512 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>testDesc</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The unique identifier of the knowledge space.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pks-xxxxxx</p>
         */
        public Builder knowledgeSpaceId(String knowledgeSpaceId) {
            this.putQueryParameter("KnowledgeSpaceId", knowledgeSpaceId);
            this.knowledgeSpaceId = knowledgeSpaceId;
            return this;
        }

        /**
         * <p>The name of the large language model.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen3.6-plus</p>
         */
        public Builder LLMModel(String LLMModel) {
            this.putQueryParameter("LLMModel", LLMModel);
            this.LLMModel = LLMModel;
            return this;
        }

        /**
         * <p>The name of the knowledge space. The name must be 1 to 128 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>testName</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The name of the reranking model.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen3-rerank</p>
         */
        public Builder rerankModel(String rerankModel) {
            this.putQueryParameter("RerankModel", rerankModel);
            this.rerankModel = rerankModel;
            return this;
        }

        /**
         * <p>The default chunking strategy configuration for the knowledge space. Both simple strategies and composite strategies that match by content type are supported.</p>
         */
        public Builder shardingStrategyConfig(ShardingStrategyConfig shardingStrategyConfig) {
            String shardingStrategyConfigShrink = shrink(shardingStrategyConfig, "ShardingStrategyConfig", "json");
            this.putQueryParameter("ShardingStrategyConfig", shardingStrategyConfigShrink);
            this.shardingStrategyConfig = shardingStrategyConfig;
            return this;
        }

        @Override
        public UpdateKnowledgeSpaceRequest build() {
            return new UpdateKnowledgeSpaceRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateKnowledgeSpaceRequest} extends {@link TeaModel}
     *
     * <p>UpdateKnowledgeSpaceRequest</p>
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
             * <p>The maximum number of tokens per chunk. The value must be a positive integer.</p>
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
     * {@link UpdateKnowledgeSpaceRequest} extends {@link TeaModel}
     *
     * <p>UpdateKnowledgeSpaceRequest</p>
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
             * <p>The parameters of the default chunking strategy. MaxTokens and MergePeers take effect only when Type is set to hybrid.</p>
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
     * {@link UpdateKnowledgeSpaceRequest} extends {@link TeaModel}
     *
     * <p>UpdateKnowledgeSpaceRequest</p>
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
             * <p>The content type. Currently, only table is supported.</p>
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
     * {@link UpdateKnowledgeSpaceRequest} extends {@link TeaModel}
     *
     * <p>UpdateKnowledgeSpaceRequest</p>
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
             * <p>The processing mode for Markdown tables. Valid values: auto, on, or off.</p>
             * 
             * <strong>example:</strong>
             * <p>auto</p>
             */
            public Builder markdownTables(String markdownTables) {
                this.markdownTables = markdownTables;
                return this;
            }

            /**
             * <p>The maximum number of tokens per chunk for matched content. The value must be a positive integer.</p>
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
     * {@link UpdateKnowledgeSpaceRequest} extends {@link TeaModel}
     *
     * <p>UpdateKnowledgeSpaceRequest</p>
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
             * <p>The chunking strategy parameters for the override rule. MaxTokens takes effect only when Type is set to hybrid. MarkdownTables supports auto, on, or off.</p>
             */
            public Builder parameters(StrategyParameters parameters) {
                this.parameters = parameters;
                return this;
            }

            /**
             * <p>The type of the chunking strategy to use when the rule is matched. Valid values: hybrid or hierarchical.</p>
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
     * {@link UpdateKnowledgeSpaceRequest} extends {@link TeaModel}
     *
     * <p>UpdateKnowledgeSpaceRequest</p>
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
             * <p>The match condition of the rule. Currently, only exact matching of table content by content type is supported.</p>
             */
            public Builder match(Match match) {
                this.match = match;
                return this;
            }

            /**
             * <p>The chunking strategy to use when the rule is matched.</p>
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
     * {@link UpdateKnowledgeSpaceRequest} extends {@link TeaModel}
     *
     * <p>UpdateKnowledgeSpaceRequest</p>
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
             * <p>The list of override rules that are matched in order. Currently, a maximum of one exact-match rule with ContentType set to table is supported.</p>
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
