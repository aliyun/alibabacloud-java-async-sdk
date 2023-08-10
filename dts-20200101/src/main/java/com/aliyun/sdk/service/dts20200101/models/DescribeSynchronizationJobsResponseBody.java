// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSynchronizationJobsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSynchronizationJobsResponseBody</p>
 */
public class DescribeSynchronizationJobsResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageRecordCount")
    private Integer pageRecordCount;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SynchronizationInstances")
    private java.util.List < SynchronizationInstances> synchronizationInstances;

    @NameInMap("TotalRecordCount")
    private Long totalRecordCount;

    private DescribeSynchronizationJobsResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageRecordCount = builder.pageRecordCount;
        this.requestId = builder.requestId;
        this.synchronizationInstances = builder.synchronizationInstances;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSynchronizationJobsResponseBody create() {
        return builder().build();
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
     * @return synchronizationInstances
     */
    public java.util.List < SynchronizationInstances> getSynchronizationInstances() {
        return this.synchronizationInstances;
    }

    /**
     * @return totalRecordCount
     */
    public Long getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageRecordCount; 
        private String requestId; 
        private java.util.List < SynchronizationInstances> synchronizationInstances; 
        private Long totalRecordCount; 

        /**
         * The total number of data synchronization instances that belong to your Alibaba Cloud account.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * Indicates whether full data synchronization is performed. Valid values:
         * <p>
         * 
         * *   **true**: yes
         * *   **false**: no
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * The list of data synchronization instances and the details of each instance.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The name of the data synchronization task.
         */
        public Builder synchronizationInstances(java.util.List < SynchronizationInstances> synchronizationInstances) {
            this.synchronizationInstances = synchronizationInstances;
            return this;
        }

        /**
         * The status of the data synchronization task. Valid values:
         * <p>
         * 
         * *   **NotStarted**: The task is not started.
         * *   **Prechecking**: The task is being prechecked.
         * *   **PrecheckFailed**: The task failed to pass the precheck.
         * *   **Initializing**: The task is performing initial synchronization.
         * *   **InitializeFailed**: Initial synchronization failed.
         * *   **Synchronizing**: The task is synchronizing data.
         * *   **Failed**: The task failed to synchronize data.
         * *   **Suspending**: The task is paused.
         * *   **Modifying**: The objects in the task are being modified.
         * *   **Finished**: The task is completed.
         */
        public Builder totalRecordCount(Long totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeSynchronizationJobsResponseBody build() {
            return new DescribeSynchronizationJobsResponseBody(this);
        } 

    } 

    public static class DataInitializationStatus extends TeaModel {
        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("Percent")
        private String percent;

        @NameInMap("Progress")
        private String progress;

        @NameInMap("Status")
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

            /**
             * The status of incremental data synchronization.
             * <p>
             * 
             * >  This parameter is no longer available.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * The status of incremental data synchronization.
             * <p>
             * 
             * >  This parameter and its sub-parameters are no longer available.
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * The synchronization latency.
             * <p>
             * 
             * >  This parameter is no longer available.
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * The number of records that have been synchronized during full data synchronization.
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
    public static class DataSynchronizationStatus extends TeaModel {
        @NameInMap("Delay")
        private String delay;

        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("Percent")
        private String percent;

        @NameInMap("Status")
        private String status;

        private DataSynchronizationStatus(Builder builder) {
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
             * The connection settings of the destination instance.
             */
            public Builder delay(String delay) {
                this.delay = delay;
                return this;
            }

            /**
             * The endpoint of the destination instance.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * The ID of the destination instance.
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * The error message returned if incremental data synchronization failed.
             * <p>
             * 
             * >  This parameter is no longer available.
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
    public static class DestinationEndpoint extends TeaModel {
        @NameInMap("EngineName")
        private String engineName;

        @NameInMap("IP")
        private String ip;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("Port")
        private String port;

        @NameInMap("UserName")
        private String userName;

        private DestinationEndpoint(Builder builder) {
            this.engineName = builder.engineName;
            this.ip = builder.ip;
            this.instanceId = builder.instanceId;
            this.instanceType = builder.instanceType;
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

        public static final class Builder {
            private String engineName; 
            private String ip; 
            private String instanceId; 
            private String instanceType; 
            private String port; 
            private String userName; 

            /**
             * The data traffic that is synchronized per second. Unit: MB/s.
             */
            public Builder engineName(String engineName) {
                this.engineName = engineName;
                return this;
            }

            /**
             * The database account of the destination instance.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * The database service port of the destination instance.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The database type of the destination instance.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * The performance of the data synchronization instance.
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * The number of times SQL statements are synchronized per second, including BEGIN, COMMIT, DML, and DDL statements. DML statements include INSERT, DELETE, and UPDATE.
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
    public static class Performance extends TeaModel {
        @NameInMap("FLOW")
        private String FLOW;

        @NameInMap("RPS")
        private String RPS;

        private Performance(Builder builder) {
            this.FLOW = builder.FLOW;
            this.RPS = builder.RPS;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Performance create() {
            return builder().build();
        }

        /**
         * @return FLOW
         */
        public String getFLOW() {
            return this.FLOW;
        }

        /**
         * @return RPS
         */
        public String getRPS() {
            return this.RPS;
        }

        public static final class Builder {
            private String FLOW; 
            private String RPS; 

            /**
             * The precheck progress. Unit: %.
             */
            public Builder FLOW(String FLOW) {
                this.FLOW = FLOW;
                return this;
            }

            /**
             * The precheck result. Valid values:
             * <p>
             * 
             * *   **Success**: The task passed the precheck.
             * *   **Failed**: The task failed to pass the precheck.
             */
            public Builder RPS(String RPS) {
                this.RPS = RPS;
                return this;
            }

            public Performance build() {
                return new Performance(this);
            } 

        } 

    }
    public static class Detail extends TeaModel {
        @NameInMap("CheckStatus")
        private String checkStatus;

        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("ItemName")
        private String itemName;

        @NameInMap("RepairMethod")
        private String repairMethod;

        private Detail(Builder builder) {
            this.checkStatus = builder.checkStatus;
            this.errorMessage = builder.errorMessage;
            this.itemName = builder.itemName;
            this.repairMethod = builder.repairMethod;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Detail create() {
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

            /**
             * The method to fix the precheck failure.
             * <p>
             * 
             * >  This parameter is returned only if the return value of the **CheckStatus** parameter is **Failed**.
             */
            public Builder checkStatus(String checkStatus) {
                this.checkStatus = checkStatus;
                return this;
            }

            /**
             * The connection settings of the source instance.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * The ID of the source instance.
             */
            public Builder itemName(String itemName) {
                this.itemName = itemName;
                return this;
            }

            /**
             * The endpoint of the source instance.
             */
            public Builder repairMethod(String repairMethod) {
                this.repairMethod = repairMethod;
                return this;
            }

            public Detail build() {
                return new Detail(this);
            } 

        } 

    }
    public static class PrecheckStatus extends TeaModel {
        @NameInMap("Detail")
        private java.util.List < Detail> detail;

        @NameInMap("Percent")
        private String percent;

        @NameInMap("Status")
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
        public java.util.List < Detail> getDetail() {
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
            private java.util.List < Detail> detail; 
            private String percent; 
            private String status; 

            /**
             * The name of the precheck item.
             */
            public Builder detail(java.util.List < Detail> detail) {
                this.detail = detail;
                return this;
            }

            /**
             * The error message returned if the task failed to pass the precheck.
             * <p>
             * 
             * >  This parameter is returned only if the return value of the **CheckStatus** parameter is **Failed**.
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

            public PrecheckStatus build() {
                return new PrecheckStatus(this);
            } 

        } 

    }
    public static class SourceEndpoint extends TeaModel {
        @NameInMap("EngineName")
        private String engineName;

        @NameInMap("IP")
        private String ip;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("Port")
        private String port;

        @NameInMap("UserName")
        private String userName;

        private SourceEndpoint(Builder builder) {
            this.engineName = builder.engineName;
            this.ip = builder.ip;
            this.instanceId = builder.instanceId;
            this.instanceType = builder.instanceType;
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

        public static final class Builder {
            private String engineName; 
            private String ip; 
            private String instanceId; 
            private String instanceType; 
            private String port; 
            private String userName; 

            /**
             * The progress of schema synchronization. Unit: %.
             */
            public Builder engineName(String engineName) {
                this.engineName = engineName;
                return this;
            }

            /**
             * The database account of the source instance.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * The database service port of the source instance.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The database type of the source instance.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * The status of schema synchronization.
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * The status of schema synchronization. Valid values:
             * <p>
             * 
             * *   **NotStarted**: Schema synchronization is not started.
             * *   **Migrating**: Schema synchronization is in progress.
             * *   **Failed**: Schema synchronization failed.
             * *   **Finished**: Schema synchronization is completed.
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
    public static class StructureInitializationStatus extends TeaModel {
        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("Percent")
        private String percent;

        @NameInMap("Progress")
        private String progress;

        @NameInMap("Status")
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

            /**
             * The connection settings of the source instance.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * The error message returned if the task failed to pass the precheck.
             * <p>
             * 
             * >  This parameter is returned only if the return value of the **CheckStatus** parameter is **Failed**.
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * The synchronization latency.
             * <p>
             * 
             * >  This parameter is no longer available.
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * The number of tables whose schemas have been synchronized.
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
    public static class TableExcludes extends TeaModel {
        @NameInMap("TableName")
        private String tableName;

        private TableExcludes(Builder builder) {
            this.tableName = builder.tableName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TableExcludes create() {
            return builder().build();
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        public static final class Builder {
            private String tableName; 

            /**
             * The status of full data synchronization.
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            public TableExcludes build() {
                return new TableExcludes(this);
            } 

        } 

    }
    public static class TableIncludes extends TeaModel {
        @NameInMap("TableName")
        private String tableName;

        private TableIncludes(Builder builder) {
            this.tableName = builder.tableName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TableIncludes create() {
            return builder().build();
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        public static final class Builder {
            private String tableName; 

            /**
             * The progress of full data synchronization. Unit: %.
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            public TableIncludes build() {
                return new TableIncludes(this);
            } 

        } 

    }
    public static class SynchronizationObjects extends TeaModel {
        @NameInMap("NewSchemaName")
        private String newSchemaName;

        @NameInMap("SchemaName")
        private String schemaName;

        @NameInMap("TableExcludes")
        private java.util.List < TableExcludes> tableExcludes;

        @NameInMap("TableIncludes")
        private java.util.List < TableIncludes> tableIncludes;

        private SynchronizationObjects(Builder builder) {
            this.newSchemaName = builder.newSchemaName;
            this.schemaName = builder.schemaName;
            this.tableExcludes = builder.tableExcludes;
            this.tableIncludes = builder.tableIncludes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SynchronizationObjects create() {
            return builder().build();
        }

        /**
         * @return newSchemaName
         */
        public String getNewSchemaName() {
            return this.newSchemaName;
        }

        /**
         * @return schemaName
         */
        public String getSchemaName() {
            return this.schemaName;
        }

        /**
         * @return tableExcludes
         */
        public java.util.List < TableExcludes> getTableExcludes() {
            return this.tableExcludes;
        }

        /**
         * @return tableIncludes
         */
        public java.util.List < TableIncludes> getTableIncludes() {
            return this.tableIncludes;
        }

        public static final class Builder {
            private String newSchemaName; 
            private String schemaName; 
            private java.util.List < TableExcludes> tableExcludes; 
            private java.util.List < TableIncludes> tableIncludes; 

            /**
             * The name of the excluded table.
             */
            public Builder newSchemaName(String newSchemaName) {
                this.newSchemaName = newSchemaName;
                return this;
            }

            /**
             * The tables that are synchronized by the task.
             */
            public Builder schemaName(String schemaName) {
                this.schemaName = schemaName;
                return this;
            }

            /**
             * The name of the synchronized table.
             */
            public Builder tableExcludes(java.util.List < TableExcludes> tableExcludes) {
                this.tableExcludes = tableExcludes;
                return this;
            }

            /**
             * The status of full data synchronization. Valid values:
             * <p>
             * 
             * *   **NotStarted**: Full data synchronization is not started.
             * *   **Migrating**: Full data synchronization is in progress.
             * *   **Failed**: Full data synchronization failed.
             * *   **Finished**: Full data synchronization is completed.
             */
            public Builder tableIncludes(java.util.List < TableIncludes> tableIncludes) {
                this.tableIncludes = tableIncludes;
                return this;
            }

            public SynchronizationObjects build() {
                return new SynchronizationObjects(this);
            } 

        } 

    }
    public static class Tags extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
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
             * The database name that is used in the destination instance.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The name of the synchronized database.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    public static class SynchronizationInstances extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("DataInitialization")
        private String dataInitialization;

        @NameInMap("DataInitializationStatus")
        private DataInitializationStatus dataInitializationStatus;

        @NameInMap("DataSynchronizationStatus")
        private DataSynchronizationStatus dataSynchronizationStatus;

        @NameInMap("Delay")
        private String delay;

        @NameInMap("DestinationEndpoint")
        private DestinationEndpoint destinationEndpoint;

        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("ExpireTime")
        private String expireTime;

        @NameInMap("InstanceCreateTime")
        private String instanceCreateTime;

        @NameInMap("JobCreateTime")
        private String jobCreateTime;

        @NameInMap("PayType")
        private String payType;

        @NameInMap("Performance")
        private Performance performance;

        @NameInMap("PrecheckStatus")
        private PrecheckStatus precheckStatus;

        @NameInMap("SourceEndpoint")
        private SourceEndpoint sourceEndpoint;

        @NameInMap("Status")
        private String status;

        @NameInMap("StructureInitialization")
        private String structureInitialization;

        @NameInMap("StructureInitializationStatus")
        private StructureInitializationStatus structureInitializationStatus;

        @NameInMap("SynchronizationDirection")
        private String synchronizationDirection;

        @NameInMap("SynchronizationJobClass")
        private String synchronizationJobClass;

        @NameInMap("SynchronizationJobId")
        private String synchronizationJobId;

        @NameInMap("SynchronizationJobName")
        private String synchronizationJobName;

        @NameInMap("SynchronizationObjects")
        private java.util.List < SynchronizationObjects> synchronizationObjects;

        @NameInMap("Tags")
        private java.util.List < Tags> tags;

        private SynchronizationInstances(Builder builder) {
            this.createTime = builder.createTime;
            this.dataInitialization = builder.dataInitialization;
            this.dataInitializationStatus = builder.dataInitializationStatus;
            this.dataSynchronizationStatus = builder.dataSynchronizationStatus;
            this.delay = builder.delay;
            this.destinationEndpoint = builder.destinationEndpoint;
            this.errorMessage = builder.errorMessage;
            this.expireTime = builder.expireTime;
            this.instanceCreateTime = builder.instanceCreateTime;
            this.jobCreateTime = builder.jobCreateTime;
            this.payType = builder.payType;
            this.performance = builder.performance;
            this.precheckStatus = builder.precheckStatus;
            this.sourceEndpoint = builder.sourceEndpoint;
            this.status = builder.status;
            this.structureInitialization = builder.structureInitialization;
            this.structureInitializationStatus = builder.structureInitializationStatus;
            this.synchronizationDirection = builder.synchronizationDirection;
            this.synchronizationJobClass = builder.synchronizationJobClass;
            this.synchronizationJobId = builder.synchronizationJobId;
            this.synchronizationJobName = builder.synchronizationJobName;
            this.synchronizationObjects = builder.synchronizationObjects;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SynchronizationInstances create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return dataInitialization
         */
        public String getDataInitialization() {
            return this.dataInitialization;
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
         * @return delay
         */
        public String getDelay() {
            return this.delay;
        }

        /**
         * @return destinationEndpoint
         */
        public DestinationEndpoint getDestinationEndpoint() {
            return this.destinationEndpoint;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return expireTime
         */
        public String getExpireTime() {
            return this.expireTime;
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
         * @return payType
         */
        public String getPayType() {
            return this.payType;
        }

        /**
         * @return performance
         */
        public Performance getPerformance() {
            return this.performance;
        }

        /**
         * @return precheckStatus
         */
        public PrecheckStatus getPrecheckStatus() {
            return this.precheckStatus;
        }

        /**
         * @return sourceEndpoint
         */
        public SourceEndpoint getSourceEndpoint() {
            return this.sourceEndpoint;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return structureInitialization
         */
        public String getStructureInitialization() {
            return this.structureInitialization;
        }

        /**
         * @return structureInitializationStatus
         */
        public StructureInitializationStatus getStructureInitializationStatus() {
            return this.structureInitializationStatus;
        }

        /**
         * @return synchronizationDirection
         */
        public String getSynchronizationDirection() {
            return this.synchronizationDirection;
        }

        /**
         * @return synchronizationJobClass
         */
        public String getSynchronizationJobClass() {
            return this.synchronizationJobClass;
        }

        /**
         * @return synchronizationJobId
         */
        public String getSynchronizationJobId() {
            return this.synchronizationJobId;
        }

        /**
         * @return synchronizationJobName
         */
        public String getSynchronizationJobName() {
            return this.synchronizationJobName;
        }

        /**
         * @return synchronizationObjects
         */
        public java.util.List < SynchronizationObjects> getSynchronizationObjects() {
            return this.synchronizationObjects;
        }

        /**
         * @return tags
         */
        public java.util.List < Tags> getTags() {
            return this.tags;
        }

        public static final class Builder {
            private String createTime; 
            private String dataInitialization; 
            private DataInitializationStatus dataInitializationStatus; 
            private DataSynchronizationStatus dataSynchronizationStatus; 
            private String delay; 
            private DestinationEndpoint destinationEndpoint; 
            private String errorMessage; 
            private String expireTime; 
            private String instanceCreateTime; 
            private String jobCreateTime; 
            private String payType; 
            private Performance performance; 
            private PrecheckStatus precheckStatus; 
            private SourceEndpoint sourceEndpoint; 
            private String status; 
            private String structureInitialization; 
            private StructureInitializationStatus structureInitializationStatus; 
            private String synchronizationDirection; 
            private String synchronizationJobClass; 
            private String synchronizationJobId; 
            private String synchronizationJobName; 
            private java.util.List < SynchronizationObjects> synchronizationObjects; 
            private java.util.List < Tags> tags; 

            /**
             * The specification of the data synchronization instance.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The synchronization latency, in seconds.
             */
            public Builder dataInitialization(String dataInitialization) {
                this.dataInitialization = dataInitialization;
                return this;
            }

            /**
             * The error message returned if full data synchronization failed.
             */
            public Builder dataInitializationStatus(DataInitializationStatus dataInitializationStatus) {
                this.dataInitializationStatus = dataInitializationStatus;
                return this;
            }

            /**
             * The progress of incremental data synchronization. Unit: %.
             * <p>
             * 
             * >  This parameter is no longer available.
             */
            public Builder dataSynchronizationStatus(DataSynchronizationStatus dataSynchronizationStatus) {
                this.dataSynchronizationStatus = dataSynchronizationStatus;
                return this;
            }

            /**
             * The time when the data synchronization task was created. The time is displayed in the *yyyy-MM-dd* *HH:mm:ss*.0 format (UTC+8).
             */
            public Builder delay(String delay) {
                this.delay = delay;
                return this;
            }

            /**
             * The type of the destination instance.
             */
            public Builder destinationEndpoint(DestinationEndpoint destinationEndpoint) {
                this.destinationEndpoint = destinationEndpoint;
                return this;
            }

            /**
             * The billing method of the data synchronization instance. Valid values:
             * <p>
             * 
             * *   **PrePaid**: subscription
             * *   **PostPaid**: pay-as-you-go
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * Indicates whether schema synchronization is performed. Valid values:
             * <p>
             * 
             * *   **true**: yes
             * *   **false**: no
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * The time when the data synchronization task was created. The time is displayed in the *yyyy-MM-dd*T*HH:mm:ss*Z format in UTC.
             */
            public Builder instanceCreateTime(String instanceCreateTime) {
                this.instanceCreateTime = instanceCreateTime;
                return this;
            }

            /**
             * The tag value that corresponds to the tag key.
             */
            public Builder jobCreateTime(String jobCreateTime) {
                this.jobCreateTime = jobCreateTime;
                return this;
            }

            /**
             * The time when the instance was created. The time is displayed in the *yyyy-MM-dd*T*HH:mm:ss*Z format in UTC.
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            /**
             * The precheck status.
             */
            public Builder performance(Performance performance) {
                this.performance = performance;
                return this;
            }

            /**
             * The result of each precheck item.
             */
            public Builder precheckStatus(PrecheckStatus precheckStatus) {
                this.precheckStatus = precheckStatus;
                return this;
            }

            /**
             * The type of the source instance.
             */
            public Builder sourceEndpoint(SourceEndpoint sourceEndpoint) {
                this.sourceEndpoint = sourceEndpoint;
                return this;
            }

            /**
             * The error message returned if data synchronization failed.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The ID of the data synchronization instance.
             */
            public Builder structureInitialization(String structureInitialization) {
                this.structureInitialization = structureInitialization;
                return this;
            }

            /**
             * The error message returned if schema synchronization failed.
             */
            public Builder structureInitializationStatus(StructureInitializationStatus structureInitializationStatus) {
                this.structureInitializationStatus = structureInitializationStatus;
                return this;
            }

            /**
             * The tag key.
             */
            public Builder synchronizationDirection(String synchronizationDirection) {
                this.synchronizationDirection = synchronizationDirection;
                return this;
            }

            /**
             * The synchronization direction. Valid values:
             * <p>
             * 
             * *   **Forward**
             * *   **Reverse**
             */
            public Builder synchronizationJobClass(String synchronizationJobClass) {
                this.synchronizationJobClass = synchronizationJobClass;
                return this;
            }

            /**
             * The collection of tags.
             */
            public Builder synchronizationJobId(String synchronizationJobId) {
                this.synchronizationJobId = synchronizationJobId;
                return this;
            }

            /**
             * The time when the data synchronization instance expires. The time is displayed in the *yyyy-MM-dd*T*HH:mm:ss*Z format in UTC.
             * <p>
             * 
             * >  This parameter is returned only if the return value of the **PayType** parameter is **PrePaid**.
             */
            public Builder synchronizationJobName(String synchronizationJobName) {
                this.synchronizationJobName = synchronizationJobName;
                return this;
            }

            /**
             * The source tables that are excluded from the data synchronization task.
             */
            public Builder synchronizationObjects(java.util.List < SynchronizationObjects> synchronizationObjects) {
                this.synchronizationObjects = synchronizationObjects;
                return this;
            }

            /**
             * The objects that are synchronized by the task.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            public SynchronizationInstances build() {
                return new SynchronizationInstances(this);
            } 

        } 

    }
}
