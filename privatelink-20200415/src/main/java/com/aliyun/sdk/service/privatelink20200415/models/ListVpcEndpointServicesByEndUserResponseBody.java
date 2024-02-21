// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.privatelink20200415.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListVpcEndpointServicesByEndUserResponseBody} extends {@link TeaModel}
 *
 * <p>ListVpcEndpointServicesByEndUserResponseBody</p>
 */
public class ListVpcEndpointServicesByEndUserResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Services")
    private java.util.List < Services> services;

    @NameInMap("TotalCount")
    private String totalCount;

    private ListVpcEndpointServicesByEndUserResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.services = builder.services;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVpcEndpointServicesByEndUserResponseBody create() {
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
    public String getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private java.util.List < Services> services; 
        private String totalCount; 

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
         * The total number of entries returned.
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListVpcEndpointServicesByEndUserResponseBody build() {
            return new ListVpcEndpointServicesByEndUserResponseBody(this);
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
             * The key of the tag.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of the tag.
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
        @NameInMap("Payer")
        private String payer;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("ServiceDomain")
        private String serviceDomain;

        @NameInMap("ServiceId")
        private String serviceId;

        @NameInMap("ServiceName")
        private String serviceName;

        @NameInMap("ServiceResourceType")
        private String serviceResourceType;

        @NameInMap("ServiceSupportIPv6")
        private Boolean serviceSupportIPv6;

        @NameInMap("ServiceType")
        private String serviceType;

        @NameInMap("Tags")
        private java.util.List < Tags> tags;

        @NameInMap("Zones")
        private java.util.List < String > zones;

        private Services(Builder builder) {
            this.payer = builder.payer;
            this.resourceGroupId = builder.resourceGroupId;
            this.serviceDomain = builder.serviceDomain;
            this.serviceId = builder.serviceId;
            this.serviceName = builder.serviceName;
            this.serviceResourceType = builder.serviceResourceType;
            this.serviceSupportIPv6 = builder.serviceSupportIPv6;
            this.serviceType = builder.serviceType;
            this.tags = builder.tags;
            this.zones = builder.zones;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Services create() {
            return builder().build();
        }

        /**
         * @return payer
         */
        public String getPayer() {
            return this.payer;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
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
         * @return zones
         */
        public java.util.List < String > getZones() {
            return this.zones;
        }

        public static final class Builder {
            private String payer; 
            private String resourceGroupId; 
            private String serviceDomain; 
            private String serviceId; 
            private String serviceName; 
            private String serviceResourceType; 
            private Boolean serviceSupportIPv6; 
            private String serviceType; 
            private java.util.List < Tags> tags; 
            private java.util.List < String > zones; 

            /**
             * The payer. Valid values:
             * <p>
             * 
             * *   **Endpoint**: the service consumer
             * *   **EndpointService**: the service provider
             */
            public Builder payer(String payer) {
                this.payer = payer;
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
             * The domain name of the endpoint service that can be associated with the endpoint.
             */
            public Builder serviceDomain(String serviceDomain) {
                this.serviceDomain = serviceDomain;
                return this;
            }

            /**
             * The ID of the endpoint service that can be associated with the endpoint.
             */
            public Builder serviceId(String serviceId) {
                this.serviceId = serviceId;
                return this;
            }

            /**
             * The name of the endpoint service that can be associated with the endpoint.
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            /**
             * ServiceResourceType.
             */
            public Builder serviceResourceType(String serviceResourceType) {
                this.serviceResourceType = serviceResourceType;
                return this;
            }

            /**
             * Indicates whether IPv6 is enabled. Valid values:
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
             * Only **Interface** is returned, which indicates an interface endpoint. You can specify **CLB** and **ALB** instances as service resources.
             */
            public Builder serviceType(String serviceType) {
                this.serviceType = serviceType;
                return this;
            }

            /**
             * The list of tags.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The zones of the endpoint service that can be associated with the endpoint.
             */
            public Builder zones(java.util.List < String > zones) {
                this.zones = zones;
                return this;
            }

            public Services build() {
                return new Services(this);
            } 

        } 

    }
}
