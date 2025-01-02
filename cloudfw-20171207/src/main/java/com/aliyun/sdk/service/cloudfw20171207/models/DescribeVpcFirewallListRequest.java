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
 * {@link DescribeVpcFirewallListRequest} extends {@link RequestModel}
 *
 * <p>DescribeVpcFirewallListRequest</p>
 */
public class DescribeVpcFirewallListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConnectSubType")
    private String connectSubType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private String currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FirewallSwitchStatus")
    private String firewallSwitchStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MemberUid")
    private String memberUid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PeerUid")
    private String peerUid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionNo")
    private String regionNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcFirewallId")
    private String vpcFirewallId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcFirewallName")
    private String vpcFirewallName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    private DescribeVpcFirewallListRequest(Builder builder) {
        super(builder);
        this.connectSubType = builder.connectSubType;
        this.currentPage = builder.currentPage;
        this.firewallSwitchStatus = builder.firewallSwitchStatus;
        this.lang = builder.lang;
        this.memberUid = builder.memberUid;
        this.pageSize = builder.pageSize;
        this.peerUid = builder.peerUid;
        this.regionNo = builder.regionNo;
        this.vpcFirewallId = builder.vpcFirewallId;
        this.vpcFirewallName = builder.vpcFirewallName;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVpcFirewallListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return connectSubType
     */
    public String getConnectSubType() {
        return this.connectSubType;
    }

    /**
     * @return currentPage
     */
    public String getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return firewallSwitchStatus
     */
    public String getFirewallSwitchStatus() {
        return this.firewallSwitchStatus;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return memberUid
     */
    public String getMemberUid() {
        return this.memberUid;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return peerUid
     */
    public String getPeerUid() {
        return this.peerUid;
    }

    /**
     * @return regionNo
     */
    public String getRegionNo() {
        return this.regionNo;
    }

    /**
     * @return vpcFirewallId
     */
    public String getVpcFirewallId() {
        return this.vpcFirewallId;
    }

    /**
     * @return vpcFirewallName
     */
    public String getVpcFirewallName() {
        return this.vpcFirewallName;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder extends Request.Builder<DescribeVpcFirewallListRequest, Builder> {
        private String connectSubType; 
        private String currentPage; 
        private String firewallSwitchStatus; 
        private String lang; 
        private String memberUid; 
        private String pageSize; 
        private String peerUid; 
        private String regionNo; 
        private String vpcFirewallId; 
        private String vpcFirewallName; 
        private String vpcId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeVpcFirewallListRequest request) {
            super(request);
            this.connectSubType = request.connectSubType;
            this.currentPage = request.currentPage;
            this.firewallSwitchStatus = request.firewallSwitchStatus;
            this.lang = request.lang;
            this.memberUid = request.memberUid;
            this.pageSize = request.pageSize;
            this.peerUid = request.peerUid;
            this.regionNo = request.regionNo;
            this.vpcFirewallId = request.vpcFirewallId;
            this.vpcFirewallName = request.vpcFirewallName;
            this.vpcId = request.vpcId;
        } 

        /**
         * <p>The sub-type of the connection. Valid values:</p>
         * <ul>
         * <li><strong>vpc2vpc</strong>: Express Connect connection</li>
         * <li><strong>vpcpeer</strong>: peer connection</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>vpcpeer</p>
         */
        public Builder connectSubType(String connectSubType) {
            this.putQueryParameter("ConnectSubType", connectSubType);
            this.connectSubType = connectSubType;
            return this;
        }

        /**
         * <p>The number of the page to return.</p>
         * <p>Pages start from page <strong>1</strong>. Default value: <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(String currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The status of the VPC firewall. Valid values:</p>
         * <ul>
         * <li><strong>opened</strong>: The VPC firewall is enabled.</li>
         * <li><strong>closed</strong>: The VPC firewall is disabled.</li>
         * <li><strong>notconfigured</strong>: The VPC firewall is not configured.</li>
         * <li><strong>configured</strong>: The VPC firewall is configured.</li>
         * </ul>
         * <blockquote>
         * <p>If you do not specify this parameter, VPC firewalls in all states are queried.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>opened</p>
         */
        public Builder firewallSwitchStatus(String firewallSwitchStatus) {
            this.putQueryParameter("FirewallSwitchStatus", firewallSwitchStatus);
            this.firewallSwitchStatus = firewallSwitchStatus;
            return this;
        }

        /**
         * <p>The language of the content within the request and response. Valid values:</p>
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
         * <p>The number of entries to return on each page.</p>
         * <p>Default value: <strong>10</strong>. Maximum value: <strong>50</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The UID of the Alibaba Cloud account to which the peer VPC belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>258039427902****</p>
         */
        public Builder peerUid(String peerUid) {
            this.putQueryParameter("PeerUid", peerUid);
            this.peerUid = peerUid;
            return this;
        }

        /**
         * <p>The region ID of the VPC.</p>
         * <blockquote>
         * <p>For more information about the regions, see <a href="https://help.aliyun.com/document_detail/195657.html">Supported regions</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionNo(String regionNo) {
            this.putQueryParameter("RegionNo", regionNo);
            this.regionNo = regionNo;
            return this;
        }

        /**
         * <p>The instance ID of the VPC firewall.</p>
         * 
         * <strong>example:</strong>
         * <p>vfw-m5e7dbc4y****</p>
         */
        public Builder vpcFirewallId(String vpcFirewallId) {
            this.putQueryParameter("VpcFirewallId", vpcFirewallId);
            this.vpcFirewallId = vpcFirewallId;
            return this;
        }

        /**
         * <p>The instance name of the VPC firewall.</p>
         * 
         * <strong>example:</strong>
         * <p>Test firewall</p>
         */
        public Builder vpcFirewallName(String vpcFirewallName) {
            this.putQueryParameter("VpcFirewallName", vpcFirewallName);
            this.vpcFirewallName = vpcFirewallName;
            return this;
        }

        /**
         * <p>The ID of the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-8vbwbo90rq0anm6t****</p>
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        @Override
        public DescribeVpcFirewallListRequest build() {
            return new DescribeVpcFirewallListRequest(this);
        } 

    } 

}
