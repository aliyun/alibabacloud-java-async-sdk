// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link GetConnectionTicketResponseBody} extends {@link TeaModel}
 *
 * <p>GetConnectionTicketResponseBody</p>
 */
public class GetConnectionTicketResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DesktopId")
    private String desktopId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TaskCode")
    private String taskCode;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    @com.aliyun.core.annotation.NameInMap("TaskMessage")
    private String taskMessage;

    @com.aliyun.core.annotation.NameInMap("TaskStatus")
    private String taskStatus;

    @com.aliyun.core.annotation.NameInMap("Ticket")
    private String ticket;

    private GetConnectionTicketResponseBody(Builder builder) {
        this.desktopId = builder.desktopId;
        this.requestId = builder.requestId;
        this.taskCode = builder.taskCode;
        this.taskId = builder.taskId;
        this.taskMessage = builder.taskMessage;
        this.taskStatus = builder.taskStatus;
        this.ticket = builder.ticket;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetConnectionTicketResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return desktopId
     */
    public String getDesktopId() {
        return this.desktopId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return taskCode
     */
    public String getTaskCode() {
        return this.taskCode;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return taskMessage
     */
    public String getTaskMessage() {
        return this.taskMessage;
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
        private String desktopId; 
        private String requestId; 
        private String taskCode; 
        private String taskId; 
        private String taskMessage; 
        private String taskStatus; 
        private String ticket; 

        private Builder() {
        } 

        private Builder(GetConnectionTicketResponseBody model) {
            this.desktopId = model.desktopId;
            this.requestId = model.requestId;
            this.taskCode = model.taskCode;
            this.taskId = model.taskId;
            this.taskMessage = model.taskMessage;
            this.taskStatus = model.taskStatus;
            this.ticket = model.ticket;
        } 

        /**
         * <p>The ID of the cloud computer.</p>
         * 
         * <strong>example:</strong>
         * <p>ecd-gx2x1dhsmucyy****</p>
         */
        public Builder desktopId(String desktopId) {
            this.desktopId = desktopId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The credential that is returned to connect to the cloud computer. Before you use the credential, you must Base64 decode the content of the credential, save the credential as an xxx.ica file, and then open the file. Python sample code:</p>
         * <pre><code>import base64
         * response = {
         *     &quot;Ticket&quot;: &quot;W0VuY29kaW5nXQ0KSW5wdXRFbmNvZGluZz1V********&quot;,
         *     &quot;RequestId&quot;: &quot;1CBAFFAB-B697-4049-A9B1-67E1FC5F****&quot;,
         * }
         * f = open (\&quot;xxx.ica\&quot;, \&quot;w\&quot;)
         * out = base64.b64decode(response[\&quot;Ticket\&quot;])
         * f.write(out)
         * f.close()
         * </code></pre>
         * 
         * <strong>example:</strong>
         * <p>W0VuY29kaW5nXQ0KSW5wdXRFbmNvZGluZz1V********</p>
         */
        public Builder taskCode(String taskCode) {
            this.taskCode = taskCode;
            return this;
        }

        /**
         * <p>The ID of the cloud computer connection task.</p>
         * 
         * <strong>example:</strong>
         * <p>2afbad19-778a-4fc5-9674-1f19c638****</p>
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        /**
         * <p>The ID of the cloud computer connection task.</p>
         * 
         * <strong>example:</strong>
         * <p>2afbad19-778a-4fc5-9674-1f19c638****</p>
         */
        public Builder taskMessage(String taskMessage) {
            this.taskMessage = taskMessage;
            return this;
        }

        /**
         * <p>The task status.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>FAILED: The credential fails to be obtained.</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>RUNNING: The credential is being obtained.</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>FINISHED: The credential is obtained.</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- --></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FINISHED</p>
         */
        public Builder taskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }

        /**
         * <p>The credential of the cloud computer connection.</p>
         * 
         * <strong>example:</strong>
         * <p>W0VuY29kaW5nXQ0KSW5wdXRFbmNvZGluZz1V********</p>
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
