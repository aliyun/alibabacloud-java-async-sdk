// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDataImportSQLResponseBody} extends {@link TeaModel}
 *
 * <p>GetDataImportSQLResponseBody</p>
 */
public class GetDataImportSQLResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SQLDetail")
    private SQLDetail SQLDetail;

    @NameInMap("Success")
    private Boolean success;

    private GetDataImportSQLResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.SQLDetail = builder.SQLDetail;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDataImportSQLResponseBody create() {
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return SQLDetail
     */
    public SQLDetail getSQLDetail() {
        return this.SQLDetail;
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
        private String requestId; 
        private SQLDetail SQLDetail; 
        private Boolean success; 

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
         * The request ID. You can use the ID to locate logs and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The details of SQL statements.
         */
        public Builder SQLDetail(SQLDetail SQLDetail) {
            this.SQLDetail = SQLDetail;
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

        public GetDataImportSQLResponseBody build() {
            return new GetDataImportSQLResponseBody(this);
        } 

    } 

    public static class SQLDetail extends TeaModel {
        @NameInMap("ExecSql")
        private String execSql;

        private SQLDetail(Builder builder) {
            this.execSql = builder.execSql;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SQLDetail create() {
            return builder().build();
        }

        /**
         * @return execSql
         */
        public String getExecSql() {
            return this.execSql;
        }

        public static final class Builder {
            private String execSql; 

            /**
             * The SQL script.
             */
            public Builder execSql(String execSql) {
                this.execSql = execSql;
                return this;
            }

            public SQLDetail build() {
                return new SQLDetail(this);
            } 

        } 

    }
}
