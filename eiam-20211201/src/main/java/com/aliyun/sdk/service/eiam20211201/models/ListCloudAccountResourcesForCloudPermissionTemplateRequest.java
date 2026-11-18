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
 * {@link ListCloudAccountResourcesForCloudPermissionTemplateRequest} extends {@link RequestModel}
 *
 * <p>ListCloudAccountResourcesForCloudPermissionTemplateRequest</p>
 */
public class ListCloudAccountResourcesForCloudPermissionTemplateRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("CloudPermissionTemplateId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String cloudPermissionTemplateId;

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

    private ListCloudAccountResourcesForCloudPermissionTemplateRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.cloudAccountId = builder.cloudAccountId;
        this.cloudAccountResourceEntityType = builder.cloudAccountResourceEntityType;
        this.cloudPermissionTemplateId = builder.cloudPermissionTemplateId;
        this.instanceId = builder.instanceId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCloudAccountResourcesForCloudPermissionTemplateRequest create() {
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
     * @return cloudPermissionTemplateId
     */
    public String getCloudPermissionTemplateId() {
        return this.cloudPermissionTemplateId;
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

    public static final class Builder extends Request.Builder<ListCloudAccountResourcesForCloudPermissionTemplateRequest, Builder> {
        private String regionId; 
        private String cloudAccountId; 
        private String cloudAccountResourceEntityType; 
        private String cloudPermissionTemplateId; 
        private String instanceId; 
        private Long maxResults; 
        private String nextToken; 

        private Builder() {
            super();
        } 

        private Builder(ListCloudAccountResourcesForCloudPermissionTemplateRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.cloudAccountId = request.cloudAccountId;
            this.cloudAccountResourceEntityType = request.cloudAccountResourceEntityType;
            this.cloudPermissionTemplateId = request.cloudPermissionTemplateId;
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
         * <p>Filters results by resource entity type. Valid values: ram_policy.</p>
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
         * <p>The ID of the permission template.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cpt_xxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
         */
        public Builder cloudPermissionTemplateId(String cloudPermissionTemplateId) {
            this.putQueryParameter("CloudPermissionTemplateId", cloudPermissionTemplateId);
            this.cloudPermissionTemplateId = cloudPermissionTemplateId;
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
         * <p>The number of entries to return per page in a paging query. Default value: 20. Maximum value: 100.</p>
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
        public ListCloudAccountResourcesForCloudPermissionTemplateRequest build() {
            return new ListCloudAccountResourcesForCloudPermissionTemplateRequest(this);
        } 

    } 

}
