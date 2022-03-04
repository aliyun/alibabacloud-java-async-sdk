// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInvocationResultsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInvocationResultsResponseBody</p>
 */
public class DescribeInvocationResultsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Invocation")
    private Invocation invocation;

    private DescribeInvocationResultsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.invocation = builder.invocation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInvocationResultsResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return invocation
     */
    public Invocation getInvocation() {
        return this.invocation;
    }

    public static final class Builder {
        private String requestId; 
        private Invocation invocation; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The collection of command execution results.
         */
        public Builder invocation(Invocation invocation) {
            this.invocation = invocation;
            return this;
        }

        public DescribeInvocationResultsResponseBody build() {
            return new DescribeInvocationResultsResponseBody(this);
        } 

    } 

    public static class InvocationResult extends TeaModel {
        @NameInMap("InvocationStatus")
        private String invocationStatus;

        @NameInMap("Repeats")
        private Integer repeats;

        @NameInMap("CommandId")
        private String commandId;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("Output")
        private String output;

        @NameInMap("Dropped")
        private Integer dropped;

        @NameInMap("StopTime")
        private String stopTime;

        @NameInMap("ExitCode")
        private Long exitCode;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("ErrorInfo")
        private String errorInfo;

        @NameInMap("ErrorCode")
        private String errorCode;

        @NameInMap("FinishedTime")
        private String finishedTime;

        @NameInMap("InvokeId")
        private String invokeId;

        @NameInMap("InvokeRecordStatus")
        private String invokeRecordStatus;

        @NameInMap("Username")
        private String username;

        private InvocationResult(Builder builder) {
            this.invocationStatus = builder.invocationStatus;
            this.repeats = builder.repeats;
            this.commandId = builder.commandId;
            this.instanceId = builder.instanceId;
            this.output = builder.output;
            this.dropped = builder.dropped;
            this.stopTime = builder.stopTime;
            this.exitCode = builder.exitCode;
            this.startTime = builder.startTime;
            this.errorInfo = builder.errorInfo;
            this.errorCode = builder.errorCode;
            this.finishedTime = builder.finishedTime;
            this.invokeId = builder.invokeId;
            this.invokeRecordStatus = builder.invokeRecordStatus;
            this.username = builder.username;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InvocationResult create() {
            return builder().build();
        }

        /**
         * @return invocationStatus
         */
        public String getInvocationStatus() {
            return this.invocationStatus;
        }

        /**
         * @return repeats
         */
        public Integer getRepeats() {
            return this.repeats;
        }

        /**
         * @return commandId
         */
        public String getCommandId() {
            return this.commandId;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return output
         */
        public String getOutput() {
            return this.output;
        }

        /**
         * @return dropped
         */
        public Integer getDropped() {
            return this.dropped;
        }

        /**
         * @return stopTime
         */
        public String getStopTime() {
            return this.stopTime;
        }

        /**
         * @return exitCode
         */
        public Long getExitCode() {
            return this.exitCode;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return errorInfo
         */
        public String getErrorInfo() {
            return this.errorInfo;
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return finishedTime
         */
        public String getFinishedTime() {
            return this.finishedTime;
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
         * @return username
         */
        public String getUsername() {
            return this.username;
        }

        public static final class Builder {
            private String invocationStatus; 
            private Integer repeats; 
            private String commandId; 
            private String instanceId; 
            private String output; 
            private Integer dropped; 
            private String stopTime; 
            private Long exitCode; 
            private String startTime; 
            private String errorInfo; 
            private String errorCode; 
            private String finishedTime; 
            private String invokeId; 
            private String invokeRecordStatus; 
            private String username; 

            /**
             * The command progress status of a single instance. Valid values:
             * <p>
             * -Pending: the system is verifying or sending commands.
             * -Invalid: the specified command type or parameter is incorrect.
             * -Aborted: failed to send the command to the instance. The instance must be running and the command can be sent within 1 minute.
             * -Running: the command is being executed on the instance.
             * -Success:
             * -Single command: the command is executed and the exit code is 0.
             * -Run periodically: the last run succeeds and the exit code is 0. The specified cycle has ended.
             * -Failed:
             * -Single command: the command is executed and the exit code is not 0.
             * -Periodic invocation: the last invocation succeeds and the exit code is not 0. The specified cycle will be aborted.
             * -Error: an Error occurred while running the command and cannot continue.
             * -Timeout: the command execution times out.
             * -Cancelled: the command execution has been canceled and the command has not been started.
             * -Stopping: the command that is being stopped.
             * -Terminated: the command is Terminated when it is executed.
             * -Scheduled:
             * -Single-run command: not applicable and does not appear.
             * -Periodically executed command: pending execution.
             */
            public Builder invocationStatus(String invocationStatus) {
                this.invocationStatus = invocationStatus;
                return this;
            }

            /**
             * The number of times that the command is run on the instance.
             * <p>
             * -If the execution method is immediate, the value is 0 or 1.
             * -If the execution mode is periodic, the value is the number of executions.
             */
            public Builder repeats(Integer repeats) {
                this.repeats = repeats;
                return this;
            }

            /**
             * The ID of the command.
             */
            public Builder commandId(String commandId) {
                this.commandId = commandId;
                return this;
            }

            /**
             * The ID of the instance.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The output information after the command is executed.
             */
            public Builder output(String output) {
                this.output = output;
                return this;
            }

            /**
             * The length of the text that is truncated and discarded when the length of the "Output" field exceeds 24KB.
             */
            public Builder dropped(Integer dropped) {
                this.dropped = dropped;
                return this;
            }

            /**
             * If "StopInvocation" is called, it indicates the call time.
             */
            public Builder stopTime(String stopTime) {
                this.stopTime = stopTime;
                return this;
            }

            /**
             * The exit code of the command.
             * <p>
             * 
             * -The Linux instance is the exit code of the Shell command.
             * -Windows the exit code of the Bat or PowerShell command.
             */
            public Builder exitCode(Long exitCode) {
                this.exitCode = exitCode;
                return this;
            }

            /**
             * The time when the command starts to run in the instance.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * The error message returned because the command failed to be issued or failed to be executed. Valid values:
             * <p>
             * -Null: The Command runs normally.
             * -the specified instance does not exist: the specified instance does not exist or has been released.
             * -the instance has released when create task: the instance is released during command execution.
             * -the instance is not running when create task: the instance is not running when the command is executed.
             * -the command is not applicable: the command does not apply to the specified instance.
             * -the specified account does not exist.
             * -the specified directory does not exist.
             * -the cron job expression is invalid: the specified periodic expression is invalid.
             * -the aliyun service is not running on the instance: the cloud assistant client is not running.
             * -the aliyun service in the instance does not response: the cloud assistant client does not respond.
             * -the aliyun service in the instance is upgrading now: the cloud assistant client is being upgraded.
             * -the aliyun service in the instance need upgrade: the cloud assistant client needs to be upgraded.
             * -the command delivery has been timeout.
             * -the command execution has been timed out.
             * -the command execution got an exception.
             * -the command execution has been interrupted.
             * -the command execution exit code is not zero: the command execution ends and the exit code is not zero.
             */
            public Builder errorInfo(String errorInfo) {
                this.errorInfo = errorInfo;
                return this;
            }

            /**
             * The code for the reason why the command fails to be issued or executed. Valid values:
             * <p>
             * -Null: The Command runs normally.
             * -InstanceNotExists: the specified instance does not exist or has been released.
             * -InstanceReleased: the instance is released during command execution.
             * -InstanceNotRunning: the instance is not running when the command is executed.
             * -CommandNotApplicable: the command does not apply to the specified instance.
             * -AccountNotExists: the specified account does not exist.
             * -DirectoryNotExists: the specified directory does not exist.
             * -BadCronExpression: the specified periodic expression is invalid.
             * -ClientNotRunning: The cloud assistant client is not running.
             * -ClientNotResponse: The cloud assistant client does not respond.
             * -ClientIsUpgrading: The cloud assistant client is being upgraded.
             * -ClientNeedUpgrade: The cloud assistant client needs to be upgraded.
             * -DeliveryTimeout: the sending command timed out.
             * -ExecutionTimeout: the command execution times out.
             * -ExecutionException: command execution exception occurs.
             * -ExecutionInterrupted: the command execution is interrupted.
             * -ExitCodeNonzero: The command is executed and the exit code is not 0.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * The completion time of the command. If the command execution times out, the completion time of the command execution is subject to the parameter CreateCommand specified in [TimedOut](~~ 64844 ~~).
             */
            public Builder finishedTime(String finishedTime) {
                this.finishedTime = finishedTime;
                return this;
            }

            /**
             * The ID of the command execution.
             */
            public Builder invokeId(String invokeId) {
                this.invokeId = invokeId;
                return this;
            }

            /**
             * The command execution status.
             */
            public Builder invokeRecordStatus(String invokeRecordStatus) {
                this.invokeRecordStatus = invokeRecordStatus;
                return this;
            }

            /**
             * The name of the user who runs the command on the ECS instance.
             */
            public Builder username(String username) {
                this.username = username;
                return this;
            }

            public InvocationResult build() {
                return new InvocationResult(this);
            } 

        } 

    }
    public static class InvocationResults extends TeaModel {
        @NameInMap("InvocationResult")
        private java.util.List < InvocationResult> invocationResult;

        private InvocationResults(Builder builder) {
            this.invocationResult = builder.invocationResult;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InvocationResults create() {
            return builder().build();
        }

        /**
         * @return invocationResult
         */
        public java.util.List < InvocationResult> getInvocationResult() {
            return this.invocationResult;
        }

        public static final class Builder {
            private java.util.List < InvocationResult> invocationResult; 

            /**
             * InvocationResult.
             */
            public Builder invocationResult(java.util.List < InvocationResult> invocationResult) {
                this.invocationResult = invocationResult;
                return this;
            }

            public InvocationResults build() {
                return new InvocationResults(this);
            } 

        } 

    }
    public static class Invocation extends TeaModel {
        @NameInMap("PageSize")
        private Long pageSize;

        @NameInMap("PageNumber")
        private Long pageNumber;

        @NameInMap("TotalCount")
        private Long totalCount;

        @NameInMap("InvocationResults")
        private InvocationResults invocationResults;

        private Invocation(Builder builder) {
            this.pageSize = builder.pageSize;
            this.pageNumber = builder.pageNumber;
            this.totalCount = builder.totalCount;
            this.invocationResults = builder.invocationResults;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Invocation create() {
            return builder().build();
        }

        /**
         * @return pageSize
         */
        public Long getPageSize() {
            return this.pageSize;
        }

        /**
         * @return pageNumber
         */
        public Long getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        /**
         * @return invocationResults
         */
        public InvocationResults getInvocationResults() {
            return this.invocationResults;
        }

        public static final class Builder {
            private Long pageSize; 
            private Long pageNumber; 
            private Long totalCount; 
            private InvocationResults invocationResults; 

            /**
             * The number of entries to return on each page.
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The current page number.
             */
            public Builder pageNumber(Long pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * The total number of commands.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * The result set of command execution.
             */
            public Builder invocationResults(InvocationResults invocationResults) {
                this.invocationResults = invocationResults;
                return this;
            }

            public Invocation build() {
                return new Invocation(this);
            } 

        } 

    }
}
