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
 * {@link SubmitTopicSelectionPerspectiveAnalysisTaskRequest} extends {@link RequestModel}
 *
 * <p>SubmitTopicSelectionPerspectiveAnalysisTaskRequest</p>
 */
public class SubmitTopicSelectionPerspectiveAnalysisTaskRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Documents")
    private java.util.List<Documents> documents;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PerspectiveTypes")
    private java.util.List<String> perspectiveTypes;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Topic")
    @com.aliyun.core.annotation.Validation(maxLength = 1000)
    private String topic;

    private SubmitTopicSelectionPerspectiveAnalysisTaskRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.agentKey = builder.agentKey;
        this.documents = builder.documents;
        this.perspectiveTypes = builder.perspectiveTypes;
        this.topic = builder.topic;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitTopicSelectionPerspectiveAnalysisTaskRequest create() {
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
     * @return agentKey
     */
    public String getAgentKey() {
        return this.agentKey;
    }

    /**
     * @return documents
     */
    public java.util.List<Documents> getDocuments() {
        return this.documents;
    }

    /**
     * @return perspectiveTypes
     */
    public java.util.List<String> getPerspectiveTypes() {
        return this.perspectiveTypes;
    }

    /**
     * @return topic
     */
    public String getTopic() {
        return this.topic;
    }

    public static final class Builder extends Request.Builder<SubmitTopicSelectionPerspectiveAnalysisTaskRequest, Builder> {
        private String regionId; 
        private String agentKey; 
        private java.util.List<Documents> documents; 
        private java.util.List<String> perspectiveTypes; 
        private String topic; 

        private Builder() {
            super();
        } 

        private Builder(SubmitTopicSelectionPerspectiveAnalysisTaskRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.agentKey = request.agentKey;
            this.documents = request.documents;
            this.perspectiveTypes = request.perspectiveTypes;
            this.topic = request.topic;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxx_p_efm</p>
         */
        public Builder agentKey(String agentKey) {
            this.putQueryParameter("AgentKey", agentKey);
            this.agentKey = agentKey;
            return this;
        }

        /**
         * Documents.
         */
        public Builder documents(java.util.List<Documents> documents) {
            String documentsShrink = shrink(documents, "Documents", "json");
            this.putBodyParameter("Documents", documentsShrink);
            this.documents = documents;
            return this;
        }

        /**
         * PerspectiveTypes.
         */
        public Builder perspectiveTypes(java.util.List<String> perspectiveTypes) {
            String perspectiveTypesShrink = shrink(perspectiveTypes, "PerspectiveTypes", "json");
            this.putBodyParameter("PerspectiveTypes", perspectiveTypesShrink);
            this.perspectiveTypes = perspectiveTypes;
            return this;
        }

        /**
         * Topic.
         */
        public Builder topic(String topic) {
            this.putBodyParameter("Topic", topic);
            this.topic = topic;
            return this;
        }

        @Override
        public SubmitTopicSelectionPerspectiveAnalysisTaskRequest build() {
            return new SubmitTopicSelectionPerspectiveAnalysisTaskRequest(this);
        } 

    } 

    /**
     * 
     * {@link SubmitTopicSelectionPerspectiveAnalysisTaskRequest} extends {@link TeaModel}
     *
     * <p>SubmitTopicSelectionPerspectiveAnalysisTaskRequest</p>
     */
    public static class Comments extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Text")
        private String text;

        @com.aliyun.core.annotation.NameInMap("Username")
        private String username;

        private Comments(Builder builder) {
            this.text = builder.text;
            this.username = builder.username;
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

        /**
         * @return username
         */
        public String getUsername() {
            return this.username;
        }

        public static final class Builder {
            private String text; 
            private String username; 

            /**
             * Text.
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            /**
             * Username.
             */
            public Builder username(String username) {
                this.username = username;
                return this;
            }

            public Comments build() {
                return new Comments(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitTopicSelectionPerspectiveAnalysisTaskRequest} extends {@link TeaModel}
     *
     * <p>SubmitTopicSelectionPerspectiveAnalysisTaskRequest</p>
     */
    public static class Documents extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Author")
        @com.aliyun.core.annotation.Validation(maxLength = 100)
        private String author;

        @com.aliyun.core.annotation.NameInMap("Comments")
        private java.util.List<Comments> comments;

        @com.aliyun.core.annotation.NameInMap("Content")
        @com.aliyun.core.annotation.Validation(required = true, maxLength = 3000, minLength = 30)
        private String content;

        @com.aliyun.core.annotation.NameInMap("PubTime")
        @com.aliyun.core.annotation.Validation(maxLength = 19)
        private String pubTime;

        @com.aliyun.core.annotation.NameInMap("Source")
        @com.aliyun.core.annotation.Validation(maxLength = 40)
        private String source;

        @com.aliyun.core.annotation.NameInMap("Summary")
        @com.aliyun.core.annotation.Validation(maxLength = 200)
        private String summary;

        @com.aliyun.core.annotation.NameInMap("Title")
        @com.aliyun.core.annotation.Validation(maxLength = 100)
        private String title;

        @com.aliyun.core.annotation.NameInMap("Url")
        @com.aliyun.core.annotation.Validation(maxLength = 1024)
        private String url;

        private Documents(Builder builder) {
            this.author = builder.author;
            this.comments = builder.comments;
            this.content = builder.content;
            this.pubTime = builder.pubTime;
            this.source = builder.source;
            this.summary = builder.summary;
            this.title = builder.title;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Documents create() {
            return builder().build();
        }

        /**
         * @return author
         */
        public String getAuthor() {
            return this.author;
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
            private String author; 
            private java.util.List<Comments> comments; 
            private String content; 
            private String pubTime; 
            private String source; 
            private String summary; 
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
             * Comments.
             */
            public Builder comments(java.util.List<Comments> comments) {
                this.comments = comments;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>文章内容</p>
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

            public Documents build() {
                return new Documents(this);
            } 

        } 

    }
}
