// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribeBackupLogDownloadLinksResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBackupLogDownloadLinksResponseBody</p>
 */
public class DescribeBackupLogDownloadLinksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BackupLogDownloadLinkItem")
    private java.util.List<BackupLogDownloadLinkItem> backupLogDownloadLinkItem;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeBackupLogDownloadLinksResponseBody(Builder builder) {
        this.backupLogDownloadLinkItem = builder.backupLogDownloadLinkItem;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBackupLogDownloadLinksResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return backupLogDownloadLinkItem
     */
    public java.util.List<BackupLogDownloadLinkItem> getBackupLogDownloadLinkItem() {
        return this.backupLogDownloadLinkItem;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<BackupLogDownloadLinkItem> backupLogDownloadLinkItem; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeBackupLogDownloadLinksResponseBody model) {
            this.backupLogDownloadLinkItem = model.backupLogDownloadLinkItem;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The details of the redo log backups.</p>
         */
        public Builder backupLogDownloadLinkItem(java.util.List<BackupLogDownloadLinkItem> backupLogDownloadLinkItem) {
            this.backupLogDownloadLinkItem = backupLogDownloadLinkItem;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CD35F3-F3-44CA-AFFF-BAF869******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeBackupLogDownloadLinksResponseBody build() {
            return new DescribeBackupLogDownloadLinksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeBackupLogDownloadLinksResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBackupLogDownloadLinksResponseBody</p>
     */
    public static class BackupLogDownloadLinkItem extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BackupLogId")
        private String backupLogId;

        @com.aliyun.core.annotation.NameInMap("DownloadLink")
        private String downloadLink;

        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("IntranetDownloadLink")
        private String intranetDownloadLink;

        @com.aliyun.core.annotation.NameInMap("LinkExpiredTime")
        private String linkExpiredTime;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        private BackupLogDownloadLinkItem(Builder builder) {
            this.backupLogId = builder.backupLogId;
            this.downloadLink = builder.downloadLink;
            this.errorCode = builder.errorCode;
            this.intranetDownloadLink = builder.intranetDownloadLink;
            this.linkExpiredTime = builder.linkExpiredTime;
            this.message = builder.message;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BackupLogDownloadLinkItem create() {
            return builder().build();
        }

        /**
         * @return backupLogId
         */
        public String getBackupLogId() {
            return this.backupLogId;
        }

        /**
         * @return downloadLink
         */
        public String getDownloadLink() {
            return this.downloadLink;
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
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

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        public static final class Builder {
            private String backupLogId; 
            private String downloadLink; 
            private String errorCode; 
            private String intranetDownloadLink; 
            private String linkExpiredTime; 
            private String message; 

            private Builder() {
            } 

            private Builder(BackupLogDownloadLinkItem model) {
                this.backupLogId = model.backupLogId;
                this.downloadLink = model.downloadLink;
                this.errorCode = model.errorCode;
                this.intranetDownloadLink = model.intranetDownloadLink;
                this.linkExpiredTime = model.linkExpiredTime;
                this.message = model.message;
            } 

            /**
             * <p>The ID of the redo log backup.</p>
             * 
             * <strong>example:</strong>
             * <p>78167430</p>
             */
            public Builder backupLogId(String backupLogId) {
                this.backupLogId = backupLogId;
                return this;
            }

            /**
             * <p>The public download link for the redo log backup.</p>
             */
            public Builder downloadLink(String downloadLink) {
                this.downloadLink = downloadLink;
                return this;
            }

            /**
             * <p>The error code for the individual record. Empty if the request is successful.</p>
             * 
             * <strong>example:</strong>
             * <p>BackupLogNotFound</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>The internal network download link for the redo log backup.</p>
             */
            public Builder intranetDownloadLink(String intranetDownloadLink) {
                this.intranetDownloadLink = intranetDownloadLink;
                return this;
            }

            /**
             * <p>The expiration time of the download link in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-10-23T03:00:00Z</p>
             */
            public Builder linkExpiredTime(String linkExpiredTime) {
                this.linkExpiredTime = linkExpiredTime;
                return this;
            }

            /**
             * <p>The error message for the individual record. Empty if the request is successful.</p>
             * 
             * <strong>example:</strong>
             * <p>The specified archived log file does not exist or has been cleaned up.</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            public BackupLogDownloadLinkItem build() {
                return new BackupLogDownloadLinkItem(this);
            } 

        } 

    }
}
