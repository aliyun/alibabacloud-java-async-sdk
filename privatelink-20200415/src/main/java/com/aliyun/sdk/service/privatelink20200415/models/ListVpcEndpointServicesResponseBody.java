// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.privatelink20200415.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListVpcEndpointServicesResponseBody} extends {@link TeaModel}
 *
 * <p>ListVpcEndpointServicesResponseBody</p>
 */
public class ListVpcEndpointServicesResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Services")
    private java.util.List < Services> services;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListVpcEndpointServicesResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.services = builder.services;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVpcEndpointServicesResponseBody create() {
        return builder().build();
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
     * @return services
     */
    public java.util.List < Services> getServices() {
        return this.services;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private java.util.List < Services> services; 
        private Integer totalCount; 

        /**
         * The number of entries returned per page.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The returned value of NextToken is a pagination token, which can be used in the next request to retrieve a new page of results. Valid values:
         * <p>
         * 
         * *   If no value is returned for **NextToken**, no next requests are performed.
         * *   If a value is returned for **NextToken**, the value can be used in the next request to retrieve a new page of results.
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
         * The endpoint services.
         */
        public Builder services(java.util.List < Services> services) {
            this.services = services;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListVpcEndpointServicesResponseBody build() {
            return new ListVpcEndpointServicesResponseBody(this);
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
    public static class Services extends TeaModel {
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

        @NameInMap("Tags")
        private java.util.List < Tags> tags;

        @NameInMap("ZoneAffinityEnabled")
        private Boolean zoneAffinityEnabled;

        private Services(Builder builder) {
            this.autoAcceptEnabled = builder.autoAcceptEnabled;
            this.connectBandwidth = builder.connectBandwidth;
            this.createTime = builder.createTime;
            this.maxBandwidth = builder.maxBandwidth;
            this.minBandwidth = builder.minBandwidth;
            this.payer = builder.payer;
            this.regionId = builder.regionId;
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
            this.tags = builder.tags;
            this.zoneAffinityEnabled = builder.zoneAffinityEnabled;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Services create() {
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
         * @return tags
         */
        public java.util.List < Tags> getTags() {
            return this.tags;
        }

        /**
         * @return zoneAffinityEnabled
         */
        public Boolean getZoneAffinityEnabled() {
            return this.zoneAffinityEnabled;
        }

        public static final class Builder {
            private Boolean autoAcceptEnabled; 
            private Integer connectBandwidth; 
            private String createTime; 
            private Integer maxBandwidth; 
            private Integer minBandwidth; 
            private String payer; 
            private String regionId; 
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
            private java.util.List < Tags> tags; 
            private Boolean zoneAffinityEnabled; 

            /**
             * Indicates whether endpoint connection requests are automatically accepted. Valid values:
             * <p>
             * 
             * *   **true**: Endpoint connection requests are automatically accepted.
             * *   **false**: Endpoint connection requests are not automatically accepted.
             */
            public Builder autoAcceptEnabled(Boolean autoAcceptEnabled) {
                this.autoAcceptEnabled = autoAcceptEnabled;
                return this;
            }

            /**
             * The default maximum bandwidth of the endpoint connection. Unit: Mbit/s.
             */
            public Builder connectBandwidth(Integer connectBandwidth) {
                this.connectBandwidth = connectBandwidth;
                return this;
            }

            /**
             * The time when the endpoint service was created. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
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
             * The payer. Valid values:
             * <p>
             * 
             * *   **Endpoint**: service consumer
             * *   **EndpointService**: service provider
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
             * The ID of the resource group.
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
             * The ID of the endpoint service.
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
             * *   **slb**: Classic Load Balancer (CLB) instance
             * *   **alb**: Application Load Balancer (ALB) instance
             * *   **nlb**: Network Load Balancer (NLB) instance
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
             */
            public Builder serviceStatus(String serviceStatus) {
                this.serviceStatus = serviceStatus;
                return this;
            }

            /**
             * Indicates whether the endpoint service supports IPv6. Valid values:
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
             * The type of the endpoint service.
             * <p>
             * 
             * *   Only **Interface** may be returned. You can specify CLB, ALB, and NLB instances as the service resources of the endpoint service.
             */
            public Builder serviceType(String serviceType) {
                this.serviceType = serviceType;
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
             * Indicates whether zone affinity is enabled. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder zoneAffinityEnabled(Boolean zoneAffinityEnabled) {
                this.zoneAffinityEnabled = zoneAffinityEnabled;
                return this;
            }

            public Services build() {
                return new Services(this);
            } 

        } 

    }
}
