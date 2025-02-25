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
 * {@link DescribeSecurityEventOperationStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSecurityEventOperationStatusResponseBody</p>
 */
public class DescribeSecurityEventOperationStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SecurityEventOperationStatusResponse")
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
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>1683940A-E4AE-4473-8C40-F4075434B76B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the task that handles the alert events.</p>
         */
        public Builder securityEventOperationStatusResponse(SecurityEventOperationStatusResponse securityEventOperationStatusResponse) {
            this.securityEventOperationStatusResponse = securityEventOperationStatusResponse;
            return this;
        }

        public DescribeSecurityEventOperationStatusResponseBody build() {
            return new DescribeSecurityEventOperationStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSecurityEventOperationStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSecurityEventOperationStatusResponseBody</p>
     */
    public static class SecurityEventOperationStatuses extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("SecurityEventId")
        private String securityEventId;

        @com.aliyun.core.annotation.NameInMap("Status")
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
             * <p>The code that indicates the handling result of the alert event.</p>
             * 
             * <strong>example:</strong>
             * <p>ignore.Success</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>The ID of the alert event.</p>
             * 
             * <strong>example:</strong>
             * <p>12321</p>
             */
            public Builder securityEventId(String securityEventId) {
                this.securityEventId = securityEventId;
                return this;
            }

            /**
             * <p>The handling status of the alert event. Valid values:</p>
             * <ul>
             * <li><strong>Processing</strong>: The alert event is being handled.</li>
             * <li><strong>Success</strong>: The alert event is handled.</li>
             * <li><strong>Failed</strong>: The alert event failed to be handled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
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
    /**
     * 
     * {@link DescribeSecurityEventOperationStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSecurityEventOperationStatusResponseBody</p>
     */
    public static class SecurityEventOperationStatusResponse extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SecurityEventOperationStatuses")
        private java.util.List<SecurityEventOperationStatuses> securityEventOperationStatuses;

        @com.aliyun.core.annotation.NameInMap("TaskStatus")
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
        public java.util.List<SecurityEventOperationStatuses> getSecurityEventOperationStatuses() {
            return this.securityEventOperationStatuses;
        }

        /**
         * @return taskStatus
         */
        public String getTaskStatus() {
            return this.taskStatus;
        }

        public static final class Builder {
            private java.util.List<SecurityEventOperationStatuses> securityEventOperationStatuses; 
            private String taskStatus; 

            /**
             * <p>An array consisting of the status of the alert events handled by the task.</p>
             */
            public Builder securityEventOperationStatuses(java.util.List<SecurityEventOperationStatuses> securityEventOperationStatuses) {
                this.securityEventOperationStatuses = securityEventOperationStatuses;
                return this;
            }

            /**
             * <p>The status of the task that handles the alert events. Valid values:</p>
             * <ul>
             * <li><strong>Processing</strong>: The task is running.</li>
             * <li><strong>Success</strong>: The task is successful.</li>
             * <li><strong>Failure</strong>: The task failed.</li>
             * <li><strong>Pending</strong>: The task is pending.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
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
