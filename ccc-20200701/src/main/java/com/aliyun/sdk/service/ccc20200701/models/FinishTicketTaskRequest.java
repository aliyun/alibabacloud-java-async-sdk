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
 * {@link FinishTicketTaskRequest} extends {@link RequestModel}
 *
 * <p>FinishTicketTaskRequest</p>
 */
public class FinishTicketTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Comment")
    @com.aliyun.core.annotation.Validation(required = true)
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

    private FinishTicketTaskRequest(Builder builder) {
        super(builder);
        this.comment = builder.comment;
        this.instanceId = builder.instanceId;
        this.taskId = builder.taskId;
        this.ticketId = builder.ticketId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FinishTicketTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<FinishTicketTaskRequest, Builder> {
        private String comment; 
        private String instanceId; 
        private String taskId; 
        private String ticketId; 

        private Builder() {
            super();
        } 

        private Builder(FinishTicketTaskRequest request) {
            super(request);
            this.comment = request.comment;
            this.instanceId = request.instanceId;
            this.taskId = request.taskId;
            this.ticketId = request.ticketId;
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
        public FinishTicketTaskRequest build() {
            return new FinishTicketTaskRequest(this);
        } 

    } 

}
