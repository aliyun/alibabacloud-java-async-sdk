// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20190108.models;

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
    @NameInMap("ResourceId")
    @Validation(required = true)
    private String resourceId;

    @Query
    @NameInMap("ResourceOwnerId")
    @Validation(required = true)
    private Long resourceOwnerId;

    @Query
    @NameInMap("ResourceType")
    @Validation(required = true)
    private String resourceType;

    private GetAggregateDiscoveredResourceRequest(Builder builder) {
        super(builder);
        this.aggregatorId = builder.aggregatorId;
        this.region = builder.region;
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
        private String resourceId; 
        private Long resourceOwnerId; 
        private String resourceType; 

        private Builder() {
            super();
        } 

        private Builder(GetAggregateDiscoveredResourceRequest response) {
            super(response);
            this.aggregatorId = response.aggregatorId;
            this.region = response.region;
            this.resourceId = response.resourceId;
            this.resourceOwnerId = response.resourceOwnerId;
            this.resourceType = response.resourceType;
        } 

        /**
         * AggregatorId.
         */
        public Builder aggregatorId(String aggregatorId) {
            this.putQueryParameter("AggregatorId", aggregatorId);
            this.aggregatorId = aggregatorId;
            return this;
        }

        /**
         * Region.
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
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
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * ResourceType.
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
