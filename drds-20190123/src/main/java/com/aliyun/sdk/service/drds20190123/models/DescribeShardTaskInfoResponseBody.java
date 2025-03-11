// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

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
 * {@link DescribeShardTaskInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeShardTaskInfoResponseBody</p>
 */
public class DescribeShardTaskInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeShardTaskInfoResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeShardTaskInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>Indicates the data that is returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Indicates the unique ID of the request. If the request fails, provide this ID for technical support to troubleshoot the failure.</p>
         * 
         * <strong>example:</strong>
         * <p>5D64DE5944A1E541E0CB908A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeShardTaskInfoResponseBody build() {
            return new DescribeShardTaskInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeShardTaskInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeShardTaskInfoResponseBody</p>
     */
    public static class Full extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Expired")
        private Integer expired;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private Integer progress;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Integer total;

        @com.aliyun.core.annotation.NameInMap("Tps")
        private Integer tps;

        private Full(Builder builder) {
            this.expired = builder.expired;
            this.progress = builder.progress;
            this.startTime = builder.startTime;
            this.total = builder.total;
            this.tps = builder.tps;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Full create() {
            return builder().build();
        }

        /**
         * @return expired
         */
        public Integer getExpired() {
            return this.expired;
        }

        /**
         * @return progress
         */
        public Integer getProgress() {
            return this.progress;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        /**
         * @return tps
         */
        public Integer getTps() {
            return this.tps;
        }

        public static final class Builder {
            private Integer expired; 
            private Integer progress; 
            private String startTime; 
            private Integer total; 
            private Integer tps; 

            /**
             * <p>Indicates the number of remaining days before the tasks expire.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder expired(Integer expired) {
                this.expired = expired;
                return this;
            }

            /**
             * <p>Indicates the progress of the tasks.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder progress(Integer progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>Indicates the start time when the tasks are performed.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-09-16 15:11:53</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>Indicates the number of tasks.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            /**
             * <p>Indicates the number of transactions processed by the database per second.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder tps(Integer tps) {
                this.tps = tps;
                return this;
            }

            public Full build() {
                return new Full(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeShardTaskInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeShardTaskInfoResponseBody</p>
     */
    public static class FullCheck extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Expired")
        private Integer expired;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private Integer progress;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Integer total;

        @com.aliyun.core.annotation.NameInMap("Tps")
        private Integer tps;

        private FullCheck(Builder builder) {
            this.expired = builder.expired;
            this.progress = builder.progress;
            this.startTime = builder.startTime;
            this.total = builder.total;
            this.tps = builder.tps;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FullCheck create() {
            return builder().build();
        }

        /**
         * @return expired
         */
        public Integer getExpired() {
            return this.expired;
        }

        /**
         * @return progress
         */
        public Integer getProgress() {
            return this.progress;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        /**
         * @return tps
         */
        public Integer getTps() {
            return this.tps;
        }

        public static final class Builder {
            private Integer expired; 
            private Integer progress; 
            private String startTime; 
            private Integer total; 
            private Integer tps; 

            /**
             * <p>Indicates the number of remaining days before the tasks expire.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder expired(Integer expired) {
                this.expired = expired;
                return this;
            }

            /**
             * <p>Indicates the progress of the tasks.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder progress(Integer progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>Indicates the start time when the tasks are performed.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-09-16 15:12:53</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>Indicates the number of tasks.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            /**
             * <p>Indicates the number of transactions processed by the database per second.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder tps(Integer tps) {
                this.tps = tps;
                return this;
            }

            public FullCheck build() {
                return new FullCheck(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeShardTaskInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeShardTaskInfoResponseBody</p>
     */
    public static class FullRevise extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Expired")
        private Integer expired;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private Integer progress;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Integer total;

        @com.aliyun.core.annotation.NameInMap("Tps")
        private Integer tps;

        private FullRevise(Builder builder) {
            this.expired = builder.expired;
            this.progress = builder.progress;
            this.startTime = builder.startTime;
            this.total = builder.total;
            this.tps = builder.tps;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FullRevise create() {
            return builder().build();
        }

        /**
         * @return expired
         */
        public Integer getExpired() {
            return this.expired;
        }

        /**
         * @return progress
         */
        public Integer getProgress() {
            return this.progress;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        /**
         * @return tps
         */
        public Integer getTps() {
            return this.tps;
        }

        public static final class Builder {
            private Integer expired; 
            private Integer progress; 
            private String startTime; 
            private Integer total; 
            private Integer tps; 

            /**
             * <p>Indicates the number of remaining days before the tasks expire.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder expired(Integer expired) {
                this.expired = expired;
                return this;
            }

            /**
             * <p>Indicates the progress of the tasks.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder progress(Integer progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>Indicates the start time when the tasks are performed.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-09-16 15:12:53</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>Indicates the number of tasks.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            /**
             * <p>Indicates the number of transactions processed by the database per second.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder tps(Integer tps) {
                this.tps = tps;
                return this;
            }

            public FullRevise build() {
                return new FullRevise(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeShardTaskInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeShardTaskInfoResponseBody</p>
     */
    public static class Increment extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Delay")
        private Integer delay;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Tps")
        private Integer tps;

        private Increment(Builder builder) {
            this.delay = builder.delay;
            this.startTime = builder.startTime;
            this.tps = builder.tps;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Increment create() {
            return builder().build();
        }

        /**
         * @return delay
         */
        public Integer getDelay() {
            return this.delay;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return tps
         */
        public Integer getTps() {
            return this.tps;
        }

        public static final class Builder {
            private Integer delay; 
            private String startTime; 
            private Integer tps; 

            /**
             * <p>Indicates the latency of the incremental data synchronization.</p>
             * 
             * <strong>example:</strong>
             * <p>1568617906</p>
             */
            public Builder delay(Integer delay) {
                this.delay = delay;
                return this;
            }

            /**
             * <p>Indicates the start time when the incremental data synchronization is performed.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-09-16 15:12:53</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>Indicates the number of transactions processed by the database per second.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder tps(Integer tps) {
                this.tps = tps;
                return this;
            }

            public Increment build() {
                return new Increment(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeShardTaskInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeShardTaskInfoResponseBody</p>
     */
    public static class Review extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Expired")
        private Integer expired;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private Integer progress;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Integer total;

        @com.aliyun.core.annotation.NameInMap("Tps")
        private Integer tps;

        private Review(Builder builder) {
            this.expired = builder.expired;
            this.progress = builder.progress;
            this.startTime = builder.startTime;
            this.total = builder.total;
            this.tps = builder.tps;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Review create() {
            return builder().build();
        }

        /**
         * @return expired
         */
        public Integer getExpired() {
            return this.expired;
        }

        /**
         * @return progress
         */
        public Integer getProgress() {
            return this.progress;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        /**
         * @return tps
         */
        public Integer getTps() {
            return this.tps;
        }

        public static final class Builder {
            private Integer expired; 
            private Integer progress; 
            private String startTime; 
            private Integer total; 
            private Integer tps; 

            /**
             * <p>Indicates the number of remaining days before the tasks expire.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder expired(Integer expired) {
                this.expired = expired;
                return this;
            }

            /**
             * <p>Indicates the progress of the tasks.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder progress(Integer progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>Indicates the start time when the tasks are performed.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-09-16 15:12:53</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>Indicates the number of tasks.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            /**
             * <p>Indicates the number of transactions processed by the database per second.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder tps(Integer tps) {
                this.tps = tps;
                return this;
            }

            public Review build() {
                return new Review(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeShardTaskInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeShardTaskInfoResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Expired")
        private String expired;

        @com.aliyun.core.annotation.NameInMap("Full")
        private Full full;

        @com.aliyun.core.annotation.NameInMap("FullCheck")
        private FullCheck fullCheck;

        @com.aliyun.core.annotation.NameInMap("FullRevise")
        private FullRevise fullRevise;

        @com.aliyun.core.annotation.NameInMap("Increment")
        private Increment increment;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private String progress;

        @com.aliyun.core.annotation.NameInMap("Review")
        private Review review;

        @com.aliyun.core.annotation.NameInMap("SourceTableName")
        private String sourceTableName;

        @com.aliyun.core.annotation.NameInMap("Stage")
        private String stage;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TargetTableName")
        private String targetTableName;

        private Data(Builder builder) {
            this.expired = builder.expired;
            this.full = builder.full;
            this.fullCheck = builder.fullCheck;
            this.fullRevise = builder.fullRevise;
            this.increment = builder.increment;
            this.progress = builder.progress;
            this.review = builder.review;
            this.sourceTableName = builder.sourceTableName;
            this.stage = builder.stage;
            this.status = builder.status;
            this.targetTableName = builder.targetTableName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return expired
         */
        public String getExpired() {
            return this.expired;
        }

        /**
         * @return full
         */
        public Full getFull() {
            return this.full;
        }

        /**
         * @return fullCheck
         */
        public FullCheck getFullCheck() {
            return this.fullCheck;
        }

        /**
         * @return fullRevise
         */
        public FullRevise getFullRevise() {
            return this.fullRevise;
        }

        /**
         * @return increment
         */
        public Increment getIncrement() {
            return this.increment;
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        /**
         * @return review
         */
        public Review getReview() {
            return this.review;
        }

        /**
         * @return sourceTableName
         */
        public String getSourceTableName() {
            return this.sourceTableName;
        }

        /**
         * @return stage
         */
        public String getStage() {
            return this.stage;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return targetTableName
         */
        public String getTargetTableName() {
            return this.targetTableName;
        }

        public static final class Builder {
            private String expired; 
            private Full full; 
            private FullCheck fullCheck; 
            private FullRevise fullRevise; 
            private Increment increment; 
            private String progress; 
            private Review review; 
            private String sourceTableName; 
            private String stage; 
            private String status; 
            private String targetTableName; 

            /**
             * <p>Indicates the number of remaining days before the tasks to shard tables or convert tables expire.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder expired(String expired) {
                this.expired = expired;
                return this;
            }

            /**
             * <p>Indicates information about full migration tasks.</p>
             */
            public Builder full(Full full) {
                this.full = full;
                return this;
            }

            /**
             * <p>Indicates information about full check tasks.</p>
             */
            public Builder fullCheck(FullCheck fullCheck) {
                this.fullCheck = fullCheck;
                return this;
            }

            /**
             * <p>Indicates information about full correction tasks.</p>
             */
            public Builder fullRevise(FullRevise fullRevise) {
                this.fullRevise = fullRevise;
                return this;
            }

            /**
             * <p>Indicates information about incremental data synchronization.</p>
             */
            public Builder increment(Increment increment) {
                this.increment = increment;
                return this;
            }

            /**
             * <p>Indicates the incremental data synchronization progress.</p>
             * 
             * <strong>example:</strong>
             * <p>70</p>
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>Indicates check tasks.</p>
             */
            public Builder review(Review review) {
                this.review = review;
                return this;
            }

            /**
             * <p>Indicates the name of the table that you convert or shard.</p>
             * 
             * <strong>example:</strong>
             * <p>a1</p>
             */
            public Builder sourceTableName(String sourceTableName) {
                this.sourceTableName = sourceTableName;
                return this;
            }

            /**
             * <p>Indicates the current stage of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder stage(String stage) {
                this.stage = stage;
                return this;
            }

            /**
             * <p>Indicates the state of the tasks to shard tables or convert tables.</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Indicates the name of the table after you convert or shard the table.</p>
             * 
             * <strong>example:</strong>
             * <p>a2</p>
             */
            public Builder targetTableName(String targetTableName) {
                this.targetTableName = targetTableName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
