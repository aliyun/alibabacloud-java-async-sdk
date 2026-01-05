// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicecatalog20210901.models;

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
 * {@link ExecuteProvisionedProductPlanRequest} extends {@link RequestModel}
 *
 * <p>ExecuteProvisionedProductPlanRequest</p>
 */
public class ExecuteProvisionedProductPlanRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PlanId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The ID of the plan.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>plan-bp1jvmdk2k****</p>
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
