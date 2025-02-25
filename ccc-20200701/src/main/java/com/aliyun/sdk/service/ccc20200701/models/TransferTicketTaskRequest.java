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
 * {@link TransferTicketTaskRequest} extends {@link RequestModel}
 *
 * <p>TransferTicketTaskRequest</p>
 */
public class TransferTicketTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Assignee")
    @com.aliyun.core.annotation.Validation(required = true)
    private String assignee;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Comment")
    private String comment;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TicketId")
    private String ticketId;

    private TransferTicketTaskRequest(Builder builder) {
        super(builder);
        this.assignee = builder.assignee;
        this.comment = builder.comment;
        this.instanceId = builder.instanceId;
        this.taskId = builder.taskId;
        this.ticketId = builder.ticketId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TransferTicketTaskRequest create() {
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

    public static final class Builder extends Request.Builder<TransferTicketTaskRequest, Builder> {
        private String assignee; 
        private String comment; 
        private String instanceId; 
        private String taskId; 
        private String ticketId; 

        private Builder() {
            super();
        } 

        private Builder(TransferTicketTaskRequest request) {
            super(request);
            this.assignee = request.assignee;
            this.comment = request.comment;
            this.instanceId = request.instanceId;
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
         * Comment.
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
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * TicketId.
         */
        public Builder ticketId(String ticketId) {
            this.putQueryParameter("TicketId", ticketId);
            this.ticketId = ticketId;
            return this;
        }

        @Override
        public TransferTicketTaskRequest build() {
            return new TransferTicketTaskRequest(this);
        } 

    } 

}
