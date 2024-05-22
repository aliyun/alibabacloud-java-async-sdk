// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSnatEntryRequest} extends {@link RequestModel}
 *
 * <p>CreateSnatEntryRequest</p>
 */
public class CreateSnatEntryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NatGatewayId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String natGatewayId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SnatEntryName")
    private String snatEntryName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SnatIp")
    @com.aliyun.core.annotation.Validation(required = true)
    private String snatIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceCIDR")
    private String sourceCIDR;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceNetworkId")
    private String sourceNetworkId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceVSwitchId")
    private String sourceVSwitchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StandbySnatIp")
    private String standbySnatIp;

    private CreateSnatEntryRequest(Builder builder) {
        super(builder);
        this.natGatewayId = builder.natGatewayId;
        this.snatEntryName = builder.snatEntryName;
        this.snatIp = builder.snatIp;
        this.sourceCIDR = builder.sourceCIDR;
        this.sourceNetworkId = builder.sourceNetworkId;
        this.sourceVSwitchId = builder.sourceVSwitchId;
        this.standbySnatIp = builder.standbySnatIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSnatEntryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return natGatewayId
     */
    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    /**
     * @return snatEntryName
     */
    public String getSnatEntryName() {
        return this.snatEntryName;
    }

    /**
     * @return snatIp
     */
    public String getSnatIp() {
        return this.snatIp;
    }

    /**
     * @return sourceCIDR
     */
    public String getSourceCIDR() {
        return this.sourceCIDR;
    }

    /**
     * @return sourceNetworkId
     */
    public String getSourceNetworkId() {
        return this.sourceNetworkId;
    }

    /**
     * @return sourceVSwitchId
     */
    public String getSourceVSwitchId() {
        return this.sourceVSwitchId;
    }

    /**
     * @return standbySnatIp
     */
    public String getStandbySnatIp() {
        return this.standbySnatIp;
    }

    public static final class Builder extends Request.Builder<CreateSnatEntryRequest, Builder> {
        private String natGatewayId; 
        private String snatEntryName; 
        private String snatIp; 
        private String sourceCIDR; 
        private String sourceNetworkId; 
        private String sourceVSwitchId; 
        private String standbySnatIp; 

        private Builder() {
            super();
        } 

        private Builder(CreateSnatEntryRequest request) {
            super(request);
            this.natGatewayId = request.natGatewayId;
            this.snatEntryName = request.snatEntryName;
            this.snatIp = request.snatIp;
            this.sourceCIDR = request.sourceCIDR;
            this.sourceNetworkId = request.sourceNetworkId;
            this.sourceVSwitchId = request.sourceVSwitchId;
            this.standbySnatIp = request.standbySnatIp;
        } 

        /**
         * The ID of the Network Address Translation (NAT) gateway.
         */
        public Builder natGatewayId(String natGatewayId) {
            this.putQueryParameter("NatGatewayId", natGatewayId);
            this.natGatewayId = natGatewayId;
            return this;
        }

        /**
         * The name of the SNAT entry. The name must be 1 to 128 characters in length. The name cannot start with `http://` or `https://`.
         */
        public Builder snatEntryName(String snatEntryName) {
            this.putQueryParameter("SnatEntryName", snatEntryName);
            this.snatEntryName = snatEntryName;
            return this;
        }

        /**
         * The elastic IP address (EIP) in the SNAT entry. Separate multiple EIPs with commas (,).
         */
        public Builder snatIp(String snatIp) {
            this.putQueryParameter("SnatIp", snatIp);
            this.snatIp = snatIp;
            return this;
        }

        /**
         * The CIDR block. You can specify the CIDR block of a network, a vSwitch, or an instance. You can also specify a custom CIDR block. All instances within the CIDR block can access the Internet or external networks by using SNAT.
         * <p>
         * 
         * >  If you specify **SourceVSwitchId** and **SourceCIDR**, **SourceVSwitchId** does not take effect. The value that you specified for **SourceCIDR** takes precedence.
         */
        public Builder sourceCIDR(String sourceCIDR) {
            this.putQueryParameter("SourceCIDR", sourceCIDR);
            this.sourceCIDR = sourceCIDR;
            return this;
        }

        /**
         * The ID of the network. This parameter specifies that all ENS instances in the network can use the SNAT entry to access the Internet.
         * <p>
         * 
         * >  If you specify **SourceNetworkId** and **SourceVSwitchId** or **SourceCIDR**, **SourceNetworkId** does not take effect. The value that you specified for **SourceCIDR** takes precedence. Priority: **SourceCIDR** > **SourceVSwitchId** > **SourceNetworkId**.
         */
        public Builder sourceNetworkId(String sourceNetworkId) {
            this.putQueryParameter("SourceNetworkId", sourceNetworkId);
            this.sourceNetworkId = sourceNetworkId;
            return this;
        }

        /**
         * The ID of the vSwitch that you need to access over the Internet. This parameter specifies that Edge Node Service (ENS) instances in the vSwitch can use the SNAT entry to access the Internet.
         * <p>
         * 
         * >  If you specify **SourceVSwitchId** and **SourceCIDR**, **SourceVSwitchId** does not take effect. The value that you specified for **SourceCIDR** takes precedence.
         */
        public Builder sourceVSwitchId(String sourceVSwitchId) {
            this.putQueryParameter("SourceVSwitchId", sourceVSwitchId);
            this.sourceVSwitchId = sourceVSwitchId;
            return this;
        }

        /**
         * The secondary EIP in the SNAT entry. Separate multiple secondary EIPs with commas (,).
         */
        public Builder standbySnatIp(String standbySnatIp) {
            this.putQueryParameter("StandbySnatIp", standbySnatIp);
            this.standbySnatIp = standbySnatIp;
            return this;
        }

        @Override
        public CreateSnatEntryRequest build() {
            return new CreateSnatEntryRequest(this);
        } 

    } 

}
