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
 * {@link DescribeBudgetUsageRequest} extends {@link RequestModel}
 *
 * <p>DescribeBudgetUsageRequest</p>
 */
public class DescribeBudgetUsageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BudgetDimensionRefId")
    private String budgetDimensionRefId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BudgetDimensionType")
    private String budgetDimensionType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GwClusterId")
    private String gwClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private DescribeBudgetUsageRequest(Builder builder) {
        super(builder);
        this.budgetDimensionRefId = builder.budgetDimensionRefId;
        this.budgetDimensionType = builder.budgetDimensionType;
        this.gwClusterId = builder.gwClusterId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBudgetUsageRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<DescribeBudgetUsageRequest, Builder> {
        private String budgetDimensionRefId; 
        private String budgetDimensionType; 
        private String gwClusterId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeBudgetUsageRequest request) {
            super(request);
            this.budgetDimensionRefId = request.budgetDimensionRefId;
            this.budgetDimensionType = request.budgetDimensionType;
            this.gwClusterId = request.gwClusterId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The budget dimension reference ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ref-001</p>
         */
        public Builder budgetDimensionRefId(String budgetDimensionRefId) {
            this.putQueryParameter("BudgetDimensionRefId", budgetDimensionRefId);
            this.budgetDimensionRefId = budgetDimensionRefId;
            return this;
        }

        /**
         * <p>The budget dimension type.</p>
         * 
         * <strong>example:</strong>
         * <p>cluster</p>
         */
        public Builder budgetDimensionType(String budgetDimensionType) {
            this.putQueryParameter("BudgetDimensionType", budgetDimensionType);
            this.budgetDimensionType = budgetDimensionType;
            return this;
        }

        /**
         * <p>The ID of the gateway instance to query.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-123</p>
         */
        public Builder gwClusterId(String gwClusterId) {
            this.putQueryParameter("GwClusterId", gwClusterId);
            this.gwClusterId = gwClusterId;
            return this;
        }

        /**
         * <p>The region ID of the gateway instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DescribeBudgetUsageRequest build() {
            return new DescribeBudgetUsageRequest(this);
        } 

    } 

}
