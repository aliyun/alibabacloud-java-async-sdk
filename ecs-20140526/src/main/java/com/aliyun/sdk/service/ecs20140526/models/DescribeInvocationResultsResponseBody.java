// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeInvocationResultsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInvocationResultsResponseBody</p>
 */
public class DescribeInvocationResultsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Invocation")
    private Invocation invocation;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeInvocationResultsResponseBody(Builder builder) {
        this.invocation = builder.invocation;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInvocationResultsResponseBody create() {
        return builder().build();
    }

    /**
     * @return invocation
     */
    public Invocation getInvocation() {
        return this.invocation;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Invocation invocation; 
        private String requestId; 

        /**
         * <p>Details about the execution results.</p>
         */
        public Builder invocation(Invocation invocation) {
            this.invocation = invocation;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE*****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeInvocationResultsResponseBody build() {
            return new DescribeInvocationResultsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInvocationResultsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInvocationResultsResponseBody</p>
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
     * {@link DescribeInvocationResultsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInvocationResultsResponseBody</p>
     */
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
    /**
     * 
     * {@link DescribeInvocationResultsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInvocationResultsResponseBody</p>
     */
    public static class InvocationResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CommandId")
        private String commandId;

        @com.aliyun.core.annotation.NameInMap("ContainerId")
        private String containerId;

        @com.aliyun.core.annotation.NameInMap("ContainerName")
        private String containerName;

        @com.aliyun.core.annotation.NameInMap("Dropped")
        private Integer dropped;

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

        @com.aliyun.core.annotation.NameInMap("Launcher")
        private String launcher;

        @com.aliyun.core.annotation.NameInMap("Output")
        private String output;

        @com.aliyun.core.annotation.NameInMap("Repeats")
        private Integer repeats;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("StopTime")
        private String stopTime;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private Tags tags;

        @com.aliyun.core.annotation.NameInMap("TerminationMode")
        private String terminationMode;

        @com.aliyun.core.annotation.NameInMap("Username")
        private String username;

        private InvocationResult(Builder builder) {
            this.commandId = builder.commandId;
            this.containerId = builder.containerId;
            this.containerName = builder.containerName;
            this.dropped = builder.dropped;
            this.errorCode = builder.errorCode;
            this.errorInfo = builder.errorInfo;
            this.exitCode = builder.exitCode;
            this.finishedTime = builder.finishedTime;
            this.instanceId = builder.instanceId;
            this.invocationStatus = builder.invocationStatus;
            this.invokeId = builder.invokeId;
            this.invokeRecordStatus = builder.invokeRecordStatus;
            this.launcher = builder.launcher;
            this.output = builder.output;
            this.repeats = builder.repeats;
            this.startTime = builder.startTime;
            this.stopTime = builder.stopTime;
            this.tags = builder.tags;
            this.terminationMode = builder.terminationMode;
            this.username = builder.username;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InvocationResult create() {
            return builder().build();
        }

        /**
         * @return commandId
         */
        public String getCommandId() {
            return this.commandId;
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
         * @return launcher
         */
        public String getLauncher() {
            return this.launcher;
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
         * @return username
         */
        public String getUsername() {
            return this.username;
        }

        public static final class Builder {
            private String commandId; 
            private String containerId; 
            private String containerName; 
            private Integer dropped; 
            private String errorCode; 
            private String errorInfo; 
            private Long exitCode; 
            private String finishedTime; 
            private String instanceId; 
            private String invocationStatus; 
            private String invokeId; 
            private String invokeRecordStatus; 
            private String launcher; 
            private String output; 
            private Integer repeats; 
            private String startTime; 
            private String stopTime; 
            private Tags tags; 
            private String terminationMode; 
            private String username; 

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
             * <p>The size of the Output text that was truncated and discarded because the <code>Output</code> value exceeded 24 KB in size.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder dropped(Integer dropped) {
                this.dropped = dropped;
                return this;
            }

            /**
             * <p>The error code returned when the command failed to be sent or run. Valid values:</p>
             * <ul>
             * <li>If this parameter is empty, the command was run as expected.</li>
             * <li>InstanceNotExists: The specified instance did not exist or was released.</li>
             * <li>InstanceReleased: The instance was released while the command was being run.</li>
             * <li>InstanceNotRunning: The instance was not running while the command was being run.</li>
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
             * <li>ExecutionException: An exception occurred while the command was being run.</li>
             * <li>ExecutionInterrupted: The execution was interrupted.</li>
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
             * <p>The exit code of the command task.</p>
             * <ul>
             * <li>For Linux instances, the value is the exit code of the shell command.</li>
             * <li>For Windows instances, the value is the exit code of the batch or PowerShell command.</li>
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
             * <p>The time when the command task was completed. If the command task times out, the end time is equal to the start time of the command task specified by <code>StartTime</code> plus the timeout period specified by <code>Timeout</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-12-20T06:15:56Z</p>
             */
            public Builder finishedTime(String finishedTime) {
                this.finishedTime = finishedTime;
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
             * <li>Scheduled task: The last execution was complete, but the exit code was not 0. The specified period was about to end.</li>
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
             * <p>The execution status of the command. Valid values:</p>
             * <ul>
             * <li><p>Running:</p>
             * <ul>
             * <li>Scheduled task: Before you stop the scheduled execution of the command, the execution state is always Running.</li>
             * <li>One-time task: If the command is being run on instances, the execution state is Running.</li>
             * </ul>
             * </li>
             * <li><p>Finished:</p>
             * <ul>
             * <li>Scheduled task: The execution state can never be Finished.</li>
             * <li>One-time task: The execution was complete on all instances, or the execution was stopped on some instances and was complete on the other instances.</li>
             * </ul>
             * </li>
             * <li><p>Failed:</p>
             * <ul>
             * <li>Scheduled task: The execution state can never be Failed.</li>
             * <li>One-time task: The execution failed on all instances.</li>
             * </ul>
             * </li>
             * <li><p>PartialFailed:</p>
             * <ul>
             * <li>Scheduled task: The execution state can never be PartialFailed.</li>
             * <li>One-time task: The execution failed on some instances.</li>
             * </ul>
             * </li>
             * <li><p>Stopped: The task was stopped.</p>
             * </li>
             * <li><p>Stopping: The task is being stopped.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder invokeRecordStatus(String invokeRecordStatus) {
                this.invokeRecordStatus = invokeRecordStatus;
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
             * <p>The command output.</p>
             * <ul>
             * <li>If ContentEncoding is set to PlainText in the request, the original command output is returned.</li>
             * <li>If ContentEncoding is set to Base64 in the request, the Base64-encoded command output is returned.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>MTU6MzA6MDEK</p>
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
             * <p>The username used to run the command on the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>root</p>
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
    /**
     * 
     * {@link DescribeInvocationResultsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInvocationResultsResponseBody</p>
     */
    public static class InvocationResults extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InvocationResult")
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
    /**
     * 
     * {@link DescribeInvocationResultsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInvocationResultsResponseBody</p>
     */
    public static class Invocation extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InvocationResults")
        private InvocationResults invocationResults;

        @com.aliyun.core.annotation.NameInMap("NextToken")
        private String nextToken;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Long pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Long pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        private Invocation(Builder builder) {
            this.invocationResults = builder.invocationResults;
            this.nextToken = builder.nextToken;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Invocation create() {
            return builder().build();
        }

        /**
         * @return invocationResults
         */
        public InvocationResults getInvocationResults() {
            return this.invocationResults;
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
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private InvocationResults invocationResults; 
            private String nextToken; 
            private Long pageNumber; 
            private Long pageSize; 
            private Long totalCount; 

            /**
             * <p>The execution results.</p>
             */
            public Builder invocationResults(InvocationResults invocationResults) {
                this.invocationResults = invocationResults;
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
             * <p>The page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Long pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>The number of entries per page.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
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

            public Invocation build() {
                return new Invocation(this);
            } 

        } 

    }
}
