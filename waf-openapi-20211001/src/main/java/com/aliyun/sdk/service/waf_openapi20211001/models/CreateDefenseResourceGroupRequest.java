// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDefenseResourceGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateDefenseResourceGroupRequest</p>
 */
public class CreateDefenseResourceGroupRequest extends Request {
    @Query
    @NameInMap("AddList")
    private String addList;

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

    private CreateDefenseResourceGroupRequest(Builder builder) {
        super(builder);
        this.addList = builder.addList;
        this.description = builder.description;
        this.groupName = builder.groupName;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDefenseResourceGroupRequest create() {
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

    public static final class Builder extends Request.Builder<CreateDefenseResourceGroupRequest, Builder> {
        private String addList; 
        private String description; 
        private String groupName; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateDefenseResourceGroupRequest request) {
            super(request);
            this.addList = request.addList;
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
        public CreateDefenseResourceGroupRequest build() {
            return new CreateDefenseResourceGroupRequest(this);
        } 

    } 

}
