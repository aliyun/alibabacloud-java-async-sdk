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
 * {@link MarketingOverview} extends {@link TeaModel}
 *
 * <p>MarketingOverview</p>
 */
public class MarketingOverview extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ChannelDistribution")
    private java.util.List<MarketingChannelDistribution> channelDistribution;

    @com.aliyun.core.annotation.NameInMap("ContentGenerationFailedCount")
    private Long contentGenerationFailedCount;

    @com.aliyun.core.annotation.NameInMap("ContentTodoCount")
    private Long contentTodoCount;

    @com.aliyun.core.annotation.NameInMap("DistributedArticles")
    private Long distributedArticles;

    @com.aliyun.core.annotation.NameInMap("EndedPlanCount")
    private Long endedPlanCount;

    @com.aliyun.core.annotation.NameInMap("EndedPlans")
    private java.util.List<MarketingEndedPlan> endedPlans;

    @com.aliyun.core.annotation.NameInMap("GeneratedArticleTasks")
    private Long generatedArticleTasks;

    @com.aliyun.core.annotation.NameInMap("GeneratedImageTasks")
    private Long generatedImageTasks;

    @com.aliyun.core.annotation.NameInMap("GeneratedVideoTasks")
    private Long generatedVideoTasks;

    @com.aliyun.core.annotation.NameInMap("GenerationTrend")
    private java.util.List<MarketingGenerationDay> generationTrend;

    @com.aliyun.core.annotation.NameInMap("LatestSingleDiagnoses")
    private java.util.List<MarketingDiagnosisSummary> latestSingleDiagnoses;

    @com.aliyun.core.annotation.NameInMap("PendingDistributionCount")
    private Long pendingDistributionCount;

    @com.aliyun.core.annotation.NameInMap("PendingPlanDrafts")
    private Long pendingPlanDrafts;

    @com.aliyun.core.annotation.NameInMap("SingleDiagnosisCount")
    private Long singleDiagnosisCount;

    @com.aliyun.core.annotation.NameInMap("Timezone")
    private String timezone;

    @com.aliyun.core.annotation.NameInMap("UnknownGeneratedTimeCount")
    private Long unknownGeneratedTimeCount;

    @com.aliyun.core.annotation.NameInMap("UnknownPublishedTimeCount")
    private Long unknownPublishedTimeCount;

    @com.aliyun.core.annotation.NameInMap("UnreadDiagnoses")
    private java.util.List<MarketingDiagnosisSummary> unreadDiagnoses;

    @com.aliyun.core.annotation.NameInMap("UnreadDiagnosisCount")
    private Long unreadDiagnosisCount;

    @com.aliyun.core.annotation.NameInMap("WebsitePublishFailedCount")
    private Long websitePublishFailedCount;

    @com.aliyun.core.annotation.NameInMap("WindowEnd")
    private Long windowEnd;

    @com.aliyun.core.annotation.NameInMap("WindowStart")
    private Long windowStart;

    private MarketingOverview(Builder builder) {
        this.channelDistribution = builder.channelDistribution;
        this.contentGenerationFailedCount = builder.contentGenerationFailedCount;
        this.contentTodoCount = builder.contentTodoCount;
        this.distributedArticles = builder.distributedArticles;
        this.endedPlanCount = builder.endedPlanCount;
        this.endedPlans = builder.endedPlans;
        this.generatedArticleTasks = builder.generatedArticleTasks;
        this.generatedImageTasks = builder.generatedImageTasks;
        this.generatedVideoTasks = builder.generatedVideoTasks;
        this.generationTrend = builder.generationTrend;
        this.latestSingleDiagnoses = builder.latestSingleDiagnoses;
        this.pendingDistributionCount = builder.pendingDistributionCount;
        this.pendingPlanDrafts = builder.pendingPlanDrafts;
        this.singleDiagnosisCount = builder.singleDiagnosisCount;
        this.timezone = builder.timezone;
        this.unknownGeneratedTimeCount = builder.unknownGeneratedTimeCount;
        this.unknownPublishedTimeCount = builder.unknownPublishedTimeCount;
        this.unreadDiagnoses = builder.unreadDiagnoses;
        this.unreadDiagnosisCount = builder.unreadDiagnosisCount;
        this.websitePublishFailedCount = builder.websitePublishFailedCount;
        this.windowEnd = builder.windowEnd;
        this.windowStart = builder.windowStart;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MarketingOverview create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return channelDistribution
     */
    public java.util.List<MarketingChannelDistribution> getChannelDistribution() {
        return this.channelDistribution;
    }

    /**
     * @return contentGenerationFailedCount
     */
    public Long getContentGenerationFailedCount() {
        return this.contentGenerationFailedCount;
    }

    /**
     * @return contentTodoCount
     */
    public Long getContentTodoCount() {
        return this.contentTodoCount;
    }

    /**
     * @return distributedArticles
     */
    public Long getDistributedArticles() {
        return this.distributedArticles;
    }

    /**
     * @return endedPlanCount
     */
    public Long getEndedPlanCount() {
        return this.endedPlanCount;
    }

    /**
     * @return endedPlans
     */
    public java.util.List<MarketingEndedPlan> getEndedPlans() {
        return this.endedPlans;
    }

    /**
     * @return generatedArticleTasks
     */
    public Long getGeneratedArticleTasks() {
        return this.generatedArticleTasks;
    }

    /**
     * @return generatedImageTasks
     */
    public Long getGeneratedImageTasks() {
        return this.generatedImageTasks;
    }

    /**
     * @return generatedVideoTasks
     */
    public Long getGeneratedVideoTasks() {
        return this.generatedVideoTasks;
    }

    /**
     * @return generationTrend
     */
    public java.util.List<MarketingGenerationDay> getGenerationTrend() {
        return this.generationTrend;
    }

    /**
     * @return latestSingleDiagnoses
     */
    public java.util.List<MarketingDiagnosisSummary> getLatestSingleDiagnoses() {
        return this.latestSingleDiagnoses;
    }

    /**
     * @return pendingDistributionCount
     */
    public Long getPendingDistributionCount() {
        return this.pendingDistributionCount;
    }

    /**
     * @return pendingPlanDrafts
     */
    public Long getPendingPlanDrafts() {
        return this.pendingPlanDrafts;
    }

    /**
     * @return singleDiagnosisCount
     */
    public Long getSingleDiagnosisCount() {
        return this.singleDiagnosisCount;
    }

    /**
     * @return timezone
     */
    public String getTimezone() {
        return this.timezone;
    }

    /**
     * @return unknownGeneratedTimeCount
     */
    public Long getUnknownGeneratedTimeCount() {
        return this.unknownGeneratedTimeCount;
    }

    /**
     * @return unknownPublishedTimeCount
     */
    public Long getUnknownPublishedTimeCount() {
        return this.unknownPublishedTimeCount;
    }

    /**
     * @return unreadDiagnoses
     */
    public java.util.List<MarketingDiagnosisSummary> getUnreadDiagnoses() {
        return this.unreadDiagnoses;
    }

    /**
     * @return unreadDiagnosisCount
     */
    public Long getUnreadDiagnosisCount() {
        return this.unreadDiagnosisCount;
    }

    /**
     * @return websitePublishFailedCount
     */
    public Long getWebsitePublishFailedCount() {
        return this.websitePublishFailedCount;
    }

    /**
     * @return windowEnd
     */
    public Long getWindowEnd() {
        return this.windowEnd;
    }

    /**
     * @return windowStart
     */
    public Long getWindowStart() {
        return this.windowStart;
    }

    public static final class Builder {
        private java.util.List<MarketingChannelDistribution> channelDistribution; 
        private Long contentGenerationFailedCount; 
        private Long contentTodoCount; 
        private Long distributedArticles; 
        private Long endedPlanCount; 
        private java.util.List<MarketingEndedPlan> endedPlans; 
        private Long generatedArticleTasks; 
        private Long generatedImageTasks; 
        private Long generatedVideoTasks; 
        private java.util.List<MarketingGenerationDay> generationTrend; 
        private java.util.List<MarketingDiagnosisSummary> latestSingleDiagnoses; 
        private Long pendingDistributionCount; 
        private Long pendingPlanDrafts; 
        private Long singleDiagnosisCount; 
        private String timezone; 
        private Long unknownGeneratedTimeCount; 
        private Long unknownPublishedTimeCount; 
        private java.util.List<MarketingDiagnosisSummary> unreadDiagnoses; 
        private Long unreadDiagnosisCount; 
        private Long websitePublishFailedCount; 
        private Long windowEnd; 
        private Long windowStart; 

        private Builder() {
        } 

        private Builder(MarketingOverview model) {
            this.channelDistribution = model.channelDistribution;
            this.contentGenerationFailedCount = model.contentGenerationFailedCount;
            this.contentTodoCount = model.contentTodoCount;
            this.distributedArticles = model.distributedArticles;
            this.endedPlanCount = model.endedPlanCount;
            this.endedPlans = model.endedPlans;
            this.generatedArticleTasks = model.generatedArticleTasks;
            this.generatedImageTasks = model.generatedImageTasks;
            this.generatedVideoTasks = model.generatedVideoTasks;
            this.generationTrend = model.generationTrend;
            this.latestSingleDiagnoses = model.latestSingleDiagnoses;
            this.pendingDistributionCount = model.pendingDistributionCount;
            this.pendingPlanDrafts = model.pendingPlanDrafts;
            this.singleDiagnosisCount = model.singleDiagnosisCount;
            this.timezone = model.timezone;
            this.unknownGeneratedTimeCount = model.unknownGeneratedTimeCount;
            this.unknownPublishedTimeCount = model.unknownPublishedTimeCount;
            this.unreadDiagnoses = model.unreadDiagnoses;
            this.unreadDiagnosisCount = model.unreadDiagnosisCount;
            this.websitePublishFailedCount = model.websitePublishFailedCount;
            this.windowEnd = model.windowEnd;
            this.windowStart = model.windowStart;
        } 

        /**
         * ChannelDistribution.
         */
        public Builder channelDistribution(java.util.List<MarketingChannelDistribution> channelDistribution) {
            this.channelDistribution = channelDistribution;
            return this;
        }

        /**
         * ContentGenerationFailedCount.
         */
        public Builder contentGenerationFailedCount(Long contentGenerationFailedCount) {
            this.contentGenerationFailedCount = contentGenerationFailedCount;
            return this;
        }

        /**
         * ContentTodoCount.
         */
        public Builder contentTodoCount(Long contentTodoCount) {
            this.contentTodoCount = contentTodoCount;
            return this;
        }

        /**
         * DistributedArticles.
         */
        public Builder distributedArticles(Long distributedArticles) {
            this.distributedArticles = distributedArticles;
            return this;
        }

        /**
         * EndedPlanCount.
         */
        public Builder endedPlanCount(Long endedPlanCount) {
            this.endedPlanCount = endedPlanCount;
            return this;
        }

        /**
         * EndedPlans.
         */
        public Builder endedPlans(java.util.List<MarketingEndedPlan> endedPlans) {
            this.endedPlans = endedPlans;
            return this;
        }

        /**
         * GeneratedArticleTasks.
         */
        public Builder generatedArticleTasks(Long generatedArticleTasks) {
            this.generatedArticleTasks = generatedArticleTasks;
            return this;
        }

        /**
         * GeneratedImageTasks.
         */
        public Builder generatedImageTasks(Long generatedImageTasks) {
            this.generatedImageTasks = generatedImageTasks;
            return this;
        }

        /**
         * GeneratedVideoTasks.
         */
        public Builder generatedVideoTasks(Long generatedVideoTasks) {
            this.generatedVideoTasks = generatedVideoTasks;
            return this;
        }

        /**
         * GenerationTrend.
         */
        public Builder generationTrend(java.util.List<MarketingGenerationDay> generationTrend) {
            this.generationTrend = generationTrend;
            return this;
        }

        /**
         * LatestSingleDiagnoses.
         */
        public Builder latestSingleDiagnoses(java.util.List<MarketingDiagnosisSummary> latestSingleDiagnoses) {
            this.latestSingleDiagnoses = latestSingleDiagnoses;
            return this;
        }

        /**
         * PendingDistributionCount.
         */
        public Builder pendingDistributionCount(Long pendingDistributionCount) {
            this.pendingDistributionCount = pendingDistributionCount;
            return this;
        }

        /**
         * PendingPlanDrafts.
         */
        public Builder pendingPlanDrafts(Long pendingPlanDrafts) {
            this.pendingPlanDrafts = pendingPlanDrafts;
            return this;
        }

        /**
         * SingleDiagnosisCount.
         */
        public Builder singleDiagnosisCount(Long singleDiagnosisCount) {
            this.singleDiagnosisCount = singleDiagnosisCount;
            return this;
        }

        /**
         * Timezone.
         */
        public Builder timezone(String timezone) {
            this.timezone = timezone;
            return this;
        }

        /**
         * UnknownGeneratedTimeCount.
         */
        public Builder unknownGeneratedTimeCount(Long unknownGeneratedTimeCount) {
            this.unknownGeneratedTimeCount = unknownGeneratedTimeCount;
            return this;
        }

        /**
         * UnknownPublishedTimeCount.
         */
        public Builder unknownPublishedTimeCount(Long unknownPublishedTimeCount) {
            this.unknownPublishedTimeCount = unknownPublishedTimeCount;
            return this;
        }

        /**
         * UnreadDiagnoses.
         */
        public Builder unreadDiagnoses(java.util.List<MarketingDiagnosisSummary> unreadDiagnoses) {
            this.unreadDiagnoses = unreadDiagnoses;
            return this;
        }

        /**
         * UnreadDiagnosisCount.
         */
        public Builder unreadDiagnosisCount(Long unreadDiagnosisCount) {
            this.unreadDiagnosisCount = unreadDiagnosisCount;
            return this;
        }

        /**
         * WebsitePublishFailedCount.
         */
        public Builder websitePublishFailedCount(Long websitePublishFailedCount) {
            this.websitePublishFailedCount = websitePublishFailedCount;
            return this;
        }

        /**
         * WindowEnd.
         */
        public Builder windowEnd(Long windowEnd) {
            this.windowEnd = windowEnd;
            return this;
        }

        /**
         * WindowStart.
         */
        public Builder windowStart(Long windowStart) {
            this.windowStart = windowStart;
            return this;
        }

        public MarketingOverview build() {
            return new MarketingOverview(this);
        } 

    } 

}
