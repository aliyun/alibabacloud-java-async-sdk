// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo_controller20221215.models;

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

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeInvocationsResponseBody(Builder builder) {
        this.invocations = builder.invocations;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInvocationsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return invocations
     */
    public Invocations getInvocations() {
        return this.invocations;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Invocations invocations; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeInvocationsResponseBody model) {
            this.invocations = model.invocations;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The command execution record.</p>
         */
        public Builder invocations(Invocations invocations) {
            this.invocations = invocations;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4FD06DF0-9167-5C6F-A145-F30CA4A15D54</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
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
    public static class InvokeNode extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Dropped")
        private Integer dropped;

        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ErrorInfo")
        private String errorInfo;

        @com.aliyun.core.annotation.NameInMap("ExitCode")
        private Integer exitCode;

        @com.aliyun.core.annotation.NameInMap("FinishTime")
        private String finishTime;

        @com.aliyun.core.annotation.NameInMap("InvocationStatus")
        private String invocationStatus;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("NodeInvokeStatus")
        private String nodeInvokeStatus;

        @com.aliyun.core.annotation.NameInMap("Output")
        private String output;

        @com.aliyun.core.annotation.NameInMap("Repeats")
        private Integer repeats;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("StopTime")
        private String stopTime;

        @com.aliyun.core.annotation.NameInMap("Timed")
        private String timed;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        private InvokeNode(Builder builder) {
            this.creationTime = builder.creationTime;
            this.dropped = builder.dropped;
            this.errorCode = builder.errorCode;
            this.errorInfo = builder.errorInfo;
            this.exitCode = builder.exitCode;
            this.finishTime = builder.finishTime;
            this.invocationStatus = builder.invocationStatus;
            this.nodeId = builder.nodeId;
            this.nodeInvokeStatus = builder.nodeInvokeStatus;
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

        public static InvokeNode create() {
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
        public Integer getExitCode() {
            return this.exitCode;
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
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return nodeInvokeStatus
         */
        public String getNodeInvokeStatus() {
            return this.nodeInvokeStatus;
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
        public String getTimed() {
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
            private Integer exitCode; 
            private String finishTime; 
            private String invocationStatus; 
            private String nodeId; 
            private String nodeInvokeStatus; 
            private String output; 
            private Integer repeats; 
            private String startTime; 
            private String stopTime; 
            private String timed; 
            private String updateTime; 

            private Builder() {
            } 

            private Builder(InvokeNode model) {
                this.creationTime = model.creationTime;
                this.dropped = model.dropped;
                this.errorCode = model.errorCode;
                this.errorInfo = model.errorInfo;
                this.exitCode = model.exitCode;
                this.finishTime = model.finishTime;
                this.invocationStatus = model.invocationStatus;
                this.nodeId = model.nodeId;
                this.nodeInvokeStatus = model.nodeInvokeStatus;
                this.output = model.output;
                this.repeats = model.repeats;
                this.startTime = model.startTime;
                this.stopTime = model.stopTime;
                this.timed = model.timed;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>The start time of the execution.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-02-06T07:12:50Z</p>
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
             * <p>The error code returned when the file failed to be sent to the instance. Valid values:</p>
             * <ul>
             * <li>Null: The file is sent to the instance.</li>
             * <li>NodeNotExists: The specified instance does not exist or has been released.</li>
             * <li>NodeReleased: The instance was released while the file was being sent.</li>
             * <li>NodeNotRunning: The instance was not running while the file sending task was being created.</li>
             * <li>AccountNotExists: The specified account does not exist.</li>
             * <li>ClientNotRunning: Cloud Assistant Agent is not running.</li>
             * <li>ClientNotResponse: Cloud Assistant Agent does not respond.</li>
             * <li>ClientIsUpgrading: Cloud Assistant Agent is being upgraded.</li>
             * <li>ClientNeedUpgrade: Cloud Assistant Agent needs to be upgraded.</li>
             * <li>DeliveryTimeout: The file sending task timed out.</li>
             * <li>FileCreateFail: The file failed to be created.</li>
             * <li>FileAlreadyExists: A file with the same name exists in the specified directory.</li>
             * <li>FileContentInvalid: The file content is invalid.</li>
             * <li>FileNameInvalid: The file name is invalid.</li>
             * <li>FilePathInvalid: The specified directory is invalid.</li>
             * <li>FileAuthorityInvalid: The specified permissions on the file are invalid.</li>
             * <li>UserGroupNotExists: The specified user group does not exist.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NodeNotExists</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>The error message returned when the command cannot be sent or run.</p>
             * <ul>
             * <li>If this parameter is empty, the command was run as expected.</li>
             * <li>the specified node does not exists: The specified instance does not exist or is released.</li>
             * <li>the node has node when create task: The instance is released when the command is being run.</li>
             * <li>the node is not running when create task: The instance is not in the Running state while the command is being run.</li>
             * <li>the command is not applicable: The command is not applicable to the specified instance.</li>
             * <li>the specified account does not exists: The specified account does not exist.</li>
             * <li>the specified directory does not exists: The specified directory does not exist.</li>
             * <li>the cron job expression is invalid: The cron expression that specifies the execution time is invalid.</li>
             * <li>the aliyun service is not running on the instance: Cloud Assistant Agent is not running.</li>
             * <li>the aliyun service in the instance does not response: Cloud Assistant Agent does not respond.</li>
             * <li>the aliyun service in the node is upgrading now: Cloud Assistant Agent is being upgraded.</li>
             * <li>the aliyun service in the node need upgrade: Cloud Assistant Agent needs to be upgraded.</li>
             * <li>the command delivery has been timeout: The request to send the command timed out.</li>
             * <li>the command execution has been timeout: The command execution timed out.</li>
             * <li>the command execution got an exception: An exception occurred when the command is being run.</li>
             * <li>the command execution has been interrupted: The command execution is interrupted.</li>
             * <li>the command execution exit code is not zero: The command execution completes, but the exit code is not 0.</li>
             * <li>the specified node has been released: The instance is released while the file is being sent.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>the specified node does not exists</p>
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
            public Builder exitCode(Integer exitCode) {
                this.exitCode = exitCode;
                return this;
            }

            /**
             * <p>The end time of the execution.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-02-06T07:12:50Z</p>
             */
            public Builder finishTime(String finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * <p>The execution status of the command on a single instance. Valid values:</p>
             * <ul>
             * <li><p>Pending: The command was being verified or sent.</p>
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
             * <li>Recurring execution: The previous occurrence of the execution is complete, and the exit code is 0. The specified recurring period during which the command is run ends.</li>
             * </ul>
             * </li>
             * <li><p>Failed:</p>
             * <ul>
             * <li>One-time task: The execution was complete, but the exit code was not 0.</li>
             * <li>Recurring execution: The previous occurrence of the execution is complete, but the exit code is not 0. The specified recurring period during which the command is run is about to end.</li>
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
             * <li>Recurring execution: The command is waiting to be run.</li>
             * </ul>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Pending</p>
             */
            public Builder invocationStatus(String invocationStatus) {
                this.invocationStatus = invocationStatus;
                return this;
            }

            /**
             * <p>The node ID.</p>
             * 
             * <strong>example:</strong>
             * <p>e01-cn-lbj36wkp70b</p>
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>The execution status of the command on a single instance.</p>
             * 
             * <strong>example:</strong>
             * <p>Finished</p>
             */
            public Builder nodeInvokeStatus(String nodeInvokeStatus) {
                this.nodeInvokeStatus = nodeInvokeStatus;
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
             * <p>The start time.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-12-20T06:15:55Z</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The time when the command task was stopped. If you call the StopInvocation operation to stop the command task, the value of this parameter is the time when the operation is called.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-12-20T06:15:55Z</p>
             */
            public Builder stopTime(String stopTime) {
                this.stopTime = stopTime;
                return this;
            }

            /**
             * <p>Indicates whether the command is to be automatically run. Valid values:</p>
             * <ul>
             * <li><p>true: The command is run by calling the <code>RunCommand</code> or <code>InvokeCommand</code> operation with <code>RepeatMode</code> set to <code>Period</code>, <code>NextRebootOnly</code>, or <code>EveryReboot</code>.</p>
             * </li>
             * <li><p>false (default): The command meets the following requirements.</p>
             * <ul>
             * <li>The command is run by calling the <code>RunCommand</code> or <code>InvokeCommand</code> operation with <code>RepeatMode</code> set to <code>Once</code>.</li>
             * <li>The command task is canceled, stopped, or completed.</li>
             * </ul>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder timed(String timed) {
                this.timed = timed;
                return this;
            }

            /**
             * <p>The update time of the execution.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-02-06T07:12:50Z</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public InvokeNode build() {
                return new InvokeNode(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeInvocationsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInvocationsResponseBody</p>
     */
    public static class InvokeNodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InvokeNode")
        private java.util.List<InvokeNode> invokeNode;

        private InvokeNodes(Builder builder) {
            this.invokeNode = builder.invokeNode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InvokeNodes create() {
            return builder().build();
        }

        /**
         * @return invokeNode
         */
        public java.util.List<InvokeNode> getInvokeNode() {
            return this.invokeNode;
        }

        public static final class Builder {
            private java.util.List<InvokeNode> invokeNode; 

            private Builder() {
            } 

            private Builder(InvokeNodes model) {
                this.invokeNode = model.invokeNode;
            } 

            /**
             * <p>The command execution records of the node.</p>
             */
            public Builder invokeNode(java.util.List<InvokeNode> invokeNode) {
                this.invokeNode = invokeNode;
                return this;
            }

            public InvokeNodes build() {
                return new InvokeNodes(this);
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

        @com.aliyun.core.annotation.NameInMap("CommandName")
        private String commandName;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Frequency")
        private String frequency;

        @com.aliyun.core.annotation.NameInMap("InvocationStatus")
        private String invocationStatus;

        @com.aliyun.core.annotation.NameInMap("InvokeId")
        private String invokeId;

        @com.aliyun.core.annotation.NameInMap("InvokeNodes")
        private InvokeNodes invokeNodes;

        @com.aliyun.core.annotation.NameInMap("InvokeStatus")
        private String invokeStatus;

        @com.aliyun.core.annotation.NameInMap("Parameters")
        private String parameters;

        @com.aliyun.core.annotation.NameInMap("RepeatMode")
        private String repeatMode;

        @com.aliyun.core.annotation.NameInMap("Timeout")
        private Integer timeout;

        @com.aliyun.core.annotation.NameInMap("Username")
        private String username;

        @com.aliyun.core.annotation.NameInMap("WorkingDir")
        private String workingDir;

        private Invocation(Builder builder) {
            this.commandContent = builder.commandContent;
            this.commandDescription = builder.commandDescription;
            this.commandName = builder.commandName;
            this.creationTime = builder.creationTime;
            this.frequency = builder.frequency;
            this.invocationStatus = builder.invocationStatus;
            this.invokeId = builder.invokeId;
            this.invokeNodes = builder.invokeNodes;
            this.invokeStatus = builder.invokeStatus;
            this.parameters = builder.parameters;
            this.repeatMode = builder.repeatMode;
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
         * @return commandName
         */
        public String getCommandName() {
            return this.commandName;
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
         * @return invokeNodes
         */
        public InvokeNodes getInvokeNodes() {
            return this.invokeNodes;
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
         * @return timeout
         */
        public Integer getTimeout() {
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
            private String commandName; 
            private String creationTime; 
            private String frequency; 
            private String invocationStatus; 
            private String invokeId; 
            private InvokeNodes invokeNodes; 
            private String invokeStatus; 
            private String parameters; 
            private String repeatMode; 
            private Integer timeout; 
            private String username; 
            private String workingDir; 

            private Builder() {
            } 

            private Builder(Invocation model) {
                this.commandContent = model.commandContent;
                this.commandDescription = model.commandDescription;
                this.commandName = model.commandName;
                this.creationTime = model.creationTime;
                this.frequency = model.frequency;
                this.invocationStatus = model.invocationStatus;
                this.invokeId = model.invokeId;
                this.invokeNodes = model.invokeNodes;
                this.invokeStatus = model.invokeStatus;
                this.parameters = model.parameters;
                this.repeatMode = model.repeatMode;
                this.timeout = model.timeout;
                this.username = model.username;
                this.workingDir = model.workingDir;
            } 

            /**
             * <p>The executed command.</p>
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
             * <p>The schedule on which the command was run.</p>
             */
            public Builder frequency(String frequency) {
                this.frequency = frequency;
                return this;
            }

            /**
             * <p>The overall execution state of the command task. The value of this parameter depends on the execution states of the command task on all the involved instances. Valid values:</p>
             * <ul>
             * <li><p>Pending: The command was being verified or sent. If the execution state on at least one instance is Pending, the overall execution state is Pending.</p>
             * </li>
             * <li><p>Scheduled: The command that is set to run on a schedule is sent and waiting to be run. If the execution state on at least one instance is Scheduled, the overall execution state is Scheduled.</p>
             * </li>
             * <li><p>Running: The command is being run on the instance. When the execution state on at least one instance is Running, the overall execution state is Running.</p>
             * </li>
             * <li><p>Success: When the execution state on at least one instance is Success and the execution state on the other instances is Stopped or Success, the overall execution state is Success.</p>
             * <ul>
             * <li>One-time task: The execution is complete, and the exit code is 0.</li>
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
             * <p> The value of the <code>InvokeStatus</code> response parameter is similar to the value of InvocationStatus. We recommend that you ignore InvokeStatus and check the value of InvocationStatus.</p>
             * </blockquote>
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
             * <p>t-ind3k9ytvvduoe8</p>
             */
            public Builder invokeId(String invokeId) {
                this.invokeId = invokeId;
                return this;
            }

            /**
             * <p>The command execution records.</p>
             */
            public Builder invokeNodes(InvokeNodes invokeNodes) {
                this.invokeNodes = invokeNodes;
                return this;
            }

            /**
             * <p>The overall execution status of the command task. The value of this parameter depends on the execution states of the command task on all involved instances. Valid values:</p>
             * <ul>
             * <li><p>Running:</p>
             * <ul>
             * <li>Scheduled task: Before you stop the scheduled execution of the command, the overall execution state is always Running.</li>
             * <li>One-time task: If the command is being run on instances, the overall execution state is Running.</li>
             * </ul>
             * </li>
             * <li><p>Finished:</p>
             * <ul>
             * <li>Scheduled task: The overall execution state can never be Finished.</li>
             * <li>One-time task: The execution is complete on all instances, or the execution is stopped on some instances and is complete on the other instances.</li>
             * </ul>
             * </li>
             * <li><p>Failed:</p>
             * <ul>
             * <li>Scheduled task: The overall execution state can never be Failed.</li>
             * <li>One-time task: The execution failed on all instances.</li>
             * </ul>
             * </li>
             * <li><p>Stopped: The task is stopped.</p>
             * </li>
             * <li><p>Stopping: The task is being stopped.</p>
             * </li>
             * <li><p>PartialFailed: The task fails on some instances. If you specify both this parameter and <code>InstanceId</code>, this parameter does not take effect.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder invokeStatus(String invokeStatus) {
                this.invokeStatus = invokeStatus;
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
             * <li>Once: The command is run immediately.</li>
             * <li>Period: The command is run on a schedule.</li>
             * <li>NextRebootOnly: The command is run the next time the instances start.</li>
             * <li>EveryReboot: runs the command every time the instances start.</li>
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
             * <p>The timeout period for the command execution. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder timeout(Integer timeout) {
                this.timeout = timeout;
                return this;
            }

            /**
             * <p>The username that is used to run the command.</p>
             * 
             * <strong>example:</strong>
             * <p>root</p>
             */
            public Builder username(String username) {
                this.username = username;
                return this;
            }

            /**
             * <p>The working directory of the command on the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>/home</p>
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

            private Builder() {
            } 

            private Builder(Invocations model) {
                this.invocation = model.invocation;
            } 

            /**
             * <p>The file sending records.</p>
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
