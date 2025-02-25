// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

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
 * {@link DescribeInvocationResultResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInvocationResultResponseBody</p>
 */
public class DescribeInvocationResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InvocationResult")
    private InvocationResult invocationResult;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeInvocationResultResponseBody(Builder builder) {
        this.invocationResult = builder.invocationResult;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInvocationResultResponseBody create() {
        return builder().build();
    }

    /**
     * @return invocationResult
     */
    public InvocationResult getInvocationResult() {
        return this.invocationResult;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private InvocationResult invocationResult; 
        private String requestId; 

        /**
         * <p>The execution results.</p>
         */
        public Builder invocationResult(InvocationResult invocationResult) {
            this.invocationResult = invocationResult;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>20758A-585D-4A41-A9B2-28DA8F4F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeInvocationResultResponseBody build() {
            return new DescribeInvocationResultResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInvocationResultResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInvocationResultResponseBody</p>
     */
    public static class InvocationResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ErrorInfo")
        private String errorInfo;

        @com.aliyun.core.annotation.NameInMap("ExitCode")
        private Long exitCode;

        @com.aliyun.core.annotation.NameInMap("FinishedTime")
        private String finishedTime;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InvocationStatus")
        private String invocationStatus;

        @com.aliyun.core.annotation.NameInMap("InvokeId")
        private String invokeId;

        @com.aliyun.core.annotation.NameInMap("InvokeRecordStatus")
        private String invokeRecordStatus;

        @com.aliyun.core.annotation.NameInMap("InvokeUser")
        private String invokeUser;

        @com.aliyun.core.annotation.NameInMap("Output")
        private String output;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        private InvocationResult(Builder builder) {
            this.errorCode = builder.errorCode;
            this.errorInfo = builder.errorInfo;
            this.exitCode = builder.exitCode;
            this.finishedTime = builder.finishedTime;
            this.instanceId = builder.instanceId;
            this.invocationStatus = builder.invocationStatus;
            this.invokeId = builder.invokeId;
            this.invokeRecordStatus = builder.invokeRecordStatus;
            this.invokeUser = builder.invokeUser;
            this.output = builder.output;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InvocationResult create() {
            return builder().build();
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return errorInfo
         */
        public String getErrorInfo() {
            return this.errorInfo;
        }

        /**
         * @return exitCode
         */
        public Long getExitCode() {
            return this.exitCode;
        }

        /**
         * @return finishedTime
         */
        public String getFinishedTime() {
            return this.finishedTime;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return invocationStatus
         */
        public String getInvocationStatus() {
            return this.invocationStatus;
        }

        /**
         * @return invokeId
         */
        public String getInvokeId() {
            return this.invokeId;
        }

        /**
         * @return invokeRecordStatus
         */
        public String getInvokeRecordStatus() {
            return this.invokeRecordStatus;
        }

        /**
         * @return invokeUser
         */
        public String getInvokeUser() {
            return this.invokeUser;
        }

        /**
         * @return output
         */
        public String getOutput() {
            return this.output;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private String errorCode; 
            private String errorInfo; 
            private Long exitCode; 
            private String finishedTime; 
            private String instanceId; 
            private String invocationStatus; 
            private String invokeId; 
            private String invokeRecordStatus; 
            private String invokeUser; 
            private String output; 
            private String startTime; 

            /**
             * <p>The error code that is returned if the command failed to be sent or executed.</p>
             * <ul>
             * <li>If this parameter is empty, the command is executed normally.</li>
             * <li>InstanceNotExists: The specified server does not exist or is released.</li>
             * <li>InstanceReleased: The server was released while the command was being executed on the server.</li>
             * <li>InstanceNotRunning: The server is not in the Running state while the command is being executed.</li>
             * <li>CommandNotApplicable: The command is not applicable to the specified server.</li>
             * <li>AccountNotExists: The specified account does not exist.</li>
             * <li>DirectoryNotExists: The specified directory does not exist.</li>
             * <li>BadCronExpression: The specified cron expression for the execution schedule is invalid.</li>
             * <li>ClientNotRunning: The Cloud Assistant client is not running.</li>
             * <li>ClientNotResponse: The Cloud Assistant client does not respond.</li>
             * <li>ClientIsUpgrading: The Cloud Assistant client is being upgraded.</li>
             * <li>ClientNeedUpgrade: The Cloud Assistant client needs to be upgraded.</li>
             * <li>DeliveryTimeout: Command sending times out.</li>
             * <li>ExecutionTimeout: The execution times out.</li>
             * <li>ExecutionException: An exception occurs while the command is being executed.</li>
             * <li>ExecutionInterrupted: The execution is interrupted.</li>
             * <li>ExitCodeNonzero: The execution is complete, but the exit code is not 0.</li>
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
             * <p>The error message returned when the command is not successfully sent or executed. Valid values:</p>
             * <ul>
             * <li>If this parameter is empty, the command is executed normally.</li>
             * <li>the specified instance does not exists: The specified server does not exist or is released.</li>
             * <li>the instance has released when create task: The server was released while the command was being executed on the server.</li>
             * <li>the instance is not running when create task: The server is not in the Running state while the command is being executed.</li>
             * <li>the command is not applicable: The command is not applicable to the specified server.</li>
             * <li>the specified account does not exists: The specified account does not exist.</li>
             * <li>the specified directory does not exists: The specified directory does not exist.</li>
             * <li>the cron job expression is invalid: The specified cron expression is invalid.</li>
             * <li>the aliyun service is not running on the instance: The Cloud Assistance client is not running.</li>
             * <li>the aliyun service in the instance does not response: The Cloud Assistant client does not respond to your request.</li>
             * <li>the aliyun service in the instance is upgrading now: The Cloud Assistant client is being upgraded.</li>
             * <li>the aliyun service in the instance need upgrade: The Cloud Assistant client needs to be upgraded.</li>
             * <li>the command delivery has been timeout: Command sending times out.</li>
             * <li>the command execution has been timeout: The execution times out.</li>
             * <li>the command execution got an exception: An exception occurs while the command is being executed.</li>
             * <li>the command execution has been interrupted: The execution is interrupted.</li>
             * <li>the command execution exit code is not zero: The execution is complete, and the exit code is not 0.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>the specified instance does not exists</p>
             */
            public Builder errorInfo(String errorInfo) {
                this.errorInfo = errorInfo;
                return this;
            }

            /**
             * <p>The exit code of the command.</p>
             * <ul>
             * <li>For Linux instances, the exit code is the exit code of the shell command.</li>
             * <li>For Windows instances, the exit code is the exit code of the batch or PowerShell command.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder exitCode(Long exitCode) {
                this.exitCode = exitCode;
                return this;
            }

            /**
             * <p>The time when the execution ended.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-07-11T06:37:17Z</p>
             */
            public Builder finishedTime(String finishedTime) {
                this.finishedTime = finishedTime;
                return this;
            }

            /**
             * <p>The ID of the simple application server.</p>
             * 
             * <strong>example:</strong>
             * <p>ace0706b2ac4454d984295a94213****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The status of the execution progress. Valid values:</p>
             * <ul>
             * <li>Pending: The command is being verified or sent.</li>
             * <li>Invalid: The specified command type or parameter is invalid.</li>
             * <li>Aborted: The command fails to be sent to the server. To send a command to a server, make sure that the server is in the Running state and the command can be sent within 1 minute.</li>
             * <li>Running: The command is being executed on the server.</li>
             * <li>Success: The execution is completed, and the exit code is 0.</li>
             * <li>Failed: The execution is completed, and the exit code is not 0.</li>
             * <li>Error: The execution cannot proceed due to an exception.</li>
             * <li>Timeout: The execution times out.</li>
             * <li>Cancelled: The execution is canceled, and the command is not executed.</li>
             * <li>Stopping: The command in the Running state is being stopped.</li>
             * <li>Terminated: The command is terminated while it is being executed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
             */
            public Builder invocationStatus(String invocationStatus) {
                this.invocationStatus = invocationStatus;
                return this;
            }

            /**
             * <p>The execution ID.</p>
             * 
             * <strong>example:</strong>
             * <p>t-bj02prjje65****</p>
             */
            public Builder invokeId(String invokeId) {
                this.invokeId = invokeId;
                return this;
            }

            /**
             * <p>The status of the execution. Valid values:</p>
             * <ul>
             * <li>Running</li>
             * <li>Finished</li>
             * <li>Failed</li>
             * <li>Stopped</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Finished</p>
             */
            public Builder invokeRecordStatus(String invokeRecordStatus) {
                this.invokeRecordStatus = invokeRecordStatus;
                return this;
            }

            /**
             * <p>The username who executes the command on the simple application server.</p>
             * 
             * <strong>example:</strong>
             * <p>root</p>
             */
            public Builder invokeUser(String invokeUser) {
                this.invokeUser = invokeUser;
                return this;
            }

            /**
             * <p>The command output.</p>
             * 
             * <strong>example:</strong>
             * <p>YWRtaW4K</p>
             */
            public Builder output(String output) {
                this.output = output;
                return this;
            }

            /**
             * <p>The time when the execution started.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-07-11T06:37:16Z</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            public InvocationResult build() {
                return new InvocationResult(this);
            } 

        } 

    }
}
