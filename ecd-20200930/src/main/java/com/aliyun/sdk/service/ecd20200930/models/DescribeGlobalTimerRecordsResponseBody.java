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
 * {@link DescribeGlobalTimerRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGlobalTimerRecordsResponseBody</p>
 */
public class DescribeGlobalTimerRecordsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Results")
    private java.util.List<Results> results;

    private DescribeGlobalTimerRecordsResponseBody(Builder builder) {
        this.count = builder.count;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.results = builder.results;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGlobalTimerRecordsResponseBody create() {
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

        private Builder(DescribeGlobalTimerRecordsResponseBody model) {
            this.count = model.count;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.results = model.results;
        } 

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * <p>A pagination token. It can be used in the next request to retrieve a new page of results. If NextToken is empty, no next page exists.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAV3MpHK1AP0pfERHZN5pu6mnFXZiT7NdvGNgkInJ****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>63740E03-1B4B-5A18-AC27-2745A4F2****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The response parameters.</p>
         */
        public Builder results(java.util.List<Results> results) {
            this.results = results;
            return this;
        }

        public DescribeGlobalTimerRecordsResponseBody build() {
            return new DescribeGlobalTimerRecordsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeGlobalTimerRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGlobalTimerRecordsResponseBody</p>
     */
    public static class Results extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActionType")
        private String actionType;

        @com.aliyun.core.annotation.NameInMap("BatchId")
        private String batchId;

        @com.aliyun.core.annotation.NameInMap("Context")
        private String context;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DesktopId")
        private String desktopId;

        @com.aliyun.core.annotation.NameInMap("DesktopName")
        private String desktopName;

        @com.aliyun.core.annotation.NameInMap("DisplayResultName")
        private String displayResultName;

        @com.aliyun.core.annotation.NameInMap("FinishTime")
        private String finishTime;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Retryable")
        private Boolean retryable;

        @com.aliyun.core.annotation.NameInMap("TimerGroupId")
        private String timerGroupId;

        @com.aliyun.core.annotation.NameInMap("TimerRecordId")
        private String timerRecordId;

        @com.aliyun.core.annotation.NameInMap("TimerResult")
        private String timerResult;

        @com.aliyun.core.annotation.NameInMap("TimerType")
        private String timerType;

        private Results(Builder builder) {
            this.actionType = builder.actionType;
            this.batchId = builder.batchId;
            this.context = builder.context;
            this.createTime = builder.createTime;
            this.desktopId = builder.desktopId;
            this.desktopName = builder.desktopName;
            this.displayResultName = builder.displayResultName;
            this.finishTime = builder.finishTime;
            this.regionId = builder.regionId;
            this.retryable = builder.retryable;
            this.timerGroupId = builder.timerGroupId;
            this.timerRecordId = builder.timerRecordId;
            this.timerResult = builder.timerResult;
            this.timerType = builder.timerType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Results create() {
            return builder().build();
        }

        /**
         * @return actionType
         */
        public String getActionType() {
            return this.actionType;
        }

        /**
         * @return batchId
         */
        public String getBatchId() {
            return this.batchId;
        }

        /**
         * @return context
         */
        public String getContext() {
            return this.context;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
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
         * @return displayResultName
         */
        public String getDisplayResultName() {
            return this.displayResultName;
        }

        /**
         * @return finishTime
         */
        public String getFinishTime() {
            return this.finishTime;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return retryable
         */
        public Boolean getRetryable() {
            return this.retryable;
        }

        /**
         * @return timerGroupId
         */
        public String getTimerGroupId() {
            return this.timerGroupId;
        }

        /**
         * @return timerRecordId
         */
        public String getTimerRecordId() {
            return this.timerRecordId;
        }

        /**
         * @return timerResult
         */
        public String getTimerResult() {
            return this.timerResult;
        }

        /**
         * @return timerType
         */
        public String getTimerType() {
            return this.timerType;
        }

        public static final class Builder {
            private String actionType; 
            private String batchId; 
            private String context; 
            private String createTime; 
            private String desktopId; 
            private String desktopName; 
            private String displayResultName; 
            private String finishTime; 
            private String regionId; 
            private Boolean retryable; 
            private String timerGroupId; 
            private String timerRecordId; 
            private String timerResult; 
            private String timerType; 

            private Builder() {
            } 

            private Builder(Results model) {
                this.actionType = model.actionType;
                this.batchId = model.batchId;
                this.context = model.context;
                this.createTime = model.createTime;
                this.desktopId = model.desktopId;
                this.desktopName = model.desktopName;
                this.displayResultName = model.displayResultName;
                this.finishTime = model.finishTime;
                this.regionId = model.regionId;
                this.retryable = model.retryable;
                this.timerGroupId = model.timerGroupId;
                this.timerRecordId = model.timerRecordId;
                this.timerResult = model.timerResult;
                this.timerType = model.timerType;
            } 

            /**
             * ActionType.
             */
            public Builder actionType(String actionType) {
                this.actionType = actionType;
                return this;
            }

            /**
             * <p>The ID of the batch in which the scheduled task is executed.</p>
             * 
             * <strong>example:</strong>
             * <p>ccg-0cvfvf6u1enx1****</p>
             */
            public Builder batchId(String batchId) {
                this.batchId = batchId;
                return this;
            }

            /**
             * Context.
             */
            public Builder context(String context) {
                this.context = context;
                return this;
            }

            /**
             * <p>The time when the execution record was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-08-03T08:27:29Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The cloud computer ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ecd-0c951fy9arnk9****</p>
             */
            public Builder desktopId(String desktopId) {
                this.desktopId = desktopId;
                return this;
            }

            /**
             * <p>The cloud computer name.</p>
             * 
             * <strong>example:</strong>
             * <p>DesktopName</p>
             */
            public Builder desktopName(String desktopName) {
                this.desktopName = desktopName;
                return this;
            }

            /**
             * DisplayResultName.
             */
            public Builder displayResultName(String displayResultName) {
                this.displayResultName = displayResultName;
                return this;
            }

            /**
             * <p>The time when the scheduled task ended.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-01-21T02:00:45Z</p>
             */
            public Builder finishTime(String finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * Retryable.
             */
            public Builder retryable(Boolean retryable) {
                this.retryable = retryable;
                return this;
            }

            /**
             * <p>The ID of the scheduled task group.</p>
             * 
             * <strong>example:</strong>
             * <p>ccg-xxxx</p>
             */
            public Builder timerGroupId(String timerGroupId) {
                this.timerGroupId = timerGroupId;
                return this;
            }

            /**
             * TimerRecordId.
             */
            public Builder timerRecordId(String timerRecordId) {
                this.timerRecordId = timerRecordId;
                return this;
            }

            /**
             * <p>The execution result of the scheduled task.</p>
             * 
             * <strong>example:</strong>
             * <p>RUNNING</p>
             */
            public Builder timerResult(String timerResult) {
                this.timerResult = timerResult;
                return this;
            }

            /**
             * <p>The type of the scheduled task.</p>
             * 
             * <strong>example:</strong>
             * <p>TimerBoot</p>
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
