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
 * {@link UpdateAuthorizationRuleRequest} extends {@link RequestModel}
 *
 * <p>UpdateAuthorizationRuleRequest</p>
 */
public class UpdateAuthorizationRuleRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthorizationResourceScope")
    @com.aliyun.core.annotation.Validation(maxLength = 64)
    private String authorizationResourceScope;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthorizationRuleId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String authorizationRuleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthorizationRuleName")
    @com.aliyun.core.annotation.Validation(maxLength = 64)
    private String authorizationRuleName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String instanceId;

    private UpdateAuthorizationRuleRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.authorizationResourceScope = builder.authorizationResourceScope;
        this.authorizationRuleId = builder.authorizationRuleId;
        this.authorizationRuleName = builder.authorizationRuleName;
        this.clientToken = builder.clientToken;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAuthorizationRuleRequest create() {
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
     * @return authorizationRuleId
     */
    public String getAuthorizationRuleId() {
        return this.authorizationRuleId;
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<UpdateAuthorizationRuleRequest, Builder> {
        private String regionId; 
        private String authorizationResourceScope; 
        private String authorizationRuleId; 
        private String authorizationRuleName; 
        private String clientToken; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAuthorizationRuleRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.authorizationResourceScope = request.authorizationResourceScope;
            this.authorizationRuleId = request.authorizationRuleId;
            this.authorizationRuleName = request.authorizationRuleName;
            this.clientToken = request.clientToken;
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
         * <p>The scope of the authorized resources. Valid values:</p>
         * <ul>
         * <li><p>global: global resources within the project.</p>
         * </li>
         * <li><p>custom: specified resources within the project.</p>
         * </li>
         * </ul>
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
         * <p>The authorization rule ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>arrule_01kf143ug06fg7m9f43u7vahxxxx</p>
         */
        public Builder authorizationRuleId(String authorizationRuleId) {
            this.putQueryParameter("AuthorizationRuleId", authorizationRuleId);
            this.authorizationRuleId = authorizationRuleId;
            return this;
        }

        /**
         * <p>The name of the authorization rule. The name can be up to 64 characters long.</p>
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
         * <p>A client token that ensures the idempotence of the request. Generate a unique value for this parameter from your client. The token can contain only ASCII characters and must be no more than 64 characters in length. For more information, see <a href="https://www.alibabacloud.com/help/zh/ecs/developer-reference/how-to-ensure-idempotence">How to ensure idempotence</a>.</p>
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

        @Override
        public UpdateAuthorizationRuleRequest build() {
            return new UpdateAuthorizationRuleRequest(this);
        } 

    } 

}
