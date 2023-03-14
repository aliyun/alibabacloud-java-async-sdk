// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddHostsToGroupRequest} extends {@link RequestModel}
 *
 * <p>AddHostsToGroupRequest</p>
 */
public class AddHostsToGroupRequest extends Request {
    @Query
    @NameInMap("HostGroupId")
    @Validation(required = true)
    private String hostGroupId;

    @Query
    @NameInMap("HostIds")
    @Validation(required = true)
    private String hostIds;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private AddHostsToGroupRequest(Builder builder) {
        super(builder);
        this.hostGroupId = builder.hostGroupId;
        this.hostIds = builder.hostIds;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddHostsToGroupRequest create() {
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
     * @return hostIds
     */
    public String getHostIds() {
        return this.hostIds;
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

    public static final class Builder extends Request.Builder<AddHostsToGroupRequest, Builder> {
        private String hostGroupId; 
        private String hostIds; 
        private String instanceId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(AddHostsToGroupRequest request) {
            super(request);
            this.hostGroupId = request.hostGroupId;
            this.hostIds = request.hostIds;
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
        } 

        /**
         * The ID of the host group to which you want to add hosts.
         * <p>
         * 
         * >  You can call the [ListHostGroups](~~201307~~) operation to query the ID of the host group.
         */
        public Builder hostGroupId(String hostGroupId) {
            this.putQueryParameter("HostGroupId", hostGroupId);
            this.hostGroupId = hostGroupId;
            return this;
        }

        /**
         * The ID of the host that you want to add to the host group. The value is a JSON string. You can add up to 100 host IDs.
         * <p>
         * 
         * >  You can call the [ListHosts](~~200665~~) operation to query the IDs of hosts.
         */
        public Builder hostIds(String hostIds) {
            this.putQueryParameter("HostIds", hostIds);
            this.hostIds = hostIds;
            return this;
        }

        /**
         * The ID of the bastion host for which you want to add hosts to the host group.
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
         * The region ID of the bastion host for which you want to add hosts to the host group.
         * <p>
         * 
         * >  For more information about the mapping between region IDs and region names, see [Regions and zones](~~40654~~).
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public AddHostsToGroupRequest build() {
            return new AddHostsToGroupRequest(this);
        } 

    } 

}
