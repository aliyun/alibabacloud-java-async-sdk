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
         * QuotaOverview.
         */
        public Builder quotaOverview(QuotaOverview quotaOverview) {
            this.quotaOverview = quotaOverview;
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
             * Adjustable.
             */
            public Builder adjustable(Long adjustable) {
                this.adjustable = adjustable;
                return this;
            }

            /**
             * AdjustableRatio.
             */
            public Builder adjustableRatio(Double adjustableRatio) {
                this.adjustableRatio = adjustableRatio;
                return this;
            }

            /**
             * Total.
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
             * Adjustable.
             */
            public Builder adjustable(Long adjustable) {
                this.adjustable = adjustable;
                return this;
            }

            /**
             * AdjustableRatio.
             */
            public Builder adjustableRatio(Double adjustableRatio) {
                this.adjustableRatio = adjustableRatio;
                return this;
            }

            /**
             * Total.
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
             * Adjustable.
             */
            public Builder adjustable(Long adjustable) {
                this.adjustable = adjustable;
                return this;
            }

            /**
             * AdjustableRatio.
             */
            public Builder adjustableRatio(Double adjustableRatio) {
                this.adjustableRatio = adjustableRatio;
                return this;
            }

            /**
             * Total.
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
             * InUse.
             */
            public Builder inUse(InUse inUse) {
                this.inUse = inUse;
                return this;
            }

            /**
             * Over80Percent.
             */
            public Builder over80Percent(Over80Percent over80Percent) {
                this.over80Percent = over80Percent;
                return this;
            }

            /**
             * Over95Percent.
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
