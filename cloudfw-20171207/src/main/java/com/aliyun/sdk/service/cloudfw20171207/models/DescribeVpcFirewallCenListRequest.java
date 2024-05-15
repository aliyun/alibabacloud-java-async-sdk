// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVpcFirewallCenListRequest} extends {@link RequestModel}
 *
 * <p>DescribeVpcFirewallCenListRequest</p>
 */
public class DescribeVpcFirewallCenListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CenId")
    private String cenId;

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
    @com.aliyun.core.annotation.NameInMap("NetworkInstanceId")
    private String networkInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private String ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionNo")
    private String regionNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RouteMode")
    private String routeMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransitRouterType")
    private String transitRouterType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcFirewallId")
    private String vpcFirewallId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcFirewallName")
    private String vpcFirewallName;

    private DescribeVpcFirewallCenListRequest(Builder builder) {
        super(builder);
        this.cenId = builder.cenId;
        this.currentPage = builder.currentPage;
        this.firewallSwitchStatus = builder.firewallSwitchStatus;
        this.lang = builder.lang;
        this.memberUid = builder.memberUid;
        this.networkInstanceId = builder.networkInstanceId;
        this.ownerId = builder.ownerId;
        this.pageSize = builder.pageSize;
        this.regionNo = builder.regionNo;
        this.routeMode = builder.routeMode;
        this.transitRouterType = builder.transitRouterType;
        this.vpcFirewallId = builder.vpcFirewallId;
        this.vpcFirewallName = builder.vpcFirewallName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVpcFirewallCenListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cenId
     */
    public String getCenId() {
        return this.cenId;
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
     * @return networkInstanceId
     */
    public String getNetworkInstanceId() {
        return this.networkInstanceId;
    }

    /**
     * @return ownerId
     */
    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return regionNo
     */
    public String getRegionNo() {
        return this.regionNo;
    }

    /**
     * @return routeMode
     */
    public String getRouteMode() {
        return this.routeMode;
    }

    /**
     * @return transitRouterType
     */
    public String getTransitRouterType() {
        return this.transitRouterType;
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

    public static final class Builder extends Request.Builder<DescribeVpcFirewallCenListRequest, Builder> {
        private String cenId; 
        private String currentPage; 
        private String firewallSwitchStatus; 
        private String lang; 
        private String memberUid; 
        private String networkInstanceId; 
        private String ownerId; 
        private String pageSize; 
        private String regionNo; 
        private String routeMode; 
        private String transitRouterType; 
        private String vpcFirewallId; 
        private String vpcFirewallName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeVpcFirewallCenListRequest request) {
            super(request);
            this.cenId = request.cenId;
            this.currentPage = request.currentPage;
            this.firewallSwitchStatus = request.firewallSwitchStatus;
            this.lang = request.lang;
            this.memberUid = request.memberUid;
            this.networkInstanceId = request.networkInstanceId;
            this.ownerId = request.ownerId;
            this.pageSize = request.pageSize;
            this.regionNo = request.regionNo;
            this.routeMode = request.routeMode;
            this.transitRouterType = request.transitRouterType;
            this.vpcFirewallId = request.vpcFirewallId;
            this.vpcFirewallName = request.vpcFirewallName;
        } 

        /**
         * The ID of the CEN instance.
         */
        public Builder cenId(String cenId) {
            this.putQueryParameter("CenId", cenId);
            this.cenId = cenId;
            return this;
        }

        /**
         * The number of the page to return.
         * <p>
         * 
         * Pages start from page 1. Default value: 1.
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
         * *   **configured**: The VPC firewall is configured but is not enabled.
         * 
         * > If you do not specify this parameter, VPC firewalls in all states are queried.
         */
        public Builder firewallSwitchStatus(String firewallSwitchStatus) {
            this.putQueryParameter("FirewallSwitchStatus", firewallSwitchStatus);
            this.firewallSwitchStatus = firewallSwitchStatus;
            return this;
        }

        /**
         * The language of the content within the response. Valid values:
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
         * The UID of the member that is managed by your Alibaba Cloud account. The member is also an Alibaba Cloud account.
         */
        public Builder memberUid(String memberUid) {
            this.putQueryParameter("MemberUid", memberUid);
            this.memberUid = memberUid;
            return this;
        }

        /**
         * The ID of the network instance.
         */
        public Builder networkInstanceId(String networkInstanceId) {
            this.putQueryParameter("NetworkInstanceId", networkInstanceId);
            this.networkInstanceId = networkInstanceId;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(String ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * The number of entries to return on each page.
         * <p>
         * 
         * Default value: 10. Maximum value: 50.
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
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
         * The routing mode of the VPC firewall. Valid values:
         * <p>
         * 
         * *   **auto**: automatic mode
         * *   **manual**: manual mode
         * 
         * > If you do not specify this parameter, VPC firewalls in all routing modes are queried.
         */
        public Builder routeMode(String routeMode) {
            this.putQueryParameter("RouteMode", routeMode);
            this.routeMode = routeMode;
            return this;
        }

        /**
         * The type of the transit router. Valid values:
         * <p>
         * 
         * *   **Basic**: Basic Edition transit router
         * *   **Enterprise**: Enterprise Edition transit router
         */
        public Builder transitRouterType(String transitRouterType) {
            this.putQueryParameter("TransitRouterType", transitRouterType);
            this.transitRouterType = transitRouterType;
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

        @Override
        public DescribeVpcFirewallCenListRequest build() {
            return new DescribeVpcFirewallCenListRequest(this);
        } 

    } 

}
