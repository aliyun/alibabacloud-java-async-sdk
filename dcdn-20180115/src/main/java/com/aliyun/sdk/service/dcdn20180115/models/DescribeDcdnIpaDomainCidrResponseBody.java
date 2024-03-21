// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDcdnIpaDomainCidrResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnIpaDomainCidrResponseBody</p>
 */
public class DescribeDcdnIpaDomainCidrResponseBody extends TeaModel {
    @NameInMap("Cidr")
    private java.util.List < String > cidr;

    @NameInMap("RequestId")
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
         * The back-to-origin IPv4 and IPv6 CIDR blocks.
         */
        public Builder cidr(java.util.List < String > cidr) {
            this.cidr = cidr;
            return this;
        }

        /**
         * The ID of the request.
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
