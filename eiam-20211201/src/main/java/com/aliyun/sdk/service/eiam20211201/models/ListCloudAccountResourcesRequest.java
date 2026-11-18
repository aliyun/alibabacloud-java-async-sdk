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
 * {@link ListCloudAccountResourcesRequest} extends {@link RequestModel}
 *
 * <p>ListCloudAccountResourcesRequest</p>
 */
public class ListCloudAccountResourcesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CloudAccountId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String cloudAccountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CloudAccountResourceEntityType")
    @com.aliyun.core.annotation.Validation(maxLength = 32)
    private String cloudAccountResourceEntityType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CloudAccountResourceNameContains")
    @com.aliyun.core.annotation.Validation(maxLength = 64)
    private String cloudAccountResourceNameContains;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CloudAccountResourceNamePrefix")
    @com.aliyun.core.annotation.Validation(maxLength = 256)
    private String cloudAccountResourceNamePrefix;

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

    private ListCloudAccountResourcesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.cloudAccountId = builder.cloudAccountId;
        this.cloudAccountResourceEntityType = builder.cloudAccountResourceEntityType;
        this.cloudAccountResourceNameContains = builder.cloudAccountResourceNameContains;
        this.cloudAccountResourceNamePrefix = builder.cloudAccountResourceNamePrefix;
        this.instanceId = builder.instanceId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCloudAccountResourcesRequest create() {
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
     * @return cloudAccountId
     */
    public String getCloudAccountId() {
        return this.cloudAccountId;
    }

    /**
     * @return cloudAccountResourceEntityType
     */
    public String getCloudAccountResourceEntityType() {
        return this.cloudAccountResourceEntityType;
    }

    /**
     * @return cloudAccountResourceNameContains
     */
    public String getCloudAccountResourceNameContains() {
        return this.cloudAccountResourceNameContains;
    }

    /**
     * @return cloudAccountResourceNamePrefix
     */
    public String getCloudAccountResourceNamePrefix() {
        return this.cloudAccountResourceNamePrefix;
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

    public static final class Builder extends Request.Builder<ListCloudAccountResourcesRequest, Builder> {
        private String regionId; 
        private String cloudAccountId; 
        private String cloudAccountResourceEntityType; 
        private String cloudAccountResourceNameContains; 
        private String cloudAccountResourceNamePrefix; 
        private String instanceId; 
        private Long maxResults; 
        private String nextToken; 

        private Builder() {
            super();
        } 

        private Builder(ListCloudAccountResourcesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.cloudAccountId = request.cloudAccountId;
            this.cloudAccountResourceEntityType = request.cloudAccountResourceEntityType;
            this.cloudAccountResourceNameContains = request.cloudAccountResourceNameContains;
            this.cloudAccountResourceNamePrefix = request.cloudAccountResourceNamePrefix;
            this.instanceId = request.instanceId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
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
         * <p>The ID of the cloud account.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456789012xxxx</p>
         */
        public Builder cloudAccountId(String cloudAccountId) {
            this.putQueryParameter("CloudAccountId", cloudAccountId);
            this.cloudAccountId = cloudAccountId;
            return this;
        }

        /**
         * <p>Filters resources by entity type. Valid values: ram_policy.</p>
         * 
         * <strong>example:</strong>
         * <p>ram_policy</p>
         */
        public Builder cloudAccountResourceEntityType(String cloudAccountResourceEntityType) {
            this.putQueryParameter("CloudAccountResourceEntityType", cloudAccountResourceEntityType);
            this.cloudAccountResourceEntityType = cloudAccountResourceEntityType;
            return this;
        }

        /**
         * <p>Fuzzy matches the resource name. This is equivalent to LIKE \&quot;%value%\&quot;.</p>
         * 
         * <strong>example:</strong>
         * <p>sso</p>
         */
        public Builder cloudAccountResourceNameContains(String cloudAccountResourceNameContains) {
            this.putQueryParameter("CloudAccountResourceNameContains", cloudAccountResourceNameContains);
            this.cloudAccountResourceNameContains = cloudAccountResourceNameContains;
            return this;
        }

        /**
         * <p>Matches resources by the prefix of the resource name.</p>
         * 
         * <strong>example:</strong>
         * <p>eiam-</p>
         */
        public Builder cloudAccountResourceNamePrefix(String cloudAccountResourceNamePrefix) {
            this.putQueryParameter("CloudAccountResourceNamePrefix", cloudAccountResourceNamePrefix);
            this.cloudAccountResourceNamePrefix = cloudAccountResourceNamePrefix;
            return this;
        }

        /**
         * <p>The ID of the IDaaS EIAM instance.</p>
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
         * <p>The maximum number of entries per page for paging in a paged query. Default value: 20. Maximum value: 100.</p>
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
         * <p>The pagination token. Set the value to the NextToken value returned from the previous API call.</p>
         * 
         * <strong>example:</strong>
         * <p>NTxxxxxexample</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        @Override
        public ListCloudAccountResourcesRequest build() {
            return new ListCloudAccountResourcesRequest(this);
        } 

    } 

}
