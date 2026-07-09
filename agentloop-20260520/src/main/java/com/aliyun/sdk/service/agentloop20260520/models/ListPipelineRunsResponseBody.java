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
 * {@link ListPipelineRunsResponseBody} extends {@link TeaModel}
 *
 * <p>ListPipelineRunsResponseBody</p>
 */
public class ListPipelineRunsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("runs")
    private java.util.List<Runs> runs;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Integer totalCount;

    private ListPipelineRunsResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.runs = builder.runs;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPipelineRunsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
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

    /**
     * @return runs
     */
    public java.util.List<Runs> getRuns() {
        return this.runs;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private java.util.List<Runs> runs; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListPipelineRunsResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.runs = model.runs;
            this.totalCount = model.totalCount;
        } 

        /**
         * maxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * nextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * runs.
         */
        public Builder runs(java.util.List<Runs> runs) {
            this.runs = runs;
            return this;
        }

        /**
         * totalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListPipelineRunsResponseBody build() {
            return new ListPipelineRunsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListPipelineRunsResponseBody} extends {@link TeaModel}
     *
     * <p>ListPipelineRunsResponseBody</p>
     */
    public static class Runs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("agentSpaceName")
        private String agentSpaceName;

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

        @com.aliyun.core.annotation.NameInMap("pipelineName")
        private String pipelineName;

        @com.aliyun.core.annotation.NameInMap("runId")
        private String runId;

        @com.aliyun.core.annotation.NameInMap("startTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("stats")
        private java.util.Map<String, ?> stats;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("toTime")
        private Long toTime;

        @com.aliyun.core.annotation.NameInMap("triggerTime")
        private String triggerTime;

        @com.aliyun.core.annotation.NameInMap("triggerType")
        private String triggerType;

        private Runs(Builder builder) {
            this.agentSpaceName = builder.agentSpaceName;
            this.attempt = builder.attempt;
            this.errorCode = builder.errorCode;
            this.errorMessage = builder.errorMessage;
            this.finishTime = builder.finishTime;
            this.fromTime = builder.fromTime;
            this.maxAttempts = builder.maxAttempts;
            this.nextRetryTime = builder.nextRetryTime;
            this.pipelineName = builder.pipelineName;
            this.runId = builder.runId;
            this.startTime = builder.startTime;
            this.stats = builder.stats;
            this.status = builder.status;
            this.toTime = builder.toTime;
            this.triggerTime = builder.triggerTime;
            this.triggerType = builder.triggerType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Runs create() {
            return builder().build();
        }

        /**
         * @return agentSpaceName
         */
        public String getAgentSpaceName() {
            return this.agentSpaceName;
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
         * @return pipelineName
         */
        public String getPipelineName() {
            return this.pipelineName;
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
         * @return toTime
         */
        public Long getToTime() {
            return this.toTime;
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
            private Integer attempt; 
            private String errorCode; 
            private String errorMessage; 
            private String finishTime; 
            private Long fromTime; 
            private Integer maxAttempts; 
            private String nextRetryTime; 
            private String pipelineName; 
            private String runId; 
            private String startTime; 
            private java.util.Map<String, ?> stats; 
            private String status; 
            private Long toTime; 
            private String triggerTime; 
            private String triggerType; 

            private Builder() {
            } 

            private Builder(Runs model) {
                this.agentSpaceName = model.agentSpaceName;
                this.attempt = model.attempt;
                this.errorCode = model.errorCode;
                this.errorMessage = model.errorMessage;
                this.finishTime = model.finishTime;
                this.fromTime = model.fromTime;
                this.maxAttempts = model.maxAttempts;
                this.nextRetryTime = model.nextRetryTime;
                this.pipelineName = model.pipelineName;
                this.runId = model.runId;
                this.startTime = model.startTime;
                this.stats = model.stats;
                this.status = model.status;
                this.toTime = model.toTime;
                this.triggerTime = model.triggerTime;
                this.triggerType = model.triggerType;
            } 

            /**
             * agentSpaceName.
             */
            public Builder agentSpaceName(String agentSpaceName) {
                this.agentSpaceName = agentSpaceName;
                return this;
            }

            /**
             * attempt.
             */
            public Builder attempt(Integer attempt) {
                this.attempt = attempt;
                return this;
            }

            /**
             * errorCode.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * errorMessage.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
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
             * fromTime.
             */
            public Builder fromTime(Long fromTime) {
                this.fromTime = fromTime;
                return this;
            }

            /**
             * maxAttempts.
             */
            public Builder maxAttempts(Integer maxAttempts) {
                this.maxAttempts = maxAttempts;
                return this;
            }

            /**
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
             * pipelineName.
             */
            public Builder pipelineName(String pipelineName) {
                this.pipelineName = pipelineName;
                return this;
            }

            /**
             * runId.
             */
            public Builder runId(String runId) {
                this.runId = runId;
                return this;
            }

            /**
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
             * stats.
             */
            public Builder stats(java.util.Map<String, ?> stats) {
                this.stats = stats;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * toTime.
             */
            public Builder toTime(Long toTime) {
                this.toTime = toTime;
                return this;
            }

            /**
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
             * triggerType.
             */
            public Builder triggerType(String triggerType) {
                this.triggerType = triggerType;
                return this;
            }

            public Runs build() {
                return new Runs(this);
            } 

        } 

    }
}
