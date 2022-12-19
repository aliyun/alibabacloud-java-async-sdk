// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSecurityEventOperationStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSecurityEventOperationStatusResponseBody</p>
 */
public class DescribeSecurityEventOperationStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SecurityEventOperationStatusResponse")
    private SecurityEventOperationStatusResponse securityEventOperationStatusResponse;

    private DescribeSecurityEventOperationStatusResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.securityEventOperationStatusResponse = builder.securityEventOperationStatusResponse;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSecurityEventOperationStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return securityEventOperationStatusResponse
     */
    public SecurityEventOperationStatusResponse getSecurityEventOperationStatusResponse() {
        return this.securityEventOperationStatusResponse;
    }

    public static final class Builder {
        private String requestId; 
        private SecurityEventOperationStatusResponse securityEventOperationStatusResponse; 

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The information about the task that handles the alert events.
         */
        public Builder securityEventOperationStatusResponse(SecurityEventOperationStatusResponse securityEventOperationStatusResponse) {
            this.securityEventOperationStatusResponse = securityEventOperationStatusResponse;
            return this;
        }

        public DescribeSecurityEventOperationStatusResponseBody build() {
            return new DescribeSecurityEventOperationStatusResponseBody(this);
        } 

    } 

    public static class SecurityEventOperationStatuses extends TeaModel {
        @NameInMap("ErrorCode")
        private String errorCode;

        @NameInMap("SecurityEventId")
        private String securityEventId;

        @NameInMap("Status")
        private String status;

        private SecurityEventOperationStatuses(Builder builder) {
            this.errorCode = builder.errorCode;
            this.securityEventId = builder.securityEventId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecurityEventOperationStatuses create() {
            return builder().build();
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return securityEventId
         */
        public String getSecurityEventId() {
            return this.securityEventId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String errorCode; 
            private String securityEventId; 
            private String status; 

            /**
             * The code that indicates the handling result of the alert event.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * The ID of the alert event.
             */
            public Builder securityEventId(String securityEventId) {
                this.securityEventId = securityEventId;
                return this;
            }

            /**
             * The handling status of the alert event. Valid values:
             * <p>
             * 
             * *   **Processing**: The alert event is being handled.
             * *   **Success**: The alert event is handled.
             * *   **Failed**: The alert event failed to be handled.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public SecurityEventOperationStatuses build() {
                return new SecurityEventOperationStatuses(this);
            } 

        } 

    }
    public static class SecurityEventOperationStatusResponse extends TeaModel {
        @NameInMap("SecurityEventOperationStatuses")
        private java.util.List < SecurityEventOperationStatuses> securityEventOperationStatuses;

        @NameInMap("TaskStatus")
        private String taskStatus;

        private SecurityEventOperationStatusResponse(Builder builder) {
            this.securityEventOperationStatuses = builder.securityEventOperationStatuses;
            this.taskStatus = builder.taskStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecurityEventOperationStatusResponse create() {
            return builder().build();
        }

        /**
         * @return securityEventOperationStatuses
         */
        public java.util.List < SecurityEventOperationStatuses> getSecurityEventOperationStatuses() {
            return this.securityEventOperationStatuses;
        }

        /**
         * @return taskStatus
         */
        public String getTaskStatus() {
            return this.taskStatus;
        }

        public static final class Builder {
            private java.util.List < SecurityEventOperationStatuses> securityEventOperationStatuses; 
            private String taskStatus; 

            /**
             * An array consisting of the status of the alert events handled by the task.
             */
            public Builder securityEventOperationStatuses(java.util.List < SecurityEventOperationStatuses> securityEventOperationStatuses) {
                this.securityEventOperationStatuses = securityEventOperationStatuses;
                return this;
            }

            /**
             * The status of the task that handles the alert events. Valid values:
             * <p>
             * 
             * *   **Processing**: The task is running.
             * *   **Success**: The task is successful.
             * *   **Failure**: The task failed.
             * *   **Pending**: The task is pending.
             */
            public Builder taskStatus(String taskStatus) {
                this.taskStatus = taskStatus;
                return this;
            }

            public SecurityEventOperationStatusResponse build() {
                return new SecurityEventOperationStatusResponse(this);
            } 

        } 

    }
}
