// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AttachHostAccountsToUserGroupRequest} extends {@link RequestModel}
 *
 * <p>AttachHostAccountsToUserGroupRequest</p>
 */
public class AttachHostAccountsToUserGroupRequest extends Request {
    @Query
    @NameInMap("Hosts")
    @Validation(required = true)
    private String hosts;

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

    private AttachHostAccountsToUserGroupRequest(Builder builder) {
        super(builder);
        this.hosts = builder.hosts;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.userGroupId = builder.userGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AttachHostAccountsToUserGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return hosts
     */
    public String getHosts() {
        return this.hosts;
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

    public static final class Builder extends Request.Builder<AttachHostAccountsToUserGroupRequest, Builder> {
        private String hosts; 
        private String instanceId; 
        private String regionId; 
        private String userGroupId; 

        private Builder() {
            super();
        } 

        private Builder(AttachHostAccountsToUserGroupRequest request) {
            super(request);
            this.hosts = request.hosts;
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
            this.userGroupId = request.userGroupId;
        } 

        /**
         * The IDs of the host and host account that you want to authorize the user group to manage. You can specify up to 10 host IDs and up to 10 host account IDs for each host. You can specify only host IDs. In this case, the user group is authorized to manage only the specified hosts. For more information about this parameter, see the "Description of the Hosts parameter" section of this topic.
         * <p>
         * 
         * > You can call the [ListHosts](~~200665~~) operation to query the ID of the host and the [ListHostAccounts](~~204372~~) operation to query the ID of the host account.
         */
        public Builder hosts(String hosts) {
            this.putQueryParameter("Hosts", hosts);
            this.hosts = hosts;
            return this;
        }

        /**
         * The ID of the bastion host in which you want to authorize the user group to manage the specified hosts and host accounts.
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
         * The region ID of the bastion host in which you want to authorize the user group to manage the specified hosts and host accounts.
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
         * The ID of the user group that you want to authorize to manage the specified hosts and host accounts.
         * <p>
         * 
         * > You can call the [ListUserGroups](~~204509~~) operation to query the ID of the user group.
         */
        public Builder userGroupId(String userGroupId) {
            this.putQueryParameter("UserGroupId", userGroupId);
            this.userGroupId = userGroupId;
            return this;
        }

        @Override
        public AttachHostAccountsToUserGroupRequest build() {
            return new AttachHostAccountsToUserGroupRequest(this);
        } 

    } 

}
