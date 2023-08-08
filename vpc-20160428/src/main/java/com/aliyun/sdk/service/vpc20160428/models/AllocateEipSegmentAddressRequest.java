// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AllocateEipSegmentAddressRequest} extends {@link RequestModel}
 *
 * <p>AllocateEipSegmentAddressRequest</p>
 */
public class AllocateEipSegmentAddressRequest extends Request {
    @Query
    @NameInMap("Bandwidth")
    private String bandwidth;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("EipMask")
    @Validation(required = true)
    private String eipMask;

    @Query
    @NameInMap("InternetChargeType")
    private String internetChargeType;

    @Query
    @NameInMap("Isp")
    private String isp;

    @Query
    @NameInMap("Netmode")
    private String netmode;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("Zone")
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
         * The maximum bandwidth of the EIP. Unit: Mbit/s.
         * <p>
         * 
         * *   When **InstanceChargeType** is set to **PostPaid** and **InternetChargeType** is set to **PayByBandwidth**, the valid values for **Bandwidth** are **1** to **500**.
         * *   When **InstanceChargeType** is set to **PostPaid** and **InternetChargeType** is set to **PayByTraffic**, the valid values for **Bandwidth** are **1** to **200**.
         * *   When **InstanceChargeType** is set to **PrePaid**, the valid values for **Bandwidth** are **1** to **1000**.
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
         * You can use the client to generate the token, but you must make sure that the token is unique among all requests. The **client token** can contain only ASCII characters. 
         * 
         * >  If you do not specify this parameter, the system uses **RequestId** as **ClientToken**. The value of **RequestId** for each API request may be different.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The subnet mask length of the contiguous EIPs. Valid values:
         * <p>
         * 
         * - **28**: applies for 16 contiguous EIPs in each call.
         * - **27**: applies for 32 contiguous EIPs in each call.
         * - **26**: applies for 64 contiguous EIPs each call.
         * - **25**: applies for 128 contiguous EIPs in each call.
         * - **24**: applies for 256 contiguous EIPs in each call.
         * 
         * >  The number of contiguous EIPs allocated by the system may be less than the requested number because one, three, or four EIPs may be reserved.
         */
        public Builder eipMask(String eipMask) {
            this.putQueryParameter("EipMask", eipMask);
            this.eipMask = eipMask;
            return this;
        }

        /**
         * The metering method of the contiguous EIPs. Valid values:
         * <p>
         * 
         * *   **PayByBandwidth** (default): pay-by-bandwidth
         * *   **PayByTraffic**: pay-by-data-transfer
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
         * *   **BGP** (default): BGP (Multi-ISP) lines All regions support BGP (Multi-ISP) EIPs.
         * *   **BGP_PRO**: BGP (Multi-ISP) Pro lines. Only the following regions support BGP (Multi-ISP) Pro lines: China (Hong Kong), Singapore, Malaysia (Kuala Lumpur), Philippines (Manila), Indonesia (Jakarta), and Thailand (Bangkok).
         * 
         * For more information about BGP (Multi-ISP) and BGP (Multi-ISP) Pro, see [EIP line types](~~32321~~).
         * 
         * If you are allowed to use single-ISP bandwidth, you can also choose one of the following values:
         * 
         * *   **ChinaTelecom**: China Telecom
         * *   **ChinaUnicom**: China Unicom
         * *   **ChinaMobile**: China Mobile
         * *   **ChinaTelecom_L2**: China Telecom L2
         * *   **ChinaUnicom_L2**: China Unicom L2
         * *   **ChinaMobile_L2**: China Mobile L2
         * 
         * If your services are deployed in China East 1 Finance, this parameter is required and you must set the value to **BGP_FinanceCloud**.
         */
        public Builder isp(String isp) {
            this.putQueryParameter("Isp", isp);
            this.isp = isp;
            return this;
        }

        /**
         * Set the value to **public**, which specifies the Internet.
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
         * The region ID of the contiguous EIPs.
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
         * The ID of the resource group.
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
         * Zone.
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
