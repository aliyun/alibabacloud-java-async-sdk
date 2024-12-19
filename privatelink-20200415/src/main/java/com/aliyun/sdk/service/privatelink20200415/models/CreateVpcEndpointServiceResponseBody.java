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
 * {@link CreateVpcEndpointServiceResponseBody} extends {@link TeaModel}
 *
 * <p>CreateVpcEndpointServiceResponseBody</p>
 */
public class CreateVpcEndpointServiceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AddressIpVersion")
    private String addressIpVersion;

    @com.aliyun.core.annotation.NameInMap("AutoAcceptEnabled")
    private Boolean autoAcceptEnabled;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

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

    @com.aliyun.core.annotation.NameInMap("ServiceStatus")
    private String serviceStatus;

    @com.aliyun.core.annotation.NameInMap("ServiceSupportIPv6")
    private Boolean serviceSupportIPv6;

    @com.aliyun.core.annotation.NameInMap("ZoneAffinityEnabled")
    private Boolean zoneAffinityEnabled;

    private CreateVpcEndpointServiceResponseBody(Builder builder) {
        this.addressIpVersion = builder.addressIpVersion;
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
        private String addressIpVersion; 
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
         * AddressIpVersion.
         */
        public Builder addressIpVersion(String addressIpVersion) {
            this.addressIpVersion = addressIpVersion;
            return this;
        }

        /**
         * <p>Indicates whether the endpoint service automatically accepts endpoint connection requests. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder autoAcceptEnabled(Boolean autoAcceptEnabled) {
            this.autoAcceptEnabled = autoAcceptEnabled;
            return this;
        }

        /**
         * <p>The time when the endpoint service was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-01-02T19:11:12Z</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
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
         * <p>The service state of the endpoint service. Valid values:</p>
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
         * <p>The state of the endpoint service. Valid values:</p>
         * <ul>
         * <li><strong>Creating</strong>: The endpoint service is being created.</li>
         * <li><strong>Pending</strong>: The endpoint service is being modified.</li>
         * <li><strong>Active</strong>: The endpoint service is available.</li>
         * <li><strong>Deleting</strong>: The endpoint service is being deleted.</li>
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
         * <p>Indicates whether IPv6 was enabled for the endpoint service. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
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
         * <p>Indicates whether the domain name of the nearest endpoint that is associated with the endpoint service is resolved first. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
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
