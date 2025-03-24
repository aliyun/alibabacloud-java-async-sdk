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

        /**
         * <p>Details about execution records of the command.</p>
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
             * <p>The ID of the cloud desktop.</p>
             * 
             * <strong>example:</strong>
             * <p>ecd-7w78ozhjcwa3u****</p>
             */
            public Builder desktopId(String desktopId) {
                this.desktopId = desktopId;
                return this;
            }

            /**
             * <p>The name of the cloud desktop.</p>
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
             * <p>The code that indicates the reason why a command failed to be sent or executed. The valid values include:</p>
             * <ul>
             * <li>If this parameter is empty, the execution is normal.</li>
             * <li>InstanceNotExists: The specified cloud desktop does not exist or is released.</li>
             * <li>InstanceReleased: The cloud desktop is released during the execution.</li>
             * <li>InstanceNotRunning: The cloud desktop is not running during the execution.</li>
             * <li>CommandNotApplicable: The command cannot be used on the cloud desktop.</li>
             * <li>ClientNotRunning: The Cloud Assistant client is not running.</li>
             * <li>ClientNotResponse: The Cloud Assistant client does not respond.</li>
             * <li>ClientIsUpgrading: The Cloud Assistant client is being upgraded.</li>
             * <li>ClientNeedUpgrade: The Cloud Assistant client needs to be upgraded.</li>
             * <li>DeliveryTimeout: The time to send the command in the request times out.</li>
             * <li>ExecutionTimeout: The execution times out.</li>
             * <li>ExecutionException: An exception occurs during the execution.</li>
             * <li>ExecutionInterrupted: The execution is interrupted.</li>
             * <li>ExitCodeNonzero: The execution finishes, but the exit code is not 0.</li>
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
             * <p>Details about the reason why the command failed to be sent or executed. The valid values include:</p>
             * <ul>
             * <li>If this parameter is empty, the execution is normal.</li>
             * <li>the specified instance does not exists: The cloud desktop does not exist or is released.</li>
             * <li>the instance has released when create task: The cloud desktop is released during execution.</li>
             * <li>the instance is not running when create task: The cloud desktop is not running when the execution is being performed.</li>
             * <li>the command is not applicable: The command cannot be used on the specified cloud desktop.</li>
             * <li>the aliyun service is not running on the instance: The Cloud Assistance client is not running.</li>
             * <li>the aliyun service in the instance does not response: The Cloud Assistant client is not responding.</li>
             * <li>the aliyun service in the instance is upgrading now: The Cloud Assistant client is being upgraded.</li>
             * <li>the aliyun service in the instance need upgrade: The Cloud Assistant client needs to be upgraded.</li>
             * <li>the command delivery has been timeout: The command that is sent in the request times out.</li>
             * <li>the command execution has been timeout: The execution times out.</li>
             * <li>the command execution got an exception: An exception occurs when the command is running.</li>
             * <li>the command execution has been interrupted: The execution is interrupted.</li>
             * <li>the command execution exit code is not zero: The execution finishes, but the exit code is not 0.</li>
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
             * <p>The execution status on the cloud desktop.</p>
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
             * <li>If the IncludeOutput parameter is set to false, Output is not returned.</li>
             * <li>If the ContentEncoding parameter is set to Base64, the value of Output is the output information that is encoded in Base64.</li>
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
             * <p>The number of times that the command is executed on the cloud desktop.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder repeats(Integer repeats) {
                this.repeats = repeats;
                return this;
            }

            /**
             * <p>The start time of the execution on the cloud desktop.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-12-20T06:15:55Z</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The time when you called the <a href="~~196957#doc-api-ecd-StopInvocation~~" title="You can call this operation to stop a Cloud Assistant command that is running on one or cloud desktops.">StopInvocation</a> operation to manually stop the command.</p>
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
             * <p>The overall execution status of the command. The overall execution status is determined by the execution status on all involved cloud desktops. The valid values include:</p>
             * <ul>
             * <li><p>Pending: The system is verifying or sending the command. If the execution status on at least one cloud desktop is Pending, the overall execution status is Pending.</p>
             * </li>
             * <li><p>Running: The execution is in progress on cloud desktops. If the execution status on at least one cloud desktop is Running, the overall execution status is Running.</p>
             * </li>
             * <li><p>Success: If the execution status on all cloud desktops is Success or Stopped, or the execution status on at least one cloud desktop is Success, the overall execution status is Success.</p>
             * </li>
             * <li><p>Failed: If the execution status on all cloud desktops is Stopped or Failed, the overall execution status is Failed. If one or more execution status of a cloud desktop is one of the following values, Failed is returned:</p>
             * <ul>
             * <li>Invalid: The command is invalid.</li>
             * <li>Aborted: The command fails to be sent.</li>
             * <li>Failed: The command is executed, but the exit code is not 0.</li>
             * <li>Timeout: The command times out.</li>
             * <li>Error: An error occurs in the command.</li>
             * </ul>
             * </li>
             * <li><p>Stopping: The execution is being stopped. If the execution status on at least one cloud desktop is Stopping, the overall execution state is Stopping.</p>
             * </li>
             * <li><p>Stopped: The execution is stopped. If the execution status on all cloud desktops is Stopped, the overall execution state is Stopped. If the execution status on a cloud desktop is one of the following values, Stopped is returned:</p>
             * <ul>
             * <li>Cancelled: The execution is canceled.</li>
             * <li>Terminated: The execution is terminated.</li>
             * </ul>
             * </li>
             * <li><p>PartialFailed: The execution succeeded on some cloud desktops and failed on others. If the execution status on different cloud desktops is Success, Failed, or Stopped, the overall execution state is PartialFailed.</p>
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
             * <p>The total number of cloud computers on which the command is executed successfully.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder invokeDesktopSucceedCount(Integer invokeDesktopSucceedCount) {
                this.invokeDesktopSucceedCount = invokeDesktopSucceedCount;
                return this;
            }

            /**
             * <p>The cloud desktops on which the command is executed.</p>
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
