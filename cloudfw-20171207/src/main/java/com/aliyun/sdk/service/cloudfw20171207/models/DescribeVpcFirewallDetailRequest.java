// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
         * <p>The natural language of the request and response. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese (default)</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The ID of the local VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-8vbwbo90rq0anm6t****</p>
         */
        public Builder localVpcId(String localVpcId) {
            this.putQueryParameter("LocalVpcId", localVpcId);
            this.localVpcId = localVpcId;
            return this;
        }

        /**
         * <p>The ID of the peer VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-90rq0anm6t8vbwbo****</p>
         */
        public Builder peerVpcId(String peerVpcId) {
            this.putQueryParameter("PeerVpcId", peerVpcId);
            this.peerVpcId = peerVpcId;
            return this;
        }

        /**
         * <p>The instance ID of the VPC firewall.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/342932.html">DescribeVpcFirewallList</a> operation to query the instance IDs of VPC firewalls.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vfw-m5e7dbc4y****</p>
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
