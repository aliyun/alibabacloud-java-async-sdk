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
 * {@link UpdateProvisionedProductPlanResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateProvisionedProductPlanResponseBody</p>
 */
public class UpdateProvisionedProductPlanResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PlanId")
    private String planId;

    @com.aliyun.core.annotation.NameInMap("ProvisionedProductId")
    private String provisionedProductId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UpdateProvisionedProductPlanResponseBody(Builder builder) {
        this.planId = builder.planId;
        this.provisionedProductId = builder.provisionedProductId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateProvisionedProductPlanResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(UpdateProvisionedProductPlanResponseBody model) {
            this.planId = model.planId;
            this.provisionedProductId = model.provisionedProductId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the plan.</p>
         * 
         * <strong>example:</strong>
         * <p>plan-bp1jvmdk2k****</p>
         */
        public Builder planId(String planId) {
            this.planId = planId;
            return this;
        }

        /**
         * <p>The ID of the product instance.</p>
         * 
         * <strong>example:</strong>
         * <p>pp-bp1ddg1n2a****</p>
         */
        public Builder provisionedProductId(String provisionedProductId) {
            this.provisionedProductId = provisionedProductId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>0FEEF92D-4052-5202-87D0-3D8EC16F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateProvisionedProductPlanResponseBody build() {
            return new UpdateProvisionedProductPlanResponseBody(this);
        } 

    } 

}
