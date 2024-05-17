// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBackupLogsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBackupLogsResponseBody</p>
 */
public class DescribeBackupLogsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private Items items;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private String pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageRecordCount")
    private String pageRecordCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalRecordCount")
    private String totalRecordCount;

    private DescribeBackupLogsResponseBody(Builder builder) {
        this.items = builder.items;
        this.pageNumber = builder.pageNumber;
        this.pageRecordCount = builder.pageRecordCount;
        this.requestId = builder.requestId;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBackupLogsResponseBody create() {
        return builder().build();
    }

    /**
     * @return items
     */
    public Items getItems() {
        return this.items;
    }

    /**
     * @return pageNumber
     */
    public String getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageRecordCount
     */
    public String getPageRecordCount() {
        return this.pageRecordCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalRecordCount
     */
    public String getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static final class Builder {
        private Items items; 
        private String pageNumber; 
        private String pageRecordCount; 
        private String requestId; 
        private String totalRecordCount; 

        /**
         * The details of the backup logs.
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * The page number of the returned page.
         */
        public Builder pageNumber(String pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder pageRecordCount(String pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of returned entries.
         */
        public Builder totalRecordCount(String totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeBackupLogsResponseBody build() {
            return new DescribeBackupLogsResponseBody(this);
        } 

    } 

    public static class BackupLog extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BackupLogEndTime")
        private String backupLogEndTime;

        @com.aliyun.core.annotation.NameInMap("BackupLogId")
        private String backupLogId;

        @com.aliyun.core.annotation.NameInMap("BackupLogName")
        private String backupLogName;

        @com.aliyun.core.annotation.NameInMap("BackupLogSize")
        private String backupLogSize;

        @com.aliyun.core.annotation.NameInMap("BackupLogStartTime")
        private String backupLogStartTime;

        @com.aliyun.core.annotation.NameInMap("DownloadLink")
        private String downloadLink;

        @com.aliyun.core.annotation.NameInMap("IntranetDownloadLink")
        private String intranetDownloadLink;

        @com.aliyun.core.annotation.NameInMap("LinkExpiredTime")
        private String linkExpiredTime;

        private BackupLog(Builder builder) {
            this.backupLogEndTime = builder.backupLogEndTime;
            this.backupLogId = builder.backupLogId;
            this.backupLogName = builder.backupLogName;
            this.backupLogSize = builder.backupLogSize;
            this.backupLogStartTime = builder.backupLogStartTime;
            this.downloadLink = builder.downloadLink;
            this.intranetDownloadLink = builder.intranetDownloadLink;
            this.linkExpiredTime = builder.linkExpiredTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BackupLog create() {
            return builder().build();
        }

        /**
         * @return backupLogEndTime
         */
        public String getBackupLogEndTime() {
            return this.backupLogEndTime;
        }

        /**
         * @return backupLogId
         */
        public String getBackupLogId() {
            return this.backupLogId;
        }

        /**
         * @return backupLogName
         */
        public String getBackupLogName() {
            return this.backupLogName;
        }

        /**
         * @return backupLogSize
         */
        public String getBackupLogSize() {
            return this.backupLogSize;
        }

        /**
         * @return backupLogStartTime
         */
        public String getBackupLogStartTime() {
            return this.backupLogStartTime;
        }

        /**
         * @return downloadLink
         */
        public String getDownloadLink() {
            return this.downloadLink;
        }

        /**
         * @return intranetDownloadLink
         */
        public String getIntranetDownloadLink() {
            return this.intranetDownloadLink;
        }

        /**
         * @return linkExpiredTime
         */
        public String getLinkExpiredTime() {
            return this.linkExpiredTime;
        }

        public static final class Builder {
            private String backupLogEndTime; 
            private String backupLogId; 
            private String backupLogName; 
            private String backupLogSize; 
            private String backupLogStartTime; 
            private String downloadLink; 
            private String intranetDownloadLink; 
            private String linkExpiredTime; 

            /**
             * The time when the backup task ended. The time follows the ISO 8601 standard in the `YYYY-MM-DD\"T\"HH:mm:ssZ` format. The time is displayed in UTC.
             */
            public Builder backupLogEndTime(String backupLogEndTime) {
                this.backupLogEndTime = backupLogEndTime;
                return this;
            }

            /**
             * The ID of the backup log.
             */
            public Builder backupLogId(String backupLogId) {
                this.backupLogId = backupLogId;
                return this;
            }

            /**
             * The name of the backup log.
             */
            public Builder backupLogName(String backupLogName) {
                this.backupLogName = backupLogName;
                return this;
            }

            /**
             * The size of the backup log. Unit: bytes.
             */
            public Builder backupLogSize(String backupLogSize) {
                this.backupLogSize = backupLogSize;
                return this;
            }

            /**
             * The time when the backup task started. The time follows the ISO 8601 standard in the `YYYY-MM-DD\"T\"HH:mm:ssZ` format. The time is displayed in UTC.
             */
            public Builder backupLogStartTime(String backupLogStartTime) {
                this.backupLogStartTime = backupLogStartTime;
                return this;
            }

            /**
             * The public URL used to download the backup log.
             */
            public Builder downloadLink(String downloadLink) {
                this.downloadLink = downloadLink;
                return this;
            }

            /**
             * The internal URL used to download the backup log.
             */
            public Builder intranetDownloadLink(String intranetDownloadLink) {
                this.intranetDownloadLink = intranetDownloadLink;
                return this;
            }

            /**
             * The time when the download URL expires.
             */
            public Builder linkExpiredTime(String linkExpiredTime) {
                this.linkExpiredTime = linkExpiredTime;
                return this;
            }

            public BackupLog build() {
                return new BackupLog(this);
            } 

        } 

    }
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BackupLog")
        private java.util.List < BackupLog> backupLog;

        private Items(Builder builder) {
            this.backupLog = builder.backupLog;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return backupLog
         */
        public java.util.List < BackupLog> getBackupLog() {
            return this.backupLog;
        }

        public static final class Builder {
            private java.util.List < BackupLog> backupLog; 

            /**
             * BackupLog.
             */
            public Builder backupLog(java.util.List < BackupLog> backupLog) {
                this.backupLog = backupLog;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
