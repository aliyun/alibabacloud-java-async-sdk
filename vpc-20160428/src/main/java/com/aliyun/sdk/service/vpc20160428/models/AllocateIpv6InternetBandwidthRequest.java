// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

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
 * {@link AllocateIpv6InternetBandwidthRequest} extends {@link RequestModel}
 *
 * <p>AllocateIpv6InternetBandwidthRequest</p>
 */
public class AllocateIpv6InternetBandwidthRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Bandwidth")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer bandwidth;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InternetChargeType")
    private String internetChargeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ipv6AddressId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ipv6AddressId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ipv6GatewayId")
    private String ipv6GatewayId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private AllocateIpv6InternetBandwidthRequest(Builder builder) {
        super(builder);
        this.bandwidth = builder.bandwidth;
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.internetChargeType = builder.internetChargeType;
        this.ipv6AddressId = builder.ipv6AddressId;
        this.ipv6GatewayId = builder.ipv6GatewayId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AllocateIpv6InternetBandwidthRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bandwidth
     */
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return internetChargeType
     */
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    /**
     * @return ipv6AddressId
     */
    public String getIpv6AddressId() {
        return this.ipv6AddressId;
    }

    /**
     * @return ipv6GatewayId
     */
    public String getIpv6GatewayId() {
        return this.ipv6GatewayId;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static final class Builder extends Request.Builder<AllocateIpv6InternetBandwidthRequest, Builder> {
        private Integer bandwidth; 
        private String clientToken; 
        private Boolean dryRun; 
        private String internetChargeType; 
        private String ipv6AddressId; 
        private String ipv6GatewayId; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(AllocateIpv6InternetBandwidthRequest request) {
            super(request);
            this.bandwidth = request.bandwidth;
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.internetChargeType = request.internetChargeType;
            this.ipv6AddressId = request.ipv6AddressId;
            this.ipv6GatewayId = request.ipv6GatewayId;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * <p>The Internet bandwidth of the IPv6 address. Unit: Mbit/s.</p>
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <ul>
         * <li>If <strong>InternetChargeType</strong> is set to <strong>PayByTraffic</strong>, the valid values are <strong>1</strong> to <strong>1000</strong>.</li>
         * <li>If <strong>InternetChargeType</strong> is set to <strong>PayByBandwidth</strong>, the valid values are <strong>1</strong> to <strong>2000</strong>.</li>
         * <li>If <strong>InternetChargeType</strong> is set to <strong>PayByOld95</strong>, the valid values are <strong>1</strong> to <strong>2000</strong>.</li>
         * </ul>
         * <p>&lt;props=&quot;intl&quot;&gt;</p>
         * <ul>
         * <li>If <strong>InternetChargeType</strong> is set to <strong>PayByTraffic</strong>, the valid values are <strong>1</strong> to <strong>1000</strong>.</li>
         * <li>If <strong>InternetChargeType</strong> is set to <strong>PayByBandwidth</strong>, the valid values are <strong>1</strong> to <strong>2000</strong>.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder bandwidth(Integer bandwidth) {
            this.putQueryParameter("Bandwidth", bandwidth);
            this.bandwidth = bandwidth;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The ClientToken value can contain only ASCII characters.</p>
         * <blockquote>
         * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> may be different for each API request.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-426655440000</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Specifies whether to perform a dry run. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: performs a dry run. The system checks the required parameters, request syntax, and limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned. The system does not associate a prefix list with a route table.</p>
         * </li>
         * <li><p><strong>false</strong> (default): sends a normal request. After the request passes the check, a 2xx HTTP status code is returned and the system associates the prefix list with a route table. The system checks whether the AccessKey pair is valid, whether the Resource Access Management (RAM) user has the required authorization, and whether the required parameters are specified.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The billable methods of the IPv6 Internet bandwidth. Valid values:</p>
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <ul>
         * <li><strong>PayByTraffic</strong>: pay-by-data-transfer.</li>
         * <li><strong>PayByBandwidth</strong> (default): pay-by-bandwidth.</li>
         * <li><strong>PayByOld95</strong>: traditional 95th percentile billing. IPv6 Internet bandwidth does not support traditional 95th percentile billing by default. To use this billing method, contact your account manager.</li>
         * </ul>
         * <p>&lt;props=&quot;intl&quot;&gt;</p>
         * <ul>
         * <li><strong>PayByTraffic</strong>: pay-by-data-transfer.</li>
         * <li><strong>PayByBandwidth</strong> (default): pay-by-bandwidth.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PayByBandwidth</p>
         */
        public Builder internetChargeType(String internetChargeType) {
            this.putQueryParameter("InternetChargeType", internetChargeType);
            this.internetChargeType = internetChargeType;
            return this;
        }

        /**
         * <p>The ID of the IPv6 address.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ipv6-2zen5j4axcp5l5qyy****</p>
         */
        public Builder ipv6AddressId(String ipv6AddressId) {
            this.putQueryParameter("Ipv6AddressId", ipv6AddressId);
            this.ipv6AddressId = ipv6AddressId;
            return this;
        }

        /**
         * <p>The ID of the IPv6 gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>ipv6gw-uf6hcyzu65v98v3du****</p>
         */
        public Builder ipv6GatewayId(String ipv6GatewayId) {
            this.putQueryParameter("Ipv6GatewayId", ipv6GatewayId);
            this.ipv6GatewayId = ipv6GatewayId;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The region ID of the IPv6 gateway. You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-huhehaote</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        @Override
        public AllocateIpv6InternetBandwidthRequest build() {
            return new AllocateIpv6InternetBandwidthRequest(this);
        } 

    } 

}
