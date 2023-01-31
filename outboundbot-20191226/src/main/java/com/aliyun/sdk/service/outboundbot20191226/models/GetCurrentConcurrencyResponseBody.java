// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCurrentConcurrencyResponseBody} extends {@link TeaModel}
 *
 * <p>GetCurrentConcurrencyResponseBody</p>
 */
public class GetCurrentConcurrencyResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("CurrentConcurrency")
    private Integer currentConcurrency;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("InstanceId")
    private String instanceId;

    @NameInMap("MaxConcurrentConversation")
    private Integer maxConcurrentConversation;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetCurrentConcurrencyResponseBody(Builder builder) {
        this.code = builder.code;
        this.currentConcurrency = builder.currentConcurrency;
        this.httpStatusCode = builder.httpStatusCode;
        this.instanceId = builder.instanceId;
        this.maxConcurrentConversation = builder.maxConcurrentConversation;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCurrentConcurrencyResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return currentConcurrency
     */
    public Integer getCurrentConcurrency() {
        return this.currentConcurrency;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return maxConcurrentConversation
     */
    public Integer getMaxConcurrentConversation() {
        return this.maxConcurrentConversation;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Integer currentConcurrency; 
        private Integer httpStatusCode; 
        private String instanceId; 
        private Integer maxConcurrentConversation; 
        private String message; 
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
         * CurrentConcurrency.
         */
        public Builder currentConcurrency(Integer currentConcurrency) {
            this.currentConcurrency = currentConcurrency;
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
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * MaxConcurrentConversation.
         */
        public Builder maxConcurrentConversation(Integer maxConcurrentConversation) {
            this.maxConcurrentConversation = maxConcurrentConversation;
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

        public GetCurrentConcurrencyResponseBody build() {
            return new GetCurrentConcurrencyResponseBody(this);
        } 

    } 

}
