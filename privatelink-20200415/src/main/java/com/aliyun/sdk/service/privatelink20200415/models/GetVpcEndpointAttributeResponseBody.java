// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.privatelink20200415.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetVpcEndpointAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>GetVpcEndpointAttributeResponseBody</p>
 */
public class GetVpcEndpointAttributeResponseBody extends TeaModel {
    @NameInMap("Bandwidth")
    private Integer bandwidth;

    @NameInMap("ConnectionStatus")
    private String connectionStatus;

    @NameInMap("CreateTime")
    private String createTime;

    @NameInMap("EndpointBusinessStatus")
    private String endpointBusinessStatus;

    @NameInMap("EndpointDescription")
    private String endpointDescription;

    @NameInMap("EndpointDomain")
    private String endpointDomain;

    @NameInMap("EndpointId")
    private String endpointId;

    @NameInMap("EndpointName")
    private String endpointName;

    @NameInMap("EndpointStatus")
    private String endpointStatus;

    @NameInMap("EndpointType")
    private String endpointType;

    @NameInMap("Payer")
    private String payer;

    @NameInMap("RegionId")
    private String regionId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @NameInMap("ResourceOwner")
    private Boolean resourceOwner;

    @NameInMap("ServiceId")
    private String serviceId;

    @NameInMap("ServiceName")
    private String serviceName;

    @NameInMap("VpcId")
    private String vpcId;

    @NameInMap("ZoneAffinityEnabled")
    private Boolean zoneAffinityEnabled;

    @NameInMap("ZonePrivateIpAddressCount")
    private Long zonePrivateIpAddressCount;

    private GetVpcEndpointAttributeResponseBody(Builder builder) {
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
         * The bandwidth of the endpoint connection. Unit: Mbit/s.
         */
        public Builder bandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }

        /**
         * The state of the endpoint connection. Valid values:
         * <p>
         * 
         * *   **Pending**: The connection is being modified.
         * *   **Connecting**: The connection is being established.
         * *   **Connected**: The connection is established.
         * *   **Disconnecting**: The endpoint is being disconnected from the endpoint service.
         * *   **Disconnected**: The endpoint is disconnected from the endpoint service.
         * *   **Deleting**: The connection is being deleted.
         */
        public Builder connectionStatus(String connectionStatus) {
            this.connectionStatus = connectionStatus;
            return this;
        }

        /**
         * The time when the endpoint was created.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * The service state of the endpoint. Valid values:
         * <p>
         * 
         * *   **Normal**: The endpoint runs as expected.
         * *   **FinancialLocked**: The endpoint is locked due to overdue payments.
         */
        public Builder endpointBusinessStatus(String endpointBusinessStatus) {
            this.endpointBusinessStatus = endpointBusinessStatus;
            return this;
        }

        /**
         * The description of the endpoint.
         */
        public Builder endpointDescription(String endpointDescription) {
            this.endpointDescription = endpointDescription;
            return this;
        }

        /**
         * The domain name of the endpoint.
         */
        public Builder endpointDomain(String endpointDomain) {
            this.endpointDomain = endpointDomain;
            return this;
        }

        /**
         * The endpoint ID.
         */
        public Builder endpointId(String endpointId) {
            this.endpointId = endpointId;
            return this;
        }

        /**
         * The name of the endpoint.
         */
        public Builder endpointName(String endpointName) {
            this.endpointName = endpointName;
            return this;
        }

        /**
         * The state of the endpoint. Valid values:
         * <p>
         * 
         * *   **Creating**: The endpoint is being created.
         * *   **Active**: The endpoint is available.
         * *   **Pending**: The endpoint is being modified.
         * *   **Deleting**: The endpoint is being deleted.
         */
        public Builder endpointStatus(String endpointStatus) {
            this.endpointStatus = endpointStatus;
            return this;
        }

        /**
         * The type of the endpoint.
         * <p>
         * 
         * **Interface** is returned. The value indicates the interface endpoint with which the Classic Load Balancer (CLB) instances are associated.
         */
        public Builder endpointType(String endpointType) {
            this.endpointType = endpointType;
            return this;
        }

        /**
         * The payer. Valid values:
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
         * The region ID of the endpoint.
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
         * Indicates whether the endpoint and the endpoint service belong to the same Alibaba Cloud account. Valid values:
         * <p>
         * 
         * *   **true**: The endpoint and the endpoint service belong to the same Alibaba Cloud account.
         * *   **false**: The endpoint and the endpoint service do not belong to the same Alibaba Cloud account.
         */
        public Builder resourceOwner(Boolean resourceOwner) {
            this.resourceOwner = resourceOwner;
            return this;
        }

        /**
         * The ID of the endpoint service with which the endpoint is associated.
         */
        public Builder serviceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }

        /**
         * The name of the endpoint service with which the endpoint is associated.
         */
        public Builder serviceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }

        /**
         * The ID of the virtual private cloud (VPC) to which the endpoint belongs.
         */
        public Builder vpcId(String vpcId) {
            this.vpcId = vpcId;
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

        /**
         * The number of private IP addresses that are assigned to an elastic network interface (ENI) in each zone. Only **1** is returned.
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
