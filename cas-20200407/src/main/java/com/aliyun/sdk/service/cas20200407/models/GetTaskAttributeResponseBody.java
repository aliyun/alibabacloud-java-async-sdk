// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

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
 * {@link GetTaskAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>GetTaskAttributeResponseBody</p>
 */
public class GetTaskAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TaskMessage")
    private String taskMessage;

    @com.aliyun.core.annotation.NameInMap("TaskStatus")
    private String taskStatus;

    private GetTaskAttributeResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.taskMessage = builder.taskMessage;
        this.taskStatus = builder.taskStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTaskAttributeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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

    public static final class Builder {
        private String requestId; 
        private String taskMessage; 
        private String taskStatus; 

        private Builder() {
        } 

        private Builder(GetTaskAttributeResponseBody model) {
            this.requestId = model.requestId;
            this.taskMessage = model.taskMessage;
            this.taskStatus = model.taskStatus;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TaskMessage.
         */
        public Builder taskMessage(String taskMessage) {
            this.taskMessage = taskMessage;
            return this;
        }

        /**
         * TaskStatus.
         */
        public Builder taskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }

        public GetTaskAttributeResponseBody build() {
            return new GetTaskAttributeResponseBody(this);
        } 

    } 

}
