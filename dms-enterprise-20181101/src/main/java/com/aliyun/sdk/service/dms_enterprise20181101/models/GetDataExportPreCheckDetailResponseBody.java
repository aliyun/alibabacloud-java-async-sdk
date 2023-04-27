// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDataExportPreCheckDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetDataExportPreCheckDetailResponseBody</p>
 */
public class GetDataExportPreCheckDetailResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("PreCheckResult")
    private PreCheckResult preCheckResult;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetDataExportPreCheckDetailResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.preCheckResult = builder.preCheckResult;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDataExportPreCheckDetailResponseBody create() {
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
     * @return preCheckResult
     */
    public PreCheckResult getPreCheckResult() {
        return this.preCheckResult;
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
        private String errorCode; 
        private String errorMessage; 
        private PreCheckResult preCheckResult; 
        private String requestId; 
        private Boolean success; 

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
         * PreCheckResult.
         */
        public Builder preCheckResult(PreCheckResult preCheckResult) {
            this.preCheckResult = preCheckResult;
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

        public GetDataExportPreCheckDetailResponseBody build() {
            return new GetDataExportPreCheckDetailResponseBody(this);
        } 

    } 

    public static class PreCheckDetailList extends TeaModel {
        @NameInMap("AffectRows")
        private Long affectRows;

        @NameInMap("SQL")
        private String SQL;

        private PreCheckDetailList(Builder builder) {
            this.affectRows = builder.affectRows;
            this.SQL = builder.SQL;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PreCheckDetailList create() {
            return builder().build();
        }

        /**
         * @return affectRows
         */
        public Long getAffectRows() {
            return this.affectRows;
        }

        /**
         * @return SQL
         */
        public String getSQL() {
            return this.SQL;
        }

        public static final class Builder {
            private Long affectRows; 
            private String SQL; 

            /**
             * AffectRows.
             */
            public Builder affectRows(Long affectRows) {
                this.affectRows = affectRows;
                return this;
            }

            /**
             * SQL.
             */
            public Builder SQL(String SQL) {
                this.SQL = SQL;
                return this;
            }

            public PreCheckDetailList build() {
                return new PreCheckDetailList(this);
            } 

        } 

    }
    public static class PreCheckResultPreCheckDetailList extends TeaModel {
        @NameInMap("PreCheckDetailList")
        private java.util.List < PreCheckDetailList> preCheckDetailList;

        private PreCheckResultPreCheckDetailList(Builder builder) {
            this.preCheckDetailList = builder.preCheckDetailList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PreCheckResultPreCheckDetailList create() {
            return builder().build();
        }

        /**
         * @return preCheckDetailList
         */
        public java.util.List < PreCheckDetailList> getPreCheckDetailList() {
            return this.preCheckDetailList;
        }

        public static final class Builder {
            private java.util.List < PreCheckDetailList> preCheckDetailList; 

            /**
             * PreCheckDetailList.
             */
            public Builder preCheckDetailList(java.util.List < PreCheckDetailList> preCheckDetailList) {
                this.preCheckDetailList = preCheckDetailList;
                return this;
            }

            public PreCheckResultPreCheckDetailList build() {
                return new PreCheckResultPreCheckDetailList(this);
            } 

        } 

    }
    public static class PreCheckResult extends TeaModel {
        @NameInMap("IgnoreAffectRows")
        private Boolean ignoreAffectRows;

        @NameInMap("PreCheckDetailList")
        private PreCheckResultPreCheckDetailList preCheckDetailList;

        private PreCheckResult(Builder builder) {
            this.ignoreAffectRows = builder.ignoreAffectRows;
            this.preCheckDetailList = builder.preCheckDetailList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PreCheckResult create() {
            return builder().build();
        }

        /**
         * @return ignoreAffectRows
         */
        public Boolean getIgnoreAffectRows() {
            return this.ignoreAffectRows;
        }

        /**
         * @return preCheckDetailList
         */
        public PreCheckResultPreCheckDetailList getPreCheckDetailList() {
            return this.preCheckDetailList;
        }

        public static final class Builder {
            private Boolean ignoreAffectRows; 
            private PreCheckResultPreCheckDetailList preCheckDetailList; 

            /**
             * IgnoreAffectRows.
             */
            public Builder ignoreAffectRows(Boolean ignoreAffectRows) {
                this.ignoreAffectRows = ignoreAffectRows;
                return this;
            }

            /**
             * PreCheckDetailList.
             */
            public Builder preCheckDetailList(PreCheckResultPreCheckDetailList preCheckDetailList) {
                this.preCheckDetailList = preCheckDetailList;
                return this;
            }

            public PreCheckResult build() {
                return new PreCheckResult(this);
            } 

        } 

    }
}
