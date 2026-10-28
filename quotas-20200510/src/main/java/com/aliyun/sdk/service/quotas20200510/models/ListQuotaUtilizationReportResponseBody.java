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
 * {@link ListQuotaUtilizationReportResponseBody} extends {@link TeaModel}
 *
 * <p>ListQuotaUtilizationReportResponseBody</p>
 */
public class ListQuotaUtilizationReportResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMsg")
    private String errorMsg;

    @com.aliyun.core.annotation.NameInMap("GeneratedAt")
    private String generatedAt;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("Quotas")
    private java.util.List<Quotas> quotas;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListQuotaUtilizationReportResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMsg = builder.errorMsg;
        this.generatedAt = builder.generatedAt;
        this.message = builder.message;
        this.nextToken = builder.nextToken;
        this.quotas = builder.quotas;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListQuotaUtilizationReportResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMsg
     */
    public String getErrorMsg() {
        return this.errorMsg;
    }

    /**
     * @return generatedAt
     */
    public String getGeneratedAt() {
        return this.generatedAt;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return quotas
     */
    public java.util.List<Quotas> getQuotas() {
        return this.quotas;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMsg; 
        private String generatedAt; 
        private String message; 
        private String nextToken; 
        private java.util.List<Quotas> quotas; 
        private String requestId; 
        private String status; 
        private Boolean success; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListQuotaUtilizationReportResponseBody model) {
            this.errorCode = model.errorCode;
            this.errorMsg = model.errorMsg;
            this.generatedAt = model.generatedAt;
            this.message = model.message;
            this.nextToken = model.nextToken;
            this.quotas = model.quotas;
            this.requestId = model.requestId;
            this.status = model.status;
            this.success = model.success;
            this.totalCount = model.totalCount;
        } 

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMsg.
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * GeneratedAt.
         */
        public Builder generatedAt(String generatedAt) {
            this.generatedAt = generatedAt;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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
         * Quotas.
         */
        public Builder quotas(java.util.List<Quotas> quotas) {
            this.quotas = quotas;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListQuotaUtilizationReportResponseBody build() {
            return new ListQuotaUtilizationReportResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListQuotaUtilizationReportResponseBody} extends {@link TeaModel}
     *
     * <p>ListQuotaUtilizationReportResponseBody</p>
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
             * PeriodUnit.
             */
            public Builder periodUnit(String periodUnit) {
                this.periodUnit = periodUnit;
                return this;
            }

            /**
             * PeriodValue.
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
     * {@link ListQuotaUtilizationReportResponseBody} extends {@link TeaModel}
     *
     * <p>ListQuotaUtilizationReportResponseBody</p>
     */
    public static class FlowControlAlgo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlgoType")
        private String algoType;

        @com.aliyun.core.annotation.NameInMap("Period")
        private Period period;

        @com.aliyun.core.annotation.NameInMap("RefillInterval")
        private Integer refillInterval;

        @com.aliyun.core.annotation.NameInMap("TokensPerRefill")
        private Integer tokensPerRefill;

        @com.aliyun.core.annotation.NameInMap("TotalQuota")
        private Double totalQuota;

        private FlowControlAlgo(Builder builder) {
            this.algoType = builder.algoType;
            this.period = builder.period;
            this.refillInterval = builder.refillInterval;
            this.tokensPerRefill = builder.tokensPerRefill;
            this.totalQuota = builder.totalQuota;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlowControlAlgo create() {
            return builder().build();
        }

        /**
         * @return algoType
         */
        public String getAlgoType() {
            return this.algoType;
        }

        /**
         * @return period
         */
        public Period getPeriod() {
            return this.period;
        }

        /**
         * @return refillInterval
         */
        public Integer getRefillInterval() {
            return this.refillInterval;
        }

        /**
         * @return tokensPerRefill
         */
        public Integer getTokensPerRefill() {
            return this.tokensPerRefill;
        }

        /**
         * @return totalQuota
         */
        public Double getTotalQuota() {
            return this.totalQuota;
        }

        public static final class Builder {
            private String algoType; 
            private Period period; 
            private Integer refillInterval; 
            private Integer tokensPerRefill; 
            private Double totalQuota; 

            private Builder() {
            } 

            private Builder(FlowControlAlgo model) {
                this.algoType = model.algoType;
                this.period = model.period;
                this.refillInterval = model.refillInterval;
                this.tokensPerRefill = model.tokensPerRefill;
                this.totalQuota = model.totalQuota;
            } 

            /**
             * AlgoType.
             */
            public Builder algoType(String algoType) {
                this.algoType = algoType;
                return this;
            }

            /**
             * Period.
             */
            public Builder period(Period period) {
                this.period = period;
                return this;
            }

            /**
             * RefillInterval.
             */
            public Builder refillInterval(Integer refillInterval) {
                this.refillInterval = refillInterval;
                return this;
            }

            /**
             * TokensPerRefill.
             */
            public Builder tokensPerRefill(Integer tokensPerRefill) {
                this.tokensPerRefill = tokensPerRefill;
                return this;
            }

            /**
             * TotalQuota.
             */
            public Builder totalQuota(Double totalQuota) {
                this.totalQuota = totalQuota;
                return this;
            }

            public FlowControlAlgo build() {
                return new FlowControlAlgo(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListQuotaUtilizationReportResponseBody} extends {@link TeaModel}
     *
     * <p>ListQuotaUtilizationReportResponseBody</p>
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
             * MetricDimensions.
             */
            public Builder metricDimensions(java.util.Map<String, String> metricDimensions) {
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
    /**
     * 
     * {@link ListQuotaUtilizationReportResponseBody} extends {@link TeaModel}
     *
     * <p>ListQuotaUtilizationReportResponseBody</p>
     */
    public static class Quotas extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Adjustable")
        private Boolean adjustable;

        @com.aliyun.core.annotation.NameInMap("Consumable")
        private Boolean consumable;

        @com.aliyun.core.annotation.NameInMap("Dimensions")
        private java.util.Map<String, String> dimensions;

        @com.aliyun.core.annotation.NameInMap("FlowControlAlgo")
        private FlowControlAlgo flowControlAlgo;

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

        @com.aliyun.core.annotation.NameInMap("QuotaName")
        private String quotaName;

        @com.aliyun.core.annotation.NameInMap("TotalQuota")
        private Double totalQuota;

        @com.aliyun.core.annotation.NameInMap("TotalUsage")
        private Double totalUsage;

        @com.aliyun.core.annotation.NameInMap("UnadjustableDetail")
        private String unadjustableDetail;

        @com.aliyun.core.annotation.NameInMap("UsageMetric")
        private UsageMetric usageMetric;

        @com.aliyun.core.annotation.NameInMap("Utilization")
        private Double utilization;

        @com.aliyun.core.annotation.NameInMap("UtilizationStatus")
        private String utilizationStatus;

        private Quotas(Builder builder) {
            this.adjustable = builder.adjustable;
            this.consumable = builder.consumable;
            this.dimensions = builder.dimensions;
            this.flowControlAlgo = builder.flowControlAlgo;
            this.productCode = builder.productCode;
            this.quotaActionCode = builder.quotaActionCode;
            this.quotaArn = builder.quotaArn;
            this.quotaCategory = builder.quotaCategory;
            this.quotaDescription = builder.quotaDescription;
            this.quotaName = builder.quotaName;
            this.totalQuota = builder.totalQuota;
            this.totalUsage = builder.totalUsage;
            this.unadjustableDetail = builder.unadjustableDetail;
            this.usageMetric = builder.usageMetric;
            this.utilization = builder.utilization;
            this.utilizationStatus = builder.utilizationStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Quotas create() {
            return builder().build();
        }

        /**
         * @return adjustable
         */
        public Boolean getAdjustable() {
            return this.adjustable;
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
        public java.util.Map<String, String> getDimensions() {
            return this.dimensions;
        }

        /**
         * @return flowControlAlgo
         */
        public FlowControlAlgo getFlowControlAlgo() {
            return this.flowControlAlgo;
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
         * @return quotaName
         */
        public String getQuotaName() {
            return this.quotaName;
        }

        /**
         * @return totalQuota
         */
        public Double getTotalQuota() {
            return this.totalQuota;
        }

        /**
         * @return totalUsage
         */
        public Double getTotalUsage() {
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

        /**
         * @return utilization
         */
        public Double getUtilization() {
            return this.utilization;
        }

        /**
         * @return utilizationStatus
         */
        public String getUtilizationStatus() {
            return this.utilizationStatus;
        }

        public static final class Builder {
            private Boolean adjustable; 
            private Boolean consumable; 
            private java.util.Map<String, String> dimensions; 
            private FlowControlAlgo flowControlAlgo; 
            private String productCode; 
            private String quotaActionCode; 
            private String quotaArn; 
            private String quotaCategory; 
            private String quotaDescription; 
            private String quotaName; 
            private Double totalQuota; 
            private Double totalUsage; 
            private String unadjustableDetail; 
            private UsageMetric usageMetric; 
            private Double utilization; 
            private String utilizationStatus; 

            private Builder() {
            } 

            private Builder(Quotas model) {
                this.adjustable = model.adjustable;
                this.consumable = model.consumable;
                this.dimensions = model.dimensions;
                this.flowControlAlgo = model.flowControlAlgo;
                this.productCode = model.productCode;
                this.quotaActionCode = model.quotaActionCode;
                this.quotaArn = model.quotaArn;
                this.quotaCategory = model.quotaCategory;
                this.quotaDescription = model.quotaDescription;
                this.quotaName = model.quotaName;
                this.totalQuota = model.totalQuota;
                this.totalUsage = model.totalUsage;
                this.unadjustableDetail = model.unadjustableDetail;
                this.usageMetric = model.usageMetric;
                this.utilization = model.utilization;
                this.utilizationStatus = model.utilizationStatus;
            } 

            /**
             * Adjustable.
             */
            public Builder adjustable(Boolean adjustable) {
                this.adjustable = adjustable;
                return this;
            }

            /**
             * Consumable.
             */
            public Builder consumable(Boolean consumable) {
                this.consumable = consumable;
                return this;
            }

            /**
             * Dimensions.
             */
            public Builder dimensions(java.util.Map<String, String> dimensions) {
                this.dimensions = dimensions;
                return this;
            }

            /**
             * FlowControlAlgo.
             */
            public Builder flowControlAlgo(FlowControlAlgo flowControlAlgo) {
                this.flowControlAlgo = flowControlAlgo;
                return this;
            }

            /**
             * ProductCode.
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            /**
             * QuotaActionCode.
             */
            public Builder quotaActionCode(String quotaActionCode) {
                this.quotaActionCode = quotaActionCode;
                return this;
            }

            /**
             * QuotaArn.
             */
            public Builder quotaArn(String quotaArn) {
                this.quotaArn = quotaArn;
                return this;
            }

            /**
             * QuotaCategory.
             */
            public Builder quotaCategory(String quotaCategory) {
                this.quotaCategory = quotaCategory;
                return this;
            }

            /**
             * QuotaDescription.
             */
            public Builder quotaDescription(String quotaDescription) {
                this.quotaDescription = quotaDescription;
                return this;
            }

            /**
             * QuotaName.
             */
            public Builder quotaName(String quotaName) {
                this.quotaName = quotaName;
                return this;
            }

            /**
             * TotalQuota.
             */
            public Builder totalQuota(Double totalQuota) {
                this.totalQuota = totalQuota;
                return this;
            }

            /**
             * TotalUsage.
             */
            public Builder totalUsage(Double totalUsage) {
                this.totalUsage = totalUsage;
                return this;
            }

            /**
             * UnadjustableDetail.
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

            /**
             * Utilization.
             */
            public Builder utilization(Double utilization) {
                this.utilization = utilization;
                return this;
            }

            /**
             * UtilizationStatus.
             */
            public Builder utilizationStatus(String utilizationStatus) {
                this.utilizationStatus = utilizationStatus;
                return this;
            }

            public Quotas build() {
                return new Quotas(this);
            } 

        } 

    }
}
