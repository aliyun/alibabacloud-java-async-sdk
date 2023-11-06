// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAggregateResourceCountsGroupByResourceTypeRequest} extends {@link RequestModel}
 *
 * <p>GetAggregateResourceCountsGroupByResourceTypeRequest</p>
 */
public class GetAggregateResourceCountsGroupByResourceTypeRequest extends Request {
    @Query
    @NameInMap("AggregatorId")
    @Validation(required = true)
    private String aggregatorId;

    @Query
    @NameInMap("FolderId")
    private String folderId;

    @Query
    @NameInMap("Region")
    private String region;

    @Query
    @NameInMap("ResourceAccountId")
    private Long resourceAccountId;

    @Query
    @NameInMap("ResourceOwnerId")
    @Deprecated
    private Long resourceOwnerId;

    private GetAggregateResourceCountsGroupByResourceTypeRequest(Builder builder) {
        super(builder);
        this.aggregatorId = builder.aggregatorId;
        this.folderId = builder.folderId;
        this.region = builder.region;
        this.resourceAccountId = builder.resourceAccountId;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAggregateResourceCountsGroupByResourceTypeRequest create() {
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
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static final class Builder extends Request.Builder<GetAggregateResourceCountsGroupByResourceTypeRequest, Builder> {
        private String aggregatorId; 
        private String folderId; 
        private String region; 
        private Long resourceAccountId; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(GetAggregateResourceCountsGroupByResourceTypeRequest request) {
            super(request);
            this.aggregatorId = request.aggregatorId;
            this.folderId = request.folderId;
            this.region = request.region;
            this.resourceAccountId = request.resourceAccountId;
            this.resourceOwnerId = request.resourceOwnerId;
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
         * The ID of the folder in the resource directory.
         * <p>
         * 
         * For more information about how to obtain the ID of a folder, see [View the basic information of a folder](~~111223~~).
         */
        public Builder folderId(String folderId) {
            this.putQueryParameter("FolderId", folderId);
            this.folderId = folderId;
            return this;
        }

        /**
         * The region ID.
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        /**
         * The ID of the Alibaba Cloud account to which the resources in the account group belong.
         * <p>
         * 
         * > You can specify either the ResourceAccountId or ResourceOwnerId parameter. We recommend that you specify the ResourceAccountId parameter.
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

        @Override
        public GetAggregateResourceCountsGroupByResourceTypeRequest build() {
            return new GetAggregateResourceCountsGroupByResourceTypeRequest(this);
        } 

    } 

}
