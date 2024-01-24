// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeShardTaskInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeShardTaskInfoResponseBody</p>
 */
public class DescribeShardTaskInfoResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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
         * Indicates the data that is returned.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Indicates the unique ID of the request. If the request fails, provide this ID for technical support to troubleshoot the failure.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request is successful.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeShardTaskInfoResponseBody build() {
            return new DescribeShardTaskInfoResponseBody(this);
        } 

    } 

    public static class Full extends TeaModel {
        @NameInMap("Expired")
        private Integer expired;

        @NameInMap("Progress")
        private Integer progress;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("Total")
        private Integer total;

        @NameInMap("Tps")
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
             * Indicates the number of remaining days before the tasks expire.
             */
            public Builder expired(Integer expired) {
                this.expired = expired;
                return this;
            }

            /**
             * Indicates the progress of the tasks.
             */
            public Builder progress(Integer progress) {
                this.progress = progress;
                return this;
            }

            /**
             * Indicates the start time when the tasks are performed.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * Indicates the number of tasks.
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            /**
             * Indicates the number of transactions processed by the database per second.
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
    public static class FullCheck extends TeaModel {
        @NameInMap("Expired")
        private Integer expired;

        @NameInMap("Progress")
        private Integer progress;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("Total")
        private Integer total;

        @NameInMap("Tps")
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
             * Indicates the number of remaining days before the tasks expire.
             */
            public Builder expired(Integer expired) {
                this.expired = expired;
                return this;
            }

            /**
             * Indicates the progress of the tasks.
             */
            public Builder progress(Integer progress) {
                this.progress = progress;
                return this;
            }

            /**
             * Indicates the start time when the tasks are performed.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * Indicates the number of tasks.
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            /**
             * Indicates the number of transactions processed by the database per second.
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
    public static class FullRevise extends TeaModel {
        @NameInMap("Expired")
        private Integer expired;

        @NameInMap("Progress")
        private Integer progress;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("Total")
        private Integer total;

        @NameInMap("Tps")
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
             * Indicates the number of remaining days before the tasks expire.
             */
            public Builder expired(Integer expired) {
                this.expired = expired;
                return this;
            }

            /**
             * Indicates the progress of the tasks.
             */
            public Builder progress(Integer progress) {
                this.progress = progress;
                return this;
            }

            /**
             * Indicates the start time when the tasks are performed.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * Indicates the number of tasks.
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            /**
             * Indicates the number of transactions processed by the database per second.
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
    public static class Increment extends TeaModel {
        @NameInMap("Delay")
        private Integer delay;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("Tps")
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
             * Indicates the latency of the incremental data synchronization.
             */
            public Builder delay(Integer delay) {
                this.delay = delay;
                return this;
            }

            /**
             * Indicates the start time when the incremental data synchronization is performed.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * Indicates the number of transactions processed by the database per second.
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
    public static class Review extends TeaModel {
        @NameInMap("Expired")
        private Integer expired;

        @NameInMap("Progress")
        private Integer progress;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("Total")
        private Integer total;

        @NameInMap("Tps")
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
             * Indicates the number of remaining days before the tasks expire.
             */
            public Builder expired(Integer expired) {
                this.expired = expired;
                return this;
            }

            /**
             * Indicates the progress of the tasks.
             */
            public Builder progress(Integer progress) {
                this.progress = progress;
                return this;
            }

            /**
             * Indicates the start time when the tasks are performed.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * Indicates the number of tasks.
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            /**
             * Indicates the number of transactions processed by the database per second.
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
    public static class Data extends TeaModel {
        @NameInMap("Expired")
        private String expired;

        @NameInMap("Full")
        private Full full;

        @NameInMap("FullCheck")
        private FullCheck fullCheck;

        @NameInMap("FullRevise")
        private FullRevise fullRevise;

        @NameInMap("Increment")
        private Increment increment;

        @NameInMap("Progress")
        private String progress;

        @NameInMap("Review")
        private Review review;

        @NameInMap("SourceTableName")
        private String sourceTableName;

        @NameInMap("Stage")
        private String stage;

        @NameInMap("Status")
        private String status;

        @NameInMap("TargetTableName")
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
             * Indicates the number of remaining days before the tasks to shard tables or convert tables expire.
             */
            public Builder expired(String expired) {
                this.expired = expired;
                return this;
            }

            /**
             * Indicates information about full migration tasks.
             */
            public Builder full(Full full) {
                this.full = full;
                return this;
            }

            /**
             * Indicates information about full check tasks.
             */
            public Builder fullCheck(FullCheck fullCheck) {
                this.fullCheck = fullCheck;
                return this;
            }

            /**
             * Indicates information about full correction tasks.
             */
            public Builder fullRevise(FullRevise fullRevise) {
                this.fullRevise = fullRevise;
                return this;
            }

            /**
             * Indicates information about incremental data synchronization.
             */
            public Builder increment(Increment increment) {
                this.increment = increment;
                return this;
            }

            /**
             * Indicates the incremental data synchronization progress.
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * Indicates check tasks.
             */
            public Builder review(Review review) {
                this.review = review;
                return this;
            }

            /**
             * Indicates the name of the table that you convert or shard.
             */
            public Builder sourceTableName(String sourceTableName) {
                this.sourceTableName = sourceTableName;
                return this;
            }

            /**
             * Indicates the current stage of the task.
             */
            public Builder stage(String stage) {
                this.stage = stage;
                return this;
            }

            /**
             * Indicates the state of the tasks to shard tables or convert tables.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Indicates the name of the table after you convert or shard the table.
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
