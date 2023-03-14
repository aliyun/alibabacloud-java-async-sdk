// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DetachHostAccountsFromUserRequest} extends {@link RequestModel}
 *
 * <p>DetachHostAccountsFromUserRequest</p>
 */
public class DetachHostAccountsFromUserRequest extends Request {
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
    @NameInMap("UserId")
    @Validation(required = true)
    private String userId;

    private DetachHostAccountsFromUserRequest(Builder builder) {
        super(builder);
        this.hosts = builder.hosts;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetachHostAccountsFromUserRequest create() {
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
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<DetachHostAccountsFromUserRequest, Builder> {
        private String hosts; 
        private String instanceId; 
        private String regionId; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(DetachHostAccountsFromUserRequest request) {
            super(request);
            this.hosts = request.hosts;
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
            this.userId = request.userId;
        } 

        /**
         * The IDs of the host and host account on which you want to revoke permissions from the user. You can specify up to 10 host IDs and up to 10 host account IDs for each host. You can specify only host IDs. In this case, the permissions on both the specified hosts and all host accounts of the hosts are revoked from the user. For more information about this parameter, see the "Description of the Hosts parameter" section of this topic.
         * <p>
         * 
         * >  You can call the [ListHosts](~~200665~~) operation to query the ID of the host and the [ListHostAccounts](~~204372~~) operation to query the ID of the host account.
         */
        public Builder hosts(String hosts) {
            this.putQueryParameter("Hosts", hosts);
            this.hosts = hosts;
            return this;
        }

        /**
         * The ID of the bastion host in which you want to revoke permissions on the specified hosts and host accounts from the user.
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
         * The region ID of the bastion host in which you want to revoke permissions on the specified hosts and host accounts from the user.
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
         * The ID of the user from which you want to revoke permissions on the specified hosts and host accounts.
         * <p>
         * 
         * >  You can call the [ListUsers](~~204522~~) operation to query the ID of the user.
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public DetachHostAccountsFromUserRequest build() {
            return new DetachHostAccountsFromUserRequest(this);
        } 

    } 

}
