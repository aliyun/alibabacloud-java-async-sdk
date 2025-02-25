// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

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
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private AccessDeniedDetail accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Backups")
    private Backups backups;

    @com.aliyun.core.annotation.NameInMap("FreeSize")
    private Long freeSize;

    @com.aliyun.core.annotation.NameInMap("FullStorageSize")
    private Long fullStorageSize;

    @com.aliyun.core.annotation.NameInMap("LogStorageSize")
    private Long logStorageSize;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeBackupsResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.backups = builder.backups;
        this.freeSize = builder.freeSize;
        this.fullStorageSize = builder.fullStorageSize;
        this.logStorageSize = builder.logStorageSize;
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
     * @return accessDeniedDetail
     */
    public AccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return backups
     */
    public Backups getBackups() {
        return this.backups;
    }

    /**
     * @return freeSize
     */
    public Long getFreeSize() {
        return this.freeSize;
    }

    /**
     * @return fullStorageSize
     */
    public Long getFullStorageSize() {
        return this.fullStorageSize;
    }

    /**
     * @return logStorageSize
     */
    public Long getLogStorageSize() {
        return this.logStorageSize;
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
        private AccessDeniedDetail accessDeniedDetail; 
        private Backups backups; 
        private Long freeSize; 
        private Long fullStorageSize; 
        private Long logStorageSize; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * <p>The following parameters are no longer used. Ignore the parameters.</p>
         */
        public Builder accessDeniedDetail(AccessDeniedDetail accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>Details of the backup files.</p>
         */
        public Builder backups(Backups backups) {
            this.backups = backups;
            return this;
        }

        /**
         * <p>This parameter does not take effect. Ignore this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>100000</p>
         */
        public Builder freeSize(Long freeSize) {
            this.freeSize = freeSize;
            return this;
        }

        /**
         * <p>The size of the full backup file of the instance. Unit: bytes. Full backups originate from scheduled backups, manual backups, and backups generated during cache analysis.</p>
         * <blockquote>
         * <p> The value of this parameter is independent of the number and size of the returned backup sets. Instead, it reflects the total size of all valid full backups of the instance.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder fullStorageSize(Long fullStorageSize) {
            this.fullStorageSize = fullStorageSize;
            return this;
        }

        /**
         * <p>The size of the log backup file of the instance. Unit: bytes. This value is valid only when flashback is enabled.</p>
         * <blockquote>
         * <p> The value of this parameter is independent of the number and size of the returned backup sets. Instead, it reflects the total size of all valid log backups of the instance.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>5000</p>
         */
        public Builder logStorageSize(Long logStorageSize) {
            this.logStorageSize = logStorageSize;
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
         * <p>The number of entries returned on each page.</p>
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
         * <p>963C20F0-7CE1-4591-AAF3-6F3CD1CE****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of backup files that were returned.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
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
    public static class AccessDeniedDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthAction")
        private String authAction;

        @com.aliyun.core.annotation.NameInMap("AuthPrincipalDisplayName")
        private String authPrincipalDisplayName;

        @com.aliyun.core.annotation.NameInMap("AuthPrincipalOwnerId")
        private String authPrincipalOwnerId;

        @com.aliyun.core.annotation.NameInMap("AuthPrincipalType")
        private String authPrincipalType;

        @com.aliyun.core.annotation.NameInMap("EncodedDiagnosticMessage")
        private String encodedDiagnosticMessage;

        @com.aliyun.core.annotation.NameInMap("NoPermissionType")
        private String noPermissionType;

        @com.aliyun.core.annotation.NameInMap("PolicyType")
        private String policyType;

        private AccessDeniedDetail(Builder builder) {
            this.authAction = builder.authAction;
            this.authPrincipalDisplayName = builder.authPrincipalDisplayName;
            this.authPrincipalOwnerId = builder.authPrincipalOwnerId;
            this.authPrincipalType = builder.authPrincipalType;
            this.encodedDiagnosticMessage = builder.encodedDiagnosticMessage;
            this.noPermissionType = builder.noPermissionType;
            this.policyType = builder.policyType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccessDeniedDetail create() {
            return builder().build();
        }

        /**
         * @return authAction
         */
        public String getAuthAction() {
            return this.authAction;
        }

        /**
         * @return authPrincipalDisplayName
         */
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        /**
         * @return authPrincipalOwnerId
         */
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        /**
         * @return authPrincipalType
         */
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        /**
         * @return encodedDiagnosticMessage
         */
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        /**
         * @return noPermissionType
         */
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        /**
         * @return policyType
         */
        public String getPolicyType() {
            return this.policyType;
        }

        public static final class Builder {
            private String authAction; 
            private String authPrincipalDisplayName; 
            private String authPrincipalOwnerId; 
            private String authPrincipalType; 
            private String encodedDiagnosticMessage; 
            private String noPermissionType; 
            private String policyType; 

            /**
             * <p>This parameter is no longer used. Ignore this parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>_</p>
             */
            public Builder authAction(String authAction) {
                this.authAction = authAction;
                return this;
            }

            /**
             * <p>This parameter is no longer used. Ignore this parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>_</p>
             */
            public Builder authPrincipalDisplayName(String authPrincipalDisplayName) {
                this.authPrincipalDisplayName = authPrincipalDisplayName;
                return this;
            }

            /**
             * <p>This parameter is no longer used. Ignore this parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>_</p>
             */
            public Builder authPrincipalOwnerId(String authPrincipalOwnerId) {
                this.authPrincipalOwnerId = authPrincipalOwnerId;
                return this;
            }

            /**
             * <p>This parameter is no longer used. Ignore this parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>_</p>
             */
            public Builder authPrincipalType(String authPrincipalType) {
                this.authPrincipalType = authPrincipalType;
                return this;
            }

            /**
             * <p>This parameter is no longer used. Ignore this parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>_</p>
             */
            public Builder encodedDiagnosticMessage(String encodedDiagnosticMessage) {
                this.encodedDiagnosticMessage = encodedDiagnosticMessage;
                return this;
            }

            /**
             * <p>This parameter is no longer used. Ignore this parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>_</p>
             */
            public Builder noPermissionType(String noPermissionType) {
                this.noPermissionType = noPermissionType;
                return this;
            }

            /**
             * <p>This parameter is no longer used. Ignore this parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>_</p>
             */
            public Builder policyType(String policyType) {
                this.policyType = policyType;
                return this;
            }

            public AccessDeniedDetail build() {
                return new AccessDeniedDetail(this);
            } 

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
        private Long backupId;

        @com.aliyun.core.annotation.NameInMap("BackupIntranetDownloadURL")
        private String backupIntranetDownloadURL;

        @com.aliyun.core.annotation.NameInMap("BackupJobID")
        private Long backupJobID;

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

        @com.aliyun.core.annotation.NameInMap("EngineVersion")
        private String engineVersion;

        @com.aliyun.core.annotation.NameInMap("NodeInstanceId")
        private String nodeInstanceId;

        @com.aliyun.core.annotation.NameInMap("RecoverConfigMode")
        private String recoverConfigMode;

        private Backup(Builder builder) {
            this.backupDBNames = builder.backupDBNames;
            this.backupDownloadURL = builder.backupDownloadURL;
            this.backupEndTime = builder.backupEndTime;
            this.backupId = builder.backupId;
            this.backupIntranetDownloadURL = builder.backupIntranetDownloadURL;
            this.backupJobID = builder.backupJobID;
            this.backupMethod = builder.backupMethod;
            this.backupMode = builder.backupMode;
            this.backupSize = builder.backupSize;
            this.backupStartTime = builder.backupStartTime;
            this.backupStatus = builder.backupStatus;
            this.backupType = builder.backupType;
            this.engineVersion = builder.engineVersion;
            this.nodeInstanceId = builder.nodeInstanceId;
            this.recoverConfigMode = builder.recoverConfigMode;
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
        public Long getBackupId() {
            return this.backupId;
        }

        /**
         * @return backupIntranetDownloadURL
         */
        public String getBackupIntranetDownloadURL() {
            return this.backupIntranetDownloadURL;
        }

        /**
         * @return backupJobID
         */
        public Long getBackupJobID() {
            return this.backupJobID;
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
         * @return engineVersion
         */
        public String getEngineVersion() {
            return this.engineVersion;
        }

        /**
         * @return nodeInstanceId
         */
        public String getNodeInstanceId() {
            return this.nodeInstanceId;
        }

        /**
         * @return recoverConfigMode
         */
        public String getRecoverConfigMode() {
            return this.recoverConfigMode;
        }

        public static final class Builder {
            private String backupDBNames; 
            private String backupDownloadURL; 
            private String backupEndTime; 
            private Long backupId; 
            private String backupIntranetDownloadURL; 
            private Long backupJobID; 
            private String backupMethod; 
            private String backupMode; 
            private Long backupSize; 
            private String backupStartTime; 
            private String backupStatus; 
            private String backupType; 
            private String engineVersion; 
            private String nodeInstanceId; 
            private String recoverConfigMode; 

            /**
             * <p>The names of the databases that are backed up. The default value is <strong>all</strong>, which indicates that all databases are backed up.</p>
             * 
             * <strong>example:</strong>
             * <p>all</p>
             */
            public Builder backupDBNames(String backupDBNames) {
                this.backupDBNames = backupDBNames;
                return this;
            }

            /**
             * <p>The public download URL of the backup file.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://rdsbak-hk45-v2.oss-cn-hongkong.aliyuncs.com/">https://rdsbak-hk45-v2.oss-cn-hongkong.aliyuncs.com/</a>********</p>
             */
            public Builder backupDownloadURL(String backupDownloadURL) {
                this.backupDownloadURL = backupDownloadURL;
                return this;
            }

            /**
             * <p>The end time of the backup.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-03-14T05:31:13Z</p>
             */
            public Builder backupEndTime(String backupEndTime) {
                this.backupEndTime = backupEndTime;
                return this;
            }

            /**
             * <p>The ID of the backup file.</p>
             * 
             * <strong>example:</strong>
             * <p>165*****50</p>
             */
            public Builder backupId(Long backupId) {
                this.backupId = backupId;
                return this;
            }

            /**
             * <p>The internal download URL of the backup file.</p>
             * <blockquote>
             * <p> You can use this URL to download the backup file from an Elastic Compute Service (ECS) instance that is connected to the ApsaraDB for Redis instance. The ECS instance must belong to the same classic network or reside in the same virtual private cloud (VPC) as the ApsaraDB for Redis instance.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p><a href="https://rdsbak-hk45-v2.oss-cn-hongkong.aliyuncs.com/">https://rdsbak-hk45-v2.oss-cn-hongkong.aliyuncs.com/</a>********</p>
             */
            public Builder backupIntranetDownloadURL(String backupIntranetDownloadURL) {
                this.backupIntranetDownloadURL = backupIntranetDownloadURL;
                return this;
            }

            /**
             * <p>The ID of the backup task.</p>
             * 
             * <strong>example:</strong>
             * <p>24340</p>
             */
            public Builder backupJobID(Long backupJobID) {
                this.backupJobID = backupJobID;
                return this;
            }

            /**
             * <p>The backup method. Valid values:</p>
             * <ul>
             * <li><strong>Logical</strong></li>
             * <li><strong>Physical</strong></li>
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
             * <p>The backup mode. Valid values:</p>
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
             * <p>The size of the backup file.</p>
             * 
             * <strong>example:</strong>
             * <p>1024</p>
             */
            public Builder backupSize(Long backupSize) {
                this.backupSize = backupSize;
                return this;
            }

            /**
             * <p>The start time of the backup.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-03-14T05:28:50Z</p>
             */
            public Builder backupStartTime(String backupStartTime) {
                this.backupStartTime = backupStartTime;
                return this;
            }

            /**
             * <p>The status of the backup. Valid values:</p>
             * <ul>
             * <li><strong>Success</strong></li>
             * <li><strong>Failed</strong></li>
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
             * <p>The engine version (major version) of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>4.0</p>
             */
            public Builder engineVersion(String engineVersion) {
                this.engineVersion = engineVersion;
                return this;
            }

            /**
             * <p>The node ID.</p>
             * <blockquote>
             * <p> If the instance uses the standard architecture, this parameter returns the instance ID.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>r-bp10noxlhcoim2****-db-1</p>
             */
            public Builder nodeInstanceId(String nodeInstanceId) {
                this.nodeInstanceId = nodeInstanceId;
                return this;
            }

            /**
             * <p>If the backup includes account information, kernel parameters and whitelist details.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;whitelist&quot;:true,&quot;config&quot;:true,&quot;account&quot;:true}</p>
             */
            public Builder recoverConfigMode(String recoverConfigMode) {
                this.recoverConfigMode = recoverConfigMode;
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
