// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicecatalog20210901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExecuteProvisionedProductPlanRequest} extends {@link RequestModel}
 *
 * <p>ExecuteProvisionedProductPlanRequest</p>
 */
public class ExecuteProvisionedProductPlanRequest extends Request {
    @Body
    @NameInMap("PlanId")
    @Validation(required = true)
    private String planId;

    private ExecuteProvisionedProductPlanRequest(Builder builder) {
        super(builder);
        this.planId = builder.planId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecuteProvisionedProductPlanRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return planId
     */
    public String getPlanId() {
        return this.planId;
    }

    public static final class Builder extends Request.Builder<ExecuteProvisionedProductPlanRequest, Builder> {
        private String planId; 

        private Builder() {
            super();
        } 

        private Builder(ExecuteProvisionedProductPlanRequest request) {
            super(request);
            this.planId = request.planId;
        } 

        /**
         * The ID of the plan.
         */
        public Builder planId(String planId) {
            this.putBodyParameter("PlanId", planId);
            this.planId = planId;
            return this;
        }

        @Override
        public ExecuteProvisionedProductPlanRequest build() {
            return new ExecuteProvisionedProductPlanRequest(this);
        } 

    } 

}
