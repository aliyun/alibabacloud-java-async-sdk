// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20160801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMigrationJobStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMigrationJobStatusResponseBody</p>
 */
public class DescribeMigrationJobStatusResponseBody extends TeaModel {
    @NameInMap("DataInitializationStatus")
    private DataInitializationStatus dataInitializationStatus;

    @NameInMap("DataSynchronizationStatus")
    private DataSynchronizationStatus dataSynchronizationStatus;

    @NameInMap("DestinationEndpoint")
    private DestinationEndpoint destinationEndpoint;

    @NameInMap("MigrationJobClass")
    private String migrationJobClass;

    @NameInMap("MigrationJobId")
    private String migrationJobId;

    @NameInMap("MigrationJobName")
    private String migrationJobName;

    @NameInMap("MigrationJobStatus")
    private String migrationJobStatus;

    @NameInMap("MigrationMode")
    private MigrationMode migrationMode;

    @NameInMap("MigrationObject")
    private String migrationObject;

    @NameInMap("PayType")
    private String payType;

    @NameInMap("PrecheckStatus")
    private PrecheckStatus precheckStatus;

    @NameInMap("SourceEndpoint")
    private SourceEndpoint sourceEndpoint;

    @NameInMap("StructureInitializationStatus")
    private StructureInitializationStatus structureInitializationStatus;

    private DescribeMigrationJobStatusResponseBody(Builder builder) {
        this.dataInitializationStatus = builder.dataInitializationStatus;
        this.dataSynchronizationStatus = builder.dataSynchronizationStatus;
        this.destinationEndpoint = builder.destinationEndpoint;
        this.migrationJobClass = builder.migrationJobClass;
        this.migrationJobId = builder.migrationJobId;
        this.migrationJobName = builder.migrationJobName;
        this.migrationJobStatus = builder.migrationJobStatus;
        this.migrationMode = builder.migrationMode;
        this.migrationObject = builder.migrationObject;
        this.payType = builder.payType;
        this.precheckStatus = builder.precheckStatus;
        this.sourceEndpoint = builder.sourceEndpoint;
        this.structureInitializationStatus = builder.structureInitializationStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMigrationJobStatusResponseBody create() {
        return builder().build();
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

    public static final class Builder {
        private DataInitializationStatus dataInitializationStatus; 
        private DataSynchronizationStatus dataSynchronizationStatus; 
        private DestinationEndpoint destinationEndpoint; 
        private String migrationJobClass; 
        private String migrationJobId; 
        private String migrationJobName; 
        private String migrationJobStatus; 
        private MigrationMode migrationMode; 
        private String migrationObject; 
        private String payType; 
        private PrecheckStatus precheckStatus; 
        private SourceEndpoint sourceEndpoint; 
        private StructureInitializationStatus structureInitializationStatus; 

        /**
         * DataInitializationStatus.
         */
        public Builder dataInitializationStatus(DataInitializationStatus dataInitializationStatus) {
            this.dataInitializationStatus = dataInitializationStatus;
            return this;
        }

        /**
         * DataSynchronizationStatus.
         */
        public Builder dataSynchronizationStatus(DataSynchronizationStatus dataSynchronizationStatus) {
            this.dataSynchronizationStatus = dataSynchronizationStatus;
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
         * MigrationJobId.
         */
        public Builder migrationJobId(String migrationJobId) {
            this.migrationJobId = migrationJobId;
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
        public Builder migrationObject(String migrationObject) {
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
         * PrecheckStatus.
         */
        public Builder precheckStatus(PrecheckStatus precheckStatus) {
            this.precheckStatus = precheckStatus;
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
         * StructureInitializationStatus.
         */
        public Builder structureInitializationStatus(StructureInitializationStatus structureInitializationStatus) {
            this.structureInitializationStatus = structureInitializationStatus;
            return this;
        }

        public DescribeMigrationJobStatusResponseBody build() {
            return new DescribeMigrationJobStatusResponseBody(this);
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
             * Status.
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
        @NameInMap("Checkpoint")
        private String checkpoint;

        @NameInMap("Delay")
        private String delay;

        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("Percent")
        private String percent;

        @NameInMap("Status")
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

            /**
             * Checkpoint.
             */
            public Builder checkpoint(String checkpoint) {
                this.checkpoint = checkpoint;
                return this;
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
             * Status.
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
        @NameInMap("DatabaseName")
        private String databaseName;

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

        @NameInMap("oracleSID")
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
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
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

            /**
             * oracleSID.
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
    public static class MigrationMode extends TeaModel {
        @NameInMap("dataInitialization")
        private Boolean dataInitialization;

        @NameInMap("dataSynchronization")
        private Boolean dataSynchronization;

        @NameInMap("structureInitialization")
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
             * dataInitialization.
             */
            public Builder dataInitialization(Boolean dataInitialization) {
                this.dataInitialization = dataInitialization;
                return this;
            }

            /**
             * dataSynchronization.
             */
            public Builder dataSynchronization(Boolean dataSynchronization) {
                this.dataSynchronization = dataSynchronization;
                return this;
            }

            /**
             * structureInitialization.
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
    public static class CheckItem extends TeaModel {
        @NameInMap("CheckStatus")
        private String checkStatus;

        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("ItemName")
        private String itemName;

        @NameInMap("RepairMethod")
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

            /**
             * CheckStatus.
             */
            public Builder checkStatus(String checkStatus) {
                this.checkStatus = checkStatus;
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
    public static class Detail extends TeaModel {
        @NameInMap("CheckItem")
        private java.util.List < CheckItem> checkItem;

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
        public java.util.List < CheckItem> getCheckItem() {
            return this.checkItem;
        }

        public static final class Builder {
            private java.util.List < CheckItem> checkItem; 

            /**
             * CheckItem.
             */
            public Builder checkItem(java.util.List < CheckItem> checkItem) {
                this.checkItem = checkItem;
                return this;
            }

            public Detail build() {
                return new Detail(this);
            } 

        } 

    }
    public static class PrecheckStatus extends TeaModel {
        @NameInMap("Detail")
        private Detail detail;

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

            /**
             * Detail.
             */
            public Builder detail(Detail detail) {
                this.detail = detail;
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
             * Status.
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
        @NameInMap("DatabaseName")
        private String databaseName;

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

        @NameInMap("oracleSID")
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
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
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

            /**
             * oracleSID.
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
             * Status.
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
