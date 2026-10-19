// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link UnassociateNetworkCidrBlockRequest} extends {@link RequestModel}
 *
 * <p>UnassociateNetworkCidrBlockRequest</p>
 */
public class UnassociateNetworkCidrBlockRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ipv6CidrBlock")
    private String ipv6CidrBlock;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String networkId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecondaryCidrBlock")
    private String secondaryCidrBlock;

    private UnassociateNetworkCidrBlockRequest(Builder builder) {
        super(builder);
        this.ipv6CidrBlock = builder.ipv6CidrBlock;
        this.networkId = builder.networkId;
        this.secondaryCidrBlock = builder.secondaryCidrBlock;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnassociateNetworkCidrBlockRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ipv6CidrBlock
     */
    public String getIpv6CidrBlock() {
        return this.ipv6CidrBlock;
    }

    /**
     * @return networkId
     */
    public String getNetworkId() {
        return this.networkId;
    }

    /**
     * @return secondaryCidrBlock
     */
    public String getSecondaryCidrBlock() {
        return this.secondaryCidrBlock;
    }

    public static final class Builder extends Request.Builder<UnassociateNetworkCidrBlockRequest, Builder> {
        private String ipv6CidrBlock; 
        private String networkId; 
        private String secondaryCidrBlock; 

        private Builder() {
            super();
        } 

        private Builder(UnassociateNetworkCidrBlockRequest request) {
            super(request);
            this.ipv6CidrBlock = request.ipv6CidrBlock;
            this.networkId = request.networkId;
            this.secondaryCidrBlock = request.secondaryCidrBlock;
        } 

        /**
         * <p>The secondary IPv6 CIDR block to delete.</p>
         * 
         * <strong>example:</strong>
         * <p>2408:XXXX:0:a600::/110</p>
         */
        public Builder ipv6CidrBlock(String ipv6CidrBlock) {
            this.putQueryParameter("Ipv6CidrBlock", ipv6CidrBlock);
            this.ipv6CidrBlock = ipv6CidrBlock;
            return this;
        }

        /**
         * <p>The network ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>n-257gqcdfvx6n****</p>
         */
        public Builder networkId(String networkId) {
            this.putQueryParameter("NetworkId", networkId);
            this.networkId = networkId;
            return this;
        }

        /**
         * <p>The secondary IPv4 CIDR block to delete.</p>
         * 
         * <strong>example:</strong>
         * <p>10.XX.XX.0/24</p>
         */
        public Builder secondaryCidrBlock(String secondaryCidrBlock) {
            this.putQueryParameter("SecondaryCidrBlock", secondaryCidrBlock);
            this.secondaryCidrBlock = secondaryCidrBlock;
            return this;
        }

        @Override
        public UnassociateNetworkCidrBlockRequest build() {
            return new UnassociateNetworkCidrBlockRequest(this);
        } 

    } 

}
