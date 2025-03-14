// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link HandleSecurityEventsResponseBody} extends {@link TeaModel}
 *
 * <p>HandleSecurityEventsResponseBody</p>
 */
public class HandleSecurityEventsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("HandleSecurityEventsResponse")
    private HandleSecurityEventsResponse handleSecurityEventsResponse;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(HandleSecurityEventsResponseBody model) {
            this.handleSecurityEventsResponse = model.handleSecurityEventsResponse;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The handling result of the alert events.</p>
         */
        public Builder handleSecurityEventsResponse(HandleSecurityEventsResponse handleSecurityEventsResponse) {
            this.handleSecurityEventsResponse = handleSecurityEventsResponse;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>FF0020B9-999F-5DE2-985F-DB282BDA5311</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public HandleSecurityEventsResponseBody build() {
            return new HandleSecurityEventsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link HandleSecurityEventsResponseBody} extends {@link TeaModel}
     *
     * <p>HandleSecurityEventsResponseBody</p>
     */
    public static class HandleSecurityEventsResponse extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TaskId")
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

            private Builder() {
            } 

            private Builder(HandleSecurityEventsResponse model) {
                this.taskId = model.taskId;
            } 

            /**
             * <p>The ID of the task to handle the alert events.</p>
             * 
             * <strong>example:</strong>
             * <p>15411</p>
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
