// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.winnexo20260512.models;

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
 * {@link GetWorkItemRunSummariesResponseBody} extends {@link TeaModel}
 *
 * <p>GetWorkItemRunSummariesResponseBody</p>
 */
public class GetWorkItemRunSummariesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetWorkItemRunSummariesResponseBody(Builder builder) {
        this.code = builder.code;
        this.items = builder.items;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetWorkItemRunSummariesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private java.util.List<Items> items; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetWorkItemRunSummariesResponseBody model) {
            this.code = model.code;
            this.items = model.items;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The common business status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The execution summaries generated for the current plan and current turn. Previous summaries are not returned until new summaries are generated for affected nodes that are re-run.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;attemptId&quot;:&quot;attempt_1&quot;,&quot;planId&quot;:&quot;plan_v3&quot;,&quot;nodeKey&quot;:&quot;query.amount&quot;,&quot;nodeStatus&quot;:&quot;COMPLETED&quot;}]</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The common error description.</p>
         * 
         * <strong>example:</strong>
         * <p>The requested resource does not exist</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request tracking ID.</p>
         * 
         * <strong>example:</strong>
         * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetWorkItemRunSummariesResponseBody build() {
            return new GetWorkItemRunSummariesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetWorkItemRunSummariesResponseBody} extends {@link TeaModel}
     *
     * <p>GetWorkItemRunSummariesResponseBody</p>
     */
    public static class RunSummaryTools extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private RunSummaryTools(Builder builder) {
            this.name = builder.name;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RunSummaryTools create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String name; 
            private String type; 

            private Builder() {
            } 

            private Builder(RunSummaryTools model) {
                this.name = model.name;
                this.type = model.type;
            } 

            /**
             * <p>The name of the tool.</p>
             * 
             * <strong>example:</strong>
             * <p>Sales Analysis Assistant</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The tool type, such as SKILL or MCP.</p>
             * 
             * <strong>example:</strong>
             * <p>AGENT</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public RunSummaryTools build() {
                return new RunSummaryTools(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetWorkItemRunSummariesResponseBody} extends {@link TeaModel}
     *
     * <p>GetWorkItemRunSummariesResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("attemptId")
        private String attemptId;

        @com.aliyun.core.annotation.NameInMap("attemptSeq")
        private Long attemptSeq;

        @com.aliyun.core.annotation.NameInMap("executorId")
        private String executorId;

        @com.aliyun.core.annotation.NameInMap("executorName")
        private String executorName;

        @com.aliyun.core.annotation.NameInMap("executorType")
        private String executorType;

        @com.aliyun.core.annotation.NameInMap("finishedAt")
        private String finishedAt;

        @com.aliyun.core.annotation.NameInMap("nodeKey")
        private String nodeKey;

        @com.aliyun.core.annotation.NameInMap("nodeName")
        private String nodeName;

        @com.aliyun.core.annotation.NameInMap("nodeStatus")
        private String nodeStatus;

        @com.aliyun.core.annotation.NameInMap("planId")
        private String planId;

        @com.aliyun.core.annotation.NameInMap("result")
        private Object result;

        @com.aliyun.core.annotation.NameInMap("runSummary")
        private Object runSummary;

        @com.aliyun.core.annotation.NameInMap("runSummaryError")
        private String runSummaryError;

        @com.aliyun.core.annotation.NameInMap("runSummaryGeneratedAt")
        private String runSummaryGeneratedAt;

        @com.aliyun.core.annotation.NameInMap("runSummarySources")
        private java.util.List<?> runSummarySources;

        @com.aliyun.core.annotation.NameInMap("runSummaryStatus")
        private String runSummaryStatus;

        @com.aliyun.core.annotation.NameInMap("runSummaryTools")
        private java.util.List<RunSummaryTools> runSummaryTools;

        @com.aliyun.core.annotation.NameInMap("startedAt")
        private String startedAt;

        @com.aliyun.core.annotation.NameInMap("turnSeq")
        private Long turnSeq;

        private Items(Builder builder) {
            this.attemptId = builder.attemptId;
            this.attemptSeq = builder.attemptSeq;
            this.executorId = builder.executorId;
            this.executorName = builder.executorName;
            this.executorType = builder.executorType;
            this.finishedAt = builder.finishedAt;
            this.nodeKey = builder.nodeKey;
            this.nodeName = builder.nodeName;
            this.nodeStatus = builder.nodeStatus;
            this.planId = builder.planId;
            this.result = builder.result;
            this.runSummary = builder.runSummary;
            this.runSummaryError = builder.runSummaryError;
            this.runSummaryGeneratedAt = builder.runSummaryGeneratedAt;
            this.runSummarySources = builder.runSummarySources;
            this.runSummaryStatus = builder.runSummaryStatus;
            this.runSummaryTools = builder.runSummaryTools;
            this.startedAt = builder.startedAt;
            this.turnSeq = builder.turnSeq;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return attemptId
         */
        public String getAttemptId() {
            return this.attemptId;
        }

        /**
         * @return attemptSeq
         */
        public Long getAttemptSeq() {
            return this.attemptSeq;
        }

        /**
         * @return executorId
         */
        public String getExecutorId() {
            return this.executorId;
        }

        /**
         * @return executorName
         */
        public String getExecutorName() {
            return this.executorName;
        }

        /**
         * @return executorType
         */
        public String getExecutorType() {
            return this.executorType;
        }

        /**
         * @return finishedAt
         */
        public String getFinishedAt() {
            return this.finishedAt;
        }

        /**
         * @return nodeKey
         */
        public String getNodeKey() {
            return this.nodeKey;
        }

        /**
         * @return nodeName
         */
        public String getNodeName() {
            return this.nodeName;
        }

        /**
         * @return nodeStatus
         */
        public String getNodeStatus() {
            return this.nodeStatus;
        }

        /**
         * @return planId
         */
        public String getPlanId() {
            return this.planId;
        }

        /**
         * @return result
         */
        public Object getResult() {
            return this.result;
        }

        /**
         * @return runSummary
         */
        public Object getRunSummary() {
            return this.runSummary;
        }

        /**
         * @return runSummaryError
         */
        public String getRunSummaryError() {
            return this.runSummaryError;
        }

        /**
         * @return runSummaryGeneratedAt
         */
        public String getRunSummaryGeneratedAt() {
            return this.runSummaryGeneratedAt;
        }

        /**
         * @return runSummarySources
         */
        public java.util.List<?> getRunSummarySources() {
            return this.runSummarySources;
        }

        /**
         * @return runSummaryStatus
         */
        public String getRunSummaryStatus() {
            return this.runSummaryStatus;
        }

        /**
         * @return runSummaryTools
         */
        public java.util.List<RunSummaryTools> getRunSummaryTools() {
            return this.runSummaryTools;
        }

        /**
         * @return startedAt
         */
        public String getStartedAt() {
            return this.startedAt;
        }

        /**
         * @return turnSeq
         */
        public Long getTurnSeq() {
            return this.turnSeq;
        }

        public static final class Builder {
            private String attemptId; 
            private Long attemptSeq; 
            private String executorId; 
            private String executorName; 
            private String executorType; 
            private String finishedAt; 
            private String nodeKey; 
            private String nodeName; 
            private String nodeStatus; 
            private String planId; 
            private Object result; 
            private Object runSummary; 
            private String runSummaryError; 
            private String runSummaryGeneratedAt; 
            private java.util.List<?> runSummarySources; 
            private String runSummaryStatus; 
            private java.util.List<RunSummaryTools> runSummaryTools; 
            private String startedAt; 
            private Long turnSeq; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.attemptId = model.attemptId;
                this.attemptSeq = model.attemptSeq;
                this.executorId = model.executorId;
                this.executorName = model.executorName;
                this.executorType = model.executorType;
                this.finishedAt = model.finishedAt;
                this.nodeKey = model.nodeKey;
                this.nodeName = model.nodeName;
                this.nodeStatus = model.nodeStatus;
                this.planId = model.planId;
                this.result = model.result;
                this.runSummary = model.runSummary;
                this.runSummaryError = model.runSummaryError;
                this.runSummaryGeneratedAt = model.runSummaryGeneratedAt;
                this.runSummarySources = model.runSummarySources;
                this.runSummaryStatus = model.runSummaryStatus;
                this.runSummaryTools = model.runSummaryTools;
                this.startedAt = model.startedAt;
                this.turnSeq = model.turnSeq;
            } 

            /**
             * <p>The ID of the node attempt.</p>
             * 
             * <strong>example:</strong>
             * <p>attempt_1</p>
             */
            public Builder attemptId(String attemptId) {
                this.attemptId = attemptId;
                return this;
            }

            /**
             * <p>The sequence number of the node attempt, starting from 1.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder attemptSeq(Long attemptSeq) {
                this.attemptSeq = attemptSeq;
                return this;
            }

            /**
             * <p>The ID of the executor.</p>
             * 
             * <strong>example:</strong>
             * <p>agent_1001</p>
             */
            public Builder executorId(String executorId) {
                this.executorId = executorId;
                return this;
            }

            /**
             * <p>The name of the executor.</p>
             * 
             * <strong>example:</strong>
             * <p>Sales Analysis Assistant</p>
             */
            public Builder executorName(String executorName) {
                this.executorName = executorName;
                return this;
            }

            /**
             * <p>The executor type, such as AGENT or HUMAN.</p>
             * 
             * <strong>example:</strong>
             * <p>AGENT</p>
             */
            public Builder executorType(String executorType) {
                this.executorType = executorType;
                return this;
            }

            /**
             * <p>The end time of the node, in ISO 8601 format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-11-05T08:05:00Z</p>
             */
            public Builder finishedAt(String finishedAt) {
                this.finishedAt = finishedAt;
                return this;
            }

            /**
             * <p>The node key.</p>
             * 
             * <strong>example:</strong>
             * <p>query.amount</p>
             */
            public Builder nodeKey(String nodeKey) {
                this.nodeKey = nodeKey;
                return this;
            }

            /**
             * <p>The name of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>Query sales amount</p>
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            /**
             * <p>The node status, such as COMPLETED or FAILED.</p>
             * 
             * <strong>example:</strong>
             * <p>COMPLETED</p>
             */
            public Builder nodeStatus(String nodeStatus) {
                this.nodeStatus = nodeStatus;
                return this;
            }

            /**
             * <p>The ID of the associated physical plan.</p>
             * 
             * <strong>example:</strong>
             * <p>plan_v3</p>
             */
            public Builder planId(String planId) {
                this.planId = planId;
                return this;
            }

            /**
             * <p>The execution result of the node, as a JSON object.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;rows&quot;:3}</p>
             */
            public Builder result(Object result) {
                this.result = result;
                return this;
            }

            /**
             * <p>The content of the execution summary. This field is empty if the summary is not generated.</p>
             * 
             * <strong>example:</strong>
             * <p>Completed the sales amount query, returning a total of 3 rows of data</p>
             */
            public Builder runSummary(Object runSummary) {
                this.runSummary = runSummary;
                return this;
            }

            /**
             * <p>The reason for the execution summary failure. This field is empty if the generation is successful.</p>
             * 
             * <strong>example:</strong>
             * <p>Model invocation timed out</p>
             */
            public Builder runSummaryError(String runSummaryError) {
                this.runSummaryError = runSummaryError;
                return this;
            }

            /**
             * <p>The generation time of the execution summary, in ISO 8601 format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-11-05T08:06:00Z</p>
             */
            public Builder runSummaryGeneratedAt(String runSummaryGeneratedAt) {
                this.runSummaryGeneratedAt = runSummaryGeneratedAt;
                return this;
            }

            /**
             * <p>The list of data sources referenced in the execution summary.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;name&quot;:&quot;report.md&quot;}]</p>
             */
            public Builder runSummarySources(java.util.List<?> runSummarySources) {
                this.runSummarySources = runSummarySources;
                return this;
            }

            /**
             * <p>The generation status of the execution summary, such as COMPLETED, FAILED, or PROCESSING.</p>
             * 
             * <strong>example:</strong>
             * <p>COMPLETED</p>
             */
            public Builder runSummaryStatus(String runSummaryStatus) {
                this.runSummaryStatus = runSummaryStatus;
                return this;
            }

            /**
             * <p>The list of tools used in the execution summary.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;type&quot;:&quot;SKILL&quot;,&quot;name&quot;:&quot;sql_query&quot;}]</p>
             */
            public Builder runSummaryTools(java.util.List<RunSummaryTools> runSummaryTools) {
                this.runSummaryTools = runSummaryTools;
                return this;
            }

            /**
             * <p>The start time of the node, in ISO 8601 format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-11-05T08:00:00Z</p>
             */
            public Builder startedAt(String startedAt) {
                this.startedAt = startedAt;
                return this;
            }

            /**
             * <p>The sequence number of the node turn, starting from 1.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder turnSeq(Long turnSeq) {
                this.turnSeq = turnSeq;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
