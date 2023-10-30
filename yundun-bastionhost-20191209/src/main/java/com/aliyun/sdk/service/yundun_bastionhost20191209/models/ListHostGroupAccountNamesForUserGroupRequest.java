// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListHostGroupAccountNamesForUserGroupRequest} extends {@link RequestModel}
 *
 * <p>ListHostGroupAccountNamesForUserGroupRequest</p>
 */
public class ListHostGroupAccountNamesForUserGroupRequest extends Request {
    @Query
    @NameInMap("HostGroupId")
    @Validation(required = true)
    private String hostGroupId;

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

    private ListHostGroupAccountNamesForUserGroupRequest(Builder builder) {
        super(builder);
        this.hostGroupId = builder.hostGroupId;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.userGroupId = builder.userGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListHostGroupAccountNamesForUserGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return hostGroupId
     */
    public String getHostGroupId() {
        return this.hostGroupId;
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

    public static final class Builder extends Request.Builder<ListHostGroupAccountNamesForUserGroupRequest, Builder> {
        private String hostGroupId; 
        private String instanceId; 
        private String regionId; 
        private String userGroupId; 

        private Builder() {
            super();
        } 

        private Builder(ListHostGroupAccountNamesForUserGroupRequest request) {
            super(request);
            this.hostGroupId = request.hostGroupId;
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
            this.userGroupId = request.userGroupId;
        } 

        /**
         * WB662865
         */
        public Builder hostGroupId(String hostGroupId) {
            this.putQueryParameter("HostGroupId", hostGroupId);
            this.hostGroupId = hostGroupId;
            return this;
        }

        /**
         * All Bastionhost API requests must include common request parameters. For more information about common request parameters, see [Common parameters](~~148139~~).
         * <p>
         * 
         * For more information about sample requests, see the "Examples" section of this topic.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Queries the names of the host accounts that a specified user group is authorized to manage in a specified host group.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ListHostGroupAccountNamesForUserGroup
         */
        public Builder userGroupId(String userGroupId) {
            this.putQueryParameter("UserGroupId", userGroupId);
            this.userGroupId = userGroupId;
            return this;
        }

        @Override
        public ListHostGroupAccountNamesForUserGroupRequest build() {
            return new ListHostGroupAccountNamesForUserGroupRequest(this);
        } 

    } 

}
