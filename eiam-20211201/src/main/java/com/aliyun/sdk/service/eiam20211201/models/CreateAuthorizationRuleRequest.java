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
 * {@link CreateAuthorizationRuleRequest} extends {@link RequestModel}
 *
 * <p>CreateAuthorizationRuleRequest</p>
 */
public class CreateAuthorizationRuleRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthorizationResourceScope")
    @com.aliyun.core.annotation.Validation(maxLength = 32)
    private String authorizationResourceScope;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthorizationRuleName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String authorizationRuleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthorizationRuleScenarioLabel")
    @com.aliyun.core.annotation.Validation(maxLength = 64)
    private String authorizationRuleScenarioLabel;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    @com.aliyun.core.annotation.Validation(maxLength = 128)
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String projectId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubjectType")
    @com.aliyun.core.annotation.Validation(maxLength = 64)
    private String subjectType;

    private CreateAuthorizationRuleRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.authorizationResourceScope = builder.authorizationResourceScope;
        this.authorizationRuleName = builder.authorizationRuleName;
        this.authorizationRuleScenarioLabel = builder.authorizationRuleScenarioLabel;
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.instanceId = builder.instanceId;
        this.projectId = builder.projectId;
        this.subjectType = builder.subjectType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAuthorizationRuleRequest create() {
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
     * @return authorizationResourceScope
     */
    public String getAuthorizationResourceScope() {
        return this.authorizationResourceScope;
    }

    /**
     * @return authorizationRuleName
     */
    public String getAuthorizationRuleName() {
        return this.authorizationRuleName;
    }

    /**
     * @return authorizationRuleScenarioLabel
     */
    public String getAuthorizationRuleScenarioLabel() {
        return this.authorizationRuleScenarioLabel;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
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

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return subjectType
     */
    public String getSubjectType() {
        return this.subjectType;
    }

    public static final class Builder extends Request.Builder<CreateAuthorizationRuleRequest, Builder> {
        private String regionId; 
        private String authorizationResourceScope; 
        private String authorizationRuleName; 
        private String authorizationRuleScenarioLabel; 
        private String clientToken; 
        private String description; 
        private String instanceId; 
        private String projectId; 
        private String subjectType; 

        private Builder() {
            super();
        } 

        private Builder(CreateAuthorizationRuleRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.authorizationResourceScope = request.authorizationResourceScope;
            this.authorizationRuleName = request.authorizationRuleName;
            this.authorizationRuleScenarioLabel = request.authorizationRuleScenarioLabel;
            this.clientToken = request.clientToken;
            this.description = request.description;
            this.instanceId = request.instanceId;
            this.projectId = request.projectId;
            this.subjectType = request.subjectType;
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
         * <p>The scope of authorized resources. Valid values:</p>
         * <ul>
         * <li>custom: resources within the specified project scope</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>custom</p>
         */
        public Builder authorizationResourceScope(String authorizationResourceScope) {
            this.putQueryParameter("AuthorizationResourceScope", authorizationResourceScope);
            this.authorizationResourceScope = authorizationResourceScope;
            return this;
        }

        /**
         * <p>The name of the authorization rule. The name can be up to 64 characters in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test_rule</p>
         */
        public Builder authorizationRuleName(String authorizationRuleName) {
            this.putQueryParameter("AuthorizationRuleName", authorizationRuleName);
            this.authorizationRuleName = authorizationRuleName;
            return this;
        }

        /**
         * <p>The scenario label of the authorization rule. The label can be up to 64 characters in length.</p>
         * <blockquote>
         * <p>When a label value is specified, the business layer restricts the types of authorized resources based on the label.
         * For historical reasons, an empty value is also treated as an enum value. If this parameter is left empty, the authorized resource types supported by other enum values are not supported.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>privileged_cloud_account</p>
         */
        public Builder authorizationRuleScenarioLabel(String authorizationRuleScenarioLabel) {
            this.putQueryParameter("AuthorizationRuleScenarioLabel", authorizationRuleScenarioLabel);
            this.authorizationRuleScenarioLabel = authorizationRuleScenarioLabel;
            return this;
        }

        /**
         * <p>Ensures the idempotence of the request. You can generate a parameter value on your client to ensure that the value is unique across different requests. The ClientToken parameter only supports ASCII characters and can be up to 64 characters in length. For more information, see References: <a href="https://www.alibabacloud.com/help/zh/ecs/developer-reference/how-to-ensure-idempotence">How to ensure idempotence</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>client-token-example</p>
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The description of the authorization rule. The description can be up to 128 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>this is a test rule</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The instance ID.</p>
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
         * <p>The ID of the project associated with the authorization rule. If you are unsure about the associated project, you can associate the default project. The ID of the default project is iprj_system_default.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>iprj_system_default</p>
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>The type of subject to which the authorization rule applies. Valid values:</p>
         * <ul>
         * <li>user</li>
         * <li>application<blockquote>
         * <p>user (for human users) or application (for machines). When explicitly specified, only privileged cloud account rules with a custom resource scope are supported. If this field is omitted for custom scope rules in this scenario, the default value is user.</p>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>application</p>
         */
        public Builder subjectType(String subjectType) {
            this.putQueryParameter("SubjectType", subjectType);
            this.subjectType = subjectType;
            return this;
        }

        @Override
        public CreateAuthorizationRuleRequest build() {
            return new CreateAuthorizationRuleRequest(this);
        } 

    } 

}
