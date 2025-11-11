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
 * {@link ListUserAuthnSourceMappingsRequest} extends {@link RequestModel}
 *
 * <p>ListUserAuthnSourceMappingsRequest</p>
 */
public class ListUserAuthnSourceMappingsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IdentityProviderId")
    @com.aliyun.core.annotation.Validation(maxLength = 64)
    private String identityProviderId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    @com.aliyun.core.annotation.Validation(maximum = 100)
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PreviousToken")
    private String previousToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserExternalId")
    @com.aliyun.core.annotation.Validation(maxLength = 64)
    private String userExternalId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String userId;

    private ListUserAuthnSourceMappingsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.identityProviderId = builder.identityProviderId;
        this.instanceId = builder.instanceId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.previousToken = builder.previousToken;
        this.userExternalId = builder.userExternalId;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUserAuthnSourceMappingsRequest create() {
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
     * @return identityProviderId
     */
    public String getIdentityProviderId() {
        return this.identityProviderId;
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
     * @return userExternalId
     */
    public String getUserExternalId() {
        return this.userExternalId;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<ListUserAuthnSourceMappingsRequest, Builder> {
        private String regionId; 
        private String identityProviderId; 
        private String instanceId; 
        private Integer maxResults; 
        private String nextToken; 
        private String previousToken; 
        private String userExternalId; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(ListUserAuthnSourceMappingsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.identityProviderId = request.identityProviderId;
            this.instanceId = request.instanceId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.previousToken = request.previousToken;
            this.userExternalId = request.userExternalId;
            this.userId = request.userId;
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
         * <p>来源Idp Id</p>
         * 
         * <strong>example:</strong>
         * <p>idp_11111</p>
         */
        public Builder identityProviderId(String identityProviderId) {
            this.putQueryParameter("IdentityProviderId", identityProviderId);
            this.identityProviderId = identityProviderId;
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
         * <p>查询上一页凭证（Token），取值为上一次API调用返回的previousToken参数值。</p>
         * 
         * <strong>example:</strong>
         * <p>PTxxxxxexample</p>
         */
        public Builder previousToken(String previousToken) {
            this.putQueryParameter("PreviousToken", previousToken);
            this.previousToken = previousToken;
            return this;
        }

        /**
         * <p>外部关联ID</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        public Builder userExternalId(String userExternalId) {
            this.putQueryParameter("UserExternalId", userExternalId);
            this.userExternalId = userExternalId;
            return this;
        }

        /**
         * <p>用户ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>user_ue2jvisn35exxxxx</p>
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public ListUserAuthnSourceMappingsRequest build() {
            return new ListUserAuthnSourceMappingsRequest(this);
        } 

    } 

}
