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
 * {@link AssociateNetworkCidrBlockRequest} extends {@link RequestModel}
 *
 * <p>AssociateNetworkCidrBlockRequest</p>
 */
public class AssociateNetworkCidrBlockRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpVersion")
    private String ipVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ipv6Isp")
    private String ipv6Isp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String networkId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecondaryCidrBlock")
    private String secondaryCidrBlock;

    private AssociateNetworkCidrBlockRequest(Builder builder) {
        super(builder);
        this.ipVersion = builder.ipVersion;
        this.ipv6Isp = builder.ipv6Isp;
        this.networkId = builder.networkId;
        this.secondaryCidrBlock = builder.secondaryCidrBlock;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AssociateNetworkCidrBlockRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ipVersion
     */
    public String getIpVersion() {
        return this.ipVersion;
    }

    /**
     * @return ipv6Isp
     */
    public String getIpv6Isp() {
        return this.ipv6Isp;
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

    public static final class Builder extends Request.Builder<AssociateNetworkCidrBlockRequest, Builder> {
        private String ipVersion; 
        private String ipv6Isp; 
        private String networkId; 
        private String secondaryCidrBlock; 

        private Builder() {
            super();
        } 

        private Builder(AssociateNetworkCidrBlockRequest request) {
            super(request);
            this.ipVersion = request.ipVersion;
            this.ipv6Isp = request.ipv6Isp;
            this.networkId = request.networkId;
            this.secondaryCidrBlock = request.secondaryCidrBlock;
        } 

        /**
         * <p>The IP address version. Valid values:</p>
         * <ul>
         * <li>IPV4: IPv4 address.</li>
         * <li>IPV6: IPv6 address.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>IPV6</p>
         */
        public Builder ipVersion(String ipVersion) {
            this.putQueryParameter("IpVersion", ipVersion);
            this.ipVersion = ipVersion;
            return this;
        }

        /**
         * <p>The ISP of the IPv6 CIDR block. Valid values:</p>
         * <ul>
         * <li>cmcc</li>
         * <li>unicom</li>
         * <li>telecom</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>telecom</p>
         */
        public Builder ipv6Isp(String ipv6Isp) {
            this.putQueryParameter("Ipv6Isp", ipv6Isp);
            this.ipv6Isp = ipv6Isp;
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
         * <p>The secondary IPv4 CIDR block to be added. The CIDR block must meet the following requirements:</p>
         * <ul>
         * <li>The CIDR block must be within the 10.0.0.0/8, 172.16.0.0/12, or 192.168.0.0/16 range.</li>
         * <li>The secondary CIDR block must not overlap with the primary CIDR block or existing secondary CIDR blocks of the network.</li>
         * </ul>
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
        public AssociateNetworkCidrBlockRequest build() {
            return new AssociateNetworkCidrBlockRequest(this);
        } 

    } 

}
