// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.privatelink20200415.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateVpcEndpointZoneConnectionResourceAttributeRequest} extends {@link RequestModel}
 *
 * <p>UpdateVpcEndpointZoneConnectionResourceAttributeRequest</p>
 */
public class UpdateVpcEndpointZoneConnectionResourceAttributeRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("EndpointId")
    @Validation(required = true)
    private String endpointId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceAllocateMode")
    private String resourceAllocateMode;

    @Query
    @NameInMap("ResourceId")
    private String resourceId;

    @Query
    @NameInMap("ResourceReplaceMode")
    private String resourceReplaceMode;

    @Query
    @NameInMap("ResourceType")
    private String resourceType;

    @Query
    @NameInMap("ServiceId")
    @Validation(required = true)
    private String serviceId;

    @Query
    @NameInMap("ZoneId")
    @Validation(required = true, maximum = 2147483647)
    private String zoneId;

    private UpdateVpcEndpointZoneConnectionResourceAttributeRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.endpointId = builder.endpointId;
        this.regionId = builder.regionId;
        this.resourceAllocateMode = builder.resourceAllocateMode;
        this.resourceId = builder.resourceId;
        this.resourceReplaceMode = builder.resourceReplaceMode;
        this.resourceType = builder.resourceType;
        this.serviceId = builder.serviceId;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateVpcEndpointZoneConnectionResourceAttributeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return endpointId
     */
    public String getEndpointId() {
        return this.endpointId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceAllocateMode
     */
    public String getResourceAllocateMode() {
        return this.resourceAllocateMode;
    }

    /**
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * @return resourceReplaceMode
     */
    public String getResourceReplaceMode() {
        return this.resourceReplaceMode;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return serviceId
     */
    public String getServiceId() {
        return this.serviceId;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<UpdateVpcEndpointZoneConnectionResourceAttributeRequest, Builder> {
        private String clientToken; 
        private Boolean dryRun; 
        private String endpointId; 
        private String regionId; 
        private String resourceAllocateMode; 
        private String resourceId; 
        private String resourceReplaceMode; 
        private String resourceType; 
        private String serviceId; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateVpcEndpointZoneConnectionResourceAttributeRequest response) {
            super(response);
            this.clientToken = response.clientToken;
            this.dryRun = response.dryRun;
            this.endpointId = response.endpointId;
            this.regionId = response.regionId;
            this.resourceAllocateMode = response.resourceAllocateMode;
            this.resourceId = response.resourceId;
            this.resourceReplaceMode = response.resourceReplaceMode;
            this.resourceType = response.resourceType;
            this.serviceId = response.serviceId;
            this.zoneId = response.zoneId;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * DryRun.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * EndpointId.
         */
        public Builder endpointId(String endpointId) {
            this.putQueryParameter("EndpointId", endpointId);
            this.endpointId = endpointId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceAllocateMode.
         */
        public Builder resourceAllocateMode(String resourceAllocateMode) {
            this.putQueryParameter("ResourceAllocateMode", resourceAllocateMode);
            this.resourceAllocateMode = resourceAllocateMode;
            return this;
        }

        /**
         * ResourceId.
         */
        public Builder resourceId(String resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * ResourceReplaceMode.
         */
        public Builder resourceReplaceMode(String resourceReplaceMode) {
            this.putQueryParameter("ResourceReplaceMode", resourceReplaceMode);
            this.resourceReplaceMode = resourceReplaceMode;
            return this;
        }

        /**
         * ResourceType.
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * ServiceId.
         */
        public Builder serviceId(String serviceId) {
            this.putQueryParameter("ServiceId", serviceId);
            this.serviceId = serviceId;
            return this;
        }

        /**
         * ZoneId.
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public UpdateVpcEndpointZoneConnectionResourceAttributeRequest build() {
            return new UpdateVpcEndpointZoneConnectionResourceAttributeRequest(this);
        } 

    } 

}
