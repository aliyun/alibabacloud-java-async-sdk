// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddCustomQAV2ResponseBody} extends {@link TeaModel}
 *
 * <p>AddCustomQAV2ResponseBody</p>
 */
public class AddCustomQAV2ResponseBody extends TeaModel {
    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    @NameInMap("StatusCode")
    private Integer statusCode;

    private AddCustomQAV2ResponseBody(Builder builder) {
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.statusCode = builder.statusCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddCustomQAV2ResponseBody create() {
        return builder().build();
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

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    /**
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public static final class Builder {
        private String message; 
        private String requestId; 
        private Result result; 
        private Integer statusCode; 

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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
         * Result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * StatusCode.
         */
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        public AddCustomQAV2ResponseBody build() {
            return new AddCustomQAV2ResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("Answers")
        private String answers;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("HotelId")
        private String hotelId;

        @NameInMap("KeyWords")
        private String keyWords;

        @NameInMap("LastOperator")
        private String lastOperator;

        @NameInMap("MajorQuestion")
        private String majorQuestion;

        @NameInMap("QaId")
        private String qaId;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("SupplementaryQuestion")
        private String supplementaryQuestion;

        @NameInMap("UpdateTime")
        private String updateTime;

        private Result(Builder builder) {
            this.answers = builder.answers;
            this.createTime = builder.createTime;
            this.hotelId = builder.hotelId;
            this.keyWords = builder.keyWords;
            this.lastOperator = builder.lastOperator;
            this.majorQuestion = builder.majorQuestion;
            this.qaId = builder.qaId;
            this.status = builder.status;
            this.supplementaryQuestion = builder.supplementaryQuestion;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return answers
         */
        public String getAnswers() {
            return this.answers;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return hotelId
         */
        public String getHotelId() {
            return this.hotelId;
        }

        /**
         * @return keyWords
         */
        public String getKeyWords() {
            return this.keyWords;
        }

        /**
         * @return lastOperator
         */
        public String getLastOperator() {
            return this.lastOperator;
        }

        /**
         * @return majorQuestion
         */
        public String getMajorQuestion() {
            return this.majorQuestion;
        }

        /**
         * @return qaId
         */
        public String getQaId() {
            return this.qaId;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return supplementaryQuestion
         */
        public String getSupplementaryQuestion() {
            return this.supplementaryQuestion;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String answers; 
            private String createTime; 
            private String hotelId; 
            private String keyWords; 
            private String lastOperator; 
            private String majorQuestion; 
            private String qaId; 
            private Integer status; 
            private String supplementaryQuestion; 
            private String updateTime; 

            /**
             * Answers.
             */
            public Builder answers(String answers) {
                this.answers = answers;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * HotelId.
             */
            public Builder hotelId(String hotelId) {
                this.hotelId = hotelId;
                return this;
            }

            /**
             * KeyWords.
             */
            public Builder keyWords(String keyWords) {
                this.keyWords = keyWords;
                return this;
            }

            /**
             * LastOperator.
             */
            public Builder lastOperator(String lastOperator) {
                this.lastOperator = lastOperator;
                return this;
            }

            /**
             * MajorQuestion.
             */
            public Builder majorQuestion(String majorQuestion) {
                this.majorQuestion = majorQuestion;
                return this;
            }

            /**
             * qaID
             */
            public Builder qaId(String qaId) {
                this.qaId = qaId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * SupplementaryQuestion.
             */
            public Builder supplementaryQuestion(String supplementaryQuestion) {
                this.supplementaryQuestion = supplementaryQuestion;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
