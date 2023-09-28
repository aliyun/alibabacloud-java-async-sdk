// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicecatalog20210901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExecuteProvisionedProductPlanResponseBody} extends {@link TeaModel}
 *
 * <p>ExecuteProvisionedProductPlanResponseBody</p>
 */
public class ExecuteProvisionedProductPlanResponseBody extends TeaModel {
    @NameInMap("PlanId")
    private String planId;

    @NameInMap("RequestId")
    private String requestId;

    private ExecuteProvisionedProductPlanResponseBody(Builder builder) {
        this.planId = builder.planId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecuteProvisionedProductPlanResponseBody create() {
        return builder().build();
    }

    /**
     * @return planId
     */
    public String getPlanId() {
        return this.planId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String planId; 
        private String requestId; 

        /**
         * The ID of the plan.
         */
        public Builder planId(String planId) {
            this.planId = planId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ExecuteProvisionedProductPlanResponseBody build() {
            return new ExecuteProvisionedProductPlanResponseBody(this);
        } 

    } 

}
