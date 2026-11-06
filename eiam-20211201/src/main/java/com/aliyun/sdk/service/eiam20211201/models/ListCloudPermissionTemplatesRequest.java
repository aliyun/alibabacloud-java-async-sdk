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
 * {@link ListCloudPermissionTemplatesRequest} extends {@link RequestModel}
 *
 * <p>ListCloudPermissionTemplatesRequest</p>
 */
public class ListCloudPermissionTemplatesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CloudAccountId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String cloudAccountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CloudPermissionTemplateNamePrefix")
    @com.aliyun.core.annotation.Validation(maxLength = 128)
    private String cloudPermissionTemplateNamePrefix;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CloudPermissionTemplateSharingMode")
    @com.aliyun.core.annotation.Validation(maxLength = 32)
    private String cloudPermissionTemplateSharingMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CloudPermissionTemplateUsageType")
    @com.aliyun.core.annotation.Validation(maxLength = 32)
    private String cloudPermissionTemplateUsageType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreatorType")
    @com.aliyun.core.annotation.Validation(maxLength = 32)
    private String creatorType;

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

    private ListCloudPermissionTemplatesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.cloudAccountId = builder.cloudAccountId;
        this.cloudPermissionTemplateNamePrefix = builder.cloudPermissionTemplateNamePrefix;
        this.cloudPermissionTemplateSharingMode = builder.cloudPermissionTemplateSharingMode;
        this.cloudPermissionTemplateUsageType = builder.cloudPermissionTemplateUsageType;
        this.creatorType = builder.creatorType;
        this.instanceId = builder.instanceId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCloudPermissionTemplatesRequest create() {
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
     * @return cloudPermissionTemplateNamePrefix
     */
    public String getCloudPermissionTemplateNamePrefix() {
        return this.cloudPermissionTemplateNamePrefix;
    }

    /**
     * @return cloudPermissionTemplateSharingMode
     */
    public String getCloudPermissionTemplateSharingMode() {
        return this.cloudPermissionTemplateSharingMode;
    }

    /**
     * @return cloudPermissionTemplateUsageType
     */
    public String getCloudPermissionTemplateUsageType() {
        return this.cloudPermissionTemplateUsageType;
    }

    /**
     * @return creatorType
     */
    public String getCreatorType() {
        return this.creatorType;
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

    public static final class Builder extends Request.Builder<ListCloudPermissionTemplatesRequest, Builder> {
        private String regionId; 
        private String cloudAccountId; 
        private String cloudPermissionTemplateNamePrefix; 
        private String cloudPermissionTemplateSharingMode; 
        private String cloudPermissionTemplateUsageType; 
        private String creatorType; 
        private String instanceId; 
        private Long maxResults; 
        private String nextToken; 

        private Builder() {
            super();
        } 

        private Builder(ListCloudPermissionTemplatesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.cloudAccountId = request.cloudAccountId;
            this.cloudPermissionTemplateNamePrefix = request.cloudPermissionTemplateNamePrefix;
            this.cloudPermissionTemplateSharingMode = request.cloudPermissionTemplateSharingMode;
            this.cloudPermissionTemplateUsageType = request.cloudPermissionTemplateUsageType;
            this.creatorType = request.creatorType;
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
         * <p>ca_01kmegjc11qa1txxxxx</p>
         */
        public Builder cloudAccountId(String cloudAccountId) {
            this.putQueryParameter("CloudAccountId", cloudAccountId);
            this.cloudAccountId = cloudAccountId;
            return this;
        }

        /**
         * <p>Filters the results by the prefix of the template name.</p>
         * 
         * <strong>example:</strong>
         * <p>AdminAccess</p>
         */
        public Builder cloudPermissionTemplateNamePrefix(String cloudPermissionTemplateNamePrefix) {
            this.putQueryParameter("CloudPermissionTemplateNamePrefix", cloudPermissionTemplateNamePrefix);
            this.cloudPermissionTemplateNamePrefix = cloudPermissionTemplateNamePrefix;
            return this;
        }

        /**
         * <p>Filters the results by permission template sharing mode. Valid values: shared and exclusive. If you do not specify this parameter, no filtering is applied.</p>
         * 
         * <strong>example:</strong>
         * <p>shared</p>
         */
        public Builder cloudPermissionTemplateSharingMode(String cloudPermissionTemplateSharingMode) {
            this.putQueryParameter("CloudPermissionTemplateSharingMode", cloudPermissionTemplateSharingMode);
            this.cloudPermissionTemplateSharingMode = cloudPermissionTemplateSharingMode;
            return this;
        }

        /**
         * <p>Filters the results by permission template usage type. Valid values: user (privilege escalation for human users) and application (privilege escalation for machine-to-machine applications).</p>
         * 
         * <strong>example:</strong>
         * <p>user</p>
         */
        public Builder cloudPermissionTemplateUsageType(String cloudPermissionTemplateUsageType) {
            this.putQueryParameter("CloudPermissionTemplateUsageType", cloudPermissionTemplateUsageType);
            this.cloudPermissionTemplateUsageType = cloudPermissionTemplateUsageType;
            return this;
        }

        /**
         * <p>Filters the results by creator type. Valid values: idaas_admin and idaas_user.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_user</p>
         */
        public Builder creatorType(String creatorType) {
            this.putQueryParameter("CreatorType", creatorType);
            this.creatorType = creatorType;
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
         * <p>The maximum number of entries to return per page in a paging query. Default value: 20. Maximum value: 100.</p>
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
         * <p>The pagination token. Set the value to the NextToken value returned from the previous call.</p>
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
        public ListCloudPermissionTemplatesRequest build() {
            return new ListCloudPermissionTemplatesRequest(this);
        } 

    } 

}
