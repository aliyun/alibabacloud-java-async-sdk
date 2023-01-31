// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetConcurrentConversationQuotaResponseBody} extends {@link TeaModel}
 *
 * <p>GetConcurrentConversationQuotaResponseBody</p>
 */
public class GetConcurrentConversationQuotaResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("MaxConcurrent")
    private Integer maxConcurrent;

    @NameInMap("Message")
    private String message;

    @NameInMap("RemainingConcurrent")
    private Integer remainingConcurrent;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetConcurrentConversationQuotaResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.maxConcurrent = builder.maxConcurrent;
        this.message = builder.message;
        this.remainingConcurrent = builder.remainingConcurrent;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetConcurrentConversationQuotaResponseBody create() {
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
     * @return maxConcurrent
     */
    public Integer getMaxConcurrent() {
        return this.maxConcurrent;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return remainingConcurrent
     */
    public Integer getRemainingConcurrent() {
        return this.remainingConcurrent;
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
        private Integer maxConcurrent; 
        private String message; 
        private Integer remainingConcurrent; 
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
         * maxConcurrent
         */
        public Builder maxConcurrent(Integer maxConcurrent) {
            this.maxConcurrent = maxConcurrent;
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
         * RemainingConcurrent.
         */
        public Builder remainingConcurrent(Integer remainingConcurrent) {
            this.remainingConcurrent = remainingConcurrent;
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

        public GetConcurrentConversationQuotaResponseBody build() {
            return new GetConcurrentConversationQuotaResponseBody(this);
        } 

    } 

}
