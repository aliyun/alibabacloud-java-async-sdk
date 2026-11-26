// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentloop20260520.models;

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
 * {@link GetPipelineRunResponseBody} extends {@link TeaModel}
 *
 * <p>GetPipelineRunResponseBody</p>
 */
public class GetPipelineRunResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("agentSpaceName")
    private String agentSpaceName;

    @com.aliyun.core.annotation.NameInMap("asyncNodes")
    private java.util.List<AsyncNodes> asyncNodes;

    @com.aliyun.core.annotation.NameInMap("attempt")
    private Integer attempt;

    @com.aliyun.core.annotation.NameInMap("errorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("errorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("finishTime")
    private String finishTime;

    @com.aliyun.core.annotation.NameInMap("fromTime")
    private Long fromTime;

    @com.aliyun.core.annotation.NameInMap("maxAttempts")
    private Integer maxAttempts;

    @com.aliyun.core.annotation.NameInMap("nextRetryTime")
    private String nextRetryTime;

    @com.aliyun.core.annotation.NameInMap("nodeExecutions")
    private java.util.List<NodeExecutions> nodeExecutions;

    @com.aliyun.core.annotation.NameInMap("pipelineName")
    private String pipelineName;

    @com.aliyun.core.annotation.NameInMap("pipelineSnapshot")
    private PipelineSnapshot pipelineSnapshot;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("results")
    private java.util.Map<String, ?> results;

    @com.aliyun.core.annotation.NameInMap("runId")
    private String runId;

    @com.aliyun.core.annotation.NameInMap("startTime")
    private String startTime;

    @com.aliyun.core.annotation.NameInMap("stats")
    private java.util.Map<String, ?> stats;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("taskVersion")
    private Integer taskVersion;

    @com.aliyun.core.annotation.NameInMap("toTime")
    private Long toTime;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Long totalCount;

    @com.aliyun.core.annotation.NameInMap("triggerTime")
    private String triggerTime;

    @com.aliyun.core.annotation.NameInMap("triggerType")
    private String triggerType;

    private GetPipelineRunResponseBody(Builder builder) {
        this.agentSpaceName = builder.agentSpaceName;
        this.asyncNodes = builder.asyncNodes;
        this.attempt = builder.attempt;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.finishTime = builder.finishTime;
        this.fromTime = builder.fromTime;
        this.maxAttempts = builder.maxAttempts;
        this.nextRetryTime = builder.nextRetryTime;
        this.nodeExecutions = builder.nodeExecutions;
        this.pipelineName = builder.pipelineName;
        this.pipelineSnapshot = builder.pipelineSnapshot;
        this.requestId = builder.requestId;
        this.results = builder.results;
        this.runId = builder.runId;
        this.startTime = builder.startTime;
        this.stats = builder.stats;
        this.status = builder.status;
        this.taskVersion = builder.taskVersion;
        this.toTime = builder.toTime;
        this.totalCount = builder.totalCount;
        this.triggerTime = builder.triggerTime;
        this.triggerType = builder.triggerType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPipelineRunResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentSpaceName
     */
    public String getAgentSpaceName() {
        return this.agentSpaceName;
    }

    /**
     * @return asyncNodes
     */
    public java.util.List<AsyncNodes> getAsyncNodes() {
        return this.asyncNodes;
    }

    /**
     * @return attempt
     */
    public Integer getAttempt() {
        return this.attempt;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return finishTime
     */
    public String getFinishTime() {
        return this.finishTime;
    }

    /**
     * @return fromTime
     */
    public Long getFromTime() {
        return this.fromTime;
    }

    /**
     * @return maxAttempts
     */
    public Integer getMaxAttempts() {
        return this.maxAttempts;
    }

    /**
     * @return nextRetryTime
     */
    public String getNextRetryTime() {
        return this.nextRetryTime;
    }

    /**
     * @return nodeExecutions
     */
    public java.util.List<NodeExecutions> getNodeExecutions() {
        return this.nodeExecutions;
    }

    /**
     * @return pipelineName
     */
    public String getPipelineName() {
        return this.pipelineName;
    }

    /**
     * @return pipelineSnapshot
     */
    public PipelineSnapshot getPipelineSnapshot() {
        return this.pipelineSnapshot;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return results
     */
    public java.util.Map<String, ?> getResults() {
        return this.results;
    }

    /**
     * @return runId
     */
    public String getRunId() {
        return this.runId;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return stats
     */
    public java.util.Map<String, ?> getStats() {
        return this.stats;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return taskVersion
     */
    public Integer getTaskVersion() {
        return this.taskVersion;
    }

    /**
     * @return toTime
     */
    public Long getToTime() {
        return this.toTime;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return triggerTime
     */
    public String getTriggerTime() {
        return this.triggerTime;
    }

    /**
     * @return triggerType
     */
    public String getTriggerType() {
        return this.triggerType;
    }

    public static final class Builder {
        private String agentSpaceName; 
        private java.util.List<AsyncNodes> asyncNodes; 
        private Integer attempt; 
        private String errorCode; 
        private String errorMessage; 
        private String finishTime; 
        private Long fromTime; 
        private Integer maxAttempts; 
        private String nextRetryTime; 
        private java.util.List<NodeExecutions> nodeExecutions; 
        private String pipelineName; 
        private PipelineSnapshot pipelineSnapshot; 
        private String requestId; 
        private java.util.Map<String, ?> results; 
        private String runId; 
        private String startTime; 
        private java.util.Map<String, ?> stats; 
        private String status; 
        private Integer taskVersion; 
        private Long toTime; 
        private Long totalCount; 
        private String triggerTime; 
        private String triggerType; 

        private Builder() {
        } 

        private Builder(GetPipelineRunResponseBody model) {
            this.agentSpaceName = model.agentSpaceName;
            this.asyncNodes = model.asyncNodes;
            this.attempt = model.attempt;
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.finishTime = model.finishTime;
            this.fromTime = model.fromTime;
            this.maxAttempts = model.maxAttempts;
            this.nextRetryTime = model.nextRetryTime;
            this.nodeExecutions = model.nodeExecutions;
            this.pipelineName = model.pipelineName;
            this.pipelineSnapshot = model.pipelineSnapshot;
            this.requestId = model.requestId;
            this.results = model.results;
            this.runId = model.runId;
            this.startTime = model.startTime;
            this.stats = model.stats;
            this.status = model.status;
            this.taskVersion = model.taskVersion;
            this.toTime = model.toTime;
            this.totalCount = model.totalCount;
            this.triggerTime = model.triggerTime;
            this.triggerType = model.triggerType;
        } 

        /**
         * <p>The name of the AgentSpace.</p>
         * 
         * <strong>example:</strong>
         * <p>my-agent-space</p>
         */
        public Builder agentSpaceName(String agentSpaceName) {
            this.agentSpaceName = agentSpaceName;
            return this;
        }

        /**
         * <p>The list of asynchronous node execution statuses.</p>
         */
        public Builder asyncNodes(java.util.List<AsyncNodes> asyncNodes) {
            this.asyncNodes = asyncNodes;
            return this;
        }

        /**
         * <p>The current number of retries.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder attempt(Integer attempt) {
            this.attempt = attempt;
            return this;
        }

        /**
         * <p>The semantic error code.</p>
         * 
         * <strong>example:</strong>
         * <p>ExpressionEvaluationError</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>Failed to evaluate filter expression in node &quot;node-1&quot;: column &quot;score&quot; does not exist.</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The end time in ISO 8601 UTC format.</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ss.SSSZ</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-01T00:00:10.000Z</p>
         */
        public Builder finishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }

        /**
         * <p>The start time of the data window in UNIX seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1735660800</p>
         */
        public Builder fromTime(Long fromTime) {
            this.fromTime = fromTime;
            return this;
        }

        /**
         * <p>The maximum number of retries.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder maxAttempts(Integer maxAttempts) {
            this.maxAttempts = maxAttempts;
            return this;
        }

        /**
         * <p>The next retry time in ISO 8601 UTC format.</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ss.SSSZ</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-01T00:01:00.000Z</p>
         */
        public Builder nextRetryTime(String nextRetryTime) {
            this.nextRetryTime = nextRetryTime;
            return this;
        }

        /**
         * <p>The list of node execution records.</p>
         */
        public Builder nodeExecutions(java.util.List<NodeExecutions> nodeExecutions) {
            this.nodeExecutions = nodeExecutions;
            return this;
        }

        /**
         * <p>The name of the pipeline.</p>
         * 
         * <strong>example:</strong>
         * <p>my-pipeline</p>
         */
        public Builder pipelineName(String pipelineName) {
            this.pipelineName = pipelineName;
            return this;
        }

        /**
         * <p>The frozen pipeline configuration snapshot for this run.</p>
         */
        public Builder pipelineSnapshot(PipelineSnapshot pipelineSnapshot) {
            this.pipelineSnapshot = pipelineSnapshot;
            return this;
        }

        /**
         * <p>The request ID used to locate the request during troubleshooting.</p>
         * 
         * <strong>example:</strong>
         * <p>9ACFB10A-1B2C-3D4E-5F6G-7H8I9J0K1L2M</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The inline run results. This parameter is returned only when output.inline is set to true during triggering.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;outputRows&quot;: 100, &quot;summary&quot;: &quot;processed 100 rows, 92 matched&quot;, &quot;passed&quot;: true}</p>
         */
        public Builder results(java.util.Map<String, ?> results) {
            this.results = results;
            return this;
        }

        /**
         * <p>Run Id</p>
         * 
         * <strong>example:</strong>
         * <p>run-20260101-0001</p>
         */
        public Builder runId(String runId) {
            this.runId = runId;
            return this;
        }

        /**
         * <p>The execution start time in ISO 8601 UTC format.</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ss.SSSZ</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-01T00:00:01.000Z</p>
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The run statistics, including processedRows (number of processed rows), processedBytes (number of processed bytes), outputRows (number of output rows), outputBytes (number of output bytes), elapsedMs (elapsed time in milliseconds), cpuSec (CPU seconds), cpuCores (number of CPU cores), and tokenCount (number of consumed tokens).</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;processedRows&quot;:1000,&quot;elapsedMs&quot;:2500}</p>
         */
        public Builder stats(java.util.Map<String, ?> stats) {
            this.stats = stats;
            return this;
        }

        /**
         * <p>The run status. Valid values: Pending, Running, Succeeded, Failed, and Cancelled.</p>
         * 
         * <strong>example:</strong>
         * <p>Succeeded</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The frozen task version.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder taskVersion(Integer taskVersion) {
            this.taskVersion = taskVersion;
            return this;
        }

        /**
         * <p>The end time of the data window in UNIX seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1735747200</p>
         */
        public Builder toTime(Long toTime) {
            this.toTime = toTime;
            return this;
        }

        /**
         * <p>The total number of input records.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>The trigger time in ISO 8601 UTC format.</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ss.SSSZ</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-01T00:00:00.000Z</p>
         */
        public Builder triggerTime(String triggerTime) {
            this.triggerTime = triggerTime;
            return this;
        }

        /**
         * <p>The trigger type. Valid values: Scheduled, Manual, and RunOnce.</p>
         * 
         * <strong>example:</strong>
         * <p>Scheduled</p>
         */
        public Builder triggerType(String triggerType) {
            this.triggerType = triggerType;
            return this;
        }

        public GetPipelineRunResponseBody build() {
            return new GetPipelineRunResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetPipelineRunResponseBody} extends {@link TeaModel}
     *
     * <p>GetPipelineRunResponseBody</p>
     */
    public static class AsyncNodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("attempt")
        private Integer attempt;

        @com.aliyun.core.annotation.NameInMap("externalTaskId")
        private String externalTaskId;

        @com.aliyun.core.annotation.NameInMap("failedCount")
        private Long failedCount;

        @com.aliyun.core.annotation.NameInMap("inputTokens")
        private Long inputTokens;

        @com.aliyun.core.annotation.NameInMap("itemReadyCount")
        private Long itemReadyCount;

        @com.aliyun.core.annotation.NameInMap("lastError")
        private String lastError;

        @com.aliyun.core.annotation.NameInMap("nodeExecutionId")
        private String nodeExecutionId;

        @com.aliyun.core.annotation.NameInMap("nodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("nodeType")
        private String nodeType;

        @com.aliyun.core.annotation.NameInMap("outputTokens")
        private Long outputTokens;

        @com.aliyun.core.annotation.NameInMap("recordCount")
        private Long recordCount;

        @com.aliyun.core.annotation.NameInMap("routed")
        private Boolean routed;

        @com.aliyun.core.annotation.NameInMap("signalType")
        private String signalType;

        @com.aliyun.core.annotation.NameInMap("startAttempts")
        private Integer startAttempts;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("taskVersion")
        private Integer taskVersion;

        @com.aliyun.core.annotation.NameInMap("totalTokens")
        private Long totalTokens;

        private AsyncNodes(Builder builder) {
            this.attempt = builder.attempt;
            this.externalTaskId = builder.externalTaskId;
            this.failedCount = builder.failedCount;
            this.inputTokens = builder.inputTokens;
            this.itemReadyCount = builder.itemReadyCount;
            this.lastError = builder.lastError;
            this.nodeExecutionId = builder.nodeExecutionId;
            this.nodeId = builder.nodeId;
            this.nodeType = builder.nodeType;
            this.outputTokens = builder.outputTokens;
            this.recordCount = builder.recordCount;
            this.routed = builder.routed;
            this.signalType = builder.signalType;
            this.startAttempts = builder.startAttempts;
            this.status = builder.status;
            this.taskVersion = builder.taskVersion;
            this.totalTokens = builder.totalTokens;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AsyncNodes create() {
            return builder().build();
        }

        /**
         * @return attempt
         */
        public Integer getAttempt() {
            return this.attempt;
        }

        /**
         * @return externalTaskId
         */
        public String getExternalTaskId() {
            return this.externalTaskId;
        }

        /**
         * @return failedCount
         */
        public Long getFailedCount() {
            return this.failedCount;
        }

        /**
         * @return inputTokens
         */
        public Long getInputTokens() {
            return this.inputTokens;
        }

        /**
         * @return itemReadyCount
         */
        public Long getItemReadyCount() {
            return this.itemReadyCount;
        }

        /**
         * @return lastError
         */
        public String getLastError() {
            return this.lastError;
        }

        /**
         * @return nodeExecutionId
         */
        public String getNodeExecutionId() {
            return this.nodeExecutionId;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return nodeType
         */
        public String getNodeType() {
            return this.nodeType;
        }

        /**
         * @return outputTokens
         */
        public Long getOutputTokens() {
            return this.outputTokens;
        }

        /**
         * @return recordCount
         */
        public Long getRecordCount() {
            return this.recordCount;
        }

        /**
         * @return routed
         */
        public Boolean getRouted() {
            return this.routed;
        }

        /**
         * @return signalType
         */
        public String getSignalType() {
            return this.signalType;
        }

        /**
         * @return startAttempts
         */
        public Integer getStartAttempts() {
            return this.startAttempts;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return taskVersion
         */
        public Integer getTaskVersion() {
            return this.taskVersion;
        }

        /**
         * @return totalTokens
         */
        public Long getTotalTokens() {
            return this.totalTokens;
        }

        public static final class Builder {
            private Integer attempt; 
            private String externalTaskId; 
            private Long failedCount; 
            private Long inputTokens; 
            private Long itemReadyCount; 
            private String lastError; 
            private String nodeExecutionId; 
            private String nodeId; 
            private String nodeType; 
            private Long outputTokens; 
            private Long recordCount; 
            private Boolean routed; 
            private String signalType; 
            private Integer startAttempts; 
            private String status; 
            private Integer taskVersion; 
            private Long totalTokens; 

            private Builder() {
            } 

            private Builder(AsyncNodes model) {
                this.attempt = model.attempt;
                this.externalTaskId = model.externalTaskId;
                this.failedCount = model.failedCount;
                this.inputTokens = model.inputTokens;
                this.itemReadyCount = model.itemReadyCount;
                this.lastError = model.lastError;
                this.nodeExecutionId = model.nodeExecutionId;
                this.nodeId = model.nodeId;
                this.nodeType = model.nodeType;
                this.outputTokens = model.outputTokens;
                this.recordCount = model.recordCount;
                this.routed = model.routed;
                this.signalType = model.signalType;
                this.startAttempts = model.startAttempts;
                this.status = model.status;
                this.taskVersion = model.taskVersion;
                this.totalTokens = model.totalTokens;
            } 

            /**
             * <p>The number of execution attempts.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder attempt(Integer attempt) {
                this.attempt = attempt;
                return this;
            }

            /**
             * <p>The external task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>hs-001</p>
             */
            public Builder externalTaskId(String externalTaskId) {
                this.externalTaskId = externalTaskId;
                return this;
            }

            /**
             * <p>The number of failed records.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder failedCount(Long failedCount) {
                this.failedCount = failedCount;
                return this;
            }

            /**
             * <p>The number of consumed input tokens.</p>
             * 
             * <strong>example:</strong>
             * <p>1200</p>
             */
            public Builder inputTokens(Long inputTokens) {
                this.inputTokens = inputTokens;
                return this;
            }

            /**
             * <p>The number of ready work items.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder itemReadyCount(Long itemReadyCount) {
                this.itemReadyCount = itemReadyCount;
                return this;
            }

            /**
             * <p>The latest error message.</p>
             * 
             * <strong>example:</strong>
             * <p>example-error</p>
             */
            public Builder lastError(String lastError) {
                this.lastError = lastError;
                return this;
            }

            /**
             * <p>The node execution ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ne-001</p>
             */
            public Builder nodeExecutionId(String nodeExecutionId) {
                this.nodeExecutionId = nodeExecutionId;
                return this;
            }

            /**
             * <p>The node ID.</p>
             * 
             * <strong>example:</strong>
             * <p>stage-1</p>
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>The node type.</p>
             * 
             * <strong>example:</strong>
             * <p>annotation</p>
             */
            public Builder nodeType(String nodeType) {
                this.nodeType = nodeType;
                return this;
            }

            /**
             * <p>The number of consumed output tokens.</p>
             * 
             * <strong>example:</strong>
             * <p>300</p>
             */
            public Builder outputTokens(Long outputTokens) {
                this.outputTokens = outputTokens;
                return this;
            }

            /**
             * <p>The total number of records in the stage.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder recordCount(Long recordCount) {
                this.recordCount = recordCount;
                return this;
            }

            /**
             * <p>Indicates whether the node has been routed to the downstream stage.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder routed(Boolean routed) {
                this.routed = routed;
                return this;
            }

            /**
             * <p>The latest signal type.</p>
             * 
             * <strong>example:</strong>
             * <p>STAGE_COMPLETED</p>
             */
            public Builder signalType(String signalType) {
                this.signalType = signalType;
                return this;
            }

            /**
             * <p>The number of start attempts.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder startAttempts(Integer startAttempts) {
                this.startAttempts = startAttempts;
                return this;
            }

            /**
             * <p>The asynchronous node status.</p>
             * 
             * <strong>example:</strong>
             * <p>WAITING</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The task version.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder taskVersion(Integer taskVersion) {
                this.taskVersion = taskVersion;
                return this;
            }

            /**
             * <p>The total number of consumed tokens.</p>
             * 
             * <strong>example:</strong>
             * <p>1500</p>
             */
            public Builder totalTokens(Long totalTokens) {
                this.totalTokens = totalTokens;
                return this;
            }

            public AsyncNodes build() {
                return new AsyncNodes(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetPipelineRunResponseBody} extends {@link TeaModel}
     *
     * <p>GetPipelineRunResponseBody</p>
     */
    public static class InputRef extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("boundary")
        private String boundary;

        @com.aliyun.core.annotation.NameInMap("digest")
        private String digest;

        @com.aliyun.core.annotation.NameInMap("kind")
        private String kind;

        @com.aliyun.core.annotation.NameInMap("owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("resource")
        private String resource;

        @com.aliyun.core.annotation.NameInMap("schemaVersion")
        private String schemaVersion;

        private InputRef(Builder builder) {
            this.boundary = builder.boundary;
            this.digest = builder.digest;
            this.kind = builder.kind;
            this.owner = builder.owner;
            this.resource = builder.resource;
            this.schemaVersion = builder.schemaVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InputRef create() {
            return builder().build();
        }

        /**
         * @return boundary
         */
        public String getBoundary() {
            return this.boundary;
        }

        /**
         * @return digest
         */
        public String getDigest() {
            return this.digest;
        }

        /**
         * @return kind
         */
        public String getKind() {
            return this.kind;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return resource
         */
        public String getResource() {
            return this.resource;
        }

        /**
         * @return schemaVersion
         */
        public String getSchemaVersion() {
            return this.schemaVersion;
        }

        public static final class Builder {
            private String boundary; 
            private String digest; 
            private String kind; 
            private String owner; 
            private String resource; 
            private String schemaVersion; 

            private Builder() {
            } 

            private Builder(InputRef model) {
                this.boundary = model.boundary;
                this.digest = model.digest;
                this.kind = model.kind;
                this.owner = model.owner;
                this.resource = model.resource;
                this.schemaVersion = model.schemaVersion;
            } 

            /**
             * <p>The immutable data boundary identifier.</p>
             * 
             * <strong>example:</strong>
             * <p>v1</p>
             */
            public Builder boundary(String boundary) {
                this.boundary = boundary;
                return this;
            }

            /**
             * <p>The data digest.</p>
             * 
             * <strong>example:</strong>
             * <p>sha256:abcdef</p>
             */
            public Builder digest(String digest) {
                this.digest = digest;
                return this;
            }

            /**
             * <p>The reference data type.</p>
             * 
             * <strong>example:</strong>
             * <p>dataset</p>
             */
            public Builder kind(String kind) {
                this.kind = kind;
                return this;
            }

            /**
             * <p>The data owner identifier.</p>
             * 
             * <strong>example:</strong>
             * <p>1234567890123456</p>
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * <p>The data resource identifier.</p>
             * 
             * <strong>example:</strong>
             * <p>dataset-001</p>
             */
            public Builder resource(String resource) {
                this.resource = resource;
                return this;
            }

            /**
             * <p>The data schema version.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder schemaVersion(String schemaVersion) {
                this.schemaVersion = schemaVersion;
                return this;
            }

            public InputRef build() {
                return new InputRef(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetPipelineRunResponseBody} extends {@link TeaModel}
     *
     * <p>GetPipelineRunResponseBody</p>
     */
    public static class OutputRef extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("boundary")
        private String boundary;

        @com.aliyun.core.annotation.NameInMap("digest")
        private String digest;

        @com.aliyun.core.annotation.NameInMap("kind")
        private String kind;

        @com.aliyun.core.annotation.NameInMap("owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("resource")
        private String resource;

        @com.aliyun.core.annotation.NameInMap("schemaVersion")
        private String schemaVersion;

        private OutputRef(Builder builder) {
            this.boundary = builder.boundary;
            this.digest = builder.digest;
            this.kind = builder.kind;
            this.owner = builder.owner;
            this.resource = builder.resource;
            this.schemaVersion = builder.schemaVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OutputRef create() {
            return builder().build();
        }

        /**
         * @return boundary
         */
        public String getBoundary() {
            return this.boundary;
        }

        /**
         * @return digest
         */
        public String getDigest() {
            return this.digest;
        }

        /**
         * @return kind
         */
        public String getKind() {
            return this.kind;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return resource
         */
        public String getResource() {
            return this.resource;
        }

        /**
         * @return schemaVersion
         */
        public String getSchemaVersion() {
            return this.schemaVersion;
        }

        public static final class Builder {
            private String boundary; 
            private String digest; 
            private String kind; 
            private String owner; 
            private String resource; 
            private String schemaVersion; 

            private Builder() {
            } 

            private Builder(OutputRef model) {
                this.boundary = model.boundary;
                this.digest = model.digest;
                this.kind = model.kind;
                this.owner = model.owner;
                this.resource = model.resource;
                this.schemaVersion = model.schemaVersion;
            } 

            /**
             * <p>The immutable data boundary identifier.</p>
             * 
             * <strong>example:</strong>
             * <p>v1</p>
             */
            public Builder boundary(String boundary) {
                this.boundary = boundary;
                return this;
            }

            /**
             * <p>The data digest.</p>
             * 
             * <strong>example:</strong>
             * <p>sha256:abcdef</p>
             */
            public Builder digest(String digest) {
                this.digest = digest;
                return this;
            }

            /**
             * <p>The reference data type.</p>
             * 
             * <strong>example:</strong>
             * <p>dataset</p>
             */
            public Builder kind(String kind) {
                this.kind = kind;
                return this;
            }

            /**
             * <p>The data owner identifier.</p>
             * 
             * <strong>example:</strong>
             * <p>1234567890123456</p>
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * <p>The data resource identifier.</p>
             * 
             * <strong>example:</strong>
             * <p>dataset-001</p>
             */
            public Builder resource(String resource) {
                this.resource = resource;
                return this;
            }

            /**
             * <p>The data schema version.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder schemaVersion(String schemaVersion) {
                this.schemaVersion = schemaVersion;
                return this;
            }

            public OutputRef build() {
                return new OutputRef(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetPipelineRunResponseBody} extends {@link TeaModel}
     *
     * <p>GetPipelineRunResponseBody</p>
     */
    public static class NodeExecutions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("attempt")
        private Integer attempt;

        @com.aliyun.core.annotation.NameInMap("completionEventId")
        private String completionEventId;

        @com.aliyun.core.annotation.NameInMap("errorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("errorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("externalTaskId")
        private String externalTaskId;

        @com.aliyun.core.annotation.NameInMap("finishedAtTime")
        private String finishedAtTime;

        @com.aliyun.core.annotation.NameInMap("inputCount")
        private Long inputCount;

        @com.aliyun.core.annotation.NameInMap("inputRef")
        private InputRef inputRef;

        @com.aliyun.core.annotation.NameInMap("mode")
        private String mode;

        @com.aliyun.core.annotation.NameInMap("nodeExecutionId")
        private String nodeExecutionId;

        @com.aliyun.core.annotation.NameInMap("nodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("nodeType")
        private String nodeType;

        @com.aliyun.core.annotation.NameInMap("order")
        private Integer order;

        @com.aliyun.core.annotation.NameInMap("outputCount")
        private Long outputCount;

        @com.aliyun.core.annotation.NameInMap("outputRef")
        private OutputRef outputRef;

        @com.aliyun.core.annotation.NameInMap("outputStartResource")
        private String outputStartResource;

        @com.aliyun.core.annotation.NameInMap("outputStartSeq")
        private Long outputStartSeq;

        @com.aliyun.core.annotation.NameInMap("runId")
        private String runId;

        @com.aliyun.core.annotation.NameInMap("startedAtTime")
        private String startedAtTime;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("taskVersion")
        private Integer taskVersion;

        private NodeExecutions(Builder builder) {
            this.attempt = builder.attempt;
            this.completionEventId = builder.completionEventId;
            this.errorCode = builder.errorCode;
            this.errorMessage = builder.errorMessage;
            this.externalTaskId = builder.externalTaskId;
            this.finishedAtTime = builder.finishedAtTime;
            this.inputCount = builder.inputCount;
            this.inputRef = builder.inputRef;
            this.mode = builder.mode;
            this.nodeExecutionId = builder.nodeExecutionId;
            this.nodeId = builder.nodeId;
            this.nodeType = builder.nodeType;
            this.order = builder.order;
            this.outputCount = builder.outputCount;
            this.outputRef = builder.outputRef;
            this.outputStartResource = builder.outputStartResource;
            this.outputStartSeq = builder.outputStartSeq;
            this.runId = builder.runId;
            this.startedAtTime = builder.startedAtTime;
            this.status = builder.status;
            this.taskVersion = builder.taskVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodeExecutions create() {
            return builder().build();
        }

        /**
         * @return attempt
         */
        public Integer getAttempt() {
            return this.attempt;
        }

        /**
         * @return completionEventId
         */
        public String getCompletionEventId() {
            return this.completionEventId;
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return externalTaskId
         */
        public String getExternalTaskId() {
            return this.externalTaskId;
        }

        /**
         * @return finishedAtTime
         */
        public String getFinishedAtTime() {
            return this.finishedAtTime;
        }

        /**
         * @return inputCount
         */
        public Long getInputCount() {
            return this.inputCount;
        }

        /**
         * @return inputRef
         */
        public InputRef getInputRef() {
            return this.inputRef;
        }

        /**
         * @return mode
         */
        public String getMode() {
            return this.mode;
        }

        /**
         * @return nodeExecutionId
         */
        public String getNodeExecutionId() {
            return this.nodeExecutionId;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return nodeType
         */
        public String getNodeType() {
            return this.nodeType;
        }

        /**
         * @return order
         */
        public Integer getOrder() {
            return this.order;
        }

        /**
         * @return outputCount
         */
        public Long getOutputCount() {
            return this.outputCount;
        }

        /**
         * @return outputRef
         */
        public OutputRef getOutputRef() {
            return this.outputRef;
        }

        /**
         * @return outputStartResource
         */
        public String getOutputStartResource() {
            return this.outputStartResource;
        }

        /**
         * @return outputStartSeq
         */
        public Long getOutputStartSeq() {
            return this.outputStartSeq;
        }

        /**
         * @return runId
         */
        public String getRunId() {
            return this.runId;
        }

        /**
         * @return startedAtTime
         */
        public String getStartedAtTime() {
            return this.startedAtTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return taskVersion
         */
        public Integer getTaskVersion() {
            return this.taskVersion;
        }

        public static final class Builder {
            private Integer attempt; 
            private String completionEventId; 
            private String errorCode; 
            private String errorMessage; 
            private String externalTaskId; 
            private String finishedAtTime; 
            private Long inputCount; 
            private InputRef inputRef; 
            private String mode; 
            private String nodeExecutionId; 
            private String nodeId; 
            private String nodeType; 
            private Integer order; 
            private Long outputCount; 
            private OutputRef outputRef; 
            private String outputStartResource; 
            private Long outputStartSeq; 
            private String runId; 
            private String startedAtTime; 
            private String status; 
            private Integer taskVersion; 

            private Builder() {
            } 

            private Builder(NodeExecutions model) {
                this.attempt = model.attempt;
                this.completionEventId = model.completionEventId;
                this.errorCode = model.errorCode;
                this.errorMessage = model.errorMessage;
                this.externalTaskId = model.externalTaskId;
                this.finishedAtTime = model.finishedAtTime;
                this.inputCount = model.inputCount;
                this.inputRef = model.inputRef;
                this.mode = model.mode;
                this.nodeExecutionId = model.nodeExecutionId;
                this.nodeId = model.nodeId;
                this.nodeType = model.nodeType;
                this.order = model.order;
                this.outputCount = model.outputCount;
                this.outputRef = model.outputRef;
                this.outputStartResource = model.outputStartResource;
                this.outputStartSeq = model.outputStartSeq;
                this.runId = model.runId;
                this.startedAtTime = model.startedAtTime;
                this.status = model.status;
                this.taskVersion = model.taskVersion;
            } 

            /**
             * <p>The number of execution attempts.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder attempt(Integer attempt) {
                this.attempt = attempt;
                return this;
            }

            /**
             * <p>The completion event ID.</p>
             * 
             * <strong>example:</strong>
             * <p>evt-001</p>
             */
            public Builder completionEventId(String completionEventId) {
                this.completionEventId = completionEventId;
                return this;
            }

            /**
             * <p>The node error code.</p>
             * 
             * <strong>example:</strong>
             * <p>StageFailed</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>The node error message.</p>
             * 
             * <strong>example:</strong>
             * <p>stage execution failed</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The external task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>hs-001</p>
             */
            public Builder externalTaskId(String externalTaskId) {
                this.externalTaskId = externalTaskId;
                return this;
            }

            /**
             * <p>The node end time.</p>
             * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
             * 
             * <strong>example:</strong>
             * <p>2026-01-01T00:00:10Z</p>
             */
            public Builder finishedAtTime(String finishedAtTime) {
                this.finishedAtTime = finishedAtTime;
                return this;
            }

            /**
             * <p>The number of input records.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder inputCount(Long inputCount) {
                this.inputCount = inputCount;
                return this;
            }

            /**
             * <p>The node input data reference.</p>
             */
            public Builder inputRef(InputRef inputRef) {
                this.inputRef = inputRef;
                return this;
            }

            /**
             * <p>The node execution mode.</p>
             * 
             * <strong>example:</strong>
             * <p>ASYNC</p>
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * <p>The node execution ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ne-001</p>
             */
            public Builder nodeExecutionId(String nodeExecutionId) {
                this.nodeExecutionId = nodeExecutionId;
                return this;
            }

            /**
             * <p>The node ID.</p>
             * 
             * <strong>example:</strong>
             * <p>stage-1</p>
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>The node type.</p>
             * 
             * <strong>example:</strong>
             * <p>annotation</p>
             */
            public Builder nodeType(String nodeType) {
                this.nodeType = nodeType;
                return this;
            }

            /**
             * <p>The node execution order.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder order(Integer order) {
                this.order = order;
                return this;
            }

            /**
             * <p>The number of output records.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder outputCount(Long outputCount) {
                this.outputCount = outputCount;
                return this;
            }

            /**
             * <p>The node output data reference.</p>
             */
            public Builder outputRef(OutputRef outputRef) {
                this.outputRef = outputRef;
                return this;
            }

            /**
             * <p>The output start resource identifier.</p>
             * 
             * <strong>example:</strong>
             * <p>dataset-001</p>
             */
            public Builder outputStartResource(String outputStartResource) {
                this.outputStartResource = outputStartResource;
                return this;
            }

            /**
             * <p>The output start sequence number.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder outputStartSeq(Long outputStartSeq) {
                this.outputStartSeq = outputStartSeq;
                return this;
            }

            /**
             * <p>The run ID.</p>
             * 
             * <strong>example:</strong>
             * <p>run-20260101-0001</p>
             */
            public Builder runId(String runId) {
                this.runId = runId;
                return this;
            }

            /**
             * <p>The node start time.</p>
             * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
             * 
             * <strong>example:</strong>
             * <p>2026-01-01T00:00:01Z</p>
             */
            public Builder startedAtTime(String startedAtTime) {
                this.startedAtTime = startedAtTime;
                return this;
            }

            /**
             * <p>The node execution status.</p>
             * 
             * <strong>example:</strong>
             * <p>WAITING</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The task version.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder taskVersion(Integer taskVersion) {
                this.taskVersion = taskVersion;
                return this;
            }

            public NodeExecutions build() {
                return new NodeExecutions(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetPipelineRunResponseBody} extends {@link TeaModel}
     *
     * <p>GetPipelineRunResponseBody</p>
     */
    public static class Nodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("parameters")
        private java.util.Map<String, ?> parameters;

        @com.aliyun.core.annotation.NameInMap("path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Nodes(Builder builder) {
            this.id = builder.id;
            this.parameters = builder.parameters;
            this.path = builder.path;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Nodes create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return parameters
         */
        public java.util.Map<String, ?> getParameters() {
            return this.parameters;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String id; 
            private java.util.Map<String, ?> parameters; 
            private String path; 
            private String type; 

            private Builder() {
            } 

            private Builder(Nodes model) {
                this.id = model.id;
                this.parameters = model.parameters;
                this.path = model.path;
                this.type = model.type;
            } 

            /**
             * <p>The node ID.</p>
             * 
             * <strong>example:</strong>
             * <p>stage-1</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The node parameters in a key-value structure, which vary depending on the node type.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;stageId&quot;:&quot;stage-1&quot;}</p>
             */
            public Builder parameters(java.util.Map<String, ?> parameters) {
                this.parameters = parameters;
                return this;
            }

            /**
             * <p>The node path.</p>
             * 
             * <strong>example:</strong>
             * <p>/stage-1</p>
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * <p>The node type.</p>
             * 
             * <strong>example:</strong>
             * <p>annotation</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Nodes build() {
                return new Nodes(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetPipelineRunResponseBody} extends {@link TeaModel}
     *
     * <p>GetPipelineRunResponseBody</p>
     */
    public static class PipelineSnapshot extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("nodes")
        private java.util.List<Nodes> nodes;

        private PipelineSnapshot(Builder builder) {
            this.nodes = builder.nodes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PipelineSnapshot create() {
            return builder().build();
        }

        /**
         * @return nodes
         */
        public java.util.List<Nodes> getNodes() {
            return this.nodes;
        }

        public static final class Builder {
            private java.util.List<Nodes> nodes; 

            private Builder() {
            } 

            private Builder(PipelineSnapshot model) {
                this.nodes = model.nodes;
            } 

            /**
             * <p>The list of frozen orchestration nodes.</p>
             */
            public Builder nodes(java.util.List<Nodes> nodes) {
                this.nodes = nodes;
                return this;
            }

            public PipelineSnapshot build() {
                return new PipelineSnapshot(this);
            } 

        } 

    }
}
