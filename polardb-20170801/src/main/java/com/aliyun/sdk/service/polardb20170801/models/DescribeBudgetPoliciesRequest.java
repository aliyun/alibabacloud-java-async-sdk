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
 * {@link DescribeBudgetPoliciesRequest} extends {@link RequestModel}
 *
 * <p>DescribeBudgetPoliciesRequest</p>
 */
public class DescribeBudgetPoliciesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BudgetDimensionRefId")
    private String budgetDimensionRefId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BudgetDimensionType")
    private String budgetDimensionType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BudgetPolicyId")
    private String budgetPolicyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GwClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String gwClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private DescribeBudgetPoliciesRequest(Builder builder) {
        super(builder);
        this.budgetDimensionRefId = builder.budgetDimensionRefId;
        this.budgetDimensionType = builder.budgetDimensionType;
        this.budgetPolicyId = builder.budgetPolicyId;
        this.gwClusterId = builder.gwClusterId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBudgetPoliciesRequest create() {
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
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<DescribeBudgetPoliciesRequest, Builder> {
        private String budgetDimensionRefId; 
        private String budgetDimensionType; 
        private String budgetPolicyId; 
        private String gwClusterId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(DescribeBudgetPoliciesRequest request) {
            super(request);
            this.budgetDimensionRefId = request.budgetDimensionRefId;
            this.budgetDimensionType = request.budgetDimensionType;
            this.budgetPolicyId = request.budgetPolicyId;
            this.gwClusterId = request.gwClusterId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.status = request.status;
        } 

        /**
         * BudgetDimensionRefId.
         */
        public Builder budgetDimensionRefId(String budgetDimensionRefId) {
            this.putQueryParameter("BudgetDimensionRefId", budgetDimensionRefId);
            this.budgetDimensionRefId = budgetDimensionRefId;
            return this;
        }

        /**
         * BudgetDimensionType.
         */
        public Builder budgetDimensionType(String budgetDimensionType) {
            this.putQueryParameter("BudgetDimensionType", budgetDimensionType);
            this.budgetDimensionType = budgetDimensionType;
            return this;
        }

        /**
         * BudgetPolicyId.
         */
        public Builder budgetPolicyId(String budgetPolicyId) {
            this.putQueryParameter("BudgetPolicyId", budgetPolicyId);
            this.budgetPolicyId = budgetPolicyId;
            return this;
        }

        /**
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
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public DescribeBudgetPoliciesRequest build() {
            return new DescribeBudgetPoliciesRequest(this);
        } 

    } 

}
