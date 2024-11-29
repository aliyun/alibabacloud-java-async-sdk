// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListIpsecServersRequest} extends {@link RequestModel}
 *
 * <p>ListIpsecServersRequest</p>
 */
public class ListIpsecServersRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpsecServerId")
    @com.aliyun.core.annotation.Validation(maxLength = 128)
    private java.util.List < String > ipsecServerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpsecServerName")
    private String ipsecServerName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpnGatewayId")
    private String vpnGatewayId;

    private ListIpsecServersRequest(Builder builder) {
        super(builder);
        this.ipsecServerId = builder.ipsecServerId;
        this.ipsecServerName = builder.ipsecServerName;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.vpnGatewayId = builder.vpnGatewayId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIpsecServersRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ipsecServerId
     */
    public java.util.List < String > getIpsecServerId() {
        return this.ipsecServerId;
    }

    /**
     * @return ipsecServerName
     */
    public String getIpsecServerName() {
        return this.ipsecServerName;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return vpnGatewayId
     */
    public String getVpnGatewayId() {
        return this.vpnGatewayId;
    }

    public static final class Builder extends Request.Builder<ListIpsecServersRequest, Builder> {
        private java.util.List < String > ipsecServerId; 
        private String ipsecServerName; 
        private Integer maxResults; 
        private String nextToken; 
        private String regionId; 
        private String resourceGroupId; 
        private String vpnGatewayId; 

        private Builder() {
            super();
        } 

        private Builder(ListIpsecServersRequest request) {
            super(request);
            this.ipsecServerId = request.ipsecServerId;
            this.ipsecServerName = request.ipsecServerName;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.vpnGatewayId = request.vpnGatewayId;
        } 

        /**
         * <p>The ID of the IPsec server.</p>
         * 
         * <strong>example:</strong>
         * <p>iss-bp1bo3xuvcxo7ixll****</p>
         */
        public Builder ipsecServerId(java.util.List < String > ipsecServerId) {
            this.putQueryParameter("IpsecServerId", ipsecServerId);
            this.ipsecServerId = ipsecServerId;
            return this;
        }

        /**
         * <p>The name of the IPsec server.</p>
         * <p>The name must be 1 to 100 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder ipsecServerName(String ipsecServerName) {
            this.putQueryParameter("IpsecServerName", ipsecServerName);
            this.ipsecServerName = ipsecServerName;
            return this;
        }

        /**
         * <p>The number of entries to return on each page. Valid values: <strong>1</strong> to <strong>20</strong>. Default value: <strong>10</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results. Valid values:</p>
         * <ul>
         * <li>If this is your first request and no next requests are to be performed, you do not need to specify this parameter.</li>
         * <li>You must specify the token that is obtained from the previous query as the value of <strong>NextToken</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>caeba0bbb2be03f84eb48b699f0a****</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The ID of the region where the IPsec server is created.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the resource group to which the IPsec server belongs.</p>
         * <p>The IPsec server has the same resource group as its associated VPN gateway instance.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/2526915.html">DescribeVpnGateway</a> operation to query the ID of the resource group to which the VPN gateway instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmzs372yg****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The ID of the VPN gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>vpn-bp1q8bgx4xnkm2ogj****</p>
         */
        public Builder vpnGatewayId(String vpnGatewayId) {
            this.putQueryParameter("VpnGatewayId", vpnGatewayId);
            this.vpnGatewayId = vpnGatewayId;
            return this;
        }

        @Override
        public ListIpsecServersRequest build() {
            return new ListIpsecServersRequest(this);
        } 

    } 

}
