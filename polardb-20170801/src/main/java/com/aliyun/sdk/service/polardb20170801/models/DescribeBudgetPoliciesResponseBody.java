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
 * {@link DescribeBudgetPoliciesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBudgetPoliciesResponseBody</p>
 */
public class DescribeBudgetPoliciesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageRecordCount")
    private Integer pageRecordCount;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalRecordCount")
    private Integer totalRecordCount;

    private DescribeBudgetPoliciesResponseBody(Builder builder) {
        this.items = builder.items;
        this.pageNumber = builder.pageNumber;
        this.pageRecordCount = builder.pageRecordCount;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBudgetPoliciesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageRecordCount
     */
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalRecordCount
     */
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static final class Builder {
        private java.util.List<Items> items; 
        private Integer pageNumber; 
        private Integer pageRecordCount; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalRecordCount; 

        private Builder() {
        } 

        private Builder(DescribeBudgetPoliciesResponseBody model) {
            this.items = model.items;
            this.pageNumber = model.pageNumber;
            this.pageRecordCount = model.pageRecordCount;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalRecordCount = model.totalRecordCount;
        } 

        /**
         * Items.
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageRecordCount.
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>24A1990B-4F6E-482B-B8CB-75C612******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalRecordCount.
         */
        public Builder totalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeBudgetPoliciesResponseBody build() {
            return new DescribeBudgetPoliciesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeBudgetPoliciesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBudgetPoliciesResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlertThresholdPct")
        private String alertThresholdPct;

        @com.aliyun.core.annotation.NameInMap("AlertTriggered")
        private Boolean alertTriggered;

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

        @com.aliyun.core.annotation.NameInMap("Exceeded")
        private String exceeded;

        @com.aliyun.core.annotation.NameInMap("GmtCreated")
        private String gmtCreated;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("GwClusterId")
        private String gwClusterId;

        @com.aliyun.core.annotation.NameInMap("ResetDayOfMonth")
        private String resetDayOfMonth;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UsedPoints")
        private Integer usedPoints;

        private Items(Builder builder) {
            this.alertThresholdPct = builder.alertThresholdPct;
            this.alertTriggered = builder.alertTriggered;
            this.budgetDimensionRefId = builder.budgetDimensionRefId;
            this.budgetDimensionType = builder.budgetDimensionType;
            this.budgetPoints = builder.budgetPoints;
            this.budgetPolicyId = builder.budgetPolicyId;
            this.budgetType = builder.budgetType;
            this.exceeded = builder.exceeded;
            this.gmtCreated = builder.gmtCreated;
            this.gmtModified = builder.gmtModified;
            this.gwClusterId = builder.gwClusterId;
            this.resetDayOfMonth = builder.resetDayOfMonth;
            this.status = builder.status;
            this.usedPoints = builder.usedPoints;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return alertThresholdPct
         */
        public String getAlertThresholdPct() {
            return this.alertThresholdPct;
        }

        /**
         * @return alertTriggered
         */
        public Boolean getAlertTriggered() {
            return this.alertTriggered;
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

        /**
         * @return usedPoints
         */
        public Integer getUsedPoints() {
            return this.usedPoints;
        }

        public static final class Builder {
            private String alertThresholdPct; 
            private Boolean alertTriggered; 
            private String budgetDimensionRefId; 
            private String budgetDimensionType; 
            private String budgetPoints; 
            private String budgetPolicyId; 
            private String budgetType; 
            private String exceeded; 
            private String gmtCreated; 
            private String gmtModified; 
            private String gwClusterId; 
            private String resetDayOfMonth; 
            private String status; 
            private Integer usedPoints; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.alertThresholdPct = model.alertThresholdPct;
                this.alertTriggered = model.alertTriggered;
                this.budgetDimensionRefId = model.budgetDimensionRefId;
                this.budgetDimensionType = model.budgetDimensionType;
                this.budgetPoints = model.budgetPoints;
                this.budgetPolicyId = model.budgetPolicyId;
                this.budgetType = model.budgetType;
                this.exceeded = model.exceeded;
                this.gmtCreated = model.gmtCreated;
                this.gmtModified = model.gmtModified;
                this.gwClusterId = model.gwClusterId;
                this.resetDayOfMonth = model.resetDayOfMonth;
                this.status = model.status;
                this.usedPoints = model.usedPoints;
            } 

            /**
             * AlertThresholdPct.
             */
            public Builder alertThresholdPct(String alertThresholdPct) {
                this.alertThresholdPct = alertThresholdPct;
                return this;
            }

            /**
             * AlertTriggered.
             */
            public Builder alertTriggered(Boolean alertTriggered) {
                this.alertTriggered = alertTriggered;
                return this;
            }

            /**
             * BudgetDimensionRefId.
             */
            public Builder budgetDimensionRefId(String budgetDimensionRefId) {
                this.budgetDimensionRefId = budgetDimensionRefId;
                return this;
            }

            /**
             * BudgetDimensionType.
             */
            public Builder budgetDimensionType(String budgetDimensionType) {
                this.budgetDimensionType = budgetDimensionType;
                return this;
            }

            /**
             * BudgetPoints.
             */
            public Builder budgetPoints(String budgetPoints) {
                this.budgetPoints = budgetPoints;
                return this;
            }

            /**
             * BudgetPolicyId.
             */
            public Builder budgetPolicyId(String budgetPolicyId) {
                this.budgetPolicyId = budgetPolicyId;
                return this;
            }

            /**
             * BudgetType.
             */
            public Builder budgetType(String budgetType) {
                this.budgetType = budgetType;
                return this;
            }

            /**
             * Exceeded.
             */
            public Builder exceeded(String exceeded) {
                this.exceeded = exceeded;
                return this;
            }

            /**
             * GmtCreated.
             */
            public Builder gmtCreated(String gmtCreated) {
                this.gmtCreated = gmtCreated;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * GwClusterId.
             */
            public Builder gwClusterId(String gwClusterId) {
                this.gwClusterId = gwClusterId;
                return this;
            }

            /**
             * ResetDayOfMonth.
             */
            public Builder resetDayOfMonth(String resetDayOfMonth) {
                this.resetDayOfMonth = resetDayOfMonth;
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
             * UsedPoints.
             */
            public Builder usedPoints(Integer usedPoints) {
                this.usedPoints = usedPoints;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
