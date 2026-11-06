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
 * {@link CreateCloudPermissionTemplateRequest} extends {@link RequestModel}
 *
 * <p>CreateCloudPermissionTemplateRequest</p>
 */
public class CreateCloudPermissionTemplateRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("CloudPermissionTemplateName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 128)
    private String cloudPermissionTemplateName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CloudPermissionTemplateUsageType")
    @com.aliyun.core.annotation.Validation(maxLength = 32)
    private String cloudPermissionTemplateUsageType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    @com.aliyun.core.annotation.Validation(maxLength = 128)
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String instanceId;

    private CreateCloudPermissionTemplateRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.allowRequest = builder.allowRequest;
        this.applicableScope = builder.applicableScope;
        this.clientToken = builder.clientToken;
        this.cloudAccountId = builder.cloudAccountId;
        this.cloudAccountResources = builder.cloudAccountResources;
        this.cloudPermissionTemplateName = builder.cloudPermissionTemplateName;
        this.cloudPermissionTemplateUsageType = builder.cloudPermissionTemplateUsageType;
        this.description = builder.description;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCloudPermissionTemplateRequest create() {
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
     * @return cloudPermissionTemplateName
     */
    public String getCloudPermissionTemplateName() {
        return this.cloudPermissionTemplateName;
    }

    /**
     * @return cloudPermissionTemplateUsageType
     */
    public String getCloudPermissionTemplateUsageType() {
        return this.cloudPermissionTemplateUsageType;
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

    public static final class Builder extends Request.Builder<CreateCloudPermissionTemplateRequest, Builder> {
        private String regionId; 
        private Boolean allowRequest; 
        private ApplicableScope applicableScope; 
        private String clientToken; 
        private String cloudAccountId; 
        private java.util.List<CloudAccountResources> cloudAccountResources; 
        private String cloudPermissionTemplateName; 
        private String cloudPermissionTemplateUsageType; 
        private String description; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateCloudPermissionTemplateRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.allowRequest = request.allowRequest;
            this.applicableScope = request.applicableScope;
            this.clientToken = request.clientToken;
            this.cloudAccountId = request.cloudAccountId;
            this.cloudAccountResources = request.cloudAccountResources;
            this.cloudPermissionTemplateName = request.cloudPermissionTemplateName;
            this.cloudPermissionTemplateUsageType = request.cloudPermissionTemplateUsageType;
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
         * <p>Specifies whether users are allowed to apply for the permission template. Default value: true.</p>
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
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must ensure that it is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
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
         * <p>ca_01kmegjc11qa1txxxxx</p>
         */
        public Builder cloudAccountId(String cloudAccountId) {
            this.putQueryParameter("CloudAccountId", cloudAccountId);
            this.cloudAccountId = cloudAccountId;
            return this;
        }

        /**
         * <p>The list of cloud account resource policies.</p>
         */
        public Builder cloudAccountResources(java.util.List<CloudAccountResources> cloudAccountResources) {
            this.putQueryParameter("CloudAccountResources", cloudAccountResources);
            this.cloudAccountResources = cloudAccountResources;
            return this;
        }

        /**
         * <p>The name of the permission template. The name can be up to 128 characters in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testName</p>
         */
        public Builder cloudPermissionTemplateName(String cloudPermissionTemplateName) {
            this.putQueryParameter("CloudPermissionTemplateName", cloudPermissionTemplateName);
            this.cloudPermissionTemplateName = cloudPermissionTemplateName;
            return this;
        }

        /**
         * <p>The usage type of the permission template. Valid values:</p>
         * <ul>
         * <li>user: Privilege escalation for human users.</li>
         * <li>application: Privilege escalation for M2M applications.
         * Default value: user.</li>
         * </ul>
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
         * <p>The description of the permission template. The description can be up to 128 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>this is a test.</p>
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
        public CreateCloudPermissionTemplateRequest build() {
            return new CreateCloudPermissionTemplateRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateCloudPermissionTemplateRequest} extends {@link TeaModel}
     *
     * <p>CreateCloudPermissionTemplateRequest</p>
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
             * <p>The type of the applicable scope. Valid values: global and custom.</p>
             * 
             * <strong>example:</strong>
             * <p>global</p>
             */
            public Builder scopeType(String scopeType) {
                this.scopeType = scopeType;
                return this;
            }

            /**
             * <p>The list of user IDs.</p>
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
     * {@link CreateCloudPermissionTemplateRequest} extends {@link TeaModel}
     *
     * <p>CreateCloudPermissionTemplateRequest</p>
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
             * <p>The ID of the cloud account resource.</p>
             * 
             * <strong>example:</strong>
             * <p>car_01l8a1l906kqtkacdfp5dxxxxx</p>
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
