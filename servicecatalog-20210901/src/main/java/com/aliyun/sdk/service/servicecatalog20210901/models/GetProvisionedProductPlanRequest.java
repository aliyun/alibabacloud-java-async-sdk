// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicecatalog20210901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetProvisionedProductPlanRequest} extends {@link RequestModel}
 *
 * <p>GetProvisionedProductPlanRequest</p>
 */
public class GetProvisionedProductPlanRequest extends Request {
    @Body
    @NameInMap("PlanId")
    @Validation(required = true)
    private String planId;

    private GetProvisionedProductPlanRequest(Builder builder) {
        super(builder);
        this.planId = builder.planId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetProvisionedProductPlanRequest create() {
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

    public static final class Builder extends Request.Builder<GetProvisionedProductPlanRequest, Builder> {
        private String planId; 

        private Builder() {
            super();
        } 

        private Builder(GetProvisionedProductPlanRequest request) {
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
        public GetProvisionedProductPlanRequest build() {
            return new GetProvisionedProductPlanRequest(this);
        } 

    } 

}
