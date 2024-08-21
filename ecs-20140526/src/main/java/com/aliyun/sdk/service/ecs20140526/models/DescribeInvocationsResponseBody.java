// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInvocationsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInvocationsResponseBody</p>
 */
public class DescribeInvocationsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Invocations")
    private Invocations invocations;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribeInvocationsResponseBody(Builder builder) {
        this.invocations = builder.invocations;
        this.nextToken = builder.nextToken;
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
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
        private String nextToken; 
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
         * A pagination token. It can be used in the next request to retrieve a new page of results.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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
         * The number of entries returned on each page.
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The request ID.
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
        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Dropped")
        private Integer dropped;

        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ErrorInfo")
        private String errorInfo;

        @com.aliyun.core.annotation.NameInMap("ExitCode")
        private Long exitCode;

        @com.aliyun.core.annotation.NameInMap("FinishTime")
        private String finishTime;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceInvokeStatus")
        private String instanceInvokeStatus;

        @com.aliyun.core.annotation.NameInMap("InvocationStatus")
        private String invocationStatus;

        @com.aliyun.core.annotation.NameInMap("Output")
        private String output;

        @com.aliyun.core.annotation.NameInMap("Repeats")
        private Integer repeats;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("StopTime")
        private String stopTime;

        @com.aliyun.core.annotation.NameInMap("Timed")
        private Boolean timed;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
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
             * The time when the command task was created.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The size of the Output text that was truncated and discarded because the Output value exceeded 24 KB in size.
             */
            public Builder dropped(Integer dropped) {
                this.dropped = dropped;
                return this;
            }

            /**
             * The error code for the failure to send or run the command. Valid values:
             * <p>
             * 
             * *   If this parameter is empty, the command was run as expected.
             * *   InstanceNotExists: The specified instance did not exist or was released.
             * *   InstanceReleased: The instance was released while the command was being run.
             * *   InstanceNotRunning: The instance was not running when the command started to be run.
             * *   CommandNotApplicable: The command was inapplicable to the specified instance.
             * *   AccountNotExists: The username specified to run the command did not exist.
             * *   DirectoryNotExists: The specified directory did not exist.
             * *   BadCronExpression: The specified cron expression for the execution schedule was invalid.
             * *   ClientNotRunning: Cloud Assistant Agent was not running.
             * *   ClientNotResponse: Cloud Assistant Agent did not respond.
             * *   ClientIsUpgrading: Cloud Assistant Agent was being upgraded.
             * *   ClientNeedUpgrade: Cloud Assistant Agent needed to be upgraded.
             * *   DeliveryTimeout: The request to send the command timed out.
             * *   ExecutionTimeout: The execution timed out.
             * *   ExecutionException: An exception occurred while the command was being executed.
             * *   ExecutionInterrupted: The command task was interrupted.
             * *   ExitCodeNonzero: The execution was complete, but the exit code was not 0.
             * *   SecurityGroupRuleDenied: Access to Cloud Assistant was denied by security group rules.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * The error message returned when the command failed to be sent or run. Valid values:
             * <p>
             * 
             * *   If this parameter is empty, the command was run as expected.
             * *   The security group rules denied access to the aliyun service.
             * *   The specified instance does not exist.
             * *   The specified instance was released during task execution.
             * *   The specified instance was not running during task execution.
             * *   The OS type of the instance does not support the specified command type.
             * *   The specified account does not exist.
             * *   The specified directory does not exist.
             * *   The cron expression is invalid.
             * *   The aliyun service is not running on the instance.
             * *   The aliyun service in the instance does not response.
             * *   The aliyun service in the instance is upgrading during task execution.
             * *   The aliyun service in the instance need to be upgraded to at least version to support the feature. indicates the earliest version that supports the feature. indicates the name of the feature.
             * *   The command delivery has been timeout.
             * *   The command execution has been timeout.
             * *   The command execution got an exception.
             * *   The command execution exit code is not zero.
             * *   The specified instance was released during task execution.
             */
            public Builder errorInfo(String errorInfo) {
                this.errorInfo = errorInfo;
                return this;
            }

            /**
             * The exit code of the execution. Valid values:
             * <p>
             * 
             * *   For Linux instances, the value is the exit code of the shell process.
             * *   For Windows instances, the value is the exit code of the batch or PowerShell process.
             */
            public Builder exitCode(Long exitCode) {
                this.exitCode = exitCode;
                return this;
            }

            /**
             * The time when the command process ended.
             */
            public Builder finishTime(String finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * The instance ID.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The execution status of the command on a single instance.
             * <p>
             * 
             * >  We recommend that you ignore this parameter and check the value of `InvocationStatus` in the response to obtain the execution status.
             */
            public Builder instanceInvokeStatus(String instanceInvokeStatus) {
                this.instanceInvokeStatus = instanceInvokeStatus;
                return this;
            }

            /**
             * The execution status on a single instance. Valid values:
             * <p>
             * 
             * *   Pending: The command is being verified or sent.
             * 
             * *   Invalid: The specified command type or parameter is invalid.
             * 
             * *   Aborted: The command failed to be sent to the instance. To send a command to an instance, make sure that the instance is in the Running state and the command can be sent to the instance within 1 minute.
             * 
             * *   Running: The command is being run on the instance.
             * 
             * *   Success:
             * 
             *     *   One-time task: The execution was complete, and the exit code was 0.
             *     *   Scheduled task: The last execution was complete, the exit code was 0, and the specified period ended.
             * 
             * *   Failed:
             * 
             *     *   One-time task: The execution was complete, but the exit code was not 0.
             *     *   Scheduled task: The last execution was complete, but the exit code was not 0. The specified period is about to end.
             * 
             * *   Error: The execution cannot proceed due to an exception.
             * 
             * *   Timeout: The execution timed out.
             * 
             * *   Cancelled: The execution was canceled before it started.
             * 
             * *   Stopping: The command task is being stopped.
             * 
             * *   Terminated: The execution was terminated before completion.
             * 
             * *   Scheduled:
             * 
             *     *   One-time task: The execution state can never be Scheduled.
             *     *   Scheduled task: The command is waiting to be run.
             */
            public Builder invocationStatus(String invocationStatus) {
                this.invocationStatus = invocationStatus;
                return this;
            }

            /**
             * The command output.
             * <p>
             * 
             * *   If ContentEncoding is set to PlainText in the request, the original command output is returned.
             * *   If ContentEncoding is set to Base64 in the request, the Base64-encoded command output is returned.
             */
            public Builder output(String output) {
                this.output = output;
                return this;
            }

            /**
             * The number of times that the command was run on the instance.
             * <p>
             * 
             * *   If the command is set to run only once, the value is 0 or 1.
             * *   If the command is set to run on a schedule, the value is the number of times that the command has been run on the instance.
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
             * The time when the command task was stopped. If you call the `StopInvocation` operation to stop the command task, the value of this parameter is the time when the operation is called.
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
             * The time when the execution status was updated.
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
        @com.aliyun.core.annotation.NameInMap("InvokeInstance")
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
        @com.aliyun.core.annotation.NameInMap("TagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("TagValue")
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
        @com.aliyun.core.annotation.NameInMap("Tag")
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
        @com.aliyun.core.annotation.NameInMap("CommandContent")
        private String commandContent;

        @com.aliyun.core.annotation.NameInMap("CommandDescription")
        private String commandDescription;

        @com.aliyun.core.annotation.NameInMap("CommandId")
        private String commandId;

        @com.aliyun.core.annotation.NameInMap("CommandName")
        private String commandName;

        @com.aliyun.core.annotation.NameInMap("CommandType")
        private String commandType;

        @com.aliyun.core.annotation.NameInMap("ContainerId")
        private String containerId;

        @com.aliyun.core.annotation.NameInMap("ContainerName")
        private String containerName;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Frequency")
        private String frequency;

        @com.aliyun.core.annotation.NameInMap("InvocationStatus")
        private String invocationStatus;

        @com.aliyun.core.annotation.NameInMap("InvokeId")
        private String invokeId;

        @com.aliyun.core.annotation.NameInMap("InvokeInstances")
        private InvokeInstances invokeInstances;

        @com.aliyun.core.annotation.NameInMap("InvokeStatus")
        private String invokeStatus;

        @com.aliyun.core.annotation.NameInMap("Launcher")
        private String launcher;

        @com.aliyun.core.annotation.NameInMap("Parameters")
        private String parameters;

        @com.aliyun.core.annotation.NameInMap("RepeatMode")
        private String repeatMode;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private Tags tags;

        @com.aliyun.core.annotation.NameInMap("TerminationMode")
        private String terminationMode;

        @com.aliyun.core.annotation.NameInMap("Timed")
        private Boolean timed;

        @com.aliyun.core.annotation.NameInMap("Timeout")
        private Long timeout;

        @com.aliyun.core.annotation.NameInMap("Username")
        private String username;

        @com.aliyun.core.annotation.NameInMap("WorkingDir")
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
            this.launcher = builder.launcher;
            this.parameters = builder.parameters;
            this.repeatMode = builder.repeatMode;
            this.tags = builder.tags;
            this.terminationMode = builder.terminationMode;
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
         * @return launcher
         */
        public String getLauncher() {
            return this.launcher;
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
         * @return terminationMode
         */
        public String getTerminationMode() {
            return this.terminationMode;
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
            private String launcher; 
            private String parameters; 
            private String repeatMode; 
            private Tags tags; 
            private String terminationMode; 
            private Boolean timed; 
            private Long timeout; 
            private String username; 
            private String workingDir; 

            /**
             * The command content.
             * <p>
             * 
             * *   If ContentEncoding is set to PlainText in the request, the original command content is returned.
             * *   If ContentEncoding is set to Base64 in the request, the Base64-encoded command content is returned.
             */
            public Builder commandContent(String commandContent) {
                this.commandContent = commandContent;
                return this;
            }

            /**
             * The command description.
             */
            public Builder commandDescription(String commandDescription) {
                this.commandDescription = commandDescription;
                return this;
            }

            /**
             * The command ID.
             */
            public Builder commandId(String commandId) {
                this.commandId = commandId;
                return this;
            }

            /**
             * The command name.
             */
            public Builder commandName(String commandName) {
                this.commandName = commandName;
                return this;
            }

            /**
             * The command type.
             */
            public Builder commandType(String commandType) {
                this.commandType = commandType;
                return this;
            }

            /**
             * The container ID.
             */
            public Builder containerId(String containerId) {
                this.containerId = containerId;
                return this;
            }

            /**
             * The container name.
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
             * The schedule on which the command is run.
             */
            public Builder frequency(String frequency) {
                this.frequency = frequency;
                return this;
            }

            /**
             * The overall execution status of the command task. The value of this parameter depends on the execution status of the command task on all the involved instances. Valid values:
             * <p>
             * 
             * *   Pending: The command is being verified or sent. When the execution state on at least one instance is Pending, the overall execution state is Pending.
             * 
             * *   Scheduled: The command that is set to run on a schedule was sent and waiting to be run. When the execution state on at least one instance is Scheduled, the overall execution state is Scheduled.
             * 
             * *   Running: The command is being run on the instances. When the execution state on at least one instance is Running, the overall execution state is Running.
             * 
             * *   Success: When the execution state on at least one instance is Success and the execution state on the other instances is Stopped or Success, the overall execution state is Success.
             * 
             *     *   One-time task: The execution was complete, and the exit code was 0.
             *     *   Scheduled task: The last execution was complete, the exit code was 0, and the specified period ended.
             * 
             * *   Failed: When the execution state on all instances is Stopped or Failed, the overall execution state is Failed. When the execution state on an instance is one of the following values, Failed is returned as the overall execution state:
             * 
             *     *   Invalid: The command is invalid.
             *     *   Aborted: The command failed to be sent.
             *     *   Failed: The execution was complete, but the exit code was not 0.
             *     *   Timeout: The execution timed out.
             *     *   Error: An error occurred while the command was being run.
             * 
             * *   Stopping: The command task is being stopped. When the execution state on at least one instance is Stopping, the overall execution state is Stopping.
             * 
             * *   Stopped: The task was stopped. When the execution state on all instances is Stopped, the overall execution state is Stopped. When the execution state on an instance is one of the following values, Stopped is returned as the overall execution state:
             * 
             *     *   Cancelled: The task was canceled.
             *     *   Terminated: The task was terminated.
             * 
             * *   PartialFailed: The execution was complete on some instances and failed on other instances. When the execution state is Success on some instances and is Failed or Stopped on the other instances, the overall execution state is PartialFailed.
             * 
             * >  `InvokeStatus` in the response functions similarly to this parameter. We recommend that you check the value of this parameter.
             */
            public Builder invocationStatus(String invocationStatus) {
                this.invocationStatus = invocationStatus;
                return this;
            }

            /**
             * The command task ID.
             */
            public Builder invokeId(String invokeId) {
                this.invokeId = invokeId;
                return this;
            }

            /**
             * The instances on which the command was run.
             */
            public Builder invokeInstances(InvokeInstances invokeInstances) {
                this.invokeInstances = invokeInstances;
                return this;
            }

            /**
             * The overall execution status of the command task.
             * <p>
             * 
             * >  We recommend that you ignore this parameter and check the value of `InvocationStatus` in the response to obtain the execution status.
             */
            public Builder invokeStatus(String invokeStatus) {
                this.invokeStatus = invokeStatus;
                return this;
            }

            /**
             * The launcher for script execution. The value cannot exceed 1 KB in length.
             */
            public Builder launcher(String launcher) {
                this.launcher = launcher;
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
             * *   NextRebootOnly: The command is run the next time the instances start.
             * *   EveryReboot: The command is run every time the instances start.
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
             * Indicates how the command task is stopped when a command execution is manually stopped or times out. Valid values:
             * <p>
             * 
             * *   Process: The process of the command is stopped.
             * *   ProcessTree: The process tree of the command is stopped. In this case, the process of the command and all subprocesses are stopped.
             */
            public Builder terminationMode(String terminationMode) {
                this.terminationMode = terminationMode;
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
             * The maximum timeout period for the command execution. Unit: seconds.
             * <p>
             * 
             * When a command cannot be run, the command execution times out. When a command execution times out, Cloud Assistant Agent forcefully terminates the command process by canceling the process ID (PID) of the command.
             */
            public Builder timeout(Long timeout) {
                this.timeout = timeout;
                return this;
            }

            /**
             * The username used to run the command on the instances.
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
        @com.aliyun.core.annotation.NameInMap("Invocation")
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
