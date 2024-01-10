// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDataBackupSetResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDataBackupSetResponseBody</p>
 */
public class DescribeDataBackupSetResponseBody extends TeaModel {
    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeDataBackupSetResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDataBackupSetResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
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
        private java.util.List < Data> data; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
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

        public DescribeDataBackupSetResponseBody build() {
            return new DescribeDataBackupSetResponseBody(this);
        } 

    } 

    public static class DatabaseTablesList extends TeaModel {
        @NameInMap("Database")
        private String database;

        @NameInMap("Tables")
        private java.util.List < String > tables;

        private DatabaseTablesList(Builder builder) {
            this.database = builder.database;
            this.tables = builder.tables;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DatabaseTablesList create() {
            return builder().build();
        }

        /**
         * @return database
         */
        public String getDatabase() {
            return this.database;
        }

        /**
         * @return tables
         */
        public java.util.List < String > getTables() {
            return this.tables;
        }

        public static final class Builder {
            private String database; 
            private java.util.List < String > tables; 

            /**
             * Database.
             */
            public Builder database(String database) {
                this.database = database;
                return this;
            }

            /**
             * Tables.
             */
            public Builder tables(java.util.List < String > tables) {
                this.tables = tables;
                return this;
            }

            public DatabaseTablesList build() {
                return new DatabaseTablesList(this);
            } 

        } 

    }
    public static class BackupObjects extends TeaModel {
        @NameInMap("ClusterName")
        private String clusterName;

        @NameInMap("DatabaseTablesList")
        private java.util.List < DatabaseTablesList> databaseTablesList;

        @NameInMap("TenantName")
        private String tenantName;

        private BackupObjects(Builder builder) {
            this.clusterName = builder.clusterName;
            this.databaseTablesList = builder.databaseTablesList;
            this.tenantName = builder.tenantName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BackupObjects create() {
            return builder().build();
        }

        /**
         * @return clusterName
         */
        public String getClusterName() {
            return this.clusterName;
        }

        /**
         * @return databaseTablesList
         */
        public java.util.List < DatabaseTablesList> getDatabaseTablesList() {
            return this.databaseTablesList;
        }

        /**
         * @return tenantName
         */
        public String getTenantName() {
            return this.tenantName;
        }

        public static final class Builder {
            private String clusterName; 
            private java.util.List < DatabaseTablesList> databaseTablesList; 
            private String tenantName; 

            /**
             * ClusterName.
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * DatabaseTablesList.
             */
            public Builder databaseTablesList(java.util.List < DatabaseTablesList> databaseTablesList) {
                this.databaseTablesList = databaseTablesList;
                return this;
            }

            /**
             * TenantName.
             */
            public Builder tenantName(String tenantName) {
                this.tenantName = tenantName;
                return this;
            }

            public BackupObjects build() {
                return new BackupObjects(this);
            } 

        } 

    }
    public static class TableBackupResults extends TeaModel {
        @NameInMap("Database")
        private String database;

        @NameInMap("Message")
        private String message;

        @NameInMap("Status")
        private String status;

        @NameInMap("Table")
        private String table;

        private TableBackupResults(Builder builder) {
            this.database = builder.database;
            this.message = builder.message;
            this.status = builder.status;
            this.table = builder.table;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TableBackupResults create() {
            return builder().build();
        }

        /**
         * @return database
         */
        public String getDatabase() {
            return this.database;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return table
         */
        public String getTable() {
            return this.table;
        }

        public static final class Builder {
            private String database; 
            private String message; 
            private String status; 
            private String table; 

            /**
             * Database.
             */
            public Builder database(String database) {
                this.database = database;
                return this;
            }

            /**
             * Message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Table.
             */
            public Builder table(String table) {
                this.table = table;
                return this;
            }

            public TableBackupResults build() {
                return new TableBackupResults(this);
            } 

        } 

    }
    public static class BackupResults extends TeaModel {
        @NameInMap("ClusterName")
        private String clusterName;

        @NameInMap("TableBackupResults")
        private java.util.List < TableBackupResults> tableBackupResults;

        @NameInMap("TenantName")
        private String tenantName;

        private BackupResults(Builder builder) {
            this.clusterName = builder.clusterName;
            this.tableBackupResults = builder.tableBackupResults;
            this.tenantName = builder.tenantName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BackupResults create() {
            return builder().build();
        }

        /**
         * @return clusterName
         */
        public String getClusterName() {
            return this.clusterName;
        }

        /**
         * @return tableBackupResults
         */
        public java.util.List < TableBackupResults> getTableBackupResults() {
            return this.tableBackupResults;
        }

        /**
         * @return tenantName
         */
        public String getTenantName() {
            return this.tenantName;
        }

        public static final class Builder {
            private String clusterName; 
            private java.util.List < TableBackupResults> tableBackupResults; 
            private String tenantName; 

            /**
             * ClusterName.
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * TableBackupResults.
             */
            public Builder tableBackupResults(java.util.List < TableBackupResults> tableBackupResults) {
                this.tableBackupResults = tableBackupResults;
                return this;
            }

            /**
             * TenantName.
             */
            public Builder tenantName(String tenantName) {
                this.tenantName = tenantName;
                return this;
            }

            public BackupResults build() {
                return new BackupResults(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("BackupObjectType")
        private String backupObjectType;

        @NameInMap("BackupObjects")
        private java.util.List < BackupObjects> backupObjects;

        @NameInMap("BackupResults")
        private java.util.List < BackupResults> backupResults;

        @NameInMap("Checkpoint")
        private String checkpoint;

        @NameInMap("DataSize")
        private Integer dataSize;

        @NameInMap("DataVersion")
        private Integer dataVersion;

        @NameInMap("DownloadTaskId")
        private Long downloadTaskId;

        @NameInMap("DownloadTaskStatus")
        private String downloadTaskStatus;

        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("Method")
        private String method;

        @NameInMap("Policy")
        private String policy;

        @NameInMap("Progress")
        private String progress;

        @NameInMap("SetId")
        private Integer setId;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("Status")
        private String status;

        @NameInMap("StorageClass")
        private String storageClass;

        @NameInMap("Type")
        private String type;

        @NameInMap("Validity")
        private String validity;

        private Data(Builder builder) {
            this.backupObjectType = builder.backupObjectType;
            this.backupObjects = builder.backupObjects;
            this.backupResults = builder.backupResults;
            this.checkpoint = builder.checkpoint;
            this.dataSize = builder.dataSize;
            this.dataVersion = builder.dataVersion;
            this.downloadTaskId = builder.downloadTaskId;
            this.downloadTaskStatus = builder.downloadTaskStatus;
            this.endTime = builder.endTime;
            this.method = builder.method;
            this.policy = builder.policy;
            this.progress = builder.progress;
            this.setId = builder.setId;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.storageClass = builder.storageClass;
            this.type = builder.type;
            this.validity = builder.validity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return backupObjectType
         */
        public String getBackupObjectType() {
            return this.backupObjectType;
        }

        /**
         * @return backupObjects
         */
        public java.util.List < BackupObjects> getBackupObjects() {
            return this.backupObjects;
        }

        /**
         * @return backupResults
         */
        public java.util.List < BackupResults> getBackupResults() {
            return this.backupResults;
        }

        /**
         * @return checkpoint
         */
        public String getCheckpoint() {
            return this.checkpoint;
        }

        /**
         * @return dataSize
         */
        public Integer getDataSize() {
            return this.dataSize;
        }

        /**
         * @return dataVersion
         */
        public Integer getDataVersion() {
            return this.dataVersion;
        }

        /**
         * @return downloadTaskId
         */
        public Long getDownloadTaskId() {
            return this.downloadTaskId;
        }

        /**
         * @return downloadTaskStatus
         */
        public String getDownloadTaskStatus() {
            return this.downloadTaskStatus;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return method
         */
        public String getMethod() {
            return this.method;
        }

        /**
         * @return policy
         */
        public String getPolicy() {
            return this.policy;
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        /**
         * @return setId
         */
        public Integer getSetId() {
            return this.setId;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return storageClass
         */
        public String getStorageClass() {
            return this.storageClass;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return validity
         */
        public String getValidity() {
            return this.validity;
        }

        public static final class Builder {
            private String backupObjectType; 
            private java.util.List < BackupObjects> backupObjects; 
            private java.util.List < BackupResults> backupResults; 
            private String checkpoint; 
            private Integer dataSize; 
            private Integer dataVersion; 
            private Long downloadTaskId; 
            private String downloadTaskStatus; 
            private String endTime; 
            private String method; 
            private String policy; 
            private String progress; 
            private Integer setId; 
            private String startTime; 
            private String status; 
            private String storageClass; 
            private String type; 
            private String validity; 

            /**
             * BackupObjectType.
             */
            public Builder backupObjectType(String backupObjectType) {
                this.backupObjectType = backupObjectType;
                return this;
            }

            /**
             * BackupObjects.
             */
            public Builder backupObjects(java.util.List < BackupObjects> backupObjects) {
                this.backupObjects = backupObjects;
                return this;
            }

            /**
             * BackupResults.
             */
            public Builder backupResults(java.util.List < BackupResults> backupResults) {
                this.backupResults = backupResults;
                return this;
            }

            /**
             * Checkpoint.
             */
            public Builder checkpoint(String checkpoint) {
                this.checkpoint = checkpoint;
                return this;
            }

            /**
             * DataSize.
             */
            public Builder dataSize(Integer dataSize) {
                this.dataSize = dataSize;
                return this;
            }

            /**
             * DataVersion.
             */
            public Builder dataVersion(Integer dataVersion) {
                this.dataVersion = dataVersion;
                return this;
            }

            /**
             * DownloadTaskId.
             */
            public Builder downloadTaskId(Long downloadTaskId) {
                this.downloadTaskId = downloadTaskId;
                return this;
            }

            /**
             * DownloadTaskStatus.
             */
            public Builder downloadTaskStatus(String downloadTaskStatus) {
                this.downloadTaskStatus = downloadTaskStatus;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * Method.
             */
            public Builder method(String method) {
                this.method = method;
                return this;
            }

            /**
             * Policy.
             */
            public Builder policy(String policy) {
                this.policy = policy;
                return this;
            }

            /**
             * Progress.
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * SetId.
             */
            public Builder setId(Integer setId) {
                this.setId = setId;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * StorageClass.
             */
            public Builder storageClass(String storageClass) {
                this.storageClass = storageClass;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Validity.
             */
            public Builder validity(String validity) {
                this.validity = validity;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
