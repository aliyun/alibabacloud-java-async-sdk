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
         * <p>The access denied details.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>Indicates whether retry is allowed.</p>
         * 
         * <strong>example:</strong>
         * <p>False</p>
         */
        public Builder allowRetry(Boolean allowRetry) {
            this.allowRetry = allowRetry;
            return this;
        }

        /**
         * <p>The application name.</p>
         * 
         * <strong>example:</strong>
         * <p>spring-cloud-b</p>
         */
        public Builder appName(String appName) {
            this.appName = appName;
            return this;
        }

        /**
         * <p>The dynamic error code.</p>
         * 
         * <strong>example:</strong>
         * <p>ERROR-oo1</p>
         */
        public Builder dynamicCode(String dynamicCode) {
            this.dynamicCode = dynamicCode;
            return this;
        }

        /**
         * <p>The dynamic message.</p>
         * 
         * <strong>example:</strong>
         * <p>SYSTEM_ERROR</p>
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

        /**
         * <p>The error arguments.</p>
         */
        public Builder errorArgs(java.util.List<?> errorArgs) {
            this.errorArgs = errorArgs;
            return this;
        }

        /**
         * <p>The number of entries per query.</p>
         * <p>Valid values: 10 to 100. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The response data.</p>
         */
        public Builder module(Module module) {
            this.module = module;
            return this;
        }

        /**
         * <p>The token for the next query. This parameter is empty if no more results exist.</p>
         * 
         * <strong>example:</strong>
         * <p>0l45bkwM022Dt+rOvPi/oQ==</p>
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
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>SYSTEM.ERROR</p>
         */
        public Builder rootErrorCode(String rootErrorCode) {
            this.rootErrorCode = rootErrorCode;
            return this;
        }

        /**
         * <p>The root error message.</p>
         * 
         * <strong>example:</strong>
         * <p>System exception</p>
         */
        public Builder rootErrorMsg(String rootErrorMsg) {
            this.rootErrorMsg = rootErrorMsg;
            return this;
        }

        /**
         * <p>Indicates whether the request is synchronously processed.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
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
             * <p>The activity code.</p>
             * 
             * <strong>example:</strong>
             * <p>acwfradoj5u</p>
             */
            public Builder activityCode(String activityCode) {
                this.activityCode = activityCode;
                return this;
            }

            /**
             * <p>The activity name.</p>
             * 
             * <strong>example:</strong>
             * <p>IP segment filtering statistics</p>
             */
            public Builder activityName(String activityName) {
                this.activityName = activityName;
                return this;
            }

            /**
             * <p>The activity type.</p>
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
             * <p>The creation time. The value is in the YYYY-MM-DD HH:mm:ss format.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-02-14 11:57:51</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The user who created the activity.</p>
             * 
             * <strong>example:</strong>
             * <p>onlinehoztestrolebasicallow1755461756261068111(300216315676902267)</p>
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
             * <p>The end date. The value is in the YYYY-MM-DD HH:mm:ss Z format, where Z is the time zone offset.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-04-22 10:18:51 +0800</p>
             */
            public Builder endDate(String endDate) {
                this.endDate = endDate;
                return this;
            }

            /**
             * <p>The offer configuration in JSON format.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder offerConfig(String offerConfig) {
                this.offerConfig = offerConfig;
                return this;
            }

            /**
             * <p>The offer configuration summary.</p>
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
             * <p>The start date. The value is in the ISO 8601 format with the time zone set to UTC (Z).</p>
             * 
             * <strong>example:</strong>
             * <p>2026-05-12T16:00:00.000Z</p>
             */
            public Builder startDate(String startDate) {
                this.startDate = startDate;
                return this;
            }

            /**
             * <p>The activity status.</p>
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
             * <p>The update time. The value is in the ISO 8601 format with a time zone offset.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-10-11T21:13:38.164526965+08:00</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>The user who last updated the activity.</p>
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
             * <p>The list of promotional activities.</p>
             */
            public Builder activities(java.util.List<Activities> activities) {
                this.activities = activities;
                return this;
            }

            /**
             * <p>The total number of entries.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
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
