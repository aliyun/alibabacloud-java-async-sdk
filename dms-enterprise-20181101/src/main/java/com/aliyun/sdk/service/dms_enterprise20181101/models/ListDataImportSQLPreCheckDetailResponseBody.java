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
    private java.util.List<PreCheckSQLDetailList> preCheckSQLDetailList;

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
    public java.util.List<PreCheckSQLDetailList> getPreCheckSQLDetailList() {
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
        private java.util.List<PreCheckSQLDetailList> preCheckSQLDetailList; 
        private String requestId; 
        private Boolean success; 
        private Long totalCount; 

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
         * <p>The precheck information of SQL statements.</p>
         */
        public Builder preCheckSQLDetailList(java.util.List<PreCheckSQLDetailList> preCheckSQLDetailList) {
            this.preCheckSQLDetailList = preCheckSQLDetailList;
            return this;
        }

        /**
         * <p>The request ID. You can use the ID to locate logs and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>31853A2B-DC9D-5B39-8492-D2AC8BCF550E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
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

        /**
         * <p>The number of SQL statements.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListDataImportSQLPreCheckDetailResponseBody build() {
            return new ListDataImportSQLPreCheckDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDataImportSQLPreCheckDetailResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataImportSQLPreCheckDetailResponseBody</p>
     */
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
             * <p>Indicates whether the precheck of the SQL statement was skipped. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder skip(Boolean skip) {
                this.skip = skip;
                return this;
            }

            /**
             * <p>The SQL ID, which indicates the sequence number of the SQL statement. The number starts with 1.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder sqlId(Long sqlId) {
                this.sqlId = sqlId;
                return this;
            }

            /**
             * <p>The type of the SQL statement, such as DELETE, UPDATE, or ALTER_TABLE.</p>
             * 
             * <strong>example:</strong>
             * <p>INSERT</p>
             */
            public Builder sqlType(String sqlType) {
                this.sqlType = sqlType;
                return this;
            }

            /**
             * <p>The state of the ticket. Valid values:</p>
             * <ul>
             * <li><strong>INIT</strong>: The ticket was being initialized.</li>
             * <li><strong>RUNNING</strong>: The ticket was in progress.</li>
             * <li><strong>SUCCESS</strong>: The ticket was complete.</li>
             * <li><strong>TIMEOUT</strong>: The ticket was skipped due to timeout.</li>
             * <li><strong>FAIL</strong>: The ticket failed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SUCCESS</p>
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
