// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMigrationJobsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMigrationJobsResponseBody</p>
 */
public class DescribeMigrationJobsResponseBody extends TeaModel {
    @NameInMap("ErrCode")
    private String errCode;

    @NameInMap("ErrMessage")
    private String errMessage;

    @NameInMap("MigrationJobs")
    private MigrationJobs migrationJobs;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageRecordCount")
    private Integer pageRecordCount;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private String success;

    @NameInMap("TotalRecordCount")
    private Long totalRecordCount;

    private DescribeMigrationJobsResponseBody(Builder builder) {
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.migrationJobs = builder.migrationJobs;
        this.pageNumber = builder.pageNumber;
        this.pageRecordCount = builder.pageRecordCount;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMigrationJobsResponseBody create() {
        return builder().build();
    }

    /**
     * @return errCode
     */
    public String getErrCode() {
        return this.errCode;
    }

    /**
     * @return errMessage
     */
    public String getErrMessage() {
        return this.errMessage;
    }

    /**
     * @return migrationJobs
     */
    public MigrationJobs getMigrationJobs() {
        return this.migrationJobs;
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
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    /**
     * @return totalRecordCount
     */
    public Long getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static final class Builder {
        private String errCode; 
        private String errMessage; 
        private MigrationJobs migrationJobs; 
        private Integer pageNumber; 
        private Integer pageRecordCount; 
        private String requestId; 
        private String success; 
        private Long totalRecordCount; 

        /**
         * The error code returned if the call failed.
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * The error message returned if the call failed.
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * The list of data migration instances and the details of each instance.
         */
        public Builder migrationJobs(MigrationJobs migrationJobs) {
            this.migrationJobs = migrationJobs;
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
         * The maximum number of entries that can be displayed on the current page.
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
         * Indicates whether the call was successful.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        /**
         * The total number of data migration instances that belong to your Alibaba Cloud account.
         */
        public Builder totalRecordCount(Long totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeMigrationJobsResponseBody build() {
            return new DescribeMigrationJobsResponseBody(this);
        } 

    } 

    public static class DataInitialization extends TeaModel {
        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("Percent")
        private String percent;

        @NameInMap("Progress")
        private String progress;

        @NameInMap("status")
        private String status;

        private DataInitialization(Builder builder) {
            this.errorMessage = builder.errorMessage;
            this.percent = builder.percent;
            this.progress = builder.progress;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataInitialization create() {
            return builder().build();
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return percent
         */
        public String getPercent() {
            return this.percent;
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String errorMessage; 
            private String percent; 
            private String progress; 
            private String status; 

            /**
             * The error message returned if full data migration failed.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * The migration progress. Unit: %.
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * The number of records that have been migrated during full data migration.
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * The status of full data migration. Valid values:
             * <p>
             * 
             * *   **NotStarted**: Full data migration is not started.
             * *   **Migrating**: Full data migration is in progress.
             * *   **Failed**: Full data migration failed.
             * *   **Finished**: Full data migration is completed.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public DataInitialization build() {
                return new DataInitialization(this);
            } 

        } 

    }
    public static class DataSynchronization extends TeaModel {
        @NameInMap("Delay")
        private String delay;

        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("Percent")
        private String percent;

        @NameInMap("status")
        private String status;

        private DataSynchronization(Builder builder) {
            this.delay = builder.delay;
            this.errorMessage = builder.errorMessage;
            this.percent = builder.percent;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataSynchronization create() {
            return builder().build();
        }

        /**
         * @return delay
         */
        public String getDelay() {
            return this.delay;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return percent
         */
        public String getPercent() {
            return this.percent;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String delay; 
            private String errorMessage; 
            private String percent; 
            private String status; 

            /**
             * The latency of incremental data migration. Unit: seconds.
             */
            public Builder delay(String delay) {
                this.delay = delay;
                return this;
            }

            /**
             * The error message returned if incremental data migration failed.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * The progress of incremental data migration. Unit: %.
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * The status of incremental data migration. Valid values:
             * <p>
             * 
             * *   **NotStarted**: Incremental data migration is not started.
             * *   **Migrating**: Incremental data migration is in progress.
             * *   **Failed**: Incremental data migration failed.
             * *   **Finished**: Incremental data migration is completed.
             * *   **Catched**: Incremental data migration is not delayed.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public DataSynchronization build() {
                return new DataSynchronization(this);
            } 

        } 

    }
    public static class DestinationEndpoint extends TeaModel {
        @NameInMap("DatabaseName")
        private String databaseName;

        @NameInMap("EngineName")
        private String engineName;

        @NameInMap("IP")
        private String ip;

        @NameInMap("InstanceID")
        private String instanceID;

        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("OracleSID")
        private String oracleSID;

        @NameInMap("Port")
        private String port;

        @NameInMap("UserName")
        private String userName;

        private DestinationEndpoint(Builder builder) {
            this.databaseName = builder.databaseName;
            this.engineName = builder.engineName;
            this.ip = builder.ip;
            this.instanceID = builder.instanceID;
            this.instanceType = builder.instanceType;
            this.oracleSID = builder.oracleSID;
            this.port = builder.port;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DestinationEndpoint create() {
            return builder().build();
        }

        /**
         * @return databaseName
         */
        public String getDatabaseName() {
            return this.databaseName;
        }

        /**
         * @return engineName
         */
        public String getEngineName() {
            return this.engineName;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return instanceID
         */
        public String getInstanceID() {
            return this.instanceID;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return oracleSID
         */
        public String getOracleSID() {
            return this.oracleSID;
        }

        /**
         * @return port
         */
        public String getPort() {
            return this.port;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private String databaseName; 
            private String engineName; 
            private String ip; 
            private String instanceID; 
            private String instanceType; 
            private String oracleSID; 
            private String port; 
            private String userName; 

            /**
             * The name of the database to which the migration object in the destination instance belongs.
             */
            public Builder databaseName(String databaseName) {
                this.databaseName = databaseName;
                return this;
            }

            /**
             * The database type of the destination instance.
             */
            public Builder engineName(String engineName) {
                this.engineName = engineName;
                return this;
            }

            /**
             * The endpoint of the destination instance.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * The ID of the destination instance.
             */
            public Builder instanceID(String instanceID) {
                this.instanceID = instanceID;
                return this;
            }

            /**
             * The type of the destination instance.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * This parameter is returned only if the database type of the destination instance is **Oracle**.
             */
            public Builder oracleSID(String oracleSID) {
                this.oracleSID = oracleSID;
                return this;
            }

            /**
             * The database service port of the destination instance.
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * The database account of the destination instance.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public DestinationEndpoint build() {
                return new DestinationEndpoint(this);
            } 

        } 

    }
    public static class MigrationMode extends TeaModel {
        @NameInMap("DataInitialization")
        private Boolean dataInitialization;

        @NameInMap("DataSynchronization")
        private Boolean dataSynchronization;

        @NameInMap("StructureInitialization")
        private Boolean structureInitialization;

        private MigrationMode(Builder builder) {
            this.dataInitialization = builder.dataInitialization;
            this.dataSynchronization = builder.dataSynchronization;
            this.structureInitialization = builder.structureInitialization;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MigrationMode create() {
            return builder().build();
        }

        /**
         * @return dataInitialization
         */
        public Boolean getDataInitialization() {
            return this.dataInitialization;
        }

        /**
         * @return dataSynchronization
         */
        public Boolean getDataSynchronization() {
            return this.dataSynchronization;
        }

        /**
         * @return structureInitialization
         */
        public Boolean getStructureInitialization() {
            return this.structureInitialization;
        }

        public static final class Builder {
            private Boolean dataInitialization; 
            private Boolean dataSynchronization; 
            private Boolean structureInitialization; 

            /**
             * Indicates whether full data migration is performed. Valid values:
             * <p>
             * 
             * *   **true**: yes
             * *   **false**: no
             */
            public Builder dataInitialization(Boolean dataInitialization) {
                this.dataInitialization = dataInitialization;
                return this;
            }

            /**
             * Indicates whether incremental data migration is performed. Valid values:
             * <p>
             * 
             * *   **true**: yes
             * *   **false**: no
             */
            public Builder dataSynchronization(Boolean dataSynchronization) {
                this.dataSynchronization = dataSynchronization;
                return this;
            }

            /**
             * Indicates whether schema migration is performed. Valid values:
             * <p>
             * 
             * *   **true**: yes
             * *   **false**: no
             */
            public Builder structureInitialization(Boolean structureInitialization) {
                this.structureInitialization = structureInitialization;
                return this;
            }

            public MigrationMode build() {
                return new MigrationMode(this);
            } 

        } 

    }
    public static class TableList extends TeaModel {
        @NameInMap("Table")
        private java.util.List < String > table;

        private TableList(Builder builder) {
            this.table = builder.table;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TableList create() {
            return builder().build();
        }

        /**
         * @return table
         */
        public java.util.List < String > getTable() {
            return this.table;
        }

        public static final class Builder {
            private java.util.List < String > table; 

            /**
             * Table.
             */
            public Builder table(java.util.List < String > table) {
                this.table = table;
                return this;
            }

            public TableList build() {
                return new TableList(this);
            } 

        } 

    }
    public static class SynchronousObject extends TeaModel {
        @NameInMap("DatabaseName")
        private String databaseName;

        @NameInMap("TableList")
        private TableList tableList;

        @NameInMap("WholeDatabase")
        private String wholeDatabase;

        private SynchronousObject(Builder builder) {
            this.databaseName = builder.databaseName;
            this.tableList = builder.tableList;
            this.wholeDatabase = builder.wholeDatabase;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SynchronousObject create() {
            return builder().build();
        }

        /**
         * @return databaseName
         */
        public String getDatabaseName() {
            return this.databaseName;
        }

        /**
         * @return tableList
         */
        public TableList getTableList() {
            return this.tableList;
        }

        /**
         * @return wholeDatabase
         */
        public String getWholeDatabase() {
            return this.wholeDatabase;
        }

        public static final class Builder {
            private String databaseName; 
            private TableList tableList; 
            private String wholeDatabase; 

            /**
             * The name of the database to which the migration object in the source instance belongs.
             */
            public Builder databaseName(String databaseName) {
                this.databaseName = databaseName;
                return this;
            }

            /**
             * The names of the migrated tables.
             */
            public Builder tableList(TableList tableList) {
                this.tableList = tableList;
                return this;
            }

            /**
             * Indicates whether an entire database is migrated. Valid values:
             * <p>
             * 
             * *   **true**: yes
             * *   **false**: no
             */
            public Builder wholeDatabase(String wholeDatabase) {
                this.wholeDatabase = wholeDatabase;
                return this;
            }

            public SynchronousObject build() {
                return new SynchronousObject(this);
            } 

        } 

    }
    public static class MigrationObject extends TeaModel {
        @NameInMap("SynchronousObject")
        private java.util.List < SynchronousObject> synchronousObject;

        private MigrationObject(Builder builder) {
            this.synchronousObject = builder.synchronousObject;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MigrationObject create() {
            return builder().build();
        }

        /**
         * @return synchronousObject
         */
        public java.util.List < SynchronousObject> getSynchronousObject() {
            return this.synchronousObject;
        }

        public static final class Builder {
            private java.util.List < SynchronousObject> synchronousObject; 

            /**
             * SynchronousObject.
             */
            public Builder synchronousObject(java.util.List < SynchronousObject> synchronousObject) {
                this.synchronousObject = synchronousObject;
                return this;
            }

            public MigrationObject build() {
                return new MigrationObject(this);
            } 

        } 

    }
    public static class Precheck extends TeaModel {
        @NameInMap("Percent")
        private String percent;

        @NameInMap("Status")
        private String status;

        private Precheck(Builder builder) {
            this.percent = builder.percent;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Precheck create() {
            return builder().build();
        }

        /**
         * @return percent
         */
        public String getPercent() {
            return this.percent;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String percent; 
            private String status; 

            /**
             * The precheck progress. Unit: %.
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * The precheck result. Valid values:
             * <p>
             * 
             * *   **Success**: The task passed the precheck.
             * *   **Failed**: The task failed to pass the precheck.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Precheck build() {
                return new Precheck(this);
            } 

        } 

    }
    public static class SourceEndpoint extends TeaModel {
        @NameInMap("DatabaseName")
        private String databaseName;

        @NameInMap("EngineName")
        private String engineName;

        @NameInMap("IP")
        private String ip;

        @NameInMap("InstanceID")
        private String instanceID;

        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("OracleSID")
        private String oracleSID;

        @NameInMap("Port")
        private String port;

        @NameInMap("UserName")
        private String userName;

        private SourceEndpoint(Builder builder) {
            this.databaseName = builder.databaseName;
            this.engineName = builder.engineName;
            this.ip = builder.ip;
            this.instanceID = builder.instanceID;
            this.instanceType = builder.instanceType;
            this.oracleSID = builder.oracleSID;
            this.port = builder.port;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SourceEndpoint create() {
            return builder().build();
        }

        /**
         * @return databaseName
         */
        public String getDatabaseName() {
            return this.databaseName;
        }

        /**
         * @return engineName
         */
        public String getEngineName() {
            return this.engineName;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return instanceID
         */
        public String getInstanceID() {
            return this.instanceID;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return oracleSID
         */
        public String getOracleSID() {
            return this.oracleSID;
        }

        /**
         * @return port
         */
        public String getPort() {
            return this.port;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private String databaseName; 
            private String engineName; 
            private String ip; 
            private String instanceID; 
            private String instanceType; 
            private String oracleSID; 
            private String port; 
            private String userName; 

            /**
             * The name of the database to which the migration object in the source instance belongs.
             */
            public Builder databaseName(String databaseName) {
                this.databaseName = databaseName;
                return this;
            }

            /**
             * The database type of the source instance.
             */
            public Builder engineName(String engineName) {
                this.engineName = engineName;
                return this;
            }

            /**
             * The endpoint of the source instance.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * The ID of the source instance.
             */
            public Builder instanceID(String instanceID) {
                this.instanceID = instanceID;
                return this;
            }

            /**
             * The type of the source instance.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * This parameter is returned only if the database type of the source instance is **Oracle**.
             */
            public Builder oracleSID(String oracleSID) {
                this.oracleSID = oracleSID;
                return this;
            }

            /**
             * The database service port of the source instance.
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * The database account of the source instance.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public SourceEndpoint build() {
                return new SourceEndpoint(this);
            } 

        } 

    }
    public static class StructureInitialization extends TeaModel {
        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("Percent")
        private String percent;

        @NameInMap("Progress")
        private String progress;

        @NameInMap("status")
        private String status;

        private StructureInitialization(Builder builder) {
            this.errorMessage = builder.errorMessage;
            this.percent = builder.percent;
            this.progress = builder.progress;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StructureInitialization create() {
            return builder().build();
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return percent
         */
        public String getPercent() {
            return this.percent;
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String errorMessage; 
            private String percent; 
            private String progress; 
            private String status; 

            /**
             * The error message returned if schema migration failed.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * The progress of schema migration. Unit: %.
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * The number of tables whose schemas have been migrated.
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * The status of schema migration. Valid values:
             * <p>
             * 
             * *   **NotStarted**: Schema migration is not started.
             * *   **Migrating**: Schema migration is in progress.
             * *   **Failed**: Schema migration failed.
             * *   **Finished**: Schema migration is completed.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public StructureInitialization build() {
                return new StructureInitialization(this);
            } 

        } 

    }
    public static class Tag extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * The tag key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value that corresponds to the tag key.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
    public static class Tags extends TeaModel {
        @NameInMap("Tag")
        private java.util.List < Tag> tag;

        private Tags(Builder builder) {
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tag
         */
        public java.util.List < Tag> getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List < Tag> tag; 

            /**
             * Tag.
             */
            public Builder tag(java.util.List < Tag> tag) {
                this.tag = tag;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    public static class MigrationJob extends TeaModel {
        @NameInMap("DataInitialization")
        private DataInitialization dataInitialization;

        @NameInMap("DataSynchronization")
        private DataSynchronization dataSynchronization;

        @NameInMap("DestinationEndpoint")
        private DestinationEndpoint destinationEndpoint;

        @NameInMap("InstanceCreateTime")
        private String instanceCreateTime;

        @NameInMap("JobCreateTime")
        private String jobCreateTime;

        @NameInMap("MigrationJobClass")
        private String migrationJobClass;

        @NameInMap("MigrationJobID")
        private String migrationJobID;

        @NameInMap("MigrationJobName")
        private String migrationJobName;

        @NameInMap("MigrationJobStatus")
        private String migrationJobStatus;

        @NameInMap("MigrationMode")
        private MigrationMode migrationMode;

        @NameInMap("MigrationObject")
        private MigrationObject migrationObject;

        @NameInMap("PayType")
        private String payType;

        @NameInMap("Precheck")
        private Precheck precheck;

        @NameInMap("SourceEndpoint")
        private SourceEndpoint sourceEndpoint;

        @NameInMap("StructureInitialization")
        private StructureInitialization structureInitialization;

        @NameInMap("Tags")
        private Tags tags;

        private MigrationJob(Builder builder) {
            this.dataInitialization = builder.dataInitialization;
            this.dataSynchronization = builder.dataSynchronization;
            this.destinationEndpoint = builder.destinationEndpoint;
            this.instanceCreateTime = builder.instanceCreateTime;
            this.jobCreateTime = builder.jobCreateTime;
            this.migrationJobClass = builder.migrationJobClass;
            this.migrationJobID = builder.migrationJobID;
            this.migrationJobName = builder.migrationJobName;
            this.migrationJobStatus = builder.migrationJobStatus;
            this.migrationMode = builder.migrationMode;
            this.migrationObject = builder.migrationObject;
            this.payType = builder.payType;
            this.precheck = builder.precheck;
            this.sourceEndpoint = builder.sourceEndpoint;
            this.structureInitialization = builder.structureInitialization;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MigrationJob create() {
            return builder().build();
        }

        /**
         * @return dataInitialization
         */
        public DataInitialization getDataInitialization() {
            return this.dataInitialization;
        }

        /**
         * @return dataSynchronization
         */
        public DataSynchronization getDataSynchronization() {
            return this.dataSynchronization;
        }

        /**
         * @return destinationEndpoint
         */
        public DestinationEndpoint getDestinationEndpoint() {
            return this.destinationEndpoint;
        }

        /**
         * @return instanceCreateTime
         */
        public String getInstanceCreateTime() {
            return this.instanceCreateTime;
        }

        /**
         * @return jobCreateTime
         */
        public String getJobCreateTime() {
            return this.jobCreateTime;
        }

        /**
         * @return migrationJobClass
         */
        public String getMigrationJobClass() {
            return this.migrationJobClass;
        }

        /**
         * @return migrationJobID
         */
        public String getMigrationJobID() {
            return this.migrationJobID;
        }

        /**
         * @return migrationJobName
         */
        public String getMigrationJobName() {
            return this.migrationJobName;
        }

        /**
         * @return migrationJobStatus
         */
        public String getMigrationJobStatus() {
            return this.migrationJobStatus;
        }

        /**
         * @return migrationMode
         */
        public MigrationMode getMigrationMode() {
            return this.migrationMode;
        }

        /**
         * @return migrationObject
         */
        public MigrationObject getMigrationObject() {
            return this.migrationObject;
        }

        /**
         * @return payType
         */
        public String getPayType() {
            return this.payType;
        }

        /**
         * @return precheck
         */
        public Precheck getPrecheck() {
            return this.precheck;
        }

        /**
         * @return sourceEndpoint
         */
        public SourceEndpoint getSourceEndpoint() {
            return this.sourceEndpoint;
        }

        /**
         * @return structureInitialization
         */
        public StructureInitialization getStructureInitialization() {
            return this.structureInitialization;
        }

        /**
         * @return tags
         */
        public Tags getTags() {
            return this.tags;
        }

        public static final class Builder {
            private DataInitialization dataInitialization; 
            private DataSynchronization dataSynchronization; 
            private DestinationEndpoint destinationEndpoint; 
            private String instanceCreateTime; 
            private String jobCreateTime; 
            private String migrationJobClass; 
            private String migrationJobID; 
            private String migrationJobName; 
            private String migrationJobStatus; 
            private MigrationMode migrationMode; 
            private MigrationObject migrationObject; 
            private String payType; 
            private Precheck precheck; 
            private SourceEndpoint sourceEndpoint; 
            private StructureInitialization structureInitialization; 
            private Tags tags; 

            /**
             * The details of full data migration.
             */
            public Builder dataInitialization(DataInitialization dataInitialization) {
                this.dataInitialization = dataInitialization;
                return this;
            }

            /**
             * The details of incremental data migration.
             */
            public Builder dataSynchronization(DataSynchronization dataSynchronization) {
                this.dataSynchronization = dataSynchronization;
                return this;
            }

            /**
             * The connection settings of the destination instance.
             */
            public Builder destinationEndpoint(DestinationEndpoint destinationEndpoint) {
                this.destinationEndpoint = destinationEndpoint;
                return this;
            }

            /**
             * The time when the data migration instance was created. The time is displayed in the *yyyy-MM-dd*T*HH:mm:ss*Z format in UTC.
             */
            public Builder instanceCreateTime(String instanceCreateTime) {
                this.instanceCreateTime = instanceCreateTime;
                return this;
            }

            /**
             * The time when the data migration task was created. The time is displayed in the *yyyy-MM-dd*T*HH:mm:ss*Z format in UTC.
             */
            public Builder jobCreateTime(String jobCreateTime) {
                this.jobCreateTime = jobCreateTime;
                return this;
            }

            /**
             * The specification of the data migration instance. Valid values: **small**, **medium**, **large**, **xlarge**, and **2xlarge**. For more information, see [Specifications of data migration instances](~~26606~~).
             */
            public Builder migrationJobClass(String migrationJobClass) {
                this.migrationJobClass = migrationJobClass;
                return this;
            }

            /**
             * The ID of the data migration instance.
             */
            public Builder migrationJobID(String migrationJobID) {
                this.migrationJobID = migrationJobID;
                return this;
            }

            /**
             * The name of the data migration task.
             */
            public Builder migrationJobName(String migrationJobName) {
                this.migrationJobName = migrationJobName;
                return this;
            }

            /**
             * The status of the data migration task. Valid values:
             * <p>
             * 
             * *   **NotStarted**: The task is not started.
             * *   **Prechecking**: The task is being prechecked.
             * *   **PrecheckFailed**: The task failed to pass the precheck.
             * *   **Migrating**: The task is migrating data.
             * *   **Suspending**: The task is paused.
             * *   **MigrationFailed**: The task failed to migrate data.
             * *   **Finished**: The task is completed.
             */
            public Builder migrationJobStatus(String migrationJobStatus) {
                this.migrationJobStatus = migrationJobStatus;
                return this;
            }

            /**
             * The migration types.
             */
            public Builder migrationMode(MigrationMode migrationMode) {
                this.migrationMode = migrationMode;
                return this;
            }

            /**
             * The objects that are migrated by the task.
             */
            public Builder migrationObject(MigrationObject migrationObject) {
                this.migrationObject = migrationObject;
                return this;
            }

            /**
             * The billing method of the data migration instance. The value is **PostPaid** (pay-as-you-go).
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            /**
             * The precheck details.
             */
            public Builder precheck(Precheck precheck) {
                this.precheck = precheck;
                return this;
            }

            /**
             * The connection settings of the source instance.
             */
            public Builder sourceEndpoint(SourceEndpoint sourceEndpoint) {
                this.sourceEndpoint = sourceEndpoint;
                return this;
            }

            /**
             * The details of schema migration.
             */
            public Builder structureInitialization(StructureInitialization structureInitialization) {
                this.structureInitialization = structureInitialization;
                return this;
            }

            /**
             * The collection of tags.
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            public MigrationJob build() {
                return new MigrationJob(this);
            } 

        } 

    }
    public static class MigrationJobs extends TeaModel {
        @NameInMap("MigrationJob")
        private java.util.List < MigrationJob> migrationJob;

        private MigrationJobs(Builder builder) {
            this.migrationJob = builder.migrationJob;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MigrationJobs create() {
            return builder().build();
        }

        /**
         * @return migrationJob
         */
        public java.util.List < MigrationJob> getMigrationJob() {
            return this.migrationJob;
        }

        public static final class Builder {
            private java.util.List < MigrationJob> migrationJob; 

            /**
             * MigrationJob.
             */
            public Builder migrationJob(java.util.List < MigrationJob> migrationJob) {
                this.migrationJob = migrationJob;
                return this;
            }

            public MigrationJobs build() {
                return new MigrationJobs(this);
            } 

        } 

    }
}
