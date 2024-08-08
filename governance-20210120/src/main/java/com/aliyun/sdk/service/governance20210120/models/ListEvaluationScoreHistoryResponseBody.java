// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.governance20210120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListEvaluationScoreHistoryResponseBody} extends {@link TeaModel}
 *
 * <p>ListEvaluationScoreHistoryResponseBody</p>
 */
public class ListEvaluationScoreHistoryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ScoreHistory")
    private ScoreHistory scoreHistory;

    private ListEvaluationScoreHistoryResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.scoreHistory = builder.scoreHistory;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEvaluationScoreHistoryResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return scoreHistory
     */
    public ScoreHistory getScoreHistory() {
        return this.scoreHistory;
    }

    public static final class Builder {
        private String requestId; 
        private ScoreHistory scoreHistory; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ScoreHistory.
         */
        public Builder scoreHistory(ScoreHistory scoreHistory) {
            this.scoreHistory = scoreHistory;
            return this;
        }

        public ListEvaluationScoreHistoryResponseBody build() {
            return new ListEvaluationScoreHistoryResponseBody(this);
        } 

    } 

    public static class TotalScoreHistory extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EvaluationTime")
        private String evaluationTime;

        @com.aliyun.core.annotation.NameInMap("Score")
        private Double score;

        private TotalScoreHistory(Builder builder) {
            this.evaluationTime = builder.evaluationTime;
            this.score = builder.score;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TotalScoreHistory create() {
            return builder().build();
        }

        /**
         * @return evaluationTime
         */
        public String getEvaluationTime() {
            return this.evaluationTime;
        }

        /**
         * @return score
         */
        public Double getScore() {
            return this.score;
        }

        public static final class Builder {
            private String evaluationTime; 
            private Double score; 

            /**
             * EvaluationTime.
             */
            public Builder evaluationTime(String evaluationTime) {
                this.evaluationTime = evaluationTime;
                return this;
            }

            /**
             * Score.
             */
            public Builder score(Double score) {
                this.score = score;
                return this;
            }

            public TotalScoreHistory build() {
                return new TotalScoreHistory(this);
            } 

        } 

    }
    public static class ScoreHistory extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TotalScoreHistory")
        private java.util.List < TotalScoreHistory> totalScoreHistory;

        private ScoreHistory(Builder builder) {
            this.totalScoreHistory = builder.totalScoreHistory;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScoreHistory create() {
            return builder().build();
        }

        /**
         * @return totalScoreHistory
         */
        public java.util.List < TotalScoreHistory> getTotalScoreHistory() {
            return this.totalScoreHistory;
        }

        public static final class Builder {
            private java.util.List < TotalScoreHistory> totalScoreHistory; 

            /**
             * TotalScoreHistory.
             */
            public Builder totalScoreHistory(java.util.List < TotalScoreHistory> totalScoreHistory) {
                this.totalScoreHistory = totalScoreHistory;
                return this;
            }

            public ScoreHistory build() {
                return new ScoreHistory(this);
            } 

        } 

    }
}
