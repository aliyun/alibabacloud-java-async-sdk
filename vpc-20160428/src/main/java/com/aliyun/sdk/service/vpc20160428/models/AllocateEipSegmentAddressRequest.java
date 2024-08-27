// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * The maximum bandwidth of the contiguous EIP group. Unit: Mbit/s.
         * <p>
         * 
         * *   Valid values when **InstanceChargeType** is set to **PostPaid** and **InternetChargeType** is set to **PayByBandwidth**: **1** to **500**.****
         * *   Valid values when **InstanceChargeType** is set to **PostPaid** and **InternetChargeType** is set to **PayByTraffic**: **1** to **200**.****
         * *   Valid values when **InstanceChargeType** is set to **PrePaid**: **1** to **1000**.****
         * 
         * Default value: **5**. Unit: Mbit/s.
         */
        public Builder bandwidth(String bandwidth) {
            this.putQueryParameter("Bandwidth", bandwidth);
            this.bandwidth = bandwidth;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request.
         * <p>
         * 
         * You can use the client to generate a token, but you must make sure that the token is unique among different requests. **ClientToken** can contain only ASCII characters.
         * 
         * >  If you do not specify this parameter, the system automatically uses the **request ID** as the **client token**. The **request ID** may be different for each request.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The subnet mask of the contiguous EIP group. Valid values:
         * <p>
         * 
         * *   **28**: applies for 16 contiguous EIPs in each call.
         * *   **27**: applies for 32 contiguous EIPs in each call.
         * *   **26**: applies for 64 contiguous EIPs in each call.
         * *   **25**: applies for 128 contiguous EIPs in each call.
         * *   **24**: applies for 256 contiguous EIPs in each call.
         * 
         * >  Some IP address are reserved for specific purposes. Therefore, the actual number of the contiguous EIPs may be one, three, or four less than the expected number.
         */
        public Builder eipMask(String eipMask) {
            this.putQueryParameter("EipMask", eipMask);
            this.eipMask = eipMask;
            return this;
        }

        /**
         * The metering method of contiguous EIPs. Valid values:
         * <p>
         * 
         * *   **PayByBandwidth** (default)
         * *   **PayByTraffic**
         */
        public Builder internetChargeType(String internetChargeType) {
            this.putQueryParameter("InternetChargeType", internetChargeType);
            this.internetChargeType = internetChargeType;
            return this;
        }

        /**
         * The line type. Valid values:
         * <p>
         * 
         * *   **BGP** (default): BGP (Multi-ISP) line The BGP (Multi-ISP) line is supported in all regions.
         * *   **BGP_PRO**: BGP (Multi-ISP) Pro line BGP (Multi-ISP) Pro line is supported only in the China (Hong Kong), Singapore, Japan (Tokyo), Malaysia (Kuala Lumpur), Philippines (Manila), Indonesia (Jakarta), and Thailand (Bangkok) regions.
         * 
         * For more information about the BGP (Multi-ISP) line and BGP (Multi-ISP) Pro line, see [EIP line types](~~32321~~).
         * 
         * If you are allowed to use single-ISP bandwidth, you can also use one of the following values:
         * 
         * *   **ChinaTelecom**
         * *   **ChinaUnicom**
         * *   **ChinaMobile**
         * *   **ChinaTelecom_L2**
         * *   **ChinaUnicom_L2**
         * *   **ChinaMobile_L2**
         * 
         * If your services are deployed in China East 1 Finance, this parameter is required and you must set the parameter to **BGP_FinanceCloud**.
         */
        public Builder isp(String isp) {
            this.putQueryParameter("Isp", isp);
            this.isp = isp;
            return this;
        }

        /**
         * The network type. Set the value to **public**, which specifies the public network type.
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
         * The ID of the region in which the contiguous EIP group resides.
         * <p>
         * 
         * You can call the [DescribeRegions](~~36063~~) operation to query the region ID.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The resource group ID.
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
         * The zone of the contiguous EIP group.
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
