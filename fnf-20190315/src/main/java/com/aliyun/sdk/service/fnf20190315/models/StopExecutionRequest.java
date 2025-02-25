// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fnf20190315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopExecutionRequest} extends {@link RequestModel}
 *
 * <p>StopExecutionRequest</p>
 */
public class StopExecutionRequest extends Request {
    @Body
    @NameInMap("Cause")
    private String cause;

    @Body
    @NameInMap("Error")
    private String error;

    @Body
    @NameInMap("ExecutionName")
    @Validation(required = true)
    private String executionName;

    @Body
    @NameInMap("FlowName")
    @Validation(required = true)
    private String flowName;

    private StopExecutionRequest(Builder builder) {
        super(builder);
        this.cause = builder.cause;
        this.error = builder.error;
        this.executionName = builder.executionName;
        this.flowName = builder.flowName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopExecutionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cause
     */
    public String getCause() {
        return this.cause;
    }

    /**
     * @return error
     */
    public String getError() {
        return this.error;
    }

    /**
     * @return executionName
     */
    public String getExecutionName() {
        return this.executionName;
    }

    /**
     * @return flowName
     */
    public String getFlowName() {
        return this.flowName;
    }

    public static final class Builder extends Request.Builder<StopExecutionRequest, Builder> {
        private String cause; 
        private String error; 
        private String executionName; 
        private String flowName; 

        private Builder() {
            super();
        } 

        private Builder(StopExecutionRequest request) {
            super(request);
            this.cause = request.cause;
            this.error = request.error;
            this.executionName = request.executionName;
            this.flowName = request.flowName;
        } 

        /**
         * The reason for stopping the execution. The value must be 1 to 4,096 characters in length.
         */
        public Builder cause(String cause) {
            this.putBodyParameter("Cause", cause);
            this.cause = cause;
            return this;
        }

        /**
         * The error for stopping the execution. The value must be 1 to 128 characters in length.
         */
        public Builder error(String error) {
            this.putBodyParameter("Error", error);
            this.error = error;
            return this;
        }

        /**
         * The name of the execution that you want to stop. You can call the **ListExecutions** operation to obtain the value of this parameter. The name is unique in a flow. Set this parameter based on the following rules:
         * <p>
         * 
         * *   The name can contain letters, digits, underscores (\_), and hyphens (-).
         * *   The name must start with a letter or an underscore (\_).
         * *   The name is case-sensitive.
         * *   The name must be 1 to 128 characters in length.
         */
        public Builder executionName(String executionName) {
            this.putBodyParameter("ExecutionName", executionName);
            this.executionName = executionName;
            return this;
        }

        /**
         * The name of the flow in which that you want to stop the execution. You can call the **ListFlows** operation to obtain the value of this parameter. The name is unique within the same region and cannot be modified after the flow is created. Set this parameter based on the following rules:
         * <p>
         * 
         * *   The name can contain letters, digits, underscores (\_), and hyphens (-).
         * *   The name must start with a letter or an underscore (\_).
         * *   The name is case-sensitive.
         * *   The name must be 1 to 128 characters in length.
         */
        public Builder flowName(String flowName) {
            this.putBodyParameter("FlowName", flowName);
            this.flowName = flowName;
            return this;
        }

        @Override
        public StopExecutionRequest build() {
            return new StopExecutionRequest(this);
        } 

    } 

}
