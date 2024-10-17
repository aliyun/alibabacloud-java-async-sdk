// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetDataImportSQLResponseBody} extends {@link TeaModel}
 *
 * <p>GetDataImportSQLResponseBody</p>
 */
public class GetDataImportSQLResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SQLDetail")
    private SQLDetail SQLDetail;

    @com.aliyun.core.annotation.NameInMap("Success")
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
         * <p>The error code returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>UnknownError</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>UnknownError</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The request ID. You can use the ID to locate logs and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>B43AD641-49C2-5299-9E06-1B37EC1B****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The details of SQL statements.</p>
         */
        public Builder SQLDetail(SQLDetail SQLDetail) {
            this.SQLDetail = SQLDetail;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetDataImportSQLResponseBody build() {
            return new GetDataImportSQLResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDataImportSQLResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataImportSQLResponseBody</p>
     */
    public static class SQLDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExecSql")
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
             * <p>The SQL script.</p>
             * 
             * <strong>example:</strong>
             * <p>insert into t1 values (1);</p>
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
