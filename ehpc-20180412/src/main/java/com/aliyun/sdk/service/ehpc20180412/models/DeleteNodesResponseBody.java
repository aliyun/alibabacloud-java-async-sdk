// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteNodesResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteNodesResponseBody</p>
 */
public class DeleteNodesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TaskId")
    private String taskId;

    private DeleteNodesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteNodesResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder {
        private String requestId; 
        private String taskId; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The ID of the task.
         * <p>
         * 
         * *   If you set the Sync parameter to true, the DeleteNodes operation is synchronous. Valid value: Not Available.
         * *   If you set the Sync parameter to false, the DeleteNodes operation is asynchronous. You can call the [ListTasks](~~268225~~) operation to query the result of the task.
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        public DeleteNodesResponseBody build() {
            return new DeleteNodesResponseBody(this);
        } 

    } 

}
