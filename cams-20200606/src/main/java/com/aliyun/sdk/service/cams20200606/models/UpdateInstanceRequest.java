// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

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
 * {@link UpdateInstanceRequest} extends {@link RequestModel}
 *
 * <p>UpdateInstanceRequest</p>
 */
public class UpdateInstanceRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactMail")
    private String contactMail;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CountryId")
    private String countryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FacebookBmId")
    private String facebookBmId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceDescription")
    private String instanceDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsConfirmAudit")
    private String isConfirmAudit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsvTerms")
    private String isvTerms;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OfficeAddress")
    private String officeAddress;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private UpdateInstanceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.contactMail = builder.contactMail;
        this.countryId = builder.countryId;
        this.facebookBmId = builder.facebookBmId;
        this.instanceDescription = builder.instanceDescription;
        this.instanceId = builder.instanceId;
        this.instanceName = builder.instanceName;
        this.isConfirmAudit = builder.isConfirmAudit;
        this.isvTerms = builder.isvTerms;
        this.officeAddress = builder.officeAddress;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateInstanceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return contactMail
     */
    public String getContactMail() {
        return this.contactMail;
    }

    /**
     * @return countryId
     */
    public String getCountryId() {
        return this.countryId;
    }

    /**
     * @return facebookBmId
     */
    public String getFacebookBmId() {
        return this.facebookBmId;
    }

    /**
     * @return instanceDescription
     */
    public String getInstanceDescription() {
        return this.instanceDescription;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return isConfirmAudit
     */
    public String getIsConfirmAudit() {
        return this.isConfirmAudit;
    }

    /**
     * @return isvTerms
     */
    public String getIsvTerms() {
        return this.isvTerms;
    }

    /**
     * @return officeAddress
     */
    public String getOfficeAddress() {
        return this.officeAddress;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
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

    public static final class Builder extends Request.Builder<UpdateInstanceRequest, Builder> {
        private String regionId; 
        private String contactMail; 
        private String countryId; 
        private String facebookBmId; 
        private String instanceDescription; 
        private String instanceId; 
        private String instanceName; 
        private String isConfirmAudit; 
        private String isvTerms; 
        private String officeAddress; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateInstanceRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.contactMail = request.contactMail;
            this.countryId = request.countryId;
            this.facebookBmId = request.facebookBmId;
            this.instanceDescription = request.instanceDescription;
            this.instanceId = request.instanceId;
            this.instanceName = request.instanceName;
            this.isConfirmAudit = request.isConfirmAudit;
            this.isvTerms = request.isvTerms;
            this.officeAddress = request.officeAddress;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
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
         * CountryId.
         */
        public Builder countryId(String countryId) {
            this.putQueryParameter("CountryId", countryId);
            this.countryId = countryId;
            return this;
        }

        /**
         * <p>fb bmId</p>
         * 
         * <strong>example:</strong>
         * <p>3939982828</p>
         */
        public Builder facebookBmId(String facebookBmId) {
            this.putQueryParameter("FacebookBmId", facebookBmId);
            this.facebookBmId = facebookBmId;
            return this;
        }

        /**
         * InstanceDescription.
         */
        public Builder instanceDescription(String instanceDescription) {
            this.putQueryParameter("InstanceDescription", instanceDescription);
            this.instanceDescription = instanceDescription;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>82838838****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>viber_ins</p>
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * IsConfirmAudit.
         */
        public Builder isConfirmAudit(String isConfirmAudit) {
            this.putQueryParameter("IsConfirmAudit", isConfirmAudit);
            this.isConfirmAudit = isConfirmAudit;
            return this;
        }

        /**
         * IsvTerms.
         */
        public Builder isvTerms(String isvTerms) {
            this.putQueryParameter("IsvTerms", isvTerms);
            this.isvTerms = isvTerms;
            return this;
        }

        /**
         * OfficeAddress.
         */
        public Builder officeAddress(String officeAddress) {
            this.putQueryParameter("OfficeAddress", officeAddress);
            this.officeAddress = officeAddress;
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
        public UpdateInstanceRequest build() {
            return new UpdateInstanceRequest(this);
        } 

    } 

}
