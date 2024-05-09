// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInitializationStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInitializationStatusResponseBody</p>
 */
public class DescribeInitializationStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataInitializationDetails")
    private java.util.List < DataInitializationDetails> dataInitializationDetails;

    @com.aliyun.core.annotation.NameInMap("DataSynchronizationDetails")
    private java.util.List < DataSynchronizationDetails> dataSynchronizationDetails;

    @com.aliyun.core.annotation.NameInMap("ErrCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("ErrMessage")
    private String errMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StructureInitializationDetails")
    private java.util.List < StructureInitializationDetails> structureInitializationDetails;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    private DescribeInitializationStatusResponseBody(Builder builder) {
        this.dataInitializationDetails = builder.dataInitializationDetails;
        this.dataSynchronizationDetails = builder.dataSynchronizationDetails;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.requestId = builder.requestId;
        this.structureInitializationDetails = builder.structureInitializationDetails;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInitializationStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return dataInitializationDetails
     */
    public java.util.List < DataInitializationDetails> getDataInitializationDetails() {
        return this.dataInitializationDetails;
    }

    /**
     * @return dataSynchronizationDetails
     */
    public java.util.List < DataSynchronizationDetails> getDataSynchronizationDetails() {
        return this.dataSynchronizationDetails;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return structureInitializationDetails
     */
    public java.util.List < StructureInitializationDetails> getStructureInitializationDetails() {
        return this.structureInitializationDetails;
    }

    /**
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private java.util.List < DataInitializationDetails> dataInitializationDetails; 
        private java.util.List < DataSynchronizationDetails> dataSynchronizationDetails; 
        private String errCode; 
        private String errMessage; 
        private String requestId; 
        private java.util.List < StructureInitializationDetails> structureInitializationDetails; 
        private String success; 

        /**
         * The details of initial full data synchronization.
         */
        public Builder dataInitializationDetails(java.util.List < DataInitializationDetails> dataInitializationDetails) {
            this.dataInitializationDetails = dataInitializationDetails;
            return this;
        }

        /**
         * The details of incremental data synchronization.
         * <p>
         * 
         * >  This parameter and the parameters it contains will be removed in the future.
         */
        public Builder dataSynchronizationDetails(java.util.List < DataSynchronizationDetails> dataSynchronizationDetails) {
            this.dataSynchronizationDetails = dataSynchronizationDetails;
            return this;
        }

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
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The details of initial schema synchronization.
         */
        public Builder structureInitializationDetails(java.util.List < StructureInitializationDetails> structureInitializationDetails) {
            this.structureInitializationDetails = structureInitializationDetails;
            return this;
        }

        /**
         * Indicates whether the call was successful.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public DescribeInitializationStatusResponseBody build() {
            return new DescribeInitializationStatusResponseBody(this);
        } 

    } 

    public static class DataInitializationDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DestinationOwnerDBName")
        private String destinationOwnerDBName;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("FinishRowNum")
        private String finishRowNum;

        @com.aliyun.core.annotation.NameInMap("SourceOwnerDBName")
        private String sourceOwnerDBName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TableName")
        private String tableName;

        @com.aliyun.core.annotation.NameInMap("TotalRowNum")
        private String totalRowNum;

        @com.aliyun.core.annotation.NameInMap("UsedTime")
        private String usedTime;

        private DataInitializationDetails(Builder builder) {
            this.destinationOwnerDBName = builder.destinationOwnerDBName;
            this.errorMessage = builder.errorMessage;
            this.finishRowNum = builder.finishRowNum;
            this.sourceOwnerDBName = builder.sourceOwnerDBName;
            this.status = builder.status;
            this.tableName = builder.tableName;
            this.totalRowNum = builder.totalRowNum;
            this.usedTime = builder.usedTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataInitializationDetails create() {
            return builder().build();
        }

        /**
         * @return destinationOwnerDBName
         */
        public String getDestinationOwnerDBName() {
            return this.destinationOwnerDBName;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return finishRowNum
         */
        public String getFinishRowNum() {
            return this.finishRowNum;
        }

        /**
         * @return sourceOwnerDBName
         */
        public String getSourceOwnerDBName() {
            return this.sourceOwnerDBName;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        /**
         * @return totalRowNum
         */
        public String getTotalRowNum() {
            return this.totalRowNum;
        }

        /**
         * @return usedTime
         */
        public String getUsedTime() {
            return this.usedTime;
        }

        public static final class Builder {
            private String destinationOwnerDBName; 
            private String errorMessage; 
            private String finishRowNum; 
            private String sourceOwnerDBName; 
            private String status; 
            private String tableName; 
            private String totalRowNum; 
            private String usedTime; 

            /**
             * The name of the database to which the object in the destination instance belongs.
             */
            public Builder destinationOwnerDBName(String destinationOwnerDBName) {
                this.destinationOwnerDBName = destinationOwnerDBName;
                return this;
            }

            /**
             * The error message returned if initial full data synchronization failed.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * The total number of rows that are actually synchronized.
             * <p>
             * 
             * >  This parameter indicates the total number of actually synchronized rows. In contrast, the value of the **TotalRowNum** parameter is calculated based on the system tables in the source database. The values of the two parameters may be different due to time difference.
             */
            public Builder finishRowNum(String finishRowNum) {
                this.finishRowNum = finishRowNum;
                return this;
            }

            /**
             * The name of the database to which the object in the source instance belongs.
             */
            public Builder sourceOwnerDBName(String sourceOwnerDBName) {
                this.sourceOwnerDBName = sourceOwnerDBName;
                return this;
            }

            /**
             * The status of initial full data synchronization. Valid values:
             * <p>
             * 
             * *   **NotStarted**
             * *   **Migrating**
             * *   **Failed**
             * *   **Finished**
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The table name.
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            /**
             * The total number of rows that are supposed to be synchronized.
             * <p>
             * 
             * >  The value of this parameter is calculated based on the system tables in the source database. In contrast, the **FinishRowNum** parameter indicates the total number of actually synchronized rows. The values of the two parameters may be different due to time difference.
             */
            public Builder totalRowNum(String totalRowNum) {
                this.totalRowNum = totalRowNum;
                return this;
            }

            /**
             * The time spent on full data synchronization.
             */
            public Builder usedTime(String usedTime) {
                this.usedTime = usedTime;
                return this;
            }

            public DataInitializationDetails build() {
                return new DataInitializationDetails(this);
            } 

        } 

    }
    public static class DataSynchronizationDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DestinationOwnerDBName")
        private String destinationOwnerDBName;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("SourceOwnerDBName")
        private String sourceOwnerDBName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TableName")
        private String tableName;

        private DataSynchronizationDetails(Builder builder) {
            this.destinationOwnerDBName = builder.destinationOwnerDBName;
            this.errorMessage = builder.errorMessage;
            this.sourceOwnerDBName = builder.sourceOwnerDBName;
            this.status = builder.status;
            this.tableName = builder.tableName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataSynchronizationDetails create() {
            return builder().build();
        }

        /**
         * @return destinationOwnerDBName
         */
        public String getDestinationOwnerDBName() {
            return this.destinationOwnerDBName;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return sourceOwnerDBName
         */
        public String getSourceOwnerDBName() {
            return this.sourceOwnerDBName;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        public static final class Builder {
            private String destinationOwnerDBName; 
            private String errorMessage; 
            private String sourceOwnerDBName; 
            private String status; 
            private String tableName; 

            /**
             * The name of the database to which the object in the destination instance belongs.
             */
            public Builder destinationOwnerDBName(String destinationOwnerDBName) {
                this.destinationOwnerDBName = destinationOwnerDBName;
                return this;
            }

            /**
             * The error message returned if incremental data synchronization failed.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * The name of the database to which the object in the source instance belongs.
             */
            public Builder sourceOwnerDBName(String sourceOwnerDBName) {
                this.sourceOwnerDBName = sourceOwnerDBName;
                return this;
            }

            /**
             * The status of incremental data synchronization. Valid values:
             * <p>
             * 
             * *   **NotStarted**
             * *   **Migrating**
             * *   **Failed**
             * *   **Finished**
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The table name.
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            public DataSynchronizationDetails build() {
                return new DataSynchronizationDetails(this);
            } 

        } 

    }
    public static class Constraints extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DestinationOwnerDBName")
        private String destinationOwnerDBName;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("ObjectDefinition")
        private String objectDefinition;

        @com.aliyun.core.annotation.NameInMap("ObjectName")
        private String objectName;

        @com.aliyun.core.annotation.NameInMap("ObjectType")
        private String objectType;

        @com.aliyun.core.annotation.NameInMap("SourceOwnerDBName")
        private String sourceOwnerDBName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Constraints(Builder builder) {
            this.destinationOwnerDBName = builder.destinationOwnerDBName;
            this.errorMessage = builder.errorMessage;
            this.objectDefinition = builder.objectDefinition;
            this.objectName = builder.objectName;
            this.objectType = builder.objectType;
            this.sourceOwnerDBName = builder.sourceOwnerDBName;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Constraints create() {
            return builder().build();
        }

        /**
         * @return destinationOwnerDBName
         */
        public String getDestinationOwnerDBName() {
            return this.destinationOwnerDBName;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return objectDefinition
         */
        public String getObjectDefinition() {
            return this.objectDefinition;
        }

        /**
         * @return objectName
         */
        public String getObjectName() {
            return this.objectName;
        }

        /**
         * @return objectType
         */
        public String getObjectType() {
            return this.objectType;
        }

        /**
         * @return sourceOwnerDBName
         */
        public String getSourceOwnerDBName() {
            return this.sourceOwnerDBName;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String destinationOwnerDBName; 
            private String errorMessage; 
            private String objectDefinition; 
            private String objectName; 
            private String objectType; 
            private String sourceOwnerDBName; 
            private String status; 

            /**
             * The name of the database to which the object in the destination instance belongs.
             */
            public Builder destinationOwnerDBName(String destinationOwnerDBName) {
                this.destinationOwnerDBName = destinationOwnerDBName;
                return this;
            }

            /**
             * The error message returned if constraints failed to be created.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * The syntax to create constraints.
             */
            public Builder objectDefinition(String objectDefinition) {
                this.objectDefinition = objectDefinition;
                return this;
            }

            /**
             * The name of the object.
             */
            public Builder objectName(String objectName) {
                this.objectName = objectName;
                return this;
            }

            /**
             * The type of the object. Valid value: **Table**.
             */
            public Builder objectType(String objectType) {
                this.objectType = objectType;
                return this;
            }

            /**
             * The name of the database to which the object in the source instance belongs.
             */
            public Builder sourceOwnerDBName(String sourceOwnerDBName) {
                this.sourceOwnerDBName = sourceOwnerDBName;
                return this;
            }

            /**
             * The status of constraint creation. Valid values:
             * <p>
             * 
             * *   **NotStarted**
             * *   **Migrating**
             * *   **Failed**
             * *   **Finished**
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Constraints build() {
                return new Constraints(this);
            } 

        } 

    }
    public static class StructureInitializationDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Constraints")
        private java.util.List < Constraints> constraints;

        @com.aliyun.core.annotation.NameInMap("DestinationOwnerDBName")
        private String destinationOwnerDBName;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("ObjectDefinition")
        private String objectDefinition;

        @com.aliyun.core.annotation.NameInMap("ObjectName")
        private String objectName;

        @com.aliyun.core.annotation.NameInMap("ObjectType")
        private String objectType;

        @com.aliyun.core.annotation.NameInMap("SourceOwnerDBName")
        private String sourceOwnerDBName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private StructureInitializationDetails(Builder builder) {
            this.constraints = builder.constraints;
            this.destinationOwnerDBName = builder.destinationOwnerDBName;
            this.errorMessage = builder.errorMessage;
            this.objectDefinition = builder.objectDefinition;
            this.objectName = builder.objectName;
            this.objectType = builder.objectType;
            this.sourceOwnerDBName = builder.sourceOwnerDBName;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StructureInitializationDetails create() {
            return builder().build();
        }

        /**
         * @return constraints
         */
        public java.util.List < Constraints> getConstraints() {
            return this.constraints;
        }

        /**
         * @return destinationOwnerDBName
         */
        public String getDestinationOwnerDBName() {
            return this.destinationOwnerDBName;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return objectDefinition
         */
        public String getObjectDefinition() {
            return this.objectDefinition;
        }

        /**
         * @return objectName
         */
        public String getObjectName() {
            return this.objectName;
        }

        /**
         * @return objectType
         */
        public String getObjectType() {
            return this.objectType;
        }

        /**
         * @return sourceOwnerDBName
         */
        public String getSourceOwnerDBName() {
            return this.sourceOwnerDBName;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private java.util.List < Constraints> constraints; 
            private String destinationOwnerDBName; 
            private String errorMessage; 
            private String objectDefinition; 
            private String objectName; 
            private String objectType; 
            private String sourceOwnerDBName; 
            private String status; 

            /**
             * The constraints of the synchronization object, such as indexes and foreign keys.
             * <p>
             * 
             * >  This parameter is returned only if the **ObjectType** parameter is set to **Table** and the synchronization object has constraints.
             */
            public Builder constraints(java.util.List < Constraints> constraints) {
                this.constraints = constraints;
                return this;
            }

            /**
             * The name of the database to which the object in the destination instance belongs.
             */
            public Builder destinationOwnerDBName(String destinationOwnerDBName) {
                this.destinationOwnerDBName = destinationOwnerDBName;
                return this;
            }

            /**
             * The error message returned if initial schema synchronization failed.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * The schema of the object.
             */
            public Builder objectDefinition(String objectDefinition) {
                this.objectDefinition = objectDefinition;
                return this;
            }

            /**
             * The name of the object.
             */
            public Builder objectName(String objectName) {
                this.objectName = objectName;
                return this;
            }

            /**
             * The type of the object. Valid values:
             * <p>
             * 
             * **Table**, **Constraint**, **Index**, **View**, **Materialize View**, **Type**, **Synonym**, **Trigger**, **Function**, **Procedure**, **Package**, **Default**, **Rule**, **PlanGuide**, and **Sequence**.
             */
            public Builder objectType(String objectType) {
                this.objectType = objectType;
                return this;
            }

            /**
             * The name of the database to which the object in the source instance belongs.
             */
            public Builder sourceOwnerDBName(String sourceOwnerDBName) {
                this.sourceOwnerDBName = sourceOwnerDBName;
                return this;
            }

            /**
             * The status of initial schema synchronization. Valid values:
             * <p>
             * 
             * *   **NotStarted**
             * *   **Migrating**
             * *   **Failed**
             * *   **Finished**
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public StructureInitializationDetails build() {
                return new StructureInitializationDetails(this);
            } 

        } 

    }
}
