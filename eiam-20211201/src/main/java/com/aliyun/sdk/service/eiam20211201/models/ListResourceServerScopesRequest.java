// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListResourceServerScopesRequest} extends {@link RequestModel}
 *
 * <p>ListResourceServerScopesRequest</p>
 */
public class ListResourceServerScopesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String applicationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthorizationType")
    private String authorizationType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PreviousToken")
    private String previousToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceServerScopeIds")
    private java.util.List<String> resourceServerScopeIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceServerScopeName")
    @com.aliyun.core.annotation.Validation(maxLength = 32)
    private String resourceServerScopeName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceServerScopeType")
    @com.aliyun.core.annotation.Validation(maxLength = 256)
    private String resourceServerScopeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceServerScopeValue")
    @com.aliyun.core.annotation.Validation(maxLength = 128)
    private String resourceServerScopeValue;

    private ListResourceServerScopesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.applicationId = builder.applicationId;
        this.authorizationType = builder.authorizationType;
        this.instanceId = builder.instanceId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.previousToken = builder.previousToken;
        this.resourceServerScopeIds = builder.resourceServerScopeIds;
        this.resourceServerScopeName = builder.resourceServerScopeName;
        this.resourceServerScopeType = builder.resourceServerScopeType;
        this.resourceServerScopeValue = builder.resourceServerScopeValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListResourceServerScopesRequest create() {
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
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return authorizationType
     */
    public String getAuthorizationType() {
        return this.authorizationType;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
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
     * @return previousToken
     */
    public String getPreviousToken() {
        return this.previousToken;
    }

    /**
     * @return resourceServerScopeIds
     */
    public java.util.List<String> getResourceServerScopeIds() {
        return this.resourceServerScopeIds;
    }

    /**
     * @return resourceServerScopeName
     */
    public String getResourceServerScopeName() {
        return this.resourceServerScopeName;
    }

    /**
     * @return resourceServerScopeType
     */
    public String getResourceServerScopeType() {
        return this.resourceServerScopeType;
    }

    /**
     * @return resourceServerScopeValue
     */
    public String getResourceServerScopeValue() {
        return this.resourceServerScopeValue;
    }

    public static final class Builder extends Request.Builder<ListResourceServerScopesRequest, Builder> {
        private String regionId; 
        private String applicationId; 
        private String authorizationType; 
        private String instanceId; 
        private Integer maxResults; 
        private String nextToken; 
        private String previousToken; 
        private java.util.List<String> resourceServerScopeIds; 
        private String resourceServerScopeName; 
        private String resourceServerScopeType; 
        private String resourceServerScopeValue; 

        private Builder() {
            super();
        } 

        private Builder(ListResourceServerScopesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.applicationId = request.applicationId;
            this.authorizationType = request.authorizationType;
            this.instanceId = request.instanceId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.previousToken = request.previousToken;
            this.resourceServerScopeIds = request.resourceServerScopeIds;
            this.resourceServerScopeName = request.resourceServerScopeName;
            this.resourceServerScopeType = request.resourceServerScopeType;
            this.resourceServerScopeValue = request.resourceServerScopeValue;
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
         * <p>IDaaS的应用资源ID。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>app_mkv7rgt4d7i4u7zqtzev2mxxxx</p>
         */
        public Builder applicationId(String applicationId) {
            this.putQueryParameter("ApplicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        /**
         * AuthorizationType.
         */
        public Builder authorizationType(String authorizationType) {
            this.putQueryParameter("AuthorizationType", authorizationType);
            this.authorizationType = authorizationType;
            return this;
        }

        /**
         * <p>IDaaS EIAM实例的ID。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>分页查询时每页行数。默认值为20，最大值为100。</p>
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
         * <p>查询凭证（Token），取值为上一次API调用返回的NextToken参数值。</p>
         * 
         * <strong>example:</strong>
         * <p>NTxxxxxexample</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * PreviousToken.
         */
        public Builder previousToken(String previousToken) {
            this.putQueryParameter("PreviousToken", previousToken);
            this.previousToken = previousToken;
            return this;
        }

        /**
         * ResourceServerScopeIds.
         */
        public Builder resourceServerScopeIds(java.util.List<String> resourceServerScopeIds) {
            this.putQueryParameter("ResourceServerScopeIds", resourceServerScopeIds);
            this.resourceServerScopeIds = resourceServerScopeIds;
            return this;
        }

        /**
         * <p>权限名称</p>
         * 
         * <strong>example:</strong>
         * <p>读取全部用户</p>
         */
        public Builder resourceServerScopeName(String resourceServerScopeName) {
            this.putQueryParameter("ResourceServerScopeName", resourceServerScopeName);
            this.resourceServerScopeName = resourceServerScopeName;
            return this;
        }

        /**
         * ResourceServerScopeType.
         */
        public Builder resourceServerScopeType(String resourceServerScopeType) {
            this.putQueryParameter("ResourceServerScopeType", resourceServerScopeType);
            this.resourceServerScopeType = resourceServerScopeType;
            return this;
        }

        /**
         * <p>权限值，大小写不敏感，格式(${ResourceType}:${ResourceOption}:${ResourceRestrict})</p>
         * 
         * <strong>example:</strong>
         * <p>User:Write:ALL</p>
         */
        public Builder resourceServerScopeValue(String resourceServerScopeValue) {
            this.putQueryParameter("ResourceServerScopeValue", resourceServerScopeValue);
            this.resourceServerScopeValue = resourceServerScopeValue;
            return this;
        }

        @Override
        public ListResourceServerScopesRequest build() {
            return new ListResourceServerScopesRequest(this);
        } 

    } 

}
