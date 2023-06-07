// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInvocationResultResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInvocationResultResponseBody</p>
 */
public class DescribeInvocationResultResponseBody extends TeaModel {
    @NameInMap("InvocationResult")
    private InvocationResult invocationResult;

    @NameInMap("RequestId")
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
         * The information about the command running result.
         */
        public Builder invocationResult(InvocationResult invocationResult) {
            this.invocationResult = invocationResult;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeInvocationResultResponseBody build() {
            return new DescribeInvocationResultResponseBody(this);
        } 

    } 

    public static class InvocationResult extends TeaModel {
        @NameInMap("ErrorCode")
        private String errorCode;

        @NameInMap("ErrorInfo")
        private String errorInfo;

        @NameInMap("ExitCode")
        private Long exitCode;

        @NameInMap("FinishedTime")
        private String finishedTime;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InvocationStatus")
        private String invocationStatus;

        @NameInMap("InvokeId")
        private String invokeId;

        @NameInMap("InvokeRecordStatus")
        private String invokeRecordStatus;

        @NameInMap("InvokeUser")
        private String invokeUser;

        @NameInMap("Output")
        private String output;

        @NameInMap("StartTime")
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
             * The error code returned when the command cannot be sent or run. Valid values:
             * <p>
             * 
             * *   If this parameter is empty, the command is run normally.
             * *   InstanceNotExists: The instance does not exist or is released.
             * *   InstanceReleased: The instance was released while the command was being run on the instance.
             * *   InstanceNotRunning: The instance is not in the Running state while the command is being run.
             * *   CommandNotApplicable: The command is not applicable to the specified instance.
             * *   AccountNotExists: The specified account does not exist.
             * *   DirectoryNotExists: The specified directory does not exist.
             * *   BadCronExpression: The specified cron expression for the running schedule is invalid.
             * *   ClientNotRunning: The Cloud Assistant client is not running.
             * *   ClientNotResponse: The Cloud Assistant client does not respond.
             * *   ClientIsUpgrading: The Cloud Assistant client is being upgraded.
             * *   ClientNeedUpgrade: The Cloud Assistant client needs to be upgraded.
             * *   DeliveryTimeout: The request for sending the command times out.
             * *   ExecutionTimeout: The running of the command times out.
             * *   ExecutionException: An exception has occurred while the command is being run.
             * *   ExecutionInterrupted: The running of the command is interrupted.
             * *   ExitCodeNonzero: The command finishes running, but the exit code is not 0.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * The error message returned when the command cannot be sent or run. Valid values:
             * <p>
             * 
             * *   If this parameter is empty, the command is run normally.
             * *   the specified instance does not exists: The specified instance does not exist or is released.
             * *   the instance has released when create task: The instance was released while the command was being run on the instance.
             * *   the instance is not running when create task: The instance is not in the Running state while the command is being run.
             * *   the command is not applicable: The command is not applicable to the specified instance.
             * *   the specified account does not exists: The specified account does not exist.
             * *   the specified directory does not exists: The specified directory does not exist.
             * *   the cron job expression is invalid: The specified cron expression for the runing schedule is invalid.
             * *   the aliyun service is not running on the instance: The Cloud Assistance client is not running.
             * *   the aliyun service in the instance does not response: The Cloud Assistant client does not respond.
             * *   the aliyun service in the instance is upgrading now: The Cloud Assistant client is being upgraded.
             * *   the aliyun service in the instance need upgrade: The Cloud Assistant client needs to be upgraded.
             * *   the command delivery has been timeout: The request for sending the command times out.
             * *   the command execution has been timeout: The running of the command times out.
             * *   the command execution got an exception: An exception has occurred while the command is being run.
             * *   the command execution has been interrupted: The running of the command is interrupted.
             * *   the command execution exit code is not zero: The command finishes running, but the exit code is not 0.
             */
            public Builder errorInfo(String errorInfo) {
                this.errorInfo = errorInfo;
                return this;
            }

            /**
             * The exit code of the command task.
             * <p>
             * 
             * *   For Linux instances, the value is the exit code of the shell command.
             * *   For Windows instances, the value is the exit code of the batch or PowerShell command.
             */
            public Builder exitCode(Long exitCode) {
                this.exitCode = exitCode;
                return this;
            }

            /**
             * The time when the command finished running on the instance.
             */
            public Builder finishedTime(String finishedTime) {
                this.finishedTime = finishedTime;
                return this;
            }

            /**
             * The ID of the simple application server.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The status of the command. Valid values:
             * <p>
             * 
             * *   Pending: The command is being verified or sent.
             * *   Invalid: The specified command type or parameter is invalid.
             * *   Aborted: The command failed to be sent. To send a command to an instance, make sure that the instance is in the Running state and the command is sent to the instance within 1 minute.
             * *   Running: The command is being run on the instance.
             * *   Success: The command finishes running, and the exit code is 0.
             * *   Failed: The command finishes running, but the exit code is not 0.
             * *   Error: The running of the command cannot proceed due to an exception.
             * *   Timeout: The running of the command times out.
             * *   Cancelled: The running is canceled, and the command is not run.
             * *   Stopping: The command that is running is being stopped.
             * *   Terminated: The command is terminated while it is being run.
             */
            public Builder invocationStatus(String invocationStatus) {
                this.invocationStatus = invocationStatus;
                return this;
            }

            /**
             * The ID of the command task.
             */
            public Builder invokeId(String invokeId) {
                this.invokeId = invokeId;
                return this;
            }

            /**
             * The status of the command task. Valid values:
             * <p>
             * 
             * *   Running
             * *   Finished
             * *   Failed
             * *   Stopped
             */
            public Builder invokeRecordStatus(String invokeRecordStatus) {
                this.invokeRecordStatus = invokeRecordStatus;
                return this;
            }

            /**
             * The username who runs the command on the simple application server.
             */
            public Builder invokeUser(String invokeUser) {
                this.invokeUser = invokeUser;
                return this;
            }

            /**
             * The command output.
             */
            public Builder output(String output) {
                this.output = output;
                return this;
            }

            /**
             * The time when the command started to be run on the instance.
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
