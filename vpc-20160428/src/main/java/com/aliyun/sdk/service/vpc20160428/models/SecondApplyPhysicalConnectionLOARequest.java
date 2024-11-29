// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SecondApplyPhysicalConnectionLOARequest} extends {@link RequestModel}
 *
 * <p>SecondApplyPhysicalConnectionLOARequest</p>
 */
public class SecondApplyPhysicalConnectionLOARequest extends Request {
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

    private SecondApplyPhysicalConnectionLOARequest(Builder builder) {
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

    public static SecondApplyPhysicalConnectionLOARequest create() {
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

    public static final class Builder extends Request.Builder<SecondApplyPhysicalConnectionLOARequest, Builder> {
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

        private Builder(SecondApplyPhysicalConnectionLOARequest request) {
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
         * <p>The bandwidth of the Express Connect circuit. Unit: Mbit/s.</p>
         * <p>Valid values: <strong>2</strong> to <strong>10240</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder bandwidth(Integer bandwidth) {
            this.putQueryParameter("Bandwidth", bandwidth);
            this.bandwidth = bandwidth;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests.</p>
         * <blockquote>
         * <p> If you do not specify this parameter, the system automatically uses the request ID as the client token. The request ID may be different for each request.</p>
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
         * <p>The name of the customer company that requires the Express Connect circuit.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>company</p>
         */
        public Builder companyName(String companyName) {
            this.putQueryParameter("CompanyName", companyName);
            this.companyName = companyName;
            return this;
        }

        /**
         * <p>The time when construction started. Specify the time in the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time is displayed in UTC.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-02-28T16:00:00Z</p>
         */
        public Builder constructionTime(String constructionTime) {
            this.putQueryParameter("ConstructionTime", constructionTime);
            this.constructionTime = constructionTime;
            return this;
        }

        /**
         * <p>The ID of the Express Connect circuit.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-bp1qrb3044eqi****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The type of Express Connect circuit. Valid values:</p>
         * <ul>
         * <li><strong>MSTP</strong></li>
         * <li><strong>MPLSVPN</strong></li>
         * <li><strong>FIBRE</strong></li>
         * <li><strong>Other</strong></li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>FIBRE</p>
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
         * <p>The information about the construction engineer.</p>
         */
        public Builder PMInfo(java.util.List < PMInfo> PMInfo) {
            this.putQueryParameter("PMInfo", PMInfo);
            this.PMInfo = PMInfo;
            return this;
        }

        /**
         * <p>The geographic location where the Express Connect circuit is deployed.</p>
         * 
         * <strong>example:</strong>
         * <p>XX Number, XX Road, XX Town, XX District, Hangzhou City, Zhejiang Province.</p>
         */
        public Builder peerLocation(String peerLocation) {
            this.putQueryParameter("PeerLocation", peerLocation);
            this.peerLocation = peerLocation;
            return this;
        }

        /**
         * <p>The region where the Express Connect circuit is deployed. You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the most recent region list.</p>
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
         * <p>The construction company.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>company</p>
         */
        public Builder si(String si) {
            this.putQueryParameter("Si", si);
            this.si = si;
            return this;
        }

        @Override
        public SecondApplyPhysicalConnectionLOARequest build() {
            return new SecondApplyPhysicalConnectionLOARequest(this);
        } 

    } 

    /**
     * 
     * {@link SecondApplyPhysicalConnectionLOARequest} extends {@link TeaModel}
     *
     * <p>SecondApplyPhysicalConnectionLOARequest</p>
     */
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
             * <p>The ID number of the construction engineer. You can specify the ID number of an ID card or an international passport.</p>
             * <p>You can configure information for up to 16 construction engineers.</p>
             * 
             * <strong>example:</strong>
             * <p>5****************9</p>
             */
            public Builder PMCertificateNo(String PMCertificateNo) {
                this.PMCertificateNo = PMCertificateNo;
                return this;
            }

            /**
             * <p>The type of the identity document of the construction engineer. Valid values:</p>
             * <ul>
             * <li><strong>IDCard</strong></li>
             * <li><strong>Passport</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>IDCard</p>
             */
            public Builder PMCertificateType(String PMCertificateType) {
                this.PMCertificateType = PMCertificateType;
                return this;
            }

            /**
             * <p>The contact information about the construction engineer.</p>
             * 
             * <strong>example:</strong>
             * <p>1390000****</p>
             */
            public Builder PMContactInfo(String PMContactInfo) {
                this.PMContactInfo = PMContactInfo;
                return this;
            }

            /**
             * <p>The gender of the construction engineer.</p>
             * 
             * <strong>example:</strong>
             * <p>Male</p>
             */
            public Builder PMGender(String PMGender) {
                this.PMGender = PMGender;
                return this;
            }

            /**
             * <p>The name of the construction engineer.</p>
             * 
             * <strong>example:</strong>
             * <p>Zhangsan</p>
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
