// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.trademark20190902.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTrademarkApplicationResponseBody} extends {@link TeaModel}
 *
 * <p>CreateTrademarkApplicationResponseBody</p>
 */
public class CreateTrademarkApplicationResponseBody extends TeaModel {
    @NameInMap("Message")
    private String message;

    @NameInMap("OrderId")
    private Long orderId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private CreateTrademarkApplicationResponseBody(Builder builder) {
        this.message = builder.message;
        this.orderId = builder.orderId;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTrademarkApplicationResponseBody create() {
        return builder().build();
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return orderId
     */
    public Long getOrderId() {
        return this.orderId;
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
        private String message; 
        private Long orderId; 
        private String requestId; 
        private Boolean success; 

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * OrderId.
         */
        public Builder orderId(Long orderId) {
            this.orderId = orderId;
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

        public CreateTrademarkApplicationResponseBody build() {
            return new CreateTrademarkApplicationResponseBody(this);
        } 

    } 

}
