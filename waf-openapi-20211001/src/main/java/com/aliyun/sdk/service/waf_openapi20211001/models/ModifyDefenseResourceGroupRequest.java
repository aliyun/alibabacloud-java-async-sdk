// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDefenseResourceGroupRequest} extends {@link RequestModel}
 *
 * <p>ModifyDefenseResourceGroupRequest</p>
 */
public class ModifyDefenseResourceGroupRequest extends Request {
    @Query
    @NameInMap("AddList")
    private String addList;

    @Query
    @NameInMap("DeleteList")
    private String deleteList;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("GroupName")
    @Validation(required = true)
    private String groupName;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    private ModifyDefenseResourceGroupRequest(Builder builder) {
        super(builder);
        this.addList = builder.addList;
        this.deleteList = builder.deleteList;
        this.description = builder.description;
        this.groupName = builder.groupName;
        this.instanceId = builder.instanceId;
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

    public static final class Builder extends Request.Builder<ModifyDefenseResourceGroupRequest, Builder> {
        private String addList; 
        private String deleteList; 
        private String description; 
        private String groupName; 
        private String instanceId; 

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
        } 

        /**
         * AddList.
         */
        public Builder addList(String addList) {
            this.putQueryParameter("AddList", addList);
            this.addList = addList;
            return this;
        }

        /**
         * DeleteList.
         */
        public Builder deleteList(String deleteList) {
            this.putQueryParameter("DeleteList", deleteList);
            this.deleteList = deleteList;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * GroupName.
         */
        public Builder groupName(String groupName) {
            this.putQueryParameter("GroupName", groupName);
            this.groupName = groupName;
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

        @Override
        public ModifyDefenseResourceGroupRequest build() {
            return new ModifyDefenseResourceGroupRequest(this);
        } 

    } 

}
