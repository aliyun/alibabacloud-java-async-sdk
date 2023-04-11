// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDataImportSQLPreCheckDetailResponseBody} extends {@link TeaModel}
 *
 * <p>ListDataImportSQLPreCheckDetailResponseBody</p>
 */
public class ListDataImportSQLPreCheckDetailResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("PreCheckSQLDetailList")
    private java.util.List < PreCheckSQLDetailList> preCheckSQLDetailList;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TotalCount")
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
         * PreCheckSQLDetailList.
         */
        public Builder preCheckSQLDetailList(java.util.List < PreCheckSQLDetailList> preCheckSQLDetailList) {
            this.preCheckSQLDetailList = preCheckSQLDetailList;
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

        /**
         * TotalCount.
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
        @NameInMap("Skip")
        private Boolean skip;

        @NameInMap("SqlId")
        private Long sqlId;

        @NameInMap("SqlType")
        private String sqlType;

        @NameInMap("StatusCode")
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
             * Skip.
             */
            public Builder skip(Boolean skip) {
                this.skip = skip;
                return this;
            }

            /**
             * SqlId.
             */
            public Builder sqlId(Long sqlId) {
                this.sqlId = sqlId;
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
             * StatusCode.
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
