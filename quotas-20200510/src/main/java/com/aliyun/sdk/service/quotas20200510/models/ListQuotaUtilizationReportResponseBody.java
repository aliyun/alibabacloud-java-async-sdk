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
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>RAM.PERMISSION.DENIED</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>You are not authorized to do this action or the API input parameter is invalid.</p>
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * <p>The data generation time or statistical date. For general quotas, the time is in UTC and formatted as yyyy-MM-dd\&quot;T\&quot;HH:mm:ss\&quot;Z\&quot;. For API rate quotas, the date is formatted as yyyy-MM-dd.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-26T06:24:57Z</p>
         */
        public Builder generatedAt(String generatedAt) {
            this.generatedAt = generatedAt;
            return this;
        }

        /**
         * <p>The supplementary description of the report status, such as report generation in progress, report generation needs to be started first, or a newer report is available for re-query. Applications should use Status to determine the status.</p>
         * 
         * <strong>example:</strong>
         * <p>Quota utilization data is available.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The token used to query the next page. An empty value indicates that no next page exists.</p>
         * 
         * <strong>example:</strong>
         * <p>eyJvZmZzZXQiOjEwLCJvdHNOZXh0VG9rZW4iOiJDQUVTR3dvWkNoY0tFM1J2ZEdGc1gzVnpZV2RsWDNCbGNtTmxiblFRQVJnQkl1RUJDZ2tCQUFBQUFBQUFXVUFLMHdFRHpnQUFBREZUTXpFek9ETXdNemN6TnpNNE16VXpPVE0xTXpjek5qTXpNekV6TlRNNE16Z3VVek01TXpjek5UTTJOalkyTWpZeE16Y3laRFl5TmpJek16WXhNbVF6TkRNMk16RXpOREprTmpFek9UTTRNemN5WkRZMk16WTJORE16TXpVMk16TXhNemt6TURZMk16RXpNUzVUTmpFMk16YzBOamsyWmpabE56UTNNall4TmprMll5NVRNelkyTWpZMU16a3pPRE0yTmpRek1qSmtNekV6TlRNeU5qRXlaRE0wTXpFek1UWTJNbVEyTWpZME16TXpNVEprTXpNMk16WXlOalV6TkRNMU16VXpNalkwTXpVek1qTTMiLCJ0YXNrSWQiOiI5NzU2ZmJhNy1iYjNhLTQ2MTQtYTk4Ny1mNmQzNWMxOTBmMTEiLCJ1aWQiOiIxODA3Nzg1OTU3NjMxNTg4IiwidXRpbGl6YXRpb25TdGF0dXNlcyI6IiJ9</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The list of quota usage on the current page. An empty list is returned if no matching data exists or no general quota report is available.</p>
         */
        public Builder quotas(java.util.List<Quotas> quotas) {
            this.quotas = quotas;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7ED584FB-ECBF-4A2A-969D-F54D25EFABF9</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The status of the query result for the quota utilization report. Valid values:</p>
         * <ul>
         * <li><p>AVAILABLE: The data is available for query.</p>
         * </li>
         * <li><p>GENERATING: A new report is being generated. If an unexpired historical report exists, the most recent historical report is returned.</p>
         * </li>
         * <li><p>UNAVAILABLE: No general quota report is available. You must call StartQuotaUtilizationReport to start report generation first.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AVAILABLE</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>Indicates whether the call is successful. Valid values:</p>
         * <ul>
         * <li>true: The call is successful.</li>
         * <li>false: The call fails.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of entries that meet all filter conditions in the current report, rather than the number of entries on the current page. The value is 0 if no matching entries exist.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
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
             * <p>The unit of the quota calculation period. Valid values:</p>
             * <ul>
             * <li>second: Seconds.</li>
             * <li>minute: Minutes.</li>
             * <li>hour: Hours.</li>
             * <li>day: Days.</li>
             * <li>week: Weeks.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>second</p>
             */
            public Builder periodUnit(String periodUnit) {
                this.periodUnit = periodUnit;
                return this;
            }

            /**
             * <p>The value of the quota calculation period.</p>
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
             * <p>The type of the throttling algorithm. Valid values:</p>
             * <ul>
             * <li>FixedWindow: Fixed window.</li>
             * <li>TokenBucket: Token bucket.</li>
             * <li>Concurrency: Concurrency limit.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>FixedWindow</p>
             */
            public Builder algoType(String algoType) {
                this.algoType = algoType;
                return this;
            }

            /**
             * <p>The time period. This parameter is returned only for FixedWindow and is empty for other algorithms.</p>
             */
            public Builder period(Period period) {
                this.period = period;
                return this;
            }

            /**
             * <p>The time interval between two token refills. This parameter is returned only for TokenBucket and is empty for other algorithms. The time unit must be confirmed with the upstream service and is not declared in the current code.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder refillInterval(Integer refillInterval) {
                this.refillInterval = refillInterval;
                return this;
            }

            /**
             * <p>The number of tokens added per refill. This parameter is returned only for TokenBucket and is empty for other algorithms.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder tokensPerRefill(Integer tokensPerRefill) {
                this.tokensPerRefill = tokensPerRefill;
                return this;
            }

            /**
             * <p>The quota value.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
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
             * <p>The CloudMonitor monitoring dimensions.</p>
             * <p>Format: a collection of key:value pairs. Example:
             * <code>{&quot;productCode&quot;:&quot;***&quot;,&quot;metricKey&quot;:&quot;***&quot;,&quot;regionId&quot;:&quot;***&quot;,&quot;label&quot;:&quot;***&quot;}</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;regionId&quot;:&quot;cn-hangzhou&quot;}</p>
             */
            public Builder metricDimensions(java.util.Map<String, String> metricDimensions) {
                this.metricDimensions = metricDimensions;
                return this;
            }

            /**
             * <p>The <a href="https://cms.console.aliyun.com/metric-meta/acs_ecs_dashboard/ecs">monitored metric</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>Usage</p>
             */
            public Builder metricName(String metricName) {
                this.metricName = metricName;
                return this;
            }

            /**
             * <p>The namespace of the CloudMonitor monitoring data.</p>
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
             * <p>Indicates whether the quota is adjustable.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder adjustable(Boolean adjustable) {
                this.adjustable = adjustable;
                return this;
            }

            /**
             * <p>Indicates whether the used quota is displayed.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder consumable(Boolean consumable) {
                this.consumable = consumable;
                return this;
            }

            /**
             * <p>The quota dimensions. Format: <code>{&quot;regionId&quot;:&quot;region ID&quot;}</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;regionId&quot;:&quot;cn-hangzhou&quot;}</p>
             */
            public Builder dimensions(java.util.Map<String, String> dimensions) {
                this.dimensions = dimensions;
                return this;
            }

            /**
             * <p>The traffic throttling algorithms.</p>
             */
            public Builder flowControlAlgo(FlowControlAlgo flowControlAlgo) {
                this.flowControlAlgo = flowControlAlgo;
                return this;
            }

            /**
             * <p>The abbreviation of the cloud service name.</p>
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
             * <p>The quota ARN.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:quotas:cn-hangzhou:120886317861****:quota/ecs/q_security-groups</p>
             */
            public Builder quotaArn(String quotaArn) {
                this.quotaArn = quotaArn;
                return this;
            }

            /**
             * <p>The quota type.</p>
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
             * <p>The quota name.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs.g5.2xlarge</p>
             */
            public Builder quotaName(String quotaName) {
                this.quotaName = quotaName;
                return this;
            }

            /**
             * <p>The quota value.</p>
             * 
             * <strong>example:</strong>
             * <p>10000</p>
             */
            public Builder totalQuota(Double totalQuota) {
                this.totalQuota = totalQuota;
                return this;
            }

            /**
             * <p>The quota usage.</p>
             * 
             * <strong>example:</strong>
             * <p>1009</p>
             */
            public Builder totalUsage(Double totalUsage) {
                this.totalUsage = totalUsage;
                return this;
            }

            /**
             * <p>The reason why the quota is not adjustable.</p>
             * 
             * <strong>example:</strong>
             * <p>applicationProcess</p>
             */
            public Builder unadjustableDetail(String unadjustableDetail) {
                this.unadjustableDetail = unadjustableDetail;
                return this;
            }

            /**
             * <p>The monitoring information of the quota usage in CloudMonitor.</p>
             * <blockquote>
             * <p>An empty value indicates that no monitoring data for this quota exists in CloudMonitor.</p>
             * </blockquote>
             */
            public Builder usageMetric(UsageMetric usageMetric) {
                this.usageMetric = usageMetric;
                return this;
            }

            /**
             * <p>The quota utilization rate, without the percentage sign.</p>
             * 
             * <strong>example:</strong>
             * <p>10.1</p>
             */
            public Builder utilization(Double utilization) {
                this.utilization = utilization;
                return this;
            }

            /**
             * <p>The risk level determined by the returned Utilization value. Valid values:</p>
             * <ul>
             * <li>NORMAL: Less than 80%.</li>
             * <li>WARN: Greater than or equal to 80% and less than 95%.</li>
             * <li>CRITICAL: Greater than or equal to 95%.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>WARN</p>
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
