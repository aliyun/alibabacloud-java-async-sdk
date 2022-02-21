// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDataBackupsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDataBackupsResponseBody</p>
 */
public class DescribeDataBackupsResponseBody extends TeaModel {
    @NameInMap("Items")
    private java.util.List < Items> items;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeDataBackupsResponseBody(Builder builder) {
        this.items = builder.items;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDataBackupsResponseBody create() {
        return builder().build();
    }

    /**
     * @return items
     */
    public java.util.List < Items> getItems() {
        return this.items;
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
        private java.util.List < Items> items; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * Items.
         */
        public Builder items(java.util.List < Items> items) {
            this.items = items;
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

        public DescribeDataBackupsResponseBody build() {
            return new DescribeDataBackupsResponseBody(this);
        } 

    } 

    public static class Items extends TeaModel {
        @NameInMap("BackupEndTime")
        private String backupEndTime;

        @NameInMap("BackupEndTimeLocal")
        private String backupEndTimeLocal;

        @NameInMap("BackupMode")
        private String backupMode;

        @NameInMap("BackupSetId")
        private String backupSetId;

        @NameInMap("BackupSize")
        private Long backupSize;

        @NameInMap("BackupStartTime")
        private String backupStartTime;

        @NameInMap("BackupStartTimeLocal")
        private String backupStartTimeLocal;

        @NameInMap("BackupStatus")
        private String backupStatus;

        @NameInMap("BaksetName")
        private String baksetName;

        @NameInMap("ConsistentTime")
        private Long consistentTime;

        @NameInMap("DBInstanceId")
        private String DBInstanceId;

        @NameInMap("DataType")
        private String dataType;

        private Items(Builder builder) {
            this.backupEndTime = builder.backupEndTime;
            this.backupEndTimeLocal = builder.backupEndTimeLocal;
            this.backupMode = builder.backupMode;
            this.backupSetId = builder.backupSetId;
            this.backupSize = builder.backupSize;
            this.backupStartTime = builder.backupStartTime;
            this.backupStartTimeLocal = builder.backupStartTimeLocal;
            this.backupStatus = builder.backupStatus;
            this.baksetName = builder.baksetName;
            this.consistentTime = builder.consistentTime;
            this.DBInstanceId = builder.DBInstanceId;
            this.dataType = builder.dataType;
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
         * @return backupEndTimeLocal
         */
        public String getBackupEndTimeLocal() {
            return this.backupEndTimeLocal;
        }

        /**
         * @return backupMode
         */
        public String getBackupMode() {
            return this.backupMode;
        }

        /**
         * @return backupSetId
         */
        public String getBackupSetId() {
            return this.backupSetId;
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
         * @return backupStartTimeLocal
         */
        public String getBackupStartTimeLocal() {
            return this.backupStartTimeLocal;
        }

        /**
         * @return backupStatus
         */
        public String getBackupStatus() {
            return this.backupStatus;
        }

        /**
         * @return baksetName
         */
        public String getBaksetName() {
            return this.baksetName;
        }

        /**
         * @return consistentTime
         */
        public Long getConsistentTime() {
            return this.consistentTime;
        }

        /**
         * @return DBInstanceId
         */
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        /**
         * @return dataType
         */
        public String getDataType() {
            return this.dataType;
        }

        public static final class Builder {
            private String backupEndTime; 
            private String backupEndTimeLocal; 
            private String backupMode; 
            private String backupSetId; 
            private Long backupSize; 
            private String backupStartTime; 
            private String backupStartTimeLocal; 
            private String backupStatus; 
            private String baksetName; 
            private Long consistentTime; 
            private String DBInstanceId; 
            private String dataType; 

            /**
             * BackupEndTime.
             */
            public Builder backupEndTime(String backupEndTime) {
                this.backupEndTime = backupEndTime;
                return this;
            }

            /**
             * BackupEndTimeLocal.
             */
            public Builder backupEndTimeLocal(String backupEndTimeLocal) {
                this.backupEndTimeLocal = backupEndTimeLocal;
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
             * BackupSetId.
             */
            public Builder backupSetId(String backupSetId) {
                this.backupSetId = backupSetId;
                return this;
            }

            /**
             * BackupSize.
             */
            public Builder backupSize(Long backupSize) {
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
             * BackupStartTimeLocal.
             */
            public Builder backupStartTimeLocal(String backupStartTimeLocal) {
                this.backupStartTimeLocal = backupStartTimeLocal;
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
             * BaksetName.
             */
            public Builder baksetName(String baksetName) {
                this.baksetName = baksetName;
                return this;
            }

            /**
             * ConsistentTime.
             */
            public Builder consistentTime(Long consistentTime) {
                this.consistentTime = consistentTime;
                return this;
            }

            /**
             * DBInstanceId.
             */
            public Builder DBInstanceId(String DBInstanceId) {
                this.DBInstanceId = DBInstanceId;
                return this;
            }

            /**
             * DataType.
             */
            public Builder dataType(String dataType) {
                this.dataType = dataType;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
