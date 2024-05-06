// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateIPv6TranslatorResponseBody} extends {@link TeaModel}
 *
 * <p>CreateIPv6TranslatorResponseBody</p>
 */
public class CreateIPv6TranslatorResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Ipv6TranslatorId")
    private String ipv6TranslatorId;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("OrderId")
    private Long orderId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Spec")
    private String spec;

    private CreateIPv6TranslatorResponseBody(Builder builder) {
        this.ipv6TranslatorId = builder.ipv6TranslatorId;
        this.name = builder.name;
        this.orderId = builder.orderId;
        this.requestId = builder.requestId;
        this.spec = builder.spec;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateIPv6TranslatorResponseBody create() {
        return builder().build();
    }

    /**
     * @return ipv6TranslatorId
     */
    public String getIpv6TranslatorId() {
        return this.ipv6TranslatorId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
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
     * @return spec
     */
    public String getSpec() {
        return this.spec;
    }

    public static final class Builder {
        private String ipv6TranslatorId; 
        private String name; 
        private Long orderId; 
        private String requestId; 
        private String spec; 

        /**
         * The ID of the IPv6 Translation Service instance.
         */
        public Builder ipv6TranslatorId(String ipv6TranslatorId) {
            this.ipv6TranslatorId = ipv6TranslatorId;
            return this;
        }

        /**
         * The name of the IPv6 Translation Service instance.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * The order ID.
         */
        public Builder orderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The specification of the IPv6 Translation Service instance.
         */
        public Builder spec(String spec) {
            this.spec = spec;
            return this;
        }

        public CreateIPv6TranslatorResponseBody build() {
            return new CreateIPv6TranslatorResponseBody(this);
        } 

    } 

}
