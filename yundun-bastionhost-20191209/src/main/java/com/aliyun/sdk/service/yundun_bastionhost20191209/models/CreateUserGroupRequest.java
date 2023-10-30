// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateUserGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateUserGroupRequest</p>
 */
public class CreateUserGroupRequest extends Request {
    @Query
    @NameInMap("Comment")
    private String comment;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("UserGroupName")
    @Validation(required = true)
    private String userGroupName;

    private CreateUserGroupRequest(Builder builder) {
        super(builder);
        this.comment = builder.comment;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.userGroupName = builder.userGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateUserGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return comment
     */
    public String getComment() {
        return this.comment;
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
     * @return userGroupName
     */
    public String getUserGroupName() {
        return this.userGroupName;
    }

    public static final class Builder extends Request.Builder<CreateUserGroupRequest, Builder> {
        private String comment; 
        private String instanceId; 
        private String regionId; 
        private String userGroupName; 

        private Builder() {
            super();
        } 

        private Builder(CreateUserGroupRequest request) {
            super(request);
            this.comment = request.comment;
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
            this.userGroupName = request.userGroupName;
        } 

        /**
         * The description of the user group. The description can be up to 500 characters in length.
         */
        public Builder comment(String comment) {
            this.putQueryParameter("Comment", comment);
            this.comment = comment;
            return this;
        }

        /**
         * The ID of the bastion host for which you want to create a user group.
         * <p>
         * 
         * > You can call the [DescribeInstances](~~153281~~) operation to query the ID of the bastion host.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The region ID of the bastion host for which you want to create a user group.
         * <p>
         * 
         * > For more information about the mapping between region IDs and region names, see [Regions and zones](~~40654~~).
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The name of the user group that you want to create. This name can be a up to 128 characters in length.
         */
        public Builder userGroupName(String userGroupName) {
            this.putQueryParameter("UserGroupName", userGroupName);
            this.userGroupName = userGroupName;
            return this;
        }

        @Override
        public CreateUserGroupRequest build() {
            return new CreateUserGroupRequest(this);
        } 

    } 

}
