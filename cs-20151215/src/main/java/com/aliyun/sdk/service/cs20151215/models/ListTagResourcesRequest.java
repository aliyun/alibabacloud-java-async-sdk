// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTagResourcesRequest} extends {@link RequestModel}
 *
 * <p>ListTagResourcesRequest</p>
 */
public class ListTagResourcesRequest extends Request {
    @Query
    @NameInMap("resource_type")
    @Validation(required = true)
    private String resourceType;

    @Query
    @NameInMap("tags")
    private java.util.List < Tag > tags;

    @Query
    @NameInMap("region_id")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("resource_ids")
    @Validation(required = true)
    private java.util.List < String > resourceIds;

    @Query
    @NameInMap("next_token")
    private String nextToken;

    private ListTagResourcesRequest(Builder builder) {
        super(builder);
        this.resourceType = builder.resourceType;
        this.tags = builder.tags;
        this.regionId = builder.regionId;
        this.resourceIds = builder.resourceIds;
        this.nextToken = builder.nextToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTagResourcesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return tags
     */
    public java.util.List < Tag > getTags() {
        return this.tags;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceIds
     */
    public java.util.List < String > getResourceIds() {
        return this.resourceIds;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    public static final class Builder extends Request.Builder<ListTagResourcesRequest, Builder> {
        private String resourceType; 
        private java.util.List < Tag > tags; 
        private String regionId; 
        private java.util.List < String > resourceIds; 
        private String nextToken; 

        private Builder() {
            super();
        } 

        private Builder(ListTagResourcesRequest request) {
            super(request);
            this.resourceType = request.resourceType;
            this.tags = request.tags;
            this.regionId = request.regionId;
            this.resourceIds = request.resourceIds;
            this.nextToken = request.nextToken;
        } 

        /**
         * The type of the resource. Valid values: "CLUSTER ".
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("resource_type", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * The list of tags to be queried. A maximum of 20 sub-items can be queried.
         * <p>
         * 
         * 
         */
        public Builder tags(java.util.List < Tag > tags) {
            this.putQueryParameter("tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * The ID of the region.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("region_id", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the cluster to be queried.
         * <p>
         * 
         * 
         */
        public Builder resourceIds(java.util.List < String > resourceIds) {
            this.putQueryParameter("resource_ids", resourceIds);
            this.resourceIds = resourceIds;
            return this;
        }

        /**
         * The token used to start the next query.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("next_token", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        @Override
        public ListTagResourcesRequest build() {
            return new ListTagResourcesRequest(this);
        } 

    } 

}
