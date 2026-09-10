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
 * {@link CreateBudgetPolicyRequest} extends {@link RequestModel}
 *
 * <p>CreateBudgetPolicyRequest</p>
 */
public class CreateBudgetPolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AlertThresholdPct")
    private String alertThresholdPct;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BudgetDimensionRefId")
    private String budgetDimensionRefId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BudgetPoints")
    @com.aliyun.core.annotation.Validation(required = true)
    private String budgetPoints;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BudgetType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String budgetType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GwClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String gwClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResetDayOfMonth")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resetDayOfMonth;

    private CreateBudgetPolicyRequest(Builder builder) {
        super(builder);
        this.alertThresholdPct = builder.alertThresholdPct;
        this.budgetDimensionRefId = builder.budgetDimensionRefId;
        this.budgetPoints = builder.budgetPoints;
        this.budgetType = builder.budgetType;
        this.gwClusterId = builder.gwClusterId;
        this.regionId = builder.regionId;
        this.resetDayOfMonth = builder.resetDayOfMonth;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateBudgetPolicyRequest create() {
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
     * @return budgetDimensionRefId
     */
    public String getBudgetDimensionRefId() {
        return this.budgetDimensionRefId;
    }

    /**
     * @return budgetPoints
     */
    public String getBudgetPoints() {
        return this.budgetPoints;
    }

    /**
     * @return budgetType
     */
    public String getBudgetType() {
        return this.budgetType;
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

    public static final class Builder extends Request.Builder<CreateBudgetPolicyRequest, Builder> {
        private String alertThresholdPct; 
        private String budgetDimensionRefId; 
        private String budgetPoints; 
        private String budgetType; 
        private String gwClusterId; 
        private String regionId; 
        private String resetDayOfMonth; 

        private Builder() {
            super();
        } 

        private Builder(CreateBudgetPolicyRequest request) {
            super(request);
            this.alertThresholdPct = request.alertThresholdPct;
            this.budgetDimensionRefId = request.budgetDimensionRefId;
            this.budgetPoints = request.budgetPoints;
            this.budgetType = request.budgetType;
            this.gwClusterId = request.gwClusterId;
            this.regionId = request.regionId;
            this.resetDayOfMonth = request.resetDayOfMonth;
        } 

        /**
         * <p>The alert threshold, as a percentage. Valid values: 0 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder alertThresholdPct(String alertThresholdPct) {
            this.putQueryParameter("AlertThresholdPct", alertThresholdPct);
            this.alertThresholdPct = alertThresholdPct;
            return this;
        }

        /**
         * <p>The ID of the dimension object. This parameter is required if <code>BudgetType</code> is set to <code>ConsumerTotal</code> or <code>ConsumerGroupTotal</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>mi-xxxxx</p>
         */
        public Builder budgetDimensionRefId(String budgetDimensionRefId) {
            this.putQueryParameter("BudgetDimensionRefId", budgetDimensionRefId);
            this.budgetDimensionRefId = budgetDimensionRefId;
            return this;
        }

        /**
         * <p>The number of budget points.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder budgetPoints(String budgetPoints) {
            this.putQueryParameter("BudgetPoints", budgetPoints);
            this.budgetPoints = budgetPoints;
            return this;
        }

        /**
         * <p>The budget type. Valid values:</p>
         * <ul>
         * <li><p><code>GlobalTotal</code>: global total budget</p>
         * </li>
         * <li><p><code>ConsumerTotal</code>: consumer total budget</p>
         * </li>
         * <li><p><code>ConsumerGroupTotal</code>: consumer group total budget</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ConsumerTotal</p>
         */
        public Builder budgetType(String budgetType) {
            this.putQueryParameter("BudgetType", budgetType);
            this.budgetType = budgetType;
            return this;
        }

        /**
         * <p>The gateway cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pg-xxxxxxx</p>
         */
        public Builder gwClusterId(String gwClusterId) {
            this.putQueryParameter("GwClusterId", gwClusterId);
            this.gwClusterId = gwClusterId;
            return this;
        }

        /**
         * <p>The region ID.</p>
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
         * <p>The day of the month on which the budget resets. Valid values: 1 to 28.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder resetDayOfMonth(String resetDayOfMonth) {
            this.putQueryParameter("ResetDayOfMonth", resetDayOfMonth);
            this.resetDayOfMonth = resetDayOfMonth;
            return this;
        }

        @Override
        public CreateBudgetPolicyRequest build() {
            return new CreateBudgetPolicyRequest(this);
        } 

    } 

}
