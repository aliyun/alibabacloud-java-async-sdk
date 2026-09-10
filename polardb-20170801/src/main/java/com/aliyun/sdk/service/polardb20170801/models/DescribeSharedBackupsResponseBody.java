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
 * {@link DescribeSharedBackupsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSharedBackupsResponseBody</p>
 */
public class DescribeSharedBackupsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private String pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageRecordCount")
    private String pageRecordCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalRecordCount")
    private String totalRecordCount;

    private DescribeSharedBackupsResponseBody(Builder builder) {
        this.items = builder.items;
        this.pageNumber = builder.pageNumber;
        this.pageRecordCount = builder.pageRecordCount;
        this.requestId = builder.requestId;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSharedBackupsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
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
        private java.util.List<Items> items; 
        private String pageNumber; 
        private String pageRecordCount; 
        private String requestId; 
        private String totalRecordCount; 

        private Builder() {
        } 

        private Builder(DescribeSharedBackupsResponseBody model) {
            this.items = model.items;
            this.pageNumber = model.pageNumber;
            this.pageRecordCount = model.pageRecordCount;
            this.requestId = model.requestId;
            this.totalRecordCount = model.totalRecordCount;
        } 

        /**
         * <p>A list of shared backup sets.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(String pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageRecordCount(String pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3E5CD764-FCCA-5C9C-838E-20E0DE84B2AF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total record count.</p>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        public Builder totalRecordCount(String totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeSharedBackupsResponseBody build() {
            return new DescribeSharedBackupsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSharedBackupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSharedBackupsResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BackupEndTime")
        private String backupEndTime;

        @com.aliyun.core.annotation.NameInMap("BackupId")
        private String backupId;

        @com.aliyun.core.annotation.NameInMap("BackupMethod")
        private String backupMethod;

        @com.aliyun.core.annotation.NameInMap("BackupMode")
        private String backupMode;

        @com.aliyun.core.annotation.NameInMap("BackupSetSize")
        private String backupSetSize;

        @com.aliyun.core.annotation.NameInMap("BackupStartTime")
        private String backupStartTime;

        @com.aliyun.core.annotation.NameInMap("BackupStatus")
        private String backupStatus;

        @com.aliyun.core.annotation.NameInMap("BackupType")
        private String backupType;

        @com.aliyun.core.annotation.NameInMap("BackupsLevel")
        private String backupsLevel;

        @com.aliyun.core.annotation.NameInMap("ConsistentTime")
        private String consistentTime;

        @com.aliyun.core.annotation.NameInMap("DBClusterId")
        private String DBClusterId;

        @com.aliyun.core.annotation.NameInMap("DBType")
        private String DBType;

        @com.aliyun.core.annotation.NameInMap("DBVersion")
        private String DBVersion;

        @com.aliyun.core.annotation.NameInMap("PayType")
        private String payType;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ServerlessType")
        private String serverlessType;

        @com.aliyun.core.annotation.NameInMap("ShareType")
        private String shareType;

        @com.aliyun.core.annotation.NameInMap("SharerUID")
        private String sharerUID;

        private Items(Builder builder) {
            this.backupEndTime = builder.backupEndTime;
            this.backupId = builder.backupId;
            this.backupMethod = builder.backupMethod;
            this.backupMode = builder.backupMode;
            this.backupSetSize = builder.backupSetSize;
            this.backupStartTime = builder.backupStartTime;
            this.backupStatus = builder.backupStatus;
            this.backupType = builder.backupType;
            this.backupsLevel = builder.backupsLevel;
            this.consistentTime = builder.consistentTime;
            this.DBClusterId = builder.DBClusterId;
            this.DBType = builder.DBType;
            this.DBVersion = builder.DBVersion;
            this.payType = builder.payType;
            this.regionId = builder.regionId;
            this.serverlessType = builder.serverlessType;
            this.shareType = builder.shareType;
            this.sharerUID = builder.sharerUID;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
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
         * @return backupSetSize
         */
        public String getBackupSetSize() {
            return this.backupSetSize;
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
         * @return backupsLevel
         */
        public String getBackupsLevel() {
            return this.backupsLevel;
        }

        /**
         * @return consistentTime
         */
        public String getConsistentTime() {
            return this.consistentTime;
        }

        /**
         * @return DBClusterId
         */
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        /**
         * @return DBType
         */
        public String getDBType() {
            return this.DBType;
        }

        /**
         * @return DBVersion
         */
        public String getDBVersion() {
            return this.DBVersion;
        }

        /**
         * @return payType
         */
        public String getPayType() {
            return this.payType;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return serverlessType
         */
        public String getServerlessType() {
            return this.serverlessType;
        }

        /**
         * @return shareType
         */
        public String getShareType() {
            return this.shareType;
        }

        /**
         * @return sharerUID
         */
        public String getSharerUID() {
            return this.sharerUID;
        }

        public static final class Builder {
            private String backupEndTime; 
            private String backupId; 
            private String backupMethod; 
            private String backupMode; 
            private String backupSetSize; 
            private String backupStartTime; 
            private String backupStatus; 
            private String backupType; 
            private String backupsLevel; 
            private String consistentTime; 
            private String DBClusterId; 
            private String DBType; 
            private String DBVersion; 
            private String payType; 
            private String regionId; 
            private String serverlessType; 
            private String shareType; 
            private String sharerUID; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.backupEndTime = model.backupEndTime;
                this.backupId = model.backupId;
                this.backupMethod = model.backupMethod;
                this.backupMode = model.backupMode;
                this.backupSetSize = model.backupSetSize;
                this.backupStartTime = model.backupStartTime;
                this.backupStatus = model.backupStatus;
                this.backupType = model.backupType;
                this.backupsLevel = model.backupsLevel;
                this.consistentTime = model.consistentTime;
                this.DBClusterId = model.DBClusterId;
                this.DBType = model.DBType;
                this.DBVersion = model.DBVersion;
                this.payType = model.payType;
                this.regionId = model.regionId;
                this.serverlessType = model.serverlessType;
                this.shareType = model.shareType;
                this.sharerUID = model.sharerUID;
            } 

            /**
             * <p>The end time of the backup, in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-05-12T03:25:55Z</p>
             */
            public Builder backupEndTime(String backupEndTime) {
                this.backupEndTime = backupEndTime;
                return this;
            }

            /**
             * <p>The backup set ID.</p>
             * 
             * <strong>example:</strong>
             * <p>111111111</p>
             */
            public Builder backupId(String backupId) {
                this.backupId = backupId;
                return this;
            }

            /**
             * <p>The backup method. Only snapshot backup is supported. The value is fixed to <strong>Snapshot</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>Snapshot</p>
             */
            public Builder backupMethod(String backupMethod) {
                this.backupMethod = backupMethod;
                return this;
            }

            /**
             * <p>The backup mode. Valid values:</p>
             * <ul>
             * <li><p><strong>Automated</strong>: automated backup</p>
             * </li>
             * <li><p><strong>Manual</strong>: manual backup</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Manual</p>
             */
            public Builder backupMode(String backupMode) {
                this.backupMode = backupMode;
                return this;
            }

            /**
             * <p>The size of the backup set, in bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>4639948800</p>
             */
            public Builder backupSetSize(String backupSetSize) {
                this.backupSetSize = backupSetSize;
                return this;
            }

            /**
             * <p>The start time of the backup, in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-11-15T07:30:05Z</p>
             */
            public Builder backupStartTime(String backupStartTime) {
                this.backupStartTime = backupStartTime;
                return this;
            }

            /**
             * <p>The backup status. Valid values:</p>
             * <ul>
             * <li><p><strong>Success</strong>: The backup is complete.</p>
             * </li>
             * <li><p><strong>Failed</strong>: The backup failed.</p>
             * </li>
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
             * <p>The backup type. Only full backups are supported. The value is fixed to <strong>FullBackup</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>FullBackup</p>
             */
            public Builder backupType(String backupType) {
                this.backupType = backupType;
                return this;
            }

            /**
             * <p>The backup level. Valid values:</p>
             * <ul>
             * <li><p><strong>Level-1</strong>: Level-1 backup.</p>
             * </li>
             * <li><p><strong>Level-2</strong>: Level-2 backup.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Level-2</p>
             */
            public Builder backupsLevel(String backupsLevel) {
                this.backupsLevel = backupsLevel;
                return this;
            }

            /**
             * <p>The UNIX timestamp of the consistent snapshot, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1589253947</p>
             */
            public Builder consistentTime(String consistentTime) {
                this.consistentTime = consistentTime;
                return this;
            }

            /**
             * <p>The cluster ID.</p>
             * 
             * <strong>example:</strong>
             * <p>pc-****************</p>
             */
            public Builder DBClusterId(String DBClusterId) {
                this.DBClusterId = DBClusterId;
                return this;
            }

            /**
             * <p>The database engine type.</p>
             * 
             * <strong>example:</strong>
             * <p>MySQL</p>
             */
            public Builder DBType(String DBType) {
                this.DBType = DBType;
                return this;
            }

            /**
             * <p>The database engine version.</p>
             * 
             * <strong>example:</strong>
             * <p>5.6</p>
             */
            public Builder DBVersion(String DBVersion) {
                this.DBVersion = DBVersion;
                return this;
            }

            /**
             * <p>The billing method. Valid values:</p>
             * <ul>
             * <li><p><strong>Postpaid</strong>: pay-as-you-go.</p>
             * </li>
             * <li><p><strong>Prepaid</strong>: prepaid (subscription)</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Postpaid</p>
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hongzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The Serverless type. A value of <strong>AgileServerless</strong> indicates a Serverless cluster, while an empty value indicates a standard cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>AgileServerless</p>
             */
            public Builder serverlessType(String serverlessType) {
                this.serverlessType = serverlessType;
                return this;
            }

            /**
             * <p>The share type.</p>
             * 
             * <strong>example:</strong>
             * <p>ShareIncoming</p>
             */
            public Builder shareType(String shareType) {
                this.shareType = shareType;
                return this;
            }

            /**
             * <p>The UID of the account that shared the backup set.</p>
             * 
             * <strong>example:</strong>
             * <p>170*************</p>
             */
            public Builder sharerUID(String sharerUID) {
                this.sharerUID = sharerUID;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
