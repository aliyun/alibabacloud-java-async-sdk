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
 * {@link InstallBackupClientsResponseBody} extends {@link TeaModel}
 *
 * <p>InstallBackupClientsResponseBody</p>
 */
public class InstallBackupClientsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("InstanceStatuses")
    private java.util.List<InstanceStatuses> instanceStatuses;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    private InstallBackupClientsResponseBody(Builder builder) {
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

    public static InstallBackupClientsResponseBody create() {
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
    public java.util.List<InstanceStatuses> getInstanceStatuses() {
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
        private java.util.List<InstanceStatuses> instanceStatuses; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private String taskId; 

        private Builder() {
        } 

        private Builder(InstallBackupClientsResponseBody model) {
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
         * <p>The status of the ECS instance.</p>
         */
        public Builder instanceStatuses(java.util.List<InstanceStatuses> instanceStatuses) {
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
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
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
         * <p>t-*********************</p>
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        public InstallBackupClientsResponseBody build() {
            return new InstallBackupClientsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link InstallBackupClientsResponseBody} extends {@link TeaModel}
     *
     * <p>InstallBackupClientsResponseBody</p>
     */
    public static class InstanceStatuses extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("ValidInstance")
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

            private Builder() {
            } 

            private Builder(InstanceStatuses model) {
                this.errorCode = model.errorCode;
                this.instanceId = model.instanceId;
                this.validInstance = model.validInstance;
            } 

            /**
             * <p>The error code that is returned. Valid values:</p>
             * <ul>
             * <li>If the value is empty, the call is successful.</li>
             * <li><strong>InstanceNotExists</strong>: The ECS instance does not exist.</li>
             * <li><strong>InstanceNotRunning</strong>: The ECS instance is not running.</li>
             * <li><strong>CloudAssistNotRunningOnInstance</strong>: Cloud Assistant is unavailable.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>InstanceNotExists</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>The ID of the ECS instance.</p>
             * 
             * <strong>example:</strong>
             * <p>i-0xi5w***v3j3bh2gj5</p>
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

            public InstanceStatuses build() {
                return new InstanceStatuses(this);
            } 

        } 

    }
}
