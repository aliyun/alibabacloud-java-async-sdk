// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetConnectionTicketResponseBody} extends {@link TeaModel}
 *
 * <p>GetConnectionTicketResponseBody</p>
 */
public class GetConnectionTicketResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    @com.aliyun.core.annotation.NameInMap("TaskStatus")
    private String taskStatus;

    @com.aliyun.core.annotation.NameInMap("Ticket")
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
         * Valid values:
         * 
         * *   FAILED: The credential fails to be obtained.
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   RUNNING: The credential is being obtained.
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   FINISHED: The credential is obtained.
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
         * The credential that is returned to connect to the cloud computer. Before you use the credential, you must Base64 decode the content of the credential, save the credential as an xxx.ica file, and then open the file. Python sample code:
         * <p>
         * 
         *     import base64
         *     response = {
         *         "Ticket": "W0VuY29kaW5nXQ0KSW5wdXRFbmNvZGluZz1V********",
         *         "RequestId": "1CBAFFAB-B697-4049-A9B1-67E1FC5F****",
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
