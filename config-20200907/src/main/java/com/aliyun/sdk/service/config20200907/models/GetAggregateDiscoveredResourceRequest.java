// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAggregateDiscoveredResourceRequest} extends {@link RequestModel}
 *
 * <p>GetAggregateDiscoveredResourceRequest</p>
 */
public class GetAggregateDiscoveredResourceRequest extends Request {
    @Query
    @NameInMap("AggregatorId")
    @Validation(required = true)
    private String aggregatorId;

    @Query
    @NameInMap("Region")
    @Validation(required = true)
    private String region;

    @Query
    @NameInMap("ResourceAccountId")
    private Long resourceAccountId;

    @Query
    @NameInMap("ResourceId")
    @Validation(required = true)
    private String resourceId;

    @Query
    @NameInMap("ResourceOwnerId")
    @Deprecated
    private Long resourceOwnerId;

    @Query
    @NameInMap("ResourceType")
    @Validation(required = true)
    private String resourceType;

    private GetAggregateDiscoveredResourceRequest(Builder builder) {
        super(builder);
        this.aggregatorId = builder.aggregatorId;
        this.region = builder.region;
        this.resourceAccountId = builder.resourceAccountId;
        this.resourceId = builder.resourceId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.resourceType = builder.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAggregateDiscoveredResourceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aggregatorId
     */
    public String getAggregatorId() {
        return this.aggregatorId;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return resourceAccountId
     */
    public Long getResourceAccountId() {
        return this.resourceAccountId;
    }

    /**
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    public static final class Builder extends Request.Builder<GetAggregateDiscoveredResourceRequest, Builder> {
        private String aggregatorId; 
        private String region; 
        private Long resourceAccountId; 
        private String resourceId; 
        private Long resourceOwnerId; 
        private String resourceType; 

        private Builder() {
            super();
        } 

        private Builder(GetAggregateDiscoveredResourceRequest request) {
            super(request);
            this.aggregatorId = request.aggregatorId;
            this.region = request.region;
            this.resourceAccountId = request.resourceAccountId;
            this.resourceId = request.resourceId;
            this.resourceOwnerId = request.resourceOwnerId;
            this.resourceType = request.resourceType;
        } 

        /**
         * The ID of the account group.
         * <p>
         * 
         * For more information about how to obtain the ID of the account group, see [ListAggregators](~~255797~~).
         */
        public Builder aggregatorId(String aggregatorId) {
            this.putQueryParameter("AggregatorId", aggregatorId);
            this.aggregatorId = aggregatorId;
            return this;
        }

        /**
         * The ID of the region in which the resource resides.
         * <p>
         * 
         * For more information about how to query the ID of a region in which the resource resides, see [ListAggregateDiscoveredResources](~~411691~~).
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        /**
         * The ID of the Alibaba Cloud account to which the resources in the account group belong.
         * <p>
         * > You can use either the `ResourceAccountId` or `ResourceOwnerId` parameter. We recommend that you use the ResourceAccountId parameter.
         */
        public Builder resourceAccountId(Long resourceAccountId) {
            this.putQueryParameter("ResourceAccountId", resourceAccountId);
            this.resourceAccountId = resourceAccountId;
            return this;
        }

        /**
         * The resource ID.
         * <p>
         * 
         * For more information about how to query the ID of a resource, see [ListAggregateDiscoveredResources](~~411691~~).
         */
        public Builder resourceId(String resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * The type of the resource.
         * <p>
         * 
         * For more information about how to obtain the type of a resource, see [ListAggregateDiscoveredResources](~~411691~~).
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        @Override
        public GetAggregateDiscoveredResourceRequest build() {
            return new GetAggregateDiscoveredResourceRequest(this);
        } 

    } 

}
