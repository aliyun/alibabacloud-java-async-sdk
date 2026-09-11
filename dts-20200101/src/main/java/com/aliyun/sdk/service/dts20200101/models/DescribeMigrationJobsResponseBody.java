// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

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
 * {@link DescribeMigrationJobsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMigrationJobsResponseBody</p>
 */
public class DescribeMigrationJobsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("ErrMessage")
    private String errMessage;

    @com.aliyun.core.annotation.NameInMap("MigrationJobs")
    private MigrationJobs migrationJobs;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageRecordCount")
    private Integer pageRecordCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    @com.aliyun.core.annotation.NameInMap("TotalRecordCount")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeMigrationJobsResponseBody model) {
            this.errCode = model.errCode;
            this.errMessage = model.errMessage;
            this.migrationJobs = model.migrationJobs;
            this.pageNumber = model.pageNumber;
            this.pageRecordCount = model.pageRecordCount;
            this.requestId = model.requestId;
            this.success = model.success;
            this.totalRecordCount = model.totalRecordCount;
        } 

        /**
         * <p>The error code returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>InternalError</p>
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * <p>The error message returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>The request processing has failed due to some unknown error.</p>
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * MigrationJobs.
         */
        public Builder migrationJobs(MigrationJobs migrationJobs) {
            this.migrationJobs = migrationJobs;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The maximum number of records that can be displayed on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0ED4846D-ED60-435D-88C0-7EC0CE4D****</p>
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
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of data migration instances that meet the specified conditions under the Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        public Builder totalRecordCount(Long totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeMigrationJobsResponseBody build() {
            return new DescribeMigrationJobsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeMigrationJobsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMigrationJobsResponseBody</p>
     */
    public static class DataInitialization extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("Percent")
        private String percent;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private String progress;

        @com.aliyun.core.annotation.NameInMap("status")
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

            private Builder() {
            } 

            private Builder(DataInitialization model) {
                this.errorMessage = model.errorMessage;
                this.percent = model.percent;
                this.progress = model.progress;
                this.status = model.status;
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
    /**
     * 
     * {@link DescribeMigrationJobsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMigrationJobsResponseBody</p>
     */
    public static class DataSynchronization extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Delay")
        private String delay;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("Percent")
        private String percent;

        @com.aliyun.core.annotation.NameInMap("status")
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

            private Builder() {
            } 

            private Builder(DataSynchronization model) {
                this.delay = model.delay;
                this.errorMessage = model.errorMessage;
                this.percent = model.percent;
                this.status = model.status;
            } 

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
    /**
     * 
     * {@link DescribeMigrationJobsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMigrationJobsResponseBody</p>
     */
    public static class DestinationEndpoint extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DatabaseName")
        private String databaseName;

        @com.aliyun.core.annotation.NameInMap("EngineName")
        private String engineName;

        @com.aliyun.core.annotation.NameInMap("IP")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("InstanceID")
        private String instanceID;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("OracleSID")
        private String oracleSID;

        @com.aliyun.core.annotation.NameInMap("Port")
        private String port;

        @com.aliyun.core.annotation.NameInMap("UserName")
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

            private Builder() {
            } 

            private Builder(DestinationEndpoint model) {
                this.databaseName = model.databaseName;
                this.engineName = model.engineName;
                this.ip = model.ip;
                this.instanceID = model.instanceID;
                this.instanceType = model.instanceType;
                this.oracleSID = model.oracleSID;
                this.port = model.port;
                this.userName = model.userName;
            } 

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
    /**
     * 
     * {@link DescribeMigrationJobsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMigrationJobsResponseBody</p>
     */
    public static class MigrationMode extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataInitialization")
        private Boolean dataInitialization;

        @com.aliyun.core.annotation.NameInMap("DataSynchronization")
        private Boolean dataSynchronization;

        @com.aliyun.core.annotation.NameInMap("StructureInitialization")
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

            private Builder() {
            } 

            private Builder(MigrationMode model) {
                this.dataInitialization = model.dataInitialization;
                this.dataSynchronization = model.dataSynchronization;
                this.structureInitialization = model.structureInitialization;
            } 

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
    /**
     * 
     * {@link DescribeMigrationJobsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMigrationJobsResponseBody</p>
     */
    public static class TableList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Table")
        private java.util.List<String> table;

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
        public java.util.List<String> getTable() {
            return this.table;
        }

        public static final class Builder {
            private java.util.List<String> table; 

            private Builder() {
            } 

            private Builder(TableList model) {
                this.table = model.table;
            } 

            /**
             * Table.
             */
            public Builder table(java.util.List<String> table) {
                this.table = table;
                return this;
            }

            public TableList build() {
                return new TableList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeMigrationJobsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMigrationJobsResponseBody</p>
     */
    public static class SynchronousObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DatabaseName")
        private String databaseName;

        @com.aliyun.core.annotation.NameInMap("TableList")
        private TableList tableList;

        @com.aliyun.core.annotation.NameInMap("WholeDatabase")
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

            private Builder() {
            } 

            private Builder(SynchronousObject model) {
                this.databaseName = model.databaseName;
                this.tableList = model.tableList;
                this.wholeDatabase = model.wholeDatabase;
            } 

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
    /**
     * 
     * {@link DescribeMigrationJobsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMigrationJobsResponseBody</p>
     */
    public static class MigrationObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SynchronousObject")
        private java.util.List<SynchronousObject> synchronousObject;

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
        public java.util.List<SynchronousObject> getSynchronousObject() {
            return this.synchronousObject;
        }

        public static final class Builder {
            private java.util.List<SynchronousObject> synchronousObject; 

            private Builder() {
            } 

            private Builder(MigrationObject model) {
                this.synchronousObject = model.synchronousObject;
            } 

            /**
             * SynchronousObject.
             */
            public Builder synchronousObject(java.util.List<SynchronousObject> synchronousObject) {
                this.synchronousObject = synchronousObject;
                return this;
            }

            public MigrationObject build() {
                return new MigrationObject(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeMigrationJobsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMigrationJobsResponseBody</p>
     */
    public static class Precheck extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Percent")
        private String percent;

        @com.aliyun.core.annotation.NameInMap("Status")
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

            private Builder() {
            } 

            private Builder(Precheck model) {
                this.percent = model.percent;
                this.status = model.status;
            } 

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
    /**
     * 
     * {@link DescribeMigrationJobsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMigrationJobsResponseBody</p>
     */
    public static class SourceEndpoint extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DatabaseName")
        private String databaseName;

        @com.aliyun.core.annotation.NameInMap("EngineName")
        private String engineName;

        @com.aliyun.core.annotation.NameInMap("IP")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("InstanceID")
        private String instanceID;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("OracleSID")
        private String oracleSID;

        @com.aliyun.core.annotation.NameInMap("Port")
        private String port;

        @com.aliyun.core.annotation.NameInMap("UserName")
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

            private Builder() {
            } 

            private Builder(SourceEndpoint model) {
                this.databaseName = model.databaseName;
                this.engineName = model.engineName;
                this.ip = model.ip;
                this.instanceID = model.instanceID;
                this.instanceType = model.instanceType;
                this.oracleSID = model.oracleSID;
                this.port = model.port;
                this.userName = model.userName;
            } 

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
    /**
     * 
     * {@link DescribeMigrationJobsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMigrationJobsResponseBody</p>
     */
    public static class StructureInitialization extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("Percent")
        private String percent;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private String progress;

        @com.aliyun.core.annotation.NameInMap("status")
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

            private Builder() {
            } 

            private Builder(StructureInitialization model) {
                this.errorMessage = model.errorMessage;
                this.percent = model.percent;
                this.progress = model.progress;
                this.status = model.status;
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
    /**
     * 
     * {@link DescribeMigrationJobsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMigrationJobsResponseBody</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(Tag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
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
    /**
     * 
     * {@link DescribeMigrationJobsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMigrationJobsResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Tag")
        private java.util.List<Tag> tag;

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
        public java.util.List<Tag> getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List<Tag> tag; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.tag = model.tag;
            } 

            /**
             * Tag.
             */
            public Builder tag(java.util.List<Tag> tag) {
                this.tag = tag;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeMigrationJobsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMigrationJobsResponseBody</p>
     */
    public static class MigrationJob extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataInitialization")
        private DataInitialization dataInitialization;

        @com.aliyun.core.annotation.NameInMap("DataSynchronization")
        private DataSynchronization dataSynchronization;

        @com.aliyun.core.annotation.NameInMap("DestinationEndpoint")
        private DestinationEndpoint destinationEndpoint;

        @com.aliyun.core.annotation.NameInMap("InstanceCreateTime")
        private String instanceCreateTime;

        @com.aliyun.core.annotation.NameInMap("JobCreateTime")
        private String jobCreateTime;

        @com.aliyun.core.annotation.NameInMap("MigrationJobClass")
        private String migrationJobClass;

        @com.aliyun.core.annotation.NameInMap("MigrationJobID")
        private String migrationJobID;

        @com.aliyun.core.annotation.NameInMap("MigrationJobName")
        private String migrationJobName;

        @com.aliyun.core.annotation.NameInMap("MigrationJobStatus")
        private String migrationJobStatus;

        @com.aliyun.core.annotation.NameInMap("MigrationMode")
        private MigrationMode migrationMode;

        @com.aliyun.core.annotation.NameInMap("MigrationObject")
        private MigrationObject migrationObject;

        @com.aliyun.core.annotation.NameInMap("PayType")
        private String payType;

        @com.aliyun.core.annotation.NameInMap("Precheck")
        private Precheck precheck;

        @com.aliyun.core.annotation.NameInMap("SourceEndpoint")
        private SourceEndpoint sourceEndpoint;

        @com.aliyun.core.annotation.NameInMap("StructureInitialization")
        private StructureInitialization structureInitialization;

        @com.aliyun.core.annotation.NameInMap("Tags")
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

            private Builder() {
            } 

            private Builder(MigrationJob model) {
                this.dataInitialization = model.dataInitialization;
                this.dataSynchronization = model.dataSynchronization;
                this.destinationEndpoint = model.destinationEndpoint;
                this.instanceCreateTime = model.instanceCreateTime;
                this.jobCreateTime = model.jobCreateTime;
                this.migrationJobClass = model.migrationJobClass;
                this.migrationJobID = model.migrationJobID;
                this.migrationJobName = model.migrationJobName;
                this.migrationJobStatus = model.migrationJobStatus;
                this.migrationMode = model.migrationMode;
                this.migrationObject = model.migrationObject;
                this.payType = model.payType;
                this.precheck = model.precheck;
                this.sourceEndpoint = model.sourceEndpoint;
                this.structureInitialization = model.structureInitialization;
                this.tags = model.tags;
            } 

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
             * InstanceCreateTime.
             */
            public Builder instanceCreateTime(String instanceCreateTime) {
                this.instanceCreateTime = instanceCreateTime;
                return this;
            }

            /**
             * JobCreateTime.
             */
            public Builder jobCreateTime(String jobCreateTime) {
                this.jobCreateTime = jobCreateTime;
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

            /**
             * Tags.
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
    /**
     * 
     * {@link DescribeMigrationJobsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMigrationJobsResponseBody</p>
     */
    public static class MigrationJobs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MigrationJob")
        private java.util.List<MigrationJob> migrationJob;

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
        public java.util.List<MigrationJob> getMigrationJob() {
            return this.migrationJob;
        }

        public static final class Builder {
            private java.util.List<MigrationJob> migrationJob; 

            private Builder() {
            } 

            private Builder(MigrationJobs model) {
                this.migrationJob = model.migrationJob;
            } 

            /**
             * MigrationJob.
             */
            public Builder migrationJob(java.util.List<MigrationJob> migrationJob) {
                this.migrationJob = migrationJob;
                return this;
            }

            public MigrationJobs build() {
                return new MigrationJobs(this);
            } 

        } 

    }
}
