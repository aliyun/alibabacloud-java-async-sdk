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
         * <p>The array of script execution records.</p>
         */
        public Builder invocations(java.util.List<Invocations> invocations) {
            this.invocations = invocations;
            return this;
        }

        /**
         * <p>The pagination token returned in this call.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAV3MpHK1AP0pfERHZN5pu6nmB7qrRFJ8vmttjxPL****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
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

        @com.aliyun.core.annotation.NameInMap("JvsAgentId")
        private String jvsAgentId;

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
            this.jvsAgentId = builder.jvsAgentId;
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
         * @return jvsAgentId
         */
        public String getJvsAgentId() {
            return this.jvsAgentId;
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
            private String jvsAgentId; 
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
                this.jvsAgentId = model.jvsAgentId;
                this.output = model.output;
                this.repeats = model.repeats;
                this.startTime = model.startTime;
                this.stopTime = model.stopTime;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>The creation time of the script process.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-12-20T06:15:54Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The cloud desktop ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ecd-7w78ozhjcwa3u****</p>
             */
            public Builder desktopId(String desktopId) {
                this.desktopId = desktopId;
                return this;
            }

            /**
             * <p>The cloud desktop name.</p>
             * 
             * <strong>example:</strong>
             * <p>demo1234</p>
             */
            public Builder desktopName(String desktopName) {
                this.desktopName = desktopName;
                return this;
            }

            /**
             * <p>The length of the truncated and discarded text after the text length in the Output field exceeded 24 KB.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder dropped(Integer dropped) {
                this.dropped = dropped;
                return this;
            }

            /**
             * <p>The error code indicating the reason for command delivery failure or execution failure. Valid values:</p>
             * <ul>
             * <li>Empty: The command ran normally.</li>
             * <li>InstanceNotExists: The specified cloud desktop does not exist or has been released.</li>
             * <li>InstanceReleased: The cloud desktop was released during task execution.</li>
             * <li>InstanceNotRunning: The cloud desktop was not running when the task was created.</li>
             * <li>CommandNotApplicable: The command is not applicable to the specified cloud desktop.</li>
             * <li>ClientNotRunning: The Cloud Assistant client is not running.</li>
             * <li>ClientNotResponse: The Cloud Assistant client is not responding.</li>
             * <li>ClientIsUpgrading: The Cloud Assistant client is being upgraded.</li>
             * <li>ClientNeedUpgrade: The Cloud Assistant client needs to be upgraded.</li>
             * <li>DeliveryTimeout: Command delivery timed out.</li>
             * <li>ExecutionTimeout: Command execution timed out.</li>
             * <li>ExecutionException: An exception occurred during command execution.</li>
             * <li>ExecutionInterrupted: Command execution was interrupted.</li>
             * <li>ExitCodeNonzero: Command execution completed with a non-zero exit code.</li>
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
             * <p>The detailed reason for command delivery failure or execution failure. Valid values:</p>
             * <ul>
             * <li>Empty: The command ran normally.</li>
             * <li>the specified instance does not exists: The specified cloud desktop does not exist or has been released.</li>
             * <li>the instance has released when create task: The cloud desktop was released during task execution.</li>
             * <li>the instance is not running when create task: The cloud desktop was not running when the task was created.</li>
             * <li>the command is not applicable: The command is not applicable to the specified cloud desktop.</li>
             * <li>the aliyun service is not running on the instance: The Cloud Assistant client is not running.</li>
             * <li>the aliyun service in the instance does not response: The Cloud Assistant client is not responding.</li>
             * <li>the aliyun service in the instance is upgrading now: The Cloud Assistant client is being upgraded.</li>
             * <li>the aliyun service in the instance need upgrade: The Cloud Assistant client needs to be upgraded.</li>
             * <li>the command delivery has been timeout: Command delivery timed out.</li>
             * <li>the command execution has been timeout: Command execution timed out.</li>
             * <li>the command execution got an exception: An exception occurred during command execution.</li>
             * <li>the command execution has been interrupted: Command execution was interrupted.</li>
             * <li>the command execution exit code is not zero: Command execution completed with a non-zero exit code.</li>
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
             * <p>The exit code of the script process.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder exitCode(Long exitCode) {
                this.exitCode = exitCode;
                return this;
            }

            /**
             * <p>The end time of the script process.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-12-20T06:15:56Z</p>
             */
            public Builder finishTime(String finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * <p>The script process status on a single cloud desktop.</p>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
             */
            public Builder invocationStatus(String invocationStatus) {
                this.invocationStatus = invocationStatus;
                return this;
            }

            /**
             * <p>jvs agent id。</p>
             * 
             * <strong>example:</strong>
             * <p>jvs-7xjos2l****</p>
             */
            public Builder jvsAgentId(String jvsAgentId) {
                this.jvsAgentId = jvsAgentId;
                return this;
            }

            /**
             * <p>The output information of the script process.</p>
             * <ul>
             * <li>If the request parameter <code>IncludeOutput</code> is set to false, Output is not returned.</li>
             * <li>If the request parameter <code>ContentEncoding</code> is set to Base64, Output is the Base64-encoded output information.</li>
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
             * <p>The number of times the command was executed on the cloud desktop.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder repeats(Integer repeats) {
                this.repeats = repeats;
                return this;
            }

            /**
             * <p>The time when the script process started running on the cloud desktop.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-12-20T06:15:55Z</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The time when the execution was stopped, if StopInvocation was called.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-12-25T09:15:47Z</p>
             */
            public Builder stopTime(String stopTime) {
                this.stopTime = stopTime;
                return this;
            }

            /**
             * <p>The update time of the task status.</p>
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

        @com.aliyun.core.annotation.NameInMap("DesktopScenario")
        private String desktopScenario;

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
            this.desktopScenario = builder.desktopScenario;
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
         * @return desktopScenario
         */
        public String getDesktopScenario() {
            return this.desktopScenario;
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
            private String desktopScenario; 
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
                this.desktopScenario = model.desktopScenario;
                this.endUserId = model.endUserId;
                this.invocationStatus = model.invocationStatus;
                this.invokeDesktopCount = model.invokeDesktopCount;
                this.invokeDesktopSucceedCount = model.invokeDesktopSucceedCount;
                this.invokeDesktops = model.invokeDesktops;
                this.invokeId = model.invokeId;
            } 

            /**
             * <p>The script content, transmitted in Base64 encoding.</p>
             * 
             * <strong>example:</strong>
             * <p>cnBtIC1xYSB8IGdyZXAgdnNm****</p>
             */
            public Builder commandContent(String commandContent) {
                this.commandContent = commandContent;
                return this;
            }

            /**
             * <p>The script type.</p>
             * 
             * <strong>example:</strong>
             * <p>RunPowerShellScript</p>
             */
            public Builder commandType(String commandType) {
                this.commandType = commandType;
                return this;
            }

            /**
             * <p>The creation time of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-12-19T09:15:46Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The cloud desktop scenario. Valid values:</p>
             * <ul>
             * <li>Classic: the classic cloud desktop scenario.</li>
             * <li>JvsClaw: the JVS Claw cloud desktop scenario.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Classic</p>
             */
            public Builder desktopScenario(String desktopScenario) {
                this.desktopScenario = desktopScenario;
                return this;
            }

            /**
             * <p>The end user ID.</p>
             * 
             * <strong>example:</strong>
             * <p>User1</p>
             */
            public Builder endUserId(String endUserId) {
                this.endUserId = endUserId;
                return this;
            }

            /**
             * <p>The overall execution status of the script. The overall execution status depends on the combined execution status of all cloud desktops in this call. Valid values:</p>
             * <ul>
             * <li>Pending: The system is validating or sending the command. The overall execution status is Pending if at least one cloud desktop has a script execution status of Pending.</li>
             * <li>Running: The command is running on the cloud desktop. The overall execution status is Running if at least one cloud desktop has a script execution status of Running.</li>
             * <li>Success: The overall execution status is Success if the script execution status on each cloud desktop is Stopped or Success, and at least one cloud desktop has a script execution status of Success.</li>
             * <li>Failed: The overall execution status is Failed if the script execution status on each cloud desktop is Stopped or Failed. The return value is Failed when one or more of the following statuses occur on a cloud desktop:<ul>
             * <li>Command validation failed (Invalid)</li>
             * <li>Command delivery failed (Aborted)</li>
             * <li>Command execution completed with a non-zero exit code (Failed)</li>
             * <li>Command execution timed out (Timeout)</li>
             * <li>Command execution encountered an exception (Error)</li>
             * </ul>
             * </li>
             * <li>Stopping: The task is being stopped. The overall execution status is Stopping if at least one instance has a script execution status of Stopping.</li>
             * <li>Stopped: The task has been stopped. The overall execution status is Stopped if the script execution status on all instances is Stopped. The return value is Stopped when the script execution status on an instance is one of the following:<ul>
             * <li>Task cancelled (Cancelled)</li>
             * <li>Task terminated (Terminated)</li>
             * </ul>
             * </li>
             * <li>PartialFailed: The overall execution status is PartialFailed if some instances succeeded and some instances failed. The overall execution status is PartialFailed if the script execution status on each instance is Success, Failed, or Stopped.</li>
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
             * <p>The total number of cloud desktops on which the script was executed.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder invokeDesktopCount(Integer invokeDesktopCount) {
                this.invokeDesktopCount = invokeDesktopCount;
                return this;
            }

            /**
             * <p>The total number of cloud desktops on which the script was executed successfully.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder invokeDesktopSucceedCount(Integer invokeDesktopSucceedCount) {
                this.invokeDesktopSucceedCount = invokeDesktopSucceedCount;
                return this;
            }

            /**
             * <p>The list of target cloud desktops for execution.</p>
             */
            public Builder invokeDesktops(java.util.List<InvokeDesktops> invokeDesktops) {
                this.invokeDesktops = invokeDesktops;
                return this;
            }

            /**
             * <p>The execution ID.</p>
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
