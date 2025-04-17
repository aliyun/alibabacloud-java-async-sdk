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
 * {@link CreateFigureClusteringTaskResponseBody} extends {@link TeaModel}
 *
 * <p>CreateFigureClusteringTaskResponseBody</p>
 */
public class CreateFigureClusteringTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EventId")
    private String eventId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    private CreateFigureClusteringTaskResponseBody(Builder builder) {
        this.eventId = builder.eventId;
        this.requestId = builder.requestId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFigureClusteringTaskResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(CreateFigureClusteringTaskResponseBody model) {
            this.eventId = model.eventId;
            this.requestId = model.requestId;
            this.taskId = model.taskId;
        } 

        /**
         * <p>The event ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0ED-1Bz8z71k5TtsUejT4UJ16****</p>
         */
        public Builder eventId(String eventId) {
            this.eventId = eventId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1B3D5E0A-D8B8-4DA0-8127-ED32C851****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>formatconvert-00bec802-073a-4b61-ba3b-39bc****</p>
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        public CreateFigureClusteringTaskResponseBody build() {
            return new CreateFigureClusteringTaskResponseBody(this);
        } 

    } 

}
