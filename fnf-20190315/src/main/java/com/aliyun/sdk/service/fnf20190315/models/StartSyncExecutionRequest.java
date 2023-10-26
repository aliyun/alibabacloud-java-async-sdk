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

    @Query
    @NameInMap("RequestId")
    private String requestId;

    private StartSyncExecutionRequest(Builder builder) {
        super(builder);
        this.executionName = builder.executionName;
        this.flowName = builder.flowName;
        this.input = builder.input;
        this.requestId = builder.requestId;
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

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder extends Request.Builder<StartSyncExecutionRequest, Builder> {
        private String executionName; 
        private String flowName; 
        private String input; 
        private String requestId; 

        private Builder() {
            super();
        } 

        private Builder(StartSyncExecutionRequest request) {
            super(request);
            this.executionName = request.executionName;
            this.flowName = request.flowName;
            this.input = request.input;
            this.requestId = request.requestId;
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
         * Input.
         */
        public Builder input(String input) {
            this.putBodyParameter("Input", input);
            this.input = input;
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
        public StartSyncExecutionRequest build() {
            return new StartSyncExecutionRequest(this);
        } 

    } 

}
