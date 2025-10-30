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
 * {@link ListCustomPrivacyPoliciesRequest} extends {@link RequestModel}
 *
 * <p>ListCustomPrivacyPoliciesRequest</p>
 */
public class ListCustomPrivacyPoliciesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomPrivacyPolicyNameStartsWith")
    @com.aliyun.core.annotation.Validation(maxLength = 256)
    private String customPrivacyPolicyNameStartsWith;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Long maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PreviousToken")
    private String previousToken;

    private ListCustomPrivacyPoliciesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.customPrivacyPolicyNameStartsWith = builder.customPrivacyPolicyNameStartsWith;
        this.instanceId = builder.instanceId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.previousToken = builder.previousToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCustomPrivacyPoliciesRequest create() {
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
     * @return customPrivacyPolicyNameStartsWith
     */
    public String getCustomPrivacyPolicyNameStartsWith() {
        return this.customPrivacyPolicyNameStartsWith;
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
    public Long getMaxResults() {
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

    public static final class Builder extends Request.Builder<ListCustomPrivacyPoliciesRequest, Builder> {
        private String regionId; 
        private String customPrivacyPolicyNameStartsWith; 
        private String instanceId; 
        private Long maxResults; 
        private String nextToken; 
        private String previousToken; 

        private Builder() {
            super();
        } 

        private Builder(ListCustomPrivacyPoliciesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.customPrivacyPolicyNameStartsWith = request.customPrivacyPolicyNameStartsWith;
            this.instanceId = request.instanceId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.previousToken = request.previousToken;
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
         * <p>自定义条款名称，左模糊匹配</p>
         * 
         * <strong>example:</strong>
         * <p>Custom</p>
         */
        public Builder customPrivacyPolicyNameStartsWith(String customPrivacyPolicyNameStartsWith) {
            this.putQueryParameter("CustomPrivacyPolicyNameStartsWith", customPrivacyPolicyNameStartsWith);
            this.customPrivacyPolicyNameStartsWith = customPrivacyPolicyNameStartsWith;
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
        public Builder maxResults(Long maxResults) {
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

        @Override
        public ListCustomPrivacyPoliciesRequest build() {
            return new ListCustomPrivacyPoliciesRequest(this);
        } 

    } 

}
