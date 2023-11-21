// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateNatIpCidrRequest} extends {@link RequestModel}
 *
 * <p>CreateNatIpCidrRequest</p>
 */
public class CreateNatIpCidrRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("NatGatewayId")
    @Validation(required = true)
    private String natGatewayId;

    @Query
    @NameInMap("NatIpCidr")
    @Validation(required = true)
    private String natIpCidr;

    @Query
    @NameInMap("NatIpCidrDescription")
    private String natIpCidrDescription;

    @Query
    @NameInMap("NatIpCidrName")
    private String natIpCidrName;

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
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private CreateNatIpCidrRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.natGatewayId = builder.natGatewayId;
        this.natIpCidr = builder.natIpCidr;
        this.natIpCidrDescription = builder.natIpCidrDescription;
        this.natIpCidrName = builder.natIpCidrName;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateNatIpCidrRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return natGatewayId
     */
    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    /**
     * @return natIpCidr
     */
    public String getNatIpCidr() {
        return this.natIpCidr;
    }

    /**
     * @return natIpCidrDescription
     */
    public String getNatIpCidrDescription() {
        return this.natIpCidrDescription;
    }

    /**
     * @return natIpCidrName
     */
    public String getNatIpCidrName() {
        return this.natIpCidrName;
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

    public static final class Builder extends Request.Builder<CreateNatIpCidrRequest, Builder> {
        private String clientToken; 
        private Boolean dryRun; 
        private String natGatewayId; 
        private String natIpCidr; 
        private String natIpCidrDescription; 
        private String natIpCidrName; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(CreateNatIpCidrRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.natGatewayId = request.natGatewayId;
            this.natIpCidr = request.natIpCidr;
            this.natIpCidrDescription = request.natIpCidrDescription;
            this.natIpCidrName = request.natIpCidrName;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * The client token that is used to ensure the idempotence of the request.
         * <p>
         * 
         * You can use the client to generate the token, but you must make sure that the token is unique among different requests. The client token can contain only ASCII characters.
         * 
         * >  If you do not specify this parameter, the system automatically uses the **request ID** as the **client token**. The **request ID** may be different for each request.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Specifies whether to perform only a dry run, without performing the actual request. Valid values:
         * <p>
         * 
         * *   **true**: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the `DryRunOperation` error code is returned.
         * *   **false**(default): performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * The ID of the Virtual Private Cloud (VPC) NAT gateway with which you want to associate the CIDR block.
         */
        public Builder natGatewayId(String natGatewayId) {
            this.putQueryParameter("NatGatewayId", natGatewayId);
            this.natGatewayId = natGatewayId;
            return this;
        }

        /**
         * The NAT CIDR block that you want to associate with the NAT gateway.
         * <p>
         * 
         * The new CIDR block must meet the following conditions:
         * 
         * *   The NAT CIDR block must fall within 10.0.0.0/8, 172.16.0.0/12, 192.168.0.0/16, or their subnets.
         * *   The subnet mask must be 16 to 32 bits in length.
         * *   The NAT CIDR block cannot overlap with the private CIDR block of the VPC to which the NAT gateway belongs. If you want to use other IP addresses from the private CIDR block of the VPC to provide NAT services, create a vSwitch and attach the vSwitch to another VPC NAT gateway.
         * *   If you want to use public IP addresses to provide NAT services, make sure that the public IP addresses fall within a customer CIDR block of the VPC to which the VPC NAT gateway belongs. For more information, see [What is customer CIDR block?](~~185311~~).
         */
        public Builder natIpCidr(String natIpCidr) {
            this.putQueryParameter("NatIpCidr", natIpCidr);
            this.natIpCidr = natIpCidr;
            return this;
        }

        /**
         * The description of the NAT CIDR block.
         * <p>
         * 
         * The description must be 2 to 256 characters in length and start with a letter. The description cannot start with `http://` or `https://`.
         */
        public Builder natIpCidrDescription(String natIpCidrDescription) {
            this.putQueryParameter("NatIpCidrDescription", natIpCidrDescription);
            this.natIpCidrDescription = natIpCidrDescription;
            return this;
        }

        /**
         * The name of the CIDR block.
         * <p>
         * 
         * The name must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (\_), and hyphens (-). It must start with a letter. The name must start with a letter and cannot start with `http://` or `https://`.
         */
        public Builder natIpCidrName(String natIpCidrName) {
            this.putQueryParameter("NatIpCidrName", natIpCidrName);
            this.natIpCidrName = natIpCidrName;
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
         * The region ID of the NAT gateway with which you want to associate the CIDR block.
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
        public CreateNatIpCidrRequest build() {
            return new CreateNatIpCidrRequest(this);
        } 

    } 

}
