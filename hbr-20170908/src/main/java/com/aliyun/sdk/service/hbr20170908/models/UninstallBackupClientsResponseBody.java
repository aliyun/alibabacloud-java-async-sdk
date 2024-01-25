// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UninstallBackupClientsResponseBody} extends {@link TeaModel}
 *
 * <p>UninstallBackupClientsResponseBody</p>
 */
public class UninstallBackupClientsResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("InstanceStatuses")
    private java.util.List < InstanceStatuses> instanceStatuses;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TaskId")
    private String taskId;

    private UninstallBackupClientsResponseBody(Builder builder) {
        this.code = builder.code;
        this.instanceStatuses = builder.instanceStatuses;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UninstallBackupClientsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return instanceStatuses
     */
    public java.util.List < InstanceStatuses> getInstanceStatuses() {
        return this.instanceStatuses;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder {
        private String code; 
        private java.util.List < InstanceStatuses> instanceStatuses; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private String taskId; 

        /**
         * The HTTP status code. The status code 200 indicates that the request is successful.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The status of the ECS instance.
         */
        public Builder instanceStatuses(java.util.List < InstanceStatuses> instanceStatuses) {
            this.instanceStatuses = instanceStatuses;
            return this;
        }

        /**
         * The message that is returned. If the request is successful, a value of successful is returned. If the request fails, an error message is returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request is successful.
         * <p>
         * 
         * *   true: The request is successful.
         * *   false: The request fails.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * The ID of the asynchronous job. You can call the DescribeTask operation to query the execution result of the asynchronous job.
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        public UninstallBackupClientsResponseBody build() {
            return new UninstallBackupClientsResponseBody(this);
        } 

    } 

    public static class InstanceStatuses extends TeaModel {
        @NameInMap("ErrorCode")
        private String errorCode;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("ValidInstance")
        private Boolean validInstance;

        private InstanceStatuses(Builder builder) {
            this.errorCode = builder.errorCode;
            this.instanceId = builder.instanceId;
            this.validInstance = builder.validInstance;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceStatuses create() {
            return builder().build();
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return validInstance
         */
        public Boolean getValidInstance() {
            return this.validInstance;
        }

        public static final class Builder {
            private String errorCode; 
            private String instanceId; 
            private Boolean validInstance; 

            /**
             * The error code. Valid values:
             * <p>
             * 
             * *   If the value is empty, the request is successful.
             * *   **InstanceNotExists**: The ECS instance does not exist.
             * *   **InstanceNotRunning**: The ECS instance is not running.
             * *   **CloudAssistNotRunningOnInstance**: Cloud Assistant is unavailable.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * The ID of the ECS instance.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * Indicates whether a backup client can be installed on the ECS instance.
             * <p>
             * 
             * *   true: A backup client can be installed on the ECS instance.
             * *   false: A backup client cannot be installed on the ECS instance.
             */
            public Builder validInstance(Boolean validInstance) {
                this.validInstance = validInstance;
                return this;
            }

            public InstanceStatuses build() {
                return new InstanceStatuses(this);
            } 

        } 

    }
}
