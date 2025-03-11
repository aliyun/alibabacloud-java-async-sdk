// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

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
 * {@link DescribeBackupSetsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBackupSetsResponseBody</p>
 */
public class DescribeBackupSetsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BackupSets")
    private BackupSets backupSets;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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
         * <p>The list of backup sets.</p>
         */
        public Builder backupSets(BackupSets backupSets) {
            this.backupSets = backupSets;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>7103AEE3-9025-442F-B82B-BABD0A******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeBackupSetsResponseBody build() {
            return new DescribeBackupSetsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeBackupSetsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBackupSetsResponseBody</p>
     */
    public static class BackupDbs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("backupDb")
        private java.util.List<String> backupDb;

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
        public java.util.List<String> getBackupDb() {
            return this.backupDb;
        }

        public static final class Builder {
            private java.util.List<String> backupDb; 

            /**
             * backupDb.
             */
            public Builder backupDb(java.util.List<String> backupDb) {
                this.backupDb = backupDb;
                return this;
            }

            public BackupDbs build() {
                return new BackupDbs(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeBackupSetsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBackupSetsResponseBody</p>
     */
    public static class BackupSet extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BackupConsitentTime")
        private String backupConsitentTime;

        @com.aliyun.core.annotation.NameInMap("BackupDbs")
        private BackupDbs backupDbs;

        @com.aliyun.core.annotation.NameInMap("BackupEndTime")
        private Long backupEndTime;

        @com.aliyun.core.annotation.NameInMap("BackupLevel")
        private String backupLevel;

        @com.aliyun.core.annotation.NameInMap("BackupMode")
        private String backupMode;

        @com.aliyun.core.annotation.NameInMap("BackupStartTime")
        private Long backupStartTime;

        @com.aliyun.core.annotation.NameInMap("BackupTotalSize")
        private String backupTotalSize;

        @com.aliyun.core.annotation.NameInMap("BackupType")
        private String backupType;

        @com.aliyun.core.annotation.NameInMap("EnableRecovery")
        private Boolean enableRecovery;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Status")
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
             * <p>Backup Recovery duration.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-06-05 11:31:38</p>
             */
            public Builder backupConsitentTime(String backupConsitentTime) {
                this.backupConsitentTime = backupConsitentTime;
                return this;
            }

            /**
             * <p>The list of backup databases.</p>
             */
            public Builder backupDbs(BackupDbs backupDbs) {
                this.backupDbs = backupDbs;
                return this;
            }

            /**
             * <p>The end of the backup time which is in timestamp format (measured in millisecond).</p>
             * <blockquote>
             * <p> 0 indicates not finished.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1591327899000</p>
             */
            public Builder backupEndTime(Long backupEndTime) {
                this.backupEndTime = backupEndTime;
                return this;
            }

            /**
             * <p>The level of the backup. Valid values:</p>
             * <ul>
             * <li>db: The database level.</li>
             * <li>instance: the instance level.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>instance</p>
             */
            public Builder backupLevel(String backupLevel) {
                this.backupLevel = backupLevel;
                return this;
            }

            /**
             * <p>The backup method. Valid values:</p>
             * <ul>
             * <li>logic: the logical backup.</li>
             * <li>phy: fast backup</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>logic</p>
             */
            public Builder backupMode(String backupMode) {
                this.backupMode = backupMode;
                return this;
            }

            /**
             * <p>The beginning of the backup time which is in timestamp format (measured in millisecond).</p>
             * 
             * <strong>example:</strong>
             * <p>1591327754000</p>
             */
            public Builder backupStartTime(Long backupStartTime) {
                this.backupStartTime = backupStartTime;
                return this;
            }

            /**
             * <p>The size of the backup set. Unit: MB.</p>
             * 
             * <strong>example:</strong>
             * <p>93.24</p>
             */
            public Builder backupTotalSize(String backupTotalSize) {
                this.backupTotalSize = backupTotalSize;
                return this;
            }

            /**
             * <p>The type of the backup. Valid values:</p>
             * <ul>
             * <li>manual: indicates a manual backup.</li>
             * <li>auto: indicates an automatic backup.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>manual</p>
             */
            public Builder backupType(String backupType) {
                this.backupType = backupType;
                return this;
            }

            /**
             * <p>Indicates whether the backup set can be restored. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enableRecovery(Boolean enableRecovery) {
                this.enableRecovery = enableRecovery;
                return this;
            }

            /**
             * <p>The ID of the data backup file you want to use.</p>
             * 
             * <strong>example:</strong>
             * <p>ba30d5c4-a6dc-11ea-bd40-************</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The status of the backup instance. Valid values:</p>
             * <ul>
             * <li>-1: Failed</li>
             * <li>0: Not started</li>
             * <li>1: The storage instance is running.</li>
             * <li>2: Success</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
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
    /**
     * 
     * {@link DescribeBackupSetsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBackupSetsResponseBody</p>
     */
    public static class BackupSets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("backupSet")
        private java.util.List<BackupSet> backupSet;

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
        public java.util.List<BackupSet> getBackupSet() {
            return this.backupSet;
        }

        public static final class Builder {
            private java.util.List<BackupSet> backupSet; 

            /**
             * backupSet.
             */
            public Builder backupSet(java.util.List<BackupSet> backupSet) {
                this.backupSet = backupSet;
                return this;
            }

            public BackupSets build() {
                return new BackupSets(this);
            } 

        } 

    }
}
