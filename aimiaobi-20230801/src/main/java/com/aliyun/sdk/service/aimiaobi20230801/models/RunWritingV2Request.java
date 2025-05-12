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
 * {@link RunWritingV2Request} extends {@link RequestModel}
 *
 * <p>RunWritingV2Request</p>
 */
public class RunWritingV2Request extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Articles")
    private java.util.List<Articles> articles;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DistributeWriting")
    private Boolean distributeWriting;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GcNumberSize")
    private Integer gcNumberSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GcNumberSizeTag")
    private String gcNumberSizeTag;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Keywords")
    private java.util.List<String> keywords;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Language")
    private String language;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MiniDocs")
    private java.util.List<MiniDocs> miniDocs;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Outlines")
    private java.util.List<Outlines> outlines;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Prompt")
    private String prompt;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PromptMode")
    private String promptMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SearchSources")
    private java.util.List<SearchSources> searchSources;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SessionId")
    private String sessionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Step")
    private String step;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Summarization")
    private java.util.List<Summarization> summarization;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UseSearch")
    private Boolean useSearch;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WritingParams")
    private java.util.Map<String, String> writingParams;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WritingScene")
    private String writingScene;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WritingStyle")
    private String writingStyle;

    private RunWritingV2Request(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.articles = builder.articles;
        this.distributeWriting = builder.distributeWriting;
        this.gcNumberSize = builder.gcNumberSize;
        this.gcNumberSizeTag = builder.gcNumberSizeTag;
        this.keywords = builder.keywords;
        this.language = builder.language;
        this.miniDocs = builder.miniDocs;
        this.outlines = builder.outlines;
        this.prompt = builder.prompt;
        this.promptMode = builder.promptMode;
        this.searchSources = builder.searchSources;
        this.sessionId = builder.sessionId;
        this.step = builder.step;
        this.summarization = builder.summarization;
        this.taskId = builder.taskId;
        this.useSearch = builder.useSearch;
        this.workspaceId = builder.workspaceId;
        this.writingParams = builder.writingParams;
        this.writingScene = builder.writingScene;
        this.writingStyle = builder.writingStyle;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunWritingV2Request create() {
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
     * @return articles
     */
    public java.util.List<Articles> getArticles() {
        return this.articles;
    }

    /**
     * @return distributeWriting
     */
    public Boolean getDistributeWriting() {
        return this.distributeWriting;
    }

    /**
     * @return gcNumberSize
     */
    public Integer getGcNumberSize() {
        return this.gcNumberSize;
    }

    /**
     * @return gcNumberSizeTag
     */
    public String getGcNumberSizeTag() {
        return this.gcNumberSizeTag;
    }

    /**
     * @return keywords
     */
    public java.util.List<String> getKeywords() {
        return this.keywords;
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * @return miniDocs
     */
    public java.util.List<MiniDocs> getMiniDocs() {
        return this.miniDocs;
    }

    /**
     * @return outlines
     */
    public java.util.List<Outlines> getOutlines() {
        return this.outlines;
    }

    /**
     * @return prompt
     */
    public String getPrompt() {
        return this.prompt;
    }

    /**
     * @return promptMode
     */
    public String getPromptMode() {
        return this.promptMode;
    }

    /**
     * @return searchSources
     */
    public java.util.List<SearchSources> getSearchSources() {
        return this.searchSources;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return step
     */
    public String getStep() {
        return this.step;
    }

    /**
     * @return summarization
     */
    public java.util.List<Summarization> getSummarization() {
        return this.summarization;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return useSearch
     */
    public Boolean getUseSearch() {
        return this.useSearch;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return writingParams
     */
    public java.util.Map<String, String> getWritingParams() {
        return this.writingParams;
    }

    /**
     * @return writingScene
     */
    public String getWritingScene() {
        return this.writingScene;
    }

    /**
     * @return writingStyle
     */
    public String getWritingStyle() {
        return this.writingStyle;
    }

    public static final class Builder extends Request.Builder<RunWritingV2Request, Builder> {
        private String regionId; 
        private java.util.List<Articles> articles; 
        private Boolean distributeWriting; 
        private Integer gcNumberSize; 
        private String gcNumberSizeTag; 
        private java.util.List<String> keywords; 
        private String language; 
        private java.util.List<MiniDocs> miniDocs; 
        private java.util.List<Outlines> outlines; 
        private String prompt; 
        private String promptMode; 
        private java.util.List<SearchSources> searchSources; 
        private String sessionId; 
        private String step; 
        private java.util.List<Summarization> summarization; 
        private String taskId; 
        private Boolean useSearch; 
        private String workspaceId; 
        private java.util.Map<String, String> writingParams; 
        private String writingScene; 
        private String writingStyle; 

        private Builder() {
            super();
        } 

        private Builder(RunWritingV2Request request) {
            super(request);
            this.regionId = request.regionId;
            this.articles = request.articles;
            this.distributeWriting = request.distributeWriting;
            this.gcNumberSize = request.gcNumberSize;
            this.gcNumberSizeTag = request.gcNumberSizeTag;
            this.keywords = request.keywords;
            this.language = request.language;
            this.miniDocs = request.miniDocs;
            this.outlines = request.outlines;
            this.prompt = request.prompt;
            this.promptMode = request.promptMode;
            this.searchSources = request.searchSources;
            this.sessionId = request.sessionId;
            this.step = request.step;
            this.summarization = request.summarization;
            this.taskId = request.taskId;
            this.useSearch = request.useSearch;
            this.workspaceId = request.workspaceId;
            this.writingParams = request.writingParams;
            this.writingScene = request.writingScene;
            this.writingStyle = request.writingStyle;
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
         * Articles.
         */
        public Builder articles(java.util.List<Articles> articles) {
            String articlesShrink = shrink(articles, "Articles", "json");
            this.putBodyParameter("Articles", articlesShrink);
            this.articles = articles;
            return this;
        }

        /**
         * DistributeWriting.
         */
        public Builder distributeWriting(Boolean distributeWriting) {
            this.putBodyParameter("DistributeWriting", distributeWriting);
            this.distributeWriting = distributeWriting;
            return this;
        }

        /**
         * GcNumberSize.
         */
        public Builder gcNumberSize(Integer gcNumberSize) {
            this.putBodyParameter("GcNumberSize", gcNumberSize);
            this.gcNumberSize = gcNumberSize;
            return this;
        }

        /**
         * GcNumberSizeTag.
         */
        public Builder gcNumberSizeTag(String gcNumberSizeTag) {
            this.putBodyParameter("GcNumberSizeTag", gcNumberSizeTag);
            this.gcNumberSizeTag = gcNumberSizeTag;
            return this;
        }

        /**
         * Keywords.
         */
        public Builder keywords(java.util.List<String> keywords) {
            String keywordsShrink = shrink(keywords, "Keywords", "json");
            this.putBodyParameter("Keywords", keywordsShrink);
            this.keywords = keywords;
            return this;
        }

        /**
         * Language.
         */
        public Builder language(String language) {
            this.putBodyParameter("Language", language);
            this.language = language;
            return this;
        }

        /**
         * MiniDocs.
         */
        public Builder miniDocs(java.util.List<MiniDocs> miniDocs) {
            String miniDocsShrink = shrink(miniDocs, "MiniDocs", "json");
            this.putBodyParameter("MiniDocs", miniDocsShrink);
            this.miniDocs = miniDocs;
            return this;
        }

        /**
         * Outlines.
         */
        public Builder outlines(java.util.List<Outlines> outlines) {
            String outlinesShrink = shrink(outlines, "Outlines", "json");
            this.putBodyParameter("Outlines", outlinesShrink);
            this.outlines = outlines;
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
         * PromptMode.
         */
        public Builder promptMode(String promptMode) {
            this.putBodyParameter("PromptMode", promptMode);
            this.promptMode = promptMode;
            return this;
        }

        /**
         * SearchSources.
         */
        public Builder searchSources(java.util.List<SearchSources> searchSources) {
            String searchSourcesShrink = shrink(searchSources, "SearchSources", "json");
            this.putBodyParameter("SearchSources", searchSourcesShrink);
            this.searchSources = searchSources;
            return this;
        }

        /**
         * SessionId.
         */
        public Builder sessionId(String sessionId) {
            this.putBodyParameter("SessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        /**
         * Step.
         */
        public Builder step(String step) {
            this.putBodyParameter("Step", step);
            this.step = step;
            return this;
        }

        /**
         * Summarization.
         */
        public Builder summarization(java.util.List<Summarization> summarization) {
            String summarizationShrink = shrink(summarization, "Summarization", "json");
            this.putBodyParameter("Summarization", summarizationShrink);
            this.summarization = summarization;
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
         * UseSearch.
         */
        public Builder useSearch(Boolean useSearch) {
            this.putBodyParameter("UseSearch", useSearch);
            this.useSearch = useSearch;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * WritingParams.
         */
        public Builder writingParams(java.util.Map<String, String> writingParams) {
            String writingParamsShrink = shrink(writingParams, "WritingParams", "json");
            this.putBodyParameter("WritingParams", writingParamsShrink);
            this.writingParams = writingParams;
            return this;
        }

        /**
         * WritingScene.
         */
        public Builder writingScene(String writingScene) {
            this.putBodyParameter("WritingScene", writingScene);
            this.writingScene = writingScene;
            return this;
        }

        /**
         * WritingStyle.
         */
        public Builder writingStyle(String writingStyle) {
            this.putBodyParameter("WritingStyle", writingStyle);
            this.writingStyle = writingStyle;
            return this;
        }

        @Override
        public RunWritingV2Request build() {
            return new RunWritingV2Request(this);
        } 

    } 

    /**
     * 
     * {@link RunWritingV2Request} extends {@link TeaModel}
     *
     * <p>RunWritingV2Request</p>
     */
    public static class Articles extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("PubTime")
        private String pubTime;

        @com.aliyun.core.annotation.NameInMap("SearchSourceName")
        private String searchSourceName;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private Articles(Builder builder) {
            this.content = builder.content;
            this.pubTime = builder.pubTime;
            this.searchSourceName = builder.searchSourceName;
            this.source = builder.source;
            this.title = builder.title;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Articles create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return pubTime
         */
        public String getPubTime() {
            return this.pubTime;
        }

        /**
         * @return searchSourceName
         */
        public String getSearchSourceName() {
            return this.searchSourceName;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
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
            private String content; 
            private String pubTime; 
            private String searchSourceName; 
            private String source; 
            private String title; 
            private String url; 

            private Builder() {
            } 

            private Builder(Articles model) {
                this.content = model.content;
                this.pubTime = model.pubTime;
                this.searchSourceName = model.searchSourceName;
                this.source = model.source;
                this.title = model.title;
                this.url = model.url;
            } 

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
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
             * SearchSourceName.
             */
            public Builder searchSourceName(String searchSourceName) {
                this.searchSourceName = searchSourceName;
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

            public Articles build() {
                return new Articles(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunWritingV2Request} extends {@link TeaModel}
     *
     * <p>RunWritingV2Request</p>
     */
    public static class MiniDocs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("Index")
        private String index;

        @com.aliyun.core.annotation.NameInMap("Star")
        private Boolean star;

        private MiniDocs(Builder builder) {
            this.content = builder.content;
            this.index = builder.index;
            this.star = builder.star;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MiniDocs create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return index
         */
        public String getIndex() {
            return this.index;
        }

        /**
         * @return star
         */
        public Boolean getStar() {
            return this.star;
        }

        public static final class Builder {
            private String content; 
            private String index; 
            private Boolean star; 

            private Builder() {
            } 

            private Builder(MiniDocs model) {
                this.content = model.content;
                this.index = model.index;
                this.star = model.star;
            } 

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * Index.
             */
            public Builder index(String index) {
                this.index = index;
                return this;
            }

            /**
             * Star.
             */
            public Builder star(Boolean star) {
                this.star = star;
                return this;
            }

            public MiniDocs build() {
                return new MiniDocs(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunWritingV2Request} extends {@link TeaModel}
     *
     * <p>RunWritingV2Request</p>
     */
    public static class OutlinesArticles extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private OutlinesArticles(Builder builder) {
            this.content = builder.content;
            this.title = builder.title;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OutlinesArticles create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
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
            private String content; 
            private String title; 
            private String url; 

            private Builder() {
            } 

            private Builder(OutlinesArticles model) {
                this.content = model.content;
                this.title = model.title;
                this.url = model.url;
            } 

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
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

            public OutlinesArticles build() {
                return new OutlinesArticles(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunWritingV2Request} extends {@link TeaModel}
     *
     * <p>RunWritingV2Request</p>
     */
    public static class Outlines extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Articles")
        private java.util.List<OutlinesArticles> articles;

        @com.aliyun.core.annotation.NameInMap("Outline")
        private String outline;

        private Outlines(Builder builder) {
            this.articles = builder.articles;
            this.outline = builder.outline;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Outlines create() {
            return builder().build();
        }

        /**
         * @return articles
         */
        public java.util.List<OutlinesArticles> getArticles() {
            return this.articles;
        }

        /**
         * @return outline
         */
        public String getOutline() {
            return this.outline;
        }

        public static final class Builder {
            private java.util.List<OutlinesArticles> articles; 
            private String outline; 

            private Builder() {
            } 

            private Builder(Outlines model) {
                this.articles = model.articles;
                this.outline = model.outline;
            } 

            /**
             * Articles.
             */
            public Builder articles(java.util.List<OutlinesArticles> articles) {
                this.articles = articles;
                return this;
            }

            /**
             * Outline.
             */
            public Builder outline(String outline) {
                this.outline = outline;
                return this;
            }

            public Outlines build() {
                return new Outlines(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunWritingV2Request} extends {@link TeaModel}
     *
     * <p>RunWritingV2Request</p>
     */
    public static class SearchSources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("DatasetName")
        private String datasetName;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private SearchSources(Builder builder) {
            this.code = builder.code;
            this.datasetName = builder.datasetName;
            this.name = builder.name;
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

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String code; 
            private String datasetName; 
            private String name; 

            private Builder() {
            } 

            private Builder(SearchSources model) {
                this.code = model.code;
                this.datasetName = model.datasetName;
                this.name = model.name;
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

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public SearchSources build() {
                return new SearchSources(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunWritingV2Request} extends {@link TeaModel}
     *
     * <p>RunWritingV2Request</p>
     */
    public static class Summarization extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Event")
        private String event;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        private Summarization(Builder builder) {
            this.event = builder.event;
            this.message = builder.message;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Summarization create() {
            return builder().build();
        }

        /**
         * @return event
         */
        public String getEvent() {
            return this.event;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        public static final class Builder {
            private String event; 
            private String message; 

            private Builder() {
            } 

            private Builder(Summarization model) {
                this.event = model.event;
                this.message = model.message;
            } 

            /**
             * Event.
             */
            public Builder event(String event) {
                this.event = event;
                return this;
            }

            /**
             * Message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            public Summarization build() {
                return new Summarization(this);
            } 

        } 

    }
}
