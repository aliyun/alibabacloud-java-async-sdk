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
 * {@link DescribeGlobalTimerBatchesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGlobalTimerBatchesResponseBody</p>
 */
public class DescribeGlobalTimerBatchesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Results")
    private java.util.List<Results> results;

    private DescribeGlobalTimerBatchesResponseBody(Builder builder) {
        this.count = builder.count;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.results = builder.results;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGlobalTimerBatchesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
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
     * @return results
     */
    public java.util.List<Results> getResults() {
        return this.results;
    }

    public static final class Builder {
        private Integer count; 
        private String nextToken; 
        private String requestId; 
        private java.util.List<Results> results; 

        private Builder() {
        } 

        private Builder(DescribeGlobalTimerBatchesResponseBody model) {
            this.count = model.count;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.results = model.results;
        } 

        /**
         * Count.
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>E54EB497-D7B7-5F04-B744-D8DFA7B******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Results.
         */
        public Builder results(java.util.List<Results> results) {
            this.results = results;
            return this;
        }

        public DescribeGlobalTimerBatchesResponseBody build() {
            return new DescribeGlobalTimerBatchesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeGlobalTimerBatchesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGlobalTimerBatchesResponseBody</p>
     */
    public static class Results extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BatchId")
        private String batchId;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("FailedCount")
        private Integer failedCount;

        @com.aliyun.core.annotation.NameInMap("RunningCount")
        private Integer runningCount;

        @com.aliyun.core.annotation.NameInMap("SkippedCount")
        private Integer skippedCount;

        @com.aliyun.core.annotation.NameInMap("SucceedCount")
        private Integer succeedCount;

        @com.aliyun.core.annotation.NameInMap("TimerType")
        private String timerType;

        private Results(Builder builder) {
            this.batchId = builder.batchId;
            this.createTime = builder.createTime;
            this.failedCount = builder.failedCount;
            this.runningCount = builder.runningCount;
            this.skippedCount = builder.skippedCount;
            this.succeedCount = builder.succeedCount;
            this.timerType = builder.timerType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Results create() {
            return builder().build();
        }

        /**
         * @return batchId
         */
        public String getBatchId() {
            return this.batchId;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return failedCount
         */
        public Integer getFailedCount() {
            return this.failedCount;
        }

        /**
         * @return runningCount
         */
        public Integer getRunningCount() {
            return this.runningCount;
        }

        /**
         * @return skippedCount
         */
        public Integer getSkippedCount() {
            return this.skippedCount;
        }

        /**
         * @return succeedCount
         */
        public Integer getSucceedCount() {
            return this.succeedCount;
        }

        /**
         * @return timerType
         */
        public String getTimerType() {
            return this.timerType;
        }

        public static final class Builder {
            private String batchId; 
            private String createTime; 
            private Integer failedCount; 
            private Integer runningCount; 
            private Integer skippedCount; 
            private Integer succeedCount; 
            private String timerType; 

            private Builder() {
            } 

            private Builder(Results model) {
                this.batchId = model.batchId;
                this.createTime = model.createTime;
                this.failedCount = model.failedCount;
                this.runningCount = model.runningCount;
                this.skippedCount = model.skippedCount;
                this.succeedCount = model.succeedCount;
                this.timerType = model.timerType;
            } 

            /**
             * BatchId.
             */
            public Builder batchId(String batchId) {
                this.batchId = batchId;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * FailedCount.
             */
            public Builder failedCount(Integer failedCount) {
                this.failedCount = failedCount;
                return this;
            }

            /**
             * RunningCount.
             */
            public Builder runningCount(Integer runningCount) {
                this.runningCount = runningCount;
                return this;
            }

            /**
             * SkippedCount.
             */
            public Builder skippedCount(Integer skippedCount) {
                this.skippedCount = skippedCount;
                return this;
            }

            /**
             * SucceedCount.
             */
            public Builder succeedCount(Integer succeedCount) {
                this.succeedCount = succeedCount;
                return this;
            }

            /**
             * TimerType.
             */
            public Builder timerType(String timerType) {
                this.timerType = timerType;
                return this;
            }

            public Results build() {
                return new Results(this);
            } 

        } 

    }
}
