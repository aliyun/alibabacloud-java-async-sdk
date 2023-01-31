// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListOutboundCallNumbersResponseBody} extends {@link TeaModel}
 *
 * <p>ListOutboundCallNumbersResponseBody</p>
 */
public class ListOutboundCallNumbersResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("OutboundCallNumbers")
    private OutboundCallNumbers outboundCallNumbers;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private ListOutboundCallNumbersResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.outboundCallNumbers = builder.outboundCallNumbers;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOutboundCallNumbersResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return outboundCallNumbers
     */
    public OutboundCallNumbers getOutboundCallNumbers() {
        return this.outboundCallNumbers;
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
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private OutboundCallNumbers outboundCallNumbers; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * OutboundCallNumbers.
         */
        public Builder outboundCallNumbers(OutboundCallNumbers outboundCallNumbers) {
            this.outboundCallNumbers = outboundCallNumbers;
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

        public ListOutboundCallNumbersResponseBody build() {
            return new ListOutboundCallNumbersResponseBody(this);
        } 

    } 

    public static class List extends TeaModel {
        @NameInMap("Number")
        private String number;

        @NameInMap("OutboundCallNumberId")
        private String outboundCallNumberId;

        @NameInMap("RateLimitCount")
        private String rateLimitCount;

        @NameInMap("RateLimitPeriod")
        private String rateLimitPeriod;

        private List(Builder builder) {
            this.number = builder.number;
            this.outboundCallNumberId = builder.outboundCallNumberId;
            this.rateLimitCount = builder.rateLimitCount;
            this.rateLimitPeriod = builder.rateLimitPeriod;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return number
         */
        public String getNumber() {
            return this.number;
        }

        /**
         * @return outboundCallNumberId
         */
        public String getOutboundCallNumberId() {
            return this.outboundCallNumberId;
        }

        /**
         * @return rateLimitCount
         */
        public String getRateLimitCount() {
            return this.rateLimitCount;
        }

        /**
         * @return rateLimitPeriod
         */
        public String getRateLimitPeriod() {
            return this.rateLimitPeriod;
        }

        public static final class Builder {
            private String number; 
            private String outboundCallNumberId; 
            private String rateLimitCount; 
            private String rateLimitPeriod; 

            /**
             * Number.
             */
            public Builder number(String number) {
                this.number = number;
                return this;
            }

            /**
             * OutboundCallNumberId.
             */
            public Builder outboundCallNumberId(String outboundCallNumberId) {
                this.outboundCallNumberId = outboundCallNumberId;
                return this;
            }

            /**
             * RateLimitCount.
             */
            public Builder rateLimitCount(String rateLimitCount) {
                this.rateLimitCount = rateLimitCount;
                return this;
            }

            /**
             * RateLimitPeriod.
             */
            public Builder rateLimitPeriod(String rateLimitPeriod) {
                this.rateLimitPeriod = rateLimitPeriod;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    public static class OutboundCallNumbers extends TeaModel {
        @NameInMap("List")
        private java.util.List < List> list;

        @NameInMap("PageNumber")
        private Integer pageNumber;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalCount")
        private Integer totalCount;

        private OutboundCallNumbers(Builder builder) {
            this.list = builder.list;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OutboundCallNumbers create() {
            return builder().build();
        }

        /**
         * @return list
         */
        public java.util.List < List> getList() {
            return this.list;
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
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List < List> list; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * List.
             */
            public Builder list(java.util.List < List> list) {
                this.list = list;
                return this;
            }

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
             * TotalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public OutboundCallNumbers build() {
                return new OutboundCallNumbers(this);
            } 

        } 

    }
}
