// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentloop20260520.models;

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
 * {@link AuditTaskState} extends {@link TeaModel}
 *
 * <p>AuditTaskState</p>
 */
public class AuditTaskState extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("enabled")
    private Boolean enabled;

    @com.aliyun.core.annotation.NameInMap("runtimeError")
    private RuntimeError runtimeError;

    @com.aliyun.core.annotation.NameInMap("runtimeStatus")
    private String runtimeStatus;

    @com.aliyun.core.annotation.NameInMap("runtimeStatusCheckedAt")
    private String runtimeStatusCheckedAt;

    @com.aliyun.core.annotation.NameInMap("task")
    private java.util.Map<String, ?> task;

    @com.aliyun.core.annotation.NameInMap("taskId")
    private String taskId;

    @com.aliyun.core.annotation.NameInMap("version")
    private Long version;

    private AuditTaskState(Builder builder) {
        this.enabled = builder.enabled;
        this.runtimeError = builder.runtimeError;
        this.runtimeStatus = builder.runtimeStatus;
        this.runtimeStatusCheckedAt = builder.runtimeStatusCheckedAt;
        this.task = builder.task;
        this.taskId = builder.taskId;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AuditTaskState create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return enabled
     */
    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * @return runtimeError
     */
    public RuntimeError getRuntimeError() {
        return this.runtimeError;
    }

    /**
     * @return runtimeStatus
     */
    public String getRuntimeStatus() {
        return this.runtimeStatus;
    }

    /**
     * @return runtimeStatusCheckedAt
     */
    public String getRuntimeStatusCheckedAt() {
        return this.runtimeStatusCheckedAt;
    }

    /**
     * @return task
     */
    public java.util.Map<String, ?> getTask() {
        return this.task;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return version
     */
    public Long getVersion() {
        return this.version;
    }

    public static final class Builder {
        private Boolean enabled; 
        private RuntimeError runtimeError; 
        private String runtimeStatus; 
        private String runtimeStatusCheckedAt; 
        private java.util.Map<String, ?> task; 
        private String taskId; 
        private Long version; 

        private Builder() {
        } 

        private Builder(AuditTaskState model) {
            this.enabled = model.enabled;
            this.runtimeError = model.runtimeError;
            this.runtimeStatus = model.runtimeStatus;
            this.runtimeStatusCheckedAt = model.runtimeStatusCheckedAt;
            this.task = model.task;
            this.taskId = model.taskId;
            this.version = model.version;
        } 

        /**
         * <p>The current expected sharing switch for the task.</p>
         */
        public Builder enabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * <p>The runtime error, which is returned only when runtimeStatus is error.</p>
         */
        public Builder runtimeError(RuntimeError runtimeError) {
            this.runtimeError = runtimeError;
            return this;
        }

        /**
         * <p>The runtime status, which appears only when includeRuntimeStatus=true is requested. Valid values: pending, starting, stopping, running, stopped, missing, drifted, and error. The list and get operations do not return deleting.</p>
         * 
         * <strong>example:</strong>
         * <p>running</p>
         */
        public Builder runtimeStatus(String runtimeStatus) {
            this.runtimeStatus = runtimeStatus;
            return this;
        }

        /**
         * <p>The time when the remote status is checked. This field appears together with runtimeStatus.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder runtimeStatusCheckedAt(String runtimeStatusCheckedAt) {
            this.runtimeStatusCheckedAt = runtimeStatusCheckedAt;
            return this;
        }

        /**
         * <p>The task details in JSON format.</p>
         */
        public Builder task(java.util.Map<String, ?> task) {
            this.task = task;
            return this;
        }

        /**
         * <p>The stable ID of the task, which must be equal to task.taskId.</p>
         * 
         * <strong>example:</strong>
         * <p>custom_host_intrusion_audit</p>
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        /**
         * <p>The current execution configuration version of the task. The minimum value is 1. Starting or stopping the task does not increment this version.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        public Builder version(Long version) {
            this.version = version;
            return this;
        }

        public AuditTaskState build() {
            return new AuditTaskState(this);
        } 

    } 

    /**
     * 
     * {@link AuditTaskState} extends {@link TeaModel}
     *
     * <p>AuditTaskState</p>
     */
    public static class RuntimeError extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("requestId")
        private String requestId;

        private RuntimeError(Builder builder) {
            this.code = builder.code;
            this.message = builder.message;
            this.requestId = builder.requestId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuntimeError create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
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

        public static final class Builder {
            private String code; 
            private String message; 
            private String requestId; 

            private Builder() {
            } 

            private Builder(RuntimeError model) {
                this.code = model.code;
                this.message = model.message;
                this.requestId = model.requestId;
            } 

            /**
             * <p>The error code, such as task_status_query_failed.</p>
             * 
             * <strong>example:</strong>
             * <p>task_status_query_failed</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The error description.</p>
             * 
             * <strong>example:</strong>
             * <p>error</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The ID of the status query request.</p>
             * 
             * <strong>example:</strong>
             * <p>GUID</p>
             */
            public Builder requestId(String requestId) {
                this.requestId = requestId;
                return this;
            }

            public RuntimeError build() {
                return new RuntimeError(this);
            } 

        } 

    }
}
