// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateSimilarImageClusteringTaskResponseBody} extends {@link TeaModel}
 *
 * <p>CreateSimilarImageClusteringTaskResponseBody</p>
 */
public class CreateSimilarImageClusteringTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EventId")
    private String eventId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    private CreateSimilarImageClusteringTaskResponseBody(Builder builder) {
        this.eventId = builder.eventId;
        this.requestId = builder.requestId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSimilarImageClusteringTaskResponseBody create() {
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
         * <p>3BF-1UhtFyrua71eOkFlqYq23Co****</p>
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
         * <p>SimilarImageClustering-48d0a0f3-8459-47f4-b8af-ff49c64****</p>
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        public CreateSimilarImageClusteringTaskResponseBody build() {
            return new CreateSimilarImageClusteringTaskResponseBody(this);
        } 

    } 

}
