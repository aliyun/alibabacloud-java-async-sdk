// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBackupLogsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBackupLogsResponseBody</p>
 */
public class DescribeBackupLogsResponseBody extends TeaModel {
    @NameInMap("Items")
    private Items items;

    @NameInMap("PageNumber")
    private String pageNumber;

    @NameInMap("PageRecordCount")
    private String pageRecordCount;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalRecordCount")
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
         * Items.
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(String pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageRecordCount.
         */
        public Builder pageRecordCount(String pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
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
         * TotalRecordCount.
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
        @NameInMap("BackupLogEndTime")
        private String backupLogEndTime;

        @NameInMap("BackupLogId")
        private String backupLogId;

        @NameInMap("BackupLogName")
        private String backupLogName;

        @NameInMap("BackupLogSize")
        private String backupLogSize;

        @NameInMap("BackupLogStartTime")
        private String backupLogStartTime;

        @NameInMap("DownloadLink")
        private String downloadLink;

        @NameInMap("IntranetDownloadLink")
        private String intranetDownloadLink;

        @NameInMap("LinkExpiredTime")
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
             * BackupLogEndTime.
             */
            public Builder backupLogEndTime(String backupLogEndTime) {
                this.backupLogEndTime = backupLogEndTime;
                return this;
            }

            /**
             * BackupLogId.
             */
            public Builder backupLogId(String backupLogId) {
                this.backupLogId = backupLogId;
                return this;
            }

            /**
             * BackupLogName.
             */
            public Builder backupLogName(String backupLogName) {
                this.backupLogName = backupLogName;
                return this;
            }

            /**
             * BackupLogSize.
             */
            public Builder backupLogSize(String backupLogSize) {
                this.backupLogSize = backupLogSize;
                return this;
            }

            /**
             * BackupLogStartTime.
             */
            public Builder backupLogStartTime(String backupLogStartTime) {
                this.backupLogStartTime = backupLogStartTime;
                return this;
            }

            /**
             * DownloadLink.
             */
            public Builder downloadLink(String downloadLink) {
                this.downloadLink = downloadLink;
                return this;
            }

            /**
             * IntranetDownloadLink.
             */
            public Builder intranetDownloadLink(String intranetDownloadLink) {
                this.intranetDownloadLink = intranetDownloadLink;
                return this;
            }

            /**
             * LinkExpiredTime.
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
        @NameInMap("BackupLog")
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
