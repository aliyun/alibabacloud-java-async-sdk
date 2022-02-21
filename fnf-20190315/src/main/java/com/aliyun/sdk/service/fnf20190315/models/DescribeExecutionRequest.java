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
    @NameInMap("RequestId")
    private String requestId;

    @Query
    @NameInMap("WaitTimeSeconds")
    private Integer waitTimeSeconds;

    private DescribeExecutionRequest(Builder builder) {
        super(builder);
        this.executionName = builder.executionName;
        this.flowName = builder.flowName;
        this.requestId = builder.requestId;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
        private String requestId; 
        private Integer waitTimeSeconds; 

        private Builder() {
            super();
        } 

        private Builder(DescribeExecutionRequest response) {
            super(response);
            this.executionName = response.executionName;
            this.flowName = response.flowName;
            this.requestId = response.requestId;
            this.waitTimeSeconds = response.waitTimeSeconds;
        } 

        /**
         * ExecutionName.
         */
        public Builder executionName(String executionName) {
            this.putQueryParameter("ExecutionName", executionName);
            this.executionName = executionName;
            return this;
        }

        /**
         * FlowName.
         */
        public Builder flowName(String flowName) {
            this.putQueryParameter("FlowName", flowName);
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

        /**
         * WaitTimeSeconds.
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
