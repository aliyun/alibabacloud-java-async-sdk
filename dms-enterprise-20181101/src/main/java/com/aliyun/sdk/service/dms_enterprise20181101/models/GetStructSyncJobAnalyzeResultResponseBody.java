// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetStructSyncJobAnalyzeResultResponseBody} extends {@link TeaModel}
 *
 * <p>GetStructSyncJobAnalyzeResultResponseBody</p>
 */
public class GetStructSyncJobAnalyzeResultResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StructSyncJobAnalyzeResult")
    private StructSyncJobAnalyzeResult structSyncJobAnalyzeResult;

    @NameInMap("Success")
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
         * StructSyncJobAnalyzeResult.
         */
        public Builder structSyncJobAnalyzeResult(StructSyncJobAnalyzeResult structSyncJobAnalyzeResult) {
            this.structSyncJobAnalyzeResult = structSyncJobAnalyzeResult;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetStructSyncJobAnalyzeResultResponseBody build() {
            return new GetStructSyncJobAnalyzeResultResponseBody(this);
        } 

    } 

    public static class ResultList extends TeaModel {
        @NameInMap("Script")
        private String script;

        @NameInMap("SourceTableName")
        private String sourceTableName;

        @NameInMap("TargetTableName")
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
             * Script.
             */
            public Builder script(String script) {
                this.script = script;
                return this;
            }

            /**
             * SourceTableName.
             */
            public Builder sourceTableName(String sourceTableName) {
                this.sourceTableName = sourceTableName;
                return this;
            }

            /**
             * TargetTableName.
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
    public static class SummaryList extends TeaModel {
        @NameInMap("CompareType")
        private String compareType;

        @NameInMap("Count")
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
             * CompareType.
             */
            public Builder compareType(String compareType) {
                this.compareType = compareType;
                return this;
            }

            /**
             * Count.
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
    public static class StructSyncJobAnalyzeResult extends TeaModel {
        @NameInMap("ResultList")
        private java.util.List < ResultList> resultList;

        @NameInMap("SummaryList")
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
             * ResultList.
             */
            public Builder resultList(java.util.List < ResultList> resultList) {
                this.resultList = resultList;
                return this;
            }

            /**
             * SummaryList.
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
