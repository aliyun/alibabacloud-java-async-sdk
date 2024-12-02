// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateSnatEntryRequest} extends {@link RequestModel}
 *
 * <p>CreateSnatEntryRequest</p>
 */
public class CreateSnatEntryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IdleTimeout")
    @com.aliyun.core.annotation.Validation(maximum = 86400, minimum = 1)
    private Integer idleTimeout;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IspAffinity")
    private Boolean ispAffinity;

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
        this.idleTimeout = builder.idleTimeout;
        this.ispAffinity = builder.ispAffinity;
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
     * @return idleTimeout
     */
    public Integer getIdleTimeout() {
        return this.idleTimeout;
    }

    /**
     * @return ispAffinity
     */
    public Boolean getIspAffinity() {
        return this.ispAffinity;
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
        private Integer idleTimeout; 
        private Boolean ispAffinity; 
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
            this.idleTimeout = request.idleTimeout;
            this.ispAffinity = request.ispAffinity;
            this.natGatewayId = request.natGatewayId;
            this.snatEntryName = request.snatEntryName;
            this.snatIp = request.snatIp;
            this.sourceCIDR = request.sourceCIDR;
            this.sourceNetworkId = request.sourceNetworkId;
            this.sourceVSwitchId = request.sourceVSwitchId;
            this.standbySnatIp = request.standbySnatIp;
        } 

        /**
         * <p>The timeout period for idle connections. Valid values: <strong>1</strong> to <strong>86400</strong>. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        public Builder idleTimeout(Integer idleTimeout) {
            this.putQueryParameter("IdleTimeout", idleTimeout);
            this.idleTimeout = idleTimeout;
            return this;
        }

        /**
         * IspAffinity.
         */
        public Builder ispAffinity(Boolean ispAffinity) {
            this.putQueryParameter("IspAffinity", ispAffinity);
            this.ispAffinity = ispAffinity;
            return this;
        }

        /**
         * <p>The ID of the Network Address Translation (NAT) gateway.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>nat-5tawjw5j7sgd2deujxuk0****</p>
         */
        public Builder natGatewayId(String natGatewayId) {
            this.putQueryParameter("NatGatewayId", natGatewayId);
            this.natGatewayId = natGatewayId;
            return this;
        }

        /**
         * <p>The name of the SNAT entry. The name must be 1 to 128 characters in length. The name cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>test0</p>
         */
        public Builder snatEntryName(String snatEntryName) {
            this.putQueryParameter("SnatEntryName", snatEntryName);
            this.snatEntryName = snatEntryName;
            return this;
        }

        /**
         * <p>The elastic IP address (EIP) in the SNAT entry. Separate multiple EIPs with commas (,).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>120.XXX.XXX.71</p>
         */
        public Builder snatIp(String snatIp) {
            this.putQueryParameter("SnatIp", snatIp);
            this.snatIp = snatIp;
            return this;
        }

        /**
         * <p>The CIDR block. You can specify the CIDR block of a network, a vSwitch, or an instance. You can also specify a custom CIDR block. All instances within the CIDR block can access the Internet or external networks by using SNAT.</p>
         * <blockquote>
         * <p> If you specify <strong>SourceVSwitchId</strong> and <strong>SourceCIDR</strong>, <strong>SourceVSwitchId</strong> does not take effect. The value that you specified for <strong>SourceCIDR</strong> takes precedence.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10.0.0.0/24</p>
         */
        public Builder sourceCIDR(String sourceCIDR) {
            this.putQueryParameter("SourceCIDR", sourceCIDR);
            this.sourceCIDR = sourceCIDR;
            return this;
        }

        /**
         * <p>The ID of the network. This parameter specifies that all ENS instances in the network can use the SNAT entry to access the Internet.</p>
         * <blockquote>
         * <p> If you specify <strong>SourceNetworkId</strong> and <strong>SourceVSwitchId</strong> or <strong>SourceCIDR</strong>, <strong>SourceNetworkId</strong> does not take effect. The value that you specified for <strong>SourceCIDR</strong> takes precedence. Priority: <strong>SourceCIDR</strong> &gt; <strong>SourceVSwitchId</strong> &gt; <strong>SourceNetworkId</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>n-2zeuphj08tt7q3brd****</p>
         */
        public Builder sourceNetworkId(String sourceNetworkId) {
            this.putQueryParameter("SourceNetworkId", sourceNetworkId);
            this.sourceNetworkId = sourceNetworkId;
            return this;
        }

        /**
         * <p>The ID of the vSwitch that you need to access over the Internet. This parameter specifies that Edge Node Service (ENS) instances in the vSwitch can use the SNAT entry to access the Internet.</p>
         * <blockquote>
         * <p> If you specify <strong>SourceVSwitchId</strong> and <strong>SourceCIDR</strong>, <strong>SourceVSwitchId</strong> does not take effect. The value that you specified for <strong>SourceCIDR</strong> takes precedence.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1hwx7gi495q260p****</p>
         */
        public Builder sourceVSwitchId(String sourceVSwitchId) {
            this.putQueryParameter("SourceVSwitchId", sourceVSwitchId);
            this.sourceVSwitchId = sourceVSwitchId;
            return this;
        }

        /**
         * <p>The secondary EIP in the SNAT entry. Separate multiple secondary EIPs with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>101.XXX.XXX.7</p>
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
