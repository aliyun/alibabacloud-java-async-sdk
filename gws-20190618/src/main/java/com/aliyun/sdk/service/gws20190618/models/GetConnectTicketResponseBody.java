// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gws20190618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetConnectTicketResponseBody} extends {@link TeaModel}
 *
 * <p>GetConnectTicketResponseBody</p>
 */
public class GetConnectTicketResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TaskFinished")
    private Boolean taskFinished;

    @NameInMap("TaskId")
    private String taskId;

    @NameInMap("Ticket")
    private String ticket;

    private GetConnectTicketResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.taskFinished = builder.taskFinished;
        this.taskId = builder.taskId;
        this.ticket = builder.ticket;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetConnectTicketResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return taskFinished
     */
    public Boolean getTaskFinished() {
        return this.taskFinished;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return ticket
     */
    public String getTicket() {
        return this.ticket;
    }

    public static final class Builder {
        private String requestId; 
        private Boolean taskFinished; 
        private String taskId; 
        private String ticket; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TaskFinished.
         */
        public Builder taskFinished(Boolean taskFinished) {
            this.taskFinished = taskFinished;
            return this;
        }

        /**
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        /**
         * Ticket.
         */
        public Builder ticket(String ticket) {
            this.ticket = ticket;
            return this;
        }

        public GetConnectTicketResponseBody build() {
            return new GetConnectTicketResponseBody(this);
        } 

    } 

}
