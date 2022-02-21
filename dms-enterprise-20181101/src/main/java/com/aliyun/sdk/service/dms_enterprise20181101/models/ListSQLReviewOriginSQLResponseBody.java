// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSQLReviewOriginSQLResponseBody} extends {@link TeaModel}
 *
 * <p>ListSQLReviewOriginSQLResponseBody</p>
 */
public class ListSQLReviewOriginSQLResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("OriginSQLList")
    private java.util.List < OriginSQLList> originSQLList;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TotalCount")
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
         * OriginSQLList.
         */
        public Builder originSQLList(java.util.List < OriginSQLList> originSQLList) {
            this.originSQLList = originSQLList;
            return this;
        }

        /**
         * RequestId.
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
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListSQLReviewOriginSQLResponseBody build() {
            return new ListSQLReviewOriginSQLResponseBody(this);
        } 

    } 

    public static class OriginSQLList extends TeaModel {
        @NameInMap("CheckStatus")
        private String checkStatus;

        @NameInMap("CheckedTime")
        private String checkedTime;

        @NameInMap("FileId")
        private Long fileId;

        @NameInMap("FileName")
        private String fileName;

        @NameInMap("ReviewSummary")
        private String reviewSummary;

        @NameInMap("SQLContent")
        private String SQLContent;

        @NameInMap("SQLId")
        private Long SQLId;

        @NameInMap("SQLReviewQueryKey")
        private String SQLReviewQueryKey;

        @NameInMap("SqlHash")
        private String sqlHash;

        @NameInMap("StatusDesc")
        private String statusDesc;

        private OriginSQLList(Builder builder) {
            this.checkStatus = builder.checkStatus;
            this.checkedTime = builder.checkedTime;
            this.fileId = builder.fileId;
            this.fileName = builder.fileName;
            this.reviewSummary = builder.reviewSummary;
            this.SQLContent = builder.SQLContent;
            this.SQLId = builder.SQLId;
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
            private String SQLReviewQueryKey; 
            private String sqlHash; 
            private String statusDesc; 

            /**
             * CheckStatus.
             */
            public Builder checkStatus(String checkStatus) {
                this.checkStatus = checkStatus;
                return this;
            }

            /**
             * CheckedTime.
             */
            public Builder checkedTime(String checkedTime) {
                this.checkedTime = checkedTime;
                return this;
            }

            /**
             * FileId.
             */
            public Builder fileId(Long fileId) {
                this.fileId = fileId;
                return this;
            }

            /**
             * FileName.
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * ReviewSummary.
             */
            public Builder reviewSummary(String reviewSummary) {
                this.reviewSummary = reviewSummary;
                return this;
            }

            /**
             * SQLContent.
             */
            public Builder SQLContent(String SQLContent) {
                this.SQLContent = SQLContent;
                return this;
            }

            /**
             * SQLId.
             */
            public Builder SQLId(Long SQLId) {
                this.SQLId = SQLId;
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
             * SqlHash.
             */
            public Builder sqlHash(String sqlHash) {
                this.sqlHash = sqlHash;
                return this;
            }

            /**
             * StatusDesc.
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
