// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qweneduaisuite20261102.models;

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
 * {@link GetEduHomeworkCorrectionResultResponseBody} extends {@link TeaModel}
 *
 * <p>GetEduHomeworkCorrectionResultResponseBody</p>
 */
public class GetEduHomeworkCorrectionResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetEduHomeworkCorrectionResultResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEduHomeworkCorrectionResultResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetEduHomeworkCorrectionResultResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetEduHomeworkCorrectionResultResponseBody build() {
            return new GetEduHomeworkCorrectionResultResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetEduHomeworkCorrectionResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetEduHomeworkCorrectionResultResponseBody</p>
     */
    public static class AnswerPoints extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("x")
        private Long x;

        @com.aliyun.core.annotation.NameInMap("y")
        private Long y;

        private AnswerPoints(Builder builder) {
            this.x = builder.x;
            this.y = builder.y;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AnswerPoints create() {
            return builder().build();
        }

        /**
         * @return x
         */
        public Long getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public Long getY() {
            return this.y;
        }

        public static final class Builder {
            private Long x; 
            private Long y; 

            private Builder() {
            } 

            private Builder(AnswerPoints model) {
                this.x = model.x;
                this.y = model.y;
            } 

            /**
             * x.
             */
            public Builder x(Long x) {
                this.x = x;
                return this;
            }

            /**
             * y.
             */
            public Builder y(Long y) {
                this.y = y;
                return this;
            }

            public AnswerPoints build() {
                return new AnswerPoints(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetEduHomeworkCorrectionResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetEduHomeworkCorrectionResultResponseBody</p>
     */
    public static class CheckPoint extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("x")
        private Long x;

        @com.aliyun.core.annotation.NameInMap("y")
        private Long y;

        private CheckPoint(Builder builder) {
            this.x = builder.x;
            this.y = builder.y;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CheckPoint create() {
            return builder().build();
        }

        /**
         * @return x
         */
        public Long getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public Long getY() {
            return this.y;
        }

        public static final class Builder {
            private Long x; 
            private Long y; 

            private Builder() {
            } 

            private Builder(CheckPoint model) {
                this.x = model.x;
                this.y = model.y;
            } 

            /**
             * x.
             */
            public Builder x(Long x) {
                this.x = x;
                return this;
            }

            /**
             * y.
             */
            public Builder y(Long y) {
                this.y = y;
                return this;
            }

            public CheckPoint build() {
                return new CheckPoint(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetEduHomeworkCorrectionResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetEduHomeworkCorrectionResultResponseBody</p>
     */
    public static class AnswerResults extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("answerPoints")
        private java.util.List<AnswerPoints> answerPoints;

        @com.aliyun.core.annotation.NameInMap("checkPoint")
        private CheckPoint checkPoint;

        @com.aliyun.core.annotation.NameInMap("checkResult")
        private String checkResult;

        @com.aliyun.core.annotation.NameInMap("standardAnswer")
        private String standardAnswer;

        @com.aliyun.core.annotation.NameInMap("userAnswer")
        private String userAnswer;

        private AnswerResults(Builder builder) {
            this.answerPoints = builder.answerPoints;
            this.checkPoint = builder.checkPoint;
            this.checkResult = builder.checkResult;
            this.standardAnswer = builder.standardAnswer;
            this.userAnswer = builder.userAnswer;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AnswerResults create() {
            return builder().build();
        }

        /**
         * @return answerPoints
         */
        public java.util.List<AnswerPoints> getAnswerPoints() {
            return this.answerPoints;
        }

        /**
         * @return checkPoint
         */
        public CheckPoint getCheckPoint() {
            return this.checkPoint;
        }

        /**
         * @return checkResult
         */
        public String getCheckResult() {
            return this.checkResult;
        }

        /**
         * @return standardAnswer
         */
        public String getStandardAnswer() {
            return this.standardAnswer;
        }

        /**
         * @return userAnswer
         */
        public String getUserAnswer() {
            return this.userAnswer;
        }

        public static final class Builder {
            private java.util.List<AnswerPoints> answerPoints; 
            private CheckPoint checkPoint; 
            private String checkResult; 
            private String standardAnswer; 
            private String userAnswer; 

            private Builder() {
            } 

            private Builder(AnswerResults model) {
                this.answerPoints = model.answerPoints;
                this.checkPoint = model.checkPoint;
                this.checkResult = model.checkResult;
                this.standardAnswer = model.standardAnswer;
                this.userAnswer = model.userAnswer;
            } 

            /**
             * answerPoints.
             */
            public Builder answerPoints(java.util.List<AnswerPoints> answerPoints) {
                this.answerPoints = answerPoints;
                return this;
            }

            /**
             * checkPoint.
             */
            public Builder checkPoint(CheckPoint checkPoint) {
                this.checkPoint = checkPoint;
                return this;
            }

            /**
             * checkResult.
             */
            public Builder checkResult(String checkResult) {
                this.checkResult = checkResult;
                return this;
            }

            /**
             * standardAnswer.
             */
            public Builder standardAnswer(String standardAnswer) {
                this.standardAnswer = standardAnswer;
                return this;
            }

            /**
             * userAnswer.
             */
            public Builder userAnswer(String userAnswer) {
                this.userAnswer = userAnswer;
                return this;
            }

            public AnswerResults build() {
                return new AnswerResults(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetEduHomeworkCorrectionResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetEduHomeworkCorrectionResultResponseBody</p>
     */
    public static class QuestionPoints extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("x")
        private Long x;

        @com.aliyun.core.annotation.NameInMap("y")
        private Long y;

        private QuestionPoints(Builder builder) {
            this.x = builder.x;
            this.y = builder.y;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QuestionPoints create() {
            return builder().build();
        }

        /**
         * @return x
         */
        public Long getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public Long getY() {
            return this.y;
        }

        public static final class Builder {
            private Long x; 
            private Long y; 

            private Builder() {
            } 

            private Builder(QuestionPoints model) {
                this.x = model.x;
                this.y = model.y;
            } 

            /**
             * x.
             */
            public Builder x(Long x) {
                this.x = x;
                return this;
            }

            /**
             * y.
             */
            public Builder y(Long y) {
                this.y = y;
                return this;
            }

            public QuestionPoints build() {
                return new QuestionPoints(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetEduHomeworkCorrectionResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetEduHomeworkCorrectionResultResponseBody</p>
     */
    public static class QuestionResults extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("answerResults")
        private java.util.List<AnswerResults> answerResults;

        @com.aliyun.core.annotation.NameInMap("finish")
        private Boolean finish;

        @com.aliyun.core.annotation.NameInMap("questionContent")
        private String questionContent;

        @com.aliyun.core.annotation.NameInMap("questionId")
        private String questionId;

        @com.aliyun.core.annotation.NameInMap("questionPoints")
        private java.util.List<java.util.List<QuestionPoints>> questionPoints;

        @com.aliyun.core.annotation.NameInMap("questionType")
        private String questionType;

        @com.aliyun.core.annotation.NameInMap("solution")
        private String solution;

        private QuestionResults(Builder builder) {
            this.answerResults = builder.answerResults;
            this.finish = builder.finish;
            this.questionContent = builder.questionContent;
            this.questionId = builder.questionId;
            this.questionPoints = builder.questionPoints;
            this.questionType = builder.questionType;
            this.solution = builder.solution;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QuestionResults create() {
            return builder().build();
        }

        /**
         * @return answerResults
         */
        public java.util.List<AnswerResults> getAnswerResults() {
            return this.answerResults;
        }

        /**
         * @return finish
         */
        public Boolean getFinish() {
            return this.finish;
        }

        /**
         * @return questionContent
         */
        public String getQuestionContent() {
            return this.questionContent;
        }

        /**
         * @return questionId
         */
        public String getQuestionId() {
            return this.questionId;
        }

        /**
         * @return questionPoints
         */
        public java.util.List<java.util.List<QuestionPoints>> getQuestionPoints() {
            return this.questionPoints;
        }

        /**
         * @return questionType
         */
        public String getQuestionType() {
            return this.questionType;
        }

        /**
         * @return solution
         */
        public String getSolution() {
            return this.solution;
        }

        public static final class Builder {
            private java.util.List<AnswerResults> answerResults; 
            private Boolean finish; 
            private String questionContent; 
            private String questionId; 
            private java.util.List<java.util.List<QuestionPoints>> questionPoints; 
            private String questionType; 
            private String solution; 

            private Builder() {
            } 

            private Builder(QuestionResults model) {
                this.answerResults = model.answerResults;
                this.finish = model.finish;
                this.questionContent = model.questionContent;
                this.questionId = model.questionId;
                this.questionPoints = model.questionPoints;
                this.questionType = model.questionType;
                this.solution = model.solution;
            } 

            /**
             * answerResults.
             */
            public Builder answerResults(java.util.List<AnswerResults> answerResults) {
                this.answerResults = answerResults;
                return this;
            }

            /**
             * finish.
             */
            public Builder finish(Boolean finish) {
                this.finish = finish;
                return this;
            }

            /**
             * questionContent.
             */
            public Builder questionContent(String questionContent) {
                this.questionContent = questionContent;
                return this;
            }

            /**
             * questionId.
             */
            public Builder questionId(String questionId) {
                this.questionId = questionId;
                return this;
            }

            /**
             * questionPoints.
             */
            public Builder questionPoints(java.util.List<java.util.List<QuestionPoints>> questionPoints) {
                this.questionPoints = questionPoints;
                return this;
            }

            /**
             * questionType.
             */
            public Builder questionType(String questionType) {
                this.questionType = questionType;
                return this;
            }

            /**
             * solution.
             */
            public Builder solution(String solution) {
                this.solution = solution;
                return this;
            }

            public QuestionResults build() {
                return new QuestionResults(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetEduHomeworkCorrectionResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetEduHomeworkCorrectionResultResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("angle")
        private Long angle;

        @com.aliyun.core.annotation.NameInMap("dewarpUrl")
        private String dewarpUrl;

        @com.aliyun.core.annotation.NameInMap("questionResults")
        private java.util.List<QuestionResults> questionResults;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("taskId")
        private String taskId;

        private Data(Builder builder) {
            this.angle = builder.angle;
            this.dewarpUrl = builder.dewarpUrl;
            this.questionResults = builder.questionResults;
            this.status = builder.status;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return angle
         */
        public Long getAngle() {
            return this.angle;
        }

        /**
         * @return dewarpUrl
         */
        public String getDewarpUrl() {
            return this.dewarpUrl;
        }

        /**
         * @return questionResults
         */
        public java.util.List<QuestionResults> getQuestionResults() {
            return this.questionResults;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private Long angle; 
            private String dewarpUrl; 
            private java.util.List<QuestionResults> questionResults; 
            private String status; 
            private String taskId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.angle = model.angle;
                this.dewarpUrl = model.dewarpUrl;
                this.questionResults = model.questionResults;
                this.status = model.status;
                this.taskId = model.taskId;
            } 

            /**
             * angle.
             */
            public Builder angle(Long angle) {
                this.angle = angle;
                return this;
            }

            /**
             * dewarpUrl.
             */
            public Builder dewarpUrl(String dewarpUrl) {
                this.dewarpUrl = dewarpUrl;
                return this;
            }

            /**
             * questionResults.
             */
            public Builder questionResults(java.util.List<QuestionResults> questionResults) {
                this.questionResults = questionResults;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * taskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
