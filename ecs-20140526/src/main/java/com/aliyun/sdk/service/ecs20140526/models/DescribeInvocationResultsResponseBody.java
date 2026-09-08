// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
 * {@link DescribeInvocationResultsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInvocationResultsResponseBody</p>
 */
public class DescribeInvocationResultsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Invocation")
    private Invocation invocation;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeInvocationResultsResponseBody model) {
            this.invocation = model.invocation;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The collection of command execution results.</p>
         */
        public Builder invocation(Invocation invocation) {
            this.invocation = invocation;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE*****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeInvocationResultsResponseBody build() {
            return new DescribeInvocationResultsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInvocationResultsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInvocationResultsResponseBody</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("TagValue")
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

            private Builder() {
            } 

            private Builder(Tag model) {
                this.tagKey = model.tagKey;
                this.tagValue = model.tagValue;
            } 

            /**
             * TagKey.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * TagValue.
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
    /**
     * 
     * {@link DescribeInvocationResultsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInvocationResultsResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Tag")
        private java.util.List<Tag> tag;

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
        public java.util.List<Tag> getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List<Tag> tag; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.tag = model.tag;
            } 

            /**
             * Tag.
             */
            public Builder tag(java.util.List<Tag> tag) {
                this.tag = tag;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeInvocationResultsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInvocationResultsResponseBody</p>
     */
    public static class InvocationResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CommandId")
        private String commandId;

        @com.aliyun.core.annotation.NameInMap("ContainerId")
        private String containerId;

        @com.aliyun.core.annotation.NameInMap("ContainerName")
        private String containerName;

        @com.aliyun.core.annotation.NameInMap("Dropped")
        private Integer dropped;

        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ErrorInfo")
        private String errorInfo;

        @com.aliyun.core.annotation.NameInMap("ExitCode")
        private Long exitCode;

        @com.aliyun.core.annotation.NameInMap("FinishedTime")
        private String finishedTime;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InvocationStatus")
        private String invocationStatus;

        @com.aliyun.core.annotation.NameInMap("InvokeId")
        private String invokeId;

        @com.aliyun.core.annotation.NameInMap("InvokeRecordStatus")
        private String invokeRecordStatus;

        @com.aliyun.core.annotation.NameInMap("Launcher")
        private String launcher;

        @com.aliyun.core.annotation.NameInMap("OssOutputDelivery")
        private String ossOutputDelivery;

        @com.aliyun.core.annotation.NameInMap("OssOutputErrorCode")
        private String ossOutputErrorCode;

        @com.aliyun.core.annotation.NameInMap("OssOutputErrorInfo")
        private String ossOutputErrorInfo;

        @com.aliyun.core.annotation.NameInMap("OssOutputStatus")
        private String ossOutputStatus;

        @com.aliyun.core.annotation.NameInMap("OssOutputUri")
        private String ossOutputUri;

        @com.aliyun.core.annotation.NameInMap("Output")
        private String output;

        @com.aliyun.core.annotation.NameInMap("Repeats")
        private Integer repeats;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("StopTime")
        private String stopTime;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private Tags tags;

        @com.aliyun.core.annotation.NameInMap("TerminationMode")
        private String terminationMode;

        @com.aliyun.core.annotation.NameInMap("Username")
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
            this.launcher = builder.launcher;
            this.ossOutputDelivery = builder.ossOutputDelivery;
            this.ossOutputErrorCode = builder.ossOutputErrorCode;
            this.ossOutputErrorInfo = builder.ossOutputErrorInfo;
            this.ossOutputStatus = builder.ossOutputStatus;
            this.ossOutputUri = builder.ossOutputUri;
            this.output = builder.output;
            this.repeats = builder.repeats;
            this.startTime = builder.startTime;
            this.stopTime = builder.stopTime;
            this.tags = builder.tags;
            this.terminationMode = builder.terminationMode;
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
         * @return launcher
         */
        public String getLauncher() {
            return this.launcher;
        }

        /**
         * @return ossOutputDelivery
         */
        public String getOssOutputDelivery() {
            return this.ossOutputDelivery;
        }

        /**
         * @return ossOutputErrorCode
         */
        public String getOssOutputErrorCode() {
            return this.ossOutputErrorCode;
        }

        /**
         * @return ossOutputErrorInfo
         */
        public String getOssOutputErrorInfo() {
            return this.ossOutputErrorInfo;
        }

        /**
         * @return ossOutputStatus
         */
        public String getOssOutputStatus() {
            return this.ossOutputStatus;
        }

        /**
         * @return ossOutputUri
         */
        public String getOssOutputUri() {
            return this.ossOutputUri;
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
         * @return terminationMode
         */
        public String getTerminationMode() {
            return this.terminationMode;
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
            private String launcher; 
            private String ossOutputDelivery; 
            private String ossOutputErrorCode; 
            private String ossOutputErrorInfo; 
            private String ossOutputStatus; 
            private String ossOutputUri; 
            private String output; 
            private Integer repeats; 
            private String startTime; 
            private String stopTime; 
            private Tags tags; 
            private String terminationMode; 
            private String username; 

            private Builder() {
            } 

            private Builder(InvocationResult model) {
                this.commandId = model.commandId;
                this.containerId = model.containerId;
                this.containerName = model.containerName;
                this.dropped = model.dropped;
                this.errorCode = model.errorCode;
                this.errorInfo = model.errorInfo;
                this.exitCode = model.exitCode;
                this.finishedTime = model.finishedTime;
                this.instanceId = model.instanceId;
                this.invocationStatus = model.invocationStatus;
                this.invokeId = model.invokeId;
                this.invokeRecordStatus = model.invokeRecordStatus;
                this.launcher = model.launcher;
                this.ossOutputDelivery = model.ossOutputDelivery;
                this.ossOutputErrorCode = model.ossOutputErrorCode;
                this.ossOutputErrorInfo = model.ossOutputErrorInfo;
                this.ossOutputStatus = model.ossOutputStatus;
                this.ossOutputUri = model.ossOutputUri;
                this.output = model.output;
                this.repeats = model.repeats;
                this.startTime = model.startTime;
                this.stopTime = model.stopTime;
                this.tags = model.tags;
                this.terminationMode = model.terminationMode;
                this.username = model.username;
            } 

            /**
             * CommandId.
             */
            public Builder commandId(String commandId) {
                this.commandId = commandId;
                return this;
            }

            /**
             * ContainerId.
             */
            public Builder containerId(String containerId) {
                this.containerId = containerId;
                return this;
            }

            /**
             * ContainerName.
             */
            public Builder containerName(String containerName) {
                this.containerName = containerName;
                return this;
            }

            /**
             * Dropped.
             */
            public Builder dropped(Integer dropped) {
                this.dropped = dropped;
                return this;
            }

            /**
             * ErrorCode.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * ErrorInfo.
             */
            public Builder errorInfo(String errorInfo) {
                this.errorInfo = errorInfo;
                return this;
            }

            /**
             * ExitCode.
             */
            public Builder exitCode(Long exitCode) {
                this.exitCode = exitCode;
                return this;
            }

            /**
             * FinishedTime.
             */
            public Builder finishedTime(String finishedTime) {
                this.finishedTime = finishedTime;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * InvocationStatus.
             */
            public Builder invocationStatus(String invocationStatus) {
                this.invocationStatus = invocationStatus;
                return this;
            }

            /**
             * InvokeId.
             */
            public Builder invokeId(String invokeId) {
                this.invokeId = invokeId;
                return this;
            }

            /**
             * InvokeRecordStatus.
             */
            public Builder invokeRecordStatus(String invokeRecordStatus) {
                this.invokeRecordStatus = invokeRecordStatus;
                return this;
            }

            /**
             * Launcher.
             */
            public Builder launcher(String launcher) {
                this.launcher = launcher;
                return this;
            }

            /**
             * OssOutputDelivery.
             */
            public Builder ossOutputDelivery(String ossOutputDelivery) {
                this.ossOutputDelivery = ossOutputDelivery;
                return this;
            }

            /**
             * OssOutputErrorCode.
             */
            public Builder ossOutputErrorCode(String ossOutputErrorCode) {
                this.ossOutputErrorCode = ossOutputErrorCode;
                return this;
            }

            /**
             * OssOutputErrorInfo.
             */
            public Builder ossOutputErrorInfo(String ossOutputErrorInfo) {
                this.ossOutputErrorInfo = ossOutputErrorInfo;
                return this;
            }

            /**
             * OssOutputStatus.
             */
            public Builder ossOutputStatus(String ossOutputStatus) {
                this.ossOutputStatus = ossOutputStatus;
                return this;
            }

            /**
             * OssOutputUri.
             */
            public Builder ossOutputUri(String ossOutputUri) {
                this.ossOutputUri = ossOutputUri;
                return this;
            }

            /**
             * Output.
             */
            public Builder output(String output) {
                this.output = output;
                return this;
            }

            /**
             * Repeats.
             */
            public Builder repeats(Integer repeats) {
                this.repeats = repeats;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * StopTime.
             */
            public Builder stopTime(String stopTime) {
                this.stopTime = stopTime;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * TerminationMode.
             */
            public Builder terminationMode(String terminationMode) {
                this.terminationMode = terminationMode;
                return this;
            }

            /**
             * Username.
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
    /**
     * 
     * {@link DescribeInvocationResultsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInvocationResultsResponseBody</p>
     */
    public static class InvocationResults extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InvocationResult")
        private java.util.List<InvocationResult> invocationResult;

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
        public java.util.List<InvocationResult> getInvocationResult() {
            return this.invocationResult;
        }

        public static final class Builder {
            private java.util.List<InvocationResult> invocationResult; 

            private Builder() {
            } 

            private Builder(InvocationResults model) {
                this.invocationResult = model.invocationResult;
            } 

            /**
             * InvocationResult.
             */
            public Builder invocationResult(java.util.List<InvocationResult> invocationResult) {
                this.invocationResult = invocationResult;
                return this;
            }

            public InvocationResults build() {
                return new InvocationResults(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeInvocationResultsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInvocationResultsResponseBody</p>
     */
    public static class Invocation extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InvocationResults")
        private InvocationResults invocationResults;

        @com.aliyun.core.annotation.NameInMap("NextToken")
        private String nextToken;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Long pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Long pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        private Invocation(Builder builder) {
            this.invocationResults = builder.invocationResults;
            this.nextToken = builder.nextToken;
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
         * @return nextToken
         */
        public String getNextToken() {
            return this.nextToken;
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
            private String nextToken; 
            private Long pageNumber; 
            private Long pageSize; 
            private Long totalCount; 

            private Builder() {
            } 

            private Builder(Invocation model) {
                this.invocationResults = model.invocationResults;
                this.nextToken = model.nextToken;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * InvocationResults.
             */
            public Builder invocationResults(InvocationResults invocationResults) {
                this.invocationResults = invocationResults;
                return this;
            }

            /**
             * <p>The pagination token returned in this call.</p>
             * 
             * <strong>example:</strong>
             * <p>AAAAAdDWBF2</p>
             */
            public Builder nextToken(String nextToken) {
                this.nextToken = nextToken;
                return this;
            }

            /**
             * <p>The current page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Long pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>The number of entries per page in the paging query settings.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of commands.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
