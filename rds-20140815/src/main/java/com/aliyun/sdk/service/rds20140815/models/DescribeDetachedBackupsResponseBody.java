// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDetachedBackupsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDetachedBackupsResponseBody</p>
 */
public class DescribeDetachedBackupsResponseBody extends TeaModel {
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

    private DescribeDetachedBackupsResponseBody(Builder builder) {
        this.items = builder.items;
        this.pageNumber = builder.pageNumber;
        this.pageRecordCount = builder.pageRecordCount;
        this.requestId = builder.requestId;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDetachedBackupsResponseBody create() {
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
         * The queried backup sets.
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * The page number.
         */
        public Builder pageNumber(String pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page.
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
         * The total number of entries returned.
         */
        public Builder totalRecordCount(String totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeDetachedBackupsResponseBody build() {
            return new DescribeDetachedBackupsResponseBody(this);
        } 

    } 

    public static class Backup extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BackupDownloadURL")
        private String backupDownloadURL;

        @com.aliyun.core.annotation.NameInMap("BackupEndTime")
        private String backupEndTime;

        @com.aliyun.core.annotation.NameInMap("BackupId")
        private String backupId;

        @com.aliyun.core.annotation.NameInMap("BackupIntranetDownloadURL")
        private String backupIntranetDownloadURL;

        @com.aliyun.core.annotation.NameInMap("BackupMethod")
        private String backupMethod;

        @com.aliyun.core.annotation.NameInMap("BackupMode")
        private String backupMode;

        @com.aliyun.core.annotation.NameInMap("BackupSize")
        private Long backupSize;

        @com.aliyun.core.annotation.NameInMap("BackupStartTime")
        private String backupStartTime;

        @com.aliyun.core.annotation.NameInMap("BackupStatus")
        private String backupStatus;

        @com.aliyun.core.annotation.NameInMap("BackupType")
        private String backupType;

        @com.aliyun.core.annotation.NameInMap("ConsistentTime")
        private Long consistentTime;

        @com.aliyun.core.annotation.NameInMap("DBInstanceComment")
        private String DBInstanceComment;

        @com.aliyun.core.annotation.NameInMap("DBInstanceId")
        private String DBInstanceId;

        @com.aliyun.core.annotation.NameInMap("HostInstanceID")
        private String hostInstanceID;

        @com.aliyun.core.annotation.NameInMap("IsAvail")
        private Integer isAvail;

        @com.aliyun.core.annotation.NameInMap("MetaStatus")
        private String metaStatus;

        @com.aliyun.core.annotation.NameInMap("StoreStatus")
        private String storeStatus;

        private Backup(Builder builder) {
            this.backupDownloadURL = builder.backupDownloadURL;
            this.backupEndTime = builder.backupEndTime;
            this.backupId = builder.backupId;
            this.backupIntranetDownloadURL = builder.backupIntranetDownloadURL;
            this.backupMethod = builder.backupMethod;
            this.backupMode = builder.backupMode;
            this.backupSize = builder.backupSize;
            this.backupStartTime = builder.backupStartTime;
            this.backupStatus = builder.backupStatus;
            this.backupType = builder.backupType;
            this.consistentTime = builder.consistentTime;
            this.DBInstanceComment = builder.DBInstanceComment;
            this.DBInstanceId = builder.DBInstanceId;
            this.hostInstanceID = builder.hostInstanceID;
            this.isAvail = builder.isAvail;
            this.metaStatus = builder.metaStatus;
            this.storeStatus = builder.storeStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Backup create() {
            return builder().build();
        }

        /**
         * @return backupDownloadURL
         */
        public String getBackupDownloadURL() {
            return this.backupDownloadURL;
        }

        /**
         * @return backupEndTime
         */
        public String getBackupEndTime() {
            return this.backupEndTime;
        }

        /**
         * @return backupId
         */
        public String getBackupId() {
            return this.backupId;
        }

        /**
         * @return backupIntranetDownloadURL
         */
        public String getBackupIntranetDownloadURL() {
            return this.backupIntranetDownloadURL;
        }

        /**
         * @return backupMethod
         */
        public String getBackupMethod() {
            return this.backupMethod;
        }

        /**
         * @return backupMode
         */
        public String getBackupMode() {
            return this.backupMode;
        }

        /**
         * @return backupSize
         */
        public Long getBackupSize() {
            return this.backupSize;
        }

        /**
         * @return backupStartTime
         */
        public String getBackupStartTime() {
            return this.backupStartTime;
        }

        /**
         * @return backupStatus
         */
        public String getBackupStatus() {
            return this.backupStatus;
        }

        /**
         * @return backupType
         */
        public String getBackupType() {
            return this.backupType;
        }

        /**
         * @return consistentTime
         */
        public Long getConsistentTime() {
            return this.consistentTime;
        }

        /**
         * @return DBInstanceComment
         */
        public String getDBInstanceComment() {
            return this.DBInstanceComment;
        }

        /**
         * @return DBInstanceId
         */
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        /**
         * @return hostInstanceID
         */
        public String getHostInstanceID() {
            return this.hostInstanceID;
        }

        /**
         * @return isAvail
         */
        public Integer getIsAvail() {
            return this.isAvail;
        }

        /**
         * @return metaStatus
         */
        public String getMetaStatus() {
            return this.metaStatus;
        }

        /**
         * @return storeStatus
         */
        public String getStoreStatus() {
            return this.storeStatus;
        }

        public static final class Builder {
            private String backupDownloadURL; 
            private String backupEndTime; 
            private String backupId; 
            private String backupIntranetDownloadURL; 
            private String backupMethod; 
            private String backupMode; 
            private Long backupSize; 
            private String backupStartTime; 
            private String backupStatus; 
            private String backupType; 
            private Long consistentTime; 
            private String DBInstanceComment; 
            private String DBInstanceId; 
            private String hostInstanceID; 
            private Integer isAvail; 
            private String metaStatus; 
            private String storeStatus; 

            /**
             * The URL that is used to download the diagnostic report over the Internet. If the diagnostic report cannot be downloaded, an empty string is returned.
             */
            public Builder backupDownloadURL(String backupDownloadURL) {
                this.backupDownloadURL = backupDownloadURL;
                return this;
            }

            /**
             * The end time of the backup task.
             * <p>
             * 
             * The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm*Z format. The time is displayed in UTC.
             */
            public Builder backupEndTime(String backupEndTime) {
                this.backupEndTime = backupEndTime;
                return this;
            }

            /**
             * The ID of the backup set.
             */
            public Builder backupId(String backupId) {
                this.backupId = backupId;
                return this;
            }

            /**
             * The URL that is used to download the log file over an internal network. If the log file cannot be downloaded, an empty string is returned.
             */
            public Builder backupIntranetDownloadURL(String backupIntranetDownloadURL) {
                this.backupIntranetDownloadURL = backupIntranetDownloadURL;
                return this;
            }

            /**
             * The method that is used to generate the data backup file. Valid values:
             * <p>
             * 
             * *   **Logical**: logical backup
             * *   **Physical**: physical backup
             */
            public Builder backupMethod(String backupMethod) {
                this.backupMethod = backupMethod;
                return this;
            }

            /**
             * The backup method. Valid values:
             * <p>
             * 
             * *   **Automated**
             * *   **Manual**
             */
            public Builder backupMode(String backupMode) {
                this.backupMode = backupMode;
                return this;
            }

            /**
             * The backup size. Unit: bytes.
             */
            public Builder backupSize(Long backupSize) {
                this.backupSize = backupSize;
                return this;
            }

            /**
             * The start time of the backup task.
             * <p>
             * 
             * The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm*Z format. The time is displayed in UTC.
             */
            public Builder backupStartTime(String backupStartTime) {
                this.backupStartTime = backupStartTime;
                return this;
            }

            /**
             * The status of the backup set. Valid values:
             * <p>
             * 
             * *   **Success**
             * *   **Failed**
             */
            public Builder backupStatus(String backupStatus) {
                this.backupStatus = backupStatus;
                return this;
            }

            /**
             * The backup type of the backup file. Valid values:
             * <p>
             * 
             * *   **FullBackup**
             * *   **IncrementalBackup**
             */
            public Builder backupType(String backupType) {
                this.backupType = backupType;
                return this;
            }

            /**
             * The point in time at which the data in the backup set is consistent. The return value of this parameter is a timestamp.
             * <p>
             * 
             * >  If the instance runs MySQL 5.6, a timestamp is returned. Otherwise, the value 0 is returned.
             */
            public Builder consistentTime(Long consistentTime) {
                this.consistentTime = consistentTime;
                return this;
            }

            /**
             * The description of the instance.
             */
            public Builder DBInstanceComment(String DBInstanceComment) {
                this.DBInstanceComment = DBInstanceComment;
                return this;
            }

            /**
             * The instance ID.
             */
            public Builder DBInstanceId(String DBInstanceId) {
                this.DBInstanceId = DBInstanceId;
                return this;
            }

            /**
             * The ID of the instance that generates the backup set. This parameter is used to indicate whether the instance that generates the backup set is a primary instance or a secondary instance.
             */
            public Builder hostInstanceID(String hostInstanceID) {
                this.hostInstanceID = hostInstanceID;
                return this;
            }

            /**
             * Indicates whether the backup set is available. Valid values:
             * <p>
             * 
             * *   **0**: The backup set is unavailable.
             * *   **1**: The backup set is available.
             */
            public Builder isAvail(Integer isAvail) {
                this.isAvail = isAvail;
                return this;
            }

            /**
             * The status of the backup set that is used to restore individual databases or tables. Valid values:
             * <p>
             * 
             * *   **OK**: The backup set is normal.
             * *   **LARGE**: The backup set contains an abnormally large number of tables. It cannot be used to restore individual databases or tables.
             * *   **EMPTY**: The backup set is generated from a failed backup task.
             */
            public Builder metaStatus(String metaStatus) {
                this.metaStatus = metaStatus;
                return this;
            }

            /**
             * Indicates whether the data backup file can be deleted. Valid values:
             * <p>
             * 
             * *   **Enabled**
             * *   **Disabled**
             */
            public Builder storeStatus(String storeStatus) {
                this.storeStatus = storeStatus;
                return this;
            }

            public Backup build() {
                return new Backup(this);
            } 

        } 

    }
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Backup")
        private java.util.List < Backup> backup;

        private Items(Builder builder) {
            this.backup = builder.backup;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return backup
         */
        public java.util.List < Backup> getBackup() {
            return this.backup;
        }

        public static final class Builder {
            private java.util.List < Backup> backup; 

            /**
             * Backup.
             */
            public Builder backup(java.util.List < Backup> backup) {
                this.backup = backup;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
