// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.privatelink20200415.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateVpcEndpointServiceResponseBody} extends {@link TeaModel}
 *
 * <p>CreateVpcEndpointServiceResponseBody</p>
 */
public class CreateVpcEndpointServiceResponseBody extends TeaModel {
    @NameInMap("AutoAcceptEnabled")
    private Boolean autoAcceptEnabled;

    @NameInMap("CreateTime")
    private String createTime;

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

    @NameInMap("ServiceStatus")
    private String serviceStatus;

    @NameInMap("ServiceSupportIPv6")
    private Boolean serviceSupportIPv6;

    @NameInMap("ZoneAffinityEnabled")
    private Boolean zoneAffinityEnabled;

    private CreateVpcEndpointServiceResponseBody(Builder builder) {
        this.autoAcceptEnabled = builder.autoAcceptEnabled;
        this.createTime = builder.createTime;
        this.requestId = builder.requestId;
        this.resourceGroupId = builder.resourceGroupId;
        this.serviceBusinessStatus = builder.serviceBusinessStatus;
        this.serviceDescription = builder.serviceDescription;
        this.serviceDomain = builder.serviceDomain;
        this.serviceId = builder.serviceId;
        this.serviceName = builder.serviceName;
        this.serviceStatus = builder.serviceStatus;
        this.serviceSupportIPv6 = builder.serviceSupportIPv6;
        this.zoneAffinityEnabled = builder.zoneAffinityEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateVpcEndpointServiceResponseBody create() {
        return builder().build();
    }

    /**
     * @return autoAcceptEnabled
     */
    public Boolean getAutoAcceptEnabled() {
        return this.autoAcceptEnabled;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
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
     * @return zoneAffinityEnabled
     */
    public Boolean getZoneAffinityEnabled() {
        return this.zoneAffinityEnabled;
    }

    public static final class Builder {
        private Boolean autoAcceptEnabled; 
        private String createTime; 
        private String requestId; 
        private String resourceGroupId; 
        private String serviceBusinessStatus; 
        private String serviceDescription; 
        private String serviceDomain; 
        private String serviceId; 
        private String serviceName; 
        private String serviceStatus; 
        private Boolean serviceSupportIPv6; 
        private Boolean zoneAffinityEnabled; 

        /**
         * Indicates whether the endpoint service automatically accepts endpoint connection requests. Valid values:
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
         * The time when the endpoint service was created.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
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
         * *   **FinancialLocked**: The endpoint service is locked due to overdue payments.
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
         * The state of the endpoint service. Valid values:
         * <p>
         * 
         * *   **Creating**: The endpoint service is being created.
         * *   **Pending**: The endpoint service is being modified.
         * *   **Active**: The endpoint service is available.
         * *   **Deleting**: The endpoint service is being deleted.
         */
        public Builder serviceStatus(String serviceStatus) {
            this.serviceStatus = serviceStatus;
            return this;
        }

        /**
         * Indicates whether IPv6 was enabled for the endpoint service. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder serviceSupportIPv6(Boolean serviceSupportIPv6) {
            this.serviceSupportIPv6 = serviceSupportIPv6;
            return this;
        }

        /**
         * Indicates whether the domain name of the nearest endpoint that is associated with the endpoint service is resolved first. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder zoneAffinityEnabled(Boolean zoneAffinityEnabled) {
            this.zoneAffinityEnabled = zoneAffinityEnabled;
            return this;
        }

        public CreateVpcEndpointServiceResponseBody build() {
            return new CreateVpcEndpointServiceResponseBody(this);
        } 

    } 

}
