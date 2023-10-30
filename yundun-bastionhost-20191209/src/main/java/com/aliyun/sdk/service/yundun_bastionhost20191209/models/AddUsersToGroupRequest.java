// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddUsersToGroupRequest} extends {@link RequestModel}
 *
 * <p>AddUsersToGroupRequest</p>
 */
public class AddUsersToGroupRequest extends Request {
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

    private AddUsersToGroupRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.userGroupId = builder.userGroupId;
        this.userIds = builder.userIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddUsersToGroupRequest create() {
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

    public static final class Builder extends Request.Builder<AddUsersToGroupRequest, Builder> {
        private String instanceId; 
        private String regionId; 
        private String userGroupId; 
        private String userIds; 

        private Builder() {
            super();
        } 

        private Builder(AddUsersToGroupRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
            this.userGroupId = request.userGroupId;
            this.userIds = request.userIds;
        } 

        /**
         * The ID of the user that you want to add to the user group. The value is a JSON string. You can add up to 100 user IDs. If you specify multiple IDs, separate the IDs with commas (,).
         * <p>
         * 
         * >  You can call the [ListUsers](~~204522~~) operation to query the IDs of users.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The ID of the user.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The return code that indicates whether the call was successful. Valid values:
         * <p>
         * 
         * *   **OK**: The call was successful.
         * 
         * *   **UNEXPECTED**: An unknown error occurred.
         * 
         * *   **INVALID_ARGUMENT**: A request parameter is invalid.
         * 
         * > Make sure that the request parameters are valid and call the operation again.
         * 
         * *   **OBJECT_NOT_FOUND**: The specified object on which you want to perform the operation does not exist.
         * 
         * > Check whether the specified ID of the bastion host exists, whether the specified hosts exist, and whether the specified host IDs are valid. Then, call the operation again.
         * 
         * *   **OBJECT_AlREADY_EXISTS**: The specified object on which you want to perform the operation already exists.
         */
        public Builder userGroupId(String userGroupId) {
            this.putQueryParameter("UserGroupId", userGroupId);
            this.userGroupId = userGroupId;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder userIds(String userIds) {
            this.putQueryParameter("UserIds", userIds);
            this.userIds = userIds;
            return this;
        }

        @Override
        public AddUsersToGroupRequest build() {
            return new AddUsersToGroupRequest(this);
        } 

    } 

}
