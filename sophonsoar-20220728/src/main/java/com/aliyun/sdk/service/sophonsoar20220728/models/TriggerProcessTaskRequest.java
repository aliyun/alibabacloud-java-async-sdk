// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TriggerProcessTaskRequest} extends {@link RequestModel}
 *
 * <p>TriggerProcessTaskRequest</p>
 */
public class TriggerProcessTaskRequest extends Request {
    @Query
    @NameInMap("ActionType")
    @Validation(required = true)
    private String actionType;

    @Body
    @NameInMap("TaskId")
    @Validation(required = true)
    private String taskId;

    private TriggerProcessTaskRequest(Builder builder) {
        super(builder);
        this.actionType = builder.actionType;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TriggerProcessTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return actionType
     */
    public String getActionType() {
        return this.actionType;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<TriggerProcessTaskRequest, Builder> {
        private String actionType; 
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(TriggerProcessTaskRequest request) {
            super(request);
            this.actionType = request.actionType;
            this.taskId = request.taskId;
        } 

        /**
         * The type of the action. Valid values:
         * <p>
         * 
         * *   **remove**: cancels blocking or isolation.
         * *   **retry**: submits the task again.
         */
        public Builder actionType(String actionType) {
            this.putQueryParameter("ActionType", actionType);
            this.actionType = actionType;
            return this;
        }

        /**
         * The ID of the handling task.
         * <p>
         * 
         * >  You can call the [DescribeProcessTasks](~~DescribeProcessTasks~~) operation to query the IDs of handling tasks.
         */
        public Builder taskId(String taskId) {
            this.putBodyParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public TriggerProcessTaskRequest build() {
            return new TriggerProcessTaskRequest(this);
        } 

    } 

}
