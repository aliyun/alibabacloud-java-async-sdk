// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDataCorrectPreCheckSQLResponseBody} extends {@link TeaModel}
 *
 * <p>ListDataCorrectPreCheckSQLResponseBody</p>
 */
public class ListDataCorrectPreCheckSQLResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("PreCheckSQLList")
    private java.util.List < PreCheckSQLList> preCheckSQLList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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
         * The error code returned.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The error message returned.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * The precheck information about SQL statements.
         */
        public Builder preCheckSQLList(java.util.List < PreCheckSQLList> preCheckSQLList) {
            this.preCheckSQLList = preCheckSQLList;
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
         * *   **true**: The request is successful.
         * *   **false**: The request fails.
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
        @com.aliyun.core.annotation.NameInMap("AffectRows")
        private Long affectRows;

        @com.aliyun.core.annotation.NameInMap("CheckSQL")
        private String checkSQL;

        @com.aliyun.core.annotation.NameInMap("DbId")
        private Long dbId;

        @com.aliyun.core.annotation.NameInMap("SQLReviewQueryKey")
        private String SQLReviewQueryKey;

        @com.aliyun.core.annotation.NameInMap("SqlReviewStatus")
        private String sqlReviewStatus;

        @com.aliyun.core.annotation.NameInMap("SqlType")
        private String sqlType;

        @com.aliyun.core.annotation.NameInMap("TableNames")
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
             * The estimated number of affected rows.
             */
            public Builder affectRows(Long affectRows) {
                this.affectRows = affectRows;
                return this;
            }

            /**
             * The SQL statement.
             */
            public Builder checkSQL(String checkSQL) {
                this.checkSQL = checkSQL;
                return this;
            }

            /**
             * The ID of the database.
             */
            public Builder dbId(Long dbId) {
                this.dbId = dbId;
                return this;
            }

            /**
             * The key that is used to query the details of optimization suggestions. You can call the [GetSQLReviewOptimizeDetail](~~265977~~) operation to query the details of optimization suggestions based on the key.
             */
            public Builder SQLReviewQueryKey(String SQLReviewQueryKey) {
                this.SQLReviewQueryKey = SQLReviewQueryKey;
                return this;
            }

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
            public Builder sqlReviewStatus(String sqlReviewStatus) {
                this.sqlReviewStatus = sqlReviewStatus;
                return this;
            }

            /**
             * The type of the SQL statement, such as DELETE, UPDATE, or ALTER_TABLE.
             */
            public Builder sqlType(String sqlType) {
                this.sqlType = sqlType;
                return this;
            }

            /**
             * The name of the table whose data is changed.
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
