// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudcallcenter20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CampaignDetail} extends {@link TeaModel}
 *
 * <p>CampaignDetail</p>
 */
public class CampaignDetail extends TeaModel {
    @NameInMap("ActualEndTime")
    private Long actualEndTime;

    @NameInMap("ActualStartTime")
    private Long actualStartTime;

    @NameInMap("CasesAborted")
    private Long casesAborted;

    @NameInMap("CasesConnected")
    private Long casesConnected;

    @NameInMap("CasesUncompleted")
    private Long casesUncompleted;

    @NameInMap("CompletedRate")
    private Long completedRate;

    @NameInMap("CreateTime")
    private Long createTime;

    @NameInMap("Id")
    private String id;

    @NameInMap("MaxAttemptCount")
    private Long maxAttemptCount;

    @NameInMap("MinAttemptInterval")
    private Long minAttemptInterval;

    @NameInMap("Name")
    private String name;

    @NameInMap("PlanedEndTime")
    private Long planedEndTime;

    @NameInMap("PlanedStartTime")
    private Long planedStartTime;

    @NameInMap("QueueName")
    private String queueName;

    @NameInMap("State")
    private String state;

    @NameInMap("TotalCases")
    private Long totalCases;

    @NameInMap("UpdateTime")
    private Long updateTime;

    private CampaignDetail(Builder builder) {
        this.actualEndTime = builder.actualEndTime;
        this.actualStartTime = builder.actualStartTime;
        this.casesAborted = builder.casesAborted;
        this.casesConnected = builder.casesConnected;
        this.casesUncompleted = builder.casesUncompleted;
        this.completedRate = builder.completedRate;
        this.createTime = builder.createTime;
        this.id = builder.id;
        this.maxAttemptCount = builder.maxAttemptCount;
        this.minAttemptInterval = builder.minAttemptInterval;
        this.name = builder.name;
        this.planedEndTime = builder.planedEndTime;
        this.planedStartTime = builder.planedStartTime;
        this.queueName = builder.queueName;
        this.state = builder.state;
        this.totalCases = builder.totalCases;
        this.updateTime = builder.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CampaignDetail create() {
        return builder().build();
    }

    /**
     * @return actualEndTime
     */
    public Long getActualEndTime() {
        return this.actualEndTime;
    }

    /**
     * @return actualStartTime
     */
    public Long getActualStartTime() {
        return this.actualStartTime;
    }

    /**
     * @return casesAborted
     */
    public Long getCasesAborted() {
        return this.casesAborted;
    }

    /**
     * @return casesConnected
     */
    public Long getCasesConnected() {
        return this.casesConnected;
    }

    /**
     * @return casesUncompleted
     */
    public Long getCasesUncompleted() {
        return this.casesUncompleted;
    }

    /**
     * @return completedRate
     */
    public Long getCompletedRate() {
        return this.completedRate;
    }

    /**
     * @return createTime
     */
    public Long getCreateTime() {
        return this.createTime;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return maxAttemptCount
     */
    public Long getMaxAttemptCount() {
        return this.maxAttemptCount;
    }

    /**
     * @return minAttemptInterval
     */
    public Long getMinAttemptInterval() {
        return this.minAttemptInterval;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return planedEndTime
     */
    public Long getPlanedEndTime() {
        return this.planedEndTime;
    }

    /**
     * @return planedStartTime
     */
    public Long getPlanedStartTime() {
        return this.planedStartTime;
    }

    /**
     * @return queueName
     */
    public String getQueueName() {
        return this.queueName;
    }

    /**
     * @return state
     */
    public String getState() {
        return this.state;
    }

    /**
     * @return totalCases
     */
    public Long getTotalCases() {
        return this.totalCases;
    }

    /**
     * @return updateTime
     */
    public Long getUpdateTime() {
        return this.updateTime;
    }

    public static final class Builder {
        private Long actualEndTime; 
        private Long actualStartTime; 
        private Long casesAborted; 
        private Long casesConnected; 
        private Long casesUncompleted; 
        private Long completedRate; 
        private Long createTime; 
        private String id; 
        private Long maxAttemptCount; 
        private Long minAttemptInterval; 
        private String name; 
        private Long planedEndTime; 
        private Long planedStartTime; 
        private String queueName; 
        private String state; 
        private Long totalCases; 
        private Long updateTime; 

        /**
         * ActualEndTime.
         */
        public Builder actualEndTime(Long actualEndTime) {
            this.actualEndTime = actualEndTime;
            return this;
        }

        /**
         * ActualStartTime.
         */
        public Builder actualStartTime(Long actualStartTime) {
            this.actualStartTime = actualStartTime;
            return this;
        }

        /**
         * CasesAborted.
         */
        public Builder casesAborted(Long casesAborted) {
            this.casesAborted = casesAborted;
            return this;
        }

        /**
         * CasesConnected.
         */
        public Builder casesConnected(Long casesConnected) {
            this.casesConnected = casesConnected;
            return this;
        }

        /**
         * CasesUncompleted.
         */
        public Builder casesUncompleted(Long casesUncompleted) {
            this.casesUncompleted = casesUncompleted;
            return this;
        }

        /**
         * CompletedRate.
         */
        public Builder completedRate(Long completedRate) {
            this.completedRate = completedRate;
            return this;
        }

        /**
         * CreateTime.
         */
        public Builder createTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * MaxAttemptCount.
         */
        public Builder maxAttemptCount(Long maxAttemptCount) {
            this.maxAttemptCount = maxAttemptCount;
            return this;
        }

        /**
         * MinAttemptInterval.
         */
        public Builder minAttemptInterval(Long minAttemptInterval) {
            this.minAttemptInterval = minAttemptInterval;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * PlanedEndTime.
         */
        public Builder planedEndTime(Long planedEndTime) {
            this.planedEndTime = planedEndTime;
            return this;
        }

        /**
         * PlanedStartTime.
         */
        public Builder planedStartTime(Long planedStartTime) {
            this.planedStartTime = planedStartTime;
            return this;
        }

        /**
         * QueueName.
         */
        public Builder queueName(String queueName) {
            this.queueName = queueName;
            return this;
        }

        /**
         * State.
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        /**
         * TotalCases.
         */
        public Builder totalCases(Long totalCases) {
            this.totalCases = totalCases;
            return this;
        }

        /**
         * UpdateTime.
         */
        public Builder updateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public CampaignDetail build() {
            return new CampaignDetail(this);
        } 

    } 

}
