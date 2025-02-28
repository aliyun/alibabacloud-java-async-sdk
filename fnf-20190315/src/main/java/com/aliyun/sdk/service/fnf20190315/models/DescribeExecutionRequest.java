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
 * {@link DescribeExecutionRequest} extends {@link RequestModel}
 *
 * <p>DescribeExecutionRequest</p>
 */
public class DescribeExecutionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExecutionName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String executionName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FlowName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String flowName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WaitTimeSeconds")
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
         * <p>The name of the execution.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>exec</p>
         */
        public Builder executionName(String executionName) {
            this.putQueryParameter("ExecutionName", executionName);
            this.executionName = executionName;
            return this;
        }

        /**
         * <p>The name of the workflow.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>flow</p>
         */
        public Builder flowName(String flowName) {
            this.putQueryParameter("FlowName", flowName);
            this.flowName = flowName;
            return this;
        }

        /**
         * <p>The maximum period of time for long polling waits. Valid values: 0 to 60. Unit: seconds. Configure this parameter based on the following rules:</p>
         * <ul>
         * <li>If the value is 0, the system immediately returns the current execution status.</li>
         * <li>If the value is greater than 0, the long polling request waits until the execution ends or the specified period elapses.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>20</p>
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
