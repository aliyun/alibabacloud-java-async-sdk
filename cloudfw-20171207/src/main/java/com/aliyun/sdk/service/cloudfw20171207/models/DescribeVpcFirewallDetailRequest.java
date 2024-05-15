// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVpcFirewallDetailRequest} extends {@link RequestModel}
 *
 * <p>DescribeVpcFirewallDetailRequest</p>
 */
public class DescribeVpcFirewallDetailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LocalVpcId")
    private String localVpcId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PeerVpcId")
    private String peerVpcId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcFirewallId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vpcFirewallId;

    private DescribeVpcFirewallDetailRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.localVpcId = builder.localVpcId;
        this.peerVpcId = builder.peerVpcId;
        this.vpcFirewallId = builder.vpcFirewallId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVpcFirewallDetailRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return localVpcId
     */
    public String getLocalVpcId() {
        return this.localVpcId;
    }

    /**
     * @return peerVpcId
     */
    public String getPeerVpcId() {
        return this.peerVpcId;
    }

    /**
     * @return vpcFirewallId
     */
    public String getVpcFirewallId() {
        return this.vpcFirewallId;
    }

    public static final class Builder extends Request.Builder<DescribeVpcFirewallDetailRequest, Builder> {
        private String lang; 
        private String localVpcId; 
        private String peerVpcId; 
        private String vpcFirewallId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeVpcFirewallDetailRequest request) {
            super(request);
            this.lang = request.lang;
            this.localVpcId = request.localVpcId;
            this.peerVpcId = request.peerVpcId;
            this.vpcFirewallId = request.vpcFirewallId;
        } 

        /**
         * The natural language of the request and response. Valid values:
         * <p>
         * 
         * *   **zh**: Chinese (default)
         * *   **en**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The ID of the local VPC.
         */
        public Builder localVpcId(String localVpcId) {
            this.putQueryParameter("LocalVpcId", localVpcId);
            this.localVpcId = localVpcId;
            return this;
        }

        /**
         * The ID of the peer VPC.
         */
        public Builder peerVpcId(String peerVpcId) {
            this.putQueryParameter("PeerVpcId", peerVpcId);
            this.peerVpcId = peerVpcId;
            return this;
        }

        /**
         * The instance ID of the VPC firewall.
         * <p>
         * 
         * >  You can call the [DescribeVpcFirewallList](~~342932~~) operation to query the instance IDs of VPC firewalls.
         */
        public Builder vpcFirewallId(String vpcFirewallId) {
            this.putQueryParameter("VpcFirewallId", vpcFirewallId);
            this.vpcFirewallId = vpcFirewallId;
            return this;
        }

        @Override
        public DescribeVpcFirewallDetailRequest build() {
            return new DescribeVpcFirewallDetailRequest(this);
        } 

    } 

}
