// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAggregateResourceCountsGroupByRegionRequest} extends {@link RequestModel}
 *
 * <p>GetAggregateResourceCountsGroupByRegionRequest</p>
 */
public class GetAggregateResourceCountsGroupByRegionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AggregatorId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String aggregatorId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FolderId")
    private String folderId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceAccountId")
    private Long resourceAccountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    @Deprecated
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    private GetAggregateResourceCountsGroupByRegionRequest(Builder builder) {
        super(builder);
        this.aggregatorId = builder.aggregatorId;
        this.folderId = builder.folderId;
        this.resourceAccountId = builder.resourceAccountId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.resourceType = builder.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAggregateResourceCountsGroupByRegionRequest create() {
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
     * @return folderId
     */
    public String getFolderId() {
        return this.folderId;
    }

    /**
     * @return resourceAccountId
     */
    public Long getResourceAccountId() {
        return this.resourceAccountId;
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

    public static final class Builder extends Request.Builder<GetAggregateResourceCountsGroupByRegionRequest, Builder> {
        private String aggregatorId; 
        private String folderId; 
        private Long resourceAccountId; 
        private Long resourceOwnerId; 
        private String resourceType; 

        private Builder() {
            super();
        } 

        private Builder(GetAggregateResourceCountsGroupByRegionRequest request) {
            super(request);
            this.aggregatorId = request.aggregatorId;
            this.folderId = request.folderId;
            this.resourceAccountId = request.resourceAccountId;
            this.resourceOwnerId = request.resourceOwnerId;
            this.resourceType = request.resourceType;
        } 

        /**
         * The ID of the account group.
         * <p>
         * 
         * For more information about how to obtain the ID of an account group, see [ListAggregators](~~255797~~).
         */
        public Builder aggregatorId(String aggregatorId) {
            this.putQueryParameter("AggregatorId", aggregatorId);
            this.aggregatorId = aggregatorId;
            return this;
        }

        /**
         * The ID of the folder in the resource directory. For more information about how to obtain the ID of a folder, see [View the basic information of a folder](~~111223~~).
         */
        public Builder folderId(String folderId) {
            this.putQueryParameter("FolderId", folderId);
            this.folderId = folderId;
            return this;
        }

        /**
         * The ID of the Alibaba Cloud account to which the resources in the account group belong.
         * <p>
         * 
         * > You can use either the ResourceAccountId or ResourceOwnerId parameter. We recommend that you use the ResourceAccountId parameter.
         */
        public Builder resourceAccountId(Long resourceAccountId) {
            this.putQueryParameter("ResourceAccountId", resourceAccountId);
            this.resourceAccountId = resourceAccountId;
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
         * The resource type.
         * <p>
         * 
         * For more information about how to obtain the type of a resource, see [ListAggregateDiscoveredResources](~~265983~~).
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        @Override
        public GetAggregateResourceCountsGroupByRegionRequest build() {
            return new GetAggregateResourceCountsGroupByRegionRequest(this);
        } 

    } 

}
