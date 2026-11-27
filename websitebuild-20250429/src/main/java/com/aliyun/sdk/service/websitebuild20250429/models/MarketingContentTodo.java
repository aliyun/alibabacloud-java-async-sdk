// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.websitebuild20250429.models;

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
 * {@link MarketingContentTodo} extends {@link TeaModel}
 *
 * <p>MarketingContentTodo</p>
 */
public class MarketingContentTodo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ArticleId")
    private String articleId;

    @com.aliyun.core.annotation.NameInMap("ConversationId")
    private String conversationId;

    @com.aliyun.core.annotation.NameInMap("PlanId")
    private String planId;

    @com.aliyun.core.annotation.NameInMap("ProjectId")
    private String projectId;

    @com.aliyun.core.annotation.NameInMap("Reason")
    private String reason;

    @com.aliyun.core.annotation.NameInMap("ScheduledAt")
    private String scheduledAt;

    @com.aliyun.core.annotation.NameInMap("SocialStatus")
    private String socialStatus;

    @com.aliyun.core.annotation.NameInMap("Title")
    private String title;

    @com.aliyun.core.annotation.NameInMap("TopicId")
    private String topicId;

    @com.aliyun.core.annotation.NameInMap("WebsiteStatus")
    private String websiteStatus;

    private MarketingContentTodo(Builder builder) {
        this.articleId = builder.articleId;
        this.conversationId = builder.conversationId;
        this.planId = builder.planId;
        this.projectId = builder.projectId;
        this.reason = builder.reason;
        this.scheduledAt = builder.scheduledAt;
        this.socialStatus = builder.socialStatus;
        this.title = builder.title;
        this.topicId = builder.topicId;
        this.websiteStatus = builder.websiteStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MarketingContentTodo create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return articleId
     */
    public String getArticleId() {
        return this.articleId;
    }

    /**
     * @return conversationId
     */
    public String getConversationId() {
        return this.conversationId;
    }

    /**
     * @return planId
     */
    public String getPlanId() {
        return this.planId;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return reason
     */
    public String getReason() {
        return this.reason;
    }

    /**
     * @return scheduledAt
     */
    public String getScheduledAt() {
        return this.scheduledAt;
    }

    /**
     * @return socialStatus
     */
    public String getSocialStatus() {
        return this.socialStatus;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @return topicId
     */
    public String getTopicId() {
        return this.topicId;
    }

    /**
     * @return websiteStatus
     */
    public String getWebsiteStatus() {
        return this.websiteStatus;
    }

    public static final class Builder {
        private String articleId; 
        private String conversationId; 
        private String planId; 
        private String projectId; 
        private String reason; 
        private String scheduledAt; 
        private String socialStatus; 
        private String title; 
        private String topicId; 
        private String websiteStatus; 

        private Builder() {
        } 

        private Builder(MarketingContentTodo model) {
            this.articleId = model.articleId;
            this.conversationId = model.conversationId;
            this.planId = model.planId;
            this.projectId = model.projectId;
            this.reason = model.reason;
            this.scheduledAt = model.scheduledAt;
            this.socialStatus = model.socialStatus;
            this.title = model.title;
            this.topicId = model.topicId;
            this.websiteStatus = model.websiteStatus;
        } 

        /**
         * <p>The article ID.</p>
         * 
         * <strong>example:</strong>
         * <p>article_example001</p>
         */
        public Builder articleId(String articleId) {
            this.articleId = articleId;
            return this;
        }

        /**
         * <p>The article creation session ID.</p>
         * 
         * <strong>example:</strong>
         * <p>conversation_example001</p>
         */
        public Builder conversationId(String conversationId) {
            this.conversationId = conversationId;
            return this;
        }

        /**
         * <p>The content creation plan ID.</p>
         * 
         * <strong>example:</strong>
         * <p>plan_example001</p>
         */
        public Builder planId(String planId) {
            this.planId = planId;
            return this;
        }

        /**
         * <p>The GEO project ID.</p>
         * 
         * <strong>example:</strong>
         * <p>AW20261126000000000001</p>
         */
        public Builder projectId(String projectId) {
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>The reason for adding the entry to the to-do list.</p>
         * 
         * <strong>example:</strong>
         * <p>WEBSITE_PUBLISH_FAILED</p>
         */
        public Builder reason(String reason) {
            this.reason = reason;
            return this;
        }

        /**
         * <p>The scheduled publication date of the entry in yyyy-MM-dd format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-11-26</p>
         */
        public Builder scheduledAt(String scheduledAt) {
            this.scheduledAt = scheduledAt;
            return this;
        }

        /**
         * <p>The distribution status of the social media channel.</p>
         * 
         * <strong>example:</strong>
         * <p>PENDING</p>
         */
        public Builder socialStatus(String socialStatus) {
            this.socialStatus = socialStatus;
            return this;
        }

        /**
         * <p>The web page or content title.</p>
         * 
         * <strong>example:</strong>
         * <p>About Example Technology</p>
         */
        public Builder title(String title) {
            this.title = title;
            return this;
        }

        /**
         * <p>The calendar topic ID.</p>
         * 
         * <strong>example:</strong>
         * <p>topic_example001</p>
         */
        public Builder topicId(String topicId) {
            this.topicId = topicId;
            return this;
        }

        /**
         * <p>The distribution status of the official website channel.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        public Builder websiteStatus(String websiteStatus) {
            this.websiteStatus = websiteStatus;
            return this;
        }

        public MarketingContentTodo build() {
            return new MarketingContentTodo(this);
        } 

    } 

}
