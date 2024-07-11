// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBackupSummaryResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBackupSummaryResponseBody</p>
 */
public class DescribeBackupSummaryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Full")
    private Full full;

    @com.aliyun.core.annotation.NameInMap("Incr")
    private Incr incr;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeBackupSummaryResponseBody(Builder builder) {
        this.full = builder.full;
        this.incr = builder.incr;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBackupSummaryResponseBody create() {
        return builder().build();
    }

    /**
     * @return full
     */
    public Full getFull() {
        return this.full;
    }

    /**
     * @return incr
     */
    public Incr getIncr() {
        return this.incr;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Full full; 
        private Incr incr; 
        private String requestId; 

        /**
         * Full.
         */
        public Builder full(Full full) {
            this.full = full;
            return this;
        }

        /**
         * Incr.
         */
        public Builder incr(Incr incr) {
            this.incr = incr;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeBackupSummaryResponseBody build() {
            return new DescribeBackupSummaryResponseBody(this);
        } 

    } 

    public static class Record extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DataSize")
        private String dataSize;

        @com.aliyun.core.annotation.NameInMap("FinishTime")
        private String finishTime;

        @com.aliyun.core.annotation.NameInMap("Process")
        private String process;

        @com.aliyun.core.annotation.NameInMap("RecordId")
        private String recordId;

        @com.aliyun.core.annotation.NameInMap("Speed")
        private String speed;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Record(Builder builder) {
            this.createTime = builder.createTime;
            this.dataSize = builder.dataSize;
            this.finishTime = builder.finishTime;
            this.process = builder.process;
            this.recordId = builder.recordId;
            this.speed = builder.speed;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Record create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return dataSize
         */
        public String getDataSize() {
            return this.dataSize;
        }

        /**
         * @return finishTime
         */
        public String getFinishTime() {
            return this.finishTime;
        }

        /**
         * @return process
         */
        public String getProcess() {
            return this.process;
        }

        /**
         * @return recordId
         */
        public String getRecordId() {
            return this.recordId;
        }

        /**
         * @return speed
         */
        public String getSpeed() {
            return this.speed;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String createTime; 
            private String dataSize; 
            private String finishTime; 
            private String process; 
            private String recordId; 
            private String speed; 
            private String status; 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * DataSize.
             */
            public Builder dataSize(String dataSize) {
                this.dataSize = dataSize;
                return this;
            }

            /**
             * FinishTime.
             */
            public Builder finishTime(String finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * Process.
             */
            public Builder process(String process) {
                this.process = process;
                return this;
            }

            /**
             * RecordId.
             */
            public Builder recordId(String recordId) {
                this.recordId = recordId;
                return this;
            }

            /**
             * Speed.
             */
            public Builder speed(String speed) {
                this.speed = speed;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Record build() {
                return new Record(this);
            } 

        } 

    }
    public static class Records extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Record")
        private java.util.List < Record> record;

        private Records(Builder builder) {
            this.record = builder.record;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Records create() {
            return builder().build();
        }

        /**
         * @return record
         */
        public java.util.List < Record> getRecord() {
            return this.record;
        }

        public static final class Builder {
            private java.util.List < Record> record; 

            /**
             * Record.
             */
            public Builder record(java.util.List < Record> record) {
                this.record = record;
                return this;
            }

            public Records build() {
                return new Records(this);
            } 

        } 

    }
    public static class Full extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HasMore")
        private String hasMore;

        @com.aliyun.core.annotation.NameInMap("NextFullBackupDate")
        private String nextFullBackupDate;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("Records")
        private Records records;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Integer total;

        private Full(Builder builder) {
            this.hasMore = builder.hasMore;
            this.nextFullBackupDate = builder.nextFullBackupDate;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.records = builder.records;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Full create() {
            return builder().build();
        }

        /**
         * @return hasMore
         */
        public String getHasMore() {
            return this.hasMore;
        }

        /**
         * @return nextFullBackupDate
         */
        public String getNextFullBackupDate() {
            return this.nextFullBackupDate;
        }

        /**
         * @return pageNumber
         */
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return records
         */
        public Records getRecords() {
            return this.records;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private String hasMore; 
            private String nextFullBackupDate; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Records records; 
            private Integer total; 

            /**
             * HasMore.
             */
            public Builder hasMore(String hasMore) {
                this.hasMore = hasMore;
                return this;
            }

            /**
             * NextFullBackupDate.
             */
            public Builder nextFullBackupDate(String nextFullBackupDate) {
                this.nextFullBackupDate = nextFullBackupDate;
                return this;
            }

            /**
             * PageNumber.
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * Records.
             */
            public Builder records(Records records) {
                this.records = records;
                return this;
            }

            /**
             * Total.
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public Full build() {
                return new Full(this);
            } 

        } 

    }
    public static class Incr extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BackupLogSize")
        private String backupLogSize;

        @com.aliyun.core.annotation.NameInMap("Pos")
        private String pos;

        @com.aliyun.core.annotation.NameInMap("QueueLogNum")
        private String queueLogNum;

        @com.aliyun.core.annotation.NameInMap("RunningLogNum")
        private String runningLogNum;

        @com.aliyun.core.annotation.NameInMap("Speed")
        private String speed;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Incr(Builder builder) {
            this.backupLogSize = builder.backupLogSize;
            this.pos = builder.pos;
            this.queueLogNum = builder.queueLogNum;
            this.runningLogNum = builder.runningLogNum;
            this.speed = builder.speed;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Incr create() {
            return builder().build();
        }

        /**
         * @return backupLogSize
         */
        public String getBackupLogSize() {
            return this.backupLogSize;
        }

        /**
         * @return pos
         */
        public String getPos() {
            return this.pos;
        }

        /**
         * @return queueLogNum
         */
        public String getQueueLogNum() {
            return this.queueLogNum;
        }

        /**
         * @return runningLogNum
         */
        public String getRunningLogNum() {
            return this.runningLogNum;
        }

        /**
         * @return speed
         */
        public String getSpeed() {
            return this.speed;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String backupLogSize; 
            private String pos; 
            private String queueLogNum; 
            private String runningLogNum; 
            private String speed; 
            private String status; 

            /**
             * BackupLogSize.
             */
            public Builder backupLogSize(String backupLogSize) {
                this.backupLogSize = backupLogSize;
                return this;
            }

            /**
             * Pos.
             */
            public Builder pos(String pos) {
                this.pos = pos;
                return this;
            }

            /**
             * QueueLogNum.
             */
            public Builder queueLogNum(String queueLogNum) {
                this.queueLogNum = queueLogNum;
                return this;
            }

            /**
             * RunningLogNum.
             */
            public Builder runningLogNum(String runningLogNum) {
                this.runningLogNum = runningLogNum;
                return this;
            }

            /**
             * Speed.
             */
            public Builder speed(String speed) {
                this.speed = speed;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Incr build() {
                return new Incr(this);
            } 

        } 

    }
}
