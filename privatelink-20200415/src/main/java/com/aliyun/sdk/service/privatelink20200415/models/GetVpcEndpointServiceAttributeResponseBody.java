// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.privatelink20200415.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetVpcEndpointServiceAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>GetVpcEndpointServiceAttributeResponseBody</p>
 */
public class GetVpcEndpointServiceAttributeResponseBody extends TeaModel {
    @NameInMap("AutoAcceptEnabled")
    private Boolean autoAcceptEnabled;

    @NameInMap("ConnectBandwidth")
    private Integer connectBandwidth;

    @NameInMap("CreateTime")
    private String createTime;

    @NameInMap("MaxBandwidth")
    private Integer maxBandwidth;

    @NameInMap("MinBandwidth")
    private Integer minBandwidth;

    @NameInMap("Payer")
    private String payer;

    @NameInMap("RegionId")
    private String regionId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @NameInMap("ServiceBusinessStatus")
    private String serviceBusinessStatus;

    @NameInMap("ServiceDescription")
    private String serviceDescription;

    @NameInMap("ServiceDomain")
    private String serviceDomain;

    @NameInMap("ServiceId")
    private String serviceId;

    @NameInMap("ServiceName")
    private String serviceName;

    @NameInMap("ServiceResourceType")
    private String serviceResourceType;

    @NameInMap("ServiceStatus")
    private String serviceStatus;

    @NameInMap("ServiceSupportIPv6")
    private Boolean serviceSupportIPv6;

    @NameInMap("ServiceType")
    private String serviceType;

    @NameInMap("ZoneAffinityEnabled")
    private Boolean zoneAffinityEnabled;

    @NameInMap("Zones")
    private java.util.List < String > zones;

    private GetVpcEndpointServiceAttributeResponseBody(Builder builder) {
        this.autoAcceptEnabled = builder.autoAcceptEnabled;
        this.connectBandwidth = builder.connectBandwidth;
        this.createTime = builder.createTime;
        this.maxBandwidth = builder.maxBandwidth;
        this.minBandwidth = builder.minBandwidth;
        this.payer = builder.payer;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.resourceGroupId = builder.resourceGroupId;
        this.serviceBusinessStatus = builder.serviceBusinessStatus;
        this.serviceDescription = builder.serviceDescription;
        this.serviceDomain = builder.serviceDomain;
        this.serviceId = builder.serviceId;
        this.serviceName = builder.serviceName;
        this.serviceResourceType = builder.serviceResourceType;
        this.serviceStatus = builder.serviceStatus;
        this.serviceSupportIPv6 = builder.serviceSupportIPv6;
        this.serviceType = builder.serviceType;
        this.zoneAffinityEnabled = builder.zoneAffinityEnabled;
        this.zones = builder.zones;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVpcEndpointServiceAttributeResponseBody create() {
        return builder().build();
    }

    /**
     * @return autoAcceptEnabled
     */
    public Boolean getAutoAcceptEnabled() {
        return this.autoAcceptEnabled;
    }

    /**
     * @return connectBandwidth
     */
    public Integer getConnectBandwidth() {
        return this.connectBandwidth;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return maxBandwidth
     */
    public Integer getMaxBandwidth() {
        return this.maxBandwidth;
    }

    /**
     * @return minBandwidth
     */
    public Integer getMinBandwidth() {
        return this.minBandwidth;
    }

    /**
     * @return payer
     */
    public String getPayer() {
        return this.payer;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return serviceBusinessStatus
     */
    public String getServiceBusinessStatus() {
        return this.serviceBusinessStatus;
    }

    /**
     * @return serviceDescription
     */
    public String getServiceDescription() {
        return this.serviceDescription;
    }

    /**
     * @return serviceDomain
     */
    public String getServiceDomain() {
        return this.serviceDomain;
    }

    /**
     * @return serviceId
     */
    public String getServiceId() {
        return this.serviceId;
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * @return serviceResourceType
     */
    public String getServiceResourceType() {
        return this.serviceResourceType;
    }

    /**
     * @return serviceStatus
     */
    public String getServiceStatus() {
        return this.serviceStatus;
    }

    /**
     * @return serviceSupportIPv6
     */
    public Boolean getServiceSupportIPv6() {
        return this.serviceSupportIPv6;
    }

    /**
     * @return serviceType
     */
    public String getServiceType() {
        return this.serviceType;
    }

    /**
     * @return zoneAffinityEnabled
     */
    public Boolean getZoneAffinityEnabled() {
        return this.zoneAffinityEnabled;
    }

    /**
     * @return zones
     */
    public java.util.List < String > getZones() {
        return this.zones;
    }

    public static final class Builder {
        private Boolean autoAcceptEnabled; 
        private Integer connectBandwidth; 
        private String createTime; 
        private Integer maxBandwidth; 
        private Integer minBandwidth; 
        private String payer; 
        private String regionId; 
        private String requestId; 
        private String resourceGroupId; 
        private String serviceBusinessStatus; 
        private String serviceDescription; 
        private String serviceDomain; 
        private String serviceId; 
        private String serviceName; 
        private String serviceResourceType; 
        private String serviceStatus; 
        private Boolean serviceSupportIPv6; 
        private String serviceType; 
        private Boolean zoneAffinityEnabled; 
        private java.util.List < String > zones; 

        /**
         * Indicates whether endpoint connection requests are automatically accepted. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder autoAcceptEnabled(Boolean autoAcceptEnabled) {
            this.autoAcceptEnabled = autoAcceptEnabled;
            return this;
        }

        /**
         * The default maximum bandwidth of the endpoint connection. Unit: Mbit/s. Valid values: **100** to 10240.
         */
        public Builder connectBandwidth(Integer connectBandwidth) {
            this.connectBandwidth = connectBandwidth;
            return this;
        }

        /**
         * The time when the endpoint service was created.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * The maximum bandwidth of the endpoint connection. Unit: Mbit/s.
         */
        public Builder maxBandwidth(Integer maxBandwidth) {
            this.maxBandwidth = maxBandwidth;
            return this;
        }

        /**
         * The minimum bandwidth of the endpoint connection. Unit: Mbit/s.
         */
        public Builder minBandwidth(Integer minBandwidth) {
            this.minBandwidth = minBandwidth;
            return this;
        }

        /**
         * The payer of the endpoint service. Valid values:
         * <p>
         * 
         * *   **Endpoint**: the service consumer.
         * *   **EndpointService**: the service provider.
         */
        public Builder payer(String payer) {
            this.payer = payer;
            return this;
        }

        /**
         * The region ID of the endpoint service.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The resource group ID.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The service state of the endpoint service. Valid values:
         * <p>
         * 
         * *   **Normal**: The endpoint service runs as expected.
         * *   **FinacialLocked**: The endpoint service is locked due to overdue payments.
         */
        public Builder serviceBusinessStatus(String serviceBusinessStatus) {
            this.serviceBusinessStatus = serviceBusinessStatus;
            return this;
        }

        /**
         * The description of the endpoint service.
         */
        public Builder serviceDescription(String serviceDescription) {
            this.serviceDescription = serviceDescription;
            return this;
        }

        /**
         * The domain name of the endpoint service.
         */
        public Builder serviceDomain(String serviceDomain) {
            this.serviceDomain = serviceDomain;
            return this;
        }

        /**
         * The endpoint service ID.
         */
        public Builder serviceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }

        /**
         * The name of the endpoint service.
         */
        public Builder serviceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }

        /**
         * The type of the service resource. Valid values:
         * <p>
         * 
         * *   **slb**: a CLB instance.
         * *   **alb**: an ALB instance.
         */
        public Builder serviceResourceType(String serviceResourceType) {
            this.serviceResourceType = serviceResourceType;
            return this;
        }

        /**
         * The state of the endpoint service. Valid values:
         * <p>
         * 
         * *   **Creating**: The endpoint service is being created.
         * *   **Pending**: The endpoint service is being modified.
         * *   **Active**: The endpoint service is available.
         * *   **Deleting**: The endpoint service is being deleted.
         * *   **Inactive**: The endpoint service is unavailable.
         */
        public Builder serviceStatus(String serviceStatus) {
            this.serviceStatus = serviceStatus;
            return this;
        }

        /**
         * Indicates whether IPv6 is enabled for the endpoint service. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false** (default)
         */
        public Builder serviceSupportIPv6(Boolean serviceSupportIPv6) {
            this.serviceSupportIPv6 = serviceSupportIPv6;
            return this;
        }

        /**
         * The type of the endpoint.
         * <p>
         * 
         * Only **Interface** is returned. The value indicates the interface endpoint. Then, you can specify ALB and CLB instances as service resources for the endpoint service.
         */
        public Builder serviceType(String serviceType) {
            this.serviceType = serviceType;
            return this;
        }

        /**
         * Indicates whether the domain name of the nearest endpoint that is associated with the endpoint service is resolved first. Valid values:
         * <p>
         * 
         * *   **true** (default)
         * *   **false**
         */
        public Builder zoneAffinityEnabled(Boolean zoneAffinityEnabled) {
            this.zoneAffinityEnabled = zoneAffinityEnabled;
            return this;
        }

        /**
         * The zones to which the service resources belong.
         */
        public Builder zones(java.util.List < String > zones) {
            this.zones = zones;
            return this;
        }

        public GetVpcEndpointServiceAttributeResponseBody build() {
            return new GetVpcEndpointServiceAttributeResponseBody(this);
        } 

    } 

}
