// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitCustomTopicSelectionPerspectiveAnalysisTaskRequest} extends {@link RequestModel}
 *
 * <p>SubmitCustomTopicSelectionPerspectiveAnalysisTaskRequest</p>
 */
public class SubmitCustomTopicSelectionPerspectiveAnalysisTaskRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Documents")
    private java.util.List < Documents> documents;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Prompt")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 2000)
    private String prompt;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Topic")
    @com.aliyun.core.annotation.Validation(maxLength = 1000)
    private String topic;

    private SubmitCustomTopicSelectionPerspectiveAnalysisTaskRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.agentKey = builder.agentKey;
        this.documents = builder.documents;
        this.prompt = builder.prompt;
        this.topic = builder.topic;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitCustomTopicSelectionPerspectiveAnalysisTaskRequest create() {
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
    public java.util.List < Documents> getDocuments() {
        return this.documents;
    }

    /**
     * @return prompt
     */
    public String getPrompt() {
        return this.prompt;
    }

    /**
     * @return topic
     */
    public String getTopic() {
        return this.topic;
    }

    public static final class Builder extends Request.Builder<SubmitCustomTopicSelectionPerspectiveAnalysisTaskRequest, Builder> {
        private String regionId; 
        private String agentKey; 
        private java.util.List < Documents> documents; 
        private String prompt; 
        private String topic; 

        private Builder() {
            super();
        } 

        private Builder(SubmitCustomTopicSelectionPerspectiveAnalysisTaskRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.agentKey = request.agentKey;
            this.documents = request.documents;
            this.prompt = request.prompt;
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
         * AgentKey.
         */
        public Builder agentKey(String agentKey) {
            this.putQueryParameter("AgentKey", agentKey);
            this.agentKey = agentKey;
            return this;
        }

        /**
         * Documents.
         */
        public Builder documents(java.util.List < Documents> documents) {
            String documentsShrink = shrink(documents, "Documents", "json");
            this.putBodyParameter("Documents", documentsShrink);
            this.documents = documents;
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
         * Topic.
         */
        public Builder topic(String topic) {
            this.putBodyParameter("Topic", topic);
            this.topic = topic;
            return this;
        }

        @Override
        public SubmitCustomTopicSelectionPerspectiveAnalysisTaskRequest build() {
            return new SubmitCustomTopicSelectionPerspectiveAnalysisTaskRequest(this);
        } 

    } 

    public static class Documents extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Author")
        @com.aliyun.core.annotation.Validation(maxLength = 100)
        private String author;

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
