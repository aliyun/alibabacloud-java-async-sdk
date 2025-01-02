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

        /**
         * <p>Script execution record object.</p>
         */
        public Builder invocations(Invocations invocations) {
            this.invocations = invocations;
            return this;
        }

        /**
         * <p>Request ID</p>
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

            /**
             * <p>The start time of the command execution.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-02-06T07:12:50Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The length of the text that is truncated and discarded when the length of the <code>Output</code> field exceeds 24 KB.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder dropped(Integer dropped) {
                this.dropped = dropped;
                return this;
            }

            /**
             * <p>Reason code for file delivery failure. Possible values:</p>
             * <ul>
             * <li>Empty: File delivery is normal. </li>
             * <li>NodeNotExists: The specified instance does not exist or has been released. </li>
             * <li>NodeReleased: The instance was released during the file delivery process. </li>
             * <li>NodeNotRunning: The instance was not running when the file delivery task was created. </li>
             * <li>AccountNotExists: The specified account does not exist. </li>
             * <li>ClientNotRunning: The Cloud Assistant Agent is not running. </li>
             * <li>ClientNotResponse: The Cloud Assistant Agent is not responding. </li>
             * <li>ClientIsUpgrading: The Cloud Assistant Agent is currently upgrading. </li>
             * <li>ClientNeedUpgrade: The Cloud Assistant Agent needs to be upgraded. </li>
             * <li>DeliveryTimeout: File sending timed out. </li>
             * <li>FileCreateFail: File creation failed. </li>
             * <li>FileAlreadyExists: A file with the same name already exists at the specified path. </li>
             * <li>FileContentInvalid: The file content is invalid. - FileNameInvalid: The file name is invalid. </li>
             * <li>FilePathInvalid: The file path is invalid. </li>
             * <li>FileAuthorityInvalid: The file permissions are invalid. </li>
             * <li>UserGroupNotExists: The user group specified for file sending does not exist.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NodeNotExists：</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>Details of the reason for command delivery failure or execution failure, possible values: </p>
             * <ul>
             * <li>Empty: The command executed normally. </li>
             * <li>the specified node does not exist: The specified instance does not exist or has been released. </li>
             * <li>the node was released when creating the task: The instance was released during command execution. </li>
             * <li>the node is not running when creating the task: The instance was not in a running state when the command was executed. </li>
             * <li>the command is not applicable: The command is not applicable to the specified instance. </li>
             * <li>the specified account does not exist: The specified account does not exist. </li>
             * <li>the specified directory does not exist: The specified directory does not exist. </li>
             * <li>the cron job expression is invalid: The specified execution time expression is invalid. </li>
             * <li>the aliyun service is not running on the instance: The Cloud Assistant Agent is not running. </li>
             * <li>the aliyun service in the instance does not respond: The Cloud Assistant Agent is not responding. </li>
             * <li>the aliyun service in the node is upgrading now: The Cloud Assistant Agent is currently being upgraded. </li>
             * <li>the aliyun service in the node needs upgrade: The Cloud Assistant Agent needs an upgrade. </li>
             * <li>the command delivery has timed out: Command delivery has timed out. </li>
             * <li>the command execution has timed out: Command execution has timed out. </li>
             * <li>the command execution got an exception: An exception occurred during command execution. </li>
             * <li>the command execution was interrupted: Command execution was interrupted. </li>
             * <li>the command execution exit code is not zero: Command execution completed with a non-zero exit code. </li>
             * <li>the specified node has been released: The instance was released during file delivery.</li>
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
             * <p>The exit code of the command process. Possible values:</p>
             * <ul>
             * <li>For Linux instances, it is the exit code of the Shell process. - For Windows instances, it is the exit code of the Bat or PowerShell process.</li>
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
             * <p>Completion time.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-02-06T07:12:50Z</p>
             */
            public Builder finishTime(String finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * <p>The command progress status for a single instance. Possible values:</p>
             * <ul>
             * <li>Pending: The system is validating or sending the command.</li>
             * <li>Invalid: The specified command type or parameters are incorrect.</li>
             * <li>Aborted: Failed to send the command to the instance. The instance must be running, and the command should be sent within 1 minute.</li>
             * <li>Running: The command is running on the instance.</li>
             * <li>Success:<ul>
             * <li>For a one-time execution command: The command has completed with an exit code of 0.</li>
             * <li>For a periodic execution command: The last run was successful with an exit code of 0, and the specified period has ended.</li>
             * </ul>
             * </li>
             * <li>Failed:<ul>
             * <li>For a one-time execution command: The command has completed with a non-zero exit code.</li>
             * <li>For a periodic execution command: The last run was successful with a non-zero exit code, and the specified period will be terminated.</li>
             * </ul>
             * </li>
             * <li>Error: An exception occurred during command execution, and it cannot continue.</li>
             * <li>Timeout: The command execution timed out.</li>
             * <li>Cancelled: The command execution action has been canceled, and the command was never started.</li>
             * <li>Stopping: The task is being stopped.</li>
             * <li>Terminated: The command was terminated while running.</li>
             * <li>Scheduled:<ul>
             * <li>For a one-time execution command: Not applicable, will not appear.</li>
             * <li>For a periodic execution command: Waiting to run.</li>
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
             * <p>Node ID</p>
             * 
             * <strong>example:</strong>
             * <p>e01-cn-lbj36wkp70b</p>
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>The command progress status of a single instance.</p>
             * 
             * <strong>example:</strong>
             * <p>Finished</p>
             */
            public Builder nodeInvokeStatus(String nodeInvokeStatus) {
                this.nodeInvokeStatus = nodeInvokeStatus;
                return this;
            }

            /**
             * <p>The output information of the command.</p>
             * <ul>
             * <li>If <code>ContentEncoding</code> is set to <code>PlainText</code>, the original output information is returned.</li>
             * <li>If <code>ContentEncoding</code> is set to <code>Base64</code>, the Base64-encoded output information is returned.</li>
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
             * <p>The number of times the command has been executed on this instance.</p>
             * <ul>
             * <li>If the execution mode is one-time, the value is 0 or 1.</li>
             * <li>If the execution mode is periodic, the value is the number of times it has been executed.</li>
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
             * <p>Start Time</p>
             * 
             * <strong>example:</strong>
             * <p>2019-12-20T06:15:55Z</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The time when <code>StopInvocation</code> was called to stop the command execution.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-12-20T06:15:55Z</p>
             */
            public Builder stopTime(String stopTime) {
                this.stopTime = stopTime;
                return this;
            }

            /**
             * <p>Whether the queried command will be automatically executed in the future. The value range is as follows:</p>
             * <ul>
             * <li>true: The command, when executed by calling <code>RunCommand</code> or <code>InvokeCommand</code>, has the <code>RepeatMode</code> parameter set to <code>Period</code>, <code>NextRebootOnly</code>, or <code>EveryReboot</code>. </li>
             * <li>false: Queries commands in the following two states. </li>
             * <li>When executing a command via <code>RunCommand</code> or <code>InvokeCommand</code>, the <code>RepeatMode</code> parameter is set to <code>Once</code>. </li>
             * <li>Commands that have been canceled, stopped, or completed.</li>
             * </ul>
             * <p>Default value: false.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder timed(String timed) {
                this.timed = timed;
                return this;
            }

            /**
             * <p>Update Time</p>
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

            /**
             * <p>Command execution records for nodes.</p>
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

            /**
             * <p>Command content.</p>
             * <ul>
             * <li>If <code>ContentEncoding</code> is set to <code>PlainText</code>, the original script content is returned.</li>
             * <li>If <code>ContentEncoding</code> is set to <code>Base64</code>, the Base64-encoded script content is returned.</li>
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
             * <p>Command description.</p>
             * 
             * <strong>example:</strong>
             * <p>testDescription</p>
             */
            public Builder commandDescription(String commandDescription) {
                this.commandDescription = commandDescription;
                return this;
            }

            /**
             * <p>Command name.</p>
             * 
             * <strong>example:</strong>
             * <p>CommandTestName</p>
             */
            public Builder commandName(String commandName) {
                this.commandName = commandName;
                return this;
            }

            /**
             * <p>The creation time of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-01-19T09:15:46Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The execution time for scheduled commands.</p>
             */
            public Builder frequency(String frequency) {
                this.frequency = frequency;
                return this;
            }

            /**
             * <p>The overall execution status of the command, which depends on the common execution status of all instances involved in the call. Possible values:</p>
             * <ul>
             * <li>Pending: The system is validating or sending the command. If at least one instance has a command execution status of Pending, the overall status is Pending.</li>
             * <li>Scheduled: The scheduled command has been sent and is waiting to run. If at least one instance has a command execution status of Scheduled, the overall status is Scheduled.</li>
             * <li>Running: The command is running on the instance. If at least one instance has a command execution status of Running, the overall status is Running.</li>
             * <li>Success: The command execution status of all instances is Stopped or Success, and at least one instance&quot;s command execution status is Success. The overall status is Success.<ul>
             * <li>For immediately executed tasks: The command has completed with an exit code of 0.</li>
             * <li>For periodically executed tasks: The most recent execution was successful with an exit code of 0, and the specified times have all been completed.</li>
             * </ul>
             * </li>
             * <li>Failed: The command execution status of all instances is Stopped or Failed. The overall status is Failed if any of the following conditions apply to the instance&quot;s command execution status:<ul>
             * <li>Command validation failed (Invalid).</li>
             * <li>Command sending failed (Aborted).</li>
             * <li>Command completed but the exit code is not 0 (Failed).</li>
             * <li>Command execution timed out (Timeout).</li>
             * <li>Command execution encountered an error (Error).</li>
             * </ul>
             * </li>
             * <li>Stopping: The task is being stopped. If at least one instance has a command execution status of Stopping, the overall status is Stopping.</li>
             * <li>Stopped: The task has been stopped. If all instances&quot; command execution statuses are Stopped, the overall status is Stopped. The overall status is Stopped if the instance&quot;s command execution status is any of the following:<ul>
             * <li>The task was canceled (Cancelled).</li>
             * <li>The task was terminated (Terminated).</li>
             * </ul>
             * </li>
             * <li>PartialFailed: Some instances succeeded and some failed. If the command execution statuses of all instances are Success, Failed, or Stopped, the overall status is PartialFailed.</li>
             * </ul>
             * <blockquote>
             * <p>The <code>InvokeStatus</code> in the response parameters is similar in meaning to this parameter, but it is recommended that you check this return value.</p>
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
             * <p>Command execution ID.</p>
             * 
             * <strong>example:</strong>
             * <p>t-ind3k9ytvvduoe8</p>
             */
            public Builder invokeId(String invokeId) {
                this.invokeId = invokeId;
                return this;
            }

            /**
             * <p>Command execution records.</p>
             */
            public Builder invokeNodes(InvokeNodes invokeNodes) {
                this.invokeNodes = invokeNodes;
                return this;
            }

            /**
             * <p>The overall execution status of the command. The overall execution status depends on the common execution status of one or more instances in the execution. Possible values: </p>
             * <ul>
             * <li>Running:<ul>
             * <li>For scheduled execution: The execution status remains ongoing until the scheduled command is manually stopped.</li>
             * <li>For single execution: If there is any command process running, the overall execution status is ongoing.</li>
             * </ul>
             * </li>
             * <li>Finished:<ul>
             * <li>For scheduled execution: The command process cannot be completed.</li>
             * <li>For single execution: All instances have completed execution, or some instances&quot; command processes are manually stopped and the rest have completed.</li>
             * </ul>
             * </li>
             * <li>Failed:<ul>
             * <li>For scheduled execution: The command process cannot fail.</li>
             * <li>For single execution: All instances have failed to execute.</li>
             * </ul>
             * </li>
             * <li>Stopped: The command has been stopped.</li>
             * <li>Stopping: The command is being stopped.</li>
             * <li>PartialFailed: Partial failure; if the <code>InstanceId</code> parameter is set, this does not apply.</li>
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
             * <p>Custom parameters in the command.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder parameters(String parameters) {
                this.parameters = parameters;
                return this;
            }

            /**
             * <p>命令执行的方式。可能值：</p>
             * <p>Once：立即执行命令。
             * Period：定时执行命令。
             * NextRebootOnly：当实例下一次启动时，自动执行命令。
             * EveryReboot：实例每一次启动都将自动执行命令。</p>
             * 
             * <strong>example:</strong>
             * <p>Once</p>
             */
            public Builder repeatMode(String repeatMode) {
                this.repeatMode = repeatMode;
                return this;
            }

            /**
             * <p>Timeout for executing the command, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder timeout(Integer timeout) {
                this.timeout = timeout;
                return this;
            }

            /**
             * <p>Username for executing the command.</p>
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

            /**
             * <p>File delivery record.</p>
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
