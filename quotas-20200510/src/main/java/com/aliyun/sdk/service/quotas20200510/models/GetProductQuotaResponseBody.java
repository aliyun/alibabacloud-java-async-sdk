// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quotas20200510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetProductQuotaResponseBody} extends {@link TeaModel}
 *
 * <p>GetProductQuotaResponseBody</p>
 */
public class GetProductQuotaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Quota")
    private Quota quota;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetProductQuotaResponseBody(Builder builder) {
        this.quota = builder.quota;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetProductQuotaResponseBody create() {
        return builder().build();
    }

    /**
     * @return quota
     */
    public Quota getQuota() {
        return this.quota;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Quota quota; 
        private String requestId; 

        /**
         * The details of the quota.
         */
        public Builder quota(Quota quota) {
            this.quota = quota;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetProductQuotaResponseBody build() {
            return new GetProductQuotaResponseBody(this);
        } 

    } 

    public static class Period extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PeriodUnit")
        private String periodUnit;

        @com.aliyun.core.annotation.NameInMap("PeriodValue")
        private Integer periodValue;

        private Period(Builder builder) {
            this.periodUnit = builder.periodUnit;
            this.periodValue = builder.periodValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Period create() {
            return builder().build();
        }

        /**
         * @return periodUnit
         */
        public String getPeriodUnit() {
            return this.periodUnit;
        }

        /**
         * @return periodValue
         */
        public Integer getPeriodValue() {
            return this.periodValue;
        }

        public static final class Builder {
            private String periodUnit; 
            private Integer periodValue; 

            /**
             * The unit of the calculation cycle of the quota. Valid values:
             * <p>
             * 
             * *   second
             * *   minute
             * *   hour
             * *   day
             * *   week
             */
            public Builder periodUnit(String periodUnit) {
                this.periodUnit = periodUnit;
                return this;
            }

            /**
             * The value of the calculation cycle of the quota.
             */
            public Builder periodValue(Integer periodValue) {
                this.periodValue = periodValue;
                return this;
            }

            public Period build() {
                return new Period(this);
            } 

        } 

    }
    public static class QuotaItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Quota")
        private String quota;

        @com.aliyun.core.annotation.NameInMap("QuotaUnit")
        private String quotaUnit;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Usage")
        private String usage;

        private QuotaItems(Builder builder) {
            this.quota = builder.quota;
            this.quotaUnit = builder.quotaUnit;
            this.type = builder.type;
            this.usage = builder.usage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QuotaItems create() {
            return builder().build();
        }

        /**
         * @return quota
         */
        public String getQuota() {
            return this.quota;
        }

        /**
         * @return quotaUnit
         */
        public String getQuotaUnit() {
            return this.quotaUnit;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return usage
         */
        public String getUsage() {
            return this.usage;
        }

        public static final class Builder {
            private String quota; 
            private String quotaUnit; 
            private String type; 
            private String usage; 

            /**
             * The value of the quota.
             */
            public Builder quota(String quota) {
                this.quota = quota;
                return this;
            }

            /**
             * The unit of the quota.
             * <p>
             * 
             * >  The unit of each quota is unique. For example, the quota whose ID is `q_cbdch3` represents the maximum number of ACK clusters. The unit of this quota is clusters. The quota whose ID is `q_security-groups` represents the maximum number of security groups. The unit of this quota is security groups.
             */
            public Builder quotaUnit(String quotaUnit) {
                this.quotaUnit = quotaUnit;
                return this;
            }

            /**
             * The category of the quota. Valid values:
             * <p>
             * 
             * *   BaseQuota: base quota.
             * *   ReservedQuota: reserved quota.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The used quota.
             */
            public Builder usage(String usage) {
                this.usage = usage;
                return this;
            }

            public QuotaItems build() {
                return new QuotaItems(this);
            } 

        } 

    }
    public static class UsageMetric extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MetricDimensions")
        private java.util.Map < String, String > metricDimensions;

        @com.aliyun.core.annotation.NameInMap("MetricName")
        private String metricName;

        @com.aliyun.core.annotation.NameInMap("MetricNamespace")
        private String metricNamespace;

        private UsageMetric(Builder builder) {
            this.metricDimensions = builder.metricDimensions;
            this.metricName = builder.metricName;
            this.metricNamespace = builder.metricNamespace;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UsageMetric create() {
            return builder().build();
        }

        /**
         * @return metricDimensions
         */
        public java.util.Map < String, String > getMetricDimensions() {
            return this.metricDimensions;
        }

        /**
         * @return metricName
         */
        public String getMetricName() {
            return this.metricName;
        }

        /**
         * @return metricNamespace
         */
        public String getMetricNamespace() {
            return this.metricNamespace;
        }

        public static final class Builder {
            private java.util.Map < String, String > metricDimensions; 
            private String metricName; 
            private String metricNamespace; 

            /**
             * MetricDimensions.
             */
            public Builder metricDimensions(java.util.Map < String, String > metricDimensions) {
                this.metricDimensions = metricDimensions;
                return this;
            }

            /**
             * MetricName.
             */
            public Builder metricName(String metricName) {
                this.metricName = metricName;
                return this;
            }

            /**
             * MetricNamespace.
             */
            public Builder metricNamespace(String metricNamespace) {
                this.metricNamespace = metricNamespace;
                return this;
            }

            public UsageMetric build() {
                return new UsageMetric(this);
            } 

        } 

    }
    public static class Quota extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Adjustable")
        private Boolean adjustable;

        @com.aliyun.core.annotation.NameInMap("ApplicableRange")
        private java.util.List < Float > applicableRange;

        @com.aliyun.core.annotation.NameInMap("ApplicableType")
        private String applicableType;

        @com.aliyun.core.annotation.NameInMap("ApplyReasonTips")
        private String applyReasonTips;

        @com.aliyun.core.annotation.NameInMap("Consumable")
        private Boolean consumable;

        @com.aliyun.core.annotation.NameInMap("Dimensions")
        private java.util.Map < String, ? > dimensions;

        @com.aliyun.core.annotation.NameInMap("EffectiveTime")
        private String effectiveTime;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private String expireTime;

        @com.aliyun.core.annotation.NameInMap("GlobalQuota")
        private Boolean globalQuota;

        @com.aliyun.core.annotation.NameInMap("Period")
        private Period period;

        @com.aliyun.core.annotation.NameInMap("ProductCode")
        private String productCode;

        @com.aliyun.core.annotation.NameInMap("QuotaActionCode")
        private String quotaActionCode;

        @com.aliyun.core.annotation.NameInMap("QuotaArn")
        private String quotaArn;

        @com.aliyun.core.annotation.NameInMap("QuotaCategory")
        private String quotaCategory;

        @com.aliyun.core.annotation.NameInMap("QuotaDescription")
        private String quotaDescription;

        @com.aliyun.core.annotation.NameInMap("QuotaItems")
        private java.util.List < QuotaItems> quotaItems;

        @com.aliyun.core.annotation.NameInMap("QuotaName")
        private String quotaName;

        @com.aliyun.core.annotation.NameInMap("QuotaType")
        private String quotaType;

        @com.aliyun.core.annotation.NameInMap("QuotaUnit")
        private String quotaUnit;

        @com.aliyun.core.annotation.NameInMap("SupportedRange")
        private java.util.List < Float > supportedRange;

        @com.aliyun.core.annotation.NameInMap("TotalQuota")
        private Float totalQuota;

        @com.aliyun.core.annotation.NameInMap("TotalUsage")
        private Float totalUsage;

        @com.aliyun.core.annotation.NameInMap("UnadjustableDetail")
        private String unadjustableDetail;

        @com.aliyun.core.annotation.NameInMap("UsageMetric")
        private UsageMetric usageMetric;

        private Quota(Builder builder) {
            this.adjustable = builder.adjustable;
            this.applicableRange = builder.applicableRange;
            this.applicableType = builder.applicableType;
            this.applyReasonTips = builder.applyReasonTips;
            this.consumable = builder.consumable;
            this.dimensions = builder.dimensions;
            this.effectiveTime = builder.effectiveTime;
            this.expireTime = builder.expireTime;
            this.globalQuota = builder.globalQuota;
            this.period = builder.period;
            this.productCode = builder.productCode;
            this.quotaActionCode = builder.quotaActionCode;
            this.quotaArn = builder.quotaArn;
            this.quotaCategory = builder.quotaCategory;
            this.quotaDescription = builder.quotaDescription;
            this.quotaItems = builder.quotaItems;
            this.quotaName = builder.quotaName;
            this.quotaType = builder.quotaType;
            this.quotaUnit = builder.quotaUnit;
            this.supportedRange = builder.supportedRange;
            this.totalQuota = builder.totalQuota;
            this.totalUsage = builder.totalUsage;
            this.unadjustableDetail = builder.unadjustableDetail;
            this.usageMetric = builder.usageMetric;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Quota create() {
            return builder().build();
        }

        /**
         * @return adjustable
         */
        public Boolean getAdjustable() {
            return this.adjustable;
        }

        /**
         * @return applicableRange
         */
        public java.util.List < Float > getApplicableRange() {
            return this.applicableRange;
        }

        /**
         * @return applicableType
         */
        public String getApplicableType() {
            return this.applicableType;
        }

        /**
         * @return applyReasonTips
         */
        public String getApplyReasonTips() {
            return this.applyReasonTips;
        }

        /**
         * @return consumable
         */
        public Boolean getConsumable() {
            return this.consumable;
        }

        /**
         * @return dimensions
         */
        public java.util.Map < String, ? > getDimensions() {
            return this.dimensions;
        }

        /**
         * @return effectiveTime
         */
        public String getEffectiveTime() {
            return this.effectiveTime;
        }

        /**
         * @return expireTime
         */
        public String getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return globalQuota
         */
        public Boolean getGlobalQuota() {
            return this.globalQuota;
        }

        /**
         * @return period
         */
        public Period getPeriod() {
            return this.period;
        }

        /**
         * @return productCode
         */
        public String getProductCode() {
            return this.productCode;
        }

        /**
         * @return quotaActionCode
         */
        public String getQuotaActionCode() {
            return this.quotaActionCode;
        }

        /**
         * @return quotaArn
         */
        public String getQuotaArn() {
            return this.quotaArn;
        }

        /**
         * @return quotaCategory
         */
        public String getQuotaCategory() {
            return this.quotaCategory;
        }

        /**
         * @return quotaDescription
         */
        public String getQuotaDescription() {
            return this.quotaDescription;
        }

        /**
         * @return quotaItems
         */
        public java.util.List < QuotaItems> getQuotaItems() {
            return this.quotaItems;
        }

        /**
         * @return quotaName
         */
        public String getQuotaName() {
            return this.quotaName;
        }

        /**
         * @return quotaType
         */
        public String getQuotaType() {
            return this.quotaType;
        }

        /**
         * @return quotaUnit
         */
        public String getQuotaUnit() {
            return this.quotaUnit;
        }

        /**
         * @return supportedRange
         */
        public java.util.List < Float > getSupportedRange() {
            return this.supportedRange;
        }

        /**
         * @return totalQuota
         */
        public Float getTotalQuota() {
            return this.totalQuota;
        }

        /**
         * @return totalUsage
         */
        public Float getTotalUsage() {
            return this.totalUsage;
        }

        /**
         * @return unadjustableDetail
         */
        public String getUnadjustableDetail() {
            return this.unadjustableDetail;
        }

        /**
         * @return usageMetric
         */
        public UsageMetric getUsageMetric() {
            return this.usageMetric;
        }

        public static final class Builder {
            private Boolean adjustable; 
            private java.util.List < Float > applicableRange; 
            private String applicableType; 
            private String applyReasonTips; 
            private Boolean consumable; 
            private java.util.Map < String, ? > dimensions; 
            private String effectiveTime; 
            private String expireTime; 
            private Boolean globalQuota; 
            private Period period; 
            private String productCode; 
            private String quotaActionCode; 
            private String quotaArn; 
            private String quotaCategory; 
            private String quotaDescription; 
            private java.util.List < QuotaItems> quotaItems; 
            private String quotaName; 
            private String quotaType; 
            private String quotaUnit; 
            private java.util.List < Float > supportedRange; 
            private Float totalQuota; 
            private Float totalUsage; 
            private String unadjustableDetail; 
            private UsageMetric usageMetric; 

            /**
             * Indicates whether the quota is adjustable. Valid values:
             * <p>
             * 
             * *   true
             * *   false
             */
            public Builder adjustable(Boolean adjustable) {
                this.adjustable = adjustable;
                return this;
            }

            /**
             * The range of the quota value.
             */
            public Builder applicableRange(java.util.List < Float > applicableRange) {
                this.applicableRange = applicableRange;
                return this;
            }

            /**
             * The type of the adjustable value. Valid values:
             * <p>
             * 
             * *   continuous
             * *   discontinuous
             */
            public Builder applicableType(String applicableType) {
                this.applicableType = applicableType;
                return this;
            }

            /**
             * The reason for submitting a quota increase request.
             */
            public Builder applyReasonTips(String applyReasonTips) {
                this.applyReasonTips = applyReasonTips;
                return this;
            }

            /**
             * Indicates whether the system shows the used value of the quota. Valid values:
             * <p>
             * 
             * *   true
             * *   false
             */
            public Builder consumable(Boolean consumable) {
                this.consumable = consumable;
                return this;
            }

            /**
             * The quota dimension. Format: `{"regionId":"Region"}`.
             */
            public Builder dimensions(java.util.Map < String, ? > dimensions) {
                this.dimensions = dimensions;
                return this;
            }

            /**
             * The start time of the validity period of the quota. Specify the value in UTC.
             */
            public Builder effectiveTime(String effectiveTime) {
                this.effectiveTime = effectiveTime;
                return this;
            }

            /**
             * The end time of the validity period of the quota. Specify the value in UTC.
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * Indicates whether the quota is a global quota. Valid values:
             * <p>
             * 
             * *   true: The quota is shared in all regions.
             * *   false: The quota is independently used in a region.
             */
            public Builder globalQuota(Boolean globalQuota) {
                this.globalQuota = globalQuota;
                return this;
            }

            /**
             * The calculation cycle of the quota.
             */
            public Builder period(Period period) {
                this.period = period;
                return this;
            }

            /**
             * The abbreviation of the Alibaba Cloud service name.
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            /**
             * The ID of the quota.
             */
            public Builder quotaActionCode(String quotaActionCode) {
                this.quotaActionCode = quotaActionCode;
                return this;
            }

            /**
             * The Alibaba Cloud Resource Name (ARN) of the quota.
             */
            public Builder quotaArn(String quotaArn) {
                this.quotaArn = quotaArn;
                return this;
            }

            /**
             * The type of the quota. Valid values:
             * <p>
             * 
             * *   CommonQuota: general quota
             * *   FlowControl: API rate limit
             * *   WhiteListLabel: whitelist quota
             */
            public Builder quotaCategory(String quotaCategory) {
                this.quotaCategory = quotaCategory;
                return this;
            }

            /**
             * The description of the quota.
             */
            public Builder quotaDescription(String quotaDescription) {
                this.quotaDescription = quotaDescription;
                return this;
            }

            /**
             * The details of the quotas.
             */
            public Builder quotaItems(java.util.List < QuotaItems> quotaItems) {
                this.quotaItems = quotaItems;
                return this;
            }

            /**
             * The name of the quota.
             */
            public Builder quotaName(String quotaName) {
                this.quotaName = quotaName;
                return this;
            }

            /**
             * The type of the quota. Valid values:
             * <p>
             * 
             * *   privilege
             * *   normal (default value)
             */
            public Builder quotaType(String quotaType) {
                this.quotaType = quotaType;
                return this;
            }

            /**
             * The unit of the new quota value.
             * <p>
             * 
             * > The unit of each quota is unique.** For example, the quota whose ID is `q_cbdch3` represents the maximum number of Container Service for Kubernetes (ACK) clusters. The unit of this quota is clusters. The quota whose ID is `q_security-groups` represents the maximum number of security groups. The unit of this quota is security groups.
             */
            public Builder quotaUnit(String quotaUnit) {
                this.quotaUnit = quotaUnit;
                return this;
            }

            /**
             * The range of the quota value.
             */
            public Builder supportedRange(java.util.List < Float > supportedRange) {
                this.supportedRange = supportedRange;
                return this;
            }

            /**
             * The value of the quota.
             */
            public Builder totalQuota(Float totalQuota) {
                this.totalQuota = totalQuota;
                return this;
            }

            /**
             * The used quota.
             */
            public Builder totalUsage(Float totalUsage) {
                this.totalUsage = totalUsage;
                return this;
            }

            /**
             * The reason why the quota is not adjustable. Valid values:
             * <p>
             * 
             * *   nonactivated: The service is not activated.
             * *   applicationProcess: The application is being processed.
             * *   limitReached: The quota limit is reached.
             * *   supportTicketRequired: The quota can be increased only by submitting a ticket.
             */
            public Builder unadjustableDetail(String unadjustableDetail) {
                this.unadjustableDetail = unadjustableDetail;
                return this;
            }

            /**
             * UsageMetric.
             */
            public Builder usageMetric(UsageMetric usageMetric) {
                this.usageMetric = usageMetric;
                return this;
            }

            public Quota build() {
                return new Quota(this);
            } 

        } 

    }
}
