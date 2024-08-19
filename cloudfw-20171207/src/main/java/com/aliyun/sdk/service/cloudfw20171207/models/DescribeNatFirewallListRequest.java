// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNatFirewallListRequest} extends {@link RequestModel}
 *
 * <p>DescribeNatFirewallListRequest</p>
 */
public class DescribeNatFirewallListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MemberUid")
    private Long memberUid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NatGatewayId")
    private String natGatewayId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Long pageNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProxyId")
    private String proxyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProxyName")
    private String proxyName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionNo")
    private String regionNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    private DescribeNatFirewallListRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.memberUid = builder.memberUid;
        this.natGatewayId = builder.natGatewayId;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.proxyId = builder.proxyId;
        this.proxyName = builder.proxyName;
        this.regionNo = builder.regionNo;
        this.status = builder.status;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNatFirewallListRequest create() {
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
     * @return memberUid
     */
    public Long getMemberUid() {
        return this.memberUid;
    }

    /**
     * @return natGatewayId
     */
    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    /**
     * @return pageNo
     */
    public Long getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return proxyId
     */
    public String getProxyId() {
        return this.proxyId;
    }

    /**
     * @return proxyName
     */
    public String getProxyName() {
        return this.proxyName;
    }

    /**
     * @return regionNo
     */
    public String getRegionNo() {
        return this.regionNo;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder extends Request.Builder<DescribeNatFirewallListRequest, Builder> {
        private String lang; 
        private Long memberUid; 
        private String natGatewayId; 
        private Long pageNo; 
        private Long pageSize; 
        private String proxyId; 
        private String proxyName; 
        private String regionNo; 
        private String status; 
        private String vpcId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeNatFirewallListRequest request) {
            super(request);
            this.lang = request.lang;
            this.memberUid = request.memberUid;
            this.natGatewayId = request.natGatewayId;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.proxyId = request.proxyId;
            this.proxyName = request.proxyName;
            this.regionNo = request.regionNo;
            this.status = request.status;
            this.vpcId = request.vpcId;
        } 

        /**
         * The language of the content within the response. Valid values:
         * <p>
         * *   **zh** (default)
         * *   **en**
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The UID of the member that is managed by your Alibaba Cloud account.
         */
        public Builder memberUid(Long memberUid) {
            this.putQueryParameter("MemberUid", memberUid);
            this.memberUid = memberUid;
            return this;
        }

        /**
         * The ID of the NAT gateway.
         */
        public Builder natGatewayId(String natGatewayId) {
            this.putQueryParameter("NatGatewayId", natGatewayId);
            this.natGatewayId = natGatewayId;
            return this;
        }

        /**
         * The page number.
         */
        public Builder pageNo(Long pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * The number of entries per page.
         * <p>
         * 
         * Default value: 10. 
         * 
         *  Maximum value: 50.
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the NAT firewall.
         */
        public Builder proxyId(String proxyId) {
            this.putQueryParameter("ProxyId", proxyId);
            this.proxyId = proxyId;
            return this;
        }

        /**
         * The name of the NAT firewall. The name must be 4 to 50 characters in length, and can contain letters, digits, and underscores (_). The name cannot start with an underscore.
         */
        public Builder proxyName(String proxyName) {
            this.putQueryParameter("ProxyName", proxyName);
            this.proxyName = proxyName;
            return this;
        }

        /**
         * The region ID of the virtual private cloud (VPC).
         */
        public Builder regionNo(String regionNo) {
            this.putQueryParameter("RegionNo", regionNo);
            this.regionNo = regionNo;
            return this;
        }

        /**
         * The status of the NAT firewall. Valid values:
         * <p>
         * 
         * *   configuring
         * *   deleting
         * *   normal
         * *   abnormal
         * *   opening
         * *   closing
         * *   closed
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
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
        public DescribeNatFirewallListRequest build() {
            return new DescribeNatFirewallListRequest(this);
        } 

    } 

}
