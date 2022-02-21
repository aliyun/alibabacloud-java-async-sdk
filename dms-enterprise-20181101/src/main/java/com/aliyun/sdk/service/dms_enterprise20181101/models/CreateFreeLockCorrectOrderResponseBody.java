// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateFreeLockCorrectOrderResponseBody} extends {@link TeaModel}
 *
 * <p>CreateFreeLockCorrectOrderResponseBody</p>
 */
public class CreateFreeLockCorrectOrderResponseBody extends TeaModel {
    @NameInMap("CreateOrderResult")
    private java.util.List < Long > createOrderResult;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private CreateFreeLockCorrectOrderResponseBody(Builder builder) {
        this.createOrderResult = builder.createOrderResult;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFreeLockCorrectOrderResponseBody create() {
        return builder().build();
    }

    /**
     * @return createOrderResult
     */
    public java.util.List < Long > getCreateOrderResult() {
        return this.createOrderResult;
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
        private java.util.List < Long > createOrderResult; 
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        /**
         * CreateOrderResult.
         */
        public Builder createOrderResult(java.util.List < Long > createOrderResult) {
            this.createOrderResult = createOrderResult;
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
         * Id of the request
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

        public CreateFreeLockCorrectOrderResponseBody build() {
            return new CreateFreeLockCorrectOrderResponseBody(this);
        } 

    } 

}
