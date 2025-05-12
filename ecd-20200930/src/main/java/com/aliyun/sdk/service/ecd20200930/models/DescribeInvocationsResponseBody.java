// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
    private java.util.List<Invocations> invocations;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return invocations
     */
    public java.util.List<Invocations> getInvocations() {
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
        private java.util.List<Invocations> invocations; 
        private String nextToken; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeInvocationsResponseBody model) {
            this.invocations = model.invocations;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The command execution records.</p>
         */
        public Builder invocations(java.util.List<Invocations> invocations) {
            this.invocations = invocations;
            return this;
        }

        /**
         * <p>The query token that is returned from this call.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAV3MpHK1AP0pfERHZN5pu6nmB7qrRFJ8vmttjxPL****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
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
    public static class InvokeDesktops extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("DesktopId")
        private String desktopId;

        @com.aliyun.core.annotation.NameInMap("DesktopName")
        private String desktopName;

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

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        private InvokeDesktops(Builder builder) {
            this.creationTime = builder.creationTime;
            this.desktopId = builder.desktopId;
            this.desktopName = builder.desktopName;
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
         * @return desktopName
         */
        public String getDesktopName() {
            return this.desktopName;
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
            private String desktopName; 
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

            private Builder() {
            } 

            private Builder(InvokeDesktops model) {
                this.creationTime = model.creationTime;
                this.desktopId = model.desktopId;
                this.desktopName = model.desktopName;
                this.dropped = model.dropped;
                this.errorCode = model.errorCode;
                this.errorInfo = model.errorInfo;
                this.exitCode = model.exitCode;
                this.finishTime = model.finishTime;
                this.invocationStatus = model.invocationStatus;
                this.output = model.output;
                this.repeats = model.repeats;
                this.startTime = model.startTime;
                this.stopTime = model.stopTime;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>The time when the command execution was performed.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-12-20T06:15:54Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The cloud computer ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ecd-7w78ozhjcwa3u****</p>
             */
            public Builder desktopId(String desktopId) {
                this.desktopId = desktopId;
                return this;
            }

            /**
             * <p>The cloud computer name.</p>
             * 
             * <strong>example:</strong>
             * <p>demo1234</p>
             */
            public Builder desktopName(String desktopName) {
                this.desktopName = desktopName;
                return this;
            }

            /**
             * <p>The size of the text that is truncated and discarded when the Output value exceeds 24 KB in size.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder dropped(Integer dropped) {
                this.dropped = dropped;
                return this;
            }

            /**
             * <p>The code explaining why the command failed to be sent or executed. Valid values:</p>
             * <ul>
             * <li>Null: The command is executed successfully.</li>
             * <li>InstanceNotExists: The specified cloud computer does not exist or is released.</li>
             * <li>InstanceReleased: The cloud computer is released during the execution.</li>
             * <li>InstanceNotRunning: The cloud computer is not running during the execution.</li>
             * <li>CommandNotApplicable: The command cannot be executed on the specified cloud computer.</li>
             * <li>ClientNotRunning: The Cloud Assistant agent is not running.</li>
             * <li>ClientNotResponse: The Cloud Assistant agent does not respond.</li>
             * <li>ClientIsUpgrading: The Cloud Assistant agent is being updated.</li>
             * <li>ClientNeedUpgrade: The Cloud Assistant agent needs to be updated.</li>
             * <li>DeliveryTimeout: The command sending times out.</li>
             * <li>ExecutionTimeout: The command execution times out.</li>
             * <li>ExecutionException: An exception occurs when the command is being executed.</li>
             * <li>ExecutionInterrupted: The command execution is interrupted.</li>
             * <li>ExitCodeNonzero: The command execution completes, but the exit code is not 0.</li>
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
             * <p>The message explaining why the command failed to be sent or executed. Valid values:</p>
             * <ul>
             * <li>Null: The command is executed successfully.</li>
             * <li>the specified instance does not exists: The specified cloud computer does not exist or is released.</li>
             * <li>the instance has released when create task: The cloud computer is released during the execution.</li>
             * <li>the instance is not running when create task: The cloud computer is not running during the execution.</li>
             * <li>the command is not applicable: The command cannot be executed on the specified cloud computer.</li>
             * <li>the aliyun service is not running on the instance: The Cloud Assistant agent is not running.</li>
             * <li>the aliyun service in the instance does not response: The Cloud Assistant agent does not respond.</li>
             * <li>the aliyun service in the instance is upgrading now: The Cloud Assistant agent is being updated.</li>
             * <li>the aliyun service in the instance need upgrade: The Cloud Assistant agent needs to be updated.</li>
             * <li>the command delivery has been timeout: The command sending times out.</li>
             * <li>the command execution has been timeout: The command execution times out.</li>
             * <li>the command execution got an exception: An exception occurs when the command is being executed.</li>
             * <li>the command execution has been interrupted: The command execution is interrupted.</li>
             * <li>the command execution exit code is not zero: The command execution completes, but the exit code is not 0.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>The specified instance does not exist.</p>
             */
            public Builder errorInfo(String errorInfo) {
                this.errorInfo = errorInfo;
                return this;
            }

            /**
             * <p>The exit code of the execution.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder exitCode(Long exitCode) {
                this.exitCode = exitCode;
                return this;
            }

            /**
             * <p>The time when the command execution ended.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-12-20T06:15:56Z</p>
             */
            public Builder finishTime(String finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * <p>The execution progress of the command on a single cloud computer.</p>
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
             * <li>When the <code>IncludeOutput</code> parameter is set to false, the output is not returned.</li>
             * <li>When the <code>ContentEncoding</code> parameter is set to Base64, the output is returned as a Base64-encoded string.</li>
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
             * <p>The number of times the command has been executed on the cloud computer.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder repeats(Integer repeats) {
                this.repeats = repeats;
                return this;
            }

            /**
             * <p>The start time of the command execution.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-12-20T06:15:55Z</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The stop time of the command execution (StopInvocatio).</p>
             * 
             * <strong>example:</strong>
             * <p>2020-12-25T09:15:47Z</p>
             */
            public Builder stopTime(String stopTime) {
                this.stopTime = stopTime;
                return this;
            }

            /**
             * <p>The time when the execution status was updated.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-12-25T06:15:56Z</p>
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
    /**
     * 
     * {@link DescribeInvocationsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInvocationsResponseBody</p>
     */
    public static class Invocations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CommandContent")
        private String commandContent;

        @com.aliyun.core.annotation.NameInMap("CommandType")
        private String commandType;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("EndUserId")
        private String endUserId;

        @com.aliyun.core.annotation.NameInMap("InvocationStatus")
        private String invocationStatus;

        @com.aliyun.core.annotation.NameInMap("InvokeDesktopCount")
        private Integer invokeDesktopCount;

        @com.aliyun.core.annotation.NameInMap("InvokeDesktopSucceedCount")
        private Integer invokeDesktopSucceedCount;

        @com.aliyun.core.annotation.NameInMap("InvokeDesktops")
        private java.util.List<InvokeDesktops> invokeDesktops;

        @com.aliyun.core.annotation.NameInMap("InvokeId")
        private String invokeId;

        private Invocations(Builder builder) {
            this.commandContent = builder.commandContent;
            this.commandType = builder.commandType;
            this.creationTime = builder.creationTime;
            this.endUserId = builder.endUserId;
            this.invocationStatus = builder.invocationStatus;
            this.invokeDesktopCount = builder.invokeDesktopCount;
            this.invokeDesktopSucceedCount = builder.invokeDesktopSucceedCount;
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
         * @return invokeDesktopCount
         */
        public Integer getInvokeDesktopCount() {
            return this.invokeDesktopCount;
        }

        /**
         * @return invokeDesktopSucceedCount
         */
        public Integer getInvokeDesktopSucceedCount() {
            return this.invokeDesktopSucceedCount;
        }

        /**
         * @return invokeDesktops
         */
        public java.util.List<InvokeDesktops> getInvokeDesktops() {
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
            private Integer invokeDesktopCount; 
            private Integer invokeDesktopSucceedCount; 
            private java.util.List<InvokeDesktops> invokeDesktops; 
            private String invokeId; 

            private Builder() {
            } 

            private Builder(Invocations model) {
                this.commandContent = model.commandContent;
                this.commandType = model.commandType;
                this.creationTime = model.creationTime;
                this.endUserId = model.endUserId;
                this.invocationStatus = model.invocationStatus;
                this.invokeDesktopCount = model.invokeDesktopCount;
                this.invokeDesktopSucceedCount = model.invokeDesktopSucceedCount;
                this.invokeDesktops = model.invokeDesktops;
                this.invokeId = model.invokeId;
            } 

            /**
             * <p>The Base64-encoded command content.</p>
             * 
             * <strong>example:</strong>
             * <p>cnBtIC1xYSB8IGdyZXAgdnNm****</p>
             */
            public Builder commandContent(String commandContent) {
                this.commandContent = commandContent;
                return this;
            }

            /**
             * <p>The type of the command.</p>
             * 
             * <strong>example:</strong>
             * <p>RunPowerShellScript</p>
             */
            public Builder commandType(String commandType) {
                this.commandType = commandType;
                return this;
            }

            /**
             * <p>The time when the execution task is created.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-12-19T09:15:46Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The ID of the end user.</p>
             * 
             * <strong>example:</strong>
             * <p>User1</p>
             */
            public Builder endUserId(String endUserId) {
                this.endUserId = endUserId;
                return this;
            }

            /**
             * <p>The overall execution status of the command. The value of this parameter depends on the execution status of the command on all the involved cloud computers. Valid values:</p>
             * <ul>
             * <li><p>Pending: The command is being verified or sent. If the execution status is Pending on at least one cloud computer, the overall status is considered Pending.</p>
             * </li>
             * <li><p>Running: The command is being executed on cloud computers. If the execution status is Running on at least one cloud computer, the overall status is considered Running.</p>
             * </li>
             * <li><p>Success: If the execution status is Success on at least one cloud computer and either Success or Stopped on all other cloud computers, the overall status is considered Success.</p>
             * </li>
             * <li><p>Failed: If the execution status is Stopped or Failed on all cloud computers, the overall status is considered Failed. If any execution status on cloud computers matches one of the following values, Failed is returned.</p>
             * <ul>
             * <li>Invalid: The command is invalid.</li>
             * <li>Aborted: The command failed to be sent.</li>
             * <li>Failed: The command is executed, but the exit code is not 0.</li>
             * <li>Timeout: The command execution timed out.</li>
             * <li>Error: An error occurred when the command is being executed.</li>
             * </ul>
             * </li>
             * <li><p>Stopping: The command execution is being stopped. If the execution status is Stopping on at least one cloud computer, the overall status is considered Stopping.</p>
             * </li>
             * <li><p>Stopped: The command execution stops. If the execution status is Stopped on at least one cloud computer, the overall status is considered Stopped. If any execution status on cloud computers matches one of the following values, Stopped is returned.</p>
             * <ul>
             * <li>Cancelled: The command execution is canceled.</li>
             * <li>Terminated: The command execution is terminated.</li>
             * </ul>
             * </li>
             * <li><p>PartialFailed: The command execution succeeded on some cloud computers but failed on others. If the execution status on any cloud computer is Success, Failed, or Stopped, the overall status is considered PartialFailed.</p>
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
             * <p>The total number of cloud computers on which the command is executed.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder invokeDesktopCount(Integer invokeDesktopCount) {
                this.invokeDesktopCount = invokeDesktopCount;
                return this;
            }

            /**
             * <p>The total number of cloud computers on which the command execution succeeds.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder invokeDesktopSucceedCount(Integer invokeDesktopSucceedCount) {
                this.invokeDesktopSucceedCount = invokeDesktopSucceedCount;
                return this;
            }

            /**
             * <p>The cloud computers on which the command is executed.</p>
             */
            public Builder invokeDesktops(java.util.List<InvokeDesktops> invokeDesktops) {
                this.invokeDesktops = invokeDesktops;
                return this;
            }

            /**
             * <p>The ID of the execution.</p>
             * 
             * <strong>example:</strong>
             * <p>t-hz0jdfwd9f****</p>
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
