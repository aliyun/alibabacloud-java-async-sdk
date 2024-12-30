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
 * {@link RunStepByStepWritingRequest} extends {@link RequestModel}
 *
 * <p>RunStepByStepWritingRequest</p>
 */
public class RunStepByStepWritingRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OriginSessionId")
    private String originSessionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Prompt")
    @com.aliyun.core.annotation.Validation(required = true)
    private String prompt;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ReferenceData")
    private ReferenceData referenceData;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SessionId")
    private String sessionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WritingConfig")
    private WritingConfig writingConfig;

    private RunStepByStepWritingRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.originSessionId = builder.originSessionId;
        this.prompt = builder.prompt;
        this.referenceData = builder.referenceData;
        this.sessionId = builder.sessionId;
        this.taskId = builder.taskId;
        this.workspaceId = builder.workspaceId;
        this.writingConfig = builder.writingConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunStepByStepWritingRequest create() {
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
     * @return originSessionId
     */
    public String getOriginSessionId() {
        return this.originSessionId;
    }

    /**
     * @return prompt
     */
    public String getPrompt() {
        return this.prompt;
    }

    /**
     * @return referenceData
     */
    public ReferenceData getReferenceData() {
        return this.referenceData;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
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

    /**
     * @return writingConfig
     */
    public WritingConfig getWritingConfig() {
        return this.writingConfig;
    }

    public static final class Builder extends Request.Builder<RunStepByStepWritingRequest, Builder> {
        private String regionId; 
        private String originSessionId; 
        private String prompt; 
        private ReferenceData referenceData; 
        private String sessionId; 
        private String taskId; 
        private String workspaceId; 
        private WritingConfig writingConfig; 

        private Builder() {
            super();
        } 

        private Builder(RunStepByStepWritingRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.originSessionId = request.originSessionId;
            this.prompt = request.prompt;
            this.referenceData = request.referenceData;
            this.sessionId = request.sessionId;
            this.taskId = request.taskId;
            this.workspaceId = request.workspaceId;
            this.writingConfig = request.writingConfig;
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
         * OriginSessionId.
         */
        public Builder originSessionId(String originSessionId) {
            this.putBodyParameter("OriginSessionId", originSessionId);
            this.originSessionId = originSessionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>提示词</p>
         */
        public Builder prompt(String prompt) {
            this.putBodyParameter("Prompt", prompt);
            this.prompt = prompt;
            return this;
        }

        /**
         * ReferenceData.
         */
        public Builder referenceData(ReferenceData referenceData) {
            String referenceDataShrink = shrink(referenceData, "ReferenceData", "json");
            this.putBodyParameter("ReferenceData", referenceDataShrink);
            this.referenceData = referenceData;
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
         * <p>xxxx</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * WritingConfig.
         */
        public Builder writingConfig(WritingConfig writingConfig) {
            String writingConfigShrink = shrink(writingConfig, "WritingConfig", "json");
            this.putBodyParameter("WritingConfig", writingConfigShrink);
            this.writingConfig = writingConfig;
            return this;
        }

        @Override
        public RunStepByStepWritingRequest build() {
            return new RunStepByStepWritingRequest(this);
        } 

    } 

    /**
     * 
     * {@link RunStepByStepWritingRequest} extends {@link TeaModel}
     *
     * <p>RunStepByStepWritingRequest</p>
     */
    public static class Articles extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Author")
        private String author;

        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("DocId")
        private String docId;

        @com.aliyun.core.annotation.NameInMap("DocUuid")
        private String docUuid;

        @com.aliyun.core.annotation.NameInMap("MediaUrl")
        private String mediaUrl;

        @com.aliyun.core.annotation.NameInMap("PubTime")
        private String pubTime;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("Summary")
        private String summary;

        @com.aliyun.core.annotation.NameInMap("Tag")
        private String tag;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private Articles(Builder builder) {
            this.author = builder.author;
            this.content = builder.content;
            this.docId = builder.docId;
            this.docUuid = builder.docUuid;
            this.mediaUrl = builder.mediaUrl;
            this.pubTime = builder.pubTime;
            this.source = builder.source;
            this.summary = builder.summary;
            this.tag = builder.tag;
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
         * @return author
         */
        public String getAuthor() {
            return this.author;
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
         * @return mediaUrl
         */
        public String getMediaUrl() {
            return this.mediaUrl;
        }

        /**
         * @return pubTime
         */
        public String getPubTime() {
            return this.pubTime;
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
         * @return tag
         */
        public String getTag() {
            return this.tag;
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
            private String author; 
            private String content; 
            private String docId; 
            private String docUuid; 
            private String mediaUrl; 
            private String pubTime; 
            private String source; 
            private String summary; 
            private String tag; 
            private String title; 
            private String url; 

            /**
             * Author.
             */
            public Builder author(String author) {
                this.author = author;
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
             * MediaUrl.
             */
            public Builder mediaUrl(String mediaUrl) {
                this.mediaUrl = mediaUrl;
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
             * Tag.
             */
            public Builder tag(String tag) {
                this.tag = tag;
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
     * {@link RunStepByStepWritingRequest} extends {@link TeaModel}
     *
     * <p>RunStepByStepWritingRequest</p>
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
     * {@link RunStepByStepWritingRequest} extends {@link TeaModel}
     *
     * <p>RunStepByStepWritingRequest</p>
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
     * {@link RunStepByStepWritingRequest} extends {@link TeaModel}
     *
     * <p>RunStepByStepWritingRequest</p>
     */
    public static class ReferenceData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Articles")
        private java.util.List<Articles> articles;

        @com.aliyun.core.annotation.NameInMap("MiniDoc")
        private java.util.List<String> miniDoc;

        @com.aliyun.core.annotation.NameInMap("Outlines")
        private java.util.List<Outlines> outlines;

        @com.aliyun.core.annotation.NameInMap("Summarization")
        private java.util.List<String> summarization;

        private ReferenceData(Builder builder) {
            this.articles = builder.articles;
            this.miniDoc = builder.miniDoc;
            this.outlines = builder.outlines;
            this.summarization = builder.summarization;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReferenceData create() {
            return builder().build();
        }

        /**
         * @return articles
         */
        public java.util.List<Articles> getArticles() {
            return this.articles;
        }

        /**
         * @return miniDoc
         */
        public java.util.List<String> getMiniDoc() {
            return this.miniDoc;
        }

        /**
         * @return outlines
         */
        public java.util.List<Outlines> getOutlines() {
            return this.outlines;
        }

        /**
         * @return summarization
         */
        public java.util.List<String> getSummarization() {
            return this.summarization;
        }

        public static final class Builder {
            private java.util.List<Articles> articles; 
            private java.util.List<String> miniDoc; 
            private java.util.List<Outlines> outlines; 
            private java.util.List<String> summarization; 

            /**
             * Articles.
             */
            public Builder articles(java.util.List<Articles> articles) {
                this.articles = articles;
                return this;
            }

            /**
             * MiniDoc.
             */
            public Builder miniDoc(java.util.List<String> miniDoc) {
                this.miniDoc = miniDoc;
                return this;
            }

            /**
             * Outlines.
             */
            public Builder outlines(java.util.List<Outlines> outlines) {
                this.outlines = outlines;
                return this;
            }

            /**
             * Summarization.
             */
            public Builder summarization(java.util.List<String> summarization) {
                this.summarization = summarization;
                return this;
            }

            public ReferenceData build() {
                return new ReferenceData(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunStepByStepWritingRequest} extends {@link TeaModel}
     *
     * <p>RunStepByStepWritingRequest</p>
     */
    public static class PromptTag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NecessaryTips")
        private String necessaryTips;

        @com.aliyun.core.annotation.NameInMap("Position")
        private String position;

        @com.aliyun.core.annotation.NameInMap("ReverseWords")
        private String reverseWords;

        @com.aliyun.core.annotation.NameInMap("Theme")
        private String theme;

        private PromptTag(Builder builder) {
            this.necessaryTips = builder.necessaryTips;
            this.position = builder.position;
            this.reverseWords = builder.reverseWords;
            this.theme = builder.theme;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PromptTag create() {
            return builder().build();
        }

        /**
         * @return necessaryTips
         */
        public String getNecessaryTips() {
            return this.necessaryTips;
        }

        /**
         * @return position
         */
        public String getPosition() {
            return this.position;
        }

        /**
         * @return reverseWords
         */
        public String getReverseWords() {
            return this.reverseWords;
        }

        /**
         * @return theme
         */
        public String getTheme() {
            return this.theme;
        }

        public static final class Builder {
            private String necessaryTips; 
            private String position; 
            private String reverseWords; 
            private String theme; 

            /**
             * NecessaryTips.
             */
            public Builder necessaryTips(String necessaryTips) {
                this.necessaryTips = necessaryTips;
                return this;
            }

            /**
             * Position.
             */
            public Builder position(String position) {
                this.position = position;
                return this;
            }

            /**
             * ReverseWords.
             */
            public Builder reverseWords(String reverseWords) {
                this.reverseWords = reverseWords;
                return this;
            }

            /**
             * Theme.
             */
            public Builder theme(String theme) {
                this.theme = theme;
                return this;
            }

            public PromptTag build() {
                return new PromptTag(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunStepByStepWritingRequest} extends {@link TeaModel}
     *
     * <p>RunStepByStepWritingRequest</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Keyword")
        private String keyword;

        @com.aliyun.core.annotation.NameInMap("Tag")
        private String tag;

        private Tags(Builder builder) {
            this.keyword = builder.keyword;
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return keyword
         */
        public String getKeyword() {
            return this.keyword;
        }

        /**
         * @return tag
         */
        public String getTag() {
            return this.tag;
        }

        public static final class Builder {
            private String keyword; 
            private String tag; 

            /**
             * Keyword.
             */
            public Builder keyword(String keyword) {
                this.keyword = keyword;
                return this;
            }

            /**
             * Tag.
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunStepByStepWritingRequest} extends {@link TeaModel}
     *
     * <p>RunStepByStepWritingRequest</p>
     */
    public static class WritingConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("Keywords")
        private java.util.List<String> keywords;

        @com.aliyun.core.annotation.NameInMap("PromptTag")
        private PromptTag promptTag;

        @com.aliyun.core.annotation.NameInMap("Scene")
        private String scene;

        @com.aliyun.core.annotation.NameInMap("Step")
        private String step;

        @com.aliyun.core.annotation.NameInMap("SummaryReturnType")
        private String summaryReturnType;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        @com.aliyun.core.annotation.NameInMap("UseSearch")
        private Boolean useSearch;

        private WritingConfig(Builder builder) {
            this.domain = builder.domain;
            this.keywords = builder.keywords;
            this.promptTag = builder.promptTag;
            this.scene = builder.scene;
            this.step = builder.step;
            this.summaryReturnType = builder.summaryReturnType;
            this.tags = builder.tags;
            this.useSearch = builder.useSearch;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WritingConfig create() {
            return builder().build();
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return keywords
         */
        public java.util.List<String> getKeywords() {
            return this.keywords;
        }

        /**
         * @return promptTag
         */
        public PromptTag getPromptTag() {
            return this.promptTag;
        }

        /**
         * @return scene
         */
        public String getScene() {
            return this.scene;
        }

        /**
         * @return step
         */
        public String getStep() {
            return this.step;
        }

        /**
         * @return summaryReturnType
         */
        public String getSummaryReturnType() {
            return this.summaryReturnType;
        }

        /**
         * @return tags
         */
        public java.util.List<Tags> getTags() {
            return this.tags;
        }

        /**
         * @return useSearch
         */
        public Boolean getUseSearch() {
            return this.useSearch;
        }

        public static final class Builder {
            private String domain; 
            private java.util.List<String> keywords; 
            private PromptTag promptTag; 
            private String scene; 
            private String step; 
            private String summaryReturnType; 
            private java.util.List<Tags> tags; 
            private Boolean useSearch; 

            /**
             * Domain.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * Keywords.
             */
            public Builder keywords(java.util.List<String> keywords) {
                this.keywords = keywords;
                return this;
            }

            /**
             * PromptTag.
             */
            public Builder promptTag(PromptTag promptTag) {
                this.promptTag = promptTag;
                return this;
            }

            /**
             * Scene.
             */
            public Builder scene(String scene) {
                this.scene = scene;
                return this;
            }

            /**
             * Step.
             */
            public Builder step(String step) {
                this.step = step;
                return this;
            }

            /**
             * SummaryReturnType.
             */
            public Builder summaryReturnType(String summaryReturnType) {
                this.summaryReturnType = summaryReturnType;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * UseSearch.
             */
            public Builder useSearch(Boolean useSearch) {
                this.useSearch = useSearch;
                return this;
            }

            public WritingConfig build() {
                return new WritingConfig(this);
            } 

        } 

    }
}
