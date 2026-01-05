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
 * {@link ExecuteProvisionedProductPlanResponseBody} extends {@link TeaModel}
 *
 * <p>ExecuteProvisionedProductPlanResponseBody</p>
 */
public class ExecuteProvisionedProductPlanResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PlanId")
    private String planId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String planId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ExecuteProvisionedProductPlanResponseBody model) {
            this.planId = model.planId;
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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>0FEEF92D-4052-5202-87D0-3D8EC16F81BF</p>
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
