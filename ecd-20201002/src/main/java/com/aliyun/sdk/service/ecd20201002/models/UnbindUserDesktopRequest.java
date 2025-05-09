// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20201002.models;

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
 * {@link UnbindUserDesktopRequest} extends {@link RequestModel}
 *
 * <p>UnbindUserDesktopRequest</p>
 */
public class UnbindUserDesktopRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clientId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientType")
    private String clientType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Force")
    private Boolean force;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LoginToken")
    @com.aliyun.core.annotation.Validation(required = true)
    private String loginToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SessionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sessionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserDesktopId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userDesktopId;

    private UnbindUserDesktopRequest(Builder builder) {
        super(builder);
        this.clientId = builder.clientId;
        this.clientType = builder.clientType;
        this.force = builder.force;
        this.loginToken = builder.loginToken;
        this.regionId = builder.regionId;
        this.sessionId = builder.sessionId;
        this.userDesktopId = builder.userDesktopId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnbindUserDesktopRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientId
     */
    public String getClientId() {
        return this.clientId;
    }

    /**
     * @return clientType
     */
    public String getClientType() {
        return this.clientType;
    }

    /**
     * @return force
     */
    public Boolean getForce() {
        return this.force;
    }

    /**
     * @return loginToken
     */
    public String getLoginToken() {
        return this.loginToken;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return userDesktopId
     */
    public String getUserDesktopId() {
        return this.userDesktopId;
    }

    public static final class Builder extends Request.Builder<UnbindUserDesktopRequest, Builder> {
        private String clientId; 
        private String clientType; 
        private Boolean force; 
        private String loginToken; 
        private String regionId; 
        private String sessionId; 
        private String userDesktopId; 

        private Builder() {
            super();
        } 

        private Builder(UnbindUserDesktopRequest request) {
            super(request);
            this.clientId = request.clientId;
            this.clientType = request.clientType;
            this.force = request.force;
            this.loginToken = request.loginToken;
            this.regionId = request.regionId;
            this.sessionId = request.sessionId;
            this.userDesktopId = request.userDesktopId;
        } 

        /**
         * <p>The client ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>58f96f67-7944-4f97-9342-****</p>
         */
        public Builder clientId(String clientId) {
            this.putQueryParameter("ClientId", clientId);
            this.clientId = clientId;
            return this;
        }

        /**
         * <p>The client type.</p>
         * 
         * <strong>example:</strong>
         * <p>windows</p>
         */
        public Builder clientType(String clientType) {
            this.putQueryParameter("ClientType", clientType);
            this.clientType = clientType;
            return this;
        }

        /**
         * <p>Specifies whether to enable forced unbinding.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>true: Even when end users connect to cloud computers, the forced unbinding is still enforced.</li>
         * <li>false: Forced unbinding is only enforced when end users are disconnected from cloud computers.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder force(Boolean force) {
            this.putQueryParameter("Force", force);
            this.force = force;
            return this;
        }

        /**
         * <p>The logon token.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>v12307f5e0****</p>
         */
        public Builder loginToken(String loginToken) {
            this.putQueryParameter("LoginToken", loginToken);
            this.loginToken = loginToken;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The session ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3b053331-dc98-43d8-b247-****</p>
         */
        public Builder sessionId(String sessionId) {
            this.putQueryParameter("SessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        /**
         * <p>The cloud computer ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ud-sdfs****</p>
         */
        public Builder userDesktopId(String userDesktopId) {
            this.putQueryParameter("UserDesktopId", userDesktopId);
            this.userDesktopId = userDesktopId;
            return this;
        }

        @Override
        public UnbindUserDesktopRequest build() {
            return new UnbindUserDesktopRequest(this);
        } 

    } 

}
