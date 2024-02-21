// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudphone20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SendFileResponseBody} extends {@link TeaModel}
 *
 * <p>SendFileResponseBody</p>
 */
public class SendFileResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TaskId")
    private TaskId taskId;

    private SendFileResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendFileResponseBody create() {
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
    public TaskId getTaskId() {
        return this.taskId;
    }

    public static final class Builder {
        private String requestId; 
        private TaskId taskId; 

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The task IDs. Valid values of N: 1 to 100.
         */
        public Builder taskId(TaskId taskId) {
            this.taskId = taskId;
            return this;
        }

        public SendFileResponseBody build() {
            return new SendFileResponseBody(this);
        } 

    } 

    public static class TaskId extends TeaModel {
        @NameInMap("TaskId")
        private java.util.List < String > taskId;

        private TaskId(Builder builder) {
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskId create() {
            return builder().build();
        }

        /**
         * @return taskId
         */
        public java.util.List < String > getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private java.util.List < String > taskId; 

            /**
             * The task IDs. Valid values of N: 1 to 100.
             */
            public Builder taskId(java.util.List < String > taskId) {
                this.taskId = taskId;
                return this;
            }

            public TaskId build() {
                return new TaskId(this);
            } 

        } 

    }
}
