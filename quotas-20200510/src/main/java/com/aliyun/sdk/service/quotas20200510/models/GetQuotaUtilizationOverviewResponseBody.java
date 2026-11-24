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
 * {@link GetQuotaUtilizationOverviewResponseBody} extends {@link TeaModel}
 *
 * <p>GetQuotaUtilizationOverviewResponseBody</p>
 */
public class GetQuotaUtilizationOverviewResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMsg")
    private String errorMsg;

    @com.aliyun.core.annotation.NameInMap("GeneratedAt")
    private String generatedAt;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("QuotaOverview")
    private QuotaOverview quotaOverview;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetQuotaUtilizationOverviewResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMsg = builder.errorMsg;
        this.generatedAt = builder.generatedAt;
        this.message = builder.message;
        this.quotaOverview = builder.quotaOverview;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetQuotaUtilizationOverviewResponseBody create() {
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
     * @return quotaOverview
     */
    public QuotaOverview getQuotaOverview() {
        return this.quotaOverview;
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

    public static final class Builder {
        private String errorCode; 
        private String errorMsg; 
        private String generatedAt; 
        private String message; 
        private QuotaOverview quotaOverview; 
        private String requestId; 
        private String status; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetQuotaUtilizationOverviewResponseBody model) {
            this.errorCode = model.errorCode;
            this.errorMsg = model.errorMsg;
            this.generatedAt = model.generatedAt;
            this.message = model.message;
            this.quotaOverview = model.quotaOverview;
            this.requestId = model.requestId;
            this.status = model.status;
            this.success = model.success;
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
         * <p>The data generation time or statistical date. For general quotas, the time is in UTC and formatted as yyyy-MM-dd\&quot;T\&quot;HH:mm:ss\&quot;Z\&quot;. For API rate limits, the format is yyyy-MM-dd.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-21T07:30:10Z</p>
         */
        public Builder generatedAt(String generatedAt) {
            this.generatedAt = generatedAt;
            return this;
        }

        /**
         * <p>The supplementary description of the report status. Use Status to determine the status.</p>
         * 
         * <strong>example:</strong>
         * <p>Quota utilization data is available.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The quota overview data.</p>
         */
        public Builder quotaOverview(QuotaOverview quotaOverview) {
            this.quotaOverview = quotaOverview;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>920D8A47-26BB-49FA-A09F-F98D7DAA55F3</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The query result status of the quota utilization report. Valid values:</p>
         * <ul>
         * <li><p>AVAILABLE: The data is available.</p>
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

        public GetQuotaUtilizationOverviewResponseBody build() {
            return new GetQuotaUtilizationOverviewResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetQuotaUtilizationOverviewResponseBody} extends {@link TeaModel}
     *
     * <p>GetQuotaUtilizationOverviewResponseBody</p>
     */
    public static class InUse extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Adjustable")
        private Long adjustable;

        @com.aliyun.core.annotation.NameInMap("AdjustableRatio")
        private Double adjustableRatio;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        private InUse(Builder builder) {
            this.adjustable = builder.adjustable;
            this.adjustableRatio = builder.adjustableRatio;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InUse create() {
            return builder().build();
        }

        /**
         * @return adjustable
         */
        public Long getAdjustable() {
            return this.adjustable;
        }

        /**
         * @return adjustableRatio
         */
        public Double getAdjustableRatio() {
            return this.adjustableRatio;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private Long adjustable; 
            private Double adjustableRatio; 
            private Long total; 

            private Builder() {
            } 

            private Builder(InUse model) {
                this.adjustable = model.adjustable;
                this.adjustableRatio = model.adjustableRatio;
                this.total = model.total;
            } 

            /**
             * <p>The number of adjustable quotas in use.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder adjustable(Long adjustable) {
                this.adjustable = adjustable;
                return this;
            }

            /**
             * <p>The adjustment rate of quotas in use, without the percentage sign.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder adjustableRatio(Double adjustableRatio) {
                this.adjustableRatio = adjustableRatio;
                return this;
            }

            /**
             * <p>The total number of quotas in use.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public InUse build() {
                return new InUse(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetQuotaUtilizationOverviewResponseBody} extends {@link TeaModel}
     *
     * <p>GetQuotaUtilizationOverviewResponseBody</p>
     */
    public static class Over80Percent extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Adjustable")
        private Long adjustable;

        @com.aliyun.core.annotation.NameInMap("AdjustableRatio")
        private Double adjustableRatio;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        private Over80Percent(Builder builder) {
            this.adjustable = builder.adjustable;
            this.adjustableRatio = builder.adjustableRatio;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Over80Percent create() {
            return builder().build();
        }

        /**
         * @return adjustable
         */
        public Long getAdjustable() {
            return this.adjustable;
        }

        /**
         * @return adjustableRatio
         */
        public Double getAdjustableRatio() {
            return this.adjustableRatio;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private Long adjustable; 
            private Double adjustableRatio; 
            private Long total; 

            private Builder() {
            } 

            private Builder(Over80Percent model) {
                this.adjustable = model.adjustable;
                this.adjustableRatio = model.adjustableRatio;
                this.total = model.total;
            } 

            /**
             * <p>The number of adjustable quotas with a utilization rate exceeding 80%.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder adjustable(Long adjustable) {
                this.adjustable = adjustable;
                return this;
            }

            /**
             * <p>The adjustment rate of quotas with a utilization rate exceeding 80%, without the percentage sign.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder adjustableRatio(Double adjustableRatio) {
                this.adjustableRatio = adjustableRatio;
                return this;
            }

            /**
             * <p>The number of quotas with a utilization rate exceeding 80%.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public Over80Percent build() {
                return new Over80Percent(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetQuotaUtilizationOverviewResponseBody} extends {@link TeaModel}
     *
     * <p>GetQuotaUtilizationOverviewResponseBody</p>
     */
    public static class Over95Percent extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Adjustable")
        private Long adjustable;

        @com.aliyun.core.annotation.NameInMap("AdjustableRatio")
        private Double adjustableRatio;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        private Over95Percent(Builder builder) {
            this.adjustable = builder.adjustable;
            this.adjustableRatio = builder.adjustableRatio;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Over95Percent create() {
            return builder().build();
        }

        /**
         * @return adjustable
         */
        public Long getAdjustable() {
            return this.adjustable;
        }

        /**
         * @return adjustableRatio
         */
        public Double getAdjustableRatio() {
            return this.adjustableRatio;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private Long adjustable; 
            private Double adjustableRatio; 
            private Long total; 

            private Builder() {
            } 

            private Builder(Over95Percent model) {
                this.adjustable = model.adjustable;
                this.adjustableRatio = model.adjustableRatio;
                this.total = model.total;
            } 

            /**
             * <p>The number of adjustable quotas with a utilization rate exceeding 95%.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder adjustable(Long adjustable) {
                this.adjustable = adjustable;
                return this;
            }

            /**
             * <p>The adjustment rate of quotas with a utilization rate exceeding 95%, without the percentage sign.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder adjustableRatio(Double adjustableRatio) {
                this.adjustableRatio = adjustableRatio;
                return this;
            }

            /**
             * <p>The number of quotas with a utilization rate exceeding 95%.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public Over95Percent build() {
                return new Over95Percent(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetQuotaUtilizationOverviewResponseBody} extends {@link TeaModel}
     *
     * <p>GetQuotaUtilizationOverviewResponseBody</p>
     */
    public static class QuotaOverview extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InUse")
        private InUse inUse;

        @com.aliyun.core.annotation.NameInMap("Over80Percent")
        private Over80Percent over80Percent;

        @com.aliyun.core.annotation.NameInMap("Over95Percent")
        private Over95Percent over95Percent;

        private QuotaOverview(Builder builder) {
            this.inUse = builder.inUse;
            this.over80Percent = builder.over80Percent;
            this.over95Percent = builder.over95Percent;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QuotaOverview create() {
            return builder().build();
        }

        /**
         * @return inUse
         */
        public InUse getInUse() {
            return this.inUse;
        }

        /**
         * @return over80Percent
         */
        public Over80Percent getOver80Percent() {
            return this.over80Percent;
        }

        /**
         * @return over95Percent
         */
        public Over95Percent getOver95Percent() {
            return this.over95Percent;
        }

        public static final class Builder {
            private InUse inUse; 
            private Over80Percent over80Percent; 
            private Over95Percent over95Percent; 

            private Builder() {
            } 

            private Builder(QuotaOverview model) {
                this.inUse = model.inUse;
                this.over80Percent = model.over80Percent;
                this.over95Percent = model.over95Percent;
            } 

            /**
             * <p>The quotas in use.</p>
             */
            public Builder inUse(InUse inUse) {
                this.inUse = inUse;
                return this;
            }

            /**
             * <p>The quotas with a utilization rate exceeding 80%.</p>
             */
            public Builder over80Percent(Over80Percent over80Percent) {
                this.over80Percent = over80Percent;
                return this;
            }

            /**
             * <p>The quotas with a utilization rate exceeding 95%.</p>
             */
            public Builder over95Percent(Over95Percent over95Percent) {
                this.over95Percent = over95Percent;
                return this;
            }

            public QuotaOverview build() {
                return new QuotaOverview(this);
            } 

        } 

    }
}
