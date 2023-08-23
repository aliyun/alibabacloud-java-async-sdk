// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteUserUsageDataExportTaskRequest} extends {@link RequestModel}
 *
 * <p>DeleteUserUsageDataExportTaskRequest</p>
 */
public class DeleteUserUsageDataExportTaskRequest extends Request {
    @Query
    @NameInMap("TaskId")
    @Validation(required = true)
    private String taskId;

    private DeleteUserUsageDataExportTaskRequest(Builder builder) {
        super(builder);
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteUserUsageDataExportTaskRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteUserUsageDataExportTaskRequest, Builder> {
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteUserUsageDataExportTaskRequest request) {
            super(request);
            this.taskId = request.taskId;
        } 

        /**
         * The ID of the task to delete.
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public DeleteUserUsageDataExportTaskRequest build() {
            return new DeleteUserUsageDataExportTaskRequest(this);
        } 

    } 

}
