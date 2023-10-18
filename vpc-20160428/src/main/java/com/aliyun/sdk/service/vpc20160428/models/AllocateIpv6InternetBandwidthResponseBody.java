// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AllocateIpv6InternetBandwidthResponseBody} extends {@link TeaModel}
 *
 * <p>AllocateIpv6InternetBandwidthResponseBody</p>
 */
public class AllocateIpv6InternetBandwidthResponseBody extends TeaModel {
    @NameInMap("InternetBandwidthId")
    private String internetBandwidthId;

    @NameInMap("Ipv6AddressId")
    private String ipv6AddressId;

    @NameInMap("RequestId")
    private String requestId;

    private AllocateIpv6InternetBandwidthResponseBody(Builder builder) {
        this.internetBandwidthId = builder.internetBandwidthId;
        this.ipv6AddressId = builder.ipv6AddressId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AllocateIpv6InternetBandwidthResponseBody create() {
        return builder().build();
    }

    /**
     * @return internetBandwidthId
     */
    public String getInternetBandwidthId() {
        return this.internetBandwidthId;
    }

    /**
     * @return ipv6AddressId
     */
    public String getIpv6AddressId() {
        return this.ipv6AddressId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String internetBandwidthId; 
        private String ipv6AddressId; 
        private String requestId; 

        /**
         * The ID of the Internet bandwidth that you purchased for the IPv6 gateway.
         */
        public Builder internetBandwidthId(String internetBandwidthId) {
            this.internetBandwidthId = internetBandwidthId;
            return this;
        }

        /**
         * The ID of the IPv6 address.
         */
        public Builder ipv6AddressId(String ipv6AddressId) {
            this.ipv6AddressId = ipv6AddressId;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AllocateIpv6InternetBandwidthResponseBody build() {
            return new AllocateIpv6InternetBandwidthResponseBody(this);
        } 

    } 

}
