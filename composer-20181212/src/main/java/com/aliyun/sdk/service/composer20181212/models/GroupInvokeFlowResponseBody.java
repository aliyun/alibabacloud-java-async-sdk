// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.composer20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GroupInvokeFlowResponseBody} extends {@link TeaModel}
 *
 * <p>GroupInvokeFlowResponseBody</p>
 */
public class GroupInvokeFlowResponseBody extends TeaModel {
    @NameInMap("CurrentCount")
    private Integer currentCount;

    @NameInMap("GroupInvocationId")
    private String groupInvocationId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Status")
    private String status;

    @NameInMap("Success")
    private Boolean success;

    private GroupInvokeFlowResponseBody(Builder builder) {
        this.currentCount = builder.currentCount;
        this.groupInvocationId = builder.groupInvocationId;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GroupInvokeFlowResponseBody create() {
        return builder().build();
    }

    /**
     * @return currentCount
     */
    public Integer getCurrentCount() {
        return this.currentCount;
    }

    /**
     * @return groupInvocationId
     */
    public String getGroupInvocationId() {
        return this.groupInvocationId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer currentCount; 
        private String groupInvocationId; 
        private String requestId; 
        private String status; 
        private Boolean success; 

        /**
         * The number of times of execution that are pending.
         */
        public Builder currentCount(Integer currentCount) {
            this.currentCount = currentCount;
            return this;
        }

        /**
         * The unique identifier of the execution.
         */
        public Builder groupInvocationId(String groupInvocationId) {
            this.groupInvocationId = groupInvocationId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The status of the group. Valid values:
         * <p>
         * 
         * *   New: The group is created and waiting to be executed.
         * *   Started: The group is being executed.
         * *   Canceled: The group was canceled.
         * *   Failed: The execution failed.
         * *   Completed: All the times of execution in the group are complete.
         * *   Unknown: The group status is uncertain. In this case, a system error may occur.
         * *   TimedOut: The execution timed out.
         * *   Paused: The execution was suspended.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * Indicates whether the operation was successful.
         * <p>
         * 
         * *   **true**: The workflow execution is triggered.
         * *   **false**: The workflow execution failed to be triggered.
         * 
         * > : You can call the **GetInvocationLog** operation to check whether the workflow execution is successful.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GroupInvokeFlowResponseBody build() {
            return new GroupInvokeFlowResponseBody(this);
        } 

    } 

}
