// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20160801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInitializationStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInitializationStatusResponseBody</p>
 */
public class DescribeInitializationStatusResponseBody extends TeaModel {
    @NameInMap("DataInitializationDetails")
    private java.util.List < DataInitializationDetails> dataInitializationDetails;

    @NameInMap("DataSynchronizationDetails")
    private java.util.List < DataSynchronizationDetails> dataSynchronizationDetails;

    @NameInMap("StructureInitializationDetails")
    private java.util.List < StructureInitializationDetails> structureInitializationDetails;

    private DescribeInitializationStatusResponseBody(Builder builder) {
        this.dataInitializationDetails = builder.dataInitializationDetails;
        this.dataSynchronizationDetails = builder.dataSynchronizationDetails;
        this.structureInitializationDetails = builder.structureInitializationDetails;
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
     * @return structureInitializationDetails
     */
    public java.util.List < StructureInitializationDetails> getStructureInitializationDetails() {
        return this.structureInitializationDetails;
    }

    public static final class Builder {
        private java.util.List < DataInitializationDetails> dataInitializationDetails; 
        private java.util.List < DataSynchronizationDetails> dataSynchronizationDetails; 
        private java.util.List < StructureInitializationDetails> structureInitializationDetails; 

        /**
         * DataInitializationDetails.
         */
        public Builder dataInitializationDetails(java.util.List < DataInitializationDetails> dataInitializationDetails) {
            this.dataInitializationDetails = dataInitializationDetails;
            return this;
        }

        /**
         * DataSynchronizationDetails.
         */
        public Builder dataSynchronizationDetails(java.util.List < DataSynchronizationDetails> dataSynchronizationDetails) {
            this.dataSynchronizationDetails = dataSynchronizationDetails;
            return this;
        }

        /**
         * StructureInitializationDetails.
         */
        public Builder structureInitializationDetails(java.util.List < StructureInitializationDetails> structureInitializationDetails) {
            this.structureInitializationDetails = structureInitializationDetails;
            return this;
        }

        public DescribeInitializationStatusResponseBody build() {
            return new DescribeInitializationStatusResponseBody(this);
        } 

    } 

    public static class DataInitializationDetails extends TeaModel {
        @NameInMap("DestinationOwnerDBName")
        private String destinationOwnerDBName;

        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("FinishRowNum")
        private String finishRowNum;

        @NameInMap("SourceOwnerDBName")
        private String sourceOwnerDBName;

        @NameInMap("Status")
        private String status;

        @NameInMap("TableName")
        private String tableName;

        @NameInMap("TotalRowNum")
        private String totalRowNum;

        @NameInMap("UsedTime")
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
             * DestinationOwnerDBName.
             */
            public Builder destinationOwnerDBName(String destinationOwnerDBName) {
                this.destinationOwnerDBName = destinationOwnerDBName;
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
             * FinishRowNum.
             */
            public Builder finishRowNum(String finishRowNum) {
                this.finishRowNum = finishRowNum;
                return this;
            }

            /**
             * SourceOwnerDBName.
             */
            public Builder sourceOwnerDBName(String sourceOwnerDBName) {
                this.sourceOwnerDBName = sourceOwnerDBName;
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
             * TableName.
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            /**
             * TotalRowNum.
             */
            public Builder totalRowNum(String totalRowNum) {
                this.totalRowNum = totalRowNum;
                return this;
            }

            /**
             * UsedTime.
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
        @NameInMap("DestinationOwnerDBName")
        private String destinationOwnerDBName;

        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("SourceOwnerDBName")
        private String sourceOwnerDBName;

        @NameInMap("Status")
        private String status;

        @NameInMap("TableName")
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
             * DestinationOwnerDBName.
             */
            public Builder destinationOwnerDBName(String destinationOwnerDBName) {
                this.destinationOwnerDBName = destinationOwnerDBName;
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
             * SourceOwnerDBName.
             */
            public Builder sourceOwnerDBName(String sourceOwnerDBName) {
                this.sourceOwnerDBName = sourceOwnerDBName;
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
             * TableName.
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
        @NameInMap("DestinationOwnerDBName")
        private String destinationOwnerDBName;

        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("ObjectDefinition")
        private String objectDefinition;

        @NameInMap("ObjectName")
        private String objectName;

        @NameInMap("ObjectType")
        private String objectType;

        @NameInMap("SourceOwnerDBName")
        private String sourceOwnerDBName;

        @NameInMap("Status")
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
             * DestinationOwnerDBName.
             */
            public Builder destinationOwnerDBName(String destinationOwnerDBName) {
                this.destinationOwnerDBName = destinationOwnerDBName;
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
             * ObjectDefinition.
             */
            public Builder objectDefinition(String objectDefinition) {
                this.objectDefinition = objectDefinition;
                return this;
            }

            /**
             * ObjectName.
             */
            public Builder objectName(String objectName) {
                this.objectName = objectName;
                return this;
            }

            /**
             * ObjectType.
             */
            public Builder objectType(String objectType) {
                this.objectType = objectType;
                return this;
            }

            /**
             * SourceOwnerDBName.
             */
            public Builder sourceOwnerDBName(String sourceOwnerDBName) {
                this.sourceOwnerDBName = sourceOwnerDBName;
                return this;
            }

            /**
             * Status.
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
        @NameInMap("Constraints")
        private java.util.List < Constraints> constraints;

        @NameInMap("DestinationOwnerDBName")
        private String destinationOwnerDBName;

        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("ObjectDefinition")
        private String objectDefinition;

        @NameInMap("ObjectName")
        private String objectName;

        @NameInMap("ObjectType")
        private String objectType;

        @NameInMap("SourceOwnerDBName")
        private String sourceOwnerDBName;

        @NameInMap("Status")
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
             * Constraints.
             */
            public Builder constraints(java.util.List < Constraints> constraints) {
                this.constraints = constraints;
                return this;
            }

            /**
             * DestinationOwnerDBName.
             */
            public Builder destinationOwnerDBName(String destinationOwnerDBName) {
                this.destinationOwnerDBName = destinationOwnerDBName;
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
             * ObjectDefinition.
             */
            public Builder objectDefinition(String objectDefinition) {
                this.objectDefinition = objectDefinition;
                return this;
            }

            /**
             * ObjectName.
             */
            public Builder objectName(String objectName) {
                this.objectName = objectName;
                return this;
            }

            /**
             * ObjectType.
             */
            public Builder objectType(String objectType) {
                this.objectType = objectType;
                return this;
            }

            /**
             * SourceOwnerDBName.
             */
            public Builder sourceOwnerDBName(String sourceOwnerDBName) {
                this.sourceOwnerDBName = sourceOwnerDBName;
                return this;
            }

            /**
             * Status.
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
