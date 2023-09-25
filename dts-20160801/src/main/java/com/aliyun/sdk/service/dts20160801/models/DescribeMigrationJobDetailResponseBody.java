// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20160801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMigrationJobDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMigrationJobDetailResponseBody</p>
 */
public class DescribeMigrationJobDetailResponseBody extends TeaModel {
    @NameInMap("DataInitializationDetailList")
    private DataInitializationDetailList dataInitializationDetailList;

    @NameInMap("DataSynchronizationDetailList")
    private DataSynchronizationDetailList dataSynchronizationDetailList;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageRecordCount")
    private Integer pageRecordCount;

    @NameInMap("StructureInitializationDetailList")
    private StructureInitializationDetailList structureInitializationDetailList;

    @NameInMap("TotalRecordCount")
    private Long totalRecordCount;

    private DescribeMigrationJobDetailResponseBody(Builder builder) {
        this.dataInitializationDetailList = builder.dataInitializationDetailList;
        this.dataSynchronizationDetailList = builder.dataSynchronizationDetailList;
        this.pageNumber = builder.pageNumber;
        this.pageRecordCount = builder.pageRecordCount;
        this.structureInitializationDetailList = builder.structureInitializationDetailList;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMigrationJobDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return dataInitializationDetailList
     */
    public DataInitializationDetailList getDataInitializationDetailList() {
        return this.dataInitializationDetailList;
    }

    /**
     * @return dataSynchronizationDetailList
     */
    public DataSynchronizationDetailList getDataSynchronizationDetailList() {
        return this.dataSynchronizationDetailList;
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
     * @return structureInitializationDetailList
     */
    public StructureInitializationDetailList getStructureInitializationDetailList() {
        return this.structureInitializationDetailList;
    }

    /**
     * @return totalRecordCount
     */
    public Long getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static final class Builder {
        private DataInitializationDetailList dataInitializationDetailList; 
        private DataSynchronizationDetailList dataSynchronizationDetailList; 
        private Integer pageNumber; 
        private Integer pageRecordCount; 
        private StructureInitializationDetailList structureInitializationDetailList; 
        private Long totalRecordCount; 

        /**
         * DataInitializationDetailList.
         */
        public Builder dataInitializationDetailList(DataInitializationDetailList dataInitializationDetailList) {
            this.dataInitializationDetailList = dataInitializationDetailList;
            return this;
        }

        /**
         * DataSynchronizationDetailList.
         */
        public Builder dataSynchronizationDetailList(DataSynchronizationDetailList dataSynchronizationDetailList) {
            this.dataSynchronizationDetailList = dataSynchronizationDetailList;
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
         * StructureInitializationDetailList.
         */
        public Builder structureInitializationDetailList(StructureInitializationDetailList structureInitializationDetailList) {
            this.structureInitializationDetailList = structureInitializationDetailList;
            return this;
        }

        /**
         * TotalRecordCount.
         */
        public Builder totalRecordCount(Long totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeMigrationJobDetailResponseBody build() {
            return new DescribeMigrationJobDetailResponseBody(this);
        } 

    } 

    public static class DataInitializationDetail extends TeaModel {
        @NameInMap("DestinationOwnerDBName")
        private String destinationOwnerDBName;

        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("FinishRowNum")
        private String finishRowNum;

        @NameInMap("MigrationTime")
        private String migrationTime;

        @NameInMap("SourceOwnerDBName")
        private String sourceOwnerDBName;

        @NameInMap("Status")
        private String status;

        @NameInMap("TableName")
        private String tableName;

        @NameInMap("TotalRowNum")
        private String totalRowNum;

        private DataInitializationDetail(Builder builder) {
            this.destinationOwnerDBName = builder.destinationOwnerDBName;
            this.errorMessage = builder.errorMessage;
            this.finishRowNum = builder.finishRowNum;
            this.migrationTime = builder.migrationTime;
            this.sourceOwnerDBName = builder.sourceOwnerDBName;
            this.status = builder.status;
            this.tableName = builder.tableName;
            this.totalRowNum = builder.totalRowNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataInitializationDetail create() {
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
         * @return migrationTime
         */
        public String getMigrationTime() {
            return this.migrationTime;
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

        public static final class Builder {
            private String destinationOwnerDBName; 
            private String errorMessage; 
            private String finishRowNum; 
            private String migrationTime; 
            private String sourceOwnerDBName; 
            private String status; 
            private String tableName; 
            private String totalRowNum; 

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
             * MigrationTime.
             */
            public Builder migrationTime(String migrationTime) {
                this.migrationTime = migrationTime;
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

            public DataInitializationDetail build() {
                return new DataInitializationDetail(this);
            } 

        } 

    }
    public static class DataInitializationDetailList extends TeaModel {
        @NameInMap("DataInitializationDetail")
        private java.util.List < DataInitializationDetail> dataInitializationDetail;

        private DataInitializationDetailList(Builder builder) {
            this.dataInitializationDetail = builder.dataInitializationDetail;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataInitializationDetailList create() {
            return builder().build();
        }

        /**
         * @return dataInitializationDetail
         */
        public java.util.List < DataInitializationDetail> getDataInitializationDetail() {
            return this.dataInitializationDetail;
        }

        public static final class Builder {
            private java.util.List < DataInitializationDetail> dataInitializationDetail; 

            /**
             * DataInitializationDetail.
             */
            public Builder dataInitializationDetail(java.util.List < DataInitializationDetail> dataInitializationDetail) {
                this.dataInitializationDetail = dataInitializationDetail;
                return this;
            }

            public DataInitializationDetailList build() {
                return new DataInitializationDetailList(this);
            } 

        } 

    }
    public static class DataSynchronizationDetail extends TeaModel {
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

        private DataSynchronizationDetail(Builder builder) {
            this.destinationOwnerDBName = builder.destinationOwnerDBName;
            this.errorMessage = builder.errorMessage;
            this.sourceOwnerDBName = builder.sourceOwnerDBName;
            this.status = builder.status;
            this.tableName = builder.tableName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataSynchronizationDetail create() {
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

            public DataSynchronizationDetail build() {
                return new DataSynchronizationDetail(this);
            } 

        } 

    }
    public static class DataSynchronizationDetailList extends TeaModel {
        @NameInMap("DataSynchronizationDetail")
        private java.util.List < DataSynchronizationDetail> dataSynchronizationDetail;

        private DataSynchronizationDetailList(Builder builder) {
            this.dataSynchronizationDetail = builder.dataSynchronizationDetail;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataSynchronizationDetailList create() {
            return builder().build();
        }

        /**
         * @return dataSynchronizationDetail
         */
        public java.util.List < DataSynchronizationDetail> getDataSynchronizationDetail() {
            return this.dataSynchronizationDetail;
        }

        public static final class Builder {
            private java.util.List < DataSynchronizationDetail> dataSynchronizationDetail; 

            /**
             * DataSynchronizationDetail.
             */
            public Builder dataSynchronizationDetail(java.util.List < DataSynchronizationDetail> dataSynchronizationDetail) {
                this.dataSynchronizationDetail = dataSynchronizationDetail;
                return this;
            }

            public DataSynchronizationDetailList build() {
                return new DataSynchronizationDetailList(this);
            } 

        } 

    }
    public static class StructureInitializationDetail extends TeaModel {
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

        private StructureInitializationDetail(Builder builder) {
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

        public static StructureInitializationDetail create() {
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

            public StructureInitializationDetail build() {
                return new StructureInitializationDetail(this);
            } 

        } 

    }
    public static class ConstraintList extends TeaModel {
        @NameInMap("StructureInitializationDetail")
        private java.util.List < StructureInitializationDetail> structureInitializationDetail;

        private ConstraintList(Builder builder) {
            this.structureInitializationDetail = builder.structureInitializationDetail;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConstraintList create() {
            return builder().build();
        }

        /**
         * @return structureInitializationDetail
         */
        public java.util.List < StructureInitializationDetail> getStructureInitializationDetail() {
            return this.structureInitializationDetail;
        }

        public static final class Builder {
            private java.util.List < StructureInitializationDetail> structureInitializationDetail; 

            /**
             * StructureInitializationDetail.
             */
            public Builder structureInitializationDetail(java.util.List < StructureInitializationDetail> structureInitializationDetail) {
                this.structureInitializationDetail = structureInitializationDetail;
                return this;
            }

            public ConstraintList build() {
                return new ConstraintList(this);
            } 

        } 

    }
    public static class StructureInitializationDetailListStructureInitializationDetail extends TeaModel {
        @NameInMap("ConstraintList")
        private ConstraintList constraintList;

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

        private StructureInitializationDetailListStructureInitializationDetail(Builder builder) {
            this.constraintList = builder.constraintList;
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

        public static StructureInitializationDetailListStructureInitializationDetail create() {
            return builder().build();
        }

        /**
         * @return constraintList
         */
        public ConstraintList getConstraintList() {
            return this.constraintList;
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
            private ConstraintList constraintList; 
            private String destinationOwnerDBName; 
            private String errorMessage; 
            private String objectDefinition; 
            private String objectName; 
            private String objectType; 
            private String sourceOwnerDBName; 
            private String status; 

            /**
             * ConstraintList.
             */
            public Builder constraintList(ConstraintList constraintList) {
                this.constraintList = constraintList;
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

            public StructureInitializationDetailListStructureInitializationDetail build() {
                return new StructureInitializationDetailListStructureInitializationDetail(this);
            } 

        } 

    }
    public static class StructureInitializationDetailList extends TeaModel {
        @NameInMap("StructureInitializationDetail")
        private java.util.List < StructureInitializationDetailListStructureInitializationDetail> structureInitializationDetail;

        private StructureInitializationDetailList(Builder builder) {
            this.structureInitializationDetail = builder.structureInitializationDetail;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StructureInitializationDetailList create() {
            return builder().build();
        }

        /**
         * @return structureInitializationDetail
         */
        public java.util.List < StructureInitializationDetailListStructureInitializationDetail> getStructureInitializationDetail() {
            return this.structureInitializationDetail;
        }

        public static final class Builder {
            private java.util.List < StructureInitializationDetailListStructureInitializationDetail> structureInitializationDetail; 

            /**
             * StructureInitializationDetail.
             */
            public Builder structureInitializationDetail(java.util.List < StructureInitializationDetailListStructureInitializationDetail> structureInitializationDetail) {
                this.structureInitializationDetail = structureInitializationDetail;
                return this;
            }

            public StructureInitializationDetailList build() {
                return new StructureInitializationDetailList(this);
            } 

        } 

    }
}
