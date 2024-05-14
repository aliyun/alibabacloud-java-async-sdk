// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopCloudBenchTaskRequest} extends {@link RequestModel}
 *
 * <p>StopCloudBenchTaskRequest</p>
 */
public class StopCloudBenchTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskId;

    private StopCloudBenchTaskRequest(Builder builder) {
        super(builder);
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopCloudBenchTaskRequest create() {
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

    public static final class Builder extends Request.Builder<StopCloudBenchTaskRequest, Builder> {
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(StopCloudBenchTaskRequest request) {
            super(request);
            this.taskId = request.taskId;
        } 

        /**
         * The stress testing task ID. You can call the [DescribeCloudBenchTasks](~~230670~~) operation to query the task ID.
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public StopCloudBenchTaskRequest build() {
            return new StopCloudBenchTaskRequest(this);
        } 

    } 

}
