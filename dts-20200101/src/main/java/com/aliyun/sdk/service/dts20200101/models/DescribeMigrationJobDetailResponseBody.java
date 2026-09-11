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
 * {@link DescribeMigrationJobDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMigrationJobDetailResponseBody</p>
 */
public class DescribeMigrationJobDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataInitializationDetailList")
    private DataInitializationDetailList dataInitializationDetailList;

    @com.aliyun.core.annotation.NameInMap("DataSynchronizationDetailList")
    private DataSynchronizationDetailList dataSynchronizationDetailList;

    @com.aliyun.core.annotation.NameInMap("ErrCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("ErrMessage")
    private String errMessage;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageRecordCount")
    private Integer pageRecordCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StructureInitializationDetailList")
    private StructureInitializationDetailList structureInitializationDetailList;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    @com.aliyun.core.annotation.NameInMap("TotalRecordCount")
    private Long totalRecordCount;

    private DescribeMigrationJobDetailResponseBody(Builder builder) {
        this.dataInitializationDetailList = builder.dataInitializationDetailList;
        this.dataSynchronizationDetailList = builder.dataSynchronizationDetailList;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.pageNumber = builder.pageNumber;
        this.pageRecordCount = builder.pageRecordCount;
        this.requestId = builder.requestId;
        this.structureInitializationDetailList = builder.structureInitializationDetailList;
        this.success = builder.success;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMigrationJobDetailResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return structureInitializationDetailList
     */
    public StructureInitializationDetailList getStructureInitializationDetailList() {
        return this.structureInitializationDetailList;
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
        private DataInitializationDetailList dataInitializationDetailList; 
        private DataSynchronizationDetailList dataSynchronizationDetailList; 
        private String errCode; 
        private String errMessage; 
        private Integer pageNumber; 
        private Integer pageRecordCount; 
        private String requestId; 
        private StructureInitializationDetailList structureInitializationDetailList; 
        private String success; 
        private Long totalRecordCount; 

        private Builder() {
        } 

        private Builder(DescribeMigrationJobDetailResponseBody model) {
            this.dataInitializationDetailList = model.dataInitializationDetailList;
            this.dataSynchronizationDetailList = model.dataSynchronizationDetailList;
            this.errCode = model.errCode;
            this.errMessage = model.errMessage;
            this.pageNumber = model.pageNumber;
            this.pageRecordCount = model.pageRecordCount;
            this.requestId = model.requestId;
            this.structureInitializationDetailList = model.structureInitializationDetailList;
            this.success = model.success;
            this.totalRecordCount = model.totalRecordCount;
        } 

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
         * <p>The maximum number of migration instances that can be displayed on one page.</p>
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
         * <p>0AE3CD0B-4148-426F-A90E-952467CC****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
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
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalRecordCount(Long totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeMigrationJobDetailResponseBody build() {
            return new DescribeMigrationJobDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeMigrationJobDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMigrationJobDetailResponseBody</p>
     */
    public static class DataInitializationDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DestinationOwnerDBName")
        private String destinationOwnerDBName;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("FinishRowNum")
        private String finishRowNum;

        @com.aliyun.core.annotation.NameInMap("MigrationTime")
        private String migrationTime;

        @com.aliyun.core.annotation.NameInMap("SourceOwnerDBName")
        private String sourceOwnerDBName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TableName")
        private String tableName;

        @com.aliyun.core.annotation.NameInMap("TotalRowNum")
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

            private Builder() {
            } 

            private Builder(DataInitializationDetail model) {
                this.destinationOwnerDBName = model.destinationOwnerDBName;
                this.errorMessage = model.errorMessage;
                this.finishRowNum = model.finishRowNum;
                this.migrationTime = model.migrationTime;
                this.sourceOwnerDBName = model.sourceOwnerDBName;
                this.status = model.status;
                this.tableName = model.tableName;
                this.totalRowNum = model.totalRowNum;
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
    /**
     * 
     * {@link DescribeMigrationJobDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMigrationJobDetailResponseBody</p>
     */
    public static class DataInitializationDetailList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataInitializationDetail")
        private java.util.List<DataInitializationDetail> dataInitializationDetail;

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
        public java.util.List<DataInitializationDetail> getDataInitializationDetail() {
            return this.dataInitializationDetail;
        }

        public static final class Builder {
            private java.util.List<DataInitializationDetail> dataInitializationDetail; 

            private Builder() {
            } 

            private Builder(DataInitializationDetailList model) {
                this.dataInitializationDetail = model.dataInitializationDetail;
            } 

            /**
             * DataInitializationDetail.
             */
            public Builder dataInitializationDetail(java.util.List<DataInitializationDetail> dataInitializationDetail) {
                this.dataInitializationDetail = dataInitializationDetail;
                return this;
            }

            public DataInitializationDetailList build() {
                return new DataInitializationDetailList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeMigrationJobDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMigrationJobDetailResponseBody</p>
     */
    public static class DataSynchronizationDetail extends TeaModel {
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

            private Builder() {
            } 

            private Builder(DataSynchronizationDetail model) {
                this.destinationOwnerDBName = model.destinationOwnerDBName;
                this.errorMessage = model.errorMessage;
                this.sourceOwnerDBName = model.sourceOwnerDBName;
                this.status = model.status;
                this.tableName = model.tableName;
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
    /**
     * 
     * {@link DescribeMigrationJobDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMigrationJobDetailResponseBody</p>
     */
    public static class DataSynchronizationDetailList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataSynchronizationDetail")
        private java.util.List<DataSynchronizationDetail> dataSynchronizationDetail;

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
        public java.util.List<DataSynchronizationDetail> getDataSynchronizationDetail() {
            return this.dataSynchronizationDetail;
        }

        public static final class Builder {
            private java.util.List<DataSynchronizationDetail> dataSynchronizationDetail; 

            private Builder() {
            } 

            private Builder(DataSynchronizationDetailList model) {
                this.dataSynchronizationDetail = model.dataSynchronizationDetail;
            } 

            /**
             * DataSynchronizationDetail.
             */
            public Builder dataSynchronizationDetail(java.util.List<DataSynchronizationDetail> dataSynchronizationDetail) {
                this.dataSynchronizationDetail = dataSynchronizationDetail;
                return this;
            }

            public DataSynchronizationDetailList build() {
                return new DataSynchronizationDetailList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeMigrationJobDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMigrationJobDetailResponseBody</p>
     */
    public static class StructureInitializationDetail extends TeaModel {
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

            private Builder() {
            } 

            private Builder(StructureInitializationDetail model) {
                this.destinationOwnerDBName = model.destinationOwnerDBName;
                this.errorMessage = model.errorMessage;
                this.objectDefinition = model.objectDefinition;
                this.objectName = model.objectName;
                this.objectType = model.objectType;
                this.sourceOwnerDBName = model.sourceOwnerDBName;
                this.status = model.status;
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

            public StructureInitializationDetail build() {
                return new StructureInitializationDetail(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeMigrationJobDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMigrationJobDetailResponseBody</p>
     */
    public static class ConstraintList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("StructureInitializationDetail")
        private java.util.List<StructureInitializationDetail> structureInitializationDetail;

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
        public java.util.List<StructureInitializationDetail> getStructureInitializationDetail() {
            return this.structureInitializationDetail;
        }

        public static final class Builder {
            private java.util.List<StructureInitializationDetail> structureInitializationDetail; 

            private Builder() {
            } 

            private Builder(ConstraintList model) {
                this.structureInitializationDetail = model.structureInitializationDetail;
            } 

            /**
             * StructureInitializationDetail.
             */
            public Builder structureInitializationDetail(java.util.List<StructureInitializationDetail> structureInitializationDetail) {
                this.structureInitializationDetail = structureInitializationDetail;
                return this;
            }

            public ConstraintList build() {
                return new ConstraintList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeMigrationJobDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMigrationJobDetailResponseBody</p>
     */
    public static class StructureInitializationDetailListStructureInitializationDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConstraintList")
        private ConstraintList constraintList;

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

            private Builder() {
            } 

            private Builder(StructureInitializationDetailListStructureInitializationDetail model) {
                this.constraintList = model.constraintList;
                this.destinationOwnerDBName = model.destinationOwnerDBName;
                this.errorMessage = model.errorMessage;
                this.objectDefinition = model.objectDefinition;
                this.objectName = model.objectName;
                this.objectType = model.objectType;
                this.sourceOwnerDBName = model.sourceOwnerDBName;
                this.status = model.status;
            } 

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
    /**
     * 
     * {@link DescribeMigrationJobDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMigrationJobDetailResponseBody</p>
     */
    public static class StructureInitializationDetailList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("StructureInitializationDetail")
        private java.util.List<StructureInitializationDetailListStructureInitializationDetail> structureInitializationDetail;

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
        public java.util.List<StructureInitializationDetailListStructureInitializationDetail> getStructureInitializationDetail() {
            return this.structureInitializationDetail;
        }

        public static final class Builder {
            private java.util.List<StructureInitializationDetailListStructureInitializationDetail> structureInitializationDetail; 

            private Builder() {
            } 

            private Builder(StructureInitializationDetailList model) {
                this.structureInitializationDetail = model.structureInitializationDetail;
            } 

            /**
             * StructureInitializationDetail.
             */
            public Builder structureInitializationDetail(java.util.List<StructureInitializationDetailListStructureInitializationDetail> structureInitializationDetail) {
                this.structureInitializationDetail = structureInitializationDetail;
                return this;
            }

            public StructureInitializationDetailList build() {
                return new StructureInitializationDetailList(this);
            } 

        } 

    }
}
