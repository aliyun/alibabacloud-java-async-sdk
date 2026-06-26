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
 * {@link PromotionActivity} extends {@link TeaModel}
 *
 * <p>PromotionActivity</p>
 */
public class PromotionActivity extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ActivityCode")
    private String activityCode;

    @com.aliyun.core.annotation.NameInMap("ActivityName")
    private String activityName;

    @com.aliyun.core.annotation.NameInMap("ActivityType")
    private String activityType;

    @com.aliyun.core.annotation.NameInMap("ConsumedQuota")
    private Long consumedQuota;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("CreatedBy")
    private String createdBy;

    @com.aliyun.core.annotation.NameInMap("EligibilityConfig")
    private String eligibilityConfig;

    @com.aliyun.core.annotation.NameInMap("EndDate")
    private String endDate;

    @com.aliyun.core.annotation.NameInMap("OfferConfig")
    private String offerConfig;

    @com.aliyun.core.annotation.NameInMap("OfferConfigSummary")
    private String offerConfigSummary;

    @com.aliyun.core.annotation.NameInMap("RemainingQuota")
    private Long remainingQuota;

    @com.aliyun.core.annotation.NameInMap("StartDate")
    private String startDate;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("TotalQuota")
    private Long totalQuota;

    @com.aliyun.core.annotation.NameInMap("TouchpointConfig")
    private String touchpointConfig;

    @com.aliyun.core.annotation.NameInMap("UpdateTime")
    private String updateTime;

    @com.aliyun.core.annotation.NameInMap("UpdatedBy")
    private String updatedBy;

    @com.aliyun.core.annotation.NameInMap("WarningThreshold")
    private Integer warningThreshold;

    private PromotionActivity(Builder builder) {
        this.activityCode = builder.activityCode;
        this.activityName = builder.activityName;
        this.activityType = builder.activityType;
        this.consumedQuota = builder.consumedQuota;
        this.createTime = builder.createTime;
        this.createdBy = builder.createdBy;
        this.eligibilityConfig = builder.eligibilityConfig;
        this.endDate = builder.endDate;
        this.offerConfig = builder.offerConfig;
        this.offerConfigSummary = builder.offerConfigSummary;
        this.remainingQuota = builder.remainingQuota;
        this.startDate = builder.startDate;
        this.status = builder.status;
        this.totalQuota = builder.totalQuota;
        this.touchpointConfig = builder.touchpointConfig;
        this.updateTime = builder.updateTime;
        this.updatedBy = builder.updatedBy;
        this.warningThreshold = builder.warningThreshold;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PromotionActivity create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return activityCode
     */
    public String getActivityCode() {
        return this.activityCode;
    }

    /**
     * @return activityName
     */
    public String getActivityName() {
        return this.activityName;
    }

    /**
     * @return activityType
     */
    public String getActivityType() {
        return this.activityType;
    }

    /**
     * @return consumedQuota
     */
    public Long getConsumedQuota() {
        return this.consumedQuota;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return createdBy
     */
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * @return eligibilityConfig
     */
    public String getEligibilityConfig() {
        return this.eligibilityConfig;
    }

    /**
     * @return endDate
     */
    public String getEndDate() {
        return this.endDate;
    }

    /**
     * @return offerConfig
     */
    public String getOfferConfig() {
        return this.offerConfig;
    }

    /**
     * @return offerConfigSummary
     */
    public String getOfferConfigSummary() {
        return this.offerConfigSummary;
    }

    /**
     * @return remainingQuota
     */
    public Long getRemainingQuota() {
        return this.remainingQuota;
    }

    /**
     * @return startDate
     */
    public String getStartDate() {
        return this.startDate;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return totalQuota
     */
    public Long getTotalQuota() {
        return this.totalQuota;
    }

    /**
     * @return touchpointConfig
     */
    public String getTouchpointConfig() {
        return this.touchpointConfig;
    }

    /**
     * @return updateTime
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    /**
     * @return updatedBy
     */
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * @return warningThreshold
     */
    public Integer getWarningThreshold() {
        return this.warningThreshold;
    }

    public static final class Builder {
        private String activityCode; 
        private String activityName; 
        private String activityType; 
        private Long consumedQuota; 
        private String createTime; 
        private String createdBy; 
        private String eligibilityConfig; 
        private String endDate; 
        private String offerConfig; 
        private String offerConfigSummary; 
        private Long remainingQuota; 
        private String startDate; 
        private String status; 
        private Long totalQuota; 
        private String touchpointConfig; 
        private String updateTime; 
        private String updatedBy; 
        private Integer warningThreshold; 

        private Builder() {
        } 

        private Builder(PromotionActivity model) {
            this.activityCode = model.activityCode;
            this.activityName = model.activityName;
            this.activityType = model.activityType;
            this.consumedQuota = model.consumedQuota;
            this.createTime = model.createTime;
            this.createdBy = model.createdBy;
            this.eligibilityConfig = model.eligibilityConfig;
            this.endDate = model.endDate;
            this.offerConfig = model.offerConfig;
            this.offerConfigSummary = model.offerConfigSummary;
            this.remainingQuota = model.remainingQuota;
            this.startDate = model.startDate;
            this.status = model.status;
            this.totalQuota = model.totalQuota;
            this.touchpointConfig = model.touchpointConfig;
            this.updateTime = model.updateTime;
            this.updatedBy = model.updatedBy;
            this.warningThreshold = model.warningThreshold;
        } 

        /**
         * ActivityCode.
         */
        public Builder activityCode(String activityCode) {
            this.activityCode = activityCode;
            return this;
        }

        /**
         * ActivityName.
         */
        public Builder activityName(String activityName) {
            this.activityName = activityName;
            return this;
        }

        /**
         * ActivityType.
         */
        public Builder activityType(String activityType) {
            this.activityType = activityType;
            return this;
        }

        /**
         * ConsumedQuota.
         */
        public Builder consumedQuota(Long consumedQuota) {
            this.consumedQuota = consumedQuota;
            return this;
        }

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * CreatedBy.
         */
        public Builder createdBy(String createdBy) {
            this.createdBy = createdBy;
            return this;
        }

        /**
         * EligibilityConfig.
         */
        public Builder eligibilityConfig(String eligibilityConfig) {
            this.eligibilityConfig = eligibilityConfig;
            return this;
        }

        /**
         * EndDate.
         */
        public Builder endDate(String endDate) {
            this.endDate = endDate;
            return this;
        }

        /**
         * OfferConfig.
         */
        public Builder offerConfig(String offerConfig) {
            this.offerConfig = offerConfig;
            return this;
        }

        /**
         * OfferConfigSummary.
         */
        public Builder offerConfigSummary(String offerConfigSummary) {
            this.offerConfigSummary = offerConfigSummary;
            return this;
        }

        /**
         * RemainingQuota.
         */
        public Builder remainingQuota(Long remainingQuota) {
            this.remainingQuota = remainingQuota;
            return this;
        }

        /**
         * StartDate.
         */
        public Builder startDate(String startDate) {
            this.startDate = startDate;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * TotalQuota.
         */
        public Builder totalQuota(Long totalQuota) {
            this.totalQuota = totalQuota;
            return this;
        }

        /**
         * TouchpointConfig.
         */
        public Builder touchpointConfig(String touchpointConfig) {
            this.touchpointConfig = touchpointConfig;
            return this;
        }

        /**
         * UpdateTime.
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
         * UpdatedBy.
         */
        public Builder updatedBy(String updatedBy) {
            this.updatedBy = updatedBy;
            return this;
        }

        /**
         * WarningThreshold.
         */
        public Builder warningThreshold(Integer warningThreshold) {
            this.warningThreshold = warningThreshold;
            return this;
        }

        public PromotionActivity build() {
            return new PromotionActivity(this);
        } 

    } 

}
