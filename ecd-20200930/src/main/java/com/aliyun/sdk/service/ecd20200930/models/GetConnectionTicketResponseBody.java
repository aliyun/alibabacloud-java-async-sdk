// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetConnectionTicketResponseBody} extends {@link TeaModel}
 *
 * <p>GetConnectionTicketResponseBody</p>
 */
public class GetConnectionTicketResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TaskId")
    private String taskId;

    @NameInMap("TaskStatus")
    private String taskStatus;

    @NameInMap("Ticket")
    private String ticket;

    private GetConnectionTicketResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.taskId = builder.taskId;
        this.taskStatus = builder.taskStatus;
        this.ticket = builder.ticket;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetConnectionTicketResponseBody create() {
        return builder().build();
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
        private String requestId; 
        private String taskId; 
        private String taskStatus; 
        private String ticket; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The ID of the desktop connection task.
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        /**
         * The status of the task.
         * <p>
         * 
         * Valid values:
         * 
         * *   FAILED
         * 
         *     <!-- -->
         * 
         *     :
         * 
         *     <!-- -->
         * 
         *     Failed to obtain the token
         * 
         *     <!-- -->
         * 
         *     .
         * 
         * *   RUNNING
         * 
         *     <!-- -->
         * 
         *     :
         * 
         *     <!-- -->
         * 
         *     The token is being obtained
         * 
         *     <!-- -->
         * 
         *     .
         * 
         * *   FINISHED
         * 
         *     <!-- -->
         * 
         *     :
         * 
         *     <!-- -->
         * 
         *     The token-based logon is successful
         * 
         *     <!-- -->
         * 
         *     .
         */
        public Builder taskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }

        /**
         * The credentials that are used to connect to the cloud desktop. To use the credentials, you must decode the credentials in Base64, save the credentials as a xxx.ica file, and then open the file. Sample Python code:
         * <p>
         * 
         *     import base64
         *     response = {
         *         "Ticket": "XXXX",
         *         "RequestId": "XXX-XXX",
         *     }
         *     f = open (\"xxx.ica\", \"w\")
         *     out = base64.b64decode(response[\"Ticket\"])
         *     f.write(out)
         *     f.close()
         */
        public Builder ticket(String ticket) {
            this.ticket = ticket;
            return this;
        }

        public GetConnectionTicketResponseBody build() {
            return new GetConnectionTicketResponseBody(this);
        } 

    } 

}
