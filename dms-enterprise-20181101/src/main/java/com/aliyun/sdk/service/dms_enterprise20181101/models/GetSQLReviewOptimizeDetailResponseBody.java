// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSQLReviewOptimizeDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetSQLReviewOptimizeDetailResponseBody</p>
 */
public class GetSQLReviewOptimizeDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("OptimizeDetail")
    private OptimizeDetail optimizeDetail;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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
         * The error code returned.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The error message returned.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * The details of optimization suggestions for SQL statements.
         */
        public Builder optimizeDetail(OptimizeDetail optimizeDetail) {
            this.optimizeDetail = optimizeDetail;
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
         * Indicates whether the request is successful.
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
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("OpType")
        private String opType;

        @com.aliyun.core.annotation.NameInMap("TableName")
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
             * The content of the SQL script.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * The purpose of the SQL script. The value is set to AddIndex.
             */
            public Builder opType(String opType) {
                this.opType = opType;
                return this;
            }

            /**
             * The name of the table.
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
        @com.aliyun.core.annotation.NameInMap("Comments")
        private String comments;

        @com.aliyun.core.annotation.NameInMap("Feedback")
        private String feedback;

        @com.aliyun.core.annotation.NameInMap("Messages")
        private java.util.List < String > messages;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("RuleType")
        private String ruleType;

        @com.aliyun.core.annotation.NameInMap("Scripts")
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
             * The comment that is specified when you create the SQL review rule. For more information, see [SQL review optimization](~~194114~~).
             */
            public Builder comments(String comments) {
                this.comments = comments;
                return this;
            }

            /**
             * The optimization suggestion for the SQL statement. Valid values:
             * <p>
             * 
             * *   **MUST_IMPROVE**: The SQL statement must be improved.
             * *   **POTENTIAL_ISSUE**: The SQL statement contains potential issues.
             * *   **SUGGEST_IMPROVE**: We recommend that you improve the SQL statement.
             * *   **USEDMSTOOLKIT**: We recommend that you change schemas without locking tables.
             * *   **USEDMSDML_UNLOCK**: We recommend that you change data without locking tables.
             * *   **TABLEINDEXSUGGEST**: We recommend that you use SQL statements that use indexes.
             */
            public Builder feedback(String feedback) {
                this.feedback = feedback;
                return this;
            }

            /**
             * The review results.
             */
            public Builder messages(java.util.List < String > messages) {
                this.messages = messages;
                return this;
            }

            /**
             * The name of the rule. For more information, see [SQL review optimization](~~194114~~).
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * The type of the SQL review rule. Valid values:
             * <p>
             * 
             * *   **REVIEW**: a rule that is used to review SQL statements based on standards.
             * *   **OPTIMIZE**: a rule that is used to provide optimization suggestions.
             */
            public Builder ruleType(String ruleType) {
                this.ruleType = ruleType;
                return this;
            }

            /**
             * The SQL script for data changes.
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
        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("OccurError")
        private Boolean occurError;

        @com.aliyun.core.annotation.NameInMap("Results")
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
             * The error message returned.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * Indicates whether an error occurs. Valid values:
             * <p>
             * 
             * *   **true**: An error occurs.
             * *   **false**: No error occurs.
             */
            public Builder occurError(Boolean occurError) {
                this.occurError = occurError;
                return this;
            }

            /**
             * The review results based on rules.
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
        @com.aliyun.core.annotation.NameInMap("DbId")
        private Integer dbId;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private Integer instanceId;

        @com.aliyun.core.annotation.NameInMap("QualityResult")
        private QualityResult qualityResult;

        @com.aliyun.core.annotation.NameInMap("QueryKey")
        private String queryKey;

        @com.aliyun.core.annotation.NameInMap("SqlType")
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
             * The ID of the database.
             */
            public Builder dbId(Integer dbId) {
                this.dbId = dbId;
                return this;
            }

            /**
             * The ID of the instance to which the database belongs.
             */
            public Builder instanceId(Integer instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The quality of the SQL statement.
             */
            public Builder qualityResult(QualityResult qualityResult) {
                this.qualityResult = qualityResult;
                return this;
            }

            /**
             * The key that is used to query the details of optimization suggestions.
             */
            public Builder queryKey(String queryKey) {
                this.queryKey = queryKey;
                return this;
            }

            /**
             * The type of the SQL statement. Valid values: DELETE, UPDATE, and ALTER_TABLE.
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
