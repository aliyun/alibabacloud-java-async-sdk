// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
         * <p>Details about the command executions.</p>
         */
        public Builder invocations(Invocations invocations) {
            this.invocations = invocations;
            return this;
        }

        /**
         * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAdDWBF2</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of the commands.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeInvocationsResponseBody build() {
            return new DescribeInvocationsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInvocationsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInvocationsResponseBody</p>
     */
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
             * <p>The time when the command task was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-12-20T06:15:54Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The size of the Output text that was truncated and discarded because the Output value exceeded 24 KB in size.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder dropped(Integer dropped) {
                this.dropped = dropped;
                return this;
            }

            /**
             * <p>The error code for the failure to send or run the command. Valid values:</p>
             * <ul>
             * <li>If this parameter is empty, the command was run as expected.</li>
             * <li>InstanceNotExists: The specified instance did not exist or was released.</li>
             * <li>InstanceReleased: The instance was released while the command was being run.</li>
             * <li>InstanceNotRunning: The instance was not running when the command started to be run.</li>
             * <li>CommandNotApplicable: The command was inapplicable to the specified instance.</li>
             * <li>AccountNotExists: The username specified to run the command did not exist.</li>
             * <li>DirectoryNotExists: The specified directory did not exist.</li>
             * <li>BadCronExpression: The specified cron expression for the execution schedule was invalid.</li>
             * <li>ClientNotRunning: Cloud Assistant Agent was not running.</li>
             * <li>ClientNotResponse: Cloud Assistant Agent did not respond.</li>
             * <li>ClientIsUpgrading: Cloud Assistant Agent was being upgraded.</li>
             * <li>ClientNeedUpgrade: Cloud Assistant Agent needed to be upgraded.</li>
             * <li>DeliveryTimeout: The request to send the command timed out.</li>
             * <li>ExecutionTimeout: The execution timed out.</li>
             * <li>ExecutionException: An exception occurred while the command was being executed.</li>
             * <li>ExecutionInterrupted: The command task was interrupted.</li>
             * <li>ExitCodeNonzero: The execution was complete, but the exit code was not 0.</li>
             * <li>SecurityGroupRuleDenied: Access to Cloud Assistant was denied by security group rules.</li>
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
             * <p>The error message returned when the command failed to be sent or run. Valid values:</p>
             * <ul>
             * <li>If this parameter is empty, the command was run as expected.</li>
             * <li>The security group rules denied access to the aliyun service.</li>
             * <li>The specified instance does not exist.</li>
             * <li>The specified instance was released during task execution.</li>
             * <li>The specified instance was not running during task execution.</li>
             * <li>The OS type of the instance does not support the specified command type.</li>
             * <li>The specified account does not exist.</li>
             * <li>The specified directory does not exist.</li>
             * <li>The cron expression is invalid.</li>
             * <li>The aliyun service is not running on the instance.</li>
             * <li>The aliyun service in the instance does not response.</li>
             * <li>The aliyun service in the instance is upgrading during task execution.</li>
             * <li>The aliyun service in the instance need to be upgraded to at least version to support the feature. indicates the earliest version that supports the feature. indicates the name of the feature.</li>
             * <li>The command delivery has been timeout.</li>
             * <li>The command execution has been timeout.</li>
             * <li>The command execution got an exception.</li>
             * <li>The command execution exit code is not zero.</li>
             * <li>The specified instance was released during task execution.</li>
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
             * <p>The exit code of the execution. Valid values:</p>
             * <ul>
             * <li>For Linux instances, the value is the exit code of the shell process.</li>
             * <li>For Windows instances, the value is the exit code of the batch or PowerShell process.</li>
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
             * <p>The time when the command process ended.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-12-20T06:15:56Z</p>
             */
            public Builder finishTime(String finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>i-bp1i7gg30r52z2em****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The execution status of the command on a single instance.</p>
             * <blockquote>
             * <p> We recommend that you ignore this parameter and check the value of <code>InvocationStatus</code> in the response to obtain the execution status.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Finished</p>
             */
            public Builder instanceInvokeStatus(String instanceInvokeStatus) {
                this.instanceInvokeStatus = instanceInvokeStatus;
                return this;
            }

            /**
             * <p>The execution status on a single instance. Valid values:</p>
             * <ul>
             * <li><p>Pending: The command is being verified or sent.</p>
             * </li>
             * <li><p>Invalid: The specified command type or parameter is invalid.</p>
             * </li>
             * <li><p>Aborted: The command failed to be sent to the instance. To send a command to an instance, make sure that the instance is in the Running state and the command can be sent to the instance within 1 minute.</p>
             * </li>
             * <li><p>Running: The command is being run on the instance.</p>
             * </li>
             * <li><p>Success:</p>
             * <ul>
             * <li>One-time task: The execution was complete, and the exit code was 0.</li>
             * <li>Scheduled task: The last execution was complete, the exit code was 0, and the specified period ended.</li>
             * </ul>
             * </li>
             * <li><p>Failed:</p>
             * <ul>
             * <li>One-time task: The execution was complete, but the exit code was not 0.</li>
             * <li>Scheduled task: The last execution was complete, but the exit code was not 0. The specified period is about to end.</li>
             * </ul>
             * </li>
             * <li><p>Error: The execution cannot proceed due to an exception.</p>
             * </li>
             * <li><p>Timeout: The execution timed out.</p>
             * </li>
             * <li><p>Cancelled: The execution was canceled before it started.</p>
             * </li>
             * <li><p>Stopping: The command task is being stopped.</p>
             * </li>
             * <li><p>Terminated: The execution was terminated before completion.</p>
             * </li>
             * <li><p>Scheduled:</p>
             * <ul>
             * <li>One-time task: The execution state can never be Scheduled.</li>
             * <li>Scheduled task: The command is waiting to be run.</li>
             * </ul>
             * </li>
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
             * <p>The command output.</p>
             * <ul>
             * <li>If ContentEncoding is set to PlainText in the request, the original command output is returned.</li>
             * <li>If ContentEncoding is set to Base64 in the request, the Base64-encoded command output is returned.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>OutPutTestmsg</p>
             */
            public Builder output(String output) {
                this.output = output;
                return this;
            }

            /**
             * <p>The number of times that the command was run on the instance.</p>
             * <ul>
             * <li>If the command is set to run only once, the value is 0 or 1.</li>
             * <li>If the command is set to run on a schedule, the value is the number of times that the command has been run on the instance.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder repeats(Integer repeats) {
                this.repeats = repeats;
                return this;
            }

            /**
             * <p>The time when the command started to be run on the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-12-20T06:15:55Z</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The time when the command task was stopped. If you call the <code>StopInvocation</code> operation to stop the command task, the value of this parameter is the time when the operation is called.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-01-19T09:15:47Z</p>
             */
            public Builder stopTime(String stopTime) {
                this.stopTime = stopTime;
                return this;
            }

            /**
             * <p>Indicates whether the command is to be automatically run.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder timed(Boolean timed) {
                this.timed = timed;
                return this;
            }

            /**
             * <p>The time when the execution status was updated.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-01-19T09:15:47Z</p>
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
    /**
     * 
     * {@link DescribeInvocationsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInvocationsResponseBody</p>
     */
    public static class InvokeInstances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InvokeInstance")
        private java.util.List<InvokeInstance> invokeInstance;

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
        public java.util.List<InvokeInstance> getInvokeInstance() {
            return this.invokeInstance;
        }

        public static final class Builder {
            private java.util.List<InvokeInstance> invokeInstance; 

            /**
             * InvokeInstance.
             */
            public Builder invokeInstance(java.util.List<InvokeInstance> invokeInstance) {
                this.invokeInstance = invokeInstance;
                return this;
            }

            public InvokeInstances build() {
                return new InvokeInstances(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeInvocationsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInvocationsResponseBody</p>
     */
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
             * <p>The tag key of the command task.</p>
             * 
             * <strong>example:</strong>
             * <p>owner</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>The tag value of the command task.</p>
             * 
             * <strong>example:</strong>
             * <p>zhangsan</p>
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
    /**
     * 
     * {@link DescribeInvocationsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInvocationsResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Tag")
        private java.util.List<Tag> tag;

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
        public java.util.List<Tag> getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List<Tag> tag; 

            /**
             * Tag.
             */
            public Builder tag(java.util.List<Tag> tag) {
                this.tag = tag;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeInvocationsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInvocationsResponseBody</p>
     */
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
             * <p>The command content.</p>
             * <ul>
             * <li>If ContentEncoding is set to PlainText in the request, the original command content is returned.</li>
             * <li>If ContentEncoding is set to Base64 in the request, the Base64-encoded command content is returned.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>cnBtIC1xYSB8IGdyZXAgdnNm****</p>
             */
            public Builder commandContent(String commandContent) {
                this.commandContent = commandContent;
                return this;
            }

            /**
             * <p>The command description.</p>
             * 
             * <strong>example:</strong>
             * <p>testDescription</p>
             */
            public Builder commandDescription(String commandDescription) {
                this.commandDescription = commandDescription;
                return this;
            }

            /**
             * <p>The command ID.</p>
             * 
             * <strong>example:</strong>
             * <p>c-hz0jdfwcsr****</p>
             */
            public Builder commandId(String commandId) {
                this.commandId = commandId;
                return this;
            }

            /**
             * <p>The command name.</p>
             * 
             * <strong>example:</strong>
             * <p>CommandTestName</p>
             */
            public Builder commandName(String commandName) {
                this.commandName = commandName;
                return this;
            }

            /**
             * <p>The command type.</p>
             * 
             * <strong>example:</strong>
             * <p>RunShellScript</p>
             */
            public Builder commandType(String commandType) {
                this.commandType = commandType;
                return this;
            }

            /**
             * <p>The container ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ab141ddfbacfe02d9dbc25966ed971536124527097398d419a6746873fea****</p>
             */
            public Builder containerId(String containerId) {
                this.containerId = containerId;
                return this;
            }

            /**
             * <p>The container name.</p>
             * 
             * <strong>example:</strong>
             * <p>test-container</p>
             */
            public Builder containerName(String containerName) {
                this.containerName = containerName;
                return this;
            }

            /**
             * <p>The time when the command task was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-01-19T09:15:46Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The schedule on which the command is run.</p>
             */
            public Builder frequency(String frequency) {
                this.frequency = frequency;
                return this;
            }

            /**
             * <p>The overall execution status of the command task. The value of this parameter depends on the execution status of the command task on all the involved instances. Valid values:</p>
             * <ul>
             * <li><p>Pending: The command is being verified or sent. When the execution state on at least one instance is Pending, the overall execution state is Pending.</p>
             * </li>
             * <li><p>Scheduled: The command that is set to run on a schedule was sent and waiting to be run. When the execution state on at least one instance is Scheduled, the overall execution state is Scheduled.</p>
             * </li>
             * <li><p>Running: The command is being run on the instances. When the execution state on at least one instance is Running, the overall execution state is Running.</p>
             * </li>
             * <li><p>Success: When the execution state on at least one instance is Success and the execution state on the other instances is Stopped or Success, the overall execution state is Success.</p>
             * <ul>
             * <li>One-time task: The execution was complete, and the exit code was 0.</li>
             * <li>Scheduled task: The last execution was complete, the exit code was 0, and the specified period ended.</li>
             * </ul>
             * </li>
             * <li><p>Failed: When the execution state on all instances is Stopped or Failed, the overall execution state is Failed. When the execution state on an instance is one of the following values, Failed is returned as the overall execution state:</p>
             * <ul>
             * <li>Invalid: The command is invalid.</li>
             * <li>Aborted: The command failed to be sent.</li>
             * <li>Failed: The execution was complete, but the exit code was not 0.</li>
             * <li>Timeout: The execution timed out.</li>
             * <li>Error: An error occurred while the command was being run.</li>
             * </ul>
             * </li>
             * <li><p>Stopping: The command task is being stopped. When the execution state on at least one instance is Stopping, the overall execution state is Stopping.</p>
             * </li>
             * <li><p>Stopped: The task was stopped. When the execution state on all instances is Stopped, the overall execution state is Stopped. When the execution state on an instance is one of the following values, Stopped is returned as the overall execution state:</p>
             * <ul>
             * <li>Cancelled: The task was canceled.</li>
             * <li>Terminated: The task was terminated.</li>
             * </ul>
             * </li>
             * <li><p>PartialFailed: The execution was complete on some instances and failed on other instances. When the execution state is Success on some instances and is Failed or Stopped on the other instances, the overall execution state is PartialFailed.</p>
             * </li>
             * </ul>
             * <blockquote>
             * <p> <code>InvokeStatus</code> in the response functions similarly to this parameter. We recommend that you check the value of this parameter.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder invocationStatus(String invocationStatus) {
                this.invocationStatus = invocationStatus;
                return this;
            }

            /**
             * <p>The command task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>t-hz0jdfwd9f****</p>
             */
            public Builder invokeId(String invokeId) {
                this.invokeId = invokeId;
                return this;
            }

            /**
             * <p>The instances on which the command was run.</p>
             */
            public Builder invokeInstances(InvokeInstances invokeInstances) {
                this.invokeInstances = invokeInstances;
                return this;
            }

            /**
             * <p>The overall execution status of the command task.</p>
             * <blockquote>
             * <p> We recommend that you ignore this parameter and check the value of <code>InvocationStatus</code> in the response to obtain the execution status.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Finished</p>
             */
            public Builder invokeStatus(String invokeStatus) {
                this.invokeStatus = invokeStatus;
                return this;
            }

            /**
             * <p>The launcher for script execution. The value cannot exceed 1 KB in length.</p>
             * 
             * <strong>example:</strong>
             * <p>python3 -u {{ACS::ScriptFileName|Ext(&quot;.py&quot;)}}</p>
             */
            public Builder launcher(String launcher) {
                this.launcher = launcher;
                return this;
            }

            /**
             * <p>The custom parameters in the command.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder parameters(String parameters) {
                this.parameters = parameters;
                return this;
            }

            /**
             * <p>The execution mode of the command. Valid values:</p>
             * <ul>
             * <li>Once: The command is immediately run.</li>
             * <li>Period: The command is run on a schedule.</li>
             * <li>NextRebootOnly: The command is run the next time the instances start.</li>
             * <li>EveryReboot: The command is run every time the instances start.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Once</p>
             */
            public Builder repeatMode(String repeatMode) {
                this.repeatMode = repeatMode;
                return this;
            }

            /**
             * <p>The tags of the command task.</p>
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>Indicates how the command task is stopped when a command execution is manually stopped or times out. Valid values:</p>
             * <ul>
             * <li>Process: The process of the command is stopped.</li>
             * <li>ProcessTree: The process tree of the command is stopped. In this case, the process of the command and all subprocesses are stopped.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ProcessTree</p>
             */
            public Builder terminationMode(String terminationMode) {
                this.terminationMode = terminationMode;
                return this;
            }

            /**
             * <p>Indicates whether the command is to be automatically run.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder timed(Boolean timed) {
                this.timed = timed;
                return this;
            }

            /**
             * <p>The maximum timeout period for the command execution. Unit: seconds.</p>
             * <p>When a command cannot be run, the command execution times out. When a command execution times out, Cloud Assistant Agent forcefully terminates the command process by canceling the process ID (PID) of the command.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder timeout(Long timeout) {
                this.timeout = timeout;
                return this;
            }

            /**
             * <p>The username used to run the command on the instances.</p>
             * 
             * <strong>example:</strong>
             * <p>root</p>
             */
            public Builder username(String username) {
                this.username = username;
                return this;
            }

            /**
             * <p>The execution path of the command.</p>
             * 
             * <strong>example:</strong>
             * <p>/home/</p>
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
    /**
     * 
     * {@link DescribeInvocationsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInvocationsResponseBody</p>
     */
    public static class Invocations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Invocation")
        private java.util.List<Invocation> invocation;

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
        public java.util.List<Invocation> getInvocation() {
            return this.invocation;
        }

        public static final class Builder {
            private java.util.List<Invocation> invocation; 

            /**
             * Invocation.
             */
            public Builder invocation(java.util.List<Invocation> invocation) {
                this.invocation = invocation;
                return this;
            }

            public Invocations build() {
                return new Invocations(this);
            } 

        } 

    }
}
