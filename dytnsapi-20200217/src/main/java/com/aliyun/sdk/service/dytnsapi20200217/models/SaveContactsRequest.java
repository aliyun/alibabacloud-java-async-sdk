// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dytnsapi20200217.models;

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
 * {@link SaveContactsRequest} extends {@link RequestModel}
 *
 * <p>SaveContactsRequest</p>
 */
public class SaveContactsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizType")
    @com.aliyun.core.annotation.Validation(maximum = 99999, minimum = 1)
    private String bizType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactEmail")
    private String contactEmail;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactName")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 99999, minimum = 1)
    private String contactName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactPhone")
    private String contactPhone;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MailStatus")
    private Integer mailStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpenStatusWarning")
    private Boolean openStatusWarning;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpentAttributionWarning")
    private Boolean opentAttributionWarning;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PhoneStatus")
    private Integer phoneStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private SaveContactsRequest(Builder builder) {
        super(builder);
        this.bizType = builder.bizType;
        this.contactEmail = builder.contactEmail;
        this.contactName = builder.contactName;
        this.contactPhone = builder.contactPhone;
        this.mailStatus = builder.mailStatus;
        this.openStatusWarning = builder.openStatusWarning;
        this.opentAttributionWarning = builder.opentAttributionWarning;
        this.ownerId = builder.ownerId;
        this.phoneStatus = builder.phoneStatus;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveContactsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizType
     */
    public String getBizType() {
        return this.bizType;
    }

    /**
     * @return contactEmail
     */
    public String getContactEmail() {
        return this.contactEmail;
    }

    /**
     * @return contactName
     */
    public String getContactName() {
        return this.contactName;
    }

    /**
     * @return contactPhone
     */
    public String getContactPhone() {
        return this.contactPhone;
    }

    /**
     * @return mailStatus
     */
    public Integer getMailStatus() {
        return this.mailStatus;
    }

    /**
     * @return openStatusWarning
     */
    public Boolean getOpenStatusWarning() {
        return this.openStatusWarning;
    }

    /**
     * @return opentAttributionWarning
     */
    public Boolean getOpentAttributionWarning() {
        return this.opentAttributionWarning;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return phoneStatus
     */
    public Integer getPhoneStatus() {
        return this.phoneStatus;
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

    public static final class Builder extends Request.Builder<SaveContactsRequest, Builder> {
        private String bizType; 
        private String contactEmail; 
        private String contactName; 
        private String contactPhone; 
        private Integer mailStatus; 
        private Boolean openStatusWarning; 
        private Boolean opentAttributionWarning; 
        private Long ownerId; 
        private Integer phoneStatus; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(SaveContactsRequest request) {
            super(request);
            this.bizType = request.bizType;
            this.contactEmail = request.contactEmail;
            this.contactName = request.contactName;
            this.contactPhone = request.contactPhone;
            this.mailStatus = request.mailStatus;
            this.openStatusWarning = request.openStatusWarning;
            this.opentAttributionWarning = request.opentAttributionWarning;
            this.ownerId = request.ownerId;
            this.phoneStatus = request.phoneStatus;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * BizType.
         */
        public Builder bizType(String bizType) {
            this.putQueryParameter("BizType", bizType);
            this.bizType = bizType;
            return this;
        }

        /**
         * ContactEmail.
         */
        public Builder contactEmail(String contactEmail) {
            this.putQueryParameter("ContactEmail", contactEmail);
            this.contactEmail = contactEmail;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder contactName(String contactName) {
            this.putQueryParameter("ContactName", contactName);
            this.contactName = contactName;
            return this;
        }

        /**
         * ContactPhone.
         */
        public Builder contactPhone(String contactPhone) {
            this.putQueryParameter("ContactPhone", contactPhone);
            this.contactPhone = contactPhone;
            return this;
        }

        /**
         * MailStatus.
         */
        public Builder mailStatus(Integer mailStatus) {
            this.putQueryParameter("MailStatus", mailStatus);
            this.mailStatus = mailStatus;
            return this;
        }

        /**
         * OpenStatusWarning.
         */
        public Builder openStatusWarning(Boolean openStatusWarning) {
            this.putQueryParameter("OpenStatusWarning", openStatusWarning);
            this.openStatusWarning = openStatusWarning;
            return this;
        }

        /**
         * OpentAttributionWarning.
         */
        public Builder opentAttributionWarning(Boolean opentAttributionWarning) {
            this.putQueryParameter("OpentAttributionWarning", opentAttributionWarning);
            this.opentAttributionWarning = opentAttributionWarning;
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
         * PhoneStatus.
         */
        public Builder phoneStatus(Integer phoneStatus) {
            this.putQueryParameter("PhoneStatus", phoneStatus);
            this.phoneStatus = phoneStatus;
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
        public SaveContactsRequest build() {
            return new SaveContactsRequest(this);
        } 

    } 

}
