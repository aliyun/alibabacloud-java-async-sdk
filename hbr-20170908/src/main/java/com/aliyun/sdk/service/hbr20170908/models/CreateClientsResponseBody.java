// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateClientsResponseBody} extends {@link TeaModel}
 *
 * <p>CreateClientsResponseBody</p>
 */
public class CreateClientsResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("InstanceStatuses")
    private InstanceStatuses instanceStatuses;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TaskId")
    private String taskId;

    private CreateClientsResponseBody(Builder builder) {
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

    public static CreateClientsResponseBody create() {
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
    public InstanceStatuses getInstanceStatuses() {
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
        private InstanceStatuses instanceStatuses; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private String taskId; 

        /**
         * The HTTP status code. The status code 200 indicates that the call is successful.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The status of the ECS instance. If you specify more than one instance IDs in the request and the status of an ECS instance does not meet the requirements to install an HBR client, an error message is returned based on the value of this parameter.
         */
        public Builder instanceStatuses(InstanceStatuses instanceStatuses) {
            this.instanceStatuses = instanceStatuses;
            return this;
        }

        /**
         * The message that is returned. If the call is successful, "successful" is returned. If the call fails, an error message is returned.
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
         * Indicates whether the call is successful. Valid values:
         * <p>
         * 
         * *   true: The call is successful.
         * *   false: The call fails.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * The ID of the asynchronous job. You can call the DescribeTask operation to query the execution result of an asynchronous job.
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        public CreateClientsResponseBody build() {
            return new CreateClientsResponseBody(this);
        } 

    } 

    public static class InstanceStatus extends TeaModel {
        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("ValidInstance")
        private Boolean validInstance;

        private InstanceStatus(Builder builder) {
            this.instanceId = builder.instanceId;
            this.validInstance = builder.validInstance;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceStatus create() {
            return builder().build();
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
            private String instanceId; 
            private Boolean validInstance; 

            /**
             * The ID of the ECS instance.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * Indicates whether an HBR client can be installed on the ECS instance. Valid values:
             * <p>
             * 
             * *   true: An HBR client can be installed on the ECS instance.
             * *   false: An HBR client cannot be installed on the ECS instance.
             */
            public Builder validInstance(Boolean validInstance) {
                this.validInstance = validInstance;
                return this;
            }

            public InstanceStatus build() {
                return new InstanceStatus(this);
            } 

        } 

    }
    public static class InstanceStatuses extends TeaModel {
        @NameInMap("InstanceStatus")
        private java.util.List < InstanceStatus> instanceStatus;

        private InstanceStatuses(Builder builder) {
            this.instanceStatus = builder.instanceStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceStatuses create() {
            return builder().build();
        }

        /**
         * @return instanceStatus
         */
        public java.util.List < InstanceStatus> getInstanceStatus() {
            return this.instanceStatus;
        }

        public static final class Builder {
            private java.util.List < InstanceStatus> instanceStatus; 

            /**
             * InstanceStatus.
             */
            public Builder instanceStatus(java.util.List < InstanceStatus> instanceStatus) {
                this.instanceStatus = instanceStatus;
                return this;
            }

            public InstanceStatuses build() {
                return new InstanceStatuses(this);
            } 

        } 

    }
}
