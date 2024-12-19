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
 * {@link ListVpcEndpointsResponseBody} extends {@link TeaModel}
 *
 * <p>ListVpcEndpointsResponseBody</p>
 */
public class ListVpcEndpointsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Endpoints")
    private java.util.List<Endpoints> endpoints;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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
    public java.util.List<Endpoints> getEndpoints() {
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
        private java.util.List<Endpoints> endpoints; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * <p>The information about the endpoints.</p>
         */
        public Builder endpoints(java.util.List<Endpoints> endpoints) {
            this.endpoints = endpoints;
            return this;
        }

        /**
         * <p>The number of entries returned on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results. Valid values:</p>
         * <ul>
         * <li>If this is your first request and no next requests are to be performed, you do not need to specify this parameter.</li>
         * <li>If a next request is to be performed, set the parameter to the value of <strong>NextToken</strong> that is returned from the last call.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>caeba0bbb2be03f84eb48b699f0a****</p>
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
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListVpcEndpointsResponseBody build() {
            return new ListVpcEndpointsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListVpcEndpointsResponseBody} extends {@link TeaModel}
     *
     * <p>ListVpcEndpointsResponseBody</p>
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
     * {@link ListVpcEndpointsResponseBody} extends {@link TeaModel}
     *
     * <p>ListVpcEndpointsResponseBody</p>
     */
    public static class Endpoints extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AddressIpVersion")
        private String addressIpVersion;

        @com.aliyun.core.annotation.NameInMap("Bandwidth")
        private Long bandwidth;

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

        @com.aliyun.core.annotation.NameInMap("PolicyDocument")
        private String policyDocument;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("ResourceOwner")
        private Boolean resourceOwner;

        @com.aliyun.core.annotation.NameInMap("ServiceId")
        private String serviceId;

        @com.aliyun.core.annotation.NameInMap("ServiceName")
        private String serviceName;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("ZoneAffinityEnabled")
        private Boolean zoneAffinityEnabled;

        private Endpoints(Builder builder) {
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
            this.policyDocument = builder.policyDocument;
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
         * @return addressIpVersion
         */
        public String getAddressIpVersion() {
            return this.addressIpVersion;
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
        public java.util.List<Tags> getTags() {
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
            private String addressIpVersion; 
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
            private String policyDocument; 
            private String regionId; 
            private String resourceGroupId; 
            private Boolean resourceOwner; 
            private String serviceId; 
            private String serviceName; 
            private java.util.List<Tags> tags; 
            private String vpcId; 
            private Boolean zoneAffinityEnabled; 

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
            public Builder bandwidth(Long bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * <p>The state of the endpoint connection. Valid values:</p>
             * <ul>
             * <li><strong>Pending</strong>: The endpoint connection is being modified.</li>
             * <li><strong>Connecting</strong>: The endpoint connection is being established.</li>
             * <li><strong>Connected</strong>: The endpoint connection is established.</li>
             * <li><strong>Disconnecting</strong>: The endpoint is being disconnected from the endpoint service.</li>
             * <li><strong>Disconnected</strong>: The endpoint is disconnected from the endpoint service.</li>
             * <li><strong>Deleting</strong>: The endpoint connection is being deleted.</li>
             * <li><strong>ServiceDeleted</strong>: The corresponding service is deleted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Disconnected</p>
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
             * <p>The ID of the endpoint.</p>
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
             * <p>The type of the endpoint. Valid values:</p>
             * <ul>
             * <li><strong>Interface</strong>: interface endpoint</li>
             * <li><strong>Reverse</strong>: reverse endpoint</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Interface</p>
             */
            public Builder endpointType(String endpointType) {
                this.endpointType = endpointType;
                return this;
            }

            /**
             * <p>The Resource Access Management (RAM) policy. For more information about policy definitions, see <a href="https://help.aliyun.com/document_detail/93738.html">Policy elements</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>{\n  &quot;Version&quot;: &quot;1&quot;,\n  &quot;Statement&quot;: [\n    {\n      &quot;Effect&quot;: &quot;Allow&quot;,\n      &quot;Action&quot;: &quot;<em>&quot;,\n      &quot;Principal&quot;: &quot;</em>&quot;,\n      &quot;Resource&quot;: &quot;*&quot;\n    }\n  ]\n}</p>
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
             * <p>The ID of the resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>Indicates whether the endpoint and the endpoint service belong to the same Alibaba Cloud account. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
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
             * <p>The ID of the endpoint service that is associated with the endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>epsrv-hp3vpx8yqxblby3i****</p>
             */
            public Builder serviceId(String serviceId) {
                this.serviceId = serviceId;
                return this;
            }

            /**
             * <p>The name of the endpoint service that is associated with the endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>com.aliyuncs.privatelink.cn-huhehaote.epsrv-hp3xdsq46ael67lo****</p>
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
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
             * <p>The ID of the virtual private cloud (VPC) to which the endpoint belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-hp356stwkxg3fn2xe****</p>
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

            public Endpoints build() {
                return new Endpoints(this);
            } 

        } 

    }
}
