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
    @NameInMap("ServiceSupportIPv6")
    private Boolean serviceSupportIPv6;

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
        this.serviceSupportIPv6 = builder.serviceSupportIPv6;
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
     * @return serviceSupportIPv6
     */
    public Boolean getServiceSupportIPv6() {
        return this.serviceSupportIPv6;
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
        private Boolean serviceSupportIPv6; 
        private Boolean zoneAffinityEnabled; 

        private Builder() {
            super();
        } 

        private Builder(UpdateVpcEndpointServiceAttributeRequest request) {
            super(request);
            this.autoAcceptEnabled = request.autoAcceptEnabled;
            this.clientToken = request.clientToken;
            this.connectBandwidth = request.connectBandwidth;
            this.dryRun = request.dryRun;
            this.regionId = request.regionId;
            this.serviceDescription = request.serviceDescription;
            this.serviceId = request.serviceId;
            this.serviceSupportIPv6 = request.serviceSupportIPv6;
            this.zoneAffinityEnabled = request.zoneAffinityEnabled;
        } 

        /**
         * Specifies whether to automatically accept endpoint connection requests. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder autoAcceptEnabled(Boolean autoAcceptEnabled) {
            this.putQueryParameter("AutoAcceptEnabled", autoAcceptEnabled);
            this.autoAcceptEnabled = autoAcceptEnabled;
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
         * The default bandwidth of the endpoint connection. Valid values: **100** to **10240**. Unit: Mbit/s.
         */
        public Builder connectBandwidth(Integer connectBandwidth) {
            this.putQueryParameter("ConnectBandwidth", connectBandwidth);
            this.connectBandwidth = connectBandwidth;
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
         * The region ID of the endpoint service.
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
         * The description of the endpoint service.
         */
        public Builder serviceDescription(String serviceDescription) {
            this.putQueryParameter("ServiceDescription", serviceDescription);
            this.serviceDescription = serviceDescription;
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
         * Specifies whether to enable IPv6. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false** (default)
         */
        public Builder serviceSupportIPv6(Boolean serviceSupportIPv6) {
            this.putQueryParameter("ServiceSupportIPv6", serviceSupportIPv6);
            this.serviceSupportIPv6 = serviceSupportIPv6;
            return this;
        }

        /**
         * Specifies whether to enable zone affinity. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false** (default)
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
