// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInvocationResultsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInvocationResultsResponseBody</p>
 */
public class DescribeInvocationResultsResponseBody extends TeaModel {
    @NameInMap("Invocation")
    private Invocation invocation;

    @NameInMap("RequestId")
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

        /**
         * Details of the execution results.
         */
        public Builder invocation(Invocation invocation) {
            this.invocation = invocation;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeInvocationResultsResponseBody build() {
            return new DescribeInvocationResultsResponseBody(this);
        } 

    } 

    public static class Tag extends TeaModel {
        @NameInMap("TagKey")
        private String tagKey;

        @NameInMap("TagValue")
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

            /**
             * The tag key of the command task.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * The tag value of the command task.
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
    public static class Tags extends TeaModel {
        @NameInMap("Tag")
        private java.util.List < Tag> tag;

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
        public java.util.List < Tag> getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List < Tag> tag; 

            /**
             * Tag.
             */
            public Builder tag(java.util.List < Tag> tag) {
                this.tag = tag;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    public static class InvocationResult extends TeaModel {
        @NameInMap("CommandId")
        private String commandId;

        @NameInMap("ContainerId")
        private String containerId;

        @NameInMap("ContainerName")
        private String containerName;

        @NameInMap("Dropped")
        private Integer dropped;

        @NameInMap("ErrorCode")
        private String errorCode;

        @NameInMap("ErrorInfo")
        private String errorInfo;

        @NameInMap("ExitCode")
        private Long exitCode;

        @NameInMap("FinishedTime")
        private String finishedTime;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InvocationStatus")
        private String invocationStatus;

        @NameInMap("InvokeId")
        private String invokeId;

        @NameInMap("InvokeRecordStatus")
        private String invokeRecordStatus;

        @NameInMap("Output")
        private String output;

        @NameInMap("Repeats")
        private Integer repeats;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("StopTime")
        private String stopTime;

        @NameInMap("Tags")
        private Tags tags;

        @NameInMap("Username")
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
            this.output = builder.output;
            this.repeats = builder.repeats;
            this.startTime = builder.startTime;
            this.stopTime = builder.stopTime;
            this.tags = builder.tags;
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
            private String output; 
            private Integer repeats; 
            private String startTime; 
            private String stopTime; 
            private Tags tags; 
            private String username; 

            /**
             * The ID of the command.
             */
            public Builder commandId(String commandId) {
                this.commandId = commandId;
                return this;
            }

            /**
             * The ID of the container.
             */
            public Builder containerId(String containerId) {
                this.containerId = containerId;
                return this;
            }

            /**
             * The name of the container.
             */
            public Builder containerName(String containerName) {
                this.containerName = containerName;
                return this;
            }

            /**
             * The size of the text that is truncated and discarded when the `Output` value exceeds 24 KB in size.
             */
            public Builder dropped(Integer dropped) {
                this.dropped = dropped;
                return this;
            }

            /**
             * The error code returned when the command cannot be sent or run. Valid values:
             * <p>
             * 
             * *   If this parameter is empty, the command is run normally.
             * *   InstanceNotExists: The instance does not exist or has been released.
             * *   InstanceReleased: The instance was released while the command was being run.
             * *   InstanceNotRunning: The instance was not running while the command was being run.
             * *   CommandNotApplicable: The command is not applicable to the specified instance.
             * *   AccountNotExists: The specified account does not exist.
             * *   DirectoryNotExists: The specified directory does not exist.
             * *   BadCronExpression: The cron expression used to specify a schedule is invalid.
             * *   ClientNotRunning: The Cloud Assistant client is not running.
             * *   ClientNotResponse: The Cloud Assistant client does not respond.
             * *   ClientIsUpgrading: The Cloud Assistant client is being upgraded.
             * *   ClientNeedUpgrade: The Cloud Assistant client needs to be upgraded.
             * *   DeliveryTimeout: The request to send the command timed out.
             * *   ExecutionTimeout: The execution timed out.
             * *   ExecutionException: An exception occurred while the command was being run.
             * *   ExecutionInterrupted: The execution was interrupted.
             * *   ExitCodeNonzero: The execution is complete, but the exit code is not 0.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * The error message returned when the command cannot be sent or run. Valid values:
             * <p>
             * 
             * *   If this parameter is empty, the command is run normally.
             * *   the specified instance does not exists
             * *   the instance has released when create task
             * *   the instance is not running when create task
             * *   the command is not applicable
             * *   the specified account does not exists
             * *   the specified directory does not exists
             * *   the cron job expression is invalid
             * *   the aliyun service is not running on the instance
             * *   the aliyun service in the instance does not response
             * *   the aliyun service in the instance is upgrading now
             * *   the aliyun service in the instance need upgrade
             * *   the command delivery has been timeout
             * *   the command execution has been timeout
             * *   the command execution got an exception
             * *   the command execution has been interrupted
             * *   the command execution exit code is not zero
             */
            public Builder errorInfo(String errorInfo) {
                this.errorInfo = errorInfo;
                return this;
            }

            /**
             * The exit code of the command execution.
             * <p>
             * 
             * *   For Linux instances, the value is the exit code of the shell command.
             * *   For Windows instances, the value is the exit code of the batch or PowerShell command.
             */
            public Builder exitCode(Long exitCode) {
                this.exitCode = exitCode;
                return this;
            }

            /**
             * The end time of the execution. If an execution times out, the end time of the execution is subject to the value of the TimedOut parameter specified in the [CreateCommand](~~64844~~) operation.
             */
            public Builder finishedTime(String finishedTime) {
                this.finishedTime = finishedTime;
                return this;
            }

            /**
             * The ID of the instance
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The execution state on a single instance. Valid values:
             * <p>
             * 
             * *   Pending: The command is being verified or sent.
             * 
             * *   Invalid: The specified command type or parameter is invalid.
             * 
             * *   Aborted: The command failed to be sent. To send a command to an instance, make sure that the instance is in the Running state and the command is sent to the instance within 1 minute.
             * 
             * *   Running: The command is being run on the instance.
             * 
             * *   Success:
             * 
             *     *   Command that is set to run only once: The execution is complete, and the exit code is 0.
             *     *   Command that is set to run on a schedule: The last execution succeeds, the exit code is 0, and the specified cycle ends.
             * 
             * *   Failed:
             * 
             *     *   Command that is set to run only once: The execution is complete, but the exit code is not 0.
             *     *   Command that is set to run on a schedule: The last execution is complete, the exit code is not 0, and the specified cycle is about to end.
             * 
             * *   Error: The execution cannot proceed due to an exception.
             * 
             * *   Timeout: The execution times out.
             * 
             * *   Cancelled: The execution is canceled, and the command is not run.
             * 
             * *   Stopping: The running command is being stopped.
             * 
             * *   Terminated: The command is terminated while it is being run.
             * 
             * *   Scheduled:
             * 
             *     *   Command that is set to run only once: The command is not applicable.
             *     *   Command that is set to run on a schedule: The command is waiting to be run.
             */
            public Builder invocationStatus(String invocationStatus) {
                this.invocationStatus = invocationStatus;
                return this;
            }

            /**
             * The ID of the command task.
             */
            public Builder invokeId(String invokeId) {
                this.invokeId = invokeId;
                return this;
            }

            /**
             * The execution state of the command.
             */
            public Builder invokeRecordStatus(String invokeRecordStatus) {
                this.invokeRecordStatus = invokeRecordStatus;
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
             * The number of times that the command is run on the instance.
             * <p>
             * 
             * *   If the command is set to run only once on the instance, the value is 0 or 1.
             * *   If the command is set to run on a schedule on the instance, the value is the number of times that the command is run.
             */
            public Builder repeats(Integer repeats) {
                this.repeats = repeats;
                return this;
            }

            /**
             * The time when the command started to be run on the instance.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * The time when the command stopped being run on the instance. If you call the `StopInvocation` operation to manually stop the execution, the value is the time when you called the operation.
             */
            public Builder stopTime(String stopTime) {
                this.stopTime = stopTime;
                return this;
            }

            /**
             * The tags of the command task.
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The username that was used to run the command on the instance.
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
    public static class InvocationResults extends TeaModel {
        @NameInMap("InvocationResult")
        private java.util.List < InvocationResult> invocationResult;

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
        public java.util.List < InvocationResult> getInvocationResult() {
            return this.invocationResult;
        }

        public static final class Builder {
            private java.util.List < InvocationResult> invocationResult; 

            /**
             * InvocationResult.
             */
            public Builder invocationResult(java.util.List < InvocationResult> invocationResult) {
                this.invocationResult = invocationResult;
                return this;
            }

            public InvocationResults build() {
                return new InvocationResults(this);
            } 

        } 

    }
    public static class Invocation extends TeaModel {
        @NameInMap("InvocationResults")
        private InvocationResults invocationResults;

        @NameInMap("PageNumber")
        private Long pageNumber;

        @NameInMap("PageSize")
        private Long pageSize;

        @NameInMap("TotalCount")
        private Long totalCount;

        private Invocation(Builder builder) {
            this.invocationResults = builder.invocationResults;
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
            private Long pageNumber; 
            private Long pageSize; 
            private Long totalCount; 

            /**
             * The execution results.
             */
            public Builder invocationResults(InvocationResults invocationResults) {
                this.invocationResults = invocationResults;
                return this;
            }

            /**
             * The page number of the returned page.
             */
            public Builder pageNumber(Long pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * The number of entries returned per page.
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The total number of the commands.
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
