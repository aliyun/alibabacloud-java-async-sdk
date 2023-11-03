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
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Services.
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
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
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
             * AutoAcceptEnabled.
             */
            public Builder autoAcceptEnabled(Boolean autoAcceptEnabled) {
                this.autoAcceptEnabled = autoAcceptEnabled;
                return this;
            }

            /**
             * ConnectBandwidth.
             */
            public Builder connectBandwidth(Integer connectBandwidth) {
                this.connectBandwidth = connectBandwidth;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * MaxBandwidth.
             */
            public Builder maxBandwidth(Integer maxBandwidth) {
                this.maxBandwidth = maxBandwidth;
                return this;
            }

            /**
             * MinBandwidth.
             */
            public Builder minBandwidth(Integer minBandwidth) {
                this.minBandwidth = minBandwidth;
                return this;
            }

            /**
             * Payer.
             */
            public Builder payer(String payer) {
                this.payer = payer;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * ResourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * ServiceBusinessStatus.
             */
            public Builder serviceBusinessStatus(String serviceBusinessStatus) {
                this.serviceBusinessStatus = serviceBusinessStatus;
                return this;
            }

            /**
             * ServiceDescription.
             */
            public Builder serviceDescription(String serviceDescription) {
                this.serviceDescription = serviceDescription;
                return this;
            }

            /**
             * ServiceDomain.
             */
            public Builder serviceDomain(String serviceDomain) {
                this.serviceDomain = serviceDomain;
                return this;
            }

            /**
             * ServiceId.
             */
            public Builder serviceId(String serviceId) {
                this.serviceId = serviceId;
                return this;
            }

            /**
             * ServiceName.
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
             * ServiceStatus.
             */
            public Builder serviceStatus(String serviceStatus) {
                this.serviceStatus = serviceStatus;
                return this;
            }

            /**
             * ServiceSupportIPv6.
             */
            public Builder serviceSupportIPv6(Boolean serviceSupportIPv6) {
                this.serviceSupportIPv6 = serviceSupportIPv6;
                return this;
            }

            /**
             * ServiceType.
             */
            public Builder serviceType(String serviceType) {
                this.serviceType = serviceType;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * ZoneAffinityEnabled.
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
