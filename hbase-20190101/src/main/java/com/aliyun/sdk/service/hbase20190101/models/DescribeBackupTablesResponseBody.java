// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

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
 * {@link DescribeBackupTablesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBackupTablesResponseBody</p>
 */
public class DescribeBackupTablesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BackupRecords")
    private BackupRecords backupRecords;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Tables")
    private Tables tables;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Long total;

    private DescribeBackupTablesResponseBody(Builder builder) {
        this.backupRecords = builder.backupRecords;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.tables = builder.tables;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBackupTablesResponseBody create() {
        return builder().build();
    }

    /**
     * @return backupRecords
     */
    public BackupRecords getBackupRecords() {
        return this.backupRecords;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return tables
     */
    public Tables getTables() {
        return this.tables;
    }

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private BackupRecords backupRecords; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Tables tables; 
        private Long total; 

        /**
         * BackupRecords.
         */
        public Builder backupRecords(BackupRecords backupRecords) {
            this.backupRecords = backupRecords;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Tables.
         */
        public Builder tables(Tables tables) {
            this.tables = tables;
            return this;
        }

        /**
         * Total.
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public DescribeBackupTablesResponseBody build() {
            return new DescribeBackupTablesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeBackupTablesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBackupTablesResponseBody</p>
     */
    public static class BackupRecord extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataSize")
        private String dataSize;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Process")
        private String process;

        @com.aliyun.core.annotation.NameInMap("Speed")
        private String speed;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("Table")
        private String table;

        private BackupRecord(Builder builder) {
            this.dataSize = builder.dataSize;
            this.endTime = builder.endTime;
            this.message = builder.message;
            this.process = builder.process;
            this.speed = builder.speed;
            this.startTime = builder.startTime;
            this.state = builder.state;
            this.table = builder.table;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BackupRecord create() {
            return builder().build();
        }

        /**
         * @return dataSize
         */
        public String getDataSize() {
            return this.dataSize;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return process
         */
        public String getProcess() {
            return this.process;
        }

        /**
         * @return speed
         */
        public String getSpeed() {
            return this.speed;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return table
         */
        public String getTable() {
            return this.table;
        }

        public static final class Builder {
            private String dataSize; 
            private String endTime; 
            private String message; 
            private String process; 
            private String speed; 
            private String startTime; 
            private String state; 
            private String table; 

            /**
             * DataSize.
             */
            public Builder dataSize(String dataSize) {
                this.dataSize = dataSize;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * Message.
             */
            public Builder message(String message) {
                this.message = message;
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
             * Speed.
             */
            public Builder speed(String speed) {
                this.speed = speed;
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
             * State.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * Table.
             */
            public Builder table(String table) {
                this.table = table;
                return this;
            }

            public BackupRecord build() {
                return new BackupRecord(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeBackupTablesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBackupTablesResponseBody</p>
     */
    public static class BackupRecords extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BackupRecord")
        private java.util.List<BackupRecord> backupRecord;

        private BackupRecords(Builder builder) {
            this.backupRecord = builder.backupRecord;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BackupRecords create() {
            return builder().build();
        }

        /**
         * @return backupRecord
         */
        public java.util.List<BackupRecord> getBackupRecord() {
            return this.backupRecord;
        }

        public static final class Builder {
            private java.util.List<BackupRecord> backupRecord; 

            /**
             * BackupRecord.
             */
            public Builder backupRecord(java.util.List<BackupRecord> backupRecord) {
                this.backupRecord = backupRecord;
                return this;
            }

            public BackupRecords build() {
                return new BackupRecords(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeBackupTablesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBackupTablesResponseBody</p>
     */
    public static class Tables extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Table")
        private java.util.List<String> table;

        private Tables(Builder builder) {
            this.table = builder.table;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tables create() {
            return builder().build();
        }

        /**
         * @return table
         */
        public java.util.List<String> getTable() {
            return this.table;
        }

        public static final class Builder {
            private java.util.List<String> table; 

            /**
             * Table.
             */
            public Builder table(java.util.List<String> table) {
                this.table = table;
                return this;
            }

            public Tables build() {
                return new Tables(this);
            } 

        } 

    }
}
