// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDataCorrectPreCheckSQLResponseBody} extends {@link TeaModel}
 *
 * <p>ListDataCorrectPreCheckSQLResponseBody</p>
 */
public class ListDataCorrectPreCheckSQLResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("PreCheckSQLList")
    private java.util.List < PreCheckSQLList> preCheckSQLList;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private ListDataCorrectPreCheckSQLResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.preCheckSQLList = builder.preCheckSQLList;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataCorrectPreCheckSQLResponseBody create() {
        return builder().build();
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
     * @return preCheckSQLList
     */
    public java.util.List < PreCheckSQLList> getPreCheckSQLList() {
        return this.preCheckSQLList;
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
        private String errorCode; 
        private String errorMessage; 
        private java.util.List < PreCheckSQLList> preCheckSQLList; 
        private String requestId; 
        private Boolean success; 

        /**
         * The SQL statement.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The ID of the data change ticket. You can call the [ListOrders](~~144643~~) operation to query the ID of the data change ticket.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * The ID of the database. The database can be a physical database or a logical database.
         * <p>
         * 
         * *   To query the ID of a physical database, call the [ListDatabases](~~141873~~) or [SearchDatabase](~~141876~~) operation.
         * *   To query the ID of a logical database, call the [ListLogicDatabases](~~141874~~) or [SearchDatabase](~~141876~~) operation.
         */
        public Builder preCheckSQLList(java.util.List < PreCheckSQLList> preCheckSQLList) {
            this.preCheckSQLList = preCheckSQLList;
            return this;
        }

        /**
         * The error message returned.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The ID of the database.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListDataCorrectPreCheckSQLResponseBody build() {
            return new ListDataCorrectPreCheckSQLResponseBody(this);
        } 

    } 

    public static class PreCheckSQLList extends TeaModel {
        @NameInMap("AffectRows")
        private Long affectRows;

        @NameInMap("CheckSQL")
        private String checkSQL;

        @NameInMap("DbId")
        private Long dbId;

        @NameInMap("SQLReviewQueryKey")
        private String SQLReviewQueryKey;

        @NameInMap("SqlReviewStatus")
        private String sqlReviewStatus;

        @NameInMap("SqlType")
        private String sqlType;

        @NameInMap("TableNames")
        private String tableNames;

        private PreCheckSQLList(Builder builder) {
            this.affectRows = builder.affectRows;
            this.checkSQL = builder.checkSQL;
            this.dbId = builder.dbId;
            this.SQLReviewQueryKey = builder.SQLReviewQueryKey;
            this.sqlReviewStatus = builder.sqlReviewStatus;
            this.sqlType = builder.sqlType;
            this.tableNames = builder.tableNames;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PreCheckSQLList create() {
            return builder().build();
        }

        /**
         * @return affectRows
         */
        public Long getAffectRows() {
            return this.affectRows;
        }

        /**
         * @return checkSQL
         */
        public String getCheckSQL() {
            return this.checkSQL;
        }

        /**
         * @return dbId
         */
        public Long getDbId() {
            return this.dbId;
        }

        /**
         * @return SQLReviewQueryKey
         */
        public String getSQLReviewQueryKey() {
            return this.SQLReviewQueryKey;
        }

        /**
         * @return sqlReviewStatus
         */
        public String getSqlReviewStatus() {
            return this.sqlReviewStatus;
        }

        /**
         * @return sqlType
         */
        public String getSqlType() {
            return this.sqlType;
        }

        /**
         * @return tableNames
         */
        public String getTableNames() {
            return this.tableNames;
        }

        public static final class Builder {
            private Long affectRows; 
            private String checkSQL; 
            private Long dbId; 
            private String SQLReviewQueryKey; 
            private String sqlReviewStatus; 
            private String sqlType; 
            private String tableNames; 

            /**
             * The review status of the SQL statement. Valid values:
             * <p>
             * 
             * *   **WAITING**: The SQL statement is pending for review.
             * *   **RUNNING**: The SQL statement is being reviewed.
             * *   **IGNORE**: The SQL statement review is skipped.
             * *   **PASS**: The SQL statement passed the review.
             * *   **BLOCK**: The SQL statement failed the review.
             */
            public Builder affectRows(Long affectRows) {
                this.affectRows = affectRows;
                return this;
            }

            /**
             * The estimated number of affected rows.
             */
            public Builder checkSQL(String checkSQL) {
                this.checkSQL = checkSQL;
                return this;
            }

            /**
             * The name of the table whose data is changed.
             */
            public Builder dbId(Long dbId) {
                this.dbId = dbId;
                return this;
            }

            /**
             * The ID of the request.
             */
            public Builder SQLReviewQueryKey(String SQLReviewQueryKey) {
                this.SQLReviewQueryKey = SQLReviewQueryKey;
                return this;
            }

            /**
             * SqlReviewStatus.
             */
            public Builder sqlReviewStatus(String sqlReviewStatus) {
                this.sqlReviewStatus = sqlReviewStatus;
                return this;
            }

            /**
             * SqlType.
             */
            public Builder sqlType(String sqlType) {
                this.sqlType = sqlType;
                return this;
            }

            /**
             * TableNames.
             */
            public Builder tableNames(String tableNames) {
                this.tableNames = tableNames;
                return this;
            }

            public PreCheckSQLList build() {
                return new PreCheckSQLList(this);
            } 

        } 

    }
}
