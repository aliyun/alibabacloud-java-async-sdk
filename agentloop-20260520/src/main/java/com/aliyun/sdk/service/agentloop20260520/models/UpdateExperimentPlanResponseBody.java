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
 * {@link UpdateExperimentPlanResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateExperimentPlanResponseBody</p>
 */
public class UpdateExperimentPlanResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("planId")
    private String planId;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    private UpdateExperimentPlanResponseBody(Builder builder) {
        this.message = builder.message;
        this.planId = builder.planId;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateExperimentPlanResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
        private String message; 
        private String planId; 
        private String requestId; 
        private String status; 

        private Builder() {
        } 

        private Builder(UpdateExperimentPlanResponseBody model) {
            this.message = model.message;
            this.planId = model.planId;
            this.requestId = model.requestId;
            this.status = model.status;
        } 

        /**
         * <p>The prompt message.</p>
         * 
         * <strong>example:</strong>
         * <p>Experiment plan updated successfully</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The experiment plan ID.</p>
         * 
         * <strong>example:</strong>
         * <p>exp-plan-e95bff54685a4ae29ff3a834c1008a71</p>
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
         * <p>The update result. A value of updated indicates success.</p>
         * 
         * <strong>example:</strong>
         * <p>updated</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public UpdateExperimentPlanResponseBody build() {
            return new UpdateExperimentPlanResponseBody(this);
        } 

    } 

}
