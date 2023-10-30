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
         * ActiveAddressType.
         */
        public Builder activeAddressType(String activeAddressType) {
            this.putQueryParameter("ActiveAddressType", activeAddressType);
            this.activeAddressType = activeAddressType;
            return this;
        }

        /**
         * All Alibaba Cloud API operations must include common request parameters. For more information about common request parameters, see [Common parameters](~~148139~~).
         * <p>
         * 
         * For more information about sample requests, see the "Examples" section of this topic.
         */
        public Builder hostIds(String hostIds) {
            this.putQueryParameter("HostIds", hostIds);
            this.hostIds = hostIds;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The operation that you want to perform.
         * <p>
         * 
         * Set the value to **ModifyHostsActiveAddressType**.
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
