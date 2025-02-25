// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcesharing20200110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListResourceSharePermissionsRequest} extends {@link RequestModel}
 *
 * <p>ListResourceSharePermissionsRequest</p>
 */
public class ListResourceSharePermissionsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwner")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceOwner;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceShareId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceShareId;

    private ListResourceSharePermissionsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.resourceOwner = builder.resourceOwner;
        this.resourceShareId = builder.resourceShareId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListResourceSharePermissionsRequest create() {
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
     * @return resourceOwner
     */
    public String getResourceOwner() {
        return this.resourceOwner;
    }

    /**
     * @return resourceShareId
     */
    public String getResourceShareId() {
        return this.resourceShareId;
    }

    public static final class Builder extends Request.Builder<ListResourceSharePermissionsRequest, Builder> {
        private String regionId; 
        private Integer maxResults; 
        private String nextToken; 
        private String resourceOwner; 
        private String resourceShareId; 

        private Builder() {
            super();
        } 

        private Builder(ListResourceSharePermissionsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.resourceOwner = request.resourceOwner;
            this.resourceShareId = request.resourceShareId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The maximum number of entries to return for a single request.</p>
         * <p>Valid values: 1 to 100. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The <code>token</code> that is used to initiate the next request. If the response of the current request is truncated, you can use the token to initiate another request and obtain the remaining records.</p>
         * 
         * <strong>example:</strong>
         * <p>TGlzdFJlc291cm****</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The owner of the resource share. Valid values:</p>
         * <ul>
         * <li>Self: the current account</li>
         * <li>OtherAccounts: an account other than the current account</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Self</p>
         */
        public Builder resourceOwner(String resourceOwner) {
            this.putQueryParameter("ResourceOwner", resourceOwner);
            this.resourceOwner = resourceOwner;
            return this;
        }

        /**
         * <p>The ID of the resource share.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rs-6GRmdD3X****</p>
         */
        public Builder resourceShareId(String resourceShareId) {
            this.putQueryParameter("ResourceShareId", resourceShareId);
            this.resourceShareId = resourceShareId;
            return this;
        }

        @Override
        public ListResourceSharePermissionsRequest build() {
            return new ListResourceSharePermissionsRequest(this);
        } 

    } 

}
