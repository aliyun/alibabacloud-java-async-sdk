// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20230516.models;

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
 * {@link AddAgentRequest} extends {@link RequestModel}
 *
 * <p>AddAgentRequest</p>
 */
public class AddAgentRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Account")
    @com.aliyun.core.annotation.Validation(required = true)
    private String account;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentTag")
    private String agentTag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExtensionPwd")
    @com.aliyun.core.annotation.Validation(required = true)
    private String extensionPwd;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Password")
    @com.aliyun.core.annotation.Validation(required = true)
    private String password;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private AddAgentRequest(Builder builder) {
        super(builder);
        this.account = builder.account;
        this.agentTag = builder.agentTag;
        this.extensionPwd = builder.extensionPwd;
        this.name = builder.name;
        this.ownerId = builder.ownerId;
        this.password = builder.password;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddAgentRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return account
     */
    public String getAccount() {
        return this.account;
    }

    /**
     * @return agentTag
     */
    public String getAgentTag() {
        return this.agentTag;
    }

    /**
     * @return extensionPwd
     */
    public String getExtensionPwd() {
        return this.extensionPwd;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static final class Builder extends Request.Builder<AddAgentRequest, Builder> {
        private String account; 
        private String agentTag; 
        private String extensionPwd; 
        private String name; 
        private Long ownerId; 
        private String password; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(AddAgentRequest request) {
            super(request);
            this.account = request.account;
            this.agentTag = request.agentTag;
            this.extensionPwd = request.extensionPwd;
            this.name = request.name;
            this.ownerId = request.ownerId;
            this.password = request.password;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * <p>坐席账号名(必须唯一)</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>seat_001</p>
         */
        public Builder account(String account) {
            this.putQueryParameter("Account", account);
            this.account = account;
            return this;
        }

        /**
         * <p>合作方唯一标识</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        public Builder agentTag(String agentTag) {
            this.putQueryParameter("AgentTag", agentTag);
            this.agentTag = agentTag;
            return this;
        }

        /**
         * <p>分机密码</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>gwegwe23t32</p>
         */
        public Builder extensionPwd(String extensionPwd) {
            this.putQueryParameter("ExtensionPwd", extensionPwd);
            this.extensionPwd = extensionPwd;
            return this;
        }

        /**
         * <p>坐席名称</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>坐席账号密码 (可以跟分机密码一致)</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>gwegwe23t32</p>
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        @Override
        public AddAgentRequest build() {
            return new AddAgentRequest(this);
        } 

    } 

}
