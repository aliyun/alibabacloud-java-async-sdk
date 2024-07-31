// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCommandInvocationsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCommandInvocationsResponseBody</p>
 */
public class DescribeCommandInvocationsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CommandInvocations")
    private java.util.List < CommandInvocations> commandInvocations;

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

    /**
     * @return commandInvocations
     */
    public java.util.List < CommandInvocations> getCommandInvocations() {
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
        private java.util.List < CommandInvocations> commandInvocations; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The command executions.
         */
        public Builder commandInvocations(java.util.List < CommandInvocations> commandInvocations) {
            this.commandInvocations = commandInvocations;
            return this;
        }

        /**
         * The page number.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page.
         */
        public Builder pageSize(Integer pageSize) {
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
         * The total number of entries.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeCommandInvocationsResponseBody build() {
            return new DescribeCommandInvocationsResponseBody(this);
        } 

    } 

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

            /**
             * The error code returned if the command failed to be sent or run.
             * <p>
             * 
             * *   null: The command is run as expected.
             * *   InstanceNotExists: The specified instance does not exist or is released.
             * *   InstanceReleased: The instance is released when the command is being run.
             * *   InstanceNotRunning: The instance is not in the Running state when the command is being run.
             * *   CommandNotApplicable: The command is not applicable to the specified instance.
             * *   AccountNotExists: The specified account does not exist.
             * *   DirectoryNotExists: The specified directory does not exist.
             * *   BadCronExpression: The specified CRON expression for the execution schedule is invalid.
             * *   ClientNotRunning: Cloud Assistant Agent is not running.
             * *   ClientNotResponse: Cloud Assistant Agent does not respond to your request.
             * *   ClientIsUpgrading: Cloud Assistant Agent is being updated.
             * *   ClientNeedUpgrade: Cloud Assistant Agent needs to be updated.
             * *   DeliveryTimeout: The request to send the command timed out.
             * *   ExecutionTimeout: The command execution timed out.
             * *   ExecutionException: An exception occurred when the command was being run.
             * *   ExecutionInterrupted: The command execution is interrupted.
             * *   ExitCodeNonzero: The command execution is complete, and the exit code is not 0.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * The error message returned if the command failed to be sent or run. Valid values:
             * <p>
             * 
             * *   null: The command is run as expected.
             * *   the specified instance does not exists: The specified instance does not exist or is released.
             * *   the instance has released when create task: The instance is released when the command is being run.
             * *   the instance is not running when create task: The instance is not in the Running state when the command is being run.
             * *   the command is not applicable: The command is not applicable to the specified instance.
             * *   the specified account does not exists: The specified account does not exist.
             * *   the specified directory does not exists: The specified directory does not exist.
             * *   the cron job expression is invalid: The specified CRON expression for the execution schedule is invalid.
             * *   the aliyun service is not running on the instance: Cloud Assistant Agent is not running.
             * *   the aliyun service in the instance does not response: Cloud Assistant Agent does not respond to your request.
             * *   the aliyun service in the instance is upgrading now: Cloud Assistant Agent is being updated.
             * *   the aliyun service in the instance need upgrade: Cloud Assistant Agent needs to be updated.
             * *   the command delivery has been timeout: The request to send the command timed out.
             * *   the command execution has been timeout: The command execution timed out.
             * *   the command execution got an exception: An exception occurred when the command was being run.
             * *   the command execution has been interrupted: The command execution is interrupted.
             * *   the command execution exit code is not zero: The command execution is complete, and the exit code is not 0.
             */
            public Builder errorInfo(String errorInfo) {
                this.errorInfo = errorInfo;
                return this;
            }

            /**
             * The exit code of the command.
             * <p>
             * 
             * *   For Linux instances, the exit code is the exit code of the shell command.
             * *   For Windows instances, the exit code is the exit code of the batch or PowerShell command.
             */
            public Builder exitCode(Long exitCode) {
                this.exitCode = exitCode;
                return this;
            }

            /**
             * The end of the time range during which the command is run on the instance.
             */
            public Builder finishTime(String finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * The ID of the simple application server.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The execution state of the command on a single instance. Valid values:
             * <p>
             * 
             * *   Pending: The command is being verified or sent.
             * 
             * *   Invalid: The specified command type or parameter is invalid.
             * 
             * *   Aborted: The command failed to be sent to the instance. To send a command to an instance, make sure that the instance is in the Running state and the command is sent to the instance within 1 minute.
             * 
             * *   Running: The command is being run on the instance.
             * 
             * *   Success:
             * 
             *     *   Command that is set to run only once: The command execution is complete, and the exit code is 0.
             *     *   Command that is set to run on a schedule: The previous command execution is complete, the exit code is 0, and the specified cycle ends.
             * 
             * *   Failed:
             * 
             *     *   Command that is set to run only once: The command execution is complete, and the exit code is not 0.
             *     *   Command that is set to run on a schedule: The previous command execution is complete, the exit code is not 0, and the specified cycle is about to end.
             * 
             * *   Error: The command execution cannot proceed due to an exception.
             * 
             * *   Timeout: The command execution timed out.
             * 
             * *   Cancelled: The command execution is canceled, and the command is not started.
             * 
             * *   Stopping: The command task is being stopped.
             * 
             * *   Terminated: The command is terminated when it is being run.
             */
            public Builder invocationStatus(String invocationStatus) {
                this.invocationStatus = invocationStatus;
                return this;
            }

            /**
             * The command output.
             */
            public Builder output(String output) {
                this.output = output;
                return this;
            }

            /**
             * The beginning of the time range during which the command is run on the instance.
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
        private java.util.List < InvokeInstances> invokeInstances;

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
        public java.util.List < InvokeInstances> getInvokeInstances() {
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
            private java.util.List < InvokeInstances> invokeInstances; 
            private String parameters; 
            private Long timeout; 
            private String username; 
            private String workingDir; 

            /**
             * The content of the command.
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
             * The time when the command was created.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The overall execution state of the command. Valid values:
             * <p>
             * 
             * *   Pending: The command is being verified or sent.
             * *   Invalid: The specified command type or parameter is invalid.
             * *   Aborted: The command failed to be sent to the instances. To send a command to an instance, make sure that the instance is in the Running state and the command is sent to the instance within 1 minute.
             * *   Running: The command is being run on the instances.
             * *   Success: The command execution is complete, and the exit code is 0.
             * *   Failed: The command execution is complete, and the exit code is not 0.
             * *   Error: The command execution cannot proceed due to an exception.
             * *   Timeout: The command execution timed out.
             * *   Cancelled: The command execution is canceled, and the command is not started.
             * *   Stopping: The command in the Running state is being stopped.
             * *   Terminated: The command is terminated when it is being run.
             */
            public Builder invocationStatus(String invocationStatus) {
                this.invocationStatus = invocationStatus;
                return this;
            }

            /**
             * The execution ID of the command.
             */
            public Builder invokeId(String invokeId) {
                this.invokeId = invokeId;
                return this;
            }

            /**
             * The instances on which the command is run.
             */
            public Builder invokeInstances(java.util.List < InvokeInstances> invokeInstances) {
                this.invokeInstances = invokeInstances;
                return this;
            }

            /**
             * The custom parameters in the command. If no custom parameter exists in the command, the default value is {}.
             */
            public Builder parameters(String parameters) {
                this.parameters = parameters;
                return this;
            }

            /**
             * The timeout period. Unit: seconds.
             */
            public Builder timeout(Long timeout) {
                this.timeout = timeout;
                return this;
            }

            /**
             * The username that is used to run the command.
             */
            public Builder username(String username) {
                this.username = username;
                return this;
            }

            /**
             * The working directory of the command.
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
