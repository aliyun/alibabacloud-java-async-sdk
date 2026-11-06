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
 * {@link UpdateCloudPermissionTemplateRequest} extends {@link RequestModel}
 *
 * <p>UpdateCloudPermissionTemplateRequest</p>
 */
public class UpdateCloudPermissionTemplateRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AllowRequest")
    private Boolean allowRequest;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicableScope")
    private ApplicableScope applicableScope;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CloudAccountId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String cloudAccountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CloudAccountResources")
    private java.util.List<CloudAccountResources> cloudAccountResources;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CloudPermissionTemplateId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String cloudPermissionTemplateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CloudPermissionTemplateName")
    @com.aliyun.core.annotation.Validation(maxLength = 128)
    private String cloudPermissionTemplateName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    @com.aliyun.core.annotation.Validation(maxLength = 128)
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String instanceId;

    private UpdateCloudPermissionTemplateRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.allowRequest = builder.allowRequest;
        this.applicableScope = builder.applicableScope;
        this.clientToken = builder.clientToken;
        this.cloudAccountId = builder.cloudAccountId;
        this.cloudAccountResources = builder.cloudAccountResources;
        this.cloudPermissionTemplateId = builder.cloudPermissionTemplateId;
        this.cloudPermissionTemplateName = builder.cloudPermissionTemplateName;
        this.description = builder.description;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCloudPermissionTemplateRequest create() {
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
     * @return allowRequest
     */
    public Boolean getAllowRequest() {
        return this.allowRequest;
    }

    /**
     * @return applicableScope
     */
    public ApplicableScope getApplicableScope() {
        return this.applicableScope;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return cloudAccountId
     */
    public String getCloudAccountId() {
        return this.cloudAccountId;
    }

    /**
     * @return cloudAccountResources
     */
    public java.util.List<CloudAccountResources> getCloudAccountResources() {
        return this.cloudAccountResources;
    }

    /**
     * @return cloudPermissionTemplateId
     */
    public String getCloudPermissionTemplateId() {
        return this.cloudPermissionTemplateId;
    }

    /**
     * @return cloudPermissionTemplateName
     */
    public String getCloudPermissionTemplateName() {
        return this.cloudPermissionTemplateName;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<UpdateCloudPermissionTemplateRequest, Builder> {
        private String regionId; 
        private Boolean allowRequest; 
        private ApplicableScope applicableScope; 
        private String clientToken; 
        private String cloudAccountId; 
        private java.util.List<CloudAccountResources> cloudAccountResources; 
        private String cloudPermissionTemplateId; 
        private String cloudPermissionTemplateName; 
        private String description; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateCloudPermissionTemplateRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.allowRequest = request.allowRequest;
            this.applicableScope = request.applicableScope;
            this.clientToken = request.clientToken;
            this.cloudAccountId = request.cloudAccountId;
            this.cloudAccountResources = request.cloudAccountResources;
            this.cloudPermissionTemplateId = request.cloudPermissionTemplateId;
            this.cloudPermissionTemplateName = request.cloudPermissionTemplateName;
            this.description = request.description;
            this.instanceId = request.instanceId;
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
         * <p>Specifies whether users are allowed to apply.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder allowRequest(Boolean allowRequest) {
            this.putQueryParameter("AllowRequest", allowRequest);
            this.allowRequest = allowRequest;
            return this;
        }

        /**
         * <p>The applicable scope of the permission template, including the scope type and specified users, groups, or organizational units.</p>
         */
        public Builder applicableScope(ApplicableScope applicableScope) {
            this.putQueryParameter("ApplicableScope", applicableScope);
            this.applicableScope = applicableScope;
            return this;
        }

        /**
         * <p>The idempotency token.</p>
         * 
         * <strong>example:</strong>
         * <p>client-token-example</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The cloud account ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ac_mkv7rgt4d7i4u7zqtzev2mxxxx</p>
         */
        public Builder cloudAccountId(String cloudAccountId) {
            this.putQueryParameter("CloudAccountId", cloudAccountId);
            this.cloudAccountId = cloudAccountId;
            return this;
        }

        /**
         * <p>The list of cloud account resources.</p>
         */
        public Builder cloudAccountResources(java.util.List<CloudAccountResources> cloudAccountResources) {
            this.putQueryParameter("CloudAccountResources", cloudAccountResources);
            this.cloudAccountResources = cloudAccountResources;
            return this;
        }

        /**
         * <p>The permission template ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cpt_mkv7rgt4d7i4u7zqtzev2mxxxx</p>
         */
        public Builder cloudPermissionTemplateId(String cloudPermissionTemplateId) {
            this.putQueryParameter("CloudPermissionTemplateId", cloudPermissionTemplateId);
            this.cloudPermissionTemplateId = cloudPermissionTemplateId;
            return this;
        }

        /**
         * <p>The name of the permission template. The name can be up to 128 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>dev-default</p>
         */
        public Builder cloudPermissionTemplateName(String cloudPermissionTemplateName) {
            this.putQueryParameter("CloudPermissionTemplateName", cloudPermissionTemplateName);
            this.cloudPermissionTemplateName = cloudPermissionTemplateName;
            return this;
        }

        /**
         * <p>The description of the permission template. The description can be up to 128 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>instance_for_test</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
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

        @Override
        public UpdateCloudPermissionTemplateRequest build() {
            return new UpdateCloudPermissionTemplateRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateCloudPermissionTemplateRequest} extends {@link TeaModel}
     *
     * <p>UpdateCloudPermissionTemplateRequest</p>
     */
    public static class ApplicableScope extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GroupIds")
        private java.util.List<String> groupIds;

        @com.aliyun.core.annotation.NameInMap("OrganizationalUnitIds")
        private java.util.List<String> organizationalUnitIds;

        @com.aliyun.core.annotation.NameInMap("ScopeType")
        private String scopeType;

        @com.aliyun.core.annotation.NameInMap("UserIds")
        private java.util.List<String> userIds;

        private ApplicableScope(Builder builder) {
            this.groupIds = builder.groupIds;
            this.organizationalUnitIds = builder.organizationalUnitIds;
            this.scopeType = builder.scopeType;
            this.userIds = builder.userIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApplicableScope create() {
            return builder().build();
        }

        /**
         * @return groupIds
         */
        public java.util.List<String> getGroupIds() {
            return this.groupIds;
        }

        /**
         * @return organizationalUnitIds
         */
        public java.util.List<String> getOrganizationalUnitIds() {
            return this.organizationalUnitIds;
        }

        /**
         * @return scopeType
         */
        public String getScopeType() {
            return this.scopeType;
        }

        /**
         * @return userIds
         */
        public java.util.List<String> getUserIds() {
            return this.userIds;
        }

        public static final class Builder {
            private java.util.List<String> groupIds; 
            private java.util.List<String> organizationalUnitIds; 
            private String scopeType; 
            private java.util.List<String> userIds; 

            private Builder() {
            } 

            private Builder(ApplicableScope model) {
                this.groupIds = model.groupIds;
                this.organizationalUnitIds = model.organizationalUnitIds;
                this.scopeType = model.scopeType;
                this.userIds = model.userIds;
            } 

            /**
             * <p>The list of group IDs.</p>
             * 
             * <strong>example:</strong>
             * <p>group_d6sbsusdfa4h66ec3il7yxxxx</p>
             */
            public Builder groupIds(java.util.List<String> groupIds) {
                this.groupIds = groupIds;
                return this;
            }

            /**
             * <p>The list of organizational unit IDs.</p>
             * 
             * <strong>example:</strong>
             * <p>ou_d6sbsuudfgf4h66ec3il7yxxxx</p>
             */
            public Builder organizationalUnitIds(java.util.List<String> organizationalUnitIds) {
                this.organizationalUnitIds = organizationalUnitIds;
                return this;
            }

            /**
             * <p>The application scope type. Valid values: global and custom.</p>
             * 
             * <strong>example:</strong>
             * <p>global</p>
             */
            public Builder scopeType(String scopeType) {
                this.scopeType = scopeType;
                return this;
            }

            /**
             * <p>The list of account IDs.</p>
             * 
             * <strong>example:</strong>
             * <p>user_d6sbsuumeta4h66ec3il7yxxxx</p>
             */
            public Builder userIds(java.util.List<String> userIds) {
                this.userIds = userIds;
                return this;
            }

            public ApplicableScope build() {
                return new ApplicableScope(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateCloudPermissionTemplateRequest} extends {@link TeaModel}
     *
     * <p>UpdateCloudPermissionTemplateRequest</p>
     */
    public static class CloudAccountResources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CloudAccountResourceId")
        private String cloudAccountResourceId;

        private CloudAccountResources(Builder builder) {
            this.cloudAccountResourceId = builder.cloudAccountResourceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CloudAccountResources create() {
            return builder().build();
        }

        /**
         * @return cloudAccountResourceId
         */
        public String getCloudAccountResourceId() {
            return this.cloudAccountResourceId;
        }

        public static final class Builder {
            private String cloudAccountResourceId; 

            private Builder() {
            } 

            private Builder(CloudAccountResources model) {
                this.cloudAccountResourceId = model.cloudAccountResourceId;
            } 

            /**
             * <p>The cloud account resource ID.</p>
             * 
             * <strong>example:</strong>
             * <p>car_01lap4os3aaerckla05vftnsl8edo</p>
             */
            public Builder cloudAccountResourceId(String cloudAccountResourceId) {
                this.cloudAccountResourceId = cloudAccountResourceId;
                return this;
            }

            public CloudAccountResources build() {
                return new CloudAccountResources(this);
            } 

        } 

    }
}
