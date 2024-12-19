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
 * {@link ListVpcEndpointServicesByEndUserResponseBody} extends {@link TeaModel}
 *
 * <p>ListVpcEndpointServicesByEndUserResponseBody</p>
 */
public class ListVpcEndpointServicesByEndUserResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Services")
    private java.util.List<Services> services;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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
    public java.util.List<Services> getServices() {
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
        private java.util.List<Services> services; 
        private String totalCount; 

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
         * <p>The information about endpoint services.</p>
         */
        public Builder services(java.util.List<Services> services) {
            this.services = services;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>29</p>
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListVpcEndpointServicesByEndUserResponseBody build() {
            return new ListVpcEndpointServicesByEndUserResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListVpcEndpointServicesByEndUserResponseBody} extends {@link TeaModel}
     *
     * <p>ListVpcEndpointServicesByEndUserResponseBody</p>
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
             * <p>The key of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>FinanceDept</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the tag.</p>
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
     * {@link ListVpcEndpointServicesByEndUserResponseBody} extends {@link TeaModel}
     *
     * <p>ListVpcEndpointServicesByEndUserResponseBody</p>
     */
    public static class Services extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AddressIpVersion")
        private String addressIpVersion;

        @com.aliyun.core.annotation.NameInMap("Payer")
        private String payer;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("ServiceDomain")
        private String serviceDomain;

        @com.aliyun.core.annotation.NameInMap("ServiceId")
        private String serviceId;

        @com.aliyun.core.annotation.NameInMap("ServiceName")
        private String serviceName;

        @com.aliyun.core.annotation.NameInMap("ServiceResourceType")
        private String serviceResourceType;

        @com.aliyun.core.annotation.NameInMap("ServiceSupportIPv6")
        private Boolean serviceSupportIPv6;

        @com.aliyun.core.annotation.NameInMap("ServiceType")
        private String serviceType;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        @com.aliyun.core.annotation.NameInMap("Zones")
        private java.util.List<String> zones;

        private Services(Builder builder) {
            this.addressIpVersion = builder.addressIpVersion;
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
         * @return addressIpVersion
         */
        public String getAddressIpVersion() {
            return this.addressIpVersion;
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
        public java.util.List<Tags> getTags() {
            return this.tags;
        }

        /**
         * @return zones
         */
        public java.util.List<String> getZones() {
            return this.zones;
        }

        public static final class Builder {
            private String addressIpVersion; 
            private String payer; 
            private String resourceGroupId; 
            private String serviceDomain; 
            private String serviceId; 
            private String serviceName; 
            private String serviceResourceType; 
            private Boolean serviceSupportIPv6; 
            private String serviceType; 
            private java.util.List<Tags> tags; 
            private java.util.List<String> zones; 

            /**
             * AddressIpVersion.
             */
            public Builder addressIpVersion(String addressIpVersion) {
                this.addressIpVersion = addressIpVersion;
                return this;
            }

            /**
             * <p>The payer. Valid values:</p>
             * <ul>
             * <li><strong>Endpoint</strong>: the service consumer</li>
             * <li><strong>EndpointService</strong>: the service provider</li>
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
             * <p>The domain name of the endpoint service that can be associated with the endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>epsrv-hp3vpx8yqxblby3i****.cn-huhehaote.privatelink.aliyuncs.com</p>
             */
            public Builder serviceDomain(String serviceDomain) {
                this.serviceDomain = serviceDomain;
                return this;
            }

            /**
             * <p>The ID of the endpoint service that can be associated with the endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>epsrv-hp3vpx8yqxblby3i****</p>
             */
            public Builder serviceId(String serviceId) {
                this.serviceId = serviceId;
                return this;
            }

            /**
             * <p>The name of the endpoint service that can be associated with the endpoint.</p>
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
             * <p>Indicates whether IPv6 is enabled. Valid values:</p>
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
             * <p>Only <strong>Interface</strong> is returned, which indicates an interface endpoint. You can specify <strong>CLB</strong> and <strong>ALB</strong> instances as service resources.</p>
             * 
             * <strong>example:</strong>
             * <p>Interface</p>
             */
            public Builder serviceType(String serviceType) {
                this.serviceType = serviceType;
                return this;
            }

            /**
             * <p>The list of tags.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The zones of the endpoint service that can be associated with the endpoint.</p>
             */
            public Builder zones(java.util.List<String> zones) {
                this.zones = zones;
                return this;
            }

            public Services build() {
                return new Services(this);
            } 

        } 

    }
}
