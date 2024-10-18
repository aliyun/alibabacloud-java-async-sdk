// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateImageSplicingTaskResponseBody} extends {@link TeaModel}
 *
 * <p>CreateImageSplicingTaskResponseBody</p>
 */
public class CreateImageSplicingTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EventId")
    private String eventId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    private CreateImageSplicingTaskResponseBody(Builder builder) {
        this.eventId = builder.eventId;
        this.requestId = builder.requestId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateImageSplicingTaskResponseBody create() {
        return builder().build();
    }

    /**
     * @return eventId
     */
    public String getEventId() {
        return this.eventId;
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

    public static final class Builder {
        private String eventId; 
        private String requestId; 
        private String taskId; 

        /**
         * <p>The event ID.</p>
         * 
         * <strong>example:</strong>
         * <p>10C-1R6p7Km0H5Ieg38LKXTIvw*****</p>
         */
        public Builder eventId(String eventId) {
            this.eventId = eventId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>94D6F994-E298-037E-8E8B-0090F27*****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ImageSplicing-537cc157-7645-444a-a631-c8db4d02*****</p>
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        public CreateImageSplicingTaskResponseBody build() {
            return new CreateImageSplicingTaskResponseBody(this);
        } 

    } 

}
