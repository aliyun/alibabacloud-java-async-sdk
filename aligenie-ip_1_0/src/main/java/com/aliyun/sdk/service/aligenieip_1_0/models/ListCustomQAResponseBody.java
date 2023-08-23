// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCustomQAResponseBody} extends {@link TeaModel}
 *
 * <p>ListCustomQAResponseBody</p>
 */
public class ListCustomQAResponseBody extends TeaModel {
    @NameInMap("Message")
    private String message;

    @NameInMap("Page")
    private Page page;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private java.util.List < Result> result;

    @NameInMap("StatusCode")
    private Integer statusCode;

    private ListCustomQAResponseBody(Builder builder) {
        this.message = builder.message;
        this.page = builder.page;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.statusCode = builder.statusCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCustomQAResponseBody create() {
        return builder().build();
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return page
     */
    public Page getPage() {
        return this.page;
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
    public java.util.List < Result> getResult() {
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
        private Page page; 
        private String requestId; 
        private java.util.List < Result> result; 
        private Integer statusCode; 

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Page.
         */
        public Builder page(Page page) {
            this.page = page;
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
        public Builder result(java.util.List < Result> result) {
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

        public ListCustomQAResponseBody build() {
            return new ListCustomQAResponseBody(this);
        } 

    } 

    public static class Page extends TeaModel {
        @NameInMap("PageNumber")
        private Integer pageNumber;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("Total")
        private Integer total;

        private Page(Builder builder) {
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Page create() {
            return builder().build();
        }

        /**
         * @return pageNumber
         */
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer total; 

            /**
             * PageNumber.
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * Total.
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public Page build() {
                return new Page(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @NameInMap("Answers")
        private String answers;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("CustomQAId")
        private String customQAId;

        @NameInMap("HotelId")
        private String hotelId;

        @NameInMap("KeyWords")
        private String keyWords;

        @NameInMap("MajorQuestion")
        private String majorQuestion;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("SupplementaryQuestion")
        private String supplementaryQuestion;

        @NameInMap("UpdateTime")
        private String updateTime;

        private Result(Builder builder) {
            this.answers = builder.answers;
            this.createTime = builder.createTime;
            this.customQAId = builder.customQAId;
            this.hotelId = builder.hotelId;
            this.keyWords = builder.keyWords;
            this.majorQuestion = builder.majorQuestion;
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
         * @return customQAId
         */
        public String getCustomQAId() {
            return this.customQAId;
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
         * @return majorQuestion
         */
        public String getMajorQuestion() {
            return this.majorQuestion;
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
            private String customQAId; 
            private String hotelId; 
            private String keyWords; 
            private String majorQuestion; 
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
             * CustomQAId.
             */
            public Builder customQAId(String customQAId) {
                this.customQAId = customQAId;
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
             * MajorQuestion.
             */
            public Builder majorQuestion(String majorQuestion) {
                this.majorQuestion = majorQuestion;
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
