// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateBusinessGroupRequest} extends {@link RequestModel}
 *
 * <p>UpdateBusinessGroupRequest</p>
 */
public class UpdateBusinessGroupRequest extends Request {
    @Query
    @NameInMap("AliUid")
    private String aliUid;

    @Query
    @NameInMap("BusinessGroupDesc")
    private String businessGroupDesc;

    @Query
    @NameInMap("BusinessGroupId")
    private String businessGroupId;

    @Query
    @NameInMap("BusinessGroupName")
    private String businessGroupName;

    @Query
    @NameInMap("CloudResourceTypeId")
    private String cloudResourceTypeId;

    @Query
    @NameInMap("DealType")
    private Integer dealType;

    @Query
    @NameInMap("InstanceList")
    private java.util.List < String > instanceList;

    @Query
    @NameInMap("OperaUid")
    private String operaUid;

    @Query
    @NameInMap("ResourceType")
    private Integer resourceType;

    @Query
    @NameInMap("UpdateUser")
    private String updateUser;

    private UpdateBusinessGroupRequest(Builder builder) {
        super(builder);
        this.aliUid = builder.aliUid;
        this.businessGroupDesc = builder.businessGroupDesc;
        this.businessGroupId = builder.businessGroupId;
        this.businessGroupName = builder.businessGroupName;
        this.cloudResourceTypeId = builder.cloudResourceTypeId;
        this.dealType = builder.dealType;
        this.instanceList = builder.instanceList;
        this.operaUid = builder.operaUid;
        this.resourceType = builder.resourceType;
        this.updateUser = builder.updateUser;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateBusinessGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliUid
     */
    public String getAliUid() {
        return this.aliUid;
    }

    /**
     * @return businessGroupDesc
     */
    public String getBusinessGroupDesc() {
        return this.businessGroupDesc;
    }

    /**
     * @return businessGroupId
     */
    public String getBusinessGroupId() {
        return this.businessGroupId;
    }

    /**
     * @return businessGroupName
     */
    public String getBusinessGroupName() {
        return this.businessGroupName;
    }

    /**
     * @return cloudResourceTypeId
     */
    public String getCloudResourceTypeId() {
        return this.cloudResourceTypeId;
    }

    /**
     * @return dealType
     */
    public Integer getDealType() {
        return this.dealType;
    }

    /**
     * @return instanceList
     */
    public java.util.List < String > getInstanceList() {
        return this.instanceList;
    }

    /**
     * @return operaUid
     */
    public String getOperaUid() {
        return this.operaUid;
    }

    /**
     * @return resourceType
     */
    public Integer getResourceType() {
        return this.resourceType;
    }

    /**
     * @return updateUser
     */
    public String getUpdateUser() {
        return this.updateUser;
    }

    public static final class Builder extends Request.Builder<UpdateBusinessGroupRequest, Builder> {
        private String aliUid; 
        private String businessGroupDesc; 
        private String businessGroupId; 
        private String businessGroupName; 
        private String cloudResourceTypeId; 
        private Integer dealType; 
        private java.util.List < String > instanceList; 
        private String operaUid; 
        private Integer resourceType; 
        private String updateUser; 

        private Builder() {
            super();
        } 

        private Builder(UpdateBusinessGroupRequest request) {
            super(request);
            this.aliUid = request.aliUid;
            this.businessGroupDesc = request.businessGroupDesc;
            this.businessGroupId = request.businessGroupId;
            this.businessGroupName = request.businessGroupName;
            this.cloudResourceTypeId = request.cloudResourceTypeId;
            this.dealType = request.dealType;
            this.instanceList = request.instanceList;
            this.operaUid = request.operaUid;
            this.resourceType = request.resourceType;
            this.updateUser = request.updateUser;
        } 

        /**
         * AliUid.
         */
        public Builder aliUid(String aliUid) {
            this.putQueryParameter("AliUid", aliUid);
            this.aliUid = aliUid;
            return this;
        }

        /**
         * BusinessGroupDesc.
         */
        public Builder businessGroupDesc(String businessGroupDesc) {
            this.putQueryParameter("BusinessGroupDesc", businessGroupDesc);
            this.businessGroupDesc = businessGroupDesc;
            return this;
        }

        /**
         * BusinessGroupId.
         */
        public Builder businessGroupId(String businessGroupId) {
            this.putQueryParameter("BusinessGroupId", businessGroupId);
            this.businessGroupId = businessGroupId;
            return this;
        }

        /**
         * BusinessGroupName.
         */
        public Builder businessGroupName(String businessGroupName) {
            this.putQueryParameter("BusinessGroupName", businessGroupName);
            this.businessGroupName = businessGroupName;
            return this;
        }

        /**
         * CloudResourceTypeId.
         */
        public Builder cloudResourceTypeId(String cloudResourceTypeId) {
            this.putQueryParameter("CloudResourceTypeId", cloudResourceTypeId);
            this.cloudResourceTypeId = cloudResourceTypeId;
            return this;
        }

        /**
         * DealType.
         */
        public Builder dealType(Integer dealType) {
            this.putQueryParameter("DealType", dealType);
            this.dealType = dealType;
            return this;
        }

        /**
         * InstanceList.
         */
        public Builder instanceList(java.util.List < String > instanceList) {
            String instanceListShrink = shrink(instanceList, "InstanceList", "json");
            this.putQueryParameter("InstanceList", instanceListShrink);
            this.instanceList = instanceList;
            return this;
        }

        /**
         * OperaUid.
         */
        public Builder operaUid(String operaUid) {
            this.putQueryParameter("OperaUid", operaUid);
            this.operaUid = operaUid;
            return this;
        }

        /**
         * ResourceType.
         */
        public Builder resourceType(Integer resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * UpdateUser.
         */
        public Builder updateUser(String updateUser) {
            this.putQueryParameter("UpdateUser", updateUser);
            this.updateUser = updateUser;
            return this;
        }

        @Override
        public UpdateBusinessGroupRequest build() {
            return new UpdateBusinessGroupRequest(this);
        } 

    } 

}
