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

        /**
         * <p>The maximum number of data migration instances that can be displayed on one page.</p>
         */
        public Builder dataInitializationDetailList(DataInitializationDetailList dataInitializationDetailList) {
            this.dataInitializationDetailList = dataInitializationDetailList;
            return this;
        }

        /**
         * <p>The error message returned if full data migration failed.</p>
         */
        public Builder dataSynchronizationDetailList(DataSynchronizationDetailList dataSynchronizationDetailList) {
            this.dataSynchronizationDetailList = dataSynchronizationDetailList;
            return this;
        }

        /**
         * <p>Specifies whether to query the details of incremental data migration. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: yes</p>
         * </li>
         * <li><p><strong>false</strong>: no</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>Default value: <strong>false</strong></p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>InternalError</p>
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>The request processing has failed due to some unknown error.</p>
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * <p>The error code returned if the call failed.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that the value is unique among different requests. The <strong>ClientToken</strong> value can contain only ASCII characters and cannot exceed 64 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * <p>Specifies whether to query the details of full data migration. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: yes</p>
         * </li>
         * <li><p><strong>false</strong>: no</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>Default value: <strong>false</strong></p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0AE3CD0B-4148-426F-A90E-952467CC****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The name of the database to which the migration object in the source instance belongs.</p>
         */
        public Builder structureInitializationDetailList(StructureInitializationDetailList structureInitializationDetailList) {
            this.structureInitializationDetailList = structureInitializationDetailList;
            return this;
        }

        /**
         * <p>The ID of the Alibaba Cloud account. You do not need to specify this parameter because this parameter will be removed in the future.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        /**
         * <p>Resource group ID.</p>
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

            /**
             * <p>The status of full data migration. Valid values:</p>
             * <ul>
             * <li><strong>NotStarted</strong>: Full data migration is not started.</li>
             * <li><strong>Migrating</strong>: Full data migration is in progress.</li>
             * <li><strong>Failed</strong>: Full data migration failed.</li>
             * <li><strong>Finished</strong>: Full data migration is completed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>dtstestdata</p>
             */
            public Builder destinationOwnerDBName(String destinationOwnerDBName) {
                this.destinationOwnerDBName = destinationOwnerDBName;
                return this;
            }

            /**
             * <p>The page number of the returned page.</p>
             * 
             * <strong>example:</strong>
             * <p>java.lang.NumberFormatException: For input string: &quot;&quot;</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The details of full data migration.</p>
             * 
             * <strong>example:</strong>
             * <p>200001</p>
             */
            public Builder finishRowNum(String finishRowNum) {
                this.finishRowNum = finishRowNum;
                return this;
            }

            /**
             * <p>The name of the database to which the migration object in the source instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0</p>
             */
            public Builder migrationTime(String migrationTime) {
                this.migrationTime = migrationTime;
                return this;
            }

            /**
             * <p>Indicates whether the call was successful.</p>
             * 
             * <strong>example:</strong>
             * <p>dtstestdata</p>
             */
            public Builder sourceOwnerDBName(String sourceOwnerDBName) {
                this.sourceOwnerDBName = sourceOwnerDBName;
                return this;
            }

            /**
             * <p>The total number of entries that are returned.</p>
             * 
             * <strong>example:</strong>
             * <p>Finished</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The error message returned if the call failed.</p>
             * 
             * <strong>example:</strong>
             * <p>customer</p>
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            /**
             * <p>The table name.</p>
             * 
             * <strong>example:</strong>
             * <p>201477</p>
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

            /**
             * <p>The status of incremental data migration. Valid values:</p>
             * <ul>
             * <li><strong>NotStarted</strong>: Incremental data migration is not started.</li>
             * <li><strong>Migrating</strong>: Incremental data migration is in progress.</li>
             * <li><strong>Failed</strong>: Incremental data migration failed.</li>
             * <li><strong>Finished</strong>: Incremental data migration is completed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>dtstestdata</p>
             */
            public Builder destinationOwnerDBName(String destinationOwnerDBName) {
                this.destinationOwnerDBName = destinationOwnerDBName;
                return this;
            }

            /**
             * <p>The total number of records that are supposed to be migrated by the task.</p>
             * 
             * <strong>example:</strong>
             * <p>The details of incremental data migration.</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The time taken by full data migration.</p>
             * 
             * <strong>example:</strong>
             * <p>dtstestdata</p>
             */
            public Builder sourceOwnerDBName(String sourceOwnerDBName) {
                this.sourceOwnerDBName = sourceOwnerDBName;
                return this;
            }

            /**
             * <p>The number of records that have been migrated.</p>
             * 
             * <strong>example:</strong>
             * <p>Migrating</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The name of the database to which the migration object in the destination instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>customer</p>
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

            /**
             * <p>The status of constraint creation. Valid values:</p>
             * <ul>
             * <li><strong>NotStarted</strong></li>
             * <li><strong>Migrating</strong></li>
             * <li><strong>Failed</strong></li>
             * <li><strong>Finished</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>dtstestdata</p>
             */
            public Builder destinationOwnerDBName(String destinationOwnerDBName) {
                this.destinationOwnerDBName = destinationOwnerDBName;
                return this;
            }

            /**
             * <p>The constraints of the migration object, such as indexes and foreign keys. </p>
             * <blockquote>
             * <p> This parameter is returned only if the <strong>ObjectType</strong> parameter is set to <strong>Table</strong> and the migration object has constraints.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>DTS-1020042 Execute sql error sql: ERROR: type &quot;geometry&quot; does not exist；</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The name of the database to which the migration object in the destination instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>CREATE SEQUENCE &quot;public&quot;.&quot;collections_id_seq&quot;   MINVALUE 1   MAXVALUE 9223372036854775807   START 249   INCREMENT BY 1 ;</p>
             */
            public Builder objectDefinition(String objectDefinition) {
                this.objectDefinition = objectDefinition;
                return this;
            }

            /**
             * <p>The name of the database to which the migration object in the source instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>customer</p>
             */
            public Builder objectName(String objectName) {
                this.objectName = objectName;
                return this;
            }

            /**
             * <p>The name of migration object.</p>
             * 
             * <strong>example:</strong>
             * <p>Table</p>
             */
            public Builder objectType(String objectType) {
                this.objectType = objectType;
                return this;
            }

            /**
             * <p>The error message returned if schema migration failed.</p>
             * 
             * <strong>example:</strong>
             * <p>dtstestdata</p>
             */
            public Builder sourceOwnerDBName(String sourceOwnerDBName) {
                this.sourceOwnerDBName = sourceOwnerDBName;
                return this;
            }

            /**
             * <p>The type of the migration object. Valid values: <strong>Table</strong>, <strong>Constraint</strong>, <strong>Index</strong>, <strong>View</strong>, <strong>Materialize View</strong>, <strong>Type</strong>, <strong>Synonym</strong>, <strong>Trigger</strong>, <strong>Function</strong>, <strong>Procedure</strong>, <strong>Package</strong>, <strong>Default</strong>, <strong>Rule</strong>, <strong>PlanGuide</strong>, and <strong>Sequence</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>Finished</p>
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

            /**
             * <p>The schema of the migration object.</p>
             */
            public Builder constraintList(ConstraintList constraintList) {
                this.constraintList = constraintList;
                return this;
            }

            /**
             * <p>The status of schema migration. Valid values:</p>
             * <ul>
             * <li><strong>NotStarted</strong>: Schema migration is not started.</li>
             * <li><strong>Migrating</strong>: Schema migration is in progress.</li>
             * <li><strong>Failed</strong>: Schema migration failed.</li>
             * <li><strong>Finished</strong>: Schema migration is completed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>dtstestdata</p>
             */
            public Builder destinationOwnerDBName(String destinationOwnerDBName) {
                this.destinationOwnerDBName = destinationOwnerDBName;
                return this;
            }

            /**
             * <p>The details of schema migration.</p>
             * 
             * <strong>example:</strong>
             * <p>DTS-1020042 Execute sql error sql: DTS-1020042 Execute sql error sql: ERROR: column &quot;id&quot; named in key does not exist</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The task has failed for too long and cannot be restored</p>
             * 
             * <strong>example:</strong>
             * <p>CREATE TABLE <code>dtstestdata</code>.<code>customer</code> (\n<code>runoob_id</code>  int(10) unsigned   auto_increment  COMMENT &quot;&quot;   NOT NULL   , \n<code>runoob_title</code>  varchar(100)  CHARSET <code>utf8</code> COLLATE <code>utf8_general_ci</code>    COMMENT &quot;&quot;   NOT NULL   , \n<code>runoob_author1216</code>  varchar(40)  CHARSET <code>utf8</code> COLLATE <code>utf8_general_ci</code>    COMMENT &quot;&quot;   NOT NULL   , \n<code>submission_date1216</code>  date     COMMENT &quot;&quot;   NULL   \n, PRIMARY KEY (<code>runoob_id</code>)) engine=InnoDB AUTO_INCREMENT=200001 DEFAULT CHARSET=<code>utf8</code> DEFAULT COLLATE <code>utf8_general_ci</code> ROW_FORMAT= Dynamic comment = &quot;&quot; ;\n</p>
             */
            public Builder objectDefinition(String objectDefinition) {
                this.objectDefinition = objectDefinition;
                return this;
            }

            /**
             * <p>The name of the database to which the migration object in the source instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>customer</p>
             */
            public Builder objectName(String objectName) {
                this.objectName = objectName;
                return this;
            }

            /**
             * <p>The name of the database to which the migration object in the destination instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>Table</p>
             */
            public Builder objectType(String objectType) {
                this.objectType = objectType;
                return this;
            }

            /**
             * <p>The error message returned if incremental data migration failed.</p>
             * 
             * <strong>example:</strong>
             * <p>dtstestdata</p>
             */
            public Builder sourceOwnerDBName(String sourceOwnerDBName) {
                this.sourceOwnerDBName = sourceOwnerDBName;
                return this;
            }

            /**
             * <p>The table name.</p>
             * 
             * <strong>example:</strong>
             * <p>Finished</p>
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
