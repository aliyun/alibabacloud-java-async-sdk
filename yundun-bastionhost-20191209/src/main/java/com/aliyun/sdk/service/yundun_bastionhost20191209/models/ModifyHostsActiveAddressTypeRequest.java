// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyHostsActiveAddressTypeRequest} extends {@link RequestModel}
 *
 * <p>ModifyHostsActiveAddressTypeRequest</p>
 */
public class ModifyHostsActiveAddressTypeRequest extends Request {
    @Query
    @NameInMap("ActiveAddressType")
    @Validation(required = true)
    private String activeAddressType;

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

    private ModifyHostsActiveAddressTypeRequest(Builder builder) {
        super(builder);
        this.activeAddressType = builder.activeAddressType;
        this.hostIds = builder.hostIds;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyHostsActiveAddressTypeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return activeAddressType
     */
    public String getActiveAddressType() {
        return this.activeAddressType;
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

    public static final class Builder extends Request.Builder<ModifyHostsActiveAddressTypeRequest, Builder> {
        private String activeAddressType; 
        private String hostIds; 
        private String instanceId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyHostsActiveAddressTypeRequest request) {
            super(request);
            this.activeAddressType = request.activeAddressType;
            this.hostIds = request.hostIds;
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
        } 

        /**
         * The new portal type of the host. Valid values:
         * <p>
         * 
         * *   **Public**: public portal
         * *   **Private**: internal portal
         */
        public Builder activeAddressType(String activeAddressType) {
            this.putQueryParameter("ActiveAddressType", activeAddressType);
            this.activeAddressType = activeAddressType;
            return this;
        }

        /**
         * The ID of the host for which you want to change the portal type. The value is a JSON string. You can add up to 100 host IDs.
         * <p>
         * 
         * >  You can call the [ListHosts](~~200665~~) operation to query the ID of the host.
         */
        public Builder hostIds(String hostIds) {
            this.putQueryParameter("HostIds", hostIds);
            this.hostIds = hostIds;
            return this;
        }

        /**
         * The ID of the bastion host for which you want to change the portal type of the host.
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
         * The region ID of the bastion host for which you want to change the portal type of the host.
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
        public ModifyHostsActiveAddressTypeRequest build() {
            return new ModifyHostsActiveAddressTypeRequest(this);
        } 

    } 

}
