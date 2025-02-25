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
 * {@link ListVpcEndpointServicesRequest} extends {@link RequestModel}
 *
 * <p>ListVpcEndpointServicesRequest</p>
 */
public class ListVpcEndpointServicesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AddressIpVersion")
    private String addressIpVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoAcceptEnabled")
    private Boolean autoAcceptEnabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    @com.aliyun.core.annotation.Validation(maximum = 1000)
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceId")
    private String resourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceBusinessStatus")
    private String serviceBusinessStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceId")
    private String serviceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceName")
    private String serviceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceResourceType")
    private String serviceResourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceStatus")
    private String serviceStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneAffinityEnabled")
    private Boolean zoneAffinityEnabled;

    private ListVpcEndpointServicesRequest(Builder builder) {
        super(builder);
        this.addressIpVersion = builder.addressIpVersion;
        this.autoAcceptEnabled = builder.autoAcceptEnabled;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceId = builder.resourceId;
        this.serviceBusinessStatus = builder.serviceBusinessStatus;
        this.serviceId = builder.serviceId;
        this.serviceName = builder.serviceName;
        this.serviceResourceType = builder.serviceResourceType;
        this.serviceStatus = builder.serviceStatus;
        this.tag = builder.tag;
        this.zoneAffinityEnabled = builder.zoneAffinityEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVpcEndpointServicesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * @return serviceBusinessStatus
     */
    public String getServiceBusinessStatus() {
        return this.serviceBusinessStatus;
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
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    /**
     * @return zoneAffinityEnabled
     */
    public Boolean getZoneAffinityEnabled() {
        return this.zoneAffinityEnabled;
    }

    public static final class Builder extends Request.Builder<ListVpcEndpointServicesRequest, Builder> {
        private String addressIpVersion; 
        private Boolean autoAcceptEnabled; 
        private Integer maxResults; 
        private String nextToken; 
        private String regionId; 
        private String resourceGroupId; 
        private String resourceId; 
        private String serviceBusinessStatus; 
        private String serviceId; 
        private String serviceName; 
        private String serviceResourceType; 
        private String serviceStatus; 
        private java.util.List<Tag> tag; 
        private Boolean zoneAffinityEnabled; 

        private Builder() {
            super();
        } 

        private Builder(ListVpcEndpointServicesRequest request) {
            super(request);
            this.addressIpVersion = request.addressIpVersion;
            this.autoAcceptEnabled = request.autoAcceptEnabled;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceId = request.resourceId;
            this.serviceBusinessStatus = request.serviceBusinessStatus;
            this.serviceId = request.serviceId;
            this.serviceName = request.serviceName;
            this.serviceResourceType = request.serviceResourceType;
            this.serviceStatus = request.serviceStatus;
            this.tag = request.tag;
            this.zoneAffinityEnabled = request.zoneAffinityEnabled;
        } 

        /**
         * AddressIpVersion.
         */
        public Builder addressIpVersion(String addressIpVersion) {
            this.putQueryParameter("AddressIpVersion", addressIpVersion);
            this.addressIpVersion = addressIpVersion;
            return this;
        }

        /**
         * <p>Specifies whether to automatically accept endpoint connection requests. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong> (default)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder autoAcceptEnabled(Boolean autoAcceptEnabled) {
            this.putQueryParameter("AutoAcceptEnabled", autoAcceptEnabled);
            this.autoAcceptEnabled = autoAcceptEnabled;
            return this;
        }

        /**
         * <p>The number of entries to return on each page. Valid values: <strong>1</strong> to <strong>50</strong>. Default value: <strong>50</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results. Valid values:</p>
         * <ul>
         * <li>If this is your first request and no next requests are to be performed, you do not need to specify this parameter.</li>
         * <li>If a next request is to be performed, set the parameter to the value of NextToken that is returned from the last call.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The region ID of the endpoint service.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/120468.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-huhehaote</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmy*****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The service resource ID.</p>
         * 
         * <strong>example:</strong>
         * <p>lb-hp32z1wp5peaoox2q****</p>
         */
        public Builder resourceId(String resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
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
            this.putQueryParameter("ServiceBusinessStatus", serviceBusinessStatus);
            this.serviceBusinessStatus = serviceBusinessStatus;
            return this;
        }

        /**
         * <p>The endpoint service ID.</p>
         * 
         * <strong>example:</strong>
         * <p>epsrv-hp3vpx8yqxblby3i****</p>
         */
        public Builder serviceId(String serviceId) {
            this.putQueryParameter("ServiceId", serviceId);
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
            this.putQueryParameter("ServiceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        /**
         * <p>The type of the service resource. Valid values:</p>
         * <ul>
         * <li><strong>slb</strong>: a Classic Load Balancer (CLB) instance</li>
         * <li><strong>alb</strong>: an Application Load Balancer (ALB) instance</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>slb</p>
         */
        public Builder serviceResourceType(String serviceResourceType) {
            this.putQueryParameter("ServiceResourceType", serviceResourceType);
            this.serviceResourceType = serviceResourceType;
            return this;
        }

        /**
         * <p>The state of the endpoint service. Valid values:</p>
         * <ul>
         * <li><strong>Creating</strong>: The endpoint service is being created.</li>
         * <li><strong>Pending</strong>: The endpoint service is being modified.</li>
         * <li><strong>Active</strong>: The endpoint service is available.</li>
         * <li><strong>Deleting</strong>: The endpoint service is being deleted</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        public Builder serviceStatus(String serviceStatus) {
            this.putQueryParameter("ServiceStatus", serviceStatus);
            this.serviceStatus = serviceStatus;
            return this;
        }

        /**
         * <p>The list of tags.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>Specifies whether to first resolve the domain name of the nearest endpoint that is associated with the endpoint service. Valid values:</p>
         * <ul>
         * <li><strong>true</strong> (default)</li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder zoneAffinityEnabled(Boolean zoneAffinityEnabled) {
            this.putQueryParameter("ZoneAffinityEnabled", zoneAffinityEnabled);
            this.zoneAffinityEnabled = zoneAffinityEnabled;
            return this;
        }

        @Override
        public ListVpcEndpointServicesRequest build() {
            return new ListVpcEndpointServicesRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListVpcEndpointServicesRequest} extends {@link TeaModel}
     *
     * <p>ListVpcEndpointServicesRequest</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
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
             * <p>The key of the tag. You can specify up to 20 tag keys. The tag key cannot be an empty string.</p>
             * <p>The tag key must be 1 to 64 characters in length and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>FinanceDept</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the tag. You can specify up to 20 tag values. The tag value can be an empty string.</p>
             * <p>The tag value can be up to 128 characters in length and cannot start with <code>acs:</code> or <code>aliyun</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>FinanceJoshua</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
