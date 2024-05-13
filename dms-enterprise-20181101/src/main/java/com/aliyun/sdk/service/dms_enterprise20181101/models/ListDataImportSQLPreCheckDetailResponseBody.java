// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDataImportSQLPreCheckDetailResponseBody} extends {@link TeaModel}
 *
 * <p>ListDataImportSQLPreCheckDetailResponseBody</p>
 */
public class ListDataImportSQLPreCheckDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("PreCheckSQLDetailList")
    private java.util.List < PreCheckSQLDetailList> preCheckSQLDetailList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListDataImportSQLPreCheckDetailResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.preCheckSQLDetailList = builder.preCheckSQLDetailList;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataImportSQLPreCheckDetailResponseBody create() {
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
     * @return preCheckSQLDetailList
     */
    public java.util.List < PreCheckSQLDetailList> getPreCheckSQLDetailList() {
        return this.preCheckSQLDetailList;
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

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMessage; 
        private java.util.List < PreCheckSQLDetailList> preCheckSQLDetailList; 
        private String requestId; 
        private Boolean success; 
        private Long totalCount; 

        /**
         * The error code returned if the request failed.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The error message returned if the request failed.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * The precheck information of SQL statements.
         */
        public Builder preCheckSQLDetailList(java.util.List < PreCheckSQLDetailList> preCheckSQLDetailList) {
            this.preCheckSQLDetailList = preCheckSQLDetailList;
            return this;
        }

        /**
         * The request ID. You can use the ID to locate logs and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * The number of SQL statements.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListDataImportSQLPreCheckDetailResponseBody build() {
            return new ListDataImportSQLPreCheckDetailResponseBody(this);
        } 

    } 

    public static class PreCheckSQLDetailList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Skip")
        private Boolean skip;

        @com.aliyun.core.annotation.NameInMap("SqlId")
        private Long sqlId;

        @com.aliyun.core.annotation.NameInMap("SqlType")
        private String sqlType;

        @com.aliyun.core.annotation.NameInMap("StatusCode")
        private String statusCode;

        private PreCheckSQLDetailList(Builder builder) {
            this.skip = builder.skip;
            this.sqlId = builder.sqlId;
            this.sqlType = builder.sqlType;
            this.statusCode = builder.statusCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PreCheckSQLDetailList create() {
            return builder().build();
        }

        /**
         * @return skip
         */
        public Boolean getSkip() {
            return this.skip;
        }

        /**
         * @return sqlId
         */
        public Long getSqlId() {
            return this.sqlId;
        }

        /**
         * @return sqlType
         */
        public String getSqlType() {
            return this.sqlType;
        }

        /**
         * @return statusCode
         */
        public String getStatusCode() {
            return this.statusCode;
        }

        public static final class Builder {
            private Boolean skip; 
            private Long sqlId; 
            private String sqlType; 
            private String statusCode; 

            /**
             * Indicates whether the precheck of the SQL statement was skipped. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder skip(Boolean skip) {
                this.skip = skip;
                return this;
            }

            /**
             * The SQL ID, which indicates the sequence number of the SQL statement. The number starts with 1.
             */
            public Builder sqlId(Long sqlId) {
                this.sqlId = sqlId;
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
             * The state of the ticket. Valid values:
             * <p>
             * 
             * *   **INIT**: The ticket was being initialized.
             * *   **RUNNING**: The ticket was in progress.
             * *   **SUCCESS**: The ticket was complete.
             * *   **TIMEOUT**: The ticket was skipped due to timeout.
             * *   **FAIL**: The ticket failed.
             */
            public Builder statusCode(String statusCode) {
                this.statusCode = statusCode;
                return this;
            }

            public PreCheckSQLDetailList build() {
                return new PreCheckSQLDetailList(this);
            } 

        } 

    }
}
