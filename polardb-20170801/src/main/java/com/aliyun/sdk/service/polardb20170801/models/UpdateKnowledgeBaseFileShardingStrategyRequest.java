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
 * {@link UpdateKnowledgeBaseFileShardingStrategyRequest} extends {@link RequestModel}
 *
 * <p>UpdateKnowledgeBaseFileShardingStrategyRequest</p>
 */
public class UpdateKnowledgeBaseFileShardingStrategyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InheritSpaceStrategy")
    private Boolean inheritSpaceStrategy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KnowledgeBaseId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String knowledgeBaseId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ShardingStrategyConfig")
    private ShardingStrategyConfig shardingStrategyConfig;

    private UpdateKnowledgeBaseFileShardingStrategyRequest(Builder builder) {
        super(builder);
        this.fileId = builder.fileId;
        this.inheritSpaceStrategy = builder.inheritSpaceStrategy;
        this.knowledgeBaseId = builder.knowledgeBaseId;
        this.regionId = builder.regionId;
        this.shardingStrategyConfig = builder.shardingStrategyConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateKnowledgeBaseFileShardingStrategyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fileId
     */
    public String getFileId() {
        return this.fileId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return shardingStrategyConfig
     */
    public ShardingStrategyConfig getShardingStrategyConfig() {
        return this.shardingStrategyConfig;
    }

    public static final class Builder extends Request.Builder<UpdateKnowledgeBaseFileShardingStrategyRequest, Builder> {
        private String fileId; 
        private Boolean inheritSpaceStrategy; 
        private String knowledgeBaseId; 
        private String regionId; 
        private ShardingStrategyConfig shardingStrategyConfig; 

        private Builder() {
            super();
        } 

        private Builder(UpdateKnowledgeBaseFileShardingStrategyRequest request) {
            super(request);
            this.fileId = request.fileId;
            this.inheritSpaceStrategy = request.inheritSpaceStrategy;
            this.knowledgeBaseId = request.knowledgeBaseId;
            this.regionId = request.regionId;
            this.shardingStrategyConfig = request.shardingStrategyConfig;
        } 

        /**
         * <p>The unique ID of the knowledge base file.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>e347ddb8-49bb-5c66-94bc-fa05cedaeac8</p>
         */
        public Builder fileId(String fileId) {
            this.putQueryParameter("FileId", fileId);
            this.fileId = fileId;
            return this;
        }

        /**
         * <p>Specifies whether to restore inheritance of the chunking strategy from the knowledge space. When this parameter is set to true, ShardingStrategyConfig cannot be specified at the same time.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder inheritSpaceStrategy(Boolean inheritSpaceStrategy) {
            this.putQueryParameter("InheritSpaceStrategy", inheritSpaceStrategy);
            this.inheritSpaceStrategy = inheritSpaceStrategy;
            return this;
        }

        /**
         * <p>The unique ID of the knowledge base.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pkb-2zesv6l6a63xsrym</p>
         */
        public Builder knowledgeBaseId(String knowledgeBaseId) {
            this.putQueryParameter("KnowledgeBaseId", knowledgeBaseId);
            this.knowledgeBaseId = knowledgeBaseId;
            return this;
        }

        /**
         * <p>The ID of the region where the knowledge base resides.</p>
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
         * <p>The file-level chunking strategy configuration. This parameter is required when InheritSpaceStrategy is not set to true.</p>
         */
        public Builder shardingStrategyConfig(ShardingStrategyConfig shardingStrategyConfig) {
            String shardingStrategyConfigShrink = shrink(shardingStrategyConfig, "ShardingStrategyConfig", "json");
            this.putQueryParameter("ShardingStrategyConfig", shardingStrategyConfigShrink);
            this.shardingStrategyConfig = shardingStrategyConfig;
            return this;
        }

        @Override
        public UpdateKnowledgeBaseFileShardingStrategyRequest build() {
            return new UpdateKnowledgeBaseFileShardingStrategyRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateKnowledgeBaseFileShardingStrategyRequest} extends {@link TeaModel}
     *
     * <p>UpdateKnowledgeBaseFileShardingStrategyRequest</p>
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
             * <p>The maximum number of tokens per chunk. The value must be a positive integer. This parameter takes effect only when Type is set to hybrid.</p>
             * 
             * <strong>example:</strong>
             * <p>512</p>
             */
            public Builder maxTokens(Integer maxTokens) {
                this.maxTokens = maxTokens;
                return this;
            }

            /**
             * <p>Specifies whether to merge adjacent small chunks under the same heading. This parameter takes effect only when Type is set to hybrid.</p>
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
     * {@link UpdateKnowledgeBaseFileShardingStrategyRequest} extends {@link TeaModel}
     *
     * <p>UpdateKnowledgeBaseFileShardingStrategyRequest</p>
     */
    public static class DefaultStrategy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Parameters")
        private Parameters parameters;

        @com.aliyun.core.annotation.NameInMap("Type")
        @com.aliyun.core.annotation.Validation(required = true)
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
             * <p>The parameters of the default chunking strategy. MaxTokens and MergePeers are supported only when Type is set to hybrid.</p>
             */
            public Builder parameters(Parameters parameters) {
                this.parameters = parameters;
                return this;
            }

            /**
             * <p>The type of the default chunking strategy. Valid values:</p>
             * <ul>
             * <li>hybrid: Splits by document structure and limits the token count.</li>
             * <li>hierarchical: Splits only by document structure.</li>
             * </ul>
             * <p>This parameter is required.</p>
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
     * {@link UpdateKnowledgeBaseFileShardingStrategyRequest} extends {@link TeaModel}
     *
     * <p>UpdateKnowledgeBaseFileShardingStrategyRequest</p>
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
             * <p>The content type. Currently, only table is supported, which matches content that is parsed as tables.</p>
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
     * {@link UpdateKnowledgeBaseFileShardingStrategyRequest} extends {@link TeaModel}
     *
     * <p>UpdateKnowledgeBaseFileShardingStrategyRequest</p>
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
             * <p>The Markdown table processing mode. Valid values:</p>
             * <ul>
             * <li>auto: Automatically determines the processing mode.</li>
             * <li>on: Forcefully enables Markdown table processing.</li>
             * <li>off: Disables Markdown table processing.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>auto</p>
             */
            public Builder markdownTables(String markdownTables) {
                this.markdownTables = markdownTables;
                return this;
            }

            /**
             * <p>The maximum number of tokens per chunk for matched content. The value must be a positive integer. This parameter takes effect only when Type is set to hybrid.</p>
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
     * {@link UpdateKnowledgeBaseFileShardingStrategyRequest} extends {@link TeaModel}
     *
     * <p>UpdateKnowledgeBaseFileShardingStrategyRequest</p>
     */
    public static class Strategy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Parameters")
        private StrategyParameters parameters;

        @com.aliyun.core.annotation.NameInMap("Type")
        @com.aliyun.core.annotation.Validation(required = true)
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
             * <p>The chunking strategy parameters of the override rule. MaxTokens takes effect only when Type is set to hybrid. MarkdownTables supports auto, on, or off.</p>
             */
            public Builder parameters(StrategyParameters parameters) {
                this.parameters = parameters;
                return this;
            }

            /**
             * <p>The chunking strategy type of the override rule. Valid values:</p>
             * <ul>
             * <li>hybrid</li>
             * <li>hierarchical</li>
             * </ul>
             * <p>This parameter is required.</p>
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
     * {@link UpdateKnowledgeBaseFileShardingStrategyRequest} extends {@link TeaModel}
     *
     * <p>UpdateKnowledgeBaseFileShardingStrategyRequest</p>
     */
    public static class Rules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Match")
        @com.aliyun.core.annotation.Validation(required = true)
        private Match match;

        @com.aliyun.core.annotation.NameInMap("Strategy")
        @com.aliyun.core.annotation.Validation(required = true)
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
             * <p>The rule match condition. Currently, only exact matching by content type for table content is supported.</p>
             * <p>This parameter is required.</p>
             */
            public Builder match(Match match) {
                this.match = match;
                return this;
            }

            /**
             * <p>The chunking strategy to use when the rule is matched.</p>
             * <p>This parameter is required.</p>
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
     * {@link UpdateKnowledgeBaseFileShardingStrategyRequest} extends {@link TeaModel}
     *
     * <p>UpdateKnowledgeBaseFileShardingStrategyRequest</p>
     */
    public static class ShardingStrategyConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DefaultStrategy")
        @com.aliyun.core.annotation.Validation(required = true)
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
             * <p>This parameter is required.</p>
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
