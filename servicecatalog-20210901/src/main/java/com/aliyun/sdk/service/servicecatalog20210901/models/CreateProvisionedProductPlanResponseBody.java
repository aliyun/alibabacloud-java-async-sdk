// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicecatalog20210901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateProvisionedProductPlanResponseBody} extends {@link TeaModel}
 *
 * <p>CreateProvisionedProductPlanResponseBody</p>
 */
public class CreateProvisionedProductPlanResponseBody extends TeaModel {
    @NameInMap("PlanId")
    private String planId;

    @NameInMap("ProvisionedProductId")
    private String provisionedProductId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateProvisionedProductPlanResponseBody(Builder builder) {
        this.planId = builder.planId;
        this.provisionedProductId = builder.provisionedProductId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateProvisionedProductPlanResponseBody create() {
        return builder().build();
    }

    /**
     * @return planId
     */
    public String getPlanId() {
        return this.planId;
    }

    /**
     * @return provisionedProductId
     */
    public String getProvisionedProductId() {
        return this.provisionedProductId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String planId; 
        private String provisionedProductId; 
        private String requestId; 

        /**
         * The plan ID.
         */
        public Builder planId(String planId) {
            this.planId = planId;
            return this;
        }

        /**
         * The product instance ID.
         */
        public Builder provisionedProductId(String provisionedProductId) {
            this.provisionedProductId = provisionedProductId;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateProvisionedProductPlanResponseBody build() {
            return new CreateProvisionedProductPlanResponseBody(this);
        } 

    } 

}
