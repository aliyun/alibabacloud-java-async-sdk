// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInvocationsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInvocationsResponseBody</p>
 */
public class DescribeInvocationsResponseBody extends TeaModel {
    @NameInMap("PageSize")
    private Long pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("PageNumber")
    private Long pageNumber;

    @NameInMap("TotalCount")
    private Long totalCount;

    @NameInMap("Invocations")
    private Invocations invocations;

    private DescribeInvocationsResponseBody(Builder builder) {
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.pageNumber = builder.pageNumber;
        this.totalCount = builder.totalCount;
        this.invocations = builder.invocations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInvocationsResponseBody create() {
        return builder().build();
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
     * @return invocations
     */
    public Invocations getInvocations() {
        return this.invocations;
    }

    public static final class Builder {
        private Long pageSize; 
        private String requestId; 
        private Long pageNumber; 
        private Long totalCount; 
        private Invocations invocations; 

        /**
         * The number of rows per page.
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
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
         * The page number of the query result.
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
         * An array of command execution records.
         */
        public Builder invocations(Invocations invocations) {
            this.invocations = invocations;
            return this;
        }

        public DescribeInvocationsResponseBody build() {
            return new DescribeInvocationsResponseBody(this);
        } 

    } 

    public static class InvokeInstance extends TeaModel {
        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("UpdateTime")
        private String updateTime;

        @NameInMap("FinishTime")
        private String finishTime;

        @NameInMap("InvocationStatus")
        private String invocationStatus;

        @NameInMap("Repeats")
        private Integer repeats;

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

        @NameInMap("Timed")
        private Boolean timed;

        @NameInMap("ErrorCode")
        private String errorCode;

        @NameInMap("InstanceInvokeStatus")
        private String instanceInvokeStatus;

        private InvokeInstance(Builder builder) {
            this.creationTime = builder.creationTime;
            this.updateTime = builder.updateTime;
            this.finishTime = builder.finishTime;
            this.invocationStatus = builder.invocationStatus;
            this.repeats = builder.repeats;
            this.instanceId = builder.instanceId;
            this.output = builder.output;
            this.dropped = builder.dropped;
            this.stopTime = builder.stopTime;
            this.exitCode = builder.exitCode;
            this.startTime = builder.startTime;
            this.errorInfo = builder.errorInfo;
            this.timed = builder.timed;
            this.errorCode = builder.errorCode;
            this.instanceInvokeStatus = builder.instanceInvokeStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InvokeInstance create() {
            return builder().build();
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return finishTime
         */
        public String getFinishTime() {
            return this.finishTime;
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
         * @return timed
         */
        public Boolean getTimed() {
            return this.timed;
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return instanceInvokeStatus
         */
        public String getInstanceInvokeStatus() {
            return this.instanceInvokeStatus;
        }

        public static final class Builder {
            private String creationTime; 
            private String updateTime; 
            private String finishTime; 
            private String invocationStatus; 
            private Integer repeats; 
            private String instanceId; 
            private String output; 
            private Integer dropped; 
            private String stopTime; 
            private Long exitCode; 
            private String startTime; 
            private String errorInfo; 
            private Boolean timed; 
            private String errorCode; 
            private String instanceInvokeStatus; 

            /**
             * The start time of the command.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The time when the command status was updated.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * The end time of the command process.
             */
            public Builder finishTime(String finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * The command progress status of a single instance. Valid values:
             * <p>
             * -Pending: the system is verifying or sending commands.
             * -Invalid: the specified command type or parameter is incorrect.
             * -Aborted: failed to send the command to the instance. The instance must be running and the command can be sent within 1 minute.
             * -Running: the command is Running on the instance.
             * -Success:
             * -Single command: the command is executed and the exit code is 0.
             * -Run the command periodically: the last run succeeds, the exit code is 0, and the specified cycle has ended.
             * -Failed:
             * -Single command: the command is executed and the exit code is not 0.
             * -Run the command periodically: the last run succeeds and the exit code is not 0. The specified cycle is aborted.
             * -Error: an Error occurred while running the command and cannot continue.
             * -Timeout: the command execution times out.
             * -Cancelled: the command execution has been canceled and the command has not been started.
             * -Stopping: the task is being stopped.
             * -Terminated: the command is Terminated when it is run.
             * -Scheduled:
             * -Single-run command: not applicable and does not appear.
             * -Periodically run commands: wait to run.
             */
            public Builder invocationStatus(String invocationStatus) {
                this.invocationStatus = invocationStatus;
                return this;
            }

            /**
             * The number of times that the command is run on the instance.
             * <p>
             * -If the execution mode is single execution, the value is 0 or 1.
             * -If the execution mode is periodic, the value is the number of executions.
             */
            public Builder repeats(Integer repeats) {
                this.repeats = repeats;
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
             * The output information of the command.
             */
            public Builder output(String output) {
                this.output = output;
                return this;
            }

            /**
             * If the text length in the Output field exceeds 24KB, the discarded text length is truncated.
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
             * The exit code of the command process. Possible values:
             * <p>
             * 
             * -Linux instance is the exit code of the Shell process.
             * -Windows the exit code of the Bat or PowerShell process.
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
             * -the instance is not running when create task: the instance is not running when the command is started.
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
             * 
             */
            public Builder errorInfo(String errorInfo) {
                this.errorInfo = errorInfo;
                return this;
            }

            /**
             * Whether the query command will be automatically executed in the future.
             */
            public Builder timed(Boolean timed) {
                this.timed = timed;
                return this;
            }

            /**
             * The code for the reason why the command fails to be issued or executed. Valid values:
             * <p>
             * -Null: The Command runs normally.
             * -InstanceNotExists: the specified instance does not exist or has been released.
             * -InstanceReleased: the instance is released during command execution.
             * -InstanceNotRunning: the instance is not running when the command is started.
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
             * -ExecutionInterrupted: the command execution task is interrupted.
             * -ExitCodeNonzero: the command is executed and the exit code is not 0.
             * 
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * > We do not recommend that you view the return value. We recommend that you view the return value of "InvocationStatus.
             */
            public Builder instanceInvokeStatus(String instanceInvokeStatus) {
                this.instanceInvokeStatus = instanceInvokeStatus;
                return this;
            }

            public InvokeInstance build() {
                return new InvokeInstance(this);
            } 

        } 

    }
    public static class InvokeInstances extends TeaModel {
        @NameInMap("InvokeInstance")
        private java.util.List < InvokeInstance> invokeInstance;

        private InvokeInstances(Builder builder) {
            this.invokeInstance = builder.invokeInstance;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InvokeInstances create() {
            return builder().build();
        }

        /**
         * @return invokeInstance
         */
        public java.util.List < InvokeInstance> getInvokeInstance() {
            return this.invokeInstance;
        }

        public static final class Builder {
            private java.util.List < InvokeInstance> invokeInstance; 

            /**
             * InvokeInstance.
             */
            public Builder invokeInstance(java.util.List < InvokeInstance> invokeInstance) {
                this.invokeInstance = invokeInstance;
                return this;
            }

            public InvokeInstances build() {
                return new InvokeInstances(this);
            } 

        } 

    }
    public static class Invocation extends TeaModel {
        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("Frequency")
        private String frequency;

        @NameInMap("InvocationStatus")
        private String invocationStatus;

        @NameInMap("RepeatMode")
        private String repeatMode;

        @NameInMap("CommandId")
        private String commandId;

        @NameInMap("CommandType")
        private String commandType;

        @NameInMap("InvokeStatus")
        private String invokeStatus;

        @NameInMap("Parameters")
        private String parameters;

        @NameInMap("Timed")
        private Boolean timed;

        @NameInMap("CommandContent")
        private String commandContent;

        @NameInMap("CommandName")
        private String commandName;

        @NameInMap("InvokeId")
        private String invokeId;

        @NameInMap("Username")
        private String username;

        @NameInMap("InvokeInstances")
        private InvokeInstances invokeInstances;

        private Invocation(Builder builder) {
            this.creationTime = builder.creationTime;
            this.frequency = builder.frequency;
            this.invocationStatus = builder.invocationStatus;
            this.repeatMode = builder.repeatMode;
            this.commandId = builder.commandId;
            this.commandType = builder.commandType;
            this.invokeStatus = builder.invokeStatus;
            this.parameters = builder.parameters;
            this.timed = builder.timed;
            this.commandContent = builder.commandContent;
            this.commandName = builder.commandName;
            this.invokeId = builder.invokeId;
            this.username = builder.username;
            this.invokeInstances = builder.invokeInstances;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Invocation create() {
            return builder().build();
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return frequency
         */
        public String getFrequency() {
            return this.frequency;
        }

        /**
         * @return invocationStatus
         */
        public String getInvocationStatus() {
            return this.invocationStatus;
        }

        /**
         * @return repeatMode
         */
        public String getRepeatMode() {
            return this.repeatMode;
        }

        /**
         * @return commandId
         */
        public String getCommandId() {
            return this.commandId;
        }

        /**
         * @return commandType
         */
        public String getCommandType() {
            return this.commandType;
        }

        /**
         * @return invokeStatus
         */
        public String getInvokeStatus() {
            return this.invokeStatus;
        }

        /**
         * @return parameters
         */
        public String getParameters() {
            return this.parameters;
        }

        /**
         * @return timed
         */
        public Boolean getTimed() {
            return this.timed;
        }

        /**
         * @return commandContent
         */
        public String getCommandContent() {
            return this.commandContent;
        }

        /**
         * @return commandName
         */
        public String getCommandName() {
            return this.commandName;
        }

        /**
         * @return invokeId
         */
        public String getInvokeId() {
            return this.invokeId;
        }

        /**
         * @return username
         */
        public String getUsername() {
            return this.username;
        }

        /**
         * @return invokeInstances
         */
        public InvokeInstances getInvokeInstances() {
            return this.invokeInstances;
        }

        public static final class Builder {
            private String creationTime; 
            private String frequency; 
            private String invocationStatus; 
            private String repeatMode; 
            private String commandId; 
            private String commandType; 
            private String invokeStatus; 
            private String parameters; 
            private Boolean timed; 
            private String commandContent; 
            private String commandName; 
            private String invokeId; 
            private String username; 
            private InvokeInstances invokeInstances; 

            /**
             * The time when the task was created.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The execution cycle of a periodic command. The value structure of this parameter is based on the [Cron expression](~~ 64769 ~~).
             */
            public Builder frequency(String frequency) {
                this.frequency = frequency;
                return this;
            }

            /**
             * The total invocation status of the command. The total invocation status depends on the common invocation status of all instances in this call. Valid values:
             * <p>
             * -Pending: The system is verifying or sending commands. If the command execution status of at least one instance is Pending, the total execution status is Pending.
             * -Scheduled: the periodically executed command has been sent and is waiting to run. If the command execution status of at least one instance is Scheduled, the total execution status is Scheduled.
             * -Running: The command is Running on the instance. If the command execution status of at least one instance is Running, the total execution status is Running.
             * -Success: the command execution status on each instance is Stopped or Success, and the command execution status of at least one instance is Success, the total execution status is Success.
             * -Run immediately: the command is executed and the exit code is 0.
             * -Recurring tasks: the last successful execution with the exit code 0 and the specified cycle has been completed.
             * -Failed: If the command execution status on each instance is Stopped or Failed, the total execution status is Failed. When one or more of the command execution statuses on an instance are in the following status, the return value is Failed:
             * -Command verification failed (Invalid)
             * -Command sending failed (Aborted)
             * -Command execution completed but the exit code is not 0(Failed)
             * -Command execution Timeout (Timeout)
             * -Command execution exception (Error)
             * -Stopping: The task is being stopped. If the command execution status of at least one instance is Stopping, the total execution status is Stopping.
             * -Stopped: The task is Stopped. If the command execution status of all instances is Stopped, the total execution status is Stopped. When the command execution status on the instance is as follows, the return value is Stopped:
             * -Task canceled (Cancelled)
             * -Task Terminated (Terminated)
             * -PartialFailed: Some instances are executed successfully and some instances fail. If the command execution status of each instance is Success, Failed, or Stopped, the total execution status is PartialFailed.
             * > "InvokeStatus" in the response parameter has similar meanings to this parameter, but we recommend that you view the return value.
             * 
             */
            public Builder invocationStatus(String invocationStatus) {
                this.invocationStatus = invocationStatus;
                return this;
            }

            /**
             * The command execution method. Possible values:
             * <p>
             * 
             * -Once: run the command immediately.
             * -Period: run the command regularly.
             * -NextRebootOnly: When the instance starts next time, the command is automatically executed.
             * -EveryReboot: The command is automatically executed each time the instance is started.
             */
            public Builder repeatMode(String repeatMode) {
                this.repeatMode = repeatMode;
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
             * The type of the command.
             */
            public Builder commandType(String commandType) {
                this.commandType = commandType;
                return this;
            }

            /**
             * The overall invocation status of the command.
             * <p>
             * > We do not recommend that you view the return value. We recommend that you view the return value of "InvocationStatus.
             */
            public Builder invokeStatus(String invokeStatus) {
                this.invokeStatus = invokeStatus;
                return this;
            }

            /**
             * The custom parameters in the command.
             */
            public Builder parameters(String parameters) {
                this.parameters = parameters;
                return this;
            }

            /**
             * Whether the query command will be automatically executed in the future.
             */
            public Builder timed(Boolean timed) {
                this.timed = timed;
                return this;
            }

            /**
             * The command content, which is Base64-encoded and then transmitted.
             */
            public Builder commandContent(String commandContent) {
                this.commandContent = commandContent;
                return this;
            }

            /**
             * The name of the command.
             */
            public Builder commandName(String commandName) {
                this.commandName = commandName;
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
             * The name of the user who runs the command on the ECS instance.
             */
            public Builder username(String username) {
                this.username = username;
                return this;
            }

            /**
             * The type of the target instance set.
             */
            public Builder invokeInstances(InvokeInstances invokeInstances) {
                this.invokeInstances = invokeInstances;
                return this;
            }

            public Invocation build() {
                return new Invocation(this);
            } 

        } 

    }
    public static class Invocations extends TeaModel {
        @NameInMap("Invocation")
        private java.util.List < Invocation> invocation;

        private Invocations(Builder builder) {
            this.invocation = builder.invocation;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Invocations create() {
            return builder().build();
        }

        /**
         * @return invocation
         */
        public java.util.List < Invocation> getInvocation() {
            return this.invocation;
        }

        public static final class Builder {
            private java.util.List < Invocation> invocation; 

            /**
             * Invocation.
             */
            public Builder invocation(java.util.List < Invocation> invocation) {
                this.invocation = invocation;
                return this;
            }

            public Invocations build() {
                return new Invocations(this);
            } 

        } 

    }
}
