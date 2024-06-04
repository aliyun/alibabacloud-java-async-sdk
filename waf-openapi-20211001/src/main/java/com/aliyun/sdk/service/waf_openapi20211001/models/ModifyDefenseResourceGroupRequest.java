// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDefenseResourceGroupRequest} extends {@link RequestModel}
 *
 * <p>ModifyDefenseResourceGroupRequest</p>
 */
public class ModifyDefenseResourceGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AddList")
    private String addList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeleteList")
    private String deleteList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceManagerResourceGroupId")
    private String resourceManagerResourceGroupId;

    private ModifyDefenseResourceGroupRequest(Builder builder) {
        super(builder);
        this.addList = builder.addList;
        this.deleteList = builder.deleteList;
        this.description = builder.description;
        this.groupName = builder.groupName;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.resourceManagerResourceGroupId = builder.resourceManagerResourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDefenseResourceGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return addList
     */
    public String getAddList() {
        return this.addList;
    }

    /**
     * @return deleteList
     */
    public String getDeleteList() {
        return this.deleteList;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceManagerResourceGroupId
     */
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    public static final class Builder extends Request.Builder<ModifyDefenseResourceGroupRequest, Builder> {
        private String addList; 
        private String deleteList; 
        private String description; 
        private String groupName; 
        private String instanceId; 
        private String regionId; 
        private String resourceManagerResourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDefenseResourceGroupRequest request) {
            super(request);
            this.addList = request.addList;
            this.deleteList = request.deleteList;
            this.description = request.description;
            this.groupName = request.groupName;
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
            this.resourceManagerResourceGroupId = request.resourceManagerResourceGroupId;
        } 

        /**
         * The protected objects that you want to add to the protected object group. Separate the protected objects with commas (,). If you leave this parameter empty, no protected objects are added to the protected object group.
         */
        public Builder addList(String addList) {
            this.putQueryParameter("AddList", addList);
            this.addList = addList;
            return this;
        }

        /**
         * The protected objects that you want to remove from the protected object group. Separate the protected objects with commas (,). If you leave this parameter empty, no protected objects are removed from the protected object group.
         */
        public Builder deleteList(String deleteList) {
            this.putQueryParameter("DeleteList", deleteList);
            this.deleteList = deleteList;
            return this;
        }

        /**
         * The description of the protected object group.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The name of the protected object group whose configurations you want to modify.
         */
        public Builder groupName(String groupName) {
            this.putQueryParameter("GroupName", groupName);
            this.groupName = groupName;
            return this;
        }

        /**
         * The ID of the Web Application Firewall (WAF) instance.
         * <p>
         * 
         * >  You can call the [DescribeInstance](~~433756~~) operation to obtain the ID of the WAF instance.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The region where the WAF instance resides. Valid values:
         * <p>
         * 
         * *   **cn-hangzhou:** the Chinese mainland.
         * *   **ap-southeast-1:** outside the Chinese mainland.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the resource group.
         */
        public Builder resourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
            this.putQueryParameter("ResourceManagerResourceGroupId", resourceManagerResourceGroupId);
            this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
            return this;
        }

        @Override
        public ModifyDefenseResourceGroupRequest build() {
            return new ModifyDefenseResourceGroupRequest(this);
        } 

    } 

}
