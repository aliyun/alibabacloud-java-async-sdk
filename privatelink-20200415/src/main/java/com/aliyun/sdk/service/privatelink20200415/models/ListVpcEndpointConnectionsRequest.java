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
 * {@link ListVpcEndpointConnectionsRequest} extends {@link RequestModel}
 *
 * <p>ListVpcEndpointConnectionsRequest</p>
 */
public class ListVpcEndpointConnectionsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConnectionStatus")
    private String connectionStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndpointId")
    private String endpointId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndpointOwnerId")
    @com.aliyun.core.annotation.Validation()
    private Long endpointOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EniId")
    private String eniId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    @com.aliyun.core.annotation.Validation(maximum = 1000, minimum = 1)
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReplacedResourceId")
    private String replacedResourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceId")
    private String resourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceId")
    private String serviceId;

    private ListVpcEndpointConnectionsRequest(Builder builder) {
        super(builder);
        this.connectionStatus = builder.connectionStatus;
        this.endpointId = builder.endpointId;
        this.endpointOwnerId = builder.endpointOwnerId;
        this.eniId = builder.eniId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.regionId = builder.regionId;
        this.replacedResourceId = builder.replacedResourceId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceId = builder.resourceId;
        this.serviceId = builder.serviceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVpcEndpointConnectionsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return connectionStatus
     */
    public String getConnectionStatus() {
        return this.connectionStatus;
    }

    /**
     * @return endpointId
     */
    public String getEndpointId() {
        return this.endpointId;
    }

    /**
     * @return endpointOwnerId
     */
    public Long getEndpointOwnerId() {
        return this.endpointOwnerId;
    }

    /**
     * @return eniId
     */
    public String getEniId() {
        return this.eniId;
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
     * @return replacedResourceId
     */
    public String getReplacedResourceId() {
        return this.replacedResourceId;
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
     * @return serviceId
     */
    public String getServiceId() {
        return this.serviceId;
    }

    public static final class Builder extends Request.Builder<ListVpcEndpointConnectionsRequest, Builder> {
        private String connectionStatus; 
        private String endpointId; 
        private Long endpointOwnerId; 
        private String eniId; 
        private Integer maxResults; 
        private String nextToken; 
        private String regionId; 
        private String replacedResourceId; 
        private String resourceGroupId; 
        private String resourceId; 
        private String serviceId; 

        private Builder() {
            super();
        } 

        private Builder(ListVpcEndpointConnectionsRequest request) {
            super(request);
            this.connectionStatus = request.connectionStatus;
            this.endpointId = request.endpointId;
            this.endpointOwnerId = request.endpointOwnerId;
            this.eniId = request.eniId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.regionId = request.regionId;
            this.replacedResourceId = request.replacedResourceId;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceId = request.resourceId;
            this.serviceId = request.serviceId;
        } 

        /**
         * <p>The state of the endpoint connection. Valid values:</p>
         * <ul>
         * <li><strong>Pending</strong>: The endpoint connection is being modified.</li>
         * <li><strong>Connecting</strong>: The endpoint connection is being established.</li>
         * <li><strong>Connected</strong>: The endpoint connection is established.</li>
         * <li><strong>Disconnecting</strong>: The endpoint is being disconnected from the endpoint service.</li>
         * <li><strong>Disconnected</strong>: The endpoint is disconnected from the endpoint service.</li>
         * <li><strong>Deleting</strong>: The connection is being deleted.</li>
         * <li><strong>ServiceDeleted</strong>: The corresponding endpoint service has been deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Disconnected</p>
         */
        public Builder connectionStatus(String connectionStatus) {
            this.putQueryParameter("ConnectionStatus", connectionStatus);
            this.connectionStatus = connectionStatus;
            return this;
        }

        /**
         * <p>The endpoint ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ep-hp33b2e43fays7s8****</p>
         */
        public Builder endpointId(String endpointId) {
            this.putQueryParameter("EndpointId", endpointId);
            this.endpointId = endpointId;
            return this;
        }

        /**
         * <p>The ID of the Alibaba Cloud account to which the endpoint belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>25346073170691****</p>
         */
        public Builder endpointOwnerId(Long endpointOwnerId) {
            this.putQueryParameter("EndpointOwnerId", endpointOwnerId);
            this.endpointOwnerId = endpointOwnerId;
            return this;
        }

        /**
         * <p>The ID of the endpoint elastic network interface (ENI).</p>
         * 
         * <strong>example:</strong>
         * <p>eni-hp32lk0pyv6o94hs****</p>
         */
        public Builder eniId(String eniId) {
            this.putQueryParameter("EniId", eniId);
            this.eniId = eniId;
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
         * <li>If a next request is to be performed, set the value to the value of <strong>NextToken</strong> that is returned from the last call.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The region ID of the endpoint connection.</p>
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
         * <p>The ID of the replaced service resource in smooth migration scenarios.</p>
         * 
         * <strong>example:</strong>
         * <p>lb-hp32z1wp5peaoox2q****</p>
         */
        public Builder replacedResourceId(String replacedResourceId) {
            this.putQueryParameter("ReplacedResourceId", replacedResourceId);
            this.replacedResourceId = replacedResourceId;
            return this;
        }

        /**
         * <p>The ID of the resource group to which the endpoint belongs.</p>
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

        @Override
        public ListVpcEndpointConnectionsRequest build() {
            return new ListVpcEndpointConnectionsRequest(this);
        } 

    } 

}
