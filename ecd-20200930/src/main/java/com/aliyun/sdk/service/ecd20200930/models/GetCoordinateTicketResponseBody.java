// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCoordinateTicketResponseBody} extends {@link TeaModel}
 *
 * <p>GetCoordinateTicketResponseBody</p>
 */
public class GetCoordinateTicketResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CoId")
    private String coId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    @com.aliyun.core.annotation.NameInMap("TaskStatus")
    private String taskStatus;

    @com.aliyun.core.annotation.NameInMap("Ticket")
    private String ticket;

    private GetCoordinateTicketResponseBody(Builder builder) {
        this.coId = builder.coId;
        this.requestId = builder.requestId;
        this.taskId = builder.taskId;
        this.taskStatus = builder.taskStatus;
        this.ticket = builder.ticket;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCoordinateTicketResponseBody create() {
        return builder().build();
    }

    /**
     * @return coId
     */
    public String getCoId() {
        return this.coId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return taskStatus
     */
    public String getTaskStatus() {
        return this.taskStatus;
    }

    /**
     * @return ticket
     */
    public String getTicket() {
        return this.ticket;
    }

    public static final class Builder {
        private String coId; 
        private String requestId; 
        private String taskId; 
        private String taskStatus; 
        private String ticket; 

        /**
         * The ID of the stream collaboration.
         */
        public Builder coId(String coId) {
            this.coId = coId;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The ID of the cloud computer connection task.
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        /**
         * The task status.
         * <p>
         * 
         * Possible values:
         * 
         * *   Finished
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   Failed
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   Running
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         */
        public Builder taskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }

        /**
         * The credentials of the stream collaboration.
         */
        public Builder ticket(String ticket) {
            this.ticket = ticket;
            return this;
        }

        public GetCoordinateTicketResponseBody build() {
            return new GetCoordinateTicketResponseBody(this);
        } 

    } 

}
