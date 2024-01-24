// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBackupSetsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBackupSetsResponseBody</p>
 */
public class DescribeBackupSetsResponseBody extends TeaModel {
    @NameInMap("BackupSets")
    private BackupSets backupSets;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private DescribeBackupSetsResponseBody(Builder builder) {
        this.backupSets = builder.backupSets;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBackupSetsResponseBody create() {
        return builder().build();
    }

    /**
     * @return backupSets
     */
    public BackupSets getBackupSets() {
        return this.backupSets;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private BackupSets backupSets; 
        private String requestId; 
        private Boolean success; 

        /**
         * The list of backup sets.
         */
        public Builder backupSets(BackupSets backupSets) {
            this.backupSets = backupSets;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeBackupSetsResponseBody build() {
            return new DescribeBackupSetsResponseBody(this);
        } 

    } 

    public static class BackupDbs extends TeaModel {
        @NameInMap("backupDb")
        private java.util.List < String > backupDb;

        private BackupDbs(Builder builder) {
            this.backupDb = builder.backupDb;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BackupDbs create() {
            return builder().build();
        }

        /**
         * @return backupDb
         */
        public java.util.List < String > getBackupDb() {
            return this.backupDb;
        }

        public static final class Builder {
            private java.util.List < String > backupDb; 

            /**
             * backupDb.
             */
            public Builder backupDb(java.util.List < String > backupDb) {
                this.backupDb = backupDb;
                return this;
            }

            public BackupDbs build() {
                return new BackupDbs(this);
            } 

        } 

    }
    public static class BackupSet extends TeaModel {
        @NameInMap("BackupConsitentTime")
        private String backupConsitentTime;

        @NameInMap("BackupDbs")
        private BackupDbs backupDbs;

        @NameInMap("BackupEndTime")
        private Long backupEndTime;

        @NameInMap("BackupLevel")
        private String backupLevel;

        @NameInMap("BackupMode")
        private String backupMode;

        @NameInMap("BackupStartTime")
        private Long backupStartTime;

        @NameInMap("BackupTotalSize")
        private String backupTotalSize;

        @NameInMap("BackupType")
        private String backupType;

        @NameInMap("EnableRecovery")
        private Boolean enableRecovery;

        @NameInMap("Id")
        private String id;

        @NameInMap("Status")
        private Long status;

        private BackupSet(Builder builder) {
            this.backupConsitentTime = builder.backupConsitentTime;
            this.backupDbs = builder.backupDbs;
            this.backupEndTime = builder.backupEndTime;
            this.backupLevel = builder.backupLevel;
            this.backupMode = builder.backupMode;
            this.backupStartTime = builder.backupStartTime;
            this.backupTotalSize = builder.backupTotalSize;
            this.backupType = builder.backupType;
            this.enableRecovery = builder.enableRecovery;
            this.id = builder.id;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BackupSet create() {
            return builder().build();
        }

        /**
         * @return backupConsitentTime
         */
        public String getBackupConsitentTime() {
            return this.backupConsitentTime;
        }

        /**
         * @return backupDbs
         */
        public BackupDbs getBackupDbs() {
            return this.backupDbs;
        }

        /**
         * @return backupEndTime
         */
        public Long getBackupEndTime() {
            return this.backupEndTime;
        }

        /**
         * @return backupLevel
         */
        public String getBackupLevel() {
            return this.backupLevel;
        }

        /**
         * @return backupMode
         */
        public String getBackupMode() {
            return this.backupMode;
        }

        /**
         * @return backupStartTime
         */
        public Long getBackupStartTime() {
            return this.backupStartTime;
        }

        /**
         * @return backupTotalSize
         */
        public String getBackupTotalSize() {
            return this.backupTotalSize;
        }

        /**
         * @return backupType
         */
        public String getBackupType() {
            return this.backupType;
        }

        /**
         * @return enableRecovery
         */
        public Boolean getEnableRecovery() {
            return this.enableRecovery;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return status
         */
        public Long getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String backupConsitentTime; 
            private BackupDbs backupDbs; 
            private Long backupEndTime; 
            private String backupLevel; 
            private String backupMode; 
            private Long backupStartTime; 
            private String backupTotalSize; 
            private String backupType; 
            private Boolean enableRecovery; 
            private String id; 
            private Long status; 

            /**
             * Backup Recovery duration.
             */
            public Builder backupConsitentTime(String backupConsitentTime) {
                this.backupConsitentTime = backupConsitentTime;
                return this;
            }

            /**
             * The list of backup databases.
             */
            public Builder backupDbs(BackupDbs backupDbs) {
                this.backupDbs = backupDbs;
                return this;
            }

            /**
             * The end of the backup time which is in timestamp format (measured in millisecond).
             * <p>
             * 
             * >  0 indicates not finished.
             */
            public Builder backupEndTime(Long backupEndTime) {
                this.backupEndTime = backupEndTime;
                return this;
            }

            /**
             * The level of the backup. Valid values:
             * <p>
             * 
             * *   db: The database level.
             * *   instance: the instance level.
             */
            public Builder backupLevel(String backupLevel) {
                this.backupLevel = backupLevel;
                return this;
            }

            /**
             * The backup method. Valid values:
             * <p>
             * 
             * *   logic: the logical backup.
             * *   phy: fast backup
             */
            public Builder backupMode(String backupMode) {
                this.backupMode = backupMode;
                return this;
            }

            /**
             * The beginning of the backup time which is in timestamp format (measured in millisecond).
             */
            public Builder backupStartTime(Long backupStartTime) {
                this.backupStartTime = backupStartTime;
                return this;
            }

            /**
             * The size of the backup set. Unit: MB.
             */
            public Builder backupTotalSize(String backupTotalSize) {
                this.backupTotalSize = backupTotalSize;
                return this;
            }

            /**
             * The type of the backup. Valid values:
             * <p>
             * 
             * *   manual: indicates a manual backup.
             * *   auto: indicates an automatic backup.
             */
            public Builder backupType(String backupType) {
                this.backupType = backupType;
                return this;
            }

            /**
             * Indicates whether the backup set can be restored. Valid values:
             */
            public Builder enableRecovery(Boolean enableRecovery) {
                this.enableRecovery = enableRecovery;
                return this;
            }

            /**
             * The ID of the data backup file you want to use.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The status of the backup instance. Valid values:
             * <p>
             * 
             * *   \-1: Failed
             * *   0: Not started
             * *   1: The storage instance is running.
             * *   2: Success
             */
            public Builder status(Long status) {
                this.status = status;
                return this;
            }

            public BackupSet build() {
                return new BackupSet(this);
            } 

        } 

    }
    public static class BackupSets extends TeaModel {
        @NameInMap("backupSet")
        private java.util.List < BackupSet> backupSet;

        private BackupSets(Builder builder) {
            this.backupSet = builder.backupSet;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BackupSets create() {
            return builder().build();
        }

        /**
         * @return backupSet
         */
        public java.util.List < BackupSet> getBackupSet() {
            return this.backupSet;
        }

        public static final class Builder {
            private java.util.List < BackupSet> backupSet; 

            /**
             * backupSet.
             */
            public Builder backupSet(java.util.List < BackupSet> backupSet) {
                this.backupSet = backupSet;
                return this;
            }

            public BackupSets build() {
                return new BackupSets(this);
            } 

        } 

    }
}
