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
 * {@link SubmitCustomSourceTopicAnalysisRequest} extends {@link RequestModel}
 *
 * <p>SubmitCustomSourceTopicAnalysisRequest</p>
 */
public class SubmitCustomSourceTopicAnalysisRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AnalysisTypes")
    private java.util.List<String> analysisTypes;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FileType")
    private String fileType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FileUrl")
    private String fileUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxTopicSize")
    private Integer maxTopicSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("News")
    private java.util.List<News> news;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Topics")
    private java.util.List<Topics> topics;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TopicsFileUrl")
    private String topicsFileUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private SubmitCustomSourceTopicAnalysisRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.analysisTypes = builder.analysisTypes;
        this.fileType = builder.fileType;
        this.fileUrl = builder.fileUrl;
        this.maxTopicSize = builder.maxTopicSize;
        this.news = builder.news;
        this.topics = builder.topics;
        this.topicsFileUrl = builder.topicsFileUrl;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitCustomSourceTopicAnalysisRequest create() {
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
     * @return analysisTypes
     */
    public java.util.List<String> getAnalysisTypes() {
        return this.analysisTypes;
    }

    /**
     * @return fileType
     */
    public String getFileType() {
        return this.fileType;
    }

    /**
     * @return fileUrl
     */
    public String getFileUrl() {
        return this.fileUrl;
    }

    /**
     * @return maxTopicSize
     */
    public Integer getMaxTopicSize() {
        return this.maxTopicSize;
    }

    /**
     * @return news
     */
    public java.util.List<News> getNews() {
        return this.news;
    }

    /**
     * @return topics
     */
    public java.util.List<Topics> getTopics() {
        return this.topics;
    }

    /**
     * @return topicsFileUrl
     */
    public String getTopicsFileUrl() {
        return this.topicsFileUrl;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<SubmitCustomSourceTopicAnalysisRequest, Builder> {
        private String regionId; 
        private java.util.List<String> analysisTypes; 
        private String fileType; 
        private String fileUrl; 
        private Integer maxTopicSize; 
        private java.util.List<News> news; 
        private java.util.List<Topics> topics; 
        private String topicsFileUrl; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(SubmitCustomSourceTopicAnalysisRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.analysisTypes = request.analysisTypes;
            this.fileType = request.fileType;
            this.fileUrl = request.fileUrl;
            this.maxTopicSize = request.maxTopicSize;
            this.news = request.news;
            this.topics = request.topics;
            this.topicsFileUrl = request.topicsFileUrl;
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
         * AnalysisTypes.
         */
        public Builder analysisTypes(java.util.List<String> analysisTypes) {
            String analysisTypesShrink = shrink(analysisTypes, "AnalysisTypes", "json");
            this.putBodyParameter("AnalysisTypes", analysisTypesShrink);
            this.analysisTypes = analysisTypes;
            return this;
        }

        /**
         * FileType.
         */
        public Builder fileType(String fileType) {
            this.putBodyParameter("FileType", fileType);
            this.fileType = fileType;
            return this;
        }

        /**
         * FileUrl.
         */
        public Builder fileUrl(String fileUrl) {
            this.putBodyParameter("FileUrl", fileUrl);
            this.fileUrl = fileUrl;
            return this;
        }

        /**
         * MaxTopicSize.
         */
        public Builder maxTopicSize(Integer maxTopicSize) {
            this.putBodyParameter("MaxTopicSize", maxTopicSize);
            this.maxTopicSize = maxTopicSize;
            return this;
        }

        /**
         * News.
         */
        public Builder news(java.util.List<News> news) {
            String newsShrink = shrink(news, "News", "json");
            this.putBodyParameter("News", newsShrink);
            this.news = news;
            return this;
        }

        /**
         * Topics.
         */
        public Builder topics(java.util.List<Topics> topics) {
            String topicsShrink = shrink(topics, "Topics", "json");
            this.putBodyParameter("Topics", topicsShrink);
            this.topics = topics;
            return this;
        }

        /**
         * TopicsFileUrl.
         */
        public Builder topicsFileUrl(String topicsFileUrl) {
            this.putBodyParameter("TopicsFileUrl", topicsFileUrl);
            this.topicsFileUrl = topicsFileUrl;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-xx</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public SubmitCustomSourceTopicAnalysisRequest build() {
            return new SubmitCustomSourceTopicAnalysisRequest(this);
        } 

    } 

    /**
     * 
     * {@link SubmitCustomSourceTopicAnalysisRequest} extends {@link TeaModel}
     *
     * <p>SubmitCustomSourceTopicAnalysisRequest</p>
     */
    public static class Comments extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Text")
        private String text;

        private Comments(Builder builder) {
            this.text = builder.text;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Comments create() {
            return builder().build();
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        public static final class Builder {
            private String text; 

            private Builder() {
            } 

            private Builder(Comments model) {
                this.text = model.text;
            } 

            /**
             * Text.
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            public Comments build() {
                return new Comments(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitCustomSourceTopicAnalysisRequest} extends {@link TeaModel}
     *
     * <p>SubmitCustomSourceTopicAnalysisRequest</p>
     */
    public static class News extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Comments")
        private java.util.List<Comments> comments;

        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("PubTime")
        private String pubTime;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private News(Builder builder) {
            this.comments = builder.comments;
            this.content = builder.content;
            this.pubTime = builder.pubTime;
            this.source = builder.source;
            this.title = builder.title;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static News create() {
            return builder().build();
        }

        /**
         * @return comments
         */
        public java.util.List<Comments> getComments() {
            return this.comments;
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
            private java.util.List<Comments> comments; 
            private String content; 
            private String pubTime; 
            private String source; 
            private String title; 
            private String url; 

            private Builder() {
            } 

            private Builder(News model) {
                this.comments = model.comments;
                this.content = model.content;
                this.pubTime = model.pubTime;
                this.source = model.source;
                this.title = model.title;
                this.url = model.url;
            } 

            /**
             * Comments.
             */
            public Builder comments(java.util.List<Comments> comments) {
                this.comments = comments;
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

            public News build() {
                return new News(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitCustomSourceTopicAnalysisRequest} extends {@link TeaModel}
     *
     * <p>SubmitCustomSourceTopicAnalysisRequest</p>
     */
    public static class Topics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("News")
        private java.util.List<HottopicNews> news;

        @com.aliyun.core.annotation.NameInMap("Topic")
        private String topic;

        private Topics(Builder builder) {
            this.news = builder.news;
            this.topic = builder.topic;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Topics create() {
            return builder().build();
        }

        /**
         * @return news
         */
        public java.util.List<HottopicNews> getNews() {
            return this.news;
        }

        /**
         * @return topic
         */
        public String getTopic() {
            return this.topic;
        }

        public static final class Builder {
            private java.util.List<HottopicNews> news; 
            private String topic; 

            private Builder() {
            } 

            private Builder(Topics model) {
                this.news = model.news;
                this.topic = model.topic;
            } 

            /**
             * News.
             */
            public Builder news(java.util.List<HottopicNews> news) {
                this.news = news;
                return this;
            }

            /**
             * Topic.
             */
            public Builder topic(String topic) {
                this.topic = topic;
                return this;
            }

            public Topics build() {
                return new Topics(this);
            } 

        } 

    }
}
