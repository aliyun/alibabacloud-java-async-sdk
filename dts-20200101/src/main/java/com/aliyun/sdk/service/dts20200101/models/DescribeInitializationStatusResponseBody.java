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
 * {@link DescribeInitializationStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInitializationStatusResponseBody</p>
 */
public class DescribeInitializationStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataInitializationDetails")
    private java.util.List<DataInitializationDetails> dataInitializationDetails;

    @com.aliyun.core.annotation.NameInMap("DataSynchronizationDetails")
    private java.util.List<DataSynchronizationDetails> dataSynchronizationDetails;

    @com.aliyun.core.annotation.NameInMap("ErrCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("ErrMessage")
    private String errMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StructureInitializationDetails")
    private java.util.List<StructureInitializationDetails> structureInitializationDetails;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataInitializationDetails
     */
    public java.util.List<DataInitializationDetails> getDataInitializationDetails() {
        return this.dataInitializationDetails;
    }

    /**
     * @return dataSynchronizationDetails
     */
    public java.util.List<DataSynchronizationDetails> getDataSynchronizationDetails() {
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
    public java.util.List<StructureInitializationDetails> getStructureInitializationDetails() {
        return this.structureInitializationDetails;
    }

    /**
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private java.util.List<DataInitializationDetails> dataInitializationDetails; 
        private java.util.List<DataSynchronizationDetails> dataSynchronizationDetails; 
        private String errCode; 
        private String errMessage; 
        private String requestId; 
        private java.util.List<StructureInitializationDetails> structureInitializationDetails; 
        private String success; 

        private Builder() {
        } 

        private Builder(DescribeInitializationStatusResponseBody model) {
            this.dataInitializationDetails = model.dataInitializationDetails;
            this.dataSynchronizationDetails = model.dataSynchronizationDetails;
            this.errCode = model.errCode;
            this.errMessage = model.errMessage;
            this.requestId = model.requestId;
            this.structureInitializationDetails = model.structureInitializationDetails;
            this.success = model.success;
        } 

        /**
         * <p>The details of initial full data synchronization.</p>
         */
        public Builder dataInitializationDetails(java.util.List<DataInitializationDetails> dataInitializationDetails) {
            this.dataInitializationDetails = dataInitializationDetails;
            return this;
        }

        /**
         * <p>The details of incremental data synchronization.</p>
         * <blockquote>
         * <p> This parameter and the parameters it contains will be removed in the future.</p>
         * </blockquote>
         */
        public Builder dataSynchronizationDetails(java.util.List<DataSynchronizationDetails> dataSynchronizationDetails) {
            this.dataSynchronizationDetails = dataSynchronizationDetails;
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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>150DECD9-13FF-4929-A5DE-855BE9CC****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The details of initial schema synchronization.</p>
         */
        public Builder structureInitializationDetails(java.util.List<StructureInitializationDetails> structureInitializationDetails) {
            this.structureInitializationDetails = structureInitializationDetails;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public DescribeInitializationStatusResponseBody build() {
            return new DescribeInitializationStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInitializationStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInitializationStatusResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(DataInitializationDetails model) {
                this.destinationOwnerDBName = model.destinationOwnerDBName;
                this.errorMessage = model.errorMessage;
                this.finishRowNum = model.finishRowNum;
                this.sourceOwnerDBName = model.sourceOwnerDBName;
                this.status = model.status;
                this.tableName = model.tableName;
                this.totalRowNum = model.totalRowNum;
                this.usedTime = model.usedTime;
            } 

            /**
             * <p>The name of the database to which the object in the destination instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>dtstestdata</p>
             */
            public Builder destinationOwnerDBName(String destinationOwnerDBName) {
                this.destinationOwnerDBName = destinationOwnerDBName;
                return this;
            }

            /**
             * <p>The error message returned if initial full data synchronization failed.</p>
             * 
             * <strong>example:</strong>
             * <p>java.lang.NumberFormatException: For input string: &quot;&quot;</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The total number of rows that are actually synchronized.</p>
             * <blockquote>
             * <p> This parameter indicates the total number of actually synchronized rows. In contrast, the value of the <strong>TotalRowNum</strong> parameter is calculated based on the system tables in the source database. The values of the two parameters may be different due to time difference.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>9993</p>
             */
            public Builder finishRowNum(String finishRowNum) {
                this.finishRowNum = finishRowNum;
                return this;
            }

            /**
             * <p>The name of the database to which the object in the source instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>dtstestdata</p>
             */
            public Builder sourceOwnerDBName(String sourceOwnerDBName) {
                this.sourceOwnerDBName = sourceOwnerDBName;
                return this;
            }

            /**
             * <p>The status of initial full data synchronization. Valid values:</p>
             * <ul>
             * <li><strong>NotStarted</strong></li>
             * <li><strong>Migrating</strong></li>
             * <li><strong>Failed</strong></li>
             * <li><strong>Finished</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Finished</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The table name.</p>
             * 
             * <strong>example:</strong>
             * <p>customer</p>
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            /**
             * <p>The total number of rows that are supposed to be synchronized.</p>
             * <blockquote>
             * <p> The value of this parameter is calculated based on the system tables in the source database. In contrast, the <strong>FinishRowNum</strong> parameter indicates the total number of actually synchronized rows. The values of the two parameters may be different due to time difference.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>9981</p>
             */
            public Builder totalRowNum(String totalRowNum) {
                this.totalRowNum = totalRowNum;
                return this;
            }

            /**
             * <p>The time spent on full data synchronization.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0</p>
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
    /**
     * 
     * {@link DescribeInitializationStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInitializationStatusResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(DataSynchronizationDetails model) {
                this.destinationOwnerDBName = model.destinationOwnerDBName;
                this.errorMessage = model.errorMessage;
                this.sourceOwnerDBName = model.sourceOwnerDBName;
                this.status = model.status;
                this.tableName = model.tableName;
            } 

            /**
             * <p>The name of the database to which the object in the destination instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>dtstestdata</p>
             */
            public Builder destinationOwnerDBName(String destinationOwnerDBName) {
                this.destinationOwnerDBName = destinationOwnerDBName;
                return this;
            }

            /**
             * <p>The error message returned if incremental data synchronization failed.</p>
             * 
             * <strong>example:</strong>
             * <p>The task has failed for too long and cannot be repaired</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The name of the database to which the object in the source instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>dtstestdata</p>
             */
            public Builder sourceOwnerDBName(String sourceOwnerDBName) {
                this.sourceOwnerDBName = sourceOwnerDBName;
                return this;
            }

            /**
             * <p>The status of incremental data synchronization. Valid values:</p>
             * <ul>
             * <li><strong>NotStarted</strong></li>
             * <li><strong>Migrating</strong></li>
             * <li><strong>Failed</strong></li>
             * <li><strong>Finished</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Migrating</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The table name.</p>
             * 
             * <strong>example:</strong>
             * <p>customer</p>
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
    /**
     * 
     * {@link DescribeInitializationStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInitializationStatusResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Constraints model) {
                this.destinationOwnerDBName = model.destinationOwnerDBName;
                this.errorMessage = model.errorMessage;
                this.objectDefinition = model.objectDefinition;
                this.objectName = model.objectName;
                this.objectType = model.objectType;
                this.sourceOwnerDBName = model.sourceOwnerDBName;
                this.status = model.status;
            } 

            /**
             * <p>The name of the database to which the object in the destination instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>dtstestdata</p>
             */
            public Builder destinationOwnerDBName(String destinationOwnerDBName) {
                this.destinationOwnerDBName = destinationOwnerDBName;
                return this;
            }

            /**
             * <p>The error message returned if constraints failed to be created.</p>
             * 
             * <strong>example:</strong>
             * <p>DTS-1020042 Execute sql error sql: ERROR: type &quot;geometry&quot; does not exist</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The syntax to create constraints.</p>
             * 
             * <strong>example:</strong>
             * <p>CREATE SEQUENCE &quot;public&quot;.&quot;collections_id_seq&quot;   MINVALUE 1   MAXVALUE 9223372036854775807   START 249   INCREMENT BY 1 ;</p>
             */
            public Builder objectDefinition(String objectDefinition) {
                this.objectDefinition = objectDefinition;
                return this;
            }

            /**
             * <p>The name of the object.</p>
             * 
             * <strong>example:</strong>
             * <p>customer</p>
             */
            public Builder objectName(String objectName) {
                this.objectName = objectName;
                return this;
            }

            /**
             * <p>The type of the object. Valid value: <strong>Table</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>Table</p>
             */
            public Builder objectType(String objectType) {
                this.objectType = objectType;
                return this;
            }

            /**
             * <p>The name of the database to which the object in the source instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>dtstestdata</p>
             */
            public Builder sourceOwnerDBName(String sourceOwnerDBName) {
                this.sourceOwnerDBName = sourceOwnerDBName;
                return this;
            }

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
             * <p>Finished</p>
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
    /**
     * 
     * {@link DescribeInitializationStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInitializationStatusResponseBody</p>
     */
    public static class StructureInitializationDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Constraints")
        private java.util.List<Constraints> constraints;

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
        public java.util.List<Constraints> getConstraints() {
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
            private java.util.List<Constraints> constraints; 
            private String destinationOwnerDBName; 
            private String errorMessage; 
            private String objectDefinition; 
            private String objectName; 
            private String objectType; 
            private String sourceOwnerDBName; 
            private String status; 

            private Builder() {
            } 

            private Builder(StructureInitializationDetails model) {
                this.constraints = model.constraints;
                this.destinationOwnerDBName = model.destinationOwnerDBName;
                this.errorMessage = model.errorMessage;
                this.objectDefinition = model.objectDefinition;
                this.objectName = model.objectName;
                this.objectType = model.objectType;
                this.sourceOwnerDBName = model.sourceOwnerDBName;
                this.status = model.status;
            } 

            /**
             * <p>The constraints of the synchronization object, such as indexes and foreign keys.</p>
             * <blockquote>
             * <p> This parameter is returned only if the <strong>ObjectType</strong> parameter is set to <strong>Table</strong> and the synchronization object has constraints.</p>
             * </blockquote>
             */
            public Builder constraints(java.util.List<Constraints> constraints) {
                this.constraints = constraints;
                return this;
            }

            /**
             * <p>The name of the database to which the object in the destination instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>dtstestdata</p>
             */
            public Builder destinationOwnerDBName(String destinationOwnerDBName) {
                this.destinationOwnerDBName = destinationOwnerDBName;
                return this;
            }

            /**
             * <p>The error message returned if initial schema synchronization failed.</p>
             * 
             * <strong>example:</strong>
             * <p>DTS-1020042 Execute sql error sql: Table &quot;customer&quot; already exists</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The schema of the object.</p>
             * 
             * <strong>example:</strong>
             * <p>CREATE TABLE <code>dtstestdata</code>.<code>customer</code> (\n<code>customer_id</code>  int(10) unsigned   auto_increment  COMMENT &quot;&quot;   NOT NULL   , \n<code>customer_title</code>  varchar(100)  CHARSET <code>utf8</code> COLLATE <code>utf8_general_ci</code>    COMMENT &quot;&quot;   NOT NULL   , \n<code>customer_company1216</code>  varchar(40)  CHARSET <code>utf8</code> COLLATE <code>utf8_general_ci</code>    COMMENT &quot;&quot;   NOT NULL   , \n<code>submission_date1216</code>  date     COMMENT &quot;&quot;   NULL   \n, PRIMARY KEY (<code>customer_id</code>)) engine=InnoDB AUTO_INCREMENT=200001 DEFAULT CHARSET=<code>utf8</code> DEFAULT COLLATE <code>utf8_general_ci</code> ROW_FORMAT= Dynamic comment = &quot;&quot; ;\n</p>
             */
            public Builder objectDefinition(String objectDefinition) {
                this.objectDefinition = objectDefinition;
                return this;
            }

            /**
             * <p>The name of the object.</p>
             * 
             * <strong>example:</strong>
             * <p>customer</p>
             */
            public Builder objectName(String objectName) {
                this.objectName = objectName;
                return this;
            }

            /**
             * <p>The type of the object. Valid values:</p>
             * <p><strong>Table</strong>, <strong>Constraint</strong>, <strong>Index</strong>, <strong>View</strong>, <strong>Materialize View</strong>, <strong>Type</strong>, <strong>Synonym</strong>, <strong>Trigger</strong>, <strong>Function</strong>, <strong>Procedure</strong>, <strong>Package</strong>, <strong>Default</strong>, <strong>Rule</strong>, <strong>PlanGuide</strong>, and <strong>Sequence</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>Table</p>
             */
            public Builder objectType(String objectType) {
                this.objectType = objectType;
                return this;
            }

            /**
             * <p>The name of the database to which the object in the source instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>dtstestdata</p>
             */
            public Builder sourceOwnerDBName(String sourceOwnerDBName) {
                this.sourceOwnerDBName = sourceOwnerDBName;
                return this;
            }

            /**
             * <p>The status of initial schema synchronization. Valid values:</p>
             * <ul>
             * <li><strong>NotStarted</strong></li>
             * <li><strong>Migrating</strong></li>
             * <li><strong>Failed</strong></li>
             * <li><strong>Finished</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Finished</p>
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
