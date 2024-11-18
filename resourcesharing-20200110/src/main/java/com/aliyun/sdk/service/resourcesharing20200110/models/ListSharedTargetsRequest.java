// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcesharing20200110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListSharedTargetsRequest} extends {@link RequestModel}
 *
 * <p>ListSharedTargetsRequest</p>
 */
public class ListSharedTargetsRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("ResourceId")
    private String resourceId;

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
    @com.aliyun.core.annotation.NameInMap("Targets")
    private java.util.List < String > targets;

    private ListSharedTargetsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.resourceId = builder.resourceId;
        this.resourceOwner = builder.resourceOwner;
        this.resourceShareIds = builder.resourceShareIds;
        this.resourceType = builder.resourceType;
        this.targets = builder.targets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSharedTargetsRequest create() {
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
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
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
     * @return targets
     */
    public java.util.List < String > getTargets() {
        return this.targets;
    }

    public static final class Builder extends Request.Builder<ListSharedTargetsRequest, Builder> {
        private String regionId; 
        private Integer maxResults; 
        private String nextToken; 
        private String resourceId; 
        private String resourceOwner; 
        private java.util.List < String > resourceShareIds; 
        private String resourceType; 
        private java.util.List < String > targets; 

        private Builder() {
            super();
        } 

        private Builder(ListSharedTargetsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.resourceId = request.resourceId;
            this.resourceOwner = request.resourceOwner;
            this.resourceShareIds = request.resourceShareIds;
            this.resourceType = request.resourceType;
            this.targets = request.targets;
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
         * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of <code>NextToken</code>.</p>
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
         * <p>The ID of the shared resource.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1upw03qyz8n7us9****</p>
         */
        public Builder resourceId(String resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * <p>The owner of the resource share.</p>
         * <ul>
         * <li>Self: your account. If you set the value to Self, the principals that are associated with your resource shares are queried.</li>
         * <li>OtherAccounts: another account. If you set the value to OtherAccounts, the resource shares with which your account is associated and the owners of the resource shares are queried.</li>
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
         * <p>Valid values of N: 1 to 5. This indicates that a maximum of five resource shares can be specified at a time.</p>
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
         * <p>The information about the principals.</p>
         * 
         * <strong>example:</strong>
         * <p>114240524784****</p>
         */
        public Builder targets(java.util.List < String > targets) {
            this.putQueryParameter("Targets", targets);
            this.targets = targets;
            return this;
        }

        @Override
        public ListSharedTargetsRequest build() {
            return new ListSharedTargetsRequest(this);
        } 

    } 

}
