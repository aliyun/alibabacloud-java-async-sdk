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
 * {@link DescribeBackupsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBackupsResponseBody</p>
 */
public class DescribeBackupsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Backups")
    private Backups backups;

    @com.aliyun.core.annotation.NameInMap("EnableStatus")
    private String enableStatus;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeBackupsResponseBody(Builder builder) {
        this.backups = builder.backups;
        this.enableStatus = builder.enableStatus;
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
     * @return enableStatus
     */
    public String getEnableStatus() {
        return this.enableStatus;
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
        private String enableStatus; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * Backups.
         */
        public Builder backups(Backups backups) {
            this.backups = backups;
            return this;
        }

        /**
         * EnableStatus.
         */
        public Builder enableStatus(String enableStatus) {
            this.enableStatus = enableStatus;
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

        public DescribeBackupsResponseBody build() {
            return new DescribeBackupsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeBackupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBackupsResponseBody</p>
     */
    public static class Backup extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BackupDBNames")
        private String backupDBNames;

        @com.aliyun.core.annotation.NameInMap("BackupDownloadURL")
        private String backupDownloadURL;

        @com.aliyun.core.annotation.NameInMap("BackupEndTime")
        private String backupEndTime;

        @com.aliyun.core.annotation.NameInMap("BackupEndTimeUTC")
        private String backupEndTimeUTC;

        @com.aliyun.core.annotation.NameInMap("BackupId")
        private Integer backupId;

        @com.aliyun.core.annotation.NameInMap("BackupMethod")
        private String backupMethod;

        @com.aliyun.core.annotation.NameInMap("BackupMode")
        private String backupMode;

        @com.aliyun.core.annotation.NameInMap("BackupSize")
        private String backupSize;

        @com.aliyun.core.annotation.NameInMap("BackupStartTime")
        private String backupStartTime;

        @com.aliyun.core.annotation.NameInMap("BackupStartTimeUTC")
        private String backupStartTimeUTC;

        @com.aliyun.core.annotation.NameInMap("BackupStatus")
        private String backupStatus;

        @com.aliyun.core.annotation.NameInMap("BackupType")
        private String backupType;

        private Backup(Builder builder) {
            this.backupDBNames = builder.backupDBNames;
            this.backupDownloadURL = builder.backupDownloadURL;
            this.backupEndTime = builder.backupEndTime;
            this.backupEndTimeUTC = builder.backupEndTimeUTC;
            this.backupId = builder.backupId;
            this.backupMethod = builder.backupMethod;
            this.backupMode = builder.backupMode;
            this.backupSize = builder.backupSize;
            this.backupStartTime = builder.backupStartTime;
            this.backupStartTimeUTC = builder.backupStartTimeUTC;
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
         * @return backupEndTimeUTC
         */
        public String getBackupEndTimeUTC() {
            return this.backupEndTimeUTC;
        }

        /**
         * @return backupId
         */
        public Integer getBackupId() {
            return this.backupId;
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
        public String getBackupSize() {
            return this.backupSize;
        }

        /**
         * @return backupStartTime
         */
        public String getBackupStartTime() {
            return this.backupStartTime;
        }

        /**
         * @return backupStartTimeUTC
         */
        public String getBackupStartTimeUTC() {
            return this.backupStartTimeUTC;
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
            private String backupEndTimeUTC; 
            private Integer backupId; 
            private String backupMethod; 
            private String backupMode; 
            private String backupSize; 
            private String backupStartTime; 
            private String backupStartTimeUTC; 
            private String backupStatus; 
            private String backupType; 

            /**
             * BackupDBNames.
             */
            public Builder backupDBNames(String backupDBNames) {
                this.backupDBNames = backupDBNames;
                return this;
            }

            /**
             * BackupDownloadURL.
             */
            public Builder backupDownloadURL(String backupDownloadURL) {
                this.backupDownloadURL = backupDownloadURL;
                return this;
            }

            /**
             * BackupEndTime.
             */
            public Builder backupEndTime(String backupEndTime) {
                this.backupEndTime = backupEndTime;
                return this;
            }

            /**
             * BackupEndTimeUTC.
             */
            public Builder backupEndTimeUTC(String backupEndTimeUTC) {
                this.backupEndTimeUTC = backupEndTimeUTC;
                return this;
            }

            /**
             * BackupId.
             */
            public Builder backupId(Integer backupId) {
                this.backupId = backupId;
                return this;
            }

            /**
             * BackupMethod.
             */
            public Builder backupMethod(String backupMethod) {
                this.backupMethod = backupMethod;
                return this;
            }

            /**
             * BackupMode.
             */
            public Builder backupMode(String backupMode) {
                this.backupMode = backupMode;
                return this;
            }

            /**
             * BackupSize.
             */
            public Builder backupSize(String backupSize) {
                this.backupSize = backupSize;
                return this;
            }

            /**
             * BackupStartTime.
             */
            public Builder backupStartTime(String backupStartTime) {
                this.backupStartTime = backupStartTime;
                return this;
            }

            /**
             * BackupStartTimeUTC.
             */
            public Builder backupStartTimeUTC(String backupStartTimeUTC) {
                this.backupStartTimeUTC = backupStartTimeUTC;
                return this;
            }

            /**
             * BackupStatus.
             */
            public Builder backupStatus(String backupStatus) {
                this.backupStatus = backupStatus;
                return this;
            }

            /**
             * BackupType.
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
    /**
     * 
     * {@link DescribeBackupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBackupsResponseBody</p>
     */
    public static class Backups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Backup")
        private java.util.List<Backup> backup;

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
        public java.util.List<Backup> getBackup() {
            return this.backup;
        }

        public static final class Builder {
            private java.util.List<Backup> backup; 

            /**
             * Backup.
             */
            public Builder backup(java.util.List<Backup> backup) {
                this.backup = backup;
                return this;
            }

            public Backups build() {
                return new Backups(this);
            } 

        } 

    }
}
