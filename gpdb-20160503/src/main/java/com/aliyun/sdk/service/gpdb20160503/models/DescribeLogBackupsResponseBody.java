// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
 * {@link DescribeLogBackupsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLogBackupsResponseBody</p>
 */
public class DescribeLogBackupsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("TotalLogSize")
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
    public java.util.List<Items> getItems() {
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
        private java.util.List<Items> items; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 
        private Long totalLogSize; 

        /**
         * <p>Details of the backup sets.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of backup sets on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>24B9FCAF-2CBC-51C3-B563-F1C70D750187</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>The total size of logs in the time range. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>386748</p>
         */
        public Builder totalLogSize(Long totalLogSize) {
            this.totalLogSize = totalLogSize;
            return this;
        }

        public DescribeLogBackupsResponseBody build() {
            return new DescribeLogBackupsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLogBackupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLogBackupsResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BackupId")
        private String backupId;

        @com.aliyun.core.annotation.NameInMap("DBInstanceId")
        private String DBInstanceId;

        @com.aliyun.core.annotation.NameInMap("LogFileName")
        private String logFileName;

        @com.aliyun.core.annotation.NameInMap("LogFileSize")
        private Long logFileSize;

        @com.aliyun.core.annotation.NameInMap("LogTime")
        private String logTime;

        @com.aliyun.core.annotation.NameInMap("SegmentName")
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
             * <p>The ID of the backup set.</p>
             * 
             * <strong>example:</strong>
             * <p>12413721782</p>
             */
            public Builder backupId(String backupId) {
                this.backupId = backupId;
                return this;
            }

            /**
             * <p>The ID of the coordinator node.</p>
             * 
             * <strong>example:</strong>
             * <p>gp-bp12ga6v69h86****-master</p>
             */
            public Builder DBInstanceId(String DBInstanceId) {
                this.DBInstanceId = DBInstanceId;
                return this;
            }

            /**
             * <p>The name of the log backup set that is stored in Object Storage Service (OSS).</p>
             * 
             * <strong>example:</strong>
             * <p>000000010000000400000012</p>
             */
            public Builder logFileName(String logFileName) {
                this.logFileName = logFileName;
                return this;
            }

            /**
             * <p>The size of the log backup set. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>77350</p>
             */
            public Builder logFileSize(Long logFileSize) {
                this.logFileSize = logFileSize;
                return this;
            }

            /**
             * <p>The timestamp of the log.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-12-12T02:14:26Z</p>
             */
            public Builder logTime(String logTime) {
                this.logTime = logTime;
                return this;
            }

            /**
             * <p>The name of the compute node.</p>
             * 
             * <strong>example:</strong>
             * <p>segment-0</p>
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
