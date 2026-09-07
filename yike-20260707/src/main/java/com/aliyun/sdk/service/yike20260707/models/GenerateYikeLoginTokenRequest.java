// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yike20260707.models;

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
 * {@link GenerateYikeLoginTokenRequest} extends {@link RequestModel}
 *
 * <p>GenerateYikeLoginTokenRequest</p>
 */
public class GenerateYikeLoginTokenRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoCreateProduction")
    private String autoCreateProduction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Expires")
    private String expires;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NickName")
    private String nickName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductionAuth")
    private String productionAuth;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubUserCredit")
    private String subUserCredit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tenant")
    private String tenant;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserName")
    private String userName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private GenerateYikeLoginTokenRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.autoCreateProduction = builder.autoCreateProduction;
        this.expires = builder.expires;
        this.nickName = builder.nickName;
        this.productionAuth = builder.productionAuth;
        this.subUserCredit = builder.subUserCredit;
        this.tenant = builder.tenant;
        this.userName = builder.userName;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateYikeLoginTokenRequest create() {
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
     * @return autoCreateProduction
     */
    public String getAutoCreateProduction() {
        return this.autoCreateProduction;
    }

    /**
     * @return expires
     */
    public String getExpires() {
        return this.expires;
    }

    /**
     * @return nickName
     */
    public String getNickName() {
        return this.nickName;
    }

    /**
     * @return productionAuth
     */
    public String getProductionAuth() {
        return this.productionAuth;
    }

    /**
     * @return subUserCredit
     */
    public String getSubUserCredit() {
        return this.subUserCredit;
    }

    /**
     * @return tenant
     */
    public String getTenant() {
        return this.tenant;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<GenerateYikeLoginTokenRequest, Builder> {
        private String regionId; 
        private String autoCreateProduction; 
        private String expires; 
        private String nickName; 
        private String productionAuth; 
        private String subUserCredit; 
        private String tenant; 
        private String userName; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(GenerateYikeLoginTokenRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.autoCreateProduction = request.autoCreateProduction;
            this.expires = request.expires;
            this.nickName = request.nickName;
            this.productionAuth = request.productionAuth;
            this.subUserCredit = request.subUserCredit;
            this.tenant = request.tenant;
            this.userName = request.userName;
            this.workspaceId = request.workspaceId;
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
         * <p>Specifies whether automatic creation of a project is enabled. Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder autoCreateProduction(String autoCreateProduction) {
            this.putQueryParameter("AutoCreateProduction", autoCreateProduction);
            this.autoCreateProduction = autoCreateProduction;
            return this;
        }

        /**
         * <p>The token expiration time, in seconds. Default value: 30 days.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder expires(String expires) {
            this.putQueryParameter("Expires", expires);
            this.expires = expires;
            return this;
        }

        /**
         * <p>The nickname.</p>
         * <ul>
         * <li>Format check: The maximum length is 50 characters.</li>
         * <li>Special format validation: Chinese characters, English characters, digits, _ \ / () ] [</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>冯凯</p>
         */
        public Builder nickName(String nickName) {
            this.putQueryParameter("NickName", nickName);
            this.nickName = nickName;
            return this;
        }

        /**
         * <p>The role of the user in the project.</p>
         * 
         * <strong>example:</strong>
         * <p>common</p>
         */
        public Builder productionAuth(String productionAuth) {
            this.putQueryParameter("ProductionAuth", productionAuth);
            this.productionAuth = productionAuth;
            return this;
        }

        /**
         * <p>The default credits granted to the user.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder subUserCredit(String subUserCredit) {
            this.putQueryParameter("SubUserCredit", subUserCredit);
            this.subUserCredit = subUserCredit;
            return this;
        }

        /**
         * <p>The tenant identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>wanyou</p>
         */
        public Builder tenant(String tenant) {
            this.putQueryParameter("Tenant", tenant);
            this.tenant = tenant;
            return this;
        }

        /**
         * <p>The username.</p>
         * 
         * <strong>example:</strong>
         * <p>userxxx</p>
         */
        public Builder userName(String userName) {
            this.putQueryParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>581236</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public GenerateYikeLoginTokenRequest build() {
            return new GenerateYikeLoginTokenRequest(this);
        } 

    } 

}
