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
         * <p>The invocation records.</p>
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
             * <p>The start time of the command execution. The time follows the ISO 8601 standard, and Z in the example indicates UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-02-06T07:12:50Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The length of the truncated and discarded text when the text length in the Output field exceeds 24 KB.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder dropped(Integer dropped) {
                this.dropped = dropped;
                return this;
            }

            /**
             * <p>The error code for the file delivery failure. Valid values:</p>
             * <ul>
             * <li>Empty: The file is delivered normally.</li>
             * <li>NodeNotExists: The specified instance does not exist or has been released.</li>
             * <li>NodeReleased: The instance was released during file delivery.</li>
             * <li>NodeNotRunning: The instance was not in the Running state when the file delivery task was created.</li>
             * <li>AccountNotExists: The specified account does not exist.</li>
             * <li>ClientNotRunning: Cloud Assistant Agent is not running.</li>
             * <li>ClientNotResponse: Cloud Assistant Agent is not responding.</li>
             * <li>ClientIsUpgrading: Cloud Assistant Agent is being upgraded.</li>
             * <li>ClientNeedUpgrade: Cloud Assistant Agent needs to be upgraded.</li>
             * <li>DeliveryTimeout: The file delivery timed out.</li>
             * <li>FileCreateFail: File creation failed.</li>
             * <li>FileAlreadyExists: A file with the same name already exists in the same path.</li>
             * <li>FileContentInvalid: The file content is invalid.</li>
             * <li>FileNameInvalid: The file name is invalid.</li>
             * <li>FilePathInvalid: The file path is invalid.</li>
             * <li>FileAuthorityInvalid: The file permissions are invalid.</li>
             * <li>UserGroupNotExists: The specified user group does not exist when sending the file.</li>
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
             * <p>The details of the cause for the command delivery or execution failure. Valid values:</p>
             * <ul>
             * <li>Empty: The command is executed normally.</li>
             * <li>the specified node does not exists: The specified instance does not exist or has been released.</li>
             * <li>the node has node when create task: The instance was released during command execution.</li>
             * <li>the node is not running when create task: The instance was not in the Running state during command execution.</li>
             * <li>the command is not applicable: The command is not applicable to the specified instance.</li>
             * <li>the specified account does not exists: The specified account does not exist.</li>
             * <li>the specified directory does not exists: The specified directory does not exist.</li>
             * <li>the cron job expression is invalid: The specified cron expression is invalid.</li>
             * <li>the aliyun service is not running on the instance: Cloud Assistant Agent is not running.</li>
             * <li>the aliyun service in the instance does not response: Cloud Assistant Agent is not responding.</li>
             * <li>the aliyun service in the node is upgrading now: Cloud Assistant Agent is being upgraded.</li>
             * <li>the aliyun service in the node need upgrade: Cloud Assistant Agent needs to be upgraded.</li>
             * <li>the command delivery has been timeout: The command delivery timed out.</li>
             * <li>the command execution has been timeout: The command execution timed out.</li>
             * <li>the command execution got an exception: An exception occurred during command execution.</li>
             * <li>the command execution has been interrupted: The command execution was interrupted.</li>
             * <li>the command execution exit code is not zero: The command execution is complete, but the exit code is not 0.</li>
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
             * <p>The exit code of the command process. Valid values:</p>
             * <ul>
             * <li>For Linux instances, the exit code of the shell process.</li>
             * <li>For Windows instances, the exit code of the batch or PowerShell process.</li>
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
             * <p>The completion time. The time follows the ISO 8601 standard, and Z in the example indicates UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-02-06T07:12:50Z</p>
             */
            public Builder finishTime(String finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * <p>The command execution status on a single instance. Valid values:</p>
             * <ul>
             * <li>Pending: The system is verifying or sending the command.</li>
             * <li>Invalid: The specified command type or parameter is invalid.</li>
             * <li>Aborted: Failed to send the command to the instance. The instance must be in the Running state, and the command must be sent within 1 minute.</li>
             * <li>Running: The command is running on the instance.</li>
             * <li>Success:<ul>
             * <li>One-time execution: The command execution is complete, and the exit code is 0.</li>
             * <li>Scheduled execution: The previous execution was successful with an exit code of 0, and the specified schedule has ended.</li>
             * </ul>
             * </li>
             * <li>Failed:<ul>
             * <li>One-time execution: The command execution is complete, but the exit code is not 0.</li>
             * <li>Scheduled execution: The previous execution completed with a non-zero exit code, and the specified schedule will be terminated.</li>
             * </ul>
             * </li>
             * <li>Error: An exception occurred during command execution and the execution cannot continue.</li>
             * <li>Timeout: The command execution timed out.</li>
             * <li>Cancelled: The command execution was canceled before it started.</li>
             * <li>Stopping: The task is being stopped.</li>
             * <li>Terminated: The command was terminated while running.</li>
             * <li>Scheduled:<ul>
             * <li>One-time execution: Not applicable. This status does not appear.</li>
             * <li>Scheduled execution: Waiting to be executed.</li>
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
             * <p>The command execution status on a single instance.</p>
             * 
             * <strong>example:</strong>
             * <p>Finished</p>
             */
            public Builder nodeInvokeStatus(String nodeInvokeStatus) {
                this.nodeInvokeStatus = nodeInvokeStatus;
                return this;
            }

            /**
             * <p>The output of the command.</p>
             * <ul>
             * <li>If ContentEncoding is set to PlainText, the original output is returned.</li>
             * <li>If ContentEncoding is set to Base64, the Base64-encoded output is returned.</li>
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
             * <p>The number of times the command was executed on the instance.</p>
             * <ul>
             * <li>If the execution mode is one-time execution, the value is 0 or 1.</li>
             * <li>If the execution mode is scheduled execution, the value is the total number of executions.</li>
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
             * <p>The start time. The time follows the ISO 8601 standard, and Z in the example indicates UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-12-20T06:15:55Z</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The time when the StopInvocation operation was called to stop the command execution. The time follows the ISO 8601 standard, and Z in the example indicates UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-12-20T06:15:55Z</p>
             */
            public Builder stopTime(String stopTime) {
                this.stopTime = stopTime;
                return this;
            }

            /**
             * <p>Specifies whether the queried command will be automatically executed in the future. Valid values:</p>
             * <ul>
             * <li>true: Queries commands for which the RepeatMode parameter is set to Period, NextRebootOnly, or EveryReboot when calling RunCommand or InvokeCommand.</li>
             * <li>false: Queries commands in the following two states. This is the default value.<ul>
             * <li>Commands for which the RepeatMode parameter is set to Once when calling RunCommand or InvokeCommand.</li>
             * <li>Commands that have been canceled, stopped, or completed.</li>
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
             * <p>The update time. The time follows the ISO 8601 standard, and Z in the example indicates UTC.</p>
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
             * <p>The command content.</p>
             * <ul>
             * <li>If ContentEncoding is set to PlainText, the original script content is returned.</li>
             * <li>If ContentEncoding is set to Base64, the Base64-encoded script content is returned.</li>
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
             * <p>The time when the task was created. The time follows the ISO 8601 standard, and Z in the example indicates UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-01-19T09:15:46Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The execution time of scheduled commands.</p>
             */
            public Builder frequency(String frequency) {
                this.frequency = frequency;
                return this;
            }

            /**
             * <p>The overall execution status of the command. The overall execution status depends on the combined execution status of all instances involved in the invocation. Valid values:</p>
             * <ul>
             * <li>Pending: The system is verifying or sending the command. If the execution status of at least one instance is Pending, the overall execution status is Pending.</li>
             * <li>Scheduled: The scheduled command has been sent and is waiting to be executed. If the execution status of at least one instance is Scheduled, the overall execution status is Scheduled.</li>
             * <li>Running: The command is running on the instances. If the execution status of at least one instance is Running, the overall execution status is Running.</li>
             * <li>Success: The execution status of all instances is Stopped or Success, and the execution status of at least one instance is Success.<ul>
             * <li>For tasks that run immediately: The command execution is complete, and the exit code is 0.</li>
             * <li>For scheduled tasks: The most recent execution was successful with an exit code of 0, and all specified execution times have elapsed.</li>
             * </ul>
             * </li>
             * <li>Failed: The execution status of all instances is Stopped or Failed. The overall execution status is Failed if the execution status of one or more instances is any of the following:<ul>
             * <li>Invalid: Command verification failed.</li>
             * <li>Aborted: Command sending failed.</li>
             * <li>Failed: Command execution is complete, but the exit code is not 0.</li>
             * <li>Timeout: Command execution timed out.</li>
             * <li>Error: An exception occurred during command execution.</li>
             * </ul>
             * </li>
             * <li>Stopping: The task is being stopped. If the execution status of at least one instance is Stopping, the overall execution status is Stopping.</li>
             * <li>Stopped: The task has been stopped. If the execution status of all instances is Stopped, the overall execution status is Stopped. The overall execution status is Stopped if the execution status of one or more instances is any of the following:<ul>
             * <li>Cancelled: The task was canceled.</li>
             * <li>Terminated: The task was terminated.</li>
             * </ul>
             * </li>
             * <li>PartialFailed: The command execution succeeded on some instances and failed on others. If the execution status of all instances is Success, Failed, or Stopped, the overall execution status is PartialFailed.</li>
             * </ul>
             * <blockquote>
             * <p>The InvokeStatus response parameter has a similar meaning to this parameter, but we recommend that you check this return value.</p>
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
             * <p>The invocation ID.</p>
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
             * <p>The overall execution status of the command. The overall execution status depends on the combined execution status of one or more instances in the invocation. Valid values: </p>
             * <ul>
             * <li>Running:<ul>
             * <li>Scheduled execution: The execution status remains Running until the scheduled command is manually stopped.</li>
             * <li>One-time execution: The overall execution status is Running as long as there is an ongoing command process.</li>
             * </ul>
             * </li>
             * <li>Finished:<ul>
             * <li>Scheduled execution: The command process cannot be Finished.</li>
             * <li>One-time execution: All instances have completed the execution, or the command processes on some instances are manually stopped while the execution on the remaining instances is completed.</li>
             * </ul>
             * </li>
             * <li>Failed:<ul>
             * <li>Scheduled execution: The command process cannot be Failed.</li>
             * <li>One-time execution: The execution failed on all instances.</li>
             * </ul>
             * </li>
             * <li>Stopped: The command is stopped.</li>
             * <li>Stopping: The command is being stopped.</li>
             * <li>PartialFailed: The execution partially failed. This value does not take effect if the InstanceId parameter is also specified.</li>
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
             * <li>Once: Executes the command immediately.</li>
             * <li>Period: Executes the command on a schedule.</li>
             * <li>NextRebootOnly: Automatically executes the command the next time the instance starts.</li>
             * <li>EveryReboot: Automatically executes the command every time the instance starts.</li>
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
             * <p>The timeout period for executing the command. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder timeout(Integer timeout) {
                this.timeout = timeout;
                return this;
            }

            /**
             * <p>The username of the user who executes the command.</p>
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
             * <p>The file delivery records.</p>
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
