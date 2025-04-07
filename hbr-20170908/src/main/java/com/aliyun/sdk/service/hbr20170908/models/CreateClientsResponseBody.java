// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

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
 * {@link CreateClientsResponseBody} extends {@link TeaModel}
 *
 * <p>CreateClientsResponseBody</p>
 */
public class CreateClientsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("InstanceStatuses")
    private InstanceStatuses instanceStatuses;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TaskId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(CreateClientsResponseBody model) {
            this.code = model.code;
            this.instanceStatuses = model.instanceStatuses;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
            this.taskId = model.taskId;
        } 

        /**
         * <p>The HTTP status code. The status code 200 indicates that the call is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The status of the ECS instance. If you specify more than one instance IDs in the request and the status of an ECS instance does not meet the requirements to install an HBR client, an error message is returned based on the value of this parameter.</p>
         */
        public Builder instanceStatuses(InstanceStatuses instanceStatuses) {
            this.instanceStatuses = instanceStatuses;
            return this;
        }

        /**
         * <p>The message that is returned. If the call is successful, &quot;successful&quot; is returned. If the call fails, an error message is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>4A8A9AE4-F798-5E6D-853E-10F9F5A1BD4E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call is successful. Valid values:</p>
         * <ul>
         * <li>true: The call is successful.</li>
         * <li>false: The call fails.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The ID of the asynchronous job. You can call the DescribeTask operation to query the execution result of an asynchronous job.</p>
         * 
         * <strong>example:</strong>
         * <p>t-000h9x5t02vhyksf1x7k</p>
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        public CreateClientsResponseBody build() {
            return new CreateClientsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateClientsResponseBody} extends {@link TeaModel}
     *
     * <p>CreateClientsResponseBody</p>
     */
    public static class InstanceStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("ValidInstance")
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

            private Builder() {
            } 

            private Builder(InstanceStatus model) {
                this.instanceId = model.instanceId;
                this.validInstance = model.validInstance;
            } 

            /**
             * <p>The ID of the ECS instance.</p>
             * 
             * <strong>example:</strong>
             * <p>i-2zegp3cdu******uj9i</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>Indicates whether an HBR client can be installed on the ECS instance. Valid values:</p>
             * <ul>
             * <li>true: An HBR client can be installed on the ECS instance.</li>
             * <li>false: An HBR client cannot be installed on the ECS instance.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
    /**
     * 
     * {@link CreateClientsResponseBody} extends {@link TeaModel}
     *
     * <p>CreateClientsResponseBody</p>
     */
    public static class InstanceStatuses extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceStatus")
        private java.util.List<InstanceStatus> instanceStatus;

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
        public java.util.List<InstanceStatus> getInstanceStatus() {
            return this.instanceStatus;
        }

        public static final class Builder {
            private java.util.List<InstanceStatus> instanceStatus; 

            private Builder() {
            } 

            private Builder(InstanceStatuses model) {
                this.instanceStatus = model.instanceStatus;
            } 

            /**
             * InstanceStatus.
             */
            public Builder instanceStatus(java.util.List<InstanceStatus> instanceStatus) {
                this.instanceStatus = instanceStatus;
                return this;
            }

            public InstanceStatuses build() {
                return new InstanceStatuses(this);
            } 

        } 

    }
}
