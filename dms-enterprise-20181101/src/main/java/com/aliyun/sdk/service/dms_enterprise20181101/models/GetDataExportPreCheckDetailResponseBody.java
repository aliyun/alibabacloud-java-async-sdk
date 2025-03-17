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
 * {@link GetDataExportPreCheckDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetDataExportPreCheckDetailResponseBody</p>
 */
public class GetDataExportPreCheckDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("PreCheckResult")
    private PreCheckResult preCheckResult;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetDataExportPreCheckDetailResponseBody model) {
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.preCheckResult = model.preCheckResult;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The error code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>UnknownError</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>UnknownError</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>Indicates the result of the precheck task.</p>
         */
        public Builder preCheckResult(PreCheckResult preCheckResult) {
            this.preCheckResult = preCheckResult;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>C1D39814-9808-47F8-AFE0-AF167239AC9B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The request was successful.</li>
         * <li><strong>false</strong>: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetDataExportPreCheckDetailResponseBody build() {
            return new GetDataExportPreCheckDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDataExportPreCheckDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataExportPreCheckDetailResponseBody</p>
     */
    public static class PreCheckDetailList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AffectRows")
        private Long affectRows;

        @com.aliyun.core.annotation.NameInMap("SQL")
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

            private Builder() {
            } 

            private Builder(PreCheckDetailList model) {
                this.affectRows = model.affectRows;
                this.SQL = model.SQL;
            } 

            /**
             * <p>The estimated number of data rows to be affected.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder affectRows(Long affectRows) {
                this.affectRows = affectRows;
                return this;
            }

            /**
             * <p>The SQL statement.</p>
             * 
             * <strong>example:</strong>
             * <p>SELECT * FROM tmp_table LIMIT 1</p>
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
    /**
     * 
     * {@link GetDataExportPreCheckDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataExportPreCheckDetailResponseBody</p>
     */
    public static class PreCheckResultPreCheckDetailList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PreCheckDetailList")
        private java.util.List<PreCheckDetailList> preCheckDetailList;

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
        public java.util.List<PreCheckDetailList> getPreCheckDetailList() {
            return this.preCheckDetailList;
        }

        public static final class Builder {
            private java.util.List<PreCheckDetailList> preCheckDetailList; 

            private Builder() {
            } 

            private Builder(PreCheckResultPreCheckDetailList model) {
                this.preCheckDetailList = model.preCheckDetailList;
            } 

            /**
             * PreCheckDetailList.
             */
            public Builder preCheckDetailList(java.util.List<PreCheckDetailList> preCheckDetailList) {
                this.preCheckDetailList = preCheckDetailList;
                return this;
            }

            public PreCheckResultPreCheckDetailList build() {
                return new PreCheckResultPreCheckDetailList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDataExportPreCheckDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataExportPreCheckDetailResponseBody</p>
     */
    public static class PreCheckResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IgnoreAffectRows")
        private Boolean ignoreAffectRows;

        @com.aliyun.core.annotation.NameInMap("PreCheckDetailList")
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

            private Builder() {
            } 

            private Builder(PreCheckResult model) {
                this.ignoreAffectRows = model.ignoreAffectRows;
                this.preCheckDetailList = model.preCheckDetailList;
            } 

            /**
             * <p>Specifies whether to skip verification. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder ignoreAffectRows(Boolean ignoreAffectRows) {
                this.ignoreAffectRows = ignoreAffectRows;
                return this;
            }

            /**
             * <p>The list of pre-check details.</p>
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
