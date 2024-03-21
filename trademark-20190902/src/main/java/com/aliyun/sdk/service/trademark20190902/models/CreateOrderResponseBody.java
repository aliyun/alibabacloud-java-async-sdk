// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.trademark20190902.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateOrderResponseBody} extends {@link TeaModel}
 *
 * <p>CreateOrderResponseBody</p>
 */
public class CreateOrderResponseBody extends TeaModel {
    @NameInMap("Message")
    private String message;

    @NameInMap("OrderIds")
    private java.util.Map < String, ? > orderIds;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private CreateOrderResponseBody(Builder builder) {
        this.message = builder.message;
        this.orderIds = builder.orderIds;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOrderResponseBody create() {
        return builder().build();
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return orderIds
     */
    public java.util.Map < String, ? > getOrderIds() {
        return this.orderIds;
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
        private java.util.Map < String, ? > orderIds; 
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
         * OrderIds.
         */
        public Builder orderIds(java.util.Map < String, ? > orderIds) {
            this.orderIds = orderIds;
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

        public CreateOrderResponseBody build() {
            return new CreateOrderResponseBody(this);
        } 

    } 

}
