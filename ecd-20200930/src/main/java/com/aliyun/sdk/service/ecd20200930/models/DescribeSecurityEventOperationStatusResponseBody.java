// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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

    @NameInMap("SecurityEventOperationStatuses")
    private java.util.List < SecurityEventOperationStatuses> securityEventOperationStatuses;

    @NameInMap("TaskStatus")
    private String taskStatus;

    private DescribeSecurityEventOperationStatusResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.securityEventOperationStatuses = builder.securityEventOperationStatuses;
        this.taskStatus = builder.taskStatus;
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
        private String requestId; 
        private java.util.List < SecurityEventOperationStatuses> securityEventOperationStatuses; 
        private String taskStatus; 

        /**
         * The processing status of the alert. Valid values:
         * <p>
         * 
         * *   Processing: The alert is being processed.
         * *   Success: The alert is processed.
         * *   Failed: The alert failed to be processed.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder securityEventOperationStatuses(java.util.List < SecurityEventOperationStatuses> securityEventOperationStatuses) {
            this.securityEventOperationStatuses = securityEventOperationStatuses;
            return this;
        }

        /**
         * The code that indicates the processing result of the alert.
         */
        public Builder taskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
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
        private Long securityEventId;

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
        public Long getSecurityEventId() {
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
            private Long securityEventId; 
            private String status; 

            /**
             * ErrorCode.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * SecurityEventId.
             */
            public Builder securityEventId(Long securityEventId) {
                this.securityEventId = securityEventId;
                return this;
            }

            /**
             * The operation that you want to perform. Set the value to DescribeSecurityEventOperationStatus.
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
}
