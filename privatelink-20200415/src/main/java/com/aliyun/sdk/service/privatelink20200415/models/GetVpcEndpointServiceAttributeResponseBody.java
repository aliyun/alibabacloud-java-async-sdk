// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.privatelink20200415.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetVpcEndpointServiceAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>GetVpcEndpointServiceAttributeResponseBody</p>
 */
public class GetVpcEndpointServiceAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AddressIpVersion")
    private String addressIpVersion;

    @com.aliyun.core.annotation.NameInMap("AutoAcceptEnabled")
    private Boolean autoAcceptEnabled;

    @com.aliyun.core.annotation.NameInMap("ConnectBandwidth")
    private Integer connectBandwidth;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("MaxBandwidth")
    private Integer maxBandwidth;

    @com.aliyun.core.annotation.NameInMap("MinBandwidth")
    private Integer minBandwidth;

    @com.aliyun.core.annotation.NameInMap("Payer")
    private String payer;

    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.NameInMap("ServiceBusinessStatus")
    private String serviceBusinessStatus;

    @com.aliyun.core.annotation.NameInMap("ServiceDescription")
    private String serviceDescription;

    @com.aliyun.core.annotation.NameInMap("ServiceDomain")
    private String serviceDomain;

    @com.aliyun.core.annotation.NameInMap("ServiceId")
    private String serviceId;

    @com.aliyun.core.annotation.NameInMap("ServiceName")
    private String serviceName;

    @com.aliyun.core.annotation.NameInMap("ServiceResourceType")
    private String serviceResourceType;

    @com.aliyun.core.annotation.NameInMap("ServiceStatus")
    private String serviceStatus;

    @com.aliyun.core.annotation.NameInMap("ServiceSupportIPv6")
    @Deprecated
    private Boolean serviceSupportIPv6;

    @com.aliyun.core.annotation.NameInMap("ServiceType")
    private String serviceType;

    @com.aliyun.core.annotation.NameInMap("ZoneAffinityEnabled")
    private Boolean zoneAffinityEnabled;

    @com.aliyun.core.annotation.NameInMap("Zones")
    private java.util.List<String> zones;

    private GetVpcEndpointServiceAttributeResponseBody(Builder builder) {
        this.addressIpVersion = builder.addressIpVersion;
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
     * @return addressIpVersion
     */
    public String getAddressIpVersion() {
        return this.addressIpVersion;
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
    public java.util.List<String> getZones() {
        return this.zones;
    }

    public static final class Builder {
        private String addressIpVersion; 
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
        private java.util.List<String> zones; 

        /**
         * AddressIpVersion.
         */
        public Builder addressIpVersion(String addressIpVersion) {
            this.addressIpVersion = addressIpVersion;
            return this;
        }

        /**
         * <p>Indicates whether endpoint connection requests are automatically accepted. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoAcceptEnabled(Boolean autoAcceptEnabled) {
            this.autoAcceptEnabled = autoAcceptEnabled;
            return this;
        }

        /**
         * <p>The default maximum bandwidth of the endpoint connection. Unit: Mbit/s. Valid values: <strong>100</strong> to 10240.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        public Builder connectBandwidth(Integer connectBandwidth) {
            this.connectBandwidth = connectBandwidth;
            return this;
        }

        /**
         * <p>The time when the endpoint service was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-01-02T19:11:12Z</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The maximum bandwidth of the endpoint connection. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        public Builder maxBandwidth(Integer maxBandwidth) {
            this.maxBandwidth = maxBandwidth;
            return this;
        }

        /**
         * <p>The minimum bandwidth of the endpoint connection. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder minBandwidth(Integer minBandwidth) {
            this.minBandwidth = minBandwidth;
            return this;
        }

        /**
         * <p>The payer of the endpoint service. Valid values:</p>
         * <ul>
         * <li><strong>Endpoint</strong>: the service consumer.</li>
         * <li><strong>EndpointService</strong>: the service provider.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Endpoint</p>
         */
        public Builder payer(String payer) {
            this.payer = payer;
            return this;
        }

        /**
         * <p>The region ID of the endpoint service.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-huhehaote</p>
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>8D8992C1-6712-423C-BAC5-E5E817484C6B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmy*****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The service status of the endpoint service. Valid values:</p>
         * <ul>
         * <li><strong>Normal</strong>: The endpoint service runs as expected.</li>
         * <li><strong>FinancialLocked</strong>: The endpoint service is locked due to overdue payments.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        public Builder serviceBusinessStatus(String serviceBusinessStatus) {
            this.serviceBusinessStatus = serviceBusinessStatus;
            return this;
        }

        /**
         * <p>The description of the endpoint service.</p>
         * 
         * <strong>example:</strong>
         * <p>This is my EndpointService.</p>
         */
        public Builder serviceDescription(String serviceDescription) {
            this.serviceDescription = serviceDescription;
            return this;
        }

        /**
         * <p>The domain name of the endpoint service.</p>
         * 
         * <strong>example:</strong>
         * <p>epsrv-hp3vpx8yqxblby3i****.cn-huhehaote.privatelink.aliyuncs.com</p>
         */
        public Builder serviceDomain(String serviceDomain) {
            this.serviceDomain = serviceDomain;
            return this;
        }

        /**
         * <p>The endpoint service ID.</p>
         * 
         * <strong>example:</strong>
         * <p>epsrv-hp3vpx8yqxblby3i****</p>
         */
        public Builder serviceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }

        /**
         * <p>The name of the endpoint service.</p>
         * 
         * <strong>example:</strong>
         * <p>com.aliyuncs.privatelink.cn-huhehaote.epsrv-hp3vpx8yqxblby3i****</p>
         */
        public Builder serviceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }

        /**
         * <p>The type of the service resource. Valid values:</p>
         * <ul>
         * <li><strong>slb</strong>: a CLB instance.</li>
         * <li><strong>alb</strong>: an ALB instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>slb</p>
         */
        public Builder serviceResourceType(String serviceResourceType) {
            this.serviceResourceType = serviceResourceType;
            return this;
        }

        /**
         * <p>The state of the endpoint service. Valid values:</p>
         * <ul>
         * <li><strong>Creating</strong>: The endpoint service is being created.</li>
         * <li><strong>Pending</strong>: The endpoint service is being modified.</li>
         * <li><strong>Active</strong>: The endpoint service is available.</li>
         * <li><strong>Deleting</strong>: The endpoint service is being deleted.</li>
         * <li><strong>Inactive</strong>: The endpoint service is unavailable.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        public Builder serviceStatus(String serviceStatus) {
            this.serviceStatus = serviceStatus;
            return this;
        }

        /**
         * <p>Specifies whether the endpoint service supports IPv6. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong> (default)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder serviceSupportIPv6(Boolean serviceSupportIPv6) {
            this.serviceSupportIPv6 = serviceSupportIPv6;
            return this;
        }

        /**
         * <p>The type of the endpoint.</p>
         * <p>Only <strong>Interface</strong> is returned. The value indicates the interface endpoint. Then, you can specify ALB and CLB instances as service resources for the endpoint service.</p>
         * 
         * <strong>example:</strong>
         * <p>Interface</p>
         */
        public Builder serviceType(String serviceType) {
            this.serviceType = serviceType;
            return this;
        }

        /**
         * <p>Indicates whether the domain name of the nearest endpoint that is associated with the endpoint service is resolved first. Valid values:</p>
         * <ul>
         * <li><strong>true</strong> (default)</li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder zoneAffinityEnabled(Boolean zoneAffinityEnabled) {
            this.zoneAffinityEnabled = zoneAffinityEnabled;
            return this;
        }

        /**
         * <p>The zones to which the service resources belong.</p>
         */
        public Builder zones(java.util.List<String> zones) {
            this.zones = zones;
            return this;
        }

        public GetVpcEndpointServiceAttributeResponseBody build() {
            return new GetVpcEndpointServiceAttributeResponseBody(this);
        } 

    } 

}
