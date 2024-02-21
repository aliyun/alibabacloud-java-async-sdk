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

        private Builder(UpdateVpcEndpointZoneConnectionResourceAttributeRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.endpointId = request.endpointId;
            this.regionId = request.regionId;
            this.resourceAllocateMode = request.resourceAllocateMode;
            this.resourceId = request.resourceId;
            this.resourceReplaceMode = request.resourceReplaceMode;
            this.resourceType = request.resourceType;
            this.serviceId = request.serviceId;
            this.zoneId = request.zoneId;
        } 

        /**
         * The client token that is used to ensure the idempotence of the request.
         * <p>
         * 
         * You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Specifies whether to perform only a dry run, without performing the actual request. Valid values:
         * <p>
         * 
         * *   **true**: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the `DryRunOperation` error code is returned.
         * *   **false** (default): performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * The endpoint ID.
         */
        public Builder endpointId(String endpointId) {
            this.putQueryParameter("EndpointId", endpointId);
            this.endpointId = endpointId;
            return this;
        }

        /**
         * The region ID of the endpoint connection whose bandwidth you want to modify.
         * <p>
         * 
         * You can call the [DescribeRegions](~~120468~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The resource allocation mode. You can change the resource allocation mode only if the endpoint connection is in the **Disconnected** state. Valid values:
         * <p>
         * 
         * *   **Auto**: automatically and randomly allocates service resources. In this mode, the specified service resource is deleted.
         * *   **Manual**: manually allocates service resources. If you set the value to Manual, you must also specify the **ResourceId** and **ResourceType** parameters.
         */
        public Builder resourceAllocateMode(String resourceAllocateMode) {
            this.putQueryParameter("ResourceAllocateMode", resourceAllocateMode);
            this.resourceAllocateMode = resourceAllocateMode;
            return this;
        }

        /**
         * The ID of the service resource that you want to manually allocate or migrate in the zone where the endpoint connection is deployed.
         * <p>
         * 
         * > If **ResourceAllocateMode** is set to **Mannual**, or **ResourceReplaceMode** is set, this parameter is required.
         */
        public Builder resourceId(String resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * The migration mode of the service resource. Valid values:
         * <p>
         * 
         * *   **Graceful**: smooth migration. Service resources in the zone are smoothly migrated.
         * *   **Force**: forced migration. Service resources in the zone are forcefully migrated.
         * 
         * >  You need to specify this parameter only if you want to migrate service resources and the endpoint connection is in the **Connected** state. If you specify this parameter, you must also specify the **ResourceId** and **ResourceType** parameters.
         */
        public Builder resourceReplaceMode(String resourceReplaceMode) {
            this.putQueryParameter("ResourceReplaceMode", resourceReplaceMode);
            this.resourceReplaceMode = resourceReplaceMode;
            return this;
        }

        /**
         * The type of the service resource. Valid values:
         * <p>
         * 
         * *   **slb**: a CLB instance that supports PrivateLink. In addition, the CLB instance is deployed in a VPC.
         * *   **alb**: an Application Load Balancer (ALB) instance that supports PrivateLink. In addition, the ALB instance is deployed in a VPC.
         * 
         * > If **ResourceAllocateMode** is set to **Mannual**, or **ResourceReplaceMode** is set, this parameter is required.
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * The endpoint service ID.
         */
        public Builder serviceId(String serviceId) {
            this.putQueryParameter("ServiceId", serviceId);
            this.serviceId = serviceId;
            return this;
        }

        /**
         * The zone ID.
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
