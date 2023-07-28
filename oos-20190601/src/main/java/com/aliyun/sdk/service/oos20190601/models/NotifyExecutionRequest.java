// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link NotifyExecutionRequest} extends {@link RequestModel}
 *
 * <p>NotifyExecutionRequest</p>
 */
public class NotifyExecutionRequest extends Request {
    @Query
    @NameInMap("ExecutionId")
    @Validation(required = true)
    private String executionId;

    @Query
    @NameInMap("ExecutionStatus")
    private String executionStatus;

    @Query
    @NameInMap("LoopItem")
    private String loopItem;

    @Query
    @NameInMap("NotifyNote")
    private String notifyNote;

    @Query
    @NameInMap("NotifyType")
    @Validation(required = true)
    private String notifyType;

    @Query
    @NameInMap("Parameters")
    private String parameters;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("TaskExecutionId")
    private String taskExecutionId;

    @Query
    @NameInMap("TaskExecutionIds")
    private String taskExecutionIds;

    @Query
    @NameInMap("TaskName")
    private String taskName;

    private NotifyExecutionRequest(Builder builder) {
        super(builder);
        this.executionId = builder.executionId;
        this.executionStatus = builder.executionStatus;
        this.loopItem = builder.loopItem;
        this.notifyNote = builder.notifyNote;
        this.notifyType = builder.notifyType;
        this.parameters = builder.parameters;
        this.regionId = builder.regionId;
        this.taskExecutionId = builder.taskExecutionId;
        this.taskExecutionIds = builder.taskExecutionIds;
        this.taskName = builder.taskName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static NotifyExecutionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return executionId
     */
    public String getExecutionId() {
        return this.executionId;
    }

    /**
     * @return executionStatus
     */
    public String getExecutionStatus() {
        return this.executionStatus;
    }

    /**
     * @return loopItem
     */
    public String getLoopItem() {
        return this.loopItem;
    }

    /**
     * @return notifyNote
     */
    public String getNotifyNote() {
        return this.notifyNote;
    }

    /**
     * @return notifyType
     */
    public String getNotifyType() {
        return this.notifyType;
    }

    /**
     * @return parameters
     */
    public String getParameters() {
        return this.parameters;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return taskExecutionId
     */
    public String getTaskExecutionId() {
        return this.taskExecutionId;
    }

    /**
     * @return taskExecutionIds
     */
    public String getTaskExecutionIds() {
        return this.taskExecutionIds;
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    public static final class Builder extends Request.Builder<NotifyExecutionRequest, Builder> {
        private String executionId; 
        private String executionStatus; 
        private String loopItem; 
        private String notifyNote; 
        private String notifyType; 
        private String parameters; 
        private String regionId; 
        private String taskExecutionId; 
        private String taskExecutionIds; 
        private String taskName; 

        private Builder() {
            super();
        } 

        private Builder(NotifyExecutionRequest request) {
            super(request);
            this.executionId = request.executionId;
            this.executionStatus = request.executionStatus;
            this.loopItem = request.loopItem;
            this.notifyNote = request.notifyNote;
            this.notifyType = request.notifyType;
            this.parameters = request.parameters;
            this.regionId = request.regionId;
            this.taskExecutionId = request.taskExecutionId;
            this.taskExecutionIds = request.taskExecutionIds;
            this.taskName = request.taskName;
        } 

        /**
         * The ID of the execution.
         */
        public Builder executionId(String executionId) {
            this.putQueryParameter("ExecutionId", executionId);
            this.executionId = executionId;
            return this;
        }

        /**
         * The state of the terminated execution. This parameter is valid if you set the NotifyType parameter to CompleteExecution.
         */
        public Builder executionStatus(String executionStatus) {
            this.putQueryParameter("ExecutionStatus", executionStatus);
            this.executionStatus = executionStatus;
            return this;
        }

        /**
         * The items of the child node in the loop task.
         */
        public Builder loopItem(String loopItem) {
            this.putQueryParameter("LoopItem", loopItem);
            this.loopItem = loopItem;
            return this;
        }

        /**
         * The description for the notification.
         */
        public Builder notifyNote(String notifyNote) {
            this.putQueryParameter("NotifyNote", notifyNote);
            this.notifyNote = notifyNote;
            return this;
        }

        /**
         * The type of the notification. Valid values:
         * <p>
         * 
         * *   **ExecuteTask**: starts to run a specific task. This value is used if you perform debugging in the Debug mode. If you set this parameter to ExecuteTask, you also need to set the Parameters parameter.
         * *   **CancelTask**: cancels a current task. This value is used if you perform debugging in the Debug mode.
         * *   **CompleteExecution**: manually terminates an execution if you perform debugging in the Debug mode. You can specify the state of the terminated execution by using the **ExecutionStatus** parameter.
         * *   **Approve**: approves an execution. For example, you are aware of the risks of an operation task and agree to approve the execution.
         * *   **Reject**: rejects an execution. For example, you want to reject the execution of a high-risk operation task.
         * *   **RetryTask**: retries a failed task whose execution mode is Suspend upon Failure.
         * *   **SkipTask**: skips a failed task whose execution mode is Suspend upon Failure.
         */
        public Builder notifyType(String notifyType) {
            this.putQueryParameter("NotifyType", notifyType);
            this.notifyType = notifyType;
            return this;
        }

        /**
         * The parameters of the subsequent task. This parameter is valid if you set the NotifyType parameter to ExecuteTask.
         */
        public Builder parameters(String parameters) {
            this.putQueryParameter("Parameters", parameters);
            this.parameters = parameters;
            return this;
        }

        /**
         * The ID of the region in which the execution resides.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The execution ID of the task.
         */
        public Builder taskExecutionId(String taskExecutionId) {
            this.putQueryParameter("TaskExecutionId", taskExecutionId);
            this.taskExecutionId = taskExecutionId;
            return this;
        }

        /**
         * The execution IDs of the tasks.
         */
        public Builder taskExecutionIds(String taskExecutionIds) {
            this.putQueryParameter("TaskExecutionIds", taskExecutionIds);
            this.taskExecutionIds = taskExecutionIds;
            return this;
        }

        /**
         * The name of the subsequent task.
         */
        public Builder taskName(String taskName) {
            this.putQueryParameter("TaskName", taskName);
            this.taskName = taskName;
            return this;
        }

        @Override
        public NotifyExecutionRequest build() {
            return new NotifyExecutionRequest(this);
        } 

    } 

}
