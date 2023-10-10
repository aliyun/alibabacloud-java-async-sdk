// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResumeTaskRequest} extends {@link RequestModel}
 *
 * <p>ResumeTaskRequest</p>
 */
public class ResumeTaskRequest extends Request {
    @Path
    @NameInMap("task_id")
    @Validation(required = true)
    private String taskId;

    private ResumeTaskRequest(Builder builder) {
        super(builder);
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResumeTaskRequest create() {
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

    public static final class Builder extends Request.Builder<ResumeTaskRequest, Builder> {
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(ResumeTaskRequest request) {
            super(request);
            this.taskId = request.taskId;
        } 

        /**
         * The task ID.
         */
        public Builder taskId(String taskId) {
            this.putPathParameter("task_id", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public ResumeTaskRequest build() {
            return new ResumeTaskRequest(this);
        } 

    } 

}
