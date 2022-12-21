// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSQLReviewCheckResultStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetSQLReviewCheckResultStatusResponseBody</p>
 */
public class GetSQLReviewCheckResultStatusResponseBody extends TeaModel {
    @NameInMap("CheckResultStatus")
    private CheckResultStatus checkResultStatus;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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
         * CheckResultStatus.
         */
        public Builder checkResultStatus(CheckResultStatus checkResultStatus) {
            this.checkResultStatus = checkResultStatus;
            return this;
        }

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

        public GetSQLReviewCheckResultStatusResponseBody build() {
            return new GetSQLReviewCheckResultStatusResponseBody(this);
        } 

    } 

    public static class CheckStatusResult extends TeaModel {
        @NameInMap("CheckNotPass")
        private Long checkNotPass;

        @NameInMap("CheckPass")
        private Long checkPass;

        @NameInMap("ForceNotPass")
        private Long forceNotPass;

        @NameInMap("ForcePass")
        private Long forcePass;

        @NameInMap("New")
        private Long _new;

        @NameInMap("Unknown")
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
             * CheckNotPass.
             */
            public Builder checkNotPass(Long checkNotPass) {
                this.checkNotPass = checkNotPass;
                return this;
            }

            /**
             * CheckPass.
             */
            public Builder checkPass(Long checkPass) {
                this.checkPass = checkPass;
                return this;
            }

            /**
             * ForceNotPass.
             */
            public Builder forceNotPass(Long forceNotPass) {
                this.forceNotPass = forceNotPass;
                return this;
            }

            /**
             * ForcePass.
             */
            public Builder forcePass(Long forcePass) {
                this.forcePass = forcePass;
                return this;
            }

            /**
             * New.
             */
            public Builder _new(Long _new) {
                this._new = _new;
                return this;
            }

            /**
             * Unknown.
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
        @NameInMap("MustImprove")
        private Long mustImprove;

        @NameInMap("PotentialIssue")
        private Long potentialIssue;

        @NameInMap("SuggestImprove")
        private Long suggestImprove;

        @NameInMap("TableIndexSuggest")
        private Long tableIndexSuggest;

        @NameInMap("UseDmsDmlUnlock")
        private Long useDmsDmlUnlock;

        @NameInMap("UseDmsToolkit")
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
             * MustImprove.
             */
            public Builder mustImprove(Long mustImprove) {
                this.mustImprove = mustImprove;
                return this;
            }

            /**
             * PotentialIssue.
             */
            public Builder potentialIssue(Long potentialIssue) {
                this.potentialIssue = potentialIssue;
                return this;
            }

            /**
             * SuggestImprove.
             */
            public Builder suggestImprove(Long suggestImprove) {
                this.suggestImprove = suggestImprove;
                return this;
            }

            /**
             * TableIndexSuggest.
             */
            public Builder tableIndexSuggest(Long tableIndexSuggest) {
                this.tableIndexSuggest = tableIndexSuggest;
                return this;
            }

            /**
             * UseDmsDmlUnlock.
             */
            public Builder useDmsDmlUnlock(Long useDmsDmlUnlock) {
                this.useDmsDmlUnlock = useDmsDmlUnlock;
                return this;
            }

            /**
             * UseDmsToolkit.
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
        @NameInMap("CheckStatusResult")
        private CheckStatusResult checkStatusResult;

        @NameInMap("CheckedCount")
        private Long checkedCount;

        @NameInMap("SQLReviewResult")
        private SQLReviewResult SQLReviewResult;

        @NameInMap("TotalSQLCount")
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
             * CheckStatusResult.
             */
            public Builder checkStatusResult(CheckStatusResult checkStatusResult) {
                this.checkStatusResult = checkStatusResult;
                return this;
            }

            /**
             * CheckedCount.
             */
            public Builder checkedCount(Long checkedCount) {
                this.checkedCount = checkedCount;
                return this;
            }

            /**
             * SQLReviewResult.
             */
            public Builder SQLReviewResult(SQLReviewResult SQLReviewResult) {
                this.SQLReviewResult = SQLReviewResult;
                return this;
            }

            /**
             * TotalSQLCount.
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
