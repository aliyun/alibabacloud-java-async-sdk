// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetDBInstancePlanStatusResponseBody} extends {@link TeaModel}
 *
 * <p>SetDBInstancePlanStatusResponseBody</p>
 */
public class SetDBInstancePlanStatusResponseBody extends TeaModel {
    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("PlanId")
    private String planId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Status")
    private String status;

    private SetDBInstancePlanStatusResponseBody(Builder builder) {
        this.errorMessage = builder.errorMessage;
        this.planId = builder.planId;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetDBInstancePlanStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
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

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String errorMessage; 
        private String planId; 
        private String requestId; 
        private String status; 

        /**
         * The error message returned.
         * <p>
         * 
         * This parameter is returned only when the operation fails.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

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

        /**
         * The state of the operation.
         * <p>
         * 
         * If the operation is successful, **success** is returned. If the operation fails, this parameter is not returned.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public SetDBInstancePlanStatusResponseBody build() {
            return new SetDBInstancePlanStatusResponseBody(this);
        } 

    } 

}
