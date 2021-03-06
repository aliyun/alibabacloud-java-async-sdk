// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateExpressCloudConnectionRequest} extends {@link RequestModel}
 *
 * <p>CreateExpressCloudConnectionRequest</p>
 */
public class CreateExpressCloudConnectionRequest extends Request {
    @Query
    @NameInMap("Bandwidth")
    @Validation(required = true)
    private Integer bandwidth;

    @Query
    @NameInMap("ContactMail")
    private String contactMail;

    @Query
    @NameInMap("ContactTel")
    private String contactTel;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("IDCardNo")
    private String IDCardNo;

    @Query
    @NameInMap("IdcSP")
    @Validation(required = true)
    private String idcSP;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PeerCity")
    private String peerCity;

    @Query
    @NameInMap("PeerLocation")
    @Validation(required = true)
    private String peerLocation;

    @Query
    @NameInMap("PortType")
    private String portType;

    @Query
    @NameInMap("RedundantEccId")
    private String redundantEccId;

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

    private CreateExpressCloudConnectionRequest(Builder builder) {
        super(builder);
        this.bandwidth = builder.bandwidth;
        this.contactMail = builder.contactMail;
        this.contactTel = builder.contactTel;
        this.description = builder.description;
        this.IDCardNo = builder.IDCardNo;
        this.idcSP = builder.idcSP;
        this.name = builder.name;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.peerCity = builder.peerCity;
        this.peerLocation = builder.peerLocation;
        this.portType = builder.portType;
        this.redundantEccId = builder.redundantEccId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateExpressCloudConnectionRequest create() {
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
     * @return contactMail
     */
    public String getContactMail() {
        return this.contactMail;
    }

    /**
     * @return contactTel
     */
    public String getContactTel() {
        return this.contactTel;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return IDCardNo
     */
    public String getIDCardNo() {
        return this.IDCardNo;
    }

    /**
     * @return idcSP
     */
    public String getIdcSP() {
        return this.idcSP;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
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
     * @return peerCity
     */
    public String getPeerCity() {
        return this.peerCity;
    }

    /**
     * @return peerLocation
     */
    public String getPeerLocation() {
        return this.peerLocation;
    }

    /**
     * @return portType
     */
    public String getPortType() {
        return this.portType;
    }

    /**
     * @return redundantEccId
     */
    public String getRedundantEccId() {
        return this.redundantEccId;
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

    public static final class Builder extends Request.Builder<CreateExpressCloudConnectionRequest, Builder> {
        private Integer bandwidth; 
        private String contactMail; 
        private String contactTel; 
        private String description; 
        private String IDCardNo; 
        private String idcSP; 
        private String name; 
        private String ownerAccount; 
        private Long ownerId; 
        private String peerCity; 
        private String peerLocation; 
        private String portType; 
        private String redundantEccId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(CreateExpressCloudConnectionRequest response) {
            super(response);
            this.bandwidth = response.bandwidth;
            this.contactMail = response.contactMail;
            this.contactTel = response.contactTel;
            this.description = response.description;
            this.IDCardNo = response.IDCardNo;
            this.idcSP = response.idcSP;
            this.name = response.name;
            this.ownerAccount = response.ownerAccount;
            this.ownerId = response.ownerId;
            this.peerCity = response.peerCity;
            this.peerLocation = response.peerLocation;
            this.portType = response.portType;
            this.redundantEccId = response.redundantEccId;
            this.regionId = response.regionId;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
        } 

        /**
         * Bandwidth.
         */
        public Builder bandwidth(Integer bandwidth) {
            this.putQueryParameter("Bandwidth", bandwidth);
            this.bandwidth = bandwidth;
            return this;
        }

        /**
         * ContactMail.
         */
        public Builder contactMail(String contactMail) {
            this.putQueryParameter("ContactMail", contactMail);
            this.contactMail = contactMail;
            return this;
        }

        /**
         * ContactTel.
         */
        public Builder contactTel(String contactTel) {
            this.putQueryParameter("ContactTel", contactTel);
            this.contactTel = contactTel;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * IDCardNo.
         */
        public Builder IDCardNo(String IDCardNo) {
            this.putQueryParameter("IDCardNo", IDCardNo);
            this.IDCardNo = IDCardNo;
            return this;
        }

        /**
         * IdcSP.
         */
        public Builder idcSP(String idcSP) {
            this.putQueryParameter("IdcSP", idcSP);
            this.idcSP = idcSP;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
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
         * PeerCity.
         */
        public Builder peerCity(String peerCity) {
            this.putQueryParameter("PeerCity", peerCity);
            this.peerCity = peerCity;
            return this;
        }

        /**
         * PeerLocation.
         */
        public Builder peerLocation(String peerLocation) {
            this.putQueryParameter("PeerLocation", peerLocation);
            this.peerLocation = peerLocation;
            return this;
        }

        /**
         * PortType.
         */
        public Builder portType(String portType) {
            this.putQueryParameter("PortType", portType);
            this.portType = portType;
            return this;
        }

        /**
         * RedundantEccId.
         */
        public Builder redundantEccId(String redundantEccId) {
            this.putQueryParameter("RedundantEccId", redundantEccId);
            this.redundantEccId = redundantEccId;
            return this;
        }

        /**
         * RegionId.
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
        public CreateExpressCloudConnectionRequest build() {
            return new CreateExpressCloudConnectionRequest(this);
        } 

    } 

}
