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
 * {@link ListVpcEndpointServicesResponseBody} extends {@link TeaModel}
 *
 * <p>ListVpcEndpointServicesResponseBody</p>
 */
public class ListVpcEndpointServicesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Services")
    private java.util.List<Services> services;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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
    public java.util.List<Services> getServices() {
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
        private java.util.List<Services> services; 
        private Integer totalCount; 

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The returned value of NextToken is a pagination token, which can be used in the next request to retrieve a new page of results. Valid values:</p>
         * <ul>
         * <li>If no value is returned for <strong>NextToken</strong>, no next requests are performed.</li>
         * <li>If a value is returned for <strong>NextToken</strong>, the value can be used in the next request to retrieve a new page of results.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0ED8D006-F706-4D23-88ED-E11ED28DCAC0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The endpoint services.</p>
         */
        public Builder services(java.util.List<Services> services) {
            this.services = services;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListVpcEndpointServicesResponseBody build() {
            return new ListVpcEndpointServicesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListVpcEndpointServicesResponseBody} extends {@link TeaModel}
     *
     * <p>ListVpcEndpointServicesResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
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
             * <p>The key of the tag added to the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>FinanceDept</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the tag added to the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>FinanceJoshua</p>
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
    /**
     * 
     * {@link ListVpcEndpointServicesResponseBody} extends {@link TeaModel}
     *
     * <p>ListVpcEndpointServicesResponseBody</p>
     */
    public static class Services extends TeaModel {
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

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        @com.aliyun.core.annotation.NameInMap("ZoneAffinityEnabled")
        private Boolean zoneAffinityEnabled;

        private Services(Builder builder) {
            this.addressIpVersion = builder.addressIpVersion;
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
        public java.util.List<Tags> getTags() {
            return this.tags;
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
            private java.util.List<Tags> tags; 
            private Boolean zoneAffinityEnabled; 

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
             * <li><strong>true</strong>: Endpoint connection requests are automatically accepted.</li>
             * <li><strong>false</strong>: Endpoint connection requests are not automatically accepted.</li>
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
             * <p>The default maximum bandwidth of the endpoint connection. Unit: Mbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>1024</p>
             */
            public Builder connectBandwidth(Integer connectBandwidth) {
                this.connectBandwidth = connectBandwidth;
                return this;
            }

            /**
             * <p>The time when the endpoint service was created. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-09-24T17:15:10Z</p>
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
             * <p>The payer. Valid values:</p>
             * <ul>
             * <li><strong>Endpoint</strong>: service consumer</li>
             * <li><strong>EndpointService</strong>: service provider</li>
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
             * <p>The ID of the resource group.</p>
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
             * <p>The ID of the endpoint service.</p>
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
             * <li><strong>slb</strong>: Classic Load Balancer (CLB) instance</li>
             * <li><strong>alb</strong>: Application Load Balancer (ALB) instance</li>
             * <li><strong>nlb</strong>: Network Load Balancer (NLB) instance</li>
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
             * <p>Indicates whether the endpoint service supports IPv6. Valid values:</p>
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
             * <p>The type of the endpoint service.</p>
             * <ul>
             * <li>Only <strong>Interface</strong> may be returned. You can specify CLB, ALB, and NLB instances as the service resources of the endpoint service.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Interface</p>
             */
            public Builder serviceType(String serviceType) {
                this.serviceType = serviceType;
                return this;
            }

            /**
             * <p>The tags added to the resource.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>Indicates whether zone affinity is enabled. Valid values:</p>
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

            public Services build() {
                return new Services(this);
            } 

        } 

    }
}
