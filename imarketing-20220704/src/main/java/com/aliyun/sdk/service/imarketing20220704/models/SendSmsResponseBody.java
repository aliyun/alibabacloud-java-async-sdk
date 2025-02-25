// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imarketing20220704.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SendSmsResponseBody} extends {@link TeaModel}
 *
 * <p>SendSmsResponseBody</p>
 */
public class SendSmsResponseBody extends TeaModel {
    @NameInMap("Data")
    private Boolean data;

    @NameInMap("ErrorCode")
    private Integer errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("HttpCode")
    private Integer httpCode;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private SendSmsResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.httpCode = builder.httpCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendSmsResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Boolean getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public Integer getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return httpCode
     */
    public Integer getHttpCode() {
        return this.httpCode;
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
        private Boolean data; 
        private Integer errorCode; 
        private String errorMessage; 
        private Integer httpCode; 
        private String requestId; 
        private Boolean success; 

        /**
         * Data.
         */
        public Builder data(Boolean data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(Integer errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * HttpCode.
         */
        public Builder httpCode(Integer httpCode) {
            this.httpCode = httpCode;
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

        public SendSmsResponseBody build() {
            return new SendSmsResponseBody(this);
        } 

    } 

}
