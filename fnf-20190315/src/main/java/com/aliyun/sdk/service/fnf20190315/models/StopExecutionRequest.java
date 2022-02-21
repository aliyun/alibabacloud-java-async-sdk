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

    @Query
    @NameInMap("RequestId")
    private String requestId;

    private StopExecutionRequest(Builder builder) {
        super(builder);
        this.cause = builder.cause;
        this.error = builder.error;
        this.executionName = builder.executionName;
        this.flowName = builder.flowName;
        this.requestId = builder.requestId;
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

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder extends Request.Builder<StopExecutionRequest, Builder> {
        private String cause; 
        private String error; 
        private String executionName; 
        private String flowName; 
        private String requestId; 

        private Builder() {
            super();
        } 

        private Builder(StopExecutionRequest response) {
            super(response);
            this.cause = response.cause;
            this.error = response.error;
            this.executionName = response.executionName;
            this.flowName = response.flowName;
            this.requestId = response.requestId;
        } 

        /**
         * Cause.
         */
        public Builder cause(String cause) {
            this.putBodyParameter("Cause", cause);
            this.cause = cause;
            return this;
        }

        /**
         * Error.
         */
        public Builder error(String error) {
            this.putBodyParameter("Error", error);
            this.error = error;
            return this;
        }

        /**
         * ExecutionName.
         */
        public Builder executionName(String executionName) {
            this.putBodyParameter("ExecutionName", executionName);
            this.executionName = executionName;
            return this;
        }

        /**
         * FlowName.
         */
        public Builder flowName(String flowName) {
            this.putBodyParameter("FlowName", flowName);
            this.flowName = flowName;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.putQueryParameter("RequestId", requestId);
            this.requestId = requestId;
            return this;
        }

        @Override
        public StopExecutionRequest build() {
            return new StopExecutionRequest(this);
        } 

    } 

}
