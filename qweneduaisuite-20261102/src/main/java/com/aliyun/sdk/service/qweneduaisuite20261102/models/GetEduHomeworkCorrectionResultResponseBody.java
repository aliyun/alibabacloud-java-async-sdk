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
         * <p>The API status.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The business data. This field is usually empty when the task fails.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;request_id&quot;: &quot;req-20261116-0001&quot;,
         *   &quot;code&quot;: &quot;SUCCESS&quot;,
         *   &quot;message&quot;: &quot;success&quot;,
         *   &quot;data&quot;: {
         *     &quot;task_id&quot;: &quot;task-20261116-abc123&quot;,
         *     &quot;status&quot;: &quot;finished&quot;,
         *     &quot;course&quot;: &quot;math&quot;,
         *     &quot;dewarp_url&quot;: &quot;<a href="https://example.com/dewarp.jpg">https://example.com/dewarp.jpg</a>&quot;,
         *     &quot;angle&quot;: 0,
         *     &quot;render_url&quot;: &quot;<a href="https://example.com/render.jpg">https://example.com/render.jpg</a>&quot;,
         *     &quot;question_results&quot;: [
         *       {
         *         &quot;question_id&quot;: &quot;q-001&quot;,
         *         &quot;question_type&quot;: &quot;choice&quot;,
         *         &quot;question_content&quot;: &quot;1 + 1 = ?&quot;,
         *         &quot;question_points&quot;: [
         *           [
         *             {&quot;x&quot;: 100, &quot;y&quot;: 100},
         *             {&quot;x&quot;: 200, &quot;y&quot;: 100},
         *             {&quot;x&quot;: 200, &quot;y&quot;: 150},
         *             {&quot;x&quot;: 100, &quot;y&quot;: 150}
         *           ]
         *         ],
         *         &quot;finish&quot;: true,
         *         &quot;answer_results&quot;: [
         *           {
         *             &quot;check_result&quot;: &quot;correct&quot;,
         *             &quot;check_point&quot;: {&quot;x&quot;: 150, &quot;y&quot;: 125},
         *             &quot;answer_points&quot;: [
         *               {&quot;x&quot;: 120, &quot;y&quot;: 120},
         *               {&quot;x&quot;: 180, &quot;y&quot;: 120},
         *               {&quot;x&quot;: 180, &quot;y&quot;: 130},
         *               {&quot;x&quot;: 120, &quot;y&quot;: 130}
         *             ],
         *             &quot;user_answer&quot;: &quot;2&quot;,
         *             &quot;standard_answer&quot;: &quot;2&quot;
         *           }
         *         ],
         *         &quot;solution&quot;: &quot;1 + 1 = 2&quot;
         *       }
         *     ],
         *     &quot;usage&quot;: {
         *       &quot;prompt_tokens&quot;: 1000,
         *       &quot;completion_tokens&quot;: 200,
         *       &quot;total_tokens&quot;: 1200
         *     }
         *   }
         * }</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request error message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID, which can be used for troubleshooting.</p>
         * 
         * <strong>example:</strong>
         * <p>req-20261116-0001</p>
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
             * <p>The X-axis coordinate value.</p>
             * 
             * <strong>example:</strong>
             * <p>120</p>
             */
            public Builder x(Long x) {
                this.x = x;
                return this;
            }

            /**
             * <p>The Y-axis coordinate value.</p>
             * 
             * <strong>example:</strong>
             * <p>980</p>
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
             * <p>The X-axis coordinate value.</p>
             * 
             * <strong>example:</strong>
             * <p>120</p>
             */
            public Builder x(Long x) {
                this.x = x;
                return this;
            }

            /**
             * <p>The Y-axis coordinate value.</p>
             * 
             * <strong>example:</strong>
             * <p>980</p>
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
             * <p>The coordinate group of the user\&quot;s answering area. It generally contains four vertex coordinate values, arranged in the order of top-left, top-right, bottom-right, and bottom-left, such as <code>[{&quot;x&quot;: ..., &quot;y&quot;: ...}, ...]</code>.</p>
             */
            public Builder answerPoints(java.util.List<AnswerPoints> answerPoints) {
                this.answerPoints = answerPoints;
                return this;
            }

            /**
             * <p>The coordinates of the grading mark point, such as <code>{ &quot;x&quot;: ..., &quot;y&quot;: ... }</code>.</p>
             */
            public Builder checkPoint(CheckPoint checkPoint) {
                this.checkPoint = checkPoint;
                return this;
            }

            /**
             * <p>The grading conclusion, such as <code>correct</code>, <code>wrong</code>, or <code>partial</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>correct</p>
             */
            public Builder checkResult(String checkResult) {
                this.checkResult = checkResult;
                return this;
            }

            /**
             * <p>The ground truth.</p>
             * 
             * <strong>example:</strong>
             * <p>120</p>
             */
            public Builder standardAnswer(String standardAnswer) {
                this.standardAnswer = standardAnswer;
                return this;
            }

            /**
             * <p>The student\&quot;s answer.</p>
             * 
             * <strong>example:</strong>
             * <p>980</p>
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
             * <p>The X-axis coordinate value.</p>
             * 
             * <strong>example:</strong>
             * <p>120</p>
             */
            public Builder x(Long x) {
                this.x = x;
                return this;
            }

            /**
             * <p>The Y-axis coordinate value.</p>
             * 
             * <strong>example:</strong>
             * <p>980</p>
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
             * <p>The array of answering and grading results for the question. For more information, see the following table.</p>
             */
            public Builder answerResults(java.util.List<AnswerResults> answerResults) {
                this.answerResults = answerResults;
                return this;
            }

            /**
             * <p>Indicates whether the task is finished:</p>
             * <ul>
             * <li><strong>true</strong>: The task is finished.</li>
             * <li><strong>false</strong>: The task is not finished.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder finish(Boolean finish) {
                this.finish = finish;
                return this;
            }

            /**
             * <p>The text content of the question.</p>
             * 
             * <strong>example:</strong>
             * <p>1 + 1 = ?</p>
             */
            public Builder questionContent(String questionContent) {
                this.questionContent = questionContent;
                return this;
            }

            /**
             * <p>The question ID.</p>
             * 
             * <strong>example:</strong>
             * <p>q-001</p>
             */
            public Builder questionId(String questionId) {
                this.questionId = questionId;
                return this;
            }

            /**
             * <p>The coordinate group of the question area. It generally contains four vertex coordinate values, arranged in the order of top-left, top-right, bottom-right, and bottom-left.</p>
             * 
             * <strong>example:</strong>
             * <p><code>[[{&quot;x&quot;: 120, &quot;y&quot;: 980}, ...]]</code></p>
             */
            public Builder questionPoints(java.util.List<java.util.List<QuestionPoints>> questionPoints) {
                this.questionPoints = questionPoints;
                return this;
            }

            /**
             * <p>The question type.</p>
             * 
             * <strong>example:</strong>
             * <p>Multiple-choice question, applied subjective question, problem-solving question, calculation question, etc</p>
             */
            public Builder questionType(String questionType) {
                this.questionType = questionType;
                return this;
            }

            /**
             * <p>The question analysis or solution.</p>
             * 
             * <strong>example:</strong>
             * <p>Question analysis or solution</p>
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
             * <p>The rotation angle of the image in the clockwise direction, in degrees.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder angle(Long angle) {
                this.angle = angle;
                return this;
            }

            /**
             * <p>The URL of the dewarped image. If dewarp is set to false, the URL of the original image is returned.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/dewarp.jpg">https://example.com/dewarp.jpg</a></p>
             */
            public Builder dewarpUrl(String dewarpUrl) {
                this.dewarpUrl = dewarpUrl;
                return this;
            }

            /**
             * <p>The array of question recognition and grading results. For more information, see the following table.</p>
             */
            public Builder questionResults(java.util.List<QuestionResults> questionResults) {
                this.questionResults = questionResults;
                return this;
            }

            /**
             * <p>The task status.</p>
             * 
             * <strong>example:</strong>
             * <p>submitted, processing, finished, or failed</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The unique identifier of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>task-20261116-abc123</p>
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
