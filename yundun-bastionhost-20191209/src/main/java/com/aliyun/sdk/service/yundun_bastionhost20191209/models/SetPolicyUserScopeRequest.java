// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

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
 * {@link SetPolicyUserScopeRequest} extends {@link RequestModel}
 *
 * <p>SetPolicyUserScopeRequest</p>
 */
public class SetPolicyUserScopeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String policyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    private Long projectId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScopeType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scopeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserGroupIds")
    private java.util.List<String> userGroupIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserIds")
    private java.util.List<String> userIds;

    private SetPolicyUserScopeRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.policyId = builder.policyId;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
        this.scopeType = builder.scopeType;
        this.userGroupIds = builder.userGroupIds;
        this.userIds = builder.userIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetPolicyUserScopeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return policyId
     */
    public String getPolicyId() {
        return this.policyId;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return scopeType
     */
    public String getScopeType() {
        return this.scopeType;
    }

    /**
     * @return userGroupIds
     */
    public java.util.List<String> getUserGroupIds() {
        return this.userGroupIds;
    }

    /**
     * @return userIds
     */
    public java.util.List<String> getUserIds() {
        return this.userIds;
    }

    public static final class Builder extends Request.Builder<SetPolicyUserScopeRequest, Builder> {
        private String instanceId; 
        private String policyId; 
        private Long projectId; 
        private String regionId; 
        private String scopeType; 
        private java.util.List<String> userGroupIds; 
        private java.util.List<String> userIds; 

        private Builder() {
            super();
        } 

        private Builder(SetPolicyUserScopeRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.policyId = request.policyId;
            this.projectId = request.projectId;
            this.regionId = request.regionId;
            this.scopeType = request.scopeType;
            this.userGroupIds = request.userGroupIds;
            this.userIds = request.userIds;
        } 

        /**
         * <p>The ID of the bastion host instance.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to query this parameter.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>bastionhost-cn-st220aw****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The ID of the control policy to modify.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/2758876.html">ListPolicies</a> operation to query this parameter.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder policyId(String policyId) {
            this.putQueryParameter("PolicyId", policyId);
            this.policyId = policyId;
            return this;
        }

        /**
         * <p>The project ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder projectId(Long projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>The region ID of the bastion host.</p>
         * <blockquote>
         * <p>For the mapping between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The user scope for the control policy. Valid values:</p>
         * <ul>
         * <li><strong>All</strong>: The policy applies to all users.</li>
         * <li><strong>User</strong>: The policy applies to selected users.</li>
         * <li><strong>UserGroup</strong>: The policy applies to selected user groups.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>All</p>
         */
        public Builder scopeType(String scopeType) {
            this.putQueryParameter("ScopeType", scopeType);
            this.scopeType = scopeType;
            return this;
        }

        /**
         * <p>The user group scope for the control policy.</p>
         * <blockquote>
         * <p>This parameter is required when ScopeType is set to UserGroup. A maximum of 100 user groups can be specified.</p>
         * </blockquote>
         */
        public Builder userGroupIds(java.util.List<String> userGroupIds) {
            this.putQueryParameter("UserGroupIds", userGroupIds);
            this.userGroupIds = userGroupIds;
            return this;
        }

        /**
         * <p>The user scope for the control policy.</p>
         * <blockquote>
         * <p>This parameter is required when ScopeType is set to User. A maximum of 500 users can be specified.</p>
         * </blockquote>
         */
        public Builder userIds(java.util.List<String> userIds) {
            this.putQueryParameter("UserIds", userIds);
            this.userIds = userIds;
            return this;
        }

        @Override
        public SetPolicyUserScopeRequest build() {
            return new SetPolicyUserScopeRequest(this);
        } 

    } 

}
