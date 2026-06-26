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
 * {@link ListPromotionActivitiesForPartnerResponseBody} extends {@link TeaModel}
 *
 * <p>ListPromotionActivitiesForPartnerResponseBody</p>
 */
public class ListPromotionActivitiesForPartnerResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("AllowRetry")
    private Boolean allowRetry;

    @com.aliyun.core.annotation.NameInMap("AppName")
    private String appName;

    @com.aliyun.core.annotation.NameInMap("DynamicCode")
    private String dynamicCode;

    @com.aliyun.core.annotation.NameInMap("DynamicMessage")
    private String dynamicMessage;

    @com.aliyun.core.annotation.NameInMap("ErrorArgs")
    private java.util.List<?> errorArgs;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("Module")
    private Module module;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RootErrorCode")
    private String rootErrorCode;

    @com.aliyun.core.annotation.NameInMap("RootErrorMsg")
    private String rootErrorMsg;

    @com.aliyun.core.annotation.NameInMap("Synchro")
    private Boolean synchro;

    private ListPromotionActivitiesForPartnerResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.allowRetry = builder.allowRetry;
        this.appName = builder.appName;
        this.dynamicCode = builder.dynamicCode;
        this.dynamicMessage = builder.dynamicMessage;
        this.errorArgs = builder.errorArgs;
        this.maxResults = builder.maxResults;
        this.module = builder.module;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.rootErrorCode = builder.rootErrorCode;
        this.rootErrorMsg = builder.rootErrorMsg;
        this.synchro = builder.synchro;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPromotionActivitiesForPartnerResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return allowRetry
     */
    public Boolean getAllowRetry() {
        return this.allowRetry;
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return dynamicCode
     */
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    /**
     * @return dynamicMessage
     */
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    /**
     * @return errorArgs
     */
    public java.util.List<?> getErrorArgs() {
        return this.errorArgs;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return module
     */
    public Module getModule() {
        return this.module;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return rootErrorCode
     */
    public String getRootErrorCode() {
        return this.rootErrorCode;
    }

    /**
     * @return rootErrorMsg
     */
    public String getRootErrorMsg() {
        return this.rootErrorMsg;
    }

    /**
     * @return synchro
     */
    public Boolean getSynchro() {
        return this.synchro;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private Boolean allowRetry; 
        private String appName; 
        private String dynamicCode; 
        private String dynamicMessage; 
        private java.util.List<?> errorArgs; 
        private Integer maxResults; 
        private Module module; 
        private String nextToken; 
        private String requestId; 
        private String rootErrorCode; 
        private String rootErrorMsg; 
        private Boolean synchro; 

        private Builder() {
        } 

        private Builder(ListPromotionActivitiesForPartnerResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.allowRetry = model.allowRetry;
            this.appName = model.appName;
            this.dynamicCode = model.dynamicCode;
            this.dynamicMessage = model.dynamicMessage;
            this.errorArgs = model.errorArgs;
            this.maxResults = model.maxResults;
            this.module = model.module;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.rootErrorCode = model.rootErrorCode;
            this.rootErrorMsg = model.rootErrorMsg;
            this.synchro = model.synchro;
        } 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * AllowRetry.
         */
        public Builder allowRetry(Boolean allowRetry) {
            this.allowRetry = allowRetry;
            return this;
        }

        /**
         * AppName.
         */
        public Builder appName(String appName) {
            this.appName = appName;
            return this;
        }

        /**
         * DynamicCode.
         */
        public Builder dynamicCode(String dynamicCode) {
            this.dynamicCode = dynamicCode;
            return this;
        }

        /**
         * DynamicMessage.
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

        /**
         * ErrorArgs.
         */
        public Builder errorArgs(java.util.List<?> errorArgs) {
            this.errorArgs = errorArgs;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * Module.
         */
        public Builder module(Module module) {
            this.module = module;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>6C6B99AC-39EC-5350-874C-204128C905E6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * RootErrorCode.
         */
        public Builder rootErrorCode(String rootErrorCode) {
            this.rootErrorCode = rootErrorCode;
            return this;
        }

        /**
         * RootErrorMsg.
         */
        public Builder rootErrorMsg(String rootErrorMsg) {
            this.rootErrorMsg = rootErrorMsg;
            return this;
        }

        /**
         * Synchro.
         */
        public Builder synchro(Boolean synchro) {
            this.synchro = synchro;
            return this;
        }

        public ListPromotionActivitiesForPartnerResponseBody build() {
            return new ListPromotionActivitiesForPartnerResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListPromotionActivitiesForPartnerResponseBody} extends {@link TeaModel}
     *
     * <p>ListPromotionActivitiesForPartnerResponseBody</p>
     */
    public static class Activities extends TeaModel {
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

        private Activities(Builder builder) {
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

        public static Activities create() {
            return builder().build();
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

            private Builder(Activities model) {
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

            public Activities build() {
                return new Activities(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListPromotionActivitiesForPartnerResponseBody} extends {@link TeaModel}
     *
     * <p>ListPromotionActivitiesForPartnerResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Activities")
        private java.util.List<Activities> activities;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private Module(Builder builder) {
            this.activities = builder.activities;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return activities
         */
        public java.util.List<Activities> getActivities() {
            return this.activities;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<Activities> activities; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(Module model) {
                this.activities = model.activities;
                this.totalCount = model.totalCount;
            } 

            /**
             * Activities.
             */
            public Builder activities(java.util.List<Activities> activities) {
                this.activities = activities;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
