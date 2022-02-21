// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLogBackupsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLogBackupsResponseBody</p>
 */
public class DescribeLogBackupsResponseBody extends TeaModel {
    @NameInMap("Items")
    private java.util.List < Items> items;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("TotalLogSize")
    private Long totalLogSize;

    private DescribeLogBackupsResponseBody(Builder builder) {
        this.items = builder.items;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.totalLogSize = builder.totalLogSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLogBackupsResponseBody create() {
        return builder().build();
    }

    /**
     * @return items
     */
    public java.util.List < Items> getItems() {
        return this.items;
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
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return totalLogSize
     */
    public Long getTotalLogSize() {
        return this.totalLogSize;
    }

    public static final class Builder {
        private java.util.List < Items> items; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 
        private Long totalLogSize; 

        /**
         * Items.
         */
        public Builder items(java.util.List < Items> items) {
            this.items = items;
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
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * TotalLogSize.
         */
        public Builder totalLogSize(Long totalLogSize) {
            this.totalLogSize = totalLogSize;
            return this;
        }

        public DescribeLogBackupsResponseBody build() {
            return new DescribeLogBackupsResponseBody(this);
        } 

    } 

    public static class Items extends TeaModel {
        @NameInMap("BackupId")
        private String backupId;

        @NameInMap("DBInstanceId")
        private String DBInstanceId;

        @NameInMap("LogFileName")
        private String logFileName;

        @NameInMap("LogFileSize")
        private Long logFileSize;

        @NameInMap("LogTime")
        private String logTime;

        @NameInMap("SegmentName")
        private String segmentName;

        private Items(Builder builder) {
            this.backupId = builder.backupId;
            this.DBInstanceId = builder.DBInstanceId;
            this.logFileName = builder.logFileName;
            this.logFileSize = builder.logFileSize;
            this.logTime = builder.logTime;
            this.segmentName = builder.segmentName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return backupId
         */
        public String getBackupId() {
            return this.backupId;
        }

        /**
         * @return DBInstanceId
         */
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        /**
         * @return logFileName
         */
        public String getLogFileName() {
            return this.logFileName;
        }

        /**
         * @return logFileSize
         */
        public Long getLogFileSize() {
            return this.logFileSize;
        }

        /**
         * @return logTime
         */
        public String getLogTime() {
            return this.logTime;
        }

        /**
         * @return segmentName
         */
        public String getSegmentName() {
            return this.segmentName;
        }

        public static final class Builder {
            private String backupId; 
            private String DBInstanceId; 
            private String logFileName; 
            private Long logFileSize; 
            private String logTime; 
            private String segmentName; 

            /**
             * BackupId.
             */
            public Builder backupId(String backupId) {
                this.backupId = backupId;
                return this;
            }

            /**
             * DBInstanceId.
             */
            public Builder DBInstanceId(String DBInstanceId) {
                this.DBInstanceId = DBInstanceId;
                return this;
            }

            /**
             * LogFileName.
             */
            public Builder logFileName(String logFileName) {
                this.logFileName = logFileName;
                return this;
            }

            /**
             * LogFileSize.
             */
            public Builder logFileSize(Long logFileSize) {
                this.logFileSize = logFileSize;
                return this;
            }

            /**
             * LogTime.
             */
            public Builder logTime(String logTime) {
                this.logTime = logTime;
                return this;
            }

            /**
             * SegmentName.
             */
            public Builder segmentName(String segmentName) {
                this.segmentName = segmentName;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
