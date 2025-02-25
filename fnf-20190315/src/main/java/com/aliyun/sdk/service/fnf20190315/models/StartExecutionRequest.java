// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fnf20190315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartExecutionRequest} extends {@link RequestModel}
 *
 * <p>StartExecutionRequest</p>
 */
public class StartExecutionRequest extends Request {
    @Body
    @NameInMap("CallbackFnFTaskToken")
    private String callbackFnFTaskToken;

    @Body
    @NameInMap("ExecutionName")
    private String executionName;

    @Body
    @NameInMap("FlowName")
    @Validation(required = true)
    private String flowName;

    @Body
    @NameInMap("Input")
    private String input;

    private StartExecutionRequest(Builder builder) {
        super(builder);
        this.callbackFnFTaskToken = builder.callbackFnFTaskToken;
        this.executionName = builder.executionName;
        this.flowName = builder.flowName;
        this.input = builder.input;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartExecutionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return callbackFnFTaskToken
     */
    public String getCallbackFnFTaskToken() {
        return this.callbackFnFTaskToken;
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

    /**
     * @return input
     */
    public String getInput() {
        return this.input;
    }

    public static final class Builder extends Request.Builder<StartExecutionRequest, Builder> {
        private String callbackFnFTaskToken; 
        private String executionName; 
        private String flowName; 
        private String input; 

        private Builder() {
            super();
        } 

        private Builder(StartExecutionRequest request) {
            super(request);
            this.callbackFnFTaskToken = request.callbackFnFTaskToken;
            this.executionName = request.executionName;
            this.flowName = request.flowName;
            this.input = request.input;
        } 

        /**
         * Specifies that the **TaskToken**-related tasks are called back after the execution in the flow ends.
         */
        public Builder callbackFnFTaskToken(String callbackFnFTaskToken) {
            this.putBodyParameter("CallbackFnFTaskToken", callbackFnFTaskToken);
            this.callbackFnFTaskToken = callbackFnFTaskToken;
            return this;
        }

        /**
         * The name of the execution. The execution name is unique within a workflow. Configure this parameter based on the following rules:
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
         * The name of the workflow to be executed. The name is unique within a region and cannot be modified after the workflow is created. Configure this parameter based on the following rules:
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

        /**
         * The input of the execution, which is in the JSON format.
         */
        public Builder input(String input) {
            this.putBodyParameter("Input", input);
            this.input = input;
            return this;
        }

        @Override
        public StartExecutionRequest build() {
            return new StartExecutionRequest(this);
        } 

    } 

}
