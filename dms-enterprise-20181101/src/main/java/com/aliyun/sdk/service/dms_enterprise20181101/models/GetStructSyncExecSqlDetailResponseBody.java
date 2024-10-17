// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetStructSyncExecSqlDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetStructSyncExecSqlDetailResponseBody</p>
 */
public class GetStructSyncExecSqlDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StructSyncExecSqlDetail")
    private StructSyncExecSqlDetail structSyncExecSqlDetail;

    @com.aliyun.core.annotation.NameInMap("Success")
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
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>UnknownError</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>UnknownError</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>1810E635-A2D7-428B-BAA9-85DAEB9B1A77</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The details of the SQL statements.</p>
         */
        public Builder structSyncExecSqlDetail(StructSyncExecSqlDetail structSyncExecSqlDetail) {
            this.structSyncExecSqlDetail = structSyncExecSqlDetail;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetStructSyncExecSqlDetailResponseBody build() {
            return new GetStructSyncExecSqlDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetStructSyncExecSqlDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetStructSyncExecSqlDetailResponseBody</p>
     */
    public static class StructSyncExecSqlDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExecSql")
        private String execSql;

        @com.aliyun.core.annotation.NameInMap("TotalSqlCount")
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
             * <p>The SQL statements that are executed.</p>
             */
            public Builder execSql(String execSql) {
                this.execSql = execSql;
                return this;
            }

            /**
             * <p>The total number of SQL statements.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
