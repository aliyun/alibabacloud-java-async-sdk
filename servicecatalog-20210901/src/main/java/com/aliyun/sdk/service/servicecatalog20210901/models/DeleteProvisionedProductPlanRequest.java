// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicecatalog20210901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteProvisionedProductPlanRequest} extends {@link RequestModel}
 *
 * <p>DeleteProvisionedProductPlanRequest</p>
 */
public class DeleteProvisionedProductPlanRequest extends Request {
    @Body
    @NameInMap("PlanId")
    @Validation(required = true)
    private String planId;

    private DeleteProvisionedProductPlanRequest(Builder builder) {
        super(builder);
        this.planId = builder.planId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteProvisionedProductPlanRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteProvisionedProductPlanRequest, Builder> {
        private String planId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteProvisionedProductPlanRequest request) {
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
        public DeleteProvisionedProductPlanRequest build() {
            return new DeleteProvisionedProductPlanRequest(this);
        } 

    } 

}
