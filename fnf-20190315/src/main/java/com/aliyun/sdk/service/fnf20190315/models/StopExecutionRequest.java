// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fnf20190315.models;

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
 * {@link StopExecutionRequest} extends {@link RequestModel}
 *
 * <p>StopExecutionRequest</p>
 */
public class StopExecutionRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Cause")
    private String cause;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Error")
    private String error;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExecutionName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String executionName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FlowName")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The reason for stopping the execution. The value must be 1 to 4,096 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>for test</p>
         */
        public Builder cause(String cause) {
            this.putBodyParameter("Cause", cause);
            this.cause = cause;
            return this;
        }

        /**
         * <p>The error code for stopping the execution. The error code must be 1 to 128 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>nill</p>
         */
        public Builder error(String error) {
            this.putBodyParameter("Error", error);
            this.error = error;
            return this;
        }

        /**
         * <p>The name of the execution to be stopped. You can call the <strong>ListExecutions</strong> operation to obtain the value of this parameter.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>exec</p>
         */
        public Builder executionName(String executionName) {
            this.putBodyParameter("ExecutionName", executionName);
            this.executionName = executionName;
            return this;
        }

        /**
         * <p>The name of the workflow to be stopped. You can call the <strong>ListFlows</strong> operation to obtain the value of this parameter.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>flow</p>
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
