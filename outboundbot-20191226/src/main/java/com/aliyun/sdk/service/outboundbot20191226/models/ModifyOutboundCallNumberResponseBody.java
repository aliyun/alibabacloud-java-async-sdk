// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyOutboundCallNumberResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyOutboundCallNumberResponseBody</p>
 */
public class ModifyOutboundCallNumberResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("OutboundCallNumber")
    private OutboundCallNumber outboundCallNumber;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private ModifyOutboundCallNumberResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.outboundCallNumber = builder.outboundCallNumber;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyOutboundCallNumberResponseBody create() {
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
     * @return outboundCallNumber
     */
    public OutboundCallNumber getOutboundCallNumber() {
        return this.outboundCallNumber;
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
        private OutboundCallNumber outboundCallNumber; 
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
         * OutboundCallNumber.
         */
        public Builder outboundCallNumber(OutboundCallNumber outboundCallNumber) {
            this.outboundCallNumber = outboundCallNumber;
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

        public ModifyOutboundCallNumberResponseBody build() {
            return new ModifyOutboundCallNumberResponseBody(this);
        } 

    } 

    public static class OutboundCallNumber extends TeaModel {
        @NameInMap("Number")
        private String number;

        @NameInMap("OutboundCallNumberId")
        private String outboundCallNumberId;

        @NameInMap("RateLimitCount")
        private String rateLimitCount;

        @NameInMap("RateLimitPeriod")
        private String rateLimitPeriod;

        private OutboundCallNumber(Builder builder) {
            this.number = builder.number;
            this.outboundCallNumberId = builder.outboundCallNumberId;
            this.rateLimitCount = builder.rateLimitCount;
            this.rateLimitPeriod = builder.rateLimitPeriod;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OutboundCallNumber create() {
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

            public OutboundCallNumber build() {
                return new OutboundCallNumber(this);
            } 

        } 

    }
}
