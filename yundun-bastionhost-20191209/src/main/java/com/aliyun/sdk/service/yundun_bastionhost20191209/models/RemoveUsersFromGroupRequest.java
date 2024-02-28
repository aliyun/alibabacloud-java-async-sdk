// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveUsersFromGroupRequest} extends {@link RequestModel}
 *
 * <p>RemoveUsersFromGroupRequest</p>
 */
public class RemoveUsersFromGroupRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("UserGroupId")
    @Validation(required = true)
    private String userGroupId;

    @Query
    @NameInMap("UserIds")
    @Validation(required = true)
    private String userIds;

    private RemoveUsersFromGroupRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.userGroupId = builder.userGroupId;
        this.userIds = builder.userIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveUsersFromGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return userGroupId
     */
    public String getUserGroupId() {
        return this.userGroupId;
    }

    /**
     * @return userIds
     */
    public String getUserIds() {
        return this.userIds;
    }

    public static final class Builder extends Request.Builder<RemoveUsersFromGroupRequest, Builder> {
        private String instanceId; 
        private String regionId; 
        private String userGroupId; 
        private String userIds; 

        private Builder() {
            super();
        } 

        private Builder(RemoveUsersFromGroupRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
            this.userGroupId = request.userGroupId;
            this.userIds = request.userIds;
        } 

        /**
         * The ID of the bastion host for which you want to remove users from the user group.
         * <p>
         * 
         * >  You can call the [DescribeInstances](~~153281~~) operation to query the ID of the bastion host.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The region ID of the bastion host for which you want to remove users from the user group.
         * <p>
         * 
         * >  For more information about the mapping between region IDs and region names, see [Regions and zones](~~40654~~).
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the user group from which you want to remove users.
         * <p>
         * 
         * >  You can call the [ListUserGroups](~~204509~~) operation to query the ID of the user group.
         */
        public Builder userGroupId(String userGroupId) {
            this.putQueryParameter("UserGroupId", userGroupId);
            this.userGroupId = userGroupId;
            return this;
        }

        /**
         * The ID of the user who you want to remove. The value is a JSON string. You can add up to 100 user IDs. If you specify multiple IDs, separate the IDs with commas (,).
         * <p>
         * 
         * >  You can call the [ListUsers](~~204522~~) operation to query the IDs of users.
         */
        public Builder userIds(String userIds) {
            this.putQueryParameter("UserIds", userIds);
            this.userIds = userIds;
            return this;
        }

        @Override
        public RemoveUsersFromGroupRequest build() {
            return new RemoveUsersFromGroupRequest(this);
        } 

    } 

}
