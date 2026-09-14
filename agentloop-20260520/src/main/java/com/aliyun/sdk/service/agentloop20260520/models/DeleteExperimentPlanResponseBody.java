// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentloop20260520.models;

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
 * {@link DeleteExperimentPlanResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteExperimentPlanResponseBody</p>
 */
public class DeleteExperimentPlanResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("planId")
    private String planId;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    private DeleteExperimentPlanResponseBody(Builder builder) {
        this.planId = builder.planId;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteExperimentPlanResponseBody create() {
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

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String planId; 
        private String requestId; 
        private String status; 

        private Builder() {
        } 

        private Builder(DeleteExperimentPlanResponseBody model) {
            this.planId = model.planId;
            this.requestId = model.requestId;
            this.status = model.status;
        } 

        /**
         * <p>The experiment plan ID.</p>
         * 
         * <strong>example:</strong>
         * <p>exp-plan-aa1a66b074bc42aa8696c73c7dc9b718</p>
         */
        public Builder planId(String planId) {
            this.planId = planId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3FE4CD1E-FF41-56BE-B590-7A021D9C1524</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The deletion result. The value is deleted if the operation is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>deleted</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public DeleteExperimentPlanResponseBody build() {
            return new DeleteExperimentPlanResponseBody(this);
        } 

    } 

}
