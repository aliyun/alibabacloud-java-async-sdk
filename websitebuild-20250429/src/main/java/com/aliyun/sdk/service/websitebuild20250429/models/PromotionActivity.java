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
         * <p>The campaign code.</p>
         * 
         * <strong>example:</strong>
         * <p>acwfradoj5u</p>
         */
        public Builder activityCode(String activityCode) {
            this.activityCode = activityCode;
            return this;
        }

        /**
         * <p>The campaign name.</p>
         * 
         * <strong>example:</strong>
         * <p>IP CIDR block filtering statistics</p>
         */
        public Builder activityName(String activityName) {
            this.activityName = activityName;
            return this;
        }

        /**
         * <p>The campaign type.</p>
         * 
         * <strong>example:</strong>
         * <p>SCALE_IN</p>
         */
        public Builder activityType(String activityType) {
            this.activityType = activityType;
            return this;
        }

        /**
         * <p>The consumed quota.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder consumedQuota(Long consumedQuota) {
            this.consumedQuota = consumedQuota;
            return this;
        }

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-10-11T21:13:38.164526965+08:00</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The creator.</p>
         * 
         * <strong>example:</strong>
         * <p>123414</p>
         */
        public Builder createdBy(String createdBy) {
            this.createdBy = createdBy;
            return this;
        }

        /**
         * <p>The eligibility configuration in JSON format.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder eligibilityConfig(String eligibilityConfig) {
            this.eligibilityConfig = eligibilityConfig;
            return this;
        }

        /**
         * <p>The end date.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-04-22 10:18:51 +0800</p>
         */
        public Builder endDate(String endDate) {
            this.endDate = endDate;
            return this;
        }

        /**
         * <p>The privilege configuration in JSON format.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder offerConfig(String offerConfig) {
            this.offerConfig = offerConfig;
            return this;
        }

        /**
         * <p>The privilege configuration summary.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder offerConfigSummary(String offerConfigSummary) {
            this.offerConfigSummary = offerConfigSummary;
            return this;
        }

        /**
         * <p>The remaining quota.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder remainingQuota(Long remainingQuota) {
            this.remainingQuota = remainingQuota;
            return this;
        }

        /**
         * <p>The start date.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-05-12T16:00:00.000Z</p>
         */
        public Builder startDate(String startDate) {
            this.startDate = startDate;
            return this;
        }

        /**
         * <p>The campaign status.</p>
         * 
         * <strong>example:</strong>
         * <p>FE_ABORTING</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The total quota.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder totalQuota(Long totalQuota) {
            this.totalQuota = totalQuota;
            return this;
        }

        /**
         * <p>The touchpoint configuration in JSON format.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder touchpointConfig(String touchpointConfig) {
            this.touchpointConfig = touchpointConfig;
            return this;
        }

        /**
         * <p>The update time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-10-11T21:13:38.164526965+08:00</p>
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
         * <p>The updater.</p>
         * 
         * <strong>example:</strong>
         * <p>123414</p>
         */
        public Builder updatedBy(String updatedBy) {
            this.updatedBy = updatedBy;
            return this;
        }

        /**
         * <p>The warning threshold.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
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
