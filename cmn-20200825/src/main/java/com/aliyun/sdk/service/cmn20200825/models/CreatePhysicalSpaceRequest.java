// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePhysicalSpaceRequest} extends {@link RequestModel}
 *
 * <p>CreatePhysicalSpaceRequest</p>
 */
public class CreatePhysicalSpaceRequest extends Request {
    @Body
    @NameInMap("Address")
    private String address;

    @Body
    @NameInMap("City")
    private String city;

    @Body
    @NameInMap("ClientToken")
    @Validation(required = true)
    private String clientToken;

    @Body
    @NameInMap("Country")
    private String country;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Body
    @NameInMap("Owner")
    private String owner;

    @Body
    @NameInMap("ParentUid")
    private String parentUid;

    @Body
    @NameInMap("PhysicalSpaceName")
    @Validation(required = true)
    private String physicalSpaceName;

    @Body
    @NameInMap("Province")
    private String province;

    @Body
    @NameInMap("Remark")
    private String remark;

    @Body
    @NameInMap("SecurityDomainList")
    private java.util.List < String > securityDomainList;

    @Body
    @NameInMap("SpaceAbbreviation")
    private String spaceAbbreviation;

    @Body
    @NameInMap("SpaceType")
    private String spaceType;

    private CreatePhysicalSpaceRequest(Builder builder) {
        super(builder);
        this.address = builder.address;
        this.city = builder.city;
        this.clientToken = builder.clientToken;
        this.country = builder.country;
        this.instanceId = builder.instanceId;
        this.owner = builder.owner;
        this.parentUid = builder.parentUid;
        this.physicalSpaceName = builder.physicalSpaceName;
        this.province = builder.province;
        this.remark = builder.remark;
        this.securityDomainList = builder.securityDomainList;
        this.spaceAbbreviation = builder.spaceAbbreviation;
        this.spaceType = builder.spaceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePhysicalSpaceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return address
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * @return city
     */
    public String getCity() {
        return this.city;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return country
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return owner
     */
    public String getOwner() {
        return this.owner;
    }

    /**
     * @return parentUid
     */
    public String getParentUid() {
        return this.parentUid;
    }

    /**
     * @return physicalSpaceName
     */
    public String getPhysicalSpaceName() {
        return this.physicalSpaceName;
    }

    /**
     * @return province
     */
    public String getProvince() {
        return this.province;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return securityDomainList
     */
    public java.util.List < String > getSecurityDomainList() {
        return this.securityDomainList;
    }

    /**
     * @return spaceAbbreviation
     */
    public String getSpaceAbbreviation() {
        return this.spaceAbbreviation;
    }

    /**
     * @return spaceType
     */
    public String getSpaceType() {
        return this.spaceType;
    }

    public static final class Builder extends Request.Builder<CreatePhysicalSpaceRequest, Builder> {
        private String address; 
        private String city; 
        private String clientToken; 
        private String country; 
        private String instanceId; 
        private String owner; 
        private String parentUid; 
        private String physicalSpaceName; 
        private String province; 
        private String remark; 
        private java.util.List < String > securityDomainList; 
        private String spaceAbbreviation; 
        private String spaceType; 

        private Builder() {
            super();
        } 

        private Builder(CreatePhysicalSpaceRequest request) {
            super(request);
            this.address = request.address;
            this.city = request.city;
            this.clientToken = request.clientToken;
            this.country = request.country;
            this.instanceId = request.instanceId;
            this.owner = request.owner;
            this.parentUid = request.parentUid;
            this.physicalSpaceName = request.physicalSpaceName;
            this.province = request.province;
            this.remark = request.remark;
            this.securityDomainList = request.securityDomainList;
            this.spaceAbbreviation = request.spaceAbbreviation;
            this.spaceType = request.spaceType;
        } 

        /**
         * Address.
         */
        public Builder address(String address) {
            this.putBodyParameter("Address", address);
            this.address = address;
            return this;
        }

        /**
         * City.
         */
        public Builder city(String city) {
            this.putBodyParameter("City", city);
            this.city = city;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Country.
         */
        public Builder country(String country) {
            this.putBodyParameter("Country", country);
            this.country = country;
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
         * Owner.
         */
        public Builder owner(String owner) {
            this.putBodyParameter("Owner", owner);
            this.owner = owner;
            return this;
        }

        /**
         * ParentUid.
         */
        public Builder parentUid(String parentUid) {
            this.putBodyParameter("ParentUid", parentUid);
            this.parentUid = parentUid;
            return this;
        }

        /**
         * PhysicalSpaceName.
         */
        public Builder physicalSpaceName(String physicalSpaceName) {
            this.putBodyParameter("PhysicalSpaceName", physicalSpaceName);
            this.physicalSpaceName = physicalSpaceName;
            return this;
        }

        /**
         * Province.
         */
        public Builder province(String province) {
            this.putBodyParameter("Province", province);
            this.province = province;
            return this;
        }

        /**
         * Remark.
         */
        public Builder remark(String remark) {
            this.putBodyParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * SecurityDomainList.
         */
        public Builder securityDomainList(java.util.List < String > securityDomainList) {
            String securityDomainListShrink = shrink(securityDomainList, "SecurityDomainList", "json");
            this.putBodyParameter("SecurityDomainList", securityDomainListShrink);
            this.securityDomainList = securityDomainList;
            return this;
        }

        /**
         * SpaceAbbreviation.
         */
        public Builder spaceAbbreviation(String spaceAbbreviation) {
            this.putBodyParameter("SpaceAbbreviation", spaceAbbreviation);
            this.spaceAbbreviation = spaceAbbreviation;
            return this;
        }

        /**
         * SpaceType.
         */
        public Builder spaceType(String spaceType) {
            this.putBodyParameter("SpaceType", spaceType);
            this.spaceType = spaceType;
            return this;
        }

        @Override
        public CreatePhysicalSpaceRequest build() {
            return new CreatePhysicalSpaceRequest(this);
        } 

    } 

}
