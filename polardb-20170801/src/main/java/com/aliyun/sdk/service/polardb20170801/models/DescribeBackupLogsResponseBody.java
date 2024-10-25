// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The details of the backup logs.</p>
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(String pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder pageRecordCount(String pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ADAC63DB-0691-4ECE-949A-FAEA68******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of returned entries.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalRecordCount(String totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeBackupLogsResponseBody build() {
            return new DescribeBackupLogsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeBackupLogsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBackupLogsResponseBody</p>
     */
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
             * <p>The time when the backup task ended. The time follows the ISO 8601 standard in the <code>YYYY-MM-DD\&quot;T\&quot;HH:mm:ssZ</code> format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-02-12T03:55:31Z</p>
             */
            public Builder backupLogEndTime(String backupLogEndTime) {
                this.backupLogEndTime = backupLogEndTime;
                return this;
            }

            /**
             * <p>The ID of the backup log.</p>
             * 
             * <strong>example:</strong>
             * <p>1111111111</p>
             */
            public Builder backupLogId(String backupLogId) {
                this.backupLogId = backupLogId;
                return this;
            }

            /**
             * <p>The name of the backup log.</p>
             * 
             * <strong>example:</strong>
             * <p>ib_logfile1</p>
             */
            public Builder backupLogName(String backupLogName) {
                this.backupLogName = backupLogName;
                return this;
            }

            /**
             * <p>The size of the backup log. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>1073741824</p>
             */
            public Builder backupLogSize(String backupLogSize) {
                this.backupLogSize = backupLogSize;
                return this;
            }

            /**
             * <p>The time when the backup task started. The time follows the ISO 8601 standard in the <code>YYYY-MM-DD\&quot;T\&quot;HH:mm:ssZ</code> format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-02-12T03:54:43Z</p>
             */
            public Builder backupLogStartTime(String backupLogStartTime) {
                this.backupLogStartTime = backupLogStartTime;
                return this;
            }

            /**
             * <p>The public URL used to download the backup log.</p>
             * 
             * <strong>example:</strong>
             * <p>http://***********.oss-cn-hangzhou.aliyuncs.com</p>
             */
            public Builder downloadLink(String downloadLink) {
                this.downloadLink = downloadLink;
                return this;
            }

            /**
             * <p>The internal URL used to download the backup log.</p>
             * 
             * <strong>example:</strong>
             * <p>http://***********.oss-cn-hangzhou-internal.aliyuncs.com</p>
             */
            public Builder intranetDownloadLink(String intranetDownloadLink) {
                this.intranetDownloadLink = intranetDownloadLink;
                return this;
            }

            /**
             * <p>The time when the download URL expires.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-02-14T08:40:50Z</p>
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
    /**
     * 
     * {@link DescribeBackupLogsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBackupLogsResponseBody</p>
     */
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
