// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ApplyPhysicalConnectionLOARequest} extends {@link RequestModel}
 *
 * <p>ApplyPhysicalConnectionLOARequest</p>
 */
public class ApplyPhysicalConnectionLOARequest extends Request {
    @Query
    @NameInMap("Bandwidth")
    private Integer bandwidth;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("CompanyName")
    @Validation(required = true)
    private String companyName;

    @Query
    @NameInMap("ConstructionTime")
    @Validation(required = true)
    private String constructionTime;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("LineType")
    @Validation(required = true)
    private String lineType;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PMInfo")
    private java.util.List < PMInfo> PMInfo;

    @Query
    @NameInMap("PeerLocation")
    private String peerLocation;

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

    @Query
    @NameInMap("Si")
    @Validation(required = true)
    private String si;

    private ApplyPhysicalConnectionLOARequest(Builder builder) {
        super(builder);
        this.bandwidth = builder.bandwidth;
        this.clientToken = builder.clientToken;
        this.companyName = builder.companyName;
        this.constructionTime = builder.constructionTime;
        this.instanceId = builder.instanceId;
        this.lineType = builder.lineType;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.PMInfo = builder.PMInfo;
        this.peerLocation = builder.peerLocation;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.si = builder.si;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApplyPhysicalConnectionLOARequest create() {
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
     * @return companyName
     */
    public String getCompanyName() {
        return this.companyName;
    }

    /**
     * @return constructionTime
     */
    public String getConstructionTime() {
        return this.constructionTime;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return lineType
     */
    public String getLineType() {
        return this.lineType;
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
     * @return PMInfo
     */
    public java.util.List < PMInfo> getPMInfo() {
        return this.PMInfo;
    }

    /**
     * @return peerLocation
     */
    public String getPeerLocation() {
        return this.peerLocation;
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

    /**
     * @return si
     */
    public String getSi() {
        return this.si;
    }

    public static final class Builder extends Request.Builder<ApplyPhysicalConnectionLOARequest, Builder> {
        private Integer bandwidth; 
        private String clientToken; 
        private String companyName; 
        private String constructionTime; 
        private String instanceId; 
        private String lineType; 
        private String ownerAccount; 
        private Long ownerId; 
        private java.util.List < PMInfo> PMInfo; 
        private String peerLocation; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String si; 

        private Builder() {
            super();
        } 

        private Builder(ApplyPhysicalConnectionLOARequest response) {
            super(response);
            this.bandwidth = response.bandwidth;
            this.clientToken = response.clientToken;
            this.companyName = response.companyName;
            this.constructionTime = response.constructionTime;
            this.instanceId = response.instanceId;
            this.lineType = response.lineType;
            this.ownerAccount = response.ownerAccount;
            this.ownerId = response.ownerId;
            this.PMInfo = response.PMInfo;
            this.peerLocation = response.peerLocation;
            this.regionId = response.regionId;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
            this.si = response.si;
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
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * CompanyName.
         */
        public Builder companyName(String companyName) {
            this.putQueryParameter("CompanyName", companyName);
            this.companyName = companyName;
            return this;
        }

        /**
         * ConstructionTime.
         */
        public Builder constructionTime(String constructionTime) {
            this.putQueryParameter("ConstructionTime", constructionTime);
            this.constructionTime = constructionTime;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * LineType.
         */
        public Builder lineType(String lineType) {
            this.putQueryParameter("LineType", lineType);
            this.lineType = lineType;
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
         * PMInfo.
         */
        public Builder PMInfo(java.util.List < PMInfo> PMInfo) {
            this.putQueryParameter("PMInfo", PMInfo);
            this.PMInfo = PMInfo;
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

        /**
         * Si.
         */
        public Builder si(String si) {
            this.putQueryParameter("Si", si);
            this.si = si;
            return this;
        }

        @Override
        public ApplyPhysicalConnectionLOARequest build() {
            return new ApplyPhysicalConnectionLOARequest(this);
        } 

    } 

    public static class PMInfo extends TeaModel {
        @NameInMap("PMCertificateNo")
        private String PMCertificateNo;

        @NameInMap("PMCertificateType")
        private String PMCertificateType;

        @NameInMap("PMContactInfo")
        private String PMContactInfo;

        @NameInMap("PMGender")
        private String PMGender;

        @NameInMap("PMName")
        private String PMName;

        private PMInfo(Builder builder) {
            this.PMCertificateNo = builder.PMCertificateNo;
            this.PMCertificateType = builder.PMCertificateType;
            this.PMContactInfo = builder.PMContactInfo;
            this.PMGender = builder.PMGender;
            this.PMName = builder.PMName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PMInfo create() {
            return builder().build();
        }

        /**
         * @return PMCertificateNo
         */
        public String getPMCertificateNo() {
            return this.PMCertificateNo;
        }

        /**
         * @return PMCertificateType
         */
        public String getPMCertificateType() {
            return this.PMCertificateType;
        }

        /**
         * @return PMContactInfo
         */
        public String getPMContactInfo() {
            return this.PMContactInfo;
        }

        /**
         * @return PMGender
         */
        public String getPMGender() {
            return this.PMGender;
        }

        /**
         * @return PMName
         */
        public String getPMName() {
            return this.PMName;
        }

        public static final class Builder {
            private String PMCertificateNo; 
            private String PMCertificateType; 
            private String PMContactInfo; 
            private String PMGender; 
            private String PMName; 

            /**
             * PMCertificateNo.
             */
            public Builder PMCertificateNo(String PMCertificateNo) {
                this.PMCertificateNo = PMCertificateNo;
                return this;
            }

            /**
             * PMCertificateType.
             */
            public Builder PMCertificateType(String PMCertificateType) {
                this.PMCertificateType = PMCertificateType;
                return this;
            }

            /**
             * PMContactInfo.
             */
            public Builder PMContactInfo(String PMContactInfo) {
                this.PMContactInfo = PMContactInfo;
                return this;
            }

            /**
             * PMGender.
             */
            public Builder PMGender(String PMGender) {
                this.PMGender = PMGender;
                return this;
            }

            /**
             * PMName.
             */
            public Builder PMName(String PMName) {
                this.PMName = PMName;
                return this;
            }

            public PMInfo build() {
                return new PMInfo(this);
            } 

        } 

    }
}
