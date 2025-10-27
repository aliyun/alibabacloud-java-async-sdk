// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fnf20190315.models;

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
 * {@link DescribeMapRunResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMapRunResponseBody</p>
 */
public class DescribeMapRunResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Concurrency")
    private Long concurrency;

    @com.aliyun.core.annotation.NameInMap("ExecutionName")
    private String executionName;

    @com.aliyun.core.annotation.NameInMap("ItemCounts")
    private ItemCounts itemCounts;

    @com.aliyun.core.annotation.NameInMap("MapRunName")
    private String mapRunName;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StartedTime")
    private String startedTime;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("StoppedTime")
    private String stoppedTime;

    @com.aliyun.core.annotation.NameInMap("ToleratedFailedCount")
    private Long toleratedFailedCount;

    @com.aliyun.core.annotation.NameInMap("ToleratedFailedPercentage")
    private Float toleratedFailedPercentage;

    private DescribeMapRunResponseBody(Builder builder) {
        this.concurrency = builder.concurrency;
        this.executionName = builder.executionName;
        this.itemCounts = builder.itemCounts;
        this.mapRunName = builder.mapRunName;
        this.requestId = builder.requestId;
        this.startedTime = builder.startedTime;
        this.status = builder.status;
        this.stoppedTime = builder.stoppedTime;
        this.toleratedFailedCount = builder.toleratedFailedCount;
        this.toleratedFailedPercentage = builder.toleratedFailedPercentage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMapRunResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return concurrency
     */
    public Long getConcurrency() {
        return this.concurrency;
    }

    /**
     * @return executionName
     */
    public String getExecutionName() {
        return this.executionName;
    }

    /**
     * @return itemCounts
     */
    public ItemCounts getItemCounts() {
        return this.itemCounts;
    }

    /**
     * @return mapRunName
     */
    public String getMapRunName() {
        return this.mapRunName;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return startedTime
     */
    public String getStartedTime() {
        return this.startedTime;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return stoppedTime
     */
    public String getStoppedTime() {
        return this.stoppedTime;
    }

    /**
     * @return toleratedFailedCount
     */
    public Long getToleratedFailedCount() {
        return this.toleratedFailedCount;
    }

    /**
     * @return toleratedFailedPercentage
     */
    public Float getToleratedFailedPercentage() {
        return this.toleratedFailedPercentage;
    }

    public static final class Builder {
        private Long concurrency; 
        private String executionName; 
        private ItemCounts itemCounts; 
        private String mapRunName; 
        private String requestId; 
        private String startedTime; 
        private String status; 
        private String stoppedTime; 
        private Long toleratedFailedCount; 
        private Float toleratedFailedPercentage; 

        private Builder() {
        } 

        private Builder(DescribeMapRunResponseBody model) {
            this.concurrency = model.concurrency;
            this.executionName = model.executionName;
            this.itemCounts = model.itemCounts;
            this.mapRunName = model.mapRunName;
            this.requestId = model.requestId;
            this.startedTime = model.startedTime;
            this.status = model.status;
            this.stoppedTime = model.stoppedTime;
            this.toleratedFailedCount = model.toleratedFailedCount;
            this.toleratedFailedPercentage = model.toleratedFailedPercentage;
        } 

        /**
         * Concurrency.
         */
        public Builder concurrency(Long concurrency) {
            this.concurrency = concurrency;
            return this;
        }

        /**
         * ExecutionName.
         */
        public Builder executionName(String executionName) {
            this.executionName = executionName;
            return this;
        }

        /**
         * ItemCounts.
         */
        public Builder itemCounts(ItemCounts itemCounts) {
            this.itemCounts = itemCounts;
            return this;
        }

        /**
         * MapRunName.
         */
        public Builder mapRunName(String mapRunName) {
            this.mapRunName = mapRunName;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * StartedTime.
         */
        public Builder startedTime(String startedTime) {
            this.startedTime = startedTime;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * StoppedTime.
         */
        public Builder stoppedTime(String stoppedTime) {
            this.stoppedTime = stoppedTime;
            return this;
        }

        /**
         * ToleratedFailedCount.
         */
        public Builder toleratedFailedCount(Long toleratedFailedCount) {
            this.toleratedFailedCount = toleratedFailedCount;
            return this;
        }

        /**
         * ToleratedFailedPercentage.
         */
        public Builder toleratedFailedPercentage(Float toleratedFailedPercentage) {
            this.toleratedFailedPercentage = toleratedFailedPercentage;
            return this;
        }

        public DescribeMapRunResponseBody build() {
            return new DescribeMapRunResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeMapRunResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMapRunResponseBody</p>
     */
    public static class ItemCounts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Aborted")
        private Long aborted;

        @com.aliyun.core.annotation.NameInMap("Failed")
        private Long failed;

        @com.aliyun.core.annotation.NameInMap("Pending")
        private Long pending;

        @com.aliyun.core.annotation.NameInMap("Running")
        private Long running;

        @com.aliyun.core.annotation.NameInMap("Succeed")
        private Long succeed;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        private ItemCounts(Builder builder) {
            this.aborted = builder.aborted;
            this.failed = builder.failed;
            this.pending = builder.pending;
            this.running = builder.running;
            this.succeed = builder.succeed;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ItemCounts create() {
            return builder().build();
        }

        /**
         * @return aborted
         */
        public Long getAborted() {
            return this.aborted;
        }

        /**
         * @return failed
         */
        public Long getFailed() {
            return this.failed;
        }

        /**
         * @return pending
         */
        public Long getPending() {
            return this.pending;
        }

        /**
         * @return running
         */
        public Long getRunning() {
            return this.running;
        }

        /**
         * @return succeed
         */
        public Long getSucceed() {
            return this.succeed;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private Long aborted; 
            private Long failed; 
            private Long pending; 
            private Long running; 
            private Long succeed; 
            private Long total; 

            private Builder() {
            } 

            private Builder(ItemCounts model) {
                this.aborted = model.aborted;
                this.failed = model.failed;
                this.pending = model.pending;
                this.running = model.running;
                this.succeed = model.succeed;
                this.total = model.total;
            } 

            /**
             * Aborted.
             */
            public Builder aborted(Long aborted) {
                this.aborted = aborted;
                return this;
            }

            /**
             * Failed.
             */
            public Builder failed(Long failed) {
                this.failed = failed;
                return this;
            }

            /**
             * Pending.
             */
            public Builder pending(Long pending) {
                this.pending = pending;
                return this;
            }

            /**
             * Running.
             */
            public Builder running(Long running) {
                this.running = running;
                return this;
            }

            /**
             * Succeed.
             */
            public Builder succeed(Long succeed) {
                this.succeed = succeed;
                return this;
            }

            /**
             * Total.
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public ItemCounts build() {
                return new ItemCounts(this);
            } 

        } 

    }
}
