// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.privatelink20200415.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateVpcEndpointServiceAttributeRequest} extends {@link RequestModel}
 *
 * <p>UpdateVpcEndpointServiceAttributeRequest</p>
 */
public class UpdateVpcEndpointServiceAttributeRequest extends Request {
    @Query
    @NameInMap("AutoAcceptEnabled")
    private Boolean autoAcceptEnabled;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("ConnectBandwidth")
    private Integer connectBandwidth;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ServiceDescription")
    private String serviceDescription;

    @Query
    @NameInMap("ServiceId")
    @Validation(required = true)
    private String serviceId;

    @Query
    @NameInMap("ZoneAffinityEnabled")
    private Boolean zoneAffinityEnabled;

    private UpdateVpcEndpointServiceAttributeRequest(Builder builder) {
        super(builder);
        this.autoAcceptEnabled = builder.autoAcceptEnabled;
        this.clientToken = builder.clientToken;
        this.connectBandwidth = builder.connectBandwidth;
        this.dryRun = builder.dryRun;
        this.regionId = builder.regionId;
        this.serviceDescription = builder.serviceDescription;
        this.serviceId = builder.serviceId;
        this.zoneAffinityEnabled = builder.zoneAffinityEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateVpcEndpointServiceAttributeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoAcceptEnabled
     */
    public Boolean getAutoAcceptEnabled() {
        return this.autoAcceptEnabled;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return connectBandwidth
     */
    public Integer getConnectBandwidth() {
        return this.connectBandwidth;
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
     * @return serviceDescription
     */
    public String getServiceDescription() {
        return this.serviceDescription;
    }

    /**
     * @return serviceId
     */
    public String getServiceId() {
        return this.serviceId;
    }

    /**
     * @return zoneAffinityEnabled
     */
    public Boolean getZoneAffinityEnabled() {
        return this.zoneAffinityEnabled;
    }

    public static final class Builder extends Request.Builder<UpdateVpcEndpointServiceAttributeRequest, Builder> {
        private Boolean autoAcceptEnabled; 
        private String clientToken; 
        private Integer connectBandwidth; 
        private Boolean dryRun; 
        private String regionId; 
        private String serviceDescription; 
        private String serviceId; 
        private Boolean zoneAffinityEnabled; 

        private Builder() {
            super();
        } 

        private Builder(UpdateVpcEndpointServiceAttributeRequest response) {
            super(response);
            this.autoAcceptEnabled = response.autoAcceptEnabled;
            this.clientToken = response.clientToken;
            this.connectBandwidth = response.connectBandwidth;
            this.dryRun = response.dryRun;
            this.regionId = response.regionId;
            this.serviceDescription = response.serviceDescription;
            this.serviceId = response.serviceId;
            this.zoneAffinityEnabled = response.zoneAffinityEnabled;
        } 

        /**
         * AutoAcceptEnabled.
         */
        public Builder autoAcceptEnabled(Boolean autoAcceptEnabled) {
            this.putQueryParameter("AutoAcceptEnabled", autoAcceptEnabled);
            this.autoAcceptEnabled = autoAcceptEnabled;
            return this;
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
         * ConnectBandwidth.
         */
        public Builder connectBandwidth(Integer connectBandwidth) {
            this.putQueryParameter("ConnectBandwidth", connectBandwidth);
            this.connectBandwidth = connectBandwidth;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ServiceDescription.
         */
        public Builder serviceDescription(String serviceDescription) {
            this.putQueryParameter("ServiceDescription", serviceDescription);
            this.serviceDescription = serviceDescription;
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
         * ZoneAffinityEnabled.
         */
        public Builder zoneAffinityEnabled(Boolean zoneAffinityEnabled) {
            this.putQueryParameter("ZoneAffinityEnabled", zoneAffinityEnabled);
            this.zoneAffinityEnabled = zoneAffinityEnabled;
            return this;
        }

        @Override
        public UpdateVpcEndpointServiceAttributeRequest build() {
            return new UpdateVpcEndpointServiceAttributeRequest(this);
        } 

    } 

}
