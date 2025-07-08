// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysms20170620.models;

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
 * {@link SaveContactsNewRequest} extends {@link RequestModel}
 *
 * <p>SaveContactsNewRequest</p>
 */
public class SaveContactsNewRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Email")
    private String email;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpenPkgWarning")
    private Integer openPkgWarning;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpenPreventBrushWarning")
    private Integer openPreventBrushWarning;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpenSendWarning")
    private Integer openSendWarning;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Phone")
    private String phone;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProdCode")
    private String prodCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReceiveSignTemplateAuditResult")
    private Integer receiveSignTemplateAuditResult;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VerificationCode")
    private String verificationCode;

    private SaveContactsNewRequest(Builder builder) {
        super(builder);
        this.email = builder.email;
        this.id = builder.id;
        this.name = builder.name;
        this.openPkgWarning = builder.openPkgWarning;
        this.openPreventBrushWarning = builder.openPreventBrushWarning;
        this.openSendWarning = builder.openSendWarning;
        this.ownerId = builder.ownerId;
        this.phone = builder.phone;
        this.prodCode = builder.prodCode;
        this.receiveSignTemplateAuditResult = builder.receiveSignTemplateAuditResult;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.verificationCode = builder.verificationCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveContactsNewRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return email
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return openPkgWarning
     */
    public Integer getOpenPkgWarning() {
        return this.openPkgWarning;
    }

    /**
     * @return openPreventBrushWarning
     */
    public Integer getOpenPreventBrushWarning() {
        return this.openPreventBrushWarning;
    }

    /**
     * @return openSendWarning
     */
    public Integer getOpenSendWarning() {
        return this.openSendWarning;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return phone
     */
    public String getPhone() {
        return this.phone;
    }

    /**
     * @return prodCode
     */
    public String getProdCode() {
        return this.prodCode;
    }

    /**
     * @return receiveSignTemplateAuditResult
     */
    public Integer getReceiveSignTemplateAuditResult() {
        return this.receiveSignTemplateAuditResult;
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
     * @return verificationCode
     */
    public String getVerificationCode() {
        return this.verificationCode;
    }

    public static final class Builder extends Request.Builder<SaveContactsNewRequest, Builder> {
        private String email; 
        private Long id; 
        private String name; 
        private Integer openPkgWarning; 
        private Integer openPreventBrushWarning; 
        private Integer openSendWarning; 
        private Long ownerId; 
        private String phone; 
        private String prodCode; 
        private Integer receiveSignTemplateAuditResult; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String verificationCode; 

        private Builder() {
            super();
        } 

        private Builder(SaveContactsNewRequest request) {
            super(request);
            this.email = request.email;
            this.id = request.id;
            this.name = request.name;
            this.openPkgWarning = request.openPkgWarning;
            this.openPreventBrushWarning = request.openPreventBrushWarning;
            this.openSendWarning = request.openSendWarning;
            this.ownerId = request.ownerId;
            this.phone = request.phone;
            this.prodCode = request.prodCode;
            this.receiveSignTemplateAuditResult = request.receiveSignTemplateAuditResult;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.verificationCode = request.verificationCode;
        } 

        /**
         * Email.
         */
        public Builder email(String email) {
            this.putQueryParameter("Email", email);
            this.email = email;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
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
         * OpenPkgWarning.
         */
        public Builder openPkgWarning(Integer openPkgWarning) {
            this.putQueryParameter("OpenPkgWarning", openPkgWarning);
            this.openPkgWarning = openPkgWarning;
            return this;
        }

        /**
         * OpenPreventBrushWarning.
         */
        public Builder openPreventBrushWarning(Integer openPreventBrushWarning) {
            this.putQueryParameter("OpenPreventBrushWarning", openPreventBrushWarning);
            this.openPreventBrushWarning = openPreventBrushWarning;
            return this;
        }

        /**
         * OpenSendWarning.
         */
        public Builder openSendWarning(Integer openSendWarning) {
            this.putQueryParameter("OpenSendWarning", openSendWarning);
            this.openSendWarning = openSendWarning;
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
         * Phone.
         */
        public Builder phone(String phone) {
            this.putQueryParameter("Phone", phone);
            this.phone = phone;
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
         * ReceiveSignTemplateAuditResult.
         */
        public Builder receiveSignTemplateAuditResult(Integer receiveSignTemplateAuditResult) {
            this.putQueryParameter("ReceiveSignTemplateAuditResult", receiveSignTemplateAuditResult);
            this.receiveSignTemplateAuditResult = receiveSignTemplateAuditResult;
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
         * VerificationCode.
         */
        public Builder verificationCode(String verificationCode) {
            this.putQueryParameter("VerificationCode", verificationCode);
            this.verificationCode = verificationCode;
            return this;
        }

        @Override
        public SaveContactsNewRequest build() {
            return new SaveContactsNewRequest(this);
        } 

    } 

}
