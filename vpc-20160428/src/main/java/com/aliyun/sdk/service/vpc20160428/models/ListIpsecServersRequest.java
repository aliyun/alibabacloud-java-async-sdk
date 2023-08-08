// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListIpsecServersRequest} extends {@link RequestModel}
 *
 * <p>ListIpsecServersRequest</p>
 */
public class ListIpsecServersRequest extends Request {
    @Query
    @NameInMap("IpsecServerId")
    @Validation(maxLength = 128)
    private java.util.List < String > ipsecServerId;

    @Query
    @NameInMap("IpsecServerName")
    private String ipsecServerName;

    @Query
    @NameInMap("MaxResults")
    private Integer maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("VpnGatewayId")
    private String vpnGatewayId;

    private ListIpsecServersRequest(Builder builder) {
        super(builder);
        this.ipsecServerId = builder.ipsecServerId;
        this.ipsecServerName = builder.ipsecServerName;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.regionId = builder.regionId;
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
            this.vpnGatewayId = request.vpnGatewayId;
        } 

        /**
         * The ID of the IPsec server.
         */
        public Builder ipsecServerId(java.util.List < String > ipsecServerId) {
            this.putQueryParameter("IpsecServerId", ipsecServerId);
            this.ipsecServerId = ipsecServerId;
            return this;
        }

        /**
         * The name of the IPsec server.
         * <p>
         * 
         * The name must be 1 to 100 characters in length and cannot start with `http://` or `https://`.
         */
        public Builder ipsecServerName(String ipsecServerName) {
            this.putQueryParameter("IpsecServerName", ipsecServerName);
            this.ipsecServerName = ipsecServerName;
            return this;
        }

        /**
         * The number of entries to return on each page. Valid values: **1** to **20**. Default value: **10**.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The pagination token that is used in the next request to retrieve a new page of results. Valid values:
         * <p>
         * 
         * *   If this is your first request and no next requests are to be performed, you do not need to specify this parameter.
         * *   You must specify the token that is obtained from the previous query as the value of **NextToken**.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The ID of the region where the IPsec server is created.
         * <p>
         * 
         * You can call the [DescribeRegions](~~36063~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the VPN gateway.
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
