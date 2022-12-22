// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.composer20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InvokeFlowResponseBody} extends {@link TeaModel}
 *
 * <p>InvokeFlowResponseBody</p>
 */
public class InvokeFlowResponseBody extends TeaModel {
    @NameInMap("InvocationId")
    private String invocationId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private InvokeFlowResponseBody(Builder builder) {
        this.invocationId = builder.invocationId;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InvokeFlowResponseBody create() {
        return builder().build();
    }

    /**
     * @return invocationId
     */
    public String getInvocationId() {
        return this.invocationId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String invocationId; 
        private String requestId; 
        private Boolean success; 

        /**
         * The unique identifier of the execution.
         */
        public Builder invocationId(String invocationId) {
            this.invocationId = invocationId;
            return this;
        }

        /**
         * The ID for this request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the workflow execution was triggered.
         * <p>
         * 
         * *   **true**: The workflow execution was triggered
         * *   **false**: The workflow execution failed to be triggered.
         * 
         * > : You can call the **GetInvocationLog** operation to check whether the workflow execution is successful.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public InvokeFlowResponseBody build() {
            return new InvokeFlowResponseBody(this);
        } 

    } 

}
