// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDBInstancePlanResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDBInstancePlanResponseBody</p>
 */
public class CreateDBInstancePlanResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    private String DBInstanceId;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("PlanId")
    private String planId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private CreateDBInstancePlanResponseBody(Builder builder) {
        this.DBInstanceId = builder.DBInstanceId;
        this.errorMessage = builder.errorMessage;
        this.planId = builder.planId;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDBInstancePlanResponseBody create() {
        return builder().build();
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
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
        private String DBInstanceId; 
        private String errorMessage; 
        private String planId; 
        private String requestId; 
        private String status; 

        /**
         * The instance ID.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * The error message.
         * <p>
         * 
         * This parameter is returned only if the request fails.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * The plan ID.
         */
        public Builder planId(String planId) {
            this.planId = planId;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful.
         * <p>
         * 
         * If the request was successful, **success** is returned. If the request failed, this parameter is not returned.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public CreateDBInstancePlanResponseBody build() {
            return new CreateDBInstancePlanResponseBody(this);
        } 

    } 

}
