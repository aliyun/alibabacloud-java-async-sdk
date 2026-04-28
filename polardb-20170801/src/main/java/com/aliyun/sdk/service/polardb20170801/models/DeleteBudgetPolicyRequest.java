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
 * {@link DeleteBudgetPolicyRequest} extends {@link RequestModel}
 *
 * <p>DeleteBudgetPolicyRequest</p>
 */
public class DeleteBudgetPolicyRequest extends Request {
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

    private DeleteBudgetPolicyRequest(Builder builder) {
        super(builder);
        this.budgetPolicyId = builder.budgetPolicyId;
        this.gwClusterId = builder.gwClusterId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteBudgetPolicyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<DeleteBudgetPolicyRequest, Builder> {
        private String budgetPolicyId; 
        private String gwClusterId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteBudgetPolicyRequest request) {
            super(request);
            this.budgetPolicyId = request.budgetPolicyId;
            this.gwClusterId = request.gwClusterId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>023aacc1effc4b56bb154bfbec6baxxx</p>
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DeleteBudgetPolicyRequest build() {
            return new DeleteBudgetPolicyRequest(this);
        } 

    } 

}
