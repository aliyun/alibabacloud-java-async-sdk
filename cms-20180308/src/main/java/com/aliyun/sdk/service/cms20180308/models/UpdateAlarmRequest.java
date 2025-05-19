// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20180308.models;

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
 * {@link UpdateAlarmRequest} extends {@link RequestModel}
 *
 * <p>UpdateAlarmRequest</p>
 */
public class UpdateAlarmRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ComparisonOperator")
    private String comparisonOperator;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactGroups")
    private String contactGroups;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Integer endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EvaluationCount")
    private Integer evaluationCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NotifyType")
    private Integer notifyType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Period")
    private Integer period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SilenceTime")
    private Integer silenceTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Integer startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Statistics")
    private String statistics;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Threshold")
    @com.aliyun.core.annotation.Validation(required = true)
    private String threshold;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Webhook")
    private String webhook;

    private UpdateAlarmRequest(Builder builder) {
        super(builder);
        this.comparisonOperator = builder.comparisonOperator;
        this.contactGroups = builder.contactGroups;
        this.dryRun = builder.dryRun;
        this.endTime = builder.endTime;
        this.evaluationCount = builder.evaluationCount;
        this.id = builder.id;
        this.name = builder.name;
        this.notifyType = builder.notifyType;
        this.period = builder.period;
        this.silenceTime = builder.silenceTime;
        this.startTime = builder.startTime;
        this.statistics = builder.statistics;
        this.threshold = builder.threshold;
        this.webhook = builder.webhook;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAlarmRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return comparisonOperator
     */
    public String getComparisonOperator() {
        return this.comparisonOperator;
    }

    /**
     * @return contactGroups
     */
    public String getContactGroups() {
        return this.contactGroups;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return endTime
     */
    public Integer getEndTime() {
        return this.endTime;
    }

    /**
     * @return evaluationCount
     */
    public Integer getEvaluationCount() {
        return this.evaluationCount;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return notifyType
     */
    public Integer getNotifyType() {
        return this.notifyType;
    }

    /**
     * @return period
     */
    public Integer getPeriod() {
        return this.period;
    }

    /**
     * @return silenceTime
     */
    public Integer getSilenceTime() {
        return this.silenceTime;
    }

    /**
     * @return startTime
     */
    public Integer getStartTime() {
        return this.startTime;
    }

    /**
     * @return statistics
     */
    public String getStatistics() {
        return this.statistics;
    }

    /**
     * @return threshold
     */
    public String getThreshold() {
        return this.threshold;
    }

    /**
     * @return webhook
     */
    public String getWebhook() {
        return this.webhook;
    }

    public static final class Builder extends Request.Builder<UpdateAlarmRequest, Builder> {
        private String comparisonOperator; 
        private String contactGroups; 
        private Boolean dryRun; 
        private Integer endTime; 
        private Integer evaluationCount; 
        private String id; 
        private String name; 
        private Integer notifyType; 
        private Integer period; 
        private Integer silenceTime; 
        private Integer startTime; 
        private String statistics; 
        private String threshold; 
        private String webhook; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAlarmRequest request) {
            super(request);
            this.comparisonOperator = request.comparisonOperator;
            this.contactGroups = request.contactGroups;
            this.dryRun = request.dryRun;
            this.endTime = request.endTime;
            this.evaluationCount = request.evaluationCount;
            this.id = request.id;
            this.name = request.name;
            this.notifyType = request.notifyType;
            this.period = request.period;
            this.silenceTime = request.silenceTime;
            this.startTime = request.startTime;
            this.statistics = request.statistics;
            this.threshold = request.threshold;
            this.webhook = request.webhook;
        } 

        /**
         * ComparisonOperator.
         */
        public Builder comparisonOperator(String comparisonOperator) {
            this.putQueryParameter("ComparisonOperator", comparisonOperator);
            this.comparisonOperator = comparisonOperator;
            return this;
        }

        /**
         * ContactGroups.
         */
        public Builder contactGroups(String contactGroups) {
            this.putQueryParameter("ContactGroups", contactGroups);
            this.contactGroups = contactGroups;
            return this;
        }

        /**
         * DryRun.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(Integer endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * EvaluationCount.
         */
        public Builder evaluationCount(Integer evaluationCount) {
            this.putQueryParameter("EvaluationCount", evaluationCount);
            this.evaluationCount = evaluationCount;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>576fbae7-2fd1-411a-ae13-6f09f4fafdde</p>
         */
        public Builder id(String id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * NotifyType.
         */
        public Builder notifyType(Integer notifyType) {
            this.putQueryParameter("NotifyType", notifyType);
            this.notifyType = notifyType;
            return this;
        }

        /**
         * Period.
         */
        public Builder period(Integer period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * SilenceTime.
         */
        public Builder silenceTime(Integer silenceTime) {
            this.putQueryParameter("SilenceTime", silenceTime);
            this.silenceTime = silenceTime;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(Integer startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * Statistics.
         */
        public Builder statistics(String statistics) {
            this.putQueryParameter("Statistics", statistics);
            this.statistics = statistics;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>40</p>
         */
        public Builder threshold(String threshold) {
            this.putQueryParameter("Threshold", threshold);
            this.threshold = threshold;
            return this;
        }

        /**
         * Webhook.
         */
        public Builder webhook(String webhook) {
            this.putQueryParameter("Webhook", webhook);
            this.webhook = webhook;
            return this;
        }

        @Override
        public UpdateAlarmRequest build() {
            return new UpdateAlarmRequest(this);
        } 

    } 

}
