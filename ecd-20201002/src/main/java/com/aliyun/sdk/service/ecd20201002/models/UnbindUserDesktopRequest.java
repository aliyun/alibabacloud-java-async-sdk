// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20201002.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UnbindUserDesktopRequest} extends {@link RequestModel}
 *
 * <p>UnbindUserDesktopRequest</p>
 */
public class UnbindUserDesktopRequest extends Request {
    @Query
    @NameInMap("ClientId")
    @Validation(required = true)
    private String clientId;

    @Query
    @NameInMap("ClientType")
    private String clientType;

    @Query
    @NameInMap("Force")
    private Boolean force;

    @Query
    @NameInMap("LoginToken")
    @Validation(required = true)
    private String loginToken;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("SessionId")
    @Validation(required = true)
    private String sessionId;

    @Query
    @NameInMap("UserDesktopId")
    @Validation(required = true)
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
         * ClientId.
         */
        public Builder clientId(String clientId) {
            this.putQueryParameter("ClientId", clientId);
            this.clientId = clientId;
            return this;
        }

        /**
         * ClientType.
         */
        public Builder clientType(String clientType) {
            this.putQueryParameter("ClientType", clientType);
            this.clientType = clientType;
            return this;
        }

        /**
         * Force.
         */
        public Builder force(Boolean force) {
            this.putQueryParameter("Force", force);
            this.force = force;
            return this;
        }

        /**
         * LoginToken.
         */
        public Builder loginToken(String loginToken) {
            this.putQueryParameter("LoginToken", loginToken);
            this.loginToken = loginToken;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * SessionId.
         */
        public Builder sessionId(String sessionId) {
            this.putQueryParameter("SessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        /**
         * UserDesktopId.
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
