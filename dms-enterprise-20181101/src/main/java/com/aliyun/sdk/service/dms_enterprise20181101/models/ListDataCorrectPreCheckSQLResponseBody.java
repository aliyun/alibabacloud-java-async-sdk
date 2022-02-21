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
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
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
         * PreCheckSQLList.
         */
        public Builder preCheckSQLList(java.util.List < PreCheckSQLList> preCheckSQLList) {
            this.preCheckSQLList = preCheckSQLList;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
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
             * AffectRows.
             */
            public Builder affectRows(Long affectRows) {
                this.affectRows = affectRows;
                return this;
            }

            /**
             * CheckSQL.
             */
            public Builder checkSQL(String checkSQL) {
                this.checkSQL = checkSQL;
                return this;
            }

            /**
             * DbId.
             */
            public Builder dbId(Long dbId) {
                this.dbId = dbId;
                return this;
            }

            /**
             * SQLReviewQueryKey.
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
