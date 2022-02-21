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
        private String resourceId; 
        private String serviceId; 

        private Builder() {
            super();
        } 

        private Builder(ListVpcEndpointConnectionsRequest response) {
            super(response);
            this.connectionStatus = response.connectionStatus;
            this.endpointId = response.endpointId;
            this.endpointOwnerId = response.endpointOwnerId;
            this.eniId = response.eniId;
            this.maxResults = response.maxResults;
            this.nextToken = response.nextToken;
            this.regionId = response.regionId;
            this.replacedResourceId = response.replacedResourceId;
            this.resourceId = response.resourceId;
            this.serviceId = response.serviceId;
        } 

        /**
         * ConnectionStatus.
         */
        public Builder connectionStatus(String connectionStatus) {
            this.putQueryParameter("ConnectionStatus", connectionStatus);
            this.connectionStatus = connectionStatus;
            return this;
        }

        /**
         * EndpointId.
         */
        public Builder endpointId(String endpointId) {
            this.putQueryParameter("EndpointId", endpointId);
            this.endpointId = endpointId;
            return this;
        }

        /**
         * EndpointOwnerId.
         */
        public Builder endpointOwnerId(Long endpointOwnerId) {
            this.putQueryParameter("EndpointOwnerId", endpointOwnerId);
            this.endpointOwnerId = endpointOwnerId;
            return this;
        }

        /**
         * EniId.
         */
        public Builder eniId(String eniId) {
            this.putQueryParameter("EniId", eniId);
            this.eniId = eniId;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ReplacedResourceId.
         */
        public Builder replacedResourceId(String replacedResourceId) {
            this.putQueryParameter("ReplacedResourceId", replacedResourceId);
            this.replacedResourceId = replacedResourceId;
            return this;
        }

        /**
         * ResourceId.
         */
        public Builder resourceId(String resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * ServiceId.
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
