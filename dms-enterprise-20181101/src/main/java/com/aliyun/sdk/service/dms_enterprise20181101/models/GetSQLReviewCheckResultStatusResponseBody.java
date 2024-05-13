// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSQLReviewCheckResultStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetSQLReviewCheckResultStatusResponseBody</p>
 */
public class GetSQLReviewCheckResultStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CheckResultStatus")
    private CheckResultStatus checkResultStatus;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetSQLReviewCheckResultStatusResponseBody(Builder builder) {
        this.checkResultStatus = builder.checkResultStatus;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSQLReviewCheckResultStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return checkResultStatus
     */
    public CheckResultStatus getCheckResultStatus() {
        return this.checkResultStatus;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private CheckResultStatus checkResultStatus; 
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        /**
         * The result of the SQL review.
         */
        public Builder checkResultStatus(CheckResultStatus checkResultStatus) {
            this.checkResultStatus = checkResultStatus;
            return this;
        }

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
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetSQLReviewCheckResultStatusResponseBody build() {
            return new GetSQLReviewCheckResultStatusResponseBody(this);
        } 

    } 

    public static class CheckStatusResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CheckNotPass")
        private Long checkNotPass;

        @com.aliyun.core.annotation.NameInMap("CheckPass")
        private Long checkPass;

        @com.aliyun.core.annotation.NameInMap("ForceNotPass")
        private Long forceNotPass;

        @com.aliyun.core.annotation.NameInMap("ForcePass")
        private Long forcePass;

        @com.aliyun.core.annotation.NameInMap("New")
        private Long _new;

        @com.aliyun.core.annotation.NameInMap("Unknown")
        private Long unknown;

        private CheckStatusResult(Builder builder) {
            this.checkNotPass = builder.checkNotPass;
            this.checkPass = builder.checkPass;
            this.forceNotPass = builder.forceNotPass;
            this.forcePass = builder.forcePass;
            this._new = builder._new;
            this.unknown = builder.unknown;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CheckStatusResult create() {
            return builder().build();
        }

        /**
         * @return checkNotPass
         */
        public Long getCheckNotPass() {
            return this.checkNotPass;
        }

        /**
         * @return checkPass
         */
        public Long getCheckPass() {
            return this.checkPass;
        }

        /**
         * @return forceNotPass
         */
        public Long getForceNotPass() {
            return this.forceNotPass;
        }

        /**
         * @return forcePass
         */
        public Long getForcePass() {
            return this.forcePass;
        }

        /**
         * @return _new
         */
        public Long get_new() {
            return this._new;
        }

        /**
         * @return unknown
         */
        public Long getUnknown() {
            return this.unknown;
        }

        public static final class Builder {
            private Long checkNotPass; 
            private Long checkPass; 
            private Long forceNotPass; 
            private Long forcePass; 
            private Long _new; 
            private Long unknown; 

            /**
             * The number of SQL statements that failed to pass the review.
             */
            public Builder checkNotPass(Long checkNotPass) {
                this.checkNotPass = checkNotPass;
                return this;
            }

            /**
             * The number of SQL statements that passed the review.
             */
            public Builder checkPass(Long checkPass) {
                this.checkPass = checkPass;
                return this;
            }

            /**
             * The number of SQL statements that failed to pass the manual review.
             */
            public Builder forceNotPass(Long forceNotPass) {
                this.forceNotPass = forceNotPass;
                return this;
            }

            /**
             * The number of SQL statements that passed the manual review.
             */
            public Builder forcePass(Long forcePass) {
                this.forcePass = forcePass;
                return this;
            }

            /**
             * The number of SQL statements to be reviewed.
             */
            public Builder _new(Long _new) {
                this._new = _new;
                return this;
            }

            /**
             * The number of abnormal SQL statements.
             */
            public Builder unknown(Long unknown) {
                this.unknown = unknown;
                return this;
            }

            public CheckStatusResult build() {
                return new CheckStatusResult(this);
            } 

        } 

    }
    public static class SQLReviewResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MustImprove")
        private Long mustImprove;

        @com.aliyun.core.annotation.NameInMap("PotentialIssue")
        private Long potentialIssue;

        @com.aliyun.core.annotation.NameInMap("SuggestImprove")
        private Long suggestImprove;

        @com.aliyun.core.annotation.NameInMap("TableIndexSuggest")
        private Long tableIndexSuggest;

        @com.aliyun.core.annotation.NameInMap("UseDmsDmlUnlock")
        private Long useDmsDmlUnlock;

        @com.aliyun.core.annotation.NameInMap("UseDmsToolkit")
        private Long useDmsToolkit;

        private SQLReviewResult(Builder builder) {
            this.mustImprove = builder.mustImprove;
            this.potentialIssue = builder.potentialIssue;
            this.suggestImprove = builder.suggestImprove;
            this.tableIndexSuggest = builder.tableIndexSuggest;
            this.useDmsDmlUnlock = builder.useDmsDmlUnlock;
            this.useDmsToolkit = builder.useDmsToolkit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SQLReviewResult create() {
            return builder().build();
        }

        /**
         * @return mustImprove
         */
        public Long getMustImprove() {
            return this.mustImprove;
        }

        /**
         * @return potentialIssue
         */
        public Long getPotentialIssue() {
            return this.potentialIssue;
        }

        /**
         * @return suggestImprove
         */
        public Long getSuggestImprove() {
            return this.suggestImprove;
        }

        /**
         * @return tableIndexSuggest
         */
        public Long getTableIndexSuggest() {
            return this.tableIndexSuggest;
        }

        /**
         * @return useDmsDmlUnlock
         */
        public Long getUseDmsDmlUnlock() {
            return this.useDmsDmlUnlock;
        }

        /**
         * @return useDmsToolkit
         */
        public Long getUseDmsToolkit() {
            return this.useDmsToolkit;
        }

        public static final class Builder {
            private Long mustImprove; 
            private Long potentialIssue; 
            private Long suggestImprove; 
            private Long tableIndexSuggest; 
            private Long useDmsDmlUnlock; 
            private Long useDmsToolkit; 

            /**
             * The number of SQL statements that must be modified.
             */
            public Builder mustImprove(Long mustImprove) {
                this.mustImprove = mustImprove;
                return this;
            }

            /**
             * The number of SQL statements that have potential issues.
             */
            public Builder potentialIssue(Long potentialIssue) {
                this.potentialIssue = potentialIssue;
                return this;
            }

            /**
             * The number of SQL statements that can be modified.
             */
            public Builder suggestImprove(Long suggestImprove) {
                this.suggestImprove = suggestImprove;
                return this;
            }

            /**
             * The number of SQL statements that can use indexes.
             */
            public Builder tableIndexSuggest(Long tableIndexSuggest) {
                this.tableIndexSuggest = tableIndexSuggest;
                return this;
            }

            /**
             * The number of SQL statements that can be used for lock-free data changes.
             */
            public Builder useDmsDmlUnlock(Long useDmsDmlUnlock) {
                this.useDmsDmlUnlock = useDmsDmlUnlock;
                return this;
            }

            /**
             * The number of SQL statements that can be used for lock-free schema changes.
             */
            public Builder useDmsToolkit(Long useDmsToolkit) {
                this.useDmsToolkit = useDmsToolkit;
                return this;
            }

            public SQLReviewResult build() {
                return new SQLReviewResult(this);
            } 

        } 

    }
    public static class CheckResultStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CheckStatusResult")
        private CheckStatusResult checkStatusResult;

        @com.aliyun.core.annotation.NameInMap("CheckedCount")
        private Long checkedCount;

        @com.aliyun.core.annotation.NameInMap("SQLReviewResult")
        private SQLReviewResult SQLReviewResult;

        @com.aliyun.core.annotation.NameInMap("TotalSQLCount")
        private Long totalSQLCount;

        private CheckResultStatus(Builder builder) {
            this.checkStatusResult = builder.checkStatusResult;
            this.checkedCount = builder.checkedCount;
            this.SQLReviewResult = builder.SQLReviewResult;
            this.totalSQLCount = builder.totalSQLCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CheckResultStatus create() {
            return builder().build();
        }

        /**
         * @return checkStatusResult
         */
        public CheckStatusResult getCheckStatusResult() {
            return this.checkStatusResult;
        }

        /**
         * @return checkedCount
         */
        public Long getCheckedCount() {
            return this.checkedCount;
        }

        /**
         * @return SQLReviewResult
         */
        public SQLReviewResult getSQLReviewResult() {
            return this.SQLReviewResult;
        }

        /**
         * @return totalSQLCount
         */
        public Long getTotalSQLCount() {
            return this.totalSQLCount;
        }

        public static final class Builder {
            private CheckStatusResult checkStatusResult; 
            private Long checkedCount; 
            private SQLReviewResult SQLReviewResult; 
            private Long totalSQLCount; 

            /**
             * The result of the SQL status check.
             */
            public Builder checkStatusResult(CheckStatusResult checkStatusResult) {
                this.checkStatusResult = checkStatusResult;
                return this;
            }

            /**
             * The number of SQL statements that were reviewed.
             */
            public Builder checkedCount(Long checkedCount) {
                this.checkedCount = checkedCount;
                return this;
            }

            /**
             * The optimization suggestion for SQL statements.
             */
            public Builder SQLReviewResult(SQLReviewResult SQLReviewResult) {
                this.SQLReviewResult = SQLReviewResult;
                return this;
            }

            /**
             * The total number of SQL statements.
             */
            public Builder totalSQLCount(Long totalSQLCount) {
                this.totalSQLCount = totalSQLCount;
                return this;
            }

            public CheckResultStatus build() {
                return new CheckResultStatus(this);
            } 

        } 

    }
}
