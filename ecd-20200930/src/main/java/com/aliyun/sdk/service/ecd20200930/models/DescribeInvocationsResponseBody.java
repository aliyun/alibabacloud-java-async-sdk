// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
    private java.util.List < Invocations> invocations;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeInvocationsResponseBody(Builder builder) {
        this.invocations = builder.invocations;
        this.nextToken = builder.nextToken;
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
    public java.util.List < Invocations> getInvocations() {
        return this.invocations;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Invocations> invocations; 
        private String nextToken; 
        private String requestId; 

        /**
         * The command execution records.
         */
        public Builder invocations(java.util.List < Invocations> invocations) {
            this.invocations = invocations;
            return this;
        }

        /**
         * The query token that is returned in this call.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeInvocationsResponseBody build() {
            return new DescribeInvocationsResponseBody(this);
        } 

    } 

    public static class InvokeDesktops extends TeaModel {
        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("DesktopId")
        private String desktopId;

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

        @NameInMap("UpdateTime")
        private String updateTime;

        private InvokeDesktops(Builder builder) {
            this.creationTime = builder.creationTime;
            this.desktopId = builder.desktopId;
            this.dropped = builder.dropped;
            this.errorCode = builder.errorCode;
            this.errorInfo = builder.errorInfo;
            this.exitCode = builder.exitCode;
            this.finishTime = builder.finishTime;
            this.invocationStatus = builder.invocationStatus;
            this.output = builder.output;
            this.repeats = builder.repeats;
            this.startTime = builder.startTime;
            this.stopTime = builder.stopTime;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InvokeDesktops create() {
            return builder().build();
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return desktopId
         */
        public String getDesktopId() {
            return this.desktopId;
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
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String creationTime; 
            private String desktopId; 
            private Integer dropped; 
            private String errorCode; 
            private String errorInfo; 
            private Long exitCode; 
            private String finishTime; 
            private String invocationStatus; 
            private String output; 
            private Integer repeats; 
            private String startTime; 
            private String stopTime; 
            private String updateTime; 

            /**
             * The time when the command execution was created.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The ID of the cloud desktop.
             */
            public Builder desktopId(String desktopId) {
                this.desktopId = desktopId;
                return this;
            }

            /**
             * The size of the text that is truncated and discarded when the value of the Output parameter exceeds 24 KB in size.
             */
            public Builder dropped(Integer dropped) {
                this.dropped = dropped;
                return this;
            }

            /**
             * The error code that is returned if the command failed to be sent or run.
             * <p>
             * 
             * *   If null is returned, the command is run normally.
             * *   If InstanceNotExists is returned, the specified cloud desktop does not exist or is released.
             * *   If InstanceReleased is returned, the specified cloud desktop is released during the command execution.
             * *   If InstanceNotRunning is returned, the specified cloud desktop is not in the Running state when the execution is created.
             * *   If CommandNotApplicable is returned, the command cannot be run on the specified cloud desktop.
             * *   If ClientNotRunning is returned, Cloud Assistant is not running.
             * *   If ClientNotResponse is returned, Cloud Assistant does not respond to your request.
             * *   If ClientIsUpgrading is returned, Cloud Assistant is being upgraded.
             * *   If ClientNeedUpgrade is returned, you must upgrade Cloud Assistant.
             * *   If DeliveryTimeout is returned, the operation to send the command times out.
             * *   If ExecutionTimeout is returned, the command execution times out.
             * *   If ExecutionException is returned, an execution occurs during the command execution.
             * *   If ExecutionInterrupted is returned, the command execution is interrupted.
             * *   If ExitCodeNonzero is returned, the command execution is complete, but the exit code is not 0.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * The error message that is returned if the command failed to be sent or run.
             * <p>
             * 
             * *   If null is returned, the command is run normally.
             * *   If "the specified instance does not exist" is returned, the specified cloud desktop does not exist or is released.
             * *   If "the instance has released when create task" is returned, the specified cloud desktop is released during the command execution.
             * *   If "the instance is not running when create task" is returned, the specified cloud desktop is not in the Running state when the execution is created.
             * *   If "the command is not applicable" is returned, the command cannot be run on the specified cloud desktop.
             * *   If "the aliyun service is not running on the instance" is returned, Cloud Assistant is not running.
             * *   If "the aliyun service in the instance does not response" is returned, Cloud Assistant does not respond to your request.
             * *   If "the aliyun service in the instance is upgrading now" is returned, Cloud Assistant is being upgraded.
             * *   If "the aliyun service in the instance need upgrade" is returned, you must upgrade Cloud Assistant.
             * *   If "the command delivery has been timeout" is returned, the operation to send the command times out.
             * *   If "the command execution has been timeout" is returned, the command execution times out.
             * *   If "the command execution got an exception" is returned, an exception occurs during the command execution.
             * *   If "the command execution has been interrupted" is returned, the command execution is interrupted.
             * *   If "the command execution exit code is not zero" is returned, the command execution is complete, but the exit code is not 0.
             */
            public Builder errorInfo(String errorInfo) {
                this.errorInfo = errorInfo;
                return this;
            }

            /**
             * The exit code of the execution.
             */
            public Builder exitCode(Long exitCode) {
                this.exitCode = exitCode;
                return this;
            }

            /**
             * The end time of the command execution.
             */
            public Builder finishTime(String finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * The execution status on a cloud desktop.
             */
            public Builder invocationStatus(String invocationStatus) {
                this.invocationStatus = invocationStatus;
                return this;
            }

            /**
             * The command output.
             * <p>
             * 
             * *   If the IncludeOutput parameter is set to false, no value of the Output parameter is returned.
             * *   If the ContentEncoding parameter is set to Base64, the value of the Output parameter is encoded in Base64.
             */
            public Builder output(String output) {
                this.output = output;
                return this;
            }

            /**
             * The number of times that the command is run on the cloud desktop.
             */
            public Builder repeats(Integer repeats) {
                this.repeats = repeats;
                return this;
            }

            /**
             * The start time of the command execution on the cloud desktop.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * If you called the [stopInvocation](~~196957~~) operation, the value of this parameter indicates the time when you made the call.
             */
            public Builder stopTime(String stopTime) {
                this.stopTime = stopTime;
                return this;
            }

            /**
             * The time when the execution status was last updated.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public InvokeDesktops build() {
                return new InvokeDesktops(this);
            } 

        } 

    }
    public static class Invocations extends TeaModel {
        @NameInMap("CommandContent")
        private String commandContent;

        @NameInMap("CommandType")
        private String commandType;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("EndUserId")
        private String endUserId;

        @NameInMap("InvocationStatus")
        private String invocationStatus;

        @NameInMap("InvokeDesktops")
        private java.util.List < InvokeDesktops> invokeDesktops;

        @NameInMap("InvokeId")
        private String invokeId;

        private Invocations(Builder builder) {
            this.commandContent = builder.commandContent;
            this.commandType = builder.commandType;
            this.creationTime = builder.creationTime;
            this.endUserId = builder.endUserId;
            this.invocationStatus = builder.invocationStatus;
            this.invokeDesktops = builder.invokeDesktops;
            this.invokeId = builder.invokeId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Invocations create() {
            return builder().build();
        }

        /**
         * @return commandContent
         */
        public String getCommandContent() {
            return this.commandContent;
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
         * @return endUserId
         */
        public String getEndUserId() {
            return this.endUserId;
        }

        /**
         * @return invocationStatus
         */
        public String getInvocationStatus() {
            return this.invocationStatus;
        }

        /**
         * @return invokeDesktops
         */
        public java.util.List < InvokeDesktops> getInvokeDesktops() {
            return this.invokeDesktops;
        }

        /**
         * @return invokeId
         */
        public String getInvokeId() {
            return this.invokeId;
        }

        public static final class Builder {
            private String commandContent; 
            private String commandType; 
            private String creationTime; 
            private String endUserId; 
            private String invocationStatus; 
            private java.util.List < InvokeDesktops> invokeDesktops; 
            private String invokeId; 

            /**
             * The command content that is encoded in Base64.
             */
            public Builder commandContent(String commandContent) {
                this.commandContent = commandContent;
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
             * The time when the task was created.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The ID of the end user.
             */
            public Builder endUserId(String endUserId) {
                this.endUserId = endUserId;
                return this;
            }

            /**
             * The overall execution status of the command. The overall execution status is determined by the execution status of the command on all related cloud desktops. Valid values:
             * <p>
             * 
             * *   Pending: The system is verifying or sending the command. If the execution status on at least one cloud desktop is Pending, the overall execution status is Pending.
             * 
             * *   Running: The execution is in progress on cloud desktops. If the execution status on at least one cloud desktop is Running, the overall execution status is Running.
             * 
             * *   Success: If the execution status on at least one cloud desktop is Success, and the execution status on other cloud desktops is Success or Stopped, the overall execution status is Success.
             * 
             * *   Failed: If the execution status on all cloud desktops is Stopped or Failed, the overall execution status is Failed. If one or more execution status on a cloud desktop is one of the following values, Failed is returned:
             * 
             *     *   Invalid: The command is invalid.
             *     *   Aborted: The command failed to be sent.
             *     *   Failed: The execution is complete, but the exit code is not 0.
             *     *   Timeout: The execution times out.
             *     *   Error: An error occurs when the execution is in progress.
             * 
             * *   Stopping: The execution is being stopped. If the execution status on at least one cloud desktop is Stopping, the overall execution status is Stopping.
             * 
             * *   Stopped: The execution is stopped. If the execution status on all cloud desktops is Stopped, the overall execution status is Stopped. If the execution status on a cloud desktop is one of the following values, Stopped is returned:
             * 
             *     *   Cancelled: The execution is canceled.
             *     *   Terminated: The execution is terminated.
             * 
             * *   PartialFailed: The execution is successful on specific cloud desktops and failed on other cloud desktops. If the execution status on different cloud desktops includes Success, Failed, and Stopped, the overall execution status is PartialFailed.
             */
            public Builder invocationStatus(String invocationStatus) {
                this.invocationStatus = invocationStatus;
                return this;
            }

            /**
             * The cloud desktops on which the command is run.
             */
            public Builder invokeDesktops(java.util.List < InvokeDesktops> invokeDesktops) {
                this.invokeDesktops = invokeDesktops;
                return this;
            }

            /**
             * The ID of the execution.
             */
            public Builder invokeId(String invokeId) {
                this.invokeId = invokeId;
                return this;
            }

            public Invocations build() {
                return new Invocations(this);
            } 

        } 

    }
}
