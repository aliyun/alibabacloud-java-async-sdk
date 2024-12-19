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
 * {@link GetVpcEndpointAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>GetVpcEndpointAttributeResponseBody</p>
 */
public class GetVpcEndpointAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AddressIpVersion")
    private String addressIpVersion;

    @com.aliyun.core.annotation.NameInMap("Bandwidth")
    private Integer bandwidth;

    @com.aliyun.core.annotation.NameInMap("ConnectionStatus")
    private String connectionStatus;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("EndpointBusinessStatus")
    private String endpointBusinessStatus;

    @com.aliyun.core.annotation.NameInMap("EndpointDescription")
    private String endpointDescription;

    @com.aliyun.core.annotation.NameInMap("EndpointDomain")
    private String endpointDomain;

    @com.aliyun.core.annotation.NameInMap("EndpointId")
    private String endpointId;

    @com.aliyun.core.annotation.NameInMap("EndpointName")
    private String endpointName;

    @com.aliyun.core.annotation.NameInMap("EndpointStatus")
    private String endpointStatus;

    @com.aliyun.core.annotation.NameInMap("EndpointType")
    private String endpointType;

    @com.aliyun.core.annotation.NameInMap("Payer")
    private String payer;

    @com.aliyun.core.annotation.NameInMap("PolicyDocument")
    private String policyDocument;

    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.NameInMap("ResourceOwner")
    private Boolean resourceOwner;

    @com.aliyun.core.annotation.NameInMap("ServiceId")
    private String serviceId;

    @com.aliyun.core.annotation.NameInMap("ServiceName")
    private String serviceName;

    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    @com.aliyun.core.annotation.NameInMap("ZoneAffinityEnabled")
    private Boolean zoneAffinityEnabled;

    @com.aliyun.core.annotation.NameInMap("ZonePrivateIpAddressCount")
    private Long zonePrivateIpAddressCount;

    private GetVpcEndpointAttributeResponseBody(Builder builder) {
        this.addressIpVersion = builder.addressIpVersion;
        this.bandwidth = builder.bandwidth;
        this.connectionStatus = builder.connectionStatus;
        this.createTime = builder.createTime;
        this.endpointBusinessStatus = builder.endpointBusinessStatus;
        this.endpointDescription = builder.endpointDescription;
        this.endpointDomain = builder.endpointDomain;
        this.endpointId = builder.endpointId;
        this.endpointName = builder.endpointName;
        this.endpointStatus = builder.endpointStatus;
        this.endpointType = builder.endpointType;
        this.payer = builder.payer;
        this.policyDocument = builder.policyDocument;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwner = builder.resourceOwner;
        this.serviceId = builder.serviceId;
        this.serviceName = builder.serviceName;
        this.vpcId = builder.vpcId;
        this.zoneAffinityEnabled = builder.zoneAffinityEnabled;
        this.zonePrivateIpAddressCount = builder.zonePrivateIpAddressCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVpcEndpointAttributeResponseBody create() {
        return builder().build();
    }

    /**
     * @return addressIpVersion
     */
    public String getAddressIpVersion() {
        return this.addressIpVersion;
    }

    /**
     * @return bandwidth
     */
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    /**
     * @return connectionStatus
     */
    public String getConnectionStatus() {
        return this.connectionStatus;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return endpointBusinessStatus
     */
    public String getEndpointBusinessStatus() {
        return this.endpointBusinessStatus;
    }

    /**
     * @return endpointDescription
     */
    public String getEndpointDescription() {
        return this.endpointDescription;
    }

    /**
     * @return endpointDomain
     */
    public String getEndpointDomain() {
        return this.endpointDomain;
    }

    /**
     * @return endpointId
     */
    public String getEndpointId() {
        return this.endpointId;
    }

    /**
     * @return endpointName
     */
    public String getEndpointName() {
        return this.endpointName;
    }

    /**
     * @return endpointStatus
     */
    public String getEndpointStatus() {
        return this.endpointStatus;
    }

    /**
     * @return endpointType
     */
    public String getEndpointType() {
        return this.endpointType;
    }

    /**
     * @return payer
     */
    public String getPayer() {
        return this.payer;
    }

    /**
     * @return policyDocument
     */
    public String getPolicyDocument() {
        return this.policyDocument;
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
     * @return resourceOwner
     */
    public Boolean getResourceOwner() {
        return this.resourceOwner;
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
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * @return zoneAffinityEnabled
     */
    public Boolean getZoneAffinityEnabled() {
        return this.zoneAffinityEnabled;
    }

    /**
     * @return zonePrivateIpAddressCount
     */
    public Long getZonePrivateIpAddressCount() {
        return this.zonePrivateIpAddressCount;
    }

    public static final class Builder {
        private String addressIpVersion; 
        private Integer bandwidth; 
        private String connectionStatus; 
        private String createTime; 
        private String endpointBusinessStatus; 
        private String endpointDescription; 
        private String endpointDomain; 
        private String endpointId; 
        private String endpointName; 
        private String endpointStatus; 
        private String endpointType; 
        private String payer; 
        private String policyDocument; 
        private String regionId; 
        private String requestId; 
        private String resourceGroupId; 
        private Boolean resourceOwner; 
        private String serviceId; 
        private String serviceName; 
        private String vpcId; 
        private Boolean zoneAffinityEnabled; 
        private Long zonePrivateIpAddressCount; 

        /**
         * AddressIpVersion.
         */
        public Builder addressIpVersion(String addressIpVersion) {
            this.addressIpVersion = addressIpVersion;
            return this;
        }

        /**
         * <p>The bandwidth of the endpoint connection. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        public Builder bandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }

        /**
         * <p>The state of the endpoint connection. Valid values:</p>
         * <ul>
         * <li><strong>Pending</strong>: The connection is being modified.</li>
         * <li><strong>Connecting</strong>: The connection is being established.</li>
         * <li><strong>Connected</strong>: The connection is established.</li>
         * <li><strong>Disconnecting</strong>: The endpoint is being disconnected from the endpoint service.</li>
         * <li><strong>Disconnected</strong>: The endpoint is disconnected from the endpoint service.</li>
         * <li><strong>Deleting</strong>: The connection is being deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Connected</p>
         */
        public Builder connectionStatus(String connectionStatus) {
            this.connectionStatus = connectionStatus;
            return this;
        }

        /**
         * <p>The time when the endpoint was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-09-24T18:00:07Z</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The service state of the endpoint. Valid values:</p>
         * <ul>
         * <li><strong>Normal</strong>: The endpoint runs as expected.</li>
         * <li><strong>FinancialLocked</strong>: The endpoint is locked due to overdue payments.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        public Builder endpointBusinessStatus(String endpointBusinessStatus) {
            this.endpointBusinessStatus = endpointBusinessStatus;
            return this;
        }

        /**
         * <p>The description of the endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>This is my Endpoint.</p>
         */
        public Builder endpointDescription(String endpointDescription) {
            this.endpointDescription = endpointDescription;
            return this;
        }

        /**
         * <p>The domain name of the endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>ep-hp33b2e43fays7s8****.epsrv-hp3xdsq46ael67lo****.cn-huhehaote.privatelink.aliyuncs.com</p>
         */
        public Builder endpointDomain(String endpointDomain) {
            this.endpointDomain = endpointDomain;
            return this;
        }

        /**
         * <p>The endpoint ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ep-hp33b2e43fays7s8****</p>
         */
        public Builder endpointId(String endpointId) {
            this.endpointId = endpointId;
            return this;
        }

        /**
         * <p>The name of the endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder endpointName(String endpointName) {
            this.endpointName = endpointName;
            return this;
        }

        /**
         * <p>The state of the endpoint. Valid values:</p>
         * <ul>
         * <li><strong>Creating</strong>: The endpoint is being created.</li>
         * <li><strong>Active</strong>: The endpoint is available.</li>
         * <li><strong>Pending</strong>: The endpoint is being modified.</li>
         * <li><strong>Deleting</strong>: The endpoint is being deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        public Builder endpointStatus(String endpointStatus) {
            this.endpointStatus = endpointStatus;
            return this;
        }

        /**
         * <p>The type of the endpoint.</p>
         * <p><strong>Interface</strong> is returned. The value indicates the interface endpoint with which the Classic Load Balancer (CLB) instances are associated.</p>
         * 
         * <strong>example:</strong>
         * <p>Interface</p>
         */
        public Builder endpointType(String endpointType) {
            this.endpointType = endpointType;
            return this;
        }

        /**
         * <p>The payer. Valid values:</p>
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
         * PolicyDocument.
         */
        public Builder policyDocument(String policyDocument) {
            this.policyDocument = policyDocument;
            return this;
        }

        /**
         * <p>The region ID of the endpoint.</p>
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
         * <p>rg-acfmz7nocpei***</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>Indicates whether the endpoint and the endpoint service belong to the same Alibaba Cloud account. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The endpoint and the endpoint service belong to the same Alibaba Cloud account.</li>
         * <li><strong>false</strong>: The endpoint and the endpoint service do not belong to the same Alibaba Cloud account.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder resourceOwner(Boolean resourceOwner) {
            this.resourceOwner = resourceOwner;
            return this;
        }

        /**
         * <p>The ID of the endpoint service with which the endpoint is associated.</p>
         * 
         * <strong>example:</strong>
         * <p>epsrv-hp3vpx8yqxblby3i****</p>
         */
        public Builder serviceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }

        /**
         * <p>The name of the endpoint service with which the endpoint is associated.</p>
         * 
         * <strong>example:</strong>
         * <p>com.aliyuncs.privatelink.cn-huhehaote.epsrv-hp3xdsq46ael67lo****</p>
         */
        public Builder serviceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }

        /**
         * <p>The ID of the virtual private cloud (VPC) to which the endpoint belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-fdfhkjafhjvcvdjf****</p>
         */
        public Builder vpcId(String vpcId) {
            this.vpcId = vpcId;
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
         * <p>true</p>
         */
        public Builder zoneAffinityEnabled(Boolean zoneAffinityEnabled) {
            this.zoneAffinityEnabled = zoneAffinityEnabled;
            return this;
        }

        /**
         * <p>The number of private IP addresses that are assigned to an elastic network interface (ENI) in each zone. Only <strong>1</strong> is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder zonePrivateIpAddressCount(Long zonePrivateIpAddressCount) {
            this.zonePrivateIpAddressCount = zonePrivateIpAddressCount;
            return this;
        }

        public GetVpcEndpointAttributeResponseBody build() {
            return new GetVpcEndpointAttributeResponseBody(this);
        } 

    } 

}
