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
 * {@link ModifyBudgetPolicyRequest} extends {@link RequestModel}
 *
 * <p>ModifyBudgetPolicyRequest</p>
 */
public class ModifyBudgetPolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AlertThresholdPct")
    private String alertThresholdPct;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BudgetPoints")
    private String budgetPoints;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BudgetPolicyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String budgetPolicyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GwClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String gwClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResetDayOfMonth")
    private String resetDayOfMonth;

    private ModifyBudgetPolicyRequest(Builder builder) {
        super(builder);
        this.alertThresholdPct = builder.alertThresholdPct;
        this.budgetPoints = builder.budgetPoints;
        this.budgetPolicyId = builder.budgetPolicyId;
        this.gwClusterId = builder.gwClusterId;
        this.regionId = builder.regionId;
        this.resetDayOfMonth = builder.resetDayOfMonth;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyBudgetPolicyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alertThresholdPct
     */
    public String getAlertThresholdPct() {
        return this.alertThresholdPct;
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
     * @return gwClusterId
     */
    public String getGwClusterId() {
        return this.gwClusterId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resetDayOfMonth
     */
    public String getResetDayOfMonth() {
        return this.resetDayOfMonth;
    }

    public static final class Builder extends Request.Builder<ModifyBudgetPolicyRequest, Builder> {
        private String alertThresholdPct; 
        private String budgetPoints; 
        private String budgetPolicyId; 
        private String gwClusterId; 
        private String regionId; 
        private String resetDayOfMonth; 

        private Builder() {
            super();
        } 

        private Builder(ModifyBudgetPolicyRequest request) {
            super(request);
            this.alertThresholdPct = request.alertThresholdPct;
            this.budgetPoints = request.budgetPoints;
            this.budgetPolicyId = request.budgetPolicyId;
            this.gwClusterId = request.gwClusterId;
            this.regionId = request.regionId;
            this.resetDayOfMonth = request.resetDayOfMonth;
        } 

        /**
         * <p>The budget usage percentage that triggers an alert. Valid values: 0 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        public Builder alertThresholdPct(String alertThresholdPct) {
            this.putQueryParameter("AlertThresholdPct", alertThresholdPct);
            this.alertThresholdPct = alertThresholdPct;
            return this;
        }

        /**
         * <p>The budget amount in points.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder budgetPoints(String budgetPoints) {
            this.putQueryParameter("BudgetPoints", budgetPoints);
            this.budgetPoints = budgetPoints;
            return this;
        }

        /**
         * <p>The ID of the budget policy.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>023aacc1effc4b56bb154bfbec6ba9**</p>
         */
        public Builder budgetPolicyId(String budgetPolicyId) {
            this.putQueryParameter("BudgetPolicyId", budgetPolicyId);
            this.budgetPolicyId = budgetPolicyId;
            return this;
        }

        /**
         * <p>The ID of the gateway instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pg-xxxxxxxx</p>
         */
        public Builder gwClusterId(String gwClusterId) {
            this.putQueryParameter("GwClusterId", gwClusterId);
            this.gwClusterId = gwClusterId;
            return this;
        }

        /**
         * <p>The ID of the region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The day of the month when the budget is reset. Valid values: 1 to 28.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder resetDayOfMonth(String resetDayOfMonth) {
            this.putQueryParameter("ResetDayOfMonth", resetDayOfMonth);
            this.resetDayOfMonth = resetDayOfMonth;
            return this;
        }

        @Override
        public ModifyBudgetPolicyRequest build() {
            return new ModifyBudgetPolicyRequest(this);
        } 

    } 

}
