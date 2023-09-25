// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20160801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescirbeMigrationJobsResponseBody} extends {@link TeaModel}
 *
 * <p>DescirbeMigrationJobsResponseBody</p>
 */
public class DescirbeMigrationJobsResponseBody extends TeaModel {
    @NameInMap("MigrationJobs")
    private MigrationJobs migrationJobs;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageRecordCount")
    private Integer pageRecordCount;

    @NameInMap("TotalRecordCount")
    private Long totalRecordCount;

    private DescirbeMigrationJobsResponseBody(Builder builder) {
        this.migrationJobs = builder.migrationJobs;
        this.pageNumber = builder.pageNumber;
        this.pageRecordCount = builder.pageRecordCount;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescirbeMigrationJobsResponseBody create() {
        return builder().build();
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
     * @return totalRecordCount
     */
    public Long getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static final class Builder {
        private MigrationJobs migrationJobs; 
        private Integer pageNumber; 
        private Integer pageRecordCount; 
        private Long totalRecordCount; 

        /**
         * MigrationJobs.
         */
        public Builder migrationJobs(MigrationJobs migrationJobs) {
            this.migrationJobs = migrationJobs;
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
         * PageRecordCount.
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * TotalRecordCount.
         */
        public Builder totalRecordCount(Long totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescirbeMigrationJobsResponseBody build() {
            return new DescirbeMigrationJobsResponseBody(this);
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
             * ErrorMessage.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * Percent.
             */
            public Builder percent(String percent) {
                this.percent = percent;
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
             * status.
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
             * Delay.
             */
            public Builder delay(String delay) {
                this.delay = delay;
                return this;
            }

            /**
             * ErrorMessage.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * Percent.
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * status.
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
             * DatabaseName.
             */
            public Builder databaseName(String databaseName) {
                this.databaseName = databaseName;
                return this;
            }

            /**
             * EngineName.
             */
            public Builder engineName(String engineName) {
                this.engineName = engineName;
                return this;
            }

            /**
             * IP.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * InstanceID.
             */
            public Builder instanceID(String instanceID) {
                this.instanceID = instanceID;
                return this;
            }

            /**
             * InstanceType.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * OracleSID.
             */
            public Builder oracleSID(String oracleSID) {
                this.oracleSID = oracleSID;
                return this;
            }

            /**
             * Port.
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * UserName.
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
             * DataInitialization.
             */
            public Builder dataInitialization(Boolean dataInitialization) {
                this.dataInitialization = dataInitialization;
                return this;
            }

            /**
             * DataSynchronization.
             */
            public Builder dataSynchronization(Boolean dataSynchronization) {
                this.dataSynchronization = dataSynchronization;
                return this;
            }

            /**
             * StructureInitialization.
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
             * DatabaseName.
             */
            public Builder databaseName(String databaseName) {
                this.databaseName = databaseName;
                return this;
            }

            /**
             * TableList.
             */
            public Builder tableList(TableList tableList) {
                this.tableList = tableList;
                return this;
            }

            /**
             * WholeDatabase.
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
             * Percent.
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * Status.
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
             * DatabaseName.
             */
            public Builder databaseName(String databaseName) {
                this.databaseName = databaseName;
                return this;
            }

            /**
             * EngineName.
             */
            public Builder engineName(String engineName) {
                this.engineName = engineName;
                return this;
            }

            /**
             * IP.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * InstanceID.
             */
            public Builder instanceID(String instanceID) {
                this.instanceID = instanceID;
                return this;
            }

            /**
             * InstanceType.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * OracleSID.
             */
            public Builder oracleSID(String oracleSID) {
                this.oracleSID = oracleSID;
                return this;
            }

            /**
             * Port.
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * UserName.
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
             * ErrorMessage.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * Percent.
             */
            public Builder percent(String percent) {
                this.percent = percent;
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
             * status.
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
    public static class MigrationJob extends TeaModel {
        @NameInMap("DataInitialization")
        private DataInitialization dataInitialization;

        @NameInMap("DataSynchronization")
        private DataSynchronization dataSynchronization;

        @NameInMap("DestinationEndpoint")
        private DestinationEndpoint destinationEndpoint;

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

        private MigrationJob(Builder builder) {
            this.dataInitialization = builder.dataInitialization;
            this.dataSynchronization = builder.dataSynchronization;
            this.destinationEndpoint = builder.destinationEndpoint;
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

        public static final class Builder {
            private DataInitialization dataInitialization; 
            private DataSynchronization dataSynchronization; 
            private DestinationEndpoint destinationEndpoint; 
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

            /**
             * DataInitialization.
             */
            public Builder dataInitialization(DataInitialization dataInitialization) {
                this.dataInitialization = dataInitialization;
                return this;
            }

            /**
             * DataSynchronization.
             */
            public Builder dataSynchronization(DataSynchronization dataSynchronization) {
                this.dataSynchronization = dataSynchronization;
                return this;
            }

            /**
             * DestinationEndpoint.
             */
            public Builder destinationEndpoint(DestinationEndpoint destinationEndpoint) {
                this.destinationEndpoint = destinationEndpoint;
                return this;
            }

            /**
             * MigrationJobClass.
             */
            public Builder migrationJobClass(String migrationJobClass) {
                this.migrationJobClass = migrationJobClass;
                return this;
            }

            /**
             * MigrationJobID.
             */
            public Builder migrationJobID(String migrationJobID) {
                this.migrationJobID = migrationJobID;
                return this;
            }

            /**
             * MigrationJobName.
             */
            public Builder migrationJobName(String migrationJobName) {
                this.migrationJobName = migrationJobName;
                return this;
            }

            /**
             * MigrationJobStatus.
             */
            public Builder migrationJobStatus(String migrationJobStatus) {
                this.migrationJobStatus = migrationJobStatus;
                return this;
            }

            /**
             * MigrationMode.
             */
            public Builder migrationMode(MigrationMode migrationMode) {
                this.migrationMode = migrationMode;
                return this;
            }

            /**
             * MigrationObject.
             */
            public Builder migrationObject(MigrationObject migrationObject) {
                this.migrationObject = migrationObject;
                return this;
            }

            /**
             * PayType.
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            /**
             * Precheck.
             */
            public Builder precheck(Precheck precheck) {
                this.precheck = precheck;
                return this;
            }

            /**
             * SourceEndpoint.
             */
            public Builder sourceEndpoint(SourceEndpoint sourceEndpoint) {
                this.sourceEndpoint = sourceEndpoint;
                return this;
            }

            /**
             * StructureInitialization.
             */
            public Builder structureInitialization(StructureInitialization structureInitialization) {
                this.structureInitialization = structureInitialization;
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
