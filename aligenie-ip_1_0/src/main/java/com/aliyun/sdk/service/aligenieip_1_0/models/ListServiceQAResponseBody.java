// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListServiceQAResponseBody} extends {@link TeaModel}
 *
 * <p>ListServiceQAResponseBody</p>
 */
public class ListServiceQAResponseBody extends TeaModel {
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

    private ListServiceQAResponseBody(Builder builder) {
        this.message = builder.message;
        this.page = builder.page;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.statusCode = builder.statusCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListServiceQAResponseBody create() {
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

        public ListServiceQAResponseBody build() {
            return new ListServiceQAResponseBody(this);
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
        @NameInMap("Active")
        private Boolean active;

        @NameInMap("Answer")
        private String answer;

        @NameInMap("GmtModified")
        private String gmtModified;

        @NameInMap("Question")
        private String question;

        @NameInMap("ServiceQAId")
        private Long serviceQAId;

        @NameInMap("Templates")
        private String templates;

        private Result(Builder builder) {
            this.active = builder.active;
            this.answer = builder.answer;
            this.gmtModified = builder.gmtModified;
            this.question = builder.question;
            this.serviceQAId = builder.serviceQAId;
            this.templates = builder.templates;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return active
         */
        public Boolean getActive() {
            return this.active;
        }

        /**
         * @return answer
         */
        public String getAnswer() {
            return this.answer;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return question
         */
        public String getQuestion() {
            return this.question;
        }

        /**
         * @return serviceQAId
         */
        public Long getServiceQAId() {
            return this.serviceQAId;
        }

        /**
         * @return templates
         */
        public String getTemplates() {
            return this.templates;
        }

        public static final class Builder {
            private Boolean active; 
            private String answer; 
            private String gmtModified; 
            private String question; 
            private Long serviceQAId; 
            private String templates; 

            /**
             * Active.
             */
            public Builder active(Boolean active) {
                this.active = active;
                return this;
            }

            /**
             * Answer.
             */
            public Builder answer(String answer) {
                this.answer = answer;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
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
             * ServiceQAId.
             */
            public Builder serviceQAId(Long serviceQAId) {
                this.serviceQAId = serviceQAId;
                return this;
            }

            /**
             * Templates.
             */
            public Builder templates(String templates) {
                this.templates = templates;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
