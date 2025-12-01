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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeInvocationResultsResponseBody model) {
            this.invocation = model.invocation;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The execution status of the command task. Valid values:</p>
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
         * <li>One-time task: The execution is complete on all instances, or the execution is stopped on some instances and is complete on the other instances.</li>
         * </ul>
         * </li>
         * <li><p>Success:</p>
         * <ul>
         * <li>One-time task: The execution is complete, and the exit code is 0.</li>
         * <li>Scheduled task: The last execution is complete, the exit code is 0, and the specified period ends.</li>
         * </ul>
         * </li>
         * <li><p>Failed:</p>
         * <ul>
         * <li>Scheduled task: The execution state can never be Failed.</li>
         * <li>One-time task: The execution fails on all instances.</li>
         * </ul>
         * </li>
         * <li><p>PartialFailed:</p>
         * <ul>
         * <li>Scheduled task: The execution state can never be PartialFailed.</li>
         * <li>One-time task: The execution fails on some instances.</li>
         * </ul>
         * </li>
         * <li><p>Stopped: The task is stopped.</p>
         * </li>
         * <li><p>Stopping: The task is being stopped.</p>
         * </li>
         * </ul>
         */
        public Builder invocation(Invocation invocation) {
            this.invocation = invocation;
            return this;
        }

        /**
         * <p>The ID of the command.</p>
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

            private Builder() {
            } 

            private Builder(Tag model) {
                this.tagKey = model.tagKey;
                this.tagValue = model.tagValue;
            } 

            /**
             * <p>The output delivery status of the command execution. Valid values:</p>
             * <ul>
             * <li>InProgress: The delivery is in progress.</li>
             * <li>Finished: The delivery is complete.</li>
             * <li>Failed: The delivery failed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>owner</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>The username used to run the command on the instance.</p>
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

            private Builder() {
            } 

            private Builder(Tags model) {
                this.tag = model.tag;
            } 

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

        @com.aliyun.core.annotation.NameInMap("OssOutputDelivery")
        private String ossOutputDelivery;

        @com.aliyun.core.annotation.NameInMap("OssOutputStatus")
        private String ossOutputStatus;

        @com.aliyun.core.annotation.NameInMap("OssOutputUri")
        private String ossOutputUri;

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
            this.ossOutputDelivery = builder.ossOutputDelivery;
            this.ossOutputStatus = builder.ossOutputStatus;
            this.ossOutputUri = builder.ossOutputUri;
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
         * @return ossOutputDelivery
         */
        public String getOssOutputDelivery() {
            return this.ossOutputDelivery;
        }

        /**
         * @return ossOutputStatus
         */
        public String getOssOutputStatus() {
            return this.ossOutputStatus;
        }

        /**
         * @return ossOutputUri
         */
        public String getOssOutputUri() {
            return this.ossOutputUri;
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
            private String ossOutputDelivery; 
            private String ossOutputStatus; 
            private String ossOutputUri; 
            private String output; 
            private Integer repeats; 
            private String startTime; 
            private String stopTime; 
            private Tags tags; 
            private String terminationMode; 
            private String username; 

            private Builder() {
            } 

            private Builder(InvocationResult model) {
                this.commandId = model.commandId;
                this.containerId = model.containerId;
                this.containerName = model.containerName;
                this.dropped = model.dropped;
                this.errorCode = model.errorCode;
                this.errorInfo = model.errorInfo;
                this.exitCode = model.exitCode;
                this.finishedTime = model.finishedTime;
                this.instanceId = model.instanceId;
                this.invocationStatus = model.invocationStatus;
                this.invokeId = model.invokeId;
                this.invokeRecordStatus = model.invokeRecordStatus;
                this.launcher = model.launcher;
                this.ossOutputDelivery = model.ossOutputDelivery;
                this.ossOutputStatus = model.ossOutputStatus;
                this.ossOutputUri = model.ossOutputUri;
                this.output = model.output;
                this.repeats = model.repeats;
                this.startTime = model.startTime;
                this.stopTime = model.stopTime;
                this.tags = model.tags;
                this.terminationMode = model.terminationMode;
                this.username = model.username;
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
             * <p>c-hz0jdfwcsr****</p>
             */
            public Builder commandId(String commandId) {
                this.commandId = commandId;
                return this;
            }

            /**
             * <p>Command to execute the Output OSS delivery configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>ab141ddfbacfe02d9dbc25966ed971536124527097398d419a6746873fea****</p>
             */
            public Builder containerId(String containerId) {
                this.containerId = containerId;
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
             * <p>test-container</p>
             */
            public Builder containerName(String containerName) {
                this.containerName = containerName;
                return this;
            }

            /**
             * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of NextToken.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder dropped(Integer dropped) {
                this.dropped = dropped;
                return this;
            }

            /**
             * <p>The time when the command started to be run on the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>InstanceNotExists</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>The ID of the request.</p>
             * 
             * <strong>example:</strong>
             * <p>the specified instance does not exists</p>
             */
            public Builder errorInfo(String errorInfo) {
                this.errorInfo = errorInfo;
                return this;
            }

            /**
             * <p>The key of tag N of the command task. Valid values of N: 1 to 20. The tag key cannot be an empty string.</p>
             * <p>If a single tag is specified to query resources, up to 1,000 resources that have this tag added can be displayed in the response. If multiple tags are specified to query resources, up to 1,000 resources that have all these tags added can be displayed in the response. To query more than 1,000 resources that have specified tags added, call the <a href="https://help.aliyun.com/document_detail/110425.html">ListTagResources</a> operation.</p>
             * <p>The tag key can be up to 64 characters in length and cannot start with <code>acs:</code> or <code>aliyun</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder exitCode(Long exitCode) {
                this.exitCode = exitCode;
                return this;
            }

            /**
             * <p>The total number of the commands.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-12-20T06:15:56Z</p>
             */
            public Builder finishedTime(String finishedTime) {
                this.finishedTime = finishedTime;
                return this;
            }

            /**
             * <p>The value of tag N of the command task. Valid values of N: 1 to 20. The tag value can be an empty string.</p>
             * <p>The tag value can be up to 128 characters in length and cannot contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>i-bp1i7gg30r52z2em****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The tag of the command task.</p>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
             */
            public Builder invocationStatus(String invocationStatus) {
                this.invocationStatus = invocationStatus;
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
             * <p>t-hz0jdfwd9f****</p>
             */
            public Builder invokeId(String invokeId) {
                this.invokeId = invokeId;
                return this;
            }

            /**
             * <p>The page number.</p>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder invokeRecordStatus(String invokeRecordStatus) {
                this.invokeRecordStatus = invokeRecordStatus;
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
             * <p>python3 -u {{ACS::ScriptFileName|Ext(&quot;.py&quot;)}}</p>
             */
            public Builder launcher(String launcher) {
                this.launcher = launcher;
                return this;
            }

            /**
             * <p>The tags of the command task.</p>
             * 
             * <strong>example:</strong>
             * <p>oss://testBucket/testPrefix</p>
             */
            public Builder ossOutputDelivery(String ossOutputDelivery) {
                this.ossOutputDelivery = ossOutputDelivery;
                return this;
            }

            /**
             * <p>The execution results.</p>
             * 
             * <strong>example:</strong>
             * <p>Finished</p>
             */
            public Builder ossOutputStatus(String ossOutputStatus) {
                this.ossOutputStatus = ossOutputStatus;
                return this;
            }

            /**
             * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
             * 
             * <strong>example:</strong>
             * <p>oss://testBucket/testPrefix/output.txt</p>
             */
            public Builder ossOutputUri(String ossOutputUri) {
                this.ossOutputUri = ossOutputUri;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>MTU6MzA6MDEK</p>
             */
            public Builder output(String output) {
                this.output = output;
                return this;
            }

            /**
             * <p>The number of entries per page.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder repeats(Integer repeats) {
                this.repeats = repeats;
                return this;
            }

            /**
             * <p>Details about the execution results.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-12-20T06:15:55Z</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>root</p>
             * 
             * <strong>example:</strong>
             * <p>2020-01-19T09:15:47Z</p>
             */
            public Builder stopTime(String stopTime) {
                this.stopTime = stopTime;
                return this;
            }

            /**
             * <p>The time when the command task was completed. If the command task times out, the end time is equal to the start time of the command task specified by <code>StartTime</code> plus the timeout period specified by <code>Timeout</code>.</p>
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
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
             * <p>ProcessTree</p>
             */
            public Builder terminationMode(String terminationMode) {
                this.terminationMode = terminationMode;
                return this;
            }

            /**
             * <p>The size of the Output text that was truncated and discarded because the <code>Output</code> value exceeded 24 KB in size.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
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
        private java.util.List<InvocationResult> invocationResult;

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
        public java.util.List<InvocationResult> getInvocationResult() {
            return this.invocationResult;
        }

        public static final class Builder {
            private java.util.List<InvocationResult> invocationResult; 

            private Builder() {
            } 

            private Builder(InvocationResults model) {
                this.invocationResult = model.invocationResult;
            } 

            /**
             * InvocationResult.
             */
            public Builder invocationResult(java.util.List<InvocationResult> invocationResult) {
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

            private Builder() {
            } 

            private Builder(Invocation model) {
                this.invocationResults = model.invocationResults;
                this.nextToken = model.nextToken;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The maximum number of entries per page.</p>
             * <p>Valid values: 1 to 50.</p>
             * <p>Default value: 10.</p>
             */
            public Builder invocationResults(InvocationResults invocationResults) {
                this.invocationResults = invocationResults;
                return this;
            }

            /**
             * <blockquote>
             * <p> This parameter will be removed in the future. We recommend that you use NextToken and MaxResults for a paged query.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>AAAAAdDWBF2</p>
             */
            public Builder nextToken(String nextToken) {
                this.nextToken = nextToken;
                return this;
            }

            /**
             * <p>The encoding mode of the <code>CommandContent</code> and <code>Output</code> values in the response. Valid values:</p>
             * <ul>
             * <li>PlainText: returns the original command content and command output.</li>
             * <li>Base64: returns the Base64-encoded command content and command output.</li>
             * </ul>
             * <p>Default value: Base64.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Long pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>Specifies whether to return the results of historical scheduled executions. Valid values:</p>
             * <ul>
             * <li>true: returns the results of historical scheduled executions. If you set this parameter to true, you must set InvokeId to the ID of a task that is run on a schedule (RepeatMode set to Period) or on each system startup (RepeatMode set to EveryReboot).</li>
             * <li>false: does not return the results of historical scheduled executions.</li>
             * </ul>
             * <p>Default value: false.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <blockquote>
             * <p> This parameter will be removed in the future. We recommend that you use NextToken and MaxResults for a paged query.</p>
             * </blockquote>
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
