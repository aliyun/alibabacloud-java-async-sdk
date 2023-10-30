// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveHostsFromGroupRequest} extends {@link RequestModel}
 *
 * <p>RemoveHostsFromGroupRequest</p>
 */
public class RemoveHostsFromGroupRequest extends Request {
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

    private RemoveHostsFromGroupRequest(Builder builder) {
        super(builder);
        this.hostGroupId = builder.hostGroupId;
        this.hostIds = builder.hostIds;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveHostsFromGroupRequest create() {
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

    public static final class Builder extends Request.Builder<RemoveHostsFromGroupRequest, Builder> {
        private String hostGroupId; 
        private String hostIds; 
        private String instanceId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(RemoveHostsFromGroupRequest request) {
            super(request);
            this.hostGroupId = request.hostGroupId;
            this.hostIds = request.hostIds;
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
        } 

        /**
         * The return code that indicates whether the call was successful. Valid values:
         * <p>
         * 
         * *   **OK**: The call was successful.
         * *   **UNEXPECTED**: An unknown error occurred.
         * *   **INVALID_ARGUMENT**: A request parameter is invalid.
         * *   **OBJECT_NOT_FOUND**: The specified object on which you want to perform the operation does not exist.
         * *   **OBJECT_AlREADY_EXISTS**: The specified object on which you want to perform the operation already exists.
         */
        public Builder hostGroupId(String hostGroupId) {
            this.putQueryParameter("HostGroupId", hostGroupId);
            this.hostGroupId = hostGroupId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder hostIds(String hostIds) {
            this.putQueryParameter("HostIds", hostIds);
            this.hostIds = hostIds;
            return this;
        }

        /**
         * The ID of the host that you want to remove from the host group. The value is a JSON string. You can add up to 100 host IDs.
         * <p>
         * 
         * >  You can call the [ListHosts](~~200665~~) operation to query the IDs of hosts.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The ID of the host group.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public RemoveHostsFromGroupRequest build() {
            return new RemoveHostsFromGroupRequest(this);
        } 

    } 

}
