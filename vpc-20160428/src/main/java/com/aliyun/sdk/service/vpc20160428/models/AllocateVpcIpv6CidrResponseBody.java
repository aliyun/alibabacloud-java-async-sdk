// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AllocateVpcIpv6CidrResponseBody} extends {@link TeaModel}
 *
 * <p>AllocateVpcIpv6CidrResponseBody</p>
 */
public class AllocateVpcIpv6CidrResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Ipv6CidrBlock")
    private String ipv6CidrBlock;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private AllocateVpcIpv6CidrResponseBody(Builder builder) {
        this.ipv6CidrBlock = builder.ipv6CidrBlock;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AllocateVpcIpv6CidrResponseBody create() {
        return builder().build();
    }

    /**
     * @return ipv6CidrBlock
     */
    public String getIpv6CidrBlock() {
        return this.ipv6CidrBlock;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String ipv6CidrBlock; 
        private String requestId; 

        /**
         * The IPv6 CIDR block that is reserved.
         */
        public Builder ipv6CidrBlock(String ipv6CidrBlock) {
            this.ipv6CidrBlock = ipv6CidrBlock;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AllocateVpcIpv6CidrResponseBody build() {
            return new AllocateVpcIpv6CidrResponseBody(this);
        } 

    } 

}
