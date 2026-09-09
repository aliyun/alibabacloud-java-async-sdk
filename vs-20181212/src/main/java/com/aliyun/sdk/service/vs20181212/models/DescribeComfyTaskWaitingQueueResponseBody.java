// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

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
 * {@link DescribeComfyTaskWaitingQueueResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeComfyTaskWaitingQueueResponseBody</p>
 */
public class DescribeComfyTaskWaitingQueueResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Long code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TaskWaitingQueue")
    private TaskWaitingQueue taskWaitingQueue;

    private DescribeComfyTaskWaitingQueueResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.taskWaitingQueue = builder.taskWaitingQueue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeComfyTaskWaitingQueueResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Long getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return taskWaitingQueue
     */
    public TaskWaitingQueue getTaskWaitingQueue() {
        return this.taskWaitingQueue;
    }

    public static final class Builder {
        private Long code; 
        private String message; 
        private String requestId; 
        private TaskWaitingQueue taskWaitingQueue; 

        private Builder() {
        } 

        private Builder(DescribeComfyTaskWaitingQueueResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.taskWaitingQueue = model.taskWaitingQueue;
        } 

        /**
         * <p>The status code. A value of 0 indicates success.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder code(Long code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The waiting queue information.</p>
         */
        public Builder taskWaitingQueue(TaskWaitingQueue taskWaitingQueue) {
            this.taskWaitingQueue = taskWaitingQueue;
            return this;
        }

        public DescribeComfyTaskWaitingQueueResponseBody build() {
            return new DescribeComfyTaskWaitingQueueResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeComfyTaskWaitingQueueResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeComfyTaskWaitingQueueResponseBody</p>
     */
    public static class TaskWaitingQueue extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("WaitingCount")
        private Long waitingCount;

        private TaskWaitingQueue(Builder builder) {
            this.waitingCount = builder.waitingCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskWaitingQueue create() {
            return builder().build();
        }

        /**
         * @return waitingCount
         */
        public Long getWaitingCount() {
            return this.waitingCount;
        }

        public static final class Builder {
            private Long waitingCount; 

            private Builder() {
            } 

            private Builder(TaskWaitingQueue model) {
                this.waitingCount = model.waitingCount;
            } 

            /**
             * <p>The number of waiting tasks.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder waitingCount(Long waitingCount) {
                this.waitingCount = waitingCount;
                return this;
            }

            public TaskWaitingQueue build() {
                return new TaskWaitingQueue(this);
            } 

        } 

    }
}
