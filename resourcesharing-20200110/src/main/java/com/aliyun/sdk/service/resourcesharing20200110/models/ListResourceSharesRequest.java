// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcesharing20200110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListResourceSharesRequest} extends {@link RequestModel}
 *
 * <p>ListResourceSharesRequest</p>
 */
public class ListResourceSharesRequest extends Request {
    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("MaxResults")
    private Integer maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("PermissionName")
    private String permissionName;

    @Query
    @NameInMap("ResourceOwner")
    @Validation(required = true)
    private String resourceOwner;

    @Query
    @NameInMap("ResourceShareIds")
    private java.util.List < String > resourceShareIds;

    @Query
    @NameInMap("ResourceShareName")
    private String resourceShareName;

    @Query
    @NameInMap("ResourceShareStatus")
    private String resourceShareStatus;

    private ListResourceSharesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.permissionName = builder.permissionName;
        this.resourceOwner = builder.resourceOwner;
        this.resourceShareIds = builder.resourceShareIds;
        this.resourceShareName = builder.resourceShareName;
        this.resourceShareStatus = builder.resourceShareStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListResourceSharesRequest create() {
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
     * @return permissionName
     */
    public String getPermissionName() {
        return this.permissionName;
    }

    /**
     * @return resourceOwner
     */
    public String getResourceOwner() {
        return this.resourceOwner;
    }

    /**
     * @return resourceShareIds
     */
    public java.util.List < String > getResourceShareIds() {
        return this.resourceShareIds;
    }

    /**
     * @return resourceShareName
     */
    public String getResourceShareName() {
        return this.resourceShareName;
    }

    /**
     * @return resourceShareStatus
     */
    public String getResourceShareStatus() {
        return this.resourceShareStatus;
    }

    public static final class Builder extends Request.Builder<ListResourceSharesRequest, Builder> {
        private String regionId; 
        private Integer maxResults; 
        private String nextToken; 
        private String permissionName; 
        private String resourceOwner; 
        private java.util.List < String > resourceShareIds; 
        private String resourceShareName; 
        private String resourceShareStatus; 

        private Builder() {
            super();
        } 

        private Builder(ListResourceSharesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.permissionName = request.permissionName;
            this.resourceOwner = request.resourceOwner;
            this.resourceShareIds = request.resourceShareIds;
            this.resourceShareName = request.resourceShareName;
            this.resourceShareStatus = request.resourceShareStatus;
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
         * The name of the permission. For more information, see [Permission library](~~465474~~).
         */
        public Builder permissionName(String permissionName) {
            this.putQueryParameter("PermissionName", permissionName);
            this.permissionName = permissionName;
            return this;
        }

        /**
         * The owner of the resource shares. Valid values:
         * <p>
         * 
         * *   Self: the current account
         * *   OtherAccounts: an account other than the current account
         */
        public Builder resourceOwner(String resourceOwner) {
            this.putQueryParameter("ResourceOwner", resourceOwner);
            this.resourceOwner = resourceOwner;
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
         * The name of the resource share.
         */
        public Builder resourceShareName(String resourceShareName) {
            this.putQueryParameter("ResourceShareName", resourceShareName);
            this.resourceShareName = resourceShareName;
            return this;
        }

        /**
         * The status of the resource share. Valid values:
         * <p>
         * 
         * *   Active: The resource share is enabled.
         * *   Pending: The resource share is associated with one or more resource sharing invitations that are waiting for confirmation.
         * *   Deleting: The resource share is being deleted.
         * *   Deleted: The resource share is deleted.
         * 
         * >  The system deletes the records of resource shares in the Deleted state within 48 hours to 96 hours after you delete the resource shares.
         */
        public Builder resourceShareStatus(String resourceShareStatus) {
            this.putQueryParameter("ResourceShareStatus", resourceShareStatus);
            this.resourceShareStatus = resourceShareStatus;
            return this;
        }

        @Override
        public ListResourceSharesRequest build() {
            return new ListResourceSharesRequest(this);
        } 

    } 

}
