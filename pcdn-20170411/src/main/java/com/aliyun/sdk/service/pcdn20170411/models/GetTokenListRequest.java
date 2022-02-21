// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pcdn20170411.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTokenListRequest} extends {@link RequestModel}
 *
 * <p>GetTokenListRequest</p>
 */
public class GetTokenListRequest extends Request {
    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    @Query
    @NameInMap("Version")
    @Validation(required = true)
    private String version;

    private GetTokenListRequest(Builder builder) {
        super(builder);
        this.securityToken = builder.securityToken;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTokenListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder extends Request.Builder<GetTokenListRequest, Builder> {
        private String securityToken; 
        private String version; 

        private Builder() {
            super();
        } 

        private Builder(GetTokenListRequest response) {
            super(response);
            this.securityToken = response.securityToken;
            this.version = response.version;
        } 

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        /**
         * Version.
         */
        public Builder version(String version) {
            this.putQueryParameter("Version", version);
            this.version = version;
            return this;
        }

        @Override
        public GetTokenListRequest build() {
            return new GetTokenListRequest(this);
        } 

    } 

}
