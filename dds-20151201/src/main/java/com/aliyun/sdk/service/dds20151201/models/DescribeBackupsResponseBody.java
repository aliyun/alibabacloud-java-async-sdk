// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

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
         * <p>The details of the backup set.</p>
         */
        public Builder backups(Backups backups) {
            this.backups = backups;
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
         * <p>The number of entries returned per page. Valid values:</p>
         * <ul>
         * <li><strong>30</strong> (default)</li>
         * <li><strong>50</strong></li>
         * <li><strong>100</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>275D43C3-F12F-5224-B375-0C6BF453BD56</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of backup sets.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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

        @com.aliyun.core.annotation.NameInMap("BackupId")
        private String backupId;

        @com.aliyun.core.annotation.NameInMap("BackupIntranetDownloadURL")
        private String backupIntranetDownloadURL;

        @com.aliyun.core.annotation.NameInMap("BackupJobId")
        private String backupJobId;

        @com.aliyun.core.annotation.NameInMap("BackupMethod")
        private String backupMethod;

        @com.aliyun.core.annotation.NameInMap("BackupMode")
        private String backupMode;

        @com.aliyun.core.annotation.NameInMap("BackupName")
        private String backupName;

        @com.aliyun.core.annotation.NameInMap("BackupScale")
        private String backupScale;

        @com.aliyun.core.annotation.NameInMap("BackupSize")
        private Long backupSize;

        @com.aliyun.core.annotation.NameInMap("BackupStartTime")
        private String backupStartTime;

        @com.aliyun.core.annotation.NameInMap("BackupStatus")
        private String backupStatus;

        @com.aliyun.core.annotation.NameInMap("BackupType")
        private String backupType;

        @com.aliyun.core.annotation.NameInMap("EngineVersion")
        private String engineVersion;

        @com.aliyun.core.annotation.NameInMap("IsAvail")
        private Boolean isAvail;

        private Backup(Builder builder) {
            this.backupDBNames = builder.backupDBNames;
            this.backupDownloadURL = builder.backupDownloadURL;
            this.backupEndTime = builder.backupEndTime;
            this.backupId = builder.backupId;
            this.backupIntranetDownloadURL = builder.backupIntranetDownloadURL;
            this.backupJobId = builder.backupJobId;
            this.backupMethod = builder.backupMethod;
            this.backupMode = builder.backupMode;
            this.backupName = builder.backupName;
            this.backupScale = builder.backupScale;
            this.backupSize = builder.backupSize;
            this.backupStartTime = builder.backupStartTime;
            this.backupStatus = builder.backupStatus;
            this.backupType = builder.backupType;
            this.engineVersion = builder.engineVersion;
            this.isAvail = builder.isAvail;
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
         * @return backupName
         */
        public String getBackupName() {
            return this.backupName;
        }

        /**
         * @return backupScale
         */
        public String getBackupScale() {
            return this.backupScale;
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
         * @return engineVersion
         */
        public String getEngineVersion() {
            return this.engineVersion;
        }

        /**
         * @return isAvail
         */
        public Boolean getIsAvail() {
            return this.isAvail;
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
            private String backupName; 
            private String backupScale; 
            private Long backupSize; 
            private String backupStartTime; 
            private String backupStatus; 
            private String backupType; 
            private String engineVersion; 
            private Boolean isAvail; 

            /**
             * <p>The name of the database that has been backed up.</p>
             * 
             * <strong>example:</strong>
             * <p>database</p>
             */
            public Builder backupDBNames(String backupDBNames) {
                this.backupDBNames = backupDBNames;
                return this;
            }

            /**
             * <p>The URL that is used to download the backup set over the Internet. If the backup set cannot be downloaded, an empty string is returned.</p>
             */
            public Builder backupDownloadURL(String backupDownloadURL) {
                this.backupDownloadURL = backupDownloadURL;
                return this;
            }

            /**
             * <p>The end time of the backup. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-01-14T03:57:34Z</p>
             */
            public Builder backupEndTime(String backupEndTime) {
                this.backupEndTime = backupEndTime;
                return this;
            }

            /**
             * <p>The ID of the backup set.</p>
             * 
             * <strong>example:</strong>
             * <p>32102****</p>
             */
            public Builder backupId(String backupId) {
                this.backupId = backupId;
                return this;
            }

            /**
             * <p>The internal download URL of the backup set.</p>
             * <blockquote>
             * <p> You can use the URL to download the specified backup set on an Elastic Compute Service (ECS) instance that is in the same virtual private cloud (VPC) as the ApsaraDB for MongoDB instance.</p>
             * </blockquote>
             */
            public Builder backupIntranetDownloadURL(String backupIntranetDownloadURL) {
                this.backupIntranetDownloadURL = backupIntranetDownloadURL;
                return this;
            }

            /**
             * <p>The ID of the backup task.</p>
             * 
             * <strong>example:</strong>
             * <p>1123xxxx</p>
             */
            public Builder backupJobId(String backupJobId) {
                this.backupJobId = backupJobId;
                return this;
            }

            /**
             * <p>The method that is used to generate the backup set. Valid values:</p>
             * <ul>
             * <li><strong>Snapshot</strong></li>
             * <li><strong>Physical</strong></li>
             * <li><strong>Logical</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Physical</p>
             */
            public Builder backupMethod(String backupMethod) {
                this.backupMethod = backupMethod;
                return this;
            }

            /**
             * <p>The backup mode of the backup set. Valid values:</p>
             * <ul>
             * <li><strong>Automated</strong></li>
             * <li><strong>Manual</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Automated</p>
             */
            public Builder backupMode(String backupMode) {
                this.backupMode = backupMode;
                return this;
            }

            /**
             * <p>The name of the backup set. The parameter is invalid.</p>
             * 
             * <strong>example:</strong>
             * <p>12345678.tar.gz</p>
             */
            public Builder backupName(String backupName) {
                this.backupName = backupName;
                return this;
            }

            /**
             * <p>The backup granularity. The parameter is invalid.</p>
             * 
             * <strong>example:</strong>
             * <p>DBInstance</p>
             */
            public Builder backupScale(String backupScale) {
                this.backupScale = backupScale;
                return this;
            }

            /**
             * <p>The size of the backup set. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>6168576</p>
             */
            public Builder backupSize(Long backupSize) {
                this.backupSize = backupSize;
                return this;
            }

            /**
             * <p>The start time of the backup. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-01-14T03:56:17Z</p>
             */
            public Builder backupStartTime(String backupStartTime) {
                this.backupStartTime = backupStartTime;
                return this;
            }

            /**
             * <p>The status of the backup task. Valid values:</p>
             * <ul>
             * <li><strong>Success</strong>: The backup task is successful.</li>
             * <li><strong>Failed</strong>: The backup task failed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
             */
            public Builder backupStatus(String backupStatus) {
                this.backupStatus = backupStatus;
                return this;
            }

            /**
             * <p>The backup type. Valid values:</p>
             * <ul>
             * <li><strong>FullBackup</strong></li>
             * <li><strong>IncrementalBackup</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>FullBackup</p>
             */
            public Builder backupType(String backupType) {
                this.backupType = backupType;
                return this;
            }

            /**
             * <p>Version of the backuped instance.</p>
             * <ul>
             * <li><strong>6.0</strong></li>
             * <li><strong>5.0</strong></li>
             * <li><strong>4.4</strong></li>
             * <li><strong>4.2</strong></li>
             * <li><strong>4.0</strong></li>
             * <li><strong>3.4</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>4.2</p>
             */
            public Builder engineVersion(String engineVersion) {
                this.engineVersion = engineVersion;
                return this;
            }

            /**
             * <p>Availability of the backup set.</p>
             * <ul>
             * <li>0: unavailable</li>
             * <li>1: available</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder isAvail(Boolean isAvail) {
                this.isAvail = isAvail;
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
