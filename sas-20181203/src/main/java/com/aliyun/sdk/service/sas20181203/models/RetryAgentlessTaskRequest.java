// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RetryAgentlessTaskRequest} extends {@link RequestModel}
 *
 * <p>RetryAgentlessTaskRequest</p>
 */
public class RetryAgentlessTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    private RetryAgentlessTaskRequest(Builder builder) {
        super(builder);
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RetryAgentlessTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<RetryAgentlessTaskRequest, Builder> {
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(RetryAgentlessTaskRequest request) {
            super(request);
            this.taskId = request.taskId;
        } 

        /**
         * The ID of the task. You can call the [ListAgentlessTask](~~ListAgentlessTask~~) operation to obtain the IDs of tasks.
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public RetryAgentlessTaskRequest build() {
            return new RetryAgentlessTaskRequest(this);
        } 

    } 

}
