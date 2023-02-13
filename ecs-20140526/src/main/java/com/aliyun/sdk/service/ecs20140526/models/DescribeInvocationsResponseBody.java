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
    @NameInMap("Invocations")
    private Invocations invocations;

    @NameInMap("PageNumber")
    private Long pageNumber;

    @NameInMap("PageSize")
    private Long pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Long totalCount;

    private DescribeInvocationsResponseBody(Builder builder) {
        this.invocations = builder.invocations;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInvocationsResponseBody create() {
        return builder().build();
    }

    /**
     * @return invocations
     */
    public Invocations getInvocations() {
        return this.invocations;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
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
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Invocations invocations; 
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 
        private Long totalCount; 

        /**
         * Details about the command executions.
         */
        public Builder invocations(Invocations invocations) {
            this.invocations = invocations;
            return this;
        }

        /**
         * The page number of the returned page.
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned per page.
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
         * The total number of the commands.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeInvocationsResponseBody build() {
            return new DescribeInvocationsResponseBody(this);
        } 

    } 

    public static class InvokeInstance extends TeaModel {
        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("Dropped")
        private Integer dropped;

        @NameInMap("ErrorCode")
        private String errorCode;

        @NameInMap("ErrorInfo")
        private String errorInfo;

        @NameInMap("ExitCode")
        private Long exitCode;

        @NameInMap("FinishTime")
        private String finishTime;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InstanceInvokeStatus")
        private String instanceInvokeStatus;

        @NameInMap("InvocationStatus")
        private String invocationStatus;

        @NameInMap("Output")
        private String output;

        @NameInMap("Repeats")
        private Integer repeats;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("StopTime")
        private String stopTime;

        @NameInMap("Timed")
        private Boolean timed;

        @NameInMap("UpdateTime")
        private String updateTime;

        private InvokeInstance(Builder builder) {
            this.creationTime = builder.creationTime;
            this.dropped = builder.dropped;
            this.errorCode = builder.errorCode;
            this.errorInfo = builder.errorInfo;
            this.exitCode = builder.exitCode;
            this.finishTime = builder.finishTime;
            this.instanceId = builder.instanceId;
            this.instanceInvokeStatus = builder.instanceInvokeStatus;
            this.invocationStatus = builder.invocationStatus;
            this.output = builder.output;
            this.repeats = builder.repeats;
            this.startTime = builder.startTime;
            this.stopTime = builder.stopTime;
            this.timed = builder.timed;
            this.updateTime = builder.updateTime;
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
         * @return dropped
         */
        public Integer getDropped() {
            return this.dropped;
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
         * @return finishTime
         */
        public String getFinishTime() {
            return this.finishTime;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceInvokeStatus
         */
        public String getInstanceInvokeStatus() {
            return this.instanceInvokeStatus;
        }

        /**
         * @return invocationStatus
         */
        public String getInvocationStatus() {
            return this.invocationStatus;
        }

        /**
         * @return output
         */
        public String getOutput() {
            return this.output;
        }

        /**
         * @return repeats
         */
        public Integer getRepeats() {
            return this.repeats;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return stopTime
         */
        public String getStopTime() {
            return this.stopTime;
        }

        /**
         * @return timed
         */
        public Boolean getTimed() {
            return this.timed;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String creationTime; 
            private Integer dropped; 
            private String errorCode; 
            private String errorInfo; 
            private Long exitCode; 
            private String finishTime; 
            private String instanceId; 
            private String instanceInvokeStatus; 
            private String invocationStatus; 
            private String output; 
            private Integer repeats; 
            private String startTime; 
            private String stopTime; 
            private Boolean timed; 
            private String updateTime; 

            /**
             * The start time of the execution.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The size of the text that is truncated and discarded when the Output value exceeds 24 KB in size.
             */
            public Builder dropped(Integer dropped) {
                this.dropped = dropped;
                return this;
            }

            /**
             * The code that indicates why the command failed to be sent or run. Valid values:
             * <p>
             * 
             * *   If this parameter is empty, the execution is normal.
             * *   InstanceNotExists: The instance does not exist or was released.
             * *   InstanceReleased: The instance was released while the command was being run.
             * *   InstanceNotRunning: The instance was not in the Running state while the command started to be run.
             * *   CommandNotApplicable: The command is not applicable to the specified instance.
             * *   AccountNotExists: The specified account does not exist.
             * *   DirectoryNotExists: The specified directory does not exist.
             * *   BadCronExpression: The cron expression used to specify a schedule is invalid.
             * *   ClientNotRunning: The Cloud Assistant client is not running.
             * *   ClientNotResponse: The Cloud Assistant client does not respond.
             * *   ClientIsUpgrading: The Cloud Assistant client is being upgraded.
             * *   ClientNeedUpgrade: The Cloud Assistant client needs to be upgraded.
             * *   DeliveryTimeout: The request to send the command timed out.
             * *   ExecutionTimeout: The execution timed out.
             * *   ExecutionException: An exception occurs while the command is being run.
             * *   ExecutionInterrupted: The execution was interrupted.
             * *   ExitCodeNonzero: The execution is complete, but the exit code is not 0.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * Details about the reason why the command failed to be sent or run. Valid values:
             * <p>
             * 
             * *   If this parameter is empty, the execution is normal.
             * *   the specified instance does not exists
             * *   the instance has released when create task
             * *   the instance is not running when create task
             * *   the command is not applicable
             * *   the specified account does not exists
             * *   the specified directory does not exists
             * *   the cron job expression is invalid
             * *   the aliyun service is not running on the instance
             * *   the aliyun service in the instance does not response
             * *   the aliyun service in the instance is upgrading now
             * *   the aliyun service in the instance is upgrading now
             * *   the command delivery has been timeout
             * *   the command execution has been timeout
             * *   the command execution got an exception
             * *   the command execution has been interrupted
             * *   the command execution exit code is not zero
             */
            public Builder errorInfo(String errorInfo) {
                this.errorInfo = errorInfo;
                return this;
            }

            /**
             * The exit code of the execution. Valid values:
             * <p>
             * 
             * *   For Linux instances, the exit code is the exit code of the shell process.
             * *   For Windows instances, the exit code is the exit code of the batch or PowerShell process.
             */
            public Builder exitCode(Long exitCode) {
                this.exitCode = exitCode;
                return this;
            }

            /**
             * The end time of the execution.
             */
            public Builder finishTime(String finishTime) {
                this.finishTime = finishTime;
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
             * The execution state on a single instance.
             * <p>
             * 
             * > We recommend that you ignore this parameter and check the value of the `InvocationStatus` response parameter for the overall execution state.
             */
            public Builder instanceInvokeStatus(String instanceInvokeStatus) {
                this.instanceInvokeStatus = instanceInvokeStatus;
                return this;
            }

            /**
             * The execution state on a single instance. Valid values:
             * <p>
             * 
             * *   Pending: The command is being verified or sent.
             * 
             * *   Invalid: The specified command type or parameter is invalid.
             * 
             * *   Aborted: The command failed to be sent. To send a command to an instance, make sure that the instance is in the Running state and that the command is sent within 1 minute.
             * 
             * *   Running: The command is being run on the instance.
             * 
             * *   Success:
             * 
             *     *   Command that is set to run only once: The execution is complete, and the exit code is 0.
             *     *   Command that is set to run on a schedule: The previous execution is complete, the exit code is 0, and the specified cycle ends.
             * 
             * *   Failed:
             * 
             *     *   Command that is set to run only once: The execution is complete, but the exit code is not 0.
             *     *   Command that is set to run on a schedule: The previous execution is complete, the exit code is not 0, and the specified cycle is about to end.
             * 
             * *   Error: The execution cannot proceed due to an exception.
             * 
             * *   Timeout: The execution times out.
             * 
             * *   Cancelled: The execution is canceled, and the command is not started.
             * 
             * *   Stopping: The command task is being stopped.
             * 
             * *   Terminated: The command task is terminated while it is being run.
             * 
             * *   Scheduled:
             * 
             *     *   Command that is set to run only once: The overall execution state can never be Scheduled.
             *     *   Command that is set to run on a schedule: The command is pending execution.
             */
            public Builder invocationStatus(String invocationStatus) {
                this.invocationStatus = invocationStatus;
                return this;
            }

            /**
             * The output of the command.
             */
            public Builder output(String output) {
                this.output = output;
                return this;
            }

            /**
             * The number of times that the command is run on the instance.
             * <p>
             * 
             * *   If the execution is a one-time execution, the value is 0 or 1.
             * *   If the execution is a scheduled execution, the value is the number of times that the command is run.
             */
            public Builder repeats(Integer repeats) {
                this.repeats = repeats;
                return this;
            }

            /**
             * The time when the command started to be run on the instance.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * The time when the command stopped being run on the instance. If you call the `StopInvocation` operation to manually stop the execution, the value is the time when you called the operation.
             */
            public Builder stopTime(String stopTime) {
                this.stopTime = stopTime;
                return this;
            }

            /**
             * Indicates whether the command is to be automatically run.
             */
            public Builder timed(Boolean timed) {
                this.timed = timed;
                return this;
            }

            /**
             * The time when the execution state was updated.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
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
    public static class Tag extends TeaModel {
        @NameInMap("TagKey")
        private String tagKey;

        @NameInMap("TagValue")
        private String tagValue;

        private Tag(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        public static final class Builder {
            private String tagKey; 
            private String tagValue; 

            /**
             * The tag key of the command task.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * The tag value of the command task.
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
    public static class Tags extends TeaModel {
        @NameInMap("Tag")
        private java.util.List < Tag> tag;

        private Tags(Builder builder) {
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tag
         */
        public java.util.List < Tag> getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List < Tag> tag; 

            /**
             * Tag.
             */
            public Builder tag(java.util.List < Tag> tag) {
                this.tag = tag;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    public static class Invocation extends TeaModel {
        @NameInMap("CommandContent")
        private String commandContent;

        @NameInMap("CommandDescription")
        private String commandDescription;

        @NameInMap("CommandId")
        private String commandId;

        @NameInMap("CommandName")
        private String commandName;

        @NameInMap("CommandType")
        private String commandType;

        @NameInMap("ContainerId")
        private String containerId;

        @NameInMap("ContainerName")
        private String containerName;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("Frequency")
        private String frequency;

        @NameInMap("InvocationStatus")
        private String invocationStatus;

        @NameInMap("InvokeId")
        private String invokeId;

        @NameInMap("InvokeInstances")
        private InvokeInstances invokeInstances;

        @NameInMap("InvokeStatus")
        private String invokeStatus;

        @NameInMap("Parameters")
        private String parameters;

        @NameInMap("RepeatMode")
        private String repeatMode;

        @NameInMap("Tags")
        private Tags tags;

        @NameInMap("Timed")
        private Boolean timed;

        @NameInMap("Timeout")
        private Long timeout;

        @NameInMap("Username")
        private String username;

        @NameInMap("WorkingDir")
        private String workingDir;

        private Invocation(Builder builder) {
            this.commandContent = builder.commandContent;
            this.commandDescription = builder.commandDescription;
            this.commandId = builder.commandId;
            this.commandName = builder.commandName;
            this.commandType = builder.commandType;
            this.containerId = builder.containerId;
            this.containerName = builder.containerName;
            this.creationTime = builder.creationTime;
            this.frequency = builder.frequency;
            this.invocationStatus = builder.invocationStatus;
            this.invokeId = builder.invokeId;
            this.invokeInstances = builder.invokeInstances;
            this.invokeStatus = builder.invokeStatus;
            this.parameters = builder.parameters;
            this.repeatMode = builder.repeatMode;
            this.tags = builder.tags;
            this.timed = builder.timed;
            this.timeout = builder.timeout;
            this.username = builder.username;
            this.workingDir = builder.workingDir;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Invocation create() {
            return builder().build();
        }

        /**
         * @return commandContent
         */
        public String getCommandContent() {
            return this.commandContent;
        }

        /**
         * @return commandDescription
         */
        public String getCommandDescription() {
            return this.commandDescription;
        }

        /**
         * @return commandId
         */
        public String getCommandId() {
            return this.commandId;
        }

        /**
         * @return commandName
         */
        public String getCommandName() {
            return this.commandName;
        }

        /**
         * @return commandType
         */
        public String getCommandType() {
            return this.commandType;
        }

        /**
         * @return containerId
         */
        public String getContainerId() {
            return this.containerId;
        }

        /**
         * @return containerName
         */
        public String getContainerName() {
            return this.containerName;
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
         * @return invokeId
         */
        public String getInvokeId() {
            return this.invokeId;
        }

        /**
         * @return invokeInstances
         */
        public InvokeInstances getInvokeInstances() {
            return this.invokeInstances;
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
         * @return repeatMode
         */
        public String getRepeatMode() {
            return this.repeatMode;
        }

        /**
         * @return tags
         */
        public Tags getTags() {
            return this.tags;
        }

        /**
         * @return timed
         */
        public Boolean getTimed() {
            return this.timed;
        }

        /**
         * @return timeout
         */
        public Long getTimeout() {
            return this.timeout;
        }

        /**
         * @return username
         */
        public String getUsername() {
            return this.username;
        }

        /**
         * @return workingDir
         */
        public String getWorkingDir() {
            return this.workingDir;
        }

        public static final class Builder {
            private String commandContent; 
            private String commandDescription; 
            private String commandId; 
            private String commandName; 
            private String commandType; 
            private String containerId; 
            private String containerName; 
            private String creationTime; 
            private String frequency; 
            private String invocationStatus; 
            private String invokeId; 
            private InvokeInstances invokeInstances; 
            private String invokeStatus; 
            private String parameters; 
            private String repeatMode; 
            private Tags tags; 
            private Boolean timed; 
            private Long timeout; 
            private String username; 
            private String workingDir; 

            /**
             * The Base64-encoded command content.
             */
            public Builder commandContent(String commandContent) {
                this.commandContent = commandContent;
                return this;
            }

            /**
             * The description of the command.
             */
            public Builder commandDescription(String commandDescription) {
                this.commandDescription = commandDescription;
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
             * The name of the command.
             */
            public Builder commandName(String commandName) {
                this.commandName = commandName;
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
             * The ID of the container.
             */
            public Builder containerId(String containerId) {
                this.containerId = containerId;
                return this;
            }

            /**
             * The name of the container.
             */
            public Builder containerName(String containerName) {
                this.containerName = containerName;
                return this;
            }

            /**
             * The time when the command task was created.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The schedule on which to run the command. For information about the value specifications, see [Cron expression](~~64769~~).
             */
            public Builder frequency(String frequency) {
                this.frequency = frequency;
                return this;
            }

            /**
             * The overall execution state of the command. The value of this parameter depends on the execution states on all the involved instances. Valid values:
             * <p>
             * 
             * *   Pending: The command is being verified or sent. When the execution state on at least one instance is Pending, the overall execution state is Pending.
             * 
             * *   Scheduled: The command scheduled to run is sent and pending execution. When the execution state on at least one instance is Scheduled, the overall execution state is Scheduled.
             * 
             * *   Running: The command is being run on the instances. When the execution state on at least one instance is Running, the overall execution state is Running.
             * 
             * *   Success: When the execution state on at least one instance is Success and the execution state on other instances is Stopped or Success, the overall execution state is Success.
             * 
             *     *   Command that is set to run only once: The execution is complete, and the exit code is 0.
             *     *   Command that is set to run on a schedule: The last execution is complete, the exit code is 0, and the specified cycle ends.
             * 
             * *   Failed: When the execution state on all instances is Stopped or Failed, the overall execution state is Failed. When the execution state on an instance is one of the following values, Failed is returned as the overall execution state:
             * 
             *     *   Invalid: The command is invalid.
             *     *   Aborted: The command failed to be sent.
             *     *   Failed: The command execution is complete, but the exit code is not 0.
             *     *   Timeout: The execution timed out.
             *     *   Error: An error occurred while the command was being run on the instance.
             * 
             * *   Stopping: The command task is being stopped. When the execution state on at least one instance is Stopping, the overall execution state is Stopping.
             * 
             * *   Stopped: The command task is stopped. When the execution state on all instances is Stopped, the overall execution state is Stopped. When the execution state on an instance is one of the following values, Stopped is returned as the overall execution state:
             * 
             *     *   Cancelled: The command task is canceled.
             *     *   Terminated: The command task is terminated.
             * 
             * *   PartialFailed: The execution is complete on some instances and fails on other instances. When the execution state is Success on some instances and is Failed or Stopped on other instances, the overall execution state is PartialFailed.
             * 
             * > The `InvokeStatus` response parameter functions similarly to this parameter. We recommend that you ignore InvokeStatus and check the value of InvocationStatus.
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
             * Details about the instances on which the command is run.
             */
            public Builder invokeInstances(InvokeInstances invokeInstances) {
                this.invokeInstances = invokeInstances;
                return this;
            }

            /**
             * The overall execution state of the command.
             * <p>
             * 
             * > We recommend that you ignore this parameter and check the value of the `InvocationStatus` response parameter for the overall execution state.
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
             * The execution mode of the command. Valid values:
             * <p>
             * 
             * *   Once: The command is immediately run.
             * *   Period: The command is run on a schedule.
             * *   NextRebootOnly: The command is automatically run the next time the instance starts.
             * *   EveryReboot: The command is automatically run every time the instance starts.
             */
            public Builder repeatMode(String repeatMode) {
                this.repeatMode = repeatMode;
                return this;
            }

            /**
             * The tags of the command task.
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * Indicates whether the command is to be automatically run.
             */
            public Builder timed(Boolean timed) {
                this.timed = timed;
                return this;
            }

            /**
             * The maximum timeout period for the command execution on the instance. Unit: seconds.
             * <p>
             * 
             * When a command cannot be run, the command execution times out. When a command execution times out, the Cloud Assistant client forcefully terminates the command process by canceling the PID of the command.
             */
            public Builder timeout(Long timeout) {
                this.timeout = timeout;
                return this;
            }

            /**
             * The username that was used to run the command on the instance.
             */
            public Builder username(String username) {
                this.username = username;
                return this;
            }

            /**
             * The execution path of the command.
             */
            public Builder workingDir(String workingDir) {
                this.workingDir = workingDir;
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
