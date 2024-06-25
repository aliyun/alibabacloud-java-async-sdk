// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpcipam20230228.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateIpamPoolAllocationResponseBody} extends {@link TeaModel}
 *
 * <p>CreateIpamPoolAllocationResponseBody</p>
 */
public class CreateIpamPoolAllocationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Cidr")
    private String cidr;

    @com.aliyun.core.annotation.NameInMap("IpamPoolAllocationId")
    private String ipamPoolAllocationId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SourceCidr")
    private String sourceCidr;

    private CreateIpamPoolAllocationResponseBody(Builder builder) {
        this.cidr = builder.cidr;
        this.ipamPoolAllocationId = builder.ipamPoolAllocationId;
        this.requestId = builder.requestId;
        this.sourceCidr = builder.sourceCidr;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateIpamPoolAllocationResponseBody create() {
        return builder().build();
    }

    /**
     * @return cidr
     */
    public String getCidr() {
        return this.cidr;
    }

    /**
     * @return ipamPoolAllocationId
     */
    public String getIpamPoolAllocationId() {
        return this.ipamPoolAllocationId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sourceCidr
     */
    public String getSourceCidr() {
        return this.sourceCidr;
    }

    public static final class Builder {
        private String cidr; 
        private String ipamPoolAllocationId; 
        private String requestId; 
        private String sourceCidr; 

        /**
         * Cidr.
         */
        public Builder cidr(String cidr) {
            this.cidr = cidr;
            return this;
        }

        /**
         * IpamPoolAllocationId.
         */
        public Builder ipamPoolAllocationId(String ipamPoolAllocationId) {
            this.ipamPoolAllocationId = ipamPoolAllocationId;
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
         * SourceCidr.
         */
        public Builder sourceCidr(String sourceCidr) {
            this.sourceCidr = sourceCidr;
            return this;
        }

        public CreateIpamPoolAllocationResponseBody build() {
            return new CreateIpamPoolAllocationResponseBody(this);
        } 

    } 

}
