// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

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
 * {@link AddTicketTaskRequest} extends {@link RequestModel}
 *
 * <p>AddTicketTaskRequest</p>
 */
public class AddTicketTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Assignee")
    @com.aliyun.core.annotation.Validation(required = true)
    private String assignee;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Comment")
    @com.aliyun.core.annotation.Validation(required = true)
    private String comment;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Position")
    private String position;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TicketId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ticketId;

    private AddTicketTaskRequest(Builder builder) {
        super(builder);
        this.assignee = builder.assignee;
        this.comment = builder.comment;
        this.instanceId = builder.instanceId;
        this.position = builder.position;
        this.taskId = builder.taskId;
        this.ticketId = builder.ticketId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddTicketTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return assignee
     */
    public String getAssignee() {
        return this.assignee;
    }

    /**
     * @return comment
     */
    public String getComment() {
        return this.comment;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return position
     */
    public String getPosition() {
        return this.position;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return ticketId
     */
    public String getTicketId() {
        return this.ticketId;
    }

    public static final class Builder extends Request.Builder<AddTicketTaskRequest, Builder> {
        private String assignee; 
        private String comment; 
        private String instanceId; 
        private String position; 
        private String taskId; 
        private String ticketId; 

        private Builder() {
            super();
        } 

        private Builder(AddTicketTaskRequest request) {
            super(request);
            this.assignee = request.assignee;
            this.comment = request.comment;
            this.instanceId = request.instanceId;
            this.position = request.position;
            this.taskId = request.taskId;
            this.ticketId = request.ticketId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>assignee@ccc-test</p>
         */
        public Builder assignee(String assignee) {
            this.putQueryParameter("Assignee", assignee);
            this.assignee = assignee;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder comment(String comment) {
            this.putQueryParameter("Comment", comment);
            this.comment = comment;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc-test</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Position.
         */
        public Builder position(String position) {
            this.putQueryParameter("Position", position);
            this.position = position;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3b8c672f-48f6-45f5-bf41-9d4cb2b4a716</p>
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3d26b90a-c5d2-4b09-8219-********</p>
         */
        public Builder ticketId(String ticketId) {
            this.putQueryParameter("TicketId", ticketId);
            this.ticketId = ticketId;
            return this;
        }

        @Override
        public AddTicketTaskRequest build() {
            return new AddTicketTaskRequest(this);
        } 

    } 

}
