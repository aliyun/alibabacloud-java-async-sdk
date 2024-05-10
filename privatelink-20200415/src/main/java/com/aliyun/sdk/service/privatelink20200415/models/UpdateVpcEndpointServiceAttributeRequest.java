// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.privatelink20200415.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateVpcEndpointServiceAttributeRequest} extends {@link RequestModel}
 *
 * <p>UpdateVpcEndpointServiceAttributeRequest</p>
 */
public class UpdateVpcEndpointServiceAttributeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoAcceptEnabled")
    private Boolean autoAcceptEnabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConnectBandwidth")
    private Integer connectBandwidth;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceDescription")
    private String serviceDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceSupportIPv6")
    private Boolean serviceSupportIPv6;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneAffinityEnabled")
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
         * The default maximum bandwidth of the endpoint connection. Unit: Mbit/s. Default value: **3072**.
         * <p>
         * 
         * Valid values: **100** to **10240**.
         * 
         * >  You can specify this parameter only if you specify Classic Load Balancer (CLB) instances or Application Load Balancer (ALB) instances as service resources.
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
         * Specifies whether to first resolve the domain name of the nearest endpoint that is associated with the endpoint service. Valid values:
         * <p>
         * 
         * *   **true** (default)
         * *   **false**
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
