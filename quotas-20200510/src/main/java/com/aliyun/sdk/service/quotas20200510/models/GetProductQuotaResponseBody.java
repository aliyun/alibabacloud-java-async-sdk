// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quotas20200510.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetProductQuotaResponseBody model) {
            this.quota = model.quota;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The quota details.</p>
         */
        public Builder quota(Quota quota) {
            this.quota = quota;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>8FF8CAF0-29D9-4F11-B6A4-FD2CBCA016D3</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetProductQuotaResponseBody build() {
            return new GetProductQuotaResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetProductQuotaResponseBody} extends {@link TeaModel}
     *
     * <p>GetProductQuotaResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Period model) {
                this.periodUnit = model.periodUnit;
                this.periodValue = model.periodValue;
            } 

            /**
             * <p>The unit of the quota period. Valid values:</p>
             * <ul>
             * <li><p>second: Seconds.</p>
             * </li>
             * <li><p>minute: Minutes.</p>
             * </li>
             * <li><p>hour: Hours.</p>
             * </li>
             * <li><p>day: Days.</p>
             * </li>
             * <li><p>week: Weeks.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>day</p>
             */
            public Builder periodUnit(String periodUnit) {
                this.periodUnit = periodUnit;
                return this;
            }

            /**
             * <p>The value of the quota period.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
    /**
     * 
     * {@link GetProductQuotaResponseBody} extends {@link TeaModel}
     *
     * <p>GetProductQuotaResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(QuotaItems model) {
                this.quota = model.quota;
                this.quotaUnit = model.quotaUnit;
                this.type = model.type;
                this.usage = model.usage;
            } 

            /**
             * <p>The quota value.</p>
             * 
             * <strong>example:</strong>
             * <p>801</p>
             */
            public Builder quota(String quota) {
                this.quota = quota;
                return this;
            }

            /**
             * <p>The quota unit.</p>
             * <blockquote>
             * <p>The unit varies for each quota. For example, the unit of the q_cbdch3 quota (maximum number of clusters) for Container Service for Kubernetes is Cluster, and the unit of the q_security-groups quota (maximum number of security groups) for Elastic Compute Service servers is count.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Count</p>
             */
            public Builder quotaUnit(String quotaUnit) {
                this.quotaUnit = quotaUnit;
                return this;
            }

            /**
             * <p>The quota item type. Valid values:</p>
             * <ul>
             * <li><p>BaseQuota: Base quota.</p>
             * </li>
             * <li><p>ReservedQuota: Reserved quota.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>BaseQuota</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The quota usage.</p>
             * 
             * <strong>example:</strong>
             * <p>26</p>
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
    /**
     * 
     * {@link GetProductQuotaResponseBody} extends {@link TeaModel}
     *
     * <p>GetProductQuotaResponseBody</p>
     */
    public static class UsageMetric extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MetricDimensions")
        private java.util.Map<String, String> metricDimensions;

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
        public java.util.Map<String, String> getMetricDimensions() {
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
            private java.util.Map<String, String> metricDimensions; 
            private String metricName; 
            private String metricNamespace; 

            private Builder() {
            } 

            private Builder(UsageMetric model) {
                this.metricDimensions = model.metricDimensions;
                this.metricName = model.metricName;
                this.metricNamespace = model.metricNamespace;
            } 

            /**
             * <p>The CloudMonitor monitoring dimensions.</p>
             * <p>Format: a collection of <code>key:value</code> pairs. Example:
             * <code>{&quot;productCode&quot;:&quot;***&quot;,&quot;metricKey&quot;:&quot;***&quot;,&quot;regionId&quot;:&quot;***&quot;,&quot;label&quot;:&quot;***&quot;}</code>.</p>
             */
            public Builder metricDimensions(java.util.Map<String, String> metricDimensions) {
                this.metricDimensions = metricDimensions;
                return this;
            }

            /**
             * <p>The CloudMonitor metric name.</p>
             * 
             * <strong>example:</strong>
             * <p>Usage</p>
             */
            public Builder metricName(String metricName) {
                this.metricName = metricName;
                return this;
            }

            /**
             * <p>The CloudMonitor metric namespace.</p>
             * 
             * <strong>example:</strong>
             * <p>acs_quotas_flowcontrol</p>
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
    /**
     * 
     * {@link GetProductQuotaResponseBody} extends {@link TeaModel}
     *
     * <p>GetProductQuotaResponseBody</p>
     */
    public static class Quota extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Adjustable")
        private Boolean adjustable;

        @com.aliyun.core.annotation.NameInMap("ApplicableRange")
        private java.util.List<Float> applicableRange;

        @com.aliyun.core.annotation.NameInMap("ApplicableType")
        private String applicableType;

        @com.aliyun.core.annotation.NameInMap("ApplyReasonTips")
        private String applyReasonTips;

        @com.aliyun.core.annotation.NameInMap("Consumable")
        private Boolean consumable;

        @com.aliyun.core.annotation.NameInMap("Dimensions")
        private java.util.Map<String, ?> dimensions;

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
        private java.util.List<QuotaItems> quotaItems;

        @com.aliyun.core.annotation.NameInMap("QuotaName")
        private String quotaName;

        @com.aliyun.core.annotation.NameInMap("QuotaType")
        private String quotaType;

        @com.aliyun.core.annotation.NameInMap("QuotaUnit")
        private String quotaUnit;

        @com.aliyun.core.annotation.NameInMap("SupportedRange")
        private java.util.List<Float> supportedRange;

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
        public java.util.List<Float> getApplicableRange() {
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
        public java.util.Map<String, ?> getDimensions() {
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
        public java.util.List<QuotaItems> getQuotaItems() {
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
        public java.util.List<Float> getSupportedRange() {
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
            private java.util.List<Float> applicableRange; 
            private String applicableType; 
            private String applyReasonTips; 
            private Boolean consumable; 
            private java.util.Map<String, ?> dimensions; 
            private String effectiveTime; 
            private String expireTime; 
            private Boolean globalQuota; 
            private Period period; 
            private String productCode; 
            private String quotaActionCode; 
            private String quotaArn; 
            private String quotaCategory; 
            private String quotaDescription; 
            private java.util.List<QuotaItems> quotaItems; 
            private String quotaName; 
            private String quotaType; 
            private String quotaUnit; 
            private java.util.List<Float> supportedRange; 
            private Float totalQuota; 
            private Float totalUsage; 
            private String unadjustableDetail; 
            private UsageMetric usageMetric; 

            private Builder() {
            } 

            private Builder(Quota model) {
                this.adjustable = model.adjustable;
                this.applicableRange = model.applicableRange;
                this.applicableType = model.applicableType;
                this.applyReasonTips = model.applyReasonTips;
                this.consumable = model.consumable;
                this.dimensions = model.dimensions;
                this.effectiveTime = model.effectiveTime;
                this.expireTime = model.expireTime;
                this.globalQuota = model.globalQuota;
                this.period = model.period;
                this.productCode = model.productCode;
                this.quotaActionCode = model.quotaActionCode;
                this.quotaArn = model.quotaArn;
                this.quotaCategory = model.quotaCategory;
                this.quotaDescription = model.quotaDescription;
                this.quotaItems = model.quotaItems;
                this.quotaName = model.quotaName;
                this.quotaType = model.quotaType;
                this.quotaUnit = model.quotaUnit;
                this.supportedRange = model.supportedRange;
                this.totalQuota = model.totalQuota;
                this.totalUsage = model.totalUsage;
                this.unadjustableDetail = model.unadjustableDetail;
                this.usageMetric = model.usageMetric;
            } 

            /**
             * <p>Indicates whether the quota is adjustable. Valid values:</p>
             * <ul>
             * <li><p>true: Adjustable.</p>
             * </li>
             * <li><p>false: Not adjustable.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder adjustable(Boolean adjustable) {
                this.adjustable = adjustable;
                return this;
            }

            /**
             * <p>The applicable range for quota adjustment.</p>
             */
            public Builder applicableRange(java.util.List<Float> applicableRange) {
                this.applicableRange = applicableRange;
                return this;
            }

            /**
             * <p>The type of quota adjustment. Valid values:</p>
             * <ul>
             * <li><p>continuous: Continuous.</p>
             * </li>
             * <li><p>discontinuous: Discontinuous.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>continuous</p>
             */
            public Builder applicableType(String applicableType) {
                this.applicableType = applicableType;
                return this;
            }

            /**
             * <p>The sample reasons for applying for a quota adjustment.</p>
             * 
             * <strong>example:</strong>
             * <p>The business xxx is expected to grow by 50%.</p>
             */
            public Builder applyReasonTips(String applyReasonTips) {
                this.applyReasonTips = applyReasonTips;
                return this;
            }

            /**
             * <p>Indicates whether the used quota is displayed. Valid values:</p>
             * <ul>
             * <li><p>true: The used quota is displayed.</p>
             * </li>
             * <li><p>false: The used quota is not displayed.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder consumable(Boolean consumable) {
                this.consumable = consumable;
                return this;
            }

            /**
             * <p>The quota dimensions. Format: <code>{&quot;regionId&quot;:&quot;region&quot;}</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;regionId&quot;:&quot;cn-hangzhou&quot;}</p>
             */
            public Builder dimensions(java.util.Map<String, ?> dimensions) {
                this.dimensions = dimensions;
                return this;
            }

            /**
             * <p>The UTC time when the quota takes effect.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-09-28T06:06:00Z</p>
             */
            public Builder effectiveTime(String effectiveTime) {
                this.effectiveTime = effectiveTime;
                return this;
            }

            /**
             * <p>The UTC time when the quota expires.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-09-29T06:06:00Z</p>
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * <p>Indicates whether the quota is a global quota. Valid values:</p>
             * <ul>
             * <li>true: The quota item is shared across all regions.</li>
             * <li>false: The quota item is independent for each region.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder globalQuota(Boolean globalQuota) {
                this.globalQuota = globalQuota;
                return this;
            }

            /**
             * <p>The quota period.</p>
             */
            public Builder period(Period period) {
                this.period = period;
                return this;
            }

            /**
             * <p>The abbreviated name of the cloud service.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs</p>
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            /**
             * <p>The quota ID.</p>
             * 
             * <strong>example:</strong>
             * <p>q_security-groups</p>
             */
            public Builder quotaActionCode(String quotaActionCode) {
                this.quotaActionCode = quotaActionCode;
                return this;
            }

            /**
             * <p>The ARN of the quota.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:quotas:cn-hangzhou:120886317861****:quota/ecs/q_security-groups/</p>
             */
            public Builder quotaArn(String quotaArn) {
                this.quotaArn = quotaArn;
                return this;
            }

            /**
             * <p>The quota category. Valid values:</p>
             * <ul>
             * <li><p>CommonQuota: General quota.</p>
             * </li>
             * <li><p>FlowControl: API rate limit.</p>
             * </li>
             * <li><p>WhiteListLabel: Privilege.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CommonQuota</p>
             */
            public Builder quotaCategory(String quotaCategory) {
                this.quotaCategory = quotaCategory;
                return this;
            }

            /**
             * <p>The quota description.</p>
             * 
             * <strong>example:</strong>
             * <p>The maximum number of security groups that can be owned by the current account.</p>
             */
            public Builder quotaDescription(String quotaDescription) {
                this.quotaDescription = quotaDescription;
                return this;
            }

            /**
             * <p>The quota details.</p>
             */
            public Builder quotaItems(java.util.List<QuotaItems> quotaItems) {
                this.quotaItems = quotaItems;
                return this;
            }

            /**
             * <p>The quota name.</p>
             * 
             * <strong>example:</strong>
             * <p>Maximum Number of Security Groups</p>
             */
            public Builder quotaName(String quotaName) {
                this.quotaName = quotaName;
                return this;
            }

            /**
             * <p>The quota type. Valid values:</p>
             * <ul>
             * <li><p>privilege: Privilege.</p>
             * </li>
             * <li><p>normal: Normal.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>normal</p>
             */
            public Builder quotaType(String quotaType) {
                this.quotaType = quotaType;
                return this;
            }

            /**
             * <p>The quota unit.</p>
             * <blockquote>
             * <p>The unit varies for each quota. For example, the unit of the q_cbdch3 quota (maximum number of clusters) for Container Service for Kubernetes is Cluster, and the unit of the q_security-groups quota (maximum number of security groups) for Elastic Compute Service servers is count.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Count</p>
             */
            public Builder quotaUnit(String quotaUnit) {
                this.quotaUnit = quotaUnit;
                return this;
            }

            /**
             * <p>The supported range of quota values for the current quota item, which can be used as a reference when configuring a quota template.</p>
             */
            public Builder supportedRange(java.util.List<Float> supportedRange) {
                this.supportedRange = supportedRange;
                return this;
            }

            /**
             * <p>The quota value.</p>
             * 
             * <strong>example:</strong>
             * <p>801</p>
             */
            public Builder totalQuota(Float totalQuota) {
                this.totalQuota = totalQuota;
                return this;
            }

            /**
             * <p>The quota usage.</p>
             * 
             * <strong>example:</strong>
             * <p>26</p>
             */
            public Builder totalUsage(Float totalUsage) {
                this.totalUsage = totalUsage;
                return this;
            }

            /**
             * <p>The reason why the quota cannot be adjusted. Valid values:</p>
             * <ul>
             * <li><p>nonactivated: The service is not activated.</p>
             * </li>
             * <li><p>applicationProcess: The quota application is being processed.</p>
             * </li>
             * <li><p>limitReached: The quota limit is reached.</p>
             * </li>
             * <li><p>supportTicketRequired: A ticket must be submitted for the application.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>limitReached</p>
             */
            public Builder unadjustableDetail(String unadjustableDetail) {
                this.unadjustableDetail = unadjustableDetail;
                return this;
            }

            /**
             * <p>The monitoring information of the quota usage in CloudMonitor.</p>
             * <blockquote>
             * <p>An empty value indicates that no monitoring data is available for this quota in CloudMonitor.</p>
             * </blockquote>
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
