// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.privatelink20200415.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListVpcEndpointConnectionsRequest} extends {@link RequestModel}
 *
 * <p>ListVpcEndpointConnectionsRequest</p>
 */
public class ListVpcEndpointConnectionsRequest extends Request {
    @Query
    @NameInMap("ConnectionStatus")
    private String connectionStatus;

    @Query
    @NameInMap("EndpointId")
    private String endpointId;

    @Query
    @NameInMap("EndpointOwnerId")
    @Validation()
    private Long endpointOwnerId;

    @Query
    @NameInMap("EniId")
    private String eniId;

    @Query
    @NameInMap("MaxResults")
    @Validation(maximum = 1000, minimum = 1)
    private Integer maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ReplacedResourceId")
    private String replacedResourceId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("ResourceId")
    private String resourceId;

    @Query
    @NameInMap("ServiceId")
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
         * The state of the endpoint connection. Valid values:
         * <p>
         * 
         * *   **Pending**: The endpoint connection is being modified.
         * *   **Connecting**: The endpoint connection is being established.
         * *   **Connected**: The endpoint connection is established.
         * *   **Disconnecting**: The endpoint is being disconnected from the endpoint service.
         * *   **Disconnected**: The endpoint is disconnected from the endpoint service.
         * *   **Deleting**: The connection is being deleted.
         * *   **ServiceDeleted**: The corresponding endpoint service has been deleted.
         */
        public Builder connectionStatus(String connectionStatus) {
            this.putQueryParameter("ConnectionStatus", connectionStatus);
            this.connectionStatus = connectionStatus;
            return this;
        }

        /**
         * The endpoint ID.
         */
        public Builder endpointId(String endpointId) {
            this.putQueryParameter("EndpointId", endpointId);
            this.endpointId = endpointId;
            return this;
        }

        /**
         * The ID of the Alibaba Cloud account to which the endpoint belongs.
         */
        public Builder endpointOwnerId(Long endpointOwnerId) {
            this.putQueryParameter("EndpointOwnerId", endpointOwnerId);
            this.endpointOwnerId = endpointOwnerId;
            return this;
        }

        /**
         * The ID of the endpoint elastic network interface (ENI).
         */
        public Builder eniId(String eniId) {
            this.putQueryParameter("EniId", eniId);
            this.eniId = eniId;
            return this;
        }

        /**
         * The number of entries to return on each page. Valid values: **1** to **50**. Default value: **50**.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The pagination token that is used in the next request to retrieve a new page of results. Valid values:
         * <p>
         * 
         * *   If this is your first request and no next requests are to be performed, you do not need to specify this parameter.
         * *   If a next request is to be performed, set the value to the value of **NextToken** that is returned from the last call.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The region ID of the endpoint connection.
         * <p>
         * 
         * You can call the [DescribeRegions](~~120468~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the replaced service resource in smooth migration scenarios.
         */
        public Builder replacedResourceId(String replacedResourceId) {
            this.putQueryParameter("ReplacedResourceId", replacedResourceId);
            this.replacedResourceId = replacedResourceId;
            return this;
        }

        /**
         * The ID of the resource group to which the endpoint belongs.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The service resource ID.
         */
        public Builder resourceId(String resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * The endpoint service ID.
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
