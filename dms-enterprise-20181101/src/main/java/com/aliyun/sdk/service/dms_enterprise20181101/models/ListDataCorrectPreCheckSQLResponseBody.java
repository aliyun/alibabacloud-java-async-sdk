// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

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
    private java.util.List<PreCheckSQLList> preCheckSQLList;

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
    public java.util.List<PreCheckSQLList> getPreCheckSQLList() {
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
        private java.util.List<PreCheckSQLList> preCheckSQLList; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>The error code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>UnknownError</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>UnknownError</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The precheck information about SQL statements.</p>
         */
        public Builder preCheckSQLList(java.util.List<PreCheckSQLList> preCheckSQLList) {
            this.preCheckSQLList = preCheckSQLList;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>31853A2B-DC9D-5B39-8492-D2AC8BCF550E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The request is successful.</li>
         * <li><strong>false</strong>: The request fails.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListDataCorrectPreCheckSQLResponseBody build() {
            return new ListDataCorrectPreCheckSQLResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDataCorrectPreCheckSQLResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataCorrectPreCheckSQLResponseBody</p>
     */
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
             * <p>The estimated number of affected rows.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder affectRows(Long affectRows) {
                this.affectRows = affectRows;
                return this;
            }

            /**
             * <p>The SQL statement.</p>
             * 
             * <strong>example:</strong>
             * <p>OPTIMIZE TABLE <code>Text_TableNames</code></p>
             */
            public Builder checkSQL(String checkSQL) {
                this.checkSQL = checkSQL;
                return this;
            }

            /**
             * <p>The ID of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>1930****</p>
             */
            public Builder dbId(Long dbId) {
                this.dbId = dbId;
                return this;
            }

            /**
             * <p>The key that is used to query the details of optimization suggestions. You can call the <a href="https://help.aliyun.com/document_detail/265977.html">GetSQLReviewOptimizeDetail</a> operation to query the details of optimization suggestions based on the key.</p>
             * 
             * <strong>example:</strong>
             * <p>b9e771fc6ec247dea6d06a32c777****</p>
             */
            public Builder SQLReviewQueryKey(String SQLReviewQueryKey) {
                this.SQLReviewQueryKey = SQLReviewQueryKey;
                return this;
            }

            /**
             * <p>The review status of the SQL statement. Valid values:</p>
             * <ul>
             * <li><strong>WAITING</strong>: The SQL statement is pending for review.</li>
             * <li><strong>RUNNING</strong>: The SQL statement is being reviewed.</li>
             * <li><strong>IGNORE</strong>: The SQL statement review is skipped.</li>
             * <li><strong>PASS</strong>: The SQL statement passed the review.</li>
             * <li><strong>BLOCK</strong>: The SQL statement failed the review.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>WAITING</p>
             */
            public Builder sqlReviewStatus(String sqlReviewStatus) {
                this.sqlReviewStatus = sqlReviewStatus;
                return this;
            }

            /**
             * <p>The type of the SQL statement, such as DELETE, UPDATE, or ALTER_TABLE.</p>
             * 
             * <strong>example:</strong>
             * <p>OPTIMIZE</p>
             */
            public Builder sqlType(String sqlType) {
                this.sqlType = sqlType;
                return this;
            }

            /**
             * <p>The name of the table whose data is changed.</p>
             * 
             * <strong>example:</strong>
             * <p>Text_TableNames</p>
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
