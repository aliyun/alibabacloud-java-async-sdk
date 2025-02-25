// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDcdnIpaDomainCidrResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnIpaDomainCidrResponseBody</p>
 */
public class DescribeDcdnIpaDomainCidrResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Cidr")
    private java.util.List < String > cidr;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDcdnIpaDomainCidrResponseBody(Builder builder) {
        this.cidr = builder.cidr;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnIpaDomainCidrResponseBody create() {
        return builder().build();
    }

    /**
     * @return cidr
     */
    public java.util.List < String > getCidr() {
        return this.cidr;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < String > cidr; 
        private String requestId; 

        /**
         * <p>The back-to-origin IPv4 and IPv6 CIDR blocks.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;1.1.1.0/24&quot;,&quot;2.2.2.0/24&quot;,&quot;1111:2222:3333:4444:5555:0:0:0/80&quot;]</p>
         */
        public Builder cidr(java.util.List < String > cidr) {
            this.cidr = cidr;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDcdnIpaDomainCidrResponseBody build() {
            return new DescribeDcdnIpaDomainCidrResponseBody(this);
        } 

    } 

}
