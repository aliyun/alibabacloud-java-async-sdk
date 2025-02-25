// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bpstudio20200710.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDeployDetailRequest} extends {@link RequestModel}
 *
 * <p>GetDeployDetailRequest</p>
 */
public class GetDeployDetailRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long maxResults;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NextToken")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long nextToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RefId")
    private String refId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceId")
    private String resourceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceName")
    private String resourceName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    private GetDeployDetailRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.refId = builder.refId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceId = builder.resourceId;
        this.resourceName = builder.resourceName;
        this.resourceType = builder.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDeployDetailRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return maxResults
     */
    public Long getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public Long getNextToken() {
        return this.nextToken;
    }

    /**
     * @return refId
     */
    public String getRefId() {
        return this.refId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * @return resourceName
     */
    public String getResourceName() {
        return this.resourceName;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    public static final class Builder extends Request.Builder<GetDeployDetailRequest, Builder> {
        private String appId; 
        private Long maxResults; 
        private Long nextToken; 
        private String refId; 
        private String resourceGroupId; 
        private String resourceId; 
        private String resourceName; 
        private String resourceType; 

        private Builder() {
            super();
        } 

        private Builder(GetDeployDetailRequest request) {
            super(request);
            this.appId = request.appId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.refId = request.refId;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceId = request.resourceId;
            this.resourceName = request.resourceName;
            this.resourceType = request.resourceType;
        } 

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putBodyParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Long maxResults) {
            this.putBodyParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(Long nextToken) {
            this.putBodyParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * RefId.
         */
        public Builder refId(String refId) {
            this.putBodyParameter("RefId", refId);
            this.refId = refId;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putBodyParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * ResourceId.
         */
        public Builder resourceId(String resourceId) {
            this.putBodyParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * ResourceName.
         */
        public Builder resourceName(String resourceName) {
            this.putBodyParameter("ResourceName", resourceName);
            this.resourceName = resourceName;
            return this;
        }

        /**
         * ResourceType.
         */
        public Builder resourceType(String resourceType) {
            this.putBodyParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        @Override
        public GetDeployDetailRequest build() {
            return new GetDeployDetailRequest(this);
        } 

    } 

}
