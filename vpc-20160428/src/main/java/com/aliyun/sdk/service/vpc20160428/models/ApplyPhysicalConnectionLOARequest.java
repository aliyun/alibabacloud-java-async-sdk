// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ApplyPhysicalConnectionLOARequest} extends {@link RequestModel}
 *
 * <p>ApplyPhysicalConnectionLOARequest</p>
 */
public class ApplyPhysicalConnectionLOARequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Bandwidth")
    private Integer bandwidth;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CompanyName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String companyName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConstructionTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String constructionTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LineType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String lineType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PMInfo")
    private java.util.List < PMInfo> PMInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PeerLocation")
    private String peerLocation;

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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Si")
    @com.aliyun.core.annotation.Validation(required = true)
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

        private Builder(ApplyPhysicalConnectionLOARequest request) {
            super(request);
            this.bandwidth = request.bandwidth;
            this.clientToken = request.clientToken;
            this.companyName = request.companyName;
            this.constructionTime = request.constructionTime;
            this.instanceId = request.instanceId;
            this.lineType = request.lineType;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.PMInfo = request.PMInfo;
            this.peerLocation = request.peerLocation;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.si = request.si;
        } 

        /**
         * The bandwidth of the Express Connect circuit. Unit: Mbit/s.
         * <p>
         * 
         * Valid values: **2** to **10240**.
         */
        public Builder bandwidth(Integer bandwidth) {
            this.putQueryParameter("Bandwidth", bandwidth);
            this.bandwidth = bandwidth;
            return this;
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
         * The name of the customer company that requires the Express Connect circuit.
         */
        public Builder companyName(String companyName) {
            this.putQueryParameter("CompanyName", companyName);
            this.companyName = companyName;
            return this;
        }

        /**
         * The time when construction started. Specify the time in the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time is displayed in UTC.
         */
        public Builder constructionTime(String constructionTime) {
            this.putQueryParameter("ConstructionTime", constructionTime);
            this.constructionTime = constructionTime;
            return this;
        }

        /**
         * The ID of the Express Connect circuit.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The type of the Express Connect circuit. Valid values:
         * <p>
         * 
         * *   **MSTP**: MSTP line
         * *   **MPLSVPN**: MPLSVPN line
         * *   **FIBRE**: fiber line
         * *   **Other**: other types
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
         * The information about the construction engineer.
         */
        public Builder PMInfo(java.util.List < PMInfo> PMInfo) {
            this.putQueryParameter("PMInfo", PMInfo);
            this.PMInfo = PMInfo;
            return this;
        }

        /**
         * The geographic location where the Express Connect circuit is deployed.
         */
        public Builder peerLocation(String peerLocation) {
            this.putQueryParameter("PeerLocation", peerLocation);
            this.peerLocation = peerLocation;
            return this;
        }

        /**
         * The region ID of the Express Connect circuit.
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

        /**
         * The construction company.
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
        @com.aliyun.core.annotation.NameInMap("PMCertificateNo")
        private String PMCertificateNo;

        @com.aliyun.core.annotation.NameInMap("PMCertificateType")
        private String PMCertificateType;

        @com.aliyun.core.annotation.NameInMap("PMContactInfo")
        private String PMContactInfo;

        @com.aliyun.core.annotation.NameInMap("PMGender")
        private String PMGender;

        @com.aliyun.core.annotation.NameInMap("PMName")
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
             * The ID number of the construction engineer. You can specify the ID number of an ID card or an international passport.
             * <p>
             * 
             * You can configure information for up to 16 construction engineers.
             */
            public Builder PMCertificateNo(String PMCertificateNo) {
                this.PMCertificateNo = PMCertificateNo;
                return this;
            }

            /**
             * The type of the identity document of the construction engineer. Valid values:
             * <p>
             * 
             * *   **IDCard**
             * *   **Passport**
             */
            public Builder PMCertificateType(String PMCertificateType) {
                this.PMCertificateType = PMCertificateType;
                return this;
            }

            /**
             * The contact information about the construction engineer.
             */
            public Builder PMContactInfo(String PMContactInfo) {
                this.PMContactInfo = PMContactInfo;
                return this;
            }

            /**
             * The gender of the construction engineer.
             */
            public Builder PMGender(String PMGender) {
                this.PMGender = PMGender;
                return this;
            }

            /**
             * The name of the construction engineer.
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
