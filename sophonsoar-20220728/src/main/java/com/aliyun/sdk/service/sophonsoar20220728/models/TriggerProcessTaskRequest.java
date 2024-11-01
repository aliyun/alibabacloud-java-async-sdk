// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link TriggerProcessTaskRequest} extends {@link RequestModel}
 *
 * <p>TriggerProcessTaskRequest</p>
 */
public class TriggerProcessTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ActionType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String actionType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TaskId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The type of the action. Valid values:</p>
         * <ul>
         * <li><strong>remove</strong>: cancels blocking or isolation.</li>
         * <li><strong>retry</strong>: submits the task again.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>remove</p>
         */
        public Builder actionType(String actionType) {
            this.putQueryParameter("ActionType", actionType);
            this.actionType = actionType;
            return this;
        }

        /**
         * <p>The ID of the handling task.</p>
         * <blockquote>
         * <p> You can call the <a href="~~DescribeProcessTasks~~">DescribeProcessTasks</a> operation to query the IDs of handling tasks.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>15355xxxxxx82894882</p>
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
