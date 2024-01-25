// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddBusinessGroupRequest} extends {@link RequestModel}
 *
 * <p>AddBusinessGroupRequest</p>
 */
public class AddBusinessGroupRequest extends Request {
    @Query
    @NameInMap("AliUid")
    private String aliUid;

    @Query
    @NameInMap("BusinessGroupDesc")
    @Validation(required = true)
    private String businessGroupDesc;

    @Query
    @NameInMap("BusinessGroupName")
    @Validation(required = true)
    private String businessGroupName;

    @Query
    @NameInMap("CreateUser")
    private String createUser;

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

    private AddBusinessGroupRequest(Builder builder) {
        super(builder);
        this.aliUid = builder.aliUid;
        this.businessGroupDesc = builder.businessGroupDesc;
        this.businessGroupName = builder.businessGroupName;
        this.createUser = builder.createUser;
        this.instanceList = builder.instanceList;
        this.operaUid = builder.operaUid;
        this.resourceType = builder.resourceType;
        this.updateUser = builder.updateUser;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddBusinessGroupRequest create() {
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
     * @return businessGroupName
     */
    public String getBusinessGroupName() {
        return this.businessGroupName;
    }

    /**
     * @return createUser
     */
    public String getCreateUser() {
        return this.createUser;
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

    public static final class Builder extends Request.Builder<AddBusinessGroupRequest, Builder> {
        private String aliUid; 
        private String businessGroupDesc; 
        private String businessGroupName; 
        private String createUser; 
        private java.util.List < String > instanceList; 
        private String operaUid; 
        private Integer resourceType; 
        private String updateUser; 

        private Builder() {
            super();
        } 

        private Builder(AddBusinessGroupRequest request) {
            super(request);
            this.aliUid = request.aliUid;
            this.businessGroupDesc = request.businessGroupDesc;
            this.businessGroupName = request.businessGroupName;
            this.createUser = request.createUser;
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
         * BusinessGroupName.
         */
        public Builder businessGroupName(String businessGroupName) {
            this.putQueryParameter("BusinessGroupName", businessGroupName);
            this.businessGroupName = businessGroupName;
            return this;
        }

        /**
         * CreateUser.
         */
        public Builder createUser(String createUser) {
            this.putQueryParameter("CreateUser", createUser);
            this.createUser = createUser;
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
        public AddBusinessGroupRequest build() {
            return new AddBusinessGroupRequest(this);
        } 

    } 

}
