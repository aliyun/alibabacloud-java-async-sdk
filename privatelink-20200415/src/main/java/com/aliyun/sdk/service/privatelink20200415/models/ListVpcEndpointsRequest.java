// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.privatelink20200415.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListVpcEndpointsRequest} extends {@link RequestModel}
 *
 * <p>ListVpcEndpointsRequest</p>
 */
public class ListVpcEndpointsRequest extends Request {
    @Query
    @NameInMap("ConnectionStatus")
    private String connectionStatus;

    @Query
    @NameInMap("EndpointId")
    private String endpointId;

    @Query
    @NameInMap("EndpointName")
    private String endpointName;

    @Query
    @NameInMap("EndpointStatus")
    private String endpointStatus;

    @Query
    @NameInMap("EndpointType")
    private String endpointType;

    @Query
    @NameInMap("MaxResults")
    @Validation(maximum = 1000)
    private Integer maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("ServiceName")
    private String serviceName;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    @Query
    @NameInMap("VpcId")
    private String vpcId;

    private ListVpcEndpointsRequest(Builder builder) {
        super(builder);
        this.connectionStatus = builder.connectionStatus;
        this.endpointId = builder.endpointId;
        this.endpointName = builder.endpointName;
        this.endpointStatus = builder.endpointStatus;
        this.endpointType = builder.endpointType;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.serviceName = builder.serviceName;
        this.tag = builder.tag;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVpcEndpointsRequest create() {
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
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder extends Request.Builder<ListVpcEndpointsRequest, Builder> {
        private String connectionStatus; 
        private String endpointId; 
        private String endpointName; 
        private String endpointStatus; 
        private String endpointType; 
        private Integer maxResults; 
        private String nextToken; 
        private String regionId; 
        private String resourceGroupId; 
        private String serviceName; 
        private java.util.List < Tag> tag; 
        private String vpcId; 

        private Builder() {
            super();
        } 

        private Builder(ListVpcEndpointsRequest request) {
            super(request);
            this.connectionStatus = request.connectionStatus;
            this.endpointId = request.endpointId;
            this.endpointName = request.endpointName;
            this.endpointStatus = request.endpointStatus;
            this.endpointType = request.endpointType;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.serviceName = request.serviceName;
            this.tag = request.tag;
            this.vpcId = request.vpcId;
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
         * The ID of the endpoint.
         */
        public Builder endpointId(String endpointId) {
            this.putQueryParameter("EndpointId", endpointId);
            this.endpointId = endpointId;
            return this;
        }

        /**
         * The name of the endpoint.
         */
        public Builder endpointName(String endpointName) {
            this.putQueryParameter("EndpointName", endpointName);
            this.endpointName = endpointName;
            return this;
        }

        /**
         * The state of the endpoint. Valid values:
         * <p>
         * 
         * *   **Creating**: The endpoint is being created.
         * *   **Active**: The endpoint is available.
         * *   **Pending**: The endpoint is being modified.
         * *   **Deleting**: The endpoint is being deleted.
         */
        public Builder endpointStatus(String endpointStatus) {
            this.putQueryParameter("EndpointStatus", endpointStatus);
            this.endpointStatus = endpointStatus;
            return this;
        }

        /**
         * The type of the endpoint.
         * <p>
         * 
         * Set the value to **Interface**. Then, you can specify Application Load Balancer (ALB) and Classic Load Balancer (CLB) instances as service resources for the endpoint service.
         */
        public Builder endpointType(String endpointType) {
            this.putQueryParameter("EndpointType", endpointType);
            this.endpointType = endpointType;
            return this;
        }

        /**
         * The number of entries returned on each page.
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
         * *   If a next request is to be performed, set the parameter to the value of **NextToken** that is returned from the last call.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The region ID of the endpoint.
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
         * The ID of the resource group.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The name of the endpoint service with which the endpoint is associated.
         */
        public Builder serviceName(String serviceName) {
            this.putQueryParameter("ServiceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        /**
         * The list of tags.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * The ID of the VPC to which the endpoint belongs.
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        @Override
        public ListVpcEndpointsRequest build() {
            return new ListVpcEndpointsRequest(this);
        } 

    } 

    public static class Tag extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
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
             * The key of the tag. You can specify up to 20 tag keys. The tag key cannot be an empty string.
             * <p>
             * 
             * The tag key must be 1 to 64 characters in length and cannot start with `aliyun` or `acs:`. It cannot contain `http://` or `https://`.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of the tag. You can specify up to 20 tag values. The tag value can be an empty string.
             * <p>
             * 
             * The tag value can be up to 128 characters in length and cannot start with `acs:` or `aliyun`. It cannot contain `http://` or `https://`.
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
