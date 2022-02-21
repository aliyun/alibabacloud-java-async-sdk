// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RunExecutionPlanResponseBody} extends {@link TeaModel}
 *
 * <p>RunExecutionPlanResponseBody</p>
 */
public class RunExecutionPlanResponseBody extends TeaModel {
    @NameInMap("ExecutionPlanInstanceId")
    private String executionPlanInstanceId;

    @NameInMap("RequestId")
    private String requestId;

    private RunExecutionPlanResponseBody(Builder builder) {
        this.executionPlanInstanceId = builder.executionPlanInstanceId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunExecutionPlanResponseBody create() {
        return builder().build();
    }

    /**
     * @return executionPlanInstanceId
     */
    public String getExecutionPlanInstanceId() {
        return this.executionPlanInstanceId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String executionPlanInstanceId; 
        private String requestId; 

        /**
         * ExecutionPlanInstanceId.
         */
        public Builder executionPlanInstanceId(String executionPlanInstanceId) {
            this.executionPlanInstanceId = executionPlanInstanceId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public RunExecutionPlanResponseBody build() {
            return new RunExecutionPlanResponseBody(this);
        } 

    } 

}
