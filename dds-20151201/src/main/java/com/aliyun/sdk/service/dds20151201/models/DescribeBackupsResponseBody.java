// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBackupsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBackupsResponseBody</p>
 */
public class DescribeBackupsResponseBody extends TeaModel {
    @NameInMap("Backups")
    private Backups backups;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeBackupsResponseBody(Builder builder) {
        this.backups = builder.backups;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBackupsResponseBody create() {
        return builder().build();
    }

    /**
     * @return backups
     */
    public Backups getBackups() {
        return this.backups;
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

    public static final class Builder {
        private Backups backups; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The details of the backup sets.
         */
        public Builder backups(Backups backups) {
            this.backups = backups;
            return this;
        }

        /**
         * The page number of the returned page.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned per page. Valid values:
         * <p>
         * 
         * *   **30** (default)
         * *   **50**
         * *   **100**
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * The total number of backup sets.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeBackupsResponseBody build() {
            return new DescribeBackupsResponseBody(this);
        } 

    } 

    public static class Backup extends TeaModel {
        @NameInMap("BackupDBNames")
        private String backupDBNames;

        @NameInMap("BackupDownloadURL")
        private String backupDownloadURL;

        @NameInMap("BackupEndTime")
        private String backupEndTime;

        @NameInMap("BackupId")
        private String backupId;

        @NameInMap("BackupIntranetDownloadURL")
        private String backupIntranetDownloadURL;

        @NameInMap("BackupJobId")
        private String backupJobId;

        @NameInMap("BackupMethod")
        private String backupMethod;

        @NameInMap("BackupMode")
        private String backupMode;

        @NameInMap("BackupSize")
        private Long backupSize;

        @NameInMap("BackupStartTime")
        private String backupStartTime;

        @NameInMap("BackupStatus")
        private String backupStatus;

        @NameInMap("BackupType")
        private String backupType;

        private Backup(Builder builder) {
            this.backupDBNames = builder.backupDBNames;
            this.backupDownloadURL = builder.backupDownloadURL;
            this.backupEndTime = builder.backupEndTime;
            this.backupId = builder.backupId;
            this.backupIntranetDownloadURL = builder.backupIntranetDownloadURL;
            this.backupJobId = builder.backupJobId;
            this.backupMethod = builder.backupMethod;
            this.backupMode = builder.backupMode;
            this.backupSize = builder.backupSize;
            this.backupStartTime = builder.backupStartTime;
            this.backupStatus = builder.backupStatus;
            this.backupType = builder.backupType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Backup create() {
            return builder().build();
        }

        /**
         * @return backupDBNames
         */
        public String getBackupDBNames() {
            return this.backupDBNames;
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
         * @return backupJobId
         */
        public String getBackupJobId() {
            return this.backupJobId;
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

        public static final class Builder {
            private String backupDBNames; 
            private String backupDownloadURL; 
            private String backupEndTime; 
            private String backupId; 
            private String backupIntranetDownloadURL; 
            private String backupJobId; 
            private String backupMethod; 
            private String backupMode; 
            private Long backupSize; 
            private String backupStartTime; 
            private String backupStatus; 
            private String backupType; 

            /**
             * The name of the database that has been backed up.
             */
            public Builder backupDBNames(String backupDBNames) {
                this.backupDBNames = backupDBNames;
                return this;
            }

            /**
             * The Internet download URL of the backup set. If the download URL is unavailable, this parameter is an empty string.
             */
            public Builder backupDownloadURL(String backupDownloadURL) {
                this.backupDownloadURL = backupDownloadURL;
                return this;
            }

            /**
             * The end of the backup time range. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
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
             * The internal download URL of the backup set.
             * <p>
             * 
             * > You can use this URL to download the backup set from on the Elastic Compute Service (ECS) instance which is on the same network as the ApsaraDB for MongoDB instance.
             */
            public Builder backupIntranetDownloadURL(String backupIntranetDownloadURL) {
                this.backupIntranetDownloadURL = backupIntranetDownloadURL;
                return this;
            }

            /**
             * BackupJobId.
             */
            public Builder backupJobId(String backupJobId) {
                this.backupJobId = backupJobId;
                return this;
            }

            /**
             * The method that is used to generate the backup set. Valid values:
             * <p>
             * 
             * *   **Snapshot**
             * *   **Physical**
             * *   **Logical**
             */
            public Builder backupMethod(String backupMethod) {
                this.backupMethod = backupMethod;
                return this;
            }

            /**
             * The backup mode of the backup set. Valid values:
             * <p>
             * 
             * *   **Automated**:
             * *   **Manual**
             */
            public Builder backupMode(String backupMode) {
                this.backupMode = backupMode;
                return this;
            }

            /**
             * The size of the backup set. Unit: bytes.
             */
            public Builder backupSize(Long backupSize) {
                this.backupSize = backupSize;
                return this;
            }

            /**
             * The beginning of the backup time range. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder backupStartTime(String backupStartTime) {
                this.backupStartTime = backupStartTime;
                return this;
            }

            /**
             * The status of the backup task. Valid values:
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
             * The backup type. Valid values:
             * <p>
             * 
             * *   **FullBackup**
             * *   **IncrementalBackup**
             */
            public Builder backupType(String backupType) {
                this.backupType = backupType;
                return this;
            }

            public Backup build() {
                return new Backup(this);
            } 

        } 

    }
    public static class Backups extends TeaModel {
        @NameInMap("Backup")
        private java.util.List < Backup> backup;

        private Backups(Builder builder) {
            this.backup = builder.backup;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Backups create() {
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

            public Backups build() {
                return new Backups(this);
            } 

        } 

    }
}
