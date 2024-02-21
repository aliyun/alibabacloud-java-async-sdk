// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.privatelink20200415.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListVpcEndpointsResponseBody} extends {@link TeaModel}
 *
 * <p>ListVpcEndpointsResponseBody</p>
 */
public class ListVpcEndpointsResponseBody extends TeaModel {
    @NameInMap("Endpoints")
    private java.util.List < Endpoints> endpoints;

    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListVpcEndpointsResponseBody(Builder builder) {
        this.endpoints = builder.endpoints;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVpcEndpointsResponseBody create() {
        return builder().build();
    }

    /**
     * @return endpoints
     */
    public java.util.List < Endpoints> getEndpoints() {
        return this.endpoints;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < Endpoints> endpoints; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The information about the endpoints.
         */
        public Builder endpoints(java.util.List < Endpoints> endpoints) {
            this.endpoints = endpoints;
            return this;
        }

        /**
         * The number of entries returned on each page.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The pagination token that is used in the next request to retrieve a new page of results. Valid values:
         * <p>
         * 
         * *   If this is your first request and no next requests are to be performed, you do not need to specify this parameter.
         * *   If a next request is to be performed, set the parameter to the value of **NextToken** that is returned from the last call.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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
         * The total number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListVpcEndpointsResponseBody build() {
            return new ListVpcEndpointsResponseBody(this);
        } 

    } 

    public static class Tags extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * The key of the tag added to the resource.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of the tag added to the resource.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    public static class Endpoints extends TeaModel {
        @NameInMap("Bandwidth")
        private Long bandwidth;

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

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("ResourceOwner")
        private Boolean resourceOwner;

        @NameInMap("ServiceId")
        private String serviceId;

        @NameInMap("ServiceName")
        private String serviceName;

        @NameInMap("Tags")
        private java.util.List < Tags> tags;

        @NameInMap("VpcId")
        private String vpcId;

        @NameInMap("ZoneAffinityEnabled")
        private Boolean zoneAffinityEnabled;

        private Endpoints(Builder builder) {
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
            this.regionId = builder.regionId;
            this.resourceGroupId = builder.resourceGroupId;
            this.resourceOwner = builder.resourceOwner;
            this.serviceId = builder.serviceId;
            this.serviceName = builder.serviceName;
            this.tags = builder.tags;
            this.vpcId = builder.vpcId;
            this.zoneAffinityEnabled = builder.zoneAffinityEnabled;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Endpoints create() {
            return builder().build();
        }

        /**
         * @return bandwidth
         */
        public Long getBandwidth() {
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
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
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
         * @return tags
         */
        public java.util.List < Tags> getTags() {
            return this.tags;
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

        public static final class Builder {
            private Long bandwidth; 
            private String connectionStatus; 
            private String createTime; 
            private String endpointBusinessStatus; 
            private String endpointDescription; 
            private String endpointDomain; 
            private String endpointId; 
            private String endpointName; 
            private String endpointStatus; 
            private String endpointType; 
            private String regionId; 
            private String resourceGroupId; 
            private Boolean resourceOwner; 
            private String serviceId; 
            private String serviceName; 
            private java.util.List < Tags> tags; 
            private String vpcId; 
            private Boolean zoneAffinityEnabled; 

            /**
             * The bandwidth of the endpoint connection. Unit: Mbit/s.
             */
            public Builder bandwidth(Long bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * The state of the endpoint connection. Valid values:
             * <p>
             * 
             * *   **Pending**: The endpoint connection is being modified.
             * *   **Connecting**: The endpoint connection is being established.
             * *   **Connected**: The endpoint connection is established.
             * *   **Disconnecting**: The endpoint is being disconnected from the endpoint service.
             * *   **Disconnected**: The endpoint is disconnected from the endpoint service.
             * *   **Deleting**: The endpoint connection is being deleted.
             * *   **ServiceDeleted**: The corresponding service is deleted.
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
             * The ID of the endpoint.
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
             * Only **Interface** may be returned, which indicates an interface endpoint. You can specify Application Load Balancer (ALB) instances, Classic Load Balancer (CLB) instances, and Network Load Balancer (NLB) instances as service resources.
             */
            public Builder endpointType(String endpointType) {
                this.endpointType = endpointType;
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
             * The ID of the resource group.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * Indicates whether the endpoint and the endpoint service belong to the same Alibaba Cloud account. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder resourceOwner(Boolean resourceOwner) {
                this.resourceOwner = resourceOwner;
                return this;
            }

            /**
             * The ID of the endpoint service that is associated with the endpoint.
             */
            public Builder serviceId(String serviceId) {
                this.serviceId = serviceId;
                return this;
            }

            /**
             * The name of the endpoint service that is associated with the endpoint.
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            /**
             * The tags added to the resource.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
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

            public Endpoints build() {
                return new Endpoints(this);
            } 

        } 

    }
}
