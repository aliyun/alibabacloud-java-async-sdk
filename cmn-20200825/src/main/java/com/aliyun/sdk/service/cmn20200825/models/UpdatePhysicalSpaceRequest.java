// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdatePhysicalSpaceRequest} extends {@link RequestModel}
 *
 * <p>UpdatePhysicalSpaceRequest</p>
 */
public class UpdatePhysicalSpaceRequest extends Request {
    @Body
    @NameInMap("Address")
    private String address;

    @Body
    @NameInMap("City")
    private String city;

    @Body
    @NameInMap("Country")
    private String country;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Body
    @NameInMap("MoveAction")
    private String moveAction;

    @Body
    @NameInMap("Owner")
    private String owner;

    @Body
    @NameInMap("ParentUid")
    private String parentUid;

    @Body
    @NameInMap("PhysicalSpaceId")
    @Validation(required = true)
    private String physicalSpaceId;

    @Body
    @NameInMap("PhysicalSpaceName")
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

    @Body
    @NameInMap("TargetUid")
    private String targetUid;

    private UpdatePhysicalSpaceRequest(Builder builder) {
        super(builder);
        this.address = builder.address;
        this.city = builder.city;
        this.country = builder.country;
        this.instanceId = builder.instanceId;
        this.moveAction = builder.moveAction;
        this.owner = builder.owner;
        this.parentUid = builder.parentUid;
        this.physicalSpaceId = builder.physicalSpaceId;
        this.physicalSpaceName = builder.physicalSpaceName;
        this.province = builder.province;
        this.remark = builder.remark;
        this.securityDomainList = builder.securityDomainList;
        this.spaceAbbreviation = builder.spaceAbbreviation;
        this.spaceType = builder.spaceType;
        this.targetUid = builder.targetUid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdatePhysicalSpaceRequest create() {
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
     * @return moveAction
     */
    public String getMoveAction() {
        return this.moveAction;
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

    /**
     * @return targetUid
     */
    public String getTargetUid() {
        return this.targetUid;
    }

    public static final class Builder extends Request.Builder<UpdatePhysicalSpaceRequest, Builder> {
        private String address; 
        private String city; 
        private String country; 
        private String instanceId; 
        private String moveAction; 
        private String owner; 
        private String parentUid; 
        private String physicalSpaceId; 
        private String physicalSpaceName; 
        private String province; 
        private String remark; 
        private java.util.List < String > securityDomainList; 
        private String spaceAbbreviation; 
        private String spaceType; 
        private String targetUid; 

        private Builder() {
            super();
        } 

        private Builder(UpdatePhysicalSpaceRequest request) {
            super(request);
            this.address = request.address;
            this.city = request.city;
            this.country = request.country;
            this.instanceId = request.instanceId;
            this.moveAction = request.moveAction;
            this.owner = request.owner;
            this.parentUid = request.parentUid;
            this.physicalSpaceId = request.physicalSpaceId;
            this.physicalSpaceName = request.physicalSpaceName;
            this.province = request.province;
            this.remark = request.remark;
            this.securityDomainList = request.securityDomainList;
            this.spaceAbbreviation = request.spaceAbbreviation;
            this.spaceType = request.spaceType;
            this.targetUid = request.targetUid;
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
         * MoveAction.
         */
        public Builder moveAction(String moveAction) {
            this.putBodyParameter("MoveAction", moveAction);
            this.moveAction = moveAction;
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
         * PhysicalSpaceId.
         */
        public Builder physicalSpaceId(String physicalSpaceId) {
            this.putBodyParameter("PhysicalSpaceId", physicalSpaceId);
            this.physicalSpaceId = physicalSpaceId;
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

        /**
         * TargetUid.
         */
        public Builder targetUid(String targetUid) {
            this.putBodyParameter("TargetUid", targetUid);
            this.targetUid = targetUid;
            return this;
        }

        @Override
        public UpdatePhysicalSpaceRequest build() {
            return new UpdatePhysicalSpaceRequest(this);
        } 

    } 

}
