// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSQLReviewOptimizeDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetSQLReviewOptimizeDetailResponseBody</p>
 */
public class GetSQLReviewOptimizeDetailResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("OptimizeDetail")
    private OptimizeDetail optimizeDetail;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetSQLReviewOptimizeDetailResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.optimizeDetail = builder.optimizeDetail;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSQLReviewOptimizeDetailResponseBody create() {
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
     * @return optimizeDetail
     */
    public OptimizeDetail getOptimizeDetail() {
        return this.optimizeDetail;
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
        private OptimizeDetail optimizeDetail; 
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
         * OptimizeDetail.
         */
        public Builder optimizeDetail(OptimizeDetail optimizeDetail) {
            this.optimizeDetail = optimizeDetail;
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

        public GetSQLReviewOptimizeDetailResponseBody build() {
            return new GetSQLReviewOptimizeDetailResponseBody(this);
        } 

    } 

    public static class Scripts extends TeaModel {
        @NameInMap("Content")
        private String content;

        @NameInMap("OpType")
        private String opType;

        @NameInMap("TableName")
        private String tableName;

        private Scripts(Builder builder) {
            this.content = builder.content;
            this.opType = builder.opType;
            this.tableName = builder.tableName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Scripts create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return opType
         */
        public String getOpType() {
            return this.opType;
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        public static final class Builder {
            private String content; 
            private String opType; 
            private String tableName; 

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * OpType.
             */
            public Builder opType(String opType) {
                this.opType = opType;
                return this;
            }

            /**
             * TableName.
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            public Scripts build() {
                return new Scripts(this);
            } 

        } 

    }
    public static class Results extends TeaModel {
        @NameInMap("Comments")
        private String comments;

        @NameInMap("Feedback")
        private String feedback;

        @NameInMap("Messages")
        private java.util.List < String > messages;

        @NameInMap("RuleName")
        private String ruleName;

        @NameInMap("RuleType")
        private String ruleType;

        @NameInMap("Scripts")
        private java.util.List < Scripts> scripts;

        private Results(Builder builder) {
            this.comments = builder.comments;
            this.feedback = builder.feedback;
            this.messages = builder.messages;
            this.ruleName = builder.ruleName;
            this.ruleType = builder.ruleType;
            this.scripts = builder.scripts;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Results create() {
            return builder().build();
        }

        /**
         * @return comments
         */
        public String getComments() {
            return this.comments;
        }

        /**
         * @return feedback
         */
        public String getFeedback() {
            return this.feedback;
        }

        /**
         * @return messages
         */
        public java.util.List < String > getMessages() {
            return this.messages;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        /**
         * @return ruleType
         */
        public String getRuleType() {
            return this.ruleType;
        }

        /**
         * @return scripts
         */
        public java.util.List < Scripts> getScripts() {
            return this.scripts;
        }

        public static final class Builder {
            private String comments; 
            private String feedback; 
            private java.util.List < String > messages; 
            private String ruleName; 
            private String ruleType; 
            private java.util.List < Scripts> scripts; 

            /**
             * Comments.
             */
            public Builder comments(String comments) {
                this.comments = comments;
                return this;
            }

            /**
             * Feedback.
             */
            public Builder feedback(String feedback) {
                this.feedback = feedback;
                return this;
            }

            /**
             * Messages.
             */
            public Builder messages(java.util.List < String > messages) {
                this.messages = messages;
                return this;
            }

            /**
             * RuleName.
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * RuleType.
             */
            public Builder ruleType(String ruleType) {
                this.ruleType = ruleType;
                return this;
            }

            /**
             * Scripts.
             */
            public Builder scripts(java.util.List < Scripts> scripts) {
                this.scripts = scripts;
                return this;
            }

            public Results build() {
                return new Results(this);
            } 

        } 

    }
    public static class QualityResult extends TeaModel {
        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("OccurError")
        private Boolean occurError;

        @NameInMap("Results")
        private java.util.List < Results> results;

        private QualityResult(Builder builder) {
            this.errorMessage = builder.errorMessage;
            this.occurError = builder.occurError;
            this.results = builder.results;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QualityResult create() {
            return builder().build();
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return occurError
         */
        public Boolean getOccurError() {
            return this.occurError;
        }

        /**
         * @return results
         */
        public java.util.List < Results> getResults() {
            return this.results;
        }

        public static final class Builder {
            private String errorMessage; 
            private Boolean occurError; 
            private java.util.List < Results> results; 

            /**
             * ErrorMessage.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * OccurError.
             */
            public Builder occurError(Boolean occurError) {
                this.occurError = occurError;
                return this;
            }

            /**
             * Results.
             */
            public Builder results(java.util.List < Results> results) {
                this.results = results;
                return this;
            }

            public QualityResult build() {
                return new QualityResult(this);
            } 

        } 

    }
    public static class OptimizeDetail extends TeaModel {
        @NameInMap("DbId")
        private Integer dbId;

        @NameInMap("InstanceId")
        private Integer instanceId;

        @NameInMap("QualityResult")
        private QualityResult qualityResult;

        @NameInMap("QueryKey")
        private String queryKey;

        @NameInMap("SqlType")
        private String sqlType;

        private OptimizeDetail(Builder builder) {
            this.dbId = builder.dbId;
            this.instanceId = builder.instanceId;
            this.qualityResult = builder.qualityResult;
            this.queryKey = builder.queryKey;
            this.sqlType = builder.sqlType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OptimizeDetail create() {
            return builder().build();
        }

        /**
         * @return dbId
         */
        public Integer getDbId() {
            return this.dbId;
        }

        /**
         * @return instanceId
         */
        public Integer getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return qualityResult
         */
        public QualityResult getQualityResult() {
            return this.qualityResult;
        }

        /**
         * @return queryKey
         */
        public String getQueryKey() {
            return this.queryKey;
        }

        /**
         * @return sqlType
         */
        public String getSqlType() {
            return this.sqlType;
        }

        public static final class Builder {
            private Integer dbId; 
            private Integer instanceId; 
            private QualityResult qualityResult; 
            private String queryKey; 
            private String sqlType; 

            /**
             * DbId.
             */
            public Builder dbId(Integer dbId) {
                this.dbId = dbId;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(Integer instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * QualityResult.
             */
            public Builder qualityResult(QualityResult qualityResult) {
                this.qualityResult = qualityResult;
                return this;
            }

            /**
             * QueryKey.
             */
            public Builder queryKey(String queryKey) {
                this.queryKey = queryKey;
                return this;
            }

            /**
             * SqlType.
             */
            public Builder sqlType(String sqlType) {
                this.sqlType = sqlType;
                return this;
            }

            public OptimizeDetail build() {
                return new OptimizeDetail(this);
            } 

        } 

    }
}
