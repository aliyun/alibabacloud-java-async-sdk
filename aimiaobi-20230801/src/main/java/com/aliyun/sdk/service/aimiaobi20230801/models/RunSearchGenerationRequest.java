// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

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
 * {@link RunSearchGenerationRequest} extends {@link RequestModel}
 *
 * <p>RunSearchGenerationRequest</p>
 */
public class RunSearchGenerationRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AgentContext")
    private AgentContext agentContext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ChatConfig")
    private ChatConfig chatConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ModelId")
    private String modelId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OriginalSessionId")
    private String originalSessionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Prompt")
    private String prompt;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private RunSearchGenerationRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.agentContext = builder.agentContext;
        this.chatConfig = builder.chatConfig;
        this.modelId = builder.modelId;
        this.originalSessionId = builder.originalSessionId;
        this.prompt = builder.prompt;
        this.taskId = builder.taskId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunSearchGenerationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return agentContext
     */
    public AgentContext getAgentContext() {
        return this.agentContext;
    }

    /**
     * @return chatConfig
     */
    public ChatConfig getChatConfig() {
        return this.chatConfig;
    }

    /**
     * @return modelId
     */
    public String getModelId() {
        return this.modelId;
    }

    /**
     * @return originalSessionId
     */
    public String getOriginalSessionId() {
        return this.originalSessionId;
    }

    /**
     * @return prompt
     */
    public String getPrompt() {
        return this.prompt;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<RunSearchGenerationRequest, Builder> {
        private String regionId; 
        private AgentContext agentContext; 
        private ChatConfig chatConfig; 
        private String modelId; 
        private String originalSessionId; 
        private String prompt; 
        private String taskId; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(RunSearchGenerationRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.agentContext = request.agentContext;
            this.chatConfig = request.chatConfig;
            this.modelId = request.modelId;
            this.originalSessionId = request.originalSessionId;
            this.prompt = request.prompt;
            this.taskId = request.taskId;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * AgentContext.
         */
        public Builder agentContext(AgentContext agentContext) {
            String agentContextShrink = shrink(agentContext, "AgentContext", "json");
            this.putBodyParameter("AgentContext", agentContextShrink);
            this.agentContext = agentContext;
            return this;
        }

        /**
         * ChatConfig.
         */
        public Builder chatConfig(ChatConfig chatConfig) {
            String chatConfigShrink = shrink(chatConfig, "ChatConfig", "json");
            this.putBodyParameter("ChatConfig", chatConfigShrink);
            this.chatConfig = chatConfig;
            return this;
        }

        /**
         * ModelId.
         */
        public Builder modelId(String modelId) {
            this.putBodyParameter("ModelId", modelId);
            this.modelId = modelId;
            return this;
        }

        /**
         * OriginalSessionId.
         */
        public Builder originalSessionId(String originalSessionId) {
            this.putBodyParameter("OriginalSessionId", originalSessionId);
            this.originalSessionId = originalSessionId;
            return this;
        }

        /**
         * Prompt.
         */
        public Builder prompt(String prompt) {
            this.putBodyParameter("Prompt", prompt);
            this.prompt = prompt;
            return this;
        }

        /**
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.putBodyParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-xxx</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public RunSearchGenerationRequest build() {
            return new RunSearchGenerationRequest(this);
        } 

    } 

    /**
     * 
     * {@link RunSearchGenerationRequest} extends {@link TeaModel}
     *
     * <p>RunSearchGenerationRequest</p>
     */
    public static class SearchResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Chunks")
        private java.util.List<String> chunks;

        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("DocId")
        private String docId;

        @com.aliyun.core.annotation.NameInMap("DocUuid")
        private String docUuid;

        @com.aliyun.core.annotation.NameInMap("PubTime")
        private String pubTime;

        @com.aliyun.core.annotation.NameInMap("Score")
        private Float score;

        @com.aliyun.core.annotation.NameInMap("SearchSource")
        private String searchSource;

        @com.aliyun.core.annotation.NameInMap("SearchSourceName")
        private String searchSourceName;

        @com.aliyun.core.annotation.NameInMap("SearchSourceType")
        private String searchSourceType;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("Summary")
        private String summary;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private SearchResult(Builder builder) {
            this.chunks = builder.chunks;
            this.content = builder.content;
            this.docId = builder.docId;
            this.docUuid = builder.docUuid;
            this.pubTime = builder.pubTime;
            this.score = builder.score;
            this.searchSource = builder.searchSource;
            this.searchSourceName = builder.searchSourceName;
            this.searchSourceType = builder.searchSourceType;
            this.source = builder.source;
            this.summary = builder.summary;
            this.title = builder.title;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SearchResult create() {
            return builder().build();
        }

        /**
         * @return chunks
         */
        public java.util.List<String> getChunks() {
            return this.chunks;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return docId
         */
        public String getDocId() {
            return this.docId;
        }

        /**
         * @return docUuid
         */
        public String getDocUuid() {
            return this.docUuid;
        }

        /**
         * @return pubTime
         */
        public String getPubTime() {
            return this.pubTime;
        }

        /**
         * @return score
         */
        public Float getScore() {
            return this.score;
        }

        /**
         * @return searchSource
         */
        public String getSearchSource() {
            return this.searchSource;
        }

        /**
         * @return searchSourceName
         */
        public String getSearchSourceName() {
            return this.searchSourceName;
        }

        /**
         * @return searchSourceType
         */
        public String getSearchSourceType() {
            return this.searchSourceType;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return summary
         */
        public String getSummary() {
            return this.summary;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private java.util.List<String> chunks; 
            private String content; 
            private String docId; 
            private String docUuid; 
            private String pubTime; 
            private Float score; 
            private String searchSource; 
            private String searchSourceName; 
            private String searchSourceType; 
            private String source; 
            private String summary; 
            private String title; 
            private String url; 

            private Builder() {
            } 

            private Builder(SearchResult model) {
                this.chunks = model.chunks;
                this.content = model.content;
                this.docId = model.docId;
                this.docUuid = model.docUuid;
                this.pubTime = model.pubTime;
                this.score = model.score;
                this.searchSource = model.searchSource;
                this.searchSourceName = model.searchSourceName;
                this.searchSourceType = model.searchSourceType;
                this.source = model.source;
                this.summary = model.summary;
                this.title = model.title;
                this.url = model.url;
            } 

            /**
             * Chunks.
             */
            public Builder chunks(java.util.List<String> chunks) {
                this.chunks = chunks;
                return this;
            }

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * DocId.
             */
            public Builder docId(String docId) {
                this.docId = docId;
                return this;
            }

            /**
             * DocUuid.
             */
            public Builder docUuid(String docUuid) {
                this.docUuid = docUuid;
                return this;
            }

            /**
             * PubTime.
             */
            public Builder pubTime(String pubTime) {
                this.pubTime = pubTime;
                return this;
            }

            /**
             * Score.
             */
            public Builder score(Float score) {
                this.score = score;
                return this;
            }

            /**
             * SearchSource.
             */
            public Builder searchSource(String searchSource) {
                this.searchSource = searchSource;
                return this;
            }

            /**
             * SearchSourceName.
             */
            public Builder searchSourceName(String searchSourceName) {
                this.searchSourceName = searchSourceName;
                return this;
            }

            /**
             * SearchSourceType.
             */
            public Builder searchSourceType(String searchSourceType) {
                this.searchSourceType = searchSourceType;
                return this;
            }

            /**
             * Source.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * Summary.
             */
            public Builder summary(String summary) {
                this.summary = summary;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public SearchResult build() {
                return new SearchResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunSearchGenerationRequest} extends {@link TeaModel}
     *
     * <p>RunSearchGenerationRequest</p>
     */
    public static class TextSearchResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SearchResult")
        private java.util.List<SearchResult> searchResult;

        private TextSearchResult(Builder builder) {
            this.searchResult = builder.searchResult;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TextSearchResult create() {
            return builder().build();
        }

        /**
         * @return searchResult
         */
        public java.util.List<SearchResult> getSearchResult() {
            return this.searchResult;
        }

        public static final class Builder {
            private java.util.List<SearchResult> searchResult; 

            private Builder() {
            } 

            private Builder(TextSearchResult model) {
                this.searchResult = model.searchResult;
            } 

            /**
             * SearchResult.
             */
            public Builder searchResult(java.util.List<SearchResult> searchResult) {
                this.searchResult = searchResult;
                return this;
            }

            public TextSearchResult build() {
                return new TextSearchResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunSearchGenerationRequest} extends {@link TeaModel}
     *
     * <p>RunSearchGenerationRequest</p>
     */
    public static class MultimodalMediaSelection extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OriginalSessionId")
        private String originalSessionId;

        @com.aliyun.core.annotation.NameInMap("SearchModel")
        private String searchModel;

        @com.aliyun.core.annotation.NameInMap("SearchModelDataValue")
        private String searchModelDataValue;

        @com.aliyun.core.annotation.NameInMap("SelectionType")
        private String selectionType;

        @com.aliyun.core.annotation.NameInMap("SessionId")
        private String sessionId;

        @com.aliyun.core.annotation.NameInMap("TextSearchResult")
        private TextSearchResult textSearchResult;

        private MultimodalMediaSelection(Builder builder) {
            this.originalSessionId = builder.originalSessionId;
            this.searchModel = builder.searchModel;
            this.searchModelDataValue = builder.searchModelDataValue;
            this.selectionType = builder.selectionType;
            this.sessionId = builder.sessionId;
            this.textSearchResult = builder.textSearchResult;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MultimodalMediaSelection create() {
            return builder().build();
        }

        /**
         * @return originalSessionId
         */
        public String getOriginalSessionId() {
            return this.originalSessionId;
        }

        /**
         * @return searchModel
         */
        public String getSearchModel() {
            return this.searchModel;
        }

        /**
         * @return searchModelDataValue
         */
        public String getSearchModelDataValue() {
            return this.searchModelDataValue;
        }

        /**
         * @return selectionType
         */
        public String getSelectionType() {
            return this.selectionType;
        }

        /**
         * @return sessionId
         */
        public String getSessionId() {
            return this.sessionId;
        }

        /**
         * @return textSearchResult
         */
        public TextSearchResult getTextSearchResult() {
            return this.textSearchResult;
        }

        public static final class Builder {
            private String originalSessionId; 
            private String searchModel; 
            private String searchModelDataValue; 
            private String selectionType; 
            private String sessionId; 
            private TextSearchResult textSearchResult; 

            private Builder() {
            } 

            private Builder(MultimodalMediaSelection model) {
                this.originalSessionId = model.originalSessionId;
                this.searchModel = model.searchModel;
                this.searchModelDataValue = model.searchModelDataValue;
                this.selectionType = model.selectionType;
                this.sessionId = model.sessionId;
                this.textSearchResult = model.textSearchResult;
            } 

            /**
             * OriginalSessionId.
             */
            public Builder originalSessionId(String originalSessionId) {
                this.originalSessionId = originalSessionId;
                return this;
            }

            /**
             * SearchModel.
             */
            public Builder searchModel(String searchModel) {
                this.searchModel = searchModel;
                return this;
            }

            /**
             * SearchModelDataValue.
             */
            public Builder searchModelDataValue(String searchModelDataValue) {
                this.searchModelDataValue = searchModelDataValue;
                return this;
            }

            /**
             * SelectionType.
             */
            public Builder selectionType(String selectionType) {
                this.selectionType = selectionType;
                return this;
            }

            /**
             * SessionId.
             */
            public Builder sessionId(String sessionId) {
                this.sessionId = sessionId;
                return this;
            }

            /**
             * TextSearchResult.
             */
            public Builder textSearchResult(TextSearchResult textSearchResult) {
                this.textSearchResult = textSearchResult;
                return this;
            }

            public MultimodalMediaSelection build() {
                return new MultimodalMediaSelection(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunSearchGenerationRequest} extends {@link TeaModel}
     *
     * <p>RunSearchGenerationRequest</p>
     */
    public static class BizContext extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MultimodalMediaSelection")
        private MultimodalMediaSelection multimodalMediaSelection;

        @com.aliyun.core.annotation.NameInMap("SkipCurrentSupplement")
        private Boolean skipCurrentSupplement;

        private BizContext(Builder builder) {
            this.multimodalMediaSelection = builder.multimodalMediaSelection;
            this.skipCurrentSupplement = builder.skipCurrentSupplement;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BizContext create() {
            return builder().build();
        }

        /**
         * @return multimodalMediaSelection
         */
        public MultimodalMediaSelection getMultimodalMediaSelection() {
            return this.multimodalMediaSelection;
        }

        /**
         * @return skipCurrentSupplement
         */
        public Boolean getSkipCurrentSupplement() {
            return this.skipCurrentSupplement;
        }

        public static final class Builder {
            private MultimodalMediaSelection multimodalMediaSelection; 
            private Boolean skipCurrentSupplement; 

            private Builder() {
            } 

            private Builder(BizContext model) {
                this.multimodalMediaSelection = model.multimodalMediaSelection;
                this.skipCurrentSupplement = model.skipCurrentSupplement;
            } 

            /**
             * MultimodalMediaSelection.
             */
            public Builder multimodalMediaSelection(MultimodalMediaSelection multimodalMediaSelection) {
                this.multimodalMediaSelection = multimodalMediaSelection;
                return this;
            }

            /**
             * SkipCurrentSupplement.
             */
            public Builder skipCurrentSupplement(Boolean skipCurrentSupplement) {
                this.skipCurrentSupplement = skipCurrentSupplement;
                return this;
            }

            public BizContext build() {
                return new BizContext(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunSearchGenerationRequest} extends {@link TeaModel}
     *
     * <p>RunSearchGenerationRequest</p>
     */
    public static class AgentContext extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizContext")
        private BizContext bizContext;

        private AgentContext(Builder builder) {
            this.bizContext = builder.bizContext;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AgentContext create() {
            return builder().build();
        }

        /**
         * @return bizContext
         */
        public BizContext getBizContext() {
            return this.bizContext;
        }

        public static final class Builder {
            private BizContext bizContext; 

            private Builder() {
            } 

            private Builder(AgentContext model) {
                this.bizContext = model.bizContext;
            } 

            /**
             * BizContext.
             */
            public Builder bizContext(BizContext bizContext) {
                this.bizContext = bizContext;
                return this;
            }

            public AgentContext build() {
                return new AgentContext(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunSearchGenerationRequest} extends {@link TeaModel}
     *
     * <p>RunSearchGenerationRequest</p>
     */
    public static class SearchSources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("DatasetName")
        private String datasetName;

        private SearchSources(Builder builder) {
            this.code = builder.code;
            this.datasetName = builder.datasetName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SearchSources create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return datasetName
         */
        public String getDatasetName() {
            return this.datasetName;
        }

        public static final class Builder {
            private String code; 
            private String datasetName; 

            private Builder() {
            } 

            private Builder(SearchSources model) {
                this.code = model.code;
                this.datasetName = model.datasetName;
            } 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * DatasetName.
             */
            public Builder datasetName(String datasetName) {
                this.datasetName = datasetName;
                return this;
            }

            public SearchSources build() {
                return new SearchSources(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunSearchGenerationRequest} extends {@link TeaModel}
     *
     * <p>RunSearchGenerationRequest</p>
     */
    public static class SearchParam extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("MultimodalSearchTypes")
        private java.util.List<String> multimodalSearchTypes;

        @com.aliyun.core.annotation.NameInMap("SearchSources")
        private java.util.List<SearchSources> searchSources;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        private SearchParam(Builder builder) {
            this.endTime = builder.endTime;
            this.multimodalSearchTypes = builder.multimodalSearchTypes;
            this.searchSources = builder.searchSources;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SearchParam create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return multimodalSearchTypes
         */
        public java.util.List<String> getMultimodalSearchTypes() {
            return this.multimodalSearchTypes;
        }

        /**
         * @return searchSources
         */
        public java.util.List<SearchSources> getSearchSources() {
            return this.searchSources;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private Long endTime; 
            private java.util.List<String> multimodalSearchTypes; 
            private java.util.List<SearchSources> searchSources; 
            private Long startTime; 

            private Builder() {
            } 

            private Builder(SearchParam model) {
                this.endTime = model.endTime;
                this.multimodalSearchTypes = model.multimodalSearchTypes;
                this.searchSources = model.searchSources;
                this.startTime = model.startTime;
            } 

            /**
             * EndTime.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * MultimodalSearchTypes.
             */
            public Builder multimodalSearchTypes(java.util.List<String> multimodalSearchTypes) {
                this.multimodalSearchTypes = multimodalSearchTypes;
                return this;
            }

            /**
             * SearchSources.
             */
            public Builder searchSources(java.util.List<SearchSources> searchSources) {
                this.searchSources = searchSources;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            public SearchParam build() {
                return new SearchParam(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunSearchGenerationRequest} extends {@link TeaModel}
     *
     * <p>RunSearchGenerationRequest</p>
     */
    public static class ChatConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GenerateLevel")
        private String generateLevel;

        @com.aliyun.core.annotation.NameInMap("GenerateTechnology")
        private String generateTechnology;

        @com.aliyun.core.annotation.NameInMap("SearchModels")
        private java.util.List<String> searchModels;

        @com.aliyun.core.annotation.NameInMap("SearchParam")
        private SearchParam searchParam;

        private ChatConfig(Builder builder) {
            this.generateLevel = builder.generateLevel;
            this.generateTechnology = builder.generateTechnology;
            this.searchModels = builder.searchModels;
            this.searchParam = builder.searchParam;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ChatConfig create() {
            return builder().build();
        }

        /**
         * @return generateLevel
         */
        public String getGenerateLevel() {
            return this.generateLevel;
        }

        /**
         * @return generateTechnology
         */
        public String getGenerateTechnology() {
            return this.generateTechnology;
        }

        /**
         * @return searchModels
         */
        public java.util.List<String> getSearchModels() {
            return this.searchModels;
        }

        /**
         * @return searchParam
         */
        public SearchParam getSearchParam() {
            return this.searchParam;
        }

        public static final class Builder {
            private String generateLevel; 
            private String generateTechnology; 
            private java.util.List<String> searchModels; 
            private SearchParam searchParam; 

            private Builder() {
            } 

            private Builder(ChatConfig model) {
                this.generateLevel = model.generateLevel;
                this.generateTechnology = model.generateTechnology;
                this.searchModels = model.searchModels;
                this.searchParam = model.searchParam;
            } 

            /**
             * GenerateLevel.
             */
            public Builder generateLevel(String generateLevel) {
                this.generateLevel = generateLevel;
                return this;
            }

            /**
             * GenerateTechnology.
             */
            public Builder generateTechnology(String generateTechnology) {
                this.generateTechnology = generateTechnology;
                return this;
            }

            /**
             * SearchModels.
             */
            public Builder searchModels(java.util.List<String> searchModels) {
                this.searchModels = searchModels;
                return this;
            }

            /**
             * SearchParam.
             */
            public Builder searchParam(SearchParam searchParam) {
                this.searchParam = searchParam;
                return this;
            }

            public ChatConfig build() {
                return new ChatConfig(this);
            } 

        } 

    }
}
