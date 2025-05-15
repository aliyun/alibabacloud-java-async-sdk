// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo_cnp20230828.models;

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
 * {@link DeleteExperimentPlanRequest} extends {@link RequestModel}
 *
 * <p>DeleteExperimentPlanRequest</p>
 */
public class DeleteExperimentPlanRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PlanId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long planId;

    private DeleteExperimentPlanRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.planId = builder.planId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteExperimentPlanRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return planId
     */
    public Long getPlanId() {
        return this.planId;
    }

    public static final class Builder extends Request.Builder<DeleteExperimentPlanRequest, Builder> {
        private String regionId; 
        private Long planId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteExperimentPlanRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.planId = request.planId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Plan ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>189</p>
         */
        public Builder planId(Long planId) {
            this.putQueryParameter("PlanId", planId);
            this.planId = planId;
            return this;
        }

        @Override
        public DeleteExperimentPlanRequest build() {
            return new DeleteExperimentPlanRequest(this);
        } 

    } 

}
