// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

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
 * {@link CreateThirdSsoAgentRequest} extends {@link RequestModel}
 *
 * <p>CreateThirdSsoAgentRequest</p>
 */
public class CreateThirdSsoAgentRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AccountId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String accountId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AccountName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String accountName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clientId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DisplayName")
    private String displayName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleIds")
    private java.util.List<Long> roleIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SkillGroupIds")
    private java.util.List<Long> skillGroupIds;

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
    public java.util.List<Long> getRoleIds() {
        return this.roleIds;
    }

    /**
     * @return skillGroupIds
     */
    public java.util.List<Long> getSkillGroupIds() {
        return this.skillGroupIds;
    }

    public static final class Builder extends Request.Builder<CreateThirdSsoAgentRequest, Builder> {
        private String accountId; 
        private String accountName; 
        private String clientId; 
        private String clientToken; 
        private String displayName; 
        private String instanceId; 
        private java.util.List<Long> roleIds; 
        private java.util.List<Long> skillGroupIds; 

        private Builder() {
            super();
        } 

        private Builder(CreateThirdSsoAgentRequest request) {
            super(request);
            this.accountId = request.accountId;
            this.accountName = request.accountName;
            this.clientId = request.clientId;
            this.clientToken = request.clientToken;
            this.displayName = request.displayName;
            this.instanceId = request.instanceId;
            this.roleIds = request.roleIds;
            this.skillGroupIds = request.skillGroupIds;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>accountId1</p>
         */
        public Builder accountId(String accountId) {
            this.putBodyParameter("AccountId", accountId);
            this.accountId = accountId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>accountName1</p>
         */
        public Builder accountName(String accountName) {
            this.putBodyParameter("AccountName", accountName);
            this.accountName = accountName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>46c1341e-2648-447a-9b11-70b6a298d94d</p>
         */
        public Builder clientId(String clientId) {
            this.putBodyParameter("ClientId", clientId);
            this.clientId = clientId;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * DisplayName.
         */
        public Builder displayName(String displayName) {
            this.putBodyParameter("DisplayName", displayName);
            this.displayName = displayName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc_xp_pre***</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * RoleIds.
         */
        public Builder roleIds(java.util.List<Long> roleIds) {
            this.putBodyParameter("RoleIds", roleIds);
            this.roleIds = roleIds;
            return this;
        }

        /**
         * SkillGroupIds.
         */
        public Builder skillGroupIds(java.util.List<Long> skillGroupIds) {
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
