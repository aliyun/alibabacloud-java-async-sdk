// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateThirdSsoAgentRequest} extends {@link RequestModel}
 *
 * <p>CreateThirdSsoAgentRequest</p>
 */
public class CreateThirdSsoAgentRequest extends Request {
    @Body
    @NameInMap("AccountId")
    @Validation(required = true)
    private String accountId;

    @Body
    @NameInMap("AccountName")
    @Validation(required = true)
    private String accountName;

    @Body
    @NameInMap("ClientId")
    @Validation(required = true)
    private String clientId;

    @Body
    @NameInMap("ClientToken")
    private String clientToken;

    @Body
    @NameInMap("DisplayName")
    private String displayName;

    @Body
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Body
    @NameInMap("RoleIds")
    private java.util.List < Long > roleIds;

    @Body
    @NameInMap("SkillGroupIds")
    private java.util.List < Long > skillGroupIds;

    private CreateThirdSsoAgentRequest(Builder builder) {
        super(builder);
        this.accountId = builder.accountId;
        this.accountName = builder.accountName;
        this.clientId = builder.clientId;
        this.clientToken = builder.clientToken;
        this.displayName = builder.displayName;
        this.instanceId = builder.instanceId;
        this.roleIds = builder.roleIds;
        this.skillGroupIds = builder.skillGroupIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateThirdSsoAgentRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountId
     */
    public String getAccountId() {
        return this.accountId;
    }

    /**
     * @return accountName
     */
    public String getAccountName() {
        return this.accountName;
    }

    /**
     * @return clientId
     */
    public String getClientId() {
        return this.clientId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return displayName
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return roleIds
     */
    public java.util.List < Long > getRoleIds() {
        return this.roleIds;
    }

    /**
     * @return skillGroupIds
     */
    public java.util.List < Long > getSkillGroupIds() {
        return this.skillGroupIds;
    }

    public static final class Builder extends Request.Builder<CreateThirdSsoAgentRequest, Builder> {
        private String accountId; 
        private String accountName; 
        private String clientId; 
        private String clientToken; 
        private String displayName; 
        private String instanceId; 
        private java.util.List < Long > roleIds; 
        private java.util.List < Long > skillGroupIds; 

        private Builder() {
            super();
        } 

        private Builder(CreateThirdSsoAgentRequest response) {
            super(response);
            this.accountId = response.accountId;
            this.accountName = response.accountName;
            this.clientId = response.clientId;
            this.clientToken = response.clientToken;
            this.displayName = response.displayName;
            this.instanceId = response.instanceId;
            this.roleIds = response.roleIds;
            this.skillGroupIds = response.skillGroupIds;
        } 

        /**
         * param3
         */
        public Builder accountId(String accountId) {
            this.putBodyParameter("AccountId", accountId);
            this.accountId = accountId;
            return this;
        }

        /**
         * param4
         */
        public Builder accountName(String accountName) {
            this.putBodyParameter("AccountName", accountName);
            this.accountName = accountName;
            return this;
        }

        /**
         * param2
         */
        public Builder clientId(String clientId) {
            this.putBodyParameter("ClientId", clientId);
            this.clientId = clientId;
            return this;
        }

        /**
         * clientToken
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * param5
         */
        public Builder displayName(String displayName) {
            this.putBodyParameter("DisplayName", displayName);
            this.displayName = displayName;
            return this;
        }

        /**
         * param1
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * param7
         */
        public Builder roleIds(java.util.List < Long > roleIds) {
            this.putBodyParameter("RoleIds", roleIds);
            this.roleIds = roleIds;
            return this;
        }

        /**
         * param6
         */
        public Builder skillGroupIds(java.util.List < Long > skillGroupIds) {
            this.putBodyParameter("SkillGroupIds", skillGroupIds);
            this.skillGroupIds = skillGroupIds;
            return this;
        }

        @Override
        public CreateThirdSsoAgentRequest build() {
            return new CreateThirdSsoAgentRequest(this);
        } 

    } 

}
