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

    private CreateAuthorizationRuleRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.authorizationResourceScope = builder.authorizationResourceScope;
        this.authorizationRuleName = builder.authorizationRuleName;
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.instanceId = builder.instanceId;
        this.projectId = builder.projectId;
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

    public static final class Builder extends Request.Builder<CreateAuthorizationRuleRequest, Builder> {
        private String regionId; 
        private String authorizationResourceScope; 
        private String authorizationRuleName; 
        private String clientToken; 
        private String description; 
        private String instanceId; 
        private String projectId; 

        private Builder() {
            super();
        } 

        private Builder(CreateAuthorizationRuleRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.authorizationResourceScope = request.authorizationResourceScope;
            this.authorizationRuleName = request.authorizationRuleName;
            this.clientToken = request.clientToken;
            this.description = request.description;
            this.instanceId = request.instanceId;
            this.projectId = request.projectId;
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
         * <p>授权资源范围，枚举值：global（Project下的所有资源）、custom（自定义资源范围）。</p>
         * 
         * <strong>example:</strong>
         * <p>global</p>
         */
        public Builder authorizationResourceScope(String authorizationResourceScope) {
            this.putQueryParameter("AuthorizationResourceScope", authorizationResourceScope);
            this.authorizationResourceScope = authorizationResourceScope;
            return this;
        }

        /**
         * <p>授权规则名称，长度限制最大64个字符。</p>
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
         * <p>授权规则备注描述，长度限制最大128个字符。</p>
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
         * <p>授权规则关联的项目标识。</p>
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

        @Override
        public CreateAuthorizationRuleRequest build() {
            return new CreateAuthorizationRuleRequest(this);
        } 

    } 

}
