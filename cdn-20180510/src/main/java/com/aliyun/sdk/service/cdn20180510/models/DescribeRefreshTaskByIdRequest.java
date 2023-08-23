// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRefreshTaskByIdRequest} extends {@link RequestModel}
 *
 * <p>DescribeRefreshTaskByIdRequest</p>
 */
public class DescribeRefreshTaskByIdRequest extends Request {
    @Query
    @NameInMap("TaskId")
    @Validation(required = true)
    private String taskId;

    private DescribeRefreshTaskByIdRequest(Builder builder) {
        super(builder);
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRefreshTaskByIdRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeRefreshTaskByIdRequest, Builder> {
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeRefreshTaskByIdRequest request) {
            super(request);
            this.taskId = request.taskId;
        } 

        /**
         * The ID of the task that you want to query.
         * <p>
         * 
         * You can call the [RefreshObjectCaches](~~91164~~) operation to query task IDs. Then, you can use the task IDs to query task status.
         * 
         * You can specify up to 10 task IDs. Separate task IDs with commas (,).
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public DescribeRefreshTaskByIdRequest build() {
            return new DescribeRefreshTaskByIdRequest(this);
        } 

    } 

}
