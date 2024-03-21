// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.trademark20190902.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOrderConfirmUrlResponseBody} extends {@link TeaModel}
 *
 * <p>GetOrderConfirmUrlResponseBody</p>
 */
public class GetOrderConfirmUrlResponseBody extends TeaModel {
    @NameInMap("ConfirmUrl")
    private String confirmUrl;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetOrderConfirmUrlResponseBody(Builder builder) {
        this.confirmUrl = builder.confirmUrl;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOrderConfirmUrlResponseBody create() {
        return builder().build();
    }

    /**
     * @return confirmUrl
     */
    public String getConfirmUrl() {
        return this.confirmUrl;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
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
        private String confirmUrl; 
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        /**
         * ConfirmUrl.
         */
        public Builder confirmUrl(String confirmUrl) {
            this.confirmUrl = confirmUrl;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
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

        public GetOrderConfirmUrlResponseBody build() {
            return new GetOrderConfirmUrlResponseBody(this);
        } 

    } 

}
