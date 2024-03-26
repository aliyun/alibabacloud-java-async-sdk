// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fnf20190315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeExecutionRequest} extends {@link RequestModel}
 *
 * <p>DescribeExecutionRequest</p>
 */
public class DescribeExecutionRequest extends Request {
    @Query
    @NameInMap("ExecutionName")
    @Validation(required = true)
    private String executionName;

    @Query
    @NameInMap("FlowName")
    @Validation(required = true)
    private String flowName;

    @Query
    @NameInMap("WaitTimeSeconds")
    private Integer waitTimeSeconds;

    private DescribeExecutionRequest(Builder builder) {
        super(builder);
        this.executionName = builder.executionName;
        this.flowName = builder.flowName;
        this.waitTimeSeconds = builder.waitTimeSeconds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeExecutionRequest create() {
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
     * @return waitTimeSeconds
     */
    public Integer getWaitTimeSeconds() {
        return this.waitTimeSeconds;
    }

    public static final class Builder extends Request.Builder<DescribeExecutionRequest, Builder> {
        private String executionName; 
        private String flowName; 
        private Integer waitTimeSeconds; 

        private Builder() {
            super();
        } 

        private Builder(DescribeExecutionRequest request) {
            super(request);
            this.executionName = request.executionName;
            this.flowName = request.flowName;
            this.waitTimeSeconds = request.waitTimeSeconds;
        } 

        /**
         * The name of the execution, which is unique within a flow. Set this parameter based on the following rules:
         * <p>
         * 
         * *   The name can contain letters, digits, underscores (\_), and hyphens (-).
         * *   The name must start with a letter or an underscore (\_).
         * *   The name is case-sensitive.
         * *   The name must be 1 to 128 characters in length.
         */
        public Builder executionName(String executionName) {
            this.putQueryParameter("ExecutionName", executionName);
            this.executionName = executionName;
            return this;
        }

        /**
         * The name of the flow. The name is unique within the region and cannot be modified after the flow is created. Set this parameter based on the following rules:
         * <p>
         * 
         * *   The name can contain letters, digits, underscores (\_), and hyphens (-).
         * *   The name must start with a letter or an underscore (\_).
         * *   The name is case-sensitive.
         * *   The name must be 1 to 128 characters in length.
         */
        public Builder flowName(String flowName) {
            this.putQueryParameter("FlowName", flowName);
            this.flowName = flowName;
            return this;
        }

        /**
         * The maximum period of time for long polling waits. Valid values: 0 to 60. Unit: seconds. Configure this parameter based on the following rules:
         * <p>
         * 
         * *   If the value is 0, the system immediately returns the current execution status.
         * *   If the value is greater than 0, the long polling request waits until the execution ends or the specified period elapses.
         */
        public Builder waitTimeSeconds(Integer waitTimeSeconds) {
            this.putQueryParameter("WaitTimeSeconds", waitTimeSeconds);
            this.waitTimeSeconds = waitTimeSeconds;
            return this;
        }

        @Override
        public DescribeExecutionRequest build() {
            return new DescribeExecutionRequest(this);
        } 

    } 

}
