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
 * {@link DeleteCostRuleRequest} extends {@link RequestModel}
 *
 * <p>DeleteCostRuleRequest</p>
 */
public class DeleteCostRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CostRuleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String costRuleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GwClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String gwClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private DeleteCostRuleRequest(Builder builder) {
        super(builder);
        this.costRuleId = builder.costRuleId;
        this.gwClusterId = builder.gwClusterId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteCostRuleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return costRuleId
     */
    public String getCostRuleId() {
        return this.costRuleId;
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

    public static final class Builder extends Request.Builder<DeleteCostRuleRequest, Builder> {
        private String costRuleId; 
        private String gwClusterId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteCostRuleRequest request) {
            super(request);
            this.costRuleId = request.costRuleId;
            this.gwClusterId = request.gwClusterId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>924d450014e64e88ac6e8486f8e990**</p>
         */
        public Builder costRuleId(String costRuleId) {
            this.putQueryParameter("CostRuleId", costRuleId);
            this.costRuleId = costRuleId;
            return this;
        }

        /**
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DeleteCostRuleRequest build() {
            return new DeleteCostRuleRequest(this);
        } 

    } 

}
