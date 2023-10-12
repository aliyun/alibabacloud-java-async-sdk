// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PhysicalSpaceDto} extends {@link TeaModel}
 *
 * <p>PhysicalSpaceDto</p>
 */
public class PhysicalSpaceDto extends TeaModel {
    @NameInMap("Address")
    private String address;

    @NameInMap("Children")
    private java.util.List < PhysicalSpaceDto > children;

    @NameInMap("City")
    private String city;

    @NameInMap("Country")
    private String country;

    @NameInMap("FullParentPath")
    private String fullParentPath;

    @NameInMap("Instance")
    private String instance;

    @NameInMap("Owner")
    private String owner;

    @NameInMap("ParentUid")
    private String parentUid;

    @NameInMap("PhysicalSpaceId")
    private String physicalSpaceId;

    @NameInMap("PhysicalSpaceName")
    private String physicalSpaceName;

    @NameInMap("Province")
    private String province;

    @NameInMap("Remark")
    private String remark;

    @NameInMap("SecurityDomainList")
    private java.util.List < String > securityDomainList;

    @NameInMap("SpaceAbbreviation")
    private String spaceAbbreviation;

    @NameInMap("SpaceType")
    private String spaceType;

    private PhysicalSpaceDto(Builder builder) {
        this.address = builder.address;
        this.children = builder.children;
        this.city = builder.city;
        this.country = builder.country;
        this.fullParentPath = builder.fullParentPath;
        this.instance = builder.instance;
        this.owner = builder.owner;
        this.parentUid = builder.parentUid;
        this.physicalSpaceId = builder.physicalSpaceId;
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

    public static PhysicalSpaceDto create() {
        return builder().build();
    }

    /**
     * @return address
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * @return children
     */
    public java.util.List < PhysicalSpaceDto > getChildren() {
        return this.children;
    }

    /**
     * @return city
     */
    public String getCity() {
        return this.city;
    }

    /**
     * @return country
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * @return fullParentPath
     */
    public String getFullParentPath() {
        return this.fullParentPath;
    }

    /**
     * @return instance
     */
    public String getInstance() {
        return this.instance;
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
     * @return physicalSpaceId
     */
    public String getPhysicalSpaceId() {
        return this.physicalSpaceId;
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

    public static final class Builder {
        private String address; 
        private java.util.List < PhysicalSpaceDto > children; 
        private String city; 
        private String country; 
        private String fullParentPath; 
        private String instance; 
        private String owner; 
        private String parentUid; 
        private String physicalSpaceId; 
        private String physicalSpaceName; 
        private String province; 
        private String remark; 
        private java.util.List < String > securityDomainList; 
        private String spaceAbbreviation; 
        private String spaceType; 

        /**
         * Address.
         */
        public Builder address(String address) {
            this.address = address;
            return this;
        }

        /**
         * Children.
         */
        public Builder children(java.util.List < PhysicalSpaceDto > children) {
            this.children = children;
            return this;
        }

        /**
         * City.
         */
        public Builder city(String city) {
            this.city = city;
            return this;
        }

        /**
         * Country.
         */
        public Builder country(String country) {
            this.country = country;
            return this;
        }

        /**
         * FullParentPath.
         */
        public Builder fullParentPath(String fullParentPath) {
            this.fullParentPath = fullParentPath;
            return this;
        }

        /**
         * Instance.
         */
        public Builder instance(String instance) {
            this.instance = instance;
            return this;
        }

        /**
         * Owner.
         */
        public Builder owner(String owner) {
            this.owner = owner;
            return this;
        }

        /**
         * ParentUid.
         */
        public Builder parentUid(String parentUid) {
            this.parentUid = parentUid;
            return this;
        }

        /**
         * PhysicalSpaceId.
         */
        public Builder physicalSpaceId(String physicalSpaceId) {
            this.physicalSpaceId = physicalSpaceId;
            return this;
        }

        /**
         * PhysicalSpaceName.
         */
        public Builder physicalSpaceName(String physicalSpaceName) {
            this.physicalSpaceName = physicalSpaceName;
            return this;
        }

        /**
         * Province.
         */
        public Builder province(String province) {
            this.province = province;
            return this;
        }

        /**
         * Remark.
         */
        public Builder remark(String remark) {
            this.remark = remark;
            return this;
        }

        /**
         * SecurityDomainList.
         */
        public Builder securityDomainList(java.util.List < String > securityDomainList) {
            this.securityDomainList = securityDomainList;
            return this;
        }

        /**
         * SpaceAbbreviation.
         */
        public Builder spaceAbbreviation(String spaceAbbreviation) {
            this.spaceAbbreviation = spaceAbbreviation;
            return this;
        }

        /**
         * SpaceType.
         */
        public Builder spaceType(String spaceType) {
            this.spaceType = spaceType;
            return this;
        }

        public PhysicalSpaceDto build() {
            return new PhysicalSpaceDto(this);
        } 

    } 

}
