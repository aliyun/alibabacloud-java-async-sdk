// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link InitializeServiceLinkRoleRequest} extends {@link RequestModel}
 *
 * <p>InitializeServiceLinkRoleRequest</p>
 */
public class InitializeServiceLinkRoleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RoleName")
    private String roleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Token")
    private String token;

    private InitializeServiceLinkRoleRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.roleName = builder.roleName;
        this.token = builder.token;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InitializeServiceLinkRoleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * @return roleName
     */
    public String getRoleName() {
        return this.roleName;
    }

    /**
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    public static final class Builder extends Request.Builder<InitializeServiceLinkRoleRequest, Builder> {
        private String acceptLanguage; 
        private String roleName; 
        private String token; 

        private Builder() {
            super();
        } 

        private Builder(InitializeServiceLinkRoleRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.roleName = request.roleName;
            this.token = request.token;
        } 

        /**
         * AcceptLanguage.
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * RoleName.
         */
        public Builder roleName(String roleName) {
            this.putQueryParameter("RoleName", roleName);
            this.roleName = roleName;
            return this;
        }

        /**
         * Token.
         */
        public Builder token(String token) {
            this.putQueryParameter("Token", token);
            this.token = token;
            return this;
        }

        @Override
        public InitializeServiceLinkRoleRequest build() {
            return new InitializeServiceLinkRoleRequest(this);
        } 

    } 

}
