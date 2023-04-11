// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetStructSyncExecSqlDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetStructSyncExecSqlDetailResponseBody</p>
 */
public class GetStructSyncExecSqlDetailResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StructSyncExecSqlDetail")
    private StructSyncExecSqlDetail structSyncExecSqlDetail;

    @NameInMap("Success")
    private Boolean success;

    private GetStructSyncExecSqlDetailResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.structSyncExecSqlDetail = builder.structSyncExecSqlDetail;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetStructSyncExecSqlDetailResponseBody create() {
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
     * @return structSyncExecSqlDetail
     */
    public StructSyncExecSqlDetail getStructSyncExecSqlDetail() {
        return this.structSyncExecSqlDetail;
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
        private StructSyncExecSqlDetail structSyncExecSqlDetail; 
        private Boolean success; 

        /**
         * The error code.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The error message.
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
         * The details of the SQL statements.
         */
        public Builder structSyncExecSqlDetail(StructSyncExecSqlDetail structSyncExecSqlDetail) {
            this.structSyncExecSqlDetail = structSyncExecSqlDetail;
            return this;
        }

        /**
         * Indicates whether the request is successful.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetStructSyncExecSqlDetailResponseBody build() {
            return new GetStructSyncExecSqlDetailResponseBody(this);
        } 

    } 

    public static class StructSyncExecSqlDetail extends TeaModel {
        @NameInMap("ExecSql")
        private String execSql;

        @NameInMap("TotalSqlCount")
        private Long totalSqlCount;

        private StructSyncExecSqlDetail(Builder builder) {
            this.execSql = builder.execSql;
            this.totalSqlCount = builder.totalSqlCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StructSyncExecSqlDetail create() {
            return builder().build();
        }

        /**
         * @return execSql
         */
        public String getExecSql() {
            return this.execSql;
        }

        /**
         * @return totalSqlCount
         */
        public Long getTotalSqlCount() {
            return this.totalSqlCount;
        }

        public static final class Builder {
            private String execSql; 
            private Long totalSqlCount; 

            /**
             * The SQL statements that are executed.
             */
            public Builder execSql(String execSql) {
                this.execSql = execSql;
                return this;
            }

            /**
             * The total number of SQL statements.
             */
            public Builder totalSqlCount(Long totalSqlCount) {
                this.totalSqlCount = totalSqlCount;
                return this;
            }

            public StructSyncExecSqlDetail build() {
                return new StructSyncExecSqlDetail(this);
            } 

        } 

    }
}
