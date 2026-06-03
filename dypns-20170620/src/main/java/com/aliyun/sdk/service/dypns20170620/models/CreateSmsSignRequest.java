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
 * {@link CreateSmsSignRequest} extends {@link RequestModel}
 *
 * <p>CreateSmsSignRequest</p>
 */
public class CreateSmsSignRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppUrl")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 100)
    private String appUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BusinessLicenseCert")
    @com.aliyun.core.annotation.Validation(required = true)
    private String businessLicenseCert;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CertType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String certType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExtendMessage")
    private String extendMessage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OldSmsSignName")
    private String oldSmsSignName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderId")
    private String orderId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrganizationCodeCert")
    private String organizationCodeCert;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProdCode")
    private String prodCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SmsSignName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String smsSignName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SmsSignRemark")
    @com.aliyun.core.annotation.Validation(required = true)
    private String smsSignRemark;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SmsSignSource")
    @com.aliyun.core.annotation.Validation(required = true)
    private String smsSignSource;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaxRegistrationCert")
    private String taxRegistrationCert;

    private CreateSmsSignRequest(Builder builder) {
        super(builder);
        this.appUrl = builder.appUrl;
        this.businessLicenseCert = builder.businessLicenseCert;
        this.certType = builder.certType;
        this.extendMessage = builder.extendMessage;
        this.oldSmsSignName = builder.oldSmsSignName;
        this.orderId = builder.orderId;
        this.organizationCodeCert = builder.organizationCodeCert;
        this.ownerId = builder.ownerId;
        this.prodCode = builder.prodCode;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.smsSignName = builder.smsSignName;
        this.smsSignRemark = builder.smsSignRemark;
        this.smsSignSource = builder.smsSignSource;
        this.taxRegistrationCert = builder.taxRegistrationCert;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSmsSignRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appUrl
     */
    public String getAppUrl() {
        return this.appUrl;
    }

    /**
     * @return businessLicenseCert
     */
    public String getBusinessLicenseCert() {
        return this.businessLicenseCert;
    }

    /**
     * @return certType
     */
    public String getCertType() {
        return this.certType;
    }

    /**
     * @return extendMessage
     */
    public String getExtendMessage() {
        return this.extendMessage;
    }

    /**
     * @return oldSmsSignName
     */
    public String getOldSmsSignName() {
        return this.oldSmsSignName;
    }

    /**
     * @return orderId
     */
    public String getOrderId() {
        return this.orderId;
    }

    /**
     * @return organizationCodeCert
     */
    public String getOrganizationCodeCert() {
        return this.organizationCodeCert;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return prodCode
     */
    public String getProdCode() {
        return this.prodCode;
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
     * @return smsSignName
     */
    public String getSmsSignName() {
        return this.smsSignName;
    }

    /**
     * @return smsSignRemark
     */
    public String getSmsSignRemark() {
        return this.smsSignRemark;
    }

    /**
     * @return smsSignSource
     */
    public String getSmsSignSource() {
        return this.smsSignSource;
    }

    /**
     * @return taxRegistrationCert
     */
    public String getTaxRegistrationCert() {
        return this.taxRegistrationCert;
    }

    public static final class Builder extends Request.Builder<CreateSmsSignRequest, Builder> {
        private String appUrl; 
        private String businessLicenseCert; 
        private String certType; 
        private String extendMessage; 
        private String oldSmsSignName; 
        private String orderId; 
        private String organizationCodeCert; 
        private Long ownerId; 
        private String prodCode; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String smsSignName; 
        private String smsSignRemark; 
        private String smsSignSource; 
        private String taxRegistrationCert; 

        private Builder() {
            super();
        } 

        private Builder(CreateSmsSignRequest request) {
            super(request);
            this.appUrl = request.appUrl;
            this.businessLicenseCert = request.businessLicenseCert;
            this.certType = request.certType;
            this.extendMessage = request.extendMessage;
            this.oldSmsSignName = request.oldSmsSignName;
            this.orderId = request.orderId;
            this.organizationCodeCert = request.organizationCodeCert;
            this.ownerId = request.ownerId;
            this.prodCode = request.prodCode;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.smsSignName = request.smsSignName;
            this.smsSignRemark = request.smsSignRemark;
            this.smsSignSource = request.smsSignSource;
            this.taxRegistrationCert = request.taxRegistrationCert;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder appUrl(String appUrl) {
            this.putQueryParameter("AppUrl", appUrl);
            this.appUrl = appUrl;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder businessLicenseCert(String businessLicenseCert) {
            this.putQueryParameter("BusinessLicenseCert", businessLicenseCert);
            this.businessLicenseCert = businessLicenseCert;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder certType(String certType) {
            this.putQueryParameter("CertType", certType);
            this.certType = certType;
            return this;
        }

        /**
         * ExtendMessage.
         */
        public Builder extendMessage(String extendMessage) {
            this.putQueryParameter("ExtendMessage", extendMessage);
            this.extendMessage = extendMessage;
            return this;
        }

        /**
         * OldSmsSignName.
         */
        public Builder oldSmsSignName(String oldSmsSignName) {
            this.putQueryParameter("OldSmsSignName", oldSmsSignName);
            this.oldSmsSignName = oldSmsSignName;
            return this;
        }

        /**
         * OrderId.
         */
        public Builder orderId(String orderId) {
            this.putQueryParameter("OrderId", orderId);
            this.orderId = orderId;
            return this;
        }

        /**
         * OrganizationCodeCert.
         */
        public Builder organizationCodeCert(String organizationCodeCert) {
            this.putQueryParameter("OrganizationCodeCert", organizationCodeCert);
            this.organizationCodeCert = organizationCodeCert;
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
         * ProdCode.
         */
        public Builder prodCode(String prodCode) {
            this.putQueryParameter("ProdCode", prodCode);
            this.prodCode = prodCode;
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
        public Builder smsSignName(String smsSignName) {
            this.putQueryParameter("SmsSignName", smsSignName);
            this.smsSignName = smsSignName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder smsSignRemark(String smsSignRemark) {
            this.putQueryParameter("SmsSignRemark", smsSignRemark);
            this.smsSignRemark = smsSignRemark;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder smsSignSource(String smsSignSource) {
            this.putQueryParameter("SmsSignSource", smsSignSource);
            this.smsSignSource = smsSignSource;
            return this;
        }

        /**
         * TaxRegistrationCert.
         */
        public Builder taxRegistrationCert(String taxRegistrationCert) {
            this.putQueryParameter("TaxRegistrationCert", taxRegistrationCert);
            this.taxRegistrationCert = taxRegistrationCert;
            return this;
        }

        @Override
        public CreateSmsSignRequest build() {
            return new CreateSmsSignRequest(this);
        } 

    } 

}
