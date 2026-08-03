// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms20250414.models;

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
 * {@link ListDataAgentAccuracyTestResultsResponseBody} extends {@link TeaModel}
 *
 * <p>ListDataAgentAccuracyTestResultsResponseBody</p>
 */
public class ListDataAgentAccuracyTestResultsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListDataAgentAccuracyTestResultsResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataAgentAccuracyTestResultsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
        private Data data; 
        private String errorCode; 
        private String errorMessage; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListDataAgentAccuracyTestResultsResponseBody model) {
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
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
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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

        public ListDataAgentAccuracyTestResultsResponseBody build() {
            return new ListDataAgentAccuracyTestResultsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDataAgentAccuracyTestResultsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataAgentAccuracyTestResultsResponseBody</p>
     */
    public static class Content extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccuracyTestTaskId")
        private String accuracyTestTaskId;

        @com.aliyun.core.annotation.NameInMap("AgentResult")
        private String agentResult;

        @com.aliyun.core.annotation.NameInMap("AgentSql")
        private String agentSql;

        @com.aliyun.core.annotation.NameInMap("AnswerResult")
        private String answerResult;

        @com.aliyun.core.annotation.NameInMap("AnswerSql")
        private String answerSql;

        @com.aliyun.core.annotation.NameInMap("IsTrue")
        private Boolean isTrue;

        @com.aliyun.core.annotation.NameInMap("Question")
        private String question;

        @com.aliyun.core.annotation.NameInMap("Reason")
        private String reason;

        @com.aliyun.core.annotation.NameInMap("Recommendation")
        private String recommendation;

        @com.aliyun.core.annotation.NameInMap("ResultId")
        private String resultId;

        @com.aliyun.core.annotation.NameInMap("SessionId")
        private String sessionId;

        @com.aliyun.core.annotation.NameInMap("SubtaskId")
        private String subtaskId;

        private Content(Builder builder) {
            this.accuracyTestTaskId = builder.accuracyTestTaskId;
            this.agentResult = builder.agentResult;
            this.agentSql = builder.agentSql;
            this.answerResult = builder.answerResult;
            this.answerSql = builder.answerSql;
            this.isTrue = builder.isTrue;
            this.question = builder.question;
            this.reason = builder.reason;
            this.recommendation = builder.recommendation;
            this.resultId = builder.resultId;
            this.sessionId = builder.sessionId;
            this.subtaskId = builder.subtaskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Content create() {
            return builder().build();
        }

        /**
         * @return accuracyTestTaskId
         */
        public String getAccuracyTestTaskId() {
            return this.accuracyTestTaskId;
        }

        /**
         * @return agentResult
         */
        public String getAgentResult() {
            return this.agentResult;
        }

        /**
         * @return agentSql
         */
        public String getAgentSql() {
            return this.agentSql;
        }

        /**
         * @return answerResult
         */
        public String getAnswerResult() {
            return this.answerResult;
        }

        /**
         * @return answerSql
         */
        public String getAnswerSql() {
            return this.answerSql;
        }

        /**
         * @return isTrue
         */
        public Boolean getIsTrue() {
            return this.isTrue;
        }

        /**
         * @return question
         */
        public String getQuestion() {
            return this.question;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        /**
         * @return recommendation
         */
        public String getRecommendation() {
            return this.recommendation;
        }

        /**
         * @return resultId
         */
        public String getResultId() {
            return this.resultId;
        }

        /**
         * @return sessionId
         */
        public String getSessionId() {
            return this.sessionId;
        }

        /**
         * @return subtaskId
         */
        public String getSubtaskId() {
            return this.subtaskId;
        }

        public static final class Builder {
            private String accuracyTestTaskId; 
            private String agentResult; 
            private String agentSql; 
            private String answerResult; 
            private String answerSql; 
            private Boolean isTrue; 
            private String question; 
            private String reason; 
            private String recommendation; 
            private String resultId; 
            private String sessionId; 
            private String subtaskId; 

            private Builder() {
            } 

            private Builder(Content model) {
                this.accuracyTestTaskId = model.accuracyTestTaskId;
                this.agentResult = model.agentResult;
                this.agentSql = model.agentSql;
                this.answerResult = model.answerResult;
                this.answerSql = model.answerSql;
                this.isTrue = model.isTrue;
                this.question = model.question;
                this.reason = model.reason;
                this.recommendation = model.recommendation;
                this.resultId = model.resultId;
                this.sessionId = model.sessionId;
                this.subtaskId = model.subtaskId;
            } 

            /**
             * AccuracyTestTaskId.
             */
            public Builder accuracyTestTaskId(String accuracyTestTaskId) {
                this.accuracyTestTaskId = accuracyTestTaskId;
                return this;
            }

            /**
             * AgentResult.
             */
            public Builder agentResult(String agentResult) {
                this.agentResult = agentResult;
                return this;
            }

            /**
             * AgentSql.
             */
            public Builder agentSql(String agentSql) {
                this.agentSql = agentSql;
                return this;
            }

            /**
             * AnswerResult.
             */
            public Builder answerResult(String answerResult) {
                this.answerResult = answerResult;
                return this;
            }

            /**
             * AnswerSql.
             */
            public Builder answerSql(String answerSql) {
                this.answerSql = answerSql;
                return this;
            }

            /**
             * IsTrue.
             */
            public Builder isTrue(Boolean isTrue) {
                this.isTrue = isTrue;
                return this;
            }

            /**
             * Question.
             */
            public Builder question(String question) {
                this.question = question;
                return this;
            }

            /**
             * Reason.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * Recommendation.
             */
            public Builder recommendation(String recommendation) {
                this.recommendation = recommendation;
                return this;
            }

            /**
             * ResultId.
             */
            public Builder resultId(String resultId) {
                this.resultId = resultId;
                return this;
            }

            /**
             * SessionId.
             */
            public Builder sessionId(String sessionId) {
                this.sessionId = sessionId;
                return this;
            }

            /**
             * SubtaskId.
             */
            public Builder subtaskId(String subtaskId) {
                this.subtaskId = subtaskId;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDataAgentAccuracyTestResultsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataAgentAccuracyTestResultsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccuracyRate")
        private Double accuracyRate;

        @com.aliyun.core.annotation.NameInMap("AccuracyTestTaskId")
        private String accuracyTestTaskId;

        @com.aliyun.core.annotation.NameInMap("Content")
        private java.util.List<Content> content;

        @com.aliyun.core.annotation.NameInMap("CorrectCount")
        private Long correctCount;

        @com.aliyun.core.annotation.NameInMap("FailedCount")
        private String failedCount;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Long pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Long pageSize;

        @com.aliyun.core.annotation.NameInMap("PendingCount")
        private String pendingCount;

        @com.aliyun.core.annotation.NameInMap("TotalElements")
        private Integer totalElements;

        @com.aliyun.core.annotation.NameInMap("TotalPages")
        private Integer totalPages;

        private Data(Builder builder) {
            this.accuracyRate = builder.accuracyRate;
            this.accuracyTestTaskId = builder.accuracyTestTaskId;
            this.content = builder.content;
            this.correctCount = builder.correctCount;
            this.failedCount = builder.failedCount;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.pendingCount = builder.pendingCount;
            this.totalElements = builder.totalElements;
            this.totalPages = builder.totalPages;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return accuracyRate
         */
        public Double getAccuracyRate() {
            return this.accuracyRate;
        }

        /**
         * @return accuracyTestTaskId
         */
        public String getAccuracyTestTaskId() {
            return this.accuracyTestTaskId;
        }

        /**
         * @return content
         */
        public java.util.List<Content> getContent() {
            return this.content;
        }

        /**
         * @return correctCount
         */
        public Long getCorrectCount() {
            return this.correctCount;
        }

        /**
         * @return failedCount
         */
        public String getFailedCount() {
            return this.failedCount;
        }

        /**
         * @return pageNumber
         */
        public Long getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Long getPageSize() {
            return this.pageSize;
        }

        /**
         * @return pendingCount
         */
        public String getPendingCount() {
            return this.pendingCount;
        }

        /**
         * @return totalElements
         */
        public Integer getTotalElements() {
            return this.totalElements;
        }

        /**
         * @return totalPages
         */
        public Integer getTotalPages() {
            return this.totalPages;
        }

        public static final class Builder {
            private Double accuracyRate; 
            private String accuracyTestTaskId; 
            private java.util.List<Content> content; 
            private Long correctCount; 
            private String failedCount; 
            private Long pageNumber; 
            private Long pageSize; 
            private String pendingCount; 
            private Integer totalElements; 
            private Integer totalPages; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.accuracyRate = model.accuracyRate;
                this.accuracyTestTaskId = model.accuracyTestTaskId;
                this.content = model.content;
                this.correctCount = model.correctCount;
                this.failedCount = model.failedCount;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.pendingCount = model.pendingCount;
                this.totalElements = model.totalElements;
                this.totalPages = model.totalPages;
            } 

            /**
             * AccuracyRate.
             */
            public Builder accuracyRate(Double accuracyRate) {
                this.accuracyRate = accuracyRate;
                return this;
            }

            /**
             * AccuracyTestTaskId.
             */
            public Builder accuracyTestTaskId(String accuracyTestTaskId) {
                this.accuracyTestTaskId = accuracyTestTaskId;
                return this;
            }

            /**
             * Content.
             */
            public Builder content(java.util.List<Content> content) {
                this.content = content;
                return this;
            }

            /**
             * CorrectCount.
             */
            public Builder correctCount(Long correctCount) {
                this.correctCount = correctCount;
                return this;
            }

            /**
             * FailedCount.
             */
            public Builder failedCount(String failedCount) {
                this.failedCount = failedCount;
                return this;
            }

            /**
             * PageNumber.
             */
            public Builder pageNumber(Long pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * PendingCount.
             */
            public Builder pendingCount(String pendingCount) {
                this.pendingCount = pendingCount;
                return this;
            }

            /**
             * TotalElements.
             */
            public Builder totalElements(Integer totalElements) {
                this.totalElements = totalElements;
                return this;
            }

            /**
             * TotalPages.
             */
            public Builder totalPages(Integer totalPages) {
                this.totalPages = totalPages;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
