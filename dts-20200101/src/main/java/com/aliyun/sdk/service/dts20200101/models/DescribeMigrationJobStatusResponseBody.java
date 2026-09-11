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
 * {@link DescribeMigrationJobStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMigrationJobStatusResponseBody</p>
 */
public class DescribeMigrationJobStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataInitializationStatus")
    private DataInitializationStatus dataInitializationStatus;

    @com.aliyun.core.annotation.NameInMap("DataSynchronizationStatus")
    private DataSynchronizationStatus dataSynchronizationStatus;

    @com.aliyun.core.annotation.NameInMap("DestinationEndpoint")
    private DestinationEndpoint destinationEndpoint;

    @com.aliyun.core.annotation.NameInMap("ErrCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("ErrMessage")
    private String errMessage;

    @com.aliyun.core.annotation.NameInMap("MigrationJobClass")
    private String migrationJobClass;

    @com.aliyun.core.annotation.NameInMap("MigrationJobId")
    private String migrationJobId;

    @com.aliyun.core.annotation.NameInMap("MigrationJobName")
    private String migrationJobName;

    @com.aliyun.core.annotation.NameInMap("MigrationJobStatus")
    private String migrationJobStatus;

    @com.aliyun.core.annotation.NameInMap("MigrationMode")
    private MigrationMode migrationMode;

    @com.aliyun.core.annotation.NameInMap("MigrationObject")
    private String migrationObject;

    @com.aliyun.core.annotation.NameInMap("PayType")
    private String payType;

    @com.aliyun.core.annotation.NameInMap("PrecheckStatus")
    private PrecheckStatus precheckStatus;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SourceEndpoint")
    private SourceEndpoint sourceEndpoint;

    @com.aliyun.core.annotation.NameInMap("StructureInitializationStatus")
    private StructureInitializationStatus structureInitializationStatus;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    private DescribeMigrationJobStatusResponseBody(Builder builder) {
        this.dataInitializationStatus = builder.dataInitializationStatus;
        this.dataSynchronizationStatus = builder.dataSynchronizationStatus;
        this.destinationEndpoint = builder.destinationEndpoint;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.migrationJobClass = builder.migrationJobClass;
        this.migrationJobId = builder.migrationJobId;
        this.migrationJobName = builder.migrationJobName;
        this.migrationJobStatus = builder.migrationJobStatus;
        this.migrationMode = builder.migrationMode;
        this.migrationObject = builder.migrationObject;
        this.payType = builder.payType;
        this.precheckStatus = builder.precheckStatus;
        this.requestId = builder.requestId;
        this.sourceEndpoint = builder.sourceEndpoint;
        this.structureInitializationStatus = builder.structureInitializationStatus;
        this.success = builder.success;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMigrationJobStatusResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataInitializationStatus
     */
    public DataInitializationStatus getDataInitializationStatus() {
        return this.dataInitializationStatus;
    }

    /**
     * @return dataSynchronizationStatus
     */
    public DataSynchronizationStatus getDataSynchronizationStatus() {
        return this.dataSynchronizationStatus;
    }

    /**
     * @return destinationEndpoint
     */
    public DestinationEndpoint getDestinationEndpoint() {
        return this.destinationEndpoint;
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
     * @return migrationJobClass
     */
    public String getMigrationJobClass() {
        return this.migrationJobClass;
    }

    /**
     * @return migrationJobId
     */
    public String getMigrationJobId() {
        return this.migrationJobId;
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
    public String getMigrationObject() {
        return this.migrationObject;
    }

    /**
     * @return payType
     */
    public String getPayType() {
        return this.payType;
    }

    /**
     * @return precheckStatus
     */
    public PrecheckStatus getPrecheckStatus() {
        return this.precheckStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sourceEndpoint
     */
    public SourceEndpoint getSourceEndpoint() {
        return this.sourceEndpoint;
    }

    /**
     * @return structureInitializationStatus
     */
    public StructureInitializationStatus getStructureInitializationStatus() {
        return this.structureInitializationStatus;
    }

    /**
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder {
        private DataInitializationStatus dataInitializationStatus; 
        private DataSynchronizationStatus dataSynchronizationStatus; 
        private DestinationEndpoint destinationEndpoint; 
        private String errCode; 
        private String errMessage; 
        private String migrationJobClass; 
        private String migrationJobId; 
        private String migrationJobName; 
        private String migrationJobStatus; 
        private MigrationMode migrationMode; 
        private String migrationObject; 
        private String payType; 
        private PrecheckStatus precheckStatus; 
        private String requestId; 
        private SourceEndpoint sourceEndpoint; 
        private StructureInitializationStatus structureInitializationStatus; 
        private String success; 
        private String taskId; 

        private Builder() {
        } 

        private Builder(DescribeMigrationJobStatusResponseBody model) {
            this.dataInitializationStatus = model.dataInitializationStatus;
            this.dataSynchronizationStatus = model.dataSynchronizationStatus;
            this.destinationEndpoint = model.destinationEndpoint;
            this.errCode = model.errCode;
            this.errMessage = model.errMessage;
            this.migrationJobClass = model.migrationJobClass;
            this.migrationJobId = model.migrationJobId;
            this.migrationJobName = model.migrationJobName;
            this.migrationJobStatus = model.migrationJobStatus;
            this.migrationMode = model.migrationMode;
            this.migrationObject = model.migrationObject;
            this.payType = model.payType;
            this.precheckStatus = model.precheckStatus;
            this.requestId = model.requestId;
            this.sourceEndpoint = model.sourceEndpoint;
            this.structureInitializationStatus = model.structureInitializationStatus;
            this.success = model.success;
            this.taskId = model.taskId;
        } 

        /**
         * <p>The execution status of full data migration.</p>
         */
        public Builder dataInitializationStatus(DataInitializationStatus dataInitializationStatus) {
            this.dataInitializationStatus = dataInitializationStatus;
            return this;
        }

        /**
         * <p>The execution status of incremental data migration.</p>
         */
        public Builder dataSynchronizationStatus(DataSynchronizationStatus dataSynchronizationStatus) {
            this.dataSynchronizationStatus = dataSynchronizationStatus;
            return this;
        }

        /**
         * <p>The connection information of the destination instance.</p>
         */
        public Builder destinationEndpoint(DestinationEndpoint destinationEndpoint) {
            this.destinationEndpoint = destinationEndpoint;
            return this;
        }

        /**
         * <p>The error code returned if the call failed.</p>
         * 
         * <strong>example:</strong>
         * <p>InternalError</p>
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * <p>The error message returned if the call failed.</p>
         * 
         * <strong>example:</strong>
         * <p>The request processing has failed due to some unknown error.</p>
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * <p>The specification of the data migration instance. Valid values: <strong>small</strong>, <strong>medium</strong>, <strong>large</strong>, <strong>xlarge</strong>, and <strong>2xlarge</strong>. For more information, see <a href="https://help.aliyun.com/document_detail/26606.html">Specifications of data migration instances</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>2xlarge</p>
         */
        public Builder migrationJobClass(String migrationJobClass) {
            this.migrationJobClass = migrationJobClass;
            return this;
        }

        /**
         * <p>The instance ID of the data migration instance.</p>
         * 
         * <strong>example:</strong>
         * <p>dtsxxxxxxxx</p>
         */
        public Builder migrationJobId(String migrationJobId) {
            this.migrationJobId = migrationJobId;
            return this;
        }

        /**
         * <p>The name of the data migration instance.</p>
         * 
         * <strong>example:</strong>
         * <p>MySQL迁移</p>
         */
        public Builder migrationJobName(String migrationJobName) {
            this.migrationJobName = migrationJobName;
            return this;
        }

        /**
         * <p>The status of the data migration task. Valid values:</p>
         * <ul>
         * <li><strong>NotStarted</strong>: not started.</li>
         * <li><strong>Prechecking</strong>: running the precheck.</li>
         * <li><strong>PrecheckFailed</strong>: precheck failed.</li>
         * <li><strong>Migrating</strong>: migrating.</li>
         * <li><strong>Suspending</strong>: paused.</li>
         * <li><strong>MigrationFailed</strong>: migration failed.</li>
         * <li><strong>Finished</strong>: migration completed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Migrating</p>
         */
        public Builder migrationJobStatus(String migrationJobStatus) {
            this.migrationJobStatus = migrationJobStatus;
            return this;
        }

        /**
         * <p>The migration types.</p>
         */
        public Builder migrationMode(MigrationMode migrationMode) {
            this.migrationMode = migrationMode;
            return this;
        }

        /**
         * <p>The migration objects.</p>
         * 
         * <strong>example:</strong>
         * <p>[{\&quot;DBName\&quot;:\&quot;dtstestdata\&quot;,\&quot;TableIncludes\&quot;:[{\&quot;TableName\&quot;:\&quot;customer\&quot;}]}]</p>
         */
        public Builder migrationObject(String migrationObject) {
            this.migrationObject = migrationObject;
            return this;
        }

        /**
         * <p>The billing method of the data migration task. The return value is fixed as <strong>PostPaid</strong> (pay-as-you-go).</p>
         * 
         * <strong>example:</strong>
         * <p>PostPaid</p>
         */
        public Builder payType(String payType) {
            this.payType = payType;
            return this;
        }

        /**
         * <p>The precheck status.</p>
         */
        public Builder precheckStatus(PrecheckStatus precheckStatus) {
            this.precheckStatus = precheckStatus;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A032E3B4-929B-48E9-97B9-37587CBF****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The connection information of the source instance.</p>
         */
        public Builder sourceEndpoint(SourceEndpoint sourceEndpoint) {
            this.sourceEndpoint = sourceEndpoint;
            return this;
        }

        /**
         * <p>The execution status of schema migration.</p>
         */
        public Builder structureInitializationStatus(StructureInitializationStatus structureInitializationStatus) {
            this.structureInitializationStatus = structureInitializationStatus;
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
         * <p>The ID of the data migration task.</p>
         * 
         * <strong>example:</strong>
         * <p>z2v12jfo309****</p>
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        public DescribeMigrationJobStatusResponseBody build() {
            return new DescribeMigrationJobStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeMigrationJobStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMigrationJobStatusResponseBody</p>
     */
    public static class DataInitializationStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("Percent")
        private String percent;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private String progress;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private DataInitializationStatus(Builder builder) {
            this.errorMessage = builder.errorMessage;
            this.percent = builder.percent;
            this.progress = builder.progress;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataInitializationStatus create() {
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

            private Builder(DataInitializationStatus model) {
                this.errorMessage = model.errorMessage;
                this.percent = model.percent;
                this.progress = model.progress;
                this.status = model.status;
            } 

            /**
             * <p>The error message returned when full data migration failed.</p>
             * 
             * <strong>example:</strong>
             * <p>java.lang.NumberFormatException: For input string: &quot;&quot;</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The progress of full data migration, in percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * <p>The number of records that have been migrated during initial full data synchronization.</p>
             * 
             * <strong>example:</strong>
             * <p>200001</p>
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The status of full data migration. Valid values:</p>
             * <ul>
             * <li><strong>NotStarted</strong>: not started.</li>
             * <li><strong>Migrating</strong>: migrating.</li>
             * <li><strong>Failed</strong>: migration failed.</li>
             * <li><strong>Finished</strong>: migration completed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Finished</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public DataInitializationStatus build() {
                return new DataInitializationStatus(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeMigrationJobStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMigrationJobStatusResponseBody</p>
     */
    public static class DataSynchronizationStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Checkpoint")
        private String checkpoint;

        @com.aliyun.core.annotation.NameInMap("Delay")
        private String delay;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("Percent")
        private String percent;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private DataSynchronizationStatus(Builder builder) {
            this.checkpoint = builder.checkpoint;
            this.delay = builder.delay;
            this.errorMessage = builder.errorMessage;
            this.percent = builder.percent;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataSynchronizationStatus create() {
            return builder().build();
        }

        /**
         * @return checkpoint
         */
        public String getCheckpoint() {
            return this.checkpoint;
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
            private String checkpoint; 
            private String delay; 
            private String errorMessage; 
            private String percent; 
            private String status; 

            private Builder() {
            } 

            private Builder(DataSynchronizationStatus model) {
                this.checkpoint = model.checkpoint;
                this.delay = model.delay;
                this.errorMessage = model.errorMessage;
                this.percent = model.percent;
                this.status = model.status;
            } 

            /**
             * <p>The timestamp of the latest incremental data that has been migrated. The value is a UNIX timestamp, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1571040679</p>
             */
            public Builder checkpoint(String checkpoint) {
                this.checkpoint = checkpoint;
                return this;
            }

            /**
             * <p>The migration latency of incremental data migration, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder delay(String delay) {
                this.delay = delay;
                return this;
            }

            /**
             * <p>The error message returned when incremental data migration failed.</p>
             * 
             * <strong>example:</strong>
             * <p>任务失败太久 无法恢复</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The progress of incremental data migration, in percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>95</p>
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * <p>The status of incremental data migration. Valid values:</p>
             * <ul>
             * <li><strong>NotStarted</strong>: not started.</li>
             * <li><strong>Migrating</strong>: migrating.</li>
             * <li><strong>Failed</strong>: migration failed.</li>
             * <li><strong>Finished</strong>: migration completed.</li>
             * <li><strong>Catched</strong>: no latency.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Catched</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public DataSynchronizationStatus build() {
                return new DataSynchronizationStatus(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeMigrationJobStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMigrationJobStatusResponseBody</p>
     */
    public static class DestinationEndpoint extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DatabaseName")
        private String databaseName;

        @com.aliyun.core.annotation.NameInMap("EngineName")
        private String engineName;

        @com.aliyun.core.annotation.NameInMap("IP")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("Port")
        private String port;

        @com.aliyun.core.annotation.NameInMap("UserName")
        private String userName;

        @com.aliyun.core.annotation.NameInMap("oracleSID")
        private String oracleSID;

        private DestinationEndpoint(Builder builder) {
            this.databaseName = builder.databaseName;
            this.engineName = builder.engineName;
            this.ip = builder.ip;
            this.instanceId = builder.instanceId;
            this.instanceType = builder.instanceType;
            this.port = builder.port;
            this.userName = builder.userName;
            this.oracleSID = builder.oracleSID;
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
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
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

        /**
         * @return oracleSID
         */
        public String getOracleSID() {
            return this.oracleSID;
        }

        public static final class Builder {
            private String databaseName; 
            private String engineName; 
            private String ip; 
            private String instanceId; 
            private String instanceType; 
            private String port; 
            private String userName; 
            private String oracleSID; 

            private Builder() {
            } 

            private Builder(DestinationEndpoint model) {
                this.databaseName = model.databaseName;
                this.engineName = model.engineName;
                this.ip = model.ip;
                this.instanceId = model.instanceId;
                this.instanceType = model.instanceType;
                this.port = model.port;
                this.userName = model.userName;
                this.oracleSID = model.oracleSID;
            } 

            /**
             * <p>The name of the database to which the objects to be migrated belong in the destination instance.</p>
             * 
             * <strong>example:</strong>
             * <p>dtstestdata</p>
             */
            public Builder databaseName(String databaseName) {
                this.databaseName = databaseName;
                return this;
            }

            /**
             * <p>The database type of the destination instance.</p>
             * 
             * <strong>example:</strong>
             * <p>MySQL</p>
             */
            public Builder engineName(String engineName) {
                this.engineName = engineName;
                return this;
            }

            /**
             * <p>The endpoint of the destination instance.</p>
             * 
             * <strong>example:</strong>
             * <p>172.16.88.***</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>The instance ID of the destination instance.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-bpxxxxxxxx</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The type of the destination instance.</p>
             * 
             * <strong>example:</strong>
             * <p>RDS</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The database service port of the destination instance.</p>
             * 
             * <strong>example:</strong>
             * <p>3306</p>
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The database account of the destination instance.</p>
             * 
             * <strong>example:</strong>
             * <p>dtstest</p>
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            /**
             * <p>The SID of the Oracle database.</p>
             * <blockquote>
             * <p>This parameter is returned only when the database type of the destination instance is <strong>Oracle</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>testsid</p>
             */
            public Builder oracleSID(String oracleSID) {
                this.oracleSID = oracleSID;
                return this;
            }

            public DestinationEndpoint build() {
                return new DestinationEndpoint(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeMigrationJobStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMigrationJobStatusResponseBody</p>
     */
    public static class MigrationMode extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("dataInitialization")
        private Boolean dataInitialization;

        @com.aliyun.core.annotation.NameInMap("dataSynchronization")
        private Boolean dataSynchronization;

        @com.aliyun.core.annotation.NameInMap("structureInitialization")
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
             * <p>Indicates whether full data migration is performed. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: yes.</li>
             * <li><strong>false</strong>: no.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder dataInitialization(Boolean dataInitialization) {
                this.dataInitialization = dataInitialization;
                return this;
            }

            /**
             * <p>Indicates whether incremental data migration is performed. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: yes.</li>
             * <li><strong>false</strong>: no.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p><strong>false</strong>。</p>
             */
            public Builder dataSynchronization(Boolean dataSynchronization) {
                this.dataSynchronization = dataSynchronization;
                return this;
            }

            /**
             * <p>Indicates whether schema migration is performed. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: yes.</li>
             * <li><strong>false</strong>: no.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p><strong>false</strong>。</p>
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
     * {@link DescribeMigrationJobStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMigrationJobStatusResponseBody</p>
     */
    public static class CheckItem extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CheckStatus")
        private String checkStatus;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("ItemName")
        private String itemName;

        @com.aliyun.core.annotation.NameInMap("RepairMethod")
        private String repairMethod;

        private CheckItem(Builder builder) {
            this.checkStatus = builder.checkStatus;
            this.errorMessage = builder.errorMessage;
            this.itemName = builder.itemName;
            this.repairMethod = builder.repairMethod;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CheckItem create() {
            return builder().build();
        }

        /**
         * @return checkStatus
         */
        public String getCheckStatus() {
            return this.checkStatus;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return itemName
         */
        public String getItemName() {
            return this.itemName;
        }

        /**
         * @return repairMethod
         */
        public String getRepairMethod() {
            return this.repairMethod;
        }

        public static final class Builder {
            private String checkStatus; 
            private String errorMessage; 
            private String itemName; 
            private String repairMethod; 

            private Builder() {
            } 

            private Builder(CheckItem model) {
                this.checkStatus = model.checkStatus;
                this.errorMessage = model.errorMessage;
                this.itemName = model.itemName;
                this.repairMethod = model.repairMethod;
            } 

            /**
             * CheckStatus.
             */
            public Builder checkStatus(String checkStatus) {
                this.checkStatus = checkStatus;
                return this;
            }

            /**
             * <p>The error message returned when incremental data migration failed.</p>
             * 
             * <strong>example:</strong>
             * <p>任务失败太久 无法恢复</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * ItemName.
             */
            public Builder itemName(String itemName) {
                this.itemName = itemName;
                return this;
            }

            /**
             * RepairMethod.
             */
            public Builder repairMethod(String repairMethod) {
                this.repairMethod = repairMethod;
                return this;
            }

            public CheckItem build() {
                return new CheckItem(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeMigrationJobStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMigrationJobStatusResponseBody</p>
     */
    public static class Detail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CheckItem")
        private java.util.List<CheckItem> checkItem;

        private Detail(Builder builder) {
            this.checkItem = builder.checkItem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Detail create() {
            return builder().build();
        }

        /**
         * @return checkItem
         */
        public java.util.List<CheckItem> getCheckItem() {
            return this.checkItem;
        }

        public static final class Builder {
            private java.util.List<CheckItem> checkItem; 

            private Builder() {
            } 

            private Builder(Detail model) {
                this.checkItem = model.checkItem;
            } 

            /**
             * CheckItem.
             */
            public Builder checkItem(java.util.List<CheckItem> checkItem) {
                this.checkItem = checkItem;
                return this;
            }

            public Detail build() {
                return new Detail(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeMigrationJobStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMigrationJobStatusResponseBody</p>
     */
    public static class PrecheckStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Detail")
        private Detail detail;

        @com.aliyun.core.annotation.NameInMap("Percent")
        private String percent;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private PrecheckStatus(Builder builder) {
            this.detail = builder.detail;
            this.percent = builder.percent;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PrecheckStatus create() {
            return builder().build();
        }

        /**
         * @return detail
         */
        public Detail getDetail() {
            return this.detail;
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
            private Detail detail; 
            private String percent; 
            private String status; 

            private Builder() {
            } 

            private Builder(PrecheckStatus model) {
                this.detail = model.detail;
                this.percent = model.percent;
                this.status = model.status;
            } 

            /**
             * Detail.
             */
            public Builder detail(Detail detail) {
                this.detail = detail;
                return this;
            }

            /**
             * <p>The overall progress of the precheck, in percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * <p>The precheck status. Valid values:</p>
             * <ul>
             * <li><strong>NotStarted</strong>: not started.</li>
             * <li><strong>Checking</strong>: running the precheck.</li>
             * <li><strong>Failed</strong>: precheck failed.</li>
             * <li><strong>Finished</strong>: precheck completed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public PrecheckStatus build() {
                return new PrecheckStatus(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeMigrationJobStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMigrationJobStatusResponseBody</p>
     */
    public static class SourceEndpoint extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DatabaseName")
        private String databaseName;

        @com.aliyun.core.annotation.NameInMap("EngineName")
        private String engineName;

        @com.aliyun.core.annotation.NameInMap("IP")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("Port")
        private String port;

        @com.aliyun.core.annotation.NameInMap("UserName")
        private String userName;

        @com.aliyun.core.annotation.NameInMap("oracleSID")
        private String oracleSID;

        private SourceEndpoint(Builder builder) {
            this.databaseName = builder.databaseName;
            this.engineName = builder.engineName;
            this.ip = builder.ip;
            this.instanceId = builder.instanceId;
            this.instanceType = builder.instanceType;
            this.port = builder.port;
            this.userName = builder.userName;
            this.oracleSID = builder.oracleSID;
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
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
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

        /**
         * @return oracleSID
         */
        public String getOracleSID() {
            return this.oracleSID;
        }

        public static final class Builder {
            private String databaseName; 
            private String engineName; 
            private String ip; 
            private String instanceId; 
            private String instanceType; 
            private String port; 
            private String userName; 
            private String oracleSID; 

            private Builder() {
            } 

            private Builder(SourceEndpoint model) {
                this.databaseName = model.databaseName;
                this.engineName = model.engineName;
                this.ip = model.ip;
                this.instanceId = model.instanceId;
                this.instanceType = model.instanceType;
                this.port = model.port;
                this.userName = model.userName;
                this.oracleSID = model.oracleSID;
            } 

            /**
             * <p>The name of the database to which the objects to be migrated belong in the source instance.</p>
             * 
             * <strong>example:</strong>
             * <p>dtstestdatabase</p>
             */
            public Builder databaseName(String databaseName) {
                this.databaseName = databaseName;
                return this;
            }

            /**
             * <p>The database type of the source instance.</p>
             * 
             * <strong>example:</strong>
             * <p>MySQL</p>
             */
            public Builder engineName(String engineName) {
                this.engineName = engineName;
                return this;
            }

            /**
             * <p>The endpoint of the source instance.</p>
             * 
             * <strong>example:</strong>
             * <p>172.16.88.***</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>The instance ID of the source instance.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-bp1i99e8l7913****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The type of the source instance. Valid values:</p>
             * <ul>
             * <li><strong>RDS</strong>: ApsaraDB RDS instance.</li>
             * <li><strong>ECS</strong>: self-managed database hosted on ECS.</li>
             * <li><strong>LocalInstance</strong>: self-managed database with a public IP address.</li>
             * <li><strong>Express</strong>: self-managed database connected over Express Connect, VPN Gateway, or Smart Access Gateway.</li>
             * <li><strong>MongoDB</strong>: ApsaraDB for MongoDB instance.</li>
             * <li><strong>POLARDB</strong>: PolarDB for MySQL cluster (this value is applicable only to the China site).</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>RDS</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The database service port of the source instance.</p>
             * 
             * <strong>example:</strong>
             * <p>3306</p>
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The database account of the source instance.</p>
             * 
             * <strong>example:</strong>
             * <p>dtstest</p>
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            /**
             * <p>The SID of the Oracle database.</p>
             * <blockquote>
             * <p>This parameter is returned only when the database type of the source instance is Oracle.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>testsid</p>
             */
            public Builder oracleSID(String oracleSID) {
                this.oracleSID = oracleSID;
                return this;
            }

            public SourceEndpoint build() {
                return new SourceEndpoint(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeMigrationJobStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMigrationJobStatusResponseBody</p>
     */
    public static class StructureInitializationStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("Percent")
        private String percent;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private String progress;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private StructureInitializationStatus(Builder builder) {
            this.errorMessage = builder.errorMessage;
            this.percent = builder.percent;
            this.progress = builder.progress;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StructureInitializationStatus create() {
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

            private Builder(StructureInitializationStatus model) {
                this.errorMessage = model.errorMessage;
                this.percent = model.percent;
                this.progress = model.progress;
                this.status = model.status;
            } 

            /**
             * <p>The error message returned when schema migration failed.</p>
             * 
             * <strong>example:</strong>
             * <p>DTS-1020042 Execute sql error sql: ERROR: type &quot;geometry&quot; does not exist;</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The progress of schema migration, in percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * <p>The number of tables for which schema migration has been completed.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The status of schema migration. Valid values:</p>
             * <ul>
             * <li><strong>NotStarted</strong>: not started.</li>
             * <li><strong>Migrating</strong>: migrating.</li>
             * <li><strong>Failed</strong>: migration failed.</li>
             * <li><strong>Finished</strong>: migration completed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Finished</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public StructureInitializationStatus build() {
                return new StructureInitializationStatus(this);
            } 

        } 

    }
}
