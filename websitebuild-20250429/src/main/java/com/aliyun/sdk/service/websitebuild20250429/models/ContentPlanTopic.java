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
 * {@link ContentPlanTopic} extends {@link TeaModel}
 *
 * <p>ContentPlanTopic</p>
 */
public class ContentPlanTopic extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ArticleConversationId")
    private String articleConversationId;

    @com.aliyun.core.annotation.NameInMap("ArticleId")
    private String articleId;

    @com.aliyun.core.annotation.NameInMap("ArticleStatus")
    private String articleStatus;

    @com.aliyun.core.annotation.NameInMap("DiagnosisReferences")
    private java.util.List<String> diagnosisReferences;

    @com.aliyun.core.annotation.NameInMap("Direction")
    private String direction;

    @com.aliyun.core.annotation.NameInMap("FailReason")
    private String failReason;

    @com.aliyun.core.annotation.NameInMap("PlanId")
    private String planId;

    @com.aliyun.core.annotation.NameInMap("ProjectId")
    private String projectId;

    @com.aliyun.core.annotation.NameInMap("Rationale")
    private String rationale;

    @com.aliyun.core.annotation.NameInMap("RecommendedChannels")
    private java.util.List<String> recommendedChannels;

    @com.aliyun.core.annotation.NameInMap("ScheduledAt")
    private String scheduledAt;

    @com.aliyun.core.annotation.NameInMap("SkipReason")
    private String skipReason;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("Title")
    private String title;

    @com.aliyun.core.annotation.NameInMap("TopicId")
    private String topicId;

    @com.aliyun.core.annotation.NameInMap("WritingDirection")
    private String writingDirection;

    private ContentPlanTopic(Builder builder) {
        this.articleConversationId = builder.articleConversationId;
        this.articleId = builder.articleId;
        this.articleStatus = builder.articleStatus;
        this.diagnosisReferences = builder.diagnosisReferences;
        this.direction = builder.direction;
        this.failReason = builder.failReason;
        this.planId = builder.planId;
        this.projectId = builder.projectId;
        this.rationale = builder.rationale;
        this.recommendedChannels = builder.recommendedChannels;
        this.scheduledAt = builder.scheduledAt;
        this.skipReason = builder.skipReason;
        this.status = builder.status;
        this.title = builder.title;
        this.topicId = builder.topicId;
        this.writingDirection = builder.writingDirection;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ContentPlanTopic create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return articleConversationId
     */
    public String getArticleConversationId() {
        return this.articleConversationId;
    }

    /**
     * @return articleId
     */
    public String getArticleId() {
        return this.articleId;
    }

    /**
     * @return articleStatus
     */
    public String getArticleStatus() {
        return this.articleStatus;
    }

    /**
     * @return diagnosisReferences
     */
    public java.util.List<String> getDiagnosisReferences() {
        return this.diagnosisReferences;
    }

    /**
     * @return direction
     */
    public String getDirection() {
        return this.direction;
    }

    /**
     * @return failReason
     */
    public String getFailReason() {
        return this.failReason;
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
     * @return rationale
     */
    public String getRationale() {
        return this.rationale;
    }

    /**
     * @return recommendedChannels
     */
    public java.util.List<String> getRecommendedChannels() {
        return this.recommendedChannels;
    }

    /**
     * @return scheduledAt
     */
    public String getScheduledAt() {
        return this.scheduledAt;
    }

    /**
     * @return skipReason
     */
    public String getSkipReason() {
        return this.skipReason;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
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
     * @return writingDirection
     */
    public String getWritingDirection() {
        return this.writingDirection;
    }

    public static final class Builder {
        private String articleConversationId; 
        private String articleId; 
        private String articleStatus; 
        private java.util.List<String> diagnosisReferences; 
        private String direction; 
        private String failReason; 
        private String planId; 
        private String projectId; 
        private String rationale; 
        private java.util.List<String> recommendedChannels; 
        private String scheduledAt; 
        private String skipReason; 
        private String status; 
        private String title; 
        private String topicId; 
        private String writingDirection; 

        private Builder() {
        } 

        private Builder(ContentPlanTopic model) {
            this.articleConversationId = model.articleConversationId;
            this.articleId = model.articleId;
            this.articleStatus = model.articleStatus;
            this.diagnosisReferences = model.diagnosisReferences;
            this.direction = model.direction;
            this.failReason = model.failReason;
            this.planId = model.planId;
            this.projectId = model.projectId;
            this.rationale = model.rationale;
            this.recommendedChannels = model.recommendedChannels;
            this.scheduledAt = model.scheduledAt;
            this.skipReason = model.skipReason;
            this.status = model.status;
            this.title = model.title;
            this.topicId = model.topicId;
            this.writingDirection = model.writingDirection;
        } 

        /**
         * <p>The article generation session ID.</p>
         * 
         * <strong>example:</strong>
         * <p>conv_8a2b3c</p>
         */
        public Builder articleConversationId(String articleConversationId) {
            this.articleConversationId = articleConversationId;
            return this;
        }

        /**
         * <p>The generated article ID.</p>
         * 
         * <strong>example:</strong>
         * <p>art_9f2k3d</p>
         */
        public Builder articleId(String articleId) {
            this.articleId = articleId;
            return this;
        }

        /**
         * <p>The status of the associated article. Valid values: DRAFT, PUBLISHED, and PUBLISH_FAILED. This parameter is empty if the article is not generated.</p>
         * 
         * <strong>example:</strong>
         * <p>PUBLISHED</p>
         */
        public Builder articleStatus(String articleStatus) {
            this.articleStatus = articleStatus;
            return this;
        }

        /**
         * <p>The GEO diagnostic item references.</p>
         */
        public Builder diagnosisReferences(java.util.List<String> diagnosisReferences) {
            this.diagnosisReferences = diagnosisReferences;
            return this;
        }

        /**
         * <p>The content direction.</p>
         * 
         * <strong>example:</strong>
         * <p>Introduction to product capabilities</p>
         */
        public Builder direction(String direction) {
            this.direction = direction;
            return this;
        }

        /**
         * <p>The reason for the execution failure.</p>
         * 
         * <strong>example:</strong>
         * <p>Article generation failed. Try again later</p>
         */
        public Builder failReason(String failReason) {
            this.failReason = failReason;
            return this;
        }

        /**
         * <p>The content plan ID.</p>
         * 
         * <strong>example:</strong>
         * <p>plan_3f7a1c2e9b7d4a5f8c0e1d2b3a4c5d6e</p>
         */
        public Builder planId(String planId) {
            this.planId = planId;
            return this;
        }

        /**
         * <p>The workspace ID. This refers to the GEO workspace for brand marketing, which is the appWorkspaceId.</p>
         * 
         * <strong>example:</strong>
         * <p>d4e5f60718293a4b5c6d7e8f90a1b2c3</p>
         */
        public Builder projectId(String projectId) {
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>The rationale for topic selection.</p>
         * 
         * <strong>example:</strong>
         * <p>Users show high interest in AI website builder capabilities, making it a suitable entry point for brand awareness</p>
         */
        public Builder rationale(String rationale) {
            this.rationale = rationale;
            return this;
        }

        /**
         * <p>The recommended publishing channels.</p>
         */
        public Builder recommendedChannels(java.util.List<String> recommendedChannels) {
            this.recommendedChannels = recommendedChannels;
            return this;
        }

        /**
         * <p>The scheduled publish date in the yyyy-MM-dd format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-12</p>
         */
        public Builder scheduledAt(String scheduledAt) {
            this.scheduledAt = scheduledAt;
            return this;
        }

        /**
         * <p>The reason for skipping.</p>
         * 
         * <strong>example:</strong>
         * <p>This topic duplicates a published article and has been skipped</p>
         */
        public Builder skipReason(String skipReason) {
            this.skipReason = skipReason;
            return this;
        }

        /**
         * <p>The topic status.</p>
         * 
         * <strong>example:</strong>
         * <p>PENDING</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The content title.</p>
         * 
         * <strong>example:</strong>
         * <p>Analysis of the core capabilities of Wanxiaozhi AI website builder</p>
         */
        public Builder title(String title) {
            this.title = title;
            return this;
        }

        /**
         * <p>The topic ID.</p>
         * 
         * <strong>example:</strong>
         * <p>topic_3f7a1c2e9b7d4a5f8c0e1d2b3a4c5d6e</p>
         */
        public Builder topicId(String topicId) {
            this.topicId = topicId;
            return this;
        }

        /**
         * <p>The writing direction, which only describes the structure and perspective.</p>
         * 
         * <strong>example:</strong>
         * <p>First summarize the product positioning, then introduce the core capabilities point by point, and finally provide the applicable scenarios</p>
         */
        public Builder writingDirection(String writingDirection) {
            this.writingDirection = writingDirection;
            return this;
        }

        public ContentPlanTopic build() {
            return new ContentPlanTopic(this);
        } 

    } 

}
