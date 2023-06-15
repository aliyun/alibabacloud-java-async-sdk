// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMigrateTasksResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMigrateTasksResponseBody</p>
 */
public class DescribeMigrateTasksResponseBody extends TeaModel {
    @NameInMap("DBInstanceId")
    private String DBInstanceId;

    @NameInMap("Items")
    private Items items;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageRecordCount")
    private Integer pageRecordCount;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalRecordCount")
    private Integer totalRecordCount;

    private DescribeMigrateTasksResponseBody(Builder builder) {
        this.DBInstanceId = builder.DBInstanceId;
        this.items = builder.items;
        this.pageNumber = builder.pageNumber;
        this.pageRecordCount = builder.pageRecordCount;
        this.requestId = builder.requestId;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMigrateTasksResponseBody create() {
        return builder().build();
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
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
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageRecordCount
     */
    public Integer getPageRecordCount() {
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
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static final class Builder {
        private String DBInstanceId; 
        private Items items; 
        private Integer pageNumber; 
        private Integer pageRecordCount; 
        private String requestId; 
        private Integer totalRecordCount; 

        /**
         * The ID of the instance.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * The details of the migration task.
         */
        public Builder items(Items items) {
            this.items = items;
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
         * The number of entries returned per page.
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
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
         * The total number of entries returned.
         */
        public Builder totalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeMigrateTasksResponseBody build() {
            return new DescribeMigrateTasksResponseBody(this);
        } 

    } 

    public static class MigrateTask extends TeaModel {
        @NameInMap("BackupMode")
        private String backupMode;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("DBName")
        private String DBName;

        @NameInMap("Description")
        private String description;

        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("IsDBReplaced")
        private String isDBReplaced;

        @NameInMap("MigrateTaskId")
        private String migrateTaskId;

        @NameInMap("Status")
        private String status;

        private MigrateTask(Builder builder) {
            this.backupMode = builder.backupMode;
            this.createTime = builder.createTime;
            this.DBName = builder.DBName;
            this.description = builder.description;
            this.endTime = builder.endTime;
            this.isDBReplaced = builder.isDBReplaced;
            this.migrateTaskId = builder.migrateTaskId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MigrateTask create() {
            return builder().build();
        }

        /**
         * @return backupMode
         */
        public String getBackupMode() {
            return this.backupMode;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return DBName
         */
        public String getDBName() {
            return this.DBName;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return isDBReplaced
         */
        public String getIsDBReplaced() {
            return this.isDBReplaced;
        }

        /**
         * @return migrateTaskId
         */
        public String getMigrateTaskId() {
            return this.migrateTaskId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String backupMode; 
            private String createTime; 
            private String DBName; 
            private String description; 
            private String endTime; 
            private String isDBReplaced; 
            private String migrateTaskId; 
            private String status; 

            /**
             * The type of the migration task. Valid values:
             * <p>
             * 
             * *   **FULL**: The migration task migrates full backup files that can be used to restore the full data of the instance.
             * *   **UPDF**: The migration task migrates incremental or log backup files that can be used to restore the incremental data of the instance.
             */
            public Builder backupMode(String backupMode) {
                this.backupMode = backupMode;
                return this;
            }

            /**
             * The time when the migration task was created. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The name of the database.
             */
            public Builder DBName(String DBName) {
                this.DBName = DBName;
                return this;
            }

            /**
             * The description of the migration task.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The time when the migration task was completed. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * Indicates whether the imported data overwrites the existing data.
             */
            public Builder isDBReplaced(String isDBReplaced) {
                this.isDBReplaced = isDBReplaced;
                return this;
            }

            /**
             * The ID of the migration task.
             */
            public Builder migrateTaskId(String migrateTaskId) {
                this.migrateTaskId = migrateTaskId;
                return this;
            }

            /**
             * The status of the migration task. Valid values:
             * <p>
             * 
             * *   **NoStart**: The task is not started.
             * *   **Running**:The task is in progress.
             * *   **Success**: The task is successful.
             * *   **Failed**: The task failed.
             * *   **Waiting**: The task is waiting for an incremental backup file to be imported.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public MigrateTask build() {
                return new MigrateTask(this);
            } 

        } 

    }
    public static class Items extends TeaModel {
        @NameInMap("MigrateTask")
        private java.util.List < MigrateTask> migrateTask;

        private Items(Builder builder) {
            this.migrateTask = builder.migrateTask;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return migrateTask
         */
        public java.util.List < MigrateTask> getMigrateTask() {
            return this.migrateTask;
        }

        public static final class Builder {
            private java.util.List < MigrateTask> migrateTask; 

            /**
             * MigrateTask.
             */
            public Builder migrateTask(java.util.List < MigrateTask> migrateTask) {
                this.migrateTask = migrateTask;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
