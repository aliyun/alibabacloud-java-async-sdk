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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetCoordinateTicketResponseBody model) {
            this.coId = model.coId;
            this.requestId = model.requestId;
            this.taskId = model.taskId;
            this.taskStatus = model.taskStatus;
            this.ticket = model.ticket;
        } 

        /**
         * <p>The ID of the stream collaboration.</p>
         * 
         * <strong>example:</strong>
         * <p>co-0sot77uale3****</p>
         */
        public Builder coId(String coId) {
            this.coId = coId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the cloud computer connection task.</p>
         * 
         * <strong>example:</strong>
         * <p>39cc15e5-6998-4b9f-9b2c-7a4cc3e2****</p>
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        /**
         * <p>The task status.</p>
         * <p>Possible values:</p>
         * <ul>
         * <li><p>Finished</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>Failed</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>Running</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- --></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Finished</p>
         */
        public Builder taskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }

        /**
         * <p>The credentials of the stream collaboration.</p>
         * 
         * <strong>example:</strong>
         * <p>W0VuY29kaW5nXQ0KSW5wdXRFbmNvZGluZz1V********</p>
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
