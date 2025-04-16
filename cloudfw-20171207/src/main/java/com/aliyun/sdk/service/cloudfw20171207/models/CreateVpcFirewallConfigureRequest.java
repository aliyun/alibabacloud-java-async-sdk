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
 * {@link CreateVpcFirewallConfigureRequest} extends {@link RequestModel}
 *
 * <p>CreateVpcFirewallConfigureRequest</p>
 */
public class CreateVpcFirewallConfigureRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FirewallSwitch")
    @com.aliyun.core.annotation.Validation(required = true)
    private String firewallSwitch;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LocalVpcCidrTableList")
    @com.aliyun.core.annotation.Validation(required = true)
    private String localVpcCidrTableList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LocalVpcId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String localVpcId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LocalVpcRegion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String localVpcRegion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MemberUid")
    private String memberUid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PeerVpcCidrTableList")
    @com.aliyun.core.annotation.Validation(required = true)
    private String peerVpcCidrTableList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PeerVpcId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String peerVpcId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PeerVpcRegion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String peerVpcRegion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcFirewallName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vpcFirewallName;

    private CreateVpcFirewallConfigureRequest(Builder builder) {
        super(builder);
        this.firewallSwitch = builder.firewallSwitch;
        this.lang = builder.lang;
        this.localVpcCidrTableList = builder.localVpcCidrTableList;
        this.localVpcId = builder.localVpcId;
        this.localVpcRegion = builder.localVpcRegion;
        this.memberUid = builder.memberUid;
        this.peerVpcCidrTableList = builder.peerVpcCidrTableList;
        this.peerVpcId = builder.peerVpcId;
        this.peerVpcRegion = builder.peerVpcRegion;
        this.vpcFirewallName = builder.vpcFirewallName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateVpcFirewallConfigureRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return firewallSwitch
     */
    public String getFirewallSwitch() {
        return this.firewallSwitch;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return localVpcCidrTableList
     */
    public String getLocalVpcCidrTableList() {
        return this.localVpcCidrTableList;
    }

    /**
     * @return localVpcId
     */
    public String getLocalVpcId() {
        return this.localVpcId;
    }

    /**
     * @return localVpcRegion
     */
    public String getLocalVpcRegion() {
        return this.localVpcRegion;
    }

    /**
     * @return memberUid
     */
    public String getMemberUid() {
        return this.memberUid;
    }

    /**
     * @return peerVpcCidrTableList
     */
    public String getPeerVpcCidrTableList() {
        return this.peerVpcCidrTableList;
    }

    /**
     * @return peerVpcId
     */
    public String getPeerVpcId() {
        return this.peerVpcId;
    }

    /**
     * @return peerVpcRegion
     */
    public String getPeerVpcRegion() {
        return this.peerVpcRegion;
    }

    /**
     * @return vpcFirewallName
     */
    public String getVpcFirewallName() {
        return this.vpcFirewallName;
    }

    public static final class Builder extends Request.Builder<CreateVpcFirewallConfigureRequest, Builder> {
        private String firewallSwitch; 
        private String lang; 
        private String localVpcCidrTableList; 
        private String localVpcId; 
        private String localVpcRegion; 
        private String memberUid; 
        private String peerVpcCidrTableList; 
        private String peerVpcId; 
        private String peerVpcRegion; 
        private String vpcFirewallName; 

        private Builder() {
            super();
        } 

        private Builder(CreateVpcFirewallConfigureRequest request) {
            super(request);
            this.firewallSwitch = request.firewallSwitch;
            this.lang = request.lang;
            this.localVpcCidrTableList = request.localVpcCidrTableList;
            this.localVpcId = request.localVpcId;
            this.localVpcRegion = request.localVpcRegion;
            this.memberUid = request.memberUid;
            this.peerVpcCidrTableList = request.peerVpcCidrTableList;
            this.peerVpcId = request.peerVpcId;
            this.peerVpcRegion = request.peerVpcRegion;
            this.vpcFirewallName = request.vpcFirewallName;
        } 

        /**
         * <p>The status of the VPC firewall after you create the firewall. Valid values:</p>
         * <ul>
         * <li><strong>open</strong>: After you create the VPC firewall, the VPC firewall is automatically enabled. This is the default value.</li>
         * <li><strong>close</strong>: After you create the VPC firewall, the VPC firewall is disabled. To enable the firewall, you can call the <a href="https://help.aliyun.com/document_detail/342935.html">ModifyVpcFirewallSwitchStatus</a> operation.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>open</p>
         */
        public Builder firewallSwitch(String firewallSwitch) {
            this.putQueryParameter("FirewallSwitch", firewallSwitch);
            this.firewallSwitch = firewallSwitch;
            return this;
        }

        /**
         * <p>The language of the content within the request and the response. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese (default)</li>
         * <li><strong>en</strong>: English.</li>
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
         * <p>The CIDR blocks of the local VPC. The value is a JSON string that contains the following parameters:</p>
         * <ul>
         * <li><strong>RouteTableId</strong>: the ID of the route table for the local VPC.</li>
         * <li><strong>RouteEntryList</strong>: The value is a JSON string that contains the DestinationCidr and NextHopInstanceId parameters. The DestinationCidr parameter indicates the destination CIDR block of the local VPC. The NextHopInstanceId parameter indicates the instance ID of the next hop for the local VPC.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;RouteTableId&quot;:&quot;vtb-1234&quot;,&quot;RouteEntryList&quot;:[{&quot;DestinationCidr&quot;:&quot;192.168.XX.XX/24&quot;,&quot;NextHopInstanceId&quot;:&quot;vrt-m5eb5me6c3l5sezae****&quot;}]},{&quot;RouteTableId&quot;:&quot;vtb-1235&quot;,&quot;RouteEntryList&quot;:[{&quot;DestinationCidr&quot;:&quot;192.168.XX.XX/24&quot;,&quot;NextHopInstanceId&quot;:&quot;vrt-m5eb5me6c3l5sezae****&quot;}]}]</p>
         */
        public Builder localVpcCidrTableList(String localVpcCidrTableList) {
            this.putQueryParameter("LocalVpcCidrTableList", localVpcCidrTableList);
            this.localVpcCidrTableList = localVpcCidrTableList;
            return this;
        }

        /**
         * <p>The ID of the local VPC.</p>
         * <p>This parameter is required.</p>
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
         * <p>The region ID of the local VPC.</p>
         * <blockquote>
         * <p> For more information about the regions in which Cloud Firewall is available, see <a href="https://help.aliyun.com/document_detail/195657.html">Supported regions</a>.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder localVpcRegion(String localVpcRegion) {
            this.putQueryParameter("LocalVpcRegion", localVpcRegion);
            this.localVpcRegion = localVpcRegion;
            return this;
        }

        /**
         * <p>The UID of the member that is managed by your Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>258039427902****</p>
         */
        public Builder memberUid(String memberUid) {
            this.putQueryParameter("MemberUid", memberUid);
            this.memberUid = memberUid;
            return this;
        }

        /**
         * <p>The CIDR blocks of the peer VPC. The value is a JSON string that contains the following parameters:</p>
         * <ul>
         * <li><strong>RouteTableId</strong>: the ID of the route table for the peer VPC.</li>
         * <li><strong>RouteEntryList</strong>: The value is a JSON string that contains the DestinationCidr and NextHopInstanceId parameters. The DestinationCidr parameter indicates the destination CIDR block of the peer VPC. The NextHopInstanceId parameter indicates the instance ID of the next hop for the peer VPC.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;RouteTableId&quot;:&quot;vtb-1234&quot;,&quot;RouteEntryList&quot;:[{&quot;DestinationCidr&quot;:&quot;192.168.XX.XX/24&quot;,&quot;NextHopInstanceId&quot;:&quot;vrt-m5eb5me6c3l5sezae****&quot;}]},{&quot;RouteTableId&quot;:&quot;vtb-1235&quot;,&quot;RouteEntryList&quot;:[{&quot;DestinationCidr&quot;:&quot;192.168.XX.XX/24&quot;,&quot;NextHopInstanceId&quot;:&quot;vrt-m5eb5me6c3l5sezae****&quot;}]}]</p>
         */
        public Builder peerVpcCidrTableList(String peerVpcCidrTableList) {
            this.putQueryParameter("PeerVpcCidrTableList", peerVpcCidrTableList);
            this.peerVpcCidrTableList = peerVpcCidrTableList;
            return this;
        }

        /**
         * <p>The ID of the peer VPC.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-wb8vbo90rq0anm6t****</p>
         */
        public Builder peerVpcId(String peerVpcId) {
            this.putQueryParameter("PeerVpcId", peerVpcId);
            this.peerVpcId = peerVpcId;
            return this;
        }

        /**
         * <p>The region ID of the peer VPC.</p>
         * <blockquote>
         * <p> For more information about Cloud Firewall supported regions, see <a href="https://help.aliyun.com/document_detail/195657.html">Supported regions</a>.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder peerVpcRegion(String peerVpcRegion) {
            this.putQueryParameter("PeerVpcRegion", peerVpcRegion);
            this.peerVpcRegion = peerVpcRegion;
            return this;
        }

        /**
         * <p>The instance name of the VPC firewall.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my-vpc-firewall</p>
         */
        public Builder vpcFirewallName(String vpcFirewallName) {
            this.putQueryParameter("VpcFirewallName", vpcFirewallName);
            this.vpcFirewallName = vpcFirewallName;
            return this;
        }

        @Override
        public CreateVpcFirewallConfigureRequest build() {
            return new CreateVpcFirewallConfigureRequest(this);
        } 

    } 

}
