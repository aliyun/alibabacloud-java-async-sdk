// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateWebSiteInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>CreateWebSiteInstanceResponseBody</p>
 */
public class CreateWebSiteInstanceResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("InstanceIds")
    private InstanceIds instanceIds;

    @NameInMap("Message")
    private String message;

    @NameInMap("OrderId")
    private String orderId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateWebSiteInstanceResponseBody(Builder builder) {
        this.code = builder.code;
        this.instanceIds = builder.instanceIds;
        this.message = builder.message;
        this.orderId = builder.orderId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateWebSiteInstanceResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return instanceIds
     */
    public InstanceIds getInstanceIds() {
        return this.instanceIds;
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
    public String getOrderId() {
        return this.orderId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private InstanceIds instanceIds; 
        private String message; 
        private String orderId; 
        private String requestId; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * InstanceIds.
         */
        public Builder instanceIds(InstanceIds instanceIds) {
            this.instanceIds = instanceIds;
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
         * OrderId.
         */
        public Builder orderId(String orderId) {
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

        public CreateWebSiteInstanceResponseBody build() {
            return new CreateWebSiteInstanceResponseBody(this);
        } 

    } 

    public static class InstanceIds extends TeaModel {
        @NameInMap("String")
        private java.util.List < String > string;

        private InstanceIds(Builder builder) {
            this.string = builder.string;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceIds create() {
            return builder().build();
        }

        /**
         * @return string
         */
        public java.util.List < String > getString() {
            return this.string;
        }

        public static final class Builder {
            private java.util.List < String > string; 

            /**
             * String.
             */
            public Builder string(java.util.List < String > string) {
                this.string = string;
                return this;
            }

            public InstanceIds build() {
                return new InstanceIds(this);
            } 

        } 

    }
}
