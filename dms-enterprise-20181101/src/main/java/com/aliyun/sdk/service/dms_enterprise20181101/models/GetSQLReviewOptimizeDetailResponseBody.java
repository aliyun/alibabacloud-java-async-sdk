// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The details of optimization suggestions for SQL statements.</p>
         */
        public Builder optimizeDetail(OptimizeDetail optimizeDetail) {
            this.optimizeDetail = optimizeDetail;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>0C1CB646-1DE4-4AD0-B4A4-7D47DD52E931</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
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

        public GetSQLReviewOptimizeDetailResponseBody build() {
            return new GetSQLReviewOptimizeDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetSQLReviewOptimizeDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetSQLReviewOptimizeDetailResponseBody</p>
     */
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
             * <p>The content of the SQL script.</p>
             * 
             * <strong>example:</strong>
             * <p>alter table xxx add index idx_xx(yyy);</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The purpose of the SQL script. The value is set to AddIndex.</p>
             * 
             * <strong>example:</strong>
             * <p>AddIndex</p>
             */
            public Builder opType(String opType) {
                this.opType = opType;
                return this;
            }

            /**
             * <p>The name of the table.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
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
    /**
     * 
     * {@link GetSQLReviewOptimizeDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetSQLReviewOptimizeDetailResponseBody</p>
     */
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
             * <p>The comment that is specified when you create the SQL review rule. For more information, see <a href="https://help.aliyun.com/document_detail/194114.html">SQL review optimization</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx business rule: the query must have a where condition.</p>
             */
            public Builder comments(String comments) {
                this.comments = comments;
                return this;
            }

            /**
             * <p>The optimization suggestion for the SQL statement. Valid values:</p>
             * <ul>
             * <li><strong>MUST_IMPROVE</strong>: The SQL statement must be improved.</li>
             * <li><strong>POTENTIAL_ISSUE</strong>: The SQL statement contains potential issues.</li>
             * <li><strong>SUGGEST_IMPROVE</strong>: We recommend that you improve the SQL statement.</li>
             * <li><strong>USEDMSTOOLKIT</strong>: We recommend that you change schemas without locking tables.</li>
             * <li><strong>USEDMSDML_UNLOCK</strong>: We recommend that you change data without locking tables.</li>
             * <li><strong>TABLEINDEXSUGGEST</strong>: We recommend that you use SQL statements that use indexes.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>MUST_IMPROVE</p>
             */
            public Builder feedback(String feedback) {
                this.feedback = feedback;
                return this;
            }

            /**
             * <p>The review results.</p>
             */
            public Builder messages(java.util.List < String > messages) {
                this.messages = messages;
                return this;
            }

            /**
             * <p>The name of the rule. For more information, see <a href="https://help.aliyun.com/document_detail/194114.html">SQL review optimization</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>SELECT_SUGGEST_ASSIGN_WHERE</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * <p>The type of the SQL review rule. Valid values:</p>
             * <ul>
             * <li><strong>REVIEW</strong>: a rule that is used to review SQL statements based on standards.</li>
             * <li><strong>OPTIMIZE</strong>: a rule that is used to provide optimization suggestions.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>REVIEW</p>
             */
            public Builder ruleType(String ruleType) {
                this.ruleType = ruleType;
                return this;
            }

            /**
             * <p>The SQL script for data changes.</p>
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
    /**
     * 
     * {@link GetSQLReviewOptimizeDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetSQLReviewOptimizeDetailResponseBody</p>
     */
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
             * <p>The error message returned.</p>
             * 
             * <strong>example:</strong>
             * <p>syntax error</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>Indicates whether an error occurs. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: An error occurs.</li>
             * <li><strong>false</strong>: No error occurs.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder occurError(Boolean occurError) {
                this.occurError = occurError;
                return this;
            }

            /**
             * <p>The review results based on rules.</p>
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
    /**
     * 
     * {@link GetSQLReviewOptimizeDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetSQLReviewOptimizeDetailResponseBody</p>
     */
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
             * <p>The ID of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>111222</p>
             */
            public Builder dbId(Integer dbId) {
                this.dbId = dbId;
                return this;
            }

            /**
             * <p>The ID of the instance to which the database belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>123321</p>
             */
            public Builder instanceId(Integer instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The quality of the SQL statement.</p>
             */
            public Builder qualityResult(QualityResult qualityResult) {
                this.qualityResult = qualityResult;
                return this;
            }

            /**
             * <p>The key that is used to query the details of optimization suggestions.</p>
             * 
             * <strong>example:</strong>
             * <p>a57e54ec5433475ea3082d882fdb****</p>
             */
            public Builder queryKey(String queryKey) {
                this.queryKey = queryKey;
                return this;
            }

            /**
             * <p>The type of the SQL statement. Valid values: DELETE, UPDATE, and ALTER_TABLE.</p>
             * 
             * <strong>example:</strong>
             * <p>UPDATE</p>
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
