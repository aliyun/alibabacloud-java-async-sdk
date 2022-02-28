// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSimilarSecurityEventsQueryTaskResponseBody} extends {@link TeaModel}
 *
 * <p>CreateSimilarSecurityEventsQueryTaskResponseBody</p>
 */
public class CreateSimilarSecurityEventsQueryTaskResponseBody extends TeaModel {
    @NameInMap("CreateSimilarSecurityEventsQueryTaskResponse")
    private CreateSimilarSecurityEventsQueryTaskResponse createSimilarSecurityEventsQueryTaskResponse;

    @NameInMap("RequestId")
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
         * CreateSimilarSecurityEventsQueryTaskResponse.
         */
        public Builder createSimilarSecurityEventsQueryTaskResponse(CreateSimilarSecurityEventsQueryTaskResponse createSimilarSecurityEventsQueryTaskResponse) {
            this.createSimilarSecurityEventsQueryTaskResponse = createSimilarSecurityEventsQueryTaskResponse;
            return this;
        }

        /**
         * RequestId.
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
        @NameInMap("Status")
        private String status;

        @NameInMap("TaskId")
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
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * TaskId.
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
