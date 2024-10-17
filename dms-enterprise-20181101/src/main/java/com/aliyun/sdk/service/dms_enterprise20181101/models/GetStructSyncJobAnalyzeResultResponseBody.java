// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetStructSyncJobAnalyzeResultResponseBody} extends {@link TeaModel}
 *
 * <p>GetStructSyncJobAnalyzeResultResponseBody</p>
 */
public class GetStructSyncJobAnalyzeResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StructSyncJobAnalyzeResult")
    private StructSyncJobAnalyzeResult structSyncJobAnalyzeResult;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetStructSyncJobAnalyzeResultResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.structSyncJobAnalyzeResult = builder.structSyncJobAnalyzeResult;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetStructSyncJobAnalyzeResultResponseBody create() {
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
     * @return structSyncJobAnalyzeResult
     */
    public StructSyncJobAnalyzeResult getStructSyncJobAnalyzeResult() {
        return this.structSyncJobAnalyzeResult;
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
        private StructSyncJobAnalyzeResult structSyncJobAnalyzeResult; 
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
         * <p>The analysis result of the schema synchronization task.</p>
         */
        public Builder structSyncJobAnalyzeResult(StructSyncJobAnalyzeResult structSyncJobAnalyzeResult) {
            this.structSyncJobAnalyzeResult = structSyncJobAnalyzeResult;
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

        public GetStructSyncJobAnalyzeResultResponseBody build() {
            return new GetStructSyncJobAnalyzeResultResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetStructSyncJobAnalyzeResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetStructSyncJobAnalyzeResultResponseBody</p>
     */
    public static class ResultList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Script")
        private String script;

        @com.aliyun.core.annotation.NameInMap("SourceTableName")
        private String sourceTableName;

        @com.aliyun.core.annotation.NameInMap("TargetTableName")
        private String targetTableName;

        private ResultList(Builder builder) {
            this.script = builder.script;
            this.sourceTableName = builder.sourceTableName;
            this.targetTableName = builder.targetTableName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultList create() {
            return builder().build();
        }

        /**
         * @return script
         */
        public String getScript() {
            return this.script;
        }

        /**
         * @return sourceTableName
         */
        public String getSourceTableName() {
            return this.sourceTableName;
        }

        /**
         * @return targetTableName
         */
        public String getTargetTableName() {
            return this.targetTableName;
        }

        public static final class Builder {
            private String script; 
            private String sourceTableName; 
            private String targetTableName; 

            /**
             * <p>The SQL script.</p>
             */
            public Builder script(String script) {
                this.script = script;
                return this;
            }

            /**
             * <p>The name of the source table.</p>
             * 
             * <strong>example:</strong>
             * <p>helloz_bak</p>
             */
            public Builder sourceTableName(String sourceTableName) {
                this.sourceTableName = sourceTableName;
                return this;
            }

            /**
             * <p>The name of the destination table.</p>
             * 
             * <strong>example:</strong>
             * <p>helloz_bak</p>
             */
            public Builder targetTableName(String targetTableName) {
                this.targetTableName = targetTableName;
                return this;
            }

            public ResultList build() {
                return new ResultList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetStructSyncJobAnalyzeResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetStructSyncJobAnalyzeResultResponseBody</p>
     */
    public static class SummaryList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CompareType")
        private String compareType;

        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        private SummaryList(Builder builder) {
            this.compareType = builder.compareType;
            this.count = builder.count;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SummaryList create() {
            return builder().build();
        }

        /**
         * @return compareType
         */
        public String getCompareType() {
            return this.compareType;
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        public static final class Builder {
            private String compareType; 
            private Long count; 

            /**
             * <p>The type of the comparison. Valid values:</p>
             * <ul>
             * <li><strong>CREATE_TABLE</strong>: compares the created tables.</li>
             * <li><strong>ALTER_TABLE</strong>: compares the modified tables.</li>
             * <li><strong>EQUAL_TABLE</strong>: compares the identical tables.</li>
             * <li><strong>PASS_TABLE</strong>: compares the tables that are skipped during schema synchronization.</li>
             * <li><strong>NOT_COMPARE</strong>: does not compare tables.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CREATE_TABLE</p>
             */
            public Builder compareType(String compareType) {
                this.compareType = compareType;
                return this;
            }

            /**
             * <p>The number of tables.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            public SummaryList build() {
                return new SummaryList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetStructSyncJobAnalyzeResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetStructSyncJobAnalyzeResultResponseBody</p>
     */
    public static class StructSyncJobAnalyzeResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ResultList")
        private java.util.List < ResultList> resultList;

        @com.aliyun.core.annotation.NameInMap("SummaryList")
        private java.util.List < SummaryList> summaryList;

        private StructSyncJobAnalyzeResult(Builder builder) {
            this.resultList = builder.resultList;
            this.summaryList = builder.summaryList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StructSyncJobAnalyzeResult create() {
            return builder().build();
        }

        /**
         * @return resultList
         */
        public java.util.List < ResultList> getResultList() {
            return this.resultList;
        }

        /**
         * @return summaryList
         */
        public java.util.List < SummaryList> getSummaryList() {
            return this.summaryList;
        }

        public static final class Builder {
            private java.util.List < ResultList> resultList; 
            private java.util.List < SummaryList> summaryList; 

            /**
             * <p>The details of the analysis results.</p>
             */
            public Builder resultList(java.util.List < ResultList> resultList) {
                this.resultList = resultList;
                return this;
            }

            /**
             * <p>The statistics on the analysis results.</p>
             */
            public Builder summaryList(java.util.List < SummaryList> summaryList) {
                this.summaryList = summaryList;
                return this;
            }

            public StructSyncJobAnalyzeResult build() {
                return new StructSyncJobAnalyzeResult(this);
            } 

        } 

    }
}
