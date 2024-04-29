// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelOnceTaskRequest} extends {@link RequestModel}
 *
 * <p>CancelOnceTaskRequest</p>
 */
public class CancelOnceTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskId;

    private CancelOnceTaskRequest(Builder builder) {
        super(builder);
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelOnceTaskRequest create() {
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

    public static final class Builder extends Request.Builder<CancelOnceTaskRequest, Builder> {
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(CancelOnceTaskRequest request) {
            super(request);
            this.taskId = request.taskId;
        } 

        /**
         * The ID of the task.
         * <p>
         * 
         * >  You can call the [GenerateOnceTask](~~GenerateOnceTask~~) operation to query the IDs of tasks.
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public CancelOnceTaskRequest build() {
            return new CancelOnceTaskRequest(this);
        } 

    } 

}
