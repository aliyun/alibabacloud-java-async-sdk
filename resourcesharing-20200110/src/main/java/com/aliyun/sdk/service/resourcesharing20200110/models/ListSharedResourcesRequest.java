// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcesharing20200110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListSharedResourcesRequest} extends {@link RequestModel}
 *
 * <p>ListSharedResourcesRequest</p>
 */
public class ListSharedResourcesRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("ResourceIds")
    private java.util.List < String > resourceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwner")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceOwner;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceShareIds")
    private java.util.List < String > resourceShareIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Target")
    private String target;

    private ListSharedResourcesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.resourceIds = builder.resourceIds;
        this.resourceOwner = builder.resourceOwner;
        this.resourceShareIds = builder.resourceShareIds;
        this.resourceType = builder.resourceType;
        this.target = builder.target;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSharedResourcesRequest create() {
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
     * @return resourceIds
     */
    public java.util.List < String > getResourceIds() {
        return this.resourceIds;
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
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return target
     */
    public String getTarget() {
        return this.target;
    }

    public static final class Builder extends Request.Builder<ListSharedResourcesRequest, Builder> {
        private String regionId; 
        private Integer maxResults; 
        private String nextToken; 
        private java.util.List < String > resourceIds; 
        private String resourceOwner; 
        private java.util.List < String > resourceShareIds; 
        private String resourceType; 
        private String target; 

        private Builder() {
            super();
        } 

        private Builder(ListSharedResourcesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.resourceIds = request.resourceIds;
            this.resourceOwner = request.resourceOwner;
            this.resourceShareIds = request.resourceShareIds;
            this.resourceType = request.resourceType;
            this.target = request.target;
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
         * <p>The ID of a shared resource.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1upw03qyz8n7us9****</p>
         */
        public Builder resourceIds(java.util.List < String > resourceIds) {
            this.putQueryParameter("ResourceIds", resourceIds);
            this.resourceIds = resourceIds;
            return this;
        }

        /**
         * <p>The owner of the resource shares. Valid values:</p>
         * <ul>
         * <li>Self: your account. If you set the value to Self, the resources you share with other accounts are queried.</li>
         * <li>OtherAccounts: another account. If you set the value to OtherAccounts, the resources other accounts share with you are queried.</li>
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
         * <p>The ID of a resource share.</p>
         * 
         * <strong>example:</strong>
         * <p>rs-6GRmdD3X****</p>
         */
        public Builder resourceShareIds(java.util.List < String > resourceShareIds) {
            this.putQueryParameter("ResourceShareIds", resourceShareIds);
            this.resourceShareIds = resourceShareIds;
            return this;
        }

        /**
         * <p>The type of the shared resources.</p>
         * <p>For more information about the types of resources that can be shared, see <a href="https://help.aliyun.com/document_detail/450526.html">Services that work with Resource Sharing</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>VSwitch</p>
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * <p>The ID of the principal or resource owner.</p>
         * <ul>
         * <li>If the value of <code>ResourceOwner</code> is <code>Self</code>, set this parameter to the ID of a principal.</li>
         * <li>If the value of <code>ResourceOwner</code> is <code>OtherAccounts</code>, set this parameter to the ID of a resource owner.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>172050525300****</p>
         */
        public Builder target(String target) {
            this.putQueryParameter("Target", target);
            this.target = target;
            return this;
        }

        @Override
        public ListSharedResourcesRequest build() {
            return new ListSharedResourcesRequest(this);
        } 

    } 

}
