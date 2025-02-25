// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

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
 * {@link CreateVideoLabelClassificationTaskResponseBody} extends {@link TeaModel}
 *
 * <p>CreateVideoLabelClassificationTaskResponseBody</p>
 */
public class CreateVideoLabelClassificationTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EventId")
    private String eventId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    private CreateVideoLabelClassificationTaskResponseBody(Builder builder) {
        this.eventId = builder.eventId;
        this.requestId = builder.requestId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateVideoLabelClassificationTaskResponseBody create() {
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
         * <p>The event ID of the current task. You can use <a href="https://www.alibabacloud.com/en/product/eventbridge">EventBridge</a> to query the ID and obtain the task information notification.</p>
         * 
         * <strong>example:</strong>
         * <p>03F-1Qt1Yn5RZZ0Zh3ZdYlDblv7****</p>
         */
        public Builder eventId(String eventId) {
            this.eventId = eventId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CA995EFD-083D-4F40-BE8A-BDF75FFFE0B6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the current task. You can call the <a href="~~GetTask~~">GetTask</a> operation to view the task information or the <a href="https://help.aliyun.com/document_detail/478224.html">GetVideoLabelClassificationResult</a> operation to obtain the result of the video label detection task.</p>
         * 
         * <strong>example:</strong>
         * <p>VideoLabelClassification-2f157087-91df-4fda-8c3e-232407ec*****</p>
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        public CreateVideoLabelClassificationTaskResponseBody build() {
            return new CreateVideoLabelClassificationTaskResponseBody(this);
        } 

    } 

}
