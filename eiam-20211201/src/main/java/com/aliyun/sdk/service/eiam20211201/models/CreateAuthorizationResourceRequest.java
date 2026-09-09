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
 * {@link CreateAuthorizationResourceRequest} extends {@link RequestModel}
 *
 * <p>CreateAuthorizationResourceRequest</p>
 */
public class CreateAuthorizationResourceRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthorizationResourceEntityId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String authorizationResourceEntityId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthorizationResourceEntityType")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 32)
    private String authorizationResourceEntityType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthorizationRuleId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String authorizationRuleId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Condition")
    private Condition condition;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String instanceId;

    private CreateAuthorizationResourceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.authorizationResourceEntityId = builder.authorizationResourceEntityId;
        this.authorizationResourceEntityType = builder.authorizationResourceEntityType;
        this.authorizationRuleId = builder.authorizationRuleId;
        this.clientToken = builder.clientToken;
        this.condition = builder.condition;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAuthorizationResourceRequest create() {
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
     * @return authorizationResourceEntityId
     */
    public String getAuthorizationResourceEntityId() {
        return this.authorizationResourceEntityId;
    }

    /**
     * @return authorizationResourceEntityType
     */
    public String getAuthorizationResourceEntityType() {
        return this.authorizationResourceEntityType;
    }

    /**
     * @return authorizationRuleId
     */
    public String getAuthorizationRuleId() {
        return this.authorizationRuleId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return condition
     */
    public Condition getCondition() {
        return this.condition;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<CreateAuthorizationResourceRequest, Builder> {
        private String regionId; 
        private String authorizationResourceEntityId; 
        private String authorizationResourceEntityType; 
        private String authorizationRuleId; 
        private String clientToken; 
        private Condition condition; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateAuthorizationResourceRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.authorizationResourceEntityId = request.authorizationResourceEntityId;
            this.authorizationResourceEntityType = request.authorizationResourceEntityType;
            this.authorizationRuleId = request.authorizationRuleId;
            this.clientToken = request.clientToken;
            this.condition = request.condition;
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
         * <p>The ID of the resource entity associated with the authorization resource.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>carole_01kmek49aqxxxx</p>
         */
        public Builder authorizationResourceEntityId(String authorizationResourceEntityId) {
            this.putQueryParameter("AuthorizationResourceEntityId", authorizationResourceEntityId);
            this.authorizationResourceEntityId = authorizationResourceEntityId;
            return this;
        }

        /**
         * <p>The type of the resource entity associated with the authorization resource. Valid values:</p>
         * <ul>
         * <li>cloud_account_role: cloud role</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_account_role</p>
         */
        public Builder authorizationResourceEntityType(String authorizationResourceEntityType) {
            this.putQueryParameter("AuthorizationResourceEntityType", authorizationResourceEntityType);
            this.authorizationResourceEntityType = authorizationResourceEntityType;
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
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate a parameter value, but you must make sure that the value is unique among different requests. The ClientToken value can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see References <a href="https://www.alibabacloud.com/help/zh/ecs/developer-reference/how-to-ensure-idempotence">How to ensure idempotence</a>.</p>
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
         * <p>The effective condition.</p>
         */
        public Builder condition(Condition condition) {
            this.putQueryParameter("Condition", condition);
            this.condition = condition;
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
        public CreateAuthorizationResourceRequest build() {
            return new CreateAuthorizationResourceRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateAuthorizationResourceRequest} extends {@link TeaModel}
     *
     * <p>CreateAuthorizationResourceRequest</p>
     */
    public static class CredentialCondition extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllowSameNameIdentity")
        private Boolean allowSameNameIdentity;

        private CredentialCondition(Builder builder) {
            this.allowSameNameIdentity = builder.allowSameNameIdentity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CredentialCondition create() {
            return builder().build();
        }

        /**
         * @return allowSameNameIdentity
         */
        public Boolean getAllowSameNameIdentity() {
            return this.allowSameNameIdentity;
        }

        public static final class Builder {
            private Boolean allowSameNameIdentity; 

            private Builder() {
            } 

            private Builder(CredentialCondition model) {
                this.allowSameNameIdentity = model.allowSameNameIdentity;
            } 

            /**
             * <p>Specifies whether same-name identity accounts are supported.</p>
             */
            public Builder allowSameNameIdentity(Boolean allowSameNameIdentity) {
                this.allowSameNameIdentity = allowSameNameIdentity;
                return this;
            }

            public CredentialCondition build() {
                return new CredentialCondition(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateAuthorizationResourceRequest} extends {@link TeaModel}
     *
     * <p>CreateAuthorizationResourceRequest</p>
     */
    public static class Condition extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CredentialCondition")
        private CredentialCondition credentialCondition;

        private Condition(Builder builder) {
            this.credentialCondition = builder.credentialCondition;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Condition create() {
            return builder().build();
        }

        /**
         * @return credentialCondition
         */
        public CredentialCondition getCredentialCondition() {
            return this.credentialCondition;
        }

        public static final class Builder {
            private CredentialCondition credentialCondition; 

            private Builder() {
            } 

            private Builder(Condition model) {
                this.credentialCondition = model.credentialCondition;
            } 

            /**
             * <p>The effective condition when used as a credential.</p>
             */
            public Builder credentialCondition(CredentialCondition credentialCondition) {
                this.credentialCondition = credentialCondition;
                return this;
            }

            public Condition build() {
                return new Condition(this);
            } 

        } 

    }
}
