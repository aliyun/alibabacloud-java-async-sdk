// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

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
 * {@link AddCustomQAV2ResponseBody} extends {@link TeaModel}
 *
 * <p>AddCustomQAV2ResponseBody</p>
 */
public class AddCustomQAV2ResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    @com.aliyun.core.annotation.NameInMap("StatusCode")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(AddCustomQAV2ResponseBody model) {
            this.message = model.message;
            this.requestId = model.requestId;
            this.result = model.result;
            this.statusCode = model.statusCode;
        } 

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

    /**
     * 
     * {@link AddCustomQAV2ResponseBody} extends {@link TeaModel}
     *
     * <p>AddCustomQAV2ResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Answers")
        private String answers;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("HotelId")
        private String hotelId;

        @com.aliyun.core.annotation.NameInMap("KeyWords")
        private String keyWords;

        @com.aliyun.core.annotation.NameInMap("LastOperator")
        private String lastOperator;

        @com.aliyun.core.annotation.NameInMap("MajorQuestion")
        private String majorQuestion;

        @com.aliyun.core.annotation.NameInMap("QaId")
        private String qaId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("SupplementaryQuestion")
        private String supplementaryQuestion;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
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

            private Builder() {
            } 

            private Builder(Result model) {
                this.answers = model.answers;
                this.createTime = model.createTime;
                this.hotelId = model.hotelId;
                this.keyWords = model.keyWords;
                this.lastOperator = model.lastOperator;
                this.majorQuestion = model.majorQuestion;
                this.qaId = model.qaId;
                this.status = model.status;
                this.supplementaryQuestion = model.supplementaryQuestion;
                this.updateTime = model.updateTime;
            } 

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
             * <p>qaID</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
