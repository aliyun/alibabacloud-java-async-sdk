// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AllocateIpv6InternetBandwidthResponseBody} extends {@link TeaModel}
 *
 * <p>AllocateIpv6InternetBandwidthResponseBody</p>
 */
public class AllocateIpv6InternetBandwidthResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InternetBandwidthId")
    private String internetBandwidthId;

    @com.aliyun.core.annotation.NameInMap("Ipv6AddressId")
    private String ipv6AddressId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The ID of the Internet bandwidth that you purchased for the IPv6 gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>ipv6bw-uf6hcyzu65v98v3du****</p>
         */
        public Builder internetBandwidthId(String internetBandwidthId) {
            this.internetBandwidthId = internetBandwidthId;
            return this;
        }

        /**
         * <p>The ID of the IPv6 address.</p>
         * 
         * <strong>example:</strong>
         * <p>ipv6-2zen5j4axcp5l5qyy****</p>
         */
        public Builder ipv6AddressId(String ipv6AddressId) {
            this.ipv6AddressId = ipv6AddressId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6972A26E-99B1-4367-9890-FBDEBB0F5E7D</p>
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
