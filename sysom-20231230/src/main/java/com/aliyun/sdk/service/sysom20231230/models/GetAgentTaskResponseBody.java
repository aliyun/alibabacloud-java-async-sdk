// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sysom20231230.models;

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
 * {@link GetAgentTaskResponseBody} extends {@link TeaModel}
 *
 * <p>GetAgentTaskResponseBody</p>
 */
public class GetAgentTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    private GetAgentTaskResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAgentTaskResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    public static final class Builder {
        private String requestId; 
        private String code; 
        private Data data; 
        private String message; 

        private Builder() {
        } 

        private Builder(GetAgentTaskResponseBody model) {
            this.requestId = model.requestId;
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
        } 

        /**
         * <p>The request ID, which can be used for end-to-end diagnostics.</p>
         * 
         * <strong>example:</strong>
         * <p>2E75336A-0DB2-5263-B201-A6488EC97B50</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The status code.</p>
         * <ul>
         * <li><code>code == Success</code> indicates that the authorization is successful.</li>
         * <li>Other status codes indicate that the authorization failed. Check the <code>message</code> field for the detailed fault information.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message.</p>
         * <ul>
         * <li>If <code>code == Success</code>, this field is empty.</li>
         * <li>Otherwise, this field contains the request error message.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SysomOpenAPIException: SysomOpenAPI.InvalidParameter Invalid params, should be json string or dict</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        public GetAgentTaskResponseBody build() {
            return new GetAgentTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAgentTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetAgentTaskResponseBody</p>
     */
    public static class Jobs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("error")
        private String error;

        @com.aliyun.core.annotation.NameInMap("errorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("errorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("instance")
        private String instance;

        @com.aliyun.core.annotation.NameInMap("params")
        private Object params;

        @com.aliyun.core.annotation.NameInMap("region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("result")
        private String result;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        private Jobs(Builder builder) {
            this.error = builder.error;
            this.errorCode = builder.errorCode;
            this.errorMessage = builder.errorMessage;
            this.instance = builder.instance;
            this.params = builder.params;
            this.region = builder.region;
            this.result = builder.result;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Jobs create() {
            return builder().build();
        }

        /**
         * @return error
         */
        public String getError() {
            return this.error;
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return instance
         */
        public String getInstance() {
            return this.instance;
        }

        /**
         * @return params
         */
        public Object getParams() {
            return this.params;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return result
         */
        public String getResult() {
            return this.result;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String error; 
            private String errorCode; 
            private String errorMessage; 
            private String instance; 
            private Object params; 
            private String region; 
            private String result; 
            private String status; 

            private Builder() {
            } 

            private Builder(Jobs model) {
                this.error = model.error;
                this.errorCode = model.errorCode;
                this.errorMessage = model.errorMessage;
                this.instance = model.instance;
                this.params = model.params;
                this.region = model.region;
                this.result = model.result;
                this.status = model.status;
            } 

            /**
             * <p>The reason that caused the task to fail. This field is returned only when the task execution fails.</p>
             * 
             * <strong>example:</strong>
             * <p>Deprecated (misused)</p>
             */
            public Builder error(String error) {
                this.error = error;
                return this;
            }

            /**
             * <p>The error code of the subtask failure. Valid values:</p>
             * <ul>
             * <li>Empty: The task is executed normally.</li>
             * <li>INSTANCE_NOT_SUPPORTED: The instance type is not supported.</li>
             * <li>INSTANCE_NOT_EXISTS: The instance does not exist.</li>
             * <li>INSTANCE_RELEASED: The instance has been released.</li>
             * <li>INSTANCE_NOT_RUNNING: The instance is not running.</li>
             * <li>INSTANCE_NOT_OWNED: The instance does not belong to the current account.</li>
             * <li>AGENT_ALREADY_INSTALLED: The Agent is already installed.</li>
             * <li>AGENT_NOT_INSTALLED: The Agent is not installed.</li>
             * <li>AGENT_SAME_VERSION: The version is the same.</li>
             * <li>HAS_RUNNING_JOB: A running task exists.</li>
             * <li>RPM_LOCK_HELD: The RPM lock is held.</li>
             * <li>DISK_SPACE_INSUFFICIENT: The disk space is insufficient.</li>
             * <li>NODE_LOAD_HIGH: The node load is high.</li>
             * <li>COMMAND_FAILED: The command execution failed.</li>
             * <li>CLIENT_NOT_RUNNING: The Cloud Assistant Agent is not running.</li>
             * <li>CLIENT_NOT_RESPONSE: The Cloud Assistant Agent is not responding.</li>
             * <li>DELIVERY_TIMEOUT: The command delivery timed out.</li>
             * <li>EXECUTION_TIMEOUT: The command execution timed out.</li>
             * <li>TASK_CONCURRENCY_LIMIT: The task concurrency limit is reached.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DISK_SPACE_INSUFFICIENT</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>The detailed description of the subtask failure. Valid values:</p>
             * <ul>
             * <li>The instance type is not supported.</li>
             * <li>The instance does not exist.</li>
             * <li>The instance has been released.</li>
             * <li>The instance is not running.</li>
             * <li>The instance does not belong to the current account.</li>
             * <li>The Agent is already installed.</li>
             * <li>The Agent is not installed.</li>
             * <li>The Agent version is the same. No upgrade is required.</li>
             * <li>A running task exists. Try again later.</li>
             * <li>The RPM lock is held. Try again later.</li>
             * <li>The disk space is insufficient.</li>
             * <li>The node load is too high. Try again later.</li>
             * <li>The command execution failed. Try again later.</li>
             * <li>The Cloud Assistant Agent is not running.</li>
             * <li>The Cloud Assistant Agent is not responding.</li>
             * <li>The command delivery timed out.</li>
             * <li>The command execution timed out.</li>
             * <li>The task concurrency limit is reached.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>The disk space is insufficient</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>i-2zehme0rs1tc090fdl3n</p>
             */
            public Builder instance(String instance) {
                this.instance = instance;
                return this;
            }

            /**
             * <p>The subtask parameters.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *     &quot;agent_version&quot;: &quot;3.5.0-beta&quot;,
             *     &quot;opt&quot;: &quot;install&quot;,
             *     &quot;agent_id&quot;: &quot;74a86327-3170-412c-8fd67-da3389ec56a9&quot;,
             *     &quot;install_type&quot;: &quot;InstallAndUpgrade&quot;
             * }</p>
             */
            public Builder params(Object params) {
                this.params = params;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The subtask execution result.</p>
             * 
             * <strong>example:</strong>
             * <p>Deprecated (misused)</p>
             */
            public Builder result(String result) {
                this.result = result;
                return this;
            }

            /**
             * <p>The subtask status. Valid values:</p>
             * <ul>
             * <li>Created: The subtask is created.</li>
             * <li>Running: The subtask is running.</li>
             * <li>Success: The subtask succeeded.</li>
             * <li>Fail: The subtask failed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Jobs build() {
                return new Jobs(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAgentTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetAgentTaskResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("jobs")
        private java.util.List<Jobs> jobs;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("task_id")
        private String taskId;

        private Data(Builder builder) {
            this.jobs = builder.jobs;
            this.status = builder.status;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return jobs
         */
        public java.util.List<Jobs> getJobs() {
            return this.jobs;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private java.util.List<Jobs> jobs; 
            private String status; 
            private String taskId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.jobs = model.jobs;
                this.status = model.status;
                this.taskId = model.taskId;
            } 

            /**
             * <p>The list of subtasks.</p>
             */
            public Builder jobs(java.util.List<Jobs> jobs) {
                this.jobs = jobs;
                return this;
            }

            /**
             * <p>The subtask status. Valid values:</p>
             * <ul>
             * <li>Created: The subtask is created.</li>
             * <li>Running: The subtask is running.</li>
             * <li>Success: The subtask succeeded.</li>
             * <li>Fail: The subtask failed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>c41d8e3506224184a714682fea86d22d</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
