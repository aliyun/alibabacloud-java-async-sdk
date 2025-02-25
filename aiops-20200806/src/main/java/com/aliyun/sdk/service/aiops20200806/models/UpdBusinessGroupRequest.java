// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdBusinessGroupRequest} extends {@link RequestModel}
 *
 * <p>UpdBusinessGroupRequest</p>
 */
public class UpdBusinessGroupRequest extends Request {
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
    @NameInMap("InstanceList")
    private java.util.List < String > instanceList;

    @Query
    @NameInMap("ResourceType")
    private Integer resourceType;

    @Query
    @NameInMap("UpdateUser")
    private String updateUser;

    private UpdBusinessGroupRequest(Builder builder) {
        super(builder);
        this.aliUid = builder.aliUid;
        this.businessGroupDesc = builder.businessGroupDesc;
        this.businessGroupId = builder.businessGroupId;
        this.businessGroupName = builder.businessGroupName;
        this.instanceList = builder.instanceList;
        this.resourceType = builder.resourceType;
        this.updateUser = builder.updateUser;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdBusinessGroupRequest create() {
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
     * @return instanceList
     */
    public java.util.List < String > getInstanceList() {
        return this.instanceList;
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

    public static final class Builder extends Request.Builder<UpdBusinessGroupRequest, Builder> {
        private String aliUid; 
        private String businessGroupDesc; 
        private String businessGroupId; 
        private String businessGroupName; 
        private java.util.List < String > instanceList; 
        private Integer resourceType; 
        private String updateUser; 

        private Builder() {
            super();
        } 

        private Builder(UpdBusinessGroupRequest request) {
            super(request);
            this.aliUid = request.aliUid;
            this.businessGroupDesc = request.businessGroupDesc;
            this.businessGroupId = request.businessGroupId;
            this.businessGroupName = request.businessGroupName;
            this.instanceList = request.instanceList;
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
         * InstanceList.
         */
        public Builder instanceList(java.util.List < String > instanceList) {
            String instanceListShrink = shrink(instanceList, "InstanceList", "json");
            this.putQueryParameter("InstanceList", instanceListShrink);
            this.instanceList = instanceList;
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
        public UpdBusinessGroupRequest build() {
            return new UpdBusinessGroupRequest(this);
        } 

    } 

}
