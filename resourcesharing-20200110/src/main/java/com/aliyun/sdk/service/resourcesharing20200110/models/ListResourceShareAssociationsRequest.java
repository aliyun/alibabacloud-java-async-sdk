// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcesharing20200110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListResourceShareAssociationsRequest} extends {@link RequestModel}
 *
 * <p>ListResourceShareAssociationsRequest</p>
 */
public class ListResourceShareAssociationsRequest extends Request {
    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("AssociationStatus")
    private String associationStatus;

    @Query
    @NameInMap("AssociationType")
    @Validation(required = true)
    private String associationType;

    @Query
    @NameInMap("MaxResults")
    private Integer maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("ResourceId")
    private String resourceId;

    @Query
    @NameInMap("ResourceShareIds")
    private java.util.List < String > resourceShareIds;

    @Query
    @NameInMap("Target")
    private String target;

    private ListResourceShareAssociationsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.associationStatus = builder.associationStatus;
        this.associationType = builder.associationType;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.resourceId = builder.resourceId;
        this.resourceShareIds = builder.resourceShareIds;
        this.target = builder.target;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListResourceShareAssociationsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return associationStatus
     */
    public String getAssociationStatus() {
        return this.associationStatus;
    }

    /**
     * @return associationType
     */
    public String getAssociationType() {
        return this.associationType;
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
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * @return resourceShareIds
     */
    public java.util.List < String > getResourceShareIds() {
        return this.resourceShareIds;
    }

    /**
     * @return target
     */
    public String getTarget() {
        return this.target;
    }

    public static final class Builder extends Request.Builder<ListResourceShareAssociationsRequest, Builder> {
        private String regionId; 
        private String associationStatus; 
        private String associationType; 
        private Integer maxResults; 
        private String nextToken; 
        private String resourceId; 
        private java.util.List < String > resourceShareIds; 
        private String target; 

        private Builder() {
            super();
        } 

        private Builder(ListResourceShareAssociationsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.associationStatus = request.associationStatus;
            this.associationType = request.associationType;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.resourceId = request.resourceId;
            this.resourceShareIds = request.resourceShareIds;
            this.target = request.target;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The association status. Valid values:
         * <p>
         * 
         * *   Associating: The entity is being associated.
         * *   Associated: The entity is associated.
         * *   Failed: The entity fails to be associated.
         * *   Disassociating: The entity is being disassociated.
         * *   Disassociated: The entity is disassociated.
         * 
         * >  The system deletes the records of entities in the `Failed` or `Disassociated` state within 48 hours to 96 hours.
         */
        public Builder associationStatus(String associationStatus) {
            this.putQueryParameter("AssociationStatus", associationStatus);
            this.associationStatus = associationStatus;
            return this;
        }

        /**
         * The association type. Valid values:
         * <p>
         * 
         * *   Resource
         * *   Target
         */
        public Builder associationType(String associationType) {
            this.putQueryParameter("AssociationType", associationType);
            this.associationType = associationType;
            return this;
        }

        /**
         * The maximum number of entries to return for a single request.
         * <p>
         * 
         * Valid values: 1 to 100. Default value: 20.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The `token` that is used to initiate the next request. If the response of the current request is truncated, you can use the token to initiate another request and obtain the remaining records.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The ID of the resource.
         * <p>
         * 
         * >  This parameter is unavailable if you set the `AssociationType` parameter to `Target`.
         */
        public Builder resourceId(String resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * ResourceShareIds.
         */
        public Builder resourceShareIds(java.util.List < String > resourceShareIds) {
            this.putQueryParameter("ResourceShareIds", resourceShareIds);
            this.resourceShareIds = resourceShareIds;
            return this;
        }

        /**
         * The ID of the principal.
         * <p>
         * 
         * >  This parameter is unavailable if you set the `AssociationType` parameter to `Resource`.
         */
        public Builder target(String target) {
            this.putQueryParameter("Target", target);
            this.target = target;
            return this;
        }

        @Override
        public ListResourceShareAssociationsRequest build() {
            return new ListResourceShareAssociationsRequest(this);
        } 

    } 

}
