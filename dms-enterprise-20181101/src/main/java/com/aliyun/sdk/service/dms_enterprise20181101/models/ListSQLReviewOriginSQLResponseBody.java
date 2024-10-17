// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListSQLReviewOriginSQLResponseBody} extends {@link TeaModel}
 *
 * <p>ListSQLReviewOriginSQLResponseBody</p>
 */
public class ListSQLReviewOriginSQLResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("OriginSQLList")
    private java.util.List < OriginSQLList> originSQLList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListSQLReviewOriginSQLResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.originSQLList = builder.originSQLList;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSQLReviewOriginSQLResponseBody create() {
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
     * @return originSQLList
     */
    public java.util.List < OriginSQLList> getOriginSQLList() {
        return this.originSQLList;
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
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMessage; 
        private java.util.List < OriginSQLList> originSQLList; 
        private String requestId; 
        private Boolean success; 
        private Integer totalCount; 

        /**
         * <p>The error code that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>UnknownError</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message that is returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>UnknownError</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The information about the parsed SQL statements.</p>
         */
        public Builder originSQLList(java.util.List < OriginSQLList> originSQLList) {
            this.originSQLList = originSQLList;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0C1CB646-1DE4-4AD0-B4A4-7D47DD52E931</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values: Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
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
         * <p>The number of SQL statements in the file.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListSQLReviewOriginSQLResponseBody build() {
            return new ListSQLReviewOriginSQLResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSQLReviewOriginSQLResponseBody} extends {@link TeaModel}
     *
     * <p>ListSQLReviewOriginSQLResponseBody</p>
     */
    public static class OriginSQLList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CheckStatus")
        private String checkStatus;

        @com.aliyun.core.annotation.NameInMap("CheckedTime")
        private String checkedTime;

        @com.aliyun.core.annotation.NameInMap("FileId")
        private Long fileId;

        @com.aliyun.core.annotation.NameInMap("FileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("ReviewSummary")
        private String reviewSummary;

        @com.aliyun.core.annotation.NameInMap("SQLContent")
        private String SQLContent;

        @com.aliyun.core.annotation.NameInMap("SQLId")
        private Long SQLId;

        @com.aliyun.core.annotation.NameInMap("SQLName")
        private String SQLName;

        @com.aliyun.core.annotation.NameInMap("SQLReviewQueryKey")
        private String SQLReviewQueryKey;

        @com.aliyun.core.annotation.NameInMap("SqlHash")
        private String sqlHash;

        @com.aliyun.core.annotation.NameInMap("StatusDesc")
        private String statusDesc;

        private OriginSQLList(Builder builder) {
            this.checkStatus = builder.checkStatus;
            this.checkedTime = builder.checkedTime;
            this.fileId = builder.fileId;
            this.fileName = builder.fileName;
            this.reviewSummary = builder.reviewSummary;
            this.SQLContent = builder.SQLContent;
            this.SQLId = builder.SQLId;
            this.SQLName = builder.SQLName;
            this.SQLReviewQueryKey = builder.SQLReviewQueryKey;
            this.sqlHash = builder.sqlHash;
            this.statusDesc = builder.statusDesc;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OriginSQLList create() {
            return builder().build();
        }

        /**
         * @return checkStatus
         */
        public String getCheckStatus() {
            return this.checkStatus;
        }

        /**
         * @return checkedTime
         */
        public String getCheckedTime() {
            return this.checkedTime;
        }

        /**
         * @return fileId
         */
        public Long getFileId() {
            return this.fileId;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return reviewSummary
         */
        public String getReviewSummary() {
            return this.reviewSummary;
        }

        /**
         * @return SQLContent
         */
        public String getSQLContent() {
            return this.SQLContent;
        }

        /**
         * @return SQLId
         */
        public Long getSQLId() {
            return this.SQLId;
        }

        /**
         * @return SQLName
         */
        public String getSQLName() {
            return this.SQLName;
        }

        /**
         * @return SQLReviewQueryKey
         */
        public String getSQLReviewQueryKey() {
            return this.SQLReviewQueryKey;
        }

        /**
         * @return sqlHash
         */
        public String getSqlHash() {
            return this.sqlHash;
        }

        /**
         * @return statusDesc
         */
        public String getStatusDesc() {
            return this.statusDesc;
        }

        public static final class Builder {
            private String checkStatus; 
            private String checkedTime; 
            private Long fileId; 
            private String fileName; 
            private String reviewSummary; 
            private String SQLContent; 
            private Long SQLId; 
            private String SQLName; 
            private String SQLReviewQueryKey; 
            private String sqlHash; 
            private String statusDesc; 

            /**
             * <p>The review status of the SQL statement. Valid values:</p>
             * <ul>
             * <li><strong>new</strong>: The SQL statement was waiting to be reviewed.</li>
             * <li><strong>unknown</strong>: The SQL statement cannot be parsed.</li>
             * <li><strong>check_not_pass</strong>: The SQL statement failed to pass the review.</li>
             * <li><strong>check_pass</strong>: The SQL statement passed the review.</li>
             * <li><strong>force_pass</strong>: The SQL statement passed the manual review.</li>
             * <li><strong>force_not_pass</strong>: The SQL statement failed to pass the manual review.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>check_pass</p>
             */
            public Builder checkStatus(String checkStatus) {
                this.checkStatus = checkStatus;
                return this;
            }

            /**
             * <p>The time when the SQL statement was reviewed.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-06-09 21:07:00</p>
             */
            public Builder checkedTime(String checkedTime) {
                this.checkedTime = checkedTime;
                return this;
            }

            /**
             * <p>The file ID.</p>
             * 
             * <strong>example:</strong>
             * <p>123321</p>
             */
            public Builder fileId(Long fileId) {
                this.fileId = fileId;
                return this;
            }

            /**
             * <p>The name of the file.</p>
             * 
             * <strong>example:</strong>
             * <p>test.sql</p>
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * <p>The statistics on the optimization suggestions for SQL statements. The value is a JSON string. Valid values:</p>
             * <ul>
             * <li><strong>MUST_IMPROVE</strong>: The SQL statements must be optimized.</li>
             * <li><strong>POTENTIAL_ISSUE</strong>: The SQL statements contain potential issues.</li>
             * <li><strong>SUGGEST_IMPROVE</strong>: We recommend that you optimize the SQL statements.</li>
             * <li><strong>USEDMSTOOLKIT</strong>: We recommend that you change schemas without locking tables.</li>
             * <li><strong>USEDMSDML_UNLOCK</strong>: We recommend that you change data without locking tables.</li>
             * <li><strong>TABLEINDEXSUGGEST</strong>: We recommend that you optimize indexes for the SQL statements.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>{&quot;POTENTIAL_ISSUE&quot;:1,&quot;SUGGEST_IMPROVE&quot;:1}</p>
             */
            public Builder reviewSummary(String reviewSummary) {
                this.reviewSummary = reviewSummary;
                return this;
            }

            /**
             * <p>The SQL statement in the file.</p>
             * 
             * <strong>example:</strong>
             * <p>select id from table_name</p>
             */
            public Builder SQLContent(String SQLContent) {
                this.SQLContent = SQLContent;
                return this;
            }

            /**
             * <p>The ID of the SQL statement.</p>
             * 
             * <strong>example:</strong>
             * <p>1111</p>
             */
            public Builder SQLId(Long SQLId) {
                this.SQLId = SQLId;
                return this;
            }

            /**
             * <p>The name of the SQL statement.</p>
             * 
             * <strong>example:</strong>
             * <p>getByPk</p>
             */
            public Builder SQLName(String SQLName) {
                this.SQLName = SQLName;
                return this;
            }

            /**
             * <p>The key that is used to query the information about optimization suggestions. You can call the <a href="https://help.aliyun.com/document_detail/465919.html">GetSQLReviewOptimizeDetail</a> operation to query the details based on this key.</p>
             * 
             * <strong>example:</strong>
             * <p>a57e54ec5433475ea3082d882fdb89c5</p>
             */
            public Builder SQLReviewQueryKey(String SQLReviewQueryKey) {
                this.SQLReviewQueryKey = SQLReviewQueryKey;
                return this;
            }

            /**
             * <p>The MD5 hash value that is obtained after the SQL statement is calculated by using a hash algorithm.</p>
             * 
             * <strong>example:</strong>
             * <p>95adb6e77a0884d9e50232cb8c5c969d</p>
             */
            public Builder sqlHash(String sqlHash) {
                this.sqlHash = sqlHash;
                return this;
            }

            /**
             * <p>The description of the review status.</p>
             * 
             * <strong>example:</strong>
             * <p>passed the test</p>
             */
            public Builder statusDesc(String statusDesc) {
                this.statusDesc = statusDesc;
                return this;
            }

            public OriginSQLList build() {
                return new OriginSQLList(this);
            } 

        } 

    }
}
