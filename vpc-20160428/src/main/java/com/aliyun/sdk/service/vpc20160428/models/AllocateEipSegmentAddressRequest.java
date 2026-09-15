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
 * {@link AllocateEipSegmentAddressRequest} extends {@link RequestModel}
 *
 * <p>AllocateEipSegmentAddressRequest</p>
 */
public class AllocateEipSegmentAddressRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Bandwidth")
    private String bandwidth;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EipMask")
    @com.aliyun.core.annotation.Validation(required = true)
    private String eipMask;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InternetChargeType")
    private String internetChargeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Isp")
    private String isp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Netmode")
    private String netmode;

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
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Zone")
    private String zone;

    private AllocateEipSegmentAddressRequest(Builder builder) {
        super(builder);
        this.bandwidth = builder.bandwidth;
        this.clientToken = builder.clientToken;
        this.eipMask = builder.eipMask;
        this.internetChargeType = builder.internetChargeType;
        this.isp = builder.isp;
        this.netmode = builder.netmode;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.zone = builder.zone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AllocateEipSegmentAddressRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bandwidth
     */
    public String getBandwidth() {
        return this.bandwidth;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return eipMask
     */
    public String getEipMask() {
        return this.eipMask;
    }

    /**
     * @return internetChargeType
     */
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    /**
     * @return isp
     */
    public String getIsp() {
        return this.isp;
    }

    /**
     * @return netmode
     */
    public String getNetmode() {
        return this.netmode;
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
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
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

    /**
     * @return zone
     */
    public String getZone() {
        return this.zone;
    }

    public static final class Builder extends Request.Builder<AllocateEipSegmentAddressRequest, Builder> {
        private String bandwidth; 
        private String clientToken; 
        private String eipMask; 
        private String internetChargeType; 
        private String isp; 
        private String netmode; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String zone; 

        private Builder() {
            super();
        } 

        private Builder(AllocateEipSegmentAddressRequest request) {
            super(request);
            this.bandwidth = request.bandwidth;
            this.clientToken = request.clientToken;
            this.eipMask = request.eipMask;
            this.internetChargeType = request.internetChargeType;
            this.isp = request.isp;
            this.netmode = request.netmode;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.zone = request.zone;
        } 

        /**
         * <p>The maximum bandwidth of the EIP. Unit: Mbit/s.</p>
         * <ul>
         * <li><p>If <strong>InternetChargeType</strong> is set to <strong>PayByBandwidth</strong>, valid values of <strong>Bandwidth</strong> are <strong>1</strong> to <strong>500</strong>.</p>
         * </li>
         * <li><p>If <strong>InternetChargeType</strong> is set to <strong>PayByTraffic</strong>, valid values of <strong>Bandwidth</strong> are <strong>1</strong> to <strong>200</strong>.</p>
         * </li>
         * </ul>
         * <p>Default value: <strong>5</strong> Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder bandwidth(String bandwidth) {
            this.putQueryParameter("Bandwidth", bandwidth);
            this.bandwidth = bandwidth;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The <strong>ClientToken</strong> value can contain only ASCII characters.</p>
         * <blockquote>
         * <p>If you do not specify this parameter, the system uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> may be different for each API request.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>02fb3da4-130e-11e9-8e44-001****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The subnet mask of the contiguous EIPs. Valid values:</p>
         * <ul>
         * <li><p><strong>28</strong>: The system allocates 16 contiguous EIPs per call.</p>
         * </li>
         * <li><p><strong>27</strong>: The system allocates 32 contiguous EIPs per call.</p>
         * </li>
         * <li><p><strong>26</strong>: The system allocates 64 contiguous EIPs per call.</p>
         * </li>
         * <li><p><strong>25</strong>: The system allocates 128 contiguous EIPs per call.</p>
         * </li>
         * <li><p><strong>24</strong>: The system allocates 256 contiguous EIPs per call.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>Due to IP address reservation, the actual number of contiguous EIPs may be 1, 3, or 4 fewer than expected.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>28</p>
         */
        public Builder eipMask(String eipMask) {
            this.putQueryParameter("EipMask", eipMask);
            this.eipMask = eipMask;
            return this;
        }

        /**
         * <p>The billable methods of the contiguous EIPs. Valid values:</p>
         * <ul>
         * <li><p><strong>PayByBandwidth</strong> (default): pay-by-bandwidth.</p>
         * </li>
         * <li><p><strong>PayByTraffic</strong>: pay-by-data-transfer.</p>
         * </li>
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
         * <p>The line type. Valid values:</p>
         * <ul>
         * <li><strong>BGP</strong> (default): BGP (multi-ISP) line. All regions support BGP (multi-ISP) EIPs.</li>
         * <li><strong>BGP_PRO</strong>: BGP (multi-ISP) premium line. Only Hong Kong (China), Singapore, Tokyo (Japan), Kuala Lumpur (Malaysia), Manila (Philippines), Jakarta (Indonesia), and Bangkok (Thailand) regions support BGP (multi-ISP) premium EIPs.</li>
         * </ul>
         * <p>For more information about BGP (multi-ISP) lines and BGP (multi-ISP) premium lines, see <a href="https://help.aliyun.com/document_detail/32321.html">EIP line types</a>.</p>
         * <p>If you are a whitelist user of single-ISP bandwidth, you can also select the following types:</p>
         * <ul>
         * <li><strong>ChinaTelecom</strong>: China Telecom</li>
         * <li><strong>ChinaUnicom</strong>: China Unicom</li>
         * <li><strong>ChinaMobile</strong>: China Mobile</li>
         * <li><strong>ChinaTelecom_L2</strong>: China Telecom L2</li>
         * <li><strong>ChinaUnicom_L2</strong>: China Unicom L2</li>
         * <li><strong>ChinaMobile_L2</strong>: China Mobile L2</li>
         * </ul>
         * <p>If you are an Alibaba Finance Cloud user, this parameter is required. Set the value to <strong>BGP_FinanceCloud</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>BGP</p>
         */
        public Builder isp(String isp) {
            this.putQueryParameter("Isp", isp);
            this.isp = isp;
            return this;
        }

        /**
         * <p>The network type. Set the value to <strong>public</strong>, which specifies the public network.</p>
         * 
         * <strong>example:</strong>
         * <p>public</p>
         */
        public Builder netmode(String netmode) {
            this.putQueryParameter("Netmode", netmode);
            this.netmode = netmode;
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
         * <p>The region ID of the contiguous EIPs.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the region ID.</p>
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
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-bp67acfmxazb4ph****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
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

        /**
         * <p>The zone of the contiguous EIP group.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-a</p>
         */
        public Builder zone(String zone) {
            this.putQueryParameter("Zone", zone);
            this.zone = zone;
            return this;
        }

        @Override
        public AllocateEipSegmentAddressRequest build() {
            return new AllocateEipSegmentAddressRequest(this);
        } 

    } 

}
