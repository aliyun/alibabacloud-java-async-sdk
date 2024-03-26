// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fnf20190315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartSyncExecutionRequest} extends {@link RequestModel}
 *
 * <p>StartSyncExecutionRequest</p>
 */
public class StartSyncExecutionRequest extends Request {
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

    private StartSyncExecutionRequest(Builder builder) {
        super(builder);
        this.executionName = builder.executionName;
        this.flowName = builder.flowName;
        this.input = builder.input;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartSyncExecutionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<StartSyncExecutionRequest, Builder> {
        private String executionName; 
        private String flowName; 
        private String input; 

        private Builder() {
            super();
        } 

        private Builder(StartSyncExecutionRequest request) {
            super(request);
            this.executionName = request.executionName;
            this.flowName = request.flowName;
            this.input = request.input;
        } 

        /**
         * The name of the execution that you want to start. The name must meet the following conventions:
         * <p>
         * 
         * *   The name can contain letters, digits, underscores (\_), and hyphens (-).
         * *   The name must start with a letter or an underscore (\_).
         * *   The name is case-sensitive.
         * *   The name must be 1 to 128 characters in length.
         * 
         * Different from the StartExecution operation, in the synchronous execution mode, the execution name is no longer required to be unique within a flow. You can choose to provide an execution name to identify the current execution. In this case, the system adds a UUID to the current execution name. The used format is {ExecutionName}:{UUID}. If you do not specify the execution name, the system automatically generates an execution name.
         */
        public Builder executionName(String executionName) {
            this.putBodyParameter("ExecutionName", executionName);
            this.executionName = executionName;
            return this;
        }

        /**
         * The name of the flow in which you want to start the execution. The name is unique within the same region and cannot be modified after the flow is created. Set this parameter based on the following rules:
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
        public StartSyncExecutionRequest build() {
            return new StartSyncExecutionRequest(this);
        } 

    } 

}
