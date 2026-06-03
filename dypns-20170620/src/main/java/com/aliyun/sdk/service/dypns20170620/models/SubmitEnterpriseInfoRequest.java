// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypns20170620.models;

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
 * {@link SubmitEnterpriseInfoRequest} extends {@link RequestModel}
 *
 * <p>SubmitEnterpriseInfoRequest</p>
 */
public class SubmitEnterpriseInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BusinessLicenseAddress")
    @com.aliyun.core.annotation.Validation(required = true)
    private String businessLicenseAddress;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BusinessLicensePicture")
    @com.aliyun.core.annotation.Validation(required = true)
    private String businessLicensePicture;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnterpriseId")
    @com.aliyun.core.annotation.Validation()
    private Long enterpriseId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnterpriseName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String enterpriseName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LegalPersonCertNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private String legalPersonCertNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LegalPersonCertPicture")
    @com.aliyun.core.annotation.Validation(required = true)
    private String legalPersonCertPicture;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LegalPersonName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String legalPersonName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ManagerCertNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private String managerCertNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ManagerCertPicture")
    @com.aliyun.core.annotation.Validation(required = true)
    private String managerCertPicture;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ManagerContactNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private String managerContactNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ManagerName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String managerName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NumberApplicationLetterPicture")
    @com.aliyun.core.annotation.Validation(required = true)
    private String numberApplicationLetterPicture;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrganizationCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String organizationCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Remark")
    @com.aliyun.core.annotation.Validation(maxLength = 200)
    private String remark;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UndertakingPicture")
    @com.aliyun.core.annotation.Validation(required = true)
    private String undertakingPicture;

    private SubmitEnterpriseInfoRequest(Builder builder) {
        super(builder);
        this.businessLicenseAddress = builder.businessLicenseAddress;
        this.businessLicensePicture = builder.businessLicensePicture;
        this.enterpriseId = builder.enterpriseId;
        this.enterpriseName = builder.enterpriseName;
        this.legalPersonCertNumber = builder.legalPersonCertNumber;
        this.legalPersonCertPicture = builder.legalPersonCertPicture;
        this.legalPersonName = builder.legalPersonName;
        this.managerCertNumber = builder.managerCertNumber;
        this.managerCertPicture = builder.managerCertPicture;
        this.managerContactNumber = builder.managerContactNumber;
        this.managerName = builder.managerName;
        this.numberApplicationLetterPicture = builder.numberApplicationLetterPicture;
        this.organizationCode = builder.organizationCode;
        this.ownerId = builder.ownerId;
        this.remark = builder.remark;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.undertakingPicture = builder.undertakingPicture;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitEnterpriseInfoRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return businessLicenseAddress
     */
    public String getBusinessLicenseAddress() {
        return this.businessLicenseAddress;
    }

    /**
     * @return businessLicensePicture
     */
    public String getBusinessLicensePicture() {
        return this.businessLicensePicture;
    }

    /**
     * @return enterpriseId
     */
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    /**
     * @return enterpriseName
     */
    public String getEnterpriseName() {
        return this.enterpriseName;
    }

    /**
     * @return legalPersonCertNumber
     */
    public String getLegalPersonCertNumber() {
        return this.legalPersonCertNumber;
    }

    /**
     * @return legalPersonCertPicture
     */
    public String getLegalPersonCertPicture() {
        return this.legalPersonCertPicture;
    }

    /**
     * @return legalPersonName
     */
    public String getLegalPersonName() {
        return this.legalPersonName;
    }

    /**
     * @return managerCertNumber
     */
    public String getManagerCertNumber() {
        return this.managerCertNumber;
    }

    /**
     * @return managerCertPicture
     */
    public String getManagerCertPicture() {
        return this.managerCertPicture;
    }

    /**
     * @return managerContactNumber
     */
    public String getManagerContactNumber() {
        return this.managerContactNumber;
    }

    /**
     * @return managerName
     */
    public String getManagerName() {
        return this.managerName;
    }

    /**
     * @return numberApplicationLetterPicture
     */
    public String getNumberApplicationLetterPicture() {
        return this.numberApplicationLetterPicture;
    }

    /**
     * @return organizationCode
     */
    public String getOrganizationCode() {
        return this.organizationCode;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
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
     * @return undertakingPicture
     */
    public String getUndertakingPicture() {
        return this.undertakingPicture;
    }

    public static final class Builder extends Request.Builder<SubmitEnterpriseInfoRequest, Builder> {
        private String businessLicenseAddress; 
        private String businessLicensePicture; 
        private Long enterpriseId; 
        private String enterpriseName; 
        private String legalPersonCertNumber; 
        private String legalPersonCertPicture; 
        private String legalPersonName; 
        private String managerCertNumber; 
        private String managerCertPicture; 
        private String managerContactNumber; 
        private String managerName; 
        private String numberApplicationLetterPicture; 
        private String organizationCode; 
        private Long ownerId; 
        private String remark; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String undertakingPicture; 

        private Builder() {
            super();
        } 

        private Builder(SubmitEnterpriseInfoRequest request) {
            super(request);
            this.businessLicenseAddress = request.businessLicenseAddress;
            this.businessLicensePicture = request.businessLicensePicture;
            this.enterpriseId = request.enterpriseId;
            this.enterpriseName = request.enterpriseName;
            this.legalPersonCertNumber = request.legalPersonCertNumber;
            this.legalPersonCertPicture = request.legalPersonCertPicture;
            this.legalPersonName = request.legalPersonName;
            this.managerCertNumber = request.managerCertNumber;
            this.managerCertPicture = request.managerCertPicture;
            this.managerContactNumber = request.managerContactNumber;
            this.managerName = request.managerName;
            this.numberApplicationLetterPicture = request.numberApplicationLetterPicture;
            this.organizationCode = request.organizationCode;
            this.ownerId = request.ownerId;
            this.remark = request.remark;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.undertakingPicture = request.undertakingPicture;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder businessLicenseAddress(String businessLicenseAddress) {
            this.putQueryParameter("BusinessLicenseAddress", businessLicenseAddress);
            this.businessLicenseAddress = businessLicenseAddress;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder businessLicensePicture(String businessLicensePicture) {
            this.putQueryParameter("BusinessLicensePicture", businessLicensePicture);
            this.businessLicensePicture = businessLicensePicture;
            return this;
        }

        /**
         * EnterpriseId.
         */
        public Builder enterpriseId(Long enterpriseId) {
            this.putQueryParameter("EnterpriseId", enterpriseId);
            this.enterpriseId = enterpriseId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder enterpriseName(String enterpriseName) {
            this.putQueryParameter("EnterpriseName", enterpriseName);
            this.enterpriseName = enterpriseName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder legalPersonCertNumber(String legalPersonCertNumber) {
            this.putQueryParameter("LegalPersonCertNumber", legalPersonCertNumber);
            this.legalPersonCertNumber = legalPersonCertNumber;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder legalPersonCertPicture(String legalPersonCertPicture) {
            this.putQueryParameter("LegalPersonCertPicture", legalPersonCertPicture);
            this.legalPersonCertPicture = legalPersonCertPicture;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder legalPersonName(String legalPersonName) {
            this.putQueryParameter("LegalPersonName", legalPersonName);
            this.legalPersonName = legalPersonName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder managerCertNumber(String managerCertNumber) {
            this.putQueryParameter("ManagerCertNumber", managerCertNumber);
            this.managerCertNumber = managerCertNumber;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder managerCertPicture(String managerCertPicture) {
            this.putQueryParameter("ManagerCertPicture", managerCertPicture);
            this.managerCertPicture = managerCertPicture;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder managerContactNumber(String managerContactNumber) {
            this.putQueryParameter("ManagerContactNumber", managerContactNumber);
            this.managerContactNumber = managerContactNumber;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder managerName(String managerName) {
            this.putQueryParameter("ManagerName", managerName);
            this.managerName = managerName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder numberApplicationLetterPicture(String numberApplicationLetterPicture) {
            this.putQueryParameter("NumberApplicationLetterPicture", numberApplicationLetterPicture);
            this.numberApplicationLetterPicture = numberApplicationLetterPicture;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder organizationCode(String organizationCode) {
            this.putQueryParameter("OrganizationCode", organizationCode);
            this.organizationCode = organizationCode;
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
         * Remark.
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
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
         * <p>This parameter is required.</p>
         */
        public Builder undertakingPicture(String undertakingPicture) {
            this.putQueryParameter("UndertakingPicture", undertakingPicture);
            this.undertakingPicture = undertakingPicture;
            return this;
        }

        @Override
        public SubmitEnterpriseInfoRequest build() {
            return new SubmitEnterpriseInfoRequest(this);
        } 

    } 

}
