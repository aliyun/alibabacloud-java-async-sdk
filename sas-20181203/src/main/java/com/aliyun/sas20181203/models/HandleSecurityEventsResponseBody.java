// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link HandleSecurityEventsResponseBody} extends {@link TeaModel}
 *
 * <p>HandleSecurityEventsResponseBody</p>
 */
public class HandleSecurityEventsResponseBody extends TeaModel {
    @NameInMap("HandleSecurityEventsResponse")
    private HandleSecurityEventsResponse handleSecurityEventsResponse;

    @NameInMap("RequestId")
    private String requestId;

    private HandleSecurityEventsResponseBody(Builder builder) {
        this.handleSecurityEventsResponse = builder.handleSecurityEventsResponse;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HandleSecurityEventsResponseBody create() {
        return builder().build();
    }

    /**
     * @return handleSecurityEventsResponse
     */
    public HandleSecurityEventsResponse getHandleSecurityEventsResponse() {
        return this.handleSecurityEventsResponse;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private HandleSecurityEventsResponse handleSecurityEventsResponse; 
        private String requestId; 

        /**
         * HandleSecurityEventsResponse.
         */
        public Builder handleSecurityEventsResponse(HandleSecurityEventsResponse handleSecurityEventsResponse) {
            this.handleSecurityEventsResponse = handleSecurityEventsResponse;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public HandleSecurityEventsResponseBody build() {
            return new HandleSecurityEventsResponseBody(this);
        } 

    } 

    public static class HandleSecurityEventsResponse extends TeaModel {
        @NameInMap("TaskId")
        private Long taskId;

        private HandleSecurityEventsResponse(Builder builder) {
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HandleSecurityEventsResponse create() {
            return builder().build();
        }

        /**
         * @return taskId
         */
        public Long getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private Long taskId; 

            /**
             * TaskId.
             */
            public Builder taskId(Long taskId) {
                this.taskId = taskId;
                return this;
            }

            public HandleSecurityEventsResponse build() {
                return new HandleSecurityEventsResponse(this);
            } 

        } 

    }
}
