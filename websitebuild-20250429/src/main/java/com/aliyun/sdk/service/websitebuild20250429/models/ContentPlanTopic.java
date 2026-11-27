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

    @com.aliyun.core.annotation.NameInMap("DeliveryMode")
    private String deliveryMode;

    @com.aliyun.core.annotation.NameInMap("DiagnosisReferences")
    private java.util.List<String> diagnosisReferences;

    @com.aliyun.core.annotation.NameInMap("Direction")
    private String direction;

    @com.aliyun.core.annotation.NameInMap("FailReason")
    private String failReason;

    @com.aliyun.core.annotation.NameInMap("NeedsAttention")
    private Boolean needsAttention;

    @com.aliyun.core.annotation.NameInMap("OriginType")
    private String originType;

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

    @com.aliyun.core.annotation.NameInMap("SocialStatus")
    private String socialStatus;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("Title")
    private String title;

    @com.aliyun.core.annotation.NameInMap("TopicId")
    private String topicId;

    @com.aliyun.core.annotation.NameInMap("WebsiteDraftId")
    private String websiteDraftId;

    @com.aliyun.core.annotation.NameInMap("WebsiteId")
    private String websiteId;

    @com.aliyun.core.annotation.NameInMap("WebsiteStatus")
    private String websiteStatus;

    @com.aliyun.core.annotation.NameInMap("WritingDirection")
    private String writingDirection;

    private ContentPlanTopic(Builder builder) {
        this.articleConversationId = builder.articleConversationId;
        this.articleId = builder.articleId;
        this.articleStatus = builder.articleStatus;
        this.deliveryMode = builder.deliveryMode;
        this.diagnosisReferences = builder.diagnosisReferences;
        this.direction = builder.direction;
        this.failReason = builder.failReason;
        this.needsAttention = builder.needsAttention;
        this.originType = builder.originType;
        this.planId = builder.planId;
        this.projectId = builder.projectId;
        this.rationale = builder.rationale;
        this.recommendedChannels = builder.recommendedChannels;
        this.scheduledAt = builder.scheduledAt;
        this.skipReason = builder.skipReason;
        this.socialStatus = builder.socialStatus;
        this.status = builder.status;
        this.title = builder.title;
        this.topicId = builder.topicId;
        this.websiteDraftId = builder.websiteDraftId;
        this.websiteId = builder.websiteId;
        this.websiteStatus = builder.websiteStatus;
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
     * @return deliveryMode
     */
    public String getDeliveryMode() {
        return this.deliveryMode;
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
     * @return needsAttention
     */
    public Boolean getNeedsAttention() {
        return this.needsAttention;
    }

    /**
     * @return originType
     */
    public String getOriginType() {
        return this.originType;
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
     * @return socialStatus
     */
    public String getSocialStatus() {
        return this.socialStatus;
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
     * @return websiteDraftId
     */
    public String getWebsiteDraftId() {
        return this.websiteDraftId;
    }

    /**
     * @return websiteId
     */
    public String getWebsiteId() {
        return this.websiteId;
    }

    /**
     * @return websiteStatus
     */
    public String getWebsiteStatus() {
        return this.websiteStatus;
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
        private String deliveryMode; 
        private java.util.List<String> diagnosisReferences; 
        private String direction; 
        private String failReason; 
        private Boolean needsAttention; 
        private String originType; 
        private String planId; 
        private String projectId; 
        private String rationale; 
        private java.util.List<String> recommendedChannels; 
        private String scheduledAt; 
        private String skipReason; 
        private String socialStatus; 
        private String status; 
        private String title; 
        private String topicId; 
        private String websiteDraftId; 
        private String websiteId; 
        private String websiteStatus; 
        private String writingDirection; 

        private Builder() {
        } 

        private Builder(ContentPlanTopic model) {
            this.articleConversationId = model.articleConversationId;
            this.articleId = model.articleId;
            this.articleStatus = model.articleStatus;
            this.deliveryMode = model.deliveryMode;
            this.diagnosisReferences = model.diagnosisReferences;
            this.direction = model.direction;
            this.failReason = model.failReason;
            this.needsAttention = model.needsAttention;
            this.originType = model.originType;
            this.planId = model.planId;
            this.projectId = model.projectId;
            this.rationale = model.rationale;
            this.recommendedChannels = model.recommendedChannels;
            this.scheduledAt = model.scheduledAt;
            this.skipReason = model.skipReason;
            this.socialStatus = model.socialStatus;
            this.status = model.status;
            this.title = model.title;
            this.topicId = model.topicId;
            this.websiteDraftId = model.websiteDraftId;
            this.websiteId = model.websiteId;
            this.websiteStatus = model.websiteStatus;
            this.writingDirection = model.writingDirection;
        } 

        /**
         * <p>The session ID for article generation.</p>
         * 
         * <strong>example:</strong>
         * <p>conv_8a2b3c</p>
         */
        public Builder articleConversationId(String articleConversationId) {
            this.articleConversationId = articleConversationId;
            return this;
        }

        /**
         * <p>The ID of the generated article.</p>
         * 
         * <strong>example:</strong>
         * <p>art_9f2k3d</p>
         */
        public Builder articleId(String articleId) {
            this.articleId = articleId;
            return this;
        }

        /**
         * <p>The status of the associated article. Valid values: DRAFT, PUBLISHED, and PUBLISH_FAILED. This field is empty if no article is generated.</p>
         * 
         * <strong>example:</strong>
         * <p>PUBLISHED</p>
         */
        public Builder articleStatus(String articleStatus) {
            this.articleStatus = articleStatus;
            return this;
        }

        /**
         * <p>The delivery mode inherited from the plan. Valid values: SOCIAL, WEBSITE, and BOTH. Historical and unplanned manual entries default to SOCIAL.</p>
         * 
         * <strong>example:</strong>
         * <p>BOTH</p>
         */
        public Builder deliveryMode(String deliveryMode) {
            this.deliveryMode = deliveryMode;
            return this;
        }

        /**
         * <p>The GEO diagnostic references.</p>
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
         * <p>The reason for execution failure.</p>
         * 
         * <strong>example:</strong>
         * <p>Article generation failed. Try again later</p>
         */
        public Builder failReason(String failReason) {
            this.failReason = failReason;
            return this;
        }

        /**
         * <p>Specifies whether user action is still required. Ignored or successful channels are not counted as pending tasks.</p>
         */
        public Builder needsAttention(Boolean needsAttention) {
            this.needsAttention = needsAttention;
            return this;
        }

        /**
         * <p>The origin type. Valid values: PLAN for full-term plans and MANUAL for manual scheduling.</p>
         * 
         * <strong>example:</strong>
         * <p>PLAN</p>
         */
        public Builder originType(String originType) {
            this.originType = originType;
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
         * <p>The workspace ID, which refers to the appWorkspaceId for GEO workspaces of the brand marketing type.</p>
         * 
         * <strong>example:</strong>
         * <p>d4e5f60718293a4b5c6d7e8f90a1b2c3</p>
         */
        public Builder projectId(String projectId) {
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>The topic rationale.</p>
         * 
         * <strong>example:</strong>
         * <p>Users show high interest in the capabilities of AI website building products, making it a suitable entry point for brand awareness</p>
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
         * <p>This topic is a duplicate of a published article and has been skipped</p>
         */
        public Builder skipReason(String skipReason) {
            this.skipReason = skipReason;
            return this;
        }

        /**
         * <p>The social media delivery status. Valid values: PENDING, RUNNING, FAILED, SUCCESS, and IGNORED. This field is empty if no record exists. Platform drafts are not considered successful.</p>
         * 
         * <strong>example:</strong>
         * <p>PENDING</p>
         */
        public Builder socialStatus(String socialStatus) {
            this.socialStatus = socialStatus;
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
         * <p>Core capabilities of the Wanxiaozhi AI website builder</p>
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
         * <p>The channel draft ID bound to the website delivery. This field is empty if no draft is created or no record exists.</p>
         * 
         * <strong>example:</strong>
         * <p>draft_example001</p>
         */
        public Builder websiteDraftId(String websiteDraftId) {
            this.websiteDraftId = websiteDraftId;
            return this;
        }

        /**
         * <p>The website target ID for the entry. If delivery exists, the bound website is used. If no article is generated, the plan configuration is inherited.</p>
         * 
         * <strong>example:</strong>
         * <p>WS20261126000000000001</p>
         */
        public Builder websiteId(String websiteId) {
            this.websiteId = websiteId;
            return this;
        }

        /**
         * <p>The website delivery status. Valid values: PENDING, RUNNING, UNKNOWN, FAILED, SUCCESS, and IGNORED. This field is empty if no record exists.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        public Builder websiteStatus(String websiteStatus) {
            this.websiteStatus = websiteStatus;
            return this;
        }

        /**
         * <p>The writing direction, which describes only the structure and perspective.</p>
         * 
         * <strong>example:</strong>
         * <p>Start with an overview of the product positioning, introduce the core capabilities in bullet points, and conclude with applicable scenarios</p>
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
