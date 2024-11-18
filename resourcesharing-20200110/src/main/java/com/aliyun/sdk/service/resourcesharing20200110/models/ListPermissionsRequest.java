// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcesharing20200110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListPermissionsRequest} extends {@link RequestModel}
 *
 * <p>ListPermissionsRequest</p>
 */
public class ListPermissionsRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    private ListPermissionsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.resourceType = builder.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPermissionsRequest create() {
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
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    public static final class Builder extends Request.Builder<ListPermissionsRequest, Builder> {
        private String regionId; 
        private Integer maxResults; 
        private String nextToken; 
        private String resourceType; 

        private Builder() {
            super();
        } 

        private Builder(ListPermissionsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.resourceType = request.resourceType;
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

        @Override
        public ListPermissionsRequest build() {
            return new ListPermissionsRequest(this);
        } 

    } 

}
