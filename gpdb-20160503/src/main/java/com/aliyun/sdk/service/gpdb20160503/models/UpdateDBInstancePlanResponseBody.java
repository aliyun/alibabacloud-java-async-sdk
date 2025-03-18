// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
 * {@link UpdateDBInstancePlanResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateDBInstancePlanResponseBody</p>
 */
public class UpdateDBInstancePlanResponseBody extends TeaModel {
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

    private UpdateDBInstancePlanResponseBody(Builder builder) {
        this.DBInstanceId = builder.DBInstanceId;
        this.errorMessage = builder.errorMessage;
        this.planId = builder.planId;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDBInstancePlanResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(UpdateDBInstancePlanResponseBody model) {
            this.DBInstanceId = model.DBInstanceId;
            this.errorMessage = model.errorMessage;
            this.planId = model.planId;
            this.requestId = model.requestId;
            this.status = model.status;
        } 

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>gp-bp12ga6v69h86****</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The error message returned.</p>
         * <p>This parameter is returned only when the operation fails.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The ID of the plan.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        public Builder planId(String planId) {
            this.planId = planId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>34b32a0a-08ef-4a87-b6be-cdd9f56fc3ad</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The state of the operation.</p>
         * <p>If the operation is successful, <strong>success</strong> is returned. If the operation fails, this parameter is not returned.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public UpdateDBInstancePlanResponseBody build() {
            return new UpdateDBInstancePlanResponseBody(this);
        } 

    } 

}
