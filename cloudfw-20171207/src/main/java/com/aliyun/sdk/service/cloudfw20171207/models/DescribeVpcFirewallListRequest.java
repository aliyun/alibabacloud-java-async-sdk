// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVpcFirewallListRequest} extends {@link RequestModel}
 *
 * <p>DescribeVpcFirewallListRequest</p>
 */
public class DescribeVpcFirewallListRequest extends Request {
    @Query
    @NameInMap("ConnectSubType")
    private String connectSubType;

    @Query
    @NameInMap("CurrentPage")
    private String currentPage;

    @Query
    @NameInMap("FirewallSwitchStatus")
    private String firewallSwitchStatus;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("MemberUid")
    private String memberUid;

    @Query
    @NameInMap("PageSize")
    private String pageSize;

    @Query
    @NameInMap("PeerUid")
    private String peerUid;

    @Query
    @NameInMap("RegionNo")
    private String regionNo;

    @Query
    @NameInMap("VpcFirewallId")
    private String vpcFirewallId;

    @Query
    @NameInMap("VpcFirewallName")
    private String vpcFirewallName;

    @Query
    @NameInMap("VpcId")
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
         * The sub-type of the connection. Valid values:
         * <p>
         * 
         * *   **vpc2vpc**: Express Connect connection
         * *   **vpcpeer**: peer connection
         */
        public Builder connectSubType(String connectSubType) {
            this.putQueryParameter("ConnectSubType", connectSubType);
            this.connectSubType = connectSubType;
            return this;
        }

        /**
         * The number of the page to return.
         * <p>
         * 
         * Pages start from page **1**. Default value: **1**.
         */
        public Builder currentPage(String currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * The status of the VPC firewall. Valid values:
         * <p>
         * 
         * *   **opened**: The VPC firewall is enabled.
         * *   **closed**: The VPC firewall is disabled.
         * *   **notconfigured**: The VPC firewall is not configured.
         * *   **configured**: The VPC firewall is configured.
         * 
         * > If you do not specify this parameter, VPC firewalls in all states are queried.
         */
        public Builder firewallSwitchStatus(String firewallSwitchStatus) {
            this.putQueryParameter("FirewallSwitchStatus", firewallSwitchStatus);
            this.firewallSwitchStatus = firewallSwitchStatus;
            return this;
        }

        /**
         * The language of the content within the request and response. Valid values:
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
         * The UID of the member that is managed by your Alibaba Cloud account.
         */
        public Builder memberUid(String memberUid) {
            this.putQueryParameter("MemberUid", memberUid);
            this.memberUid = memberUid;
            return this;
        }

        /**
         * The number of entries to return on each page.
         * <p>
         * 
         * Default value: **10**.**** Maximum value: **50**.
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The UID of the Alibaba Cloud account to which the peer VPC belongs.
         */
        public Builder peerUid(String peerUid) {
            this.putQueryParameter("PeerUid", peerUid);
            this.peerUid = peerUid;
            return this;
        }

        /**
         * The region ID of the VPC.
         * <p>
         * 
         * > For more information about the regions, see [Supported regions](~~195657~~).
         */
        public Builder regionNo(String regionNo) {
            this.putQueryParameter("RegionNo", regionNo);
            this.regionNo = regionNo;
            return this;
        }

        /**
         * The instance ID of the VPC firewall.
         */
        public Builder vpcFirewallId(String vpcFirewallId) {
            this.putQueryParameter("VpcFirewallId", vpcFirewallId);
            this.vpcFirewallId = vpcFirewallId;
            return this;
        }

        /**
         * The instance name of the VPC firewall.
         */
        public Builder vpcFirewallName(String vpcFirewallName) {
            this.putQueryParameter("VpcFirewallName", vpcFirewallName);
            this.vpcFirewallName = vpcFirewallName;
            return this;
        }

        /**
         * The ID of the VPC.
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
