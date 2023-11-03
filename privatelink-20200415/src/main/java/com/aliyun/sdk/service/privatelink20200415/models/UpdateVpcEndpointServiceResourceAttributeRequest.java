// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.privatelink20200415.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateVpcEndpointServiceResourceAttributeRequest} extends {@link RequestModel}
 *
 * <p>UpdateVpcEndpointServiceResourceAttributeRequest</p>
 */
public class UpdateVpcEndpointServiceResourceAttributeRequest extends Request {
    @Query
    @NameInMap("AutoAllocatedEnabled")
    @Validation(required = true)
    private Boolean autoAllocatedEnabled;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceId")
    @Validation(required = true)
    private String resourceId;

    @Query
    @NameInMap("ServiceId")
    @Validation(required = true)
    private String serviceId;

    @Query
    @NameInMap("ZoneId")
    private String zoneId;

    private UpdateVpcEndpointServiceResourceAttributeRequest(Builder builder) {
        super(builder);
        this.autoAllocatedEnabled = builder.autoAllocatedEnabled;
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.regionId = builder.regionId;
        this.resourceId = builder.resourceId;
        this.serviceId = builder.serviceId;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateVpcEndpointServiceResourceAttributeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoAllocatedEnabled
     */
    public Boolean getAutoAllocatedEnabled() {
        return this.autoAllocatedEnabled;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
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

    public static final class Builder extends Request.Builder<UpdateVpcEndpointServiceResourceAttributeRequest, Builder> {
        private Boolean autoAllocatedEnabled; 
        private String clientToken; 
        private Boolean dryRun; 
        private String regionId; 
        private String resourceId; 
        private String serviceId; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateVpcEndpointServiceResourceAttributeRequest request) {
            super(request);
            this.autoAllocatedEnabled = request.autoAllocatedEnabled;
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.regionId = request.regionId;
            this.resourceId = request.resourceId;
            this.serviceId = request.serviceId;
            this.zoneId = request.zoneId;
        } 

        /**
         * Specifies whether to enable automatic resource allocation. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder autoAllocatedEnabled(Boolean autoAllocatedEnabled) {
            this.putQueryParameter("AutoAllocatedEnabled", autoAllocatedEnabled);
            this.autoAllocatedEnabled = autoAllocatedEnabled;
            return this;
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
         * Specifies whether to perform a dry run. Valid values:
         * <p>
         * 
         * *   **true**: performs a dry run. The system checks the required parameters, request syntax, and limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the `DryRunOperation` error code is returned.
         * *   **false**: performs a dry run and sends the request. If the request passes the dry run, an HTTP 2xx status code is returned and the operation is performed. This is the default value.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * The ID of the region where the service resource is deployed.
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
         * The service resource ID.
         */
        public Builder resourceId(String resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
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
         * The zone ID of the service resource.
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public UpdateVpcEndpointServiceResourceAttributeRequest build() {
            return new UpdateVpcEndpointServiceResourceAttributeRequest(this);
        } 

    } 

}
