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
         * <p>The contact email address.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:123@alibaba.com">123@alibaba.com</a></p>
         */
        public Builder contactMail(String contactMail) {
            this.putQueryParameter("ContactMail", contactMail);
            this.contactMail = contactMail;
            return this;
        }

        /**
         * <p>The country code.</p>
         * <blockquote>
         * <p>For a list of country codes, see <a href="https://help.aliyun.com/document_detail/608210.html">Country Codes</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder countryId(String countryId) {
            this.putQueryParameter("CountryId", countryId);
            this.countryId = countryId;
            return this;
        }

        /**
         * <p>The Facebook Business Manager ID.</p>
         * 
         * <strong>example:</strong>
         * <p>393998****</p>
         */
        public Builder facebookBmId(String facebookBmId) {
            this.putQueryParameter("FacebookBmId", facebookBmId);
            this.facebookBmId = facebookBmId;
            return this;
        }

        /**
         * <p>The description of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ins</p>
         */
        public Builder instanceDescription(String instanceDescription) {
            this.putQueryParameter("InstanceDescription", instanceDescription);
            this.instanceDescription = instanceDescription;
            return this;
        }

        /**
         * <p>The ID of the instance.</p>
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
         * <p>The name of the instance.</p>
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
         * <p>Specifies whether to enable automatic audit confirmation.</p>
         * 
         * <strong>example:</strong>
         * <p>Y</p>
         */
        public Builder isConfirmAudit(String isConfirmAudit) {
            this.putQueryParameter("IsConfirmAudit", isConfirmAudit);
            this.isConfirmAudit = isConfirmAudit;
            return this;
        }

        /**
         * <p>The URL of the Independent Software Vendor (ISV) agreement file.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://aa.com/a.pdf">https://aa.com/a.pdf</a></p>
         */
        public Builder isvTerms(String isvTerms) {
            this.putQueryParameter("IsvTerms", isvTerms);
            this.isvTerms = isvTerms;
            return this;
        }

        /**
         * <p>The company address.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        public Builder officeAddress(String officeAddress) {
            this.putQueryParameter("OfficeAddress", officeAddress);
            this.officeAddress = officeAddress;
            return this;
        }

        @Override
        public UpdateInstanceRequest build() {
            return new UpdateInstanceRequest(this);
        } 

    } 

}
