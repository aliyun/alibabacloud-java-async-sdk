// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

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
 * {@link DescribeCommandInvocationsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCommandInvocationsResponseBody</p>
 */
public class DescribeCommandInvocationsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CommandInvocations")
    private java.util.List<CommandInvocations> commandInvocations;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeCommandInvocationsResponseBody(Builder builder) {
        this.commandInvocations = builder.commandInvocations;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCommandInvocationsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return commandInvocations
     */
    public java.util.List<CommandInvocations> getCommandInvocations() {
        return this.commandInvocations;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
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
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<CommandInvocations> commandInvocations; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeCommandInvocationsResponseBody model) {
            this.commandInvocations = model.commandInvocations;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The command executions.</p>
         */
        public Builder commandInvocations(java.util.List<CommandInvocations> commandInvocations) {
            this.commandInvocations = commandInvocations;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>30637AD6-D977-4833-A54C-CC89483E****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeCommandInvocationsResponseBody build() {
            return new DescribeCommandInvocationsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCommandInvocationsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCommandInvocationsResponseBody</p>
     */
    public static class InvokeInstances extends TeaModel {
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

        @com.aliyun.core.annotation.NameInMap("InvocationStatus")
        private String invocationStatus;

        @com.aliyun.core.annotation.NameInMap("Output")
        private String output;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        private InvokeInstances(Builder builder) {
            this.errorCode = builder.errorCode;
            this.errorInfo = builder.errorInfo;
            this.exitCode = builder.exitCode;
            this.finishTime = builder.finishTime;
            this.instanceId = builder.instanceId;
            this.invocationStatus = builder.invocationStatus;
            this.output = builder.output;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InvokeInstances create() {
            return builder().build();
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
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private String errorCode; 
            private String errorInfo; 
            private Long exitCode; 
            private String finishTime; 
            private String instanceId; 
            private String invocationStatus; 
            private String output; 
            private String startTime; 

            private Builder() {
            } 

            private Builder(InvokeInstances model) {
                this.errorCode = model.errorCode;
                this.errorInfo = model.errorInfo;
                this.exitCode = model.exitCode;
                this.finishTime = model.finishTime;
                this.instanceId = model.instanceId;
                this.invocationStatus = model.invocationStatus;
                this.output = model.output;
                this.startTime = model.startTime;
            } 

            /**
             * <p>The error code returned if the command failed to be sent or run.</p>
             * <ul>
             * <li>null: The command is run as expected.</li>
             * <li>InstanceNotExists: The specified instance does not exist or is released.</li>
             * <li>InstanceReleased: The instance is released when the command is being run.</li>
             * <li>InstanceNotRunning: The instance is not in the Running state when the command is being run.</li>
             * <li>CommandNotApplicable: The command is not applicable to the specified instance.</li>
             * <li>AccountNotExists: The specified account does not exist.</li>
             * <li>DirectoryNotExists: The specified directory does not exist.</li>
             * <li>BadCronExpression: The specified CRON expression for the execution schedule is invalid.</li>
             * <li>ClientNotRunning: Cloud Assistant Agent is not running.</li>
             * <li>ClientNotResponse: Cloud Assistant Agent does not respond to your request.</li>
             * <li>ClientIsUpgrading: Cloud Assistant Agent is being updated.</li>
             * <li>ClientNeedUpgrade: Cloud Assistant Agent needs to be updated.</li>
             * <li>DeliveryTimeout: The request to send the command timed out.</li>
             * <li>ExecutionTimeout: The command execution timed out.</li>
             * <li>ExecutionException: An exception occurred when the command was being run.</li>
             * <li>ExecutionInterrupted: The command execution is interrupted.</li>
             * <li>ExitCodeNonzero: The command execution is complete, and the exit code is not 0.</li>
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
             * <p>The error message returned if the command failed to be sent or run. Valid values:</p>
             * <ul>
             * <li>null: The command is run as expected.</li>
             * <li>the specified instance does not exists: The specified instance does not exist or is released.</li>
             * <li>the instance has released when create task: The instance is released when the command is being run.</li>
             * <li>the instance is not running when create task: The instance is not in the Running state when the command is being run.</li>
             * <li>the command is not applicable: The command is not applicable to the specified instance.</li>
             * <li>the specified account does not exists: The specified account does not exist.</li>
             * <li>the specified directory does not exists: The specified directory does not exist.</li>
             * <li>the cron job expression is invalid: The specified CRON expression for the execution schedule is invalid.</li>
             * <li>the aliyun service is not running on the instance: Cloud Assistant Agent is not running.</li>
             * <li>the aliyun service in the instance does not response: Cloud Assistant Agent does not respond to your request.</li>
             * <li>the aliyun service in the instance is upgrading now: Cloud Assistant Agent is being updated.</li>
             * <li>the aliyun service in the instance need upgrade: Cloud Assistant Agent needs to be updated.</li>
             * <li>the command delivery has been timeout: The request to send the command timed out.</li>
             * <li>the command execution has been timeout: The command execution timed out.</li>
             * <li>the command execution got an exception: An exception occurred when the command was being run.</li>
             * <li>the command execution has been interrupted: The command execution is interrupted.</li>
             * <li>the command execution exit code is not zero: The command execution is complete, and the exit code is not 0.</li>
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
             * <p>The exit code of the command.</p>
             * <ul>
             * <li>For Linux instances, the exit code is the exit code of the shell command.</li>
             * <li>For Windows instances, the exit code is the exit code of the batch or PowerShell command.</li>
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
             * <p>The end of the time range during which the command is run on the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-04-03T02:42:29Z</p>
             */
            public Builder finishTime(String finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * <p>The ID of the simple application server.</p>
             * 
             * <strong>example:</strong>
             * <p>2445f4aecdac4b71ba2c7e3a7ccf****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The execution state of the command on a single instance. Valid values:</p>
             * <ul>
             * <li><p>Pending: The command is being verified or sent.</p>
             * </li>
             * <li><p>Invalid: The specified command type or parameter is invalid.</p>
             * </li>
             * <li><p>Aborted: The command failed to be sent to the instance. To send a command to an instance, make sure that the instance is in the Running state and the command is sent to the instance within 1 minute.</p>
             * </li>
             * <li><p>Running: The command is being run on the instance.</p>
             * </li>
             * <li><p>Success:</p>
             * <ul>
             * <li>Command that is set to run only once: The command execution is complete, and the exit code is 0.</li>
             * <li>Command that is set to run on a schedule: The previous command execution is complete, the exit code is 0, and the specified cycle ends.</li>
             * </ul>
             * </li>
             * <li><p>Failed:</p>
             * <ul>
             * <li>Command that is set to run only once: The command execution is complete, and the exit code is not 0.</li>
             * <li>Command that is set to run on a schedule: The previous command execution is complete, the exit code is not 0, and the specified cycle is about to end.</li>
             * </ul>
             * </li>
             * <li><p>Error: The command execution cannot proceed due to an exception.</p>
             * </li>
             * <li><p>Timeout: The command execution timed out.</p>
             * </li>
             * <li><p>Cancelled: The command execution is canceled, and the command is not started.</p>
             * </li>
             * <li><p>Stopping: The command task is being stopped.</p>
             * </li>
             * <li><p>Terminated: The command is terminated when it is being run.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder invocationStatus(String invocationStatus) {
                this.invocationStatus = invocationStatus;
                return this;
            }

            /**
             * <p>The command output.</p>
             * 
             * <strong>example:</strong>
             * <p>OutputMsg</p>
             */
            public Builder output(String output) {
                this.output = output;
                return this;
            }

            /**
             * <p>The beginning of the time range during which the command is run on the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-05-09T03:32:24Z</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            public InvokeInstances build() {
                return new InvokeInstances(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCommandInvocationsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCommandInvocationsResponseBody</p>
     */
    public static class CommandInvocations extends TeaModel {
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

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("InvocationStatus")
        private String invocationStatus;

        @com.aliyun.core.annotation.NameInMap("InvokeId")
        private String invokeId;

        @com.aliyun.core.annotation.NameInMap("InvokeInstances")
        private java.util.List<InvokeInstances> invokeInstances;

        @com.aliyun.core.annotation.NameInMap("Parameters")
        private String parameters;

        @com.aliyun.core.annotation.NameInMap("Timeout")
        private Long timeout;

        @com.aliyun.core.annotation.NameInMap("Username")
        private String username;

        @com.aliyun.core.annotation.NameInMap("WorkingDir")
        private String workingDir;

        private CommandInvocations(Builder builder) {
            this.commandContent = builder.commandContent;
            this.commandDescription = builder.commandDescription;
            this.commandId = builder.commandId;
            this.commandName = builder.commandName;
            this.commandType = builder.commandType;
            this.creationTime = builder.creationTime;
            this.invocationStatus = builder.invocationStatus;
            this.invokeId = builder.invokeId;
            this.invokeInstances = builder.invokeInstances;
            this.parameters = builder.parameters;
            this.timeout = builder.timeout;
            this.username = builder.username;
            this.workingDir = builder.workingDir;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CommandInvocations create() {
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
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
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
        public java.util.List<InvokeInstances> getInvokeInstances() {
            return this.invokeInstances;
        }

        /**
         * @return parameters
         */
        public String getParameters() {
            return this.parameters;
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
            private String creationTime; 
            private String invocationStatus; 
            private String invokeId; 
            private java.util.List<InvokeInstances> invokeInstances; 
            private String parameters; 
            private Long timeout; 
            private String username; 
            private String workingDir; 

            private Builder() {
            } 

            private Builder(CommandInvocations model) {
                this.commandContent = model.commandContent;
                this.commandDescription = model.commandDescription;
                this.commandId = model.commandId;
                this.commandName = model.commandName;
                this.commandType = model.commandType;
                this.creationTime = model.creationTime;
                this.invocationStatus = model.invocationStatus;
                this.invokeId = model.invokeId;
                this.invokeInstances = model.invokeInstances;
                this.parameters = model.parameters;
                this.timeout = model.timeout;
                this.username = model.username;
                this.workingDir = model.workingDir;
            } 

            /**
             * <p>The content of the command.</p>
             * 
             * <strong>example:</strong>
             * <p>echo 123</p>
             */
            public Builder commandContent(String commandContent) {
                this.commandContent = commandContent;
                return this;
            }

            /**
             * <p>The description of the command.</p>
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
             * <p>c-hy0338xh28r****</p>
             */
            public Builder commandId(String commandId) {
                this.commandId = commandId;
                return this;
            }

            /**
             * <p>The command name.</p>
             * 
             * <strong>example:</strong>
             * <p>testCommandName</p>
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
             * <p>The time when the command was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-04-27T10:11:58</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The overall execution state of the command. Valid values:</p>
             * <ul>
             * <li>Pending: The command is being verified or sent.</li>
             * <li>Invalid: The specified command type or parameter is invalid.</li>
             * <li>Aborted: The command failed to be sent to the instances. To send a command to an instance, make sure that the instance is in the Running state and the command is sent to the instance within 1 minute.</li>
             * <li>Running: The command is being run on the instances.</li>
             * <li>Success: The command execution is complete, and the exit code is 0.</li>
             * <li>Failed: The command execution is complete, and the exit code is not 0.</li>
             * <li>Error: The command execution cannot proceed due to an exception.</li>
             * <li>Timeout: The command execution timed out.</li>
             * <li>Cancelled: The command execution is canceled, and the command is not started.</li>
             * <li>Stopping: The command in the Running state is being stopped.</li>
             * <li>Terminated: The command is terminated when it is being run.</li>
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
             * <p>The execution ID of the command.</p>
             * 
             * <strong>example:</strong>
             * <p>t-hz0373jyzxt****</p>
             */
            public Builder invokeId(String invokeId) {
                this.invokeId = invokeId;
                return this;
            }

            /**
             * <p>The instances on which the command is run.</p>
             */
            public Builder invokeInstances(java.util.List<InvokeInstances> invokeInstances) {
                this.invokeInstances = invokeInstances;
                return this;
            }

            /**
             * <p>The custom parameters in the command. If no custom parameter exists in the command, the default value is {}.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder parameters(String parameters) {
                this.parameters = parameters;
                return this;
            }

            /**
             * <p>The timeout period. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder timeout(Long timeout) {
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
             * <p>The working directory of the command.</p>
             * 
             * <strong>example:</strong>
             * <p>c:\wwwroot</p>
             */
            public Builder workingDir(String workingDir) {
                this.workingDir = workingDir;
                return this;
            }

            public CommandInvocations build() {
                return new CommandInvocations(this);
            } 

        } 

    }
}
