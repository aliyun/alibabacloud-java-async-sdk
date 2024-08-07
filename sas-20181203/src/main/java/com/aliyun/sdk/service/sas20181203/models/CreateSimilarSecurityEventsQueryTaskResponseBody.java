// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSimilarSecurityEventsQueryTaskResponseBody} extends {@link TeaModel}
 *
 * <p>CreateSimilarSecurityEventsQueryTaskResponseBody</p>
 */
public class CreateSimilarSecurityEventsQueryTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreateSimilarSecurityEventsQueryTaskResponse")
    private CreateSimilarSecurityEventsQueryTaskResponse createSimilarSecurityEventsQueryTaskResponse;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateSimilarSecurityEventsQueryTaskResponseBody(Builder builder) {
        this.createSimilarSecurityEventsQueryTaskResponse = builder.createSimilarSecurityEventsQueryTaskResponse;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSimilarSecurityEventsQueryTaskResponseBody create() {
        return builder().build();
    }

    /**
     * @return createSimilarSecurityEventsQueryTaskResponse
     */
    public CreateSimilarSecurityEventsQueryTaskResponse getCreateSimilarSecurityEventsQueryTaskResponse() {
        return this.createSimilarSecurityEventsQueryTaskResponse;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private CreateSimilarSecurityEventsQueryTaskResponse createSimilarSecurityEventsQueryTaskResponse; 
        private String requestId; 

        /**
         * The information about the task that queries alert events of the same alert type.
         */
        public Builder createSimilarSecurityEventsQueryTaskResponse(CreateSimilarSecurityEventsQueryTaskResponse createSimilarSecurityEventsQueryTaskResponse) {
            this.createSimilarSecurityEventsQueryTaskResponse = createSimilarSecurityEventsQueryTaskResponse;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateSimilarSecurityEventsQueryTaskResponseBody build() {
            return new CreateSimilarSecurityEventsQueryTaskResponseBody(this);
        } 

    } 

    public static class CreateSimilarSecurityEventsQueryTaskResponse extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private Long taskId;

        private CreateSimilarSecurityEventsQueryTaskResponse(Builder builder) {
            this.status = builder.status;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CreateSimilarSecurityEventsQueryTaskResponse create() {
            return builder().build();
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return taskId
         */
        public Long getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private String status; 
            private Long taskId; 

            /**
             * The status of the task. Valid values:
             * <p>
             * 
             * *   **New**: The task is created.
             * *   **RetrievingData**: Data is being retrieved.
             * *   **DataRetrieved**: Data is retrieved.
             * *   **Processing**: The task is running.
             * *   **Success**: The task is successful.
             * *   **Failed**: The task failed.
             * *   **PartialFailed**: The task partially failed.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The ID of the task.
             */
            public Builder taskId(Long taskId) {
                this.taskId = taskId;
                return this;
            }

            public CreateSimilarSecurityEventsQueryTaskResponse build() {
                return new CreateSimilarSecurityEventsQueryTaskResponse(this);
            } 

        } 

    }
}
