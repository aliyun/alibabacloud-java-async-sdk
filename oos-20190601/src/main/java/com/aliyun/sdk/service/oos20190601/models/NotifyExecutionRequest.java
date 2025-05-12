// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link NotifyExecutionRequest} extends {@link RequestModel}
 *
 * <p>NotifyExecutionRequest</p>
 */
public class NotifyExecutionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExecutionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String executionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExecutionStatus")
    private String executionStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LoopItem")
    private String loopItem;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NotifyNote")
    private String notifyNote;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NotifyType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String notifyType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Parameters")
    private String parameters;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskExecutionId")
    private String taskExecutionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskExecutionIds")
    private String taskExecutionIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskName")
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
         * <p>The ID of the execution.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>exec-xxx</p>
         */
        public Builder executionId(String executionId) {
            this.putQueryParameter("ExecutionId", executionId);
            this.executionId = executionId;
            return this;
        }

        /**
         * <p>The state of the terminated execution. This parameter is valid if you set the NotifyType parameter to CompleteExecution.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder executionStatus(String executionStatus) {
            this.putQueryParameter("ExecutionStatus", executionStatus);
            this.executionStatus = executionStatus;
            return this;
        }

        /**
         * <p>The items of the child node in the loop task.</p>
         * 
         * <strong>example:</strong>
         * <p>i-xxx</p>
         */
        public Builder loopItem(String loopItem) {
            this.putQueryParameter("LoopItem", loopItem);
            this.loopItem = loopItem;
            return this;
        }

        /**
         * <p>The description for the notification.</p>
         * 
         * <strong>example:</strong>
         * <p>Note</p>
         */
        public Builder notifyNote(String notifyNote) {
            this.putQueryParameter("NotifyNote", notifyNote);
            this.notifyNote = notifyNote;
            return this;
        }

        /**
         * <p>The type of the notification. Valid values:</p>
         * <ul>
         * <li><strong>ExecuteTask</strong>: starts to run a specific task. This value is used if you perform debugging in the Debug mode. If you set this parameter to ExecuteTask, you also need to set the Parameters parameter.</li>
         * <li><strong>CancelTask</strong>: cancels a current task. This value is used if you perform debugging in the Debug mode.</li>
         * <li><strong>CompleteExecution</strong>: manually terminates an execution if you perform debugging in the Debug mode. You can specify the state of the terminated execution by using the <strong>ExecutionStatus</strong> parameter.</li>
         * <li><strong>Approve</strong>: approves an execution. For example, you are aware of the risks of an operation task and agree to approve the execution.</li>
         * <li><strong>Reject</strong>: rejects an execution. For example, you want to reject the execution of a high-risk operation task.</li>
         * <li><strong>RetryTask</strong>: retries a failed task whose execution mode is Suspend upon Failure.</li>
         * <li><strong>SkipTask</strong>: skips a failed task whose execution mode is Suspend upon Failure.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Approve</p>
         */
        public Builder notifyType(String notifyType) {
            this.putQueryParameter("NotifyType", notifyType);
            this.notifyType = notifyType;
            return this;
        }

        /**
         * <p>The parameters of the subsequent task. This parameter is valid if you set the NotifyType parameter to ExecuteTask.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder parameters(String parameters) {
            this.putQueryParameter("Parameters", parameters);
            this.parameters = parameters;
            return this;
        }

        /**
         * <p>The ID of the region in which the execution resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The execution ID of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>task-exec-xxx</p>
         */
        public Builder taskExecutionId(String taskExecutionId) {
            this.putQueryParameter("TaskExecutionId", taskExecutionId);
            this.taskExecutionId = taskExecutionId;
            return this;
        }

        /**
         * <p>The execution IDs of the tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;exec-79c321c11003a97c&quot;,&quot;exec-79c321c11003aqw97cz&quot;]</p>
         */
        public Builder taskExecutionIds(String taskExecutionIds) {
            this.putQueryParameter("TaskExecutionIds", taskExecutionIds);
            this.taskExecutionIds = taskExecutionIds;
            return this;
        }

        /**
         * <p>The name of the subsequent task.</p>
         * 
         * <strong>example:</strong>
         * <p>describeInstance</p>
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
