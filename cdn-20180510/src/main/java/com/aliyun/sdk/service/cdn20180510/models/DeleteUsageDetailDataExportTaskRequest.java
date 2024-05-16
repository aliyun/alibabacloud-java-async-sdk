// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteUsageDetailDataExportTaskRequest} extends {@link RequestModel}
 *
 * <p>DeleteUsageDetailDataExportTaskRequest</p>
 */
public class DeleteUsageDetailDataExportTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskId;

    private DeleteUsageDetailDataExportTaskRequest(Builder builder) {
        super(builder);
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteUsageDetailDataExportTaskRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteUsageDetailDataExportTaskRequest, Builder> {
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteUsageDetailDataExportTaskRequest request) {
            super(request);
            this.taskId = request.taskId;
        } 

        /**
         * The ID of the task. You can call the [DescribeUserUsageDataExportTask](~~91062~~) operation to query tasks.
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public DeleteUsageDetailDataExportTaskRequest build() {
            return new DeleteUsageDetailDataExportTaskRequest(this);
        } 

    } 

}
