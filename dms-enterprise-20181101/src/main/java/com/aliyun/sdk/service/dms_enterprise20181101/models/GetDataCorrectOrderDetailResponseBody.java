// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDataCorrectOrderDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetDataCorrectOrderDetailResponseBody</p>
 */
public class GetDataCorrectOrderDetailResponseBody extends TeaModel {
    @NameInMap("DataCorrectOrderDetail")
    private DataCorrectOrderDetail dataCorrectOrderDetail;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetDataCorrectOrderDetailResponseBody(Builder builder) {
        this.dataCorrectOrderDetail = builder.dataCorrectOrderDetail;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDataCorrectOrderDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return dataCorrectOrderDetail
     */
    public DataCorrectOrderDetail getDataCorrectOrderDetail() {
        return this.dataCorrectOrderDetail;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
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
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private DataCorrectOrderDetail dataCorrectOrderDetail; 
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        /**
         * The information about the data change ticket.
         */
        public Builder dataCorrectOrderDetail(DataCorrectOrderDetail dataCorrectOrderDetail) {
            this.dataCorrectOrderDetail = dataCorrectOrderDetail;
            return this;
        }

        /**
         * The error code returned if the request fails.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The error message returned if the request fails.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
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
         * Indicates whether the request is successful. Valid values:
         * <p>
         * 
         * - **true**: The request is successful.
         * - **false**: The request fails.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetDataCorrectOrderDetailResponseBody build() {
            return new GetDataCorrectOrderDetailResponseBody(this);
        } 

    } 

    public static class Database extends TeaModel {
        @NameInMap("DbId")
        private Integer dbId;

        @NameInMap("DbType")
        private String dbType;

        @NameInMap("EnvType")
        private String envType;

        @NameInMap("Logic")
        private Boolean logic;

        @NameInMap("SearchName")
        private String searchName;

        private Database(Builder builder) {
            this.dbId = builder.dbId;
            this.dbType = builder.dbType;
            this.envType = builder.envType;
            this.logic = builder.logic;
            this.searchName = builder.searchName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Database create() {
            return builder().build();
        }

        /**
         * @return dbId
         */
        public Integer getDbId() {
            return this.dbId;
        }

        /**
         * @return dbType
         */
        public String getDbType() {
            return this.dbType;
        }

        /**
         * @return envType
         */
        public String getEnvType() {
            return this.envType;
        }

        /**
         * @return logic
         */
        public Boolean getLogic() {
            return this.logic;
        }

        /**
         * @return searchName
         */
        public String getSearchName() {
            return this.searchName;
        }

        public static final class Builder {
            private Integer dbId; 
            private String dbType; 
            private String envType; 
            private Boolean logic; 
            private String searchName; 

            /**
             * The ID of the database.
             */
            public Builder dbId(Integer dbId) {
                this.dbId = dbId;
                return this;
            }

            /**
             * The engine of the database.
             */
            public Builder dbType(String dbType) {
                this.dbType = dbType;
                return this;
            }

            /**
             * The type of the environment to which the database belongs. Valid values:
             * <p>
             * 
             * - product: production environment
             * - dev: development environment
             * - pre: staging environment
             * - test: test environment
             * - sit: system integration testing (SIT) environment
             * - uat: user acceptance testing (UAT) environment
             * - pet: stress testing environment
             * - stag: STAG environment
             */
            public Builder envType(String envType) {
                this.envType = envType;
                return this;
            }

            /**
             * Indicates whether the database is a logical database. Valid values:
             * <p>
             * 
             * - **true**: The database is a logical database.
             * - **false**: The database is a physical database.
             */
            public Builder logic(Boolean logic) {
                this.logic = logic;
                return this;
            }

            /**
             * The name that is used to search for the database.
             */
            public Builder searchName(String searchName) {
                this.searchName = searchName;
                return this;
            }

            public Database build() {
                return new Database(this);
            } 

        } 

    }
    public static class DatabaseList extends TeaModel {
        @NameInMap("Database")
        private java.util.List < Database> database;

        private DatabaseList(Builder builder) {
            this.database = builder.database;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DatabaseList create() {
            return builder().build();
        }

        /**
         * @return database
         */
        public java.util.List < Database> getDatabase() {
            return this.database;
        }

        public static final class Builder {
            private java.util.List < Database> database; 

            /**
             * Database.
             */
            public Builder database(java.util.List < Database> database) {
                this.database = database;
                return this;
            }

            public DatabaseList build() {
                return new DatabaseList(this);
            } 

        } 

    }
    public static class OrderDetail extends TeaModel {
        @NameInMap("ActualAffectRows")
        private Long actualAffectRows;

        @NameInMap("AttachmentName")
        private String attachmentName;

        @NameInMap("Classify")
        private String classify;

        @NameInMap("EstimateAffectRows")
        private Long estimateAffectRows;

        @NameInMap("ExeSQL")
        private String exeSQL;

        @NameInMap("IgnoreAffectRows")
        private Boolean ignoreAffectRows;

        @NameInMap("IgnoreAffectRowsReason")
        private String ignoreAffectRowsReason;

        @NameInMap("RbAttachmentName")
        private String rbAttachmentName;

        @NameInMap("RbSQL")
        private String rbSQL;

        @NameInMap("RbSQLType")
        private String rbSQLType;

        @NameInMap("SqlType")
        private String sqlType;

        private OrderDetail(Builder builder) {
            this.actualAffectRows = builder.actualAffectRows;
            this.attachmentName = builder.attachmentName;
            this.classify = builder.classify;
            this.estimateAffectRows = builder.estimateAffectRows;
            this.exeSQL = builder.exeSQL;
            this.ignoreAffectRows = builder.ignoreAffectRows;
            this.ignoreAffectRowsReason = builder.ignoreAffectRowsReason;
            this.rbAttachmentName = builder.rbAttachmentName;
            this.rbSQL = builder.rbSQL;
            this.rbSQLType = builder.rbSQLType;
            this.sqlType = builder.sqlType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OrderDetail create() {
            return builder().build();
        }

        /**
         * @return actualAffectRows
         */
        public Long getActualAffectRows() {
            return this.actualAffectRows;
        }

        /**
         * @return attachmentName
         */
        public String getAttachmentName() {
            return this.attachmentName;
        }

        /**
         * @return classify
         */
        public String getClassify() {
            return this.classify;
        }

        /**
         * @return estimateAffectRows
         */
        public Long getEstimateAffectRows() {
            return this.estimateAffectRows;
        }

        /**
         * @return exeSQL
         */
        public String getExeSQL() {
            return this.exeSQL;
        }

        /**
         * @return ignoreAffectRows
         */
        public Boolean getIgnoreAffectRows() {
            return this.ignoreAffectRows;
        }

        /**
         * @return ignoreAffectRowsReason
         */
        public String getIgnoreAffectRowsReason() {
            return this.ignoreAffectRowsReason;
        }

        /**
         * @return rbAttachmentName
         */
        public String getRbAttachmentName() {
            return this.rbAttachmentName;
        }

        /**
         * @return rbSQL
         */
        public String getRbSQL() {
            return this.rbSQL;
        }

        /**
         * @return rbSQLType
         */
        public String getRbSQLType() {
            return this.rbSQLType;
        }

        /**
         * @return sqlType
         */
        public String getSqlType() {
            return this.sqlType;
        }

        public static final class Builder {
            private Long actualAffectRows; 
            private String attachmentName; 
            private String classify; 
            private Long estimateAffectRows; 
            private String exeSQL; 
            private Boolean ignoreAffectRows; 
            private String ignoreAffectRowsReason; 
            private String rbAttachmentName; 
            private String rbSQL; 
            private String rbSQLType; 
            private String sqlType; 

            /**
             * The number of affected rows that is obtained by the precheck.
             */
            public Builder actualAffectRows(Long actualAffectRows) {
                this.actualAffectRows = actualAffectRows;
                return this;
            }

            /**
             * The name of the attachment that contains the SQL statements used to change data.
             */
            public Builder attachmentName(String attachmentName) {
                this.attachmentName = attachmentName;
                return this;
            }

            /**
             * The category of the reason for the data change.
             */
            public Builder classify(String classify) {
                this.classify = classify;
                return this;
            }

            /**
             * The estimated number of affected rows.
             */
            public Builder estimateAffectRows(Long estimateAffectRows) {
                this.estimateAffectRows = estimateAffectRows;
                return this;
            }

            /**
             * The executed SQL statements.
             */
            public Builder exeSQL(String exeSQL) {
                this.exeSQL = exeSQL;
                return this;
            }

            /**
             * Indicates whether the precheck result is ignored. Valid values:
             * <p>
             * 
             * - **true**: The precheck result is ignored.
             * - **false**: The precheck result is not ignored.
             */
            public Builder ignoreAffectRows(Boolean ignoreAffectRows) {
                this.ignoreAffectRows = ignoreAffectRows;
                return this;
            }

            /**
             * The reason why the precheck result is ignored.
             */
            public Builder ignoreAffectRowsReason(String ignoreAffectRowsReason) {
                this.ignoreAffectRowsReason = ignoreAffectRowsReason;
                return this;
            }

            /**
             * The name of the attachment that contains the SQL statements used to roll back the data change.
             */
            public Builder rbAttachmentName(String rbAttachmentName) {
                this.rbAttachmentName = rbAttachmentName;
                return this;
            }

            /**
             * The SQL statements used to roll back the data change.
             */
            public Builder rbSQL(String rbSQL) {
                this.rbSQL = rbSQL;
                return this;
            }

            /**
             * The format of the SQL statements used to roll back the data change. Valid values:
             * <p>
             * 
             * - **TEXT**: text
             * - **ATTACHMENT**: attachment
             */
            public Builder rbSQLType(String rbSQLType) {
                this.rbSQLType = rbSQLType;
                return this;
            }

            /**
             * The format of the SQL statements used to change data. Valid values:
             * <p>
             * 
             * - **TEXT**: text
             * - **ATTACHMENT**: attachment
             */
            public Builder sqlType(String sqlType) {
                this.sqlType = sqlType;
                return this;
            }

            public OrderDetail build() {
                return new OrderDetail(this);
            } 

        } 

    }
    public static class TaskCheckDO extends TeaModel {
        @NameInMap("CheckStatus")
        private String checkStatus;

        @NameInMap("CheckStep")
        private String checkStep;

        @NameInMap("UserTip")
        private String userTip;

        private TaskCheckDO(Builder builder) {
            this.checkStatus = builder.checkStatus;
            this.checkStep = builder.checkStep;
            this.userTip = builder.userTip;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskCheckDO create() {
            return builder().build();
        }

        /**
         * @return checkStatus
         */
        public String getCheckStatus() {
            return this.checkStatus;
        }

        /**
         * @return checkStep
         */
        public String getCheckStep() {
            return this.checkStep;
        }

        /**
         * @return userTip
         */
        public String getUserTip() {
            return this.userTip;
        }

        public static final class Builder {
            private String checkStatus; 
            private String checkStep; 
            private String userTip; 

            /**
             * The status of the precheck. Valid values:
             * <p>
             * 
             * *   **WAITING**: The ticket is pending precheck.
             * *   **RUNNING**: The ticket is being prechecked.
             * *   **SUCCESS**: The ticket passes the precheck.
             * *   **FAIL**: The ticket fails the precheck.
             */
            public Builder checkStatus(String checkStatus) {
                this.checkStatus = checkStatus;
                return this;
            }

            /**
             * The check step of the precheck. Valid values:
             * <p>
             * 
             * *   **SQL_PARSE**: The system checks the syntax of the SQL statement.
             * *   **SQL_TYPE_CHECK**: The system checks the type of the SQL statement.
             * *   **PERMISSION_CHECK**: The system checks the permissions required for the data change.
             * *   **ROW_CHECK**: The system checks the number of affected rows.
             */
            public Builder checkStep(String checkStep) {
                this.checkStep = checkStep;
                return this;
            }

            /**
             * The message that indicates a check step.
             */
            public Builder userTip(String userTip) {
                this.userTip = userTip;
                return this;
            }

            public TaskCheckDO build() {
                return new TaskCheckDO(this);
            } 

        } 

    }
    public static class PreCheckDetail extends TeaModel {
        @NameInMap("TaskCheckDO")
        private java.util.List < TaskCheckDO> taskCheckDO;

        private PreCheckDetail(Builder builder) {
            this.taskCheckDO = builder.taskCheckDO;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PreCheckDetail create() {
            return builder().build();
        }

        /**
         * @return taskCheckDO
         */
        public java.util.List < TaskCheckDO> getTaskCheckDO() {
            return this.taskCheckDO;
        }

        public static final class Builder {
            private java.util.List < TaskCheckDO> taskCheckDO; 

            /**
             * TaskCheckDO.
             */
            public Builder taskCheckDO(java.util.List < TaskCheckDO> taskCheckDO) {
                this.taskCheckDO = taskCheckDO;
                return this;
            }

            public PreCheckDetail build() {
                return new PreCheckDetail(this);
            } 

        } 

    }
    public static class DataCorrectOrderDetail extends TeaModel {
        @NameInMap("DatabaseList")
        private DatabaseList databaseList;

        @NameInMap("ExecMode")
        private String execMode;

        @NameInMap("OrderDetail")
        private OrderDetail orderDetail;

        @NameInMap("PreCheckDetail")
        private PreCheckDetail preCheckDetail;

        @NameInMap("Status")
        private String status;

        private DataCorrectOrderDetail(Builder builder) {
            this.databaseList = builder.databaseList;
            this.execMode = builder.execMode;
            this.orderDetail = builder.orderDetail;
            this.preCheckDetail = builder.preCheckDetail;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataCorrectOrderDetail create() {
            return builder().build();
        }

        /**
         * @return databaseList
         */
        public DatabaseList getDatabaseList() {
            return this.databaseList;
        }

        /**
         * @return execMode
         */
        public String getExecMode() {
            return this.execMode;
        }

        /**
         * @return orderDetail
         */
        public OrderDetail getOrderDetail() {
            return this.orderDetail;
        }

        /**
         * @return preCheckDetail
         */
        public PreCheckDetail getPreCheckDetail() {
            return this.preCheckDetail;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private DatabaseList databaseList; 
            private String execMode; 
            private OrderDetail orderDetail; 
            private PreCheckDetail preCheckDetail; 
            private String status; 

            /**
             * The information about the database in which data is changed.
             */
            public Builder databaseList(DatabaseList databaseList) {
                this.databaseList = databaseList;
                return this;
            }

            /**
             * The execution mode of the ticket after the ticket is approved. Valid values:
             * <p>
             * 
             * - **COMMITOR**: The data change is performed by the user who submits the ticket.
             * - **AUTO**: The data change is automatically performed after the ticket is approved.
             * - **LAST_AUDITOR**: The data change is performed by the last approver of the ticket.
             */
            public Builder execMode(String execMode) {
                this.execMode = execMode;
                return this;
            }

            /**
             * The details of the ticket.
             */
            public Builder orderDetail(OrderDetail orderDetail) {
                this.orderDetail = orderDetail;
                return this;
            }

            /**
             * The precheck details of the ticket.
             */
            public Builder preCheckDetail(PreCheckDetail preCheckDetail) {
                this.preCheckDetail = preCheckDetail;
                return this;
            }

            /**
             * The status of the ticket. Valid values:
             * <p>
             * 
             * - **new**: The ticket is created.
             * - **precheck**: The ticket is being prechecked.
             * - **precheck_fail**: The ticket fails the precheck.
             * - **precheck_success**: The ticket passes the precheck and waits to be submitted for approval.
             * - **toaudit**: The ticket is being reviewed.
             * - **Approved**: The ticket is approved.
             * - **reject**: The ticket is rejected.
             * - **waiting**: The ticket is submitted and waits to be scheduled.
             * - **processing**: The ticket is being executed.
             * - **success**: The ticket is executed.
             * - **closed**: The ticket is closed.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public DataCorrectOrderDetail build() {
                return new DataCorrectOrderDetail(this);
            } 

        } 

    }
}
