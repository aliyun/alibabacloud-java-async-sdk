// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

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
 * {@link ModifyOutboundCallNumberResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyOutboundCallNumberResponseBody</p>
 */
public class ModifyOutboundCallNumberResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("OutboundCallNumber")
    private OutboundCallNumber outboundCallNumber;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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

        private Builder() {
        } 

        private Builder(ModifyOutboundCallNumberResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.outboundCallNumber = model.outboundCallNumber;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The API status code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The response message.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The number information.</p>
         */
        public Builder outboundCallNumber(OutboundCallNumber outboundCallNumber) {
            this.outboundCallNumber = outboundCallNumber;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ModifyOutboundCallNumberResponseBody build() {
            return new ModifyOutboundCallNumberResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ModifyOutboundCallNumberResponseBody} extends {@link TeaModel}
     *
     * <p>ModifyOutboundCallNumberResponseBody</p>
     */
    public static class OutboundCallNumber extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Number")
        private String number;

        @com.aliyun.core.annotation.NameInMap("OutboundCallNumberId")
        private String outboundCallNumberId;

        @com.aliyun.core.annotation.NameInMap("RateLimitCount")
        private String rateLimitCount;

        @com.aliyun.core.annotation.NameInMap("RateLimitPeriod")
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

            private Builder() {
            } 

            private Builder(OutboundCallNumber model) {
                this.number = model.number;
                this.outboundCallNumberId = model.outboundCallNumberId;
                this.rateLimitCount = model.rateLimitCount;
                this.rateLimitPeriod = model.rateLimitPeriod;
            } 

            /**
             * <p>The outbound call number.</p>
             * 
             * <strong>example:</strong>
             * <p>10088xxxx</p>
             */
            public Builder number(String number) {
                this.number = number;
                return this;
            }

            /**
             * <p>The number ID.</p>
             * 
             * <strong>example:</strong>
             * <p>fa0e21e9-caab-4629-9121-1e341243d599</p>
             */
            public Builder outboundCallNumberId(String outboundCallNumberId) {
                this.outboundCallNumberId = outboundCallNumberId;
                return this;
            }

            /**
             * <p>The rate limit cycle.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder rateLimitCount(String rateLimitCount) {
                this.rateLimitCount = rateLimitCount;
                return this;
            }

            /**
             * <p>The rate limit count.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
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
