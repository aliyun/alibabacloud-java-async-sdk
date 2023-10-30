// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DetachHostGroupAccountsFromUserRequest} extends {@link RequestModel}
 *
 * <p>DetachHostGroupAccountsFromUserRequest</p>
 */
public class DetachHostGroupAccountsFromUserRequest extends Request {
    @Query
    @NameInMap("HostGroups")
    @Validation(required = true)
    private String hostGroups;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("UserId")
    @Validation(required = true)
    private String userId;

    private DetachHostGroupAccountsFromUserRequest(Builder builder) {
        super(builder);
        this.hostGroups = builder.hostGroups;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetachHostGroupAccountsFromUserRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return hostGroups
     */
    public String getHostGroups() {
        return this.hostGroups;
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
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<DetachHostGroupAccountsFromUserRequest, Builder> {
        private String hostGroups; 
        private String instanceId; 
        private String regionId; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(DetachHostGroupAccountsFromUserRequest request) {
            super(request);
            this.hostGroups = request.hostGroups;
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
            this.userId = request.userId;
        } 

        /**
         * The ID of the host group and the name of the host account on which you want to revoke permissions from the user. You can specify up to 10 host group IDs and up to 10 host account names for each host group. You can specify only host group IDs. In this case, the permissions on the specified host groups and all host accounts in the host groups are revoked from the user. For more information about this parameter, see the "Description of the HostGroups parameter" section of this topic.
         * <p>
         * 
         * > You can call the [ListHostGroups](~~201307~~) operation to query the ID of the host group and the [ListHostAccounts](~~204372~~) operation to query the name of the host account.
         */
        public Builder hostGroups(String hostGroups) {
            this.putQueryParameter("HostGroups", hostGroups);
            this.hostGroups = hostGroups;
            return this;
        }

        /**
         * The ID of the bastion host for which you want to revoke permissions on the specified host groups and host accounts from the user.
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
         * The region ID of the bastion host for which you want to revoke permissions on the specified host groups and host accounts from the user.
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
         * The ID of the user from which you want to revoke permissions on the specified host groups and host accounts.
         * <p>
         * 
         * > You can call the [ListUsers](~~204522~~) operation to query the ID of the user.
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public DetachHostGroupAccountsFromUserRequest build() {
            return new DetachHostGroupAccountsFromUserRequest(this);
        } 

    } 

}
