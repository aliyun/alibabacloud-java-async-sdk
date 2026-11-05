// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribeBudgetUsageResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBudgetUsageResponseBody</p>
 */
public class DescribeBudgetUsageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AlertTriggered")
    private String alertTriggered;

    @com.aliyun.core.annotation.NameInMap("DimensionRefId")
    private String dimensionRefId;

    @com.aliyun.core.annotation.NameInMap("DimensionType")
    private String dimensionType;

    @com.aliyun.core.annotation.NameInMap("Exceeded")
    private String exceeded;

    @com.aliyun.core.annotation.NameInMap("GmtCreated")
    private String gmtCreated;

    @com.aliyun.core.annotation.NameInMap("GmtModified")
    private String gmtModified;

    @com.aliyun.core.annotation.NameInMap("GwClusterId")
    private String gwClusterId;

    @com.aliyun.core.annotation.NameInMap("Policies")
    private java.util.List<Policies> policies;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UsedPoints")
    private String usedPoints;

    @com.aliyun.core.annotation.NameInMap("WindowEndTime")
    private String windowEndTime;

    @com.aliyun.core.annotation.NameInMap("WindowStartTime")
    private String windowStartTime;

    private DescribeBudgetUsageResponseBody(Builder builder) {
        this.alertTriggered = builder.alertTriggered;
        this.dimensionRefId = builder.dimensionRefId;
        this.dimensionType = builder.dimensionType;
        this.exceeded = builder.exceeded;
        this.gmtCreated = builder.gmtCreated;
        this.gmtModified = builder.gmtModified;
        this.gwClusterId = builder.gwClusterId;
        this.policies = builder.policies;
        this.requestId = builder.requestId;
        this.usedPoints = builder.usedPoints;
        this.windowEndTime = builder.windowEndTime;
        this.windowStartTime = builder.windowStartTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBudgetUsageResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alertTriggered
     */
    public String getAlertTriggered() {
        return this.alertTriggered;
    }

    /**
     * @return dimensionRefId
     */
    public String getDimensionRefId() {
        return this.dimensionRefId;
    }

    /**
     * @return dimensionType
     */
    public String getDimensionType() {
        return this.dimensionType;
    }

    /**
     * @return exceeded
     */
    public String getExceeded() {
        return this.exceeded;
    }

    /**
     * @return gmtCreated
     */
    public String getGmtCreated() {
        return this.gmtCreated;
    }

    /**
     * @return gmtModified
     */
    public String getGmtModified() {
        return this.gmtModified;
    }

    /**
     * @return gwClusterId
     */
    public String getGwClusterId() {
        return this.gwClusterId;
    }

    /**
     * @return policies
     */
    public java.util.List<Policies> getPolicies() {
        return this.policies;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return usedPoints
     */
    public String getUsedPoints() {
        return this.usedPoints;
    }

    /**
     * @return windowEndTime
     */
    public String getWindowEndTime() {
        return this.windowEndTime;
    }

    /**
     * @return windowStartTime
     */
    public String getWindowStartTime() {
        return this.windowStartTime;
    }

    public static final class Builder {
        private String alertTriggered; 
        private String dimensionRefId; 
        private String dimensionType; 
        private String exceeded; 
        private String gmtCreated; 
        private String gmtModified; 
        private String gwClusterId; 
        private java.util.List<Policies> policies; 
        private String requestId; 
        private String usedPoints; 
        private String windowEndTime; 
        private String windowStartTime; 

        private Builder() {
        } 

        private Builder(DescribeBudgetUsageResponseBody model) {
            this.alertTriggered = model.alertTriggered;
            this.dimensionRefId = model.dimensionRefId;
            this.dimensionType = model.dimensionType;
            this.exceeded = model.exceeded;
            this.gmtCreated = model.gmtCreated;
            this.gmtModified = model.gmtModified;
            this.gwClusterId = model.gwClusterId;
            this.policies = model.policies;
            this.requestId = model.requestId;
            this.usedPoints = model.usedPoints;
            this.windowEndTime = model.windowEndTime;
            this.windowStartTime = model.windowStartTime;
        } 

        /**
         * <p>Indicates whether a budget alert is triggered.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder alertTriggered(String alertTriggered) {
            this.alertTriggered = alertTriggered;
            return this;
        }

        /**
         * <p>The dimension reference ID of the current budget.</p>
         * 
         * <strong>example:</strong>
         * <p>ref-001</p>
         */
        public Builder dimensionRefId(String dimensionRefId) {
            this.dimensionRefId = dimensionRefId;
            return this;
        }

        /**
         * <p>The dimension type of the current budget.</p>
         * 
         * <strong>example:</strong>
         * <p>cluster</p>
         */
        public Builder dimensionType(String dimensionType) {
            this.dimensionType = dimensionType;
            return this;
        }

        /**
         * <p>Indicates whether the budget is exceeded.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder exceeded(String exceeded) {
            this.exceeded = exceeded;
            return this;
        }

        /**
         * <p>The creation time of the budget usage record in RFC 3339 UTC format.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-01-01T00:00:00Z</p>
         */
        public Builder gmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }

        /**
         * <p>The last modification time of the budget usage record in RFC 3339 UTC format.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-01-15T12:00:00Z</p>
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * <p>The ID of the gateway instance.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-123</p>
         */
        public Builder gwClusterId(String gwClusterId) {
            this.gwClusterId = gwClusterId;
            return this;
        }

        /**
         * <p>The list of associated budget policies.</p>
         */
        public Builder policies(java.util.List<Policies> policies) {
            this.policies = policies;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2921D843-433A-5FB3-A03B-4EC093B219F8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of budget points used in the current statistical window.</p>
         * 
         * <strong>example:</strong>
         * <p>5000</p>
         */
        public Builder usedPoints(String usedPoints) {
            this.usedPoints = usedPoints;
            return this;
        }

        /**
         * <p>The end time of the budget statistical window in RFC 3339 UTC format.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-01-31T23:59:59Z</p>
         */
        public Builder windowEndTime(String windowEndTime) {
            this.windowEndTime = windowEndTime;
            return this;
        }

        /**
         * <p>The start time of the budget statistical window in RFC 3339 UTC format.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-01-01T00:00:00Z</p>
         */
        public Builder windowStartTime(String windowStartTime) {
            this.windowStartTime = windowStartTime;
            return this;
        }

        public DescribeBudgetUsageResponseBody build() {
            return new DescribeBudgetUsageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeBudgetUsageResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBudgetUsageResponseBody</p>
     */
    public static class Policies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlertThresholdPct")
        private String alertThresholdPct;

        @com.aliyun.core.annotation.NameInMap("BudgetDimensionRefId")
        private String budgetDimensionRefId;

        @com.aliyun.core.annotation.NameInMap("BudgetDimensionType")
        private String budgetDimensionType;

        @com.aliyun.core.annotation.NameInMap("BudgetPoints")
        private String budgetPoints;

        @com.aliyun.core.annotation.NameInMap("BudgetPolicyId")
        private String budgetPolicyId;

        @com.aliyun.core.annotation.NameInMap("BudgetType")
        private String budgetType;

        @com.aliyun.core.annotation.NameInMap("ResetDayOfMonth")
        private String resetDayOfMonth;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Policies(Builder builder) {
            this.alertThresholdPct = builder.alertThresholdPct;
            this.budgetDimensionRefId = builder.budgetDimensionRefId;
            this.budgetDimensionType = builder.budgetDimensionType;
            this.budgetPoints = builder.budgetPoints;
            this.budgetPolicyId = builder.budgetPolicyId;
            this.budgetType = builder.budgetType;
            this.resetDayOfMonth = builder.resetDayOfMonth;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Policies create() {
            return builder().build();
        }

        /**
         * @return alertThresholdPct
         */
        public String getAlertThresholdPct() {
            return this.alertThresholdPct;
        }

        /**
         * @return budgetDimensionRefId
         */
        public String getBudgetDimensionRefId() {
            return this.budgetDimensionRefId;
        }

        /**
         * @return budgetDimensionType
         */
        public String getBudgetDimensionType() {
            return this.budgetDimensionType;
        }

        /**
         * @return budgetPoints
         */
        public String getBudgetPoints() {
            return this.budgetPoints;
        }

        /**
         * @return budgetPolicyId
         */
        public String getBudgetPolicyId() {
            return this.budgetPolicyId;
        }

        /**
         * @return budgetType
         */
        public String getBudgetType() {
            return this.budgetType;
        }

        /**
         * @return resetDayOfMonth
         */
        public String getResetDayOfMonth() {
            return this.resetDayOfMonth;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String alertThresholdPct; 
            private String budgetDimensionRefId; 
            private String budgetDimensionType; 
            private String budgetPoints; 
            private String budgetPolicyId; 
            private String budgetType; 
            private String resetDayOfMonth; 
            private String status; 

            private Builder() {
            } 

            private Builder(Policies model) {
                this.alertThresholdPct = model.alertThresholdPct;
                this.budgetDimensionRefId = model.budgetDimensionRefId;
                this.budgetDimensionType = model.budgetDimensionType;
                this.budgetPoints = model.budgetPoints;
                this.budgetPolicyId = model.budgetPolicyId;
                this.budgetType = model.budgetType;
                this.resetDayOfMonth = model.resetDayOfMonth;
                this.status = model.status;
            } 

            /**
             * <p>The usage percentage that triggers a budget alert.</p>
             * 
             * <strong>example:</strong>
             * <p>0.8</p>
             */
            public Builder alertThresholdPct(String alertThresholdPct) {
                this.alertThresholdPct = alertThresholdPct;
                return this;
            }

            /**
             * <p>The budget dimension reference ID to which the policy applies.</p>
             * 
             * <strong>example:</strong>
             * <p>ref-001</p>
             */
            public Builder budgetDimensionRefId(String budgetDimensionRefId) {
                this.budgetDimensionRefId = budgetDimensionRefId;
                return this;
            }

            /**
             * <p>The budget dimension type to which the policy applies.</p>
             * 
             * <strong>example:</strong>
             * <p>cluster</p>
             */
            public Builder budgetDimensionType(String budgetDimensionType) {
                this.budgetDimensionType = budgetDimensionType;
                return this;
            }

            /**
             * <p>The number of budget points set by the policy.</p>
             * 
             * <strong>example:</strong>
             * <p>10000</p>
             */
            public Builder budgetPoints(String budgetPoints) {
                this.budgetPoints = budgetPoints;
                return this;
            }

            /**
             * <p>The ID of the budget policy.</p>
             * 
             * <strong>example:</strong>
             * <p>bp-001</p>
             */
            public Builder budgetPolicyId(String budgetPolicyId) {
                this.budgetPolicyId = budgetPolicyId;
                return this;
            }

            /**
             * <p>The budget type.</p>
             * 
             * <strong>example:</strong>
             * <p>token</p>
             */
            public Builder budgetType(String budgetType) {
                this.budgetType = budgetType;
                return this;
            }

            /**
             * <p>The day of the month when the budget is reset. For example, 1 indicates the first day of each month.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder resetDayOfMonth(String resetDayOfMonth) {
                this.resetDayOfMonth = resetDayOfMonth;
                return this;
            }

            /**
             * <p>The status of the budget policy.</p>
             * 
             * <strong>example:</strong>
             * <p>Active</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Policies build() {
                return new Policies(this);
            } 

        } 

    }
}
