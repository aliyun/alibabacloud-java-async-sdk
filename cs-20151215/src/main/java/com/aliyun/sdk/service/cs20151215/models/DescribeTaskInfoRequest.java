// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTaskInfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeTaskInfoRequest</p>
 */
public class DescribeTaskInfoRequest extends Request {
    @Path
    @NameInMap("task_id")
    @Validation(required = true)
    private String taskId;

    private DescribeTaskInfoRequest(Builder builder) {
        super(builder);
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTaskInfoRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeTaskInfoRequest, Builder> {
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeTaskInfoRequest request) {
            super(request);
            this.taskId = request.taskId;
        } 

        /**
         * The ID of the task.
         */
        public Builder taskId(String taskId) {
            this.putPathParameter("task_id", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public DescribeTaskInfoRequest build() {
            return new DescribeTaskInfoRequest(this);
        } 

    } 

}
