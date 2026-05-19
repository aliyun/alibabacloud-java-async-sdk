// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20230930.models;

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
 * {@link QueryCostByCostCenterRequest} extends {@link RequestModel}
 *
 * <p>QueryCostByCostCenterRequest</p>
 */
public class QueryCostByCostCenterRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BillingMonth")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer billingMonth;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DisplayZeroAmountBills")
    private Boolean displayZeroAmountBills;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupByCostCenterLevel")
    private Boolean groupByCostCenterLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Metrics")
    @com.aliyun.core.annotation.Validation(required = true)
    private String metrics;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccountId")
    private Long ownerAccountId;

    private QueryCostByCostCenterRequest(Builder builder) {
        super(builder);
        this.billingMonth = builder.billingMonth;
        this.displayZeroAmountBills = builder.displayZeroAmountBills;
        this.groupByCostCenterLevel = builder.groupByCostCenterLevel;
        this.metrics = builder.metrics;
        this.ownerAccountId = builder.ownerAccountId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryCostByCostCenterRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return billingMonth
     */
    public Integer getBillingMonth() {
        return this.billingMonth;
    }

    /**
     * @return displayZeroAmountBills
     */
    public Boolean getDisplayZeroAmountBills() {
        return this.displayZeroAmountBills;
    }

    /**
     * @return groupByCostCenterLevel
     */
    public Boolean getGroupByCostCenterLevel() {
        return this.groupByCostCenterLevel;
    }

    /**
     * @return metrics
     */
    public String getMetrics() {
        return this.metrics;
    }

    /**
     * @return ownerAccountId
     */
    public Long getOwnerAccountId() {
        return this.ownerAccountId;
    }

    public static final class Builder extends Request.Builder<QueryCostByCostCenterRequest, Builder> {
        private Integer billingMonth; 
        private Boolean displayZeroAmountBills; 
        private Boolean groupByCostCenterLevel; 
        private String metrics; 
        private Long ownerAccountId; 

        private Builder() {
            super();
        } 

        private Builder(QueryCostByCostCenterRequest request) {
            super(request);
            this.billingMonth = request.billingMonth;
            this.displayZeroAmountBills = request.displayZeroAmountBills;
            this.groupByCostCenterLevel = request.groupByCostCenterLevel;
            this.metrics = request.metrics;
            this.ownerAccountId = request.ownerAccountId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>202506</p>
         */
        public Builder billingMonth(Integer billingMonth) {
            this.putQueryParameter("BillingMonth", billingMonth);
            this.billingMonth = billingMonth;
            return this;
        }

        /**
         * DisplayZeroAmountBills.
         */
        public Builder displayZeroAmountBills(Boolean displayZeroAmountBills) {
            this.putQueryParameter("DisplayZeroAmountBills", displayZeroAmountBills);
            this.displayZeroAmountBills = displayZeroAmountBills;
            return this;
        }

        /**
         * GroupByCostCenterLevel.
         */
        public Builder groupByCostCenterLevel(Boolean groupByCostCenterLevel) {
            this.putQueryParameter("GroupByCostCenterLevel", groupByCostCenterLevel);
            this.groupByCostCenterLevel = groupByCostCenterLevel;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>REQUIRE_AMOUNT</p>
         */
        public Builder metrics(String metrics) {
            this.putQueryParameter("Metrics", metrics);
            this.metrics = metrics;
            return this;
        }

        /**
         * OwnerAccountId.
         */
        public Builder ownerAccountId(Long ownerAccountId) {
            this.putQueryParameter("OwnerAccountId", ownerAccountId);
            this.ownerAccountId = ownerAccountId;
            return this;
        }

        @Override
        public QueryCostByCostCenterRequest build() {
            return new QueryCostByCostCenterRequest(this);
        } 

    } 

}
