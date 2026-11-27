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
         * <p>The number of articles distributed, aggregated by channel.</p>
         */
        public Builder channelDistribution(java.util.List<MarketingChannelDistribution> channelDistribution) {
            this.channelDistribution = channelDistribution;
            return this;
        }

        /**
         * <p>The number of items for which content generation failed.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder contentGenerationFailedCount(Long contentGenerationFailedCount) {
            this.contentGenerationFailedCount = contentGenerationFailedCount;
            return this;
        }

        /**
         * <p>The number of content to-do items.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder contentTodoCount(Long contentTodoCount) {
            this.contentTodoCount = contentTodoCount;
            return this;
        }

        /**
         * <p>The number of distributed articles.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder distributedArticles(Long distributedArticles) {
            this.distributedArticles = distributedArticles;
            return this;
        }

        /**
         * <p>The number of ended creation plans.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder endedPlanCount(Long endedPlanCount) {
            this.endedPlanCount = endedPlanCount;
            return this;
        }

        /**
         * <p>The list of ended creation plans.</p>
         */
        public Builder endedPlans(java.util.List<MarketingEndedPlan> endedPlans) {
            this.endedPlans = endedPlans;
            return this;
        }

        /**
         * <p>The number of tasks for which articles have been generated.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder generatedArticleTasks(Long generatedArticleTasks) {
            this.generatedArticleTasks = generatedArticleTasks;
            return this;
        }

        /**
         * <p>The number of tasks for which images have been generated.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder generatedImageTasks(Long generatedImageTasks) {
            this.generatedImageTasks = generatedImageTasks;
            return this;
        }

        /**
         * <p>The number of tasks for which videos have been generated.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder generatedVideoTasks(Long generatedVideoTasks) {
            this.generatedVideoTasks = generatedVideoTasks;
            return this;
        }

        /**
         * <p>The daily content generation trend.</p>
         */
        public Builder generationTrend(java.util.List<MarketingGenerationDay> generationTrend) {
            this.generationTrend = generationTrend;
            return this;
        }

        /**
         * <p>The list of recently completed single diagnoses.</p>
         */
        public Builder latestSingleDiagnoses(java.util.List<MarketingDiagnosisSummary> latestSingleDiagnoses) {
            this.latestSingleDiagnoses = latestSingleDiagnoses;
            return this;
        }

        /**
         * <p>The number of items pending distribution.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder pendingDistributionCount(Long pendingDistributionCount) {
            this.pendingDistributionCount = pendingDistributionCount;
            return this;
        }

        /**
         * <p>The number of pending plan drafts.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder pendingPlanDrafts(Long pendingPlanDrafts) {
            this.pendingPlanDrafts = pendingPlanDrafts;
            return this;
        }

        /**
         * <p>The cumulative number of completed single GEO diagnostic nodes, which is not limited by the 30-day window and excludes project monitoring.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        public Builder singleDiagnosisCount(Long singleDiagnosisCount) {
            this.singleDiagnosisCount = singleDiagnosisCount;
            return this;
        }

        /**
         * <p>The IANA time zone used for the statistical window.</p>
         * 
         * <strong>example:</strong>
         * <p>Asia/Shanghai</p>
         */
        public Builder timezone(String timezone) {
            this.timezone = timezone;
            return this;
        }

        /**
         * <p>The number of records that are missing an available generation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder unknownGeneratedTimeCount(Long unknownGeneratedTimeCount) {
            this.unknownGeneratedTimeCount = unknownGeneratedTimeCount;
            return this;
        }

        /**
         * <p>The number of records that are missing an available publish time.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder unknownPublishedTimeCount(Long unknownPublishedTimeCount) {
            this.unknownPublishedTimeCount = unknownPublishedTimeCount;
            return this;
        }

        /**
         * <p>The list of unread diagnoses.</p>
         */
        public Builder unreadDiagnoses(java.util.List<MarketingDiagnosisSummary> unreadDiagnoses) {
            this.unreadDiagnoses = unreadDiagnoses;
            return this;
        }

        /**
         * <p>The number of unread diagnosis records.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder unreadDiagnosisCount(Long unreadDiagnosisCount) {
            this.unreadDiagnosisCount = unreadDiagnosisCount;
            return this;
        }

        /**
         * <p>The number of items for which publishing to the official website failed.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder websitePublishFailedCount(Long websitePublishFailedCount) {
            this.websitePublishFailedCount = websitePublishFailedCount;
            return this;
        }

        /**
         * <p>The end time of the statistical window, as a Unix timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1795737600000</p>
         */
        public Builder windowEnd(Long windowEnd) {
            this.windowEnd = windowEnd;
            return this;
        }

        /**
         * <p>The start time of the statistical window, as a Unix timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1795651200000</p>
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
