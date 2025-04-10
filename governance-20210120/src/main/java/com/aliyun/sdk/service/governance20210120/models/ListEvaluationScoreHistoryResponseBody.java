// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.governance20210120.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ListEvaluationScoreHistoryResponseBody model) {
            this.requestId = model.requestId;
            this.scoreHistory = model.scoreHistory;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>AC9BD94C-D20C-4D27-88D4-89E8D75C051B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The historical scores.</p>
         */
        public Builder scoreHistory(ScoreHistory scoreHistory) {
            this.scoreHistory = scoreHistory;
            return this;
        }

        public ListEvaluationScoreHistoryResponseBody build() {
            return new ListEvaluationScoreHistoryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListEvaluationScoreHistoryResponseBody} extends {@link TeaModel}
     *
     * <p>ListEvaluationScoreHistoryResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(TotalScoreHistory model) {
                this.evaluationTime = model.evaluationTime;
                this.score = model.score;
            } 

            /**
             * <p>The time when the score was generated. The time is in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-06-30T03:34:02Z</p>
             */
            public Builder evaluationTime(String evaluationTime) {
                this.evaluationTime = evaluationTime;
                return this;
            }

            /**
             * <p>The score.</p>
             * <p>Valid values: 0 to 1.</p>
             * 
             * <strong>example:</strong>
             * <p>0.6753</p>
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
    /**
     * 
     * {@link ListEvaluationScoreHistoryResponseBody} extends {@link TeaModel}
     *
     * <p>ListEvaluationScoreHistoryResponseBody</p>
     */
    public static class ScoreHistory extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TotalScoreHistory")
        private java.util.List<TotalScoreHistory> totalScoreHistory;

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
        public java.util.List<TotalScoreHistory> getTotalScoreHistory() {
            return this.totalScoreHistory;
        }

        public static final class Builder {
            private java.util.List<TotalScoreHistory> totalScoreHistory; 

            private Builder() {
            } 

            private Builder(ScoreHistory model) {
                this.totalScoreHistory = model.totalScoreHistory;
            } 

            /**
             * <p>The historical scores.</p>
             */
            public Builder totalScoreHistory(java.util.List<TotalScoreHistory> totalScoreHistory) {
                this.totalScoreHistory = totalScoreHistory;
                return this;
            }

            public ScoreHistory build() {
                return new ScoreHistory(this);
            } 

        } 

    }
}
