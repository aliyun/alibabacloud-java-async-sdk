// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpcipam20230228.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(CreateIpamPoolAllocationResponseBody model) {
            this.cidr = model.cidr;
            this.ipamPoolAllocationId = model.ipamPoolAllocationId;
            this.requestId = model.requestId;
            this.sourceCidr = model.sourceCidr;
        } 

        /**
         * <p>The custom reserved CIDR block.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.1.0/24</p>
         */
        public Builder cidr(String cidr) {
            this.cidr = cidr;
            return this;
        }

        /**
         * <p>The ID of the custom reserved CIDR block.</p>
         * 
         * <strong>example:</strong>
         * <p>ipam-pool-alloc-112za33e4****</p>
         */
        public Builder ipamPoolAllocationId(String ipamPoolAllocationId) {
            this.ipamPoolAllocationId = ipamPoolAllocationId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CE9CDAE5-341E-5D0B-AC8A-2BAC707D3EB2</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The source CIDR block.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.0.0/16</p>
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
